package p149l;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class vzv0 implements mxt0 {

    /* JADX INFO: renamed from: a */
    public final HashSet f183675a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Context f183676b;

    /* JADX INFO: renamed from: c */
    public final c2t0 f183677c;

    public vzv0(Context context, c2t0 c2t0Var) {
        this.f183676b = context;
        this.f183677c = c2t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m200787a() {
        return this.f183677c.m104933n(this.f183676b, this);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m200788b(HashSet hashSet) {
        this.f183675a.clear();
        this.f183675a.addAll(hashSet);
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final synchronized void mo97693u(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.f183677c.m104931l(this.f183675a);
        }
    }
}
