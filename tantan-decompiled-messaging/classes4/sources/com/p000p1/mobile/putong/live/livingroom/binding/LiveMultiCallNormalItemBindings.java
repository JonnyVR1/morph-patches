package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VCheckBox;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallNormalItemBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4064d;

    /* JADX INFO: renamed from: e */
    public MultiCallNormalItemView f4065e;

    /* JADX INFO: renamed from: f */
    public MysteryAvatarView f4066f;

    /* JADX INFO: renamed from: g */
    public VText f4067g;

    /* JADX INFO: renamed from: h */
    public VText f4068h;

    /* JADX INFO: renamed from: i */
    public View f4069i;

    /* JADX INFO: renamed from: j */
    public TextView f4070j;

    /* JADX INFO: renamed from: k */
    public ImageView f4071k;

    /* JADX INFO: renamed from: l */
    public VFrame f4072l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f4073m;

    public LiveMultiCallNormalItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5434C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallNormalItemView getRoot() {
        return this.f4065e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5435h0(ViewGroup viewGroup) {
        this.f4065e = (MultiCallNormalItemView) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f4066f = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText childAt = viewGroup.getChildAt(1);
        this.f4067g = childAt;
        if (childAt == null) {
            str = "_content";
        }
        VText childAt2 = viewGroup.getChildAt(2);
        this.f4068h = childAt2;
        if (childAt2 == null) {
            str = "_friend";
        }
        View childAt3 = viewGroup.getChildAt(3);
        this.f4069i = childAt3;
        if (childAt3 == null) {
            str = "_live_status_bg";
        }
        TextView textView = (TextView) viewGroup.getChildAt(4);
        this.f4070j = textView;
        if (textView == null) {
            str = "_live_operation";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(5);
        this.f4071k = imageView;
        if (imageView == null) {
            str = "_live_connecting";
        }
        VFrame childAt4 = viewGroup.getChildAt(6);
        this.f4072l = childAt4;
        if (childAt4 == null) {
            str = "_check_root";
        }
        VCheckBox childAt5 = viewGroup.getChildAt(7);
        this.f4073m = childAt5;
        if (childAt5 == null) {
            str = "_check";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5436i1(T t) {
        this.f4064d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19993r4, viewGroup, false);
        m5435h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5435h0(this);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallNormalItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
