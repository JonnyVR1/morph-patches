package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.f5c0;
import p149l.h3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveEmptyErrorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f45508a;

    /* JADX INFO: renamed from: b */
    public VText f45509b;

    /* JADX INFO: renamed from: c */
    public String f45510c;

    /* JADX INFO: renamed from: d */
    public boolean f45511d;

    public LiveEmptyErrorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m69874a(int i) {
        xdl0.m208344M(this, i == 0);
        if (i != 0) {
            this.f45508a.setImageResource(0);
            xdl0.m208344M(this, false);
            return;
        }
        boolean z = this.f45511d;
        VImage vImage = this.f45508a;
        if (z) {
            vImage.setImageResource(h3c0.f105636S0);
            this.f45509b.setText("暂时没有新的内容");
        } else {
            vImage.setImageResource(h3c0.f105695o1);
            this.f45509b.setText(this.f45510c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m69875b() {
        xdl0.m208344M(this, true);
        boolean z = this.f45511d;
        VImage vImage = this.f45508a;
        if (z) {
            vImage.setImageResource(h3c0.f105638T0);
            this.f45509b.setText("当前网络不可用");
        } else {
            vImage.setImageResource(h3c0.f105692n1);
            this.f45509b.setText(R$string.f44881S);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m69876c() {
        this.f45511d = true;
        this.f45509b.setTextColor(Color.parseColor("#d8d8d8"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45508a = (VImage) findViewById(f5c0.f95149u0);
        this.f45509b = (VText) findViewById(f5c0.f95115l2);
    }

    public void setEmptyText(String str) {
        this.f45510c = str;
    }

    public LiveEmptyErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEmptyErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
