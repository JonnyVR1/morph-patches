package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class rrp extends i6t<rwn0, urp> {

    /* JADX INFO: renamed from: i */
    public krp f164591i;

    /* JADX INFO: renamed from: j */
    public zqp f164592j;

    /* JADX INFO: renamed from: k */
    public View f164593k;

    public rrp(dum<? extends rwn0> dumVar, urp urpVar) {
        super(dumVar);
        mo52715C(urpVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m182796O3(String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z) {
        duringCreated(qbo.m176062f(str, bLiveVoiceBackgroundPriceGradient.gradientIndex, !z)).subscribe(dhw.m115826e(new y20() { // from class: l.prp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153819a.m182797P3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.qrp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159156a.m182798R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m182797P3(BLiveEnvelope bLiveEnvelope) {
        zqp zqpVar = this.f164592j;
        if (zqpVar != null) {
            zqpVar.dismiss();
        }
        m213811F2().VoiceRoomBgEvent.changeMeTab().m199277p();
        o1j0.m165649w(R$string.f47749Pi);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m182798R3(Throwable th) {
        zqp zqpVar = this.f164592j;
        if (zqpVar != null) {
            zqpVar.dismiss();
        }
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43039) {
            m213811F2().LiveBridgeImplEvent.showRechargeDialog().m199277p();
        }
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m182799S3(List list) {
        ((urp) this.viewModel).m197645i(list);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m182800T3(jl80 jl80Var, String str, BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, boolean z, View view) {
        jl80Var.dismiss();
        m182796O3(str, bLiveVoiceBackgroundPriceGradient, z);
    }

    /* JADX INFO: renamed from: U3 */
    public void m182801U3() {
        duringCreated(qbo.m176064h()).subscribe(dhw.m115826e(new y20() { // from class: l.mrp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138401a.m182799S3((List) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: V3 */
    public void m182802V3(final String str, final BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, final boolean z) {
        if (this.f164593k == null) {
            this.f164593k = View.inflate(act(), yec0.f199188o2, null);
        }
        if (this.f164593k.getParent() != null && (this.f164593k.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f164593k.getParent()).removeAllViews();
        }
        final jl80 jl80VarM146020O = act().newDialog().m146023R(this.f164593k).m146021P(false).m146020O();
        TextView textView = (TextView) this.f164593k.findViewById(mdc0.f135911D0);
        StringBuilder sb = new StringBuilder();
        sb.append(act().getString(R$string.f47791Ri));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(bLiveVoiceBackgroundPriceGradient.price);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(act().getString(u8n.m195065a() ? R$string.f47425Ak : R$string.f47770Qi));
        textView.setText(sb.toString());
        bnl0.m105509E0(this.f164593k.findViewById(mdc0.f136121a3), new View.OnClickListener() { // from class: l.nrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146020O.dismiss();
            }
        });
        bnl0.m105509E0(this.f164593k.findViewById(mdc0.f136287r5), new View.OnClickListener() { // from class: l.orp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148733a.m182800T3(jl80VarM146020O, str, bLiveVoiceBackgroundPriceGradient, z, view);
            }
        });
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: W3 */
    public void m182803W3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        zqp zqpVar = new zqp(this);
        this.f164592j = zqpVar;
        zqpVar.m221034w0(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: X3 */
    public void m182804X3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (this.f164591i == null) {
            this.f164591i = new krp(this);
        }
        this.f164591i.m151110r0(bLiveVoiceBackGroundPics);
    }
}
