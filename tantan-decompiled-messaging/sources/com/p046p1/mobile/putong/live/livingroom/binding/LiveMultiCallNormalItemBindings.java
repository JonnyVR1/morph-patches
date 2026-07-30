package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallNormalItemBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48022d;

    /* JADX INFO: renamed from: e */
    public MultiCallNormalItemView f48023e;

    /* JADX INFO: renamed from: f */
    public MysteryAvatarView f48024f;

    /* JADX INFO: renamed from: g */
    public VText f48025g;

    /* JADX INFO: renamed from: h */
    public VText f48026h;

    /* JADX INFO: renamed from: i */
    public View f48027i;

    /* JADX INFO: renamed from: j */
    public TextView f48028j;

    /* JADX INFO: renamed from: k */
    public ImageView f48029k;

    /* JADX INFO: renamed from: l */
    public VFrame f48030l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f48031m;

    public LiveMultiCallNormalItemBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public MultiCallNormalItemView getRoot() {
        return this.f48023e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72023h0(ViewGroup viewGroup) {
        this.f48023e = (MultiCallNormalItemView) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f48024f = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48025g = vText;
        if (vText == null) {
            str = "_content";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48026h = vText2;
        if (vText2 == null) {
            str = "_friend";
        }
        View childAt = viewGroup.getChildAt(3);
        this.f48027i = childAt;
        if (childAt == null) {
            str = "_live_status_bg";
        }
        TextView textView = (TextView) viewGroup.getChildAt(4);
        this.f48028j = textView;
        if (textView == null) {
            str = "_live_operation";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(5);
        this.f48029k = imageView;
        if (imageView == null) {
            str = "_live_connecting";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(6);
        this.f48030l = vFrame;
        if (vFrame == null) {
            str = "_check_root";
        }
        VCheckBox vCheckBox = (VCheckBox) viewGroup.getChildAt(7);
        this.f48031m = vCheckBox;
        if (vCheckBox == null) {
            str = "_check";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48022d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168497r4, viewGroup, false);
        m72023h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72023h0(this);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
