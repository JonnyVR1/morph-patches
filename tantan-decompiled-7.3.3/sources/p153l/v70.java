package p153l;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/v70;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class v70 {

    @NotNull
    public static final v70 INSTANCE = new v70();

    /* JADX INFO: renamed from: l.v70$a */
    @RequiresApi(30)
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/v70$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C20778a {

        @NotNull
        public static final C20778a INSTANCE = new C20778a();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final int m200164a() {
            return SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m200163a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C20778a.INSTANCE.m200164a();
        }
        return 0;
    }
}
