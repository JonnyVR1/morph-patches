package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MemberUsers;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.qib0;
import l.vwb;
import l.xdl0;
import p007l.hsg;
import p007l.p6j0;
import p007l.vqg;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterLiveVoiceMomentView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceMomentView f3294B;

    /* JADX INFO: renamed from: C */
    public VLinear f3295C;

    /* JADX INFO: renamed from: D */
    public TextView f3296D;

    /* JADX INFO: renamed from: E */
    public VText f3297E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f3298F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f3299G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f3300H;

    /* JADX INFO: renamed from: I */
    public VImage f3301I;

    /* JADX INFO: renamed from: J */
    public TextView f3302J;

    /* JADX INFO: renamed from: K */
    public VLinear f3303K;

    /* JADX INFO: renamed from: L */
    public VFrame f3304L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f3305M;

    /* JADX INFO: renamed from: N */
    public VFrame f3306N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f3307O;

    /* JADX INFO: renamed from: P */
    public VFrame f3308P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f3309Q;

    /* JADX INFO: renamed from: R */
    public VText f3310R;

    /* JADX INFO: renamed from: S */
    public View f3311S;

    public FeedCenterLiveVoiceMomentView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m5708q0(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        m5735O(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        m5709o0(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        MomentVoiceLiveInfos momentVoiceLiveInfosM16495L7;
        super.mo5692Z(i, moment, map);
        this.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.fsg
            /* JADX INFO: renamed from: a */
            public final void m10319a(boolean z) {
                this.f8241a.m5708q0(map, moment, z);
            }
        }).M(moment.value);
        if (!NullChecker.a(moment.thirdShareSource) || TextUtils.isEmpty(moment.thirdShareSource.sourceId) || (momentVoiceLiveInfosM16495L7 = FeedModule.f316d.m16495L7(moment.thirdShareSource.sourceId)) == null) {
            return;
        }
        moment.momentVoiceLiveInfos = momentVoiceLiveInfosM16495L7;
        this.f3302J.setText(momentVoiceLiveInfosM16495L7.title);
        m5711r0(momentVoiceLiveInfosM16495L7);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m5709o0(View view) {
        hsg.m10728a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    public void onFinishInflate() {
        super.onFinishInflate();
        m5709o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m5710p0(MomentVoiceLiveInfos momentVoiceLiveInfos, View view) {
        p6j0.m12913c("e_live_audio_room_enter", vqg.m15485K(this.f3357k, this.f3362p), vwb.Y("anchorId", momentVoiceLiveInfos.anchorUserID), vwb.Y("liveId", momentVoiceLiveInfos.liveID), vwb.Y("topic_id", momentVoiceLiveInfos.topicID), vwb.Y("audio_card_type", "follow_moments"), vwb.Y("audio_room_label", momentVoiceLiveInfos.topicName));
        FeedModule.m1141M().ga(act(), this.f3355i.owner, momentVoiceLiveInfos.schemaSearch);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        super.mo5696r();
        VExpandableTextContainer vExpandableTextContainer = this.f3299G;
        this.f3347a = vExpandableTextContainer;
        this.f3352f = vExpandableTextContainer;
        this.f3353g = vExpandableTextContainer.getTextView();
        this.f3351e = this.f3298F;
        this.f3349c = this.f3296D;
        this.f3350d = this.f3297E;
        this.f3348b = this.f3295C;
        this.f3354h = this.f3311S;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m5711r0(final MomentVoiceLiveInfos momentVoiceLiveInfos) {
        List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
        if (vwb.J(list)) {
            xdl0.M(this.f3303K, false);
        }
        xdl0.M(this.f3303K, true);
        if (list.size() >= 3) {
            xdl0.M(this.f3308P, true);
            xdl0.M(this.f3306N, true);
            xdl0.M(this.f3304L, true);
            qib0.G.L0(this.f3309Q, list.get(2).avatar);
            qib0.G.L0(this.f3307O, list.get(1).avatar);
            qib0.G.L0(this.f3305M, list.get(0).avatar);
        } else if (list.size() == 2) {
            xdl0.M(this.f3308P, false);
            xdl0.M(this.f3306N, true);
            xdl0.M(this.f3304L, true);
            qib0.G.L0(this.f3307O, list.get(1).avatar);
            qib0.G.L0(this.f3305M, list.get(0).avatar);
        } else if (list.size() == 1) {
            xdl0.M(this.f3308P, false);
            xdl0.M(this.f3306N, false);
            xdl0.M(this.f3304L, true);
            qib0.G.L0(this.f3305M, list.get(0).avatar);
        }
        boolean zEquals = TEnum.equals(momentVoiceLiveInfos.state, "stopped");
        VText vText = this.f3310R;
        if (zEquals) {
            vText.setText(momentVoiceLiveInfos.audienceCount + "人参与");
        } else {
            vText.setText(momentVoiceLiveInfos.memberCount + "人在聊");
        }
        xdl0.E0(this.f3300H, new View.OnClickListener() { // from class: l.gsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8508a.m5710p0(momentVoiceLiveInfos, view);
            }
        });
    }

    public FeedCenterLiveVoiceMomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceMomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
