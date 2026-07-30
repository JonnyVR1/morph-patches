package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bbc0;
import p153l.bnl0;
import p153l.gsj0;
import p153l.qa00;
import p153l.rlj;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class GenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f17119c;

    /* JADX INFO: renamed from: d */
    public VImage f17120d;

    /* JADX INFO: renamed from: e */
    public VText f17121e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f17122f;

    /* JADX INFO: renamed from: g */
    public VImage f17123g;

    /* JADX INFO: renamed from: h */
    public VText f17124h;

    /* JADX INFO: renamed from: i */
    public y20<Gender> f17125i;

    public GenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: renamed from: T */
    private void m29460T(Gender gender) {
        if (gender == null) {
            this.f17119c.setBackground(null);
            this.f17122f.setBackground(null);
        }
        if (TEnum.equals(gender, "female")) {
            this.f17119c.setBackgroundResource(bbc0.f75791C1);
            this.f17122f.setBackground(null);
        }
        if (TEnum.equals(gender, "male")) {
            this.f17122f.setBackgroundResource(bbc0.f75791C1);
            this.f17119c.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m29461V(View view) {
        m29460T(Gender.get("male"));
        if (NullChecker.m82486a(this.f17125i)) {
            this.f17125i.call(Gender.get("male"));
        }
        this.f17119c.setClickable(false);
        this.f17122f.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m29462W(View view) {
        m29460T(Gender.get("female"));
        if (NullChecker.m82486a(this.f17125i)) {
            this.f17125i.call(Gender.get("female"));
        }
        this.f17119c.setClickable(false);
        this.f17122f.setClickable(false);
    }

    private void init() {
        setOrientation(0);
        int i = qa00.f156330q;
        setPadding(i, 0, i, qa00.m175859d(120.0f));
        m29463R(LayoutInflater.from(getContext()), this);
        bnl0.m105509E0(this.f17122f, new View.OnClickListener() { // from class: l.plj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153037a.m29461V(view);
            }
        });
        bnl0.m105509E0(this.f17119c, new View.OnClickListener() { // from class: l.qlj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158234a.m29462W(view);
            }
        });
        this.f17119c.setClickable(false);
        this.f17122f.setClickable(false);
        m29460T(null);
        if (gsj0.m132062f()) {
            int i2 = qa00.f156338y;
            setPadding(i2, 0, i2, qa00.f156293F);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m29463R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rlj.m181995b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m29464S() {
        this.f17119c.setClickable(true);
        this.f17122f.setClickable(true);
    }

    public void setGenderSaveListener(y20<Gender> y20Var) {
        this.f17125i = y20Var;
    }

    public GenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GenderView(Context context) {
        this(context, null);
    }
}
