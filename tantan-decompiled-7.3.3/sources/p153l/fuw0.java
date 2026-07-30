package p153l;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fuw0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m127549a(Object obj, Object obj2) throws TimeoutException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " for ");
        sb.append(obj2);
        throw new TimeoutException(sb.toString());
    }
}
