package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class ws80 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f190602b = new ws80();

    /* JADX INFO: renamed from: d */
    public static z6m m207748d() {
        return f190602b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        ConversationAdditional conversationAdditional = sj6Var.f168926a.additional;
        if (conversationAdditional == null || jyb.m147479J(conversationAdditional.previewTexts)) {
            return false;
        }
        return !TextUtils.isEmpty(sj6Var.f168926a.additional.previewTexts.get(0));
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c(sj6Var.f168926a.additional.previewTexts.get(0));
    }
}
