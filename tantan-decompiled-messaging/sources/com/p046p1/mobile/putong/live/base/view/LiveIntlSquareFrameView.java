package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.jzs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveIntlSquareFrameView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f44677a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44678b;

    public LiveIntlSquareFrameView(@NonNull Context context) {
        super(context);
    }

    private void setFrame(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xdl0.m208344M(this.f44678b, true);
        xdl0.m208344M(this.f44677a, false);
        hxs.m133406s("context_square", this.f44678b, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m68734a(View view) {
        jzs.m143945a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m68735b(String str) {
        if (TextUtils.isEmpty(str) || this.f44677a.isAnimating()) {
            return;
        }
        xdl0.m208344M(this.f44678b, false);
        xdl0.m208344M(this.f44677a, true);
        this.f44677a.m68500j(str, -1);
    }

    /* JADX INFO: renamed from: c */
    public void m68736c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            xdl0.m208344M(this, true);
            m68735b(str2);
        } else if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this, false);
        } else {
            xdl0.m208344M(this, true);
            setFrame(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m68737d() {
        AnimEffectPlayer animEffectPlayer = this.f44677a;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f44677a.m68505o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m68737d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68734a(this);
    }

    public LiveIntlSquareFrameView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveIntlSquareFrameView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
