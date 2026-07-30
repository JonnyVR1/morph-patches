package com.tencent.could.component.common.p084ai.log;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p084ai.utils.C14031a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.a */
/* JADX INFO: loaded from: classes12.dex */
public class RunnableC14013a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f58105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14014b f58106b;

    public RunnableC14013a(C14014b c14014b, String str) {
        this.f58106b = c14014b;
        this.f58105a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C14014b c14014b = this.f58106b;
        if (c14014b.f58110d == null) {
            return;
        }
        if (c14014b.f58107a.isUseExternalFile() && !C14031a.m83393a(this.f58106b.f58110d.get())) {
            Log.e("FilePrinter", "Do not have permission to check local file!");
            return;
        }
        String str = this.f58105a;
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
                    C14014b c14014b2 = this.f58106b;
                    if (c14014b2 == null) {
                        throw null;
                    }
                    if (file.lastModified() < System.currentTimeMillis() - c14014b2.f58107a.getFileOutTime() && !file.delete()) {
                        Log.e("FilePrinter", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    Log.e("FilePrinter", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }
}
