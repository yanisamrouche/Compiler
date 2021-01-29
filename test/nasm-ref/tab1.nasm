%include	'io.asm'

section	.bss
sinput:	resb	255	;reserve a 255 byte space in memory for the users input string
tab :	resd	12

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
	mov	eax,	0	;
	mov	dword [tab+4*eax],	0	;Affect
	mov	eax,	1	;
	mov	dword [tab+4*eax],	1	;Affect
	mov	eax,	2	;
	mov	dword [tab+4*eax],	2	;Affect
	mov	eax,	0	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	1	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	2	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	add	esp,	0	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
