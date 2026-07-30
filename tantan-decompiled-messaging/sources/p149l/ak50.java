package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonArray;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.RecentConversation;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.OnlineMatchDlgView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R>\u00107\u001a,\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R0\u0010;\u001a\u001e\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, m87232d2 = {"Ll/ak50;", "Ll/s4e;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "", "Lcom/p1/mobile/putong/core/data/RecentConversation;", "recentConversations", "", "isAudio", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "quickChatProduce", "U", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "Ll/e30;", "action", "Ll/c4g0;", "N", "(Lcom/p1/mobile/android/app/Act;Ll/e30;)Ll/c4g0;", "H", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "I", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Z)V", "J", "L", "K", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "G", "Ll/szd;", "g", "Ll/szd;", "dialogBase", "h", "Ll/c4g0;", AuthenticationTokenClaims.JSON_KEY_SUB, "", RXScreenCaptureService.KEY_INDEX, "currentDay", "j", "Z", "isFemale", "Ll/zpd0;", "k", "Ll/zpd0;", "activeUnmatchTime", "Ll/g30;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/g30;", "onPositive", "Ll/f30;", "m", "Ll/f30;", "onNegative", "Ll/d30;", "n", "Ll/d30;", "onShow", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ak50 extends s4e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Object f70239o = new Object();

    /* JADX INFO: renamed from: p */
    @Nullable
    public static ak50 f70240p;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public szd dialogBase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public c4g0 sub;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long currentDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean isFemale;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final zpd0 activeUnmatchTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final g30<Act, String, OnlineMatchManager.QuickChatProduce> onPositive;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final f30<String, OnlineMatchManager.QuickChatProduce> onNegative;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final d30 onShow;

    public ak50() {
        this.currentDay = qqi0.m175935c(mqi0.m155944o());
        this.isFemale = CoreModule.f17545c.f19639e0.m169520na().isFemale();
        this.activeUnmatchTime = new zpd0("active_unmatch_time_" + CoreModule.m29931H().userId(), 0L);
        this.onPositive = new g30() { // from class: l.ej50
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                ak50.m97102A(this.f91665a, (Act) obj, (String) obj2, (OnlineMatchManager.QuickChatProduce) obj3);
            }
        };
        this.onNegative = new f30() { // from class: l.pj50
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                ak50.m97118j((String) obj, (OnlineMatchManager.QuickChatProduce) obj2);
            }
        };
        this.onShow = new d30() { // from class: l.sj50
            @Override // p149l.d30
            public final void call() {
                ak50.m97131w();
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m97102A(ak50 ak50Var, final Act act, final String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        act.getClass();
        str.getClass();
        quickChatProduce.getClass();
        boolean z = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        boolean z2 = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickChat;
        boolean z3 = quickChatProduce == OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (z2) {
            OnlineMatchManager.m50143z().m50191v();
        }
        if (Intrinsics.m87488d("use_up", str) && !ak50Var.isFemale) {
            if (xma.m210071e4()) {
                C8764c.m53384D0(act, "p_message,quickchat_pop", Privilege.online_match_tickets, null, null, 0, null, null, null, null, false, false, 4088, null);
            } else {
                C8764c.m53485q1(act, null, C8609a.m50274p0(), "p_message,quickchat_pop", null, 16, null);
            }
            zvf0.m220396r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
            return;
        }
        if (Intrinsics.m87488d("overheat_protection", str) || Intrinsics.m87488d("use_up", str)) {
            return;
        }
        if (z3 && Intrinsics.m87488d("match_timeout", str)) {
            snm.m185109g0(act);
        } else if (z) {
            sqb0.m185491B0(sqb0.INSTANCE.m185577f(), act, false, false, null, 14, null);
        } else {
            OnlineMatchManager.m50143z().m50190u0(act, new e30() { // from class: l.vj50
                @Override // p149l.e30
                public final void call(Object obj) {
                    ak50.m97112R(act, str, ((Boolean) obj).booleanValue());
                }
            });
        }
        zvf0.m220396r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
    }

    /* JADX INFO: renamed from: M */
    public static final void m97108M(ak50 ak50Var, String str) {
        szd szdVar = ak50Var.dialogBase;
        if (szdVar != null) {
            szdVar.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ((dd80) szdVar).m110919a0(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final ak50 m97109O() {
        return INSTANCE.m97144a();
    }

    /* JADX INFO: renamed from: P */
    public static final void m97110P() {
        CoreModule.f17545c.f19558D0.f20128S.m132487l(roj0.f160388a);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.nj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97111Q();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m97111Q() {
        OnlineMatchManager.m50143z().f32586A.m132487l("该配对已保存到这里");
        OnlineMatchManager.m50143z().f32610n.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: R */
    public static final void m97112R(Act act, final String str, boolean z) {
        if (!z) {
            OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("notify_normal_state", null));
            return;
        }
        Act act2 = (Act) Act.foreground_().f15343a.get();
        if (!NullChecker.m81303a(act2) || (act2 instanceof DropDownAct) || (act2 instanceof QuickChatSearchingAct)) {
            return;
        }
        if (act2 instanceof NewMainAct) {
            ((NewMainAct) act2).m39786N5(TabName.Msg);
        } else if (act2 instanceof QuickChatLoftAct) {
            nvb0.m161582m(act2, "text_quick_chat");
        } else {
            act.startActivity(NewMainAct.m39740k7(act));
        }
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.lj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97113S(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S */
    public static final void m97113S(String str) {
        CoreModule.f17545c.f19558D0.f20128S.m132487l(roj0.f160388a);
        if (!Intrinsics.m87488d("time_limited_match", str) || OnlineMatchManager.m50143z().f32609m.get().booleanValue()) {
            return;
        }
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.rj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97114T();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: T */
    public static final void m97114T() {
        OnlineMatchManager.m50143z().f32586A.m132487l("该配对已保存到这里");
        OnlineMatchManager.m50143z().f32609m.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W */
    public static final void m97115W(ak50 ak50Var, OnlineMatchDlgView onlineMatchDlgView, String str) {
        if (ak50Var.dialogBase != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            onlineMatchDlgView.setTitle(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m97116h(ak50 ak50Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        yij0.m214943U(ak50Var.sub);
        ak50Var.sub = null;
        cwf0Var.m109035k();
        ak50Var.dialogBase = null;
    }

    /* JADX INFO: renamed from: j */
    public static void m97118j(String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        str.getClass();
        quickChatProduce.getClass();
        if (quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat || !Intrinsics.m87488d("time_limited_match", str) || OnlineMatchManager.m50143z().f32610n.get().booleanValue()) {
            return;
        }
        Act act = (Act) Act.foreground_().f15343a.get();
        if (!NullChecker.m81303a(act) || (act instanceof DropDownAct) || (act instanceof QuickChatSearchingAct) || (act instanceof QuickChatLoftAct)) {
            return;
        }
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39786N5(TabName.Msg);
        } else {
            act.getClass();
            act.startActivity(NewMainAct.m39740k7(act));
        }
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.gj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97110P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static void m97119k(ak50 ak50Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        yij0.m214943U(ak50Var.sub);
        ak50Var.sub = null;
        ak50Var.dialogBase = null;
        cwf0Var.m109035k();
    }

    /* JADX INFO: renamed from: m */
    public static void m97121m(ak50 ak50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onPositive.mo36055a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: n */
    public static void m97122n(Throwable th) {
        lsi0.m151580j("系统加载中，稍安勿躁哦");
    }

    /* JADX INFO: renamed from: p */
    public static void m97124p(ak50 ak50Var) {
        ak50Var.m97135G();
    }

    /* JADX INFO: renamed from: q */
    public static void m97125q(ak50 ak50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: s */
    public static void m97127s(ak50 ak50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: t */
    public static void m97128t(final ak50 ak50Var, cwf0 cwf0Var, String str, Act act, DialogInterface dialogInterface) {
        ak50Var.onShow.call();
        cwf0Var.m109036l();
        if (Intrinsics.m87488d("use_up", str)) {
            ak50Var.sub = ak50Var.m97141N(act, new e30() { // from class: l.oj50
                @Override // p149l.e30
                public final void call(Object obj) {
                    ak50.m97108M(this.f144250a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m97129u(final ak50 ak50Var, cwf0 cwf0Var, String str, Act act, final OnlineMatchDlgView onlineMatchDlgView, DialogInterface dialogInterface) {
        ak50Var.onShow.call();
        cwf0Var.m109036l();
        if (Intrinsics.m87488d("use_up", str)) {
            ak50Var.sub = ak50Var.m97141N(act, new e30() { // from class: l.mj50
                @Override // p149l.e30
                public final void call(Object obj) {
                    ak50.m97115W(this.f134103a, onlineMatchDlgView, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m97130v(ak50 ak50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onPositive.mo36055a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: w */
    public static void m97131w() {
        C4756v.f20123a0.m132487l(C4756v.f20124b0);
    }

    /* JADX INFO: renamed from: x */
    public static void m97132x(ak50 ak50Var, Act act, String str, boolean z, List list) {
        list.getClass();
        if (vwb.m200296J(list)) {
            ak50Var.m97140L(act, str, z);
        } else {
            ak50Var.m97143V(act, str, list, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m97134z(ak50 ak50Var, e30 e30Var, Long l2) {
        String strM175934b;
        if (ak50Var.currentDay == qqi0.m175935c(mqi0.m155944o())) {
            strM175934b = qqi0.m175934b(qqi0.m175935c(mqi0.m155944o() + 86400000) - mqi0.m155944o());
            strM175934b.getClass();
        } else {
            CoreModule.f17545c.f19555C0.m210112u4();
            strM175934b = "00:00:00";
        }
        e30Var.call(strM175934b);
    }

    /* JADX INFO: renamed from: G */
    public final void m97135G() {
        if (NullChecker.m81303a(this.dialogBase)) {
            szd szdVar = this.dialogBase;
            szdVar.getClass();
            if (szdVar.isShowing()) {
                szd szdVar2 = this.dialogBase;
                szdVar2.getClass();
                szdVar2.dismiss();
                this.dialogBase = null;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m97136H(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m97137I(act, from, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m97137I(@NotNull final Act act, @NotNull final String from, final boolean isAudio) {
        act.getClass();
        from.getClass();
        if (Intrinsics.m87488d("active_unmatch", from)) {
            long jM155944o = mqi0.m155944o();
            Long l2 = this.activeUnmatchTime.get();
            l2.getClass();
            if (jM155944o - l2.longValue() < AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
                return;
            } else {
                this.activeUnmatchTime.put(Long.valueOf(mqi0.m155944o()));
            }
        }
        if (CoreModule.f17545c.f19642f0.m33000jf() < 0) {
            m97140L(act, from, isAudio);
        } else {
            CoreModule.f17545c.f19558D0.m34831G4().subscribe(mkd0.m154956H(new e30() { // from class: l.tj50
                @Override // p149l.e30
                public final void call(Object obj) {
                    ak50.m97132x(this.f170649a, act, from, isAudio, (List) obj);
                }
            }, new e30() { // from class: l.uj50
                @Override // p149l.e30
                public final void call(Object obj) {
                    ak50.m97122n((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m97138J(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m97140L(act, from, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0125  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x015c  */
    /* JADX INFO: renamed from: K */
    public final void m97139K(@NotNull final Act act, @NotNull final String from, @NotNull final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        OnlineMatchManager.QuickChatProduce quickChatProduce2;
        String str;
        int i;
        dd80.C16336a c16336aM110985n0;
        act.getClass();
        from.getClass();
        quickChatProduce.getClass();
        String string = act.getString(R$string.f18830pl);
        string.getClass();
        String string2 = act.getString(R$string.f18920sl);
        string2.getClass();
        String string3 = act.getString(R$string.f18950tl);
        string3.getClass();
        String string4 = act.getString(R$string.f18715m);
        string4.getClass();
        if (!Intrinsics.m87488d("active_unmatch", from)) {
            if (!Intrinsics.m87488d("passive_unmatch", from)) {
                if (!Intrinsics.m87488d("overheat_protection", from)) {
                    if (Intrinsics.m87488d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{qqi0.m175934b(qqi0.m175935c(mqi0.m155944o() + 86400000) - mqi0.m155944o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
                        j760 j760VarM140076a = j760.m140076a("where_page_from", from);
                        j760 j760VarM140076a2 = j760.m140076a("how_many_people", "0");
                        j760 j760VarM140076a3 = j760.m140076a("how_many_quickchat_people", "0");
                        j760 j760VarM140076a4 = j760.m140076a("tooltips_trigger_mode", "passive");
                        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                        if (quickChatProduce == quickChatProduce2) {
                            str = "funchat";
                        } else {
                            str = "quickchat";
                        }
                        cwf0VarM133794c.m109040p(j760VarM140076a, j760VarM140076a2, j760VarM140076a3, j760VarM140076a4, j760.m140076a("chat_type", str), j760.m140076a("user_id_list", new JsonArray()));
                        yij0.m214943U(this.sub);
                        this.sub = null;
                        dd80.C16336a c16336aNewDialog = act.newDialog();
                        if (quickChatProduce == quickChatProduce2) {
                            i = x2c0.f189929Yp;
                        } else {
                            i = x2c0.f190781zi;
                        }
                        c16336aM110985n0 = c16336aNewDialog.m110964S(i).m110996y0(string).m110991t0(string2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.hj50
                            @Override // java.lang.Runnable
                            public final void run() {
                                ak50.m97130v(this.f108032a, act, from, quickChatProduce);
                            }
                        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                ak50.m97128t(this.f113500a, cwf0VarM133794c, from, act, dialogInterface);
                            }
                        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ak50.m97116h(this.f118240a, cwf0VarM133794c, dialogInterface);
                            }
                        });
                        if (!Intrinsics.m87488d("overheat_protection", from) && (!Intrinsics.m87488d("use_up", from) || !this.isFemale)) {
                            c16336aM110985n0.m110975d0(x2c0.f190717xi);
                            c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.kj50
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ak50.m97125q(this.f123432a, from, quickChatProduce);
                                }
                            });
                        }
                        this.dialogBase = c16336aM110985n0.m110989r0();
                    }
                    if (Intrinsics.m87488d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    } else if (Intrinsics.m87488d("time_limited_match", from)) {
                        string = "配对已自动解除";
                        string2 = "到限时解锁时间了，已自动解除该配对";
                    }
                    final cwf0 cwf0VarM133794c2 = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
                    j760 j760VarM140076a5 = j760.m140076a("where_page_from", from);
                    j760 j760VarM140076a6 = j760.m140076a("how_many_people", "0");
                    j760 j760VarM140076a7 = j760.m140076a("how_many_quickchat_people", "0");
                    j760 j760VarM140076a8 = j760.m140076a("tooltips_trigger_mode", "passive");
                    quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                    if (quickChatProduce == quickChatProduce2) {
                        str = "funchat";
                    } else {
                        str = "quickchat";
                    }
                    cwf0VarM133794c2.m109040p(j760VarM140076a5, j760VarM140076a6, j760VarM140076a7, j760VarM140076a8, j760.m140076a("chat_type", str), j760.m140076a("user_id_list", new JsonArray()));
                    yij0.m214943U(this.sub);
                    this.sub = null;
                    dd80.C16336a c16336aNewDialog2 = act.newDialog();
                    if (quickChatProduce == quickChatProduce2) {
                        i = x2c0.f189929Yp;
                    } else {
                        i = x2c0.f190781zi;
                    }
                    c16336aM110985n0 = c16336aNewDialog2.m110964S(i).m110996y0(string).m110991t0(string2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.hj50
                        @Override // java.lang.Runnable
                        public final void run() {
                            ak50.m97130v(this.f108032a, act, from, quickChatProduce);
                        }
                    }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            ak50.m97128t(this.f113500a, cwf0VarM133794c2, from, act, dialogInterface);
                        }
                    }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ak50.m97116h(this.f118240a, cwf0VarM133794c2, dialogInterface);
                        }
                    });
                    if (!Intrinsics.m87488d("overheat_protection", from)) {
                        c16336aM110985n0.m110975d0(x2c0.f190717xi);
                        c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.kj50
                            @Override // java.lang.Runnable
                            public final void run() {
                                ak50.m97125q(this.f123432a, from, quickChatProduce);
                            }
                        });
                    }
                    this.dialogBase = c16336aM110985n0.m110989r0();
                }
                string = "匹配频繁，稍后再试";
                string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
                string3 = "我知道了";
                final cwf0 cwf0VarM133794c3 = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
                j760 j760VarM140076a9 = j760.m140076a("where_page_from", from);
                j760 j760VarM140076a10 = j760.m140076a("how_many_people", "0");
                j760 j760VarM140076a11 = j760.m140076a("how_many_quickchat_people", "0");
                j760 j760VarM140076a12 = j760.m140076a("tooltips_trigger_mode", "passive");
                quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                if (quickChatProduce == quickChatProduce2) {
                    str = "funchat";
                } else {
                    str = "quickchat";
                }
                cwf0VarM133794c3.m109040p(j760VarM140076a9, j760VarM140076a10, j760VarM140076a11, j760VarM140076a12, j760.m140076a("chat_type", str), j760.m140076a("user_id_list", new JsonArray()));
                yij0.m214943U(this.sub);
                this.sub = null;
                dd80.C16336a c16336aNewDialog3 = act.newDialog();
                if (quickChatProduce == quickChatProduce2) {
                    i = x2c0.f189929Yp;
                } else {
                    i = x2c0.f190781zi;
                }
                c16336aM110985n0 = c16336aNewDialog3.m110964S(i).m110996y0(string).m110991t0(string2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.hj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m97130v(this.f108032a, act, from, quickChatProduce);
                    }
                }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        ak50.m97128t(this.f113500a, cwf0VarM133794c3, from, act, dialogInterface);
                    }
                }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ak50.m97116h(this.f118240a, cwf0VarM133794c3, dialogInterface);
                    }
                });
                if (!Intrinsics.m87488d("overheat_protection", from)) {
                    c16336aM110985n0.m110975d0(x2c0.f190717xi);
                    c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.kj50
                        @Override // java.lang.Runnable
                        public final void run() {
                            ak50.m97125q(this.f123432a, from, quickChatProduce);
                        }
                    });
                }
                this.dialogBase = c16336aM110985n0.m110989r0();
            }
            string2 = this.isFemale ? "拜拜就拜拜，下个更合拍" : "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
            string = "对方已退出闪聊";
            string3 = "开启闪聊新配对";
            string4 = "知道了";
            final cwf0 cwf0VarM133794c4 = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
            j760 j760VarM140076a13 = j760.m140076a("where_page_from", from);
            j760 j760VarM140076a14 = j760.m140076a("how_many_people", "0");
            j760 j760VarM140076a15 = j760.m140076a("how_many_quickchat_people", "0");
            j760 j760VarM140076a16 = j760.m140076a("tooltips_trigger_mode", "passive");
            quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (quickChatProduce == quickChatProduce2) {
                str = "funchat";
            } else {
                str = "quickchat";
            }
            cwf0VarM133794c4.m109040p(j760VarM140076a13, j760VarM140076a14, j760VarM140076a15, j760VarM140076a16, j760.m140076a("chat_type", str), j760.m140076a("user_id_list", new JsonArray()));
            yij0.m214943U(this.sub);
            this.sub = null;
            dd80.C16336a c16336aNewDialog4 = act.newDialog();
            if (quickChatProduce == quickChatProduce2) {
                i = x2c0.f189929Yp;
            } else {
                i = x2c0.f190781zi;
            }
            c16336aM110985n0 = c16336aNewDialog4.m110964S(i).m110996y0(string).m110991t0(string2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.hj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m97130v(this.f108032a, act, from, quickChatProduce);
                }
            }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ak50.m97128t(this.f113500a, cwf0VarM133794c4, from, act, dialogInterface);
                }
            }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ak50.m97116h(this.f118240a, cwf0VarM133794c4, dialogInterface);
                }
            });
            if (!Intrinsics.m87488d("overheat_protection", from)) {
                c16336aM110985n0.m110975d0(x2c0.f190717xi);
                c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.kj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m97125q(this.f123432a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = c16336aM110985n0.m110989r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
        final cwf0 cwf0VarM133794c5 = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
        j760 j760VarM140076a17 = j760.m140076a("where_page_from", from);
        j760 j760VarM140076a18 = j760.m140076a("how_many_people", "0");
        j760 j760VarM140076a19 = j760.m140076a("how_many_quickchat_people", "0");
        j760 j760VarM140076a110 = j760.m140076a("tooltips_trigger_mode", "passive");
        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (quickChatProduce == quickChatProduce2) {
            str = "funchat";
        } else {
            str = "quickchat";
        }
        cwf0VarM133794c5.m109040p(j760VarM140076a17, j760VarM140076a18, j760VarM140076a19, j760VarM140076a110, j760.m140076a("chat_type", str), j760.m140076a("user_id_list", new JsonArray()));
        yij0.m214943U(this.sub);
        this.sub = null;
        dd80.C16336a c16336aNewDialog5 = act.newDialog();
        if (quickChatProduce == quickChatProduce2) {
            i = x2c0.f189929Yp;
        } else {
            i = x2c0.f190781zi;
        }
        c16336aM110985n0 = c16336aNewDialog5.m110964S(i).m110996y0(string).m110991t0(string2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.hj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97130v(this.f108032a, act, from, quickChatProduce);
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ij50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ak50.m97128t(this.f113500a, cwf0VarM133794c5, from, act, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ak50.m97116h(this.f118240a, cwf0VarM133794c5, dialogInterface);
            }
        });
        if (!Intrinsics.m87488d("overheat_protection", from)) {
            c16336aM110985n0.m110975d0(x2c0.f190717xi);
            c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.kj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m97125q(this.f123432a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = c16336aM110985n0.m110989r0();
    }

    /* JADX INFO: renamed from: L */
    public final void m97140L(@NotNull Act act, @NotNull String from, boolean isAudio) {
        act.getClass();
        from.getClass();
        m97139K(act, from, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: N */
    public final c4g0 m97141N(Act act, final e30<String> action) {
        c4g0 c4g0VarSubscribe = act.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.qj50
            @Override // p149l.e30
            public final void call(Object obj) {
                ak50.m97134z(this.f154879a, action, (Long) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        return c4g0VarSubscribe;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    public final void m97142U(final Act act, final String from, List<? extends RecentConversation> recentConversations, final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        JsonArray jsonArray;
        Iterator<? extends RecentConversation> it;
        int i;
        dd80.C16336a c16336aM110985n0;
        RecentConversation next;
        Iterator<? extends RecentConversation> it2;
        User userM169430Pa;
        String string = act.getString(R$string.f18830pl);
        string.getClass();
        String string2 = act.getString(R$string.f18920sl);
        string2.getClass();
        String string3 = act.getString(R$string.f18950tl);
        string3.getClass();
        String string4 = act.getString(R$string.f18715m);
        string4.getClass();
        if (!Intrinsics.m87488d("active_unmatch", from)) {
            if (Intrinsics.m87488d("passive_unmatch", from)) {
                string = "对方已退出闪聊";
            } else {
                if (Intrinsics.m87488d("overheat_protection", from)) {
                    string = "匹配频繁，稍后再试";
                } else {
                    if (Intrinsics.m87488d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{qqi0.m175934b(qqi0.m175935c(mqi0.m155944o() + 86400000) - mqi0.m155944o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        string2 = "最近活跃好友，快去聊聊吧";
                    } else if (Intrinsics.m87488d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    }
                    string4 = "知道了";
                    string2 = "最近活跃好友，快去聊聊吧";
                }
                string3 = "我知道了";
                string2 = "最近活跃好友，快去聊聊吧";
            }
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
            jsonArray = new JsonArray();
            it = recentConversations.iterator();
            i = 0;
            while (it.hasNext()) {
                next = it.next();
                pib pibVar = CoreModule.f17545c.f19639e0;
                next.getClass();
                it2 = it;
                userM169430Pa = pibVar.m169430Pa(next.otherUserID);
                if (userM169430Pa == null) {
                    m97138J(act, from);
                    return;
                }
                if (userM169430Pa.onlineMatch()) {
                    i++;
                }
                jsonArray.add(next.otherUserID);
                it = it2;
            }
            cwf0VarM133794c.m109040p(j760.m140076a("where_page_from", from), j760.m140076a("how_many_people", Integer.valueOf(recentConversations.size())), j760.m140076a("how_many_quickchat_people", Integer.valueOf(i)), j760.m140076a("user_id_list", jsonArray));
            View viewInflate = View.inflate(act, f6c0.f95905n2, null);
            viewInflate.getClass();
            final OnlineMatchDlgView onlineMatchDlgView = (OnlineMatchDlgView) viewInflate;
            onlineMatchDlgView.m45274W(string, string2, recentConversations, new d30() { // from class: l.wj50
                @Override // p149l.d30
                public final void call() {
                    ak50.m97124p(this.f186598a);
                }
            });
            yij0.m214943U(this.sub);
            this.sub = null;
            c16336aM110985n0 = act.newDialog().m110963R(onlineMatchDlgView).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.xj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m97121m(this.f193179a, act, from, quickChatProduce);
                }
            }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.yj50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ak50.m97129u(this.f198591a, cwf0VarM133794c, from, act, onlineMatchDlgView, dialogInterface);
                }
            }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zj50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ak50.m97119k(this.f203382a, cwf0VarM133794c, dialogInterface);
                }
            });
            if (!Intrinsics.m87488d("overheat_protection", from) && (!Intrinsics.m87488d("use_up", from) || !this.isFemale)) {
                c16336aM110985n0.m110975d0(x2c0.f190717xi);
                c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.fj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m97127s(this.f97756a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = c16336aM110985n0.m110989r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "最近活跃好友，快去聊聊吧";
        final cwf0 cwf0VarM133794c2 = i0e.m133794c("p_quickchat_again_popup", OMSTemplateType.dialog);
        jsonArray = new JsonArray();
        it = recentConversations.iterator();
        i = 0;
        while (it.hasNext()) {
            next = it.next();
            pib pibVar2 = CoreModule.f17545c.f19639e0;
            next.getClass();
            it2 = it;
            userM169430Pa = pibVar2.m169430Pa(next.otherUserID);
            if (userM169430Pa == null) {
                m97138J(act, from);
                return;
            }
            if (userM169430Pa.onlineMatch()) {
                i++;
            }
            jsonArray.add(next.otherUserID);
            it = it2;
        }
        cwf0VarM133794c2.m109040p(j760.m140076a("where_page_from", from), j760.m140076a("how_many_people", Integer.valueOf(recentConversations.size())), j760.m140076a("how_many_quickchat_people", Integer.valueOf(i)), j760.m140076a("user_id_list", jsonArray));
        View viewInflate2 = View.inflate(act, f6c0.f95905n2, null);
        viewInflate2.getClass();
        final OnlineMatchDlgView onlineMatchDlgView2 = (OnlineMatchDlgView) viewInflate2;
        onlineMatchDlgView2.m45274W(string, string2, recentConversations, new d30() { // from class: l.wj50
            @Override // p149l.d30
            public final void call() {
                ak50.m97124p(this.f186598a);
            }
        });
        yij0.m214943U(this.sub);
        this.sub = null;
        c16336aM110985n0 = act.newDialog().m110963R(onlineMatchDlgView2).m110961P(false).m110974c0(string3, new Runnable() { // from class: l.xj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m97121m(this.f193179a, act, from, quickChatProduce);
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.yj50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ak50.m97129u(this.f198591a, cwf0VarM133794c2, from, act, onlineMatchDlgView2, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zj50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ak50.m97119k(this.f203382a, cwf0VarM133794c2, dialogInterface);
            }
        });
        if (!Intrinsics.m87488d("overheat_protection", from)) {
            c16336aM110985n0.m110975d0(x2c0.f190717xi);
            c16336aM110985n0.m110969X(string4, new Runnable() { // from class: l.fj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m97127s(this.f97756a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = c16336aM110985n0.m110989r0();
    }

    /* JADX INFO: renamed from: V */
    public final void m97143V(Act act, String from, List<? extends RecentConversation> recentConversations, boolean isAudio) {
        m97142U(act, from, recentConversations, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: l.ak50$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/ak50$a;", "", "<init>", "()V", "Ll/ak50;", "a", "()Ll/ak50;", "", "INITI_TERM", "Ljava/lang/String;", "PASSI_TERM", "OVER_HEATING", "NO_TIME", "SEARCH_TIMEOUT", "TIME_LIMIT", "LOCK", "Ljava/lang/Object;", "instance", "Ll/ak50;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ak50 m97144a() {
            if (ak50.f70240p == null) {
                synchronized (ak50.f70239o) {
                    try {
                        if (ak50.f70240p == null) {
                            ak50.f70240p = new ak50(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ak50 ak50Var = ak50.f70240p;
            ak50Var.getClass();
            return ak50Var;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ak50(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
