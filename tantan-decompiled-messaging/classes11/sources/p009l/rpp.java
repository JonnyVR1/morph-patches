package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.List;
import l.bsm;
import l.bwr;
import l.dd80;
import l.e30;
import l.ffw;
import l.g5c0;
import l.h4t;
import l.lsi0;
import l.nnn0;
import l.q9o;
import l.s25;
import l.t6c0;
import l.u6n;
import l.xdl0;
import l.z2k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rpp extends h4t<nnn0, upp> {

    /* JADX INFO: renamed from: i */
    public kpp f19943i;

    /* JADX INFO: renamed from: j */
    public zop f19944j;

    /* JADX INFO: renamed from: k */
    public View f19945k;

    public rpp(bsm<? extends nnn0> bsmVar, upp uppVar) {
        super(bsmVar);
        C(uppVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m21768O3(String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z) {
        duringCreated(q9o.f(str, bLiveVoiceBackgroundPriceGradient.gradientIndex, !z)).subscribe(ffw.e(new e30() { // from class: l.ppp
            public final void call(Object obj) {
                this.f18837a.m21769P3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.qpp
            public final void call(Object obj) {
                this.f19441a.m21770R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m21769P3(BLiveEnvelope bLiveEnvelope) {
        zop zopVar = this.f19944j;
        if (zopVar != null) {
            zopVar.dismiss();
        }
        F2().VoiceRoomBgEvent.changeMeTab().p();
        lsi0.w(R.string.Pi);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m21770R3(Throwable th) {
        zop zopVar = this.f19944j;
        if (zopVar != null) {
            zopVar.dismiss();
        }
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43039) {
            F2().LiveBridgeImplEvent.showRechargeDialog().p();
        }
        s25.c(th);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m21771S3(List list) {
        ((upp) ((bwr) this).viewModel).m23131i(list);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m21772T3(dd80 dd80Var, String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z, View view) {
        dd80Var.dismiss();
        m21768O3(str, bLiveVoiceBackgroundPriceGradient, z);
    }

    /* JADX INFO: renamed from: U3 */
    public void m21773U3() {
        duringCreated(q9o.h()).subscribe(ffw.e(new e30() { // from class: l.mpp
            public final void call(Object obj) {
                this.f17019a.m21771S3((List) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: V3 */
    public void m21774V3(final String str, final BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, final boolean z) {
        if (this.f19945k == null) {
            this.f19945k = View.inflate(act(), t6c0.o2, null);
        }
        if (this.f19945k.getParent() != null && (this.f19945k.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f19945k.getParent()).removeAllViews();
        }
        final dd80 dd80VarO = act().newDialog().R(this.f19945k).P(false).O();
        TextView textView = (TextView) this.f19945k.findViewById(g5c0.D0);
        StringBuilder sb = new StringBuilder();
        sb.append(act().getString(R.string.Ri));
        sb.append(" ");
        sb.append(bLiveVoiceBackgroundPriceGradient.price);
        sb.append(" ");
        sb.append(act().getString(u6n.a() ? R.string.Ak : R.string.Qi));
        textView.setText(sb.toString());
        xdl0.E0(this.f19945k.findViewById(g5c0.a3), new View.OnClickListener() { // from class: l.npp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarO.dismiss();
            }
        });
        xdl0.E0(this.f19945k.findViewById(g5c0.r5), new View.OnClickListener() { // from class: l.opp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18202a.m21772T3(dd80VarO, str, bLiveVoiceBackgroundPriceGradient, z, view);
            }
        });
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: W3 */
    public void m21775W3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        zop zopVar = new zop(this);
        this.f19944j = zopVar;
        zopVar.m25910w0(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: X3 */
    public void m21776X3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (this.f19943i == null) {
            this.f19943i = new kpp(this);
        }
        this.f19943i.m17592r0(bLiveVoiceBackGroundPics);
    }
}
