package com.google.common.p032io;

import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p149l.lq3;
import p149l.mq3;
import p149l.oh80;
import p149l.sf80;
import p149l.u5g0;
import p149l.whi;

/* JADX INFO: loaded from: classes7.dex */
public final class Files {

    /* JADX INFO: renamed from: a */
    public static final u5g0<File> f11255a = new C3006a();

    /* JADX INFO: renamed from: com.google.common.io.Files$a */
    public class C3006a implements u5g0<File> {
    }

    /* JADX INFO: renamed from: a */
    public static lq3 m16360a(File file, FileWriteMode... fileWriteModeArr) {
        return new C3007b(file, fileWriteModeArr, null);
    }

    /* JADX INFO: renamed from: b */
    public static mq3 m16361b(File file) {
        return new C3008c(file, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m16362c(File file, File file2) throws IOException {
        sf80.m183890l(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        m16361b(file).m155876a(m16360a(file2, new FileWriteMode[0]));
    }

    public enum FilePredicate implements oh80<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.io.Files.FilePredicate, p149l.oh80
            public boolean apply(File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.io.Files.FilePredicate, p149l.oh80
            public boolean apply(File file) {
                return file.isFile();
            }
        };

        @Override // p149l.oh80
        public abstract /* synthetic */ boolean apply(File file);

        /* synthetic */ FilePredicate(whi whiVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.Files$c */
    public static final class C3008c extends mq3 {

        /* JADX INFO: renamed from: a */
        public final File f11258a;

        public C3008c(File file) {
            this.f11258a = (File) sf80.m183894p(file);
        }

        @Override // p149l.mq3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream mo16365b() throws IOException {
            return new FileInputStream(this.f11258a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f11258a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Files.asByteSource(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3008c(File file, whi whiVar) {
            this(file);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.Files$b */
    public static final class C3007b extends lq3 {

        /* JADX INFO: renamed from: a */
        public final File f11256a;

        /* JADX INFO: renamed from: b */
        public final ImmutableSet<FileWriteMode> f11257b;

        public C3007b(File file, FileWriteMode... fileWriteModeArr) {
            this.f11256a = (File) sf80.m183894p(file);
            this.f11257b = ImmutableSet.copyOf(fileWriteModeArr);
        }

        @Override // p149l.lq3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileOutputStream mo16363a() throws IOException {
            return new FileOutputStream(this.f11256a, this.f11257b.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f11256a);
            String strValueOf2 = String.valueOf(this.f11257b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
            sb.append("Files.asByteSink(");
            sb.append(strValueOf);
            sb.append(", ");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3007b(File file, FileWriteMode[] fileWriteModeArr, whi whiVar) {
            this(file, fileWriteModeArr);
        }
    }
}
