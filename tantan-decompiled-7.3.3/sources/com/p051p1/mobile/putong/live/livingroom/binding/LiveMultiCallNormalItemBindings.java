package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallNormalItemBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48870d;

    /* JADX INFO: renamed from: e */
    public MultiCallNormalItemView f48871e;

    /* JADX INFO: renamed from: f */
    public MysteryAvatarView f48872f;

    /* JADX INFO: renamed from: g */
    public VText f48873g;

    /* JADX INFO: renamed from: h */
    public VText f48874h;

    /* JADX INFO: renamed from: i */
    public View f48875i;

    /* JADX INFO: renamed from: j */
    public TextView f48876j;

    /* JADX INFO: renamed from: k */
    public ImageView f48877k;

    /* JADX INFO: renamed from: l */
    public VFrame f48878l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f48879m;

    public LiveMultiCallNormalItemBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public MultiCallNormalItemView getRoot() {
        return this.f48871e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73206h0(ViewGroup viewGroup) {
        this.f48871e = (MultiCallNormalItemView) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f48872f = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48873g = vText;
        if (vText == null) {
            str = "_content";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48874h = vText2;
        if (vText2 == null) {
            str = "_friend";
        }
        View childAt = viewGroup.getChildAt(3);
        this.f48875i = childAt;
        if (childAt == null) {
            str = "_live_status_bg";
        }
        TextView textView = (TextView) viewGroup.getChildAt(4);
        this.f48876j = textView;
        if (textView == null) {
            str = "_live_operation";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(5);
        this.f48877k = imageView;
        if (imageView == null) {
            str = "_live_connecting";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(6);
        this.f48878l = vFrame;
        if (vFrame == null) {
            str = "_check_root";
        }
        VCheckBox vCheckBox = (VCheckBox) viewGroup.getChildAt(7);
        this.f48879m = vCheckBox;
        if (vCheckBox == null) {
            str = "_check";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48870d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199229r4, viewGroup, false);
        m73206h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73206h0(this);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
