package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class fxd0 extends dyd0<AiChatAdviceConvs> {
    public fxd0(String str) {
        super(str, null);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull AiChatAdviceConvs aiChatAdviceConvs, AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs.equals(aiChatAdviceConvs2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs copyed(AiChatAdviceConvs aiChatAdviceConvs, @NonNull AiChatAdviceConvs aiChatAdviceConvs2) {
        return aiChatAdviceConvs2.mo225055clone();
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AiChatAdviceConvs retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (NullChecker.m82486a(string)) {
            try {
                return AiChatAdviceConvs.JSON_ADAPTER.parse(string);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(AiChatAdviceConvs aiChatAdviceConvs) {
        return pref().edit().putString(this.f111993id, aiChatAdviceConvs.toJson());
    }
}
