package p153l;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.QuickChatLoftConfig;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0003R\u001a\u0010(\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010+\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0014R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Ll/r3c0;", "", "<init>", "()V", "", "q", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "from", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "m", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "o", "", BLiveStormDanmakuGiftResourceType.f45292l, "()J", "", "k", "()I", "Ll/x20;", "startVoiceAction", "h", "(Lcom/p1/mobile/android/app/Act;Ll/x20;)Z", "purchaseFrom", "Ll/y20;", "callBackAction", "f", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;)V", "g", "r", "(Lcom/p1/mobile/android/app/Act;)Z", "p", "a", "J", RXScreenCaptureService.KEY_INDEX, "ANIM_DEFAULT_DURATION", "b", "j", "ANIM_DIFF_DURATION", "Lcom/p1/mobile/putong/core/data/QuickChatLoftConfig;", "c", "Lcom/p1/mobile/putong/core/data/QuickChatLoftConfig;", Constants.KEY_CONFIG, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r3c0 {

    @NotNull
    public static final r3c0 INSTANCE = new r3c0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final long ANIM_DEFAULT_DURATION = 300;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long ANIM_DIFF_DURATION = 200;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static QuickChatLoftConfig config;

    /* JADX INFO: renamed from: a */
    public static void m179583a(y20 y20Var) {
        a5i0.m96160p0().m96211Z0();
        y20Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public static void m179584b(x20 x20Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m179585c() {
    }

    /* JADX INFO: renamed from: d */
    public static void m179586d(y20 y20Var) {
        a5i0.m96160p0().m96208W0();
        y20Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static void m179587e() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m179588h(@NotNull Act act, @NotNull final x20 startVoiceAction) {
        act.getClass();
        startVoiceAction.getClass();
        if (PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
            return true;
        }
        PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.q3c0
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                r3c0.m179584b(startVoiceAction, z, permissionDeniedReason);
            }
        }).m81074i(act);
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m179589k() {
        if (config == null) {
            INSTANCE.m179599p();
            Unit unit = Unit.INSTANCE;
        }
        QuickChatLoftConfig quickChatLoftConfig = config;
        if (quickChatLoftConfig != null) {
            return quickChatLoftConfig.online_count_max;
        }
        return 20;
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final long m179590l() {
        if (config == null) {
            INSTANCE.m179599p();
            Unit unit = Unit.INSTANCE;
        }
        QuickChatLoftConfig quickChatLoftConfig = config;
        return ((long) (quickChatLoftConfig != null ? quickChatLoftConfig.online_poll_interval : 10)) * 1000;
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m179591m(@NotNull Act act, @NotNull String type) {
        act.getClass();
        type.getClass();
        Intent intent = new Intent(act, (Class<?>) QuickChatSearchingAct.class);
        intent.putExtra(Active.TYPE, type);
        act.startActivityWithCustomTransition(intent, new b4c0());
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m179592n(@NotNull Act act, @NotNull String type, @NotNull String from) {
        act.getClass();
        type.getClass();
        from.getClass();
        Intent intent = new Intent(act, (Class<?>) QuickChatLoftAct.class);
        intent.putExtra("start_type", type);
        intent.putExtra("from", from);
        act.startActivity(intent);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m179593o(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        CoreModule.m30934Q().mo68458nf(act, from);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m179594q() {
        return CoreModule.m30934Q().mo68422Rh();
    }

    /* JADX INFO: renamed from: f */
    public final void m179595f(@NotNull Act act, @NotNull String purchaseFrom, @NotNull final y20<Boolean> callBackAction) {
        act.getClass();
        purchaseFrom.getClass();
        callBackAction.getClass();
        if (C8772a.m51429b0() > 0) {
            callBackAction.call(Boolean.FALSE);
            return;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            gs50.INSTANCE.m132001a().m131993H(act, "use_up");
            return;
        }
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34568pr(act, purchaseFrom, Privilege.online_match_tickets);
            return;
        }
        if (a5i0.m96131c0() <= 0) {
            a5i0.m96173u1(act, purchaseFrom, null, null);
        } else if (a5i0.m96160p0().m96218g1()) {
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.o3c0
                @Override // p153l.x20
                public final void call() {
                    r3c0.m179586d(callBackAction);
                }
            }, new x20() { // from class: l.p3c0
                @Override // p153l.x20
                public final void call() {
                    r3c0.m179585c();
                }
            });
        } else {
            callBackAction.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m179596g(@NotNull Act act, @NotNull String purchaseFrom, @NotNull final y20<Boolean> callBackAction) {
        act.getClass();
        purchaseFrom.getClass();
        callBackAction.getClass();
        if (wyb0.INSTANCE.m208578l() > 0) {
            callBackAction.call(Boolean.FALSE);
            return;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            gs50.INSTANCE.m132001a().m131993H(act, "use_up");
            return;
        }
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34568pr(act, purchaseFrom, Privilege.online_match_tickets);
            return;
        }
        if (a5i0.m96129b0() <= 0) {
            a5i0.m96186z1(act, purchaseFrom, null, null);
        } else if (a5i0.m96160p0().m96222k1()) {
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.m3c0
                @Override // p153l.x20
                public final void call() {
                    r3c0.m179583a(callBackAction);
                }
            }, new x20() { // from class: l.n3c0
                @Override // p153l.x20
                public final void call() {
                    r3c0.m179587e();
                }
            });
        } else {
            callBackAction.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m179597i() {
        return ANIM_DEFAULT_DURATION;
    }

    /* JADX INFO: renamed from: j */
    public final long m179598j() {
        return ANIM_DIFF_DURATION;
    }

    /* JADX INFO: renamed from: p */
    public final void m179599p() {
        config = (QuickChatLoftConfig) RemoteConfig.m80481x().m80516v("quick_chat_second_floor_config", QuickChatLoftConfig.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m179600r(@NotNull Act act) {
        act.getClass();
        Settings settings = CoreModule.f18264c.f20381e0.m116593na().settings;
        if (!NullChecker.m82487b(settings) || !OnlineMatchManager.m51326z().m51363l0(settings)) {
            return false;
        }
        hl3.m135668K(act, settings);
        return true;
    }
}
