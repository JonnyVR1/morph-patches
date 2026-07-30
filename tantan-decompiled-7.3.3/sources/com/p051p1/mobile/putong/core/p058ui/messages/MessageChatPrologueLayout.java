package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.core.data.PrologueMessageAdditional;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.bsj0;
import p153l.i4g0;
import p153l.jxd0;
import p153l.jyb;
import p153l.pf60;
import p153l.pzi0;
import p153l.tvz;
import p153l.w4z;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class MessageChatPrologueLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_Medium f32434c;

    /* JADX INFO: renamed from: d */
    public VImage f32435d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f32436e;

    /* JADX INFO: renamed from: f */
    public VImage f32437f;

    /* JADX INFO: renamed from: g */
    public VLinear f32438g;

    /* JADX INFO: renamed from: h */
    public jxd0 f32439h;

    public MessageChatPrologueLayout(Context context) {
        super(context);
        this.f32439h = new jxd0("PrologueLayoutAutoSelect" + CoreModule.m30929H().userId(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m50033Z(View view) {
        this.f32439h.put(Boolean.valueOf(bsj0.m106262T(this.f32438g)));
    }

    /* JADX INFO: renamed from: V */
    public final void m50034V(View view) {
        w4z.m204903a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m50035W(String str, yxz yxzVar, final MessagesAct messagesAct, View view) {
        m50039b0(str);
        yxzVar.mo178911Q1(true, new Runnable() { // from class: l.u4z
            @Override // java.lang.Runnable
            public final void run() {
                ((tvz) messagesAct.f32488f).m193122Dg();
            }
        });
        i4g0.m138523u("e_close_click", messagesAct.pageId(), pf60.m172085a("shortcut_type", "prologue"));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m50036X(MessagesAct messagesAct, String str, List list) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(messagesAct.f32488f.f82474c);
        boolean zM106285u = bsj0.m106285u(this.f32438g);
        i4g0.m138523u("e_send_opening_guidance", messagesAct.pageId(), jyb.m147494Y("opening_guidance_showtime", str), jyb.m147494Y("opening_content", ((Prologue) list.get(0)).value), jyb.m147494Y("opening_is_saved", Boolean.valueOf(zM106285u)));
        if (NullChecker.m82486a(userM116597oa)) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("prologue");
            messageNew_.value = ((Prologue) list.get(0)).value;
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.prologue = PrologueMessageAdditional.new_();
            PrologueMessageAdditional prologueMessageAdditional = messageNew_.additionalData.prologue;
            prologueMessageAdditional.autoSend = zM106285u;
            prologueMessageAdditional.category = ((Prologue) list.get(0)).category;
            CoreModule.f18264c.f20384f0.m33626Dn(messagesAct.f32488f.mo111034r3(), messageNew_, null);
        }
        ((tvz) messagesAct.f32488f).m193122Dg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m50037Y(final String str, yxz yxzVar, final MessagesAct messagesAct, final List list, View view) {
        m50038a0(str);
        yxzVar.mo178911Q1(true, new Runnable() { // from class: l.v4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f182444a.m50036X(messagesAct, str, list);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m50038a0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.f18264c.f20384f0.f20611J1.clear();
            CoreModule.f18264c.f20384f0.f20608I1.clear();
            CoreModule.f18264c.f20384f0.f20605H1.clear();
        } else if ("no_reply".equals(str)) {
            CoreModule.f18264c.f20384f0.f20623N1.clear();
            CoreModule.f18264c.f20384f0.f20620M1.clear();
            CoreModule.f18264c.f20384f0.f20617L1.clear();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m50039b0(String str) {
        if ("sayhi".equals(str)) {
            CoreModule.f18264c.f20384f0.f20614K1.put(Long.valueOf(pzi0.m174454o()));
        } else if ("no_reply".equals(str)) {
            CoreModule.f18264c.f20384f0.f20626O1.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m50040c0(String str) {
        if ("sayhi".equals(str)) {
            if (pzi0.m174439D(CoreModule.f18264c.f20384f0.f20608I1.get().longValue())) {
                CoreModule.f18264c.f20384f0.f20605H1.m203841a(1);
                return;
            }
            CoreModule.f18264c.f20384f0.f20611J1.m203841a(1);
            CoreModule.f18264c.f20384f0.f20608I1.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20384f0.f20605H1.put(1);
            return;
        }
        if ("no_reply".equals(str)) {
            if (pzi0.m174439D(CoreModule.f18264c.f20384f0.f20620M1.get().longValue())) {
                CoreModule.f18264c.f20384f0.f20617L1.m203841a(1);
                return;
            }
            CoreModule.f18264c.f20384f0.f20623N1.m203841a(1);
            CoreModule.f18264c.f20384f0.f20620M1.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20384f0.f20617L1.put(1);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m50041d0(final MessagesAct messagesAct, final List<Prologue> list, final yxz yxzVar, final String str) {
        m50040c0(str);
        bnl0.m105509E0(this.f32435d, new View.OnClickListener() { // from class: l.r4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161261a.m50035W(str, yxzVar, messagesAct, view);
            }
        });
        bnl0.m105509E0(this.f32437f, new View.OnClickListener() { // from class: l.s4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166298a.m50037Y(str, yxzVar, messagesAct, list, view);
            }
        });
        bnl0.m105509E0(this.f32438g, new View.OnClickListener() { // from class: l.t4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172155a.m50033Z(view);
            }
        });
        bsj0.m106284t(this.f32438g, this.f32439h.get().booleanValue());
        this.f32436e.setText(list.get(0).value);
        boolean zEquals = "no_reply".equals(str);
        VText_Medium vText_Medium = this.f32434c;
        if (zEquals) {
            vText_Medium.setText("真诚地介绍自己，更容易得到回复");
        } else {
            vText_Medium.setText("根据你的资料，为你定制了开场白");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50034V(this);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32439h = new jxd0("PrologueLayoutAutoSelect" + CoreModule.m30929H().userId(), Boolean.TRUE);
    }

    public MessageChatPrologueLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32439h = new jxd0("PrologueLayoutAutoSelect" + CoreModule.m30929H().userId(), Boolean.TRUE);
    }
}
