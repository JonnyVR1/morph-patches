package p153l;

import android.content.Context;
import com.p046mm.mmfile.FileUploadConfig;
import com.p046mm.mmfile.IMMFileUploader;
import com.p046mm.mmfile.MMFileHelper;
import com.p046mm.mmfile.Strategy;
import com.p046mm.mmfile.core.FileWriteConfig;
import com.p046mm.mmfile.core.MMLogInfo;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class jqw {

    /* JADX INFO: renamed from: a */
    private static Strategy f122258a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m146635a(File file) {
        try {
            return gqw.m131487k().mo192756b(file);
        } catch (Exception e) {
            gqw.m131497u(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static List<String> m146636b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("common");
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static File m146637c() {
        File file = new File(jv0.m147001a().getFilesDir(), "mmfilecache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    private static MMLogInfo m146638d() {
        return new MMLogInfo(m146636b(), gqw.m131480d() != null ? gqw.m131480d().mo126808a().toString() : WeJson.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: e */
    public static void m146639e(Context context, fqw fqwVar) {
        fqw.AbstractC17039d abstractC17039d = fqwVar.f100347f;
        if (abstractC17039d == null || !abstractC17039d.mo126810e()) {
            gqw.m131495s("realtime disabled, will not to init mmfile");
            return;
        }
        Strategy strategyBuild = new Strategy.Builder().businesses(gqw.m131485i()).fileWriteConfig(new FileWriteConfig.Builder().cacheDir(m146637c().getAbsolutePath()).logDir(fqwVar.f100347f.mo126811f()).filePrefix("mulog_" + pk90.m172595b(context)).commonInfo(m146638d()).build()).fileUploadConfig(new FileUploadConfig.Builder().deleteAfterUploaded(gqw.m131494r()).uploadClockTimeSeconds(gqw.m131481e()).uploader(new IMMFileUploader() { // from class: l.iqw
            @Override // com.p046mm.mmfile.IMMFileUploader
            public final boolean upload(File file) {
                return jqw.m146635a(file);
            }
        }).build()).build();
        f122258a = strategyBuild;
        MMFileHelper.install(strategyBuild);
    }
}
