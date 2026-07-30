package p149l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.mask.MaskModel;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJE\u0010\u0010\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/qm3;", "", "<init>", "()V", "", "u", "", "type", "", "n", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "func", "fail", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "r", "()Z", BaseSei.f13931Y, "Lrx/c;", "", BaseSei.f13930X, "(Ljava/lang/String;)Lrx/c;", "p", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)I", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ll/hpd0;", "a", "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/hpd0;", "savedUserMemoji", "Ll/c4g0;", "b", "Ll/c4g0;", "downSubscribe", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qm3 {

    @NotNull
    public static final qm3 INSTANCE = new qm3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy savedUserMemoji = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.fm3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qm3.m175535h();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static c4g0 downSubscribe;

    /* JADX INFO: renamed from: l.qm3$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/qm3$a", "Ll/vkd0;", "", "b", "()Ljava/lang/String;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19538a extends vkd0 {
        @Override // p149l.vkd0
        /* JADX INFO: renamed from: b */
        public String mo161783b() {
            String moMoVerificationAppId = qib0.f154713b0.f139233d.getMoMoVerificationAppId();
            moMoVerificationAppId.getClass();
            return moMoVerificationAppId;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m175528a(Dialog dialog, Function0 function0, Integer num) {
        f6w f6wVar = f6w.INSTANCE;
        num.getClass();
        f6wVar.m119696e0(dialog, num.intValue());
        if (num.intValue() == 100) {
            mkd0.m154992z(downSubscribe);
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m175529b(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m175530c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m175531d(Act act, String str, Function0 function0, Function0 function1, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        qa2.INSTANCE.m173681a("BuzzComboViewModel", "PermissionHelper granted " + z + " reason " + permissionDeniedReason);
        if (z) {
            INSTANCE.m175546q(act, str, function0, function1);
        } else if (function1 != null) {
            function1.invoke();
        }
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m175532e(MaskModel maskModel) {
        return Boolean.valueOf(maskModel != null);
    }

    /* JADX INFO: renamed from: f */
    public static void m175533f() {
        if (CoreModule.m29931H().signedIn_()) {
            dn3.INSTANCE.m112609w().subscribe(mkd0.m154956H(new e30() { // from class: l.lm3
                @Override // p149l.e30
                public final void call(Object obj) {
                    qm3.m175541v((Boolean) obj);
                }
            }, new e30() { // from class: l.mm3
                @Override // p149l.e30
                public final void call(Object obj) {
                    qm3.m175542w((Throwable) obj);
                }
            }));
            go3.INSTANCE.m127230h();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m175534g(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "memojiBuzzCheck error " + th.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static hpd0 m175535h() {
        return new hpd0("device_memoji_used", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public static Integer m175538k(String str, Notification notification) {
        int iM175548s = INSTANCE.m175548s(str);
        if (iM175548s == 100 && Intrinsics.m87488d(str, "memojiBuzz")) {
            dn3.INSTANCE.m112600G();
        }
        return Integer.valueOf(iM175548s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m175539m(qm3 qm3Var, Act act, String str, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "memojiBuzz";
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return qm3Var.m175543l(act, str, function0, function1);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m175540o(qm3 qm3Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "memojiBuzz";
        }
        return qm3Var.m175544n(str);
    }

    /* JADX INFO: renamed from: v */
    public static final void m175541v(Boolean bool) {
        qa2.INSTANCE.m173681a("BuzzCVManager", "init finish");
    }

    /* JADX INFO: renamed from: w */
    public static final void m175542w(Throwable th) {
        qa2.INSTANCE.m173681a("BuzzCVManager", "init error " + th.getMessage());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m175543l(@Nullable final Act act, @NotNull final String type, @Nullable final Function0<Unit> func, @Nullable final Function0<Unit> fail) {
        type.getClass();
        if (act == null) {
            return false;
        }
        m175545p();
        String[] strArr = zqx.m219898k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
        boolean zM79881b = PermissionHelper.m79881b((String[]) Arrays.copyOf(strArr, strArr.length));
        if (zM79881b && m175544n(type)) {
            if (func != null) {
                func.invoke();
            }
            return true;
        }
        if (zM79881b) {
            m175546q(act, type, func, fail);
            return false;
        }
        PermissionHelper.m79882c().m79900r((String[]) Arrays.copyOf(strArr, strArr.length)).m79905w(false).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.im3
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                qm3.m175531d(act, type, func, fail, z, permissionDeniedReason);
            }
        }).m79891i(act);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m175544n(@NotNull String type) {
        type.getClass();
        if (!go3.INSTANCE.m127227e()) {
            qa2.INSTANCE.m173681a("BuzzCVManager", "checkMemojiResLoad MomoSdkLoader not load ");
            return false;
        }
        dn3 dn3Var = dn3.INSTANCE;
        File fileM112603o = dn3Var.m112603o();
        if (fileM112603o == null || !fileM112603o.exists()) {
            qa2.INSTANCE.m173681a("BuzzCVManager", "checkMemojiResLoad faModel not exists");
            return false;
        }
        File fileM112604p = dn3Var.m112604p();
        if (fileM112604p == null || !fileM112604p.exists()) {
            qa2.INSTANCE.m173681a("BuzzCVManager", "checkMemojiResLoad fdModel not exists");
            return false;
        }
        if (!TextUtils.equals(type, "memojiBuzz")) {
            return true;
        }
        File fileM112606r = dn3Var.m112606r();
        if (fileM112606r != null && fileM112606r.exists()) {
            return true;
        }
        qa2.INSTANCE.m173681a("BuzzCVManager", "checkMemojiResLoad stylizeFace not exists");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m175545p() {
        qa2.INSTANCE.m173681a("BuzzCVManager", "init checkResDownloaderSDK ResDownloaderSDK.sContext " + ivc0.f115118g);
        if (ivc0.f115118g == null) {
            ivc0.m138543d(CoreModule.f17544b, new C19538a());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* JADX INFO: renamed from: q */
    public final void m175546q(Act act, String type, final Function0<Unit> func, final Function0<Unit> fail) {
        c4g0 c4g0Var = downSubscribe;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        final Dialog dialogM119682M = f6w.INSTANCE.m119682M(act);
        downSubscribe = act.duringCreated(m175551x(type)).subscribe(mkd0.m154956H(new e30() { // from class: l.jm3
            @Override // p149l.e30
            public final void call(Object obj) {
                qm3.m175528a(dialogM119682M, func, (Integer) obj);
            }
        }, new e30() { // from class: l.km3
            @Override // p149l.e30
            public final void call(Object obj) {
                qm3.m175534g(fail, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m175547r() {
        Boolean bool = m175549t().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final int m175548s(String type) {
        int i;
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzCVManager", "getCVResLoadPercent start " + System.currentTimeMillis());
        boolean zEquals = TextUtils.equals(type, "memojiBuzz");
        if (go3.INSTANCE.m127227e()) {
            i = zEquals ? 40 : 80;
        } else {
            i = 0;
        }
        dn3 dn3Var = dn3.INSTANCE;
        File fileM112603o = dn3Var.m112603o();
        if (fileM112603o != null && fileM112603o.exists()) {
            i += zEquals ? 15 : 20;
        }
        if (!zEquals) {
            return i;
        }
        File fileM112606r = dn3Var.m112606r();
        if (fileM112606r != null && fileM112606r.exists()) {
            i += 15;
        }
        File fileM112604p = dn3Var.m112604p();
        if (fileM112604p != null && fileM112604p.exists()) {
            i += 15;
        }
        if (new File(k9j.m145077I(), "StylizeFace").exists()) {
            i += 15;
        }
        qa2Var.m173681a("BuzzCVManager", "getCVResLoadPercent end " + System.currentTimeMillis());
        return i;
    }

    /* JADX INFO: renamed from: t */
    public final hpd0 m175549t() {
        return (hpd0) savedUserMemoji.getValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m175550u() {
        qa2.INSTANCE.m173681a("BuzzCVManager", "init, try start");
        m175545p();
        if (t49.m187152f()) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.hm3
                @Override // java.lang.Runnable
                public final void run() {
                    qm3.m175533f();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22306c<Integer> m175551x(final String type) {
        m175545p();
        ArrayList arrayList = new ArrayList();
        arrayList.add(go3.INSTANCE.m127229g());
        dn3 dn3Var = dn3.INSTANCE;
        arrayList.add(dn3Var.m112608t());
        if (TextUtils.equals(type, "memojiBuzz")) {
            arrayList.add(dn3Var.m112610x());
            C22306c<MaskModel> c22306cM112607s = dn3Var.m112607s();
            final Function1 function1 = new Function1() { // from class: l.nm3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qm3.m175532e((MaskModel) obj);
                }
            };
            arrayList.add(c22306cM112607s.map(new w9j() { // from class: l.om3
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return qm3.m175530c(function1, obj);
                }
            }));
        }
        C22306c c22306cMaterialize = C22306c.merge(arrayList).compose(mkd0.m154965Q()).materialize();
        final Function1 function2 = new Function1() { // from class: l.pm3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qm3.m175538k(type, (Notification) obj);
            }
        };
        C22306c<Integer> c22306cObserveOn = c22306cMaterialize.map(new w9j() { // from class: l.gm3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qm3.m175529b(function2, obj);
            }
        }).observeOn(jo0.m142408a());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    /* JADX INFO: renamed from: y */
    public final void m175552y() {
        m175549t().put(Boolean.TRUE);
    }
}
