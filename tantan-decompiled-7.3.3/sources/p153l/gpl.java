package p153l;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public interface gpl<V extends View> {
    /* JADX INFO: renamed from: a */
    default float mo115538a() {
        return TextUtils.isEmpty(mo115539f()) ? 0.0f : 1.0f;
    }

    /* JADX INFO: renamed from: f */
    String mo115539f();

    /* JADX INFO: renamed from: g */
    void mo115540g(V v2, boolean z);
}
