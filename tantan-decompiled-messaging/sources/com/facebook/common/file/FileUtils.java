package com.facebook.common.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p149l.rf80;

/* JADX INFO: loaded from: classes.dex */
public class FileUtils {

    public static class FileDeleteException extends IOException {
        public FileDeleteException(String str) {
            super(str);
        }
    }

    public static class ParentDirNotFoundException extends FileNotFoundException {
        public ParentDirNotFoundException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8144a(File file) throws CreateDirectoryException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new CreateDirectoryException(file.getAbsolutePath(), new FileDeleteException(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new CreateDirectoryException(file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8145b(File file, File file2) throws RenameException {
        Throwable fileDeleteException;
        rf80.m179116g(file);
        rf80.m179116g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.exists()) {
            fileDeleteException = new FileDeleteException(file2.getAbsolutePath());
        } else if (file.getParentFile().exists()) {
            fileDeleteException = !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null;
        } else {
            fileDeleteException = new ParentDirNotFoundException(file.getAbsolutePath());
        }
        throw new RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), fileDeleteException);
    }

    public static class CreateDirectoryException extends IOException {
        public CreateDirectoryException(String str, Throwable th) {
            super(str);
            initCause(th);
        }

        public CreateDirectoryException(String str) {
            super(str);
        }
    }

    public static class RenameException extends IOException {
        public RenameException(String str, Throwable th) {
            super(str);
            initCause(th);
        }

        public RenameException(String str) {
            super(str);
        }
    }
}
