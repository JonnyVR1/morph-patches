package p149l;

import java.io.InvalidObjectException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qm5 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m175553a(int i, Object obj, int i2) throws InvalidObjectException {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new InvalidObjectException(sb.toString());
    }
}
