package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class oiv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f144188a;

    /* JADX INFO: renamed from: b */
    public final boolean f144189b;

    /* JADX INFO: renamed from: c */
    public final boolean f144190c;

    /* JADX INFO: renamed from: d */
    public final boolean f144191d;

    /* JADX INFO: renamed from: e */
    public final boolean f144192e;

    public oiv0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f144188a = str;
        this.f144189b = z;
        this.f144190c = z2;
        this.f144191d = z3;
        this.f144192e = z4;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f144188a.isEmpty()) {
            bundle.putString("inspector_extras", this.f144188a);
        }
        bundle.putInt("test_mode", this.f144189b ? 1 : 0);
        bundle.putInt("linked_device", this.f144190c ? 1 : 0);
        if (this.f144189b || this.f144190c) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132205d9)).booleanValue()) {
                bundle.putInt("risd", !this.f144191d ? 1 : 0);
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132257h9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f144192e);
            }
        }
    }
}
