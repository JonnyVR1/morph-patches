package com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry;

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
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import p147v.VText;
import p149l.bne0;
import p149l.bt0;
import p149l.cv4;
import p149l.e30;
import p149l.k25;
import p149l.l9e;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class ChatInputEntryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f48874a;

    /* JADX INFO: renamed from: b */
    public BottomInputView f48875b;

    /* JADX INFO: renamed from: c */
    public View f48876c;

    /* JADX INFO: renamed from: d */
    public VText f48877d;

    /* JADX INFO: renamed from: e */
    public boolean f48878e;

    /* JADX INFO: renamed from: f */
    public boolean f48879f;

    /* JADX INFO: renamed from: g */
    public int f48880g;

    /* JADX INFO: renamed from: h */
    public boolean f48881h;

    public ChatInputEntryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48878e = true;
        this.f48879f = false;
        this.f48880g = l9e.f127077a;
        this.f48881h = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m72625e(View view) {
        cv4.m108846a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m72626f(int i) {
        int iM186890d = i - t100.f167261j;
        if (iM186890d >= t100.m186890d(195.0f)) {
            iM186890d = t100.m186890d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f48874a.getLayoutParams();
        layoutParams.width = iM186890d;
        this.f48874a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public void m72627g() {
        this.f48878e = true;
        this.f48877d.setText(ypv.f199497e.getString(R$string.f47061Xa));
        k25.m144260a(this, false);
        m72635o(false);
        this.f48881h = false;
        this.f48874a.setBackground(yb2.m213884i(637534208, 12));
        this.f48877d.setTextColor(-1);
        uep0.m193321h(13, this.f48877d);
    }

    /* JADX INFO: renamed from: h */
    public View m72628h(String str) {
        if ("chatButtonBubble".equals(str) || "bulletCommentButtonBubble".equals(str) || "stormCommentButtonBubble".equals(str)) {
            return this.f48877d;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m72629i(BLiveChatTip bLiveChatTip) {
        if (this.f48881h) {
            return;
        }
        boolean z = bLiveChatTip.isDefault;
        VText vText = this.f48877d;
        if (z) {
            vText.setTextColor(Color.parseColor("#88ffffff"));
        } else {
            vText.setTextColor(-1);
        }
        this.f48877d.setText(bLiveChatTip.title);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m72630j(String str) {
        int iM193307B = uep0.m193307B(str);
        GradientDrawable gradientDrawableM213884i = yb2.m213884i(637534208, 18);
        gradientDrawableM213884i.setStroke(t100.m186890d(1.0f), iM193307B);
        this.f48874a.setBackground(gradientDrawableM213884i);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m72631k(String str) {
        this.f48877d.setText(str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m72632l(String str) {
        this.f48877d.setTextColor(uep0.m193307B(str));
    }

    /* JADX INFO: renamed from: m */
    public void m72633m() {
        setTranslationY(0.0f);
        xdl0.m208345M0(this.f48874a, true);
    }

    /* JADX INFO: renamed from: n */
    public void m72634n(final BLiveChatTip bLiveChatTip) {
        if (vwb.m200296J(bLiveChatTip.tips)) {
            return;
        }
        Animator animatorM103743p = bt0.m103743p(this.f48877d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.bv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f77392a.m72629i(bLiveChatTip);
            }
        });
        bt0.m103746s(animatorM103743p, bt0.m103743p(this.f48877d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: o */
    public void m72635o(boolean z) {
        if (!bne0.m102784m() || Build.VERSION.SDK_INT >= 29) {
            xdl0.m208344M(this, z);
        } else {
            xdl0.m208345M0(this, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72625e(this);
        k25.m144260a(this, false);
    }

    /* JADX INFO: renamed from: p */
    public void m72636p(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48877d.getLayoutParams();
        if (z) {
            layoutParams.setMargins(t100.m186890d(8.0f), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.f48877d.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f48876c, z);
    }

    /* JADX INFO: renamed from: q */
    public void m72637q(boolean z) {
        xdl0.m208345M0(this.f48874a, z);
    }

    public void setCustomStyle(BLiveChatBox bLiveChatBox) {
        w8u.m202211n(bLiveChatBox.borderColor, new e30() { // from class: l.yu4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200042a.m72630j((String) obj);
            }
        });
        BLiveCommonViewConfig bLiveCommonViewConfig = bLiveChatBox.content;
        if (bLiveCommonViewConfig != null) {
            this.f48881h = true;
            w8u.m202211n(bLiveCommonViewConfig.text, new e30() { // from class: l.zu4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204809a.m72631k((String) obj);
                }
            });
            w8u.m202211n(bLiveChatBox.content.color, new e30() { // from class: l.av4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71894a.m72632l((String) obj);
                }
            });
            uep0.m193321h(bLiveChatBox.content.size, this.f48877d);
        }
    }
}
