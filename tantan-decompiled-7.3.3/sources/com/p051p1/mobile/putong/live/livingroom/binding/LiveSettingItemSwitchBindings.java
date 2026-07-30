package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;
import p151v.VDraweeView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveSettingItemSwitchBindings extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VoiceSwitchItemView f48912a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f48913b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f48914c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48915d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f48916e;

    /* JADX INFO: renamed from: f */
    public View f48917f;

    /* JADX INFO: renamed from: g */
    public View f48918g;

    /* JADX INFO: renamed from: h */
    public View f48919h;

    /* JADX INFO: renamed from: i */
    public TextView f48920i;

    public LiveSettingItemSwitchBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73213a(ViewGroup viewGroup) {
        this.f48912a = (VoiceSwitchItemView) viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        this.f48913b = frameLayout;
        String str = frameLayout == null ? "_content" : null;
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48914c = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_svga_view";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48915d = vDraweeView;
        if (vDraweeView == null) {
            str = "_guide_gift_icon";
        }
        FrameLayout frameLayout2 = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        this.f48916e = frameLayout2;
        if (frameLayout2 == null) {
            str = "_switch_layout";
        }
        View childAt = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        this.f48917f = childAt;
        if (childAt == null) {
            str = "_point_bg";
        }
        View childAt2 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        this.f48918g = childAt2;
        if (childAt2 == null) {
            str = "_round_point";
        }
        View childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f48919h = childAt3;
        if (childAt3 == null) {
            str = "_red_dot";
        }
        TextView textView = (TextView) viewGroup.getChildAt(1);
        this.f48920i = textView;
        if (textView == null) {
            str = "_text";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceSwitchItemView getRoot() {
        return this.f48912a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73213a(this);
    }

    public LiveSettingItemSwitchBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSettingItemSwitchBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
