%include	'io.asm'

section	.bss
sinput:	resb	255	;reserve a 255 byte space in memory for the users input string
tab :	resd	20

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
	mov	dword [ebp-4*1],	2	;Affect
	mov	dword [ebp-4*2],	0	;Affect
	mov	eax,	dword [ebp-4*1]	;
	add	eax,	dword [ebp-4*2]	;
	mov	eax,	eax	;
	mov	dword [tab+4*eax],	34	;Affect
	mov	dword [ebp-4*2],	1	;Affect
	mov	eax,	dword [ebp-4*1]	;
	add	eax,	dword [ebp-4*2]	;
	mov	eax,	eax	;
	mov	dword [tab+4*eax],	74	;Affect
	mov	dword [ebp-4*2],	2	;Affect
	mov	eax,	dword [ebp-4*1]	;
	add	eax,	dword [ebp-4*2]	;
	mov	eax,	eax	;
	mov	dword [tab+4*eax],	16	;Affect
	mov	eax,	2	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	3	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	mov	eax,	4	;
	mov	eax,	dword [tab+4*eax]	;Write 1
	call	iprintLF	;Write 2
	add	esp,	8	;désallocation des variables locales
	pop	ebp	;restaure la valeur de ebp
	ret	;
