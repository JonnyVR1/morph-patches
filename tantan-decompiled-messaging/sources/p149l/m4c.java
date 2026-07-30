package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.nativelib.manager.bean.LibraryZipInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR.\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR(\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001a¨\u00060"}, m87232d2 = {"Ll/m4c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "", "Lcom/tantanapp/common/nativelib/manager/bean/LibraryZipInfo;", "b", "Ljava/util/Map;", "getDownloadInfoList", "()Ljava/util/Map;", "setDownloadInfoList", "(Ljava/util/Map;)V", "downloadInfoList", "", "c", "Ljava/util/List;", "getShouldDownload", "()Ljava/util/List;", "setShouldDownload", "(Ljava/util/List;)V", "shouldDownload", Constants.INAPP_DATA_TAG, "getDownloadedList", "setDownloadedList", "downloadedList", "e", "getDownloadFailedList", "setDownloadFailedList", "downloadFailedList", "f", "getShouldInstallList", "setShouldInstallList", "shouldInstallList", "g", "getInstallFailedList", "setInstallFailedList", "installFailedList", "h", "getInstalledList", "setInstalledList", "installedList", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class m4c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Map<String, LibraryZipInfo> downloadInfoList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<String> shouldDownload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<String> downloadedList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<String> downloadFailedList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public Map<String, LibraryZipInfo> shouldInstallList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<String> installFailedList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<String> installedList;

    public m4c(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.downloadInfoList = new LinkedHashMap();
        this.shouldDownload = new ArrayList();
        this.downloadedList = new ArrayList();
        this.downloadFailedList = new ArrayList();
        this.shouldInstallList = new LinkedHashMap();
        this.installFailedList = new ArrayList();
        this.installedList = new ArrayList();
    }
}
