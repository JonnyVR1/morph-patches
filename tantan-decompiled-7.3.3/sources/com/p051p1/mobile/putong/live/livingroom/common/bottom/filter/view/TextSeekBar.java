package com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.l51;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class TextSeekBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f49458a;

    /* JADX INFO: renamed from: b */
    public AppCompatSeekBar f49459b;

    /* JADX INFO: renamed from: c */
    public SeekBar.OnSeekBarChangeListener f49460c;

    /* JADX INFO: renamed from: d */
    public Runnable f49461d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar$a */
    public class C12891a implements SeekBar.OnSeekBarChangeListener {
        public C12891a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextSeekBar.this.m73426i(seekBar, i);
            if (NullChecker.m82486a(TextSeekBar.this.f49460c)) {
                TextSeekBar.this.f49460c.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            bnl0.m105524M(TextSeekBar.this.f49458a, true);
            l51.m152890J(TextSeekBar.this.f49461d);
            if (NullChecker.m82486a(TextSeekBar.this.f49460c)) {
                TextSeekBar.this.f49460c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            l51.m152888H(TextSeekBar.this.getContext(), TextSeekBar.this.f49461d, 300L);
            if (NullChecker.m82486a(TextSeekBar.this.f49460c)) {
                TextSeekBar.this.f49460c.onStopTrackingTouch(seekBar);
            }
        }
    }

    public TextSeekBar(Context context) {
        super(context);
        this.f49461d = new Runnable() { // from class: l.fsi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100631a.m73424g();
            }
        };
        m73423f();
    }

    /* JADX INFO: renamed from: f */
    public final void m73423f() {
        View.inflate(getContext(), yec0.f199217q5, this);
        this.f49458a = (VText) getChildAt(0);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) getChildAt(1);
        this.f49459b = appCompatSeekBar;
        appCompatSeekBar.setOnSeekBarChangeListener(new C12891a());
        this.f49459b.setTag(getTag());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m73424g() {
        bnl0.m105524M(this.f49458a, false);
    }

    public int getProgress() {
        return this.f49459b.getProgress();
    }

    /* JADX INFO: renamed from: h */
    public void m73425h(boolean z) {
        bnl0.m105524M(this.f49458a, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m73426i(SeekBar seekBar, int i) {
        this.f49458a.setText(String.valueOf(i));
        Rect bounds = seekBar.getProgressDrawable().getBounds();
        Rect bounds2 = seekBar.getThumb().getBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49458a.getLayoutParams();
        layoutParams.leftMargin = (int) (((bounds.width() * seekBar.getProgress()) / seekBar.getMax()) + (this.f49458a.getPaint().measureText(this.f49458a.getText().toString()) / this.f49458a.getText().length()) + (bounds2.width() / 2.0f));
        this.f49458a.setLayoutParams(layoutParams);
    }

    public void setMax(int i) {
        this.f49459b.setMax(i);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f49460c = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        this.f49459b.setProgress(i);
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49461d = new Runnable() { // from class: l.fsi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100631a.m73424g();
            }
        };
        m73423f();
    }

    public TextSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49461d = new Runnable() { // from class: l.fsi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100631a.m73424g();
            }
        };
        m73423f();
    }
}
