package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ldc0;
import p153l.nbc0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveEmptyErrorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f46356a;

    /* JADX INFO: renamed from: b */
    public VText f46357b;

    /* JADX INFO: renamed from: c */
    public String f46358c;

    /* JADX INFO: renamed from: d */
    public boolean f46359d;

    public LiveEmptyErrorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m71057a(int i) {
        bnl0.m105524M(this, i == 0);
        if (i != 0) {
            this.f46356a.setImageResource(0);
            bnl0.m105524M(this, false);
            return;
        }
        boolean z = this.f46359d;
        VImage vImage = this.f46356a;
        if (z) {
            vImage.setImageResource(nbc0.f141127S0);
            this.f46357b.setText("暂时没有新的内容");
        } else {
            vImage.setImageResource(nbc0.f141186o1);
            this.f46357b.setText(this.f46358c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m71058b() {
        bnl0.m105524M(this, true);
        boolean z = this.f46359d;
        VImage vImage = this.f46356a;
        if (z) {
            vImage.setImageResource(nbc0.f141129T0);
            this.f46357b.setText("当前网络不可用");
        } else {
            vImage.setImageResource(nbc0.f141183n1);
            this.f46357b.setText(R$string.f45729S);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m71059c() {
        this.f46359d = true;
        this.f46357b.setTextColor(Color.parseColor("#d8d8d8"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46356a = (VImage) findViewById(ldc0.f131606u0);
        this.f46357b = (VText) findViewById(ldc0.f131572l2);
    }

    public void setEmptyText(String str) {
        this.f46358c = str;
    }

    public LiveEmptyErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEmptyErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
