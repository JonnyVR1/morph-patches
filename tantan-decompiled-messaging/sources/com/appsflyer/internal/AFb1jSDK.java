package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1jSDK implements AFb1uSDK {
    private final AFd1kSDK getRevenue;

    public AFb1jSDK(AFd1kSDK aFd1kSDK) {
        this.getRevenue = aFd1kSDK;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    private static AFb1qSDK getMediationNetwork(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1qSDK aFb1qSDK = new AFb1qSDK(cArr);
                    aFb1qSDK.getCurrencyIso4217Code = file.getName();
                    try {
                        inputStreamReader.close();
                        return aFb1qSDK;
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e);
                        return aFb1qSDK;
                    }
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    @WorkerThread
    public final boolean AFAdRevenueData(String str) {
        File file = new File(new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.m5245i(aFg1cSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    @NonNull
    @WorkerThread
    public final List<AFb1qSDK> getCurrencyIso4217Code() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    aFLogger.m5245i(aFg1cSDK, sb.toString());
                    arrayList.add(getMediationNetwork(file2));
                }
            }
            return arrayList;
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
            return arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1uSDK
    @Nullable
    @WorkerThread
    public final String getMonetizationNetwork(AFb1qSDK aFb1qSDK) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 40) {
                AFLogger.INSTANCE.m5245i(AFg1cSDK.CACHE, "reached cache limit, not caching request");
                return null;
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            StringBuilder sb = new StringBuilder("caching request with URL: ");
            sb.append(aFb1qSDK.getRevenue);
            aFLogger.m5245i(aFg1cSDK, sb.toString());
            String string = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache"), string);
            file2.createNewFile();
            OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
            try {
                outputStreamWriter3.write("version=");
                outputStreamWriter3.write(aFb1qSDK.getMonetizationNetwork);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("url=");
                outputStreamWriter3.write(aFb1qSDK.getRevenue);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("data=");
                outputStreamWriter3.write(Base64.encodeToString(aFb1qSDK.getCurrencyIso4217Code(), 2));
                outputStreamWriter3.write(10);
                AFf1zSDK aFf1zSDK = aFb1qSDK.AFAdRevenueData;
                if (aFf1zSDK != null) {
                    outputStreamWriter3.write("type=");
                    outputStreamWriter3.write(aFf1zSDK.name());
                    outputStreamWriter3.write(10);
                }
                outputStreamWriter3.flush();
                aFLogger.m5245i(aFg1cSDK, "done, cacheKey: ".concat(String.valueOf(string)));
                try {
                    outputStreamWriter3.close();
                    return string;
                } catch (IOException e) {
                    AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e);
                    return string;
                }
            } catch (Exception e2) {
                outputStreamWriter = outputStreamWriter3;
                e = e2;
                try {
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e3);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter2 = outputStreamWriter;
                    if (outputStreamWriter2 != null) {
                        try {
                            outputStreamWriter2.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                outputStreamWriter2 = outputStreamWriter3;
                th = th2;
                if (outputStreamWriter2 != null) {
                    outputStreamWriter2.close();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    @WorkerThread
    public final void getMediationNetwork() {
        try {
            if (new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    @WorkerThread
    public final void getMonetizationNetwork() {
        try {
            File file = new File(this.getRevenue.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.m5245i(aFg1cSDK, sb.toString());
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger.m5245i(aFg1cSDK, sb2.toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}
