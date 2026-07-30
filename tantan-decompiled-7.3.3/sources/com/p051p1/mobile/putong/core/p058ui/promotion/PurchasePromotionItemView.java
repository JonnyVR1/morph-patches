package com.p051p1.mobile.putong.core.p058ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Data;
import p153l.bnl0;
import p153l.fdc0;
import p153l.o1j0;
import p153l.psd0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes4.dex */
public class PurchasePromotionItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f35169d;

    /* JADX INFO: renamed from: e */
    public TextView f35170e;

    /* JADX INFO: renamed from: f */
    public View f35171f;

    public PurchasePromotionItemView(@NonNull Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m54252l0(Throwable th) {
        act().progressDismiss();
        o1j0.m165651y("添加失败");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m54253k0(Data data) {
        act().progressDismiss();
        o1j0.m165651y("添加成功");
        CoreModule.f18264c.f20376c1.m197851N3();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m54254m0(C8914a.a aVar, View view) {
        if (!zwk.m221905e()) {
            o1j0.m165651y("该功能仅供测试环境使用！");
        } else {
            act().progress(R$string.f28149T1);
            act().duringCreated(CoreModule.f18264c.f20376c1.m197854u3(aVar.f35177c, aVar.f35178d)).subscribe(psd0.m173597H(new y20() { // from class: l.ogb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147207a.m54253k0((Data) obj);
                }
            }, new y20() { // from class: l.pgb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152253a.m54252l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m54255n0(final C8914a.a aVar) {
        this.f35169d.setText(aVar.f35178d);
        boolean z = aVar.f35179e;
        TextView textView = this.f35169d;
        if (z) {
            textView.getPaint().setFlags(16);
        } else {
            this.f35169d.getPaint().setFlags(textView.getPaintFlags() & (-17));
        }
        this.f35169d.getPaint().setAntiAlias(true);
        bnl0.m105509E0(this.f35170e, new View.OnClickListener() { // from class: l.ngb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141805a.m54254m0(aVar, view);
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
        this.f35170e = (TextView) findViewById(fdc0.f98386a);
        this.f35169d = (TextView) findViewById(fdc0.f98441t0);
        this.f35171f = findViewById(fdc0.f98358M);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
