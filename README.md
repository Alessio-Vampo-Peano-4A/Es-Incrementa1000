# Es-Incrementa1000

Il programma TestInc1000 incrementa di mille un contatore statico per ogni ogetto appartenente alla classe, e lo stampa in outuput. 
Fase 1:
Nella prima parte , il programma non eseguiva correttamente il proprio compito, poichè la classe Inc1000 è un thread, essa lavora in modo indipendente dal main e potrebbe darsi che il main può concludere prima e di conseguenza che stampa i risulatti prima che i due thread avessero finito.

Fase 2:
Nella seconda parte, invece si è aggiunto le chiamate del metodo Join() ai due oggetti , tra l'esecuzione del primo thread e del secondo così che adesso il main aspetta la fine del thread prima di eseguire altre instruzioni. Ma ci possono essere casi dove non si ha in output risulati non desiderati , questo perchè i due thread non sono sincronizzati e incrementa due volte lo stesso valore , ma comunque il valore in output sarà sempre superiore alla fase 1.

Fase 3:
Nella terza parte viene aggiunto synchrosized al metodo run(), che impedisce ai thread di accedere contemporaneamente alla variabile statica cont, in modo da non creare conflitto e valore sarà sempre 2000. 
