package com.p051p1.mobile.putong.live.livingroom.virtual.payGuide;

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
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jde;
import p153l.n3d0;
import p153l.n9c0;
import p153l.o2m0;
import p153l.obc0;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualPayGuideV2View extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53473d;

    /* JADX INFO: renamed from: e */
    public VImage f53474e;

    /* JADX INFO: renamed from: f */
    public VText f53475f;

    /* JADX INFO: renamed from: g */
    public VLinear f53476g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f53477h;

    /* JADX INFO: renamed from: i */
    public VFrame f53478i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f53479j;

    /* JADX INFO: renamed from: k */
    public VText f53480k;

    public VirtualPayGuideV2View(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78412h0(View view) {
        o2m0.m165734a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78413i0(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        LongLinkVirtualVoice.VoicePayGuideUserInfo toUserInfo = voicePayGuideV2PopUp.getToUserInfo();
        izs.m142868s("context_single_room", this.f53473d, toUserInfo.getAvatar());
        this.f53475f.setText(toUserInfo.getName());
        this.f53477h.setText(voicePayGuideV2PopUp.getSubTitle());
        this.f53480k.setText(voicePayGuideV2PopUp.getButtonTitle());
        izs.m142868s("context_single_room", this.f53479j, voicePayGuideV2PopUp.getGiftIcon());
        m78414j0(voicePayGuideV2PopUp);
        bnl0.m105509E0(this.f53474e, onClickListener);
        bnl0.m105509E0(this.f53478i, onClickListener2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78414j0(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f53476g.removeAllViews();
        LongLinkVirtualVoice.VoicePayGuideUserInfo toUserInfo = voicePayGuideV2PopUp.getToUserInfo();
        if (voicePayGuideV2PopUp.getToUserInfo().getAge() > 0) {
            TextView textView = new TextView(this.f53476g.getContext());
            textView.setTextSize(9.0f);
            textView.setTextColor(-1);
            textView.setGravity(16);
            textView.setPadding(qa00.m175859d(2.0f), 0, qa00.m175859d(4.0f), 0);
            Resources resources = this.f53476g.getContext().getResources();
            textView.setBackground(jde.m144406b(TextUtils.equals(toUserInfo.getGender(), "male") ? resources.getColor(n9c0.f140817c1) : resources.getColor(n9c0.f140814b1), qa00.m175859d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(TextUtils.equals(toUserInfo.getGender(), "male") ? obc0.f146324ea : obc0.f146312da), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(String.valueOf(toUserInfo.getAge()));
            this.f53476g.addView(textView, new ViewGroup.LayoutParams(bnl0.f77545f, qa00.m175859d(14.0f)));
        }
        if (!TextUtils.isEmpty(toUserInfo.getZodiac())) {
            ProfileZodiac profileZodiac = ProfileZodiac.get(toUserInfo.getZodiac());
            Drawable drawableM144406b = jde.m144406b(q8g0.m175806l0(profileZodiac), qa00.m175859d(4.0f));
            TextView textView2 = new TextView(this.f53476g.getContext());
            textView2.setBackground(drawableM144406b);
            textView2.setTextSize(9.0f);
            textView2.setTextColor(-1);
            textView2.setPadding(qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f), 0);
            textView2.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(14.0f));
            layoutParams.leftMargin = qa00.m175859d(4.0f);
            textView2.setText(q8g0.m175804j0(profileZodiac));
            this.f53476g.addView(textView2, layoutParams);
        }
        if (voicePayGuideV2PopUp.hasUserTag()) {
            TextView textView3 = new TextView(this.f53476g.getContext());
            textView3.setTextSize(9.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(16);
            textView3.setPadding(qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f), 0);
            textView3.setBackground(jde.m144406b(n3d0.m161283g(voicePayGuideV2PopUp.getUserTag().getColor()), qa00.m175859d(4.0f)));
            textView3.setText(voicePayGuideV2PopUp.getUserTag().getText());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(14.0f));
            layoutParams2.leftMargin = qa00.m175859d(4.0f);
            this.f53476g.addView(textView3, layoutParams2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78412h0(this);
    }

    public VirtualPayGuideV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualPayGuideV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
