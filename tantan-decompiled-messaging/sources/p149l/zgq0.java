package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 #2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\tR8\u0010\u0017\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00050\u0005 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000e0\u000e \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, m87232d2 = {"Ll/zgq0;", "", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "h", "()Lrx/c;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "", "o", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)Z", "n", "g", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "filterObs", "b", "homeTabDot", "c", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", Constants.INAPP_DATA_TAG, "Z", "j", "()Z", "p", "(Z)V", "forceRefreshFilter", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zgq0 {

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile zgq0 f203070f;

    /* JADX INFO: renamed from: g */
    public static JSONObject f203071g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22392a<MemberZoneFilter> filterObs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C22392a<Boolean> homeTabDot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MemberZoneFilter memberZoneFilter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean forceRefreshFilter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f203069e = "p_advanced_filter_page";

    /* JADX INFO: renamed from: h */
    public static final int f203072h = 100;

    /* JADX INFO: renamed from: i */
    public static final int f203073i = 50;

    public zgq0() {
        this.filterObs = C22392a.m221513c(m218675g());
        this.homeTabDot = C22392a.m221513c(Boolean.FALSE);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final zgq0 m218673k() {
        return INSTANCE.m218685c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m218674m() {
        INSTANCE.m218688f();
    }

    /* JADX INFO: renamed from: g */
    public final MemberZoneFilter m218675g() {
        MemberZoneFilter memberZoneFilter = this.memberZoneFilter;
        if (memberZoneFilter != null) {
            return memberZoneFilter;
        }
        MemberZoneFilter memberZoneFilterNew_ = MemberZoneFilter.new_();
        memberZoneFilterNew_.max_age = f203073i;
        memberZoneFilterNew_.min_age = 18;
        memberZoneFilterNew_.radius = f203072h;
        return memberZoneFilterNew_;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C22306c<MemberZoneFilter> m218676h() {
        C22306c<MemberZoneFilter> c22306cAsObservable = this.filterObs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final MemberZoneFilter m218677i() {
        MemberZoneFilter memberZoneFilterMo223809clone = this.filterObs.m221515e().mo223809clone();
        memberZoneFilterMo223809clone.getClass();
        return memberZoneFilterMo223809clone;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getForceRefreshFilter() {
        return this.forceRefreshFilter;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public final boolean m218679l(@NotNull MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        return Intrinsics.m87488d(m218675g(), memberZoneFilter);
    }

    /* JADX INFO: renamed from: n */
    public final void m218680n() {
        this.filterObs.onNext(m218675g());
    }

    /* JADX INFO: renamed from: o */
    public final void m218681o(@NotNull MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        this.filterObs.onNext(memberZoneFilter);
    }

    /* JADX INFO: renamed from: p */
    public final void m218682p(boolean z) {
        this.forceRefreshFilter = z;
    }

    /* JADX INFO: renamed from: l.zgq0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u000bR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/zgq0$a;", "", "<init>", "()V", "Ll/zgq0;", "c", "()Ll/zgq0;", "", "f", "", "e", "()I", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "", "filterPageId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getFilterPageId$annotations", "MaxRadius", "I", Constants.INAPP_DATA_TAG, "getMaxRadius$annotations", "instance", "Ll/zgq0;", "configJson", "Lorg/json/JSONObject;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JSONObject m218683a() {
            if (zgq0.f203071g == null) {
                String strM79302F = RemoteConfig.m79298x().m79302F("membership_zone_config");
                strM79302F.getClass();
                if (TextUtils.isEmpty(strM79302F)) {
                    return null;
                }
                zgq0.f203071g = new JSONObject(strM79302F);
            }
            JSONObject jSONObject = zgq0.f203071g;
            if (jSONObject != null) {
                return jSONObject;
            }
            Intrinsics.m87502r("configJson");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m218684b() {
            return zgq0.f203069e;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final zgq0 m218685c() {
            zgq0 zgq0Var;
            zgq0 zgq0Var2 = zgq0.f203070f;
            if (zgq0Var2 != null) {
                return zgq0Var2;
            }
            synchronized (this) {
                zgq0Var = zgq0.f203070f;
                if (zgq0Var == null) {
                    zgq0Var = new zgq0(null);
                    zgq0.f203070f = zgq0Var;
                }
            }
            return zgq0Var;
        }

        /* JADX INFO: renamed from: d */
        public final int m218686d() {
            return zgq0.f203072h;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m218687e() {
            JSONObject jSONObjectM218683a = m218683a();
            if (jSONObjectM218683a == null) {
                return 10;
            }
            int iOptInt = jSONObjectM218683a.optInt("nearby_distance", 10);
            if (iOptInt > 1000) {
                return iOptInt / 1000;
            }
            return 1;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m218688f() {
            zgq0.f203070f = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ zgq0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
