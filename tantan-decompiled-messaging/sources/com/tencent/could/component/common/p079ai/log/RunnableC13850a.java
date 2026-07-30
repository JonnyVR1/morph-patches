package com.tencent.could.component.common.p079ai.log;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p079ai.utils.C13868a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.a */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC13850a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f57257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13851b f57258b;

    public RunnableC13850a(C13851b c13851b, String str) {
        this.f57258b = c13851b;
        this.f57257a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C13851b c13851b = this.f57258b;
        if (c13851b.f57262d == null) {
            return;
        }
        if (c13851b.f57259a.isUseExternalFile() && !C13868a.m82210a(this.f57258b.f57262d.get())) {
            Log.e("FilePrinter", "Do not have permission to check local file!");
            return;
        }
        String str = this.f57257a;
        if (TextUtils.isEmpty(str)) {
            Log.e("FilePrinter", "logFolderPath is empty!");
            return;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory()) {
                try {
                    C13851b c13851b2 = this.f57258b;
                    if (c13851b2 == null) {
                        throw null;
                    }
                    if (file.lastModified() < System.currentTimeMillis() - c13851b2.f57259a.getFileOutTime() && !file.delete()) {
                        Log.e("FilePrinter", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    Log.e("FilePrinter", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }
}
