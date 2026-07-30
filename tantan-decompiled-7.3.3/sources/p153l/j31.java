package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j31 {

    /* JADX INFO: renamed from: a */
    public final File f118141a;

    /* JADX INFO: renamed from: b */
    public final File f118142b;

    /* JADX INFO: renamed from: c */
    public final File f118143c;

    public j31(@NonNull File file) {
        this.f118141a = file;
        this.f118142b = new File(file.getPath() + ".new");
        this.f118143c = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: c */
    public static void m143300c(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m143301e(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m143302a(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m143301e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (this.f118142b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f118142b);
    }

    /* JADX INFO: renamed from: b */
    public void m143303b(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m143301e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        m143300c(this.f118142b, this.f118141a);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public FileOutputStream m143304d() throws IOException {
        if (this.f118143c.exists()) {
            m143300c(this.f118143c, this.f118141a);
        }
        try {
            return new FileOutputStream(this.f118142b);
        } catch (FileNotFoundException unused) {
            if (!this.f118142b.getParentFile().mkdirs()) {
                rr10.m182681a("Failed to create directory for ", this.f118142b);
                return null;
            }
            try {
                return new FileOutputStream(this.f118142b);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.f118142b, e);
            }
        }
    }
}
