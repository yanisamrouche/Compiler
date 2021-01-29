%include	'io.asm'

section	.bss
sinput:	resb	255	;reserve a 255 byte space in memory for the users input string

section	.text
global _start
_start:
	call	main	;
	mov	ebx,	0	; valeur de retour du programme
	mov	eax,	1	;
	int 0x80	;
f :	push	ebp	;sauvegarde la valeur de ebp
	mov	ebp,	esp	;nouvelle valeur de ebp
	sub	esp,	0	;allocation des variables locales
	mov	eax,	1	;Affect
	cmp	dword [ebp+4*3],	1	;JumpIfEqual 1
	je	l2	;JumpIfEqual 2
	mov	eax,	0	;Affect
l2 :	cmp	eax,	0	;JumpIfEqual 1
	je	l0	;JumpIfEqual 2
	mov	dword [ebp+4*2],	1	;ecriture de la valeur de retour
	jmp	l1	;Jump
l0 :	mov	eax,	dword [ebp+4*3]	;
	sub	eax,	1	;
	push	eax	;Param
	sub	esp,	4	;allocation mémoire pour la valeur de retour
	call	f	;
	pop	ebx	;récupération de la valeur de retour
	add	esp,	4	;désallocation des arguments
	mov	eax,	1	;
	add	eax,	ebx	;
	mov	dword [ebp+4*2],	eax	;ecriture de la valeur de retour
l1 :	add	esp,	0	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
main :	push	ebp	;sauvegarde la valeur de ebp
	mov	ebp,	esp	;nouvelle valeur de ebp
	sub	esp,	0	;allocation des variables locales
	push	100	;Param
	sub	esp,	4	;allocation mémoire pour la valeur de retour
	call	f	;
	pop	eax	;récupération de la valeur de retour
	add	esp,	4	;désallocation des arguments
	mov	eax,	eax	;Write 1
	call	iprintLF	;Write 2
	add	esp,	0	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
