package kotlin.reflect.jvm.internal.impl.p120km;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmVersionRequirement {

    /* JADX INFO: renamed from: a */
    public KmVersionRequirementVersionKind f64573a;

    /* JADX INFO: renamed from: b */
    public KmVersionRequirementLevel f64574b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Integer f64575c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f64576d;

    /* JADX INFO: renamed from: e */
    public KmVersion f64577e;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final KmVersionRequirementVersionKind m89196a() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.f64573a;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.m87502r("kind");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KmVersionRequirementLevel m89197b() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.f64574b;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.m87502r(FirebaseAnalytics.Param.LEVEL);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KmVersion m89198c() {
        KmVersion kmVersion = this.f64577e;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.m87502r(WBConstants.AUTH_PARAMS_VERSION);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m89199d(@Nullable Integer num) {
        this.f64575c = num;
    }

    /* JADX INFO: renamed from: e */
    public final void m89200e(@NotNull KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        kmVersionRequirementVersionKind.getClass();
        this.f64573a = kmVersionRequirementVersionKind;
    }

    /* JADX INFO: renamed from: f */
    public final void m89201f(@NotNull KmVersionRequirementLevel kmVersionRequirementLevel) {
        kmVersionRequirementLevel.getClass();
        this.f64574b = kmVersionRequirementLevel;
    }

    /* JADX INFO: renamed from: g */
    public final void m89202g(@Nullable String str) {
        this.f64576d = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m89203h(@NotNull KmVersion kmVersion) {
        kmVersion.getClass();
        this.f64577e = kmVersion;
    }

    @NotNull
    public String toString() {
        return "KmVersionRequirement(kind=" + m89196a() + ", level=" + m89197b() + ", version=" + m89198c() + ", errorCode=" + this.f64575c + ", message=" + this.f64576d + ')';
    }
}
