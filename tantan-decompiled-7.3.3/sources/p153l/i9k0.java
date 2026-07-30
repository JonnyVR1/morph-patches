package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class i9k0<D extends oo2> implements iam<m9k0<D>> {

    /* JADX INFO: renamed from: a */
    public d2o0 f113478a;

    /* JADX INFO: renamed from: b */
    public m9k0<D> f113479b;

    /* JADX INFO: renamed from: c */
    public VText f113480c;

    /* JADX INFO: renamed from: d */
    public VImage f113481d;

    /* JADX INFO: renamed from: e */
    public c0s f113482e;

    public i9k0(VText vText, VImage vImage) {
        this.f113480c = vText;
        this.f113481d = vImage;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        VText vText = this.f113480c;
        return vText != null ? vText.getContext() : this.f113481d.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m9k0<D> m9k0Var) {
        this.f113479b = m9k0Var;
        if (this.f113482e == null) {
            this.f113478a = new d2o0(m9k0Var.act());
            this.f113482e = new c0s(this.f113479b, this.f113478a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
            bnl0.m105509E0(this.f113478a._empty, new View.OnClickListener() { // from class: l.e9k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92650a.m139109f(view);
                }
            });
            bnl0.m105509E0(this.f113478a._cancel, new View.OnClickListener() { // from class: l.f9k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97897a.m139110i(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m139109f(View view) {
        this.f113482e.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m139110i(View view) {
        this.f113482e.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m139111j(nsv nsvVar, View view) {
        this.f113479b.m157592w4(nsvVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m139112k(nsv nsvVar, View view) {
        this.f113479b.m157591v4(nsvVar);
        this.f113479b.mo159725Y3();
    }

    /* JADX INFO: renamed from: l */
    public void m139113l(final nsv<User> nsvVar) {
        User user;
        if (nsvVar == null || (user = nsvVar.f143542a) == null) {
            VText vText = this.f113480c;
            if (vText != null) {
                vText.setVisibility(8);
            }
            VImage vImage = this.f113481d;
            if (vImage != null) {
                vImage.setVisibility(8);
                return;
            }
            return;
        }
        User user2 = user;
        if (e3t.m119319a(nsvVar).m119322d() ? user2.f56859id.equals(eb20.m120148a()) : user2.f56859id.equals(zrv.f205799a.m207631D0())) {
            VText vText2 = this.f113480c;
            if (vText2 != null) {
                bnl0.m105524M(vText2, false);
            }
            VImage vImage2 = this.f113481d;
            if (vImage2 != null) {
                bnl0.m105524M(vImage2, false);
                return;
            }
            return;
        }
        if (this.f113479b.m157584o4(user2.f56859id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.g9k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102862a.m139111j(nsvVar, view);
                }
            };
            VText vText3 = this.f113480c;
            if (vText3 != null) {
                vText3.setText(zrv.f205803e.getString(R$string.f48210l7));
                bnl0.m105509E0(this.f113480c, onClickListener);
            }
            if (this.f113481d != null) {
                boolean zM206159b = wft.m206159b(2);
                VImage vImage3 = this.f113481d;
                if (zM206159b) {
                    vImage3.setImageDrawable(n3d0.m161278b(obc0.f146230W8));
                } else {
                    vImage3.setImageDrawable(n3d0.m161278b(obc0.f146034F8));
                }
                bnl0.m105509E0(this.f113481d, onClickListener);
            }
        } else {
            User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.h9k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108413a.m139112k(nsvVar, view);
                }
            };
            VText vText4 = this.f113480c;
            if (vText4 != null) {
                vText4.setText(zrv.f205803e.getString(userM144722i.hierarchy.grade < zrv.m221193k().m203508R5() ? R$string.f47974ac : R$string.f48500yb));
                bnl0.m105509E0(this.f113480c, onClickListener2);
            }
            VImage vImage4 = this.f113481d;
            if (vImage4 != null) {
                vImage4.setImageDrawable(n3d0.m161278b(obc0.f146257Z2));
                bnl0.m105509E0(this.f113481d, onClickListener2);
            }
        }
        VText vText5 = this.f113480c;
        if (vText5 != null) {
            bnl0.m105524M(vText5, true);
        }
        VImage vImage5 = this.f113481d;
        if (vImage5 != null) {
            bnl0.m105524M(vImage5, true);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
