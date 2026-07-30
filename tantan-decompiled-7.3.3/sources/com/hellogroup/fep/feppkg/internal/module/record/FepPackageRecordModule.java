package com.hellogroup.fep.feppkg.internal.module.record;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c4s;
import p153l.jzv;
import p153l.khi;
import p153l.lhi;
import p153l.mhi;
import p153l.pgi;
import p153l.ul5;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;
import p153l.yi5;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 V2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0003J%\u0010!\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010#\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b*\u0010\u0016J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0003J-\u00104\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0003J\u001f\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b;\u0010(J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0003R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@RT\u0010G\u001aB\u0012\f\u0012\n C*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n C*\u0004\u0018\u00010D0D C* \u0012\f\u0012\n C*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n C*\u0004\u0018\u00010D0D\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010JR\u0018\u0010S\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NRT\u0010U\u001aB\u0012\f\u0012\n C*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n C*\u0004\u0018\u00010D0D C* \u0012\f\u0012\n C*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n C*\u0004\u0018\u00010D0D\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/internal/module/record/FepPackageRecordModule;", "Ll/ul5;", "<init>", "()V", "Landroid/content/SharedPreferences$Editor;", "editor", "", c4s.C_ZONE, "(Landroid/content/SharedPreferences$Editor;)V", "", "", "Ll/khi;", "verData", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/util/Map;)J", "bid", "jsonString", "Ll/lhi;", "o", "(Ljava/lang/String;Ljava/lang/String;)Ll/lhi;", BaseSei.f14624X, "(Ljava/lang/String;)Ll/lhi;", BaseSei.f14625Y, BaseSei.f14626Z, "(Ljava/lang/String;)V", "q", "recordData", "D", "(Ll/lhi;)Ljava/lang/String;", "w", "baseVersion", "fullVersion", "B", "(Ljava/lang/String;Ljava/lang/String;J)V", "fullVer", "Ll/mhi;", ResourceDirection.f39656v, "(Ljava/lang/String;Ljava/lang/String;J)Ll/mhi;", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "u", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/String;)J", "F", "(Ljava/lang/String;Ljava/lang/String;)V", "", "asymEncrypt", "E", "(Ljava/lang/String;Ljava/lang/String;I)V", "k", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ll/zgi;", BaseSei.INFO, "A", "(Ll/zgi;)V", "p", BLiveStormDanmakuGiftResourceType.f45294s, "onFront", "onBack", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "pkgRecordData", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "kotlin.jvm.PlatformType", "", "b", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "waitSaveBids", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSaveScheduled", "Lkotlinx/coroutines/o;", Constants.INAPP_DATA_TAG, "Lkotlinx/coroutines/o;", "saveJob", "e", "isDataLoaded", "f", "loadJob", "g", "activeBids", "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageRecordModule implements ul5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC15593o saveJob;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC15593o loadJob;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, lhi> pkgRecordData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConcurrentHashMap.KeySetView<String, Boolean> waitSaveBids = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicBoolean isSaveScheduled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean isDataLoaded = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ConcurrentHashMap.KeySetView<String, Boolean> activeBids = ConcurrentHashMap.newKeySet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX INFO: renamed from: C */
    public final void m17700C(SharedPreferences.Editor editor) {
        int i;
        int i2;
        int i3;
        long j;
        File[] fileArr;
        File[] fileArr2;
        int i4;
        int i5;
        int i6;
        Exception exc;
        int i7;
        int i8;
        try {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109819v = fepPackageContext.m17684k().m109819v();
            if (fileM109819v.exists() && fileM109819v.isDirectory()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File[] fileArrListFiles = fileM109819v.listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < length) {
                        File file = fileArrListFiles[i9];
                        file.getClass();
                        if (file.isDirectory()) {
                            String name = file.getName();
                            String str = "pkg_record_" + name;
                            SharedPreferences sharedPreferencesM17576d = FepContext.INSTANCE.m17576d();
                            if (sharedPreferencesM17576d == null || !sharedPreferencesM17576d.contains(str)) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                File[] fileArrListFiles2 = file.listFiles();
                                if (fileArrListFiles2 != null) {
                                    int length2 = fileArrListFiles2.length;
                                    int i11 = 0;
                                    long j2 = 0;
                                    while (i11 < length2) {
                                        File file2 = fileArrListFiles2[i11];
                                        file2.getClass();
                                        if (file2.isDirectory()) {
                                            try {
                                                String name2 = file2.getName();
                                                File[] fileArrListFiles3 = file2.listFiles();
                                                if (fileArrListFiles3 == null || fileArrListFiles3.length == 0) {
                                                    fileArr2 = fileArrListFiles;
                                                    i4 = i11;
                                                    i5 = length;
                                                    i6 = i9;
                                                } else {
                                                    fileArr2 = fileArrListFiles;
                                                    try {
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        i4 = i11;
                                                        try {
                                                            int length3 = fileArrListFiles3.length;
                                                            i5 = length;
                                                            int i12 = 0;
                                                            while (i12 < length3) {
                                                                try {
                                                                    File file3 = fileArrListFiles3[i12];
                                                                    file3.getClass();
                                                                    if (file3.isDirectory()) {
                                                                        try {
                                                                            String name3 = file3.getName();
                                                                            name3.getClass();
                                                                            Long lP = StringsKt.m94281p(name3);
                                                                            if (lP != null) {
                                                                                i8 = i12;
                                                                                i6 = i9;
                                                                                try {
                                                                                    long jLongValue = lP.longValue();
                                                                                    if (jLongValue <= 0) {
                                                                                        i7 = length3;
                                                                                    } else {
                                                                                        i7 = length3;
                                                                                        try {
                                                                                            linkedHashMap2.put(String.valueOf(jLongValue), new mhi(jLongValue, jCurrentTimeMillis));
                                                                                            if (jLongValue > j2) {
                                                                                                j2 = jLongValue;
                                                                                            }
                                                                                        } catch (Exception e) {
                                                                                            e = e;
                                                                                            Exception exc2 = e;
                                                                                            try {
                                                                                                pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Parse fullVer failed: " + file3.getName(), exc2, 0, null, 12, null);
                                                                                            } catch (Exception e2) {
                                                                                                e = e2;
                                                                                                exc = e;
                                                                                                pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Scan baseVer dir failed: " + file2.getName(), exc, 0, null, 12, null);
                                                                                                i11 = i4 + 1;
                                                                                                fileArrListFiles = fileArr2;
                                                                                                length = i5;
                                                                                                i9 = i6;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Exception e3) {
                                                                                    e = e3;
                                                                                    i7 = length3;
                                                                                }
                                                                            } else {
                                                                                i7 = length3;
                                                                                i8 = i12;
                                                                                i6 = i9;
                                                                            }
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            i7 = length3;
                                                                            i8 = i12;
                                                                            i6 = i9;
                                                                        }
                                                                    } else {
                                                                        i7 = length3;
                                                                        i8 = i12;
                                                                        i6 = i9;
                                                                    }
                                                                    i12 = i8 + 1;
                                                                    i9 = i6;
                                                                    length3 = i7;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    i6 = i9;
                                                                }
                                                            }
                                                            i6 = i9;
                                                            try {
                                                                if (!linkedHashMap2.isEmpty()) {
                                                                    name2.getClass();
                                                                    try {
                                                                        linkedHashMap.put(name2, new khi(0L, linkedHashMap2));
                                                                    } catch (Exception e6) {
                                                                        e = e6;
                                                                        exc = e;
                                                                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Scan baseVer dir failed: " + file2.getName(), exc, 0, null, 12, null);
                                                                    }
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                exc = e;
                                                                pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Scan baseVer dir failed: " + file2.getName(), exc, 0, null, 12, null);
                                                                i11 = i4 + 1;
                                                                fileArrListFiles = fileArr2;
                                                                length = i5;
                                                                i9 = i6;
                                                            }
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                            i5 = length;
                                                            i6 = i9;
                                                            exc = e;
                                                            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Scan baseVer dir failed: " + file2.getName(), exc, 0, null, 12, null);
                                                            i11 = i4 + 1;
                                                            fileArrListFiles = fileArr2;
                                                            length = i5;
                                                            i9 = i6;
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        i4 = i11;
                                                        i5 = length;
                                                        i6 = i9;
                                                        exc = e;
                                                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Scan baseVer dir failed: " + file2.getName(), exc, 0, null, 12, null);
                                                        i11 = i4 + 1;
                                                        fileArrListFiles = fileArr2;
                                                        length = i5;
                                                        i9 = i6;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                fileArr2 = fileArrListFiles;
                                            }
                                        } else {
                                            fileArr2 = fileArrListFiles;
                                            i4 = i11;
                                            i5 = length;
                                            i6 = i9;
                                        }
                                        i11 = i4 + 1;
                                        fileArrListFiles = fileArr2;
                                        length = i5;
                                        i9 = i6;
                                    }
                                    i2 = length;
                                    i3 = i9;
                                    j = j2;
                                } else {
                                    i2 = length;
                                    i3 = i9;
                                    j = 0;
                                }
                                fileArr = fileArrListFiles;
                                if (!linkedHashMap.isEmpty()) {
                                    name.getClass();
                                    lhi lhiVar = new lhi(name, 0, j, linkedHashMap);
                                    this.pkgRecordData.put(name, lhiVar);
                                    editor.putString(str, m17701D(lhiVar));
                                    i10++;
                                    Iterator it = linkedHashMap.values().iterator();
                                    int size = 0;
                                    while (it.hasNext()) {
                                        size += ((khi) it.next()).m149790a().size();
                                    }
                                    pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "First install record for bid=" + name + ", baseVers=" + linkedHashMap.size() + ", totalFullVers=" + size + ", usedVer=" + j, null, 0, 6, null);
                                }
                            } else {
                                pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Record already exists for bid: " + name + ", skip", null, 2, null);
                            }
                            i9 = i3 + 1;
                            fileArrListFiles = fileArr;
                            length = i2;
                        }
                        fileArr = fileArrListFiles;
                        i2 = length;
                        i3 = i9;
                        i9 = i3 + 1;
                        fileArrListFiles = fileArr;
                        length = i2;
                    }
                    i = i10;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "First install scan completed, created " + i + " bid records", null, 0, 6, null);
                    return;
                }
                return;
            }
            pgi.m172235f(fepPackageContext.m17685l(), "Resource root path not found: " + fileM109819v.getAbsolutePath(), null, 0, 6, null);
        } catch (Exception e11) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "First install scan failed: " + e11.getMessage(), e11, 0, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: D */
    private final String m17701D(lhi recordData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asym", recordData.getAsym());
        jSONObject.put("usedVer", recordData.getUsedVer());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, khi> entry : recordData.m154205c().entrySet()) {
            String key = entry.getKey();
            khi value = entry.getValue();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, mhi> entry2 : value.m149790a().entrySet()) {
                String key2 = entry2.getKey();
                mhi value2 = entry2.getValue();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("fullVer", value2.getFullVer());
                jSONObject5.put("lastVisitT", value2.getLastVisitT());
                jSONObject4.put(key2, jSONObject5);
            }
            jSONObject3.put("fullVers", jSONObject4);
            jSONObject2.put(key, jSONObject3);
        }
        jSONObject.put("verData", jSONObject2);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: l */
    private final long m17712l(Map<String, khi> verData) {
        Object obj;
        if (verData != null && !verData.isEmpty()) {
            Map mutableMap = MapsKt.toMutableMap(verData);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mutableMap.entrySet()) {
                if (!Intrinsics.m88377d((String) entry.getKey(), "custom")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection collectionValues = linkedHashMap.values();
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((khi) it.next()).m149790a().values());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    long lastVisitT = ((mhi) next).getLastVisitT();
                    do {
                        Object next2 = it2.next();
                        long lastVisitT2 = ((mhi) next2).getLastVisitT();
                        if (lastVisitT < lastVisitT2) {
                            next = next2;
                            lastVisitT = lastVisitT2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            mhi mhiVar = (mhi) obj;
            if (mhiVar != null) {
                return mhiVar.getFullVer();
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m17713n(FepPackageRecordModule fepPackageRecordModule, String str, String str2, Long l2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        fepPackageRecordModule.m17725m(str, str2, l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final lhi m17714o(String bid, String jsonString) {
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            int iOptInt = jSONObject.optInt("asym", 0);
            long jLongValue = 0;
            long jOptLong = jSONObject.optLong("usedVer", 0L);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONObject.has("verData")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("verData");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("fullVers");
                    if (jSONObjectOptJSONObject3 != null) {
                        jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3;
                    }
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(next2);
                        if (jSONObjectOptJSONObject4 == null) {
                            jSONObjectOptJSONObject4 = new JSONObject();
                        }
                        next2.getClass();
                        Long lP = StringsKt.m94281p(next2);
                        if (lP != null) {
                            jLongValue = lP.longValue();
                        }
                        linkedHashMap2.put(next2, new mhi(jSONObjectOptJSONObject4.optLong("fullVer", jLongValue), jSONObjectOptJSONObject4.optLong("lastVisitT")));
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                        itKeys = itKeys;
                        jLongValue = 0;
                    }
                    JSONObject jSONObject2 = jSONObjectOptJSONObject;
                    Iterator<String> it = itKeys;
                    if (linkedHashMap2.isEmpty()) {
                        jLongValue = 0;
                    } else {
                        next.getClass();
                        jLongValue = 0;
                        linkedHashMap.put(next, new khi(0L, linkedHashMap2));
                    }
                    jSONObjectOptJSONObject = jSONObject2;
                    itKeys = it;
                }
            }
            return new lhi(bid, iOptInt, jOptLong, linkedHashMap);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m17715q() {
        SharedPreferences.Editor editorEdit;
        if (this.waitSaveBids.isEmpty()) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesM17576d = FepContext.INSTANCE.m17576d();
            if (sharedPreferencesM17576d == null || (editorEdit = sharedPreferencesM17576d.edit()) == null) {
                return;
            }
            ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.waitSaveBids;
            keySetView.getClass();
            Set<String> set = CollectionsKt.toSet(keySetView);
            this.waitSaveBids.clear();
            int i = 0;
            for (String str : set) {
                lhi lhiVar = this.pkgRecordData.get(str);
                if (lhiVar != null) {
                    String strM17701D = m17701D(lhiVar);
                    editorEdit.putString("pkg_record_" + str, strM17701D);
                    i++;
                    FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
                    if (fepPackageContext.m17678e()) {
                        pgi.m172233b(fepPackageContext.m17685l(), "Flushed " + i + " waiting records to SP (Cache: " + this.pkgRecordData.size() + ") data=" + strM17701D, null, 2, null);
                    }
                } else {
                    editorEdit.remove("pkg_record_" + str);
                }
            }
            editorEdit.apply();
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Flush waiting data to SP failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final lhi m17716x(String bid) {
        String str;
        this.activeBids.add(bid);
        lhi lhiVar = this.pkgRecordData.get(bid);
        if (lhiVar != null) {
            return lhiVar;
        }
        lhi lhiVarM17717y = !this.isDataLoaded.get() ? m17717y(bid) : null;
        if (lhiVarM17717y == null) {
            str = bid;
            lhiVarM17717y = new lhi(str, 0, 0L, null, 14, null);
        } else {
            str = bid;
        }
        this.pkgRecordData.put(str, lhiVarM17717y);
        return lhiVarM17717y;
    }

    /* JADX INFO: renamed from: y */
    private final lhi m17717y(String bid) {
        String string;
        try {
            String str = "pkg_record_" + bid;
            SharedPreferences sharedPreferencesM17576d = FepContext.INSTANCE.m17576d();
            if (sharedPreferencesM17576d == null || (string = sharedPreferencesM17576d.getString(str, null)) == null) {
                return null;
            }
            return m17714o(bid, string);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Load record data for bid=" + bid + " failed: " + e.getMessage(), e, 0, null, 12, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m17718z(String bid) {
        this.waitSaveBids.add(bid);
        if (this.isSaveScheduled.getAndSet(true)) {
            return;
        }
        InterfaceC15593o interfaceC15593o = this.saveJob;
        if (interfaceC15593o != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
        }
        this.saveJob = xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageRecordModule$markWaitAndScheduleSave$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m17719A(@NotNull zgi info) {
        info.getClass();
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageRecordModule$recordPkgVisit$1(this, info, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m17720B(@NotNull String bid, @NotNull String baseVersion, long fullVersion) {
        bid.getClass();
        baseVersion.getClass();
        try {
            jzv.m147728a("FepPackageRecordModule", "recordVisit,bid=" + bid + ",baseVersion=" + baseVersion + ",fullVersion=" + fullVersion);
            if (fullVersion == 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            lhi lhiVarM17716x = m17716x(bid);
            Map<String, khi> mapM154205c = lhiVarM17716x.m154205c();
            khi khiVar = mapM154205c.get(baseVersion);
            if (khiVar == null) {
                khi khiVar2 = new khi(0L, null, 3, null);
                mapM154205c.put(baseVersion, khiVar2);
                khiVar = khiVar2;
            }
            khiVar.m149790a().put(String.valueOf(fullVersion), new mhi(fullVersion, jCurrentTimeMillis));
            if (!Intrinsics.m88377d("custom", baseVersion)) {
                lhiVarM17716x.m154207e(fullVersion);
            }
            m17718z(bid);
            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "FepPackageRecordModule Updated visit record for " + bid + '/' + baseVersion + '/' + fullVersion, null, 2, null);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Update visit record failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m17721E(@NotNull String bid, @NotNull String baseVersion, int asymEncrypt) {
        bid.getClass();
        baseVersion.getClass();
        try {
            m17716x(bid).m154206d(asymEncrypt);
            m17718z(bid);
            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Updated asymEncrypt for " + bid + '/' + baseVersion + ": " + asymEncrypt, null, 2, null);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Update asymEncrypt failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m17722F(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        try {
            xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageRecordModule$updateLastCheckUpdateTime$1(this, bid, baseVersion, null), 3, null);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Update check update time failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: G */
    public final Object m17723G(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        FepPackageRecordModule$waitForDataLoaded$1 fepPackageRecordModule$waitForDataLoaded$1;
        if (continuation instanceof FepPackageRecordModule$waitForDataLoaded$1) {
            fepPackageRecordModule$waitForDataLoaded$1 = (FepPackageRecordModule$waitForDataLoaded$1) continuation;
            int i = fepPackageRecordModule$waitForDataLoaded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fepPackageRecordModule$waitForDataLoaded$1.label = i - Integer.MIN_VALUE;
            } else {
                fepPackageRecordModule$waitForDataLoaded$1 = new FepPackageRecordModule$waitForDataLoaded$1(this, continuation);
            }
        } else {
            fepPackageRecordModule$waitForDataLoaded$1 = new FepPackageRecordModule$waitForDataLoaded$1(this, continuation);
        }
        Object obj = fepPackageRecordModule$waitForDataLoaded$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = fepPackageRecordModule$waitForDataLoaded$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                if (this.isDataLoaded.get()) {
                    return Unit.INSTANCE;
                }
                FepPackageRecordModule$waitForDataLoaded$2 fepPackageRecordModule$waitForDataLoaded$2 = new FepPackageRecordModule$waitForDataLoaded$2(this, null);
                fepPackageRecordModule$waitForDataLoaded$1.L$0 = this;
                fepPackageRecordModule$waitForDataLoaded$1.label = 1;
                if (TimeoutKt.m94621c(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, fepPackageRecordModule$waitForDataLoaded$2, fepPackageRecordModule$waitForDataLoaded$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
        } catch (TimeoutCancellationException unused) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Wait for data loaded timeout (5s)", null, 0, null, 14, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m17724k() {
        try {
            this.pkgRecordData.clear();
            this.waitSaveBids.clear();
            this.activeBids.clear();
            InterfaceC15593o interfaceC15593o = this.saveJob;
            if (interfaceC15593o != null) {
                InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
            }
            xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageRecordModule$clearAllRecords$1(null), 3, null);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Clear all records failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m17725m(@NotNull String bid, @Nullable String baseVersion, @Nullable Long fullVersion) {
        bid.getClass();
        try {
            jzv.m147728a("FepPackageRecordModule", "deletePackageUsage,bid=" + bid + ",baseVersion=" + baseVersion + ",fullVersion=" + fullVersion);
            if (baseVersion == null) {
                this.pkgRecordData.remove(bid);
                this.activeBids.remove(bid);
                this.waitSaveBids.add(bid);
            } else {
                lhi lhiVarM17716x = m17716x(bid);
                Map<String, khi> mapM154205c = lhiVarM17716x.m154205c();
                khi khiVar = mapM154205c.get(baseVersion);
                if (khiVar == null) {
                    return;
                }
                if (fullVersion == null) {
                    mapM154205c.remove(baseVersion);
                } else {
                    khiVar.m149790a().remove(String.valueOf(fullVersion.longValue()));
                    if (khiVar.m149790a().isEmpty()) {
                        mapM154205c.remove(baseVersion);
                    }
                }
                long jM17712l = m17712l(mapM154205c);
                if (mapM154205c.isEmpty()) {
                    this.pkgRecordData.remove(bid);
                    this.activeBids.remove(bid);
                    this.waitSaveBids.add(bid);
                } else {
                    lhiVarM17716x.m154207e(jM17712l);
                    m17718z(bid);
                }
            }
            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Deleted package usage for bid=" + bid + ", baseVersion=" + baseVersion + ", fullVersion=" + fullVersion, null, 2, null);
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Delete package usage failed: " + e.getMessage(), e, 0, null, 12, null);
        }
    }

    @Override // p153l.ul5
    public void onBack() {
        m17726p();
    }

    @Override // p153l.ul5
    public void onFront() {
    }

    /* JADX INFO: renamed from: p */
    public final void m17726p() {
        InterfaceC15593o interfaceC15593o = this.saveJob;
        if (interfaceC15593o != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
        }
        m17715q();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m17727r(@NotNull Continuation<? super Map<String, Long>> continuation) throws Throwable {
        FepPackageRecordModule$getAllNewsRecords$1 fepPackageRecordModule$getAllNewsRecords$1;
        if (continuation instanceof FepPackageRecordModule$getAllNewsRecords$1) {
            fepPackageRecordModule$getAllNewsRecords$1 = (FepPackageRecordModule$getAllNewsRecords$1) continuation;
            int i = fepPackageRecordModule$getAllNewsRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fepPackageRecordModule$getAllNewsRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                fepPackageRecordModule$getAllNewsRecords$1 = new FepPackageRecordModule$getAllNewsRecords$1(this, continuation);
            }
        } else {
            fepPackageRecordModule$getAllNewsRecords$1 = new FepPackageRecordModule$getAllNewsRecords$1(this, continuation);
        }
        Object obj = fepPackageRecordModule$getAllNewsRecords$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = fepPackageRecordModule$getAllNewsRecords$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            fepPackageRecordModule$getAllNewsRecords$1.L$0 = this;
            fepPackageRecordModule$getAllNewsRecords$1.label = 1;
            if (m17723G(fepPackageRecordModule$getAllNewsRecords$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FepPackageRecordModule) fepPackageRecordModule$getAllNewsRecords$1.L$0;
            ResultKt.m88128b(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            for (Map.Entry entry : MapsKt.toMutableMap(this.pkgRecordData).entrySet()) {
                String str = (String) entry.getKey();
                Long lM88261c = Boxing.m88261c(this.m17712l(((lhi) entry.getValue()).m154205c()));
                if (!Boxing.m88259a(lM88261c.longValue() != 0).booleanValue()) {
                    lM88261c = null;
                }
                if (lM88261c != null) {
                    linkedHashMap.put(str, Boxing.m88261c(lM88261c.longValue()));
                }
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
            return linkedHashMap;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
            return linkedHashMap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m17728s(@NotNull Continuation<? super Map<String, lhi>> continuation) throws Throwable {
        FepPackageRecordModule$getAllRecords$1 fepPackageRecordModule$getAllRecords$1;
        if (continuation instanceof FepPackageRecordModule$getAllRecords$1) {
            fepPackageRecordModule$getAllRecords$1 = (FepPackageRecordModule$getAllRecords$1) continuation;
            int i = fepPackageRecordModule$getAllRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fepPackageRecordModule$getAllRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                fepPackageRecordModule$getAllRecords$1 = new FepPackageRecordModule$getAllRecords$1(this, continuation);
            }
        } else {
            fepPackageRecordModule$getAllRecords$1 = new FepPackageRecordModule$getAllRecords$1(this, continuation);
        }
        Object obj = fepPackageRecordModule$getAllRecords$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = fepPackageRecordModule$getAllRecords$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            fepPackageRecordModule$getAllRecords$1.L$0 = this;
            fepPackageRecordModule$getAllRecords$1.label = 1;
            if (m17723G(fepPackageRecordModule$getAllRecords$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FepPackageRecordModule) fepPackageRecordModule$getAllRecords$1.L$0;
            ResultKt.m88128b(obj);
        }
        return MapsKt.toMap(this.pkgRecordData);
    }

    /* JADX INFO: renamed from: t */
    public final long m17729t(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        try {
            if (FepPackageContext.INSTANCE.m17678e()) {
                jzv.m147734g(FepLogModuleType.offlinepkg.name(), "getLastCheckUpdateTime get ready, bid=" + bid + "   baseVersion=" + baseVersion);
            }
            khi khiVar = m17716x(bid).m154205c().get(baseVersion);
            if (khiVar != null) {
                return khiVar.getLastUpdateT();
            }
            return 0L;
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Get last check update time failed: " + e.getMessage(), e, 0, null, 12, null);
            return 0L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final lhi m17730u(@NotNull String bid) {
        bid.getClass();
        return m17716x(bid);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final mhi m17731v(@NotNull String bid, @NotNull String baseVersion, long fullVer) {
        Map<String, mhi> mapM149790a;
        mhi mhiVar;
        bid.getClass();
        baseVersion.getClass();
        try {
            khi khiVar = m17716x(bid).m154205c().get(baseVersion);
            if (khiVar == null || (mapM149790a = khiVar.m149790a()) == null || (mhiVar = mapM149790a.get(String.valueOf(fullVer))) == null) {
                return null;
            }
            mhiVar.m158420f(bid);
            mhiVar.m158419e(baseVersion);
            return mhiVar;
        } catch (Exception e) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Get last visit time failed: " + e.getMessage(), e, 0, null, 12, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m17732w() {
        this.loadJob = xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageRecordModule$initialize$1(this, null), 3, null);
        yi5.INSTANCE.m216013c(this);
    }
}
