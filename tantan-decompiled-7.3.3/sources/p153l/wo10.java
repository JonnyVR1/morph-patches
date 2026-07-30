package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\f¨\u0006\u0018"}, m88121d2 = {"Ll/wo10;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;", "Ll/dum;", "Ll/mu40;", BaseSei.INFO, "settingView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;)V", "", Constants.KEY_T, "()V", "", "count", "T3", "(I)V", "", "accept", "O3", "(Z)V", "S3", "R3", "P3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wo10 extends i6t<oo2, MultiCallSettingsView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo10(@NotNull dum<mu40> dumVar, @NotNull MultiCallSettingsView multiCallSettingsView) {
        super(dumVar);
        dumVar.getClass();
        multiCallSettingsView.getClass();
        mo52715C(multiCallSettingsView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX INFO: renamed from: J3 */
    public static void m207234J3(final wo10 wo10Var, final int i, final int i2, View view) {
        wo10Var.duringCreated(LivingNormalApiProvider.m72496P7(wo10Var.m213810E2().m168532l0().f56859id, wo10Var.m213810E2().m202191k(), i)).subscribe(dhw.m115825d(new y20() { // from class: l.vo10
            @Override // p153l.y20
            public final void call(Object obj) {
                wo10.m207239U3(i2, i, wo10Var, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m207236L3(Boolean bool) {
        if (bool.booleanValue()) {
            o1j0.m165651y(xau.m209910t(R$string.f47781R8));
        } else {
            o1j0.m165651y(xau.m209910t(R$string.f47760Q8));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m207237M3(Boolean bool) {
        if (bool.booleanValue()) {
            o1j0.m165651y(xau.m209910t(R$string.f47865V8));
        } else {
            o1j0.m165651y(xau.m209910t(R$string.f47844U8));
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static void m207238N3(wo10 wo10Var, BLiveMultiCallAsset bLiveMultiCallAsset) {
        ((MultiCallSettingsView) wo10Var.viewModel).m76969q0(bLiveMultiCallAsset.rejectInvite);
        ((MultiCallSettingsView) wo10Var.viewModel).m76968p0(bLiveMultiCallAsset.freeCall);
        ((MultiCallSettingsView) wo10Var.viewModel).m76970s0(bLiveMultiCallAsset.maxCallNum, bLiveMultiCallAsset.canSwitchMaxCallNum);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m207239U3(int i, int i2, wo10 wo10Var, Boolean bool) {
        if (bool.booleanValue()) {
            V v2 = wo10Var.viewModel;
            v2.getClass();
            MultiCallSettingsView.m76967t0((MultiCallSettingsView) v2, i2, false, 2, null);
            wo10Var.m213811F2().MultiCallEvent.switchDeputyCount().mo199273j(Integer.valueOf(i2));
            wo10Var.m207241P3();
            o1j0.m165649w(R$string.f48217le);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: O3 */
    public final void m207240O3(boolean accept) {
        String str = m213810E2().m168532l0().f56859id;
        str.getClass();
        duringCreated(LivingNormalApiProvider.m72771u3(str, Boolean.valueOf(accept), m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.to10
            @Override // p153l.y20
            public final void call(Object obj) {
                wo10.m207237M3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m207241P3() {
        m213811F2().MultiCallEvent.openManageDialog().mo199273j(-100);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m207242R3() {
        if (this.f196918e.f90824j.m209548L3(MotionType.multi_call)) {
            m213811F2().MultiCallEvent.prepareCloseMultiCall().mo199273j(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: S3 */
    public final void m207243S3(boolean accept) {
        String str = m213810E2().m168532l0().f56859id;
        str.getClass();
        duringCreated(LivingNormalApiProvider.m72801x6(str, Boolean.valueOf(accept), m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.uo10
            @Override // p153l.y20
            public final void call(Object obj) {
                wo10.m207236L3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m207244T3(final int count) {
        final int currentSelectedDeputyCount = ((MultiCallSettingsView) this.viewModel).getCurrentSelectedDeputyCount();
        if (count > currentSelectedDeputyCount) {
            th0.C20312a c20312a = new th0.C20312a(m113230C0());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM209910t = xau.m209910t(R$string.f48381t2);
            strM209910t.getClass();
            c20312a.m191151j(String.format(strM209910t, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1))).m191158q(R$string.f48271o2).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.ro10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wo10.m207234J3(this.f164145a, count, currentSelectedDeputyCount, view);
                }
            }).m191146e(R$string.f47690N1).m191142a().m191141g();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((ifv) zrv.m221194l(htd0.f111523e)).f114695d.obs()).subscribe(dhw.m115829h(new y20() { // from class: l.so10
            @Override // p153l.y20
            public final void call(Object obj) {
                wo10.m207238N3(this.f169826a, (BLiveMultiCallAsset) obj);
            }
        }));
    }
}
