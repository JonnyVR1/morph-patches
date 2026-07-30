package p149l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class et4 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m117971a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            jfd0.m141176a(RequestParameters.DELIMITER);
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
