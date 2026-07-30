package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import java.util.Locale;
import l.xdl0;
import p007l.jsg;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterLiveVoiceNewView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f3312B;

    /* JADX INFO: renamed from: C */
    public TextView f3313C;

    /* JADX INFO: renamed from: D */
    public VText f3314D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f3315E;

    /* JADX INFO: renamed from: F */
    public VLinear f3316F;

    /* JADX INFO: renamed from: G */
    public VExpandableTextContainer f3317G;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f3318H;

    /* JADX INFO: renamed from: I */
    public View f3319I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f3320J;

    /* JADX INFO: renamed from: K */
    public VText f3321K;

    /* JADX INFO: renamed from: L */
    public VText f3322L;

    /* JADX INFO: renamed from: M */
    public View f3323M;

    public FeedCenterLiveVoiceNewView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m5713o0(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        m5735O(z);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        String str;
        super.mo5692Z(i, moment, map);
        this.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.isg
            /* JADX INFO: renamed from: a */
            public final void m11034a(boolean z) {
                this.f9128a.m5713o0(map, moment, z);
            }
        }).M(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent);
        this.f3352f.setVisibility(TextUtils.isEmpty(moment.momentVoiceLiveInfos.momentVoiceUser.momentContent) ? 8 : 0);
        int visibility = this.f3352f.getVisibility();
        ConstraintLayout constraintLayout = this.f3318H;
        if (visibility != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f3318H.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams2.topMargin = xdl0.w(8.0f);
            this.f3318H.setLayoutParams(layoutParams2);
        }
        this.f3321K.setText(moment.momentVoiceLiveInfos.title);
        this.f3321K.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f3321K.requestFocus();
        VText vText = this.f3322L;
        Locale locale = Locale.CHINA;
        if (TextUtils.isEmpty(moment.momentVoiceLiveInfos.topicName)) {
            str = "";
        } else {
            str = moment.momentVoiceLiveInfos.topicName + " · ";
        }
        vText.setText(String.format(locale, "%s%d人语聊中", str, Integer.valueOf(moment.momentVoiceLiveInfos.memberCount)));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5714m0(View view) {
        jsg.m11324a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    public void onFinishInflate() {
        m5714m0(this);
        super.onFinishInflate();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        super.mo5696r();
        this.f3347a = this.f3315E;
        VExpandableTextContainer vExpandableTextContainer = this.f3317G;
        this.f3352f = vExpandableTextContainer;
        this.f3353g = vExpandableTextContainer.getTextView();
        this.f3354h = this.f3323M;
        this.f3349c = this.f3313C;
        this.f3350d = this.f3314D;
        this.f3348b = this.f3312B;
        this.f3351e = this.f3316F;
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterLiveVoiceNewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
