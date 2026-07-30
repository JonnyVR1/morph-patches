package p149l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class vnt0 {

    /* JADX INFO: renamed from: a */
    public final cqt0 f182277a;

    /* JADX INFO: renamed from: b */
    public final View f182278b;

    /* JADX INFO: renamed from: c */
    public final lxv0 f182279c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final q9t0 f182280d;

    public vnt0(View view, @Nullable q9t0 q9t0Var, cqt0 cqt0Var, lxv0 lxv0Var) {
        this.f182278b = view;
        this.f182280d = q9t0Var;
        this.f182277a = cqt0Var;
        this.f182279c = lxv0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final s6u0 m199053f(final Context context, final zzcei zzceiVar, final kxv0 kxv0Var, final iyv0 iyv0Var) {
        return new s6u0(new ezt0() { // from class: l.tnt0
            @Override // p149l.ezt0
            public final void zzr() {
                vny0.m199083u().m211401n(context, zzceiVar.zza, kxv0Var.f125160D.toString(), iyv0Var.f115496f);
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: g */
    public static final Set m199054g(mpt0 mpt0Var) {
        return Collections.singleton(new s6u0(mpt0Var, i3t0.f111377f));
    }

    /* JADX INFO: renamed from: h */
    public static final s6u0 m199055h(kpt0 kpt0Var) {
        return new s6u0(kpt0Var, i3t0.f111376e);
    }

    /* JADX INFO: renamed from: a */
    public final View m199056a() {
        return this.f182278b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final q9t0 m199057b() {
        return this.f182280d;
    }

    /* JADX INFO: renamed from: c */
    public final cqt0 m199058c() {
        return this.f182277a;
    }

    /* JADX INFO: renamed from: d */
    public czt0 mo120307d(Set set) {
        return new czt0(set);
    }

    /* JADX INFO: renamed from: e */
    public final lxv0 m199059e() {
        return this.f182279c;
    }
}
