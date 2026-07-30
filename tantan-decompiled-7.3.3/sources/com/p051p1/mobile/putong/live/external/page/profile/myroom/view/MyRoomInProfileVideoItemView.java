package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.R$string;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.g23;
import p153l.gfj0;
import p153l.i420;
import p153l.izs;
import p153l.j520;
import p153l.pf60;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileVideoItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46838d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f46839e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f46840f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f46841g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46842h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f46843i;

    /* JADX INFO: renamed from: j */
    public TextView f46844j;

    /* JADX INFO: renamed from: k */
    public TextView f46845k;

    public MyRoomInProfileVideoItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71730h0(View view) {
        j520.m143498a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m71731i0(i420 i420Var, boolean z) {
        boolean zM138391f = i420Var.m138391f();
        boolean zM138390e = i420Var.m138390e();
        if (zM138391f) {
            return;
        }
        gfj0.m130079g(i420Var, zM138391f);
        izs.m142868s("context_square", this.f46838d, i420Var.m138387b().getCoverUrl());
        m71732j0(Boolean.valueOf(z), i420Var.m138388c().m61308fp().profileMiddle().formatted());
        TextView textView = this.f46844j;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f46845k.setTypeface(typeface);
        this.f46845k.setText(i420Var.m138387b().title);
        bnl0.m105524M(this.f46839e, false);
        bnl0.m105524M(this.f46841g, false);
        if (!zM138390e) {
            bnl0.m105524M(this.f46841g, true);
            this.f46844j.setText(R$string.f45738a0);
            return;
        }
        bnl0.m105524M(this.f46839e, true);
        this.f46840f.m69683j("https://auto.tancdn.com/v1/raw/abba7f84-cd90-45f7-ae91-088c8c77a40111.pdf", -1);
        boolean zM138389d = i420Var.m138389d();
        TextView textView2 = this.f46844j;
        if (zM138389d) {
            textView2.setText(R$string.f45724N);
        } else {
            textView2.setText(R$string.f45709B);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m71732j0(Boolean bool, String str) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                izs.m142868s("context_square", this.f46843i, str);
            } else {
                pf60<Integer, Integer> pf60VarM128590g = g23.m128590g(0);
                izs.m142865p("context_square", this.f46843i, str, pf60VarM128590g.f152156a.intValue(), pf60VarM128590g.f152157b.intValue());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71730h0(this);
    }

    public MyRoomInProfileVideoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileVideoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
