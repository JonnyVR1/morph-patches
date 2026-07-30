package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.m6c0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zae0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yae0 implements r0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f28092a;

    /* JADX INFO: renamed from: b */
    public VImage f28093b;

    /* JADX INFO: renamed from: c */
    public TextView f28094c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28095d;

    /* JADX INFO: renamed from: e */
    public TextView f28096e;

    /* JADX INFO: renamed from: f */
    public TextView f28097f;

    /* JADX INFO: renamed from: g */
    public Space f28098g;

    /* JADX INFO: renamed from: h */
    public final Act f28099h;

    /* JADX INFO: renamed from: i */
    public ExplodeLayout f28100i;

    @Override // p006l.r0m
    /* JADX INFO: renamed from: a */
    public View mo19384a(ViewGroup viewGroup, boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f28099h.inflater().inflate(m6c0.W2, viewGroup, false);
        m28139d(relativeLayout);
        int i = t100.h;
        int i2 = z ? i * 16 : (int) (((double) i) * 22.5d);
        this.f28100i = (ExplodeLayout) this.f28099h.inflater().inflate(m6c0.L2, viewGroup, false);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28093b.getLayoutParams();
            layoutParams.height = t100.d(180.0f);
            this.f28093b.setLayoutParams(layoutParams);
        } else {
            this.f28093b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f28095d.addView(this.f28100i, new LinearLayout.LayoutParams(-1, i2));
        return relativeLayout;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: c */
    public void mo19386c(List<wx80> list) {
        if (!vwb.J(list)) {
            wx80 wx80Var = list.get(0);
            CharSequence charSequenceM26849t = wx80Var != null ? wx80Var.m26849t() : this.f28099h.string(R.string.t7);
            if (xdl0.O0(this.f28094c)) {
                this.f28094c.setText(charSequenceM26849t);
            } else if (xdl0.O0(this.f28096e)) {
                this.f28096e.setText(charSequenceM26849t);
            }
            m28142g();
            this.f28100i.m7562k();
        }
        qib0.f19782G.m12727D(this.f28093b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktTUUJGWTRDTUZGUUNZRkNaUDZRQllTV1lLT05XUjE0IiwidyI6OTMwLCJoIjo3MDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDM4NDQ2MTg0NTgyMTkwNjYxfQ.webp");
    }

    /* JADX INFO: renamed from: d */
    public final void m28139d(View view) {
        zae0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m28140e(boolean z) {
        this.f28098g.getLayoutParams().height = z ? t100.h : t100.o;
    }

    /* JADX INFO: renamed from: f */
    public void m28141f() {
        this.f28100i.m7563l(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m28142g() {
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
        boolean zM5545vb = CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5);
        TextView textView = this.f28097f;
        if (zM5545vb) {
            textView.setText(CoreModule.m1854P().m11706a().m5295L9(userM2411v5, this.f28092a, this.f28097f));
            m28140e(true);
        } else {
            textView.setText(c8e0.m13312e(c0145aM2399r5 == null ? 0 : c0145aM2399r5.f3259b));
            m28140e(false);
        }
    }

    @Override // p006l.r0m
    public void release() {
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: b */
    public void mo19385b(d dVar) {
    }
}
