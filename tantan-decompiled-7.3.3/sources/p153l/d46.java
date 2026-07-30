package p153l;

import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d46 implements h46 {

    /* JADX INFO: renamed from: a */
    public String f85000a;

    /* JADX INFO: renamed from: b */
    public int f85001b;

    public d46(String str, int i) {
        this.f85000a = str;
        this.f85001b = i;
    }

    @Override // p153l.h46
    /* JADX INFO: renamed from: a */
    public List<Object> mo114109a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ForegroundColorSpan(this.f85001b));
        arrayList.add(new StyleSpan(1));
        return arrayList;
    }

    @Override // p153l.h46
    public pf60<Integer, Integer> getIndex(String str) {
        return new pf60<>(Integer.valueOf(str.indexOf(this.f85000a)), Integer.valueOf(str.indexOf(this.f85000a) + this.f85000a.length()));
    }
}
