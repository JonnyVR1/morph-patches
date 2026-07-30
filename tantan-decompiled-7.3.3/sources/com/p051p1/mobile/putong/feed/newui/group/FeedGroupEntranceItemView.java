package com.p051p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.Group;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.g6h;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupEntranceItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40803a;

    /* JADX INFO: renamed from: b */
    public VFrame f40804b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f40805c;

    /* JADX INFO: renamed from: d */
    public TextView f40806d;

    /* JADX INFO: renamed from: e */
    public TextView f40807e;

    public FeedGroupEntranceItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63065p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m63065p(View view) {
        g6h.m129250a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m63066s(Group group) {
        bnl0.m105524M(this.f40807e, group.isGroupAnonymousType());
        int i = group.unReadMomentCounter;
        VDraweeView vDraweeView = this.f40803a;
        if (i > 0) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f40804b, true);
            uqb0.f180374G.m127109I0(this.f40805c, group.headIcon, qa00.m175859d(68.0f), qa00.m175859d(68.0f));
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f40804b, false);
            uqb0.f180374G.m127109I0(this.f40803a, group.headIcon, qa00.m175859d(72.0f), qa00.m175859d(72.0f));
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
        this.f40806d.setText(sb);
        bnl0.m105538V(this.f40807e, group.unReadMomentCounter > 0 ? qa00.m175859d(19.0f) / 2 : qa00.m175859d(6.0f));
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupEntranceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
