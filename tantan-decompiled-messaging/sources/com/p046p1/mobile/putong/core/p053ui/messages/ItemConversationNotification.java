package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConversationNotification;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p147v.VFrame;
import p147v.VText;
import p149l.a1c0;
import p149l.bhq;
import p149l.eqh0;
import p149l.i0g0;
import p149l.qsz;
import p149l.ura;
import p149l.vwb;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemConversationNotification extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f30906a;

    /* JADX INFO: renamed from: b */
    public boolean f30907b;

    public ItemConversationNotification(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30906a = (VText) findViewById(y4c0.f195982I2);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30906a.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m48112p(Message message, qsz qszVar) {
        int iM31815J6;
        if (CoreModule.m29934N().mo60374n7() && NullChecker.m81303a(message) && User.isAiStory(message.owner) && !this.f30907b) {
            this.f30907b = true;
            zvf0.m220402x("e_ai_story_chat_limit_tips", OMSDialogPositon.p_chat_view);
        }
        m48113s(message, qszVar);
        if ((TEnum.equals(message.messageType, MessageType.common_tip) || TEnum.equals(message.messageType, MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.two_sides_different_tip) || TEnum.equals(message.messageType, MessageType.harass_alert)) && !TextUtils.isEmpty(message.value) && bhq.m101910b(message.value)) {
            this.f30906a.setText(ItemText.m48725p(message.value.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            this.f30906a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if ((TEnum.equals(message.messageType(), MessageType.common_tip) || TEnum.equals(message.messageType(), MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.two_sides_different_tip)) && !TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f30906a.setText(i0g0.m133861b0(Html.fromHtml(message.value).toString(), vwb.m200324f0(strArrSplit2[0]), -98787, eqh0.m117752c(2)));
                    return;
                }
            }
            this.f30906a.setText(message.value);
            return;
        }
        if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM31815J6 = CoreModule.f17545c.f19645g0.m31815J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f30906a.setText(!vwb.m200296J(conversationNotification.params) ? CoreModule.f17544b.getString(iM31815J6, conversationNotification.params.toArray()) : CoreModule.f17544b.getString(iM31815J6));
                    return;
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
        this.f30906a.setText(message.value);
    }

    /* JADX INFO: renamed from: s */
    public final void m48113s(Message message, qsz qszVar) {
        if (qszVar.m176377a(message.f56011id)) {
            return;
        }
        qszVar.m176378b(message.f56011id);
        if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip)) {
            boolean zIsMe = message.isMe();
            MessageAdditionalData messageAdditionalData = message.additionalData;
            MessageTipsContent messageTipsContent = zIsMe ? messageAdditionalData.twoSidesDifferentTip.selfShown : messageAdditionalData.twoSidesDifferentTip.otherShown;
            if (!NullChecker.m81303a(messageTipsContent) || TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
            String str = messageTipsContent.statsModuleId;
            if (zIsEmpty) {
                zvf0.m220402x(str, OMSDialogPositon.p_chat_view);
            } else {
                try {
                    zvf0.m220404z(str, OMSDialogPositon.p_chat_view, new JSONObject(messageTipsContent.statsModuleParameter));
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
