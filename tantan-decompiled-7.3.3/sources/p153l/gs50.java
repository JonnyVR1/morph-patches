package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonArray;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.RecentConversation;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.OnlineMatchDlgView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R>\u00107\u001a,\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R0\u0010;\u001a\u001e\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, m88121d2 = {"Ll/gs50;", "Ll/g6e;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "", "Lcom/p1/mobile/putong/core/data/RecentConversation;", "recentConversations", "", "isAudio", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "quickChatProduce", "U", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "Ll/y20;", "action", "Ll/kcg0;", "N", "(Lcom/p1/mobile/android/app/Act;Ll/y20;)Ll/kcg0;", "H", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "I", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Z)V", "J", "L", "K", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "G", "Ll/g1e;", "g", "Ll/g1e;", "dialogBase", "h", "Ll/kcg0;", AuthenticationTokenClaims.JSON_KEY_SUB, "", RXScreenCaptureService.KEY_INDEX, "currentDay", "j", "Z", "isFemale", "Ll/byd0;", "k", "Ll/byd0;", "activeUnmatchTime", "Ll/a30;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/a30;", "onPositive", "Ll/z20;", "m", "Ll/z20;", "onNegative", "Ll/x20;", "n", "Ll/x20;", "onShow", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gs50 extends g6e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Object f106224o = new Object();

    /* JADX INFO: renamed from: p */
    @Nullable
    public static gs50 f106225p;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public g1e dialogBase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public kcg0 sub;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long currentDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean isFemale;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final byd0 activeUnmatchTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final a30<Act, String, OnlineMatchManager.QuickChatProduce> onPositive;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final z20<String, OnlineMatchManager.QuickChatProduce> onNegative;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final x20 onShow;

    public gs50() {
        this.currentDay = tzi0.m193665c(pzi0.m174454o());
        this.isFemale = CoreModule.f18264c.f20381e0.m116593na().isFemale();
        this.activeUnmatchTime = new byd0("active_unmatch_time_" + CoreModule.m30929H().userId(), 0L);
        this.onPositive = new a30() { // from class: l.kr50
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                gs50.m131959A(this.f128422a, (Act) obj, (String) obj2, (OnlineMatchManager.QuickChatProduce) obj3);
            }
        };
        this.onNegative = new z20() { // from class: l.vr50
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                gs50.m131975j((String) obj, (OnlineMatchManager.QuickChatProduce) obj2);
            }
        };
        this.onShow = new x20() { // from class: l.yr50
            @Override // p153l.x20
            public final void call() {
                gs50.m131988w();
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m131959A(gs50 gs50Var, final Act act, final String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        act.getClass();
        str.getClass();
        quickChatProduce.getClass();
        boolean z = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        boolean z2 = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickChat;
        boolean z3 = quickChatProduce == OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (z2) {
            OnlineMatchManager.m51326z().m51374v();
        }
        if (Intrinsics.m88377d("use_up", str) && !gs50Var.isFemale) {
            if (joa.m146386f4()) {
                C8927c.m54567D0(act, "p_message,quickchat_pop", Privilege.online_match_tickets, null, null, 0, null, null, null, null, false, false, 4088, null);
            } else {
                C8927c.m54668q1(act, null, C8772a.m51457p0(), "p_message,quickchat_pop", null, 16, null);
            }
            i4g0.m138520r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
            return;
        }
        if (Intrinsics.m88377d("overheat_protection", str) || Intrinsics.m88377d("use_up", str)) {
            return;
        }
        if (z3 && Intrinsics.m88377d("match_timeout", str)) {
            upm.m197143g0(act);
        } else if (z) {
            wyb0.m208486B0(wyb0.INSTANCE.m208572f(), act, false, false, null, 14, null);
        } else {
            OnlineMatchManager.m51326z().m51373u0(act, new y20() { // from class: l.bs50
                @Override // p153l.y20
                public final void call(Object obj) {
                    gs50.m131969R(act, str, ((Boolean) obj).booleanValue());
                }
            });
        }
        i4g0.m138520r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
    }

    /* JADX INFO: renamed from: M */
    public static final void m131965M(gs50 gs50Var, String str) {
        g1e g1eVar = gs50Var.dialogBase;
        if (g1eVar != null) {
            g1eVar.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ((jl80) g1eVar).m145979a0(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final gs50 m131966O() {
        return INSTANCE.m132001a();
    }

    /* JADX INFO: renamed from: P */
    public static final void m131967P() {
        CoreModule.f18264c.f20300D0.f20870S.m137019l(uxj0.f181467a);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.tr50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131968Q();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m131968Q() {
        OnlineMatchManager.m51326z().f33434A.m137019l("该配对已保存到这里");
        OnlineMatchManager.m51326z().f33458n.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: R */
    public static final void m131969R(Act act, final String str, boolean z) {
        if (!z) {
            OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("notify_normal_state", null));
            return;
        }
        Act act2 = (Act) Act.foreground_().f16062a.get();
        if (!NullChecker.m82486a(act2) || (act2 instanceof DropDownAct) || (act2 instanceof QuickChatSearchingAct)) {
            return;
        }
        if (act2 instanceof NewMainAct) {
            ((NewMainAct) act2).m40796R5(TabName.Msg);
        } else if (act2 instanceof QuickChatLoftAct) {
            r3c0.m179591m(act2, "text_quick_chat");
        } else {
            act.startActivity(NewMainAct.m40761q7(act));
        }
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.rr50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131970S(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S */
    public static final void m131970S(String str) {
        CoreModule.f18264c.f20300D0.f20870S.m137019l(uxj0.f181467a);
        if (!Intrinsics.m88377d("time_limited_match", str) || OnlineMatchManager.m51326z().f33457m.get().booleanValue()) {
            return;
        }
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.xr50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131971T();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: T */
    public static final void m131971T() {
        OnlineMatchManager.m51326z().f33434A.m137019l("该配对已保存到这里");
        OnlineMatchManager.m51326z().f33457m.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W */
    public static final void m131972W(gs50 gs50Var, OnlineMatchDlgView onlineMatchDlgView, String str) {
        if (gs50Var.dialogBase != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            onlineMatchDlgView.setTitle(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m131973h(gs50 gs50Var, l4g0 l4g0Var, DialogInterface dialogInterface) {
        bsj0.m106263U(gs50Var.sub);
        gs50Var.sub = null;
        l4g0Var.m152776k();
        gs50Var.dialogBase = null;
    }

    /* JADX INFO: renamed from: j */
    public static void m131975j(String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        str.getClass();
        quickChatProduce.getClass();
        if (quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat || !Intrinsics.m88377d("time_limited_match", str) || OnlineMatchManager.m51326z().f33458n.get().booleanValue()) {
            return;
        }
        Act act = (Act) Act.foreground_().f16062a.get();
        if (!NullChecker.m82486a(act) || (act instanceof DropDownAct) || (act instanceof QuickChatSearchingAct) || (act instanceof QuickChatLoftAct)) {
            return;
        }
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40796R5(TabName.Msg);
        } else {
            act.getClass();
            act.startActivity(NewMainAct.m40761q7(act));
        }
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.mr50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131967P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static void m131976k(gs50 gs50Var, l4g0 l4g0Var, DialogInterface dialogInterface) {
        bsj0.m106263U(gs50Var.sub);
        gs50Var.sub = null;
        gs50Var.dialogBase = null;
        l4g0Var.m152776k();
    }

    /* JADX INFO: renamed from: m */
    public static void m131978m(gs50 gs50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        gs50Var.onPositive.mo37058a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: n */
    public static void m131979n(Throwable th) {
        o1j0.m165636j("系统加载中，稍安勿躁哦");
    }

    /* JADX INFO: renamed from: p */
    public static void m131981p(gs50 gs50Var) {
        gs50Var.m131992G();
    }

    /* JADX INFO: renamed from: q */
    public static void m131982q(gs50 gs50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        gs50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: s */
    public static void m131984s(gs50 gs50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        gs50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: t */
    public static void m131985t(final gs50 gs50Var, l4g0 l4g0Var, String str, Act act, DialogInterface dialogInterface) {
        gs50Var.onShow.call();
        l4g0Var.m152777l();
        if (Intrinsics.m88377d("use_up", str)) {
            gs50Var.sub = gs50Var.m131998N(act, new y20() { // from class: l.ur50
                @Override // p153l.y20
                public final void call(Object obj) {
                    gs50.m131965M(this.f180571a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m131986u(final gs50 gs50Var, l4g0 l4g0Var, String str, Act act, final OnlineMatchDlgView onlineMatchDlgView, DialogInterface dialogInterface) {
        gs50Var.onShow.call();
        l4g0Var.m152777l();
        if (Intrinsics.m88377d("use_up", str)) {
            gs50Var.sub = gs50Var.m131998N(act, new y20() { // from class: l.sr50
                @Override // p153l.y20
                public final void call(Object obj) {
                    gs50.m131972W(this.f170307a, onlineMatchDlgView, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m131987v(gs50 gs50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        gs50Var.onPositive.mo37058a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: w */
    public static void m131988w() {
        C4907v.f20865a0.m137019l(C4907v.f20866b0);
    }

    /* JADX INFO: renamed from: x */
    public static void m131989x(gs50 gs50Var, Act act, String str, boolean z, List list) {
        list.getClass();
        if (jyb.m147479J(list)) {
            gs50Var.m131997L(act, str, z);
        } else {
            gs50Var.m132000V(act, str, list, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m131991z(gs50 gs50Var, y20 y20Var, Long l2) {
        String strM193664b;
        if (gs50Var.currentDay == tzi0.m193665c(pzi0.m174454o())) {
            strM193664b = tzi0.m193664b(tzi0.m193665c(pzi0.m174454o() + 86400000) - pzi0.m174454o());
            strM193664b.getClass();
        } else {
            CoreModule.f18264c.f20297C0.m146425v4();
            strM193664b = "00:00:00";
        }
        y20Var.call(strM193664b);
    }

    /* JADX INFO: renamed from: G */
    public final void m131992G() {
        if (NullChecker.m82486a(this.dialogBase)) {
            g1e g1eVar = this.dialogBase;
            g1eVar.getClass();
            if (g1eVar.isShowing()) {
                g1e g1eVar2 = this.dialogBase;
                g1eVar2.getClass();
                g1eVar2.dismiss();
                this.dialogBase = null;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m131993H(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m131994I(act, from, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m131994I(@NotNull final Act act, @NotNull final String from, final boolean isAudio) {
        act.getClass();
        from.getClass();
        if (Intrinsics.m88377d("active_unmatch", from)) {
            long jM174454o = pzi0.m174454o();
            Long l2 = this.activeUnmatchTime.get();
            l2.getClass();
            if (jM174454o - l2.longValue() < AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
                return;
            } else {
                this.activeUnmatchTime.put(Long.valueOf(pzi0.m174454o()));
            }
        }
        if (CoreModule.f18264c.f20384f0.m34003jf() < 0) {
            m131997L(act, from, isAudio);
        } else {
            CoreModule.f18264c.f20300D0.m35834G4().subscribe(psd0.m173597H(new y20() { // from class: l.zr50
                @Override // p153l.y20
                public final void call(Object obj) {
                    gs50.m131989x(this.f205735a, act, from, isAudio, (List) obj);
                }
            }, new y20() { // from class: l.as50
                @Override // p153l.y20
                public final void call(Object obj) {
                    gs50.m131979n((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m131995J(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m131997L(act, from, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0125  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x015c  */
    /* JADX INFO: renamed from: K */
    public final void m131996K(@NotNull final Act act, @NotNull final String from, @NotNull final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        OnlineMatchManager.QuickChatProduce quickChatProduce2;
        String str;
        int i;
        jl80.C17971a c17971aM146045n0;
        act.getClass();
        from.getClass();
        quickChatProduce.getClass();
        String string = act.getString(R$string.f18648Ll);
        string.getClass();
        String string2 = act.getString(R$string.f18738Ol);
        string2.getClass();
        String string3 = act.getString(R$string.f18768Pl);
        string3.getClass();
        String string4 = act.getString(R$string.f19445m);
        string4.getClass();
        if (!Intrinsics.m88377d("active_unmatch", from)) {
            if (!Intrinsics.m88377d("passive_unmatch", from)) {
                if (!Intrinsics.m88377d("overheat_protection", from)) {
                    if (Intrinsics.m88377d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{tzi0.m193664b(tzi0.m193665c(pzi0.m174454o() + 86400000) - pzi0.m174454o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
                        pf60 pf60VarM172085a = pf60.m172085a("where_page_from", from);
                        pf60 pf60VarM172085a2 = pf60.m172085a("how_many_people", "0");
                        pf60 pf60VarM172085a3 = pf60.m172085a("how_many_quickchat_people", "0");
                        pf60 pf60VarM172085a4 = pf60.m172085a("tooltips_trigger_mode", "passive");
                        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                        if (quickChatProduce == quickChatProduce2) {
                            str = "funchat";
                        } else {
                            str = "quickchat";
                        }
                        l4g0VarM204399c.m152781p(pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3, pf60VarM172085a4, pf60.m172085a("chat_type", str), pf60.m172085a("user_id_list", new JsonArray()));
                        bsj0.m106263U(this.sub);
                        this.sub = null;
                        jl80.C17971a c17971aNewDialog = act.newDialog();
                        if (quickChatProduce == quickChatProduce2) {
                            i = dbc0.f86387Mq;
                        } else {
                            i = dbc0.f87254nj;
                        }
                        c17971aM146045n0 = c17971aNewDialog.m146024S(i).m146056y0(string).m146051t0(string2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.nr50
                            @Override // java.lang.Runnable
                            public final void run() {
                                gs50.m131987v(this.f143374a, act, from, quickChatProduce);
                            }
                        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.or50
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                gs50.m131985t(this.f148673a, l4g0VarM204399c, from, act, dialogInterface);
                            }
                        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.pr50
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                gs50.m131973h(this.f153726a, l4g0VarM204399c, dialogInterface);
                            }
                        });
                        if (!Intrinsics.m88377d("overheat_protection", from) && (!Intrinsics.m88377d("use_up", from) || !this.isFemale)) {
                            c17971aM146045n0.m146035d0(dbc0.f87188lj);
                            c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.qr50
                                @Override // java.lang.Runnable
                                public final void run() {
                                    gs50.m131982q(this.f159065a, from, quickChatProduce);
                                }
                            });
                        }
                        this.dialogBase = c17971aM146045n0.m146049r0();
                    }
                    if (Intrinsics.m88377d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    } else if (Intrinsics.m88377d("time_limited_match", from)) {
                        string = "配对已自动解除";
                        string2 = "到限时解锁时间了，已自动解除该配对";
                    }
                    final l4g0 l4g0VarM204399c2 = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
                    pf60 pf60VarM172085a5 = pf60.m172085a("where_page_from", from);
                    pf60 pf60VarM172085a6 = pf60.m172085a("how_many_people", "0");
                    pf60 pf60VarM172085a7 = pf60.m172085a("how_many_quickchat_people", "0");
                    pf60 pf60VarM172085a8 = pf60.m172085a("tooltips_trigger_mode", "passive");
                    quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                    if (quickChatProduce == quickChatProduce2) {
                        str = "funchat";
                    } else {
                        str = "quickchat";
                    }
                    l4g0VarM204399c2.m152781p(pf60VarM172085a5, pf60VarM172085a6, pf60VarM172085a7, pf60VarM172085a8, pf60.m172085a("chat_type", str), pf60.m172085a("user_id_list", new JsonArray()));
                    bsj0.m106263U(this.sub);
                    this.sub = null;
                    jl80.C17971a c17971aNewDialog2 = act.newDialog();
                    if (quickChatProduce == quickChatProduce2) {
                        i = dbc0.f86387Mq;
                    } else {
                        i = dbc0.f87254nj;
                    }
                    c17971aM146045n0 = c17971aNewDialog2.m146024S(i).m146056y0(string).m146051t0(string2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.nr50
                        @Override // java.lang.Runnable
                        public final void run() {
                            gs50.m131987v(this.f143374a, act, from, quickChatProduce);
                        }
                    }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.or50
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            gs50.m131985t(this.f148673a, l4g0VarM204399c2, from, act, dialogInterface);
                        }
                    }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.pr50
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            gs50.m131973h(this.f153726a, l4g0VarM204399c2, dialogInterface);
                        }
                    });
                    if (!Intrinsics.m88377d("overheat_protection", from)) {
                        c17971aM146045n0.m146035d0(dbc0.f87188lj);
                        c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.qr50
                            @Override // java.lang.Runnable
                            public final void run() {
                                gs50.m131982q(this.f159065a, from, quickChatProduce);
                            }
                        });
                    }
                    this.dialogBase = c17971aM146045n0.m146049r0();
                }
                string = "匹配频繁，稍后再试";
                string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
                string3 = "我知道了";
                final l4g0 l4g0VarM204399c3 = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
                pf60 pf60VarM172085a9 = pf60.m172085a("where_page_from", from);
                pf60 pf60VarM172085a10 = pf60.m172085a("how_many_people", "0");
                pf60 pf60VarM172085a11 = pf60.m172085a("how_many_quickchat_people", "0");
                pf60 pf60VarM172085a12 = pf60.m172085a("tooltips_trigger_mode", "passive");
                quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                if (quickChatProduce == quickChatProduce2) {
                    str = "funchat";
                } else {
                    str = "quickchat";
                }
                l4g0VarM204399c3.m152781p(pf60VarM172085a9, pf60VarM172085a10, pf60VarM172085a11, pf60VarM172085a12, pf60.m172085a("chat_type", str), pf60.m172085a("user_id_list", new JsonArray()));
                bsj0.m106263U(this.sub);
                this.sub = null;
                jl80.C17971a c17971aNewDialog3 = act.newDialog();
                if (quickChatProduce == quickChatProduce2) {
                    i = dbc0.f86387Mq;
                } else {
                    i = dbc0.f87254nj;
                }
                c17971aM146045n0 = c17971aNewDialog3.m146024S(i).m146056y0(string).m146051t0(string2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.nr50
                    @Override // java.lang.Runnable
                    public final void run() {
                        gs50.m131987v(this.f143374a, act, from, quickChatProduce);
                    }
                }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.or50
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        gs50.m131985t(this.f148673a, l4g0VarM204399c3, from, act, dialogInterface);
                    }
                }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.pr50
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        gs50.m131973h(this.f153726a, l4g0VarM204399c3, dialogInterface);
                    }
                });
                if (!Intrinsics.m88377d("overheat_protection", from)) {
                    c17971aM146045n0.m146035d0(dbc0.f87188lj);
                    c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.qr50
                        @Override // java.lang.Runnable
                        public final void run() {
                            gs50.m131982q(this.f159065a, from, quickChatProduce);
                        }
                    });
                }
                this.dialogBase = c17971aM146045n0.m146049r0();
            }
            string2 = this.isFemale ? "拜拜就拜拜，下个更合拍" : "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
            string = "对方已退出闪聊";
            string3 = "开启闪聊新配对";
            string4 = "知道了";
            final l4g0 l4g0VarM204399c4 = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
            pf60 pf60VarM172085a13 = pf60.m172085a("where_page_from", from);
            pf60 pf60VarM172085a14 = pf60.m172085a("how_many_people", "0");
            pf60 pf60VarM172085a15 = pf60.m172085a("how_many_quickchat_people", "0");
            pf60 pf60VarM172085a16 = pf60.m172085a("tooltips_trigger_mode", "passive");
            quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (quickChatProduce == quickChatProduce2) {
                str = "funchat";
            } else {
                str = "quickchat";
            }
            l4g0VarM204399c4.m152781p(pf60VarM172085a13, pf60VarM172085a14, pf60VarM172085a15, pf60VarM172085a16, pf60.m172085a("chat_type", str), pf60.m172085a("user_id_list", new JsonArray()));
            bsj0.m106263U(this.sub);
            this.sub = null;
            jl80.C17971a c17971aNewDialog4 = act.newDialog();
            if (quickChatProduce == quickChatProduce2) {
                i = dbc0.f86387Mq;
            } else {
                i = dbc0.f87254nj;
            }
            c17971aM146045n0 = c17971aNewDialog4.m146024S(i).m146056y0(string).m146051t0(string2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.nr50
                @Override // java.lang.Runnable
                public final void run() {
                    gs50.m131987v(this.f143374a, act, from, quickChatProduce);
                }
            }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.or50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    gs50.m131985t(this.f148673a, l4g0VarM204399c4, from, act, dialogInterface);
                }
            }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.pr50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gs50.m131973h(this.f153726a, l4g0VarM204399c4, dialogInterface);
                }
            });
            if (!Intrinsics.m88377d("overheat_protection", from)) {
                c17971aM146045n0.m146035d0(dbc0.f87188lj);
                c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.qr50
                    @Override // java.lang.Runnable
                    public final void run() {
                        gs50.m131982q(this.f159065a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = c17971aM146045n0.m146049r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
        final l4g0 l4g0VarM204399c5 = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
        pf60 pf60VarM172085a17 = pf60.m172085a("where_page_from", from);
        pf60 pf60VarM172085a18 = pf60.m172085a("how_many_people", "0");
        pf60 pf60VarM172085a19 = pf60.m172085a("how_many_quickchat_people", "0");
        pf60 pf60VarM172085a110 = pf60.m172085a("tooltips_trigger_mode", "passive");
        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (quickChatProduce == quickChatProduce2) {
            str = "funchat";
        } else {
            str = "quickchat";
        }
        l4g0VarM204399c5.m152781p(pf60VarM172085a17, pf60VarM172085a18, pf60VarM172085a19, pf60VarM172085a110, pf60.m172085a("chat_type", str), pf60.m172085a("user_id_list", new JsonArray()));
        bsj0.m106263U(this.sub);
        this.sub = null;
        jl80.C17971a c17971aNewDialog5 = act.newDialog();
        if (quickChatProduce == quickChatProduce2) {
            i = dbc0.f86387Mq;
        } else {
            i = dbc0.f87254nj;
        }
        c17971aM146045n0 = c17971aNewDialog5.m146024S(i).m146056y0(string).m146051t0(string2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.nr50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131987v(this.f143374a, act, from, quickChatProduce);
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.or50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gs50.m131985t(this.f148673a, l4g0VarM204399c5, from, act, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.pr50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gs50.m131973h(this.f153726a, l4g0VarM204399c5, dialogInterface);
            }
        });
        if (!Intrinsics.m88377d("overheat_protection", from)) {
            c17971aM146045n0.m146035d0(dbc0.f87188lj);
            c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.qr50
                @Override // java.lang.Runnable
                public final void run() {
                    gs50.m131982q(this.f159065a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = c17971aM146045n0.m146049r0();
    }

    /* JADX INFO: renamed from: L */
    public final void m131997L(@NotNull Act act, @NotNull String from, boolean isAudio) {
        act.getClass();
        from.getClass();
        m131996K(act, from, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: N */
    public final kcg0 m131998N(Act act, final y20<String> action) {
        kcg0 kcg0VarSubscribe = act.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wr50
            @Override // p153l.y20
            public final void call(Object obj) {
                gs50.m131991z(this.f190483a, action, (Long) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        return kcg0VarSubscribe;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    public final void m131999U(final Act act, final String from, List<? extends RecentConversation> recentConversations, final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        JsonArray jsonArray;
        Iterator<? extends RecentConversation> it;
        int i;
        jl80.C17971a c17971aM146045n0;
        RecentConversation next;
        Iterator<? extends RecentConversation> it2;
        User userM116503Pa;
        String string = act.getString(R$string.f18648Ll);
        string.getClass();
        String string2 = act.getString(R$string.f18738Ol);
        string2.getClass();
        String string3 = act.getString(R$string.f18768Pl);
        string3.getClass();
        String string4 = act.getString(R$string.f19445m);
        string4.getClass();
        if (!Intrinsics.m88377d("active_unmatch", from)) {
            if (Intrinsics.m88377d("passive_unmatch", from)) {
                string = "对方已退出闪聊";
            } else {
                if (Intrinsics.m88377d("overheat_protection", from)) {
                    string = "匹配频繁，稍后再试";
                } else {
                    if (Intrinsics.m88377d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{tzi0.m193664b(tzi0.m193665c(pzi0.m174454o() + 86400000) - pzi0.m174454o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        string2 = "最近活跃好友，快去聊聊吧";
                    } else if (Intrinsics.m88377d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    }
                    string4 = "知道了";
                    string2 = "最近活跃好友，快去聊聊吧";
                }
                string3 = "我知道了";
                string2 = "最近活跃好友，快去聊聊吧";
            }
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
            jsonArray = new JsonArray();
            it = recentConversations.iterator();
            i = 0;
            while (it.hasNext()) {
                next = it.next();
                dkb dkbVar = CoreModule.f18264c.f20381e0;
                next.getClass();
                it2 = it;
                userM116503Pa = dkbVar.m116503Pa(next.otherUserID);
                if (userM116503Pa == null) {
                    m131995J(act, from);
                    return;
                }
                if (userM116503Pa.onlineMatch()) {
                    i++;
                }
                jsonArray.add(next.otherUserID);
                it = it2;
            }
            l4g0VarM204399c.m152781p(pf60.m172085a("where_page_from", from), pf60.m172085a("how_many_people", Integer.valueOf(recentConversations.size())), pf60.m172085a("how_many_quickchat_people", Integer.valueOf(i)), pf60.m172085a("user_id_list", jsonArray));
            View viewInflate = View.inflate(act, kec0.f125959n2, null);
            viewInflate.getClass();
            final OnlineMatchDlgView onlineMatchDlgView = (OnlineMatchDlgView) viewInflate;
            onlineMatchDlgView.m46457W(string, string2, recentConversations, new x20() { // from class: l.cs50
                @Override // p153l.x20
                public final void call() {
                    gs50.m131981p(this.f83417a);
                }
            });
            bsj0.m106263U(this.sub);
            this.sub = null;
            c17971aM146045n0 = act.newDialog().m146023R(onlineMatchDlgView).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.ds50
                @Override // java.lang.Runnable
                public final void run() {
                    gs50.m131978m(this.f90458a, act, from, quickChatProduce);
                }
            }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.es50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    gs50.m131986u(this.f95566a, l4g0VarM204399c, from, act, onlineMatchDlgView, dialogInterface);
                }
            }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.fs50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gs50.m131976k(this.f100547a, l4g0VarM204399c, dialogInterface);
                }
            });
            if (!Intrinsics.m88377d("overheat_protection", from) && (!Intrinsics.m88377d("use_up", from) || !this.isFemale)) {
                c17971aM146045n0.m146035d0(dbc0.f87188lj);
                c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.lr50
                    @Override // java.lang.Runnable
                    public final void run() {
                        gs50.m131984s(this.f133291a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = c17971aM146045n0.m146049r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "最近活跃好友，快去聊聊吧";
        final l4g0 l4g0VarM204399c2 = w1e.m204399c("p_quickchat_again_popup", OMSTemplateType.dialog);
        jsonArray = new JsonArray();
        it = recentConversations.iterator();
        i = 0;
        while (it.hasNext()) {
            next = it.next();
            dkb dkbVar2 = CoreModule.f18264c.f20381e0;
            next.getClass();
            it2 = it;
            userM116503Pa = dkbVar2.m116503Pa(next.otherUserID);
            if (userM116503Pa == null) {
                m131995J(act, from);
                return;
            }
            if (userM116503Pa.onlineMatch()) {
                i++;
            }
            jsonArray.add(next.otherUserID);
            it = it2;
        }
        l4g0VarM204399c2.m152781p(pf60.m172085a("where_page_from", from), pf60.m172085a("how_many_people", Integer.valueOf(recentConversations.size())), pf60.m172085a("how_many_quickchat_people", Integer.valueOf(i)), pf60.m172085a("user_id_list", jsonArray));
        View viewInflate2 = View.inflate(act, kec0.f125959n2, null);
        viewInflate2.getClass();
        final OnlineMatchDlgView onlineMatchDlgView2 = (OnlineMatchDlgView) viewInflate2;
        onlineMatchDlgView2.m46457W(string, string2, recentConversations, new x20() { // from class: l.cs50
            @Override // p153l.x20
            public final void call() {
                gs50.m131981p(this.f83417a);
            }
        });
        bsj0.m106263U(this.sub);
        this.sub = null;
        c17971aM146045n0 = act.newDialog().m146023R(onlineMatchDlgView2).m146021P(false).m146034c0(string3, new Runnable() { // from class: l.ds50
            @Override // java.lang.Runnable
            public final void run() {
                gs50.m131978m(this.f90458a, act, from, quickChatProduce);
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.es50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gs50.m131986u(this.f95566a, l4g0VarM204399c2, from, act, onlineMatchDlgView2, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.fs50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gs50.m131976k(this.f100547a, l4g0VarM204399c2, dialogInterface);
            }
        });
        if (!Intrinsics.m88377d("overheat_protection", from)) {
            c17971aM146045n0.m146035d0(dbc0.f87188lj);
            c17971aM146045n0.m146029X(string4, new Runnable() { // from class: l.lr50
                @Override // java.lang.Runnable
                public final void run() {
                    gs50.m131984s(this.f133291a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = c17971aM146045n0.m146049r0();
    }

    /* JADX INFO: renamed from: V */
    public final void m132000V(Act act, String from, List<? extends RecentConversation> recentConversations, boolean isAudio) {
        m131999U(act, from, recentConversations, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: l.gs50$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/gs50$a;", "", "<init>", "()V", "Ll/gs50;", "a", "()Ll/gs50;", "", "INITI_TERM", "Ljava/lang/String;", "PASSI_TERM", "OVER_HEATING", "NO_TIME", "SEARCH_TIMEOUT", "TIME_LIMIT", "LOCK", "Ljava/lang/Object;", "instance", "Ll/gs50;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final gs50 m132001a() {
            if (gs50.f106225p == null) {
                synchronized (gs50.f106224o) {
                    try {
                        if (gs50.f106225p == null) {
                            gs50.f106225p = new gs50(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            gs50 gs50Var = gs50.f106225p;
            gs50Var.getClass();
            return gs50Var;
        }

        public Companion() {
        }
    }

    public /* synthetic */ gs50(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
