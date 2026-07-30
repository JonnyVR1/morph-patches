package com.p046p1.mobile.putong.core.p053ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Data;
import p149l.e30;
import p149l.juk;
import p149l.lsi0;
import p149l.mkd0;
import p149l.xdl0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchasePromotionItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f34321d;

    /* JADX INFO: renamed from: e */
    public TextView f34322e;

    /* JADX INFO: renamed from: f */
    public View f34323f;

    public PurchasePromotionItemView(@NonNull Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m53069l0(Throwable th) {
        act().progressDismiss();
        lsi0.m151595y("添加失败");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m53070k0(Data data) {
        act().progressDismiss();
        lsi0.m151595y("添加成功");
        CoreModule.f17545c.f19634c1.m137864N3();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m53071m0(C8751a.a aVar, View view) {
        if (!juk.m143323e()) {
            lsi0.m151595y("该功能仅供测试环境使用！");
        } else {
            act().progress(R$string.f27301T1);
            act().duringCreated(CoreModule.f17545c.f19634c1.m137867u3(aVar.f34329c, aVar.f34330d)).subscribe(mkd0.m154956H(new e30() { // from class: l.k8b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f121798a.m53070k0((Data) obj);
                }
            }, new e30() { // from class: l.l8b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f126801a.m53069l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m53072n0(final C8751a.a aVar) {
        this.f34321d.setText(aVar.f34330d);
        boolean z = aVar.f34331e;
        TextView textView = this.f34321d;
        if (z) {
            textView.getPaint().setFlags(16);
        } else {
            this.f34321d.getPaint().setFlags(textView.getPaintFlags() & (-17));
        }
        this.f34321d.getPaint().setAntiAlias(true);
        xdl0.m208329E0(this.f34322e, new View.OnClickListener() { // from class: l.j8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116698a.m53071m0(aVar, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34322e = (TextView) findViewById(z4c0.f201510a);
        this.f34321d = (TextView) findViewById(z4c0.f201565t0);
        this.f34323f = findViewById(z4c0.f201482M);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
