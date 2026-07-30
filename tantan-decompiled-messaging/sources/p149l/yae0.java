package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class yae0 implements r0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f197191a;

    /* JADX INFO: renamed from: b */
    public VImage f197192b;

    /* JADX INFO: renamed from: c */
    public TextView f197193c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f197194d;

    /* JADX INFO: renamed from: e */
    public TextView f197195e;

    /* JADX INFO: renamed from: f */
    public TextView f197196f;

    /* JADX INFO: renamed from: g */
    public Space f197197g;

    /* JADX INFO: renamed from: h */
    public final Act f197198h;

    /* JADX INFO: renamed from: i */
    public ExplodeLayout f197199i;

    @Override // p149l.r0m
    /* JADX INFO: renamed from: a */
    public View mo155367a(ViewGroup viewGroup, boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f197198h.inflater().inflate(m6c0.f131548W2, viewGroup, false);
        m213831d(relativeLayout);
        int i = t100.f167259h;
        int i2 = z ? i * 16 : (int) (((double) i) * 22.5d);
        this.f197199i = (ExplodeLayout) this.f197198h.inflater().inflate(m6c0.f131504L2, viewGroup, false);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197192b.getLayoutParams();
            layoutParams.height = t100.m186890d(180.0f);
            this.f197192b.setLayoutParams(layoutParams);
        } else {
            this.f197192b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f197194d.addView(this.f197199i, new LinearLayout.LayoutParams(-1, i2));
        return relativeLayout;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: c */
    public void mo155369c(List<wx80> list) {
        if (!vwb.m200296J(list)) {
            wx80 wx80Var = list.get(0);
            CharSequence charSequenceM205968t = wx80Var != null ? wx80Var.m205968t() : this.f197198h.string(R$string.f27609t7);
            if (xdl0.m208349O0(this.f197193c)) {
                this.f197193c.setText(charSequenceM205968t);
            } else if (xdl0.m208349O0(this.f197195e)) {
                this.f197195e.setText(charSequenceM205968t);
            }
            m213834g();
            this.f197199i.m54227k();
        }
        qib0.f154691G.m102314D(this.f197192b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktTUUJGWTRDTUZGUUNZRkNaUDZRQllTV1lLT05XUjE0IiwidyI6OTMwLCJoIjo3MDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDM4NDQ2MTg0NTgyMTkwNjYxfQ.webp");
    }

    /* JADX INFO: renamed from: d */
    public final void m213831d(View view) {
        zae0.m217733a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m213832e(boolean z) {
        this.f197197g.getLayoutParams().height = z ? t100.f167259h : t100.f167266o;
    }

    /* JADX INFO: renamed from: f */
    public void m213833f() {
        this.f197199i.m54228l(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m213834g() {
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        User userM30483v5 = CoreModule.f17545c.f19687u0.m30483v5();
        boolean zMo33608vb = CoreModule.m29935P().m94651a().mo33608vb(userM30483v5, c4719aM30471r5);
        TextView textView = this.f197196f;
        if (zMo33608vb) {
            textView.setText(CoreModule.m29935P().m94651a().mo33358L9(userM30483v5, this.f197191a, this.f197196f));
            m213832e(true);
        } else {
            textView.setText(c8e0.m105784e(c4719aM30471r5 == null ? 0 : c4719aM30471r5.f19270b));
            m213832e(false);
        }
    }

    @Override // p149l.r0m
    public void release() {
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: b */
    public void mo155368b(C8765d c8765d) {
    }
}
