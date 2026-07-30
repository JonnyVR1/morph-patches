package p153l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J3\u0010\f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J3\u0010\u001f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/vb10;", "", "<init>", "()V", "", ResourceDirection.f39656v, "Ll/i6t;", "presenter", "", "category", "Lkotlin/Function0;", "grantedAction", "o", "(Ll/i6t;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", Constants.KEY_T, "q", "(Ll/i6t;Lkotlin/jvm/functions/Function0;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "action", "n", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Z", "r", BaseSei.f14624X, "w", "(Lcom/p1/mobile/android/app/Act;)V", BaseSei.f14626Z, "Lkotlin/Function1;", "u", "(Ll/i6t;Lkotlin/jvm/functions/Function1;)V", "a", "Z", "hasZhiMaAuth", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vb10 {

    @NotNull
    public static final vb10 INSTANCE = new vb10();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean hasZhiMaAuth;

    /* JADX INFO: renamed from: a */
    public static void m200648a(Function1 function1, Throwable th) {
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static void m200649b(i6t i6tVar, Function0 function0, boolean z, Act act) {
        if (!wft.m206159b(2)) {
            vb10 vb10Var = INSTANCE;
            if (vb10Var.m200667r()) {
                vb10Var.m200666q(i6tVar, function0);
                return;
            } else {
                function0.invoke();
                return;
            }
        }
        if (z) {
            INSTANCE.m200673z(i6tVar, function0);
            return;
        }
        vb10 vb10Var2 = INSTANCE;
        act.getClass();
        vb10Var2.m200664n(act, function0);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m200651d(String str, i6t i6tVar, final Function0 function0) {
        wgt.m206250q(i6tVar.act(), Intrinsics.m88377d(cd10.f81081i, str) ? iit.INSTANCE.m140130P() : iit.INSTANCE.m140133S(), R$string.f48113gj, new x20() { // from class: l.mb10
            @Override // p153l.x20
            public final void call() {
                vb10.m200661p(function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m200652e(Act act, View view) {
        act.startActivity(LiveWebViewAct.m70067e2(act, efv.f93855l, LiveWebViewAct.f45696m));
    }

    /* JADX INFO: renamed from: f */
    public static Unit m200653f(Function0 function0, i6t i6tVar, boolean z) {
        if (z) {
            hasZhiMaAuth = true;
            function0.invoke();
        } else {
            vb10 vb10Var = INSTANCE;
            Act act = i6tVar.act();
            act.getClass();
            vb10Var.m200671w(act);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static void m200655h(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: i */
    public static void m200656i(Act act, final Function0 function0) {
        uqb0.f180396b0.f170325b.showBindPhoneDialog(act, new x20() { // from class: l.ub10
            @Override // p153l.x20
            public final void call() {
                vb10.m200663y(function0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m200657j(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        hasZhiMaAuth = z;
    }

    /* JADX INFO: renamed from: k */
    public static void m200658k(Function0 function0, boolean z) {
        function0.invoke();
        hasZhiMaAuth = z;
    }

    /* JADX INFO: renamed from: l */
    public static void m200659l(Runnable runnable, View view) {
        runnable.run();
    }

    /* JADX INFO: renamed from: m */
    public static void m200660m(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        ir10.m141746a("permission denied by user");
        o1j0.m165649w(R$string.f47655L8);
    }

    /* JADX INFO: renamed from: p */
    public static final void m200661p(Function0 function0) {
        function0.invoke();
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m200662v() {
        hasZhiMaAuth = false;
    }

    /* JADX INFO: renamed from: y */
    public static final void m200663y(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public final void m200664n(Act act, Function0<Unit> action) {
        if (m200668s()) {
            m200672x(act, action);
        } else {
            action.invoke();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m200665o(@NotNull final i6t<?, ?> presenter, @NotNull final String category, @NotNull final Function0<Unit> grantedAction) {
        presenter.getClass();
        category.getClass();
        grantedAction.getClass();
        m200669t(presenter, category, new Function0() { // from class: l.ib10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vb10.m200651d(category, presenter, grantedAction);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m200666q(i6t<?, ?> presenter, final Function0<Unit> grantedAction) {
        Act act = presenter.act();
        String string = act.getString(R$string.f47603J0);
        string.getClass();
        presenter.duringCreated(zrv.f205799a.m207687p0(act, string)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.pb10
            @Override // p153l.y20
            public final void call(Object obj) {
                vb10.m200658k(grantedAction, ((Boolean) obj).booleanValue());
            }
        }, new y20() { // from class: l.qb10
            @Override // p153l.y20
            public final void call(Object obj) {
                vb10.m200655h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m200667r() {
        Settings settings;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (!NullChecker.m82486a(userMe_) || (settings = userMe_.settings) == null) {
            return true;
        }
        settings.getClass();
        if (!TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return false;
        }
        Settings settings2 = userMe_.settings;
        settings2.getClass();
        return TextUtils.isEmpty(settings2.phoneNumber.number);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m200668s() {
        Settings settings;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (!NullChecker.m82486a(userMe_) || (settings = userMe_.settings) == null) {
            return true;
        }
        settings.getClass();
        if (!TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return false;
        }
        Settings settings2 = userMe_.settings;
        settings2.getClass();
        if (TextUtils.isEmpty(settings2.phoneNumber.number)) {
            return TEnum.equals(userMe_.source, "wechat") || TEnum.equals(userMe_.source, "qq") || TEnum.equals(userMe_.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m200669t(final i6t<?, ?> presenter, String category, final Function0<Unit> grantedAction) {
        final Act act = presenter.act();
        final boolean zM88377d = Intrinsics.m88377d(cd10.f81081i, category);
        PermissionHelper.m81065c().m81082q(zM88377d ? CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}) : CollectionsKt.listOf("android.permission.RECORD_AUDIO")).m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.nb10
            @Override // p153l.x20
            public final void call() {
                vb10.m200649b(presenter, grantedAction, zM88377d, act);
            }
        }, new y20() { // from class: l.ob10
            @Override // p153l.y20
            public final void call(Object obj) {
                vb10.m200660m((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: u */
    public final void m200670u(i6t<?, ?> presenter, final Function1<? super Boolean, Unit> grantedAction) {
        presenter.duringCreated(LivingNormalApiProvider.m72802x7()).subscribe(dhw.m115826e(new y20() { // from class: l.jb10
            @Override // p153l.y20
            public final void call(Object obj) {
                vb10.m200657j(grantedAction, ((Boolean) obj).booleanValue());
            }
        }, new y20() { // from class: l.kb10
            @Override // p153l.y20
            public final void call(Object obj) {
                vb10.m200648a(grantedAction, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m200671w(final Act act) {
        new th0.C20312a(act).m191160s(xau.m209910t(R$string.f47450C1)).m191151j(xau.m209910t(R$string.f47878W0)).m191159r(xau.m209910t(R$string.f48516z5)).m191156o(new View.OnClickListener() { // from class: l.lb10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vb10.m200652e(act, view);
            }
        }).m191147f(xau.m209910t(R$string.f47690N1)).m191148g(false).m191149h(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: x */
    public final void m200672x(final Act act, final Function0<Unit> action) {
        final Runnable runnable = new Runnable() { // from class: l.sb10
            @Override // java.lang.Runnable
            public final void run() {
                vb10.m200656i(act, action);
            }
        };
        new th0.C20312a(act).m191150i(R$string.f47869Vc).m191158q(R$string.f47559H0).m191156o(new View.OnClickListener() { // from class: l.tb10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vb10.m200659l(runnable, view);
            }
        }).m191146e(R$string.f47961a).m191148g(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: z */
    public final void m200673z(final i6t<?, ?> presenter, final Function0<Unit> grantedAction) {
        if (hasZhiMaAuth) {
            grantedAction.invoke();
        } else {
            m200670u(presenter, new Function1() { // from class: l.rb10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vb10.m200653f(grantedAction, presenter, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
