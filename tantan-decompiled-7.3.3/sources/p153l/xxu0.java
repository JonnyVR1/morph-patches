package p153l;

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
public final class xxu0 {

    /* JADX INFO: renamed from: a */
    public final String f196685a;

    /* JADX INFO: renamed from: b */
    public final List f196686b;

    /* JADX INFO: renamed from: c */
    public final Set f196687c;

    /* JADX INFO: renamed from: d */
    public final Bundle f196688d;

    /* JADX INFO: renamed from: e */
    public final Map f196689e;

    /* JADX INFO: renamed from: f */
    public final String f196690f;

    /* JADX INFO: renamed from: g */
    public final String f196691g;

    /* JADX INFO: renamed from: h */
    public final int f196692h;

    /* JADX INFO: renamed from: i */
    public final Set f196693i;

    /* JADX INFO: renamed from: j */
    public final Bundle f196694j;

    /* JADX INFO: renamed from: k */
    public final Set f196695k;

    /* JADX INFO: renamed from: l */
    public final boolean f196696l;

    /* JADX INFO: renamed from: m */
    public final String f196697m;

    /* JADX INFO: renamed from: n */
    public final int f196698n;

    public xxu0(rwu0 rwu0Var, @Nullable ree0 ree0Var) {
        this.f196685a = rwu0Var.f165243g;
        this.f196686b = rwu0Var.f165244h;
        this.f196687c = Collections.unmodifiableSet(rwu0Var.f165237a);
        this.f196688d = rwu0Var.f165238b;
        this.f196689e = Collections.unmodifiableMap(rwu0Var.f165239c);
        this.f196690f = rwu0Var.f165245i;
        this.f196691g = rwu0Var.f165246j;
        this.f196692h = rwu0Var.f165247k;
        this.f196693i = Collections.unmodifiableSet(rwu0Var.f165240d);
        this.f196694j = rwu0Var.f165241e;
        this.f196695k = Collections.unmodifiableSet(rwu0Var.f165242f);
        this.f196696l = rwu0Var.f165248l;
        this.f196697m = rwu0Var.f165249m;
        this.f196698n = rwu0Var.f165250n;
    }

    /* JADX INFO: renamed from: a */
    public final int m213559a() {
        return this.f196698n;
    }

    /* JADX INFO: renamed from: b */
    public final int m213560b() {
        return this.f196692h;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m213561c() {
        return this.f196694j;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Bundle m213562d(Class cls) {
        return this.f196688d.getBundle(cls.getName());
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m213563e() {
        return this.f196688d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final ree0 m213564f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m213565g() {
        return this.f196697m;
    }

    /* JADX INFO: renamed from: h */
    public final String m213566h() {
        return this.f196685a;
    }

    /* JADX INFO: renamed from: i */
    public final String m213567i() {
        return this.f196690f;
    }

    /* JADX INFO: renamed from: j */
    public final String m213568j() {
        return this.f196691g;
    }

    /* JADX INFO: renamed from: k */
    public final List m213569k() {
        return new ArrayList(this.f196686b);
    }

    /* JADX INFO: renamed from: l */
    public final Set m213570l() {
        return this.f196695k;
    }

    /* JADX INFO: renamed from: m */
    public final Set m213571m() {
        return this.f196687c;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public final boolean m213572n() {
        return this.f196696l;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m213573o(Context context) {
        RequestConfiguration requestConfigurationM129950c = gdv0.m129942f().m129950c();
        k6s0.m148569b();
        Set set = this.f196693i;
        String strM167034A = obt0.m167034A(context);
        return set.contains(strM167034A) || requestConfigurationM129950c.m12281e().contains(strM167034A);
    }
}
