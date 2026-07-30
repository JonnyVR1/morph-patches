package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.feed.data.Interactive;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveFlowView;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p153l.i4g0;
import p153l.jyb;
import p153l.kah;
import p153l.nah;
import p153l.r4h;
import p153l.ryh;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInteractiveFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public nah f42633a;

    /* JADX INFO: renamed from: b */
    public y20<View> f42634b;

    public FeedInteractiveFlowView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m65750p(kah kahVar, View view, Interactive interactive, int i) {
        String str = interactive.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ryh.m183607b(kahVar.m148972a(), Uri.parse(str));
        i4g0.m138523u("e_topic_activity_entry", kahVar.m148978g(), jyb.m147494Y("topic_id", interactive.topic));
    }

    public nah getAdapter() {
        return this.f42633a;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FlowLayout m65751s(final kah kahVar) {
        FlowLayout flowLayout = new FlowLayout(kahVar.m148972a());
        nah nahVar = new nah(kahVar);
        this.f42633a = nahVar;
        nahVar.m162093D(this.f42634b);
        this.f42633a.m179763t(flowLayout);
        this.f42633a.m179762A(new r4h.InterfaceC19760a() { // from class: l.iah
            @Override // p153l.r4h.InterfaceC19760a
            /* JADX INFO: renamed from: a */
            public final void mo96595a(View view, Object obj, int i) {
                FeedInteractiveFlowView.m65750p(kahVar, view, (Interactive) obj, i);
            }
        });
        return flowLayout;
    }

    public void setOnViewRender(y20<View> y20Var) {
        this.f42634b = y20Var;
    }

    /* JADX INFO: renamed from: u */
    public void m65752u(kah kahVar) {
        nah nahVar = this.f42633a;
        if (nahVar == null) {
            addView(m65751s(kahVar));
        } else {
            nahVar.m162092C(kahVar.m148974c());
            this.f42633a.notifyDataSetChanged();
        }
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
