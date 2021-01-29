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
	sub	esp,	8	;allocation des variables locales
	mov	dword [ebp-4*1],	0	;Affect
l0 :	mov	eax,	1	;Affect
	cmp	dword [ebp-4*1],	4	;JumpIfLess 1
	jl	l2	;JumpIfLess 2
	mov	eax,	0	;Affect
l2 :	cmp	eax,	0	;JumpIfEqual 1
	je	l1	;JumpIfEqual 2
	mov	dword [ebp-4*2],	0	;Affect
l3 :	mov	eax,	1	;Affect
	cmp	dword [ebp-4*2],	4	;JumpIfLess 1
	jl	l5	;JumpIfLess 2
	mov	eax,	0	;Affect
l5 :	cmp	eax,	0	;JumpIfEqual 1
	je	l4	;JumpIfEqual 2
	mov	eax,	dword [ebp-4*1]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	dword [ebp-4*2]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	dword [ebp-4*2]	;
	add	eax,	1	;
	mov	dword [ebp-4*2],	eax	;Affect
	jmp	l3	;Jump
l4 :	mov	eax,	dword [ebp-4*1]	;
	add	eax,	1	;
	mov	dword [ebp-4*1],	eax	;Affect
	jmp	l0	;Jump
l1 :	add	esp,	8	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
