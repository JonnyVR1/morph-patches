package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.izs;
import p153l.taf0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAnimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f50140a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50141b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50142c;

    public SignInAnimItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74383a(View view) {
        taf0.m189856a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74384b(String str) {
        izs.m142864o("context_livingAct", this.f50142c, str);
        this.f50141b.m69683j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74383a(this);
    }
}
