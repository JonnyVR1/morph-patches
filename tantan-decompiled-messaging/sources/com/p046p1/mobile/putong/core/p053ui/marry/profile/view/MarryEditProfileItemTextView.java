package com.p046p1.mobile.putong.core.p053ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a5c0;
import p149l.eqh0;
import p149l.k9c0;
import p149l.n6c0;
import p149l.vwb;
import p149l.wvl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemTextView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f30451d;

    /* JADX INFO: renamed from: e */
    public VText f30452e;

    /* JADX INFO: renamed from: f */
    public VImage f30453f;

    /* JADX INFO: renamed from: g */
    public VImage f30454g;

    /* JADX INFO: renamed from: h */
    public VImage f30455h;

    /* JADX INFO: renamed from: i */
    public String f30456i;

    /* JADX INFO: renamed from: j */
    public MarrySeriesType f30457j;

    /* JADX INFO: renamed from: k */
    public boolean f30458k;

    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30458k = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121987t);
        String string = typedArrayObtainStyledAttributes.getString(k9c0.f121988u);
        this.f30456i = typedArrayObtainStyledAttributes.getString(k9c0.f121990w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.f137329W, (ViewGroup) this, true);
        this.f30451d = (VText) findViewById(a5c0.f67671Y);
        this.f30452e = (VText) findViewById(a5c0.f67649C);
        this.f30453f = (VImage) findViewById(a5c0.f67657K);
        this.f30454g = (VImage) findViewById(a5c0.f67691n);
        this.f30455h = (VImage) findViewById(a5c0.f67658L);
        this.f30451d.setText(string);
        this.f30452e.setText(this.f30456i);
        this.f30451d.setTypeface(eqh0.m117752c(3), 1);
        this.f30452e.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo47542d0() {
        return this.f30458k;
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30457j;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m47550h0(MarrySeriesType marrySeriesType) {
        this.f30457j = marrySeriesType;
        return this;
    }

    public void setContent(List<String> list) {
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) {
            xdl0.m208344M(this.f30454g, false);
            xdl0.m208344M(this.f30453f, this.f30457j.isRequired());
            this.f30458k = !this.f30457j.isRequired();
            xdl0.m208344M(this.f30455h, true);
            this.f30452e.setText(this.f30456i);
            return;
        }
        this.f30452e.setText(list.get(0));
        xdl0.m208344M(this.f30454g, true);
        xdl0.m208344M(this.f30453f, false);
        xdl0.m208344M(this.f30455h, false);
        this.f30458k = true;
    }

    @Override // p149l.wvl
    public void setContent(String str) {
        setContent(vwb.m200324f0(str));
    }

    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemTextView(Context context) {
        this(context, null);
    }
}
