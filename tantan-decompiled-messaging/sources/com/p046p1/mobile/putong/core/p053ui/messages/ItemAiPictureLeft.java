package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.dml;
import p149l.e30;
import p149l.eqh0;
import p149l.knb0;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.vwb;
import p149l.x0q;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPictureLeft extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureLeft f30776a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f30777b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30778c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f30779d;

    /* JADX INFO: renamed from: e */
    public VText f30780e;

    /* JADX INFO: renamed from: f */
    public VText f30781f;

    /* JADX INFO: renamed from: g */
    public VText f30782g;

    /* JADX INFO: renamed from: h */
    public Message f30783h;

    /* JADX INFO: renamed from: i */
    public boolean f30784i;

    public ItemAiPictureLeft(Context context) {
        super(context);
        this.f30784i = false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        Message message = this.f30783h;
        return (message == null || vwb.m200296J(message.media)) ? new ArrayList() : CoreModule.m29935P().m94658i().mo158271M5((Act) getContext(), this.f30783h.media.get(0), this.f30783h);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(final dml dmlVar, final Message message, InterfaceC8519a.a aVar) {
        if (message == null) {
            return;
        }
        this.f30780e.setTypeface(eqh0.m117752c(3), 0);
        this.f30782g.setTypeface(eqh0.m117752c(3), 0);
        this.f30781f.setTypeface(eqh0.m117752c(3), 0);
        this.f30783h = message;
        if (vwb.m200296J(message.media)) {
            return;
        }
        final Media media = message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            qib0.f154691G.m184725o(this.f30778c);
        } else {
            qib0.f154691G.m102331L0(this.f30778c, media.cover().url);
        }
        this.f30783h = message;
        String str = "0";
        if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.aiPicture)) {
            String str2 = message.additionalData.aiPicture.likeStatus;
            if (TextUtils.equals(str2, "like")) {
                this.f30782g.setTextColor(Color.parseColor("#33000000"));
                xdl0.m208335H0(this.f30782g, "已喜欢");
                xdl0.m208344M(this.f30782g, true);
                xdl0.m208344M(this.f30781f, false);
                str = "yes";
            } else if (TextUtils.equals(str2, "dislike")) {
                this.f30781f.setTextColor(Color.parseColor("#33000000"));
                xdl0.m208344M(this.f30782g, false);
                xdl0.m208344M(this.f30781f, true);
                str = "no";
            } else {
                this.f30782g.setTextColor(Color.parseColor("#CC000000"));
                this.f30781f.setTextColor(Color.parseColor("#CC000000"));
                xdl0.m208335H0(this.f30782g, "喜欢");
                xdl0.m208344M(this.f30782g, true);
                xdl0.m208344M(this.f30781f, true);
            }
        } else {
            this.f30782g.setTextColor(Color.parseColor("#CC000000"));
            this.f30781f.setTextColor(Color.parseColor("#CC000000"));
            xdl0.m208335H0(this.f30782g, "喜欢");
            xdl0.m208344M(this.f30782g, true);
            xdl0.m208344M(this.f30781f, true);
        }
        xdl0.m208329E0(this.f30778c, new View.OnClickListener() { // from class: l.p0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146612a.m48002l(message, media, view);
            }
        });
        xdl0.m208329E0(this.f30782g, new View.OnClickListener() { // from class: l.q0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152071a.m48004o(message, dmlVar, view);
            }
        });
        xdl0.m208329E0(this.f30781f, new View.OnClickListener() { // from class: l.r0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157186a.m48006q(message, dmlVar, view);
            }
        });
        this.f30778c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.s0q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f161795a.m48007r(view);
            }
        });
        if (this.f30784i) {
            return;
        }
        this.f30784i = true;
        zvf0.m220368A("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", message.cid), vwb.m200311Y("paip_ai_picture_feedback", str));
    }

    /* JADX INFO: renamed from: i */
    public final void m47999i(View view) {
        x0q.m206643a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m48000j() {
        User userM169430Pa;
        Message message = this.f30783h;
        if (message == null || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid)) == null) {
            return true;
        }
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(userM169430Pa.f56011id);
        if (conversationM33216zp != null && !TEnum.equals(conversationM33216zp.status, "dismissed")) {
            return false;
        }
        osi0.m165783g("已解除配对，无法查看");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m48001k() {
        this.f30779d.setIndeterminate(false);
        xdl0.m208344M(this.f30779d, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m48002l(Message message, Media media, View view) {
        CoreModule.m29935P().m94651a().mo158252J4((Act) getContext(), message, media);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m48003n(roj0 roj0Var) {
        this.f30782g.setTextColor(Color.parseColor("#33000000"));
        xdl0.m208344M(this.f30782g, true);
        xdl0.m208344M(this.f30781f, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m48004o(Message message, dml dmlVar, View view) {
        if ((NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "like")) || m48000j()) {
            return;
        }
        dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19642f0.m33139to(message, "like")).subscribe(mkd0.m154956H(new e30() { // from class: l.v0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179136a.m48003n((roj0) obj);
            }
        }, new e30() { // from class: l.w0q
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网络异常！");
            }
        }));
        zvf0.m220396r("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47999i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m48005p(roj0 roj0Var) {
        this.f30781f.setTextColor(Color.parseColor("#33000000"));
        xdl0.m208344M(this.f30782g, false);
        xdl0.m208344M(this.f30781f, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m48006q(Message message, dml dmlVar, View view) {
        if ((NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "dislike")) || m48000j()) {
            return;
        }
        dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19642f0.m33139to(message, "dislike")).subscribe(mkd0.m154956H(new e30() { // from class: l.t0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167204a.m48005p((roj0) obj);
            }
        }, new e30() { // from class: l.u0q
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网络异常！");
            }
        }));
        zvf0.m220396r("e_paip_ai_picture_feedback", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m48007r(View view) {
        ItemMessageBase.m48311R(this).onLongClick(this.f30778c);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m48008s() {
        this.f30779d.setIndeterminate(true);
        xdl0.m208344M(this.f30779d, true);
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30784i = false;
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30784i = false;
    }
}
