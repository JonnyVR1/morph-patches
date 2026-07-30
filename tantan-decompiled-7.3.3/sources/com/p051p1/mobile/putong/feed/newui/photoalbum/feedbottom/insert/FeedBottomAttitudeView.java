package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.hdc0;
import p153l.jyb;
import p153l.n570;
import p153l.nkh;
import p153l.pf60;
import p153l.prg;
import p153l.psd0;
import p153l.qa00;
import p153l.tec0;
import p153l.tfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBottomAttitudeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f42627a;

    /* JADX INFO: renamed from: b */
    public VText f42628b;

    /* JADX INFO: renamed from: c */
    public VLinear f42629c;

    /* JADX INFO: renamed from: d */
    public String f42630d;

    /* JADX INFO: renamed from: e */
    public n570 f42631e;

    /* JADX INFO: renamed from: f */
    public Moment f42632f;

    public FeedBottomAttitudeView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m65742r() {
        ArrayList<AttitudeConfigs> arrayListM163610f = nkh.m163608l().m163610f();
        boolean zM147479J = jyb.m147479J(arrayListM163610f);
        VLinear vLinear = this.f42627a;
        if (zM147479J) {
            bnl0.m105524M(vLinear, false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        this.f42629c.removeAllViews();
        int iM65749z = m65749z(arrayListM163610f);
        for (int i = 0; i < arrayListM163610f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM163610f.get(i);
            View view = (VLinear) act().inflater().inflate(tec0.f173549O, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = iM65749z;
            }
            view.setLayoutParams(layoutParams);
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(hdc0.f108914f);
            VText vText = (VText) view.findViewById(hdc0.f108912e1);
            uqb0.f180374G.m127115L0(vDraweeView, attitudeConfigs.url);
            vText.setText(attitudeConfigs.name);
            this.f42629c.addView(view);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.mrg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f138367a.m65745B(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m65744u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m65745B(AttitudeConfigs attitudeConfigs, View view) {
        m65748w(attitudeConfigs.f40063id);
        this.f42631e.m161690t(this.f42632f, attitudeConfigs.f40063id).subscribe(psd0.m173597H(new y20() { // from class: l.nrg
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedBottomAttitudeView.m65744u((Envelope) obj);
            }
        }, new y20() { // from class: l.org
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public void m65746C(String str, n570 n570Var, Moment moment) {
        this.f42630d = str;
        this.f42631e = n570Var;
        this.f42632f = moment;
        m65742r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65747v(this);
        this.f42628b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: v */
    public final void m65747v(View view) {
        prg.m173483a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m65748w(int i) {
        tfj0.m190940c("e_attitude_guide", this.f42630d, pf60.m172085a("attitude", Integer.valueOf(i)), pf60.m172085a("moment_id", NullChecker.m82486a(this.f42632f) ? this.f42632f.f56859id : ""));
    }

    /* JADX INFO: renamed from: z */
    public final int m65749z(List<AttitudeConfigs> list) {
        int iM105592y0 = (int) ((((bnl0.m105592y0() - qa00.m175859d(21.0f)) - this.f42628b.getPaint().measureText("我觉得")) - qa00.m175859d(16.0f)) - qa00.m175859d(64.0f));
        int iM175859d = 0;
        for (int i = 0; i < list.size(); i++) {
            iM175859d = (int) (iM175859d + qa00.m175859d(24.0f) + qa00.m175859d(4.0f) + this.f42628b.getPaint().measureText(list.get(i).name));
        }
        return (iM105592y0 - iM175859d) / 3;
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
