package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p074ss.bytertc.engine.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006!"}, m88121d2 = {"Ll/no3;", "Ll/ar2;", "Ll/zo3;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "a0", "q0", "", "hidden", "r0", "(Z)V", "s0", "()Z", "", "Ll/pf60;", "", "Ll/x20;", "m0", "()Ljava/util/Collection;", "t0", "Ll/kcg0;", "a", "Ll/kcg0;", "lbStatusSub", "b", "mbWarnSub", "c", "privilegeSub", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class no3 extends ar2<zo3> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public kcg0 lbStatusSub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kcg0 mbWarnSub;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public kcg0 privilegeSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no3(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m164024e0(no3 no3Var, LoveBuzzData loveBuzzData) {
        ((zo3) no3Var.viewModel).m220715S();
        ((zo3) no3Var.viewModel).m220716T();
        ((zo3) no3Var.viewModel).m220718V(loveBuzzData);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m164026g0(final no3 no3Var) {
        Dialog.C4460e c4460eDialog;
        Dialog.C4460e c4460eM21534e0;
        Dialog.C4460e c4460eM21536g0;
        Dialog dialogM21566z;
        Act act = no3Var.act();
        if (act == null || (c4460eDialog = act.dialog()) == null || (c4460eM21534e0 = c4460eDialog.m21534e0(jyb.m147507f0("清除buzz促销弹窗信息", "memoji buzz高质量", "memoji buzz低质量", "memoji 删除Face 222采集model ", "memoji 删除Memoji model ", "memoji 删除Memoji 3D贴纸 ", "buzz探币充值弹窗", "buzz权益购买弹窗", "购买弹窗清除缓存数据"))) == null || (c4460eM21536g0 = c4460eM21534e0.m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ko3
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                no3.m164032n0(this.f127678a, dialog, view, i, charSequence);
            }
        })) == null || (dialogM21566z = c4460eM21536g0.m21566z()) == null) {
            return;
        }
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m164027h0(no3 no3Var, UserPrivilege userPrivilege) {
        zo3 zo3Var = (zo3) no3Var.viewModel;
        if (zo3Var != null) {
            zo3Var.m220716T();
        }
        haw.INSTANCE.m134320a().m134317x0(no3Var.act());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m164029j0(no3 no3Var, Bundle bundle) {
        ((zo3) no3Var.viewModel).m220725r();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m164031l0(no3 no3Var, String str) {
        if (Intrinsics.m88377d("voiceBuzz_warn", str) || Intrinsics.m88377d("videoBuzz_warn", str) || Intrinsics.m88377d("memojiBuzz_warn", str)) {
            d8w.INSTANCE.m114979c0(no3Var.act());
            haw.INSTANCE.m134320a().m134270H0().m137019l("");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m164032n0(no3 no3Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                new byd0("love_buzz_promo_premium_show_time_" + CoreModule.m30929H().userId(), -1L).put(-1L);
                new byd0("love_buzz_user_click_time_" + CoreModule.m30929H().userId(), -1L).put(-1L);
                break;
            case 1:
                new vxd0("debug_low_device", -1).put(0);
                break;
            case 2:
                new vxd0("debug_low_device", -1).put(1);
                break;
            case 3:
                File fileM97270c = af00.m97267b().m97270c("mmcv_android_fa_model");
                if (fileM97270c != null && fileM97270c.exists()) {
                    oki.m168023k(fileM97270c);
                }
                File fileM97270c2 = af00.m97267b().m97270c("mmcv_android_222_small_fd_model");
                if (fileM97270c2 != null && fileM97270c2.exists()) {
                    oki.m168023k(fileM97270c2);
                }
                File fileM97270c3 = af00.m97267b().m97270c("mmcv_android_222_big_fd_model");
                if (fileM97270c3 != null && fileM97270c3.exists()) {
                    oki.m168023k(fileM97270c3);
                    break;
                }
                break;
            case 4:
                File fileM97270c4 = af00.m97267b().m97270c("mmcv_android_small_stylize_face_model");
                if (fileM97270c4 != null && fileM97270c4.exists()) {
                    oki.m168023k(fileM97270c4);
                }
                File fileM97270c5 = af00.m97267b().m97270c("mmcv_android_stylize_face_model");
                if (fileM97270c5 != null && fileM97270c5.exists()) {
                    oki.m168023k(fileM97270c5);
                    break;
                }
                break;
            case 5:
                File file = new File(ecj.m120375I(), "StylizeFace");
                if (file.exists()) {
                    oki.m168023k(file);
                }
                break;
            case 6:
                CoreModule.f18273l.m143410g().mo36078sm(no3Var.act(), BuildConfig.BUILD_TYPE, j8w.INSTANCE.m143910h("textBuzz"), new y20() { // from class: l.lo3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        no3.m164033o0((PurchaseType) obj);
                    }
                });
                break;
            case 7:
                d8w.INSTANCE.m114969Q(no3Var.act(), "textBuzz", BuildConfig.BUILD_TYPE, new Function0() { // from class: l.mo3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return no3.m164034p0();
                    }
                });
                break;
            case 8:
                String str = "buzz_consume_tips_shown" + CoreModule.m30929H().userId();
                Boolean bool = Boolean.FALSE;
                new jxd0(str, bool).put(bool);
                String str2 = "buzz_consume_tips_" + CoreModule.m30929H().userId();
                Boolean bool2 = Boolean.TRUE;
                new jxd0(str2, bool2).put(bool2);
                break;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m164034p0() {
        return Unit.INSTANCE;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m164036q0();
        creates(new y20() { // from class: l.go3
            @Override // p153l.y20
            public final void call(Object obj) {
                no3.m164029j0(this.f105203a, (Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
        psd0.m173633z(this.lbStatusSub);
        psd0.m173633z(this.mbWarnSub);
        psd0.m173633z(this.privilegeSub);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final Collection<pf60<String, x20>> m164035m0() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y("media buzz debug", new x20() { // from class: l.fo3
            @Override // p153l.x20
            public final void call() {
                no3.m164026g0(this.f100005a);
            }
        }));
        arrayListM147507f0.getClass();
        return arrayListM147507f0;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m164036q0() {
        C22421c c22421cDuringCreated;
        C22421c c22421cDuringCreated2;
        Act act = act();
        kcg0 kcg0VarSubscribe = null;
        this.lbStatusSub = (act == null || (c22421cDuringCreated2 = act.duringCreated(haw.INSTANCE.m134320a().m134263A0())) == null) ? null : c22421cDuringCreated2.subscribe(psd0.m173596G(new y20() { // from class: l.io3
            @Override // p153l.y20
            public final void call(Object obj) {
                no3.m164024e0(this.f116068a, (LoveBuzzData) obj);
            }
        }));
        Act act2 = act();
        if (act2 != null && (c22421cDuringCreated = act2.duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged())) != null) {
            kcg0VarSubscribe = c22421cDuringCreated.subscribe(psd0.m173596G(new y20() { // from class: l.jo3
                @Override // p153l.y20
                public final void call(Object obj) {
                    no3.m164027h0(this.f121937a, (UserPrivilege) obj);
                }
            }));
        }
        this.privilegeSub = kcg0VarSubscribe;
        m164039t0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m164037r0(boolean hidden) {
        if (hidden) {
            psd0.m173633z(this.mbWarnSub);
        } else {
            m164039t0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m164038s0() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        return loveBuzzDataM134315v0 != null && loveBuzzDataM134315v0.enabledBuzz.size() == 1;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m164039t0() {
        C22421c c22421cDuringCreated;
        Act act = act();
        this.mbWarnSub = (act == null || (c22421cDuringCreated = act.duringCreated(haw.INSTANCE.m134320a().m134270H0())) == null) ? null : c22421cDuringCreated.subscribe(psd0.m173596G(new y20() { // from class: l.ho3
            @Override // p153l.y20
            public final void call(Object obj) {
                no3.m164031l0(this.f110866a, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m164033o0(PurchaseType purchaseType) {
    }
}
