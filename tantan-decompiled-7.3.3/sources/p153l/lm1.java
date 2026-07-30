package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.view.SimpleUpdateAvatarView;
import com.p051p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import java.util.ArrayList;
import java.util.List;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class lm1 implements iam<dm1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f132623a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f132624b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f132625c;

    /* JADX INFO: renamed from: d */
    public VLinear f132626d;

    /* JADX INFO: renamed from: e */
    public VLinear f132627e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f132628f;

    /* JADX INFO: renamed from: g */
    public VLinear f132629g;

    /* JADX INFO: renamed from: h */
    public VFrame f132630h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f132631i;

    /* JADX INFO: renamed from: j */
    public View f132632j;

    /* JADX INFO: renamed from: k */
    public VFrame f132633k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f132634l;

    /* JADX INFO: renamed from: m */
    public View f132635m;

    /* JADX INFO: renamed from: n */
    public VFrame f132636n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f132637o;

    /* JADX INFO: renamed from: p */
    public View f132638p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f132639q;

    /* JADX INFO: renamed from: r */
    public VLinear f132640r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f132641s;

    /* JADX INFO: renamed from: t */
    public VText_NoTopPadding f132642t;

    /* JADX INFO: renamed from: u */
    public dm1 f132643u;

    /* JADX INFO: renamed from: v */
    public final Act f132644v;

    public lm1(Act act) {
        this.f132644v = act;
    }

    /* JADX INFO: renamed from: m */
    private void m154832m() {
        this.f132623a.setLeftIconAsBack(this.f132644v);
        this.f132623a.setTitle(this.f132643u.m116931q0());
    }

    /* JADX INFO: renamed from: n */
    private void m154833n() {
        this.f132623a.setLeftIconResource(dbc0.f86282Jh);
        this.f132624b.setTextColor(Color.parseColor(Constants.BLACK));
        this.f132641s.setBackgroundResource(dbc0.f87625z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m154834u() {
        final bm5 bm5Var = new bm5(this.f132644v, 1);
        bm5Var.m104999D(new View.OnClickListener() { // from class: l.km1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127425a.m154845s(bm5Var, view);
            }
        });
        bm5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m154835w(View view) {
        i4g0.m138523u("e_verify_privacy_agreement", this.f132644v.pageId(), pf60.m172085a("is_selected", Boolean.valueOf(this.f132641s.isChecked())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m154836x(View view) {
        this.f132643u.m116929o0();
        i4g0.m138520r("e_album_upload_photos_verify", this.f132644v.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m154837y(View view) {
        this.f132643u.m116932r0();
    }

    /* JADX INFO: renamed from: A */
    public void m154838A(int i, boolean z) {
        int i2;
        View view = new View[]{this.f132632j, this.f132635m, this.f132638p}[i];
        if (z) {
            i2 = gra.m131778z() ? dbc0.f86040C : dbc0.f86647Uu;
        } else {
            i2 = dbc0.f86615Tu;
        }
        view.setBackgroundResource(i2);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f132644v;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m154839j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m154839j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mm1.m158952b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dm1 dm1Var) {
        this.f132643u = dm1Var;
    }

    /* JADX INFO: renamed from: l */
    public void m154841l(boolean z) {
        int i;
        VText_NoTopPadding vText_NoTopPadding = this.f132639q;
        if (z) {
            i = gra.m131778z() ? dbc0.f87432t : dbc0.f86314Kh;
        } else {
            i = dbc0.f86227Hq;
        }
        vText_NoTopPadding.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m154842p() {
        return this.f132641s.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m154843q(List list, int i, View view) {
        p0k0.C19267b c19267b = new p0k0.C19267b();
        c19267b.f150064a = AvatarUpdateProgress.FINISH;
        c19267b.f150065b = (Media) list.get(i);
        c19267b.f150069f = true;
        this.f132643u.f89597d.onNext(c19267b);
        i4g0.m138520r("e_select_recommended_photos_verify", this.f132644v.pageId());
    }

    /* JADX INFO: renamed from: r */
    public void m154844r() {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        if (userMo225055clone.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + userMo225055clone.f56859id)).pictures.get(0) instanceof Video) {
            this.f132644v.m48999H2();
            return;
        }
        m154832m();
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(86.0f)) / 3;
        int i = (iM105592y0 * 120) / 96;
        bnl0.m105507D0(iM105592y0, this.f132630h, this.f132633k, this.f132636n);
        bnl0.m105505C0(this.f132630h, i);
        bnl0.m105505C0(this.f132633k, i);
        bnl0.m105505C0(this.f132636n, i);
        final List<Media> listM116930p0 = this.f132643u.m116930p0();
        boolean zM147479J = jyb.m147479J(listM116930p0);
        VLinear vLinear = this.f132626d;
        if (zM147479J) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f132629g, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f132629g, true);
            ArrayList arrayListM147507f0 = jyb.m147507f0(this.f132630h, this.f132633k, this.f132636n);
            ArrayList arrayListM147507f1 = jyb.m147507f0(this.f132631i, this.f132634l, this.f132637o);
            for (final int i2 = 0; i2 < listM116930p0.size(); i2++) {
                Media media = listM116930p0.get(i2);
                bnl0.m105524M((View) arrayListM147507f0.get(i2), true);
                uqb0.f180374G.m127115L0((SimpleDraweeView) arrayListM147507f1.get(i2), media.cover().profile480().formatted());
                bnl0.m105509E0((View) arrayListM147507f0.get(i2), new View.OnClickListener() { // from class: l.em1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f94604a.m154843q(listM116930p0, i2, view);
                    }
                });
            }
            i4g0.m138526x("e_select_recommended_photos_verify", this.f132644v.pageId());
        }
        fsj0.m127200b(this.f132642t, "《真实头像认证协议》", 855638016, new x20() { // from class: l.fm1
            @Override // p153l.x20
            public final void call() {
                this.f99708a.m154834u();
            }
        }, true);
        this.f132641s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.gm1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f104906a.m154846v(compoundButton, z);
            }
        });
        bnl0.m105509E0(this.f132641s, new View.OnClickListener() { // from class: l.hm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110568a.m154835w(view);
            }
        });
        bnl0.m105509E0(this.f132627e, new View.OnClickListener() { // from class: l.im1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115641a.m154836x(view);
            }
        });
        bnl0.m105509E0(this.f132639q, new View.OnClickListener() { // from class: l.jm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121634a.m154837y(view);
            }
        });
        if (this.f132643u.f89595b == 2) {
            bnl0.m105524M(this.f132640r, false);
        }
        if (gra.m131778z()) {
            m154833n();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m154845s(bm5 bm5Var, View view) {
        this.f132641s.setChecked(true);
        bm5Var.dismiss();
        this.f132643u.m116928G0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m154846v(CompoundButton compoundButton, boolean z) {
        this.f132643u.m116928G0();
    }

    /* JADX INFO: renamed from: z */
    public void m154847z(p0k0.C19267b c19267b) {
        this.f132625c.m57275v(c19267b);
        AvatarUpdateProgress avatarUpdateProgress = c19267b.f150064a;
        if (avatarUpdateProgress == AvatarUpdateProgress.UPLOADING || avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
            this.f132643u.m116928G0();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
