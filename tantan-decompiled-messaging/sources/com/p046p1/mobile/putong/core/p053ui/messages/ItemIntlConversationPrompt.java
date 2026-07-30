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
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p147v.VFrame;
import p147v.VText;
import p149l.bhq;
import p149l.eqh0;
import p149l.i0g0;
import p149l.qsz;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIntlConversationPrompt extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f31046a;

    public ItemIntlConversationPrompt(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31046a = (VText) findViewById(y4c0.f196252x3);
    }

    /* JADX INFO: renamed from: p */
    public final String m48227p() {
        String string = CoreModule.f17544b.getString(R$string.f21002j4);
        String string2 = CoreModule.f17544b.getString(R$string.f20903Y2);
        String string3 = CoreModule.f17544b.getString(R$string.f20955e2);
        try {
            return string2 + "<a href = \"tantan://webview?url=" + URLEncoder.encode("https://m.tantanapp.com/middle-platform/communityConvention&title=" + string, "UTF-8") + "\">" + string3 + "</a>";
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return string2 + "<a href = \"tantan://webview?url=https://m.tantanapp.com/middle-platform/communityConvention&title=" + string + "\">" + string3 + "</a>";
        }
    }

    /* JADX INFO: renamed from: s */
    public void m48228s(Message message, qsz qszVar) {
        int iM31815J6;
        String strM48227p = m48227p();
        message.value = strM48227p;
        if (bhq.m101910b(strM48227p)) {
            this.f31046a.setText(ItemText.m48725p(message.value.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            this.f31046a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if (!TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f31046a.setText(i0g0.m133861b0(Html.fromHtml(message.value).toString(), vwb.m200324f0(strArrSplit2[0]), -98787, eqh0.m117752c(2)));
                    return;
                }
            }
            this.f31046a.setText(message.value);
            return;
        }
        if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM31815J6 = CoreModule.f17545c.f19645g0.m31815J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f31046a.setText(!vwb.m200296J(conversationNotification.params) ? CoreModule.f17544b.getString(iM31815J6, conversationNotification.params.toArray()) : CoreModule.f17544b.getString(iM31815J6));
                    return;
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
        this.f31046a.setText(message.value);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
