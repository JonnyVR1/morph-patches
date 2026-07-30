package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ContinuousChatTip;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.b86;
import l.c3c0;
import l.hvc0;
import l.i0g0;
import l.i25;
import l.o6j0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;
import p003l.eqh0;
import p003l.j000;
import p003l.qsz;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ChatTipsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ChatTipsItem f590a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f591b;

    /* JADX INFO: renamed from: c */
    public ItemText f592c;

    /* JADX INFO: renamed from: d */
    public ItemText f593d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ChatTipsItem$a */
    public class C0057a extends ClickableSpan {
        public C0057a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            CoreModule.K().Fo(ChatTipsItem.this.getContext());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ChatTipsItem.this.getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.o));
        }
    }

    public ChatTipsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m950b(View view) {
        i25.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m951c(ContinuousChatTip continuousChatTip, View view) {
        o6j0.c("e_chat_continuous_chat_tips_message", "p_chat_view", new o6j0.a[0]);
        if (getContext() instanceof Act) {
            b86.c(getContext(), continuousChatTip.clickH5Url);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m952d(int i, Message message, qsz qszVar) {
        if (message == null) {
            return;
        }
        xdl0.M(this.f591b, false);
        xdl0.M(this.f593d, false);
        MessageTipsContent messageTipsContentM5264N = j000.m5264N(message);
        xdl0.M(this.f592c, true);
        if (i == 249 && TEnum.equals(message.messageType, "local_friend_active_remind_female")) {
            this.f592c.setText(getFriendActiveRemindFemaleText());
            this.f592c.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (i == 252 && TEnum.equals(message.messageType, "continuous_chat_tip")) {
            setContinuousChatTip(message);
        } else if (!NullChecker.a(messageTipsContentM5264N) || (TextUtils.isEmpty(messageTipsContentM5264N.value) && TextUtils.isEmpty(messageTipsContentM5264N.androidValue))) {
            xdl0.M(this.f592c, false);
        } else {
            if (!TextUtils.isEmpty(messageTipsContentM5264N.statsModuleId) && !qszVar.m7030a(((DbObject) message).id)) {
                qszVar.m7031b(((DbObject) message).id);
                String strPageId = getContext() instanceof Act ? getContext().pageId() : "";
                boolean zIsEmpty = TextUtils.isEmpty(messageTipsContentM5264N.statsModuleParameter);
                String str = messageTipsContentM5264N.statsModuleId;
                if (zIsEmpty) {
                    zvf0.x(str, strPageId);
                } else {
                    try {
                        zvf0.z(str, strPageId, new JSONObject(messageTipsContentM5264N.statsModuleParameter));
                    } catch (Exception unused) {
                    }
                }
            }
            if (!TextUtils.isEmpty(messageTipsContentM5264N.androidValue) && NullChecker.a(message.extData) && NullChecker.a(message.extData.chatTips)) {
                messageTipsContentM5264N.value = messageTipsContentM5264N.androidValue;
                if (NullChecker.a(message.extData.chatTips.selfShown)) {
                    MessageTipsContent messageTipsContent = message.extData.chatTips.selfShown;
                    messageTipsContent.value = messageTipsContent.androidValue;
                }
                if (NullChecker.a(message.extData.chatTips.otherShown)) {
                    MessageTipsContent messageTipsContent2 = message.extData.chatTips.otherShown;
                    messageTipsContent2.value = messageTipsContent2.androidValue;
                }
            }
            boolean zEquals = TextUtils.equals(messageTipsContentM5264N.style, "redBackground");
            AppCompatTextView appCompatTextView = this.f592c;
            if (zEquals) {
                appCompatTextView.setBackground(hvc0.b(c3c0.f1));
                xdl0.h0(this.f592c, t100.j);
            } else {
                appCompatTextView.setBackground(null);
                xdl0.h0(this.f592c, 0);
            }
            this.f592c.m1811D(messageTipsContentM5264N.value, message);
        }
        this.f592c.setGravity(17);
    }

    public CharSequence getFriendActiveRemindFemaleText() {
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0("对方没有回复？系统将为您再次提醒对方\n点击可关闭", vwb.M("点击可关闭"), ura.e().d().I4() ? a1c0.j : a1c0.o, eqh0.m3924c(3));
        spannableStringBuilderB0.setSpan(new C0057a(), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".indexOf("点击可关闭"), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".length(), 33);
        return spannableStringBuilderB0;
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
        m950b(this);
        if (ura.e().d().I4()) {
            this.f592c.setTextColor(getResources().getColor(a1c0.i));
            this.f593d.setTextColor(getResources().getColor(a1c0.i));
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
    public void setContinuousChatTip(Message message) {
        if (!NullChecker.a(message) || !NullChecker.a(message.additionalData) || !NullChecker.a(message.additionalData.continuousChatTip)) {
            xdl0.M(this.f592c, false);
            return;
        }
        final ContinuousChatTip continuousChatTip = message.additionalData.continuousChatTip;
        if (continuousChatTip.days > 0) {
            xdl0.M(this.f591b, true);
            xdl0.M(this.f593d, true);
            qib0.G.L0(this.f591b, continuousChatTip.flameImgUrl);
            this.f592c.setText(String.format("已连续聊天%d天，点亮", Integer.valueOf(continuousChatTip.days)));
            this.f593d.setText("标识");
            this.f592c.setTextColor(Color.parseColor("#FF8231"));
            this.f593d.setTextColor(Color.parseColor("#FF8231"));
            o6j0.h("e_chat_continuous_chat_tips_message", "p_chat_view", new o6j0.a[0]);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.h25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4099a.m951c(continuousChatTip, view);
            }
        });
    }

    public ChatTipsItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatTipsItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
