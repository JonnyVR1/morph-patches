package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m88121d2 = {"Ll/ue10;", "Ll/y8s;", "Ll/mu40;", "Ll/qe10;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "O3", "P3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ue10 extends y8s<mu40, qe10> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue10(@NotNull dum<mu40> dumVar) {
        super(dumVar);
        dumVar.getClass();
        Act act = this.f196919f;
        act.getClass();
        mo52715C(new qe10(act, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m195593S3(ue10 ue10Var, Boolean bool) {
        return Boolean.valueOf(!((qe10) ue10Var.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m195594T3(ue10 ue10Var, Boolean bool) {
        ((ifv) zrv.m221194l(htd0.f111523e)).f114698g.m203841a(1);
        ((qe10) ue10Var.viewModel).m73017E();
    }

    /* JADX INFO: renamed from: U3 */
    public static Boolean m195595U3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        bf10.m103822a0(this, dumVar, -1, 4);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((qe10) this.viewModel).m176217K();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(m213811F2().MultiCallEvent.showMultiCallUpgradeEntryDlg().m199270g());
        final Function1 function1 = new Function1() { // from class: l.re10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ue10.m195593S3(this.f162384a, (Boolean) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.se10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ue10.m195595U3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.te10
            @Override // p153l.y20
            public final void call(Object obj) {
                ue10.m195594T3(this.f173423a, (Boolean) obj);
            }
        }));
    }
}
