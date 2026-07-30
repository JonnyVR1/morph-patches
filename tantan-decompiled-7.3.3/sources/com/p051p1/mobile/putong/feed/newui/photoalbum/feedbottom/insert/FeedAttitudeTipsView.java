package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.eu0;
import p153l.hdc0;
import p153l.jka;
import p153l.jyb;
import p153l.lbc0;
import p153l.nkh;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.sog;
import p153l.tec0;
import p153l.tfj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAttitudeTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f42617a;

    /* JADX INFO: renamed from: b */
    public VLinear f42618b;

    /* JADX INFO: renamed from: c */
    public Moment f42619c;

    /* JADX INFO: renamed from: d */
    public String f42620d;

    /* JADX INFO: renamed from: e */
    public x20 f42621e;

    public FeedAttitudeTipsView(Context context) {
        super(context);
        m65728g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m65722a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public View m65725d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sog.m187221b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m65726e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m65727f(int i) {
        tfj0.m190940c("e_attitude_bubble", this.f42620d, pf60.m172085a("attitude", Integer.valueOf(i)), pf60.m172085a("moment_id", NullChecker.m82486a(this.f42619c) ? this.f42619c.f56859id : ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m65728g(Context context) {
        addView(m65725d(LayoutInflater.from(context), this));
        m65729h();
    }

    /* JADX INFO: renamed from: h */
    public final void m65729h() {
        ArrayList<AttitudeConfigs> arrayListM163610f = nkh.m163608l().m163610f();
        boolean zM147479J = jyb.m147479J(arrayListM163610f);
        VFrame vFrame = this.f42617a;
        if (zM147479J) {
            bnl0.m105524M(vFrame, false);
            return;
        }
        bnl0.m105524M(vFrame, true);
        this.f42618b.removeAllViews();
        for (int i = 0; i < arrayListM163610f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM163610f.get(i);
            View view = (VLinear) m65726e().inflater().inflate(tec0.f173507H, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = qa00.m175859d(12.0f);
            }
            view.setLayoutParams(layoutParams);
            VText vText = (VText) view.findViewById(hdc0.f108910e);
            VText vText2 = (VText) view.findViewById(hdc0.f108908d1);
            if (eu0.m122519b(attitudeConfigs.name)) {
                vText.setText("[" + attitudeConfigs.name + Constants.AES_SUFFIX);
            }
            vText2.setText(attitudeConfigs.name);
            this.f42618b.addView(view);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.pog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f153399a.m65730i(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m65730i(AttitudeConfigs attitudeConfigs, View view) {
        m65727f(attitudeConfigs.f40063id);
        m65731j(attitudeConfigs.f40063id);
        if (NullChecker.m82486a(this.f42621e)) {
            this.f42621e.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m65731j(int i) {
        Moment moment = this.f42619c;
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        boolean z2 = z;
        Act actM65726e = m65726e();
        jka jkaVar = FeedModule.f39703d;
        Moment moment2 = this.f42619c;
        actM65726e.duringCreated(jkaVar.m145524Gb(moment2.owner, moment2.f56859id, z2, moment2.getMomentShowFrom(), i)).subscribe(psd0.m173597H(new y20() { // from class: l.qog
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedAttitudeTipsView.m65722a((Envelope) obj);
            }
        }, new y20() { // from class: l.rog
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public void m65732k(Moment moment, String str, x20 x20Var) {
        this.f42619c = moment;
        this.f42620d = str;
        this.f42621e = x20Var;
        this.f42617a.setBackgroundResource(lbc0.f131190z);
    }

    /* JADX INFO: renamed from: l */
    public void m65733l() {
        tfj0.m190942e("e_attitude_bubble", this.f42620d, new pf60[0]);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65728g(context);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65728g(context);
    }
}
