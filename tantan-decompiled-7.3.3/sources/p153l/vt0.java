package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes6.dex */
public class vt0 implements ylc0.InterfaceC21622a {
    /* JADX INFO: renamed from: b */
    private void m202667b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private long m202668c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // p153l.ylc0.InterfaceC21622a
    /* JADX INFO: renamed from: a */
    public void mo202669a(Context context, String[] strArr, String str, File file, zlc0 zlc0Var) throws Throwable {
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        ZipFile zipFile2 = null;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5) {
                    zipFile = null;
                    break;
                } else {
                    try {
                        zipFile = new ZipFile(new File(applicationInfo.sourceDir), 1);
                        break;
                    } catch (IOException unused) {
                        i = i2;
                    }
                }
            }
            try {
                if (zipFile != null) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= 5) {
                            zlc0Var.m220182h("FATAL! Couldn't extract the library from the APK!");
                            break;
                        }
                        String string = null;
                        ZipEntry entry = null;
                        for (String str2 : strArr) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ShareConstants.SO_PATH);
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str2);
                            sb.append(c);
                            sb.append(str);
                            string = sb.toString();
                            entry = zipFile.getEntry(string);
                            if (entry != null) {
                                break;
                            }
                        }
                        if (string != null) {
                            zlc0Var.m220183i("Looking for %s in APK...", string);
                        }
                        if (entry == null) {
                            if (string == null) {
                                throw new MissingLibraryException(str);
                            }
                            throw new MissingLibraryException(string);
                        }
                        zlc0Var.m220183i("Found %s! Extracting...", string);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = zipFile.getInputStream(entry);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            long jM202668c = m202668c(inputStream, fileOutputStream);
                                            fileOutputStream.getFD().sync();
                                            if (jM202668c == file.length()) {
                                                m202667b(inputStream);
                                                m202667b(fileOutputStream);
                                                file.setReadable(true, false);
                                                file.setExecutable(true, false);
                                                file.setWritable(true);
                                                break;
                                            }
                                        } catch (FileNotFoundException | IOException unused2) {
                                        } catch (Throwable th) {
                                            th = th;
                                            zipFile2 = inputStream;
                                            m202667b(zipFile2);
                                            m202667b(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        fileOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                                m202667b(inputStream);
                                m202667b(fileOutputStream);
                            }
                        } catch (IOException unused7) {
                        }
                        i3 = i4;
                    }
                } else {
                    zlc0Var.m220182h("FATAL! Couldn't find application APK!");
                    if (zipFile == null) {
                        return;
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException unused8) {
                }
            } catch (Throwable th4) {
                th = th4;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
