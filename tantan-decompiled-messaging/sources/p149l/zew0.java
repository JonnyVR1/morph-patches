package p149l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class zew0 {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m218427a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final StringBuilder m218428b(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                sb.append(m218427a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(m218427a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            y9g0.m213537a(e);
            return null;
        }
    }
}
