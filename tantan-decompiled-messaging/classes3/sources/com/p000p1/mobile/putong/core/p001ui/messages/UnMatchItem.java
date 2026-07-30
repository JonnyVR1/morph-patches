package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.ura;
import l.vkj0;
import l.xdl0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UnMatchItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UnMatchItem f1577a;

    /* JADX INFO: renamed from: b */
    public VText f1578b;

    public UnMatchItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2105a(View view) {
        vkj0.a(this, view);
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
    /* JADX INFO: renamed from: b */
    public void m2106b(User user, Message message, @Nullable Conversation conversation) {
        if (CoreModule.P().i().c()) {
            int i = message.localFailType;
            AppCompatTextView appCompatTextView = this.f1578b;
            if (i >= 1) {
                xdl0.M(appCompatTextView, true);
                if (user.onlineMatch() && message.localFailType == 2) {
                    this.f1578b.setText(user.isFemale() ? R.string.K5 : R.string.L5);
                } else {
                    this.f1578b.setText(R.string.p5);
                }
            } else {
                xdl0.M(appCompatTextView, false);
            }
        } else {
            this.f1578b.setText(R.string.p5);
        }
        int i2 = message.localFailType;
        if (i2 == 7) {
            boolean zIsEmpty = TextUtils.isEmpty(message.localExtraInfo);
            AppCompatTextView appCompatTextView2 = this.f1578b;
            if (zIsEmpty) {
                appCompatTextView2.setText("");
                return;
            } else {
                appCompatTextView2.setText(ItemText.m1809p(message.localExtraInfo.replaceAll("\n", "<br/>"), message));
                this.f1578b.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        if (i2 == 6) {
            this.f1578b.setText("信号已消失 对方已经离开了对话");
            return;
        }
        if (i2 == 5) {
            this.f1578b.setText("发送消息数已达上限，请耐心等待对方回应哦");
            return;
        }
        if (i2 == 8) {
            this.f1578b.setText(R.string.v3);
        } else if (NullChecker.a(conversation) && conversation.isHeartbeatConv() && xdl0.O0(this.f1578b)) {
            this.f1578b.setText("信号已消失 对方已经离开了对话");
        }
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
        m2105a(this);
        if (ura.e().d().I4()) {
            this.f1578b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
