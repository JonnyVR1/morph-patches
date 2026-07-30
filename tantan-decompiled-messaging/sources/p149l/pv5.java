package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006+"}, m87232d2 = {"Ll/pv5;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "", "", "b", "Ljava/util/List;", "getModuleList", "()Ljava/util/List;", "setModuleList", "(Ljava/util/List;)V", "moduleList", "", "c", "I", "getRetryDownloadTime", "()I", "setRetryDownloadTime", "(I)V", "retryDownloadTime", Constants.INAPP_DATA_TAG, "getSelectedABI", "setSelectedABI", "selectedABI", "e", "Ljava/lang/String;", "getDownloadDir", "()Ljava/lang/String;", "setDownloadDir", "(Ljava/lang/String;)V", "downloadDir", "f", "getInstallDir", "setInstallDir", "installDir", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class pv5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<String> moduleList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int retryDownloadTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<String> selectedABI;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String downloadDir;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String installDir;

    public pv5(@NotNull Context context) {
        File fileM191061f;
        File fileM191061f2;
        File fileM191061f3;
        File fileM191061f4;
        context.getClass();
        this.context = context;
        this.moduleList = new ArrayList();
        this.retryDownloadTime = 1;
        this.selectedABI = new ArrayList();
        File externalCacheDir = this.context.getExternalCacheDir();
        String absolutePath = null;
        this.downloadDir = (externalCacheDir == null || (fileM191061f3 = tyl.m191061f(externalCacheDir, ".sharedlibrary")) == null || (fileM191061f4 = tyl.m191061f(fileM191061f3, "download")) == null) ? null : fileM191061f4.getAbsolutePath();
        File externalCacheDir2 = this.context.getExternalCacheDir();
        if (externalCacheDir2 != null && (fileM191061f = tyl.m191061f(externalCacheDir2, ".sharedlibrary")) != null && (fileM191061f2 = tyl.m191061f(fileM191061f, "install")) != null) {
            absolutePath = fileM191061f2.getAbsolutePath();
        }
        this.installDir = absolutePath;
    }
}
