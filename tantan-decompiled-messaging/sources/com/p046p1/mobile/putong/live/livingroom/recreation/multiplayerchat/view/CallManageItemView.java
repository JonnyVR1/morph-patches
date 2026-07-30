package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p149l.q34;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class CallManageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f51466a;

    /* JADX INFO: renamed from: b */
    public TextView f51467b;

    /* JADX INFO: renamed from: c */
    public TextView f51468c;

    /* JADX INFO: renamed from: d */
    public ImageView f51469d;

    public CallManageItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75899a(View view) {
        q34.m172740a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public CallManageItemView m75900b(@DrawableRes int i) {
        this.f51466a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public CallManageItemView m75901c(float f) {
        this.f51466a.setAlpha(f);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public CallManageItemView m75902d(String str) {
        this.f51468c.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public CallManageItemView m75903e(int i) {
        this.f51468c.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public CallManageItemView m75904f(boolean z) {
        xdl0.m208344M(this.f51468c, z);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public CallManageItemView m75905g(@StringRes int i) {
        this.f51467b.setText(i);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public CallManageItemView m75906h(String str) {
        this.f51467b.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public CallManageItemView m75907i(int i) {
        this.f51467b.setTextColor(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75899a(this);
    }

    public CallManageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallManageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
