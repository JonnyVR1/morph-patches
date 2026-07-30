package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dbt;
import p149l.hxs;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewTopView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f52009a;

    /* JADX INFO: renamed from: b */
    public VLinear f52010b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f52011c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f52012d;

    /* JADX INFO: renamed from: e */
    public VLinear f52013e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f52014f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52015g;

    /* JADX INFO: renamed from: h */
    public VText f52016h;

    /* JADX INFO: renamed from: i */
    public VImage f52017i;

    /* JADX INFO: renamed from: j */
    public VEditText f52018j;

    public LivePreviewTopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76542a(View view) {
        dbt.m110647a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76542a(this);
    }

    public void setAvatarFile(String str) {
        hxs.m133406s("context_livingAct", this.f52015g, str);
    }

    public void setAvatarUrl(String str) {
        hxs.m133407t("context_livingAct", this.f52015g, str, t100.f167232G);
    }

    public void setCheckingStatus(String str) {
        if (w8u.m202204B()) {
            xdl0.m208337I0(this.f52016h, str);
            xdl0.m208344M(this.f52017i, false);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f52017i;
        if (zIsEmpty) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
        }
        xdl0.m208344M(this.f52016h, false);
    }

    public void setTitle(String str) {
        this.f52018j.setText(str);
        this.f52018j.setSelection(this.f52018j.getText() == null ? 0 : this.f52018j.getText().length());
    }

    public LivePreviewTopView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePreviewTopView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
