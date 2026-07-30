package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dug;
import p153l.rtg;
import p153l.ttg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterLiveMultiCallView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveMultiCallView f42670B;

    /* JADX INFO: renamed from: C */
    public VLinear f42671C;

    /* JADX INFO: renamed from: D */
    public TextView f42672D;

    /* JADX INFO: renamed from: E */
    public VText f42673E;

    /* JADX INFO: renamed from: F */
    public VLinear f42674F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f42675G;

    /* JADX INFO: renamed from: H */
    public VImage f42676H;

    /* JADX INFO: renamed from: I */
    public TextView f42677I;

    /* JADX INFO: renamed from: J */
    public TextView f42678J;

    /* JADX INFO: renamed from: K */
    public TextView f42679K;

    /* JADX INFO: renamed from: L */
    public View f42680L;

    public FeedCenterLiveMultiCallView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        m65793m0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        dug.m118140f(false);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.stg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170568a.m65794o0(moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65793m0(View view) {
        ttg.m192666a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m65794o0(Moment moment, View view) {
        rtg.m183116b(act(), this.f42744k, moment, this.f42750q, this.f42749p, this.f42752s);
        dug.m118139e(false);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65793m0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        super.mo65785r();
        this.f42734a = this.f42670B;
        VExpandableTextContainer vExpandableTextContainer = this.f42675G;
        this.f42739f = vExpandableTextContainer;
        this.f42740g = vExpandableTextContainer.getTextView();
        this.f42741h = this.f42680L;
        this.f42736c = this.f42672D;
        this.f42737d = this.f42673E;
        this.f42735b = this.f42671C;
        this.f42738e = this.f42674F;
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveMultiCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
