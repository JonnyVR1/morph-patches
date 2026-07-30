package p003l;

import android.content.DialogInterface;
import android.view.View;
import com.google.gson.JsonArray;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.RecentConversation;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.OnlineMatchDlgView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.g30;
import l.i0e;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.nvb0;
import l.pib;
import l.qqi0;
import l.roj0;
import l.sqb0;
import l.szd;
import l.vwb;
import l.x2c0;
import l.xma;
import l.yij0;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R>\u00107\u001a,\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R0\u0010;\u001a\u001e\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00100\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Ll/ak50;", "Ll/s4e;", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "", "Lcom/p1/mobile/putong/core/data/RecentConversation;", "recentConversations", "", "isAudio", "", "V", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;", "quickChatProduce", "U", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/util/List;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "Ll/e30;", "action", "Ll/c4g0;", "N", "(Lcom/p1/mobile/android/app/Act;Ll/e30;)Ll/c4g0;", "H", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "I", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Z)V", "J", "L", "K", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchManager$QuickChatProduce;)V", "G", "Ll/szd;", "g", "Ll/szd;", "dialogBase", "h", "Ll/c4g0;", "sub", "", "i", "currentDay", "j", "Z", "isFemale", "Ll/zpd0;", "k", "Ll/zpd0;", "activeUnmatchTime", "Ll/g30;", "kotlin.jvm.PlatformType", "l", "Ll/g30;", "onPositive", "Ll/f30;", "m", "Ll/f30;", "onNegative", "Ll/d30;", "n", "Ll/d30;", "onShow", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class ak50 extends s4e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Object f2795o = new Object();

    /* JADX INFO: renamed from: p */
    @Nullable
    public static ak50 f2796p;

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
        this.currentDay = qqi0.c(mqi0.o());
        this.isFemale = CoreModule.c.e0.na().isFemale();
        this.activeUnmatchTime = new zpd0("active_unmatch_time_" + CoreModule.H().userId(), 0L);
        this.onPositive = new g30() { // from class: l.ej50
            /* JADX INFO: renamed from: a */
            public final void m6299a(Object obj, Object obj2, Object obj3) {
                ak50.m5389A(this.f4305a, (Act) obj, (String) obj2, (OnlineMatchManager.QuickChatProduce) obj3);
            }
        };
        this.onNegative = new f30() { // from class: l.pj50
            public final void call(Object obj, Object obj2) {
                ak50.m5405j((String) obj, (OnlineMatchManager.QuickChatProduce) obj2);
            }
        };
        this.onShow = new d30() { // from class: l.sj50
            public final void call() {
                ak50.m5418w();
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m5389A(ak50 ak50Var, final Act act, final String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        act.getClass();
        str.getClass();
        quickChatProduce.getClass();
        boolean z = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat;
        boolean z2 = quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickChat;
        boolean z3 = quickChatProduce == OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (z2) {
            OnlineMatchManager.z().v();
        }
        if (Intrinsics.d("use_up", str) && !ak50Var.isFemale) {
            if (xma.e4()) {
                c.D0(act, "p_message,quickchat_pop", Privilege.online_match_tickets, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4088, (Object) null);
            } else {
                c.q1(act, (e30) null, a.p0(), "p_message,quickchat_pop", (String) null, 16, (Object) null);
            }
            zvf0.r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
            return;
        }
        if (Intrinsics.d("overheat_protection", str) || Intrinsics.d("use_up", str)) {
            return;
        }
        if (z3 && Intrinsics.d("match_timeout", str)) {
            snm.m9411g0(act);
        } else if (z) {
            sqb0.B0(sqb0.Companion.f(), act, false, false, (Function1) null, 14, (Object) null);
        } else {
            OnlineMatchManager.z().u0(act, new e30() { // from class: l.vj50
                public final void call(Object obj) {
                    ak50.m5399R(act, str, ((Boolean) obj).booleanValue());
                }
            });
        }
        zvf0.r("e_quickchat_again_popup_match", "p_quickchat_again_popup");
    }

    /* JADX INFO: renamed from: M */
    public static final void m5395M(ak50 ak50Var, String str) {
        dd80 dd80Var = ak50Var.dialogBase;
        if (dd80Var != null) {
            dd80Var.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            dd80Var.a0(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final ak50 m5396O() {
        return INSTANCE.m5431a();
    }

    /* JADX INFO: renamed from: P */
    public static final void m5397P() {
        CoreModule.c.D0.S.onNext(roj0.a);
        e51.H(CoreModule.b, new Runnable() { // from class: l.nj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5398Q();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m5398Q() {
        OnlineMatchManager.z().A.onNext("该配对已保存到这里");
        OnlineMatchManager.z().n.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: R */
    public static final void m5399R(Act act, final String str, boolean z) {
        if (!z) {
            OnlineMatchManager.z().I.onNext(new j760("notify_normal_state", (Object) null));
            return;
        }
        NewMainAct newMainAct = (Act) Act.foreground_().a.get();
        if (!NullChecker.a(newMainAct) || (newMainAct instanceof DropDownAct) || (newMainAct instanceof QuickChatSearchingAct)) {
            return;
        }
        if (newMainAct instanceof NewMainAct) {
            newMainAct.N5(TabName.Msg);
        } else if (newMainAct instanceof QuickChatLoftAct) {
            nvb0.m(newMainAct, "text_quick_chat");
        } else {
            act.startActivity(NewMainAct.k7(act));
        }
        e51.H(CoreModule.b, new Runnable() { // from class: l.lj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5400S(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S */
    public static final void m5400S(String str) {
        CoreModule.c.D0.S.onNext(roj0.a);
        if (!Intrinsics.d("time_limited_match", str) || ((Boolean) OnlineMatchManager.z().m.get()).booleanValue()) {
            return;
        }
        e51.H(CoreModule.b, new Runnable() { // from class: l.rj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5401T();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: T */
    public static final void m5401T() {
        OnlineMatchManager.z().A.onNext("该配对已保存到这里");
        OnlineMatchManager.z().m.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W */
    public static final void m5402W(ak50 ak50Var, OnlineMatchDlgView onlineMatchDlgView, String str) {
        if (ak50Var.dialogBase != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            onlineMatchDlgView.setTitle(String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5403h(ak50 ak50Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        yij0.U(ak50Var.sub);
        ak50Var.sub = null;
        cwf0Var.k();
        ak50Var.dialogBase = null;
    }

    /* JADX INFO: renamed from: j */
    public static void m5405j(String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        str.getClass();
        quickChatProduce.getClass();
        if (quickChatProduce == OnlineMatchManager.QuickChatProduce.QuickAudioChat || !Intrinsics.d("time_limited_match", str) || ((Boolean) OnlineMatchManager.z().n.get()).booleanValue()) {
            return;
        }
        NewMainAct newMainAct = (Act) Act.foreground_().a.get();
        if (!NullChecker.a(newMainAct) || (newMainAct instanceof DropDownAct) || (newMainAct instanceof QuickChatSearchingAct) || (newMainAct instanceof QuickChatLoftAct)) {
            return;
        }
        if (newMainAct instanceof NewMainAct) {
            newMainAct.N5(TabName.Msg);
        } else {
            newMainAct.getClass();
            newMainAct.startActivity(NewMainAct.k7(newMainAct));
        }
        e51.H(CoreModule.b, new Runnable() { // from class: l.gj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5397P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static void m5406k(ak50 ak50Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        yij0.U(ak50Var.sub);
        ak50Var.sub = null;
        ak50Var.dialogBase = null;
        cwf0Var.k();
    }

    /* JADX INFO: renamed from: m */
    public static void m5408m(ak50 ak50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onPositive.a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: n */
    public static void m5409n(Throwable th) {
        lsi0.j("系统加载中，稍安勿躁哦");
    }

    /* JADX INFO: renamed from: p */
    public static void m5411p(ak50 ak50Var) {
        ak50Var.m5422G();
    }

    /* JADX INFO: renamed from: q */
    public static void m5412q(ak50 ak50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: s */
    public static void m5414s(ak50 ak50Var, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onNegative.call(str, quickChatProduce);
    }

    /* JADX INFO: renamed from: t */
    public static void m5415t(final ak50 ak50Var, cwf0 cwf0Var, String str, Act act, DialogInterface dialogInterface) {
        ak50Var.onShow.call();
        cwf0Var.l();
        if (Intrinsics.d("use_up", str)) {
            ak50Var.sub = ak50Var.m5428N(act, new e30() { // from class: l.oj50
                public final void call(Object obj) {
                    ak50.m5395M(this.f6667a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5416u(final ak50 ak50Var, cwf0 cwf0Var, String str, Act act, final OnlineMatchDlgView onlineMatchDlgView, DialogInterface dialogInterface) {
        ak50Var.onShow.call();
        cwf0Var.l();
        if (Intrinsics.d("use_up", str)) {
            ak50Var.sub = ak50Var.m5428N(act, new e30() { // from class: l.mj50
                public final void call(Object obj) {
                    ak50.m5402W(this.f6348a, onlineMatchDlgView, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5417v(ak50 ak50Var, Act act, String str, OnlineMatchManager.QuickChatProduce quickChatProduce) {
        ak50Var.onPositive.a(act, str, quickChatProduce);
    }

    /* JADX INFO: renamed from: w */
    public static void m5418w() {
        v.a0.onNext(v.b0);
    }

    /* JADX INFO: renamed from: x */
    public static void m5419x(ak50 ak50Var, Act act, String str, boolean z, List list) {
        list.getClass();
        if (vwb.J(list)) {
            ak50Var.m5427L(act, str, z);
        } else {
            ak50Var.m5430V(act, str, list, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5421z(ak50 ak50Var, e30 e30Var, Long l2) {
        String strB;
        if (ak50Var.currentDay == qqi0.c(mqi0.o())) {
            strB = qqi0.b(qqi0.c(mqi0.o() + 86400000) - mqi0.o());
            strB.getClass();
        } else {
            CoreModule.c.C0.u4();
            strB = "00:00:00";
        }
        e30Var.call(strB);
    }

    /* JADX INFO: renamed from: G */
    public final void m5422G() {
        if (NullChecker.a(this.dialogBase)) {
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
    public final void m5423H(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m5424I(act, from, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m5424I(@NotNull final Act act, @NotNull final String from, final boolean isAudio) {
        act.getClass();
        from.getClass();
        if (Intrinsics.d("active_unmatch", from)) {
            long jO = mqi0.o();
            Object obj = this.activeUnmatchTime.get();
            obj.getClass();
            if (jO - ((Number) obj).longValue() < 600000) {
                return;
            } else {
                this.activeUnmatchTime.put(Long.valueOf(mqi0.o()));
            }
        }
        if (CoreModule.c.f0.jf() < 0) {
            m5427L(act, from, isAudio);
        } else {
            CoreModule.c.D0.G4().subscribe(mkd0.H(new e30() { // from class: l.tj50
                public final void call(Object obj2) {
                    ak50.m5419x(this.f7570a, act, from, isAudio, (List) obj2);
                }
            }, new e30() { // from class: l.uj50
                public final void call(Object obj2) {
                    ak50.m5409n((Throwable) obj2);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m5425J(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        m5427L(act, from, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0125  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x015c  */
    /* JADX INFO: renamed from: K */
    public final void m5426K(@NotNull final Act act, @NotNull final String from, @NotNull final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        OnlineMatchManager.QuickChatProduce quickChatProduce2;
        String str;
        int i;
        dd80.a aVarN0;
        act.getClass();
        from.getClass();
        quickChatProduce.getClass();
        String string = act.getString(R.string.pl);
        string.getClass();
        String string2 = act.getString(R.string.sl);
        string2.getClass();
        String string3 = act.getString(R.string.tl);
        string3.getClass();
        String string4 = act.getString(R.string.m);
        string4.getClass();
        if (!Intrinsics.d("active_unmatch", from)) {
            if (!Intrinsics.d("passive_unmatch", from)) {
                if (!Intrinsics.d("overheat_protection", from)) {
                    if (Intrinsics.d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{qqi0.b(qqi0.c(mqi0.o() + 86400000) - mqi0.o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        final cwf0 cwf0VarC = i0e.c("p_quickchat_again_popup", "dialog");
                        j760 j760VarA = j760.a("where_page_from", from);
                        j760 j760VarA2 = j760.a("how_many_people", "0");
                        j760 j760VarA3 = j760.a("how_many_quickchat_people", "0");
                        j760 j760VarA4 = j760.a("tooltips_trigger_mode", "passive");
                        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                        if (quickChatProduce == quickChatProduce2) {
                            str = "funchat";
                        } else {
                            str = "quickchat";
                        }
                        cwf0VarC.p(new j760[]{j760VarA, j760VarA2, j760VarA3, j760VarA4, j760.a("chat_type", str), j760.a("user_id_list", new JsonArray())});
                        yij0.U(this.sub);
                        this.sub = null;
                        dd80.a aVarNewDialog = act.newDialog();
                        if (quickChatProduce == quickChatProduce2) {
                            i = x2c0.Yp;
                        } else {
                            i = x2c0.zi;
                        }
                        aVarN0 = aVarNewDialog.S(i).y0(string).t0(string2).P(false).c0(string3, new Runnable() { // from class: l.hj50
                            @Override // java.lang.Runnable
                            public final void run() {
                                ak50.m5417v(this.f4906a, act, from, quickChatProduce);
                            }
                        }).o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                ak50.m5415t(this.f5142a, cwf0VarC, from, act, dialogInterface);
                            }
                        }).n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ak50.m5403h(this.f5331a, cwf0VarC, dialogInterface);
                            }
                        });
                        if (!Intrinsics.d("overheat_protection", from) && (!Intrinsics.d("use_up", from) || !this.isFemale)) {
                            aVarN0.d0(x2c0.xi);
                            aVarN0.X(string4, new Runnable() { // from class: l.kj50
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ak50.m5412q(this.f5657a, from, quickChatProduce);
                                }
                            });
                        }
                        this.dialogBase = aVarN0.r0();
                    }
                    if (Intrinsics.d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    } else if (Intrinsics.d("time_limited_match", from)) {
                        string = "配对已自动解除";
                        string2 = "到限时解锁时间了，已自动解除该配对";
                    }
                    final cwf0 cwf0VarC2 = i0e.c("p_quickchat_again_popup", "dialog");
                    j760 j760VarA5 = j760.a("where_page_from", from);
                    j760 j760VarA6 = j760.a("how_many_people", "0");
                    j760 j760VarA7 = j760.a("how_many_quickchat_people", "0");
                    j760 j760VarA8 = j760.a("tooltips_trigger_mode", "passive");
                    quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                    if (quickChatProduce == quickChatProduce2) {
                        str = "funchat";
                    } else {
                        str = "quickchat";
                    }
                    cwf0VarC2.p(new j760[]{j760VarA5, j760VarA6, j760VarA7, j760VarA8, j760.a("chat_type", str), j760.a("user_id_list", new JsonArray())});
                    yij0.U(this.sub);
                    this.sub = null;
                    dd80.a aVarNewDialog2 = act.newDialog();
                    if (quickChatProduce == quickChatProduce2) {
                        i = x2c0.Yp;
                    } else {
                        i = x2c0.zi;
                    }
                    aVarN0 = aVarNewDialog2.S(i).y0(string).t0(string2).P(false).c0(string3, new Runnable() { // from class: l.hj50
                        @Override // java.lang.Runnable
                        public final void run() {
                            ak50.m5417v(this.f4906a, act, from, quickChatProduce);
                        }
                    }).o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            ak50.m5415t(this.f5142a, cwf0VarC2, from, act, dialogInterface);
                        }
                    }).n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ak50.m5403h(this.f5331a, cwf0VarC2, dialogInterface);
                        }
                    });
                    if (!Intrinsics.d("overheat_protection", from)) {
                        aVarN0.d0(x2c0.xi);
                        aVarN0.X(string4, new Runnable() { // from class: l.kj50
                            @Override // java.lang.Runnable
                            public final void run() {
                                ak50.m5412q(this.f5657a, from, quickChatProduce);
                            }
                        });
                    }
                    this.dialogBase = aVarN0.r0();
                }
                string = "匹配频繁，稍后再试";
                string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
                string3 = "我知道了";
                final cwf0 cwf0VarC3 = i0e.c("p_quickchat_again_popup", "dialog");
                j760 j760VarA9 = j760.a("where_page_from", from);
                j760 j760VarA10 = j760.a("how_many_people", "0");
                j760 j760VarA11 = j760.a("how_many_quickchat_people", "0");
                j760 j760VarA12 = j760.a("tooltips_trigger_mode", "passive");
                quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
                if (quickChatProduce == quickChatProduce2) {
                    str = "funchat";
                } else {
                    str = "quickchat";
                }
                cwf0VarC3.p(new j760[]{j760VarA9, j760VarA10, j760VarA11, j760VarA12, j760.a("chat_type", str), j760.a("user_id_list", new JsonArray())});
                yij0.U(this.sub);
                this.sub = null;
                dd80.a aVarNewDialog3 = act.newDialog();
                if (quickChatProduce == quickChatProduce2) {
                    i = x2c0.Yp;
                } else {
                    i = x2c0.zi;
                }
                aVarN0 = aVarNewDialog3.S(i).y0(string).t0(string2).P(false).c0(string3, new Runnable() { // from class: l.hj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m5417v(this.f4906a, act, from, quickChatProduce);
                    }
                }).o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        ak50.m5415t(this.f5142a, cwf0VarC3, from, act, dialogInterface);
                    }
                }).n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ak50.m5403h(this.f5331a, cwf0VarC3, dialogInterface);
                    }
                });
                if (!Intrinsics.d("overheat_protection", from)) {
                    aVarN0.d0(x2c0.xi);
                    aVarN0.X(string4, new Runnable() { // from class: l.kj50
                        @Override // java.lang.Runnable
                        public final void run() {
                            ak50.m5412q(this.f5657a, from, quickChatProduce);
                        }
                    });
                }
                this.dialogBase = aVarN0.r0();
            }
            string2 = this.isFemale ? "拜拜就拜拜，下个更合拍" : "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
            string = "对方已退出闪聊";
            string3 = "开启闪聊新配对";
            string4 = "知道了";
            final cwf0 cwf0VarC4 = i0e.c("p_quickchat_again_popup", "dialog");
            j760 j760VarA13 = j760.a("where_page_from", from);
            j760 j760VarA14 = j760.a("how_many_people", "0");
            j760 j760VarA15 = j760.a("how_many_quickchat_people", "0");
            j760 j760VarA16 = j760.a("tooltips_trigger_mode", "passive");
            quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
            if (quickChatProduce == quickChatProduce2) {
                str = "funchat";
            } else {
                str = "quickchat";
            }
            cwf0VarC4.p(new j760[]{j760VarA13, j760VarA14, j760VarA15, j760VarA16, j760.a("chat_type", str), j760.a("user_id_list", new JsonArray())});
            yij0.U(this.sub);
            this.sub = null;
            dd80.a aVarNewDialog4 = act.newDialog();
            if (quickChatProduce == quickChatProduce2) {
                i = x2c0.Yp;
            } else {
                i = x2c0.zi;
            }
            aVarN0 = aVarNewDialog4.S(i).y0(string).t0(string2).P(false).c0(string3, new Runnable() { // from class: l.hj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m5417v(this.f4906a, act, from, quickChatProduce);
                }
            }).o0(new DialogInterface.OnShowListener() { // from class: l.ij50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ak50.m5415t(this.f5142a, cwf0VarC4, from, act, dialogInterface);
                }
            }).n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ak50.m5403h(this.f5331a, cwf0VarC4, dialogInterface);
                }
            });
            if (!Intrinsics.d("overheat_protection", from)) {
                aVarN0.d0(x2c0.xi);
                aVarN0.X(string4, new Runnable() { // from class: l.kj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m5412q(this.f5657a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = aVarN0.r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "别着急，交朋友讲究缘分，你一定会遇到合拍的人";
        final cwf0 cwf0VarC5 = i0e.c("p_quickchat_again_popup", "dialog");
        j760 j760VarA17 = j760.a("where_page_from", from);
        j760 j760VarA18 = j760.a("how_many_people", "0");
        j760 j760VarA19 = j760.a("how_many_quickchat_people", "0");
        j760 j760VarA110 = j760.a("tooltips_trigger_mode", "passive");
        quickChatProduce2 = OnlineMatchManager.QuickChatProduce.Heartbeat;
        if (quickChatProduce == quickChatProduce2) {
            str = "funchat";
        } else {
            str = "quickchat";
        }
        cwf0VarC5.p(new j760[]{j760VarA17, j760VarA18, j760VarA19, j760VarA110, j760.a("chat_type", str), j760.a("user_id_list", new JsonArray())});
        yij0.U(this.sub);
        this.sub = null;
        dd80.a aVarNewDialog5 = act.newDialog();
        if (quickChatProduce == quickChatProduce2) {
            i = x2c0.Yp;
        } else {
            i = x2c0.zi;
        }
        aVarN0 = aVarNewDialog5.S(i).y0(string).t0(string2).P(false).c0(string3, new Runnable() { // from class: l.hj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5417v(this.f4906a, act, from, quickChatProduce);
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.ij50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ak50.m5415t(this.f5142a, cwf0VarC5, from, act, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.jj50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ak50.m5403h(this.f5331a, cwf0VarC5, dialogInterface);
            }
        });
        if (!Intrinsics.d("overheat_protection", from)) {
            aVarN0.d0(x2c0.xi);
            aVarN0.X(string4, new Runnable() { // from class: l.kj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m5412q(this.f5657a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = aVarN0.r0();
    }

    /* JADX INFO: renamed from: L */
    public final void m5427L(@NotNull Act act, @NotNull String from, boolean isAudio) {
        act.getClass();
        from.getClass();
        m5426K(act, from, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: N */
    public final c4g0 m5428N(Act act, final e30<String> action) {
        c4g0 c4g0VarSubscribe = act.duringCreated(rx.c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.qj50
            public final void call(Object obj) {
                ak50.m5421z(this.f7030a, action, (Long) obj);
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
    /* JADX WARN: Type inference failed for: r11v8, types: [android.view.View, com.p1.mobile.putong.core.ui.dlg.views.OnlineMatchDlgView] */
    /* JADX INFO: renamed from: U */
    public final void m5429U(final Act act, final String from, List<? extends RecentConversation> recentConversations, final OnlineMatchManager.QuickChatProduce quickChatProduce) {
        JsonArray jsonArray;
        Iterator<? extends RecentConversation> it;
        int i;
        dd80.a aVarN0;
        RecentConversation next;
        Iterator<? extends RecentConversation> it2;
        User userPa;
        String string = act.getString(R.string.pl);
        string.getClass();
        String string2 = act.getString(R.string.sl);
        string2.getClass();
        String string3 = act.getString(R.string.tl);
        string3.getClass();
        String string4 = act.getString(R.string.m);
        string4.getClass();
        if (!Intrinsics.d("active_unmatch", from)) {
            if (Intrinsics.d("passive_unmatch", from)) {
                string = "对方已退出闪聊";
            } else {
                if (Intrinsics.d("overheat_protection", from)) {
                    string = "匹配频繁，稍后再试";
                } else {
                    if (Intrinsics.d("use_up", from)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%s 后获得免费闪聊", Arrays.copyOf(new Object[]{qqi0.b(qqi0.c(mqi0.o() + 86400000) - mqi0.o())}, 1));
                        if (!this.isFemale) {
                            string3 = "不等了，立即匹配";
                        }
                        string2 = "最近活跃好友，快去聊聊吧";
                    } else if (Intrinsics.d("match_timeout", from)) {
                        string = "抱歉，匹配超时";
                        string3 = "再试一次";
                    }
                    string4 = "知道了";
                    string2 = "最近活跃好友，快去聊聊吧";
                }
                string3 = "我知道了";
                string2 = "最近活跃好友，快去聊聊吧";
            }
            final cwf0 cwf0VarC = i0e.c("p_quickchat_again_popup", "dialog");
            jsonArray = new JsonArray();
            it = recentConversations.iterator();
            i = 0;
            while (it.hasNext()) {
                next = it.next();
                pib pibVar = CoreModule.c.e0;
                next.getClass();
                it2 = it;
                userPa = pibVar.Pa(next.otherUserID);
                if (userPa == null) {
                    m5425J(act, from);
                    return;
                }
                if (userPa.onlineMatch()) {
                    i++;
                }
                jsonArray.add(next.otherUserID);
                it = it2;
            }
            cwf0VarC.p(new j760[]{j760.a("where_page_from", from), j760.a("how_many_people", Integer.valueOf(recentConversations.size())), j760.a("how_many_quickchat_people", Integer.valueOf(i)), j760.a("user_id_list", jsonArray)});
            Object objInflate = View.inflate(act, f6c0.n2, null);
            objInflate.getClass();
            final ?? r11 = (OnlineMatchDlgView) objInflate;
            r11.m2593W(string, string2, recentConversations, new d30() { // from class: l.wj50
                public final void call() {
                    ak50.m5411p(this.f8194a);
                }
            });
            yij0.U(this.sub);
            this.sub = null;
            aVarN0 = act.newDialog().R((View) r11).P(false).c0(string3, new Runnable() { // from class: l.xj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m5408m(this.f8490a, act, from, quickChatProduce);
                }
            }).o0(new DialogInterface.OnShowListener() { // from class: l.yj50
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ak50.m5416u(this.f9072a, cwf0VarC, from, act, r11, dialogInterface);
                }
            }).n0(new DialogInterface.OnDismissListener() { // from class: l.zj50
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ak50.m5406k(this.f9262a, cwf0VarC, dialogInterface);
                }
            });
            if (!Intrinsics.d("overheat_protection", from) && (!Intrinsics.d("use_up", from) || !this.isFemale)) {
                aVarN0.d0(x2c0.xi);
                aVarN0.X(string4, new Runnable() { // from class: l.fj50
                    @Override // java.lang.Runnable
                    public final void run() {
                        ak50.m5414s(this.f4444a, from, quickChatProduce);
                    }
                });
            }
            this.dialogBase = aVarN0.r0();
        }
        string = "已成功解除匹配";
        string3 = "开启闪聊新配对";
        string4 = "知道了";
        string2 = "最近活跃好友，快去聊聊吧";
        final cwf0 cwf0VarC2 = i0e.c("p_quickchat_again_popup", "dialog");
        jsonArray = new JsonArray();
        it = recentConversations.iterator();
        i = 0;
        while (it.hasNext()) {
            next = it.next();
            pib pibVar2 = CoreModule.c.e0;
            next.getClass();
            it2 = it;
            userPa = pibVar2.Pa(next.otherUserID);
            if (userPa == null) {
                m5425J(act, from);
                return;
            }
            if (userPa.onlineMatch()) {
                i++;
            }
            jsonArray.add(next.otherUserID);
            it = it2;
        }
        cwf0VarC2.p(new j760[]{j760.a("where_page_from", from), j760.a("how_many_people", Integer.valueOf(recentConversations.size())), j760.a("how_many_quickchat_people", Integer.valueOf(i)), j760.a("user_id_list", jsonArray)});
        Object objInflate2 = View.inflate(act, f6c0.n2, null);
        objInflate2.getClass();
        final OnlineMatchDlgView r12 = (OnlineMatchDlgView) objInflate2;
        r12.m2593W(string, string2, recentConversations, new d30() { // from class: l.wj50
            public final void call() {
                ak50.m5411p(this.f8194a);
            }
        });
        yij0.U(this.sub);
        this.sub = null;
        aVarN0 = act.newDialog().R((View) r12).P(false).c0(string3, new Runnable() { // from class: l.xj50
            @Override // java.lang.Runnable
            public final void run() {
                ak50.m5408m(this.f8490a, act, from, quickChatProduce);
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.yj50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ak50.m5416u(this.f9072a, cwf0VarC2, from, act, r12, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.zj50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ak50.m5406k(this.f9262a, cwf0VarC2, dialogInterface);
            }
        });
        if (!Intrinsics.d("overheat_protection", from)) {
            aVarN0.d0(x2c0.xi);
            aVarN0.X(string4, new Runnable() { // from class: l.fj50
                @Override // java.lang.Runnable
                public final void run() {
                    ak50.m5414s(this.f4444a, from, quickChatProduce);
                }
            });
        }
        this.dialogBase = aVarN0.r0();
    }

    /* JADX INFO: renamed from: V */
    public final void m5430V(Act act, String from, List<? extends RecentConversation> recentConversations, boolean isAudio) {
        m5429U(act, from, recentConversations, isAudio ? OnlineMatchManager.QuickChatProduce.QuickAudioChat : OnlineMatchManager.QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: l.ak50$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll/ak50$a;", "", "<init>", "()V", "Ll/ak50;", "a", "()Ll/ak50;", "", "INITI_TERM", "Ljava/lang/String;", "PASSI_TERM", "OVER_HEATING", "NO_TIME", "SEARCH_TIMEOUT", "TIME_LIMIT", "LOCK", "Ljava/lang/Object;", "instance", "Ll/ak50;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ak50 m5431a() {
            if (ak50.f2796p == null) {
                synchronized (ak50.f2795o) {
                    try {
                        if (ak50.f2796p == null) {
                            ak50.f2796p = new ak50(null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ak50 ak50Var = ak50.f2796p;
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
