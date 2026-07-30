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
import p149l.e3c0;
import p149l.eqh0;
import p149l.k9c0;
import p149l.n6c0;
import p149l.vwb;
import p149l.wvl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f30459d;

    /* JADX INFO: renamed from: e */
    public VImage f30460e;

    /* JADX INFO: renamed from: f */
    public VText f30461f;

    /* JADX INFO: renamed from: g */
    public VImage f30462g;

    /* JADX INFO: renamed from: h */
    public boolean f30463h;

    /* JADX INFO: renamed from: i */
    public MarrySeriesType f30464i;

    /* JADX INFO: renamed from: j */
    public boolean f30465j;

    public MarryEditProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30465j = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121989v);
        String string = typedArrayObtainStyledAttributes.getString(k9c0.f121990w);
        this.f30463h = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121991x, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.f137323T, (ViewGroup) this, true);
        this.f30459d = (VText) findViewById(a5c0.f67649C);
        this.f30460e = (VImage) findViewById(a5c0.f67657K);
        this.f30461f = (VText) findViewById(a5c0.f67659M);
        this.f30462g = (VImage) findViewById(a5c0.f67658L);
        this.f30459d.setText(string);
        this.f30459d.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo47542d0() {
        return this.f30465j;
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo47526f() {
        if (this.f30464i == MarrySeriesType.BIND_PHONE) {
            return false;
        }
        return super.mo47526f();
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30464i;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m47551h0(MarrySeriesType marrySeriesType) {
        this.f30464i = marrySeriesType;
        return this;
    }

    @Override // p149l.wvl
    public void setContent(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f30462g;
        if (zIsEmpty) {
            vImage.setImageResource(e3c0.f89152u1);
            xdl0.m208344M(this.f30460e, this.f30464i.isRequired());
            xdl0.m208344M(this.f30461f, false);
            this.f30465j = !this.f30464i.isRequired();
            return;
        }
        vImage.setImageResource(e3c0.f89006A0);
        xdl0.m208344M(this.f30460e, this.f30464i.isRequired());
        xdl0.m208344M(this.f30462g, this.f30463h);
        xdl0.m208344M(this.f30461f, true);
        this.f30461f.setText(str);
        this.f30465j = true;
    }

    public void setContent(List<String> list) {
        if (vwb.m200296J(list)) {
            this.f30462g.setImageResource(e3c0.f89152u1);
            xdl0.m208344M(this.f30460e, this.f30464i.isRequired());
            xdl0.m208344M(this.f30461f, false);
            this.f30465j = false;
            return;
        }
        setContent(list.get(0));
        this.f30465j = true;
    }

    public MarryEditProfileItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemView(Context context) {
        this(context, null);
    }
}
