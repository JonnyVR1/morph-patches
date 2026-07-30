package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.ovb0;
import p153l.pol;
import p153l.psd0;
import p153l.r1j0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x2q;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPictureLeft extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureLeft f31624a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f31625b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31626c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f31627d;

    /* JADX INFO: renamed from: e */
    public VText f31628e;

    /* JADX INFO: renamed from: f */
    public VText f31629f;

    /* JADX INFO: renamed from: g */
    public VText f31630g;

    /* JADX INFO: renamed from: h */
    public Message f31631h;

    /* JADX INFO: renamed from: i */
    public boolean f31632i;

    public ItemAiPictureLeft(Context context) {
        super(context);
        this.f31632i = false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        Message message = this.f31631h;
        return (message == null || jyb.m147479J(message.media)) ? new ArrayList() : CoreModule.m30933P().m143412i().mo180363M5((Act) getContext(), this.f31631h.media.get(0), this.f31631h);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(final pol polVar, final Message message, InterfaceC8682a.a aVar) {
        if (message == null) {
            return;
        }
        this.f31628e.setTypeface(lyh0.m156283c(3), 0);
        this.f31630g.setTypeface(lyh0.m156283c(3), 0);
        this.f31629f.setTypeface(lyh0.m156283c(3), 0);
        this.f31631h = message;
        if (jyb.m147479J(message.media)) {
            return;
        }
        final Media media = message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            uqb0.f180374G.m98798o(this.f31626c);
        } else {
            uqb0.f180374G.m127115L0(this.f31626c, media.cover().url);
        }
        this.f31631h = message;
        String str = "0";
        if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.aiPicture)) {
            String str2 = message.additionalData.aiPicture.likeStatus;
            if (TextUtils.equals(str2, "like")) {
                this.f31630g.setTextColor(Color.parseColor("#33000000"));
                bnl0.m105515H0(this.f31630g, "已喜欢");
                bnl0.m105524M(this.f31630g, true);
                bnl0.m105524M(this.f31629f, false);
                str = "yes";
            } else if (TextUtils.equals(str2, "dislike")) {
                this.f31629f.setTextColor(Color.parseColor("#33000000"));
                bnl0.m105524M(this.f31630g, false);
                bnl0.m105524M(this.f31629f, true);
                str = "no";
            } else {
                this.f31630g.setTextColor(Color.parseColor("#CC000000"));
                this.f31629f.setTextColor(Color.parseColor("#CC000000"));
                bnl0.m105515H0(this.f31630g, "喜欢");
                bnl0.m105524M(this.f31630g, true);
                bnl0.m105524M(this.f31629f, true);
            }
        } else {
            this.f31630g.setTextColor(Color.parseColor("#CC000000"));
            this.f31629f.setTextColor(Color.parseColor("#CC000000"));
            bnl0.m105515H0(this.f31630g, "喜欢");
            bnl0.m105524M(this.f31630g, true);
            bnl0.m105524M(this.f31629f, true);
        }
        bnl0.m105509E0(this.f31626c, new View.OnClickListener() { // from class: l.p2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150285a.m49185l(message, media, view);
            }
        });
        bnl0.m105509E0(this.f31630g, new View.OnClickListener() { // from class: l.q2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155378a.m49187o(message, polVar, view);
            }
        });
        bnl0.m105509E0(this.f31629f, new View.OnClickListener() { // from class: l.r2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160962a.m49189q(message, polVar, view);
            }
        });
        this.f31626c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.s2q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f165907a.m49190r(view);
            }
        });
        if (this.f31632i) {
            return;
        }
        this.f31632i = true;
        i4g0.m138492A("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", message.cid), jyb.m147494Y("paip_ai_picture_feedback", str));
    }

    /* JADX INFO: renamed from: i */
    public final void m49182i(View view) {
        x2q.m209170a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m49183j() {
        User userM116503Pa;
        Message message = this.f31631h;
        if (message == null || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid)) == null) {
            return true;
        }
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(userM116503Pa.f56859id);
        if (conversationM34219zp != null && !TEnum.equals(conversationM34219zp.status, "dismissed")) {
            return false;
        }
        r1j0.m179420g("已解除配对，无法查看");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m49184k() {
        this.f31627d.setIndeterminate(false);
        bnl0.m105524M(this.f31627d, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49185l(Message message, Media media, View view) {
        CoreModule.m30933P().m143405a().mo180344J4((Act) getContext(), message, media);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m49186n(uxj0 uxj0Var) {
        this.f31630g.setTextColor(Color.parseColor("#33000000"));
        bnl0.m105524M(this.f31630g, true);
        bnl0.m105524M(this.f31629f, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m49187o(Message message, pol polVar, View view) {
        if ((NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "like")) || m49183j()) {
            return;
        }
        polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20384f0.m34142to(message, "like")).subscribe(psd0.m173597H(new y20() { // from class: l.v2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182103a.m49186n((uxj0) obj);
            }
        }, new y20() { // from class: l.w2q
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网络异常！");
            }
        }));
        i4g0.m138520r("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49182i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m49188p(uxj0 uxj0Var) {
        this.f31629f.setTextColor(Color.parseColor("#33000000"));
        bnl0.m105524M(this.f31630g, false);
        bnl0.m105524M(this.f31629f, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m49189q(Message message, pol polVar, View view) {
        if ((NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "dislike")) || m49183j()) {
            return;
        }
        polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20384f0.m34142to(message, "dislike")).subscribe(psd0.m173597H(new y20() { // from class: l.t2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171786a.m49188p((uxj0) obj);
            }
        }, new y20() { // from class: l.u2q
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网络异常！");
            }
        }));
        i4g0.m138520r("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m49190r(View view) {
        ItemMessageBase.m49494R(this).onLongClick(this.f31626c);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m49191s() {
        this.f31627d.setIndeterminate(true);
        bnl0.m105524M(this.f31627d, true);
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31632i = false;
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31632i = false;
    }
}
