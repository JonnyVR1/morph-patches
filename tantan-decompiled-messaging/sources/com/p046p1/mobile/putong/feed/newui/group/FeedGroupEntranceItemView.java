package com.p046p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.Group;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.qib0;
import p149l.r4h;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupEntranceItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f39955a;

    /* JADX INFO: renamed from: b */
    public VFrame f39956b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f39957c;

    /* JADX INFO: renamed from: d */
    public TextView f39958d;

    /* JADX INFO: renamed from: e */
    public TextView f39959e;

    public FeedGroupEntranceItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61882p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m61882p(View view) {
        r4h.m177788a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m61883s(Group group) {
        xdl0.m208344M(this.f39959e, group.isGroupAnonymousType());
        int i = group.unReadMomentCounter;
        VDraweeView vDraweeView = this.f39955a;
        if (i > 0) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f39956b, true);
            qib0.f154691G.m102325I0(this.f39957c, group.headIcon, t100.m186890d(68.0f), t100.m186890d(68.0f));
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f39956b, false);
            qib0.f154691G.m102325I0(this.f39955a, group.headIcon, t100.m186890d(72.0f), t100.m186890d(72.0f));
        }
        String str = group.name;
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() >= 8) {
                sb.replace(0, 5, sb.substring(0, 5) + "\r\n");
            } else if (sb.length() >= 6) {
                sb.replace(0, 4, sb.substring(0, 4) + "\r\n");
            }
        }
        this.f39958d.setText(sb);
        xdl0.m208358V(this.f39959e, group.unReadMomentCounter > 0 ? t100.m186890d(19.0f) / 2 : t100.m186890d(6.0f));
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
