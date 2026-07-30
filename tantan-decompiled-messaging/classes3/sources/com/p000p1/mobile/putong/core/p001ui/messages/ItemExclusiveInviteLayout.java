package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageChatHeat;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.ffx;
import l.j760;
import l.knb0;
import l.mkd0;
import l.mqi0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemExclusiveInviteLayout extends LinearLayout implements InterfaceC0102a, c0.c {

    /* JADX INFO: renamed from: d */
    public static int f830d;

    /* JADX INFO: renamed from: a */
    public VText f831a;

    /* JADX INFO: renamed from: b */
    public VText f832b;

    /* JADX INFO: renamed from: c */
    public VText f833c;

    public ItemExclusiveInviteLayout(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
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
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, final Message message, InterfaceC0102a.a aVar) {
        xdl0.M(this.f833c, false);
        final MessageChatHeat messageChatHeat = null;
        xdl0.E0(this.f833c, (View.OnClickListener) null);
        CoreModule.c.t1.u("exclusive_tag_" + ((DbObject) message).id);
        try {
            messageChatHeat = (MessageChatHeat) MessageChatHeat.JSON_ADAPTER.parse(message.msgData);
        } catch (Exception unused) {
        }
        if (NullChecker.a(messageChatHeat)) {
            xdl0.E0(this, new View.OnClickListener() { // from class: l.v2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zvf0.u("e_private_chat_invite_message", "p_chat_view", new j760[]{vwb.Y("is_myself", Boolean.valueOf(message.isMe())), vwb.Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration))});
                }
            });
            zvf0.A("e_private_chat_invite_message", "p_chat_view", new j760[]{vwb.Y("is_myself", Boolean.valueOf(message.isMe())), vwb.Y("is_private_chat_invite_expired", Boolean.valueOf(((double) mqi0.o()) > messageChatHeat.exclusiveChatInviteExpireTime)), vwb.Y("private_chat_duration", Integer.valueOf(messageChatHeat.exclusiveChatDuration))});
        }
        boolean zIsMe = message.isMe();
        AppCompatTextView appCompatTextView = this.f831a;
        if (zIsMe) {
            appCompatTextView.setText("1v1专属聊天邀请");
            this.f832b.setText("对方在10分钟内接受即可开启");
            return;
        }
        appCompatTextView.setText("1v1专属聊天邀请");
        if (!NullChecker.a(messageChatHeat)) {
            this.f832b.setText("专属于彼此的聊天");
            return;
        }
        xdl0.M(this.f833c, true);
        this.f832b.setText("" + messageChatHeat.exclusiveChatDuration + "分钟专属于彼此的聊天");
        if (((long) messageChatHeat.exclusiveChatStartTime) > 0) {
            this.f833c.setText("已接受");
            this.f833c.setTextColor(getContext().getResources().getColor(a1c0.l));
            return;
        }
        if (mqi0.o() >= messageChatHeat.exclusiveChatInviteExpireTime && ((long) messageChatHeat.exclusiveChatStartTime) <= 0) {
            this.f833c.setText("已失效");
            this.f833c.setTextColor(getContext().getResources().getColor(a1c0.l));
            return;
        }
        c0.a aVar2 = new c0.a();
        aVar2.a(true).b(true).h(60L).i(600L).g("exclusive_tag_" + ((DbObject) message).id).f((long) messageChatHeat.exclusiveChatInviteExpireTime).d(this);
        CoreModule.c.t1.r(aVar2);
        m1215e((long) messageChatHeat.exclusiveChatInviteExpireTime);
        if (getContext() instanceof Act) {
            dmlVar.mo3522c(getContext(), CoreModule.c.t1.n("exclusive_tag_" + ((DbObject) message).id)).subscribe((m250) mkd0.G(new e30() { // from class: l.w2q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8479a.m1214d((c0.b) obj);
                }
            }));
            xdl0.E0(this.f833c, new View.OnClickListener() { // from class: l.x2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.c.M1.l3(message2.cid, ((DbObject) message2).id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1214d(c0.b bVar) {
        m1215e(bVar.d);
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
    /* JADX INFO: renamed from: e */
    public final void m1215e(long j) {
        long jO = mqi0.o();
        if (jO > j) {
            this.f833c.setText("已失效");
            this.f833c.setTextColor(getContext().getResources().getColor(a1c0.l));
            xdl0.E0(this.f833c, (View.OnClickListener) null);
            CoreModule.c.f0.Fo();
            return;
        }
        long j2 = j - jO;
        if (j2 >= 600000) {
            this.f833c.setText("接受邀请");
        } else {
            int iMax = Math.max(0, (int) (j2 / 1000));
            this.f833c.setText("接受邀请 " + iMax + "s");
        }
        this.f833c.setTextColor(getContext().getResources().getColor(a1c0.o));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.widget.TextView, v.VText] */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f831a = (VText) findViewById(y4c0.Q4);
        this.f832b = (VText) findViewById(y4c0.n4);
        ?? r0 = (VText) findViewById(y4c0.b);
        this.f833c = r0;
        r0.getPaint().setFakeBoldText(true);
        this.f831a.getPaint().setFakeBoldText(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        f830d = iD;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), i2);
        setMeasuredDimension(f830d, getMeasuredHeight());
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemExclusiveInviteLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
