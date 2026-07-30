package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class whv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f186469a;

    /* JADX INFO: renamed from: b */
    public final boolean f186470b;

    public whv0(String str, boolean z) {
        this.f186469a = str;
        this.f186470b = z;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f186469a);
        if (this.f186470b) {
            bundle.putString("de", "1");
        }
    }
}
