package com.tencent.youtu.sdkkitframework.common;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import p149l.pkq0;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    public static String TAG = "FileUtils";
    public static Map<String, String> mLoadedLibrary = new HashMap();

    public FileUtils() {
        throw new AssertionError();
    }

    public static boolean copyAsset(AssetManager assetManager, String str, String str2) {
        try {
            InputStream inputStreamOpen = assetManager.open(str);
            new File(str2).createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            copyFile(inputStreamOpen, fileOutputStream);
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static File createFile(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        File file = new File(sb.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getPath() + str3 + str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    public static void loadLibrary(String str) {
        if (mLoadedLibrary.get(str) == null) {
            YtLogger.m84639i(TAG, "[YTUtils.loadLibrary] " + System.getProperty("java.library.path"));
            System.loadLibrary(str);
            mLoadedLibrary.put(str, "loaded");
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static StringBuilder readAssetFile(Context context, String str) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        StringBuilder sb = new StringBuilder("");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                                return sb;
                            } catch (IOException e2) {
                                pkq0.m170054a("IOException occurred. ", e2);
                                return null;
                            }
                        }
                        if (!sb.toString().equals("")) {
                            sb.append("\r\n");
                        }
                        sb.append(line);
                    } catch (IOException e3) {
                        e = e3;
                        throw new RuntimeException("IOException occurred. ", e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            pkq0.m170054a("IOException occurred. ", e4);
                            return null;
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static StringBuilder readFile(String str) throws Throwable {
        ?? r1;
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                                return sb;
                            } catch (IOException e) {
                                pkq0.m170054a("IOException occurred. ", e);
                                return null;
                            }
                        }
                        if (!sb.toString().equals("")) {
                            sb.append("\r\n");
                        }
                        sb.append(line);
                    } catch (IOException e2) {
                        e = e2;
                        throw new RuntimeException("IOException occurred. ", e);
                    }
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e4) {
                        pkq0.m170054a("IOException occurred. ", e4);
                        return null;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = file;
        }
    }

    public static void writeFile(File file, String str) throws Throwable {
        PrintWriter printWriter = null;
        try {
            try {
                PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                try {
                    printWriter2.println(str);
                    printWriter2.flush();
                    printWriter2.close();
                } catch (Exception e) {
                    e = e;
                    printWriter = printWriter2;
                    e.printStackTrace();
                    if (printWriter != null) {
                        printWriter.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    printWriter = printWriter2;
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
