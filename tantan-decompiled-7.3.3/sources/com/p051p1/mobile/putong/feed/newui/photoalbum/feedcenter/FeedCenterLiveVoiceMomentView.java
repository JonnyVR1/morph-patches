package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MemberUsers;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.ksg;
import p153l.tfj0;
import p153l.uqb0;
import p153l.wtg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterLiveVoiceMomentView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public FeedCenterLiveVoiceMomentView f42681B;

    /* JADX INFO: renamed from: C */
    public VLinear f42682C;

    /* JADX INFO: renamed from: D */
    public TextView f42683D;

    /* JADX INFO: renamed from: E */
    public VText f42684E;

    /* JADX INFO: renamed from: F */
    public LinearLayout f42685F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f42686G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f42687H;

    /* JADX INFO: renamed from: I */
    public VImage f42688I;

    /* JADX INFO: renamed from: J */
    public TextView f42689J;

    /* JADX INFO: renamed from: K */
    public VLinear f42690K;

    /* JADX INFO: renamed from: L */
    public VFrame f42691L;

    /* JADX INFO: renamed from: M */
    public VDraweeView f42692M;

    /* JADX INFO: renamed from: N */
    public VFrame f42693N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f42694O;

    /* JADX INFO: renamed from: P */
    public VFrame f42695P;

    /* JADX INFO: renamed from: Q */
    public VDraweeView f42696Q;

    /* JADX INFO: renamed from: R */
    public VText f42697R;

    /* JADX INFO: renamed from: S */
    public View f42698S;

    public FeedCenterLiveVoiceMomentView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m65797q0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        m65824O(z);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        m65798o0(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        MomentVoiceLiveInfos momentVoiceLiveInfosM145555L7;
        super.mo65781Z(i, moment, map);
        this.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.utg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f180943a.m65797q0(map, moment, z);
            }
        }).m80384M(moment.value);
        if (!NullChecker.m82486a(moment.thirdShareSource) || TextUtils.isEmpty(moment.thirdShareSource.sourceId) || (momentVoiceLiveInfosM145555L7 = FeedModule.f39703d.m145555L7(moment.thirdShareSource.sourceId)) == null) {
            return;
        }
        moment.momentVoiceLiveInfos = momentVoiceLiveInfosM145555L7;
        this.f42689J.setText(momentVoiceLiveInfosM145555L7.title);
        m65800r0(momentVoiceLiveInfosM145555L7);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m65798o0(View view) {
        wtg.m207872a(this, view);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65798o0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m65799p0(MomentVoiceLiveInfos momentVoiceLiveInfos, View view) {
        tfj0.m190940c("e_live_audio_room_enter", ksg.m151174K(this.f42744k, this.f42749p), jyb.m147494Y("anchorId", momentVoiceLiveInfos.anchorUserID), jyb.m147494Y("liveId", momentVoiceLiveInfos.liveID), jyb.m147494Y("topic_id", momentVoiceLiveInfos.topicID), jyb.m147494Y("audio_card_type", "follow_moments"), jyb.m147494Y("audio_room_label", momentVoiceLiveInfos.topicName));
        FeedModule.m61407M().mo68450ga(act(), this.f42742i.owner, momentVoiceLiveInfos.schemaSearch);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        super.mo65785r();
        VExpandableTextContainer vExpandableTextContainer = this.f42686G;
        this.f42734a = vExpandableTextContainer;
        this.f42739f = vExpandableTextContainer;
        this.f42740g = vExpandableTextContainer.getTextView();
        this.f42738e = this.f42685F;
        this.f42736c = this.f42683D;
        this.f42737d = this.f42684E;
        this.f42735b = this.f42682C;
        this.f42741h = this.f42698S;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m65800r0(final MomentVoiceLiveInfos momentVoiceLiveInfos) {
        List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f42690K, false);
        }
        bnl0.m105524M(this.f42690K, true);
        if (list.size() >= 3) {
            bnl0.m105524M(this.f42695P, true);
            bnl0.m105524M(this.f42693N, true);
            bnl0.m105524M(this.f42691L, true);
            uqb0.f180374G.m127115L0(this.f42696Q, list.get(2).avatar);
            uqb0.f180374G.m127115L0(this.f42694O, list.get(1).avatar);
            uqb0.f180374G.m127115L0(this.f42692M, list.get(0).avatar);
        } else if (list.size() == 2) {
            bnl0.m105524M(this.f42695P, false);
            bnl0.m105524M(this.f42693N, true);
            bnl0.m105524M(this.f42691L, true);
            uqb0.f180374G.m127115L0(this.f42694O, list.get(1).avatar);
            uqb0.f180374G.m127115L0(this.f42692M, list.get(0).avatar);
        } else if (list.size() == 1) {
            bnl0.m105524M(this.f42695P, false);
            bnl0.m105524M(this.f42693N, false);
            bnl0.m105524M(this.f42691L, true);
            uqb0.f180374G.m127115L0(this.f42692M, list.get(0).avatar);
        }
        boolean zEquals = TEnum.equals(momentVoiceLiveInfos.state, "stopped");
        VText vText = this.f42697R;
        if (zEquals) {
            vText.setText(momentVoiceLiveInfos.audienceCount + "人参与");
        } else {
            vText.setText(momentVoiceLiveInfos.memberCount + "人在聊");
        }
        bnl0.m105509E0(this.f42687H, new View.OnClickListener() { // from class: l.vtg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185708a.m65799p0(momentVoiceLiveInfos, view);
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
