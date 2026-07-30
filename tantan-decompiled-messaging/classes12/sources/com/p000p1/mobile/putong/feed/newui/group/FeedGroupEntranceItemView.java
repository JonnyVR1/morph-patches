package com.p000p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.Group;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.r4h;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupEntranceItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1416a;

    /* JADX INFO: renamed from: b */
    public VFrame f1417b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1418c;

    /* JADX INFO: renamed from: d */
    public TextView f1419d;

    /* JADX INFO: renamed from: e */
    public TextView f1420e;

    public FeedGroupEntranceItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2849p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2849p(View view) {
        r4h.m13831a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m2850s(Group group) {
        xdl0.M(this.f1420e, group.isGroupAnonymousType());
        int i = group.unReadMomentCounter;
        VDraweeView vDraweeView = this.f1416a;
        if (i > 0) {
            xdl0.M(vDraweeView, false);
            xdl0.M(this.f1417b, true);
            qib0.G.I0(this.f1418c, group.headIcon, t100.d(68.0f), t100.d(68.0f));
        } else {
            xdl0.M(vDraweeView, true);
            xdl0.M(this.f1417b, false);
            qib0.G.I0(this.f1416a, group.headIcon, t100.d(72.0f), t100.d(72.0f));
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
        this.f1419d.setText(sb);
        xdl0.V(this.f1420e, group.unReadMomentCounter > 0 ? t100.d(19.0f) / 2 : t100.d(6.0f));
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
