package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p149l.cr10;
import p149l.d30;
import p149l.f3c0;
import p149l.o5m;

/* JADX INFO: loaded from: classes12.dex */
public class IVMusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f39273a;

    /* JADX INFO: renamed from: b */
    public ImageView f39274b;

    /* JADX INFO: renamed from: c */
    public ImageView f39275c;

    /* JADX INFO: renamed from: d */
    public TextView f39276d;

    /* JADX INFO: renamed from: e */
    public TextView f39277e;

    /* JADX INFO: renamed from: f */
    public SeekBar f39278f;

    /* JADX INFO: renamed from: g */
    public cr10 f39279g;

    /* JADX INFO: renamed from: h */
    public d30 f39280h;

    /* JADX INFO: renamed from: i */
    public int f39281i;

    /* JADX INFO: renamed from: j */
    public int f39282j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView$a */
    public class C11144a implements SeekBar.OnSeekBarChangeListener {
        public C11144a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            IVMusicVolumeEditView.this.f39281i = i;
            int i2 = IVMusicVolumeEditView.this.f39281i;
            int i3 = IVMusicVolumeEditView.this.f39282j;
            IVMusicVolumeEditView iVMusicVolumeEditView = IVMusicVolumeEditView.this;
            if (i2 != i3) {
                iVMusicVolumeEditView.f39275c.setImageResource(f3c0.f94310D5);
            } else {
                iVMusicVolumeEditView.f39275c.setImageResource(f3c0.f94318E5);
            }
            IVMusicVolumeEditView iVMusicVolumeEditView2 = IVMusicVolumeEditView.this;
            iVMusicVolumeEditView2.f39277e.setText(String.valueOf(iVMusicVolumeEditView2.f39281i));
            if (NullChecker.m81303a(IVMusicVolumeEditView.this.f39279g)) {
                IVMusicVolumeEditView iVMusicVolumeEditView3 = IVMusicVolumeEditView.this;
                iVMusicVolumeEditView3.f39279g.mo61018b(iVMusicVolumeEditView3.f39281i / 2);
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
    public final void m60950g(View view) {
        o5m.m162797a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m60951h() {
        this.f39273a.setOnClickListener(new View.OnClickListener() { // from class: l.l5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126190a.m60952i(view);
            }
        });
        this.f39274b.setOnClickListener(new View.OnClickListener() { // from class: l.m5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131406a.m60953j(view);
            }
        });
        this.f39275c.setOnClickListener(new View.OnClickListener() { // from class: l.n5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137219a.m60954k(view);
            }
        });
        this.f39278f.setMax(100);
        this.f39278f.setProgress(this.f39281i);
        this.f39278f.setOnSeekBarChangeListener(new C11144a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m60952i(View view) {
        setVisibility(8);
        if (NullChecker.m81303a(this.f39280h)) {
            this.f39280h.call();
        }
        if (NullChecker.m81303a(this.f39279g)) {
            this.f39279g.mo61018b(this.f39282j / 2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m60953j(View view) {
        setVisibility(8);
        if (NullChecker.m81303a(this.f39280h)) {
            this.f39280h.call();
        }
        if (NullChecker.m81303a(this.f39279g)) {
            this.f39279g.mo61018b(this.f39282j / 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m60954k(View view) {
        setVisibility(8);
        this.f39282j = this.f39281i;
        if (NullChecker.m81303a(this.f39280h)) {
            this.f39280h.call();
        }
        if (NullChecker.m81303a(this.f39279g)) {
            this.f39279g.mo61018b(this.f39282j / 2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m60955l(boolean z, MusicContent musicContent) {
        TextView textView = this.f39277e;
        if (musicContent == null) {
            textView.setText(String.valueOf(0));
            this.f39278f.setProgress(0);
            this.f39278f.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f39281i));
            this.f39278f.setProgress(this.f39281i);
            this.f39278f.setEnabled(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60950g(this);
        m60951h();
    }

    public void setCurrentVolumeValue(int i) {
        int i2 = i * 2;
        this.f39282j = i2;
        this.f39278f.setProgress(i2);
        this.f39277e.setText(String.valueOf(this.f39282j));
    }

    public void setDismissListener(d30 d30Var) {
        this.f39280h = d30Var;
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
