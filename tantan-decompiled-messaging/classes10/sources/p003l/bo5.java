package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.compliment.C3079a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.cwf0;
import l.d30;
import l.e30;
import l.f6c0;
import l.hd2;
import l.i0e;
import l.j760;
import l.mkd0;
import l.nd2;
import l.qsm;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0019J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll/bo5;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "photoIndex", "Ll/d30;", "onDismiss", "Lkotlin/Function1;", "", "onComplimentSentSuccess", "liveRoomInfo", "n", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ll/d30;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "fromUser", "message", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", "s", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "i", "()Lkotlin/jvm/functions/Function1;", "q", "complimentSentStatus", "r", "", "h", "(Lcom/p1/mobile/android/app/Act;)Z", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class bo5 {

    @NotNull
    public static final bo5 INSTANCE = new bo5();

    /* JADX INFO: renamed from: b */
    public static void m5749b(Act act, User user) {
        act.startActivityForResult(MediaPickerAct.g2(act, 1, false, false, true, (String) null, MediaPickerAct.D, false, true, user.gender), 786);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m5750c(User user) {
        user.getClass();
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt != null && !vwb.J(partialListOpt.loaded) && TextUtils.equals(((CoreSuggested.UserInfo) partialListOpt.loaded.get(0)).id, ((DbObject) user).id)) {
            CoreModule.c.m0.C8("compliment_sent");
        }
        PartialListOpt partialListOpt2 = (PartialListOpt) CoreModule.c.o0.Y.e();
        if (partialListOpt2 != null && !vwb.J(partialListOpt2.loaded)) {
            Iterable iterable = partialListOpt2.loaded;
            iterable.getClass();
            Iterable<CoreSuggested.UserInfo> iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (CoreSuggested.UserInfo userInfo : iterable2) {
                    if (userInfo != null && TextUtils.equals(userInfo.id, ((DbObject) user).id)) {
                        CoreModule.c.o0.W3(((DbObject) user).id);
                        break;
                    }
                }
            }
        }
        CoreModule.c.f0.gp(((DbObject) user).id).subscribe(mkd0.H(new e30() { // from class: l.xn5
            public final void call(Object obj) {
                bo5.m5756j((roj0) obj);
            }
        }, new e30() { // from class: l.yn5
            public final void call(Object obj) {
                bo5.m5757k((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m5751d(Act act, View view, CoreInnerPush.a aVar) {
        if (view instanceof qsm) {
            ((qsm) view).a(act, aVar, (TabName) null, (Frag) null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5752e(Act act, View view, CoreInnerPush.a aVar) {
        if (view instanceof qsm) {
            ((qsm) view).a(act, aVar, (TabName) null, (Frag) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5753f(Act act, View view, CoreInnerPush.a aVar) {
        if (view instanceof qsm) {
            ((qsm) view).a(act, aVar, (TabName) null, (Frag) null);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Function1<User, Unit> m5755i() {
        return new Function1() { // from class: l.un5
            public final Object invoke(Object obj) {
                return bo5.m5750c((User) obj);
            }
        };
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m5758l(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num) {
        act.getClass();
        user.getClass();
        m5761o(act, user, str, num, null, null, null, 112, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public static final void m5759m(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable d30 d30Var, @Nullable Function1<? super User, Unit> function1) {
        act.getClass();
        user.getClass();
        m5761o(act, user, str, num, d30Var, function1, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m5760n(@NotNull Act act, @NotNull User targetUser, @Nullable String from, @Nullable Integer photoIndex, @Nullable d30 onDismiss, @Nullable Function1<? super User, Unit> onComplimentSentSuccess, @Nullable String liveRoomInfo) {
        act.getClass();
        targetUser.getClass();
        if (INSTANCE.m5766h(act)) {
            co5.m5978e(act, from);
            C3079a c3079a = new C3079a(act, targetUser, from, photoIndex, liveRoomInfo);
            c3079a.m2012N1(onDismiss);
            if (onComplimentSentSuccess != null) {
                c3079a.m2010M1(onComplimentSentSuccess);
            }
            c3079a.show();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m5761o(Act act, User user, String str, Integer num, d30 d30Var, Function1 function1, String str2, int i, Object obj) {
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
        m5760n(act, user, str, num, d30Var, function1, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m5762p(@NotNull final Act act, @NotNull User fromUser, @NotNull String message) {
        act.getClass();
        fromUser.getClass();
        message.getClass();
        CoreInnerPush.a aVar = new CoreInnerPush.a(((DbObject) fromUser).id);
        aVar.a = fromUser.name;
        aVar.b = message;
        aVar.c = fromUser.fp().profileSmall().formatted();
        aVar.k = 4000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.s(f6c0.A1, true).z((ViewGroup) decorView).x(xdl0.F0()).u(200L).q(aVar.k).y(aVar, new hd2.b() { // from class: l.wn5
            /* JADX INFO: renamed from: a */
            public final void m10529a(View view, Object obj) {
                bo5.m5753f(act, view, (CoreInnerPush.a) obj);
            }
        });
        nd2.j().s(hd2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m5763q(@NotNull Act act, @NotNull User targetUser) {
        act.getClass();
        targetUser.getClass();
        m5764r(act, targetUser, "success");
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m5764r(@NotNull final Act act, @NotNull User targetUser, @NotNull String complimentSentStatus) {
        act.getClass();
        targetUser.getClass();
        complimentSentStatus.getClass();
        cwf0 cwf0VarC = i0e.c("p_intl_compliment_success_popup", bo5.class.getName());
        if (cwf0VarC != null) {
            cwf0VarC.p(new j760[]{vwb.Y("compliment_sent_status", complimentSentStatus)});
        }
        i0e.f(cwf0VarC);
        zvf0.D("e_intl_compliment_toast_show", "p_navigation_view", new j760[]{vwb.Y("compliment_toast_type", "compliment"), vwb.Y("user_status", !xma.e4() ? "premium" : "other")});
        CoreInnerPush.a aVar = new CoreInnerPush.a(((DbObject) targetUser).id);
        aVar.a = App.e.getString(R.string.E9);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.e.getString(R.string.yb);
        string.getClass();
        aVar.b = String.format(string, Arrays.copyOf(new Object[]{targetUser.name}, 1));
        aVar.c = targetUser.fp().profileSmall().formatted();
        aVar.k = 2000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.s(f6c0.A1, true).z((ViewGroup) decorView).x(xdl0.F0()).u(200L).q(aVar.k).y(aVar, new hd2.b() { // from class: l.ao5
            /* JADX INFO: renamed from: a */
            public final void m5480a(View view, Object obj) {
                bo5.m5751d(act, view, (CoreInnerPush.a) obj);
            }
        });
        nd2.j().s(hd2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m5765s(@NotNull final Act act, @NotNull User fromUser) {
        act.getClass();
        fromUser.getClass();
        cwf0 cwf0VarC = i0e.c("p_intl_compliment_success_popup", bo5.class.getName());
        if (cwf0VarC != null) {
            cwf0VarC.p(new j760[]{vwb.Y("compliment_sent_status", "upgrade")});
        }
        i0e.f(cwf0VarC);
        zvf0.D("e_intl_compliment_toast_show", "p_navigation_view", new j760[]{vwb.Y("compliment_toast_type", "compliment"), vwb.Y("user_status", !xma.e4() ? "premium" : "other")});
        CoreInnerPush.a aVar = new CoreInnerPush.a(((DbObject) fromUser).id);
        aVar.a = App.e.getString(R.string.zb);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.e.getString(R.string.yb);
        string.getClass();
        aVar.b = String.format(string, Arrays.copyOf(new Object[]{fromUser.name}, 1));
        aVar.c = fromUser.fp().profileSmall().formatted();
        aVar.k = 4000L;
        hd2 hd2Var = new hd2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        hd2Var.s(f6c0.A1, true).z((ViewGroup) decorView).x(xdl0.F0()).u(200L).q(aVar.k).y(aVar, new hd2.b() { // from class: l.zn5
            /* JADX INFO: renamed from: a */
            public final void m11437a(View view, Object obj) {
                bo5.m5752e(act, view, (CoreInnerPush.a) obj);
            }
        });
        nd2.j().s(hd2Var);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5766h(final Act act) {
        final User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            return false;
        }
        if (CoreModule.c.e0.f8()) {
            qwp.m9049i().m9055n(act, true);
            return false;
        }
        if (CoreModule.c.e0.Z7()) {
            wm20.m10524m(act);
            return false;
        }
        if (ark.m5528F0(act, new Runnable() { // from class: l.vn5
            @Override // java.lang.Runnable
            public final void run() {
                bo5.m5749b(act, userP9);
            }
        })) {
            return false;
        }
        if (!userP9.isNameFake()) {
            return true;
        }
        ark.m5556T0(act);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final void m5756j(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static final void m5757k(Throwable th) {
    }
}
