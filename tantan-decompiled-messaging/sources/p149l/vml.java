package p149l;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public interface vml<V extends View> {
    /* JADX INFO: renamed from: a */
    default float mo106286a() {
        return TextUtils.isEmpty(mo106287f()) ? 0.0f : 1.0f;
    }

    /* JADX INFO: renamed from: f */
    String mo106287f();

    /* JADX INFO: renamed from: g */
    void mo106288g(V v2, boolean z);
}
