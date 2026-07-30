package com.p046p1.mobile.putong.core.p053ui.map;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p046p1.mobile.android.app.Act;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.duw;
import p149l.f30;
import p149l.i0g0;
import p149l.me3;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MapPoiItem extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public LinearLayout f30367c;

    /* JADX INFO: renamed from: d */
    public VText f30368d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f30369e;

    /* JADX INFO: renamed from: f */
    public VText f30370f;

    /* JADX INFO: renamed from: g */
    public VText f30371g;

    /* JADX INFO: renamed from: h */
    public VImage f30372h;

    /* JADX INFO: renamed from: i */
    public VText f30373i;

    /* JADX INFO: renamed from: j */
    public int f30374j;

    /* JADX INFO: renamed from: k */
    public int f30375k;

    public MapPoiItem(Context context) {
        super(context);
        this.f30374j = -1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m47373Q(View view) {
        duw.m113748a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m47374R(PoiInfo poiInfo, int i, int i2, boolean z) {
        String str;
        this.f30375k = i2;
        this.f30368d.setText(poiInfo.name);
        if (i2 == -1) {
            VText vText = this.f30371g;
            if (poiInfo.address == null) {
                str = "(" + poiInfo.location.latitude + ", " + poiInfo.location.longitude + ")";
            } else {
                str = poiInfo.address;
            }
            vText.setText(str);
            this.f30368d.setTextColor(act().getResources().getColor(w0c0.f183898w1));
            this.f30370f.setText("");
        } else {
            this.f30368d.setTextColor(-11447983);
            this.f30370f.setText(i0g0.m133876p(i, false));
            this.f30371g.setText(" - " + poiInfo.address);
        }
        this.f30372h.setVisibility(z ? 0 : 4);
        xdl0.m208344M(this.f30373i, false);
        this.f30374j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: S */
    public void m47375S(final SuggestionResult.SuggestionInfo suggestionInfo, final me3 me3Var, final f30<me3, SuggestionResult.SuggestionInfo> f30Var) {
        this.f30368d.setText(suggestionInfo.key);
        xdl0.m208344M(this.f30369e, !TextUtils.isEmpty(suggestionInfo.city));
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            this.f30371g.setText(suggestionInfo.city + suggestionInfo.district);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.cuw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(me3Var, suggestionInfo);
            }
        });
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f30374j);
        super.draw(canvas);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47373Q(this);
        setOnClickListener(this);
    }

    public MapPoiItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30374j = -1;
    }

    public MapPoiItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30374j = -1;
    }
}
