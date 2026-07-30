package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.feed.data.Interactive;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveFlowView;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p149l.c3h;
import p149l.cxh;
import p149l.e30;
import p149l.v8h;
import p149l.vwb;
import p149l.y8h;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInteractiveFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public y8h f41785a;

    /* JADX INFO: renamed from: b */
    public e30<View> f41786b;

    public FeedInteractiveFlowView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m64567p(v8h v8hVar, View view, Interactive interactive, int i) {
        String str = interactive.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m109100b(v8hVar.m197443a(), Uri.parse(str));
        zvf0.m220399u("e_topic_activity_entry", v8hVar.m197449g(), vwb.m200311Y("topic_id", interactive.topic));
    }

    public y8h getAdapter() {
        return this.f41785a;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FlowLayout m64568s(final v8h v8hVar) {
        FlowLayout flowLayout = new FlowLayout(v8hVar.m197443a());
        y8h y8hVar = new y8h(v8hVar);
        this.f41785a = y8hVar;
        y8hVar.m213378D(this.f41786b);
        this.f41785a.m105022t(flowLayout);
        this.f41785a.m105021A(new c3h.InterfaceC16050a() { // from class: l.t8h
            @Override // p149l.c3h.InterfaceC16050a
            /* JADX INFO: renamed from: a */
            public final void mo105026a(View view, Object obj, int i) {
                FeedInteractiveFlowView.m64567p(v8hVar, view, (Interactive) obj, i);
            }
        });
        return flowLayout;
    }

    public void setOnViewRender(e30<View> e30Var) {
        this.f41786b = e30Var;
    }

    /* JADX INFO: renamed from: u */
    public void m64569u(v8h v8hVar) {
        y8h y8hVar = this.f41785a;
        if (y8hVar == null) {
            addView(m64568s(v8hVar));
        } else {
            y8hVar.m213377C(v8hVar.m197445c());
            this.f41785a.notifyDataSetChanged();
        }
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
