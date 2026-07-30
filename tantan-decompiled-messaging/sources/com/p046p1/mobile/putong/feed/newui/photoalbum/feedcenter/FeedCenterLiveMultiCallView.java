package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.csg;
import p149l.esg;
import p149l.osg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterLiveMultiCallView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveMultiCallView f41822B;

    /* JADX INFO: renamed from: C */
    public VLinear f41823C;

    /* JADX INFO: renamed from: D */
    public TextView f41824D;

    /* JADX INFO: renamed from: E */
    public VText f41825E;

    /* JADX INFO: renamed from: F */
    public VLinear f41826F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f41827G;

    /* JADX INFO: renamed from: H */
    public VImage f41828H;

    /* JADX INFO: renamed from: I */
    public TextView f41829I;

    /* JADX INFO: renamed from: J */
    public TextView f41830J;

    /* JADX INFO: renamed from: K */
    public TextView f41831K;

    /* JADX INFO: renamed from: L */
    public View f41832L;

    public FeedCenterLiveMultiCallView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        m64610m0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        osg.m165771f(false);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87764a.m64611o0(moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64610m0(View view) {
        esg.m117907a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m64611o0(Moment moment, View view) {
        csg.m108506b(act(), this.f41896k, moment, this.f41902q, this.f41901p, this.f41904s);
        osg.m165770e(false);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64610m0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        super.mo64602r();
        this.f41886a = this.f41822B;
        VExpandableTextContainer vExpandableTextContainer = this.f41827G;
        this.f41891f = vExpandableTextContainer;
        this.f41892g = vExpandableTextContainer.getTextView();
        this.f41893h = this.f41832L;
        this.f41888c = this.f41824D;
        this.f41889d = this.f41825E;
        this.f41887b = this.f41823C;
        this.f41890e = this.f41826F;
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
