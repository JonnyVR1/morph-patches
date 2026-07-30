package com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import p149l.cpq;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.poq;
import p149l.toq;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f49255a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f49256b;

    public JsDialogContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m73108b(BLiveJsDialogConfig bLiveJsDialogConfig, d30 d30Var, View view) {
        if (bLiveJsDialogConfig.canCloseDialogTouchOutSide) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73109c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public final void m73110d(View view) {
        poq.m170633a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m73111e() {
        this.f49256b.removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73112f(f30 f30Var, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        bLiveJsDialogItemType.actionListener = f30Var;
        cpq cpqVarM189918a = toq.m189918a(getContext(), bLiveJsDialogItemType, str);
        if (cpqVarM189918a != null) {
            this.f49256b.addView(cpqVarM189918a.m108170b(), cpqVarM189918a.m108169a());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m73113g(final BLiveJsDialogConfig bLiveJsDialogConfig, final String str, final f30<String, String> f30Var, final d30 d30Var) {
        vwb.m200354z(bLiveJsDialogConfig.types, new e30() { // from class: l.moq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134935a.m73112f(f30Var, str, (BLiveJsDialogItemType) obj);
            }
        });
        xdl0.m208329E0(this.f49255a, new View.OnClickListener() { // from class: l.noq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m73108b(bLiveJsDialogConfig, d30Var, view);
            }
        });
        xdl0.m208329E0(this.f49256b, new View.OnClickListener() { // from class: l.ooq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsDialogContentView.m73109c(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73110d(this);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
