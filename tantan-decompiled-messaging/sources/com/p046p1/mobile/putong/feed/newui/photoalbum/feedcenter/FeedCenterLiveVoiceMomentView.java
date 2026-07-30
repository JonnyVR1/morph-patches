package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MemberUsers;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.hsg;
import p149l.p6j0;
import p149l.qib0;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterLiveVoiceMomentView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceMomentView f41833B;

    /* JADX INFO: renamed from: C */
    public VLinear f41834C;

    /* JADX INFO: renamed from: D */
    public TextView f41835D;

    /* JADX INFO: renamed from: E */
    public VText f41836E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f41837F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f41838G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f41839H;

    /* JADX INFO: renamed from: I */
    public VImage f41840I;

    /* JADX INFO: renamed from: J */
    public TextView f41841J;

    /* JADX INFO: renamed from: K */
    public VLinear f41842K;

    /* JADX INFO: renamed from: L */
    public VFrame f41843L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f41844M;

    /* JADX INFO: renamed from: N */
    public VFrame f41845N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f41846O;

    /* JADX INFO: renamed from: P */
    public VFrame f41847P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f41848Q;

    /* JADX INFO: renamed from: R */
    public VText f41849R;

    /* JADX INFO: renamed from: S */
    public View f41850S;

    public FeedCenterLiveVoiceMomentView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m64614q0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        m64641O(z);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        m64615o0(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        MomentVoiceLiveInfos momentVoiceLiveInfosM209314L7;
        super.mo64598Z(i, moment, map);
        this.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.fsg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f99072a.m64614q0(map, moment, z);
            }
        }).m79201M(moment.value);
        if (!NullChecker.m81303a(moment.thirdShareSource) || TextUtils.isEmpty(moment.thirdShareSource.sourceId) || (momentVoiceLiveInfosM209314L7 = FeedModule.f38855d.m209314L7(moment.thirdShareSource.sourceId)) == null) {
            return;
        }
        moment.momentVoiceLiveInfos = momentVoiceLiveInfosM209314L7;
        this.f41841J.setText(momentVoiceLiveInfosM209314L7.title);
        m64617r0(momentVoiceLiveInfosM209314L7);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m64615o0(View view) {
        hsg.m132781a(this, view);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64615o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m64616p0(MomentVoiceLiveInfos momentVoiceLiveInfos, View view) {
        p6j0.m167669c("e_live_audio_room_enter", vqg.m199515K(this.f41896k, this.f41901p), vwb.m200311Y("anchorId", momentVoiceLiveInfos.anchorUserID), vwb.m200311Y("liveId", momentVoiceLiveInfos.liveID), vwb.m200311Y("topic_id", momentVoiceLiveInfos.topicID), vwb.m200311Y("audio_card_type", "follow_moments"), vwb.m200311Y("audio_room_label", momentVoiceLiveInfos.topicName));
        FeedModule.m60223M().mo67267ga(act(), this.f41894i.owner, momentVoiceLiveInfos.schemaSearch);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        super.mo64602r();
        VExpandableTextContainer vExpandableTextContainer = this.f41838G;
        this.f41886a = vExpandableTextContainer;
        this.f41891f = vExpandableTextContainer;
        this.f41892g = vExpandableTextContainer.getTextView();
        this.f41890e = this.f41837F;
        this.f41888c = this.f41835D;
        this.f41889d = this.f41836E;
        this.f41887b = this.f41834C;
        this.f41893h = this.f41850S;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m64617r0(final MomentVoiceLiveInfos momentVoiceLiveInfos) {
        List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f41842K, false);
        }
        xdl0.m208344M(this.f41842K, true);
        if (list.size() >= 3) {
            xdl0.m208344M(this.f41847P, true);
            xdl0.m208344M(this.f41845N, true);
            xdl0.m208344M(this.f41843L, true);
            qib0.f154691G.m102331L0(this.f41848Q, list.get(2).avatar);
            qib0.f154691G.m102331L0(this.f41846O, list.get(1).avatar);
            qib0.f154691G.m102331L0(this.f41844M, list.get(0).avatar);
        } else if (list.size() == 2) {
            xdl0.m208344M(this.f41847P, false);
            xdl0.m208344M(this.f41845N, true);
            xdl0.m208344M(this.f41843L, true);
            qib0.f154691G.m102331L0(this.f41846O, list.get(1).avatar);
            qib0.f154691G.m102331L0(this.f41844M, list.get(0).avatar);
        } else if (list.size() == 1) {
            xdl0.m208344M(this.f41847P, false);
            xdl0.m208344M(this.f41845N, false);
            xdl0.m208344M(this.f41843L, true);
            qib0.f154691G.m102331L0(this.f41844M, list.get(0).avatar);
        }
        boolean zEquals = TEnum.equals(momentVoiceLiveInfos.state, "stopped");
        VText vText = this.f41849R;
        if (zEquals) {
            vText.setText(momentVoiceLiveInfos.audienceCount + "人参与");
        } else {
            vText.setText(momentVoiceLiveInfos.memberCount + "人在聊");
        }
        xdl0.m208329E0(this.f41839H, new View.OnClickListener() { // from class: l.gsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104176a.m64616p0(momentVoiceLiveInfos, view);
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
