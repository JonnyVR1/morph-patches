package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class bxt0 {

    /* JADX INFO: renamed from: a */
    public final izt0 f78909a;

    /* JADX INFO: renamed from: b */
    public final View f78910b;

    /* JADX INFO: renamed from: c */
    public final r6w0 f78911c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final wit0 f78912d;

    public bxt0(View view, @Nullable wit0 wit0Var, izt0 izt0Var, r6w0 r6w0Var) {
        this.f78910b = view;
        this.f78912d = wit0Var;
        this.f78909a = izt0Var;
        this.f78911c = r6w0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final yfu0 m106904f(final Context context, final zzcei zzceiVar, final q6w0 q6w0Var, final o7w0 o7w0Var) {
        return new yfu0(new k8u0() { // from class: l.zwt0
            @Override // p153l.k8u0
            public final void zzr() {
                bxy0.m106937u().m114545n(context, zzceiVar.zza, q6w0Var.f155850D.toString(), o7w0Var.f145320f);
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: g */
    public static final Set m106905g(syt0 syt0Var) {
        return Collections.singleton(new yfu0(syt0Var, oct0.f146738f));
    }

    /* JADX INFO: renamed from: h */
    public static final yfu0 m106906h(qyt0 qyt0Var) {
        return new yfu0(qyt0Var, oct0.f146737e);
    }

    /* JADX INFO: renamed from: a */
    public final View m106907a() {
        return this.f78910b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final wit0 m106908b() {
        return this.f78912d;
    }

    /* JADX INFO: renamed from: c */
    public final izt0 m106909c() {
        return this.f78909a;
    }

    /* JADX INFO: renamed from: d */
    public i8u0 mo106910d(Set set) {
        return new i8u0(set);
    }

    /* JADX INFO: renamed from: e */
    public final r6w0 m106911e() {
        return this.f78911c;
    }
}
