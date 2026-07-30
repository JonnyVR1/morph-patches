package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.verification.remind.view.SimpleUpdateAvatarView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.cjj0;
import l.d30;
import l.fm1;
import l.j760;
import l.lrj0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yk5;
import l.zvf0;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText_NoTopPadding;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class em1 implements s7m<wl1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f11251a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f11252b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f11253c;

    /* JADX INFO: renamed from: d */
    public VLinear f11254d;

    /* JADX INFO: renamed from: e */
    public VLinear f11255e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f11256f;

    /* JADX INFO: renamed from: g */
    public VLinear f11257g;

    /* JADX INFO: renamed from: h */
    public VFrame f11258h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f11259i;

    /* JADX INFO: renamed from: j */
    public View f11260j;

    /* JADX INFO: renamed from: k */
    public VFrame f11261k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f11262l;

    /* JADX INFO: renamed from: m */
    public View f11263m;

    /* JADX INFO: renamed from: n */
    public VFrame f11264n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f11265o;

    /* JADX INFO: renamed from: p */
    public View f11266p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f11267q;

    /* JADX INFO: renamed from: r */
    public VLinear f11268r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f11269s;

    /* JADX INFO: renamed from: t */
    public VText_NoTopPadding f11270t;

    /* JADX INFO: renamed from: u */
    public wl1 f11271u;

    /* JADX INFO: renamed from: v */
    public final Act f11272v;

    public em1(Act act) {
        this.f11272v = act;
    }

    /* JADX INFO: renamed from: m */
    private void m14687m() {
        this.f11251a.setLeftIconAsBack(this.f11272v);
        this.f11251a.setTitle(this.f11271u.m26437q0());
    }

    /* JADX INFO: renamed from: n */
    private void m14688n() {
        this.f11251a.setLeftIconResource(x2c0.f26363Vg);
        this.f11252b.setTextColor(Color.parseColor("#000000"));
        this.f11269s.setBackgroundResource(x2c0.f27266y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m14689u() {
        final yk5 yk5Var = new yk5(this.f11272v, 1);
        yk5Var.D(new View.OnClickListener() { // from class: l.dm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10471a.m14702s(yk5Var, view);
            }
        });
        yk5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m14690w(View view) {
        zvf0.u("e_verify_privacy_agreement", this.f11272v.pageId(), new j760[]{j760.a("is_selected", Boolean.valueOf(this.f11269s.isChecked()))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m14691x(View view) {
        this.f11271u.m26435o0();
        zvf0.r("e_album_upload_photos_verify", this.f11272v.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m14692y(View view) {
        this.f11271u.m26438r0();
    }

    /* JADX INFO: renamed from: A */
    public void m14693A(int i, boolean z) {
        int i2;
        View view = new View[]{this.f11260j, this.f11263m, this.f11266p}[i];
        if (z) {
            i2 = upa.m25545z() ? x2c0.f25721B : x2c0.f26723gu;
        } else {
            i2 = x2c0.f26691fu;
        }
        view.setBackgroundResource(i2);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14694C0() {
        return this.f11272v;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14696j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m14696j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fm1.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m14695i1(wl1 wl1Var) {
        this.f11271u = wl1Var;
    }

    /* JADX INFO: renamed from: l */
    public void m14698l(boolean z) {
        int i;
        VText_NoTopPadding vText_NoTopPadding = this.f11267q;
        if (z) {
            i = upa.m25545z() ? x2c0.f27074s : x2c0.f26394Wg;
        } else {
            i = x2c0.f26310Tp;
        }
        vText_NoTopPadding.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m14699p() {
        return this.f11269s.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m14700q(List list, int i, View view) {
        lrj0.b bVar = new lrj0.b();
        bVar.a = AvatarUpdateProgress.FINISH;
        bVar.b = (Media) list.get(i);
        bVar.f = true;
        this.f11271u.f25215d.onNext(bVar);
        zvf0.r("e_select_recommended_photos_verify", this.f11272v.pageId());
    }

    /* JADX INFO: renamed from: r */
    public void m14701r() {
        User userClone = CoreModule.f1534c.f3628e0.m21490p9().clone();
        if (userClone.riskAuditUser(CoreModule.f1534c.f3628e0.m21393Pa("fake_risk_audit_default_" + ((DbObject) userClone).id)).pictures.get(0) instanceof Video) {
            this.f11272v.finish();
            return;
        }
        m14687m();
        int iY0 = (xdl0.y0() - t100.d(86.0f)) / 3;
        int i = (iY0 * 120) / 96;
        xdl0.D0(iY0, new View[]{this.f11258h, this.f11261k, this.f11264n});
        xdl0.C0(this.f11258h, i);
        xdl0.C0(this.f11261k, i);
        xdl0.C0(this.f11264n, i);
        final List<Media> listM26436p0 = this.f11271u.m26436p0();
        boolean zJ = vwb.J(listM26436p0);
        VLinear vLinear = this.f11254d;
        if (zJ) {
            xdl0.M(vLinear, true);
            xdl0.M(this.f11257g, false);
        } else {
            xdl0.M(vLinear, false);
            xdl0.M(this.f11257g, true);
            ArrayList arrayListF0 = vwb.f0(new VFrame[]{this.f11258h, this.f11261k, this.f11264n});
            ArrayList arrayListF1 = vwb.f0(new VDraweeView[]{this.f11259i, this.f11262l, this.f11265o});
            for (final int i2 = 0; i2 < listM26436p0.size(); i2++) {
                Media media = listM26436p0.get(i2);
                xdl0.M((View) arrayListF0.get(i2), true);
                qib0.f19782G.m12744L0((SimpleDraweeView) arrayListF1.get(i2), media.cover().profile480().formatted());
                xdl0.E0((View) arrayListF0.get(i2), new View.OnClickListener() { // from class: l.xl1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f27577a.m14700q(listM26436p0, i2, view);
                    }
                });
            }
            zvf0.x("e_select_recommended_photos_verify", this.f11272v.pageId());
        }
        cjj0.b(this.f11270t, "《真实头像认证协议》", 855638016, new d30() { // from class: l.yl1
            public final void call() {
                this.f28282a.m14689u();
            }
        }, true);
        this.f11269s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.zl1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f28799a.m14703v(compoundButton, z);
            }
        });
        xdl0.E0(this.f11269s, new View.OnClickListener() { // from class: l.am1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8354a.m14690w(view);
            }
        });
        xdl0.E0(this.f11255e, new View.OnClickListener() { // from class: l.bm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8981a.m14691x(view);
            }
        });
        xdl0.E0(this.f11267q, new View.OnClickListener() { // from class: l.cm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9726a.m14692y(view);
            }
        });
        if (this.f11271u.f25213b == 2) {
            xdl0.M(this.f11268r, false);
        }
        if (upa.m25545z()) {
            m14688n();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m14702s(yk5 yk5Var, View view) {
        this.f11269s.setChecked(true);
        yk5Var.dismiss();
        this.f11271u.m26432G0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m14703v(CompoundButton compoundButton, boolean z) {
        this.f11271u.m26432G0();
    }

    /* JADX INFO: renamed from: z */
    public void m14704z(lrj0.b bVar) {
        this.f11253c.m9517v(bVar);
        AvatarUpdateProgress avatarUpdateProgress = bVar.a;
        if (avatarUpdateProgress == AvatarUpdateProgress.UPLOADING || avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
            this.f11271u.m26432G0();
        }
    }

    public void destroy() {
    }
}
