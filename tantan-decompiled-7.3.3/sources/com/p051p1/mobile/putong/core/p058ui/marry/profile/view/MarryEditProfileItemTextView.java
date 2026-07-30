package com.p051p1.mobile.putong.core.p058ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gdc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.oyl;
import p153l.rhc0;
import p153l.sec0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemTextView extends ConstraintLayout implements oyl {

    /* JADX INFO: renamed from: d */
    public VText f31299d;

    /* JADX INFO: renamed from: e */
    public VText f31300e;

    /* JADX INFO: renamed from: f */
    public VImage f31301f;

    /* JADX INFO: renamed from: g */
    public VImage f31302g;

    /* JADX INFO: renamed from: h */
    public VImage f31303h;

    /* JADX INFO: renamed from: i */
    public String f31304i;

    /* JADX INFO: renamed from: j */
    public MarrySeriesType f31305j;

    /* JADX INFO: renamed from: k */
    public boolean f31306k;

    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31306k = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163148t);
        String string = typedArrayObtainStyledAttributes.getString(rhc0.f163149u);
        this.f31304i = typedArrayObtainStyledAttributes.getString(rhc0.f163151w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(sec0.f167543W, (ViewGroup) this, true);
        this.f31299d = (VText) findViewById(gdc0.f103666Y);
        this.f31300e = (VText) findViewById(gdc0.f103644C);
        this.f31301f = (VImage) findViewById(gdc0.f103652K);
        this.f31302g = (VImage) findViewById(gdc0.f103686n);
        this.f31303h = (VImage) findViewById(gdc0.f103653L);
        this.f31299d.setText(string);
        this.f31300e.setText(this.f31304i);
        this.f31299d.setTypeface(lyh0.m156283c(3), 1);
        this.f31300e.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d0 */
    public boolean mo48725d0() {
        return this.f31306k;
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31305j;
    }

    /* JADX INFO: renamed from: h0 */
    public oyl m48733h0(MarrySeriesType marrySeriesType) {
        this.f31305j = marrySeriesType;
        return this;
    }

    public void setContent(List<String> list) {
        if (jyb.m147479J(list) || TextUtils.isEmpty(list.get(0))) {
            bnl0.m105524M(this.f31302g, false);
            bnl0.m105524M(this.f31301f, this.f31305j.isRequired());
            this.f31306k = !this.f31305j.isRequired();
            bnl0.m105524M(this.f31303h, true);
            this.f31300e.setText(this.f31304i);
            return;
        }
        this.f31300e.setText(list.get(0));
        bnl0.m105524M(this.f31302g, true);
        bnl0.m105524M(this.f31301f, false);
        bnl0.m105524M(this.f31303h, false);
        this.f31306k = true;
    }

    @Override // p153l.oyl
    public void setContent(String str) {
        setContent(jyb.m147507f0(str));
    }

    public MarryEditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemTextView(Context context) {
        this(context, null);
    }
}
