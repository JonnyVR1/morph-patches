package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class skv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f165020a;

    public skv0(@Nullable String str) {
        this.f165020a = str;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f165020a)) {
            return;
        }
        bundle.putString("query_info", this.f165020a);
    }
}
