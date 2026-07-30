package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f201551a;

    public ytv0(@Nullable String str) {
        this.f201551a = str;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f201551a)) {
            return;
        }
        bundle.putString("query_info", this.f201551a);
    }
}
