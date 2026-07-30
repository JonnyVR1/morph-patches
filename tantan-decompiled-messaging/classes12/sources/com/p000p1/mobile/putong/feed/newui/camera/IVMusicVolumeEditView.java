package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import p007l.cr10;
import p007l.f3c0;
import p007l.o5m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IVMusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f734a;

    /* JADX INFO: renamed from: b */
    public ImageView f735b;

    /* JADX INFO: renamed from: c */
    public ImageView f736c;

    /* JADX INFO: renamed from: d */
    public TextView f737d;

    /* JADX INFO: renamed from: e */
    public TextView f738e;

    /* JADX INFO: renamed from: f */
    public SeekBar f739f;

    /* JADX INFO: renamed from: g */
    public cr10 f740g;

    /* JADX INFO: renamed from: h */
    public d30 f741h;

    /* JADX INFO: renamed from: i */
    public int f742i;

    /* JADX INFO: renamed from: j */
    public int f743j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView$a */
    public class C1988a implements SeekBar.OnSeekBarChangeListener {
        public C1988a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            IVMusicVolumeEditView.this.f742i = i;
            int i2 = IVMusicVolumeEditView.this.f742i;
            int i3 = IVMusicVolumeEditView.this.f743j;
            IVMusicVolumeEditView iVMusicVolumeEditView = IVMusicVolumeEditView.this;
            if (i2 != i3) {
                iVMusicVolumeEditView.f736c.setImageResource(f3c0.f7593D5);
            } else {
                iVMusicVolumeEditView.f736c.setImageResource(f3c0.f7601E5);
            }
            IVMusicVolumeEditView iVMusicVolumeEditView2 = IVMusicVolumeEditView.this;
            iVMusicVolumeEditView2.f738e.setText(String.valueOf(iVMusicVolumeEditView2.f742i));
            if (NullChecker.a(IVMusicVolumeEditView.this.f740g)) {
                IVMusicVolumeEditView iVMusicVolumeEditView3 = IVMusicVolumeEditView.this;
                iVMusicVolumeEditView3.f740g.mo1948b(iVMusicVolumeEditView3.f742i / 2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public IVMusicVolumeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m1876g(View view) {
        o5m.m12445a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m1877h() {
        this.f734a.setOnClickListener(new View.OnClickListener() { // from class: l.l5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9894a.m1878i(view);
            }
        });
        this.f735b.setOnClickListener(new View.OnClickListener() { // from class: l.m5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10239a.m1879j(view);
            }
        });
        this.f736c.setOnClickListener(new View.OnClickListener() { // from class: l.n5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10674a.m1880k(view);
            }
        });
        this.f739f.setMax(100);
        this.f739f.setProgress(this.f742i);
        this.f739f.setOnSeekBarChangeListener(new C1988a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1878i(View view) {
        setVisibility(8);
        if (NullChecker.a(this.f741h)) {
            this.f741h.call();
        }
        if (NullChecker.a(this.f740g)) {
            this.f740g.mo1948b(this.f743j / 2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1879j(View view) {
        setVisibility(8);
        if (NullChecker.a(this.f741h)) {
            this.f741h.call();
        }
        if (NullChecker.a(this.f740g)) {
            this.f740g.mo1948b(this.f743j / 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1880k(View view) {
        setVisibility(8);
        this.f743j = this.f742i;
        if (NullChecker.a(this.f741h)) {
            this.f741h.call();
        }
        if (NullChecker.a(this.f740g)) {
            this.f740g.mo1948b(this.f743j / 2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1881l(boolean z, MusicContent musicContent) {
        TextView textView = this.f738e;
        if (musicContent == null) {
            textView.setText(String.valueOf(0));
            this.f739f.setProgress(0);
            this.f739f.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f742i));
            this.f739f.setProgress(this.f742i);
            this.f739f.setEnabled(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1876g(this);
        m1877h();
    }

    public void setCurrentVolumeValue(int i) {
        int i2 = i * 2;
        this.f743j = i2;
        this.f739f.setProgress(i2);
        this.f738e.setText(String.valueOf(this.f743j));
    }

    public void setDismissListener(d30 d30Var) {
        this.f741h = d30Var;
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
