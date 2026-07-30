package p153l;

import android.content.Intent;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/i9e0;", "Ll/o5e0;", "<init>", "()V", "Ll/abe0;", SocialConstants.TYPE_REQUEST, "Ll/z20;", "", "errorAction", "Landroid/content/Intent;", "c", "(Ll/abe0;Ll/z20;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class i9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(@Nullable abe0 request, @Nullable z20<String, String> errorAction) {
        if (ami0.INSTANCE.m98831e() == -1 || request == null) {
            return null;
        }
        Intent intentM213311f = xwa.m213311f(request.m96739b());
        intentM213311f.putExtra("tarot_dialog", request.m96740c());
        return intentM213311f;
    }
}
