package p153l;

import androidx.room.C0675j;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/gtd0;", "Ll/o7h0$c;", "", "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ll/o7h0$c;)V", "Ll/o7h0$b;", "configuration", "Ll/o7h0;", "a", "(Ll/o7h0$b;)Ll/o7h0;", "Ljava/lang/String;", "b", "Ljava/io/File;", "c", "Ljava/util/concurrent/Callable;", Constants.INAPP_DATA_TAG, "Ll/o7h0$c;", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class gtd0 implements o7h0.InterfaceC19045c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String mCopyFromAssetPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final File mCopyFromFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Callable<InputStream> mCopyFromInputStream;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final o7h0.InterfaceC19045c mDelegate;

    public gtd0(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NotNull o7h0.InterfaceC19045c interfaceC19045c) {
        interfaceC19045c.getClass();
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = interfaceC19045c;
    }

    @Override // p153l.o7h0.InterfaceC19045c
    @NotNull
    /* JADX INFO: renamed from: a */
    public o7h0 mo104496a(@NotNull o7h0.C19044b configuration) {
        configuration.getClass();
        return new C0675j(configuration.context, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.callback.com.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String, this.mDelegate.mo104496a(configuration));
    }
}
