package p149l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J3\u0010\f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J3\u0010\u001f\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m87232d2 = {"Ll/l310;", "", "<init>", "()V", "", ResourceDirection.f38808v, "Ll/h4t;", "presenter", "", "category", "Lkotlin/Function0;", "grantedAction", "o", "(Ll/h4t;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", Constants.KEY_T, "q", "(Ll/h4t;Lkotlin/jvm/functions/Function0;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "action", "n", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Z", "r", BaseSei.f13930X, "w", "(Lcom/p1/mobile/android/app/Act;)V", BaseSei.f13932Z, "Lkotlin/Function1;", "u", "(Ll/h4t;Lkotlin/jvm/functions/Function1;)V", "a", "Z", "hasZhiMaAuth", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class l310 {

    @NotNull
    public static final l310 INSTANCE = new l310();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean hasZhiMaAuth;

    /* JADX INFO: renamed from: a */
    public static void m148333a(Function1 function1, Throwable th) {
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static void m148334b(h4t h4tVar, Function0 function0, boolean z, Act act) {
        if (!vdt.m198092b(2)) {
            l310 l310Var = INSTANCE;
            if (l310Var.m148352r()) {
                l310Var.m148351q(h4tVar, function0);
                return;
            } else {
                function0.invoke();
                return;
            }
        }
        if (z) {
            INSTANCE.m148358z(h4tVar, function0);
            return;
        }
        l310 l310Var2 = INSTANCE;
        act.getClass();
        l310Var2.m148349n(act, function0);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m148336d(String str, h4t h4tVar, final Function0 function0) {
        vet.m198233q(h4tVar.act(), Intrinsics.m87488d(s410.f162243i, str) ? hgt.INSTANCE.m130909P() : hgt.INSTANCE.m130912S(), R$string.f47265gj, new d30() { // from class: l.c310
            @Override // p149l.d30
            public final void call() {
                l310.m148346p(function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m148337e(Act act, View view) {
        act.startActivity(LiveWebViewAct.m68884d2(act, ddv.f85662l, LiveWebViewAct.f44848m));
    }

    /* JADX INFO: renamed from: f */
    public static Unit m148338f(Function0 function0, h4t h4tVar, boolean z) {
        if (z) {
            hasZhiMaAuth = true;
            function0.invoke();
        } else {
            l310 l310Var = INSTANCE;
            Act act = h4tVar.act();
            act.getClass();
            l310Var.m148356w(act);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static void m148340h(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: i */
    public static void m148341i(Act act, final Function0 function0) {
        qib0.f154713b0.f139231b.showBindPhoneDialog(act, new d30() { // from class: l.k310
            @Override // p149l.d30
            public final void call() {
                l310.m148348y(function0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m148342j(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        hasZhiMaAuth = z;
    }

    /* JADX INFO: renamed from: k */
    public static void m148343k(Function0 function0, boolean z) {
        function0.invoke();
        hasZhiMaAuth = z;
    }

    /* JADX INFO: renamed from: l */
    public static void m148344l(Runnable runnable, View view) {
        runnable.run();
    }

    /* JADX INFO: renamed from: m */
    public static void m148345m(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        yi10.m214879a("permission denied by user");
        lsi0.m151593w(R$string.f46807L8);
    }

    /* JADX INFO: renamed from: p */
    public static final void m148346p(Function0 function0) {
        function0.invoke();
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m148347v() {
        hasZhiMaAuth = false;
    }

    /* JADX INFO: renamed from: y */
    public static final void m148348y(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public final void m148349n(Act act, Function0<Unit> action) {
        if (m148353s()) {
            m148357x(act, action);
        } else {
            action.invoke();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m148350o(@NotNull final h4t<?, ?> presenter, @NotNull final String category, @NotNull final Function0<Unit> grantedAction) {
        presenter.getClass();
        category.getClass();
        grantedAction.getClass();
        m148354t(presenter, category, new Function0() { // from class: l.y210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l310.m148336d(category, presenter, grantedAction);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m148351q(h4t<?, ?> presenter, final Function0<Unit> grantedAction) {
        Act act = presenter.act();
        String string = act.getString(R$string.f46755J0);
        string.getClass();
        presenter.duringCreated(ypv.f199493a.m199365p0(act, string)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.f310
            @Override // p149l.e30
            public final void call(Object obj) {
                l310.m148343k(grantedAction, ((Boolean) obj).booleanValue());
            }
        }, new e30() { // from class: l.g310
            @Override // p149l.e30
            public final void call(Object obj) {
                l310.m148340h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m148352r() {
        Settings settings;
        User userMe_ = qib0.f154713b0.f139231b.me_();
        if (!NullChecker.m81303a(userMe_) || (settings = userMe_.settings) == null) {
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
    public final boolean m148353s() {
        Settings settings;
        User userMe_ = qib0.f154713b0.f139231b.me_();
        if (!NullChecker.m81303a(userMe_) || (settings = userMe_.settings) == null) {
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
    public final void m148354t(final h4t<?, ?> presenter, String category, final Function0<Unit> grantedAction) {
        final Act act = presenter.act();
        final boolean zM87488d = Intrinsics.m87488d(s410.f162243i, category);
        PermissionHelper.m79882c().m79899q(zM87488d ? CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}) : CollectionsKt.listOf("android.permission.RECORD_AUDIO")).m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.d310
            @Override // p149l.d30
            public final void call() {
                l310.m148334b(presenter, grantedAction, zM87488d, act);
            }
        }, new e30() { // from class: l.e310
            @Override // p149l.e30
            public final void call(Object obj) {
                l310.m148345m((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: u */
    public final void m148355u(h4t<?, ?> presenter, final Function1<? super Boolean, Unit> grantedAction) {
        presenter.duringCreated(LivingNormalApiProvider.m71619x7()).subscribe(ffw.m121194e(new e30() { // from class: l.z210
            @Override // p149l.e30
            public final void call(Object obj) {
                l310.m148342j(grantedAction, ((Boolean) obj).booleanValue());
            }
        }, new e30() { // from class: l.a310
            @Override // p149l.e30
            public final void call(Object obj) {
                l310.m148333a(grantedAction, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m148356w(final Act act) {
        new xh0.C21150a(act).m208740s(w8u.m202217t(R$string.f46602C1)).m208731j(w8u.m202217t(R$string.f47030W0)).m208739r(w8u.m202217t(R$string.f47668z5)).m208736o(new View.OnClickListener() { // from class: l.b310
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l310.m148337e(act, view);
            }
        }).m208727f(w8u.m202217t(R$string.f46842N1)).m208728g(false).m208729h(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: x */
    public final void m148357x(final Act act, final Function0<Unit> action) {
        final Runnable runnable = new Runnable() { // from class: l.i310
            @Override // java.lang.Runnable
            public final void run() {
                l310.m148341i(act, action);
            }
        };
        new xh0.C21150a(act).m208730i(R$string.f47021Vc).m208738q(R$string.f46711H0).m208736o(new View.OnClickListener() { // from class: l.j310
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l310.m148344l(runnable, view);
            }
        }).m208726e(R$string.f47113a).m208728g(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: z */
    public final void m148358z(final h4t<?, ?> presenter, final Function0<Unit> grantedAction) {
        if (hasZhiMaAuth) {
            grantedAction.invoke();
        } else {
            m148355u(presenter, new Function1() { // from class: l.h310
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l310.m148338f(grantedAction, presenter, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
