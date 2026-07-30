package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

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

/* JADX INFO: loaded from: classes5.dex */
public class KtvTuningSeekBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f53303a;

    /* JADX INFO: renamed from: b */
    public AppCompatSeekBar f53304b;

    /* JADX INFO: renamed from: c */
    public SeekBar.OnSeekBarChangeListener f53305c;

    /* JADX INFO: renamed from: d */
    public Runnable f53306d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningSeekBar$a */
    public class C13127a implements SeekBar.OnSeekBarChangeListener {
        public C13127a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningSeekBar.this.m78300h(seekBar, i);
            if (NullChecker.m82486a(KtvTuningSeekBar.this.f53305c)) {
                KtvTuningSeekBar.this.f53305c.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            bnl0.m105525M0(KtvTuningSeekBar.this.f53303a, true);
            l51.m152890J(KtvTuningSeekBar.this.f53306d);
            if (NullChecker.m82486a(KtvTuningSeekBar.this.f53305c)) {
                KtvTuningSeekBar.this.f53305c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            l51.m152888H(KtvTuningSeekBar.this.getContext(), KtvTuningSeekBar.this.f53306d, 300L);
            if (NullChecker.m82486a(KtvTuningSeekBar.this.f53305c)) {
                KtvTuningSeekBar.this.f53305c.onStopTrackingTouch(seekBar);
            }
        }
    }

    public KtvTuningSeekBar(Context context) {
        super(context);
        this.f53306d = new Runnable() { // from class: l.y6r
            @Override // java.lang.Runnable
            public final void run() {
                this.f197707a.m78299g();
            }
        };
        m78298f();
    }

    /* JADX INFO: renamed from: f */
    public final void m78298f() {
        View.inflate(getContext(), yec0.f198982Y2, this);
        this.f53303a = (VText) getChildAt(0);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) getChildAt(1);
        this.f53304b = appCompatSeekBar;
        appCompatSeekBar.setOnSeekBarChangeListener(new C13127a());
        this.f53304b.setTag(getTag());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m78299g() {
        bnl0.m105525M0(this.f53303a, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m78300h(SeekBar seekBar, int i) {
        this.f53303a.setText(String.valueOf(i));
        Rect bounds = seekBar.getProgressDrawable().getBounds();
        Rect bounds2 = seekBar.getThumb().getBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53303a.getLayoutParams();
        layoutParams.leftMargin = (int) (((bounds.width() * seekBar.getProgress()) / seekBar.getMax()) + (this.f53303a.getPaint().measureText(this.f53303a.getText().toString()) / this.f53303a.getText().length()) + (bounds2.width() / 2.0f));
        this.f53303a.setLayoutParams(layoutParams);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f53305c = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        this.f53304b.setProgress(i);
    }

    public KtvTuningSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53306d = new Runnable() { // from class: l.y6r
            @Override // java.lang.Runnable
            public final void run() {
                this.f197707a.m78299g();
            }
        };
        m78298f();
    }

    public KtvTuningSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53306d = new Runnable() { // from class: l.y6r
            @Override // java.lang.Runnable
            public final void run() {
                this.f197707a.m78299g();
            }
        };
        m78298f();
    }
}
