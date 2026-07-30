package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/zjw;", "", "<init>", "()V", "Ll/mxl;", "pDownloader", "", "b", "(Ll/mxl;)V", "", "taskId", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "Ll/yjw;", "task", "autoStart", "Ll/mxl$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Ll/yjw;ZLl/mxl$a;)V", "Ll/mxl;", "downloader", "c", "()Z", "isInitialized", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class zjw {
    public static final zjw INSTANCE = new zjw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static mxl downloader;

    private zjw() {
    }

    /* JADX INFO: renamed from: a */
    public final void m219986a(@Nullable yjw task, boolean autoStart, @Nullable mxl.InterfaceC18742a listener) {
        mxl mxlVar = downloader;
        if (mxlVar != null) {
            mxlVar.mo18422b(task, autoStart, listener);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m219987b(@Nullable mxl pDownloader) {
        downloader = pDownloader;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m219988c() {
        return downloader != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m219989d(@Nullable String taskId) {
        mxl mxlVar = downloader;
        if (mxlVar != null) {
            return mxlVar.mo18421a(taskId);
        }
        return false;
    }
}
