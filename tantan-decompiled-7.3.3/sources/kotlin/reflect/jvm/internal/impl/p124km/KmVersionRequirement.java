package kotlin.reflect.jvm.internal.impl.p124km;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmVersionRequirement {

    /* JADX INFO: renamed from: a */
    public KmVersionRequirementVersionKind f65247a;

    /* JADX INFO: renamed from: b */
    public KmVersionRequirementLevel f65248b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Integer f65249c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f65250d;

    /* JADX INFO: renamed from: e */
    public KmVersion f65251e;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final KmVersionRequirementVersionKind m90087a() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.f65247a;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.m88391r("kind");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KmVersionRequirementLevel m90088b() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.f65248b;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.m88391r(FirebaseAnalytics.Param.LEVEL);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KmVersion m90089c() {
        KmVersion kmVersion = this.f65251e;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.m88391r(WBConstants.AUTH_PARAMS_VERSION);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m90090d(@Nullable Integer num) {
        this.f65249c = num;
    }

    /* JADX INFO: renamed from: e */
    public final void m90091e(@NotNull KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        kmVersionRequirementVersionKind.getClass();
        this.f65247a = kmVersionRequirementVersionKind;
    }

    /* JADX INFO: renamed from: f */
    public final void m90092f(@NotNull KmVersionRequirementLevel kmVersionRequirementLevel) {
        kmVersionRequirementLevel.getClass();
        this.f65248b = kmVersionRequirementLevel;
    }

    /* JADX INFO: renamed from: g */
    public final void m90093g(@Nullable String str) {
        this.f65250d = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m90094h(@NotNull KmVersion kmVersion) {
        kmVersion.getClass();
        this.f65251e = kmVersion;
    }

    @NotNull
    public String toString() {
        return "KmVersionRequirement(kind=" + m90087a() + ", level=" + m90088b() + ", version=" + m90089c() + ", errorCode=" + this.f65249c + ", message=" + this.f65250d + ')';
    }
}
