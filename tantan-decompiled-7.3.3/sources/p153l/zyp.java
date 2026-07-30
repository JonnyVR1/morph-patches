package p153l;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.national.IntroductionAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import p151v.VImage;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class zyp implements iam<wyp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f206622a;

    /* JADX INFO: renamed from: b */
    public VImage f206623b;

    /* JADX INFO: renamed from: c */
    public Button f206624c;

    /* JADX INFO: renamed from: d */
    public IntroductionAct f206625d;

    public zyp(IntroductionAct introductionAct) {
        this.f206625d = introductionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m222143i(View view) {
        i4g0.m138520r("e_id_verification_poster_next_click", "p_id_verification_poster_view");
        act().startActivityForResult(NationalIdAuthAct.m57256Y1(act(), this.f206625d.m57253Z1(), this.f206625d.m57254a2()), 0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f206625d;
    }

    /* JADX INFO: renamed from: c */
    public View m222144c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return azp.m101079b(this, layoutInflater, viewGroup);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public final int m222146e() {
        if (this.f206625d.m57254a2()) {
            if (e1b.m118949G0()) {
                return !m7k.m157286a() ? dbc0.f86209H8 : dbc0.f86273J8;
            }
            return dbc0.f86241I8;
        }
        if (e1b.m118949G0()) {
            return !m7k.m157286a() ? dbc0.f86113E8 : dbc0.f86177G8;
        }
        return dbc0.f86145F8;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m222147f(int i, int i2, int[] iArr) {
        bnl0.m105505C0(this.f206623b, (int) (((i * 1.0f) / i2) * iArr[0]));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m222144c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m222148r() {
        this.f206622a.setTitle(this.f206625d.string(R$string.f18724O7));
        this.f206622a.setLeftIconAsBack(act());
        int iM222146e = m222146e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.f206625d.getResources(), iM222146e, options);
        final int i = options.outWidth;
        final int i2 = options.outHeight;
        bnl0.m105533Q0(this.f206623b, new y20() { // from class: l.xyp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196771a.m222147f(i2, i, (int[]) obj);
            }
        });
        this.f206623b.setImageResource(iM222146e);
        bnl0.m105509E0(this.f206624c, new View.OnClickListener() { // from class: l.yyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202123a.m222143i(view);
            }
        });
        this.f206625d.addSwipeBackListener(new C21937a());
    }

    /* JADX INFO: renamed from: l.zyp$a */
    public class C21937a implements ujh0 {
        public C21937a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            i4g0.m138520r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wyp wypVar) {
    }
}
