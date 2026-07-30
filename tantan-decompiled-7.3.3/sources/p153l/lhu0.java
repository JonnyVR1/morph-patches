package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class lhu0 {

    /* JADX INFO: renamed from: a */
    public final wiu0 f132144a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final wit0 f132145b;

    public lhu0(wiu0 wiu0Var, @Nullable wit0 wit0Var) {
        this.f132144a = wiu0Var;
        this.f132145b = wit0Var;
    }

    /* JADX INFO: renamed from: h */
    public static final yfu0 m154245h(odw0 odw0Var) {
        return new yfu0(odw0Var, oct0.f146738f);
    }

    /* JADX INFO: renamed from: i */
    public static final yfu0 m154246i(hju0 hju0Var) {
        return new yfu0(hju0Var, oct0.f146738f);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final View m154247a() {
        wit0 wit0Var = this.f132145b;
        if (wit0Var == null) {
            return null;
        }
        return wit0Var.mo13715L();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final View m154248b() {
        wit0 wit0Var = this.f132145b;
        if (wit0Var != null) {
            return wit0Var.mo13715L();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final wit0 m154249c() {
        return this.f132145b;
    }

    /* JADX INFO: renamed from: d */
    public final yfu0 m154250d(Executor executor) {
        final wit0 wit0Var = this.f132145b;
        return new yfu0(new ccu0() { // from class: l.khu0
            @Override // p153l.ccu0
            public final void zza() {
                BinderC2096b binderC2096bZzL;
                wit0 wit0Var2 = wit0Var;
                if (wit0Var2 == null || (binderC2096bZzL = wit0Var2.zzL()) == null) {
                    return;
                }
                binderC2096bZzL.zzb();
            }
        }, executor);
    }

    /* JADX INFO: renamed from: e */
    public final wiu0 m154251e() {
        return this.f132144a;
    }

    /* JADX INFO: renamed from: f */
    public Set mo154252f(u3u0 u3u0Var) {
        return Collections.singleton(new yfu0(u3u0Var, oct0.f146738f));
    }

    /* JADX INFO: renamed from: g */
    public Set mo154253g(u3u0 u3u0Var) {
        return Collections.singleton(new yfu0(u3u0Var, oct0.f146738f));
    }
}
