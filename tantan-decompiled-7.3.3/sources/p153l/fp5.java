package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.p058ui.compliment.DialogC8467a;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0019J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/fp5;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "photoIndex", "Ll/x20;", "onDismiss", "Lkotlin/Function1;", "", "onComplimentSentSuccess", "liveRoomInfo", "n", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ll/x20;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "fromUser", "message", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/jvm/functions/Function1;", "q", "complimentSentStatus", "r", "", "h", "(Lcom/p1/mobile/android/app/Act;)Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fp5 {

    @NotNull
    public static final fp5 INSTANCE = new fp5();

    /* JADX INFO: renamed from: b */
    public static void m126521b(Act act, User user) {
        act.startActivityForResult(MediaPickerAct.m48968h2(act, 1, false, false, true, null, MediaPickerAct.f31471D, false, true, user.gender), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m126522c(User user) {
        user.getClass();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e != null && !jyb.m147479J(partialListOptM222761e.loaded) && TextUtils.equals(partialListOptM222761e.loaded.get(0).f20214id, user.f56859id)) {
            CoreModule.f18264c.f20405m0.m31989C8("compliment_sent");
        }
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e2 = CoreModule.f18264c.f20411o0.f20805Y.m222761e();
        if (partialListOptM222761e2 != null && !jyb.m147479J(partialListOptM222761e2.loaded)) {
            List<CoreSuggested.UserInfo> list = partialListOptM222761e2.loaded;
            list.getClass();
            List<CoreSuggested.UserInfo> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (CoreSuggested.UserInfo userInfo : list2) {
                    if (userInfo != null && TextUtils.equals(userInfo.f20214id, user.f56859id)) {
                        CoreModule.f18264c.f20411o0.m35323W3(user.f56859id);
                        break;
                    }
                }
            }
        }
        CoreModule.f18264c.f20384f0.m33976gp(user.f56859id).subscribe(psd0.m173597H(new y20() { // from class: l.bp5
            @Override // p153l.y20
            public final void call(Object obj) {
                fp5.m126528j((uxj0) obj);
            }
        }, new y20() { // from class: l.cp5
            @Override // p153l.y20
            public final void call(Object obj) {
                fp5.m126529k((Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m126523d(Act act, View view, CoreInnerPush.C4867a c4867a) {
        if (view instanceof sum) {
            ((sum) view).mo40232a(act, c4867a, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m126524e(Act act, View view, CoreInnerPush.C4867a c4867a) {
        if (view instanceof sum) {
            ((sum) view).mo40232a(act, c4867a, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static void m126525f(Act act, View view, CoreInnerPush.C4867a c4867a) {
        if (view instanceof sum) {
            ((sum) view).mo40232a(act, c4867a, null, null);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Function1<User, Unit> m126527i() {
        return new Function1() { // from class: l.yo5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fp5.m126522c((User) obj);
            }
        };
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: l */
    public static final void m126530l(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num) {
        act.getClass();
        user.getClass();
        m126533o(act, user, str, num, null, null, null, 112, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public static final void m126531m(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable x20 x20Var, @Nullable Function1<? super User, Unit> function1) {
        act.getClass();
        user.getClass();
        m126533o(act, user, str, num, x20Var, function1, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public static final void m126532n(@NotNull Act act, @NotNull User targetUser, @Nullable String from, @Nullable Integer photoIndex, @Nullable x20 onDismiss, @Nullable Function1<? super User, Unit> onComplimentSentSuccess, @Nullable String liveRoomInfo) {
        act.getClass();
        targetUser.getClass();
        if (INSTANCE.m126538h(act)) {
            gp5.m131231e(act, from);
            DialogC8467a dialogC8467a = new DialogC8467a(act, targetUser, from, photoIndex, liveRoomInfo);
            dialogC8467a.m45881N1(onDismiss);
            if (onComplimentSentSuccess != null) {
                dialogC8467a.m45879M1(onComplimentSentSuccess);
            }
            dialogC8467a.show();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m126533o(Act act, User user, String str, Integer num, x20 x20Var, Function1 function1, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = 0;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        m126532n(act, user, str, num, x20Var, function1, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m126534p(@NotNull final Act act, @NotNull User fromUser, @NotNull String message) {
        act.getClass();
        fromUser.getClass();
        message.getClass();
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a(fromUser.f56859id);
        c4867a.f19916a = fromUser.name;
        c4867a.f19917b = message;
        c4867a.f19918c = fromUser.m61308fp().profileSmall().formatted();
        c4867a.f19926k = 4000L;
        od2 od2Var = new od2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        od2Var.m167268s(kec0.f125317A1, true).m167275z((ViewGroup) decorView).m167273x(bnl0.m105511F0()).m167270u(200L).m167266q(c4867a.f19926k).m167274y(c4867a, new od2.InterfaceC19107b() { // from class: l.ap5
            @Override // p153l.od2.InterfaceC19107b
            /* JADX INFO: renamed from: a */
            public final void mo99267a(View view, Object obj) {
                fp5.m126525f(act, view, (CoreInnerPush.C4867a) obj);
            }
        });
        ud2.m195456j().m195472s(od2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m126535q(@NotNull Act act, @NotNull User targetUser) {
        act.getClass();
        targetUser.getClass();
        m126536r(act, targetUser, "success");
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m126536r(@NotNull final Act act, @NotNull User targetUser, @NotNull String complimentSentStatus) {
        act.getClass();
        targetUser.getClass();
        complimentSentStatus.getClass();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_compliment_success_popup", fp5.class.getName());
        if (l4g0VarM204399c != null) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("compliment_sent_status", complimentSentStatus));
        }
        w1e.m204402f(l4g0VarM204399c);
        i4g0.m138495D("e_intl_compliment_toast_show", OMSDialogPositon.p_navigation_view, jyb.m147494Y("compliment_toast_type", "compliment"), jyb.m147494Y("user_status", !joa.m146386f4() ? "premium" : "other"));
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a(targetUser.f56859id);
        c4867a.f19916a = App.f16088e.getString(R$string.f18636L9);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.f16088e.getString(R$string.f18698Nb);
        string.getClass();
        c4867a.f19917b = String.format(string, Arrays.copyOf(new Object[]{targetUser.name}, 1));
        c4867a.f19918c = targetUser.m61308fp().profileSmall().formatted();
        c4867a.f19926k = 2000L;
        od2 od2Var = new od2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        od2Var.m167268s(kec0.f125317A1, true).m167275z((ViewGroup) decorView).m167273x(bnl0.m105511F0()).m167270u(200L).m167266q(c4867a.f19926k).m167274y(c4867a, new od2.InterfaceC19107b() { // from class: l.ep5
            @Override // p153l.od2.InterfaceC19107b
            /* JADX INFO: renamed from: a */
            public final void mo99267a(View view, Object obj) {
                fp5.m126523d(act, view, (CoreInnerPush.C4867a) obj);
            }
        });
        ud2.m195456j().m195472s(od2Var);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m126537s(@NotNull final Act act, @NotNull User fromUser) {
        act.getClass();
        fromUser.getClass();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_compliment_success_popup", fp5.class.getName());
        if (l4g0VarM204399c != null) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("compliment_sent_status", "upgrade"));
        }
        w1e.m204402f(l4g0VarM204399c);
        i4g0.m138495D("e_intl_compliment_toast_show", OMSDialogPositon.p_navigation_view, jyb.m147494Y("compliment_toast_type", "compliment"), jyb.m147494Y("user_status", !joa.m146386f4() ? "premium" : "other"));
        CoreInnerPush.C4867a c4867a = new CoreInnerPush.C4867a(fromUser.f56859id);
        c4867a.f19916a = App.f16088e.getString(R$string.f18728Ob);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = App.f16088e.getString(R$string.f18698Nb);
        string.getClass();
        c4867a.f19917b = String.format(string, Arrays.copyOf(new Object[]{fromUser.name}, 1));
        c4867a.f19918c = fromUser.m61308fp().profileSmall().formatted();
        c4867a.f19926k = 4000L;
        od2 od2Var = new od2(act);
        View decorView = act.getWindow().getDecorView();
        decorView.getClass();
        od2Var.m167268s(kec0.f125317A1, true).m167275z((ViewGroup) decorView).m167273x(bnl0.m105511F0()).m167270u(200L).m167266q(c4867a.f19926k).m167274y(c4867a, new od2.InterfaceC19107b() { // from class: l.dp5
            @Override // p153l.od2.InterfaceC19107b
            /* JADX INFO: renamed from: a */
            public final void mo99267a(View view, Object obj) {
                fp5.m126524e(act, view, (CoreInnerPush.C4867a) obj);
            }
        });
        ud2.m195456j().m195472s(od2Var);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m126538h(final Act act) {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            return false;
        }
        if (CoreModule.f18264c.f20381e0.m116559f8()) {
            qyp.m178723i().m178729n(act, true);
            return false;
        }
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            gv20.m132478m(act);
            return false;
        }
        if (qtk.m177971F0(act, new Runnable() { // from class: l.zo5
            @Override // java.lang.Runnable
            public final void run() {
                fp5.m126521b(act, userM116600p9);
            }
        })) {
            return false;
        }
        if (!userM116600p9.isNameFake()) {
            return true;
        }
        qtk.m177999T0(act);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final void m126528j(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: k */
    public static final void m126529k(Throwable th) {
    }
}
