package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import com.idv.identity.platform.log.RecordService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class jki {
    /* JADX INFO: renamed from: a */
    public static boolean m145846a(Context context, String str) {
        AssetManager assets = context.getAssets();
        File filesDir = context.getFilesDir();
        FileOutputStream fileOutputStream = null;
        try {
            InputStream inputStreamOpen = assets.open(str);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, str));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i == -1) {
                        return true;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                RecordService.getInstance().recordException(e);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        RecordService.getInstance().recordException(e2);
                    }
                }
                return false;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }
}
