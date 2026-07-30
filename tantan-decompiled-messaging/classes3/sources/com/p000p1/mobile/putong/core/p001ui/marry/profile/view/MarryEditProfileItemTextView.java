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
import l.k9c0;
import l.n6c0;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p003l.wvl;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemTextView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f342d;

    /* JADX INFO: renamed from: e */
    public VText f343e;

    /* JADX INFO: renamed from: f */
    public VImage f344f;

    /* JADX INFO: renamed from: g */
    public VImage f345g;

    /* JADX INFO: renamed from: h */
    public VImage f346h;

    /* JADX INFO: renamed from: i */
    public String f347i;

    /* JADX INFO: renamed from: j */
    public MarrySeriesType f348j;

    /* JADX INFO: renamed from: k */
    public boolean f349k;

    /* JADX WARN: Multi-variable type inference failed */
    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f349k = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.t);
        CharSequence string = typedArrayObtainStyledAttributes.getString(k9c0.u);
        this.f347i = typedArrayObtainStyledAttributes.getString(k9c0.w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.W, (ViewGroup) this, true);
        this.f342d = (VText) findViewById(a5c0.Y);
        this.f343e = (VText) findViewById(a5c0.C);
        this.f344f = (VImage) findViewById(a5c0.K);
        this.f345g = (VImage) findViewById(a5c0.n);
        this.f346h = (VImage) findViewById(a5c0.L);
        this.f342d.setText(string);
        this.f343e.setText(this.f347i);
        this.f342d.setTypeface(eqh0.m3924c(3), 1);
        this.f343e.setTypeface(eqh0.m3924c(3), 1);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo594d0() {
        return this.f349k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f348j;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m602h0(MarrySeriesType marrySeriesType) {
        this.f348j = marrySeriesType;
        return this;
    }

    public void setContent(List<String> list) {
        if (vwb.J(list) || TextUtils.isEmpty(list.get(0))) {
            xdl0.M(this.f345g, false);
            xdl0.M(this.f344f, this.f348j.isRequired());
            this.f349k = !this.f348j.isRequired();
            xdl0.M(this.f346h, true);
            this.f343e.setText(this.f347i);
            return;
        }
        this.f343e.setText((String) list.get(0));
        xdl0.M(this.f345g, true);
        xdl0.M(this.f344f, false);
        xdl0.M(this.f346h, false);
        this.f349k = true;
    }

    @Override // p003l.wvl
    public void setContent(String str) {
        setContent(vwb.f0(new String[]{str}));
    }

    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemTextView(Context context) {
        this(context, null);
    }
}
