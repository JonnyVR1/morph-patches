package p153l;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class b9w0 implements s6u0 {

    /* JADX INFO: renamed from: a */
    public final HashSet f75627a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Context f75628b;

    /* JADX INFO: renamed from: c */
    public final ibt0 f75629c;

    public b9w0(Context context, ibt0 ibt0Var) {
        this.f75628b = context;
        this.f75629c = ibt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m103143a() {
        return this.f75629c.m139413n(this.f75628b, this);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m103144b(HashSet hashSet) {
        this.f75627a.clear();
        this.f75627a.addAll(hashSet);
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final synchronized void mo103145u(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.f75629c.m139411l(this.f75627a);
        }
    }
}
