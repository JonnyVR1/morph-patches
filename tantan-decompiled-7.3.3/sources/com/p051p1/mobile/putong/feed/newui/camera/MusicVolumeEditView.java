package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p153l.kz10;
import p153l.q120;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f40253a;

    /* JADX INFO: renamed from: b */
    public TextView f40254b;

    /* JADX INFO: renamed from: c */
    public SeekBar f40255c;

    /* JADX INFO: renamed from: d */
    public TextView f40256d;

    /* JADX INFO: renamed from: e */
    public TextView f40257e;

    /* JADX INFO: renamed from: f */
    public SeekBar f40258f;

    /* JADX INFO: renamed from: g */
    public TextView f40259g;

    /* JADX INFO: renamed from: h */
    public kz10 f40260h;

    /* JADX INFO: renamed from: i */
    public x20 f40261i;

    /* JADX INFO: renamed from: j */
    public int f40262j;

    /* JADX INFO: renamed from: k */
    public int f40263k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicVolumeEditView$a */
    public class C11316a implements SeekBar.OnSeekBarChangeListener {
        public C11316a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f40262j = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f40256d.setText(String.valueOf(musicVolumeEditView.f40262j));
            if (NullChecker.m82486a(MusicVolumeEditView.this.f40260h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f40260h.mo62203c(musicVolumeEditView2.f40262j / 2);
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
    public class C11317b implements SeekBar.OnSeekBarChangeListener {
        public C11317b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f40263k = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f40259g.setText(String.valueOf(musicVolumeEditView.f40263k));
            if (NullChecker.m82486a(MusicVolumeEditView.this.f40260h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f40260h.mo62202b(musicVolumeEditView2.f40263k / 2);
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
    public class ViewTreeObserverOnGlobalLayoutListenerC11318c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC11318c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (MusicVolumeEditView.this.f40254b.getWidth() > 0) {
                int iMin = Math.min(MusicVolumeEditView.this.f40254b.getWidth(), qa00.m175859d(84.0f));
                MusicVolumeEditView.this.f40254b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) MusicVolumeEditView.this.f40254b.getLayoutParams();
                layoutParams.width = iMin;
                MusicVolumeEditView.this.f40254b.setLayoutParams(layoutParams);
                MusicVolumeEditView.this.f40257e.setLayoutParams(layoutParams);
            }
        }
    }

    public MusicVolumeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m62409f(View view) {
        q120.m174811a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m62410g() {
        this.f40253a.setOnClickListener(new View.OnClickListener() { // from class: l.p120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150130a.m62411h(view);
            }
        });
        this.f40255c.setMax(100);
        this.f40255c.setProgress(this.f40262j);
        this.f40255c.setOnSeekBarChangeListener(new C11316a());
        this.f40258f.setMax(100);
        this.f40258f.setProgress(this.f40263k);
        this.f40258f.setOnSeekBarChangeListener(new C11317b());
        this.f40254b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11318c());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m62411h(View view) {
        setVisibility(8);
        if (NullChecker.m82486a(this.f40261i)) {
            this.f40261i.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m62412i(int i, int i2) {
        int i3 = i * 2;
        this.f40262j = i3;
        this.f40263k = i2 * 2;
        this.f40255c.setProgress(i3);
        this.f40258f.setProgress(this.f40263k);
        this.f40256d.setText(String.valueOf(this.f40262j));
        this.f40259g.setText(String.valueOf(this.f40263k));
    }

    /* JADX INFO: renamed from: j */
    public void m62413j(boolean z, MusicContent musicContent) {
        TextView textView = this.f40256d;
        if (z) {
            textView.setText(String.valueOf(0));
            this.f40255c.setProgress(0);
            this.f40255c.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f40262j));
            this.f40255c.setProgress(this.f40262j);
            this.f40255c.setEnabled(true);
        }
        TextView textView2 = this.f40259g;
        if (musicContent == null) {
            textView2.setText(String.valueOf(0));
            this.f40258f.setProgress(0);
            this.f40258f.setEnabled(false);
        } else {
            textView2.setText(String.valueOf(this.f40263k));
            this.f40258f.setProgress(this.f40263k);
            this.f40258f.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m62414k() {
        setVisibility(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62409f(this);
        m62410g();
    }

    public void setDismissListener(x20 x20Var) {
        this.f40261i = x20Var;
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
