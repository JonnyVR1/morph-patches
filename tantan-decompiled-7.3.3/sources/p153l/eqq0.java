package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.MemberZoneFilter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 #2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\tR8\u0010\u0017\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00050\u0005 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000e0\u000e \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, m88121d2 = {"Ll/eqq0;", "", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "h", "()Lrx/c;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "", "o", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)Z", "n", "g", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "filterObs", "b", "homeTabDot", "c", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", Constants.INAPP_DATA_TAG, "Z", "j", "()Z", "p", "(Z)V", "forceRefreshFilter", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eqq0 {

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile eqq0 f95368f;

    /* JADX INFO: renamed from: g */
    public static JSONObject f95369g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22507a<MemberZoneFilter> filterObs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C22507a<Boolean> homeTabDot;

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
    public static final String f95367e = "p_advanced_filter_page";

    /* JADX INFO: renamed from: h */
    public static final int f95370h = 100;

    /* JADX INFO: renamed from: i */
    public static final int f95371i = 50;

    public eqq0() {
        this.filterObs = C22507a.m222759c(m122037g());
        this.homeTabDot = C22507a.m222759c(Boolean.FALSE);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final eqq0 m122035k() {
        return INSTANCE.m122047c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m122036m() {
        INSTANCE.m122050f();
    }

    /* JADX INFO: renamed from: g */
    public final MemberZoneFilter m122037g() {
        MemberZoneFilter memberZoneFilter = this.memberZoneFilter;
        if (memberZoneFilter != null) {
            return memberZoneFilter;
        }
        MemberZoneFilter memberZoneFilterNew_ = MemberZoneFilter.new_();
        memberZoneFilterNew_.max_age = f95371i;
        memberZoneFilterNew_.min_age = 18;
        memberZoneFilterNew_.radius = f95370h;
        return memberZoneFilterNew_;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C22421c<MemberZoneFilter> m122038h() {
        C22421c<MemberZoneFilter> c22421cAsObservable = this.filterObs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final MemberZoneFilter m122039i() {
        MemberZoneFilter memberZoneFilterMo225055clone = this.filterObs.m222761e().mo225055clone();
        memberZoneFilterMo225055clone.getClass();
        return memberZoneFilterMo225055clone;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getForceRefreshFilter() {
        return this.forceRefreshFilter;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public final boolean m122041l(@NotNull MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        return Intrinsics.m88377d(m122037g(), memberZoneFilter);
    }

    /* JADX INFO: renamed from: n */
    public final void m122042n() {
        this.filterObs.onNext(m122037g());
    }

    /* JADX INFO: renamed from: o */
    public final void m122043o(@NotNull MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        this.filterObs.onNext(memberZoneFilter);
    }

    /* JADX INFO: renamed from: p */
    public final void m122044p(boolean z) {
        this.forceRefreshFilter = z;
    }

    /* JADX INFO: renamed from: l.eqq0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u000bR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/eqq0$a;", "", "<init>", "()V", "Ll/eqq0;", "c", "()Ll/eqq0;", "", "f", "", "e", "()I", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "", "filterPageId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getFilterPageId$annotations", "MaxRadius", "I", Constants.INAPP_DATA_TAG, "getMaxRadius$annotations", "instance", "Ll/eqq0;", "configJson", "Lorg/json/JSONObject;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JSONObject m122045a() {
            if (eqq0.f95369g == null) {
                String strM80485F = RemoteConfig.m80481x().m80485F("membership_zone_config");
                strM80485F.getClass();
                if (TextUtils.isEmpty(strM80485F)) {
                    return null;
                }
                eqq0.f95369g = new JSONObject(strM80485F);
            }
            JSONObject jSONObject = eqq0.f95369g;
            if (jSONObject != null) {
                return jSONObject;
            }
            Intrinsics.m88391r("configJson");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m122046b() {
            return eqq0.f95367e;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final eqq0 m122047c() {
            eqq0 eqq0Var;
            eqq0 eqq0Var2 = eqq0.f95368f;
            if (eqq0Var2 != null) {
                return eqq0Var2;
            }
            synchronized (this) {
                eqq0Var = eqq0.f95368f;
                if (eqq0Var == null) {
                    eqq0Var = new eqq0(null);
                    eqq0.f95368f = eqq0Var;
                }
            }
            return eqq0Var;
        }

        /* JADX INFO: renamed from: d */
        public final int m122048d() {
            return eqq0.f95370h;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m122049e() {
            JSONObject jSONObjectM122045a = m122045a();
            if (jSONObjectM122045a == null) {
                return 10;
            }
            int iOptInt = jSONObjectM122045a.optInt("nearby_distance", 10);
            if (iOptInt > 1000) {
                return iOptInt / 1000;
            }
            return 1;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m122050f() {
            eqq0.f95368f = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ eqq0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
