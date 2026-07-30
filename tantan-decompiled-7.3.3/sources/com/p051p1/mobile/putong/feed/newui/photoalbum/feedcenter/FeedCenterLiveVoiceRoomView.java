package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.aug;
import p153l.bnl0;
import p153l.lbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterLiveVoiceRoomView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceRoomView f42711B;

    /* JADX INFO: renamed from: C */
    public VLinear f42712C;

    /* JADX INFO: renamed from: D */
    public TextView f42713D;

    /* JADX INFO: renamed from: E */
    public VText f42714E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f42715F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f42716G;

    /* JADX INFO: renamed from: H */
    public FeedLiveVoiceRoomView f42717H;

    /* JADX INFO: renamed from: I */
    public View f42718I;

    /* JADX INFO: renamed from: J */
    public RelativeLayout f42719J;

    /* JADX INFO: renamed from: K */
    public VDraweeView f42720K;

    /* JADX INFO: renamed from: L */
    public TextView f42721L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f42722M;

    /* JADX INFO: renamed from: N */
    public TextView f42723N;

    /* JADX INFO: renamed from: O */
    public Map<String, String> f42724O;

    public FeedCenterLiveVoiceRoomView(Context context) {
        super(context);
    }

    private String getFrom() {
        String str = this.f42744k;
        str.getClass();
        if (str.equals("from_nearby_falls_feed")) {
            return "page_nearby";
        }
        return !str.equals("from_nearby_focus") ? "page_photo" : "page_follow";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m65805p0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        m65824O(z);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        m65806m0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        bnl0.m105524M(this.f42719J, i == 1);
        bnl0.m105524M(this.f42715F, i != 1);
        this.f42724O = FeedModule.m61407M().mo68412M6().mo127330a();
        this.f42739f.m80383L(map.get(moment.f56859id) != null ? map.get(moment.f56859id).booleanValue() : false).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.ztg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f206005a.m65805p0(map, moment, z);
            }
        }).m80384M(moment.voiceLive.momentText);
        if (i == 1) {
            uqb0.f180374G.m127121O0(this.f42720K, moment.headImage, true, false, null, null);
            uqb0.f180374G.m127138Y0(this.f42722M, lbc0.f130884K5);
            this.f42723N.setText(moment.voiceLive.voiceRoomInfo.title);
        } else {
            boolean zM65807o0 = m65807o0();
            FeedLiveVoiceRoomView feedLiveVoiceRoomView = this.f42717H;
            if (zM65807o0) {
                feedLiveVoiceRoomView.m65996n(moment);
            } else {
                feedLiveVoiceRoomView.m66002t(moment);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65806m0(View view) {
        aug.m100391a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m65807o0() {
        if (NullChecker.m82486a(this.f42724O)) {
            return "type_big_card".equals(this.f42724O.get(getFrom()));
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65806m0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        super.mo65785r();
        this.f42734a = this.f42711B;
        VExpandableTextContainer vExpandableTextContainer = this.f42716G;
        this.f42739f = vExpandableTextContainer;
        this.f42740g = vExpandableTextContainer.getTextView();
        this.f42741h = this.f42718I;
        this.f42736c = this.f42713D;
        this.f42737d = this.f42714E;
        this.f42735b = this.f42712C;
        this.f42738e = this.f42715F;
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
