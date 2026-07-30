package com.p046p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import p149l.e30;
import p149l.g3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatOptItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f45060a;

    /* JADX INFO: renamed from: b */
    public int f45061b;

    /* JADX INFO: renamed from: c */
    public ImageView f45062c;

    /* JADX INFO: renamed from: d */
    public e30<Boolean> f45063d;

    public LiveVChatOptItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m69207b(View view) {
        setSelected(!isSelected());
    }

    /* JADX INFO: renamed from: c */
    public void m69208c(int i, int i2) {
        this.f45060a = i;
        this.f45061b = i2;
        m69209d(isSelected());
    }

    /* JADX INFO: renamed from: d */
    public final void m69209d(boolean z) {
        int i;
        ImageView imageView = this.f45062c;
        if (imageView != null) {
            if (!z || (i = this.f45061b) == 0) {
                int i2 = this.f45060a;
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                }
            } else {
                imageView.setImageResource(i);
            }
        }
        if (z) {
            setBackgroundResource(g3c0.f100433o);
        } else {
            setBackgroundResource(g3c0.f100411d);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45062c = new ImageView(getContext());
        int i = t100.f167273v;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.f45062c, layoutParams);
        m69209d(isSelected());
        setOnClickListener(new View.OnClickListener() { // from class: l.ynu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199220a.m69207b(view);
            }
        });
    }

    public void setSelectListener(e30<Boolean> e30Var) {
        this.f45063d = e30Var;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setSelectedUI(z);
        e30<Boolean> e30Var = this.f45063d;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
    }

    public void setSelectedUI(boolean z) {
        super.setSelected(z);
        m69209d(z);
    }

    public LiveVChatOptItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatOptItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
