package com.tantanapp.media.ttmediautils.p078dl;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.media.ttmediautils.common.FileUtils;
import com.tantanapp.media.ttmediautils.common.MD5Utils;
import com.tantanapp.media.ttmediautils.download.Action1;
import com.tantanapp.media.ttmediautils.download.Action2;
import com.tantanapp.media.ttmediautils.download.DownloadManager;
import com.tantanapp.media.ttmediautils.download.DownloadTask;
import com.tantanapp.media.ttmediautils.log.SLog;
import com.tantanapp.media.ttmediautils.p078dl.MediaSoDynamicInstaller;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import com.tantanapp.media.ttmediautils.tinker.TinkerLoadLibrary;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p153l.azk0;
import p153l.rdd0;

/* JADX INFO: loaded from: classes12.dex */
public class MediaSoDynamicInstaller {
    private Application mContext;
    private JsonParser mJsonParser;
    private File mSDKHashPath;
    private String mSDKMd5;
    private File mSDKRootPath;
    private String mSDKSoMd5Path;
    private String mSDKUrl;
    private File mSDKZipPath;
    private String mSoPathInZipArmv7a;
    private SDKInitStatusListener mStatusListener;

    public interface JsonParser {
        <T> T fromJson(String str, Class<T> cls);
    }

    public static class SDKInitConfig {
        private Application mContext;
        private JsonParser mJsonParser;
        private String mSDKMd5;
        private String mSDKSoMd5Path;
        private String mSDKUrl;
        private String mSoPathInZipArmv7a;
        private File mSoSaveRootDir;

        public Application getContext() {
            return this.mContext;
        }

        public File getSoSaveRootDir() {
            return this.mSoSaveRootDir;
        }

        public void setApplicationContext(Application application) {
            this.mContext = application;
        }

        public void setArmv7aSoPathInZip(String str) {
            this.mSoPathInZipArmv7a = str;
        }

        public void setContext(Application application) {
            this.mContext = application;
        }

        public void setJsonParser(JsonParser jsonParser) {
            this.mJsonParser = jsonParser;
        }

        public void setSDKDownloadUrl(String str) {
            this.mSDKUrl = str;
        }

        public void setSDKMd5(String str) {
            this.mSDKMd5 = str;
        }

        public void setSDKSoMd5Path(String str) {
            this.mSDKSoMd5Path = str;
        }

        public void setSoSaveRootDir(File file) {
            this.mSoSaveRootDir = file;
        }
    }

    public interface SDKInitStatusListener {
        void onDownloading(int i);

        void onEvent(int i, @Nullable Exception exc);

        void onFailure(int i, Exception exc);

        void onSuccess();
    }

    public static class SoList {
        public ArrayList<SoMd5> list;
    }

    public static class SoMd5 {
        public String md5;
        public String name;

        public String getMd5() {
            return this.md5;
        }

