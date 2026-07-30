package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sk80 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f20320b = new sk80();

    /* JADX INFO: renamed from: d */
    public static j4m m22228d() {
        return f20320b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        ConversationAdditional conversationAdditional = pi6Var.f18622a.additional;
        if (conversationAdditional == null || vwb.J(conversationAdditional.previewTexts)) {
            return false;
        }
        return !TextUtils.isEmpty((CharSequence) pi6Var.f18622a.additional.previewTexts.get(0));
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c((String) pi6Var.f18622a.additional.previewTexts.get(0));
    }
}
