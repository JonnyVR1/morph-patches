package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.view.SimpleUpdateAvatarView;
import com.p046p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import java.util.ArrayList;
import java.util.List;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class em1 implements s7m<wl1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f92159a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f92160b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f92161c;

    /* JADX INFO: renamed from: d */
    public VLinear f92162d;

    /* JADX INFO: renamed from: e */
    public VLinear f92163e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f92164f;

    /* JADX INFO: renamed from: g */
    public VLinear f92165g;

    /* JADX INFO: renamed from: h */
    public VFrame f92166h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f92167i;

    /* JADX INFO: renamed from: j */
    public View f92168j;

    /* JADX INFO: renamed from: k */
    public VFrame f92169k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f92170l;

    /* JADX INFO: renamed from: m */
    public View f92171m;

    /* JADX INFO: renamed from: n */
    public VFrame f92172n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f92173o;

    /* JADX INFO: renamed from: p */
    public View f92174p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f92175q;

    /* JADX INFO: renamed from: r */
    public VLinear f92176r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f92177s;

    /* JADX INFO: renamed from: t */
    public VText_NoTopPadding f92178t;

    /* JADX INFO: renamed from: u */
    public wl1 f92179u;

    /* JADX INFO: renamed from: v */
    public final Act f92180v;

    public em1(Act act) {
        this.f92180v = act;
    }

    /* JADX INFO: renamed from: m */
    private void m117179m() {
        this.f92159a.setLeftIconAsBack(this.f92180v);
        this.f92159a.setTitle(this.f92179u.m203729q0());
    }

    /* JADX INFO: renamed from: n */
    private void m117180n() {
        this.f92159a.setLeftIconResource(x2c0.f189827Vg);
        this.f92160b.setTextColor(Color.parseColor(Constants.BLACK));
        this.f92177s.setBackgroundResource(x2c0.f190730y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m117181u() {
        final yk5 yk5Var = new yk5(this.f92180v, 1);
        yk5Var.m215118D(new View.OnClickListener() { // from class: l.dm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86891a.m117192s(yk5Var, view);
            }
        });
        yk5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m117182w(View view) {
        zvf0.m220399u("e_verify_privacy_agreement", this.f92180v.pageId(), j760.m140076a("is_selected", Boolean.valueOf(this.f92177s.isChecked())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m117183x(View view) {
        this.f92179u.m203727o0();
        zvf0.m220396r("e_album_upload_photos_verify", this.f92180v.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m117184y(View view) {
        this.f92179u.m203730r0();
    }

    /* JADX INFO: renamed from: A */
    public void m117185A(int i, boolean z) {
        int i2;
        View view = new View[]{this.f92168j, this.f92171m, this.f92174p}[i];
        if (z) {
            i2 = upa.m194847z() ? x2c0.f189185B : x2c0.f190187gu;
        } else {
            i2 = x2c0.f190155fu;
        }
        view.setBackgroundResource(i2);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92180v;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m117186j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m117186j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fm1.m122107b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wl1 wl1Var) {
        this.f92179u = wl1Var;
    }

    /* JADX INFO: renamed from: l */
    public void m117188l(boolean z) {
        int i;
        VText_NoTopPadding vText_NoTopPadding = this.f92175q;
        if (z) {
            i = upa.m194847z() ? x2c0.f190538s : x2c0.f189858Wg;
        } else {
            i = x2c0.f189774Tp;
        }
        vText_NoTopPadding.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m117189p() {
        return this.f92177s.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m117190q(List list, int i, View view) {
        lrj0.C18309b c18309b = new lrj0.C18309b();
        c18309b.f129724a = AvatarUpdateProgress.FINISH;
        c18309b.f129725b = (Media) list.get(i);
        c18309b.f129729f = true;
        this.f92179u.f186859d.onNext(c18309b);
        zvf0.m220396r("e_select_recommended_photos_verify", this.f92180v.pageId());
    }

    /* JADX INFO: renamed from: r */
    public void m117191r() {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        if (userMo223809clone.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + userMo223809clone.f56011id)).pictures.get(0) instanceof Video) {
            this.f92180v.m47815F2();
            return;
        }
        m117179m();
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(86.0f)) / 3;
        int i = (iM208412y0 * 120) / 96;
        xdl0.m208327D0(iM208412y0, this.f92166h, this.f92169k, this.f92172n);
        xdl0.m208325C0(this.f92166h, i);
        xdl0.m208325C0(this.f92169k, i);
        xdl0.m208325C0(this.f92172n, i);
        final List<Media> listM203728p0 = this.f92179u.m203728p0();
        boolean zM200296J = vwb.m200296J(listM203728p0);
        VLinear vLinear = this.f92162d;
        if (zM200296J) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f92165g, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f92165g, true);
            ArrayList arrayListM200324f0 = vwb.m200324f0(this.f92166h, this.f92169k, this.f92172n);
            ArrayList arrayListM200324f1 = vwb.m200324f0(this.f92167i, this.f92170l, this.f92173o);
            for (final int i2 = 0; i2 < listM203728p0.size(); i2++) {
                Media media = listM203728p0.get(i2);
                xdl0.m208344M((View) arrayListM200324f0.get(i2), true);
                qib0.f154691G.m102331L0((SimpleDraweeView) arrayListM200324f1.get(i2), media.cover().profile480().formatted());
                xdl0.m208329E0((View) arrayListM200324f0.get(i2), new View.OnClickListener() { // from class: l.xl1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f193371a.m117190q(listM203728p0, i2, view);
                    }
                });
            }
            zvf0.m220402x("e_select_recommended_photos_verify", this.f92180v.pageId());
        }
        cjj0.m107174b(this.f92178t, "《真实头像认证协议》", 855638016, new d30() { // from class: l.yl1
            @Override // p149l.d30
            public final void call() {
                this.f198854a.m117181u();
            }
        }, true);
        this.f92177s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.zl1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f203587a.m117193v(compoundButton, z);
            }
        });
        xdl0.m208329E0(this.f92177s, new View.OnClickListener() { // from class: l.am1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70540a.m117182w(view);
            }
        });
        xdl0.m208329E0(this.f92163e, new View.OnClickListener() { // from class: l.bm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76230a.m117183x(view);
            }
        });
        xdl0.m208329E0(this.f92175q, new View.OnClickListener() { // from class: l.cm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81487a.m117184y(view);
            }
        });
        if (this.f92179u.f186857b == 2) {
            xdl0.m208344M(this.f92176r, false);
        }
        if (upa.m194847z()) {
            m117180n();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m117192s(yk5 yk5Var, View view) {
        this.f92177s.setChecked(true);
        yk5Var.dismiss();
        this.f92179u.m203726G0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m117193v(CompoundButton compoundButton, boolean z) {
        this.f92179u.m203726G0();
    }

    /* JADX INFO: renamed from: z */
    public void m117194z(lrj0.C18309b c18309b) {
        this.f92161c.m56092v(c18309b);
        AvatarUpdateProgress avatarUpdateProgress = c18309b.f129724a;
        if (avatarUpdateProgress == AvatarUpdateProgress.UPLOADING || avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
            this.f92179u.m203726G0();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
