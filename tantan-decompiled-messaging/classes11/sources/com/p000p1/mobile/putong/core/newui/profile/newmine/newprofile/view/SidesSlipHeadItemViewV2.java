package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.dml;
import l.e30;
import l.j760;
import l.mkd0;
import l.q1f0;
import l.roj0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.i0g0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SidesSlipHeadItemViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f5495c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f5496d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5497e;

    /* JADX INFO: renamed from: f */
    public TextView f5498f;

    /* JADX INFO: renamed from: g */
    public TextView f5499g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5500h;

    /* JADX INFO: renamed from: i */
    public TextView f5501i;

    /* JADX INFO: renamed from: j */
    public TextView f5502j;

    /* JADX INFO: renamed from: k */
    public VFrame f5503k;

    /* JADX INFO: renamed from: l */
    public VImage f5504l;

    /* JADX INFO: renamed from: m */
    public VText f5505m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2$a */
    public class ViewOnClickListenerC0396a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5506a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f5507b;

        public ViewOnClickListenerC0396a(String str, Act act) {
            this.f5506a = str;
            this.f5507b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_mode_entrance", "p_navigation_view", new j760[]{vwb.Y("mode_select", this.f5506a)});
            CoreModule.c.e0.h4.onNext(roj0.a);
            this.f5507b.finish();
        }
    }

    public SidesSlipHeadItemViewV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m7734S(View view) {
        q1f0.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m7735T(final Act act, User user) {
        String str;
        boolean zEquals = ((String) CoreModule.c.e0.Z3.get()).equals("marryMode");
        VText vText = this.f5505m;
        if (zEquals) {
            vText.setText("想结婚");
            this.f5504l.setImageResource(x2c0.Pd);
            str = "marry";
        } else {
            vText.setText("想恋爱");
            this.f5504l.setImageResource(x2c0.Od);
            str = "love";
        }
        zvf0.A("e_mode_entrance", "p_navigation_view", new j760[]{vwb.Y("mode_select", str)});
        xdl0.E0(this.f5503k, new ViewOnClickListenerC0396a(str, act));
        this.f5495c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5495c.setText(user.name);
        this.f5498f.setText(i0g0.m16148t(user.profile.followships.counters.followers));
        this.f5501i.setText(i0g0.m16148t(user.profile.followships.counters.followings));
        xdl0.E0(this.f5497e, new View.OnClickListener() { // from class: l.o1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.N().argsToPhotoAlbumFansAct(act, "fans", false);
            }
        });
        xdl0.E0(this.f5500h, new View.OnClickListener() { // from class: l.p1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.N().argsToPhotoAlbumFansAct(act, "following", false);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m7736V(final Act act, dml dmlVar) {
        dmlVar.c(act, CoreModule.c.e0.o9()).subscribe(mkd0.G(new e30() { // from class: l.n1f0
            public final void call(Object obj) {
                this.f17182a.m7735T(act, (User) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7734S(this);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipHeadItemViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
