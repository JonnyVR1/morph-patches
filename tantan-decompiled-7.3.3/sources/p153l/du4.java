package p153l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class du4 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m118067a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            mnd0.m159157a(RequestParameters.DELIMITER);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
