package com.p051p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import p153l.mbc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatOptItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f45908a;

    /* JADX INFO: renamed from: b */
    public int f45909b;

    /* JADX INFO: renamed from: c */
    public ImageView f45910c;

    /* JADX INFO: renamed from: d */
    public y20<Boolean> f45911d;

    public LiveVChatOptItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m70390b(View view) {
        setSelected(!isSelected());
    }

    /* JADX INFO: renamed from: c */
    public void m70391c(int i, int i2) {
        this.f45908a = i;
        this.f45909b = i2;
        m70392d(isSelected());
    }

    /* JADX INFO: renamed from: d */
    public final void m70392d(boolean z) {
        int i;
        ImageView imageView = this.f45910c;
        if (imageView != null) {
            if (!z || (i = this.f45909b) == 0) {
                int i2 = this.f45908a;
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                }
            } else {
                imageView.setImageResource(i);
            }
        }
        if (z) {
            setBackgroundResource(mbc0.f135695o);
        } else {
            setBackgroundResource(mbc0.f135673d);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45910c = new ImageView(getContext());
        int i = qa00.f156335v;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.f45910c, layoutParams);
        m70392d(isSelected());
        setOnClickListener(new View.OnClickListener() { // from class: l.zpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205534a.m70390b(view);
            }
        });
    }

    public void setSelectListener(y20<Boolean> y20Var) {
        this.f45911d = y20Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setSelectedUI(z);
        y20<Boolean> y20Var = this.f45911d;
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(z));
        }
    }

    public void setSelectedUI(boolean z) {
        super.setSelected(z);
        m70392d(z);
    }

    public LiveVChatOptItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatOptItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
