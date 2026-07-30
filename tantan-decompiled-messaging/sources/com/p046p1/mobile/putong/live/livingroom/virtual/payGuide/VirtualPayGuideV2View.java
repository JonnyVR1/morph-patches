package com.p046p1.mobile.putong.live.livingroom.virtual.payGuide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.fce;
import p149l.h1c0;
import p149l.hxs;
import p149l.i0g0;
import p149l.i3c0;
import p149l.ktl0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualPayGuideV2View extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52625d;

    /* JADX INFO: renamed from: e */
    public VImage f52626e;

    /* JADX INFO: renamed from: f */
    public VText f52627f;

    /* JADX INFO: renamed from: g */
    public VLinear f52628g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f52629h;

    /* JADX INFO: renamed from: i */
    public VFrame f52630i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f52631j;

    /* JADX INFO: renamed from: k */
    public VText f52632k;

    public VirtualPayGuideV2View(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77229h0(View view) {
        ktl0.m147213a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m77230i0(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        LongLinkVirtualVoice.VoicePayGuideUserInfo toUserInfo = voicePayGuideV2PopUp.getToUserInfo();
        hxs.m133406s("context_single_room", this.f52625d, toUserInfo.getAvatar());
        this.f52627f.setText(toUserInfo.getName());
        this.f52629h.setText(voicePayGuideV2PopUp.getSubTitle());
        this.f52632k.setText(voicePayGuideV2PopUp.getButtonTitle());
        hxs.m133406s("context_single_room", this.f52631j, voicePayGuideV2PopUp.getGiftIcon());
        m77231j0(voicePayGuideV2PopUp);
        xdl0.m208329E0(this.f52626e, onClickListener);
        xdl0.m208329E0(this.f52630i, onClickListener2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77231j0(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f52628g.removeAllViews();
        LongLinkVirtualVoice.VoicePayGuideUserInfo toUserInfo = voicePayGuideV2PopUp.getToUserInfo();
        if (voicePayGuideV2PopUp.getToUserInfo().getAge() > 0) {
            TextView textView = new TextView(this.f52628g.getContext());
            textView.setTextSize(9.0f);
            textView.setTextColor(-1);
            textView.setGravity(16);
            textView.setPadding(t100.m186890d(2.0f), 0, t100.m186890d(4.0f), 0);
            Resources resources = this.f52628g.getContext().getResources();
            textView.setBackground(fce.m120425b(TextUtils.equals(toUserInfo.getGender(), "male") ? resources.getColor(h1c0.f105356c1) : resources.getColor(h1c0.f105353b1), t100.m186890d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(TextUtils.equals(toUserInfo.getGender(), "male") ? i3c0.f110996ea : i3c0.f110984da), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(String.valueOf(toUserInfo.getAge()));
            this.f52628g.addView(textView, new ViewGroup.LayoutParams(xdl0.f192404f, t100.m186890d(14.0f)));
        }
        if (!TextUtils.isEmpty(toUserInfo.getZodiac())) {
            ProfileZodiac profileZodiac = ProfileZodiac.get(toUserInfo.getZodiac());
            Drawable drawableM120425b = fce.m120425b(i0g0.m133871l0(profileZodiac), t100.m186890d(4.0f));
            TextView textView2 = new TextView(this.f52628g.getContext());
            textView2.setBackground(drawableM120425b);
            textView2.setTextSize(9.0f);
            textView2.setTextColor(-1);
            textView2.setPadding(t100.m186890d(4.0f), 0, t100.m186890d(4.0f), 0);
            textView2.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(14.0f));
            layoutParams.leftMargin = t100.m186890d(4.0f);
            textView2.setText(i0g0.m133869j0(profileZodiac));
            this.f52628g.addView(textView2, layoutParams);
        }
        if (voicePayGuideV2PopUp.hasUserTag()) {
            TextView textView3 = new TextView(this.f52628g.getContext());
            textView3.setTextSize(9.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(16);
            textView3.setPadding(t100.m186890d(4.0f), 0, t100.m186890d(4.0f), 0);
            textView3.setBackground(fce.m120425b(kvc0.m147358g(voicePayGuideV2PopUp.getUserTag().getColor()), t100.m186890d(4.0f)));
            textView3.setText(voicePayGuideV2PopUp.getUserTag().getText());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(14.0f));
            layoutParams2.leftMargin = t100.m186890d(4.0f);
            this.f52628g.addView(textView3, layoutParams2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77229h0(this);
    }

    public VirtualPayGuideV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualPayGuideV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
