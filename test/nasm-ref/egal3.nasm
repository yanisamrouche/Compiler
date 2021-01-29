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
main :	push	ebp	;sauvegarde la valeur de ebp
	mov	ebp,	esp	;nouvelle valeur de ebp
	sub	esp,	0	;allocation des variables locales
	mov	ebx,	1	;Affect
	mov	eax,	2	;JumpIfEqual 1
	cmp	eax,	2	;on passe par un registre temporaire
	je	l1	;JumpIfEqual 2
	mov	ebx,	0	;Affect
l1 :	mov	eax,	1	;Affect
	cmp	ebx,	1	;JumpIfEqual 1
	je	l0	;JumpIfEqual 2
	mov	eax,	0	;Affect
l0 :	mov	eax,	eax	;Write 1
	call	iprintLF	;Write 2
	add	esp,	0	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
