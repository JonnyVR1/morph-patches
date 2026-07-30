package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.p053ui.compliment.DialogC8304a;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0019J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Ll/bo5;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "photoIndex", "Ll/d30;", "onDismiss", "Lkotlin/Function1;", "", "onComplimentSentSuccess", "liveRoomInfo", "n", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ll/d30;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "fromUser", "message", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/jvm/functions/Function1;", "q", "complimentSentStatus", "r", "", "h", "(Lcom/p1/mobile/android/app/Act;)Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class bo5 {

    @NotNull
    public static final bo5 INSTANCE = new bo5();

    /* JADX INFO: renamed from: b */
    public static void m102892b(Act act, User user) {
        act.startActivityForResult(MediaPickerAct.m47785g2(act, 1, false, false, true, null, MediaPickerAct.f30623D, false, true, user.gender), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m102893c(User user) {
        user.getClass();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e != null && !vwb.m200296J(partialListOptM221515e.loaded) && TextUtils.equals(partialListOptM221515e.loaded.get(0).f19472id, user.f56011id)) {
            CoreModule.f17545c.f19663m0.m30986C8("compliment_sent");
        }
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e2 = CoreModule.f17545c.f19669o0.f20063Y.m221515e();
        if (partialListOptM221515e2 != null && !vwb.m200296J(partialListOptM221515e2.loaded)) {
            List<CoreSuggested.UserInfo> list = partialListOptM221515e2.loaded;
            list.getClass();
            List<CoreSuggested.UserInfo> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (CoreSuggested.UserInfo userInfo : list2) {
                    if (userInfo != null && TextUtils.equals(userInfo.f19472id, user.f56011id)) {
                        CoreModule.f17545c.f19669o0.m34320W3(user.f56011id);
                        break;
                    }
                }
            }
        }
        CoreModule.f17545c.f19642f0.m32973gp(user.f56011id).subscribe(mkd0.m154956H(new e30() { // from class: l.xn5
            @Override // p149l.e30
            public final void call(Object obj) {
                bo5.m102899j((roj0) obj);
            }
        }, new e30() { // from class: l.yn5
            @Override // p149l.e30
            public final void call(Object obj) {
                bo5.m102900k((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m102894d(Act act, View view, CoreInnerPush.C4716a c4716a) {
        if (view instanceof qsm) {
            ((qsm) view).mo39229a(act, c4716a, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m102895e(Act act, View view, CoreInnerPush.C4716a c4716a) {
        if (view instanceof qsm) {
            ((qsm) view).mo39229a(act, c4716a, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m102896f(Act act, View view, CoreInnerPush.C4716a c4716a) {
        if (view instanceof qsm) {
            ((qsm) view).mo39229a(act, c4716a, null, null);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Function1<User, Unit> m102898i() {
        return new Function1() { // from class: l.un5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bo5.m102893c((User) obj);
            }
        };
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m102901l(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num) {
        act.getClass();
        user.getClass();
        m102904o(act, user, str, num, null, null, null, 112, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public static final void m102902m(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable d30 d30Var, @Nullable Function1<? super User, Unit> function1) {
        act.getClass();
        user.getClass();
        m102904o(act, user, str, num, d30Var, function1, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m102903n(@NotNull Act act, @NotNull User targetUser, @Nullable String from, @Nullable Integer photoIndex, @Nullable d30 onDismiss, @Nullable Function1<? super User, Unit> onComplimentSentSuccess, @Nullable String liveRoomInfo) {
        act.getClass();
        targetUser.getClass();
        if (INSTANCE.m102909h(act)) {
            co5.m107933e(act, from);
            DialogC8304a dialogC8304a = new DialogC8304a(act, targetUser, from, photoIndex, liveRoomInfo);
            dialogC8304a.m44698N1(onDismiss);
            if (onComplimentSentSuccess != null) {
                dialogC8304a.m44696M1(onComplimentSentSuccess);
            }
            dialogC8304a.show();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m102904o(Act act, User user, String str, Integer num, d30 d30Var, Function1 function1, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = 0;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        m102903n(act, user, str, num, d30Var, function1, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m102905p(@NotNull final Act act, @NotNull User fromUser, @NotNull String message) {
        act.getClass();
        fromUser.getClass();
        message.getClass();
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a(fromUser.f56011id);
        c4716a.f19175a = fromUser.name;
        c4716a.f19176b = message;
        c4716a.f19177c = fromUser.m60124fp().profileSmall().formatted();
        c4716a.f19185k = 4000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.m130557s(f6c0.f95268A1, true).m130564z((ViewGroup) decorView).m130562x(xdl0.m208331F0()).m130559u(200L).m130555q(c4716a.f19185k).m130563y(c4716a, new hd2.InterfaceC17284b() { // from class: l.wn5
            @Override // p149l.hd2.InterfaceC17284b
            /* JADX INFO: renamed from: a */
            public final void mo97843a(View view, Object obj) {
                bo5.m102896f(act, view, (CoreInnerPush.C4716a) obj);
            }
        });
        nd2.m158964j().m158980s(hd2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m102906q(@NotNull Act act, @NotNull User targetUser) {
        act.getClass();
        targetUser.getClass();
        m102907r(act, targetUser, "success");
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m102907r(@NotNull final Act act, @NotNull User targetUser, @NotNull String complimentSentStatus) {
        act.getClass();
        targetUser.getClass();
        complimentSentStatus.getClass();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_compliment_success_popup", bo5.class.getName());
        if (cwf0VarM133794c != null) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("compliment_sent_status", complimentSentStatus));
        }
        i0e.m133797f(cwf0VarM133794c);
        zvf0.m220371D("e_intl_compliment_toast_show", OMSDialogPositon.p_navigation_view, vwb.m200311Y("compliment_toast_type", "compliment"), vwb.m200311Y("user_status", !xma.m210071e4() ? "premium" : "other"));
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a(targetUser.f56011id);
        c4716a.f19175a = App.f15369e.getString(R$string.f17696E9);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.f15369e.getString(R$string.f19090yb);
        string.getClass();
        c4716a.f19176b = String.format(string, Arrays.copyOf(new Object[]{targetUser.name}, 1));
        c4716a.f19177c = targetUser.m60124fp().profileSmall().formatted();
        c4716a.f19185k = 2000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.m130557s(f6c0.f95268A1, true).m130564z((ViewGroup) decorView).m130562x(xdl0.m208331F0()).m130559u(200L).m130555q(c4716a.f19185k).m130563y(c4716a, new hd2.InterfaceC17284b() { // from class: l.ao5
            @Override // p149l.hd2.InterfaceC17284b
            /* JADX INFO: renamed from: a */
            public final void mo97843a(View view, Object obj) {
                bo5.m102894d(act, view, (CoreInnerPush.C4716a) obj);
            }
        });
        nd2.m158964j().m158980s(hd2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m102908s(@NotNull final Act act, @NotNull User fromUser) {
        act.getClass();
        fromUser.getClass();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_compliment_success_popup", bo5.class.getName());
        if (cwf0VarM133794c != null) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("compliment_sent_status", "upgrade"));
        }
        i0e.m133797f(cwf0VarM133794c);
        zvf0.m220371D("e_intl_compliment_toast_show", OMSDialogPositon.p_navigation_view, vwb.m200311Y("compliment_toast_type", "compliment"), vwb.m200311Y("user_status", !xma.m210071e4() ? "premium" : "other"));
        CoreInnerPush.C4716a c4716a = new CoreInnerPush.C4716a(fromUser.f56011id);
        c4716a.f19175a = App.f15369e.getString(R$string.f19120zb);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.f15369e.getString(R$string.f19090yb);
        string.getClass();
        c4716a.f19176b = String.format(string, Arrays.copyOf(new Object[]{fromUser.name}, 1));
        c4716a.f19177c = fromUser.m60124fp().profileSmall().formatted();
        c4716a.f19185k = 4000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.m130557s(f6c0.f95268A1, true).m130564z((ViewGroup) decorView).m130562x(xdl0.m208331F0()).m130559u(200L).m130555q(c4716a.f19185k).m130563y(c4716a, new hd2.InterfaceC17284b() { // from class: l.zn5
            @Override // p149l.hd2.InterfaceC17284b
            /* JADX INFO: renamed from: a */
            public final void mo97843a(View view, Object obj) {
                bo5.m102895e(act, view, (CoreInnerPush.C4716a) obj);
            }
        });
        nd2.m158964j().m158980s(hd2Var);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m102909h(final Act act) {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            return false;
        }
        if (CoreModule.f17545c.f19639e0.m169486f8()) {
            qwp.m176882i().m176888n(act, true);
            return false;
        }
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            wm20.m203973m(act);
            return false;
        }
        if (ark.m98421F0(act, new Runnable() { // from class: l.vn5
            @Override // java.lang.Runnable
            public final void run() {
                bo5.m102892b(act, userM169527p9);
            }
        })) {
            return false;
        }
        if (!userM169527p9.isNameFake()) {
            return true;
        }
        ark.m98449T0(act);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final void m102899j(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static final void m102900k(Throwable th) {
    }
}
