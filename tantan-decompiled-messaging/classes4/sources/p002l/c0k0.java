package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.d1t;
import l.fld0;
import l.idv;
import l.kvc0;
import l.mqv;
import l.s7m;
import l.vdt;
import l.xdl0;
import l.ypv;
import l.zsn0;
import p002l.ho2;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c0k0<D extends ho2> implements s7m<g0k0<D>> {

    /* JADX INFO: renamed from: a */
    public zsn0 f8436a;

    /* JADX INFO: renamed from: b */
    public g0k0<D> f8437b;

    /* JADX INFO: renamed from: c */
    public VText f8438c;

    /* JADX INFO: renamed from: d */
    public VImage f8439d;

    /* JADX INFO: renamed from: e */
    public byr f8440e;

    public c0k0(VText vText, VImage vImage) {
        this.f8438c = vText;
        this.f8439d = vImage;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10697C0() {
        VText vText = this.f8438c;
        return vText != null ? vText.getContext() : this.f8439d.getContext();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m10701i1(g0k0<D> g0k0Var) {
        this.f8437b = g0k0Var;
        if (this.f8440e == null) {
            this.f8436a = new zsn0(g0k0Var.act());
            this.f8440e = new byr(this.f8437b, this.f8436a.d());
            xdl0.E0(this.f8436a.a, new View.OnClickListener() { // from class: l.yzj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23151a.m10699f(view);
                }
            });
            xdl0.E0(this.f8436a.d, new View.OnClickListener() { // from class: l.zzj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23679a.m10700i(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m10699f(View view) {
        this.f8440e.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m10700i(View view) {
        this.f8440e.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10702j(mqv mqvVar, View view) {
        this.f8437b.m13530w4(mqvVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10703k(mqv mqvVar, View view) {
        this.f8437b.m13529v4(mqvVar);
        this.f8437b.mo19187Y3();
    }

    /* JADX INFO: renamed from: l */
    public void m10704l(final mqv<User> mqvVar) {
        Object obj;
        if (mqvVar == null || (obj = mqvVar.a) == null) {
            VText vText = this.f8438c;
            if (vText != null) {
                vText.setVisibility(8);
            }
            VImage vImage = this.f8439d;
            if (vImage != null) {
                vImage.setVisibility(8);
                return;
            }
            return;
        }
        User user = (User) obj;
        if (d1t.a(mqvVar).d() ? ((DbObject) user).id.equals(w220.m24290a()) : ((DbObject) user).id.equals(ypv.a.D0())) {
            VText vText2 = this.f8438c;
            if (vText2 != null) {
                xdl0.M(vText2, false);
            }
            VImage vImage2 = this.f8439d;
            if (vImage2 != null) {
                xdl0.M(vImage2, false);
                return;
            }
            return;
        }
        if (this.f8437b.m13522o4(((DbObject) user).id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.a0k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7330a.m10702j(mqvVar, view);
                }
            };
            VText vText3 = this.f8438c;
            if (vText3 != null) {
                vText3.setText(ypv.e.getString(R$string.f3404l7));
                xdl0.E0(this.f8438c, onClickListener);
            }
            if (this.f8439d != null) {
                boolean zB = vdt.b(2);
                VImage vImage3 = this.f8439d;
                if (zB) {
                    vImage3.setImageDrawable(kvc0.b(i3c0.f12687W8));
                } else {
                    vImage3.setImageDrawable(kvc0.b(i3c0.f12491F8));
                }
                xdl0.E0(this.f8439d, onClickListener);
            }
        } else {
            User userI = ((idv) ypv.l(fld0.b)).i(ypv.a.D0());
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.b0k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7941a.m10703k(mqvVar, view);
                }
            };
            VText vText4 = this.f8438c;
            if (vText4 != null) {
                vText4.setText(ypv.e.getString(userI.hierarchy.grade < ypv.k().R5() ? R$string.f3168ac : R$string.f3694yb));
                xdl0.E0(this.f8438c, onClickListener2);
            }
            VImage vImage4 = this.f8439d;
            if (vImage4 != null) {
                vImage4.setImageDrawable(kvc0.b(i3c0.f12714Z2));
                xdl0.E0(this.f8439d, onClickListener2);
            }
        }
        VText vText5 = this.f8438c;
        if (vText5 != null) {
            xdl0.M(vText5, true);
        }
        VImage vImage5 = this.f8439d;
        if (vImage5 != null) {
            xdl0.M(vImage5, true);
        }
    }

    public void destroy() {
    }
}
