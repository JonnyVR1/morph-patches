package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.nvc0;
import l.qib0;
import l.xdl0;
import l.ym2;
import p007l.f3c0;
import p007l.lsg;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterLiveVoiceRoomView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceRoomView f3324B;

    /* JADX INFO: renamed from: C */
    public VLinear f3325C;

    /* JADX INFO: renamed from: D */
    public TextView f3326D;

    /* JADX INFO: renamed from: E */
    public VText f3327E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f3328F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f3329G;

    /* JADX INFO: renamed from: H */
    public FeedLiveVoiceRoomView f3330H;

    /* JADX INFO: renamed from: I */
    public View f3331I;

    /* JADX INFO: renamed from: J */
    public RelativeLayout f3332J;

    /* JADX INFO: renamed from: K */
    public VDraweeView f3333K;

    /* JADX INFO: renamed from: L */
    public TextView f3334L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f3335M;

    /* JADX INFO: renamed from: N */
    public TextView f3336N;

    /* JADX INFO: renamed from: O */
    public Map<String, String> f3337O;

    public FeedCenterLiveVoiceRoomView(Context context) {
        super(context);
    }

    private String getFrom() {
        String str = this.f3357k;
        str.getClass();
        if (str.equals("from_nearby_falls_feed")) {
            return "page_nearby";
        }
        return !str.equals("from_nearby_focus") ? "page_photo" : "page_follow";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m5716p0(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        m5735O(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        m5717m0(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        xdl0.M(this.f3332J, i == 1);
        xdl0.M(this.f3328F, i != 1);
        this.f3337O = FeedModule.m1141M().M6().a();
        this.f3352f.L(map.get(((DbObject) moment).id) != null ? map.get(((DbObject) moment).id).booleanValue() : false).Q(new VExpandableTextContainer.e() { // from class: l.ksg
            /* JADX INFO: renamed from: a */
            public final void m11516a(boolean z) {
                this.f9784a.m5716p0(map, moment, z);
            }
        }).M(moment.voiceLive.momentText);
        if (i == 1) {
            qib0.G.O0(this.f3333K, moment.headImage, true, false, (nvc0) null, (ym2) null);
            qib0.G.Y0(this.f3335M, f3c0.f7649K5);
            this.f3336N.setText(moment.voiceLive.voiceRoomInfo.title);
        } else {
            boolean zM5718o0 = m5718o0();
            FeedLiveVoiceRoomView feedLiveVoiceRoomView = this.f3330H;
            if (zM5718o0) {
                feedLiveVoiceRoomView.m5910n(moment);
            } else {
                feedLiveVoiceRoomView.m5916t(moment);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5717m0(View view) {
        lsg.m11710a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m5718o0() {
        if (NullChecker.a(this.f3337O)) {
            return "type_big_card".equals(this.f3337O.get(getFrom()));
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    public void onFinishInflate() {
        super.onFinishInflate();
        m5717m0(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        super.mo5696r();
        this.f3347a = this.f3324B;
        VExpandableTextContainer vExpandableTextContainer = this.f3329G;
        this.f3352f = vExpandableTextContainer;
        this.f3353g = vExpandableTextContainer.getTextView();
        this.f3354h = this.f3331I;
        this.f3349c = this.f3326D;
        this.f3350d = this.f3327E;
        this.f3348b = this.f3325C;
        this.f3351e = this.f3328F;
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
