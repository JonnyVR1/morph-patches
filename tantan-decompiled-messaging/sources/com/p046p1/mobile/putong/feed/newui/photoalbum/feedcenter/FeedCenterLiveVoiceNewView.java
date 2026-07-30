package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.jsg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterLiveVoiceNewView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f41851B;

    /* JADX INFO: renamed from: C */
    public TextView f41852C;

    /* JADX INFO: renamed from: D */
    public VText f41853D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f41854E;

    /* JADX INFO: renamed from: F */
    public VLinear f41855F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f41856G;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f41857H;

    /* JADX INFO: renamed from: I */
    public View f41858I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f41859J;

    /* JADX INFO: renamed from: K */
    public VText f41860K;

    /* JADX INFO: renamed from: L */
    public VText f41861L;

    /* JADX INFO: renamed from: M */
    public View f41862M;

    public FeedCenterLiveVoiceNewView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m64619o0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        m64641O(z);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        String str;
        super.mo64598Z(i, moment, map);
        this.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.isg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f114761a.m64619o0(map, moment, z);
            }
        }).m79201M(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent);
        this.f41891f.setVisibility(TextUtils.isEmpty(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent) ? 8 : 0);
        int visibility = this.f41891f.getVisibility();
        ConstraintLayout constraintLayout = this.f41857H;
        if (visibility != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f41857H.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams2.topMargin = xdl0.m208407w(8.0f);
            this.f41857H.setLayoutParams(layoutParams2);
        }
        this.f41860K.setText(moment.momentVoiceLiveInfos.title);
        this.f41860K.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f41860K.requestFocus();
        VText vText = this.f41861L;
        Locale locale = Locale.CHINA;
        if (TextUtils.isEmpty(moment.momentVoiceLiveInfos.topicName)) {
            str = "";
        } else {
            str = moment.momentVoiceLiveInfos.topicName + " · ";
        }
        vText.setText(String.format(locale, "%s%d人语聊中", str, Integer.valueOf(moment.momentVoiceLiveInfos.memberCount)));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64620m0(View view) {
        jsg.m143045a(this, view);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        m64620m0(this);
        super.onFinishInflate();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        super.mo64602r();
        this.f41886a = this.f41854E;
        VExpandableTextContainer vExpandableTextContainer = this.f41856G;
        this.f41891f = vExpandableTextContainer;
        this.f41892g = vExpandableTextContainer.getTextView();
        this.f41893h = this.f41862M;
        this.f41888c = this.f41852C;
        this.f41889d = this.f41853D;
        this.f41887b = this.f41851B;
        this.f41890e = this.f41855F;
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
