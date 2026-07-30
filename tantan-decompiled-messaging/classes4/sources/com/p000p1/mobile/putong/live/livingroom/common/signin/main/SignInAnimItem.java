package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import p002l.m2f0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInAnimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f5334a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5335b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5336c;

    public SignInAnimItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6729a(View view) {
        m2f0.m17681a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6730b(String str) {
        hxs.o("context_livingAct", this.f5336c, str);
        this.f5335b.j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6729a(this);
    }
}
