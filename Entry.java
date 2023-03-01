public class Entry implements ComparableContent<Entry> {
int wert;
// diverse weitere Attribute

public Entry(int pWert){
   wert = pWert;   
}

public boolean isLess(Entry pContent) {
return this.getWert() < pContent.getWert();
}
public boolean isEqual(Entry pContent) {
return this.getWert() == pContent.getWert();
}
public boolean isGreater(Entry pContent) {
return this.getWert() > pContent.getWert();
}
public int getWert() {
return this.wert;
}
}