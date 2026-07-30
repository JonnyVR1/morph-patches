package com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import p153l.bnl0;
import p153l.crq;
import p153l.jyb;
import p153l.pqq;
import p153l.tqq;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f50103a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f50104b;

    public JsDialogContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m74291b(BLiveJsDialogConfig bLiveJsDialogConfig, x20 x20Var, View view) {
        if (bLiveJsDialogConfig.canCloseDialogTouchOutSide) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m74292c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public final void m74293d(View view) {
        pqq.m173380a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m74294e() {
        this.f50104b.removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74295f(z20 z20Var, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        bLiveJsDialogItemType.actionListener = z20Var;
        crq crqVarM192350a = tqq.m192350a(getContext(), bLiveJsDialogItemType, str);
        if (crqVarM192350a != null) {
            this.f50104b.addView(crqVarM192350a.m112085b(), crqVarM192350a.m112084a());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m74296g(final BLiveJsDialogConfig bLiveJsDialogConfig, final String str, final z20<String, String> z20Var, final x20 x20Var) {
        jyb.m147537z(bLiveJsDialogConfig.types, new y20() { // from class: l.mqq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138124a.m74295f(z20Var, str, (BLiveJsDialogItemType) obj);
            }
        });
        bnl0.m105509E0(this.f50103a, new View.OnClickListener() { // from class: l.nqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m74291b(bLiveJsDialogConfig, x20Var, view);
            }
        });
        bnl0.m105509E0(this.f50104b, new View.OnClickListener() { // from class: l.oqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m74292c(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74293d(this);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
