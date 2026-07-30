package p149l;

import android.text.style.ForegroundColorSpan;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b36 extends x26 {

    /* JADX INFO: renamed from: c */
    public CharSequence f72805c;

    /* JADX INFO: renamed from: d */
    public int f72806d;

    public b36(CharSequence charSequence, int i, int i2) {
        super(i2, charSequence.length() + i2);
        this.f72805c = charSequence;
        this.f72806d = i;
    }

    @Override // p149l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo94649a(String str) {
        if (str.indexOf(this.f72805c.toString()) >= 0) {
            return vwb.m200324f0(new ForegroundColorSpan(this.f72806d));
        }
        return null;
    }
}
