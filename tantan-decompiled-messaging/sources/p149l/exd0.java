package p149l;

import android.content.Intent;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/exd0;", "Ll/kxd0;", "<init>", "()V", "Ll/w2e0;", SocialConstants.TYPE_REQUEST, "Ll/f30;", "", "errorAction", "Landroid/content/Intent;", "c", "(Ll/w2e0;Ll/f30;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class exd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(@Nullable w2e0 request, @Nullable f30<String, String> errorAction) {
        if (qx5.INSTANCE.m176942d() == -1 || request == null) {
            return null;
        }
        Intent intentM151850f = lva.m151850f(request.m201094b());
        intentM151850f.putExtra("horoscope_dialog", request.m201095c());
        return intentM151850f;
    }
}
