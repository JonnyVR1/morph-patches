package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jrg;
import p153l.lrg;
import p153l.nkh;
import p153l.pf60;
import p153l.q8g0;
import p153l.qa00;
import p153l.tfj0;
import p153l.uqb0;
import p153l.x31;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBottomAttitudeUsersView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f42622a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42623b;

    /* JADX INFO: renamed from: c */
    public VText f42624c;

    /* JADX INFO: renamed from: d */
    public String f42625d;

    /* JADX INFO: renamed from: e */
    public Moment f42626e;

    public FeedBottomAttitudeUsersView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m65735r() {
        String strM163611g = nkh.m163608l().m163611g();
        if (!TextUtils.isEmpty(strM163611g)) {
            uqb0.f180374G.m127115L0(this.f42623b, strM163611g);
        }
        this.f42624c.setText(q8g0.m175802h0(this.f42626e.attitudes.count) + "人发表了态度");
        setOnClickListener(new View.OnClickListener() { // from class: l.krg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128459a.m65736v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m65736v(View view) {
        m65739u();
        if (this.f42626e.attitudeId > 0) {
            x31.m209182a(act(), this.f42625d, this.f42626e, nkh.m163608l().m163610f());
        } else {
            m65737z();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m65737z() {
        int[] iArr = new int[2];
        this.f42623b.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM175859d = iArr[1] - qa00.m175859d(92.0f);
        if (iM175859d < bnl0.m105511F0() + qa00.m175859d(44.0f) + qa00.m175859d(12.0f)) {
            iM175859d = iArr[1] + qa00.m175859d(24.0f);
        }
        point.y = iM175859d;
        point.x = qa00.m175859d(40.0f);
        new jrg(act(), point, this.f42626e, this.f42625d).m146735a(this.f42623b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65738s(this);
        this.f42624c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: s */
    public final void m65738s(View view) {
        lrg.m155623a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m65739u() {
        tfj0.m190940c("e_attitude", this.f42625d, new pf60[0]);
    }

    /* JADX INFO: renamed from: w */
    public void m65740w(String str, Moment moment) {
        this.f42625d = str;
        this.f42626e = moment;
        m65735r();
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
