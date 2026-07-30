package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.k1t;

/* JADX INFO: loaded from: classes13.dex */
public class LiveIntlSquareFrameView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f45525a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45526b;

    public LiveIntlSquareFrameView(@NonNull Context context) {
        super(context);
    }

    private void setFrame(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bnl0.m105524M(this.f45526b, true);
        bnl0.m105524M(this.f45525a, false);
        izs.m142868s("context_square", this.f45526b, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m69917a(View view) {
        k1t.m147924a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m69918b(String str) {
        if (TextUtils.isEmpty(str) || this.f45525a.isAnimating()) {
            return;
        }
        bnl0.m105524M(this.f45526b, false);
        bnl0.m105524M(this.f45525a, true);
        this.f45525a.m69683j(str, -1);
    }

    /* JADX INFO: renamed from: c */
    public void m69919c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            bnl0.m105524M(this, true);
            m69918b(str2);
        } else if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this, false);
        } else {
            bnl0.m105524M(this, true);
            setFrame(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m69920d() {
        AnimEffectPlayer animEffectPlayer = this.f45525a;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f45525a.m69688o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m69920d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69917a(this);
    }

    public LiveIntlSquareFrameView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveIntlSquareFrameView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
