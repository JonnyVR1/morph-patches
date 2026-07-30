package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class sk80 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f164941b = new sk80();

    /* JADX INFO: renamed from: d */
    public static j4m m184577d() {
        return f164941b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        ConversationAdditional conversationAdditional = pi6Var.f149101a.additional;
        if (conversationAdditional == null || vwb.m200296J(conversationAdditional.previewTexts)) {
            return false;
        }
        return !TextUtils.isEmpty(pi6Var.f149101a.additional.previewTexts.get(0));
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c(pi6Var.f149101a.additional.previewTexts.get(0));
    }
}
