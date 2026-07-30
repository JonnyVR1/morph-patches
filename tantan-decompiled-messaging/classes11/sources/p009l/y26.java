package p009l;

import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class y26 implements c36 {

    /* JADX INFO: renamed from: a */
    public String f22863a;

    /* JADX INFO: renamed from: b */
    public int f22864b;

    public y26(String str, int i) {
        this.f22863a = str;
        this.f22864b = i;
    }

    @Override // p009l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo11184a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ForegroundColorSpan(this.f22864b));
        arrayList.add(new StyleSpan(1));
        return arrayList;
    }

    @Override // p009l.c36
    public j760<Integer, Integer> getIndex(String str) {
        return new j760<>(Integer.valueOf(str.indexOf(this.f22863a)), Integer.valueOf(str.indexOf(this.f22863a) + this.f22863a.length()));
    }
}
