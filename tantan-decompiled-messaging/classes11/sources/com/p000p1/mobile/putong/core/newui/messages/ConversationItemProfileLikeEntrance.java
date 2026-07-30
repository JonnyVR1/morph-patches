package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import l.dml;
import l.e30;
import l.ea6;
import l.j2e0;
import l.j760;
import l.mkd0;
import l.qib0;
import l.t0g0;
import l.upa;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xs90;
import l.zvf0;
import p009l.mqi0;
import p009l.pi6;
import p009l.rd6;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemProfileLikeEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f3636a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3637b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f3638c;

    /* JADX INFO: renamed from: d */
    public View f3639d;

    /* JADX INFO: renamed from: e */
    public VLinear f3640e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f3641f;

    /* JADX INFO: renamed from: g */
    public VText f3642g;

    /* JADX INFO: renamed from: h */
    public VText f3643h;

    /* JADX INFO: renamed from: i */
    public VText f3644i;

    /* JADX INFO: renamed from: j */
    public Conversation f3645j;

    /* JADX INFO: renamed from: k */
    public int f3646k;

    /* JADX INFO: renamed from: l */
    public boolean f3647l;

    public ConversationItemProfileLikeEntrance(Context context) {
        super(context);
        this.f3646k = -1;
        this.f3647l = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m4984c(View view) {
        ea6.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m4985d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: e */
    public final void m4986e() {
        VisitorCounter visitorCounterN4 = CoreModule.c.m1.N4();
        int i = NullChecker.a(visitorCounterN4) ? visitorCounterN4.totalCnt : 0;
        j2e0.m(getContext(), Uri.parse("tantan://webview?url=" + xs90.c().d(i)));
        CoreModule.c.K1.u3(this.f3645j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4987f() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = this.f3645j.profileLikeInfo;
        return expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m4988g(View view) {
        m4986e();
        zvf0.u("e_receive_profile_like_entrance", "p_messages_view", new j760[]{j760.a("unread", Integer.valueOf(this.f3646k)), j760.a("receive_profile_like_is_null", Boolean.valueOf(m4987f()))});
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4989h(Conversation conversation, User user) {
        xdl0.M(this.f3638c, true);
        xdl0.M(this.f3639d, true);
        qib0.G.Q0(this.f3638c, user.fp().profileSmall());
        this.f3643h.setText(m4985d(user.name) + "：" + conversation.profileLikeInfo.profileLikeComment.comment);
    }

    /* JADX INFO: renamed from: i */
    public void m4990i(final Conversation conversation, dml dmlVar) {
        this.f3645j = conversation;
        if (conversation.profileLikeInfo == null) {
            try {
                conversation.profileLikeInfo = (ExpandedProfileLikeCounter) ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                conversation.profileLikeInfo = ExpandedProfileLikeCounter.new_();
            }
        }
        boolean z = (this.f3647l && this.f3646k == conversation.unreadMessages) ? false : true;
        int i = conversation.unreadMessages;
        this.f3646k = i;
        if (z) {
            this.f3647l = true;
            zvf0.A("e_receive_profile_like_entrance", "p_messages_view", new j760[]{j760.a("unread", Integer.valueOf(i)), j760.a("receive_profile_like_is_null", Boolean.valueOf(m4987f()))});
        }
        this.f3642g.setTextColor(getResources().getColor(w0c0.f0));
        this.f3642g.setText(mqi0.m18538G(conversation.latestTime));
        this.f3644i.setText(t0g0.f(conversation.profileLikeInfo.receive));
        xdl0.M(this.f3644i, conversation.profileLikeInfo.receive != 0);
        this.f3644i.setBackgroundResource(x2c0.U5);
        if (conversation.profileLikeInfo.profileLikeComment != null) {
            dmlVar.c(xdl0.E(this), CoreModule.c.e0.Ka(conversation.profileLikeInfo.profileLikeComment.userId)).subscribe(mkd0.G(new e30() { // from class: l.da6
                public final void call(Object obj) {
                    this.f11692a.m4989h(conversation, (User) obj);
                }
            }));
            return;
        }
        this.f3643h.setText("还未收到称赞");
        xdl0.M(this.f3638c, false);
        xdl0.M(this.f3639d, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3647l = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4984c(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ca6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10482a.m4988g(view);
            }
        });
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(pi6.f18601Q, this.f3636a);
            rd6.m21518k0(this.f3641f, this.f3642g);
            rd6.m21514e0(this.f3643h);
            this.f3636a.setImageResource(x2c0.sm);
        }
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3646k = -1;
        this.f3647l = false;
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3646k = -1;
        this.f3647l = false;
    }
}
