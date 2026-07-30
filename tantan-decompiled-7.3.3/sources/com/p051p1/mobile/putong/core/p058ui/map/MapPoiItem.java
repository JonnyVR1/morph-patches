package com.p051p1.mobile.putong.core.p058ui.map;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p051p1.mobile.android.app.Act;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bf3;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cxw;
import p153l.q8g0;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class MapPoiItem extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public LinearLayout f31215c;

    /* JADX INFO: renamed from: d */
    public VText f31216d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f31217e;

    /* JADX INFO: renamed from: f */
    public VText f31218f;

    /* JADX INFO: renamed from: g */
    public VText f31219g;

    /* JADX INFO: renamed from: h */
    public VImage f31220h;

    /* JADX INFO: renamed from: i */
    public VText f31221i;

    /* JADX INFO: renamed from: j */
    public int f31222j;

    /* JADX INFO: renamed from: k */
    public int f31223k;

    public MapPoiItem(Context context) {
        super(context);
        this.f31222j = -1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m48556Q(View view) {
        cxw.m113072a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m48557R(PoiInfo poiInfo, int i, int i2, boolean z) {
        String str;
        this.f31223k = i2;
        this.f31216d.setText(poiInfo.name);
        if (i2 == -1) {
            VText vText = this.f31219g;
            if (poiInfo.address == null) {
                str = "(" + poiInfo.location.latitude + ", " + poiInfo.location.longitude + ")";
            } else {
                str = poiInfo.address;
            }
            vText.setText(str);
            this.f31216d.setTextColor(act().getResources().getColor(c9c0.f80471x1));
            this.f31218f.setText("");
        } else {
            this.f31216d.setTextColor(-11447983);
            this.f31218f.setText(q8g0.m175811p(i, false));
            this.f31219g.setText(" - " + poiInfo.address);
        }
        this.f31220h.setVisibility(z ? 0 : 4);
        bnl0.m105524M(this.f31221i, false);
        this.f31222j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: S */
    public void m48558S(final SuggestionResult.SuggestionInfo suggestionInfo, final bf3 bf3Var, final z20<bf3, SuggestionResult.SuggestionInfo> z20Var) {
        this.f31216d.setText(suggestionInfo.key);
        bnl0.m105524M(this.f31217e, !TextUtils.isEmpty(suggestionInfo.city));
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            this.f31219g.setText(suggestionInfo.city + suggestionInfo.district);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.bxw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20Var.call(bf3Var, suggestionInfo);
            }
        });
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f31222j);
        super.draw(canvas);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48556Q(this);
        setOnClickListener(this);
    }

    public MapPoiItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31222j = -1;
    }

    public MapPoiItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31222j = -1;
    }
}
