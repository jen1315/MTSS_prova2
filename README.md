# MTSS - Prova Pratica 2

////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

[![Build](https://github.com/jen1315/MTSS_prova2/actions/workflows/build.yml/badge.svg)](https://github.com/jen1315/MTSS_prova2/actions/workflows/build.yml)

### Coverage = 96%

### Descrizione
Il progetto consiste nello sviluppo di un convertitore da numeri arabi (da 1 a 1000) a numeri romani, con visualizzazione in ASCII art. Il lavoro è stato svolto seguendo le pratiche di Continuous Integration e Test-Driven (TDD), includendo:
- Utilizzo del workflow Git Flow con branches di develop, feature e release
- Creazione del progetto con Maven (```maven-archetype-quickstart```)
- Analisi statica del codice con Checkstyle
- Test unitari sviluppati con JUnit, seguendo i principi A-TRIP e Right-BICEP (copertura del codice >= 85%)
- Automazione della build con GitHub Actions

### Modifiche checkstyle.xml
Per rendere il codice più flessibile è stato modificato il valore di default del controllo sulla lunghezza dei metodi. In particolare, è stata effettuata la seguente modifica:
```xml
<!-- Prima -->
<module name="MethodLength">
    <property name="max" value="4"/>
</module>

<!-- Dopo -->
<module name="MethodLength">
    <property name="max" value="30"/>
</module>
```
