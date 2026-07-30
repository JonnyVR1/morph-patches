package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a9g0;
import p153l.b1a0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.hb6;
import p153l.i4g0;
import p153l.nae0;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.sj6;
import p153l.ue6;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemProfileLikeEntrance extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25600a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f25601b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25602c;

    /* JADX INFO: renamed from: d */
    public View f25603d;

    /* JADX INFO: renamed from: e */
    public VLinear f25604e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f25605f;

    /* JADX INFO: renamed from: g */
    public VText f25606g;

    /* JADX INFO: renamed from: h */
    public VText f25607h;

    /* JADX INFO: renamed from: i */
    public VText f25608i;

    /* JADX INFO: renamed from: j */
    public Conversation f25609j;

    /* JADX INFO: renamed from: k */
    public int f25610k;

    /* JADX INFO: renamed from: l */
    public boolean f25611l;

    public ConversationItemProfileLikeEntrance(Context context) {
        super(context);
        this.f25610k = -1;
        this.f25611l = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m41896c(View view) {
        hb6.m134348a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m41897d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() < 8 ? str : str.substring(0, 8).concat("...");
    }

    /* JADX INFO: renamed from: e */
    public final void m41898e() {
        VisitorCounter visitorCounterM35703N4 = CoreModule.f18264c.f20406m1.m35703N4();
        int i = NullChecker.m82486a(visitorCounterM35703N4) ? visitorCounterM35703N4.totalCnt : 0;
        nae0.m162083m((Act) getContext(), Uri.parse("tantan://webview?url=" + b1a0.m101461c().m101464d(i)));
        CoreModule.f18264c.f20322K1.m34249u3(this.f25609j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41899f() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = this.f25609j.profileLikeInfo;
        return expandedProfileLikeCounter == null || expandedProfileLikeCounter.profileLikeComment == null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41900g(View view) {
        m41898e();
        i4g0.m138523u("e_receive_profile_like_entrance", OMSDialogPositon.p_messages_view, pf60.m172085a(LimitTimePictureStatus.unread, Integer.valueOf(this.f25610k)), pf60.m172085a("receive_profile_like_is_null", Boolean.valueOf(m41899f())));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41901h(Conversation conversation, User user) {
        bnl0.m105524M(this.f25602c, true);
        bnl0.m105524M(this.f25603d, true);
        uqb0.f180374G.m127125Q0(this.f25602c, user.m61308fp().profileSmall());
        this.f25607h.setText(m41897d(user.name) + "：" + conversation.profileLikeInfo.profileLikeComment.comment);
    }

    /* JADX INFO: renamed from: i */
    public void m41902i(final Conversation conversation, pol polVar) {
        this.f25609j = conversation;
        if (conversation.profileLikeInfo == null) {
            try {
                conversation.profileLikeInfo = ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                conversation.profileLikeInfo = ExpandedProfileLikeCounter.new_();
            }
        }
        boolean z = (this.f25611l && this.f25610k == conversation.unreadMessages) ? false : true;
        int i = conversation.unreadMessages;
        this.f25610k = i;
        if (z) {
            this.f25611l = true;
            i4g0.m138492A("e_receive_profile_like_entrance", OMSDialogPositon.p_messages_view, pf60.m172085a(LimitTimePictureStatus.unread, Integer.valueOf(i)), pf60.m172085a("receive_profile_like_is_null", Boolean.valueOf(m41899f())));
        }
        this.f25606g.setTextColor(getResources().getColor(c9c0.f80419g0));
        this.f25606g.setText(pzi0.m174442G(conversation.latestTime));
        this.f25608i.setText(a9g0.m96571f(conversation.profileLikeInfo.receive));
        bnl0.m105524M(this.f25608i, conversation.profileLikeInfo.receive != 0);
        this.f25608i.setBackgroundResource(dbc0.f86654V5);
        if (conversation.profileLikeInfo.profileLikeComment != null) {
            polVar.mo68557c((Act) bnl0.m105508E(this), CoreModule.f18264c.f20381e0.m116483Ka(conversation.profileLikeInfo.profileLikeComment.userId)).subscribe(psd0.m173596G(new y20() { // from class: l.gb6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103055a.m41901h(conversation, (User) obj);
                }
            }));
            return;
        }
        this.f25607h.setText("还未收到称赞");
        bnl0.m105524M(this.f25602c, false);
        bnl0.m105524M(this.f25603d, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25611l = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41896c(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.fb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98049a.m41900g(view);
            }
        });
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(sj6.f168905Q, this.f25600a);
            ue6.m195671k0(this.f25605f, this.f25606g);
            ue6.m195667e0(this.f25607h);
            this.f25600a.setImageResource(dbc0.f87029gn);
        }
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25610k = -1;
        this.f25611l = false;
    }

    public ConversationItemProfileLikeEntrance(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25610k = -1;
        this.f25611l = false;
    }
}
