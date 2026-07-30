package com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import l.d30;
import l.e30;
import l.f30;
import l.vwb;
import l.xdl0;
import p002l.cpq;
import p002l.poq;
import p002l.toq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JsDialogContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f5297a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5298b;

    public JsDialogContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6634b(BLiveJsDialogConfig bLiveJsDialogConfig, d30 d30Var, View view) {
        if (bLiveJsDialogConfig.canCloseDialogTouchOutSide) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6635c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public final void m6636d(View view) {
        poq.m20518a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m6637e() {
        this.f5298b.removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6638f(f30 f30Var, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        bLiveJsDialogItemType.actionListener = f30Var;
        cpq cpqVarM23102a = toq.m23102a(getContext(), bLiveJsDialogItemType, str);
        if (cpqVarM23102a != null) {
            this.f5298b.addView(cpqVarM23102a.m11307b(), cpqVarM23102a.m11306a());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m6639g(final BLiveJsDialogConfig bLiveJsDialogConfig, final String str, final f30<String, String> f30Var, final d30 d30Var) {
        vwb.z(bLiveJsDialogConfig.types, new e30() { // from class: l.moq
            public final void call(Object obj) {
                this.f15509a.m6638f(f30Var, str, (BLiveJsDialogItemType) obj);
            }
        });
        xdl0.E0(this.f5297a, new View.OnClickListener() { // from class: l.noq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m6634b(bLiveJsDialogConfig, d30Var, view);
            }
        });
        xdl0.E0(this.f5298b, new View.OnClickListener() { // from class: l.ooq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m6635c(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6636d(this);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
