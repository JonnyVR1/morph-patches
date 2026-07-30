package com.p046p1.mobile.putong.live.external.internal.vchat.card.videoChat;

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
import com.p046p1.mobile.putong.core.data.Square;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardIntimacy;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import java.util.ArrayList;
import java.util.HashMap;
import p147v.VDraweeView;
import p149l.e30;
import p149l.f1c0;
import p149l.f5c0;
import p149l.hxs;
import p149l.j760;
import p149l.kuu;
import p149l.kvc0;
import p149l.mep0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xps;
import p149l.yb2;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVideoChatStatusView f45069a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45070b;

    /* JADX INFO: renamed from: c */
    public TextView f45071c;

    /* JADX INFO: renamed from: d */
    public TextView f45072d;

    /* JADX INFO: renamed from: e */
    public TextView f45073e;

    /* JADX INFO: renamed from: f */
    public View f45074f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f45075g;

    /* JADX INFO: renamed from: h */
    public TextView f45076h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f45077i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f45078j;

    /* JADX INFO: renamed from: k */
    public TextView f45079k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f45080l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f45081m;

    public LiveVideoChatCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m69249c(kuu kuuVar, View view) {
        HashMap map = new HashMap();
        map.put("source", Square.TYPE);
        kuuVar.m147307d().setGoExtra(map);
        xps.m210534a(getContext(), kuuVar.m147307d());
        LiveCardTracker.trackMc(kuuVar.m147315l());
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m69250d(kuu.C18087b c18087b) {
        TextView textView = new TextView(getContext());
        textView.setText(c18087b.text);
        textView.setTextColor(kvc0.m147359h(c18087b.textColor, -1));
        textView.setTextSize(1, 11.0f);
        textView.setBackgroundColor(kvc0.m147359h(c18087b.background, Color.parseColor("#666666")));
        int i = t100.f167258g;
        mep0.m154302d1(textView, i);
        textView.setPadding(i, t100.f167255d, i, t100.f167254c);
        int i2 = xdl0.f192404f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.rightMargin = t100.f167259h;
        this.f45078j.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m69251e(final kuu kuuVar) {
        this.f45069a.setStatus(kuuVar.m147311h());
        hxs.m133406s("context_square", this.f45070b, kuuVar.m147305b());
        this.f45071c.setText(kuuVar.m147314k());
        boolean zIsEmpty = TextUtils.isEmpty(kuuVar.m147312i());
        TextView textView = this.f45072d;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, true);
            this.f45072d.setText(kuuVar.m147312i());
        }
        String strM147306c = kuuVar.m147306c();
        if (TextUtils.isEmpty(strM147306c)) {
            this.f45073e.setText(kuuVar.m147310g());
            xdl0.m208344M(this.f45079k, false);
        } else {
            xdl0.m208344M(this.f45079k, true);
            this.f45073e.setText(strM147306c);
            this.f45079k.setText(kuuVar.m147310g());
            TextView textView2 = this.f45079k;
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        }
        xdl0.m208329E0(this.f45074f, new View.OnClickListener() { // from class: l.luu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130092a.m69249c(kuuVar, view);
            }
        });
        zvf0.m220368A("e_live_video_quickchat_profile_enter", "p_live_video_quickchat", j760.m140076a(FirebaseAnalytics.Param.INDEX, kuuVar.m147315l().get(FirebaseAnalytics.Param.INDEX)), j760.m140076a("anchorId", kuuVar.m147315l().get("anchorId")));
        m69252f(kuuVar.m147309f());
        m69254h(kuuVar.m147313j());
        m69253g(kuuVar.m147308e());
    }

    /* JADX INFO: renamed from: f */
    public final void m69252f(kuu.C18086a c18086a) {
        if (c18086a == null || TextUtils.isEmpty(c18086a.text)) {
            xdl0.m208344M(this.f45075g, false);
            return;
        }
        xdl0.m208344M(this.f45075g, true);
        boolean zIsEmpty = TextUtils.isEmpty(c18086a.icon);
        VDraweeView vDraweeView = this.f45077i;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208358V(this.f45076h, t100.m186890d(6.0f));
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133406s("context_square", this.f45077i, c18086a.icon);
            xdl0.m208358V(this.f45076h, 0);
        }
        GradientDrawable gradientDrawableM213886k = !vwb.m200296J(c18086a.background) ? yb2.m213886k(LiveNewOptLabelView.m68752z(c18086a.background, 0), LiveNewOptLabelView.m68752z(c18086a.background, 1), 6, GradientDrawable.Orientation.TL_BR) : yb2.m213884i(kvc0.m147352a(f1c0.f94064a), 6);
        this.f45076h.setText(c18086a.text);
        this.f45075g.setBackground(gradientDrawableM213886k);
    }

    /* JADX INFO: renamed from: g */
    public final void m69253g(LiveCardIntimacy liveCardIntimacy) {
        if (liveCardIntimacy == null || TextUtils.isEmpty(liveCardIntimacy.getIcon()) || this.f45081m == null || this.f45080l == null) {
            return;
        }
        boolean zM147356e = kvc0.m147356e(liveCardIntimacy.getIcon());
        xdl0.m208344M(this.f45080l, zM147356e);
        xdl0.m208344M(this.f45081m, !zM147356e);
        if (zM147356e) {
            hxs.m133406s("context_square", this.f45080l, liveCardIntimacy.getIcon());
        } else {
            this.f45081m.m68500j(liveCardIntimacy.getIcon(), -1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m69254h(ArrayList<kuu.C18087b> arrayList) {
        this.f45078j.removeAllViews();
        if (vwb.m200296J(arrayList)) {
            return;
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.muu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135846a.m69250d((kuu.C18087b) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f45081m;
        if (animEffectPlayer != null) {
            xdl0.m208344M(animEffectPlayer, false);
            this.f45081m.m68505o();
        }
        VDraweeView vDraweeView = this.f45080l;
        if (vDraweeView != null) {
            xdl0.m208344M(vDraweeView, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45069a = (LiveVideoChatStatusView) findViewById(f5c0.f95170z1);
        this.f45070b = (VDraweeView) findViewById(f5c0.f95044S);
        this.f45071c = (TextView) findViewById(f5c0.f95043R1);
        this.f45072d = (TextView) findViewById(f5c0.f94983B1);
        this.f45073e = (TextView) findViewById(f5c0.f95168z);
        this.f45074f = findViewById(f5c0.f95117m0);
        this.f45075g = (LinearLayout) findViewById(f5c0.f95025M);
        this.f45076h = (TextView) findViewById(f5c0.f95072b);
        this.f45077i = (VDraweeView) findViewById(f5c0.f95068a);
        this.f45078j = (LinearLayout) findViewById(f5c0.f95034O1);
        this.f45079k = (TextView) findViewById(f5c0.f95073b0);
        this.f45080l = (VDraweeView) findViewById(f5c0.f95051U0);
        this.f45081m = (AnimEffectPlayer) findViewById(f5c0.f95048T0);
        mep0.m154302d1(this, t100.f167260i);
    }

    public LiveVideoChatCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
