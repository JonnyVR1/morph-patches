package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class sjy extends xq4 {

    /* JADX INFO: renamed from: e */
    private int f164923e;

    public sjy(String str) {
        super(str);
        this.f164923e = 1;
        m210552j(4);
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
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m184567k(java.io.File r10, java.io.File r11, java.io.File r12, p149l.dje0 r13) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAbsolutePath()
            java.lang.String r1 = r11.getAbsolutePath()
            java.lang.String r2 = r12.getAbsolutePath()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "SDKResource"
            java.lang.String r2 = "applyArchiveZipPatch %s - %s - %s"
            com.immomo.resdownloader.log.MLog.m19459d(r1, r2, r0)
            r0 = 0
            r2 = r0
        L19:
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r4 = 1
            r3.<init>(r4)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r3.end()
            r5.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            throw r0     // Catch: java.lang.Throwable -> L37
        L2b:
            r9 = move-exception
            goto La8
        L2e:
            r2 = move-exception
            com.immomo.resdownloader.log.MLog.printErrStackTrace(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r3.end()
            throw r0     // Catch: java.lang.Throwable -> L36
        L36:
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            int r3 = r9.f164923e
            int r5 = r3 + (-1)
            r9.f164923e = r5
            if (r3 > 0) goto L19
            java.lang.String r3 = "Event_Resource_Patch"
            r5 = 0
            p149l.rwc0.m181387a(r3, r5, r0)
            java.lang.String r6 = p149l.ngw.m159358e(r11)
            boolean r7 = r11.exists()
            r8 = 5
            if (r7 == 0) goto L83
            java.lang.String r13 = r13.m112029d()
            boolean r13 = android.text.TextUtils.equals(r13, r6)
            if (r13 == 0) goto L83
            r12.delete()
            boolean r11 = r11.renameTo(r12)
            if (r11 == 0) goto L83
            java.lang.String r11 = "Event_Resource_Local_Access_Patch"
            p149l.rwc0.m181387a(r11, r4, r0)
            java.lang.String r11 = "applyArchiveZipPatch success"
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.immomo.resdownloader.log.MLog.m19459d(r1, r11, r13)
            p149l.rwc0.m181387a(r3, r4, r0)
            boolean r11 = p149l.vhe.m198442a(r10)
            if (r11 != 0) goto L7e
            java.lang.String r10 = "删除patch文件失败，ArchiveZipPatch"
            r9.m210550h(r8, r10)
            return r5
        L7e:
            boolean r9 = r12.renameTo(r10)
            return r9
        L83:
            if (r2 == 0) goto L8f
            r9.m210551i(r8, r2)
            r9.m210550h(r8, r6)
            com.immomo.resdownloader.log.MLog.printErrStackTrace(r1, r2)
            goto La7
        L8f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "ArchiveZipPatch apply patch error "
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r9.m210550h(r8, r10)
            java.lang.String r9 = "applyArchiveZipPatch failed"
            java.lang.Object[] r10 = new java.lang.Object[r5]
            com.immomo.resdownloader.log.MLog.m19459d(r1, r9, r10)
        La7:
            return r5
        La8:
            r3.end()
            throw r0     // Catch: java.lang.Throwable -> Lac
        Lac:
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.sjy.m184567k(java.io.File, java.io.File, java.io.File, l.dje0):boolean");
    }

    /* JADX INFO: renamed from: l */
    private boolean m184568l(File file, File file2, File file3, dje0 dje0Var) {
        rwc0.m181387a("Event_Resource_Patch", 0, String.valueOf(0));
        m210550h(5, "NormalDiffPatch apply patch error");
        return false;
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        File fileM198445d = vhe.m198445d(wheVar);
        File fileM198446e = vhe.m198446e(wheVar);
        File fileM198443b = vhe.m198443b(wheVar);
        if (vhe.m198442a(fileM198443b)) {
            return yhe.m214810m(wheVar.m203128d()) ? m184567k(fileM198445d, fileM198446e, fileM198443b, wheVar.m203128d()) : m184568l(fileM198445d, fileM198446e, fileM198443b, wheVar.m203128d());
        }
        m210550h(5, "删除已经存在的合并好的文件失败");
        return false;
    }

    public sjy() {
        this("MergeFileHandler");
    }
}
