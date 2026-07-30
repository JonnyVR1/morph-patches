package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.Interactive;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveFlowView;
import l.e30;
import l.j760;
import l.vwb;
import l.zvf0;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p007l.c3h;
import p007l.cxh;
import p007l.v8h;
import p007l.y8h;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInteractiveFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public y8h f3246a;

    /* JADX INFO: renamed from: b */
    public e30<View> f3247b;

    public FeedInteractiveFlowView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5661p(v8h v8hVar, View view, Interactive interactive, int i) {
        String str = interactive.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m9252b(v8hVar.m15345a(), Uri.parse(str));
        zvf0.u("e_topic_activity_entry", v8hVar.m15351g(), new j760[]{vwb.Y("topic_id", interactive.topic)});
    }

    public y8h getAdapter() {
        return this.f3246a;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FlowLayout m5662s(final v8h v8hVar) {
        FlowLayout flowLayout = new FlowLayout(v8hVar.m15345a());
        y8h y8hVar = new y8h(v8hVar);
        this.f3246a = y8hVar;
        y8hVar.m16971D(this.f3247b);
        this.f3246a.m9087t(flowLayout);
        this.f3246a.m9085A(new c3h.InterfaceC2348a() { // from class: l.t8h
            @Override // p007l.c3h.InterfaceC2348a
            /* JADX INFO: renamed from: a */
            public final void mo9091a(View view, Object obj, int i) {
                FeedInteractiveFlowView.m5661p(v8hVar, view, (Interactive) obj, i);
            }
        });
        return flowLayout;
    }

    public void setOnViewRender(e30<View> e30Var) {
        this.f3247b = e30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m5663u(v8h v8hVar) {
        y8h y8hVar = this.f3246a;
        if (y8hVar == null) {
            addView(m5662s(v8hVar));
        } else {
            y8hVar.m16970C(v8hVar.m15347c());
            this.f3246a.notifyDataSetChanged();
        }
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
