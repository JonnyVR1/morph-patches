package p149l;

import android.content.Context;
import com.p041mm.mmfile.FileUploadConfig;
import com.p041mm.mmfile.IMMFileUploader;
import com.p041mm.mmfile.MMFileHelper;
import com.p041mm.mmfile.Strategy;
import com.p041mm.mmfile.core.FileWriteConfig;
import com.p041mm.mmfile.core.MMLogInfo;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class lnw {

    /* JADX INFO: renamed from: a */
    private static Strategy f129041a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m150744a(File file) {
        try {
            return inw.m137173k().mo128260b(file);
        } catch (Exception e) {
            inw.m137183u(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static List<String> m150745b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("common");
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static File m150746c() {
        File file = new File(ev0.m118233a().getFilesDir(), "mmfilecache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    private static MMLogInfo m150747d() {
        return new MMLogInfo(m150745b(), inw.m137166d() != null ? inw.m137166d().mo132027a().toString() : WeJson.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: e */
    public static void m150748e(Context context, hnw hnwVar) {
        hnw.AbstractC17359d abstractC17359d = hnwVar.f108727f;
        if (abstractC17359d == null || !abstractC17359d.mo98253e()) {
            inw.m137181s("realtime disabled, will not to init mmfile");
            return;
        }
        Strategy strategyBuild = new Strategy.Builder().businesses(inw.m137171i()).fileWriteConfig(new FileWriteConfig.Builder().cacheDir(m150746c().getAbsolutePath()).logDir(hnwVar.f108727f.mo132028f()).filePrefix("mulog_" + lc90.m149286b(context)).commonInfo(m150747d()).build()).fileUploadConfig(new FileUploadConfig.Builder().deleteAfterUploaded(inw.m137180r()).uploadClockTimeSeconds(inw.m137167e()).uploader(new IMMFileUploader() { // from class: l.knw
            @Override // com.p041mm.mmfile.IMMFileUploader
            public final boolean upload(File file) {
                return lnw.m150744a(file);
            }
        }).build()).build();
        f129041a = strategyBuild;
        MMFileHelper.install(strategyBuild);
    }
}
