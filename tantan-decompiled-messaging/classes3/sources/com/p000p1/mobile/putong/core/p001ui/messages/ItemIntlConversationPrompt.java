package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConversationNotification;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import l.bhq;
import l.i0g0;
import l.vwb;
import l.y4c0;
import org.eclipse.jetty.util.StringUtil;
import p003l.eqh0;
import p003l.qsz;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemIntlConversationPrompt extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f937a;

    public ItemIntlConversationPrompt(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f937a = (VText) findViewById(y4c0.x3);
    }

    /* JADX INFO: renamed from: p */
    public final String m1309p() {
        String string = CoreModule.b.getString(R.string.j4);
        String string2 = CoreModule.b.getString(R.string.Y2);
        String string3 = CoreModule.b.getString(R.string.e2);
        try {
            return string2 + "<a href = \"tantan://webview?url=" + URLEncoder.encode("https://m.tantanapp.com/middle-platform/communityConvention&title=" + string, StringUtil.__UTF8) + "\">" + string3 + "</a>";
        } catch (Exception e) {
            CrashHelper.c(e);
            return string2 + "<a href = \"tantan://webview?url=https://m.tantanapp.com/middle-platform/communityConvention&title=" + string + "\">" + string3 + "</a>";
        }
    }

    /* JADX INFO: renamed from: s */
    public void m1310s(Message message, qsz qszVar) {
        int iJ6;
        String strM1309p = m1309p();
        message.value = strM1309p;
        if (bhq.b(strM1309p)) {
            this.f937a.setText(ItemText.m1809p(message.value.replaceAll("\n", "<br/>"), message));
            this.f937a.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        if (!TextUtils.isEmpty(message.value)) {
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    this.f937a.setText(i0g0.b0(Html.fromHtml(message.value).toString(), vwb.f0(new String[]{strArrSplit2[0]}), -98787, eqh0.m3924c(2)));
                    return;
                }
            }
            this.f937a.setText(message.value);
            return;
        }
        if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.conversationNotification)) {
            ConversationNotification conversationNotification = message.additionalData.conversationNotification;
            if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iJ6 = CoreModule.c.g0.J6(conversationNotification.localeKey)) > 0) {
                try {
                    this.f937a.setText(!vwb.J(conversationNotification.params) ? CoreModule.b.getString(iJ6, conversationNotification.params.toArray()) : CoreModule.b.getString(iJ6));
                    return;
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
        this.f937a.setText(message.value);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIntlConversationPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
