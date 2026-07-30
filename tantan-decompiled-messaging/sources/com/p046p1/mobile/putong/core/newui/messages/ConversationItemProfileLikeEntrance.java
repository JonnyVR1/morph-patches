package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dml;
import p149l.e30;
import p149l.ea6;
import p149l.j2e0;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pi6;
import p149l.qib0;
import p149l.rd6;
import p149l.t0g0;
import p149l.upa;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xs90;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemProfileLikeEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f24858a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f24859b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f24860c;

    /* JADX INFO: renamed from: d */
    public View f24861d;

    /* JADX INFO: renamed from: e */
    public VLinear f24862e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f24863f;

    /* JADX INFO: renamed from: g */
    public VText f24864g;

    /* JADX INFO: renamed from: h */
    public VText f24865h;

    /* JADX INFO: renamed from: i */
    public VText f24866i;

    /* JADX INFO: renamed from: j */
    public Conversation f24867j;

    /* JADX INFO: renamed from: k */
    public int f24868k;

    /* JADX INFO: renamed from: l */
    public boolean f24869l;

    public ConversationItemProfileLikeEntrance(Context context) {
        super(context);
        this.f24868k = -1;
        this.f24869l = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m40885c(View view) {
        ea6.m115414a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m40886d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: e */
    public final void m40887e() {
        VisitorCounter visitorCounterM34700N4 = CoreModule.f17545c.f19664m1.m34700N4();
        int i = NullChecker.m81303a(visitorCounterM34700N4) ? visitorCounterM34700N4.totalCnt : 0;
        j2e0.m139446m((Act) getContext(), Uri.parse("tantan://webview?url=" + xs90.m210735c().m210738d(i)));
        CoreModule.f17545c.f19580K1.m33246u3(this.f24867j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40888f() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = this.f24867j.profileLikeInfo;
        return expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m40889g(View view) {
        m40887e();
        zvf0.m220399u("e_receive_profile_like_entrance", OMSDialogPositon.p_messages_view, j760.m140076a(LimitTimePictureStatus.unread, Integer.valueOf(this.f24868k)), j760.m140076a("receive_profile_like_is_null", Boolean.valueOf(m40888f())));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40890h(Conversation conversation, User user) {
        xdl0.m208344M(this.f24860c, true);
        xdl0.m208344M(this.f24861d, true);
        qib0.f154691G.m102341Q0(this.f24860c, user.m60124fp().profileSmall());
        this.f24865h.setText(m40886d(user.name) + "：" + conversation.profileLikeInfo.profileLikeComment.comment);
    }

    /* JADX INFO: renamed from: i */
    public void m40891i(final Conversation conversation, dml dmlVar) {
        this.f24867j = conversation;
        if (conversation.profileLikeInfo == null) {
            try {
                conversation.profileLikeInfo = ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                conversation.profileLikeInfo = ExpandedProfileLikeCounter.new_();
            }
        }
        boolean z = (this.f24869l && this.f24868k == conversation.unreadMessages) ? false : true;
        int i = conversation.unreadMessages;
        this.f24868k = i;
        if (z) {
            this.f24869l = true;
            zvf0.m220368A("e_receive_profile_like_entrance", OMSDialogPositon.p_messages_view, j760.m140076a(LimitTimePictureStatus.unread, Integer.valueOf(i)), j760.m140076a("receive_profile_like_is_null", Boolean.valueOf(m40888f())));
        }
        this.f24864g.setTextColor(getResources().getColor(w0c0.f183846f0));
        this.f24864g.setText(mqi0.m155932G(conversation.latestTime));
        this.f24866i.setText(t0g0.m186865f(conversation.profileLikeInfo.receive));
        xdl0.m208344M(this.f24866i, conversation.profileLikeInfo.receive != 0);
        this.f24866i.setBackgroundResource(x2c0.f189785U5);
        if (conversation.profileLikeInfo.profileLikeComment != null) {
            dmlVar.mo67374c((Act) xdl0.m208328E(this), CoreModule.f17545c.f19639e0.m169410Ka(conversation.profileLikeInfo.profileLikeComment.userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.da6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85192a.m40890h(conversation, (User) obj);
                }
            }));
            return;
        }
        this.f24865h.setText("还未收到称赞");
        xdl0.m208344M(this.f24860c, false);
        xdl0.m208344M(this.f24861d, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24869l = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40885c(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ca6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80006a.m40889g(view);
            }
        });
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(pi6.f149080Q, this.f24858a);
            rd6.m178877k0(this.f24863f, this.f24864g);
            rd6.m178873e0(this.f24865h);
            this.f24858a.setImageResource(x2c0.f190561sm);
        }
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24868k = -1;
        this.f24869l = false;
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24868k = -1;
        this.f24869l = false;
    }
}
