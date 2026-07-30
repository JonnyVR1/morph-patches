package p153l;

import android.text.style.ForegroundColorSpan;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g46 extends c46 {

    /* JADX INFO: renamed from: c */
    public CharSequence f102136c;

    /* JADX INFO: renamed from: d */
    public int f102137d;

    public g46(CharSequence charSequence, int i, int i2) {
        super(i2, charSequence.length() + i2);
        this.f102136c = charSequence;
        this.f102137d = i;
    }

    @Override // p153l.h46
    /* JADX INFO: renamed from: a */
    public List<Object> mo114109a(String str) {
        if (str.indexOf(this.f102136c.toString()) >= 0) {
            return jyb.m147507f0(new ForegroundColorSpan(this.f102137d));
        }
        return null;
    }
}
