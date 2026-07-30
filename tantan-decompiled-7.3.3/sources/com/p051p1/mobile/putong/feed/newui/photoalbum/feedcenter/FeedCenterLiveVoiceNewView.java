package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import java.util.HashMap;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ytg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterLiveVoiceNewView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f42699B;

    /* JADX INFO: renamed from: C */
    public TextView f42700C;

    /* JADX INFO: renamed from: D */
    public VText f42701D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f42702E;

    /* JADX INFO: renamed from: F */
    public VLinear f42703F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f42704G;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f42705H;

    /* JADX INFO: renamed from: I */
    public View f42706I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f42707J;

    /* JADX INFO: renamed from: K */
    public VText f42708K;

    /* JADX INFO: renamed from: L */
    public VText f42709L;

    /* JADX INFO: renamed from: M */
    public View f42710M;

    public FeedCenterLiveVoiceNewView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m65802o0(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        m65824O(z);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        String str;
        super.mo65781Z(i, moment, map);
        this.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.xtg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f196210a.m65802o0(map, moment, z);
            }
        }).m80384M(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent);
        this.f42739f.setVisibility(TextUtils.isEmpty(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent) ? 8 : 0);
        int visibility = this.f42739f.getVisibility();
        ConstraintLayout constraintLayout = this.f42705H;
        if (visibility != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f42705H.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams2.topMargin = bnl0.m105587w(8.0f);
            this.f42705H.setLayoutParams(layoutParams2);
        }
        this.f42708K.setText(moment.momentVoiceLiveInfos.title);
        this.f42708K.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f42708K.requestFocus();
        VText vText = this.f42709L;
        Locale locale = Locale.CHINA;
        if (TextUtils.isEmpty(moment.momentVoiceLiveInfos.topicName)) {
            str = "";
        } else {
            str = moment.momentVoiceLiveInfos.topicName + " · ";
        }
        vText.setText(String.format(locale, "%s%d人语聊中", str, Integer.valueOf(moment.momentVoiceLiveInfos.memberCount)));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65803m0(View view) {
        ytg.m217308a(this, view);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView, android.view.View
    public void onFinishInflate() {
        m65803m0(this);
        super.onFinishInflate();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        super.mo65785r();
        this.f42734a = this.f42702E;
        VExpandableTextContainer vExpandableTextContainer = this.f42704G;
        this.f42739f = vExpandableTextContainer;
        this.f42740g = vExpandableTextContainer.getTextView();
        this.f42741h = this.f42710M;
        this.f42736c = this.f42700C;
        this.f42737d = this.f42701D;
        this.f42735b = this.f42699B;
        this.f42738e = this.f42703F;
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
