package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class krv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f128506a;

    public krv0(Boolean bool) {
        this.f128506a = bool;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Boolean bool = this.f128506a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
