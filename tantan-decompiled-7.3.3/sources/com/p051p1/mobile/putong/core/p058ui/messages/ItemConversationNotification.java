package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConversationNotification;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p151v.VFrame;
import p151v.VText;
import p153l.bjq;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.n100;
import p153l.q8g0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemConversationNotification extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f31754a;

    /* JADX INFO: renamed from: b */
    public boolean f31755b;

    public ItemConversationNotification(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31754a = (VText) findViewById(edc0.f93217I2);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31754a.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m49295p(Message message, n100 n100Var) {
        int iM32818J6;
        if (CoreModule.m30932N().mo61558n7() && NullChecker.m82486a(message) && User.isAiStory(message.owner) && !this.f31755b) {
            this.f31755b = true;
            i4g0.m138526x("e_ai_story_chat_limit_tips", OMSDialogPositon.p_chat_view);
        }
        m49296s(message, n100Var);
        if ((TEnum.equals(message.messageType, MessageType.common_tip) || TEnum.equals(message.messageType, MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.two_sides_different_tip) || TEnum.equals(message.messageType, MessageType.harass_alert)) && !TextUtils.isEmpty(message.value) && bjq.m104639b(message.value)) {
            this.f31754a.setText(ItemText.m49908p(message.value.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            this.f31754a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if ((TEnum.equals(message.messageType(), MessageType.common_tip) || TEnum.equals(message.messageType(), MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.two_sides_different_tip)) && !TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f31754a.setText(q8g0.m175796b0(Html.fromHtml(message.value).toString(), jyb.m147507f0(strArrSplit2[0]), -98787, lyh0.m156283c(2)));
                    return;
                }
            }
            this.f31754a.setText(message.value);
            return;
        }
        if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM32818J6 = CoreModule.f18264c.f20387g0.m32818J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f31754a.setText(!jyb.m147479J(conversationNotification.params) ? CoreModule.f18263b.getString(iM32818J6, conversationNotification.params.toArray()) : CoreModule.f18263b.getString(iM32818J6));
                    return;
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        this.f31754a.setText(message.value);
    }

    /* JADX INFO: renamed from: s */
    public final void m49296s(Message message, n100 n100Var) {
        if (n100Var.m161054a(message.f56859id)) {
            return;
        }
        n100Var.m161055b(message.f56859id);
        if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip)) {
            boolean zIsMe = message.isMe();
            MessageAdditionalData messageAdditionalData = message.additionalData;
            MessageTipsContent messageTipsContent = zIsMe ? messageAdditionalData.twoSidesDifferentTip.selfShown : messageAdditionalData.twoSidesDifferentTip.otherShown;
            if (!NullChecker.m82486a(messageTipsContent) || TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(messageTipsContent.statsModuleParameter);
            String str = messageTipsContent.statsModuleId;
            if (zIsEmpty) {
                i4g0.m138526x(str, OMSDialogPositon.p_chat_view);
            } else {
                try {
                    i4g0.m138528z(str, OMSDialogPositon.p_chat_view, new JSONObject(messageTipsContent.statsModuleParameter));
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
