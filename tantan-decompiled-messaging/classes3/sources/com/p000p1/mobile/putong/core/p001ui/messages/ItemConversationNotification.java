package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConversationNotification;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.bhq;
import l.i0g0;
import l.ura;
import l.vwb;
import l.y4c0;
import l.zvf0;
import org.json.JSONObject;
import p003l.eqh0;
import p003l.qsz;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemConversationNotification extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f797a;

    /* JADX INFO: renamed from: b */
    public boolean f798b;

    public ItemConversationNotification(Context context) {
        super(context);
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
        this.f797a = (VText) findViewById(y4c0.I2);
        if (ura.e().d().I4()) {
            this.f797a.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1192p(Message message, qsz qszVar) {
        int iJ6;
        if (CoreModule.N().n7() && NullChecker.a(message) && User.isAiStory(message.owner) && !this.f798b) {
            this.f798b = true;
            zvf0.x("e_ai_story_chat_limit_tips", "p_chat_view");
        }
        m1193s(message, qszVar);
        if ((TEnum.equals(message.messageType, "common_tip") || TEnum.equals(message.messageType, "common_tip_list_show") || TEnum.equals(message.messageType(), "two_sides_different_tip") || TEnum.equals(message.messageType, "harass_alert")) && !TextUtils.isEmpty(message.value) && bhq.b(message.value)) {
            this.f797a.setText(ItemText.m1809p(message.value.replaceAll("\n", "<br/>"), message));
            this.f797a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if ((TEnum.equals(message.messageType(), "common_tip") || TEnum.equals(message.messageType(), "common_tip_list_show") || TEnum.equals(message.messageType(), "two_sides_different_tip")) && !TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f797a.setText(i0g0.b0(Html.fromHtml(message.value).toString(), vwb.f0(new String[]{strArrSplit2[0]}), -98787, eqh0.m3924c(2)));
                    return;
                }
            }
            this.f797a.setText(message.value);
            return;
        }
        if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iJ6 = CoreModule.c.g0.J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f797a.setText(!vwb.J(conversationNotification.params) ? CoreModule.b.getString(iJ6, conversationNotification.params.toArray()) : CoreModule.b.getString(iJ6));
                    return;
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
        this.f797a.setText(message.value);
    }

    /* JADX INFO: renamed from: s */
    public final void m1193s(Message message, qsz qszVar) {
        if (qszVar.m7030a(((DbObject) message).id)) {
            return;
        }
        qszVar.m7031b(((DbObject) message).id);
        if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.twoSidesDifferentTip)) {
            boolean zIsMe = message.isMe();
            MessageAdditionalData messageAdditionalData = message.additionalData;
            MessageTipsContent messageTipsContent = zIsMe ? messageAdditionalData.twoSidesDifferentTip.selfShown : messageAdditionalData.twoSidesDifferentTip.otherShown;
            if (!NullChecker.a(messageTipsContent) || TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
            String str = messageTipsContent.statsModuleId;
            if (zIsEmpty) {
                zvf0.x(str, "p_chat_view");
            } else {
                try {
                    zvf0.z(str, "p_chat_view", new JSONObject(messageTipsContent.statsModuleParameter));
                } catch (Exception unused) {
                }
            }
        }
    }

    public ItemConversationNotification(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemConversationNotification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
