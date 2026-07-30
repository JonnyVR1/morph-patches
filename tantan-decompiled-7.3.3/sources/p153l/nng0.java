package p153l;

import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
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
public final class nng0 {

    /* JADX INFO: renamed from: a */
    public final mvg0 f142784a;

    /* JADX INFO: renamed from: b */
    public String f142785b;

    /* JADX INFO: renamed from: c */
    public String f142786c;

    /* JADX INFO: renamed from: d */
    public String f142787d;

    /* JADX INFO: renamed from: e */
    public tng0 f142788e;

    public nng0(String str, mvg0 mvg0Var) {
        this.f142784a = mvg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m163867a() {
        File file = new File(Utils.getApp().getFilesDir(), "sud/mgp/ai/modelcache");
        String absolutePath = file.getAbsolutePath();
        if (!file.exists()) {
            ofg0.m167448a(absolutePath);
        }
        try {
            tng0 tng0Var = new tng0(this.f142785b, absolutePath, new File(absolutePath, gxg0.m132863b(this.f142785b)).getName());
            this.f142788e = tng0Var;
            vqg0 vqg0Var = new vqg0(this);
            if (!tng0Var.f175254e.contains(vqg0Var)) {
                tng0Var.f175254e.add(vqg0Var);
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
            }
            tng0 tng0Var2 = this.f142788e;
            PkgDownloadStatus pkgDownloadStatus2 = tng0Var2.f175253d;
            PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_STARTED;
            if (pkgDownloadStatus2 == pkgDownloadStatus3 || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
                return;
            }
            LogUtils.file("DownloadFileTask", "download:" + tng0Var2.f175253d + "  url:" + tng0Var2.f175261l + "  parentPath:" + tng0Var2.f175251b + "  fileName:" + tng0Var2.f175252c);
            tng0Var2.m191886b(pkgDownloadStatus3);
            rjg0 rjg0Var = tng0Var2.f175255f;
            if (rjg0Var != null) {
                rjg0Var.f163454b.clear();
            }
            rjg0 rjg0Var2 = new rjg0(tng0Var2);
            tng0Var2.f175255f = rjg0Var2;
            tng0Var2.f175250a.m100398m(rjg0Var2);
            crg0 crg0Var = tng0Var2.f175256g;
            if (crg0Var != null) {
                crg0Var.f83322a.clear();
                tng0Var2.f175256g.cancel();
                tng0Var2.f175256g = null;
            }
            crg0 crg0Var2 = new crg0(tng0Var2);
            tng0Var2.f175256g = crg0Var2;
            crg0Var2.start();
        } catch (Exception e) {
            LogUtils.file("AiLoadModelTask", "create download task error:" + LogUtils.getErrorInfo(e));
            this.f142784a.onFailure(-1, "create download task error:" + e);
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
    public final void m163868b(String str) {
        Closeable closeable;
        Exception e;
        ?? r8;
        ByteArrayOutputStream byteArrayOutputStream;
        if (!"XOR".equals(this.f142786c)) {
            this.f142784a.onFailure(-1, "Unsupported algorithm:" + this.f142786c);
            return;
        }
        File file = new File(str);
        String str2 = ing0.f115953a;
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
                            xeg0.m210678c(Exists);
                            xeg0.m210678c(byteArrayOutputStream);
                        } catch (Exception e2) {
                            e = e2;
                            r8 = Exists;
                            LogUtils.file(FileUtils.TAG, LogUtils.getErrorInfo(e));
                            xeg0.m210678c(r8);
                            xeg0.m210678c(byteArrayOutputStream);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream = null;
                        r8 = Exists;
                    } catch (Throwable th) {
                        th = th;
                        xeg0.m210678c(Exists);
                        xeg0.m210678c(closeable2);
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
                this.f142784a.onFailure(-1, "the file is empty");
                return;
            }
            byte[] bArr2 = new byte[byteArray.length];
            byte[] bytes = this.f142787d.getBytes(StandardCharsets.UTF_8);
            int length = 0;
            for (int i2 = 0; i2 < byteArray.length; i2++) {
                bArr2[i2] = (byte) (byteArray[i2] ^ bytes[length]);
                length = (length + 1) % bytes.length;
            }
            this.f142784a.onCompleted(bArr2);
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }
}
