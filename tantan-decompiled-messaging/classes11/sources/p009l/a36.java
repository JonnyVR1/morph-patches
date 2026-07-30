package p009l;

import android.text.style.StyleSpan;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a36 extends x26 {

    /* JADX INFO: renamed from: c */
    public CharSequence f9196c;

    public a36(CharSequence charSequence, int i) {
        super(i, charSequence.length() + i);
        this.f9196c = charSequence;
    }

    @Override // p009l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo11184a(String str) {
        if (str.indexOf(this.f9196c.toString()) >= 0) {
            return vwb.f0(new Object[]{new StyleSpan(1)});
        }
        return null;
    }
}
