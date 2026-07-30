package p149l;

import android.text.style.StyleSpan;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class a36 extends x26 {

    /* JADX INFO: renamed from: c */
    public CharSequence f67330c;

    public a36(CharSequence charSequence, int i) {
        super(i, charSequence.length() + i);
        this.f67330c = charSequence;
    }

    @Override // p149l.c36
    /* JADX INFO: renamed from: a */
    public List<Object> mo94649a(String str) {
        if (str.indexOf(this.f67330c.toString()) >= 0) {
            return vwb.m200324f0(new StyleSpan(1));
        }
        return null;
    }
}
