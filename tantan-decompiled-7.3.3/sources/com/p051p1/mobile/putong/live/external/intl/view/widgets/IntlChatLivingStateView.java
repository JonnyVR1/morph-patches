package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.g1t;
import p153l.izs;
import p153l.m4s;
import p153l.s7n;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlChatLivingStateView extends ConstraintLayout implements g1t {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f46566d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46567e;

    /* JADX INFO: renamed from: f */
    public TextView f46568f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f46569g;

    /* JADX INFO: renamed from: h */
    public TextView f46570h;

    /* JADX INFO: renamed from: i */
    public TextView f46571i;

    public IntlChatLivingStateView(Context context) {
        super(context);
        View.inflate(context, xec0.f193918w, this);
        m71425h0(this);
    }

    @Override // p153l.g1t
    /* JADX INFO: renamed from: P */
    public void mo71424P(m4s m4sVar) {
        boolean zEquals = "live".equals(m4sVar.m157057d());
        TextView textView = this.f46568f;
        if (zEquals) {
            textView.setText("Live");
            this.f46568f.setTextColor(Color.parseColor("#FF0DC1"));
        } else {
            textView.setText("Chatting");
            this.f46568f.setTextColor(Color.parseColor("#00dd8d"));
        }
        this.f46570h.setText(m71426i0(m4sVar.m157054a(), 6));
        this.f46571i.setText(m71426i0(m4sVar.m157056c(), 24));
        izs.m142868s("context_common", this.f46567e, m4sVar.m157055b());
        this.f46566d.m69683j(zEquals ? "https://auto.tancdn.com/v1/raw/c019f07a-76e8-45dc-a56c-df29985e7a3e10.pdf" : "https://auto.tancdn.com/v1/raw/376ae722-c0a1-418c-a0cc-262f9c0c903910.pdf", -1);
        this.f46569g.m69683j(zEquals ? "https://auto.tancdn.com/v1/raw/7bac3ca8-6e95-4727-a9ad-b7aba5e0cd9010.pdf" : "https://auto.tancdn.com/v1/raw/a42a3c52-5f27-445e-8582-d52703a2b0f111.pdf", -1);
    }

    @Override // p153l.g1t
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71425h0(View view) {
        s7n.m185026a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m71426i0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() <= i ? str : str.substring(0, i).concat("...");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f46566d.isAnimating()) {
            this.f46566d.m69688o();
        }
        if (this.f46569g.isAnimating()) {
            this.f46569g.m69688o();
        }
    }
}
