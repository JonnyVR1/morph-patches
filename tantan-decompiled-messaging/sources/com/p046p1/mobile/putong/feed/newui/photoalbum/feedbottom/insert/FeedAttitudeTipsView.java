package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.dng;
import p149l.e30;
import p149l.f3c0;
import p149l.j760;
import p149l.mkd0;
import p149l.o6c0;
import p149l.p6j0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xia;
import p149l.yih;
import p149l.yt0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAttitudeTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f41769a;

    /* JADX INFO: renamed from: b */
    public VLinear f41770b;

    /* JADX INFO: renamed from: c */
    public Moment f41771c;

    /* JADX INFO: renamed from: d */
    public String f41772d;

    /* JADX INFO: renamed from: e */
    public d30 f41773e;

    public FeedAttitudeTipsView(Context context) {
        super(context);
        m64545g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m64539a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public View m64542d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dng.m112619b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m64543e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m64544f(int i) {
        p6j0.m167669c("e_attitude_bubble", this.f41772d, j760.m140076a("attitude", Integer.valueOf(i)), j760.m140076a("moment_id", NullChecker.m81303a(this.f41771c) ? this.f41771c.f56011id : ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m64545g(Context context) {
        addView(m64542d(LayoutInflater.from(context), this));
        m64546h();
    }

    /* JADX INFO: renamed from: h */
    public final void m64546h() {
        ArrayList<AttitudeConfigs> arrayListM214911f = yih.m214909l().m214911f();
        boolean zM200296J = vwb.m200296J(arrayListM214911f);
        VFrame vFrame = this.f41769a;
        if (zM200296J) {
            xdl0.m208344M(vFrame, false);
            return;
        }
        xdl0.m208344M(vFrame, true);
        this.f41770b.removeAllViews();
        for (int i = 0; i < arrayListM214911f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM214911f.get(i);
            View view = (VLinear) m64543e().inflater().inflate(o6c0.f142038H, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = t100.m186890d(12.0f);
            }
            view.setLayoutParams(layoutParams);
            VText vText = (VText) view.findViewById(b5c0.f73557e);
            VText vText2 = (VText) view.findViewById(b5c0.f73555d1);
            if (yt0.m215993b(attitudeConfigs.name)) {
                vText.setText("[" + attitudeConfigs.name + Constants.AES_SUFFIX);
            }
            vText2.setText(attitudeConfigs.name);
            this.f41770b.addView(view);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ang
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f70735a.m64547i(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64547i(AttitudeConfigs attitudeConfigs, View view) {
        m64544f(attitudeConfigs.f39215id);
        m64548j(attitudeConfigs.f39215id);
        if (NullChecker.m81303a(this.f41773e)) {
            this.f41773e.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m64548j(int i) {
        Moment moment = this.f41771c;
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        boolean z2 = z;
        Act actM64543e = m64543e();
        xia xiaVar = FeedModule.f38855d;
        Moment moment2 = this.f41771c;
        actM64543e.duringCreated(xiaVar.m209283Gb(moment2.owner, moment2.f56011id, z2, moment2.getMomentShowFrom(), i)).subscribe(mkd0.m154956H(new e30() { // from class: l.bng
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedAttitudeTipsView.m64539a((Envelope) obj);
            }
        }, new e30() { // from class: l.cng
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public void m64549k(Moment moment, String str, d30 d30Var) {
        this.f41771c = moment;
        this.f41772d = str;
        this.f41773e = d30Var;
        this.f41769a.setBackgroundResource(f3c0.f94672z);
    }

    /* JADX INFO: renamed from: l */
    public void m64550l() {
        p6j0.m167671e("e_attitude_bubble", this.f41772d, new j760[0]);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64545g(context);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64545g(context);
    }
}
