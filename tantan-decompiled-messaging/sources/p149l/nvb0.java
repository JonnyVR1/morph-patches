package p149l;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.QuickChatLoftConfig;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0003R\u001a\u0010(\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010+\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0014R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/nvb0;", "", "<init>", "()V", "", "q", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "from", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "m", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "o", "", BLiveStormDanmakuGiftResourceType.f44444l, "()J", "", "k", "()I", "Ll/d30;", "startVoiceAction", "h", "(Lcom/p1/mobile/android/app/Act;Ll/d30;)Z", "purchaseFrom", "Ll/e30;", "callBackAction", "f", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;)V", "g", "r", "(Lcom/p1/mobile/android/app/Act;)Z", "p", "a", "J", RXScreenCaptureService.KEY_INDEX, "ANIM_DEFAULT_DURATION", "b", "j", "ANIM_DIFF_DURATION", "Lcom/p1/mobile/putong/core/data/QuickChatLoftConfig;", "c", "Lcom/p1/mobile/putong/core/data/QuickChatLoftConfig;", Constants.KEY_CONFIG, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nvb0 {

    @NotNull
    public static final nvb0 INSTANCE = new nvb0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final long ANIM_DEFAULT_DURATION = 300;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long ANIM_DIFF_DURATION = 200;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static QuickChatLoftConfig config;

    /* JADX INFO: renamed from: a */
    public static void m161574a(e30 e30Var) {
        swh0.m186255p0().m186306Z0();
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public static void m161575b(d30 d30Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m161576c() {
    }

    /* JADX INFO: renamed from: d */
    public static void m161577d(e30 e30Var) {
        swh0.m186255p0().m186303W0();
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static void m161578e() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m161579h(@NotNull Act act, @NotNull final d30 startVoiceAction) {
        act.getClass();
        startVoiceAction.getClass();
        if (PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
            return true;
        }
        PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.mvb0
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                nvb0.m161575b(startVoiceAction, z, permissionDeniedReason);
            }
        }).m79891i(act);
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m161580k() {
        if (config == null) {
            INSTANCE.m161590p();
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
    public static final long m161581l() {
        if (config == null) {
            INSTANCE.m161590p();
            Unit unit = Unit.INSTANCE;
        }
        QuickChatLoftConfig quickChatLoftConfig = config;
        return ((long) (quickChatLoftConfig != null ? quickChatLoftConfig.online_poll_interval : 10)) * 1000;
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m161582m(@NotNull Act act, @NotNull String type) {
        act.getClass();
        type.getClass();
        Intent intent = new Intent(act, (Class<?>) QuickChatSearchingAct.class);
        intent.putExtra(Active.TYPE, type);
        act.startActivityWithCustomTransition(intent, new xvb0());
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m161583n(@NotNull Act act, @NotNull String type, @NotNull String from) {
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
    public static final void m161584o(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        CoreModule.m29936Q().mo67275nf(act, from);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m161585q() {
        return CoreModule.m29936Q().mo67239Rh();
    }

    /* JADX INFO: renamed from: f */
    public final void m161586f(@NotNull Act act, @NotNull String purchaseFrom, @NotNull final e30<Boolean> callBackAction) {
        act.getClass();
        purchaseFrom.getClass();
        callBackAction.getClass();
        if (C8609a.m50246b0() > 0) {
            callBackAction.call(Boolean.FALSE);
            return;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            ak50.INSTANCE.m97144a().m97136H(act, "use_up");
            return;
        }
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33565pr(act, purchaseFrom, Privilege.online_match_tickets);
            return;
        }
        if (swh0.m186226c0() <= 0) {
            swh0.m186268u1(act, purchaseFrom, null, null);
        } else if (swh0.m186255p0().m186313g1()) {
            swh0.m186180B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.kvb0
                @Override // p149l.d30
                public final void call() {
                    nvb0.m161577d(callBackAction);
                }
            }, new d30() { // from class: l.lvb0
                @Override // p149l.d30
                public final void call() {
                    nvb0.m161576c();
                }
            });
        } else {
            callBackAction.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m161587g(@NotNull Act act, @NotNull String purchaseFrom, @NotNull final e30<Boolean> callBackAction) {
        act.getClass();
        purchaseFrom.getClass();
        callBackAction.getClass();
        if (sqb0.INSTANCE.m185583l() > 0) {
            callBackAction.call(Boolean.FALSE);
            return;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            ak50.INSTANCE.m97144a().m97136H(act, "use_up");
            return;
        }
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33565pr(act, purchaseFrom, Privilege.online_match_tickets);
            return;
        }
        if (swh0.m186224b0() <= 0) {
            swh0.m186281z1(act, purchaseFrom, null, null);
        } else if (swh0.m186255p0().m186317k1()) {
            swh0.m186180B1(act, PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.ivb0
                @Override // p149l.d30
                public final void call() {
                    nvb0.m161574a(callBackAction);
                }
            }, new d30() { // from class: l.jvb0
                @Override // p149l.d30
                public final void call() {
                    nvb0.m161578e();
                }
            });
        } else {
            callBackAction.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m161588i() {
        return ANIM_DEFAULT_DURATION;
    }

    /* JADX INFO: renamed from: j */
    public final long m161589j() {
        return ANIM_DIFF_DURATION;
    }

    /* JADX INFO: renamed from: p */
    public final void m161590p() {
        config = (QuickChatLoftConfig) RemoteConfig.m79298x().m79333v("quick_chat_second_floor_config", QuickChatLoftConfig.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m161591r(@NotNull Act act) {
        act.getClass();
        Settings settings = CoreModule.f17545c.f19639e0.m169520na().settings;
        if (!NullChecker.m81304b(settings) || !OnlineMatchManager.m50143z().m50180l0(settings)) {
            return false;
        }
        ok3.m164812K(act, settings);
        return true;
    }
}
