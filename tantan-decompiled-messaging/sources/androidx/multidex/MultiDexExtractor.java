package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p149l.kj10;
import p149l.qkq0;
import p149l.vgq0;

/* JADX INFO: loaded from: classes.dex */
public final class MultiDexExtractor implements Closeable {

    /* JADX INFO: renamed from: a */
    public final File f2493a;

    /* JADX INFO: renamed from: b */
    public final long f2494b;

    /* JADX INFO: renamed from: c */
    public final File f2495c;

    /* JADX INFO: renamed from: d */
    public final RandomAccessFile f2496d;

    /* JADX INFO: renamed from: e */
    public final FileChannel f2497e;

    /* JADX INFO: renamed from: f */
    public final FileLock f2498f;

    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    /* JADX INFO: renamed from: androidx.multidex.MultiDexExtractor$a */
    public class C0523a implements FileFilter {
        public C0523a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public MultiDexExtractor(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f2493a = file;
        this.f2495c = file2;
        this.f2494b = m3188u(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f2496d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f2497e = channel;
            try {
                file3.getPath();
                this.f2498f = channel.lock();
                file3.getPath();
            } catch (IOException e) {
                e = e;
                m3184m(this.f2497e);
                throw e;
            } catch (Error e2) {
                e = e2;
                m3184m(this.f2497e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m3184m(this.f2497e);
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            m3184m(this.f2496d);
            throw e;
        } catch (Error e5) {
            e = e5;
            m3184m(this.f2496d);
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            m3184m(this.f2496d);
            throw e;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m3183I(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor editorEdit = m3186q(context).edit();
        editorEdit.putLong(str + "timestamp", j);
        editorEdit.putLong(str + "crc", j2);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            editorEdit.putLong(str + "dex.crc." + i, extractedDex.crc);
            editorEdit.putLong(str + "dex.time." + i, extractedDex.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: m */
    public static void m3184m(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3185n(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                file.getPath();
                if (fileCreateTempFile.renameTo(file)) {
                    m3184m(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            m3184m(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public static SharedPreferences m3186q(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX INFO: renamed from: t */
    public static long m3187t(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* JADX INFO: renamed from: u */
    public static long m3188u(File file) throws IOException {
        long jM198384c = vgq0.m198384c(file);
        return jM198384c == -1 ? jM198384c - 1 : jM198384c;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m3189v(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesM3186q = m3186q(context);
        if (sharedPreferencesM3186q.getLong(str + "timestamp", -1L) != m3187t(file)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("crc");
        return sharedPreferencesM3186q.getLong(sb.toString(), -1L) != j;
    }

    /* JADX INFO: renamed from: B */
    public List<? extends File> m3190B(Context context, String str, boolean z) throws IOException {
        List<ExtractedDex> listM3192H;
        List<ExtractedDex> listM3191F;
        this.f2493a.getPath();
        if (!this.f2498f.isValid()) {
            qkq0.m175383a("MultiDexExtractor was closed");
            return null;
        }
        if (!z && !m3189v(context, this.f2493a, this.f2494b, str)) {
            try {
                listM3191F = m3191F(context, str);
            } catch (IOException unused) {
                listM3192H = m3192H();
                m3183I(context, str, m3187t(this.f2493a), this.f2494b, listM3192H);
                listM3191F = listM3192H;
            }
            listM3191F.size();
            return listM3191F;
        }
        listM3192H = m3192H();
        m3183I(context, str, m3187t(this.f2493a), this.f2494b, listM3192H);
        listM3191F = listM3192H;
        listM3191F.size();
        return listM3191F;
    }

    /* JADX INFO: renamed from: F */
    public final List<ExtractedDex> m3191F(Context context, String str) throws IOException {
        String str2 = this.f2493a.getName() + ".classes";
        SharedPreferences sharedPreferencesM3186q = m3186q(context);
        int i = sharedPreferencesM3186q.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.f2495c, str2 + i2 + ".zip");
            if (!extractedDex.isFile()) {
                kj10.m146167a("Missing extracted secondary dex file '", extractedDex.getPath(), "'");
                return null;
            }
            extractedDex.crc = m3188u(extractedDex);
            long j = sharedPreferencesM3186q.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferencesM3186q.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = extractedDex.lastModified();
            if (j2 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesM3186q;
                if (j == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i2++;
                    sharedPreferencesM3186q = sharedPreferences;
                    str2 = str3;
                }
            }
            StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
            sb.append(extractedDex);
            long j3 = extractedDex.crc;
            sb.append(" (key \"");
            sb.append(str);
            sb.append("\"), expected modification time: ");
            sb.append(j2);
            sb.append(", modification time: ");
            sb.append(jLastModified);
            sb.append(", expected crc: ");
            sb.append(j);
            sb.append(", file crc: ");
            sb.append(j3);
            throw new IOException(sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final List<ExtractedDex> m3192H() throws IOException {
        String str = this.f2493a.getName() + ".classes";
        m3193k();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f2493a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f2495c, str + i + ".zip");
                arrayList.add(extractedDex);
                extractedDex.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m3185n(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = m3188u(extractedDex);
                        z = true;
                    } catch (IOException unused) {
                        extractedDex.getAbsolutePath();
                        z = false;
                    }
                    extractedDex.getAbsolutePath();
                    extractedDex.length();
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            extractedDex.getPath();
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ShareConstants.DEX_SUFFIX);
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2498f.release();
        this.f2497e.close();
        this.f2496d.close();
    }

    /* JADX INFO: renamed from: k */
    public final void m3193k() {
        File[] fileArrListFiles = this.f2495c.listFiles(new C0523a());
        if (fileArrListFiles == null) {
            this.f2495c.getPath();
            return;
        }
        for (File file : fileArrListFiles) {
            file.getPath();
            file.length();
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }
}
