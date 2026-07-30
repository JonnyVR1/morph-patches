package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class bnv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77601a;

    public bnv0(boolean z) {
        this.f77601a = z;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f77601a ? "0" : "1");
    }
}
