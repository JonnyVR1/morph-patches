package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.bpz;
import p149l.hpd0;
import p149l.j760;
import p149l.mqi0;
import p149l.vwb;
import p149l.wmz;
import p149l.xdl0;
import p149l.yij0;
import p149l.zvf0;
import p149l.zvy;

/* JADX INFO: loaded from: classes3.dex */
public class MessageChatPrologueLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_Medium f31586c;

    /* JADX INFO: renamed from: d */
    public VImage f31587d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f31588e;

    /* JADX INFO: renamed from: f */
    public VImage f31589f;

    /* JADX INFO: renamed from: g */
    public VLinear f31590g;

    /* JADX INFO: renamed from: h */
    public hpd0 f31591h;

    public MessageChatPrologueLayout(Context context) {
        super(context);
        this.f31591h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.m29931H().userId(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m48850Z(View view) {
        this.f31591h.put(Boolean.valueOf(yij0.m214942T(this.f31590g)));
    }

    /* JADX INFO: renamed from: V */
    public final void m48851V(View view) {
        zvy.m220495a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m48852W(String str, bpz bpzVar, final MessagesAct messagesAct, View view) {
        m48856b0(str);
        bpzVar.mo103201Q1(true, new Runnable() { // from class: l.xvy
            @Override // java.lang.Runnable
            public final void run() {
                ((wmz) messagesAct.f31640f).m204334Dg();
            }
        });
        zvf0.m220399u("e_close_click", messagesAct.pageId(), j760.m140076a("shortcut_type", "prologue"));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48853X(MessagesAct messagesAct, String str, List list) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(messagesAct.f31640f.f96911c);
        boolean zM214965u = yij0.m214965u(this.f31590g);
        zvf0.m220399u("e_send_opening_guidance", messagesAct.pageId(), vwb.m200311Y("opening_guidance_showtime", str), vwb.m200311Y("opening_content", ((Prologue) list.get(0)).value), vwb.m200311Y("opening_is_saved", Boolean.valueOf(zM214965u)));
        if (NullChecker.m81303a(userM169524oa)) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("prologue");
            messageNew_.value = ((Prologue) list.get(0)).value;
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.prologue = PrologueMessageAdditional.new_();
            PrologueMessageAdditional prologueMessageAdditional = messageNew_.additionalData.prologue;
            prologueMessageAdditional.autoSend = zM214965u;
            prologueMessageAdditional.category = ((Prologue) list.get(0)).category;
            CoreModule.f17545c.f19642f0.m32623Dn(messagesAct.f31640f.mo120828r3(), messageNew_, null);
        }
        ((wmz) messagesAct.f31640f).m204334Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m48854Y(final String str, bpz bpzVar, final MessagesAct messagesAct, final List list, View view) {
        m48855a0(str);
        bpzVar.mo103201Q1(true, new Runnable() { // from class: l.yvy
            @Override // java.lang.Runnable
            public final void run() {
                this.f200297a.m48853X(messagesAct, str, list);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m48855a0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.f17545c.f19642f0.f19869J1.clear();
            CoreModule.f17545c.f19642f0.f19866I1.clear();
            CoreModule.f17545c.f19642f0.f19863H1.clear();
        } else if ("no_reply".equals(str)) {
            CoreModule.f17545c.f19642f0.f19881N1.clear();
            CoreModule.f17545c.f19642f0.f19878M1.clear();
            CoreModule.f17545c.f19642f0.f19875L1.clear();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m48856b0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.f17545c.f19642f0.f19872K1.put(Long.valueOf(mqi0.m155944o()));
        } else if ("no_reply".equals(str)) {
            CoreModule.f17545c.f19642f0.f19884O1.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m48857c0(String str) {
        if ("sayhi".equals(str)) {
            if (mqi0.m155929D(CoreModule.f17545c.f19642f0.f19866I1.get().longValue())) {
                CoreModule.f17545c.f19642f0.f19863H1.m189988a(1);
                return;
            }
            CoreModule.f17545c.f19642f0.f19869J1.m189988a(1);
            CoreModule.f17545c.f19642f0.f19866I1.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19642f0.f19863H1.put(1);
            return;
        }
        if ("no_reply".equals(str)) {
            if (mqi0.m155929D(CoreModule.f17545c.f19642f0.f19878M1.get().longValue())) {
                CoreModule.f17545c.f19642f0.f19875L1.m189988a(1);
                return;
            }
            CoreModule.f17545c.f19642f0.f19881N1.m189988a(1);
            CoreModule.f17545c.f19642f0.f19878M1.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19642f0.f19875L1.put(1);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m48858d0(final MessagesAct messagesAct, final List<Prologue> list, final bpz bpzVar, final String str) {
        m48857c0(str);
        xdl0.m208329E0(this.f31587d, new View.OnClickListener() { // from class: l.uvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178574a.m48852W(str, bpzVar, messagesAct, view);
            }
        });
        xdl0.m208329E0(this.f31589f, new View.OnClickListener() { // from class: l.vvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183277a.m48854Y(str, bpzVar, messagesAct, list, view);
            }
        });
        xdl0.m208329E0(this.f31590g, new View.OnClickListener() { // from class: l.wvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188299a.m48850Z(view);
            }
        });
        yij0.m214964t(this.f31590g, this.f31591h.get().booleanValue());
        this.f31588e.setText(list.get(0).value);
        boolean zEquals = "no_reply".equals(str);
        VText_Medium vText_Medium = this.f31586c;
        if (zEquals) {
            vText_Medium.setText("真诚地介绍自己，更容易得到回复");
        } else {
            vText_Medium.setText("根据你的资料，为你定制了开场白");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48851V(this);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31591h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.m29931H().userId(), Boolean.TRUE);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31591h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.m29931H().userId(), Boolean.TRUE);
    }
}
