package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p153l.mxd0;
import p153l.vmi;
import p153l.x20;
import p153l.zv2;

/* JADX INFO: loaded from: classes13.dex */
public class BeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f40376a;

    /* JADX INFO: renamed from: b */
    public BeautyMenuItemView f40377b;

    /* JADX INFO: renamed from: c */
    public BeautyMenuItemView f40378c;

    /* JADX INFO: renamed from: d */
    public BeautyMenuItemView f40379d;

    /* JADX INFO: renamed from: e */
    public BeautyValueTipSeekBar f40380e;

    /* JADX INFO: renamed from: f */
    public vmi f40381f;

    /* JADX INFO: renamed from: g */
    public int f40382g;

    /* JADX INFO: renamed from: h */
    public mxd0 f40383h;

    /* JADX INFO: renamed from: i */
    public mxd0 f40384i;

    /* JADX INFO: renamed from: j */
    public mxd0 f40385j;

    /* JADX INFO: renamed from: k */
    public float f40386k;

    /* JADX INFO: renamed from: l */
    public float f40387l;

    /* JADX INFO: renamed from: m */
    public float f40388m;

    /* JADX INFO: renamed from: n */
    public x20 f40389n;

    /* JADX INFO: renamed from: o */
    public boolean f40390o;

    /* JADX INFO: renamed from: p */
    public boolean f40391p;

    /* JADX INFO: renamed from: q */
    public boolean f40392q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView$a */
    public class C11327a implements SeekBar.OnSeekBarChangeListener {
        public C11327a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = BeautyMenuView.this.f40382g;
            if (i2 == 1) {
                BeautyMenuView.this.f40386k = i / 100.0f;
            } else if (i2 == 2) {
                BeautyMenuView.this.f40387l = i / 100.0f;
            } else if (i2 == 3) {
                BeautyMenuView.this.f40388m = i / 100.0f;
            }
            if (NullChecker.m82486a(BeautyMenuView.this.f40381f)) {
                BeautyMenuView.this.f40381f.mo201743n(i / 100.0f, BeautyMenuView.this.f40382g);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40383h = new mxd0("beauty_white_skin", 0.5d);
        this.f40384i = new mxd0("beauty_big_eye", 0.30000001192092896d);
        this.f40385j = new mxd0("beauty_thin_face", 0.375d);
        this.f40390o = true;
        this.f40391p = true;
        this.f40392q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m62600f(View view) {
        zv2.m221749a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m62601g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final void m62602h(boolean z) {
        this.f40380e.setEnabled(z);
    }

    /* JADX INFO: renamed from: i */
    public final void m62603i() {
        this.f40377b.setSelected(false);
        this.f40378c.setSelected(false);
        this.f40379d.setSelected(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m62604j() {
        this.f40386k = this.f40383h.get().floatValue();
        this.f40387l = this.f40384i.get().floatValue();
        this.f40388m = this.f40385j.get().floatValue();
        this.f40377b.setText(m62601g().getString(R$string.f40032z0));
        this.f40377b.setOnClickListener(this);
        this.f40377b.setSelected(true);
        this.f40382g = 1;
        this.f40378c.setText(m62601g().getString(R$string.f39984r0));
        this.f40378c.setOnClickListener(this);
        this.f40379d.setText(m62601g().getString(R$string.f39990s0));
        this.f40379d.setOnClickListener(this);
        this.f40380e.setMax(100);
        this.f40380e.setProgress((int) (this.f40386k * 100.0f));
        if (NullChecker.m82486a(this.f40381f)) {
            this.f40381f.mo201743n(this.f40388m, this.f40382g);
            this.f40381f.mo201743n(this.f40386k, this.f40382g);
            this.f40381f.mo201743n(this.f40387l, this.f40382g);
        }
        this.f40380e.setOnSeekBarChangeListener(new C11327a());
        this.f40376a.setOnClickListener(new View.OnClickListener() { // from class: l.yv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201674a.m62605k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m62605k(View view) {
        this.f40383h.put(Double.valueOf(this.f40386k));
        this.f40384i.put(Double.valueOf(this.f40387l));
        this.f40385j.put(Double.valueOf(this.f40388m));
        if (NullChecker.m82486a(this.f40389n)) {
            this.f40389n.call();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m62603i();
        view.setSelected(true);
        if (this.f40377b == view) {
            this.f40382g = 1;
            this.f40380e.setProgress((int) (this.f40386k * 100.0f));
            m62602h(this.f40390o);
        } else if (this.f40378c == view) {
            this.f40382g = 2;
            this.f40380e.setProgress((int) (this.f40387l * 100.0f));
            m62602h(this.f40391p);
        } else if (this.f40379d == view) {
            this.f40382g = 3;
            this.f40380e.setProgress((int) (this.f40388m * 100.0f));
            m62602h(this.f40392q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62600f(this);
        m62604j();
    }

    public void setBeautyBigEye(boolean z) {
        this.f40391p = z;
        if (this.f40382g == 2) {
            m62602h(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f40392q = z;
        if (this.f40382g == 3) {
            m62602h(z);
        }
    }

    public void setFilterListener(vmi vmiVar) {
        this.f40381f = vmiVar;
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f40389n = x20Var;
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuView(Context context) {
        this(context, null);
    }
}
