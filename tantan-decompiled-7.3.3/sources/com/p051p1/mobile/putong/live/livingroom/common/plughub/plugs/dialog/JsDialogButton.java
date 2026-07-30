package com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import java.util.List;
import p153l.bnl0;
import p153l.fc2;
import p153l.jyb;
import p153l.kqq;
import p153l.qa00;
import p153l.sqq;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogButton extends CardView implements sqq {

    /* JADX INFO: renamed from: a */
    public TextView f50102a;

    public JsDialogButton(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m74284e(View view) {
        kqq.m150924a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public View m74285f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kqq.m150925b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.sqq
    /* JADX INFO: renamed from: g */
    public void mo74286g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m187556c(this.f50102a, str, bLiveJsDialogItemType);
        List<String> list = bLiveJsDialogItemType.btnBgColors;
        if (!jyb.m147479J(list) && list.size() == 2) {
            setBackground(fc2.m124981k(ynp0.m216917B(list.get(0)), ynp0.m216917B(list.get(1)), 6, GradientDrawable.Orientation.LEFT_RIGHT));
        }
        int iM175859d = qa00.m175859d(12.0f);
        layoutParams.leftMargin = iM175859d;
        layoutParams.rightMargin = iM175859d;
        this.f50102a.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        setCardElevation(qa00.m175859d(bLiveJsDialogItemType.withShadow ? 6.0f : 0.0f));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.jqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BLiveJsDialogItemType bLiveJsDialogItemType2 = bLiveJsDialogItemType;
                bLiveJsDialogItemType2.actionListener.call(bLiveJsDialogItemType2.callback, "");
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74284e(this);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
