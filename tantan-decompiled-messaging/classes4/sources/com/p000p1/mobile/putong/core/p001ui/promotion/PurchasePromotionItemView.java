package com.p000p1.mobile.putong.core.p001ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Data;
import l.e30;
import l.juk;
import l.lsi0;
import l.mkd0;
import l.xdl0;
import l.z4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PurchasePromotionItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f2143d;

    /* JADX INFO: renamed from: e */
    public TextView f2144e;

    /* JADX INFO: renamed from: f */
    public View f2145f;

    public PurchasePromotionItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m3629l0(Throwable th) {
        act().progressDismiss();
        lsi0.y("添加失败");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m3630k0(Data data) {
        act().progressDismiss();
        lsi0.y("添加成功");
        CoreModule.c.c1.N3();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m3631m0(C0176a.a aVar, View view) {
        if (!juk.e()) {
            lsi0.y("该功能仅供测试环境使用！");
        } else {
            act().progress(R.string.T1);
            act().duringCreated(CoreModule.c.c1.u3(aVar.f2151c, aVar.f2152d)).subscribe(mkd0.H(new e30() { // from class: l.k8b0
                public final void call(Object obj) {
                    this.f14245a.m3630k0((Data) obj);
                }
            }, new e30() { // from class: l.l8b0
                public final void call(Object obj) {
                    this.f14716a.m3629l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m3632n0(final C0176a.a aVar) {
        this.f2143d.setText(aVar.f2152d);
        boolean z = aVar.f2153e;
        TextView textView = this.f2143d;
        if (z) {
            textView.getPaint().setFlags(16);
        } else {
            this.f2143d.getPaint().setFlags(textView.getPaintFlags() & (-17));
        }
        this.f2143d.getPaint().setAntiAlias(true);
        xdl0.E0(this.f2144e, new View.OnClickListener() { // from class: l.j8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13637a.m3631m0(aVar, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f2144e = (TextView) findViewById(z4c0.a);
        this.f2143d = (TextView) findViewById(z4c0.t0);
        this.f2145f = findViewById(z4c0.M);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
