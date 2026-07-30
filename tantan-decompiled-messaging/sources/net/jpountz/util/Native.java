package net.jpountz.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public enum Native {
    ;

    private static boolean loaded = false;

    /* JADX INFO: renamed from: net.jpountz.util.Native$OS */
    public enum EnumC21830OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");

        public final String libExtension;
        public final String name;

        EnumC21830OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    /* JADX INFO: renamed from: net.jpountz.util.Native$a */
    public static class C21831a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        private final String f205837a = "liblz4-java-";

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
        }
    }

    private static String arch() {
        return System.getProperty("os.arch");
    }

    private static void cleanupOldTempLibs() {
        File[] fileArrListFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new C21831a());
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static synchronized boolean isLoaded() {
        return loaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static synchronized void load() {
        Throwable th;
        IOException e;
        ?? CreateTempFile = ".";
        synchronized (Native.class) {
            if (loaded) {
                return;
            }
            cleanupOldTempLibs();
            try {
                System.loadLibrary("lz4-java");
                loaded = true;
            } catch (UnsatisfiedLinkError unused) {
                ?? ResourceName = resourceName();
                InputStream resourceAsStream = Native.class.getResourceAsStream(ResourceName);
                if (resourceAsStream == null) {
                    throw new UnsupportedOperationException("Unsupported OS/arch, cannot find " + ResourceName + ". Please try building from source.");
                }
                try {
                    try {
                        CreateTempFile = File.createTempFile("liblz4-java-", "." + m221029os().libExtension + ".lck");
                        try {
                            File file = new File(CreateTempFile.getAbsolutePath().replaceFirst(".lck$", ""));
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int i = resourceAsStream.read(bArr);
                                        if (i == -1) {
                                            fileOutputStream.close();
                                            System.load(file.getAbsolutePath());
                                            loaded = true;
                                            file.deleteOnExit();
                                            CreateTempFile.deleteOnExit();
                                            return;
                                        }
                                        fileOutputStream.write(bArr, 0, i);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th4) {
                                            th2.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (IOException e2) {
                                e = e2;
                                throw new ExceptionInInitializerError("Cannot unpack liblz4-java: " + e);
                            }
                        } catch (IOException e3) {
                            e = e3;
                        } catch (Throwable th5) {
                            ResourceName = 0;
                            th = th5;
                            if (loaded) {
                                ResourceName.deleteOnExit();
                                CreateTempFile.deleteOnExit();
                            } else {
                                if (ResourceName != 0 && ResourceName.exists() && !ResourceName.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + ResourceName);
                                }
                                if (CreateTempFile != 0 && CreateTempFile.exists() && !CreateTempFile.delete()) {
                                    throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + CreateTempFile);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th7) {
                    ResourceName = 0;
                    th = th7;
                    CreateTempFile = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: os */
    private static EnumC21830OS m221029os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return EnumC21830OS.LINUX;
        }
        if (property.contains("Mac")) {
            return EnumC21830OS.MAC;
        }
        if (property.contains("Windows")) {
            return EnumC21830OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return EnumC21830OS.SOLARIS;
        }
        qq3.m175877a("Unsupported operating system: ".concat(property));
        return null;
    }

    private static String resourceName() {
        EnumC21830OS enumC21830OSM221029os = m221029os();
        return "/" + Native.class.getPackage().getName().replace('.', '/') + "/" + enumC21830OSM221029os.name + "/" + arch() + "/liblz4-java." + enumC21830OSM221029os.libExtension;
    }
}
