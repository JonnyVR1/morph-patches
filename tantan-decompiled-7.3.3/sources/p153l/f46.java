package p153l;

import android.text.style.StyleSpan;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f46 extends c46 {

    /* JADX INFO: renamed from: c */
    public CharSequence f97052c;

    public f46(CharSequence charSequence, int i) {
        super(i, charSequence.length() + i);
        this.f97052c = charSequence;
    }

    @Override // p153l.h46
    /* JADX INFO: renamed from: a */
    public List<Object> mo114109a(String str) {
        if (str.indexOf(this.f97052c.toString()) >= 0) {
            return jyb.m147507f0(new StyleSpan(1));
        }
        return null;
    }
}
