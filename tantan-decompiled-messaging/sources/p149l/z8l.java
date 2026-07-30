package p149l;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class z8l {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m217616a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            jfd0.m141176a(RequestParameters.DELIMITER);
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
