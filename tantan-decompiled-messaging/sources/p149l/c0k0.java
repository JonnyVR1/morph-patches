package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class c0k0<D extends ho2> implements s7m<g0k0<D>> {

    /* JADX INFO: renamed from: a */
    public zsn0 f78155a;

    /* JADX INFO: renamed from: b */
    public g0k0<D> f78156b;

    /* JADX INFO: renamed from: c */
    public VText f78157c;

    /* JADX INFO: renamed from: d */
    public VImage f78158d;

    /* JADX INFO: renamed from: e */
    public byr f78159e;

    public c0k0(VText vText, VImage vImage) {
        this.f78157c = vText;
        this.f78158d = vImage;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        VText vText = this.f78157c;
        return vText != null ? vText.getContext() : this.f78158d.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(g0k0<D> g0k0Var) {
        this.f78156b = g0k0Var;
        if (this.f78159e == null) {
            this.f78155a = new zsn0(g0k0Var.act());
            this.f78159e = new byr(this.f78156b, this.f78155a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
            xdl0.m208329E0(this.f78155a._empty, new View.OnClickListener() { // from class: l.yzj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200893a.m104766f(view);
                }
            });
            xdl0.m208329E0(this.f78155a._cancel, new View.OnClickListener() { // from class: l.zzj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205805a.m104767i(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m104766f(View view) {
        this.f78159e.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m104767i(View view) {
        this.f78159e.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m104768j(mqv mqvVar, View view) {
        this.f78156b.m123987w4(mqvVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m104769k(mqv mqvVar, View view) {
        this.f78156b.m123986v4(mqvVar);
        this.f78156b.mo162152Y3();
    }

    /* JADX INFO: renamed from: l */
    public void m104770l(final mqv<User> mqvVar) {
        User user;
        if (mqvVar == null || (user = mqvVar.f135304a) == null) {
            VText vText = this.f78157c;
            if (vText != null) {
                vText.setVisibility(8);
            }
            VImage vImage = this.f78158d;
            if (vImage != null) {
                vImage.setVisibility(8);
                return;
            }
            return;
        }
        User user2 = user;
        if (d1t.m109678a(mqvVar).m109681d() ? user2.f56011id.equals(w220.m201014a()) : user2.f56011id.equals(ypv.f199493a.m199309D0())) {
            VText vText2 = this.f78157c;
            if (vText2 != null) {
                xdl0.m208344M(vText2, false);
            }
            VImage vImage2 = this.f78158d;
            if (vImage2 != null) {
                xdl0.m208344M(vImage2, false);
                return;
            }
            return;
        }
        if (this.f78156b.m123979o4(user2.f56011id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.a0k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67047a.m104768j(mqvVar, view);
                }
            };
            VText vText3 = this.f78157c;
            if (vText3 != null) {
                vText3.setText(ypv.f199497e.getString(R$string.f47362l7));
                xdl0.m208329E0(this.f78157c, onClickListener);
            }
            if (this.f78158d != null) {
                boolean zM198092b = vdt.m198092b(2);
                VImage vImage3 = this.f78158d;
                if (zM198092b) {
                    vImage3.setImageDrawable(kvc0.m147353b(i3c0.f110902W8));
                } else {
                    vImage3.setImageDrawable(kvc0.m147353b(i3c0.f110706F8));
                }
                xdl0.m208329E0(this.f78158d, onClickListener);
            }
        } else {
            User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.b0k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72443a.m104769k(mqvVar, view);
                }
            };
            VText vText4 = this.f78157c;
            if (vText4 != null) {
                vText4.setText(ypv.f199497e.getString(userM135637i.hierarchy.grade < ypv.m215672k().m195721R5() ? R$string.f47126ac : R$string.f47652yb));
                xdl0.m208329E0(this.f78157c, onClickListener2);
            }
            VImage vImage4 = this.f78158d;
            if (vImage4 != null) {
                vImage4.setImageDrawable(kvc0.m147353b(i3c0.f110929Z2));
                xdl0.m208329E0(this.f78158d, onClickListener2);
            }
        }
        VText vText5 = this.f78157c;
        if (vText5 != null) {
            xdl0.m208344M(vText5, true);
        }
        VImage vImage5 = this.f78158d;
        if (vImage5 != null) {
            xdl0.m208344M(vImage5, true);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
