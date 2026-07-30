package p149l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class rix0 extends mhx0<Boolean> {
    public rix0(uix0 uix0Var, String str, Boolean bool, boolean z) {
        super(uix0Var, str, bool);
    }

    @Override // p149l.mhx0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Boolean mo126416c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (upw0.f177682c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (upw0.f177683d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.m154655k() + ": " + String.valueOf(obj));
        return null;
    }
}