        public String getName() {
            return this.name;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82573a(MediaSoDynamicInstaller mediaSoDynamicInstaller, DownloadTask downloadTask, Integer num) {
        mediaSoDynamicInstaller.getClass();
        mediaSoDynamicInstaller.onDownloading(num.intValue());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82574b(MediaSoDynamicInstaller mediaSoDynamicInstaller, DownloadTask downloadTask) {
        mediaSoDynamicInstaller.getClass();
        mediaSoDynamicInstaller.onFailure(2001, new RuntimeException("downloadAndInstall zip canceled"));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m82575c(MediaSoDynamicInstaller mediaSoDynamicInstaller, File file, DownloadTask downloadTask, File file2) {
        if (!mediaSoDynamicInstaller.checkHash(file2)) {
            SharePatchFileUtil.safeDeleteFile(file2);
            mediaSoDynamicInstaller.onFailure(1002, new IOException("Download wrong file"));
        } else {
            if (!file2.renameTo(file.getAbsoluteFile())) {
                mediaSoDynamicInstaller.onFailure(1003, new IOException("rename failed"));
                return;
            }
            mediaSoDynamicInstaller.clearOldSdks(file.getParentFile(), file);
            Entity entity = new Entity(file, true);
            mediaSoDynamicInstaller.unzip(entity);
            mediaSoDynamicInstaller.installLibs(entity);
            mediaSoDynamicInstaller.onSuccess();
        }
    }

    private boolean checkHash(File file) {
        return TextUtils.equals(this.mSDKMd5, MD5Utils.getFileMD5(file));
    }

    private void clearOldSdks(@NonNull File file, @NonNull File file2) {
        for (File file3 : file.listFiles()) {
            if (!TextUtils.equals(file3.getAbsolutePath(), file2.getAbsolutePath())) {
                try {
                    FileUtils.forceDelete(file3);
                } catch (IOException e) {
                    SLog.printStackTrace(e);
                    onEvent(1005, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82576d(MediaSoDynamicInstaller mediaSoDynamicInstaller, DownloadTask downloadTask, Throwable th) {
        mediaSoDynamicInstaller.getClass();
        mediaSoDynamicInstaller.onFailure(1004, new Exception(th));
    }

    private void downloadAndInstall(final File file) {
        try {
            ensureDirectory(this.mSDKRootPath);
            DownloadManager.getInstance().download(new DownloadTask(this.mSDKUrl, new File(file.getAbsolutePath() + ".temp"), true).onSuccess(new Action2() { // from class: l.v5y
                @Override // com.tantanapp.media.ttmediautils.download.Action2
                public final void call(Object obj, Object obj2) {
                    MediaSoDynamicInstaller.m82575c(this.f182586a, file, (DownloadTask) obj, (File) obj2);
                }
            }).onLoading(new Action2() { // from class: l.w5y
                @Override // com.tantanapp.media.ttmediautils.download.Action2
                public final void call(Object obj, Object obj2) {
                    MediaSoDynamicInstaller.m82573a(this.f187567a, (DownloadTask) obj, (Integer) obj2);
                }
            }).onFail(new Action2() { // from class: l.x5y
                @Override // com.tantanapp.media.ttmediautils.download.Action2
                public final void call(Object obj, Object obj2) {
                    MediaSoDynamicInstaller.m82576d(this.f192539a, (DownloadTask) obj, (Throwable) obj2);
                }
            }).onCancel(new Action1() { // from class: l.y5y
                @Override // com.tantanapp.media.ttmediautils.download.Action1
                public final void call(Object obj) {
                    MediaSoDynamicInstaller.m82574b(this.f197604a, (DownloadTask) obj);
                }
            }));
        } catch (Exception e) {
            onFailure(1001, e);
        }
    }

    private void installLibs(Entity entity) {
        if (entity.needUnzip && !checkSoMd5(entity.rootFolder)) {
            azk0.m101074a("so file is illegal");
            return;
        }
        File file = new File(entity.rootFolder, this.mSoPathInZipArmv7a);
        if (!isFileDirNotEmpty(file)) {
            azk0.m101074a("soFolder is empty.");
        } else {
            if (TinkerLoadLibrary.installNativeLibraryABIWithoutTinkerInstalled(this.mContext, file)) {
                return;
            }
            azk0.m101074a("TinkerLoadLibrary load fail.");
        }
    }

    public static boolean isFileDirNotEmpty(File file) {
        File[] fileArrListFiles;
        return file != null && file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0;
    }

    private void onDownloading(int i) {
        SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
        if (sDKInitStatusListener != null) {
            sDKInitStatusListener.onDownloading(i);
        }
    }

    private void onEvent(int i, @Nullable Exception exc) {
        SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
        if (sDKInitStatusListener != null) {
            sDKInitStatusListener.onEvent(i, exc);
        }
    }

    private void onFailure(int i, Exception exc) {
        File file = this.mSDKHashPath;
        if (file.exists()) {
            SharePatchFileUtil.deleteDir(file);
        }
        SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
        if (sDKInitStatusListener != null) {
            sDKInitStatusListener.onFailure(i, exc);
        }
    }

    private void onSuccess() {
        SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
        if (sDKInitStatusListener != null) {
            sDKInitStatusListener.onSuccess();
        }
    }

    private void unzip(@NonNull Entity entity) {
        if (entity.needUnzip) {
            File file = this.mSDKHashPath;
            ensureDirectory(file);
            try {
                FileUtils.decompress(entity.zipFile, file);
                entity.rootFolder = file;
                SharePatchFileUtil.safeDeleteFile(entity.zipFile);
            } catch (Exception e) {
                SharePatchFileUtil.safeDeleteFile(entity.zipFile);
                rdd0.m180845a("unzip fail:", e.getMessage());
            }
        }
    }

    public boolean checkSoMd5(File file) {
        SoList soList = (SoList) this.mJsonParser.fromJson(FileUtils.readString(new File(file, this.mSDKSoMd5Path).getAbsolutePath()), SoList.class);
        if (soList == null || soList.list == null) {
            return false;
        }
        File file2 = new File(file, this.mSoPathInZipArmv7a);
        for (SoMd5 soMd5 : soList.list) {
            File file3 = new File(file2, soMd5.getName());
            if (!file3.exists() || !soMd5.getMd5().equalsIgnoreCase(MD5Utils.getFileMD5(file3))) {
                return false;
            }
        }
        return true;
    }

    public void clearStatusListener() {
        this.mStatusListener = null;
    }

    public void ensureDirectory(File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            rdd0.m180845a("mkdirs fail : ", file.getAbsolutePath());
        } else if (file.isFile()) {
            if (!file.delete()) {
                rdd0.m180845a("delete file fail : ", file.getAbsolutePath());
            } else {
                if (file.mkdirs()) {
                    return;
                }
                rdd0.m180845a("mkdirs fail : ", file.getAbsolutePath());
            }
        }
    }

    public boolean installPreDownloadedSo() {
        if (!isAllSoExists(this.mSDKHashPath)) {
            return false;
        }
        installLibs(new Entity(null, this.mSDKHashPath, false));
        return true;
    }

    public boolean isAllSoExists(File file) {
        return file.exists() && checkSoMd5(file);
    }

    public void loadLibs(SDKInitConfig sDKInitConfig) {
        this.mSoPathInZipArmv7a = sDKInitConfig.mSoPathInZipArmv7a;
        this.mSDKUrl = sDKInitConfig.mSDKUrl;
        this.mSDKMd5 = sDKInitConfig.mSDKMd5;
        this.mSDKSoMd5Path = sDKInitConfig.mSDKSoMd5Path;
        this.mSDKRootPath = sDKInitConfig.getSoSaveRootDir();
        this.mSDKHashPath = new File(this.mSDKRootPath, MD5Utils.digest(this.mSDKUrl));
        this.mSDKZipPath = new File(this.mSDKHashPath.getAbsolutePath() + ".zip");
        this.mContext = sDKInitConfig.mContext;
        this.mJsonParser = sDKInitConfig.mJsonParser;
        downloadAndInstall(this.mSDKZipPath);
    }

    public void setStatusListener(SDKInitStatusListener sDKInitStatusListener) {
        if (sDKInitStatusListener != null) {
            this.mStatusListener = sDKInitStatusListener;
        }
    }

    public static class Entity {
        public boolean needUnzip;
        public File rootFolder;
        public File zipFile;

        public Entity(File file, File file2, boolean z) {
            this.zipFile = file;
            this.rootFolder = file2;
            this.needUnzip = z;
        }

        public Entity(File file, boolean z) {
            this.zipFile = file;
            this.needUnzip = z;
        }
    }
}
