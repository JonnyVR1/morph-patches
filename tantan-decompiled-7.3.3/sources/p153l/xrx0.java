package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class xrx0 extends sqx0<Boolean> {
    public xrx0(asx0 asx0Var, String str, Boolean bool, boolean z) {
        super(asx0Var, str, bool);
    }

    @Override // p153l.sqx0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Boolean mo106316c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (azw0.f74196c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (azw0.f74197d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.m187575k() + ": " + String.valueOf(obj));
        return null;
    }
}
