package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.sudcompress.archivers.ArchiveEntry;
import org.apache.commons.sudcompress.archivers.zip.ZipArchiveInputStream;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class osg0 extends vog0 {

    /* JADX INFO: renamed from: h */
    public static final String f148829h = "SudGIP ".concat(osg0.class.getSimpleName());

    /* JADX INFO: renamed from: e */
    public final String f148830e;

    /* JADX INFO: renamed from: f */
    public final String f148831f;

    /* JADX INFO: renamed from: g */
    public final AssetManager f148832g;

    public osg0(Context context, olg0 olg0Var) {
        super(olg0Var);
        this.f148830e = new File(context.getFilesDir(), "sud/mgp/utapp").getAbsolutePath();
        this.f148831f = new File(context.getFilesDir(), "sud/mgp/utapp/embed").getAbsolutePath();
        this.f148832g = context.getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0210 A[Catch: IOException -> 0x020c, TryCatch #11 {IOException -> 0x020c, blocks: (B:97:0x0208, B:101:0x0210, B:103:0x0215), top: B:113:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0215 A[Catch: IOException -> 0x020c, TRY_LEAVE, TryCatch #11 {IOException -> 0x020c, blocks: (B:97:0x0208, B:101:0x0210, B:103:0x0215), top: B:113:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x019a A[EDGE_INSN: B:132:0x019a->B:87:0x019a BREAK  A[LOOP:2: B:77:0x017e->B:85:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0159 A[Catch: IOException -> 0x0155, TryCatch #4 {IOException -> 0x0155, blocks: (B:59:0x0151, B:63:0x0159, B:65:0x015e), top: B:107:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x015e A[Catch: IOException -> 0x0155, TRY_LEAVE, TryCatch #4 {IOException -> 0x0155, blocks: (B:59:0x0151, B:63:0x0159, B:65:0x015e), top: B:107:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:81:0x018e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01cc, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public static vgg0 m168985l(String str, String str2) throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream;
        FileOutputStream fileOutputStream;
        IOException e;
        ZipArchiveInputStream zipArchiveInputStream2;
        FileInputStream fileInputStream;
        Throwable th;
        File file;
        File[] fileArrListFiles;
        int length;
        String str3;
        File file2;
        String path;
        String str4 = f148829h;
        StringBuilder sb = new StringBuilder("unzip path = ");
        sb.append(str);
        sb.append(" filesize = ");
        File file3 = new File(str);
        String str5 = ing0.f115953a;
        sb.append(file3.length());
        SudLogger.m222811d(str4, sb.toString());
        String str6 = str2 + "/StreamingAssets";
        ofg0.m167449b(str6);
        String str7 = str2 + "/StreamingAssetsCache";
        ofg0.m167449b(str7);
        vgg0 vgg0Var = new vgg0();
        LogUtils.file(FileUtils.TAG, "unzipFileAtPath zipFilePath:" + str + "  location:" + str7);
        File file4 = new File(str7);
        int i = 0;
        FileInputStream fileInputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        str = null;
        str = null;
        String str8 = null;
        try {
            if (!file4.exists()) {
                file4.mkdirs();
            }
            fileInputStream = new FileInputStream(str);
            try {
                zipArchiveInputStream2 = new ZipArchiveInputStream(fileInputStream, "UTF-8");
                fileOutputStream = null;
                while (true) {
                    try {
                        ArchiveEntry nextEntry = zipArchiveInputStream2.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        String name = nextEntry.getName();
                        if (!name.contains("__MACOSX")) {
                            if (nextEntry.isDirectory()) {
                                new File(str7, name).mkdirs();
                            } else {
                                int iIndexOf = name.indexOf(47);
                                int iLastIndexOf = name.lastIndexOf(47);
                                if (iIndexOf > 0 && iIndexOf == iLastIndexOf) {
                                    File file5 = new File(str7, name.substring(0, iIndexOf + 1));
                                    if (!file5.exists()) {
                                        file5.mkdirs();
                                    }
                                }
                                File file6 = new File(str7, name);
                                byte[] bArr = new byte[5120];
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file6);
                                while (true) {
                                    try {
                                        int i2 = zipArchiveInputStream2.read(bArr);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        fileOutputStream3.write(bArr, 0, i2);
                                    } catch (IOException e2) {
                                        e = e2;
                                        fileOutputStream = fileOutputStream3;
                                        try {
                                            LogUtils.file(FileUtils.TAG, "unzipFileAtPath :" + LogUtils.getErrorInfo(e));
                                            e.printStackTrace();
                                            vgg0Var.f184033a = -1;
                                            vgg0Var.f184034b = e.toString();
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                    if (zipArchiveInputStream2 != null) {
                                                        zipArchiveInputStream2.close();
                                                    }
                                                    if (fileInputStream != null) {
                                                        fileInputStream.close();
                                                    }
                                                } catch (IOException e3) {
                                                    e3.printStackTrace();
                                                }
                                            } else {
                                                if (zipArchiveInputStream2 != null) {
                                                    zipArchiveInputStream2.close();
                                                }
                                                if (fileInputStream != null) {
                                                    fileInputStream.close();
                                                }
                                            }
                                            if (vgg0Var.f184033a == 0) {
                                                file = new File(str7);
                                                if (file.exists()) {
                                                    length = fileArrListFiles.length;
                                                    str3 = null;
                                                    while (true) {
                                                        if (i < length) {
                                                            file2 = fileArrListFiles[i];
                                                            path = file2.getPath();
                                                            if (path.contains("__MACOSX")) {
                                                                if (str3 != null) {
                                                                    break;
                                                                }
                                                                if (!file2.isDirectory()) {
                                                                    str3 = path;
                                                                }
                                                            }
                                                            i++;
                                                        }
                                                        str8 = str3;
                                                        break;
                                                    }
                                                }
                                                if (str8 != null) {
                                                    File file7 = new File(str8);
                                                    File file8 = new File(str6);
                                                    LogUtils.file(FileUtils.TAG, "unpackZip rootDirectory != null  renameResult:" + file7.renameTo(file8) + "  oldDir:" + file7 + "  newDir:" + file8);
                                                } else {
                                                    File file9 = new File(str7);
                                                    File file10 = new File(str6);
                                                    LogUtils.file(FileUtils.TAG, "unpackZip renameResult:" + file9.renameTo(file10) + "  oldDir:" + file9 + "  newDir:" + file10);
                                                }
                                            }
                                            ofg0.m167449b(str7);
                                            return vgg0Var;
                                        } catch (Throwable th2) {
                                            zipArchiveInputStream = zipArchiveInputStream2;
                                            th = th2;
                                            fileInputStream2 = fileInputStream;
                                            ZipArchiveInputStream zipArchiveInputStream3 = zipArchiveInputStream;
                                            th = th;
                                            zipArchiveInputStream2 = zipArchiveInputStream3;
                                            fileInputStream = fileInputStream2;
                                            fileOutputStream2 = fileOutputStream;
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.close();
                                                    if (zipArchiveInputStream2 != null) {
                                                        zipArchiveInputStream2.close();
                                                    }
                                                    if (fileInputStream != null) {
                                                        fileInputStream.close();
                                                    }
                                                } catch (IOException e4) {
                                                    e4.printStackTrace();
                                                    throw th;
                                                }
                                            } else {
                                                if (zipArchiveInputStream2 != null) {
                                                    zipArchiveInputStream2.close();
                                                }
                                                if (fileInputStream != null) {
                                                    fileInputStream.close();
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream2 = fileOutputStream3;
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                            if (zipArchiveInputStream2 != null) {
                                                zipArchiveInputStream2.close();
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                        } else {
                                            if (zipArchiveInputStream2 != null) {
                                                zipArchiveInputStream2.close();
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                fileOutputStream3.flush();
                                fileOutputStream = fileOutputStream3;
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                            if (zipArchiveInputStream2 != null) {
                                zipArchiveInputStream2.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } else {
                            if (zipArchiveInputStream2 != null) {
                                zipArchiveInputStream2.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                zipArchiveInputStream2.close();
                fileInputStream.close();
            } catch (IOException e7) {
                zipArchiveInputStream2 = null;
                e = e7;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                zipArchiveInputStream2 = null;
            }
        } catch (IOException e8) {
            e = e8;
            zipArchiveInputStream2 = null;
            fileInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            zipArchiveInputStream = null;
            fileOutputStream = null;
            ZipArchiveInputStream zipArchiveInputStream4 = zipArchiveInputStream;
            th = th;
            zipArchiveInputStream2 = zipArchiveInputStream4;
            fileInputStream = fileInputStream2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                if (zipArchiveInputStream2 != null) {
                    zipArchiveInputStream2.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } else {
                if (zipArchiveInputStream2 != null) {
                    zipArchiveInputStream2.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
            throw th;
        }
        if (vgg0Var.f184033a == 0) {
            file = new File(str7);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                length = fileArrListFiles.length;
                str3 = null;
                while (true) {
                    if (i < length) {
                        file2 = fileArrListFiles[i];
                        path = file2.getPath();
                        if (path.contains("__MACOSX")) {
                            if (str3 != null) {
                                break;
                                break;
                            }
                            if (!file2.isDirectory()) {
                                str3 = path;
                            }
                        }
                        i++;
                    }
                    str8 = str3;
                    break;
                }
            }
            if (str8 != null) {
                File file11 = new File(str8);
                File file12 = new File(str6);
                LogUtils.file(FileUtils.TAG, "unpackZip rootDirectory != null  renameResult:" + file11.renameTo(file12) + "  oldDir:" + file11 + "  newDir:" + file12);
            } else {
                File file13 = new File(str7);
                File file14 = new File(str6);
                LogUtils.file(FileUtils.TAG, "unpackZip renameResult:" + file13.renameTo(file14) + "  oldDir:" + file13 + "  newDir:" + file14);
            }
        }
        ofg0.m167449b(str7);
        return vgg0Var;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m168986m(boolean z, uog0 uog0Var, String str) {
        if (!z) {
            uog0Var.mo105395a(false, "", false);
            return;
        }
        uog0Var.mo105395a(true, str + "/StreamingAssets", false);
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: b */
    public final Object mo164596b(uug0 uug0Var, File file) {
        LogUtils.file("UTRealSudGamePackageManager", "processDownloadPackage");
        nlg0 nlg0Var = new nlg0();
        String absolutePath = file.getAbsolutePath();
        nlg0Var.f142541a = m168985l(absolutePath, absolutePath.substring(0, absolutePath.lastIndexOf(47)));
        LogUtils.file("UTRealSudGamePackageManager", "processDownloadPackage unzipResult:" + nlg0Var.f142541a + "  path:" + absolutePath);
        if (nlg0Var.f142541a.f184033a == 0) {
            uug0Var.f181078f = System.currentTimeMillis();
            this.f185043b.m168115g(uug0Var);
            m202121e(uug0Var.f181073a);
        }
        nlg0Var.f142542b = mo168987c(absolutePath);
        return nlg0Var;
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: c */
    public final String mo168987c(String str) {
        return str.substring(0, str.lastIndexOf(47)).concat("/StreamingAssets");
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: g */
    public final void mo168988g(final long j, final String str, final uog0 uog0Var) {
        fkg0.f99507a.execute(new Runnable() { // from class: l.fqg0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f100287a.m168990n(j, str, uog0Var);
            }
        });
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: h */
    public final void mo164597h(String str, Object obj, bxg0 bxg0Var, klg0 klg0Var) {
        if (!(obj instanceof nlg0)) {
            LogUtils.file("UTRealSudGamePackageManager", "extendInfo empty");
            SudLogger.m222811d(f148829h, "extendInfo empty");
            klg0Var.mo150367e(-1, "extendInfo empty", bxg0Var);
            return;
        }
        nlg0 nlg0Var = (nlg0) obj;
        vgg0 vgg0Var = nlg0Var.f142541a;
        String str2 = nlg0Var.f142542b;
        if (vgg0Var.f184033a != 0) {
            LogUtils.file("UTRealSudGamePackageManager", "unzip error");
            SudLogger.m222811d(f148829h, "unzip error");
            klg0Var.mo150367e(-10102, "unzip error:" + vgg0Var.f184034b, bxg0Var);
            return;
        }
        LogUtils.file("UTRealSudGamePackageManager", "onDownloadSuccess path=" + str);
        SudLogger.m222811d(f148829h, "onDownloadSuccess path=" + str);
        klg0Var.mo150365b(str2, bxg0Var);
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: j */
    public final String mo168989j(String str) {
        return mo164598k(gxg0.m132863b(str));
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: k */
    public final String mo164598k(String str) {
        return this.f148830e + "/" + str;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x010f A[EDGE_INSN: B:123:0x010f->B:48:0x010f BREAK  A[LOOP:1: B:130:0x0101->B:139:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[Catch: IOException -> 0x0080, TryCatch #10 {IOException -> 0x0080, blocks: (B:14:0x0056, B:18:0x006a, B:19:0x0071, B:21:0x0074, B:23:0x0078, B:17:0x0061), top: B:128:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[Catch: IOException -> 0x0080, TryCatch #10 {IOException -> 0x0080, blocks: (B:14:0x0056, B:18:0x006a, B:19:0x0071, B:21:0x0074, B:23:0x0078, B:17:0x0061), top: B:128:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107 A[Catch: all -> 0x010b, Exception -> 0x010d, TRY_LEAVE, TryCatch #13 {Exception -> 0x010d, all -> 0x010b, blocks: (B:40:0x0101, B:42:0x0107), top: B:130:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00ac, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public final void m168990n(long j, String str, final uog0 uog0Var) throws Throwable {
        boolean z;
        String strM132862a;
        vug0 vug0Var;
        plg0 plg0Var;
        psg0 psg0VarM181993b;
        int iLastIndexOf;
        String str2;
        FileOutputStream fileOutputStream;
        Exception e;
        InputStream inputStreamOpen;
        byte[] bArr;
        int i;
        int iLastIndexOf2;
        String strSubstring;
        String strSubstring2;
        String[] list;
        int i2;
        String str3;
        final String absolutePath = new File(this.f148831f, String.valueOf(j)).getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        plg0 plg0Var2 = (plg0) wog0.f190041a.f185816a.get(Long.valueOf(j));
        String str4 = absolutePath + "/StreamingAssets";
        final boolean z2 = true;
        if (plg0Var2 == null || plg0Var2.f153030a) {
            iLastIndexOf2 = str.lastIndexOf("/");
            if (-1 == iLastIndexOf2) {
                strSubstring2 = str;
                strSubstring = "";
            } else {
                int i3 = iLastIndexOf2 + 1;
                strSubstring = str.substring(0, i3);
                strSubstring2 = str.substring(i3);
            }
            list = this.f148832g.list(strSubstring);
            i2 = 0;
            while (true) {
                if (i2 < list.length) {
                    z = false;
                    break;
                } else {
                    str3 = list[i2];
                    if (str3 == null) {
                    }
                    i2++;
                }
            }
            if (z) {
                iLastIndexOf = str.lastIndexOf(".");
                if (-1 == iLastIndexOf) {
                    str2 = absolutePath + File.separator + String.valueOf(j);
                } else {
                    str2 = absolutePath + File.separator + String.valueOf(j) + str.substring(iLastIndexOf);
                }
                String str5 = ing0.f115953a;
                LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(str2).delete());
                InputStream inputStream = null;
                inputStreamOpen = this.f148832g.open(str);
                bArr = new byte[1024];
                File file2 = new File(str2);
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    i = inputStreamOpen.read(bArr);
                    if (i <= 0) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                inputStreamOpen.close();
                fileOutputStream.close();
                str = str2;
            }
            strM132862a = gxg0.m132862a(new File(str));
            vug0Var = wog0.f190041a;
            plg0Var = (plg0) vug0Var.f185816a.get(Long.valueOf(j));
            if (plg0Var == null) {
                plg0 plg0Var3 = new plg0();
                plg0Var3.f153030a = false;
                plg0Var3.f153031b = z;
                vug0Var.f185816a.put(Long.valueOf(j), plg0Var3);
            } else {
                plg0Var.f153030a = false;
                plg0Var.f153031b = z;
            }
            psg0VarM181993b = rlg0.m181993b(this.f185043b.f147834a.getString("ut_embbed_" + String.valueOf(j), ""));
            String str6 = absolutePath + "/StreamingAssets";
            if (psg0VarM181993b == null) {
                if (m168985l(str, absolutePath).f184033a == 0) {
                    if (psg0VarM181993b == null) {
                        psg0VarM181993b = new psg0();
                    }
                    psg0VarM181993b.f153902a = j;
                    psg0VarM181993b.f153903b = strM132862a;
                    this.f185043b.m168114f(psg0VarM181993b);
                } else {
                    z2 = false;
                }
            } else if (m168985l(str, absolutePath).f184033a == 0) {
                if (psg0VarM181993b == null) {
                    psg0VarM181993b = new psg0();
                }
                psg0VarM181993b.f153902a = j;
                psg0VarM181993b.f153903b = strM132862a;
                this.f185043b.m168114f(psg0VarM181993b);
            } else {
                z2 = false;
            }
        } else {
            String str7 = ing0.f115953a;
            if (!new File(str4).exists()) {
                try {
                    iLastIndexOf2 = str.lastIndexOf("/");
                    if (-1 == iLastIndexOf2) {
                        strSubstring2 = str;
                        strSubstring = "";
                    } else {
                        int i4 = iLastIndexOf2 + 1;
                        strSubstring = str.substring(0, i4);
                        strSubstring2 = str.substring(i4);
                    }
                    list = this.f148832g.list(strSubstring);
                    i2 = 0;
                    while (true) {
                        if (i2 < list.length) {
                            z = false;
                            break;
                        }
                        str3 = list[i2];
                        if (str3 == null && str3.equals(strSubstring2)) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (z) {
                    iLastIndexOf = str.lastIndexOf(".");
                    if (-1 == iLastIndexOf) {
                        str2 = absolutePath + File.separator + String.valueOf(j);
                    } else {
                        str2 = absolutePath + File.separator + String.valueOf(j) + str.substring(iLastIndexOf);
                    }
                    String str8 = ing0.f115953a;
                    LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(str2).delete());
                    InputStream inputStream2 = null;
                    try {
                        try {
                            inputStreamOpen = this.f148832g.open(str);
                            try {
                                bArr = new byte[1024];
                                File file3 = new File(str2);
                                file3.createNewFile();
                                fileOutputStream = new FileOutputStream(file3);
                                while (true) {
                                    try {
                                        i = inputStreamOpen.read(bArr);
                                        if (i <= 0) {
                                            fileOutputStream.write(bArr, 0, i);
                                        } else {
                                            try {
                                                break;
                                            } catch (Exception e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        try {
                                            e.printStackTrace();
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Exception e5) {
                                                    e5.printStackTrace();
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            str = str2;
                                            strM132862a = gxg0.m132862a(new File(str));
                                            vug0Var = wog0.f190041a;
                                            plg0Var = (plg0) vug0Var.f185816a.get(Long.valueOf(j));
                                            if (plg0Var == null) {
                                                plg0 plg0Var4 = new plg0();
                                                plg0Var4.f153030a = false;
                                                plg0Var4.f153031b = z;
                                                vug0Var.f185816a.put(Long.valueOf(j), plg0Var4);
                                            } else {
                                                plg0Var.f153030a = false;
                                                plg0Var.f153031b = z;
                                            }
                                            psg0VarM181993b = rlg0.m181993b(this.f185043b.f147834a.getString("ut_embbed_" + String.valueOf(j), ""));
                                            String str9 = absolutePath + "/StreamingAssets";
                                            if (psg0VarM181993b == null) {
                                                if (m168985l(str, absolutePath).f184033a == 0) {
                                                    if (psg0VarM181993b == null) {
                                                        psg0VarM181993b = new psg0();
                                                    }
                                                    psg0VarM181993b.f153902a = j;
                                                    psg0VarM181993b.f153903b = strM132862a;
                                                    this.f185043b.m168114f(psg0VarM181993b);
                                                } else {
                                                    z2 = false;
                                                }
                                            } else if (m168985l(str, absolutePath).f184033a == 0) {
                                                if (psg0VarM181993b == null) {
                                                    psg0VarM181993b = new psg0();
                                                }
                                                psg0VarM181993b.f153902a = j;
                                                psg0VarM181993b.f153903b = strM132862a;
                                                this.f185043b.m168114f(psg0VarM181993b);
                                            } else {
                                                z2 = false;
                                            }
                                            ThreadUtils.postUITask(new Runnable() { // from class: l.iqg0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    osg0.m168986m(z2, uog0Var, absolutePath);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStream2 = inputStreamOpen;
                                            inputStreamOpen = inputStream2;
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Exception e6) {
                                                    e6.printStackTrace();
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                throw th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th;
                                            } catch (Exception e7) {
                                                e7.printStackTrace();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                        if (fileOutputStream != null) {
                                            throw th;
                                        }
                                        fileOutputStream.close();
                                        throw th;
                                    }
                                }
                                inputStreamOpen.close();
                                fileOutputStream.close();
                            } catch (Exception e8) {
                                fileOutputStream = null;
                                e = e8;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                                inputStream2 = inputStreamOpen;
                                inputStreamOpen = inputStream2;
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                fileOutputStream.close();
                                throw th;
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    } catch (Exception e10) {
                        fileOutputStream = null;
                        e = e10;
                        inputStreamOpen = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        inputStreamOpen = inputStream2;
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                    str = str2;
                }
                strM132862a = gxg0.m132862a(new File(str));
                vug0Var = wog0.f190041a;
                plg0Var = (plg0) vug0Var.f185816a.get(Long.valueOf(j));
                if (plg0Var == null) {
                    plg0 plg0Var5 = new plg0();
                    plg0Var5.f153030a = false;
                    plg0Var5.f153031b = z;
                    vug0Var.f185816a.put(Long.valueOf(j), plg0Var5);
                } else {
                    plg0Var.f153030a = false;
                    plg0Var.f153031b = z;
                }
                psg0VarM181993b = rlg0.m181993b(this.f185043b.f147834a.getString("ut_embbed_" + String.valueOf(j), ""));
                String str10 = absolutePath + "/StreamingAssets";
                if (psg0VarM181993b == null && !TextUtils.isEmpty(psg0VarM181993b.f153903b) && !TextUtils.isEmpty(strM132862a) && strM132862a.equals(psg0VarM181993b.f153903b)) {
                    String str11 = ing0.f115953a;
                    if (!new File(str10).exists()) {
                        if (m168985l(str, absolutePath).f184033a == 0) {
                            if (psg0VarM181993b == null) {
                                psg0VarM181993b = new psg0();
                            }
                            psg0VarM181993b.f153902a = j;
                            psg0VarM181993b.f153903b = strM132862a;
                            this.f185043b.m168114f(psg0VarM181993b);
                        } else {
                            z2 = false;
                        }
                    }
                } else if (m168985l(str, absolutePath).f184033a == 0) {
                    if (psg0VarM181993b == null) {
                        psg0VarM181993b = new psg0();
                    }
                    psg0VarM181993b.f153902a = j;
                    psg0VarM181993b.f153903b = strM132862a;
                    this.f185043b.m168114f(psg0VarM181993b);
                } else {
                    z2 = false;
                }
            }
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.iqg0
            @Override // java.lang.Runnable
            public final void run() {
                osg0.m168986m(z2, uog0Var, absolutePath);
            }
        });
    }
}
