package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.R$string;
import p147v.VDraweeView;
import p149l.aw10;
import p149l.bx10;
import p149l.c6j0;
import p149l.hxs;
import p149l.j760;
import p149l.r13;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileVideoItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45990d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f45991e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f45992f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f45993g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f45994h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f45995i;

    /* JADX INFO: renamed from: j */
    public TextView f45996j;

    /* JADX INFO: renamed from: k */
    public TextView f45997k;

    public MyRoomInProfileVideoItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70547h0(View view) {
        bx10.m104258a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m70548i0(aw10 aw10Var, boolean z) {
        boolean zM99228f = aw10Var.m99228f();
        boolean zM99227e = aw10Var.m99227e();
        if (zM99228f) {
            return;
        }
        c6j0.m105481g(aw10Var, zM99228f);
        hxs.m133406s("context_square", this.f45990d, aw10Var.m99224b().getCoverUrl());
        m70549j0(Boolean.valueOf(z), aw10Var.m99225c().m60124fp().profileMiddle().formatted());
        TextView textView = this.f45996j;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f45997k.setTypeface(typeface);
        this.f45997k.setText(aw10Var.m99224b().title);
        xdl0.m208344M(this.f45991e, false);
        xdl0.m208344M(this.f45993g, false);
        if (!zM99227e) {
            xdl0.m208344M(this.f45993g, true);
            this.f45996j.setText(R$string.f44890a0);
            return;
        }
        xdl0.m208344M(this.f45991e, true);
        this.f45992f.m68500j("https://auto.tancdn.com/v1/raw/abba7f84-cd90-45f7-ae91-088c8c77a40111.pdf", -1);
        boolean zM99226d = aw10Var.m99226d();
        TextView textView2 = this.f45996j;
        if (zM99226d) {
            textView2.setText(R$string.f44876N);
        } else {
            textView2.setText(R$string.f44861B);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m70549j0(Boolean bool, String str) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                hxs.m133406s("context_square", this.f45995i, str);
            } else {
                j760<Integer, Integer> j760VarM177442g = r13.m177442g(0);
                hxs.m133403p("context_square", this.f45995i, str, j760VarM177442g.f116564a.intValue(), j760VarM177442g.f116565b.intValue());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70547h0(this);
    }

    public MyRoomInProfileVideoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileVideoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
