package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;

/* JADX INFO: loaded from: classes5.dex */
public class c64 implements iam<z54> {

    /* JADX INFO: renamed from: a */
    public View f79929a;

    /* JADX INFO: renamed from: b */
    public CallResultView f79930b;

    /* JADX INFO: renamed from: c */
    public CallResultView f79931c;

    /* JADX INFO: renamed from: d */
    public CallResultView f79932d;

    /* JADX INFO: renamed from: e */
    public TextView f79933e;

    /* JADX INFO: renamed from: f */
    public z54 f79934f;

    /* JADX INFO: renamed from: g */
    public DialogC12774a f79935g;

    /* JADX INFO: renamed from: e */
    private void m108095e() {
        ynp0.m216937n(this.f79935g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m108096f(View view) {
        m108095e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m108097i(View view) {
        m108095e();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79934f.act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f79934f.act();
    }

    /* JADX INFO: renamed from: c */
    public View m108098c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d64.m114367b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z54 z54Var) {
        this.f79934f = z54Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return ynp0.m216949z(this.f79935g);
    }

    /* JADX INFO: renamed from: j */
    public void m108100j(BLiveCallSummary bLiveCallSummary) {
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f79930b.m77092b(tzi0.m193668f("", bLiveCallSummary.duration * 1000.0d)).m77093c(obc0.f146015E1).m77094d(getContext().getString(R$string.f48226m1)).m77095e(typeface);
        String string = getContext().getString(vxr.m203876d().m171022s0() ? R$string.f48402u1 : R$string.f48380t1);
        htd0<civ> htd0Var = htd0.f111524f;
        if (((civ) zrv.m221194l(htd0Var)).m109970n()) {
            string = xau.m209910t(R$string.f48424v1);
        }
        this.f79931c.m77092b(yau.m214935c(bLiveCallSummary.rewardPoint)).m77093c(((civ) zrv.m221194l(htd0Var)).m109970n() ? obc0.f145967A1 : obc0.f146519v1).m77094d(string).m77095e(typeface);
        this.f79932d.m77092b(bLiveCallSummary.newFollowCount + "").m77093c(obc0.f146495t1).m77094d(getContext().getString(R$string.f47815T0)).m77095e(typeface);
    }

    /* JADX INFO: renamed from: k */
    public void m108101k() {
        if (this.f79935g == null) {
            this.f79935g = new c0s(this.f79934f, m108098c(act().inflater(), null));
            this.f79929a.setOnClickListener(new View.OnClickListener() { // from class: l.a64
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68664a.m108096f(view);
                }
            });
            this.f79933e.setOnClickListener(new View.OnClickListener() { // from class: l.b64
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f75130a.m108097i(view);
                }
            });
        }
        this.f79935g.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
