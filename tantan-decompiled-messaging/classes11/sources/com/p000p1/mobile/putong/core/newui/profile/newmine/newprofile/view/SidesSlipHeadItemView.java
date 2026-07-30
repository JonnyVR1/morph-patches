package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import l.j760;
import l.qib0;
import l.r1f0;
import l.roj0;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.i0g0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SidesSlipHeadItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f5478c;

    /* JADX INFO: renamed from: d */
    public VLinear f5479d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5480e;

    /* JADX INFO: renamed from: f */
    public VText f5481f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5482g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5483h;

    /* JADX INFO: renamed from: i */
    public TextView f5484i;

    /* JADX INFO: renamed from: j */
    public TextView f5485j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f5486k;

    /* JADX INFO: renamed from: l */
    public TextView f5487l;

    /* JADX INFO: renamed from: m */
    public TextView f5488m;

    /* JADX INFO: renamed from: n */
    public VFrame f5489n;

    /* JADX INFO: renamed from: o */
    public VImage f5490o;

    /* JADX INFO: renamed from: p */
    public VText f5491p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView$a */
    public class ViewOnClickListenerC0395a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f5493b;

        public ViewOnClickListenerC0395a(String str, Act act) {
            this.f5492a = str;
            this.f5493b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_mode_entrance", "p_navigation_view", new j760[]{vwb.Y("mode_select", this.f5492a)});
            CoreModule.c.e0.h4.onNext(roj0.a);
            this.f5493b.finish();
        }
    }

    public SidesSlipHeadItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m7724P(Act act, View view) {
        if (upa.e2() && CoreModule.c.e0.a8()) {
            Intent intentY1 = MarryProfileEditAct.Y1(act);
            intentY1.putExtra("editTab", "preview");
            act.startActivity(intentY1);
        } else {
            Intent intentP2 = ProfileAct.p2(act, qib0.b0.a.userId(), "profile_frag_me_avatar", false, true);
            intentP2.putExtra("preview_type", 1);
            act.startActivity(intentP2);
            act.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m7728V(View view) {
        this.f5480e.callOnClick();
    }

    /* JADX INFO: renamed from: T */
    public final void m7729T(View view) {
        r1f0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public void m7730W(final Act act, User user) {
        String str;
        if (upa.z()) {
            xdl0.M(this.f5478c, true);
            xdl0.M(this.f5480e, false);
            xdl0.V(this, t100.d(24.0f));
            xdl0.X(this, t100.d(28.0f));
            xdl0.U(this, t100.d(16.0f));
            xdl0.X(this.f5479d, t100.e);
            xdl0.U(this.f5479d, 0);
            xdl0.X(this.f5482g, -t100.c);
            this.f5481f.setTextColor(getResources().getColor(w0c0.x));
            qib0.G.J0(this.f5478c, user.fp().calculatedWidth(t100.D), false);
        } else {
            boolean zO2 = upa.o2();
            VDraweeView vDraweeView = this.f5478c;
            if (zO2) {
                xdl0.M(vDraweeView, false);
                xdl0.M(this.f5480e, false);
                xdl0.X(this, t100.d(12.0f));
                xdl0.U(this, t100.d(30.0f));
            } else {
                xdl0.M(vDraweeView, false);
                xdl0.M(this.f5480e, true);
                qib0.G.J0(this.f5480e, user.fp().calculatedWidth(t100.D), false);
            }
        }
        this.f5481f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5481f.setText(user.name);
        this.f5484i.setText(i0g0.m16148t(user.profile.followships.counters.followers));
        this.f5487l.setText(i0g0.m16148t(user.profile.followships.counters.followings));
        xdl0.E0(this.f5483h, new View.OnClickListener() { // from class: l.j1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        xdl0.E0(this.f5486k, new View.OnClickListener() { // from class: l.k1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.N().argsToPhotoAlbumFansAct(act, "following", false);
            }
        });
        xdl0.E0(this.f5480e, new View.OnClickListener() { // from class: l.l1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SidesSlipHeadItemView.m7724P(act, view);
            }
        });
        xdl0.E0(this.f5478c, new View.OnClickListener() { // from class: l.m1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16484a.m7728V(view);
            }
        });
        if (upa.X2()) {
            xdl0.M(this.f5489n, true);
            boolean zEquals = ((String) CoreModule.c.e0.Z3.get()).equals("marryMode");
            VText vText = this.f5491p;
            if (zEquals) {
                vText.setText("想结婚");
                this.f5490o.setImageResource(x2c0.Pd);
                str = "marry";
            } else {
                vText.setText("想恋爱");
                this.f5490o.setImageResource(x2c0.Od);
                str = "love";
            }
            zvf0.A("e_mode_entrance", "p_navigation_view", new j760[]{vwb.Y("mode_select", str)});
            xdl0.E0(this.f5489n, new ViewOnClickListenerC0395a(str, act));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7729T(this);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
