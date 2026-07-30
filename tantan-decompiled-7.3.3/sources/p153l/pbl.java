package p153l;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class pbl {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m171511a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            mnd0.m159157a(RequestParameters.DELIMITER);
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
