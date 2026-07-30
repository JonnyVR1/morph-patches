package p149l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class gix0 extends mhx0<Long> {
    public gix0(uix0 uix0Var, String str, Long l2, boolean z) {
        super(uix0Var, str, l2);
    }

    @Override // p149l.mhx0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long mo126416c(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.m154655k() + ": " + String.valueOf(obj));
        return null;
    }
}
