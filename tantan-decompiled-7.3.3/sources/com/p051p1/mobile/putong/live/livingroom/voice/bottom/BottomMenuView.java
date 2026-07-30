package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import java.util.ArrayList;
import java.util.List;
import p153l.b7c0;
import p153l.bnl0;
import p153l.iam;
import p153l.jyb;
import p153l.qa00;
import p153l.qrm0;

/* JADX INFO: loaded from: classes5.dex */
public class BottomMenuView extends LinearLayout implements iam<b7c0> {

    /* JADX INFO: renamed from: b */
    public static final int f53747b = qa00.f156318e;

    /* JADX INFO: renamed from: a */
    public b7c0 f53748a;

    public BottomMenuView(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b7c0 b7c0Var) {
        this.f53748a = b7c0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m78929b(boolean z) {
        bnl0.m105525M0(this, z);
    }

    /* JADX INFO: renamed from: c */
    public void m78930c() {
    }

    @Override // p153l.iam
    public void destroy() {
        removeAllViews();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void setItems(List<qrm0<?>> list) {
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            qrm0<?> qrm0Var = list.get(i);
            KeyEvent.Callback callbackM177578X3 = qrm0Var.m177578X3();
            if (callbackM177578X3 instanceof RedDot) {
                ((RedDot) callbackM177578X3).mo73321g0(qrm0Var.mo103476l1());
            }
            if (qrm0Var.f159148m.alignment == 1) {
                arrayList.add(qrm0Var);
            } else {
                arrayList2.add(qrm0Var);
            }
        }
        if (!jyb.m147479J(arrayList)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                qrm0 qrm0Var2 = (qrm0) arrayList.get(i2);
                View viewM177578X3 = qrm0Var2.m177578X3();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM177578X3.getLayoutParams();
                if (i2 == 0) {
                    marginLayoutParams.leftMargin = qa00.m175859d(10.0f);
                } else {
                    marginLayoutParams.leftMargin = f53747b;
                }
                marginLayoutParams.rightMargin = f53747b;
                marginLayoutParams.bottomMargin = qrm0Var2.mo177579Y3();
                addView(viewM177578X3);
            }
            addView(new View(getContext()), new LinearLayout.LayoutParams(0, bnl0.f77544e, 1.0f));
        }
        if (jyb.m147479J(arrayList2)) {
            return;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            qrm0 qrm0Var3 = (qrm0) arrayList2.get(i3);
            View viewM177578X4 = qrm0Var3.m177578X3();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewM177578X4.getLayoutParams();
            if (i3 != 0) {
                marginLayoutParams2.leftMargin = f53747b;
            }
            marginLayoutParams2.rightMargin = f53747b;
            marginLayoutParams2.bottomMargin = qrm0Var3.mo177579Y3();
            addView(viewM177578X4);
        }
    }

    public BottomMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
