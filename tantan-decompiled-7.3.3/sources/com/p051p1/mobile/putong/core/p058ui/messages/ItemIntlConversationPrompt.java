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
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p151v.VFrame;
import p151v.VText;
import p153l.bjq;
import p153l.edc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.n100;
import p153l.q8g0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIntlConversationPrompt extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f31894a;

    public ItemIntlConversationPrompt(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31894a = (VText) findViewById(edc0.f93487x3);
    }

    /* JADX INFO: renamed from: p */
    public final String m49410p() {
        String string = CoreModule.f18263b.getString(R$string.f21744j4);
        String string2 = CoreModule.f18263b.getString(R$string.f21645Y2);
        String string3 = CoreModule.f18263b.getString(R$string.f21697e2);
        try {
            return string2 + "<a href = \"tantan://webview?url=" + URLEncoder.encode("https://m.tantanapp.com/middle-platform/communityConvention&title=" + string, "UTF-8") + "\">" + string3 + "</a>";
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return string2 + "<a href = \"tantan://webview?url=https://m.tantanapp.com/middle-platform/communityConvention&title=" + string + "\">" + string3 + "</a>";
        }
    }

    /* JADX INFO: renamed from: s */
    public void m49411s(Message message, n100 n100Var) {
        int iM32818J6;
        String strM49410p = m49410p();
        message.value = strM49410p;
        if (bjq.m104639b(strM49410p)) {
            this.f31894a.setText(ItemText.m49908p(message.value.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            this.f31894a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if (!TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f31894a.setText(q8g0.m175796b0(Html.fromHtml(message.value).toString(), jyb.m147507f0(strArrSplit2[0]), -98787, lyh0.m156283c(2)));
                    return;
                }
            }
            this.f31894a.setText(message.value);
            return;
        }
        if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM32818J6 = CoreModule.f18264c.f20387g0.m32818J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f31894a.setText(!jyb.m147479J(conversationNotification.params) ? CoreModule.f18263b.getString(iM32818J6, conversationNotification.params.toArray()) : CoreModule.f18263b.getString(iM32818J6));
                    return;
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        this.f31894a.setText(message.value);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
