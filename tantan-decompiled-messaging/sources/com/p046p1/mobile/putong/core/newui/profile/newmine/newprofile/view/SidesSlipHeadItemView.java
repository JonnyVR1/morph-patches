package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.i0g0;
import p149l.qib0;
import p149l.r1f0;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipHeadItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f26700c;

    /* JADX INFO: renamed from: d */
    public VLinear f26701d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f26702e;

    /* JADX INFO: renamed from: f */
    public VText f26703f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f26704g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f26705h;

    /* JADX INFO: renamed from: i */
    public TextView f26706i;

    /* JADX INFO: renamed from: j */
    public TextView f26707j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f26708k;

    /* JADX INFO: renamed from: l */
    public TextView f26709l;

    /* JADX INFO: renamed from: m */
    public TextView f26710m;

    /* JADX INFO: renamed from: n */
    public VFrame f26711n;

    /* JADX INFO: renamed from: o */
    public VImage f26712o;

    /* JADX INFO: renamed from: p */
    public VText f26713p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView$a */
    public class ViewOnClickListenerC8231a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f26714a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f26715b;

        public ViewOnClickListenerC8231a(String str, Act act) {
            this.f26714a = str;
            this.f26715b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_mode_entrance", OMSDialogPositon.p_navigation_view, vwb.m200311Y("mode_select", this.f26714a));
            CoreModule.f17545c.f19639e0.f149385h4.onNext(roj0.f160388a);
            this.f26715b.m50458m2();
        }
    }

    public SidesSlipHeadItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m43478P(Act act, View view) {
        if (upa.m194745e2() && CoreModule.f17545c.f19639e0.m169468a8()) {
            Intent intentM47418Y1 = MarryProfileEditAct.m47418Y1(act);
            intentM47418Y1.putExtra("editTab", "preview");
            act.startActivity(intentM47418Y1);
        } else {
            Intent intentM50738p2 = ProfileAct.m50738p2(act, qib0.f154713b0.f139230a.userId(), "profile_frag_me_avatar", false, true);
            intentM50738p2.putExtra("preview_type", 1);
            act.startActivity(intentM50738p2);
            act.m50458m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m43482V(View view) {
        this.f26702e.callOnClick();
    }

    /* JADX INFO: renamed from: T */
    public final void m43483T(View view) {
        r1f0.m177463a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m43484W(final Act act, User user) {
        String str;
        if (upa.m194847z()) {
            xdl0.m208344M(this.f26700c, true);
            xdl0.m208344M(this.f26702e, false);
            xdl0.m208358V(this, t100.m186890d(24.0f));
            xdl0.m208360X(this, t100.m186890d(28.0f));
            xdl0.m208357U(this, t100.m186890d(16.0f));
            xdl0.m208360X(this.f26701d, t100.f167256e);
            xdl0.m208357U(this.f26701d, 0);
            xdl0.m208360X(this.f26704g, -t100.f167254c);
            this.f26703f.setTextColor(getResources().getColor(w0c0.f183899x));
            qib0.f154691G.m102327J0(this.f26700c, user.m60124fp().calculatedWidth(t100.f167229D), false);
        } else {
            boolean zM194795o2 = upa.m194795o2();
            VDraweeView vDraweeView = this.f26700c;
            if (zM194795o2) {
                xdl0.m208344M(vDraweeView, false);
                xdl0.m208344M(this.f26702e, false);
                xdl0.m208360X(this, t100.m186890d(12.0f));
                xdl0.m208357U(this, t100.m186890d(30.0f));
            } else {
                xdl0.m208344M(vDraweeView, false);
                xdl0.m208344M(this.f26702e, true);
                qib0.f154691G.m102327J0(this.f26702e, user.m60124fp().calculatedWidth(t100.f167229D), false);
            }
        }
        this.f26703f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26703f.setText(user.name);
        this.f26706i.setText(i0g0.m133880t(user.profile.followships.counters.followers));
        this.f26709l.setText(i0g0.m133880t(user.profile.followships.counters.followings));
        xdl0.m208329E0(this.f26705h, new View.OnClickListener() { // from class: l.j1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29934N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        xdl0.m208329E0(this.f26708k, new View.OnClickListener() { // from class: l.k1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29934N().argsToPhotoAlbumFansAct(act, FollowshipStatus.following, false);
            }
        });
        xdl0.m208329E0(this.f26702e, new View.OnClickListener() { // from class: l.l1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SidesSlipHeadItemView.m43478P(act, view);
            }
        });
        xdl0.m208329E0(this.f26700c, new View.OnClickListener() { // from class: l.m1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130829a.m43482V(view);
            }
        });
        if (upa.m194715X2()) {
            xdl0.m208344M(this.f26711n, true);
            boolean zEquals = CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode);
            VText vText = this.f26713p;
            if (zEquals) {
                vText.setText("想结婚");
                this.f26712o.setImageResource(x2c0.f189638Pd);
                str = "marry";
            } else {
                vText.setText("想恋爱");
                this.f26712o.setImageResource(x2c0.f189607Od);
                str = "love";
            }
            zvf0.m220368A("e_mode_entrance", OMSDialogPositon.p_navigation_view, vwb.m200311Y("mode_select", str));
            xdl0.m208329E0(this.f26711n, new ViewOnClickListenerC8231a(str, act));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43483T(this);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
