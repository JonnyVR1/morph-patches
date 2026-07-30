package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rpp extends h4t<nnn0, upp> {

    /* JADX INFO: renamed from: i */
    public kpp f160548i;

    /* JADX INFO: renamed from: j */
    public zop f160549j;

    /* JADX INFO: renamed from: k */
    public View f160550k;

    public rpp(bsm<? extends nnn0> bsmVar, upp uppVar) {
        super(bsmVar);
        mo51532C(uppVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m180378O3(String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z) {
        duringCreated(q9o.m173655f(str, bLiveVoiceBackgroundPriceGradient.gradientIndex, !z)).subscribe(ffw.m121194e(new e30() { // from class: l.ppp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150673a.m180379P3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.qpp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155791a.m180380R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m180379P3(BLiveEnvelope bLiveEnvelope) {
        zop zopVar = this.f160549j;
        if (zopVar != null) {
            zopVar.dismiss();
        }
        m206028F2().VoiceRoomBgEvent.changeMeTab().m172467p();
        lsi0.m151593w(R$string.f46901Pi);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m180380R3(Throwable th) {
        zop zopVar = this.f160549j;
        if (zopVar != null) {
            zopVar.dismiss();
        }
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43039) {
            m206028F2().LiveBridgeImplEvent.showRechargeDialog().m172467p();
        }
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m180381S3(List list) {
        ((upp) this.viewModel).m194906i(list);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m180382T3(dd80 dd80Var, String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z, View view) {
        dd80Var.dismiss();
        m180378O3(str, bLiveVoiceBackgroundPriceGradient, z);
    }

    /* JADX INFO: renamed from: U3 */
    public void m180383U3() {
        duringCreated(q9o.m173657h()).subscribe(ffw.m121194e(new e30() { // from class: l.mpp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135078a.m180381S3((List) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: V3 */
    public void m180384V3(final String str, final BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, final boolean z) {
        if (this.f160550k == null) {
            this.f160550k = View.inflate(act(), t6c0.f168456o2, null);
        }
        if (this.f160550k.getParent() != null && (this.f160550k.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f160550k.getParent()).removeAllViews();
        }
        final dd80 dd80VarM110960O = act().newDialog().m110963R(this.f160550k).m110961P(false).m110960O();
        TextView textView = (TextView) this.f160550k.findViewById(g5c0.f100666D0);
        StringBuilder sb = new StringBuilder();
        sb.append(act().getString(R$string.f46943Ri));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(bLiveVoiceBackgroundPriceGradient.price);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(act().getString(u6n.m192015a() ? R$string.f46577Ak : R$string.f46922Qi));
        textView.setText(sb.toString());
        xdl0.m208329E0(this.f160550k.findViewById(g5c0.f100876a3), new View.OnClickListener() { // from class: l.npp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110960O.dismiss();
            }
        });
        xdl0.m208329E0(this.f160550k.findViewById(g5c0.f101042r5), new View.OnClickListener() { // from class: l.opp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145022a.m180382T3(dd80VarM110960O, str, bLiveVoiceBackgroundPriceGradient, z, view);
            }
        });
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: W3 */
    public void m180385W3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        zop zopVar = new zop(this);
        this.f160549j = zopVar;
        zopVar.m219588w0(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: X3 */
    public void m180386X3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (this.f160548i == null) {
            this.f160548i = new kpp(this);
        }
        this.f160548i.m146883r0(bLiveVoiceBackGroundPics);
    }
}
