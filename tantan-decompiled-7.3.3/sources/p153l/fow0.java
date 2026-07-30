package p153l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class fow0 {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m126498a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final StringBuilder m126499b(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                sb.append(m126498a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(m126498a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            gig0.m130323a(e);
            return null;
        }
    }
}
