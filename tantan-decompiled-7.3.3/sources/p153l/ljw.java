package p153l;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.text.C15493d;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/ljw;", "", "<init>", "()V", "", "api", "a", "(Ljava/lang/String;)Ljava/lang/String;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ljw {
    public static final ljw INSTANCE = new ljw();

    private ljw() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m154581a(@Nullable String api) {
        if (sjw.m186319h()) {
            try {
                String strM96337c = a6k0.INSTANCE.m96337c(api);
                if (api != null && (C15493d.m94374J(api, "https", false, 2, null) || C15493d.m94374J(api, "http", false, 2, null))) {
                    if (!TextUtils.isEmpty(strM96337c) && glw.m130712i(strM96337c)) {
                        return api;
                    }
                }
                if (api != null && !C15493d.m94374J(api, "https://api.immomo.com/", false, 2, null)) {
                    if (C15493d.m94374J(api, "/", false, 2, null)) {
                        api = api.substring(1);
                    }
                    return "https://api.immomo.com/".concat(api);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return api;
            }
        }
        return api;
    }
}
