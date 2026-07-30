package p149l;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/z70;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class z70 {

    @NotNull
    public static final z70 INSTANCE = new z70();

    /* JADX INFO: renamed from: l.z70$a */
    @RequiresApi(30)
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/z70$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C21644a {

        @NotNull
        public static final C21644a INSTANCE = new C21644a();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final int m217428a() {
            return SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m217427a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C21644a.INSTANCE.m217428a();
        }
        return 0;
    }
}
