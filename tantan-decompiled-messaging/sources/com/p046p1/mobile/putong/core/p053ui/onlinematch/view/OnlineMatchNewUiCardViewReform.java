package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import java.text.DecimalFormat;
import p147v.VDraweeView;
import p149l.dtb0;
import p149l.f30;
import p149l.om50;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardViewReform extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCardViewReform f32742a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32743b;

    /* JADX INFO: renamed from: c */
    public TextView f32744c;

    /* JADX INFO: renamed from: d */
    public TextView f32745d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f32746e;

    /* JADX INFO: renamed from: f */
    public ImageView f32747f;

    /* JADX INFO: renamed from: g */
    public TextView f32748g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f32749h;

    /* JADX INFO: renamed from: i */
    public OnlineMatchNewUiCardUserAvatarLayout f32750i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f32751j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f32752k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f32753l;

    /* JADX INFO: renamed from: m */
    public TextView f32754m;

    /* JADX INFO: renamed from: n */
    public TextView f32755n;

    /* JADX INFO: renamed from: o */
    public DecimalFormat f32756o;

    public OnlineMatchNewUiCardViewReform(@NonNull Context context) {
        super(context);
        this.f32756o = new DecimalFormat("#.0");
    }

    /* JADX INFO: renamed from: o */
    private void m50347o(User user) {
        qib0.f154691G.m102336O(this.f32753l, user.m60124fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        qib0.f154691G.m102325I0(this.f32751j, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted(), t100.m186890d(131.0f), t100.m186890d(180.0f));
        this.f32754m.setText(m50350k(user));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        if ("distance".equals(quickChatCardWrapper.getFitReason())) {
            m50352m(quickChatCardWrapper);
        } else if (ProfileLikeCategoryType.friendPurpose.equals(quickChatCardWrapper.getFitReason())) {
            m50353n(quickChatCardWrapper);
        } else {
            m50351l(quickChatCardWrapper);
        }
        m50347o(quickChatCardWrapper.getUser());
        this.f32755n.setText(quickChatCardWrapper.getUser().isFemale() ? "立即和她聊" : "立即和他聊");
        xdl0.m208329E0(this.f32755n, new View.OnClickListener() { // from class: l.nm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m50348i(View view) {
        om50.m165008a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m50349j(Location location) {
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
        sb.append(this.f32756o.format(i / 1000.0f));
        sb.append("km");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public final String m50350k(User user) {
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
    public final void m50351l(QuickChatCardWrapper quickChatCardWrapper) {
        this.f32746e.setBackgroundResource(x2c0.f189865Wn);
        this.f32747f.setImageResource(x2c0.f189834Vn);
        this.f32748g.setText(quickChatCardWrapper.getUser().isFemale() ? "附近的她刚发来一条消息" : "附近的他刚发来一条消息");
    }

    /* JADX INFO: renamed from: m */
    public final void m50352m(QuickChatCardWrapper quickChatCardWrapper) {
        this.f32746e.setBackgroundResource(x2c0.f189927Yn);
        this.f32747f.setImageResource(x2c0.f189896Xn);
        this.f32748g.setText(m50349j(quickChatCardWrapper.getUser().location));
    }

    /* JADX INFO: renamed from: n */
    public final void m50353n(QuickChatCardWrapper quickChatCardWrapper) {
        this.f32746e.setBackgroundResource(x2c0.f189990ao);
        this.f32747f.setImageResource(x2c0.f189958Zn);
        this.f32748g.setText(dtb0.INSTANCE.m113538a(quickChatCardWrapper.getFriendPurpose()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50348i(this);
        qib0.f154691G.m102331L0(this.f32743b, "https://static.tancdn.com/pe-webplatform/tYf1HL7yBDpDDckT28xVYZNJ.png");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32756o = new DecimalFormat("#.0");
    }

    public OnlineMatchNewUiCardViewReform(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32756o = new DecimalFormat("#.0");
    }
}
