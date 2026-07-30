package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import p147v.VLinear;
import p147v.VText;
import p149l.krg;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterAudioView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f41800B;

    /* JADX INFO: renamed from: C */
    public TextView f41801C;

    /* JADX INFO: renamed from: D */
    public VText f41802D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f41803E;

    /* JADX INFO: renamed from: F */
    public VExpandableTextContainer f41804F;

    /* JADX INFO: renamed from: G */
    public VText f41805G;

    /* JADX INFO: renamed from: H */
    public FeedAudioPlayerView f41806H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f41807I;

    /* JADX INFO: renamed from: J */
    public View f41808J;

    public FeedCenterAudioView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        m64599o0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        this.f41894i = moment;
        CharSequence charSequenceM64636E = m64636E(moment.momentValue);
        this.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.irg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                map.put(moment.f56011id, Boolean.valueOf(z));
            }
        }).m79201M(charSequenceM64636E);
        this.f41806H.m66280Y0(moment);
        this.f41806H.m66284e1(this.f41896k, this.f41901p);
        m64600p0(charSequenceM64636E);
        m64647X(this.f41805G, moment);
        m64648Y(moment);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m64599o0(View view) {
        krg.m146977a(this, view);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p0 */
    public void m64600p0(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        FeedAudioPlayerView feedAudioPlayerView = this.f41806H;
        if (zIsEmpty) {
            xdl0.m208360X(feedAudioPlayerView, 0);
        } else {
            xdl0.m208360X(feedAudioPlayerView, t100.m186890d(12.0f));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m64601q0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        m64641O(z);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        super.mo64602r();
        this.f41886a = this.f41803E;
        VExpandableTextContainer vExpandableTextContainer = this.f41804F;
        this.f41891f = vExpandableTextContainer;
        this.f41892g = vExpandableTextContainer.getTextView();
        this.f41893h = this.f41808J;
        this.f41888c = this.f41801C;
        this.f41889d = this.f41802D;
        this.f41887b = this.f41800B;
        this.f41890e = this.f41803E;
        this.f41908w = this.f41807I;
        this.f41806H.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: r0 */
    public void m64603r0(String str, final Moment moment, final HashMap<String, Boolean> map) {
        this.f41894i = moment;
        CharSequence charSequenceM64636E = m64636E(moment.momentValue);
        this.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.jrg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f119403a.m64601q0(map, moment, z);
            }
        }).m79201M(charSequenceM64636E);
        this.f41806H.m66280Y0(moment);
        this.f41806H.m66284e1(str, false);
        m64600p0(charSequenceM64636E);
        m64647X(this.f41805G, moment);
        m64648Y(moment);
    }

    /* JADX INFO: renamed from: s0 */
    public void m64604s0(int i, int i2, int i3, int i4) {
        this.f41803E.setPadding(i, i2, i3, i4);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
