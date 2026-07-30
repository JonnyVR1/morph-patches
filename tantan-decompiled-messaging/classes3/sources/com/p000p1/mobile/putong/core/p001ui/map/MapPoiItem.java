package com.p000p1.mobile.putong.core.p001ui.map;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p1.mobile.android.app.Act;
import l.duw;
import l.i0g0;
import l.w0c0;
import l.xdl0;
import p003l.f30;
import p003l.me3;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MapPoiItem extends VLinear implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public LinearLayout f258c;

    /* JADX INFO: renamed from: d */
    public VText f259d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f260e;

    /* JADX INFO: renamed from: f */
    public VText f261f;

    /* JADX INFO: renamed from: g */
    public VText f262g;

    /* JADX INFO: renamed from: h */
    public VImage f263h;

    /* JADX INFO: renamed from: i */
    public VText f264i;

    /* JADX INFO: renamed from: j */
    public int f265j;

    /* JADX INFO: renamed from: k */
    public int f266k;

    public MapPoiItem(Context context) {
        super(context);
        this.f265j = -1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m406Q(View view) {
        duw.a(this, view);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: R */
    public void m407R(PoiInfo poiInfo, int i, int i2, boolean z) {
        CharSequence charSequence;
        this.f266k = i2;
        this.f259d.setText(poiInfo.name);
        if (i2 == -1) {
            AppCompatTextView appCompatTextView = this.f262g;
            if (poiInfo.address == null) {
                charSequence = "(" + poiInfo.location.latitude + ", " + poiInfo.location.longitude + ")";
            } else {
                charSequence = poiInfo.address;
            }
            appCompatTextView.setText(charSequence);
            this.f259d.setTextColor(act().getResources().getColor(w0c0.w1));
            this.f261f.setText("");
        } else {
            this.f259d.setTextColor(-11447983);
            this.f261f.setText(i0g0.p(i, false));
            this.f262g.setText(" - " + poiInfo.address);
        }
        this.f263h.setVisibility(z ? 0 : 4);
        xdl0.M(this.f264i, false);
        this.f265j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: S */
    public void m408S(final SuggestionResult.SuggestionInfo suggestionInfo, final me3 me3Var, final f30<me3, SuggestionResult.SuggestionInfo> f30Var) {
        this.f259d.setText(suggestionInfo.key);
        xdl0.M(this.f260e, !TextUtils.isEmpty(suggestionInfo.city));
        if (!TextUtils.isEmpty(suggestionInfo.city)) {
            this.f262g.setText(suggestionInfo.city + suggestionInfo.district);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.cuw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(me3Var, suggestionInfo);
            }
        });
    }

    public Act act() {
        return getContext();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f265j);
        super.draw(canvas);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m406Q(this);
        setOnClickListener(this);
    }

    public MapPoiItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f265j = -1;
    }

    public MapPoiItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f265j = -1;
    }
}
