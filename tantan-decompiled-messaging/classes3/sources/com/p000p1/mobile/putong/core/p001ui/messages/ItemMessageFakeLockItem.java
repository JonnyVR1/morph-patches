package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.knb0;
import l.mkd0;
import l.o6j0;
import l.xdl0;
import l.y4c0;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p028v.VFrame;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageFakeLockItem extends VFrame implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemText f1057a;

    /* JADX INFO: renamed from: b */
    public VImage f1058b;

    /* JADX INFO: renamed from: c */
    public int f1059c;

    public ItemMessageFakeLockItem(Context context) {
        super(context);
    }

    private Act getAct() {
        return xdl0.E(this);
    }

    private String getSafeSourceFrom() {
        if (!(getAct() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM4255j3 = getAct().f1531f.m4255j3();
        if (!NullChecker.a(conversationM4255j3)) {
            return "";
        }
        if (conversationM4255j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM4255j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m1482u(View view) {
        o6j0.c("e_im_fake_to_good", "p_chat_view", new o6j0.a[]{o6j0.a.h("source_from", getSafeSourceFrom())});
        CoreModule.P().i().D1(getAct());
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

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, final Message message, InterfaceC0102a.a aVar) {
        xdl0.E0(this, (View.OnClickListener) null);
        dmlVar.mo3522c(getAct(), CoreModule.c.e0.o9()).subscribe((m250) mkd0.G(new e30() { // from class: l.o7q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6051a.m1483v(message, (User) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1057a = (ItemText) findViewById(y4c0.Y1);
        this.f1058b = (VImage) findViewById(y4c0.X1);
        this.f1059c = this.f1057a.getCurrentTextColor();
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
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1483v(Message message, User user) {
        xdl0.E0(this, (View.OnClickListener) null);
        xdl0.M(this.f1058b, true);
        if (user.isRiskAuditAvatar()) {
            this.f1057a.setTextColor(-98787);
            this.f1057a.setText("资料审核中");
            return;
        }
        boolean zS0 = CoreModule.P().i().S0();
        AppCompatTextView appCompatTextView = this.f1057a;
        if (zS0) {
            appCompatTextView.setTextColor(-98787);
            this.f1057a.setText("点击上传头像后解锁");
            xdl0.E0(this, new View.OnClickListener() { // from class: l.p7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6328a.m1482u(view);
                }
            });
        } else {
            appCompatTextView.setTextColor(this.f1059c);
            this.f1057a.setText(message.value);
            xdl0.M(this.f1058b, false);
        }
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageFakeLockItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
