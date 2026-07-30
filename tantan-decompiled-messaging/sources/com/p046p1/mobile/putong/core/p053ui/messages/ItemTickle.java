package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.i0g0;
import p149l.j000;
import p149l.mkd0;
import p149l.oa8;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTickle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f31523a;

    /* JADX INFO: renamed from: b */
    public VText f31524b;

    /* JADX INFO: renamed from: c */
    public View f31525c;

    public ItemTickle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m48741f() {
        return (MessagesAct) getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48742g(xaj0 xaj0Var, xaj0 xaj0Var2) {
        this.f31523a.setText(C8524b.m49055g((User) xaj0Var2.f191751a, (ChatGroupMember) xaj0Var2.f191752b, (ChatGroupMember) xaj0Var2.f191753c, (String) xaj0Var.f191753c));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48743h(User user, View view) {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            if (NullChecker.m81303a(user) && user.isAccountCancellation()) {
                return;
            }
            m48741f().startActivity(MessageProfileSettingAct.m48916Y1(m48741f(), m48741f().f31640f.m120794k4(m48741f().f31640f.mo120828r3()), m48741f().f31640f.mo120828r3()));
            return;
        }
        Toolbar toolbar = m48741f().toolbar();
        if (toolbar == null) {
            return;
        }
        toolbar.showOverflowMenu();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48744i(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.m208344M(this.f31524b, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m48745j(j000 j000Var, Message message, final User user) {
        xdl0.m208344M(this.f31525c, true);
        this.f31524b.setTextColor(getResources().getColor(a1c0.f67126H));
        this.f31523a.setTextColor(getResources().getColor(a1c0.f67125G));
        this.f31524b.setBackgroundColor(0);
        this.f31523a.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
            this.f31524b.setBackground(getResources().getDrawable(c3c0.f78625R4));
            this.f31524b.setTextColor(getResources().getColor(a1c0.f67146a0));
            this.f31523a.setBackground(getResources().getDrawable(c3c0.f78625R4));
            this.f31523a.setTextColor(getResources().getColor(a1c0.f67146a0));
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            if (message.isLocal()) {
                xdl0.m208344M(this.f31525c, false);
                return;
            }
            if (TEnum.equals(message.channel, "group")) {
                final xaj0<String, String, String> xaj0VarM49063o = C8524b.m49063o(message);
                if (NullChecker.m81303a(xaj0VarM49063o)) {
                    j000Var.mo67374c(m48741f(), CoreModule.f17545c.f19642f0.m32737Ne(message.cid).filter(new oa8()).take(1).map(new w9j() { // from class: l.dhq
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((Conversation) obj).otherUser;
                        }
                    }).flatMap(new w9j() { // from class: l.ehq
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            xaj0 xaj0Var = xaj0VarM49063o;
                            String str = (String) obj;
                            return mkd0.m154985s(CoreModule.f17545c.f19639e0.m169418Ma((String) xaj0Var.f191751a).filter(new C21368yd()), CoreModule.f17545c.f19645g0.m31844T6(str, (String) xaj0Var.f191751a).filter(new dg7()), CoreModule.f17545c.f19645g0.m31844T6(str, (String) xaj0Var.f191752b).filter(new dg7()), new ihq());
                        }
                    })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.fhq
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f97538a.m48742g(xaj0VarM49063o, (xaj0) obj);
                        }
                    }));
                } else {
                    this.f31523a.setText("");
                }
            } else {
                this.f31523a.setText(C8524b.m49056h(message));
            }
            boolean zM48746k = m48746k(message);
            xdl0.m208344M(this.f31524b, zM48746k);
            if (zM48746k) {
                CoreModule.f17545c.f19639e0.f149358e1.put(Boolean.TRUE);
                CoreModule.f17545c.f19639e0.f149366f1.put(message.f56011id);
                String string = getContext().getString(R$string.f20845R0);
                String string2 = getContext().getString(R$string.f20853S0);
                this.f31524b.setText(i0g0.m133861b0(string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string2, vwb.m200299M(string2), CoreModule.m29935P().m94658i().mo158233G1() ? getResources().getColor(a1c0.f67122D) : Color.parseColor("#006DF7"), eqh0.m117752c(3)));
                xdl0.m208329E0(this.f31524b, new View.OnClickListener() { // from class: l.ghq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f102675a.m48743h(user, view);
                    }
                });
            }
        } else if (TEnum.equals(message.messageType, "local_tickle_tip")) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
            if (userM169430Pa != null) {
                this.f31523a.setText(userM169430Pa.isFemale() ? R$string.f20829P0 : R$string.f20837Q0);
            }
            xdl0.m208344M(this.f31524b, false);
        } else if (TEnum.equals(message.messageType, MessageType.local_create_chat_group)) {
            this.f31523a.setText(R$string.f20839Q2);
            xdl0.m208344M(this.f31524b, false);
        }
        if (xdl0.m208349O0(this.f31524b)) {
            j000Var.mo67374c(m48741f(), CoreModule.f17545c.f19639e0.f149350d1.obs().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.hhq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107777a.m48744i((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m48746k(Message message) {
        if (!CoreModule.m29935P().m94658i().mo158216D()) {
            return false;
        }
        if ((CoreModule.m29935P().m94658i().mo158222E() && message.isGroupMessage()) || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) || message.isLocal() || message.f56011id.startsWith("fake_id_") || CoreModule.f17545c.f19639e0.f149350d1.get().booleanValue() || CoreModule.f17545c.f19631b1.f121926R.get().booleanValue()) {
            return false;
        }
        return !CoreModule.f17545c.f19639e0.f149358e1.get().booleanValue() || TextUtils.equals(message.f56011id, CoreModule.f17545c.f19639e0.f149366f1.get());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31523a = (VText) findViewById(y4c0.f195960E4);
        this.f31524b = (VText) findViewById(y4c0.f195954D4);
        this.f31525c = findViewById(y4c0.f195947C4);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
