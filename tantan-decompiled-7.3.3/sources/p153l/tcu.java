package p153l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class tcu implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f173274b = new tcu();

    /* JADX INFO: renamed from: d */
    public static z6m m190496d() {
        return f173274b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (sj6Var.f168913D.m195715c0(sj6Var)) {
            return false;
        }
        ConversationItemView conversationItemView = sj6Var.f168913D;
        return conversationItemView.m195685H(sj6Var, conversationItemView.m195703U0(sj6Var)) && !sj6Var.f168913D.m195724n(sj6Var.f168926a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        String strM195694O0;
        boolean z;
        int color;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (gra.m131657a2()) {
            ConversationItemView conversationItemView = sj6Var.f168913D;
            UserLiveLabel userLiveLabelM195711a0 = conversationItemView.m195711a0(sj6Var, conversationItemView.m195705V0(sj6Var.f168930e));
            if (vq8.m202358b() && gra.m131657a2() && TEnum.equals(sj6Var.f168926a.status, "default") && userLiveLabelM195711a0 != null) {
                strM195694O0 = sj6Var.f168913D.m195695P0(sj6Var, userLiveLabelM195711a0);
                if ("onVoice".equals(userLiveLabelM195711a0.liveState)) {
                    z = true;
                }
                if (!TextUtils.isEmpty(strM195694O0)) {
                    color = Color.parseColor("#ff5eea");
                    if (z) {
                        color = Color.parseColor("#32C3BB");
                    }
                    SpannableString spannableString = new SpannableString(strM195694O0);
                    spannableString.setSpan(new ForegroundColorSpan(color), 0, strM195694O0.length(), 33);
                    spannableString.setSpan(new StyleSpan(1), 0, strM195694O0.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                return spannableStringBuilder;
            }
            strM195694O0 = "";
        } else {
            strM195694O0 = sj6Var.f168913D.m195694O0(sj6Var, false, sj6Var.f168930e);
        }
        z = false;
        if (!TextUtils.isEmpty(strM195694O0)) {
            color = Color.parseColor("#ff5eea");
            if (z) {
                color = Color.parseColor("#32C3BB");
            }
            SpannableString spannableString2 = new SpannableString(strM195694O0);
            spannableString2.setSpan(new ForegroundColorSpan(color), 0, strM195694O0.length(), 33);
            spannableString2.setSpan(new StyleSpan(1), 0, strM195694O0.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }
}
