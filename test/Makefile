FILES = add1 add2 sub1 sub2 sub3 mult1 mult2 mult3 div1 div2 div3 div4 and1 and2 and3 and4 and5 or1 or2 or3 or4 or5 not1 not2 not3 egal1 egal2 egal3 inf1 inf2 inf3 inf4 parenth1 parenth2 prio23-1 prio23-2 prio23-3 prio23-4 prio34-1 prio34-2 prio34-3 prio34-4 prio45-1 prio45-2 prio45-3 prio45-4 prio56-1 prio56-2 prio67-1 prio67-2 ecrire1 ecrire2 varglob1 varglob2 varglob3 varglob4 varloc1 varloc2 varloc3 varloc4 varloc5 appel1 appel2 appel3 appel-param1 appel-param2 appel-param3 appel-retour1 tab1 tab2 tab3 tab4 rec1 si1 si2 si3 si4 affect1 affect2 affect3 tantque1 tantque2 err1 err2 err3 err4

COMPILER = ../TP_JAVA/src/Compiler.jar


$(FILES): % : input/%.l
	java -jar $(COMPILER) $<
	- nasm -f elf -dwarf -g input/$@.nasm	
	- ld -m elf_i386 -o exec/$@ input/$@.o
	- exec/$@ > out/$@.out
	- exec/$@ > out-ref/$@.out
	- diff out/$@.out out-ref/$@.out




clean:
	-rm sc/*.sc
	-rm sa/*.sa
	-rm saout/*.saout
	-rm ts/*.ts
	-rm c3a/*.c3a
	-rm c3aout/*.c3aout
	-rm nasm/*.nasm
	-rm fg/*.fg
	-rm fgs/*.fgs
	-rm ig/*.ig
	-rm pre-nasm/*.pre-nasm
	-rm exec/*
	-rm out/*.out
	-rm input/*.o
