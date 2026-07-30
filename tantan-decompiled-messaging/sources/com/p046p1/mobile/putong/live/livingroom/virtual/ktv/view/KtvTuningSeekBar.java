package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

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

/* JADX INFO: loaded from: classes5.dex */
public class KtvTuningSeekBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f52455a;

    /* JADX INFO: renamed from: b */
    public AppCompatSeekBar f52456b;

    /* JADX INFO: renamed from: c */
    public SeekBar.OnSeekBarChangeListener f52457c;

    /* JADX INFO: renamed from: d */
    public Runnable f52458d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningSeekBar$a */
    public class C12964a implements SeekBar.OnSeekBarChangeListener {
        public C12964a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningSeekBar.this.m77117h(seekBar, i);
            if (NullChecker.m81303a(KtvTuningSeekBar.this.f52457c)) {
                KtvTuningSeekBar.this.f52457c.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            xdl0.m208345M0(KtvTuningSeekBar.this.f52455a, true);
            e51.m114745J(KtvTuningSeekBar.this.f52458d);
            if (NullChecker.m81303a(KtvTuningSeekBar.this.f52457c)) {
                KtvTuningSeekBar.this.f52457c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            e51.m114743H(KtvTuningSeekBar.this.getContext(), KtvTuningSeekBar.this.f52458d, 300L);
            if (NullChecker.m81303a(KtvTuningSeekBar.this.f52457c)) {
                KtvTuningSeekBar.this.f52457c.onStopTrackingTouch(seekBar);
            }
        }
    }

    public KtvTuningSeekBar(Context context) {
        super(context);
        this.f52458d = new Runnable() { // from class: l.x4r
            @Override // java.lang.Runnable
            public final void run() {
                this.f191046a.m77116g();
            }
        };
        m77115f();
    }

    /* JADX INFO: renamed from: f */
    public final void m77115f() {
        View.inflate(getContext(), t6c0.f168250Y2, this);
        this.f52455a = (VText) getChildAt(0);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) getChildAt(1);
        this.f52456b = appCompatSeekBar;
        appCompatSeekBar.setOnSeekBarChangeListener(new C12964a());
        this.f52456b.setTag(getTag());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m77116g() {
        xdl0.m208345M0(this.f52455a, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m77117h(SeekBar seekBar, int i) {
        this.f52455a.setText(String.valueOf(i));
        Rect bounds = seekBar.getProgressDrawable().getBounds();
        Rect bounds2 = seekBar.getThumb().getBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52455a.getLayoutParams();
        layoutParams.leftMargin = (int) (((bounds.width() * seekBar.getProgress()) / seekBar.getMax()) + (this.f52455a.getPaint().measureText(this.f52455a.getText().toString()) / this.f52455a.getText().length()) + (bounds2.width() / 2.0f));
        this.f52455a.setLayoutParams(layoutParams);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f52457c = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        this.f52456b.setProgress(i);
    }

    public KtvTuningSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52458d = new Runnable() { // from class: l.x4r
            @Override // java.lang.Runnable
            public final void run() {
                this.f191046a.m77116g();
            }
        };
        m77115f();
    }

    public KtvTuningSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52458d = new Runnable() { // from class: l.x4r
            @Override // java.lang.Runnable
            public final void run() {
                this.f191046a.m77116g();
            }
        };
        m77115f();
    }
}
