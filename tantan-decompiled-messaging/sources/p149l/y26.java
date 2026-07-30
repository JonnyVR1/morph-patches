package p149l;

import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class y26 implements c36 {

    /* JADX INFO: renamed from: a */
    public String f195493a;

    /* JADX INFO: renamed from: b */
    public int f195494b;

    public y26(String str, int i) {
        this.f195493a = str;
        this.f195494b = i;
    }

    @Override // p149l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo94649a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ForegroundColorSpan(this.f195494b));
        arrayList.add(new StyleSpan(1));
        return arrayList;
    }

    @Override // p149l.c36
    public j760<Integer, Integer> getIndex(String str) {
        return new j760<>(Integer.valueOf(str.indexOf(this.f195493a)), Integer.valueOf(str.indexOf(this.f195493a) + this.f195493a.length()));
    }
}
