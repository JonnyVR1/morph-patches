package com.p000p1.mobile.putong.core.p001ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import java.util.List;
import l.a5c0;
import l.e3c0;
import l.k9c0;
import l.n6c0;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p003l.wvl;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f350d;

    /* JADX INFO: renamed from: e */
    public VImage f351e;

    /* JADX INFO: renamed from: f */
    public VText f352f;

    /* JADX INFO: renamed from: g */
    public VImage f353g;

    /* JADX INFO: renamed from: h */
    public boolean f354h;

    /* JADX INFO: renamed from: i */
    public MarrySeriesType f355i;

    /* JADX INFO: renamed from: j */
    public boolean f356j;

    /* JADX WARN: Multi-variable type inference failed */
    public MarryEditProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f356j = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.v);
        CharSequence string = typedArrayObtainStyledAttributes.getString(k9c0.w);
        this.f354h = typedArrayObtainStyledAttributes.getBoolean(k9c0.x, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.T, (ViewGroup) this, true);
        this.f350d = (VText) findViewById(a5c0.C);
        this.f351e = (VImage) findViewById(a5c0.K);
        this.f352f = (VText) findViewById(a5c0.M);
        this.f353g = (VImage) findViewById(a5c0.L);
        this.f350d.setText(string);
        this.f350d.setTypeface(eqh0.m3924c(3), 1);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo594d0() {
        return this.f356j;
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo576f() {
        if (this.f355i == MarrySeriesType.BIND_PHONE) {
            return false;
        }
        return super.mo576f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f355i;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m603h0(MarrySeriesType marrySeriesType) {
        this.f355i = marrySeriesType;
        return this;
    }

    @Override // p003l.wvl
    public void setContent(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f353g;
        if (zIsEmpty) {
            vImage.setImageResource(e3c0.u1);
            xdl0.M(this.f351e, this.f355i.isRequired());
            xdl0.M(this.f352f, false);
            this.f356j = !this.f355i.isRequired();
            return;
        }
        vImage.setImageResource(e3c0.A0);
        xdl0.M(this.f351e, this.f355i.isRequired());
        xdl0.M(this.f353g, this.f354h);
        xdl0.M(this.f352f, true);
        this.f352f.setText(str);
        this.f356j = true;
    }

    public void setContent(List<String> list) {
        if (vwb.J(list)) {
            this.f353g.setImageResource(e3c0.u1);
            xdl0.M(this.f351e, this.f355i.isRequired());
            xdl0.M(this.f352f, false);
            this.f356j = false;
            return;
        }
        setContent(list.get(0));
        this.f356j = true;
    }

    public MarryEditProfileItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemView(Context context) {
        this(context, null);
    }
}
