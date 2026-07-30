package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.hpd0;
import l.j760;
import l.mqi0;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import l.zvy;
import p003l.bpz;
import p028v.VImage;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageChatPrologueLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_Medium f1477c;

    /* JADX INFO: renamed from: d */
    public VImage f1478d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f1479e;

    /* JADX INFO: renamed from: f */
    public VImage f1480f;

    /* JADX INFO: renamed from: g */
    public VLinear f1481g;

    /* JADX INFO: renamed from: h */
    public hpd0 f1482h;

    public MessageChatPrologueLayout(Context context) {
        super(context);
        this.f1482h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.H().userId(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m1937Z(View view) {
        this.f1482h.put(Boolean.valueOf(yij0.T(this.f1481g)));
    }

    /* JADX INFO: renamed from: V */
    public final void m1938V(View view) {
        zvy.a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m1939W(String str, bpz bpzVar, final MessagesAct messagesAct, View view) {
        m1943b0(str);
        bpzVar.mo3081Q1(true, new Runnable() { // from class: l.xvy
            @Override // java.lang.Runnable
            public final void run() {
                messagesAct.f1531f.Dg();
            }
        });
        zvf0.u("e_close_click", messagesAct.pageId(), new j760[]{j760.a("shortcut_type", "prologue")});
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m1940X(MessagesAct messagesAct, String str, List list) {
        User userOa = CoreModule.c.e0.oa(messagesAct.f1531f.f3543c);
        boolean zU = yij0.u(this.f1481g);
        zvf0.u("e_send_opening_guidance", messagesAct.pageId(), new j760[]{vwb.Y("opening_guidance_showtime", str), vwb.Y("opening_content", ((Prologue) list.get(0)).value), vwb.Y("opening_is_saved", Boolean.valueOf(zU))});
        if (NullChecker.a(userOa)) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("prologue");
            messageNew_.value = ((Prologue) list.get(0)).value;
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.prologue = PrologueMessageAdditional.new_();
            PrologueMessageAdditional prologueMessageAdditional = messageNew_.additionalData.prologue;
            prologueMessageAdditional.autoSend = zU;
            prologueMessageAdditional.category = ((Prologue) list.get(0)).category;
            CoreModule.c.f0.Dn(messagesAct.f1531f.m4295r3(), messageNew_, (Sticker) null);
        }
        messagesAct.f1531f.Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m1941Y(final String str, bpz bpzVar, final MessagesAct messagesAct, final List list, View view) {
        m1942a0(str);
        bpzVar.mo3081Q1(true, new Runnable() { // from class: l.yvy
            @Override // java.lang.Runnable
            public final void run() {
                this.f9162a.m1940X(messagesAct, str, list);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1942a0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.c.f0.J1.clear();
            CoreModule.c.f0.I1.clear();
            CoreModule.c.f0.H1.clear();
        } else if ("no_reply".equals(str)) {
            CoreModule.c.f0.N1.clear();
            CoreModule.c.f0.M1.clear();
            CoreModule.c.f0.L1.clear();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1943b0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.c.f0.K1.put(Long.valueOf(mqi0.o()));
        } else if ("no_reply".equals(str)) {
            CoreModule.c.f0.O1.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1944c0(String str) {
        if ("sayhi".equals(str)) {
            if (mqi0.D(((Long) CoreModule.c.f0.I1.get()).longValue())) {
                CoreModule.c.f0.H1.a(1);
                return;
            }
            CoreModule.c.f0.J1.a(1);
            CoreModule.c.f0.I1.put(Long.valueOf(mqi0.o()));
            CoreModule.c.f0.H1.put(1);
            return;
        }
        if ("no_reply".equals(str)) {
            if (mqi0.D(((Long) CoreModule.c.f0.M1.get()).longValue())) {
                CoreModule.c.f0.L1.a(1);
                return;
            }
            CoreModule.c.f0.N1.a(1);
            CoreModule.c.f0.M1.put(Long.valueOf(mqi0.o()));
            CoreModule.c.f0.L1.put(1);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m1945d0(final MessagesAct messagesAct, final List<Prologue> list, final bpz bpzVar, final String str) {
        m1944c0(str);
        xdl0.E0(this.f1478d, new View.OnClickListener() { // from class: l.uvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8108a.m1939W(str, bpzVar, messagesAct, view);
            }
        });
        xdl0.E0(this.f1480f, new View.OnClickListener() { // from class: l.vvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8444a.m1941Y(str, bpzVar, messagesAct, list, view);
            }
        });
        xdl0.E0(this.f1481g, new View.OnClickListener() { // from class: l.wvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8627a.m1937Z(view);
            }
        });
        yij0.t(this.f1481g, ((Boolean) this.f1482h.get()).booleanValue());
        this.f1479e.setText(list.get(0).value);
        boolean zEquals = "no_reply".equals(str);
        VText_Medium vText_Medium = this.f1477c;
        if (zEquals) {
            vText_Medium.setText("真诚地介绍自己，更容易得到回复");
        } else {
            vText_Medium.setText("根据你的资料，为你定制了开场白");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1938V(this);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1482h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.H().userId(), Boolean.TRUE);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1482h = new hpd0("PrologueLayoutAutoSelect" + CoreModule.H().userId(), Boolean.TRUE);
    }
}
