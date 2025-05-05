# MTSS_prova2

////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

### Modifiche checkstyle.xml
Per rendere il codice più flessibile è stato modificato il valore di default del controllo sulla lunghezza dei metodi. In particolare, è stata effettuata la seguente modifica:
```xml
<!-- Prima -->
<module name="MethodLength">
    <property name="max" value="4"/>
</module>

<!-- Dopo -->
<module name="MethodLength">
    <property name="max" value="10"/>
</module>
```
