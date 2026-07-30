package p149l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class sau implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f163453b = new sau();

    /* JADX INFO: renamed from: d */
    public static j4m m183099d() {
        return f163453b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (pi6Var.f149088D.m178921c0(pi6Var)) {
            return false;
        }
        ConversationItemView conversationItemView = pi6Var.f149088D;
        return conversationItemView.m178891H(pi6Var, conversationItemView.m178909U0(pi6Var)) && !pi6Var.f149088D.m178930n(pi6Var.f149101a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        String strM178900O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (upa.m194726a2()) {
            ConversationItemView conversationItemView = pi6Var.f149088D;
            UserLiveLabel userLiveLabelM178917a0 = conversationItemView.m178917a0(pi6Var, conversationItemView.m178911V0(pi6Var.f149105e));
            if (qp8.m175817b() && upa.m194726a2() && TEnum.equals(pi6Var.f149101a.status, "default") && userLiveLabelM178917a0 != null) {
                strM178900O0 = pi6Var.f149088D.m178901P0(pi6Var, userLiveLabelM178917a0);
                if ("onVoice".equals(userLiveLabelM178917a0.liveState)) {
                    z = true;
                }
                if (!TextUtils.isEmpty(strM178900O0)) {
                    color = Color.parseColor("#ff5eea");
                    if (z) {
                        color = Color.parseColor("#32C3BB");
                    }
                    SpannableString spannableString = new SpannableString(strM178900O0);
                    spannableString.setSpan(new ForegroundColorSpan(color), 0, strM178900O0.length(), 33);
                    spannableString.setSpan(new StyleSpan(1), 0, strM178900O0.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                return spannableStringBuilder;
            }
            strM178900O0 = "";
        } else {
            strM178900O0 = pi6Var.f149088D.m178900O0(pi6Var, false, pi6Var.f149105e);
        }
        z = false;
        if (!TextUtils.isEmpty(strM178900O0)) {
            color = Color.parseColor("#ff5eea");
            if (z) {
                color = Color.parseColor("#32C3BB");
            }
            SpannableString spannableString2 = new SpannableString(strM178900O0);
            spannableString2.setSpan(new ForegroundColorSpan(color), 0, strM178900O0.length(), 33);
            spannableString2.setSpan(new StyleSpan(1), 0, strM178900O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }
}
