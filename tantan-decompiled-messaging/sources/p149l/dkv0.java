package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class dkv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f86710a;

    /* JADX INFO: renamed from: b */
    public final String f86711b;

    public dkv0(String str, String str2) {
        this.f86710a = str;
        this.f86711b = str2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132115W6)).booleanValue()) {
            bundle.putString("request_id", this.f86711b);
        } else {
            bundle.putString("request_id", this.f86710a);
        }
    }
}
