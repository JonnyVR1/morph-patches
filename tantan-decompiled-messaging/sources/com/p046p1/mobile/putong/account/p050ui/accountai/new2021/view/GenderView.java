package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.djj0;
import p149l.e30;
import p149l.t100;
import p149l.v2c0;
import p149l.xdl0;
import p149l.yij;

/* JADX INFO: loaded from: classes9.dex */
public class GenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f16400c;

    /* JADX INFO: renamed from: d */
    public VImage f16401d;

    /* JADX INFO: renamed from: e */
    public VText f16402e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f16403f;

    /* JADX INFO: renamed from: g */
    public VImage f16404g;

    /* JADX INFO: renamed from: h */
    public VText f16405h;

    /* JADX INFO: renamed from: i */
    public e30<Gender> f16406i;

    public GenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: renamed from: T */
    private void m28461T(Gender gender) {
        if (gender == null) {
            this.f16400c.setBackground(null);
            this.f16403f.setBackground(null);
        }
        if (TEnum.equals(gender, "female")) {
            this.f16400c.setBackgroundResource(v2c0.f179385C1);
            this.f16403f.setBackground(null);
        }
        if (TEnum.equals(gender, "male")) {
            this.f16403f.setBackgroundResource(v2c0.f179385C1);
            this.f16400c.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m28462V(View view) {
        m28461T(Gender.get("male"));
        if (NullChecker.m81303a(this.f16406i)) {
            this.f16406i.call(Gender.get("male"));
        }
        this.f16400c.setClickable(false);
        this.f16403f.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m28463W(View view) {
        m28461T(Gender.get("female"));
        if (NullChecker.m81303a(this.f16406i)) {
            this.f16406i.call(Gender.get("female"));
        }
        this.f16400c.setClickable(false);
        this.f16403f.setClickable(false);
    }

    private void init() {
        setOrientation(0);
        int i = t100.f167268q;
        setPadding(i, 0, i, t100.m186890d(120.0f));
        m28464R(LayoutInflater.from(getContext()), this);
        xdl0.m208329E0(this.f16403f, new View.OnClickListener() { // from class: l.wij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186546a.m28462V(view);
            }
        });
        xdl0.m208329E0(this.f16400c, new View.OnClickListener() { // from class: l.xij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193126a.m28463W(view);
            }
        });
        this.f16400c.setClickable(false);
        this.f16403f.setClickable(false);
        m28461T(null);
        if (djj0.m112085f()) {
            int i2 = t100.f167276y;
            setPadding(i2, 0, i2, t100.f167231F);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m28464R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yij.m214922b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m28465S() {
        this.f16400c.setClickable(true);
        this.f16403f.setClickable(true);
    }

    public void setGenderSaveListener(e30<Gender> e30Var) {
        this.f16406i = e30Var;
    }

    public GenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GenderView(Context context) {
        this(context, null);
    }
}
