package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y9f0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipHeadItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f27548c;

    /* JADX INFO: renamed from: d */
    public VLinear f27549d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f27550e;

    /* JADX INFO: renamed from: f */
    public VText f27551f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f27552g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f27553h;

    /* JADX INFO: renamed from: i */
    public TextView f27554i;

    /* JADX INFO: renamed from: j */
    public TextView f27555j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f27556k;

    /* JADX INFO: renamed from: l */
    public TextView f27557l;

    /* JADX INFO: renamed from: m */
    public TextView f27558m;

    /* JADX INFO: renamed from: n */
    public VFrame f27559n;

    /* JADX INFO: renamed from: o */
    public VImage f27560o;

    /* JADX INFO: renamed from: p */
    public VText f27561p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView$a */
    public class ViewOnClickListenerC8394a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f27562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f27563b;

        public ViewOnClickListenerC8394a(String str, Act act) {
            this.f27562a = str;
            this.f27563b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_mode_entrance", OMSDialogPositon.p_navigation_view, jyb.m147494Y("mode_select", this.f27562a));
            CoreModule.f18264c.f20381e0.f89242h4.onNext(uxj0.f181467a);
            this.f27563b.m51642n2();
        }
    }

    public SidesSlipHeadItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m44664P(Act act, View view) {
        if (gra.m131676e2() && CoreModule.f18264c.f20381e0.m116541a8()) {
            Intent intentM48601Z1 = MarryProfileEditAct.m48601Z1(act);
            intentM48601Z1.putExtra("editTab", "preview");
            act.startActivity(intentM48601Z1);
        } else {
            Intent intentM51922q2 = ProfileAct.m51922q2(act, uqb0.f180396b0.f170324a.userId(), "profile_frag_me_avatar", false, true);
            intentM51922q2.putExtra("preview_type", 1);
            act.startActivity(intentM51922q2);
            act.m51642n2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m44668V(View view) {
        this.f27550e.callOnClick();
    }

    /* JADX INFO: renamed from: T */
    public final void m44669T(View view) {
        y9f0.m214819a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m44670W(final Act act, User user) {
        String str;
        if (gra.m131778z()) {
            bnl0.m105524M(this.f27548c, true);
            bnl0.m105524M(this.f27550e, false);
            bnl0.m105538V(this, qa00.m175859d(24.0f));
            bnl0.m105540X(this, qa00.m175859d(28.0f));
            bnl0.m105537U(this, qa00.m175859d(16.0f));
            bnl0.m105540X(this.f27549d, qa00.f156318e);
            bnl0.m105537U(this.f27549d, 0);
            bnl0.m105540X(this.f27552g, -qa00.f156316c);
            this.f27551f.setTextColor(getResources().getColor(c9c0.f80469x));
            uqb0.f180374G.m127111J0(this.f27548c, user.m61308fp().calculatedWidth(qa00.f156291D), false);
        } else {
            boolean zM131726o2 = gra.m131726o2();
            VDraweeView vDraweeView = this.f27548c;
            if (zM131726o2) {
                bnl0.m105524M(vDraweeView, false);
                bnl0.m105524M(this.f27550e, false);
                bnl0.m105540X(this, qa00.m175859d(12.0f));
                bnl0.m105537U(this, qa00.m175859d(30.0f));
            } else {
                bnl0.m105524M(vDraweeView, false);
                bnl0.m105524M(this.f27550e, true);
                uqb0.f180374G.m127111J0(this.f27550e, user.m61308fp().calculatedWidth(qa00.f156291D), false);
            }
        }
        this.f27551f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f27551f.setText(user.name);
        this.f27554i.setText(q8g0.m175815t(user.profile.followships.counters.followers));
        this.f27557l.setText(q8g0.m175815t(user.profile.followships.counters.followings));
        bnl0.m105509E0(this.f27553h, new View.OnClickListener() { // from class: l.q9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30932N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        bnl0.m105509E0(this.f27556k, new View.OnClickListener() { // from class: l.r9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30932N().argsToPhotoAlbumFansAct(act, FollowshipStatus.following, false);
            }
        });
        bnl0.m105509E0(this.f27550e, new View.OnClickListener() { // from class: l.s9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SidesSlipHeadItemView.m44664P(act, view);
            }
        });
        bnl0.m105509E0(this.f27548c, new View.OnClickListener() { // from class: l.t9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172636a.m44668V(view);
            }
        });
        if (gra.m131646X2()) {
            bnl0.m105524M(this.f27559n, true);
            boolean zEquals = CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode);
            VText vText = this.f27561p;
            if (zEquals) {
                vText.setText("想结婚");
                this.f27560o.setImageResource(dbc0.f86502Qd);
                str = "marry";
            } else {
                vText.setText("想恋爱");
                this.f27560o.setImageResource(dbc0.f86470Pd);
                str = "love";
            }
            i4g0.m138492A("e_mode_entrance", OMSDialogPositon.p_navigation_view, jyb.m147494Y("mode_select", str));
            bnl0.m105509E0(this.f27559n, new ViewOnClickListenerC8394a(str, act));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44669T(this);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
