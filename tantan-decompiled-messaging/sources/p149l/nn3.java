package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p069ss.bytertc.engine.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006!"}, m87232d2 = {"Ll/nn3;", "Ll/jq2;", "Ll/zn3;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "a0", "q0", "", "hidden", "r0", "(Z)V", "s0", "()Z", "", "Ll/j760;", "", "Ll/d30;", "m0", "()Ljava/util/Collection;", "t0", "Ll/c4g0;", "a", "Ll/c4g0;", "lbStatusSub", "b", "mbWarnSub", "c", "privilegeSub", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nn3 extends jq2<zn3> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public c4g0 lbStatusSub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public c4g0 mbWarnSub;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public c4g0 privilegeSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn3(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m160173e0(nn3 nn3Var, LoveBuzzData loveBuzzData) {
        ((zn3) nn3Var.viewModel).m219429S();
        ((zn3) nn3Var.viewModel).m219430T();
        ((zn3) nn3Var.viewModel).m219432V(loveBuzzData);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m160175g0(final nn3 nn3Var) {
        Dialog.C4309e c4309eDialog;
        Dialog.C4309e c4309eM20535e0;
        Dialog.C4309e c4309eM20537g0;
        Dialog dialogM20567z;
        Act act = nn3Var.act();
        if (act == null || (c4309eDialog = act.dialog()) == null || (c4309eM20535e0 = c4309eDialog.m20535e0(vwb.m200324f0("清除buzz促销弹窗信息", "memoji buzz高质量", "memoji buzz低质量", "memoji 删除Face 222采集model ", "memoji 删除Memoji model ", "memoji 删除Memoji 3D贴纸 ", "buzz探币充值弹窗", "buzz权益购买弹窗", "购买弹窗清除缓存数据"))) == null || (c4309eM20537g0 = c4309eM20535e0.m20537g0(new Dialog.InterfaceC4311g() { // from class: l.kn3
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                nn3.m160181n0(this.f123857a, dialog, view, i, charSequence);
            }
        })) == null || (dialogM20567z = c4309eM20537g0.m20567z()) == null) {
            return;
        }
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m160176h0(nn3 nn3Var, UserPrivilege userPrivilege) {
        zn3 zn3Var = (zn3) nn3Var.viewModel;
        if (zn3Var != null) {
            zn3Var.m219430T();
        }
        j8w.INSTANCE.m140473a().m140470x0(nn3Var.act());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m160178j0(nn3 nn3Var, Bundle bundle) {
        ((zn3) nn3Var.viewModel).m219439r();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m160180l0(nn3 nn3Var, String str) {
        if (Intrinsics.m87488d("voiceBuzz_warn", str) || Intrinsics.m87488d("videoBuzz_warn", str) || Intrinsics.m87488d("memojiBuzz_warn", str)) {
            f6w.INSTANCE.m119694c0(nn3Var.act());
            j8w.INSTANCE.m140473a().m140423H0().m132487l("");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m160181n0(nn3 nn3Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                new zpd0("love_buzz_promo_premium_show_time_" + CoreModule.m29931H().userId(), -1L).put(-1L);
                new zpd0("love_buzz_user_click_time_" + CoreModule.m29931H().userId(), -1L).put(-1L);
                break;
            case 1:
                new tpd0("debug_low_device", -1).put(0);
                break;
            case 2:
                new tpd0("debug_low_device", -1).put(1);
                break;
            case 3:
                File fileM177963c = r600.m177960b().m177963c("mmcv_android_fa_model");
                if (fileM177963c != null && fileM177963c.exists()) {
                    rhi.m179367k(fileM177963c);
                }
                File fileM177963c2 = r600.m177960b().m177963c("mmcv_android_222_small_fd_model");
                if (fileM177963c2 != null && fileM177963c2.exists()) {
                    rhi.m179367k(fileM177963c2);
                }
                File fileM177963c3 = r600.m177960b().m177963c("mmcv_android_222_big_fd_model");
                if (fileM177963c3 != null && fileM177963c3.exists()) {
                    rhi.m179367k(fileM177963c3);
                    break;
                }
                break;
            case 4:
                File fileM177963c4 = r600.m177960b().m177963c("mmcv_android_small_stylize_face_model");
                if (fileM177963c4 != null && fileM177963c4.exists()) {
                    rhi.m179367k(fileM177963c4);
                }
                File fileM177963c5 = r600.m177960b().m177963c("mmcv_android_stylize_face_model");
                if (fileM177963c5 != null && fileM177963c5.exists()) {
                    rhi.m179367k(fileM177963c5);
                    break;
                }
                break;
            case 5:
                File file = new File(k9j.m145077I(), "StylizeFace");
                if (file.exists()) {
                    rhi.m179367k(file);
                }
                break;
            case 6:
                CoreModule.f17554l.m94656g().mo35075sm(nn3Var.act(), BuildConfig.BUILD_TYPE, l6w.INSTANCE.m148779h("textBuzz"), new e30() { // from class: l.ln3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        nn3.m160182o0((PurchaseType) obj);
                    }
                });
                break;
            case 7:
                f6w.INSTANCE.m119684Q(nn3Var.act(), "textBuzz", BuildConfig.BUILD_TYPE, new Function0() { // from class: l.mn3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return nn3.m160183p0();
                    }
                });
                break;
            case 8:
                String str = "buzz_consume_tips_shown" + CoreModule.m29931H().userId();
                Boolean bool = Boolean.FALSE;
                new hpd0(str, bool).put(bool);
                String str2 = "buzz_consume_tips_" + CoreModule.m29931H().userId();
                Boolean bool2 = Boolean.TRUE;
                new hpd0(str2, bool2).put(bool2);
                break;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m160183p0() {
        return Unit.INSTANCE;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m160185q0();
        creates(new e30() { // from class: l.gn3
            @Override // p149l.e30
            public final void call(Object obj) {
                nn3.m160178j0(this.f103571a, (Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
        mkd0.m154992z(this.lbStatusSub);
        mkd0.m154992z(this.mbWarnSub);
        mkd0.m154992z(this.privilegeSub);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final Collection<j760<String, d30>> m160184m0() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y("media buzz debug", new d30() { // from class: l.fn3
            @Override // p149l.d30
            public final void call() {
                nn3.m160175g0(this.f98397a);
            }
        }));
        arrayListM200324f0.getClass();
        return arrayListM200324f0;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m160185q0() {
        C22306c c22306cDuringCreated;
        C22306c c22306cDuringCreated2;
        Act act = act();
        c4g0 c4g0VarSubscribe = null;
        this.lbStatusSub = (act == null || (c22306cDuringCreated2 = act.duringCreated(j8w.INSTANCE.m140473a().m140416A0())) == null) ? null : c22306cDuringCreated2.subscribe(mkd0.m154955G(new e30() { // from class: l.in3
            @Override // p149l.e30
            public final void call(Object obj) {
                nn3.m160173e0(this.f113989a, (LoveBuzzData) obj);
            }
        }));
        Act act2 = act();
        if (act2 != null && (c22306cDuringCreated = act2.duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged())) != null) {
            c4g0VarSubscribe = c22306cDuringCreated.subscribe(mkd0.m154955G(new e30() { // from class: l.jn3
                @Override // p149l.e30
                public final void call(Object obj) {
                    nn3.m160176h0(this.f118759a, (UserPrivilege) obj);
                }
            }));
        }
        this.privilegeSub = c4g0VarSubscribe;
        m160188t0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m160186r0(boolean hidden) {
        if (hidden) {
            mkd0.m154992z(this.mbWarnSub);
        } else {
            m160188t0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m160187s0() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        return loveBuzzDataM140468v0 != null && loveBuzzDataM140468v0.enabledBuzz.size() == 1;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m160188t0() {
        C22306c c22306cDuringCreated;
        Act act = act();
        this.mbWarnSub = (act == null || (c22306cDuringCreated = act.duringCreated(j8w.INSTANCE.m140473a().m140423H0())) == null) ? null : c22306cDuringCreated.subscribe(mkd0.m154955G(new e30() { // from class: l.hn3
            @Override // p149l.e30
            public final void call(Object obj) {
                nn3.m160180l0(this.f108543a, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m160182o0(PurchaseType purchaseType) {
    }
}
