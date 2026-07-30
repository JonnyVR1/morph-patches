package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class c31 {

    /* JADX INFO: renamed from: a */
    public final File f78428a;

    /* JADX INFO: renamed from: b */
    public final File f78429b;

    /* JADX INFO: renamed from: c */
    public final File f78430c;

    public c31(@NonNull File file) {
        this.f78428a = file;
        this.f78429b = new File(file.getPath() + ".new");
        this.f78430c = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: c */
    public static void m104966c(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m104967e(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m104968a(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m104967e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (this.f78429b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f78429b);
    }

    /* JADX INFO: renamed from: b */
    public void m104969b(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m104967e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        m104966c(this.f78429b, this.f78428a);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public FileOutputStream m104970d() throws IOException {
        if (this.f78430c.exists()) {
            m104966c(this.f78430c, this.f78428a);
        }
        try {
            return new FileOutputStream(this.f78429b);
        } catch (FileNotFoundException unused) {
            if (!this.f78429b.getParentFile().mkdirs()) {
                hj10.m131352a("Failed to create directory for ", this.f78429b);
                return null;
            }
            try {
                return new FileOutputStream(this.f78429b);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.f78429b, e);
            }
        }
    }
}
