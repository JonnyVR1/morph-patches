package p153l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes7.dex */
public class psy extends wr4 {

    /* JADX INFO: renamed from: e */
    private int f153979e;

    public psy(String str) {
        super(str);
        this.f153979e = 1;
        m207551j(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m173699k(File file, File file2, File file3, ire0 ire0Var) throws Throwable {
        int i;
        MLog.m20458d("SDKResource", "applyArchiveZipPatch %s - %s - %s", file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath());
        Exception e = null;
        do {
            Inflater inflater = new Inflater(true);
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        inflater.end();
                        try {
                            fileInputStream.close();
                            throw null;
                        } catch (Throwable unused) {
                            throw null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        MLog.printErrStackTrace("SDKResource", e);
                        inflater.end();
                        try {
                            throw null;
                        } catch (Throwable unused2) {
                            throw null;
                        }
                    }
                } catch (Throwable unused3) {
                    i = this.f153979e;
                    this.f153979e = i - 1;
                }
            } catch (Throwable th) {
                inflater.end();
                try {
                    try {
                        throw null;
                    } catch (Throwable unused4) {
                        throw null;
                    }
                } catch (Throwable unused5) {
                    throw th;
                }
            }
        } while (i > 0);
        u4d0.m194475a("Event_Resource_Patch", 0, null);
        String strM158556e = miw.m158556e(file2);
        if (file2.exists() && TextUtils.equals(ire0Var.m141814d(), strM158556e)) {
            file3.delete();
            if (file2.renameTo(file3)) {
                u4d0.m194475a("Event_Resource_Local_Access_Patch", 1, null);
                MLog.m20458d("SDKResource", "applyArchiveZipPatch success", new Object[0]);
                u4d0.m194475a("Event_Resource_Patch", 1, null);
                if (zie.m219728a(file)) {
                    return file3.renameTo(file);
                }
                m207549h(5, "删除patch文件失败，ArchiveZipPatch");
                return false;
            }
        }
        if (e != null) {
            m207550i(5, e);
            m207549h(5, strM158556e);
            MLog.printErrStackTrace("SDKResource", e);
        } else {
            m207549h(5, "ArchiveZipPatch apply patch error " + strM158556e);
            MLog.m20458d("SDKResource", "applyArchiveZipPatch failed", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private boolean m173700l(File file, File file2, File file3, ire0 ire0Var) {
        u4d0.m194475a("Event_Resource_Patch", 0, String.valueOf(0));
        m207549h(5, "NormalDiffPatch apply patch error");
        return false;
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        File fileM219731d = zie.m219731d(ajeVar);
        File fileM219732e = zie.m219732e(ajeVar);
        File fileM219729b = zie.m219729b(ajeVar);
        if (zie.m219728a(fileM219729b)) {
            return cje.m110125m(ajeVar.m98369d()) ? m173699k(fileM219731d, fileM219732e, fileM219729b, ajeVar.m98369d()) : m173700l(fileM219731d, fileM219732e, fileM219729b, ajeVar.m98369d());
        }
        m207549h(5, "删除已经存在的合并好的文件失败");
        return false;
    }

    public psy() {
        this("MergeFileHandler");
    }
}
