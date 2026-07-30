package p009l;

import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final /* synthetic */ class z8l {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m25624a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            jfd0.a("delimiter");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }
}
