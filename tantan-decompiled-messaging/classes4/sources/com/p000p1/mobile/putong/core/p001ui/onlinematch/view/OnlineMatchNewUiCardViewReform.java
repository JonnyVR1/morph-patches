package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import java.text.DecimalFormat;
import l.dtb0;
import l.f30;
import l.om50;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchNewUiCardViewReform extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCardViewReform f564a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f565b;

    /* JADX INFO: renamed from: c */
    public TextView f566c;

    /* JADX INFO: renamed from: d */
    public TextView f567d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f568e;

    /* JADX INFO: renamed from: f */
    public ImageView f569f;

    /* JADX INFO: renamed from: g */
    public TextView f570g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f571h;

    /* JADX INFO: renamed from: i */
    public OnlineMatchNewUiCardUserAvatarLayout f572i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f573j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f574k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f575l;

    /* JADX INFO: renamed from: m */
    public TextView f576m;

    /* JADX INFO: renamed from: n */
    public TextView f577n;

    /* JADX INFO: renamed from: o */
    public DecimalFormat f578o;

    public OnlineMatchNewUiCardViewReform(@NonNull Context context) {
        super(context);
        this.f578o = new DecimalFormat("#.0");
    }

    /* JADX INFO: renamed from: o */
    private void m778o(User user) {
        qib0.G.O(this.f575l, user.fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        qib0.G.I0(this.f573j, CoreModule.c.e0.p9().fp().profileMiddle().formatted(), t100.d(131.0f), t100.d(180.0f));
        this.f576m.setText(m781k(user));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo737f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        if ("distance".equals(quickChatCardWrapper.getFitReason())) {
            m783m(quickChatCardWrapper);
        } else if ("friendPurpose".equals(quickChatCardWrapper.getFitReason())) {
            m784n(quickChatCardWrapper);
        } else {
            m782l(quickChatCardWrapper);
        }
        m778o(quickChatCardWrapper.getUser());
        this.f577n.setText(quickChatCardWrapper.getUser().isFemale() ? "立即和她聊" : "立即和他聊");
        xdl0.E0(this.f577n, new View.OnClickListener() { // from class: l.nm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m779i(View view) {
        om50.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m780j(Location location) {
        if (location == null || location.distance <= 0) {
            return "与你相距100m";
        }
        StringBuilder sb = new StringBuilder("与你相距");
        int i = location.distance;
        if (i < 1000) {
            sb.append(i);
            sb.append("m");
            return sb.toString();
        }
        sb.append(this.f578o.format(i / 1000.0f));
        sb.append("km");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public final String m781k(User user) {
        StringBuilder sb = new StringBuilder();
        int length = user.name.length();
        String str = user.name;
        if (length < 6) {
            sb.append(str);
        } else {
            sb.append(str.substring(0, 5));
            sb.append("...");
        }
        sb.append("·");
        sb.append(user.age);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public final void m782l(QuickChatCardWrapper quickChatCardWrapper) {
        this.f568e.setBackgroundResource(x2c0.Wn);
        this.f569f.setImageResource(x2c0.Vn);
        this.f570g.setText(quickChatCardWrapper.getUser().isFemale() ? "附近的她刚发来一条消息" : "附近的他刚发来一条消息");
    }

    /* JADX INFO: renamed from: m */
    public final void m783m(QuickChatCardWrapper quickChatCardWrapper) {
        this.f568e.setBackgroundResource(x2c0.Yn);
        this.f569f.setImageResource(x2c0.Xn);
        this.f570g.setText(m780j(quickChatCardWrapper.getUser().location));
    }

    /* JADX INFO: renamed from: n */
    public final void m784n(QuickChatCardWrapper quickChatCardWrapper) {
        this.f568e.setBackgroundResource(x2c0.ao);
        this.f569f.setImageResource(x2c0.Zn);
        this.f570g.setText(dtb0.INSTANCE.a(quickChatCardWrapper.getFriendPurpose()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m779i(this);
        qib0.G.L0(this.f565b, "https://static.tancdn.com/pe-webplatform/tYf1HL7yBDpDDckT28xVYZNJ.png");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f578o = new DecimalFormat("#.0");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f578o = new DecimalFormat("#.0");
    }
}
