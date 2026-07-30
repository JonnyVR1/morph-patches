package p149l;

import android.content.Context;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/dkj;", "Ll/c580;", "Landroid/content/Context;", "context", "Lcom/facebook/login/LoginClient$Request;", SocialConstants.TYPE_REQUEST, "<init>", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/os/Bundle;", "data", "", "e", "(Landroid/os/Bundle;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class dkj extends c580 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkj(@NotNull Context context, @NotNull LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.getApplicationId(), request.getNonce());
        context.getClass();
        request.getClass();
    }

    @Override // p149l.c580
    /* JADX INFO: renamed from: e */
    public void mo105284e(@NotNull Bundle data) {
        data.getClass();
    }
}
