package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dml;
import p149l.e30;
import p149l.i0g0;
import p149l.mkd0;
import p149l.q1f0;
import p149l.roj0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipHeadItemViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f26717c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f26718d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f26719e;

    /* JADX INFO: renamed from: f */
    public TextView f26720f;

    /* JADX INFO: renamed from: g */
    public TextView f26721g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f26722h;

    /* JADX INFO: renamed from: i */
    public TextView f26723i;

    /* JADX INFO: renamed from: j */
    public TextView f26724j;

    /* JADX INFO: renamed from: k */
    public VFrame f26725k;

    /* JADX INFO: renamed from: l */
    public VImage f26726l;

    /* JADX INFO: renamed from: m */
    public VText f26727m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2$a */
    public class ViewOnClickListenerC8232a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f26728a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f26729b;

        public ViewOnClickListenerC8232a(String str, Act act) {
            this.f26728a = str;
            this.f26729b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_mode_entrance", OMSDialogPositon.p_navigation_view, vwb.m200311Y("mode_select", this.f26728a));
            CoreModule.f17545c.f19639e0.f149385h4.onNext(roj0.f160388a);
            this.f26729b.m66873d2();
        }
    }

    public SidesSlipHeadItemViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m43488S(View view) {
        q1f0.m172396a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m43489T(final Act act, User user) {
        String str;
        boolean zEquals = CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode);
        VText vText = this.f26727m;
        if (zEquals) {
            vText.setText("想结婚");
            this.f26726l.setImageResource(x2c0.f189638Pd);
            str = "marry";
        } else {
            vText.setText("想恋爱");
            this.f26726l.setImageResource(x2c0.f189607Od);
            str = "love";
        }
        zvf0.m220368A("e_mode_entrance", OMSDialogPositon.p_navigation_view, vwb.m200311Y("mode_select", str));
        xdl0.m208329E0(this.f26725k, new ViewOnClickListenerC8232a(str, act));
        this.f26717c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26717c.setText(user.name);
        this.f26720f.setText(i0g0.m133880t(user.profile.followships.counters.followers));
        this.f26723i.setText(i0g0.m133880t(user.profile.followships.counters.followings));
        xdl0.m208329E0(this.f26719e, new View.OnClickListener() { // from class: l.o1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29934N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        xdl0.m208329E0(this.f26722h, new View.OnClickListener() { // from class: l.p1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29934N().argsToPhotoAlbumFansAct(act, FollowshipStatus.following, false);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m43490V(final Act act, dml dmlVar) {
        dmlVar.mo67374c(act, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.n1f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136628a.m43489T(act, (User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43488S(this);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
