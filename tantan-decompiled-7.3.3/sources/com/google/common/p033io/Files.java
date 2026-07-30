package com.google.common.p033io;

import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p153l.ceg0;
import p153l.kr3;
import p153l.lr3;
import p153l.tki;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Files {

    /* JADX INFO: renamed from: a */
    public static final ceg0<File> f11292a = new C3029a();

    /* JADX INFO: renamed from: com.google.common.io.Files$a */
    public class C3029a implements ceg0<File> {
    }

    /* JADX INFO: renamed from: a */
    public static kr3 m16415a(File file, FileWriteMode... fileWriteModeArr) {
        return new C3030b(file, fileWriteModeArr, null);
    }

    /* JADX INFO: renamed from: b */
    public static lr3 m16416b(File file) {
        return new C3031c(file, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m16417c(File file, File file2) throws IOException {
        xn80.m212107l(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        m16416b(file).m155577a(m16415a(file2, new FileWriteMode[0]));
    }

    public enum FilePredicate implements tp80<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.io.Files.FilePredicate, p153l.tp80
            public boolean apply(File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.io.Files.FilePredicate, p153l.tp80
            public boolean apply(File file) {
                return file.isFile();
            }
        };

        @Override // p153l.tp80
        public abstract /* synthetic */ boolean apply(File file);

        /* synthetic */ FilePredicate(tki tkiVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.Files$c */
    public static final class C3031c extends lr3 {

        /* JADX INFO: renamed from: a */
        public final File f11295a;

        public C3031c(File file) {
            this.f11295a = (File) xn80.m212111p(file);
        }

        @Override // p153l.lr3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileInputStream mo16420b() throws IOException {
            return new FileInputStream(this.f11295a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f11295a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Files.asByteSource(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3031c(File file, tki tkiVar) {
            this(file);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.Files$b */
    public static final class C3030b extends kr3 {

        /* JADX INFO: renamed from: a */
        public final File f11293a;

        /* JADX INFO: renamed from: b */
        public final ImmutableSet<FileWriteMode> f11294b;

        public C3030b(File file, FileWriteMode... fileWriteModeArr) {
            this.f11293a = (File) xn80.m212111p(file);
            this.f11294b = ImmutableSet.copyOf(fileWriteModeArr);
        }

        @Override // p153l.kr3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileOutputStream mo16418a() throws IOException {
            return new FileOutputStream(this.f11293a, this.f11294b.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f11293a);
            String strValueOf2 = String.valueOf(this.f11294b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
            sb.append("Files.asByteSink(");
            sb.append(strValueOf);
            sb.append(", ");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3030b(File file, FileWriteMode[] fileWriteModeArr, tki tkiVar) {
            this(file, fileWriteModeArr);
        }
    }
}
