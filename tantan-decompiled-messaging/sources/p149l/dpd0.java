package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class dpd0 extends bqd0<AiChatAdviceConvs> {
    public dpd0(String str) {
        super(str, null);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull AiChatAdviceConvs aiChatAdviceConvs, AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs.equals(aiChatAdviceConvs2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs copyed(AiChatAdviceConvs aiChatAdviceConvs, @NonNull AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs2.mo223809clone();
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (NullChecker.m81303a(string)) {
            try {
                return AiChatAdviceConvs.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(AiChatAdviceConvs aiChatAdviceConvs) {
        return pref().edit().putString(this.f98687id, aiChatAdviceConvs.toJson());
    }
}
