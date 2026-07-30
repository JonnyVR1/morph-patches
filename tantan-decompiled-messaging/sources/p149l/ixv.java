package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ixv implements xri0 {

    /* JADX INFO: renamed from: a */
    public String f115401a;

    @Override // p149l.xri0
    /* JADX INFO: renamed from: a */
    public nwv mo138899a(nwv nwvVar) {
        if (nwvVar != null && !TextUtils.isEmpty(this.f115401a) && this.f115401a.equals(nwvVar.f140978b)) {
            return null;
        }
        this.f115401a = nwvVar.f140978b;
        return nwvVar;
    }
}
