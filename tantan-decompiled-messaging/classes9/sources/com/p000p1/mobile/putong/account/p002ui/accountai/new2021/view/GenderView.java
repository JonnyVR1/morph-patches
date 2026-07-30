package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.t100;
import l.xdl0;
import p006l.djj0;
import p006l.v2c0;
import p006l.yij;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class GenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f389c;

    /* JADX INFO: renamed from: d */
    public VImage f390d;

    /* JADX INFO: renamed from: e */
    public VText f391e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f392f;

    /* JADX INFO: renamed from: g */
    public VImage f393g;

    /* JADX INFO: renamed from: h */
    public VText f394h;

    /* JADX INFO: renamed from: i */
    public e30<Gender> f395i;

    public GenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: renamed from: T */
    private void m357T(Gender gender) {
        if (gender == null) {
            this.f389c.setBackground(null);
            this.f392f.setBackground(null);
        }
        if (TEnum.equals(gender, "female")) {
            this.f389c.setBackgroundResource(v2c0.f23949C1);
            this.f392f.setBackground(null);
        }
        if (TEnum.equals(gender, "male")) {
            this.f392f.setBackgroundResource(v2c0.f23949C1);
            this.f389c.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m358V(View view) {
        m357T(Gender.get("male"));
        if (NullChecker.a(this.f395i)) {
            this.f395i.call(Gender.get("male"));
        }
        this.f389c.setClickable(false);
        this.f392f.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m359W(View view) {
        m357T(Gender.get("female"));
        if (NullChecker.a(this.f395i)) {
            this.f395i.call(Gender.get("female"));
        }
        this.f389c.setClickable(false);
        this.f392f.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOrientation(0);
        int i = t100.q;
        setPadding(i, 0, i, t100.d(120.0f));
        m360R(LayoutInflater.from(getContext()), this);
        xdl0.E0(this.f392f, new View.OnClickListener() { // from class: l.wij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25170a.m358V(view);
            }
        });
        xdl0.E0(this.f389c, new View.OnClickListener() { // from class: l.xij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27532a.m359W(view);
            }
        });
        this.f389c.setClickable(false);
        this.f392f.setClickable(false);
        m357T(null);
        if (djj0.m14048f()) {
            int i2 = t100.y;
            setPadding(i2, 0, i2, t100.F);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m360R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yij.m28255b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m361S() {
        this.f389c.setClickable(true);
        this.f392f.setClickable(true);
    }

    public void setGenderSaveListener(e30<Gender> e30Var) {
        this.f395i = e30Var;
    }

    public GenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GenderView(Context context) {
        this(context, null);
    }
}
