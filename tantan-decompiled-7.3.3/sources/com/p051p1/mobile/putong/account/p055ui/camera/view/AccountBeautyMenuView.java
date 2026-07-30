package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.C19124og;
import p153l.InterfaceC19171oo;
import p153l.mxd0;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMenuView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public View f17454a;

    /* JADX INFO: renamed from: b */
    public AccountBeautyMenuItemView f17455b;

    /* JADX INFO: renamed from: c */
    public AccountBeautyMenuItemView f17456c;

    /* JADX INFO: renamed from: d */
    public AccountBeautyMenuItemView f17457d;

    /* JADX INFO: renamed from: e */
    public AccountBeautyValueTipSeekBar f17458e;

    /* JADX INFO: renamed from: f */
    public InterfaceC19171oo f17459f;

    /* JADX INFO: renamed from: g */
    public int f17460g;

    /* JADX INFO: renamed from: h */
    public mxd0 f17461h;

    /* JADX INFO: renamed from: i */
    public mxd0 f17462i;

    /* JADX INFO: renamed from: j */
    public mxd0 f17463j;

    /* JADX INFO: renamed from: k */
    public float f17464k;

    /* JADX INFO: renamed from: l */
    public float f17465l;

    /* JADX INFO: renamed from: m */
    public float f17466m;

    /* JADX INFO: renamed from: n */
    public x20 f17467n;

    /* JADX INFO: renamed from: o */
    public boolean f17468o;

    /* JADX INFO: renamed from: p */
    public boolean f17469p;

    /* JADX INFO: renamed from: q */
    public boolean f17470q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountBeautyMenuView$a */
    public class C4807a implements SeekBar.OnSeekBarChangeListener {
        public C4807a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = AccountBeautyMenuView.this.f17460g;
            if (i2 == 1) {
                AccountBeautyMenuView.this.f17464k = i / 100.0f;
            } else if (i2 == 2) {
                AccountBeautyMenuView.this.f17465l = i / 100.0f;
            } else if (i2 == 3) {
                AccountBeautyMenuView.this.f17466m = i / 100.0f;
            }
            if (NullChecker.m82486a(AccountBeautyMenuView.this.f17459f)) {
                AccountBeautyMenuView.this.f17459f.mo168426n(i / 100.0f, AccountBeautyMenuView.this.f17460g);
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
        this.f17461h = new mxd0("account_beauty_white_skin", 0.5d);
        this.f17462i = new mxd0("account_beauty_big_eye", 0.30000001192092896d);
        this.f17463j = new mxd0("account_beauty_thin_face", 0.375d);
        this.f17468o = true;
        this.f17469p = true;
        this.f17470q = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m29910f(View view) {
        C19124og.m167521a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m29911g(boolean z) {
        this.f17458e.setEnabled(z);
    }

    /* JADX INFO: renamed from: h */
    public final void m29912h() {
        this.f17455b.setSelected(false);
        this.f17456c.setSelected(false);
        this.f17457d.setSelected(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m29913i() {
        this.f17464k = this.f17461h.get().floatValue();
        this.f17465l = this.f17462i.get().floatValue();
        this.f17466m = this.f17463j.get().floatValue();
        this.f17455b.setText("美白");
        this.f17455b.setOnClickListener(this);
        this.f17455b.setSelected(true);
        this.f17460g = 1;
        this.f17456c.setText("大眼");
        this.f17456c.setOnClickListener(this);
        this.f17457d.setText("瘦脸");
        this.f17457d.setOnClickListener(this);
        this.f17458e.setMax(100);
        this.f17458e.setProgress((int) (this.f17464k * 100.0f));
        if (NullChecker.m82486a(this.f17459f)) {
            this.f17459f.mo168426n(this.f17466m, this.f17460g);
            this.f17459f.mo168426n(this.f17464k, this.f17460g);
            this.f17459f.mo168426n(this.f17465l, this.f17460g);
        }
        this.f17458e.setOnSeekBarChangeListener(new C4807a());
        this.f17454a.setOnClickListener(new View.OnClickListener() { // from class: l.ng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141779a.m29914j(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m29914j(View view) {
        this.f17461h.put(Double.valueOf(this.f17464k));
        this.f17462i.put(Double.valueOf(this.f17465l));
        this.f17463j.put(Double.valueOf(this.f17466m));
        if (NullChecker.m82486a(this.f17467n)) {
            this.f17467n.call();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m29912h();
        view.setSelected(true);
        if (this.f17455b == view) {
            this.f17460g = 1;
            this.f17458e.setProgress((int) (this.f17464k * 100.0f));
            m29911g(this.f17468o);
        } else if (this.f17456c == view) {
            this.f17460g = 2;
            this.f17458e.setProgress((int) (this.f17465l * 100.0f));
            m29911g(this.f17469p);
        } else if (this.f17457d == view) {
            this.f17460g = 3;
            this.f17458e.setProgress((int) (this.f17466m * 100.0f));
            m29911g(this.f17470q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29910f(this);
        m29913i();
    }

    public void setBeautyBigEye(boolean z) {
        this.f17469p = z;
        if (this.f17460g == 2) {
            m29911g(z);
        }
    }

    public void setBeautyThinFace(boolean z) {
        this.f17470q = z;
        if (this.f17460g == 3) {
            m29911g(z);
        }
    }

    public void setFilterListener(InterfaceC19171oo interfaceC19171oo) {
        this.f17459f = interfaceC19171oo;
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f17467n = x20Var;
    }

    public AccountBeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuView(Context context) {
        this(context, null);
    }
}
