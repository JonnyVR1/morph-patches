package com.p051p1.mobile.putong.live.external.internal.vchat.card.videoChat;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardIntimacy;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import java.util.ArrayList;
import java.util.HashMap;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fc2;
import p153l.i4g0;
import p153l.izs;
import p153l.jyb;
import p153l.l9c0;
import p153l.ldc0;
import p153l.lwu;
import p153l.n3d0;
import p153l.pf60;
import p153l.qa00;
import p153l.qnp0;
import p153l.y20;
import p153l.yrs;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVideoChatStatusView f45917a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45918b;

    /* JADX INFO: renamed from: c */
    public TextView f45919c;

    /* JADX INFO: renamed from: d */
    public TextView f45920d;

    /* JADX INFO: renamed from: e */
    public TextView f45921e;

    /* JADX INFO: renamed from: f */
    public View f45922f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f45923g;

    /* JADX INFO: renamed from: h */
    public TextView f45924h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f45925i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f45926j;

    /* JADX INFO: renamed from: k */
    public TextView f45927k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f45928l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f45929m;

    public LiveVideoChatCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m70432c(lwu lwuVar, View view) {
        HashMap map = new HashMap();
        map.put("source", Square.TYPE);
        lwuVar.m156104d().setGoExtra(map);
        yrs.m217233a(getContext(), lwuVar.m156104d());
        LiveCardTracker.trackMc(lwuVar.m156112l());
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m70433d(lwu.C18478b c18478b) {
        TextView textView = new TextView(getContext());
        textView.setText(c18478b.text);
        textView.setTextColor(n3d0.m161284h(c18478b.textColor, -1));
        textView.setTextSize(1, 11.0f);
        textView.setBackgroundColor(n3d0.m161284h(c18478b.background, Color.parseColor("#666666")));
        int i = qa00.f156320g;
        qnp0.m177261d1(textView, i);
        textView.setPadding(i, qa00.f156317d, i, qa00.f156316c);
        int i2 = bnl0.f77545f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.rightMargin = qa00.f156321h;
        this.f45926j.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m70434e(final lwu lwuVar) {
        this.f45917a.setStatus(lwuVar.m156108h());
        izs.m142868s("context_square", this.f45918b, lwuVar.m156102b());
        this.f45919c.setText(lwuVar.m156111k());
        boolean zIsEmpty = TextUtils.isEmpty(lwuVar.m156109i());
        TextView textView = this.f45920d;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, true);
            this.f45920d.setText(lwuVar.m156109i());
        }
        String strM156103c = lwuVar.m156103c();
        if (TextUtils.isEmpty(strM156103c)) {
            this.f45921e.setText(lwuVar.m156107g());
            bnl0.m105524M(this.f45927k, false);
        } else {
            bnl0.m105524M(this.f45927k, true);
            this.f45921e.setText(strM156103c);
            this.f45927k.setText(lwuVar.m156107g());
            TextView textView2 = this.f45927k;
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        }
        bnl0.m105509E0(this.f45922f, new View.OnClickListener() { // from class: l.mwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139159a.m70432c(lwuVar, view);
            }
        });
        i4g0.m138492A("e_live_video_quickchat_profile_enter", "p_live_video_quickchat", pf60.m172085a(FirebaseAnalytics.Param.INDEX, lwuVar.m156112l().get(FirebaseAnalytics.Param.INDEX)), pf60.m172085a("anchorId", lwuVar.m156112l().get("anchorId")));
        m70435f(lwuVar.m156106f());
        m70437h(lwuVar.m156110j());
        m70436g(lwuVar.m156105e());
    }

    /* JADX INFO: renamed from: f */
    public final void m70435f(lwu.C18477a c18477a) {
        if (c18477a == null || TextUtils.isEmpty(c18477a.text)) {
            bnl0.m105524M(this.f45923g, false);
            return;
        }
        bnl0.m105524M(this.f45923g, true);
        boolean zIsEmpty = TextUtils.isEmpty(c18477a.icon);
        VDraweeView vDraweeView = this.f45925i;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105538V(this.f45924h, qa00.m175859d(6.0f));
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142868s("context_square", this.f45925i, c18477a.icon);
            bnl0.m105538V(this.f45924h, 0);
        }
        GradientDrawable gradientDrawableM124981k = !jyb.m147479J(c18477a.background) ? fc2.m124981k(LiveNewOptLabelView.m69935z(c18477a.background, 0), LiveNewOptLabelView.m69935z(c18477a.background, 1), 6, GradientDrawable.Orientation.TL_BR) : fc2.m124979i(n3d0.m161277a(l9c0.f130588a), 6);
        this.f45924h.setText(c18477a.text);
        this.f45923g.setBackground(gradientDrawableM124981k);
    }

    /* JADX INFO: renamed from: g */
    public final void m70436g(LiveCardIntimacy liveCardIntimacy) {
        if (liveCardIntimacy == null || TextUtils.isEmpty(liveCardIntimacy.getIcon()) || this.f45929m == null || this.f45928l == null) {
            return;
        }
        boolean zM161281e = n3d0.m161281e(liveCardIntimacy.getIcon());
        bnl0.m105524M(this.f45928l, zM161281e);
        bnl0.m105524M(this.f45929m, !zM161281e);
        if (zM161281e) {
            izs.m142868s("context_square", this.f45928l, liveCardIntimacy.getIcon());
        } else {
            this.f45929m.m69683j(liveCardIntimacy.getIcon(), -1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m70437h(ArrayList<lwu.C18478b> arrayList) {
        this.f45926j.removeAllViews();
        if (jyb.m147479J(arrayList)) {
            return;
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.nwu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144032a.m70433d((lwu.C18478b) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f45929m;
        if (animEffectPlayer != null) {
            bnl0.m105524M(animEffectPlayer, false);
            this.f45929m.m69688o();
        }
        VDraweeView vDraweeView = this.f45928l;
        if (vDraweeView != null) {
            bnl0.m105524M(vDraweeView, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45917a = (LiveVideoChatStatusView) findViewById(ldc0.f131627z1);
        this.f45918b = (VDraweeView) findViewById(ldc0.f131501S);
        this.f45919c = (TextView) findViewById(ldc0.f131500R1);
        this.f45920d = (TextView) findViewById(ldc0.f131440B1);
        this.f45921e = (TextView) findViewById(ldc0.f131625z);
        this.f45922f = findViewById(ldc0.f131574m0);
        this.f45923g = (LinearLayout) findViewById(ldc0.f131482M);
        this.f45924h = (TextView) findViewById(ldc0.f131529b);
        this.f45925i = (VDraweeView) findViewById(ldc0.f131525a);
        this.f45926j = (LinearLayout) findViewById(ldc0.f131491O1);
        this.f45927k = (TextView) findViewById(ldc0.f131530b0);
        this.f45928l = (VDraweeView) findViewById(ldc0.f131508U0);
        this.f45929m = (AnimEffectPlayer) findViewById(ldc0.f131505T0);
        qnp0.m177261d1(this, qa00.f156322i);
    }

    public LiveVideoChatCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
