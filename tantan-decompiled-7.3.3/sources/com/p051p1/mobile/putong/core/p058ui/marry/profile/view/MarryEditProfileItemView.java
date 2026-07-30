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
import p153l.kbc0;
import p153l.lyh0;
import p153l.oyl;
import p153l.rhc0;
import p153l.sec0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemView extends ConstraintLayout implements oyl {

    /* JADX INFO: renamed from: d */
    public VText f31307d;

    /* JADX INFO: renamed from: e */
    public VImage f31308e;

    /* JADX INFO: renamed from: f */
    public VText f31309f;

    /* JADX INFO: renamed from: g */
    public VImage f31310g;

    /* JADX INFO: renamed from: h */
    public boolean f31311h;

    /* JADX INFO: renamed from: i */
    public MarrySeriesType f31312i;

    /* JADX INFO: renamed from: j */
    public boolean f31313j;

    public MarryEditProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31313j = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163150v);
        String string = typedArrayObtainStyledAttributes.getString(rhc0.f163151w);
        this.f31311h = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163152x, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(sec0.f167537T, (ViewGroup) this, true);
        this.f31307d = (VText) findViewById(gdc0.f103644C);
        this.f31308e = (VImage) findViewById(gdc0.f103652K);
        this.f31309f = (VText) findViewById(gdc0.f103654M);
        this.f31310g = (VImage) findViewById(gdc0.f103653L);
        this.f31307d.setText(string);
        this.f31307d.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d0 */
    public boolean mo48725d0() {
        return this.f31313j;
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: f */
    public boolean mo48709f() {
        if (this.f31312i == MarrySeriesType.BIND_PHONE) {
            return false;
        }
        return super.mo48709f();
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31312i;
    }

    /* JADX INFO: renamed from: h0 */
    public oyl m48734h0(MarrySeriesType marrySeriesType) {
        this.f31312i = marrySeriesType;
        return this;
    }

    @Override // p153l.oyl
    public void setContent(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f31310g;
        if (zIsEmpty) {
            vImage.setImageResource(kbc0.f124915u1);
            bnl0.m105524M(this.f31308e, this.f31312i.isRequired());
            bnl0.m105524M(this.f31309f, false);
            this.f31313j = !this.f31312i.isRequired();
            return;
        }
        vImage.setImageResource(kbc0.f124769A0);
        bnl0.m105524M(this.f31308e, this.f31312i.isRequired());
        bnl0.m105524M(this.f31310g, this.f31311h);
        bnl0.m105524M(this.f31309f, true);
        this.f31309f.setText(str);
        this.f31313j = true;
    }

    public void setContent(List<String> list) {
        if (jyb.m147479J(list)) {
            this.f31310g.setImageResource(kbc0.f124915u1);
            bnl0.m105524M(this.f31308e, this.f31312i.isRequired());
            bnl0.m105524M(this.f31309f, false);
            this.f31313j = false;
            return;
        }
        setContent(list.get(0));
        this.f31313j = true;
    }

    public MarryEditProfileItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemView(Context context) {
        this(context, null);
    }
}
