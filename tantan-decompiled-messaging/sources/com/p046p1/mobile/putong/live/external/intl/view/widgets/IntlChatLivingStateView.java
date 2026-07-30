package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.fzs;
import p149l.hxs;
import p149l.l2s;
import p149l.s5n;
import p149l.s6c0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlChatLivingStateView extends ConstraintLayout implements fzs {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f45718d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45719e;

    /* JADX INFO: renamed from: f */
    public TextView f45720f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f45721g;

    /* JADX INFO: renamed from: h */
    public TextView f45722h;

    /* JADX INFO: renamed from: i */
    public TextView f45723i;

    public IntlChatLivingStateView(Context context) {
        super(context);
        View.inflate(context, s6c0.f162804w, this);
        m70242h0(this);
    }

    @Override // p149l.fzs
    /* JADX INFO: renamed from: P */
    public void mo70241P(l2s l2sVar) {
        boolean zEquals = "live".equals(l2sVar.m148299d());
        TextView textView = this.f45720f;
        if (zEquals) {
            textView.setText("Live");
            this.f45720f.setTextColor(Color.parseColor("#FF0DC1"));
        } else {
            textView.setText("Chatting");
            this.f45720f.setTextColor(Color.parseColor("#00dd8d"));
        }
        this.f45722h.setText(m70243i0(l2sVar.m148296a(), 6));
        this.f45723i.setText(m70243i0(l2sVar.m148298c(), 24));
        hxs.m133406s("context_common", this.f45719e, l2sVar.m148297b());
        this.f45718d.m68500j(zEquals ? "https://auto.tancdn.com/v1/raw/c019f07a-76e8-45dc-a56c-df29985e7a3e10.pdf" : "https://auto.tancdn.com/v1/raw/376ae722-c0a1-418c-a0cc-262f9c0c903910.pdf", -1);
        this.f45721g.m68500j(zEquals ? "https://auto.tancdn.com/v1/raw/7bac3ca8-6e95-4727-a9ad-b7aba5e0cd9010.pdf" : "https://auto.tancdn.com/v1/raw/a42a3c52-5f27-445e-8582-d52703a2b0f111.pdf", -1);
    }

    @Override // p149l.fzs
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70242h0(View view) {
        s5n.m182366a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m70243i0(String str, int i) {
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
        if (this.f45718d.isAnimating()) {
            this.f45718d.m68505o();
        }
        if (this.f45721g.isAnimating()) {
            this.f45721g.m68505o();
        }
    }
}
