package p149l;

import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import tech.sud.base.utils.Utils;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ffg0 {

    /* JADX INFO: renamed from: a */
    public final eng0 f97255a;

    /* JADX INFO: renamed from: b */
    public String f97256b;

    /* JADX INFO: renamed from: c */
    public String f97257c;

    /* JADX INFO: renamed from: d */
    public String f97258d;

    /* JADX INFO: renamed from: e */
    public lfg0 f97259e;

    public ffg0(String str, eng0 eng0Var) {
        this.f97255a = eng0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m121159a() {
        File file = new File(Utils.getApp().getFilesDir(), "sud/mgp/ai/modelcache");
        String absolutePath = file.getAbsolutePath();
        if (!file.exists()) {
            g7g0.m124690a(absolutePath);
        }
        try {
            lfg0 lfg0Var = new lfg0(this.f97256b, absolutePath, new File(absolutePath, yog0.m215499b(this.f97256b)).getName());
            this.f97259e = lfg0Var;
            nig0 nig0Var = new nig0(this);
            if (!lfg0Var.f127877e.contains(nig0Var)) {
                lfg0Var.f127877e.add(nig0Var);
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
            }
            lfg0 lfg0Var2 = this.f97259e;
            PkgDownloadStatus pkgDownloadStatus2 = lfg0Var2.f127876d;
            PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_STARTED;
            if (pkgDownloadStatus2 == pkgDownloadStatus3 || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
                return;
            }
            LogUtils.file("DownloadFileTask", "download:" + lfg0Var2.f127876d + "  url:" + lfg0Var2.f127884l + "  parentPath:" + lfg0Var2.f127874b + "  fileName:" + lfg0Var2.f127875c);
            lfg0Var2.m149679b(pkgDownloadStatus3);
            jbg0 jbg0Var = lfg0Var2.f127878f;
            if (jbg0Var != null) {
                jbg0Var.f117191b.clear();
            }
            jbg0 jbg0Var2 = new jbg0(lfg0Var2);
            lfg0Var2.f127878f = jbg0Var2;
            lfg0Var2.f127873a.m184803m(jbg0Var2);
            uig0 uig0Var = lfg0Var2.f127879g;
            if (uig0Var != null) {
                uig0Var.f176653a.clear();
                lfg0Var2.f127879g.cancel();
                lfg0Var2.f127879g = null;
            }
            uig0 uig0Var2 = new uig0(lfg0Var2);
            lfg0Var2.f127879g = uig0Var2;
            uig0Var2.start();
        } catch (Exception e) {
            LogUtils.file("AiLoadModelTask", "create download task error:" + LogUtils.getErrorInfo(e));
            this.f97255a.onFailure(-1, "create download task error:" + e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0045: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:70), block:B:17:0x0045 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX INFO: renamed from: b */
    public final void m121160b(String str) {
        Closeable closeable;
        Exception e;
        ?? r8;
        ByteArrayOutputStream byteArrayOutputStream;
        if (!"XOR".equals(this.f97257c)) {
            this.f97255a.onFailure(-1, "Unsupported algorithm:" + this.f97257c);
            return;
        }
        File file = new File(str);
        String str2 = afg0.f69172a;
        ?? Exists = file.exists();
        byte[] byteArray = null;
        byteArray = null;
        closeable = null;
        Closeable closeable2 = null;
        try {
            if (Exists != 0) {
                try {
                    Exists = new BufferedInputStream(new FileInputStream(file), 524288);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[524288];
                            while (true) {
                                int i = Exists.read(bArr, 0, 524288);
                                if (i == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            p6g0.m167665c(Exists);
                            p6g0.m167665c(byteArrayOutputStream);
                        } catch (Exception e2) {
                            e = e2;
                            r8 = Exists;
                            LogUtils.file(FileUtils.TAG, LogUtils.getErrorInfo(e));
                            p6g0.m167665c(r8);
                            p6g0.m167665c(byteArrayOutputStream);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream = null;
                        r8 = Exists;
                    } catch (Throwable th) {
                        th = th;
                        p6g0.m167665c(Exists);
                        p6g0.m167665c(closeable2);
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    r8 = 0;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    Exists = 0;
                }
            }
            if (byteArray == null || byteArray.length == 0) {
                this.f97255a.onFailure(-1, "the file is empty");
                return;
            }
            byte[] bArr2 = new byte[byteArray.length];
            byte[] bytes = this.f97258d.getBytes(StandardCharsets.UTF_8);
            int length = 0;
            for (int i2 = 0; i2 < byteArray.length; i2++) {
                bArr2[i2] = (byte) (byteArray[i2] ^ bytes[length]);
                length = (length + 1) % bytes.length;
            }
            this.f97255a.onCompleted(bArr2);
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }
}
