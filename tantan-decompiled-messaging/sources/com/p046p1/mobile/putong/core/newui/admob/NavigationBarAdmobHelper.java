package com.p046p1.mobile.putong.core.newui.admob;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.subjects.C22392a;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.tpd0;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001NB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00102\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b1\u0010/R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u001a\u0010:\u001a\u00020\u001c8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010$R\"\u0010=\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00108\u001a\u0004\b;\u0010$\"\u0004\b<\u0010\u001fR\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010?R\u0016\u0010A\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\"\u0010D\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00108\u001a\u0004\bB\u0010$\"\u0004\bC\u0010\u001fR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c0E8\u0006¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\bG\u0010HR\"\u0010L\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00108\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010\u001fR\u0016\u0010M\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00108¨\u0006O"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper$TabBarBottomBannerRc;", "u", "()Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper$TabBarBottomBannerRc;", "", "r", "()Z", BLiveStormDanmakuGiftResourceType.f44446s, "q", "Lcom/p1/mobile/putong/data/Gender;", "userGender", "", Target.TYPE, Constants.KEY_T, "(Lcom/p1/mobile/putong/data/Gender;Ljava/lang/String;)Z", BaseSei.f13930X, "Lkotlin/Function0;", "", "function", "g", "(Lkotlin/jvm/functions/Function0;)Z", "f", "e", "c", Constants.INAPP_DATA_TAG, "", "extraWhenAdVisible", BaseSei.f13932Z, "(I)V", "p", ResourceDirection.f38808v, BaseSei.f13931Y, "n", "()I", "a", "Z", "getPromoBannerBlockingBottomBanner", "w", "(Z)V", "promoBannerBlockingBottomBanner", "Ll/tpd0;", "b", "Lkotlin/Lazy;", "o", "()Ll/tpd0;", "userWealthGrade", "j", "anchorWealthGrade", "Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper$TabBarBottomBannerRc;", "rc", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "I", RXScreenCaptureService.KEY_INDEX, "ADMOB_HEIGHT_DP", "h", "setADMOB_HEIGHT", "ADMOB_HEIGHT", "", "J", "lastCloseAdTime", "currentState", "k", "setNavigationAdmobHeight", "navigationAdmobHeight", "Lrx/subjects/a;", "Lrx/subjects/a;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lrx/subjects/a;", "navigationAdmobHeightSub", "m", "setShowAdmobCount", "showAdmobCount", "swipeCardCount", "TabBarBottomBannerRc", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NavigationBarAdmobHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean promoBannerBlockingBottomBanner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static TabBarBottomBannerRc rc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static long lastCloseAdTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static int currentState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static int navigationAdmobHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<Integer> navigationAdmobHeightSub;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static int showAdmobCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static int swipeCardCount;

    @NotNull
    public static final NavigationBarAdmobHelper INSTANCE = new NavigationBarAdmobHelper();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy userWealthGrade = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.b720
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavigationBarAdmobHelper.m36141b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy anchorWealthGrade = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.c720
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavigationBarAdmobHelper.m36140a();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Gson gson = new Gson();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final int ADMOB_HEIGHT_DP = 60;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static int ADMOB_HEIGHT = t100.m186890d(60);

    static {
        C22392a<Integer> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        navigationAdmobHeightSub = c22392aM221512b;
    }

    /* JADX INFO: renamed from: a */
    public static tpd0 m36140a() {
        return new tpd0("anchor_wealth_grade" + CoreModule.m29931H().userId(), -1);
    }

    /* JADX INFO: renamed from: b */
    public static tpd0 m36141b() {
        return new tpd0("user_wealth_grade" + CoreModule.m29931H().userId(), -1);
    }

    /* JADX INFO: renamed from: c */
    public final void m36142c() {
        currentState = 0;
        lastCloseAdTime = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public final void m36143d() {
        currentState = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m36144e() {
        currentState = 1;
        showAdmobCount++;
        swipeCardCount = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m36145f() {
        currentState = 2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36146g(@NotNull Function0<Unit> function) {
        function.getClass();
        try {
            if (m36163x()) {
                return false;
            }
            int i = currentState;
            if (i != 1 && i != 2) {
                if (!Intrinsics.m87488d("test", ABManager.m29352j0("intl_ad_show_bottom_banner"))) {
                    return false;
                }
                C22392a<Boolean> c22392a = CoreModule.f17545c.f19620X1.f90483T;
                if (!(c22392a != null ? Intrinsics.m87488d(c22392a.m221515e(), Boolean.TRUE) : false)) {
                    return false;
                }
                if (rc == null) {
                    TabBarBottomBannerRc tabBarBottomBannerRcM36160u = m36160u();
                    rc = tabBarBottomBannerRcM36160u;
                    if (tabBarBottomBannerRcM36160u == null) {
                        return false;
                    }
                }
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (userM169527p9 == null) {
                    return false;
                }
                Gender gender = userM169527p9.gender;
                gender.getClass();
                TabBarBottomBannerRc tabBarBottomBannerRc = rc;
                tabBarBottomBannerRc.getClass();
                if (!m36159t(gender, tabBarBottomBannerRc.getTargetGender())) {
                    return false;
                }
                TabBarBottomBannerRc tabBarBottomBannerRc2 = rc;
                tabBarBottomBannerRc2.getClass();
                if (tabBarBottomBannerRc2.effectiveMccBlacklist().contains(String.valueOf(qib0.f154717f0))) {
                    return false;
                }
                TabBarBottomBannerRc tabBarBottomBannerRc3 = rc;
                tabBarBottomBannerRc3.getClass();
                if (mqi0.m155944o() - userM169527p9.createdTime < ((long) tabBarBottomBannerRc3.effectiveRegisteredDays()) * 86400000 || m36156q() || m36158s() || m36157r()) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - lastCloseAdTime;
                TabBarBottomBannerRc tabBarBottomBannerRc4 = rc;
                tabBarBottomBannerRc4.getClass();
                return jCurrentTimeMillis > tabBarBottomBannerRc4.effectiveSwitchTabCoolDownSecs() * 1000;
            }
            if (m36157r() || m36158s() || m36156q()) {
                function.invoke();
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m36147h() {
        return ADMOB_HEIGHT;
    }

    /* JADX INFO: renamed from: i */
    public final int m36148i() {
        return ADMOB_HEIGHT_DP;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final tpd0 m36149j() {
        return (tpd0) anchorWealthGrade.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final int m36150k() {
        return navigationAdmobHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C22392a<Integer> m36151l() {
        return navigationAdmobHeightSub;
    }

    /* JADX INFO: renamed from: m */
    public final int m36152m() {
        return showAdmobCount;
    }

    /* JADX INFO: renamed from: n */
    public final int m36153n() {
        return swipeCardCount;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final tpd0 m36154o() {
        return (tpd0) userWealthGrade.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36155p() {
        return currentState == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m36156q() {
        Integer num = m36149j().get();
        if (num.intValue() < 0) {
            return true;
        }
        int iIntValue = num.intValue();
        TabBarBottomBannerRc tabBarBottomBannerRc = rc;
        tabBarBottomBannerRc.getClass();
        return iIntValue > tabBarBottomBannerRc.effectiveTargetAnchorGrade();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m36157r() {
        return (xma.m210071e4() && xma.m210087m4() && xma.m210077h4() && xma.m210081j4()) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m36158s() {
        Integer num = m36154o().get();
        if (num.intValue() >= 0) {
            int iIntValue = num.intValue();
            TabBarBottomBannerRc tabBarBottomBannerRc = rc;
            if (iIntValue < (tabBarBottomBannerRc != null ? tabBarBottomBannerRc.effectiveTargetWealthLevel() : 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m36159t(Gender userGender, String target) {
        if (target == null || StringsKt.m93438e0(target)) {
            return true;
        }
        String upperCase = StringsKt.m93433Z0(target).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 70) {
            if (iHashCode != 77) {
                if (iHashCode != 2358797) {
                    if (iHashCode != 2070122316 || !upperCase.equals("FEMALE")) {
                        return false;
                    }
                } else if (!upperCase.equals("MALE")) {
                    return false;
                }
            } else if (!upperCase.equals("M")) {
                return false;
            }
            return TEnum.equals(userGender, "male");
        }
        if (!upperCase.equals("F")) {
            return false;
        }
        return TEnum.equals(userGender, "female");
    }

    /* JADX INFO: renamed from: u */
    public final TabBarBottomBannerRc m36160u() {
        String strM79302F = RemoteConfig.m79298x().m79302F("ttt_tab_bar_bottom_banner");
        strM79302F.getClass();
        if (strM79302F.length() <= 0) {
            return null;
        }
        try {
            return (TabBarBottomBannerRc) gson.fromJson(strM79302F, TabBarBottomBannerRc.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m36161v() {
        currentState = 0;
        lastCloseAdTime = 0L;
        navigationAdmobHeight = 0;
        rc = null;
        showAdmobCount = 0;
        swipeCardCount = 0;
        promoBannerBlockingBottomBanner = false;
    }

    /* JADX INFO: renamed from: w */
    public final void m36162w(boolean z) {
        promoBannerBlockingBottomBanner = z;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m36163x() {
        if (promoBannerBlockingBottomBanner) {
            return true;
        }
        return CoreModule.f17545c.f19696x0.m30185M3(CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.HOME_SWIPE_CARD_PAGE);
    }

    /* JADX INFO: renamed from: y */
    public final void m36164y() {
        if (m36155p()) {
            swipeCardCount++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m36165z(int extraWhenAdVisible) {
        if (navigationAdmobHeight != extraWhenAdVisible) {
            navigationAdmobHeight = extraWhenAdVisible;
            navigationAdmobHeightSub.m132487l(Integer.valueOf(extraWhenAdVisible));
        }
    }

    @Keep
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\nJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060#J\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011Jh\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001e\u0010\u0011¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper$TabBarBottomBannerRc;", "", "registeredDays", "", "noDisplayMcc", "", "", "switchTabCoolDownSecs", "", "adBannerScreenRadio", "", "targetGender", "targetWealthLevelAlt", "targetAnchorGrade", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRegisteredDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNoDisplayMcc", "()Ljava/util/List;", "getSwitchTabCoolDownSecs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdBannerScreenRadio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTargetGender", "()Ljava/lang/String;", "getTargetWealthLevelAlt", "getTargetAnchorGrade", "effectiveRegisteredDays", "effectiveSwitchTabCoolDownSecs", "effectiveAdBannerScreenRadio", "effectiveMccBlacklist", "", "effectiveTargetWealthLevel", "effectiveTargetAnchorGrade", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/p1/mobile/putong/core/newui/admob/NavigationBarAdmobHelper$TabBarBottomBannerRc;", "equals", "", "other", "hashCode", "toString", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final /* data */ class TabBarBottomBannerRc {

        @SerializedName("ad_banner_screen_radio")
        @Nullable
        private final Double adBannerScreenRadio;

        @SerializedName("no_display_mcc")
        @Nullable
        private final List<String> noDisplayMcc;

        @SerializedName("registered_days")
        @Nullable
        private final Integer registeredDays;

        @SerializedName("switch_tab_cool_down_secs")
        @Nullable
        private final Long switchTabCoolDownSecs;

        @SerializedName("target_anchor_grade")
        @Nullable
        private final Integer targetAnchorGrade;

        @SerializedName("target_gender")
        @Nullable
        private final String targetGender;

        @SerializedName("target_wealth_level")
        @Nullable
        private final Integer targetWealthLevelAlt;

        public /* synthetic */ TabBarBottomBannerRc(Integer num, List list, Long l2, Double d, String str, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabBarBottomBannerRc copy$default(TabBarBottomBannerRc tabBarBottomBannerRc, Integer num, List list, Long l2, Double d, String str, Integer num2, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = tabBarBottomBannerRc.registeredDays;
            }
            if ((i & 2) != 0) {
                list = tabBarBottomBannerRc.noDisplayMcc;
            }
            if ((i & 4) != 0) {
                l2 = tabBarBottomBannerRc.switchTabCoolDownSecs;
            }
            if ((i & 8) != 0) {
                d = tabBarBottomBannerRc.adBannerScreenRadio;
            }
            if ((i & 16) != 0) {
                str = tabBarBottomBannerRc.targetGender;
            }
            if ((i & 32) != 0) {
                num2 = tabBarBottomBannerRc.targetWealthLevelAlt;
            }
            if ((i & 64) != 0) {
                num3 = tabBarBottomBannerRc.targetAnchorGrade;
            }
            Integer num4 = num2;
            Integer num5 = num3;
            String str2 = str;
            Long l3 = l2;
            return tabBarBottomBannerRc.copy(num, list, l3, d, str2, num4, num5);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getRegisteredDays() {
            return this.registeredDays;
        }

        @Nullable
        public final List<String> component2() {
            return this.noDisplayMcc;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getSwitchTabCoolDownSecs() {
            return this.switchTabCoolDownSecs;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Double getAdBannerScreenRadio() {
            return this.adBannerScreenRadio;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTargetGender() {
            return this.targetGender;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getTargetWealthLevelAlt() {
            return this.targetWealthLevelAlt;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getTargetAnchorGrade() {
            return this.targetAnchorGrade;
        }

        @NotNull
        public final TabBarBottomBannerRc copy(@Nullable Integer registeredDays, @Nullable List<String> noDisplayMcc, @Nullable Long switchTabCoolDownSecs, @Nullable Double adBannerScreenRadio, @Nullable String targetGender, @Nullable Integer targetWealthLevelAlt, @Nullable Integer targetAnchorGrade) {
            return new TabBarBottomBannerRc(registeredDays, noDisplayMcc, switchTabCoolDownSecs, adBannerScreenRadio, targetGender, targetWealthLevelAlt, targetAnchorGrade);
        }

        public final double effectiveAdBannerScreenRadio() {
            Double d = this.adBannerScreenRadio;
            if (d != null) {
                return d.doubleValue();
            }
            return 0.073d;
        }

        @NotNull
        public final Set<String> effectiveMccBlacklist() {
            List<String> list = this.noDisplayMcc;
            if (list == null) {
                return SetsKt.emptySet();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return CollectionsKt.toSet(arrayList);
        }

        public final int effectiveRegisteredDays() {
            Integer num = this.registeredDays;
            if (num != null) {
                return num.intValue();
            }
            return 30;
        }

        public final long effectiveSwitchTabCoolDownSecs() {
            Long l2 = this.switchTabCoolDownSecs;
            if (l2 != null) {
                return l2.longValue();
            }
            return 240L;
        }

        public final int effectiveTargetAnchorGrade() {
            Integer num = this.targetAnchorGrade;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public final int effectiveTargetWealthLevel() {
            Integer num = this.targetWealthLevelAlt;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabBarBottomBannerRc)) {
                return false;
            }
            TabBarBottomBannerRc tabBarBottomBannerRc = (TabBarBottomBannerRc) other;
            return Intrinsics.m87488d(this.registeredDays, tabBarBottomBannerRc.registeredDays) && Intrinsics.m87488d(this.noDisplayMcc, tabBarBottomBannerRc.noDisplayMcc) && Intrinsics.m87488d(this.switchTabCoolDownSecs, tabBarBottomBannerRc.switchTabCoolDownSecs) && Intrinsics.m87488d(this.adBannerScreenRadio, tabBarBottomBannerRc.adBannerScreenRadio) && Intrinsics.m87488d(this.targetGender, tabBarBottomBannerRc.targetGender) && Intrinsics.m87488d(this.targetWealthLevelAlt, tabBarBottomBannerRc.targetWealthLevelAlt) && Intrinsics.m87488d(this.targetAnchorGrade, tabBarBottomBannerRc.targetAnchorGrade);
        }

        @Nullable
        public final Double getAdBannerScreenRadio() {
            return this.adBannerScreenRadio;
        }

        @Nullable
        public final List<String> getNoDisplayMcc() {
            return this.noDisplayMcc;
        }

        @Nullable
        public final Integer getRegisteredDays() {
            return this.registeredDays;
        }

        @Nullable
        public final Long getSwitchTabCoolDownSecs() {
            return this.switchTabCoolDownSecs;
        }

        @Nullable
        public final Integer getTargetAnchorGrade() {
            return this.targetAnchorGrade;
        }

        @Nullable
        public final String getTargetGender() {
            return this.targetGender;
        }

        @Nullable
        public final Integer getTargetWealthLevelAlt() {
            return this.targetWealthLevelAlt;
        }

        public int hashCode() {
            Integer num = this.registeredDays;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<String> list = this.noDisplayMcc;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Long l2 = this.switchTabCoolDownSecs;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Double d = this.adBannerScreenRadio;
            int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.targetGender;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.targetWealthLevelAlt;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.targetAnchorGrade;
            return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TabBarBottomBannerRc(registeredDays=" + this.registeredDays + ", noDisplayMcc=" + this.noDisplayMcc + ", switchTabCoolDownSecs=" + this.switchTabCoolDownSecs + ", adBannerScreenRadio=" + this.adBannerScreenRadio + ", targetGender=" + this.targetGender + ", targetWealthLevelAlt=" + this.targetWealthLevelAlt + ", targetAnchorGrade=" + this.targetAnchorGrade + ")";
        }

        public TabBarBottomBannerRc(@Nullable Integer num, @Nullable List<String> list, @Nullable Long l2, @Nullable Double d, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3) {
            this.registeredDays = num;
            this.noDisplayMcc = list;
            this.switchTabCoolDownSecs = l2;
            this.adBannerScreenRadio = d;
            this.targetGender = str;
            this.targetWealthLevelAlt = num2;
            this.targetAnchorGrade = num3;
        }

        public TabBarBottomBannerRc() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }
}
