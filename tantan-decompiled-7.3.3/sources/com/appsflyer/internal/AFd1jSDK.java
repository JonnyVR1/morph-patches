package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.appsflyer.AFLogger;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l6f;
import p153l.wki;
import p153l.yki;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public final class AFd1jSDK implements AFd1iSDK {

    @NotNull
    private final AFd1kSDK getMediationNetwork;

    public AFd1jSDK(@NotNull AFd1kSDK aFd1kSDK) {
        aFd1kSDK.getClass();
        this.getMediationNetwork = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getRevenue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFd1gSDK) it.next()).getCurrencyIso4217Code;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final void getCurrencyIso4217Code(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File currencyIso4217Code = getCurrencyIso4217Code();
                if (currencyIso4217Code != null && (fileArrListFiles = currencyIso4217Code.listFiles()) != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        name.getClass();
                        int currencyIso4217Code2 = AFc1vSDK.getCurrencyIso4217Code(name);
                        if (i > currencyIso4217Code2 || currencyIso4217Code2 > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(yki.m216470r(file2)));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final boolean getMediationNetwork(@NotNull String... strArr) {
        boolean zM216470r;
        strArr.getClass();
        synchronized (this) {
            try {
                File currencyIso4217Code = getCurrencyIso4217Code();
                zM216470r = true;
                if (currencyIso4217Code != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zM216470r = yki.m216470r(currencyIso4217Code);
                    } else {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                        StringBuilder sb = new StringBuilder("delete all exceptions except for: ");
                        sb.append(ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                        AFh1ySDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                        File[] fileArrListFiles = currencyIso4217Code.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(yki.m216470r(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt.setOf(Boolean.TRUE);
                            }
                            Set set2 = set;
                            if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                                zM216470r = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM216470r;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    @Nullable
    public final String getMonetizationNetwork(@NotNull Throwable th, @NotNull String str) {
        String str2;
        File file;
        AFd1gSDK mediationNetwork;
        th.getClass();
        str.getClass();
        synchronized (this) {
            File currencyIso4217Code = getCurrencyIso4217Code();
            str2 = null;
            if (currencyIso4217Code != null) {
                file = new File(currencyIso4217Code, "6.15.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    th.getClass();
                    str.getClass();
                    StringBuilder sb = new StringBuilder();
                    th.getClass();
                    sb.append(th.getClass().getName());
                    sb.append(": ");
                    sb.append(str);
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(th);
                    sb2.append('\n');
                    sb2.append(CollectionsKt.joinToString$default(AFe1xSDK.getMediationNetwork(th), SignParameters.NEW_LINE, null, null, 0, null, AFe1xSDK.C09624.AFAdRevenueData, 30, null));
                    AFd1gSDK aFd1gSDK = new AFd1gSDK(string, AFe1ySDK.getRevenue(sb2.toString(), "SHA-256"), l6f.m153059b(th), 0, 8, null);
                    String str3 = aFd1gSDK.getRevenue;
                    File file2 = new File(file, str3);
                    if (file2.exists() && (mediationNetwork = AFd1gSDK.Companion.getMediationNetwork(wki.m206830j(file2, null, 1, null))) != null) {
                        mediationNetwork.getCurrencyIso4217Code++;
                        aFd1gSDK = mediationNetwork;
                    }
                    StringBuilder sb3 = new StringBuilder("label=");
                    String str4 = aFd1gSDK.getMediationNetwork;
                    str4.getClass();
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = str4.getBytes(charset);
                    bytes.getClass();
                    sb3.append(Base64.encodeToString(bytes, 2));
                    sb3.append("\nhashName=");
                    String str5 = aFd1gSDK.getRevenue;
                    str5.getClass();
                    byte[] bytes2 = str5.getBytes(charset);
                    bytes2.getClass();
                    sb3.append(Base64.encodeToString(bytes2, 2));
                    sb3.append("\nstackTrace=");
                    String str6 = aFd1gSDK.getMonetizationNetwork;
                    str6.getClass();
                    byte[] bytes3 = str6.getBytes(charset);
                    bytes3.getClass();
                    sb3.append(Base64.encodeToString(bytes3, 2));
                    sb3.append("\nc=");
                    sb3.append(aFd1gSDK.getCurrencyIso4217Code);
                    wki.m206832l(file2, sb3.toString(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                    StringBuilder sb4 = new StringBuilder("Could not cache exception\n ");
                    sb4.append(e.getMessage());
                    AFh1ySDK.v$default(aFLogger, aFg1cSDK, sb4.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    @NotNull
    public final List<AFd1gSDK> getRevenue() {
        List<AFd1gSDK> listEmptyList;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File currencyIso4217Code = getCurrencyIso4217Code();
                listEmptyList = null;
                if (currencyIso4217Code != null && (fileArrListFiles = currencyIso4217Code.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFd1gSDK.Companion companion = AFd1gSDK.INSTANCE;
                                    file2.getClass();
                                    AFd1gSDK mediationNetwork = AFd1gSDK.Companion.getMediationNetwork(wki.m206830j(file2, null, 1, null));
                                    if (mediationNetwork != null) {
                                        arrayList.add(mediationNetwork);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.EXCEPTION_MANAGER;
                            StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                            sb.append(th.getMessage());
                            AFh1ySDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listEmptyList = CollectionsKt.flatten(arrayList2);
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listEmptyList;
    }

    private final File getCurrencyIso4217Code() {
        Context context = this.getMediationNetwork.getCurrencyIso4217Code;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final boolean getMonetizationNetwork() {
        return getMediationNetwork(new String[0]);
    }
}
