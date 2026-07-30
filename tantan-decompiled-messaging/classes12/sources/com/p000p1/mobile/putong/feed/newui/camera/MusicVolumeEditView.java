package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.t100;
import p007l.cr10;
import p007l.it10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f866a;

    /* JADX INFO: renamed from: b */
    public TextView f867b;

    /* JADX INFO: renamed from: c */
    public SeekBar f868c;

    /* JADX INFO: renamed from: d */
    public TextView f869d;

    /* JADX INFO: renamed from: e */
    public TextView f870e;

    /* JADX INFO: renamed from: f */
    public SeekBar f871f;

    /* JADX INFO: renamed from: g */
    public TextView f872g;

    /* JADX INFO: renamed from: h */
    public cr10 f873h;

    /* JADX INFO: renamed from: i */
    public d30 f874i;

    /* JADX INFO: renamed from: j */
    public int f875j;

    /* JADX INFO: renamed from: k */
    public int f876k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicVolumeEditView$a */
    public class C1997a implements SeekBar.OnSeekBarChangeListener {
        public C1997a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f875j = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f869d.setText(String.valueOf(musicVolumeEditView.f875j));
            if (NullChecker.a(MusicVolumeEditView.this.f873h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f873h.mo1949c(musicVolumeEditView2.f875j / 2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicVolumeEditView$b */
    public class C1998b implements SeekBar.OnSeekBarChangeListener {
        public C1998b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f876k = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f872g.setText(String.valueOf(musicVolumeEditView.f876k));
            if (NullChecker.a(MusicVolumeEditView.this.f873h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f873h.mo1948b(musicVolumeEditView2.f876k / 2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicVolumeEditView$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC1999c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1999c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (MusicVolumeEditView.this.f867b.getWidth() > 0) {
                int iMin = Math.min(MusicVolumeEditView.this.f867b.getWidth(), t100.d(84.0f));
                MusicVolumeEditView.this.f867b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) MusicVolumeEditView.this.f867b.getLayoutParams();
                layoutParams.width = iMin;
                MusicVolumeEditView.this.f867b.setLayoutParams(layoutParams);
                MusicVolumeEditView.this.f870e.setLayoutParams(layoutParams);
            }
        }
    }

    public MusicVolumeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m2161f(View view) {
        it10.m11035a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m2162g() {
        this.f866a.setOnClickListener(new View.OnClickListener() { // from class: l.ht10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8814a.m2163h(view);
            }
        });
        this.f868c.setMax(100);
        this.f868c.setProgress(this.f875j);
        this.f868c.setOnSeekBarChangeListener(new C1997a());
        this.f871f.setMax(100);
        this.f871f.setProgress(this.f876k);
        this.f871f.setOnSeekBarChangeListener(new C1998b());
        this.f867b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1999c());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2163h(View view) {
        setVisibility(8);
        if (NullChecker.a(this.f874i)) {
            this.f874i.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2164i(int i, int i2) {
        int i3 = i * 2;
        this.f875j = i3;
        this.f876k = i2 * 2;
        this.f868c.setProgress(i3);
        this.f871f.setProgress(this.f876k);
        this.f869d.setText(String.valueOf(this.f875j));
        this.f872g.setText(String.valueOf(this.f876k));
    }

    /* JADX INFO: renamed from: j */
    public void m2165j(boolean z, MusicContent musicContent) {
        TextView textView = this.f869d;
        if (z) {
            textView.setText(String.valueOf(0));
            this.f868c.setProgress(0);
            this.f868c.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f875j));
            this.f868c.setProgress(this.f875j);
            this.f868c.setEnabled(true);
        }
        TextView textView2 = this.f872g;
        if (musicContent == null) {
            textView2.setText(String.valueOf(0));
            this.f871f.setProgress(0);
            this.f871f.setEnabled(false);
        } else {
            textView2.setText(String.valueOf(this.f876k));
            this.f871f.setProgress(this.f876k);
            this.f871f.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2166k() {
        setVisibility(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2161f(this);
        m2162g();
    }

    public void setDismissListener(d30 d30Var) {
        this.f874i = d30Var;
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
