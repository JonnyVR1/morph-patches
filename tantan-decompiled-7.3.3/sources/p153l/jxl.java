package p153l;

import android.content.Context;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/jxl;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ll/ijw;", SocialConstants.TYPE_REQUEST, "Ll/kxl;", "responseCallback", "", "b", "(Landroid/content/Context;Ll/ijw;Ll/kxl;)V", "Ll/jjw;", "a", "(Ll/ijw;)Ll/jjw;", "Ll/jjw;", "getMkResponse", "()Ll/jjw;", "setMkResponse", "(Ll/jjw;)V", "mkResponse", "Ll/kxl;", "getResponseCallback", "()Ll/kxl;", "setResponseCallback", "(Ll/kxl;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class jxl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public jjw mkResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private kxl responseCallback;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final jjw m147365a(@Nullable ijw request) {
        return new jjw(request);
    }

    /* JADX INFO: renamed from: b */
    public void m147366b(@Nullable Context context, @Nullable ijw request, @Nullable kxl responseCallback) {
        this.mkResponse = m147365a(request);
        this.responseCallback = responseCallback;
    }
}
