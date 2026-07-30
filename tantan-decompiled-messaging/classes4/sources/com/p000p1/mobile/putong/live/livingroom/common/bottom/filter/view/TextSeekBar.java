package com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.xdl0;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TextSeekBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f4652a;

    /* JADX INFO: renamed from: b */
    public AppCompatSeekBar f4653b;

    /* JADX INFO: renamed from: c */
    public SeekBar.OnSeekBarChangeListener f4654c;

    /* JADX INFO: renamed from: d */
    public Runnable f4655d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar$a */
    public class C0317a implements SeekBar.OnSeekBarChangeListener {
        public C0317a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextSeekBar.this.m5716i(seekBar, i);
            if (NullChecker.a(TextSeekBar.this.f4654c)) {
                TextSeekBar.this.f4654c.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            xdl0.M(TextSeekBar.this.f4652a, true);
            e51.J(TextSeekBar.this.f4655d);
            if (NullChecker.a(TextSeekBar.this.f4654c)) {
                TextSeekBar.this.f4654c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            e51.H(TextSeekBar.this.getContext(), TextSeekBar.this.f4655d, 300L);
            if (NullChecker.a(TextSeekBar.this.f4654c)) {
                TextSeekBar.this.f4654c.onStopTrackingTouch(seekBar);
            }
        }
    }

    public TextSeekBar(Context context) {
        super(context);
        this.f4655d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10426a.m5714g();
            }
        };
        m5713f();
    }

    /* JADX INFO: renamed from: f */
    public final void m5713f() {
        View.inflate(getContext(), t6c0.f19981q5, this);
        this.f4652a = getChildAt(0);
        AppCompatSeekBar childAt = getChildAt(1);
        this.f4653b = childAt;
        childAt.setOnSeekBarChangeListener(new C0317a());
        this.f4653b.setTag(getTag());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5714g() {
        xdl0.M(this.f4652a, false);
    }

    public int getProgress() {
        return this.f4653b.getProgress();
    }

    /* JADX INFO: renamed from: h */
    public void m5715h(boolean z) {
        xdl0.M(this.f4652a, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m5716i(SeekBar seekBar, int i) {
        this.f4652a.setText(String.valueOf(i));
        Rect bounds = seekBar.getProgressDrawable().getBounds();
        Rect bounds2 = seekBar.getThumb().getBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4652a.getLayoutParams();
        layoutParams.leftMargin = (int) (((bounds.width() * seekBar.getProgress()) / seekBar.getMax()) + (this.f4652a.getPaint().measureText(this.f4652a.getText().toString()) / this.f4652a.getText().length()) + (bounds2.width() / 2.0f));
        this.f4652a.setLayoutParams(layoutParams);
    }

    public void setMax(int i) {
        this.f4653b.setMax(i);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f4654c = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        this.f4653b.setProgress(i);
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4655d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10426a.m5714g();
            }
        };
        m5713f();
    }

    public TextSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4655d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10426a.m5714g();
            }
        };
        m5713f();
    }
}
