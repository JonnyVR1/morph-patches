package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p149l.cr10;
import p149l.d30;
import p149l.it10;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class MusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f39405a;

    /* JADX INFO: renamed from: b */
    public TextView f39406b;

    /* JADX INFO: renamed from: c */
    public SeekBar f39407c;

    /* JADX INFO: renamed from: d */
    public TextView f39408d;

    /* JADX INFO: renamed from: e */
    public TextView f39409e;

    /* JADX INFO: renamed from: f */
    public SeekBar f39410f;

    /* JADX INFO: renamed from: g */
    public TextView f39411g;

    /* JADX INFO: renamed from: h */
    public cr10 f39412h;

    /* JADX INFO: renamed from: i */
    public d30 f39413i;

    /* JADX INFO: renamed from: j */
    public int f39414j;

    /* JADX INFO: renamed from: k */
    public int f39415k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicVolumeEditView$a */
    public class C11153a implements SeekBar.OnSeekBarChangeListener {
        public C11153a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f39414j = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f39408d.setText(String.valueOf(musicVolumeEditView.f39414j));
            if (NullChecker.m81303a(MusicVolumeEditView.this.f39412h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f39412h.mo61019c(musicVolumeEditView2.f39414j / 2);
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
    public class C11154b implements SeekBar.OnSeekBarChangeListener {
        public C11154b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MusicVolumeEditView.this.f39415k = i;
            MusicVolumeEditView musicVolumeEditView = MusicVolumeEditView.this;
            musicVolumeEditView.f39411g.setText(String.valueOf(musicVolumeEditView.f39415k));
            if (NullChecker.m81303a(MusicVolumeEditView.this.f39412h)) {
                MusicVolumeEditView musicVolumeEditView2 = MusicVolumeEditView.this;
                musicVolumeEditView2.f39412h.mo61018b(musicVolumeEditView2.f39415k / 2);
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
    public class ViewTreeObserverOnGlobalLayoutListenerC11155c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC11155c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (MusicVolumeEditView.this.f39406b.getWidth() > 0) {
                int iMin = Math.min(MusicVolumeEditView.this.f39406b.getWidth(), t100.m186890d(84.0f));
                MusicVolumeEditView.this.f39406b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) MusicVolumeEditView.this.f39406b.getLayoutParams();
                layoutParams.width = iMin;
                MusicVolumeEditView.this.f39406b.setLayoutParams(layoutParams);
                MusicVolumeEditView.this.f39409e.setLayoutParams(layoutParams);
            }
        }
    }

    public MusicVolumeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m61225f(View view) {
        it10.m138097a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m61226g() {
        this.f39405a.setOnClickListener(new View.OnClickListener() { // from class: l.ht10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109361a.m61227h(view);
            }
        });
        this.f39407c.setMax(100);
        this.f39407c.setProgress(this.f39414j);
        this.f39407c.setOnSeekBarChangeListener(new C11153a());
        this.f39410f.setMax(100);
        this.f39410f.setProgress(this.f39415k);
        this.f39410f.setOnSeekBarChangeListener(new C11154b());
        this.f39406b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11155c());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m61227h(View view) {
        setVisibility(8);
        if (NullChecker.m81303a(this.f39413i)) {
            this.f39413i.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m61228i(int i, int i2) {
        int i3 = i * 2;
        this.f39414j = i3;
        this.f39415k = i2 * 2;
        this.f39407c.setProgress(i3);
        this.f39410f.setProgress(this.f39415k);
        this.f39408d.setText(String.valueOf(this.f39414j));
        this.f39411g.setText(String.valueOf(this.f39415k));
    }

    /* JADX INFO: renamed from: j */
    public void m61229j(boolean z, MusicContent musicContent) {
        TextView textView = this.f39408d;
        if (z) {
            textView.setText(String.valueOf(0));
            this.f39407c.setProgress(0);
            this.f39407c.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f39414j));
            this.f39407c.setProgress(this.f39414j);
            this.f39407c.setEnabled(true);
        }
        TextView textView2 = this.f39411g;
        if (musicContent == null) {
            textView2.setText(String.valueOf(0));
            this.f39410f.setProgress(0);
            this.f39410f.setEnabled(false);
        } else {
            textView2.setText(String.valueOf(this.f39415k));
            this.f39410f.setProgress(this.f39415k);
            this.f39410f.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m61230k() {
        setVisibility(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61225f(this);
        m61226g();
    }

    public void setDismissListener(d30 d30Var) {
        this.f39413i = d30Var;
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
