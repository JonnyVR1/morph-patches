package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import java.text.DecimalFormat;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dbc0;
import p153l.h1c0;
import p153l.qa00;
import p153l.uqb0;
import p153l.uu50;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardViewReform extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCardViewReform f33590a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f33591b;

    /* JADX INFO: renamed from: c */
    public TextView f33592c;

    /* JADX INFO: renamed from: d */
    public TextView f33593d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f33594e;

    /* JADX INFO: renamed from: f */
    public ImageView f33595f;

    /* JADX INFO: renamed from: g */
    public TextView f33596g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f33597h;

    /* JADX INFO: renamed from: i */
    public OnlineMatchNewUiCardUserAvatarLayout f33598i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f33599j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f33600k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f33601l;

    /* JADX INFO: renamed from: m */
    public TextView f33602m;

    /* JADX INFO: renamed from: n */
    public TextView f33603n;

    /* JADX INFO: renamed from: o */
    public DecimalFormat f33604o;

    public OnlineMatchNewUiCardViewReform(@NonNull Context context) {
        super(context);
        this.f33604o = new DecimalFormat("#.0");
    }

    /* JADX INFO: renamed from: o */
    private void m51530o(User user) {
        uqb0.f180374G.m127120O(this.f33601l, user.m61308fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        uqb0.f180374G.m127109I0(this.f33599j, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted(), qa00.m175859d(131.0f), qa00.m175859d(180.0f));
        this.f33602m.setText(m51533k(user));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(QuickChatCardWrapper quickChatCardWrapper, final z20<Boolean, String> z20Var) {
        if ("distance".equals(quickChatCardWrapper.getFitReason())) {
            m51535m(quickChatCardWrapper);
        } else if (ProfileLikeCategoryType.friendPurpose.equals(quickChatCardWrapper.getFitReason())) {
            m51536n(quickChatCardWrapper);
        } else {
            m51534l(quickChatCardWrapper);
        }
        m51530o(quickChatCardWrapper.getUser());
        this.f33603n.setText(quickChatCardWrapper.getUser().isFemale() ? "立即和她聊" : "立即和他聊");
        bnl0.m105509E0(this.f33603n, new View.OnClickListener() { // from class: l.tu50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20Var.call(Boolean.FALSE, "");
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m51531i(View view) {
        uu50.m198170a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m51532j(Location location) {
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
        sb.append(this.f33604o.format(i / 1000.0f));
        sb.append("km");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public final String m51533k(User user) {
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
    public final void m51534l(QuickChatCardWrapper quickChatCardWrapper) {
        this.f33594e.setBackgroundResource(dbc0.f86353Lo);
        this.f33595f.setImageResource(dbc0.f86321Ko);
        this.f33596g.setText(quickChatCardWrapper.getUser().isFemale() ? "附近的她刚发来一条消息" : "附近的他刚发来一条消息");
    }

    /* JADX INFO: renamed from: m */
    public final void m51535m(QuickChatCardWrapper quickChatCardWrapper) {
        this.f33594e.setBackgroundResource(dbc0.f86417No);
        this.f33595f.setImageResource(dbc0.f86385Mo);
        this.f33596g.setText(m51532j(quickChatCardWrapper.getUser().location));
    }

    /* JADX INFO: renamed from: n */
    public final void m51536n(QuickChatCardWrapper quickChatCardWrapper) {
        this.f33594e.setBackgroundResource(dbc0.f86481Po);
        this.f33595f.setImageResource(dbc0.f86449Oo);
        this.f33596g.setText(h1c0.INSTANCE.m133320a(quickChatCardWrapper.getFriendPurpose()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51531i(this);
        uqb0.f180374G.m127115L0(this.f33591b, "https://static.tancdn.com/pe-webplatform/tYf1HL7yBDpDDckT28xVYZNJ.png");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33604o = new DecimalFormat("#.0");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33604o = new DecimalFormat("#.0");
    }
}
