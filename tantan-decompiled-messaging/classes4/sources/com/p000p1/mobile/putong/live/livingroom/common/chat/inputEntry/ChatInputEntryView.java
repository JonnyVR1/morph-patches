package com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import l.bne0;
import l.bt0;
import l.e30;
import l.l9e;
import l.t100;
import l.uep0;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.yb2;
import l.ypv;
import p002l.cv4;
import p002l.k25;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ChatInputEntryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f4916a;

    /* JADX INFO: renamed from: b */
    public BottomInputView f4917b;

    /* JADX INFO: renamed from: c */
    public View f4918c;

    /* JADX INFO: renamed from: d */
    public VText f4919d;

    /* JADX INFO: renamed from: e */
    public boolean f4920e;

    /* JADX INFO: renamed from: f */
    public boolean f4921f;

    /* JADX INFO: renamed from: g */
    public int f4922g;

    /* JADX INFO: renamed from: h */
    public boolean f4923h;

    public ChatInputEntryView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4920e = true;
        this.f4921f = false;
        this.f4922g = l9e.a;
        this.f4923h = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m6127e(View view) {
        cv4.m11391a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m6128f(int i) {
        int iD = i - t100.j;
        if (iD >= t100.d(195.0f)) {
            iD = t100.d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f4916a.getLayoutParams();
        layoutParams.width = iD;
        this.f4916a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public void m6129g() {
        this.f4920e = true;
        this.f4919d.setText(ypv.e.getString(R$string.f3103Xa));
        k25.m16465a(this, false);
        m6137o(false);
        this.f4923h = false;
        this.f4916a.setBackground(yb2.i(637534208, 12));
        this.f4919d.setTextColor(-1);
        uep0.h(13, this.f4919d);
    }

    /* JADX INFO: renamed from: h */
    public View m6130h(String str) {
        if ("chatButtonBubble".equals(str) || "bulletCommentButtonBubble".equals(str) || "stormCommentButtonBubble".equals(str)) {
            return this.f4919d;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6131i(BLiveChatTip bLiveChatTip) {
        if (this.f4923h) {
            return;
        }
        boolean z = bLiveChatTip.isDefault;
        VText vText = this.f4919d;
        if (z) {
            vText.setTextColor(Color.parseColor("#88ffffff"));
        } else {
            vText.setTextColor(-1);
        }
        this.f4919d.setText(bLiveChatTip.title);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6132j(String str) {
        int iB = uep0.B(str);
        GradientDrawable gradientDrawableI = yb2.i(637534208, 18);
        gradientDrawableI.setStroke(t100.d(1.0f), iB);
        this.f4916a.setBackground(gradientDrawableI);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6133k(String str) {
        this.f4919d.setText(str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m6134l(String str) {
        this.f4919d.setTextColor(uep0.B(str));
    }

    /* JADX INFO: renamed from: m */
    public void m6135m() {
        setTranslationY(0.0f);
        xdl0.M0(this.f4916a, true);
    }

    /* JADX INFO: renamed from: n */
    public void m6136n(final BLiveChatTip bLiveChatTip) {
        if (vwb.J(bLiveChatTip.tips)) {
            return;
        }
        Animator animatorP = bt0.p(this.f4919d, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        bt0.f(animatorP, new Runnable() { // from class: l.bv4
            @Override // java.lang.Runnable
            public final void run() {
                this.f8368a.m6131i(bLiveChatTip);
            }
        });
        bt0.s(new Animator[]{animatorP, bt0.p(this.f4919d, "alpha", 0L, 200L, new LinearInterpolator(), new float[]{0.0f, 1.0f})}).start();
    }

    /* JADX INFO: renamed from: o */
    public void m6137o(boolean z) {
        if (!bne0.m() || Build.VERSION.SDK_INT >= 29) {
            xdl0.M(this, z);
        } else {
            xdl0.M0(this, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6127e(this);
        k25.m16465a(this, false);
    }

    /* JADX INFO: renamed from: p */
    public void m6138p(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4919d.getLayoutParams();
        if (z) {
            layoutParams.setMargins(t100.d(8.0f), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.f4919d.setLayoutParams(layoutParams);
        xdl0.M(this.f4918c, z);
    }

    /* JADX INFO: renamed from: q */
    public void m6139q(boolean z) {
        xdl0.M0(this.f4916a, z);
    }

    public void setCustomStyle(BLiveChatBox bLiveChatBox) {
        w8u.n(bLiveChatBox.borderColor, new e30() { // from class: l.yu4
            public final void call(Object obj) {
                this.f23102a.m6132j((String) obj);
            }
        });
        BLiveCommonViewConfig bLiveCommonViewConfig = bLiveChatBox.content;
        if (bLiveCommonViewConfig != null) {
            this.f4923h = true;
            w8u.n(bLiveCommonViewConfig.text, new e30() { // from class: l.zu4
                public final void call(Object obj) {
                    this.f23589a.m6133k((String) obj);
                }
            });
            w8u.n(bLiveChatBox.content.color, new e30() { // from class: l.av4
                public final void call(Object obj) {
                    this.f7893a.m6134l((String) obj);
                }
            });
            uep0.h(bLiveChatBox.content.size, this.f4919d);
        }
    }
}
