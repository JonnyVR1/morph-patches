package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\f¨\u0006\u0018"}, m87232d2 = {"Ll/mg10;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;", "Ll/bsm;", "Ll/yl40;", BaseSei.INFO, "settingView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;)V", "", Constants.KEY_T, "()V", "", "count", "T3", "(I)V", "", "accept", "O3", "(Z)V", "S3", "R3", "P3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mg10 extends h4t<ho2, MultiCallSettingsView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg10(@NotNull bsm<yl40> bsmVar, @NotNull MultiCallSettingsView multiCallSettingsView) {
        super(bsmVar);
        bsmVar.getClass();
        multiCallSettingsView.getClass();
        mo51532C(multiCallSettingsView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: J3 */
    public static void m154479J3(final mg10 mg10Var, final int i, final int i2, View view) {
        mg10Var.duringCreated(LivingNormalApiProvider.m71313P7(mg10Var.m206027E2().m132146l0().f56011id, mg10Var.m206027E2().m149814k(), i)).subscribe(ffw.m121193d(new e30() { // from class: l.lg10
            @Override // p149l.e30
            public final void call(Object obj) {
                mg10.m154484U3(i2, i, mg10Var, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m154481L3(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151595y(w8u.m202217t(R$string.f46933R8));
        } else {
            lsi0.m151595y(w8u.m202217t(R$string.f46912Q8));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m154482M3(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151595y(w8u.m202217t(R$string.f47017V8));
        } else {
            lsi0.m151595y(w8u.m202217t(R$string.f46996U8));
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static void m154483N3(mg10 mg10Var, BLiveMultiCallAsset bLiveMultiCallAsset) {
        ((MultiCallSettingsView) mg10Var.viewModel).m75786q0(bLiveMultiCallAsset.rejectInvite);
        ((MultiCallSettingsView) mg10Var.viewModel).m75785p0(bLiveMultiCallAsset.freeCall);
        ((MultiCallSettingsView) mg10Var.viewModel).m75787s0(bLiveMultiCallAsset.maxCallNum, bLiveMultiCallAsset.canSwitchMaxCallNum);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m154484U3(int i, int i2, mg10 mg10Var, Boolean bool) {
        if (bool.booleanValue()) {
            V v2 = mg10Var.viewModel;
            v2.getClass();
            MultiCallSettingsView.m75784t0((MultiCallSettingsView) v2, i2, false, 2, null);
            mg10Var.m206028F2().MultiCallEvent.switchDeputyCount().mo172463j(Integer.valueOf(i2));
            mg10Var.m154486P3();
            lsi0.m151593w(R$string.f47369le);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final void m154485O3(boolean accept) {
        String str = m206027E2().m132146l0().f56011id;
        str.getClass();
        duringCreated(LivingNormalApiProvider.m71588u3(str, Boolean.valueOf(accept), m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.jg10
            @Override // p149l.e30
            public final void call(Object obj) {
                mg10.m154482M3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m154486P3() {
        m206028F2().MultiCallEvent.openManageDialog().mo172463j(-100);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m154487R3() {
        if (this.f188512e.f77104j.m201577L3(MotionType.multi_call)) {
            m206028F2().MultiCallEvent.prepareCloseMultiCall().mo172463j(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public final void m154488S3(boolean accept) {
        String str = m206027E2().m132146l0().f56011id;
        str.getClass();
        duringCreated(LivingNormalApiProvider.m71618x6(str, Boolean.valueOf(accept), m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.kg10
            @Override // p149l.e30
            public final void call(Object obj) {
                mg10.m154481L3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m154489T3(final int count) {
        final int currentSelectedDeputyCount = ((MultiCallSettingsView) this.viewModel).getCurrentSelectedDeputyCount();
        if (count > currentSelectedDeputyCount) {
            xh0.C21150a c21150a = new xh0.C21150a(m104249C0());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM202217t = w8u.m202217t(R$string.f47533t2);
            strM202217t.getClass();
            c21150a.m208731j(String.format(strM202217t, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1))).m208738q(R$string.f47423o2).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.hg10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mg10.m154479J3(this.f107553a, count, currentSelectedDeputyCount, view);
                }
            }).m208726e(R$string.f46842N1).m208722a().m208721g();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((hdv) ypv.m215673l(fld0.f98150e)).f107298d.obs()).subscribe(ffw.m121197h(new e30() { // from class: l.ig10
            @Override // p149l.e30
            public final void call(Object obj) {
                mg10.m154483N3(this.f113064a, (BLiveMultiCallAsset) obj);
            }
        }));
    }
}
