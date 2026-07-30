package p153l;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\b¨\u0006\u0014"}, m88121d2 = {"Ll/tjw;", "", "<init>", "()V", "Ll/url;", "hostSwitch", "", "b", "(Ll/url;)V", "", "originHost", "Landroid/net/Uri;", "uri", "a", "(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;", "Ll/url;", "getCustomHostSwitch", "()Ll/url;", "setCustomHostSwitch", "customHostSwitch", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class tjw {
    public static final tjw INSTANCE = new tjw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static url customHostSwitch;

    private tjw() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m191459a(@Nullable String originHost, @Nullable Uri uri) {
        String strMo197629a;
        url urlVar = customHostSwitch;
        return (urlVar == null || (strMo197629a = urlVar.mo197629a(originHost, uri)) == null) ? originHost : strMo197629a;
    }

    /* JADX INFO: renamed from: b */
    public final void m191460b(@Nullable url hostSwitch) {
        customHostSwitch = hostSwitch;
    }
}
