package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class dje0 implements l3m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f88831a;

    /* JADX INFO: renamed from: b */
    public VImage f88832b;

    /* JADX INFO: renamed from: c */
    public TextView f88833c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f88834d;

    /* JADX INFO: renamed from: e */
    public TextView f88835e;

    /* JADX INFO: renamed from: f */
    public TextView f88836f;

    /* JADX INFO: renamed from: g */
    public Space f88837g;

    /* JADX INFO: renamed from: h */
    public final Act f88838h;

    /* JADX INFO: renamed from: i */
    public ExplodeLayout f88839i;

    @Override // p153l.l3m
    /* JADX INFO: renamed from: a */
    public View mo116073a(ViewGroup viewGroup, boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f88838h.inflater().inflate(rec0.f162508W2, viewGroup, false);
        m116076d(relativeLayout);
        int i = qa00.f156321h;
        int i2 = z ? i * 16 : (int) (((double) i) * 22.5d);
        this.f88839i = (ExplodeLayout) this.f88838h.inflater().inflate(rec0.f162464L2, viewGroup, false);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f88832b.getLayoutParams();
            layoutParams.height = qa00.m175859d(180.0f);
            this.f88832b.setLayoutParams(layoutParams);
        } else {
            this.f88832b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f88834d.addView(this.f88839i, new LinearLayout.LayoutParams(-1, i2));
        return relativeLayout;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: c */
    public void mo116075c(List<a690> list) {
        if (!jyb.m147479J(list)) {
            a690 a690Var = list.get(0);
            CharSequence charSequenceM96314t = a690Var != null ? a690Var.m96314t() : this.f88838h.string(R$string.f28457t7);
            if (bnl0.m105529O0(this.f88833c)) {
                this.f88833c.setText(charSequenceM96314t);
            } else if (bnl0.m105529O0(this.f88835e)) {
                this.f88835e.setText(charSequenceM96314t);
            }
            m116079g();
            this.f88839i.m55410k();
        }
        uqb0.f180374G.m127098D(this.f88832b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktTUUJGWTRDTUZGUUNZRkNaUDZRQllTV1lLT05XUjE0IiwidyI6OTMwLCJoIjo3MDIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDM4NDQ2MTg0NTgyMTkwNjYxfQ.webp");
    }

    /* JADX INFO: renamed from: d */
    public final void m116076d(View view) {
        eje0.m120982a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m116077e(boolean z) {
        this.f88837g.getLayoutParams().height = z ? qa00.f156321h : qa00.f156328o;
    }

    /* JADX INFO: renamed from: f */
    public void m116078f() {
        this.f88839i.m55411l(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m116079g() {
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
        boolean zMo34611vb = CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5);
        TextView textView = this.f88836f;
        if (zMo34611vb) {
            textView.setText(CoreModule.m30933P().m143405a().mo34361L9(userM31491x5, this.f88831a, this.f88836f));
            m116077e(true);
        } else {
            textView.setText(hge0.m134921e(c4870aM31479t5 == null ? 0 : c4870aM31479t5.f20012b));
            m116077e(false);
        }
    }

    @Override // p153l.l3m
    public void release() {
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: b */
    public void mo116074b(C8928d c8928d) {
    }
}
