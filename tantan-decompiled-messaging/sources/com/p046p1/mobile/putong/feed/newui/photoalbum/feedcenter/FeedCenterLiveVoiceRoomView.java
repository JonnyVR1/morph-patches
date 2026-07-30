package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.f3c0;
import p149l.lsg;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterLiveVoiceRoomView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceRoomView f41863B;

    /* JADX INFO: renamed from: C */
    public VLinear f41864C;

    /* JADX INFO: renamed from: D */
    public TextView f41865D;

    /* JADX INFO: renamed from: E */
    public VText f41866E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f41867F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f41868G;

    /* JADX INFO: renamed from: H */
    public FeedLiveVoiceRoomView f41869H;

    /* JADX INFO: renamed from: I */
    public View f41870I;

    /* JADX INFO: renamed from: J */
    public RelativeLayout f41871J;

    /* JADX INFO: renamed from: K */
    public VDraweeView f41872K;

    /* JADX INFO: renamed from: L */
    public TextView f41873L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f41874M;

    /* JADX INFO: renamed from: N */
    public TextView f41875N;

    /* JADX INFO: renamed from: O */
    public Map<String, String> f41876O;

    public FeedCenterLiveVoiceRoomView(Context context) {
        super(context);
    }

    private String getFrom() {
        String str = this.f41896k;
        str.getClass();
        if (str.equals("from_nearby_falls_feed")) {
            return "page_nearby";
        }
        return !str.equals("from_nearby_focus") ? "page_photo" : "page_follow";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m64622p0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        m64641O(z);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        m64623m0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        xdl0.m208344M(this.f41871J, i == 1);
        xdl0.m208344M(this.f41867F, i != 1);
        this.f41876O = FeedModule.m60223M().mo67229M6().mo102416a();
        this.f41891f.m79200L(map.get(moment.f56011id) != null ? map.get(moment.f56011id).booleanValue() : false).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.ksg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f124473a.m64622p0(map, moment, z);
            }
        }).m79201M(moment.voiceLive.momentText);
        if (i == 1) {
            qib0.f154691G.m102337O0(this.f41872K, moment.headImage, true, false, null, null);
            qib0.f154691G.m102354Y0(this.f41874M, f3c0.f94366K5);
            this.f41875N.setText(moment.voiceLive.voiceRoomInfo.title);
        } else {
            boolean zM64624o0 = m64624o0();
            FeedLiveVoiceRoomView feedLiveVoiceRoomView = this.f41869H;
            if (zM64624o0) {
                feedLiveVoiceRoomView.m64813n(moment);
            } else {
                feedLiveVoiceRoomView.m64819t(moment);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64623m0(View view) {
        lsg.m151562a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m64624o0() {
        if (NullChecker.m81303a(this.f41876O)) {
            return "type_big_card".equals(this.f41876O.get(getFrom()));
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64623m0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        super.mo64602r();
        this.f41886a = this.f41863B;
        VExpandableTextContainer vExpandableTextContainer = this.f41868G;
        this.f41891f = vExpandableTextContainer;
        this.f41892g = vExpandableTextContainer.getTextView();
        this.f41893h = this.f41870I;
        this.f41888c = this.f41865D;
        this.f41889d = this.f41866E;
        this.f41887b = this.f41864C;
        this.f41890e = this.f41867F;
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
