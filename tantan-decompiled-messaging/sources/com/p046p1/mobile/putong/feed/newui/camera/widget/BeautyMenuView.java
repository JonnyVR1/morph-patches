package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.jv2;
import p149l.kpd0;
import p149l.zji;

/* JADX INFO: loaded from: classes12.dex */
public class BeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f39528a;

    /* JADX INFO: renamed from: b */
    public BeautyMenuItemView f39529b;

    /* JADX INFO: renamed from: c */
    public BeautyMenuItemView f39530c;

    /* JADX INFO: renamed from: d */
    public BeautyMenuItemView f39531d;

    /* JADX INFO: renamed from: e */
    public BeautyValueTipSeekBar f39532e;

    /* JADX INFO: renamed from: f */
    public zji f39533f;

    /* JADX INFO: renamed from: g */
    public int f39534g;

    /* JADX INFO: renamed from: h */
    public kpd0 f39535h;

    /* JADX INFO: renamed from: i */
    public kpd0 f39536i;

    /* JADX INFO: renamed from: j */
    public kpd0 f39537j;

    /* JADX INFO: renamed from: k */
    public float f39538k;

    /* JADX INFO: renamed from: l */
    public float f39539l;

    /* JADX INFO: renamed from: m */
    public float f39540m;

    /* JADX INFO: renamed from: n */
    public d30 f39541n;

    /* JADX INFO: renamed from: o */
    public boolean f39542o;

    /* JADX INFO: renamed from: p */
    public boolean f39543p;

    /* JADX INFO: renamed from: q */
    public boolean f39544q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView$a */
    public class C11164a implements SeekBar.OnSeekBarChangeListener {
        public C11164a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = BeautyMenuView.this.f39534g;
            if (i2 == 1) {
                BeautyMenuView.this.f39538k = i / 100.0f;
            } else if (i2 == 2) {
                BeautyMenuView.this.f39539l = i / 100.0f;
            } else if (i2 == 3) {
                BeautyMenuView.this.f39540m = i / 100.0f;
            }
            if (NullChecker.m81303a(BeautyMenuView.this.f39533f)) {
                BeautyMenuView.this.f39533f.mo192543n(i / 100.0f, BeautyMenuView.this.f39534g);
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
        this.f39535h = new kpd0("beauty_white_skin", 0.5d);
        this.f39536i = new kpd0("beauty_big_eye", 0.30000001192092896d);
        this.f39537j = new kpd0("beauty_thin_face", 0.375d);
        this.f39542o = true;
        this.f39543p = true;
        this.f39544q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m61416f(View view) {
        jv2.m143395a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m61417g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final void m61418h(boolean z) {
        this.f39532e.setEnabled(z);
    }

    /* JADX INFO: renamed from: i */
    public final void m61419i() {
        this.f39529b.setSelected(false);
        this.f39530c.setSelected(false);
        this.f39531d.setSelected(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m61420j() {
        this.f39538k = this.f39535h.get().floatValue();
        this.f39539l = this.f39536i.get().floatValue();
        this.f39540m = this.f39537j.get().floatValue();
        this.f39529b.setText(m61417g().getString(R$string.f39184z0));
        this.f39529b.setOnClickListener(this);
        this.f39529b.setSelected(true);
        this.f39534g = 1;
        this.f39530c.setText(m61417g().getString(R$string.f39136r0));
        this.f39530c.setOnClickListener(this);
        this.f39531d.setText(m61417g().getString(R$string.f39142s0));
        this.f39531d.setOnClickListener(this);
        this.f39532e.setMax(100);
        this.f39532e.setProgress((int) (this.f39538k * 100.0f));
        if (NullChecker.m81303a(this.f39533f)) {
            this.f39533f.mo192543n(this.f39540m, this.f39534g);
            this.f39533f.mo192543n(this.f39538k, this.f39534g);
            this.f39533f.mo192543n(this.f39539l, this.f39534g);
        }
        this.f39532e.setOnSeekBarChangeListener(new C11164a());
        this.f39528a.setOnClickListener(new View.OnClickListener() { // from class: l.iv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115082a.m61421k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m61421k(View view) {
        this.f39535h.put(Double.valueOf(this.f39538k));
        this.f39536i.put(Double.valueOf(this.f39539l));
        this.f39537j.put(Double.valueOf(this.f39540m));
        if (NullChecker.m81303a(this.f39541n)) {
            this.f39541n.call();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m61419i();
        view.setSelected(true);
        if (this.f39529b == view) {
            this.f39534g = 1;
            this.f39532e.setProgress((int) (this.f39538k * 100.0f));
            m61418h(this.f39542o);
        } else if (this.f39530c == view) {
            this.f39534g = 2;
            this.f39532e.setProgress((int) (this.f39539l * 100.0f));
            m61418h(this.f39543p);
        } else if (this.f39531d == view) {
            this.f39534g = 3;
            this.f39532e.setProgress((int) (this.f39540m * 100.0f));
            m61418h(this.f39544q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61416f(this);
        m61420j();
    }

    public void setBeautyBigEye(boolean z) {
        this.f39543p = z;
        if (this.f39534g == 2) {
            m61418h(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f39544q = z;
        if (this.f39534g == 3) {
            m61418h(z);
        }
    }

    public void setFilterListener(zji zjiVar) {
        this.f39533f = zjiVar;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f39541n = d30Var;
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuView(Context context) {
        this(context, null);
    }
}
