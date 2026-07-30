package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p153l.e8m;
import p153l.kz10;
import p153l.lbc0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class IVMusicVolumeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f40121a;

    /* JADX INFO: renamed from: b */
    public ImageView f40122b;

    /* JADX INFO: renamed from: c */
    public ImageView f40123c;

    /* JADX INFO: renamed from: d */
    public TextView f40124d;

    /* JADX INFO: renamed from: e */
    public TextView f40125e;

    /* JADX INFO: renamed from: f */
    public SeekBar f40126f;

    /* JADX INFO: renamed from: g */
    public kz10 f40127g;

    /* JADX INFO: renamed from: h */
    public x20 f40128h;

    /* JADX INFO: renamed from: i */
    public int f40129i;

    /* JADX INFO: renamed from: j */
    public int f40130j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView$a */
    public class C11307a implements SeekBar.OnSeekBarChangeListener {
        public C11307a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            IVMusicVolumeEditView.this.f40129i = i;
            int i2 = IVMusicVolumeEditView.this.f40129i;
            int i3 = IVMusicVolumeEditView.this.f40130j;
            IVMusicVolumeEditView iVMusicVolumeEditView = IVMusicVolumeEditView.this;
            if (i2 != i3) {
                iVMusicVolumeEditView.f40123c.setImageResource(lbc0.f130828D5);
            } else {
                iVMusicVolumeEditView.f40123c.setImageResource(lbc0.f130836E5);
            }
            IVMusicVolumeEditView iVMusicVolumeEditView2 = IVMusicVolumeEditView.this;
            iVMusicVolumeEditView2.f40125e.setText(String.valueOf(iVMusicVolumeEditView2.f40129i));
            if (NullChecker.m82486a(IVMusicVolumeEditView.this.f40127g)) {
                IVMusicVolumeEditView iVMusicVolumeEditView3 = IVMusicVolumeEditView.this;
                iVMusicVolumeEditView3.f40127g.mo62202b(iVMusicVolumeEditView3.f40129i / 2);
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
    public final void m62134g(View view) {
        e8m.m119829a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m62135h() {
        this.f40121a.setOnClickListener(new View.OnClickListener() { // from class: l.b8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75444a.m62136i(view);
            }
        });
        this.f40122b.setOnClickListener(new View.OnClickListener() { // from class: l.c8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80223a.m62137j(view);
            }
        });
        this.f40123c.setOnClickListener(new View.OnClickListener() { // from class: l.d8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85653a.m62138k(view);
            }
        });
        this.f40126f.setMax(100);
        this.f40126f.setProgress(this.f40129i);
        this.f40126f.setOnSeekBarChangeListener(new C11307a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m62136i(View view) {
        setVisibility(8);
        if (NullChecker.m82486a(this.f40128h)) {
            this.f40128h.call();
        }
        if (NullChecker.m82486a(this.f40127g)) {
            this.f40127g.mo62202b(this.f40130j / 2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m62137j(View view) {
        setVisibility(8);
        if (NullChecker.m82486a(this.f40128h)) {
            this.f40128h.call();
        }
        if (NullChecker.m82486a(this.f40127g)) {
            this.f40127g.mo62202b(this.f40130j / 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m62138k(View view) {
        setVisibility(8);
        this.f40130j = this.f40129i;
        if (NullChecker.m82486a(this.f40128h)) {
            this.f40128h.call();
        }
        if (NullChecker.m82486a(this.f40127g)) {
            this.f40127g.mo62202b(this.f40130j / 2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m62139l(boolean z, MusicContent musicContent) {
        TextView textView = this.f40125e;
        if (musicContent == null) {
            textView.setText(String.valueOf(0));
            this.f40126f.setProgress(0);
            this.f40126f.setEnabled(false);
        } else {
            textView.setText(String.valueOf(this.f40129i));
            this.f40126f.setProgress(this.f40129i);
            this.f40126f.setEnabled(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62134g(this);
        m62135h();
    }

    public void setCurrentVolumeValue(int i) {
        int i2 = i * 2;
        this.f40130j = i2;
        this.f40126f.setProgress(i2);
        this.f40125e.setText(String.valueOf(this.f40130j));
    }

    public void setDismissListener(x20 x20Var) {
        this.f40128h = x20Var;
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicVolumeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
