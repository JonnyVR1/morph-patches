package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.hxs;
import p149l.m2f0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAnimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f49292a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49293b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49294c;

    public SignInAnimItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73200a(View view) {
        m2f0.m152687a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73201b(String str) {
        hxs.m133402o("context_livingAct", this.f49294c, str);
        this.f49293b.m68500j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73200a(this);
    }
}
