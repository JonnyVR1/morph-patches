package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.m4q;
import l.mqi0;
import l.ura;
import l.xdl0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p003l.qsz;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemHeartbeatNotifyNewUi extends FrameLayout implements c0.c {

    /* JADX INFO: renamed from: a */
    public FrameLayout f903a;

    /* JADX INFO: renamed from: b */
    public VImage f904b;

    /* JADX INFO: renamed from: c */
    public VText f905c;

    /* JADX INFO: renamed from: d */
    public VText f906d;

    /* JADX INFO: renamed from: e */
    public View f907e;

    /* JADX INFO: renamed from: f */
    public VText f908f;

    /* JADX INFO: renamed from: g */
    public String f909g;

    /* JADX INFO: renamed from: h */
    public String f910h;

    /* JADX INFO: renamed from: i */
    public int f911i;

    public ItemHeartbeatNotifyNewUi(@NonNull Context context) {
        super(context);
        this.f909g = "";
        this.f910h = "";
    }

    private void setLeave(boolean z) {
        xdl0.M(this.f903a, z);
        xdl0.M(this.f908f, !z);
    }

    /* JADX INFO: renamed from: a */
    public final void m1280a(View view) {
        m4q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m1281b(long j) {
        if (j - mqi0.o() > 0) {
            setLeave(false);
            return this.f909g;
        }
        setLeave(true);
        return "匹配已解除，对方已经离开了对话";
    }

    /* JADX INFO: renamed from: c */
    public void m1282c(Message message, Conversation conversation, qsz qszVar) {
        int iI1 = 1;
        if (!CoreModule.P().i().u() || conversation == null || conversation.additional.heartbeatMatch == null || !conversation.isHeartbeatConv()) {
            setLeave(true);
            return;
        }
        if (conversation.additional.heartbeatMatch.isPassive) {
            this.f910h = CoreModule.H().userId();
        } else {
            this.f910h = ((DbObject) conversation).id;
        }
        CoreModule.c.t1.t(this);
        User userPa = CoreModule.c.e0.Pa(((DbObject) conversation).id);
        boolean zIsFemale = !conversation.additional.heartbeatMatch.isPassive;
        if (NullChecker.a(userPa)) {
            zIsFemale = userPa.isFemale();
        }
        boolean zEquals = TEnum.equals(message.messageType(), "heartbeat_notify");
        ConversationAdditional conversationAdditional = conversation.additional;
        if (zEquals) {
            if (conversationAdditional.heartbeatMatch.isPassive) {
                this.f909g = "快去打个招呼吧～";
            } else if (conversation.isLimitMatch()) {
                this.f909g = "发送消息即可解锁限时";
            } else {
                this.f909g = CoreModule.b.getString(R.string.Z2);
            }
            this.f911i = 0;
        } else if (conversationAdditional.heartbeatMatch.isPassive) {
            this.f911i = 2;
            if (conversation.isLimitMatch()) {
                this.f909g = "发送消息即可解锁限时";
            } else {
                this.f909g = zIsFemale ? "主动回应即可解除限时，快和她聊聊吧！" : "主动回应即可解除限时，快和他聊聊吧！";
            }
        } else {
            this.f909g = "打招呼成功";
            this.f911i = 1;
        }
        xdl0.M(this.f907e, false);
        long j = (long) conversation.additional.heartbeatMatch.expireTime;
        if (TEnum.equals(conversation.status, ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET)) && j > mqi0.o() && conversation.isHeartbeatConv()) {
            this.f908f.setText(m1281b((long) conversation.additional.heartbeatMatch.expireTime));
            m1284e(((DbObject) conversation).id, (long) conversation.additional.heartbeatMatch.expireTime);
            setLeave(false);
        } else {
            this.f911i = 3;
            setLeave(true);
        }
        if (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.heartbeatMatch)) {
            iI1 = CoreModule.P().i().i1(conversation.additional.heartbeatMatch.source);
        }
        m1283d(qszVar, iI1);
    }

    /* JADX INFO: renamed from: d */
    public final void m1283d(qsz qszVar, int i) {
        if (qszVar.m7030a("HEARTBEAT_NOTIFY_MV_" + this.f911i)) {
            return;
        }
        qszVar.m7031b("HEARTBEAT_NOTIFY_MV_" + this.f911i);
        zvf0.A("e_chat_love_signal", "p_chat_view", new j760[]{j760.a("receiver_user_id", this.f910h), j760.a("love_sign_chat_guide", Integer.valueOf(this.f911i)), j760.a("signal_resource", Integer.valueOf(i))});
    }

    /* JADX INFO: renamed from: e */
    public final void m1284e(String str, long j) {
        c0.a aVar = new c0.a();
        aVar.g("message_heartbeat_countdown_" + str);
        aVar.a(true).f(j).c(mqi0.o()).h(CoreModule.P().i().u() ? 1L : 60L).d(this);
        CoreModule.c.t1.r(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1280a(this);
        this.f905c.getPaint().setFakeBoldText(true);
        if (ura.e().d().I4()) {
            xdl0.N(this.f904b, c3c0.B0);
            this.f905c.setTextColor(getResources().getColor(a1c0.g));
            this.f906d.setTextColor(getResources().getColor(a1c0.i));
            this.f908f.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1285u(String str, long j, long j2, long j3, long j4) {
        this.f908f.setText(m1281b(j3));
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f909g = "";
        this.f910h = "";
    }

    public ItemHeartbeatNotifyNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f909g = "";
        this.f910h = "";
    }
}
