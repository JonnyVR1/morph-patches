package com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.e51;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TextSeekBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f48610a;

    /* JADX INFO: renamed from: b */
    public AppCompatSeekBar f48611b;

    /* JADX INFO: renamed from: c */
    public SeekBar.OnSeekBarChangeListener f48612c;

    /* JADX INFO: renamed from: d */
    public Runnable f48613d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar$a */
    public class C12728a implements SeekBar.OnSeekBarChangeListener {
        public C12728a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextSeekBar.this.m72243i(seekBar, i);
            if (NullChecker.m81303a(TextSeekBar.this.f48612c)) {
                TextSeekBar.this.f48612c.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            xdl0.m208344M(TextSeekBar.this.f48610a, true);
            e51.m114745J(TextSeekBar.this.f48613d);
            if (NullChecker.m81303a(TextSeekBar.this.f48612c)) {
                TextSeekBar.this.f48612c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            e51.m114743H(TextSeekBar.this.getContext(), TextSeekBar.this.f48613d, 300L);
            if (NullChecker.m81303a(TextSeekBar.this.f48612c)) {
                TextSeekBar.this.f48612c.onStopTrackingTouch(seekBar);
            }
        }
    }

    public TextSeekBar(Context context) {
        super(context);
        this.f48613d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97790a.m72241g();
            }
        };
        m72240f();
    }

    /* JADX INFO: renamed from: f */
    public final void m72240f() {
        View.inflate(getContext(), t6c0.f168485q5, this);
        this.f48610a = (VText) getChildAt(0);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) getChildAt(1);
        this.f48611b = appCompatSeekBar;
        appCompatSeekBar.setOnSeekBarChangeListener(new C12728a());
        this.f48611b.setTag(getTag());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m72241g() {
        xdl0.m208344M(this.f48610a, false);
    }

    public int getProgress() {
        return this.f48611b.getProgress();
    }

    /* JADX INFO: renamed from: h */
    public void m72242h(boolean z) {
        xdl0.m208344M(this.f48610a, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m72243i(SeekBar seekBar, int i) {
        this.f48610a.setText(String.valueOf(i));
        Rect bounds = seekBar.getProgressDrawable().getBounds();
        Rect bounds2 = seekBar.getThumb().getBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48610a.getLayoutParams();
        layoutParams.leftMargin = (int) (((bounds.width() * seekBar.getProgress()) / seekBar.getMax()) + (this.f48610a.getPaint().measureText(this.f48610a.getText().toString()) / this.f48610a.getText().length()) + (bounds2.width() / 2.0f));
        this.f48610a.setLayoutParams(layoutParams);
    }

    public void setMax(int i) {
        this.f48611b.setMax(i);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f48612c = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        this.f48611b.setProgress(i);
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48613d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97790a.m72241g();
            }
        };
        m72240f();
    }

    public TextSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48613d = new Runnable() { // from class: l.fji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97790a.m72241g();
            }
        };
        m72240f();
    }
}
