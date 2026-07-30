package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.C20166tg;
import p149l.InterfaceC20218to;
import p149l.d30;
import p149l.kpd0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f16735a;

    /* JADX INFO: renamed from: b */
    public AccountBeautyMenuItemView f16736b;

    /* JADX INFO: renamed from: c */
    public AccountBeautyMenuItemView f16737c;

    /* JADX INFO: renamed from: d */
    public AccountBeautyMenuItemView f16738d;

    /* JADX INFO: renamed from: e */
    public AccountBeautyValueTipSeekBar f16739e;

    /* JADX INFO: renamed from: f */
    public InterfaceC20218to f16740f;

    /* JADX INFO: renamed from: g */
    public int f16741g;

    /* JADX INFO: renamed from: h */
    public kpd0 f16742h;

    /* JADX INFO: renamed from: i */
    public kpd0 f16743i;

    /* JADX INFO: renamed from: j */
    public kpd0 f16744j;

    /* JADX INFO: renamed from: k */
    public float f16745k;

    /* JADX INFO: renamed from: l */
    public float f16746l;

    /* JADX INFO: renamed from: m */
    public float f16747m;

    /* JADX INFO: renamed from: n */
    public d30 f16748n;

    /* JADX INFO: renamed from: o */
    public boolean f16749o;

    /* JADX INFO: renamed from: p */
    public boolean f16750p;

    /* JADX INFO: renamed from: q */
    public boolean f16751q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountBeautyMenuView$a */
    public class C4656a implements SeekBar.OnSeekBarChangeListener {
        public C4656a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = AccountBeautyMenuView.this.f16741g;
            if (i2 == 1) {
                AccountBeautyMenuView.this.f16745k = i / 100.0f;
            } else if (i2 == 2) {
                AccountBeautyMenuView.this.f16746l = i / 100.0f;
            } else if (i2 == 3) {
                AccountBeautyMenuView.this.f16747m = i / 100.0f;
            }
            if (NullChecker.m81303a(AccountBeautyMenuView.this.f16740f)) {
                AccountBeautyMenuView.this.f16740f.mo189829n(i / 100.0f, AccountBeautyMenuView.this.f16741g);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public AccountBeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16742h = new kpd0("account_beauty_white_skin", 0.5d);
        this.f16743i = new kpd0("account_beauty_big_eye", 0.30000001192092896d);
        this.f16744j = new kpd0("account_beauty_thin_face", 0.375d);
        this.f16749o = true;
        this.f16750p = true;
        this.f16751q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m28911f(View view) {
        C20166tg.m188756a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m28912g(boolean z) {
        this.f16739e.setEnabled(z);
    }

    /* JADX INFO: renamed from: h */
    public final void m28913h() {
        this.f16736b.setSelected(false);
        this.f16737c.setSelected(false);
        this.f16738d.setSelected(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m28914i() {
        this.f16745k = this.f16742h.get().floatValue();
        this.f16746l = this.f16743i.get().floatValue();
        this.f16747m = this.f16744j.get().floatValue();
        this.f16736b.setText("美白");
        this.f16736b.setOnClickListener(this);
        this.f16736b.setSelected(true);
        this.f16741g = 1;
        this.f16737c.setText("大眼");
        this.f16737c.setOnClickListener(this);
        this.f16738d.setText("瘦脸");
        this.f16738d.setOnClickListener(this);
        this.f16739e.setMax(100);
        this.f16739e.setProgress((int) (this.f16745k * 100.0f));
        if (NullChecker.m81303a(this.f16740f)) {
            this.f16740f.mo189829n(this.f16747m, this.f16741g);
            this.f16740f.mo189829n(this.f16745k, this.f16741g);
            this.f16740f.mo189829n(this.f16746l, this.f16741g);
        }
        this.f16739e.setOnSeekBarChangeListener(new C4656a());
        this.f16735a.setOnClickListener(new View.OnClickListener() { // from class: l.sg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164352a.m28915j(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m28915j(View view) {
        this.f16742h.put(Double.valueOf(this.f16745k));
        this.f16743i.put(Double.valueOf(this.f16746l));
        this.f16744j.put(Double.valueOf(this.f16747m));
        if (NullChecker.m81303a(this.f16748n)) {
            this.f16748n.call();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m28913h();
        view.setSelected(true);
        if (this.f16736b == view) {
            this.f16741g = 1;
            this.f16739e.setProgress((int) (this.f16745k * 100.0f));
            m28912g(this.f16749o);
        } else if (this.f16737c == view) {
            this.f16741g = 2;
            this.f16739e.setProgress((int) (this.f16746l * 100.0f));
            m28912g(this.f16750p);
        } else if (this.f16738d == view) {
            this.f16741g = 3;
            this.f16739e.setProgress((int) (this.f16747m * 100.0f));
            m28912g(this.f16751q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28911f(this);
        m28914i();
    }

    public void setBeautyBigEye(boolean z) {
        this.f16750p = z;
        if (this.f16741g == 2) {
            m28912g(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f16751q = z;
        if (this.f16741g == 3) {
            m28912g(z);
        }
    }

    public void setFilterListener(InterfaceC20218to interfaceC20218to) {
        this.f16740f = interfaceC20218to;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f16748n = d30Var;
    }

    public AccountBeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuView(Context context) {
        this(context, null);
    }
}
