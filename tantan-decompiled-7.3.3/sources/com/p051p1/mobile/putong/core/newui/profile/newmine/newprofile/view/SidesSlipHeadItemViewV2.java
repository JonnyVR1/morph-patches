package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.pol;
import p153l.psd0;
import p153l.q8g0;
import p153l.uxj0;
import p153l.x9f0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipHeadItemViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f27565c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f27566d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f27567e;

    /* JADX INFO: renamed from: f */
    public TextView f27568f;

    /* JADX INFO: renamed from: g */
    public TextView f27569g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f27570h;

    /* JADX INFO: renamed from: i */
    public TextView f27571i;

    /* JADX INFO: renamed from: j */
    public TextView f27572j;

    /* JADX INFO: renamed from: k */
    public VFrame f27573k;

    /* JADX INFO: renamed from: l */
    public VImage f27574l;

    /* JADX INFO: renamed from: m */
    public VText f27575m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2$a */
    public class ViewOnClickListenerC8395a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f27576a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f27577b;

        public ViewOnClickListenerC8395a(String str, Act act) {
            this.f27576a = str;
            this.f27577b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_mode_entrance", OMSDialogPositon.p_navigation_view, jyb.m147494Y("mode_select", this.f27576a));
            CoreModule.f18264c.f20381e0.f89242h4.onNext(uxj0.f181467a);
            this.f27577b.m68056e2();
        }
    }

    public SidesSlipHeadItemViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m44674S(View view) {
        x9f0.m209798a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m44675T(final Act act, User user) {
        String str;
        boolean zEquals = CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode);
        VText vText = this.f27575m;
        if (zEquals) {
            vText.setText("想结婚");
            this.f27574l.setImageResource(dbc0.f86502Qd);
            str = "marry";
        } else {
            vText.setText("想恋爱");
            this.f27574l.setImageResource(dbc0.f86470Pd);
            str = "love";
        }
        i4g0.m138492A("e_mode_entrance", OMSDialogPositon.p_navigation_view, jyb.m147494Y("mode_select", str));
        bnl0.m105509E0(this.f27573k, new ViewOnClickListenerC8395a(str, act));
        this.f27565c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f27565c.setText(user.name);
        this.f27568f.setText(q8g0.m175815t(user.profile.followships.counters.followers));
        this.f27571i.setText(q8g0.m175815t(user.profile.followships.counters.followings));
        bnl0.m105509E0(this.f27567e, new View.OnClickListener() { // from class: l.v9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30932N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        bnl0.m105509E0(this.f27570h, new View.OnClickListener() { // from class: l.w9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30932N().argsToPhotoAlbumFansAct(act, FollowshipStatus.following, false);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m44676V(final Act act, pol polVar) {
        polVar.mo68557c(act, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.u9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178115a.m44675T(act, (User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44674S(this);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
