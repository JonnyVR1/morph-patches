package com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import p151v.VText;
import p153l.bnl0;
import p153l.bw4;
import p153l.fc2;
import p153l.gt0;
import p153l.ive0;
import p153l.j35;
import p153l.jyb;
import p153l.pae;
import p153l.qa00;
import p153l.xau;
import p153l.y20;
import p153l.ynp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class ChatInputEntryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f49722a;

    /* JADX INFO: renamed from: b */
    public BottomInputView f49723b;

    /* JADX INFO: renamed from: c */
    public View f49724c;

    /* JADX INFO: renamed from: d */
    public VText f49725d;

    /* JADX INFO: renamed from: e */
    public boolean f49726e;

    /* JADX INFO: renamed from: f */
    public boolean f49727f;

    /* JADX INFO: renamed from: g */
    public int f49728g;

    /* JADX INFO: renamed from: h */
    public boolean f49729h;

    public ChatInputEntryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49726e = true;
        this.f49727f = false;
        this.f49728g = pae.f151257a;
        this.f49729h = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m73808e(View view) {
        bw4.m106635a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m73809f(int i) {
        int iM175859d = i - qa00.f156323j;
        if (iM175859d >= qa00.m175859d(195.0f)) {
            iM175859d = qa00.m175859d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f49722a.getLayoutParams();
        layoutParams.width = iM175859d;
        this.f49722a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public void m73810g() {
        this.f49726e = true;
        this.f49725d.setText(zrv.f205803e.getString(R$string.f47909Xa));
        j35.m143316a(this, false);
        m73818o(false);
        this.f49729h = false;
        this.f49722a.setBackground(fc2.m124979i(637534208, 12));
        this.f49725d.setTextColor(-1);
        ynp0.m216931h(13, this.f49725d);
    }

    /* JADX INFO: renamed from: h */
    public View m73811h(String str) {
        if ("chatButtonBubble".equals(str) || "bulletCommentButtonBubble".equals(str) || "stormCommentButtonBubble".equals(str)) {
            return this.f49725d;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73812i(BLiveChatTip bLiveChatTip) {
        if (this.f49729h) {
            return;
        }
        boolean z = bLiveChatTip.isDefault;
        VText vText = this.f49725d;
        if (z) {
            vText.setTextColor(Color.parseColor("#88ffffff"));
        } else {
            vText.setTextColor(-1);
        }
        this.f49725d.setText(bLiveChatTip.title);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73813j(String str) {
        int iM216917B = ynp0.m216917B(str);
        GradientDrawable gradientDrawableM124979i = fc2.m124979i(637534208, 18);
        gradientDrawableM124979i.setStroke(qa00.m175859d(1.0f), iM216917B);
        this.f49722a.setBackground(gradientDrawableM124979i);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73814k(String str) {
        this.f49725d.setText(str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73815l(String str) {
        this.f49725d.setTextColor(ynp0.m216917B(str));
    }

    /* JADX INFO: renamed from: m */
    public void m73816m() {
        setTranslationY(0.0f);
        bnl0.m105525M0(this.f49722a, true);
    }

    /* JADX INFO: renamed from: n */
    public void m73817n(final BLiveChatTip bLiveChatTip) {
        if (jyb.m147479J(bLiveChatTip.tips)) {
            return;
        }
        Animator animatorM132170p = gt0.m132170p(this.f49725d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.aw4
            @Override // java.lang.Runnable
            public final void run() {
                this.f73688a.m73812i(bLiveChatTip);
            }
        });
        gt0.m132173s(animatorM132170p, gt0.m132170p(this.f49725d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: o */
    public void m73818o(boolean z) {
        if (!ive0.m142299m() || Build.VERSION.SDK_INT >= 29) {
            bnl0.m105524M(this, z);
        } else {
            bnl0.m105525M0(this, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73808e(this);
        j35.m143316a(this, false);
    }

    /* JADX INFO: renamed from: p */
    public void m73819p(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f49725d.getLayoutParams();
        if (z) {
            layoutParams.setMargins(qa00.m175859d(8.0f), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.f49725d.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f49724c, z);
    }

    /* JADX INFO: renamed from: q */
    public void m73820q(boolean z) {
        bnl0.m105525M0(this.f49722a, z);
    }

    public void setCustomStyle(BLiveChatBox bLiveChatBox) {
        xau.m209904n(bLiveChatBox.borderColor, new y20() { // from class: l.xv4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196350a.m73813j((String) obj);
            }
        });
        BLiveCommonViewConfig bLiveCommonViewConfig = bLiveChatBox.content;
        if (bLiveCommonViewConfig != null) {
            this.f49729h = true;
            xau.m209904n(bLiveCommonViewConfig.text, new y20() { // from class: l.yv4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201676a.m73814k((String) obj);
                }
            });
            xau.m209904n(bLiveChatBox.content.color, new y20() { // from class: l.zv4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206183a.m73815l((String) obj);
                }
            });
            ynp0.m216931h(bLiveChatBox.content.size, this.f49725d);
        }
    }
}
