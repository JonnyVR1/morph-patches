package p153l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.mask.MaskModel;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tencent.open.SocialConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJE\u0010\u0010\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/qn3;", "", "<init>", "()V", "", "u", "", "type", "", "n", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "func", "fail", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "r", "()Z", BaseSei.f14625Y, "Lrx/c;", "", BaseSei.f14624X, "(Ljava/lang/String;)Lrx/c;", "p", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)I", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ll/jxd0;", "a", "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/jxd0;", "savedUserMemoji", "Ll/kcg0;", "b", "Ll/kcg0;", "downSubscribe", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qn3 {

    @NotNull
    public static final qn3 INSTANCE = new qn3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy savedUserMemoji = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.fn3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qn3.m177186h();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static kcg0 downSubscribe;

    /* JADX INFO: renamed from: l.qn3$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/qn3$a", "Ll/ysd0;", "", "b", "()Ljava/lang/String;", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19606a extends ysd0 {
        @Override // p153l.ysd0
        /* JADX INFO: renamed from: b */
        public String mo160634b() {
            String moMoVerificationAppId = uqb0.f180396b0.f170327d.getMoMoVerificationAppId();
            moMoVerificationAppId.getClass();
            return moMoVerificationAppId;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m177179a(Dialog dialog, Function0 function0, Integer num) {
        d8w d8wVar = d8w.INSTANCE;
        num.getClass();
        d8wVar.m114981e0(dialog, num.intValue());
        if (num.intValue() == 100) {
            psd0.m173633z(downSubscribe);
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m177180b(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m177181c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m177182d(Act act, String str, Function0 function0, Function0 function1, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        xa2.INSTANCE.m209830a("BuzzComboViewModel", "PermissionHelper granted " + z + " reason " + permissionDeniedReason);
        if (z) {
            INSTANCE.m177197q(act, str, function0, function1);
        } else if (function1 != null) {
            function1.invoke();
        }
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m177183e(MaskModel maskModel) {
        return Boolean.valueOf(maskModel != null);
    }

    /* JADX INFO: renamed from: f */
    public static void m177184f() {
        if (CoreModule.m30929H().signedIn_()) {
            do3.INSTANCE.m117161w().subscribe(psd0.m173597H(new y20() { // from class: l.ln3
                @Override // p153l.y20
                public final void call(Object obj) {
                    qn3.m177192v((Boolean) obj);
                }
            }, new y20() { // from class: l.mn3
                @Override // p153l.y20
                public final void call(Object obj) {
                    qn3.m177193w((Throwable) obj);
                }
            }));
            gp3.INSTANCE.m131204h();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m177185g(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "memojiBuzzCheck error " + th.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static jxd0 m177186h() {
        return new jxd0("device_memoji_used", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public static Integer m177189k(String str, Notification notification) {
        int iM177199s = INSTANCE.m177199s(str);
        if (iM177199s == 100 && Intrinsics.m88377d(str, "memojiBuzz")) {
            do3.INSTANCE.m117152G();
        }
        return Integer.valueOf(iM177199s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m177190m(qn3 qn3Var, Act act, String str, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "memojiBuzz";
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return qn3Var.m177194l(act, str, function0, function1);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m177191o(qn3 qn3Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "memojiBuzz";
        }
        return qn3Var.m177195n(str);
    }

    /* JADX INFO: renamed from: v */
    public static final void m177192v(Boolean bool) {
        xa2.INSTANCE.m209830a("BuzzCVManager", "init finish");
    }

    /* JADX INFO: renamed from: w */
    public static final void m177193w(Throwable th) {
        xa2.INSTANCE.m209830a("BuzzCVManager", "init error " + th.getMessage());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m177194l(@Nullable final Act act, @NotNull final String type, @Nullable final Function0<Unit> func, @Nullable final Function0<Unit> fail) {
        type.getClass();
        if (act == null) {
            return false;
        }
        m177196p();
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
        boolean zM81064b = PermissionHelper.m81064b((String[]) Arrays.copyOf(strArr, strArr.length));
        if (zM81064b && m177195n(type)) {
            if (func != null) {
                func.invoke();
            }
            return true;
        }
        if (zM81064b) {
            m177197q(act, type, func, fail);
            return false;
        }
        PermissionHelper.m81065c().m81083r((String[]) Arrays.copyOf(strArr, strArr.length)).m81088w(false).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.in3
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                qn3.m177182d(act, type, func, fail, z, permissionDeniedReason);
            }
        }).m81074i(act);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m177195n(@NotNull String type) {
        type.getClass();
        if (!gp3.INSTANCE.m131201e()) {
            xa2.INSTANCE.m209830a("BuzzCVManager", "checkMemojiResLoad MomoSdkLoader not load ");
            return false;
        }
        do3 do3Var = do3.INSTANCE;
        File fileM117155o = do3Var.m117155o();
        if (fileM117155o == null || !fileM117155o.exists()) {
            xa2.INSTANCE.m209830a("BuzzCVManager", "checkMemojiResLoad faModel not exists");
            return false;
        }
        File fileM117156p = do3Var.m117156p();
        if (fileM117156p == null || !fileM117156p.exists()) {
            xa2.INSTANCE.m209830a("BuzzCVManager", "checkMemojiResLoad fdModel not exists");
            return false;
        }
        if (!TextUtils.equals(type, "memojiBuzz")) {
            return true;
        }
        File fileM117158r = do3Var.m117158r();
        if (fileM117158r != null && fileM117158r.exists()) {
            return true;
        }
        xa2.INSTANCE.m209830a("BuzzCVManager", "checkMemojiResLoad stylizeFace not exists");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m177196p() {
        xa2.INSTANCE.m209830a("BuzzCVManager", "init checkResDownloaderSDK ResDownloaderSDK.sContext " + l3d0.f129865g);
        if (l3d0.f129865g == null) {
            l3d0.m152690d(CoreModule.f18263b, new C19606a());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* JADX INFO: renamed from: q */
    public final void m177197q(Act act, String type, final Function0<Unit> func, final Function0<Unit> fail) {
        kcg0 kcg0Var = downSubscribe;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        final Dialog dialogM114967M = d8w.INSTANCE.m114967M(act);
        downSubscribe = act.duringCreated(m177202x(type)).subscribe(psd0.m173597H(new y20() { // from class: l.jn3
            @Override // p153l.y20
            public final void call(Object obj) {
                qn3.m177179a(dialogM114967M, func, (Integer) obj);
            }
        }, new y20() { // from class: l.kn3
            @Override // p153l.y20
            public final void call(Object obj) {
                qn3.m177185g(fail, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m177198r() {
        Boolean bool = m177200t().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final int m177199s(String type) {
        int i;
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzCVManager", "getCVResLoadPercent start " + System.currentTimeMillis());
        boolean zEquals = TextUtils.equals(type, "memojiBuzz");
        if (gp3.INSTANCE.m131201e()) {
            i = zEquals ? 40 : 80;
        } else {
            i = 0;
        }
        do3 do3Var = do3.INSTANCE;
        File fileM117155o = do3Var.m117155o();
        if (fileM117155o != null && fileM117155o.exists()) {
            i += zEquals ? 15 : 20;
        }
        if (!zEquals) {
            return i;
        }
        File fileM117158r = do3Var.m117158r();
        if (fileM117158r != null && fileM117158r.exists()) {
            i += 15;
        }
        File fileM117156p = do3Var.m117156p();
        if (fileM117156p != null && fileM117156p.exists()) {
            i += 15;
        }
        if (new File(ecj.m120375I(), "StylizeFace").exists()) {
            i += 15;
        }
        xa2Var.m209830a("BuzzCVManager", "getCVResLoadPercent end " + System.currentTimeMillis());
        return i;
    }

    /* JADX INFO: renamed from: t */
    public final jxd0 m177200t() {
        return (jxd0) savedUserMemoji.getValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m177201u() {
        xa2.INSTANCE.m209830a("BuzzCVManager", "init, try start");
        m177196p();
        if (c69.m108120f()) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.hn3
                @Override // java.lang.Runnable
                public final void run() {
                    qn3.m177184f();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22421c<Integer> m177202x(final String type) {
        m177196p();
        ArrayList arrayList = new ArrayList();
        arrayList.add(gp3.INSTANCE.m131203g());
        do3 do3Var = do3.INSTANCE;
        arrayList.add(do3Var.m117160t());
        if (TextUtils.equals(type, "memojiBuzz")) {
            arrayList.add(do3Var.m117162x());
            C22421c<MaskModel> c22421cM117159s = do3Var.m117159s();
            final Function1 function1 = new Function1() { // from class: l.nn3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qn3.m177183e((MaskModel) obj);
                }
            };
            arrayList.add(c22421cM117159s.map(new qcj() { // from class: l.on3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return qn3.m177181c(function1, obj);
                }
            }));
        }
        C22421c c22421cMaterialize = C22421c.merge(arrayList).compose(psd0.m173606Q()).materialize();
        final Function1 function2 = new Function1() { // from class: l.pn3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qn3.m177189k(type, (Notification) obj);
            }
        };
        C22421c<Integer> c22421cObserveOn = c22421cMaterialize.map(new qcj() { // from class: l.gn3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qn3.m177180b(function2, obj);
            }
        }).observeOn(fo0.m126432a());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    /* JADX INFO: renamed from: y */
    public final void m177203y() {
        m177200t().put(Boolean.TRUE);
    }
}
