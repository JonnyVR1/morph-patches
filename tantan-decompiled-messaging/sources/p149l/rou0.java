package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class rou0 {

    /* JADX INFO: renamed from: a */
    public final String f160419a;

    /* JADX INFO: renamed from: b */
    public final List f160420b;

    /* JADX INFO: renamed from: c */
    public final Set f160421c;

    /* JADX INFO: renamed from: d */
    public final Bundle f160422d;

    /* JADX INFO: renamed from: e */
    public final Map f160423e;

    /* JADX INFO: renamed from: f */
    public final String f160424f;

    /* JADX INFO: renamed from: g */
    public final String f160425g;

    /* JADX INFO: renamed from: h */
    public final int f160426h;

    /* JADX INFO: renamed from: i */
    public final Set f160427i;

    /* JADX INFO: renamed from: j */
    public final Bundle f160428j;

    /* JADX INFO: renamed from: k */
    public final Set f160429k;

    /* JADX INFO: renamed from: l */
    public final boolean f160430l;

    /* JADX INFO: renamed from: m */
    public final String f160431m;

    /* JADX INFO: renamed from: n */
    public final int f160432n;

    public rou0(lnu0 lnu0Var, @Nullable m6e0 m6e0Var) {
        this.f160419a = lnu0Var.f129033g;
        this.f160420b = lnu0Var.f129034h;
        this.f160421c = Collections.unmodifiableSet(lnu0Var.f129027a);
        this.f160422d = lnu0Var.f129028b;
        this.f160423e = Collections.unmodifiableMap(lnu0Var.f129029c);
        this.f160424f = lnu0Var.f129035i;
        this.f160425g = lnu0Var.f129036j;
        this.f160426h = lnu0Var.f129037k;
        this.f160427i = Collections.unmodifiableSet(lnu0Var.f129030d);
        this.f160428j = lnu0Var.f129031e;
        this.f160429k = Collections.unmodifiableSet(lnu0Var.f129032f);
        this.f160430l = lnu0Var.f129038l;
        this.f160431m = lnu0Var.f129039m;
        this.f160432n = lnu0Var.f129040n;
    }

    /* JADX INFO: renamed from: a */
    public final int m180248a() {
        return this.f160432n;
    }

    /* JADX INFO: renamed from: b */
    public final int m180249b() {
        return this.f160426h;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m180250c() {
        return this.f160428j;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Bundle m180251d(Class cls) {
        return this.f160422d.getBundle(cls.getName());
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m180252e() {
        return this.f160422d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final m6e0 m180253f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m180254g() {
        return this.f160431m;
    }

    /* JADX INFO: renamed from: h */
    public final String m180255h() {
        return this.f160419a;
    }

    /* JADX INFO: renamed from: i */
    public final String m180256i() {
        return this.f160424f;
    }

    /* JADX INFO: renamed from: j */
    public final String m180257j() {
        return this.f160425g;
    }

    /* JADX INFO: renamed from: k */
    public final List m180258k() {
        return new ArrayList(this.f160420b);
    }

    /* JADX INFO: renamed from: l */
    public final Set m180259l() {
        return this.f160429k;
    }

    /* JADX INFO: renamed from: m */
    public final Set m180260m() {
        return this.f160421c;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public final boolean m180261n() {
        return this.f160430l;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m180262o(Context context) {
        RequestConfiguration requestConfigurationM94939c = a4v0.m94931f().m94939c();
        exr0.m118703b();
        Set set = this.f160427i;
        String strM134081A = i2t0.m134081A(context);
        return set.contains(strM134081A) || requestConfigurationM94939c.m12227e().contains(strM134081A);
    }
}
