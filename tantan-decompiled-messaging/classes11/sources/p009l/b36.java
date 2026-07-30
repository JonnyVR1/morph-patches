package p009l;

import android.text.style.ForegroundColorSpan;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b36 extends x26 {

    /* JADX INFO: renamed from: c */
    public CharSequence f9888c;

    /* JADX INFO: renamed from: d */
    public int f9889d;

    public b36(CharSequence charSequence, int i, int i2) {
        super(i2, charSequence.length() + i2);
        this.f9888c = charSequence;
        this.f9889d = i;
    }

    @Override // p009l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo11184a(String str) {
        if (str.indexOf(this.f9888c.toString()) >= 0) {
            return vwb.f0(new Object[]{new ForegroundColorSpan(this.f9889d)});
        }
        return null;
    }
}
