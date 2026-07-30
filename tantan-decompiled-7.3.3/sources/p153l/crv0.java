package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class crv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f83366a;

    /* JADX INFO: renamed from: b */
    public final boolean f83367b;

    public crv0(String str, boolean z) {
        this.f83366a = str;
        this.f83367b = z;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f83366a);
        if (this.f83367b) {
            bundle.putString("de", "1");
        }
    }
}
