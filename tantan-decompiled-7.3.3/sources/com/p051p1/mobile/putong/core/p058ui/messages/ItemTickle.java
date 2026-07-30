package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.edc0;
import p153l.g900;
import p153l.g9c0;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.psd0;
import p153l.q8g0;
import p153l.qcj;
import p153l.sb8;
import p153l.y20;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTickle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f32371a;

    /* JADX INFO: renamed from: b */
    public VText f32372b;

    /* JADX INFO: renamed from: c */
    public View f32373c;

    public ItemTickle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m49924f() {
        return (MessagesAct) getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49925g(bkj0 bkj0Var, bkj0 bkj0Var2) {
        this.f32371a.setText(C8687b.m50238g((User) bkj0Var2.f77081a, (ChatGroupMember) bkj0Var2.f77082b, (ChatGroupMember) bkj0Var2.f77083c, (String) bkj0Var.f77083c));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49926h(User user, View view) {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            if (NullChecker.m82486a(user) && user.isAccountCancellation()) {
                return;
            }
            m49924f().startActivity(MessageProfileSettingAct.m50099Z1(m49924f(), m49924f().f32488f.m111000k4(m49924f().f32488f.mo111034r3()), m49924f().f32488f.mo111034r3()));
            return;
        }
        Toolbar toolbar = m49924f().toolbar();
        if (toolbar == null) {
            return;
        }
        toolbar.showOverflowMenu();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49927i(Boolean bool) {
        if (bool.booleanValue()) {
            bnl0.m105524M(this.f32372b, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m49928j(g900 g900Var, Message message, final User user) {
        bnl0.m105524M(this.f32373c, true);
        this.f32372b.setTextColor(getResources().getColor(g9c0.f102790H));
        this.f32371a.setTextColor(getResources().getColor(g9c0.f102789G));
        this.f32372b.setBackgroundColor(0);
        this.f32371a.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz) && ((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
            this.f32372b.setBackground(getResources().getDrawable(ibc0.f113900R4));
            this.f32372b.setTextColor(getResources().getColor(g9c0.f102810a0));
            this.f32371a.setBackground(getResources().getDrawable(ibc0.f113900R4));
            this.f32371a.setTextColor(getResources().getColor(g9c0.f102810a0));
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            if (message.isLocal()) {
                bnl0.m105524M(this.f32373c, false);
                return;
            }
            if (TEnum.equals(message.channel, "group")) {
                final bkj0<String, String, String> bkj0VarM50246o = C8687b.m50246o(message);
                if (NullChecker.m82486a(bkj0VarM50246o)) {
                    g900Var.mo68557c(m49924f(), CoreModule.f18264c.f20384f0.m33740Ne(message.cid).filter(new sb8()).take(1).map(new qcj() { // from class: l.djq
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((Conversation) obj).otherUser;
                        }
                    }).flatMap(new qcj() { // from class: l.ejq
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            bkj0 bkj0Var = bkj0VarM50246o;
                            String str = (String) obj;
                            return psd0.m173626s(CoreModule.f18264c.f20381e0.m116491Ma((String) bkj0Var.f77081a).filter(new C20291td()), CoreModule.f18264c.f20387g0.m32847T6(str, (String) bkj0Var.f77081a).filter(new hh7()), CoreModule.f18264c.f20387g0.m32847T6(str, (String) bkj0Var.f77082b).filter(new hh7()), new ijq());
                        }
                    })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.fjq
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f99404a.m49925g(bkj0VarM50246o, (bkj0) obj);
                        }
                    }));
                } else {
                    this.f32371a.setText("");
                }
            } else {
                this.f32371a.setText(C8687b.m50239h(message));
            }
            boolean zM49929k = m49929k(message);
            bnl0.m105524M(this.f32372b, zM49929k);
            if (zM49929k) {
                CoreModule.f18264c.f20381e0.f89215e1.put(Boolean.TRUE);
                CoreModule.f18264c.f20381e0.f89223f1.put(message.f56859id);
                String string = getContext().getString(R$string.f21587R0);
                String string2 = getContext().getString(R$string.f21595S0);
                this.f32372b.setText(q8g0.m175796b0(string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string2, jyb.m147482M(string2), CoreModule.m30933P().m143412i().mo180325G1() ? getResources().getColor(g9c0.f102786D) : Color.parseColor("#006DF7"), lyh0.m156283c(3)));
                bnl0.m105509E0(this.f32372b, new View.OnClickListener() { // from class: l.gjq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f104641a.m49926h(user, view);
                    }
                });
            }
        } else if (TEnum.equals(message.messageType, "local_tickle_tip")) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
            if (userM116503Pa != null) {
                this.f32371a.setText(userM116503Pa.isFemale() ? R$string.f21571P0 : R$string.f21579Q0);
            }
            bnl0.m105524M(this.f32372b, false);
        } else if (TEnum.equals(message.messageType, MessageType.local_create_chat_group)) {
            this.f32371a.setText(R$string.f21581Q2);
            bnl0.m105524M(this.f32372b, false);
        }
        if (bnl0.m105529O0(this.f32372b)) {
            g900Var.mo68557c(m49924f(), CoreModule.f18264c.f20381e0.f89207d1.obs().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.hjq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110293a.m49927i((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m49929k(Message message) {
        if (!CoreModule.m30933P().m143412i().mo180308D()) {
            return false;
        }
        if ((CoreModule.m30933P().m143412i().mo180314E() && message.isGroupMessage()) || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) || message.isLocal() || message.f56859id.startsWith("fake_id_") || CoreModule.f18264c.f20381e0.f89207d1.get().booleanValue() || CoreModule.f18264c.f20373b1.f193004R.get().booleanValue()) {
            return false;
        }
        return !CoreModule.f18264c.f20381e0.f89215e1.get().booleanValue() || TextUtils.equals(message.f56859id, CoreModule.f18264c.f20381e0.f89223f1.get());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32371a = (VText) findViewById(edc0.f93195E4);
        this.f32372b = (VText) findViewById(edc0.f93189D4);
        this.f32373c = findViewById(edc0.f93182C4);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
