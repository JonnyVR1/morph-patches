package p009l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.qp8;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sau implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f20147b = new sau();

    /* JADX INFO: renamed from: d */
    public static j4m m22015d() {
        return f20147b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (pi6Var.f18609D.m21562c0(pi6Var)) {
            return false;
        }
        ConversationItemView conversationItemView = pi6Var.f18609D;
        return conversationItemView.m21532H(pi6Var, conversationItemView.m21550U0(pi6Var)) && !pi6Var.f18609D.m21571n(pi6Var.f18622a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        String strM21541O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (upa.a2()) {
            ConversationItemView conversationItemView = pi6Var.f18609D;
            UserLiveLabel userLiveLabelM21558a0 = conversationItemView.m21558a0(pi6Var, conversationItemView.m21552V0(pi6Var.f18626e));
            if (qp8.b() && upa.a2() && TEnum.equals(pi6Var.f18622a.status, "default") && userLiveLabelM21558a0 != null) {
                strM21541O0 = pi6Var.f18609D.m21542P0(pi6Var, userLiveLabelM21558a0);
                if ("onVoice".equals(userLiveLabelM21558a0.liveState)) {
                    z = true;
                }
                if (!TextUtils.isEmpty(strM21541O0)) {
                    color = Color.parseColor("#ff5eea");
                    if (z) {
                        color = Color.parseColor("#32C3BB");
                    }
                    SpannableString spannableString = new SpannableString(strM21541O0);
                    spannableString.setSpan(new ForegroundColorSpan(color), 0, strM21541O0.length(), 33);
                    spannableString.setSpan(new StyleSpan(1), 0, strM21541O0.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                return spannableStringBuilder;
            }
            strM21541O0 = "";
        } else {
            strM21541O0 = pi6Var.f18609D.m21541O0(pi6Var, false, pi6Var.f18626e);
        }
        z = false;
        if (!TextUtils.isEmpty(strM21541O0)) {
            color = Color.parseColor("#ff5eea");
            if (z) {
                color = Color.parseColor("#32C3BB");
            }
            SpannableString spannableString2 = new SpannableString(strM21541O0);
            spannableString2.setSpan(new ForegroundColorSpan(color), 0, strM21541O0.length(), 33);
            spannableString2.setSpan(new StyleSpan(1), 0, strM21541O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }
}
