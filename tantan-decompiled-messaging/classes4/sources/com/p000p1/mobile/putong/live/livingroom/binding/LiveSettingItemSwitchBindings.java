package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;
import l.jfd0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class LiveSettingItemSwitchBindings extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VoiceSwitchItemView f4106a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f4107b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f4108c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4109d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f4110e;

    /* JADX INFO: renamed from: f */
    public View f4111f;

    /* JADX INFO: renamed from: g */
    public View f4112g;

    /* JADX INFO: renamed from: h */
    public View f4113h;

    /* JADX INFO: renamed from: i */
    public TextView f4114i;

    public LiveSettingItemSwitchBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5453a(ViewGroup viewGroup) {
        this.f4106a = (VoiceSwitchItemView) viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        this.f4107b = frameLayout;
        String str = frameLayout == null ? "_content" : null;
        AnimEffectPlayer childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4108c = childAt;
        if (childAt == null) {
            str = "_svga_view";
        }
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f4109d = childAt2;
        if (childAt2 == null) {
            str = "_guide_gift_icon";
        }
        FrameLayout frameLayout2 = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        this.f4110e = frameLayout2;
        if (frameLayout2 == null) {
            str = "_switch_layout";
        }
        View childAt3 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        this.f4111f = childAt3;
        if (childAt3 == null) {
            str = "_point_bg";
        }
        View childAt4 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        this.f4112g = childAt4;
        if (childAt4 == null) {
            str = "_round_point";
        }
        View childAt5 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f4113h = childAt5;
        if (childAt5 == null) {
            str = "_red_dot";
        }
        TextView textView = (TextView) viewGroup.getChildAt(1);
        this.f4114i = textView;
        if (textView == null) {
            str = "_text";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceSwitchItemView getRoot() {
        return this.f4106a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5453a(this);
    }

    public LiveSettingItemSwitchBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSettingItemSwitchBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
