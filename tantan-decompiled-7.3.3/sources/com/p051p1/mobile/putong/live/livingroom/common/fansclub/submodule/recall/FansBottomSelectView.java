package com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.acg;
import p153l.bnl0;
import p153l.h6g;
import p153l.kig;
import p153l.o1j0;
import p153l.ohg;

/* JADX INFO: loaded from: classes4.dex */
public class FansBottomSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f49850c;

    /* JADX INFO: renamed from: d */
    public VText f49851d;

    /* JADX INFO: renamed from: e */
    public VText f49852e;

    /* JADX INFO: renamed from: f */
    public VText f49853f;

    public FansBottomSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m74028R(ohg ohgVar, acg acgVar, View view) {
        if (ohgVar == null || acgVar == null) {
            return;
        }
        if (TextUtils.isEmpty(ohgVar.m167698h0()) || TextUtils.equals(ohgVar.m167698h0(), WeJson.EMPTY_ARR)) {
            o1j0.m165649w(R$string.f48405u4);
        } else {
            acgVar.m213811F2().FansRecallEvent.showEditDialog().mo199273j(new kig(true, ohgVar.m167698h0()));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m74030T(View view) {
        h6g.m133700a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m74031V(ohg ohgVar, View view) {
        VImage vImage = this.f49850c;
        vImage.setSelected(!vImage.isSelected());
        ohgVar.m167697g0(this.f49850c.isSelected());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m74032W(ohg ohgVar, View view) {
        VImage vImage = this.f49850c;
        vImage.setSelected(!vImage.isSelected());
        ohgVar.m167697g0(this.f49850c.isSelected());
    }

    /* JADX INFO: renamed from: X */
    public void m74033X(final ohg ohgVar, final acg acgVar) {
        setVisibility(0);
        this.f49850c.setSelected(true);
        ohgVar.m167699i0(this.f49850c);
        bnl0.m105509E0(this.f49850c, new View.OnClickListener() { // from class: l.d6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85322a.m74031V(ohgVar, view);
            }
        });
        bnl0.m105509E0(this.f49851d, new View.OnClickListener() { // from class: l.e6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92274a.m74032W(ohgVar, view);
            }
        });
        bnl0.m105509E0(this.f49853f, new View.OnClickListener() { // from class: l.f6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acgVar.m213811F2().FansRecallEvent.hideFansRecallSelectPanel().mo199273j(Boolean.TRUE);
            }
        });
        bnl0.m105509E0(this.f49852e, new View.OnClickListener() { // from class: l.g6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansBottomSelectView.m74028R(ohgVar, acgVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74030T(this);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
