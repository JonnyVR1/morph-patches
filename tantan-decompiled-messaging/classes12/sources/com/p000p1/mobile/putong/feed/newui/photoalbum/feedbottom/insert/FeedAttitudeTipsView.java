package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yt0;
import p007l.b5c0;
import p007l.dng;
import p007l.f3c0;
import p007l.o6c0;
import p007l.p6j0;
import p007l.xia;
import p007l.yih;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAttitudeTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f3230a;

    /* JADX INFO: renamed from: b */
    public VLinear f3231b;

    /* JADX INFO: renamed from: c */
    public Moment f3232c;

    /* JADX INFO: renamed from: d */
    public String f3233d;

    /* JADX INFO: renamed from: e */
    public d30 f3234e;

    public FeedAttitudeTipsView(Context context) {
        super(context);
        m5639g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5633a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public View m5636d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dng.m9521b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final Act m5637e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m5638f(int i) {
        p6j0.m12913c("e_attitude_bubble", this.f3233d, j760.a("attitude", Integer.valueOf(i)), j760.a("moment_id", NullChecker.a(this.f3232c) ? ((DbObject) this.f3232c).id : ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m5639g(Context context) {
        addView(m5636d(LayoutInflater.from(context), this));
        m5640h();
    }

    /* JADX INFO: renamed from: h */
    public final void m5640h() {
        ArrayList<AttitudeConfigs> arrayListM17140f = yih.m17138l().m17140f();
        boolean zJ = vwb.J(arrayListM17140f);
        VFrame vFrame = this.f3230a;
        if (zJ) {
            xdl0.M(vFrame, false);
            return;
        }
        xdl0.M(vFrame, true);
        this.f3231b.removeAllViews();
        for (int i = 0; i < arrayListM17140f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM17140f.get(i);
            View view = (VLinear) m5637e().inflater().inflate(o6c0.f11057H, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = t100.d(12.0f);
            }
            view.setLayoutParams(layoutParams);
            VText vTextFindViewById = view.findViewById(b5c0.f6038e);
            VText vTextFindViewById2 = view.findViewById(b5c0.f6036d1);
            if (yt0.b(attitudeConfigs.name)) {
                vTextFindViewById.setText("[" + attitudeConfigs.name + "]");
            }
            vTextFindViewById2.setText(attitudeConfigs.name);
            this.f3231b.addView(view);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.ang
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5786a.m5641i(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5641i(AttitudeConfigs attitudeConfigs, View view) {
        m5638f(attitudeConfigs.f676id);
        m5642j(attitudeConfigs.f676id);
        if (NullChecker.a(this.f3234e)) {
            this.f3234e.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5642j(int i) {
        Moment moment = this.f3232c;
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        boolean z2 = z;
        Act actM5637e = m5637e();
        xia xiaVar = FeedModule.f316d;
        Moment moment2 = this.f3232c;
        actM5637e.duringCreated(xiaVar.m16464Gb(moment2.owner, ((DbObject) moment2).id, z2, moment2.getMomentShowFrom(), i)).subscribe(mkd0.H(new e30() { // from class: l.bng
            public final void call(Object obj) {
                FeedAttitudeTipsView.m5633a((Envelope) obj);
            }
        }, new e30() { // from class: l.cng
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public void m5643k(Moment moment, String str, d30 d30Var) {
        this.f3232c = moment;
        this.f3233d = str;
        this.f3234e = d30Var;
        this.f3230a.setBackgroundResource(f3c0.f7955z);
    }

    /* JADX INFO: renamed from: l */
    public void m5644l() {
        p6j0.m12915e("e_attitude_bubble", this.f3233d, new j760[0]);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5639g(context);
    }

    public FeedAttitudeTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5639g(context);
    }
}
