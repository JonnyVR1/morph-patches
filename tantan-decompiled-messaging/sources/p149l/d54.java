package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;

/* JADX INFO: loaded from: classes5.dex */
public class d54 implements s7m<a54> {

    /* JADX INFO: renamed from: a */
    public View f84367a;

    /* JADX INFO: renamed from: b */
    public CallResultView f84368b;

    /* JADX INFO: renamed from: c */
    public CallResultView f84369c;

    /* JADX INFO: renamed from: d */
    public CallResultView f84370d;

    /* JADX INFO: renamed from: e */
    public TextView f84371e;

    /* JADX INFO: renamed from: f */
    public a54 f84372f;

    /* JADX INFO: renamed from: g */
    public DialogC12611a f84373g;

    /* JADX INFO: renamed from: e */
    private void m110012e() {
        uep0.m193327n(this.f84373g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m110013f(View view) {
        m110012e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m110014i(View view) {
        m110012e();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84372f.act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f84372f.act();
    }

    /* JADX INFO: renamed from: c */
    public View m110015c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e54.m114780b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a54 a54Var) {
        this.f84372f = a54Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return uep0.m193339z(this.f84373g);
    }

    /* JADX INFO: renamed from: j */
    public void m110017j(BLiveCallSummary bLiveCallSummary) {
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f84368b.m75909b(qqi0.m175938f("", bLiveCallSummary.duration * 1000.0d)).m75910c(i3c0.f110687E1).m75911d(getContext().getString(R$string.f47378m1)).m75912e(typeface);
        String string = getContext().getString(uvr.m196087d().m162715s0() ? R$string.f47554u1 : R$string.f47532t1);
        fld0<bgv> fld0Var = fld0.f98151f;
        if (((bgv) ypv.m215673l(fld0Var)).m101734n()) {
            string = w8u.m202217t(R$string.f47576v1);
        }
        this.f84369c.m75909b(x8u.m207433c(bLiveCallSummary.rewardPoint)).m75910c(((bgv) ypv.m215673l(fld0Var)).m101734n() ? i3c0.f110639A1 : i3c0.f111191v1).m75911d(string).m75912e(typeface);
        this.f84370d.m75909b(bLiveCallSummary.newFollowCount + "").m75910c(i3c0.f111167t1).m75911d(getContext().getString(R$string.f46967T0)).m75912e(typeface);
    }

    /* JADX INFO: renamed from: k */
    public void m110018k() {
        if (this.f84373g == null) {
            this.f84373g = new byr(this.f84372f, m110015c(act().inflater(), null));
            this.f84367a.setOnClickListener(new View.OnClickListener() { // from class: l.b54
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73438a.m110013f(view);
                }
            });
            this.f84371e.setOnClickListener(new View.OnClickListener() { // from class: l.c54
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79336a.m110014i(view);
                }
            });
        }
        this.f84373g.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
