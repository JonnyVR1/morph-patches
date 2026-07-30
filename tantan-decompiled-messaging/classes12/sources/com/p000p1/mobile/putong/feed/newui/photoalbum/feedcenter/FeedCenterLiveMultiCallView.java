package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import l.xdl0;
import p007l.csg;
import p007l.esg;
import p007l.osg;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterLiveMultiCallView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveMultiCallView f3283B;

    /* JADX INFO: renamed from: C */
    public VLinear f3284C;

    /* JADX INFO: renamed from: D */
    public TextView f3285D;

    /* JADX INFO: renamed from: E */
    public VText f3286E;

    /* JADX INFO: renamed from: F */
    public VLinear f3287F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f3288G;

    /* JADX INFO: renamed from: H */
    public VImage f3289H;

    /* JADX INFO: renamed from: I */
    public TextView f3290I;

    /* JADX INFO: renamed from: J */
    public TextView f3291J;

    /* JADX INFO: renamed from: K */
    public TextView f3292K;

    /* JADX INFO: renamed from: L */
    public View f3293L;

    public FeedCenterLiveMultiCallView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        m5704m0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        osg.m12850f(false);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7044a.m5705o0(moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5704m0(View view) {
        esg.m9957a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m5705o0(Moment moment, View view) {
        csg.m9237b(act(), this.f3357k, moment, this.f3363q, this.f3362p, this.f3365s);
        osg.m12849e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    public void onFinishInflate() {
        super.onFinishInflate();
        m5704m0(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        super.mo5696r();
        this.f3347a = this.f3283B;
        VExpandableTextContainer vExpandableTextContainer = this.f3288G;
        this.f3352f = vExpandableTextContainer;
        this.f3353g = vExpandableTextContainer.getTextView();
        this.f3354h = this.f3293L;
        this.f3349c = this.f3285D;
        this.f3350d = this.f3286E;
        this.f3348b = this.f3284C;
        this.f3351e = this.f3287F;
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
