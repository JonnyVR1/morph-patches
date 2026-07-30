package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/ydd0;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/tdd0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "T3", "()Ll/tdd0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ydd0<D extends oo2> extends hj2<D, tdd0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydd0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m215208O3(ydd0 ydd0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        tdd0 tdd0Var = (tdd0) ydd0Var.viewModel;
        return Boolean.valueOf(tdd0Var != null ? tdd0Var.isShowing() : false);
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m215209P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m215210R3(ydd0 ydd0Var, Boolean bool) {
        ydd0Var.m135319L3();
        ydd0Var.mo135321N3();
        bf10.INSTANCE.m103851f0(ydd0Var);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m215211S3(ydd0 ydd0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        tdd0 tdd0Var = (tdd0) ydd0Var.viewModel;
        bLiveMultiCallAnnouncement.getClass();
        tdd0Var.m190621w(bLiveMultiCallAnnouncement);
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public tdd0 mo76862K3() {
        return new tdd0();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        bf10.INSTANCE.m103851f0(this);
        duringCreated((C22421c) m213811F2().MultiCallEvent.showAnnouncementDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.udd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ydd0.m215210R3(this.f178519a, (Boolean) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        C22421c<BLiveMultiCallAnnouncement> c22421cM199270g = liveEventBusM213811F2.new MultiCallEvent().announcementData().m199270g();
        final Function1 function1 = new Function1() { // from class: l.vdd0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ydd0.m215208O3(this.f183586a, (BLiveMultiCallAnnouncement) obj);
            }
        };
        duringCreated(c22421cM199270g.filter(new qcj() { // from class: l.wdd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ydd0.m215209P3(function1, obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.xdd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ydd0.m215211S3(this.f193582a, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }
}
