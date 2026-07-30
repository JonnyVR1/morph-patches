package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.qa00;
import p153l.zsg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterAudioView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f42648B;

    /* JADX INFO: renamed from: C */
    public TextView f42649C;

    /* JADX INFO: renamed from: D */
    public VText f42650D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f42651E;

    /* JADX INFO: renamed from: F */
    public VExpandableTextContainer f42652F;

    /* JADX INFO: renamed from: G */
    public VText f42653G;

    /* JADX INFO: renamed from: H */
    public FeedAudioPlayerView f42654H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f42655I;

    /* JADX INFO: renamed from: J */
    public View f42656J;

    public FeedCenterAudioView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        m65782o0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        this.f42742i = moment;
        CharSequence charSequenceM65819E = m65819E(moment.momentValue);
        this.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.xsg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                map.put(moment.f56859id, Boolean.valueOf(z));
            }
        }).m80384M(charSequenceM65819E);
        this.f42654H.m67463Y0(moment);
        this.f42654H.m67467e1(this.f42744k, this.f42749p);
        m65783p0(charSequenceM65819E);
        m65830X(this.f42653G, moment);
        m65831Y(moment);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m65782o0(View view) {
        zsg.m221343a(this, view);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p0 */
    public void m65783p0(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        FeedAudioPlayerView feedAudioPlayerView = this.f42654H;
        if (zIsEmpty) {
            bnl0.m105540X(feedAudioPlayerView, 0);
        } else {
            bnl0.m105540X(feedAudioPlayerView, qa00.m175859d(12.0f));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m65784q0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        m65824O(z);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        super.mo65785r();
        this.f42734a = this.f42651E;
        VExpandableTextContainer vExpandableTextContainer = this.f42652F;
        this.f42739f = vExpandableTextContainer;
        this.f42740g = vExpandableTextContainer.getTextView();
        this.f42741h = this.f42656J;
        this.f42736c = this.f42649C;
        this.f42737d = this.f42650D;
        this.f42735b = this.f42648B;
        this.f42738e = this.f42651E;
        this.f42756w = this.f42655I;
        this.f42654H.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: r0 */
    public void m65786r0(String str, final Moment moment, final HashMap<String, Boolean> map) {
        this.f42742i = moment;
        CharSequence charSequenceM65819E = m65819E(moment.momentValue);
        this.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.ysg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f201401a.m65784q0(map, moment, z);
            }
        }).m80384M(charSequenceM65819E);
        this.f42654H.m67463Y0(moment);
        this.f42654H.m67467e1(str, false);
        m65783p0(charSequenceM65819E);
        m65830X(this.f42653G, moment);
        m65831Y(moment);
    }

    /* JADX INFO: renamed from: s0 */
    public void m65787s0(int i, int i2, int i3, int i4) {
        this.f42651E.setPadding(i, i2, i3, i4);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
