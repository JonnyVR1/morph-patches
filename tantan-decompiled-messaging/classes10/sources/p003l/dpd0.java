package p003l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dpd0 extends bqd0<AiChatAdviceConvs> {
    public dpd0(String str) {
        super(str, (Object) null);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull AiChatAdviceConvs aiChatAdviceConvs, AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs.equals(aiChatAdviceConvs2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs copyed(AiChatAdviceConvs aiChatAdviceConvs, @NonNull AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs2.m11592clone();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (NullChecker.a(string)) {
            try {
                return (AiChatAdviceConvs) AiChatAdviceConvs.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(AiChatAdviceConvs aiChatAdviceConvs) {
        return pref().edit().putString(((fpd0) this).id, aiChatAdviceConvs.toJson());
    }
}
