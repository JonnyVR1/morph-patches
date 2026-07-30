package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class eiv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f91637a;

    public eiv0(Boolean bool) {
        this.f91637a = bool;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Boolean bool = this.f91637a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
