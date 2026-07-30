package p153l;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Landroid/content/Context;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ljava/io/File;", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "datastore-preferences_release"}, m88122k = 2, m88123mv = {1, 5, 1}, m88125xi = 48)
@JvmName
public final class aq80 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final File m99440a(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return q6c.m175547a(context, Intrinsics.m88385l(str, ".preferences_pb"));
    }
}
