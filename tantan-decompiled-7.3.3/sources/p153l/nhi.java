package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import immomo.com.mklibrary.core.NDKWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001c\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J_\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b5\u00103¨\u00066"}, m88121d2 = {"Ll/nhi;", "", "<init>", "()V", "", "checkState", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", Constants.KEY_CONFIG, "justCheckConfig", "", "packagePath", "bid", "baseVersion", "Lkotlin/Pair;", "k", "(ZLcom/hellogroup/fep/feppkg/model/FepPackageConfig;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "", "recordData", "c", "(Ljava/lang/String;Ljava/util/Map;)Z", "packageDir", "", "fileNames", "Lorg/json/JSONObject;", "verifyJson", "b", "(Ljava/lang/String;Ljava/util/Iterator;Lorg/json/JSONObject;Ljava/util/Map;)Z", "fileName", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;)Z", "", "hash", "a", "([B)Ljava/lang/String;", "useRSA", "checkConfig", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lkotlin/Pair;", "e", "(Ljava/lang/String;Z)Z", "Ljava/io/File;", "verifyFile", "j", "(Ljava/io/File;)Ljava/lang/String;", "file", "", "bufferLen", "f", "(Ljava/io/File;I)Ljava/lang/String;", "packageDirPath", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/io/File;", "h", "g", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class nhi {
    /* JADX INFO: renamed from: a */
    private final String m163095a(byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        string.getClass();
        formatter.close();
        return string;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m163096b(String packageDir, Iterator<String> fileNames, JSONObject verifyJson, Map<String, String> recordData) {
        if (StringsKt.m94329e0(packageDir) || fileNames == null || verifyJson == null) {
            return false;
        }
        while (fileNames.hasNext()) {
            if (!m163098d(packageDir, fileNames.next(), verifyJson, recordData)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m163097c(String packagePath, Map<String, String> recordData) {
        File fileM109813o = FepPackageContext.INSTANCE.m17684k().m109813o(packagePath);
        if (!fileM109813o.exists()) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(FileUtil.m17534r(fileM109813o));
            return m163096b(packagePath, jSONObject.keys(), jSONObject, recordData);
        } catch (Exception e) {
            FepPackageContext.INSTANCE.m17685l().m172241c(-3006, "Check package files exception: " + e.getMessage(), e, recordData);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m163098d(String packageDir, String fileName, JSONObject verifyJson, Map<String, String> recordData) throws Throwable {
        Exception exc;
        Throwable th;
        if (packageDir == null || StringsKt.m94329e0(packageDir) || fileName == null || StringsKt.m94329e0(fileName) || verifyJson == null) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                String strOptString = verifyJson.optString(fileName);
                File file = new File(packageDir, fileName);
                strOptString.getClass();
                if (!StringsKt.m94329e0(strOptString) && file.exists()) {
                    byte[] bArr = new byte[ShareConstants.MD5_FILE_BUF_LENGTH];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    while (true) {
                        try {
                            int i = fileInputStream2.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (Exception e) {
                            exc = e;
                            fileInputStream = fileInputStream2;
                            FepPackageContext.INSTANCE.m17685l().m172241c(-3006, "Check single file SHA1 exception: " + exc.getMessage(), exc, recordData);
                            n1m.m161127b(fileInputStream);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            n1m.m161127b(fileInputStream);
                            throw th;
                        }
                    }
                    fileInputStream2.close();
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest.getClass();
                    Formatter formatter = new Formatter();
                    for (byte b : bArrDigest) {
                        formatter.format("%02x", Byte.valueOf(b));
                    }
                    boolean zM88377d = Intrinsics.m88377d(strOptString, formatter.toString());
                    formatter.close();
                    if (!zM88377d) {
                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "checkSinglePackageFileSha1 error，" + fileName + '=' + strOptString + ",formatter=" + formatter + ".toString()", null, 0, null, 14, null);
                    }
                    n1m.m161127b(fileInputStream2);
                    return zM88377d;
                }
                n1m.m161127b(null);
                return false;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: k */
    private final Pair<Boolean, FepPackageConfig> m163099k(boolean checkState, FepPackageConfig config, boolean justCheckConfig, String packagePath, String bid, String baseVersion) {
        if (!checkState && config == null && !justCheckConfig) {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            fepPackageContext.m17674a(packagePath, bid, baseVersion);
            pgi.m172239k(fepPackageContext.m17685l(), "FepPackageVerifyModule check error, already delete bid=" + bid + " baseVersion=" + baseVersion + " \npackagePath=" + packagePath, null, 0, null, 14, null);
        }
        return new Pair<>(Boolean.valueOf(checkState), config);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Pair m163100m(nhi nhiVar, String str, String str2, String str3, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        return nhiVar.m163107l(str, str2, str3, z, z2, map);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m163101e(@Nullable String packageDir, boolean useRSA) throws Throwable {
        File fileM163105i = m163105i(packageDir);
        File fileM163103g = useRSA ? m163103g(packageDir) : m163104h(packageDir);
        if (fileM163105i.exists() && fileM163103g.exists()) {
            byte[] bArrM17533q = FileUtil.m17533q(fileM163103g);
            if (useRSA) {
                return h1f.m133328c(FileUtil.m17534r(fileM163105i), bArrM17533q, NDKWrapper.m88095c());
            }
            String strM163106j = m163106j(fileM163105i);
            String strM133326a = h1f.m133326a(bArrM17533q, NDKWrapper.m88094b());
            if (strM133326a != null && Intrinsics.m88377d(strM133326a, strM163106j)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m163102f(@Nullable File file, int bufferLen) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.getClass();
                byte[] bArr = new byte[bufferLen];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        byte[] bArrDigest = messageDigest.digest();
                        bArrDigest.getClass();
                        String strM163095a = m163095a(bArrDigest);
                        fileInputStream.close();
                        return strM163095a;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final File m163103g(@Nullable String packageDirPath) {
        return new File(packageDirPath, "verify.signature");
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final File m163104h(@Nullable String packageDirPath) {
        return new File(packageDirPath, "verify.sign");
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final File m163105i(@Nullable String packageDirPath) {
        return new File(packageDirPath, "verify.json");
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m163106j(@Nullable File verifyFile) throws Throwable {
        String strM114836a = d8g0.m114836a(m163102f(verifyFile, 1024));
        String strM167802e = oiw.m167802e(verifyFile);
        Charset charset = Charsets.UTF_8;
        if (strM114836a == null) {
            C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
            return null;
        }
        byte[] bytes = strM114836a.getBytes(charset);
        bytes.getClass();
        strM167802e.getClass();
        if (strM167802e == null) {
            C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
            return null;
        }
        byte[] bytes2 = strM167802e.getBytes(charset);
        bytes2.getClass();
        return new String(new byte[]{bytes[0], bytes[2], bytes[6], bytes[8], bytes[32], bytes[20], bytes[35], bytes[22], bytes2[1], bytes2[30], bytes2[2], bytes2[4], bytes2[6], bytes2[21], bytes2[0], bytes2[8]}, charset);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Pair<Boolean, FepPackageConfig> m163107l(@NotNull String bid, @NotNull String baseVersion, @NotNull String packagePath, boolean useRSA, boolean checkConfig, @Nullable Map<String, String> recordData) throws Throwable {
        bid.getClass();
        baseVersion.getClass();
        packagePath.getClass();
        Map<String, String> mapMutableMapOf = recordData != null ? recordData : MapsKt.mutableMapOf(new Pair("bid", bid));
        if (StringsKt.m94329e0(packagePath)) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (!new File(packagePath).exists()) {
            pgi.m172234d(FepPackageContext.INSTANCE.m17685l(), -3006, "config.json missing or invalid: " + packagePath, null, MapsKt.toMutableMap(MapsKt.plus(mapMutableMapOf, TuplesKt.m88129a("path", packagePath))), 4, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
        File fileM109812n = fepPackageContext.m17684k().m109812n(packagePath);
        if (!fileM109812n.exists() || fileM109812n.length() <= 0) {
            pgi.m172234d(fepPackageContext.m17685l(), -3006, "config.json missing", null, MapsKt.toMutableMap(MapsKt.plus(mapMutableMapOf, TuplesKt.m88129a("path", packagePath))), 4, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        FepPackageConfig fepPackageConfigM109816s = fepPackageContext.m17684k().m109816s(packagePath);
        if (fepPackageConfigM109816s == null) {
            pgi.m172234d(fepPackageContext.m17685l(), -3006, "config.json exist and invalid", null, MapsKt.toMutableMap(MapsKt.plus(mapMutableMapOf, TuplesKt.m88129a("path", packagePath))), 4, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        if (System.currentTimeMillis() > fepPackageConfigM109816s.getExpired()) {
            pgi.m172239k(fepPackageContext.m17685l(), "Package expired: " + packagePath, null, 0, null, 14, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        if (checkConfig) {
            return m163099k(true, fepPackageConfigM109816s, checkConfig, packagePath, bid, baseVersion);
        }
        if (useRSA) {
            if (!m163101e(packagePath, true)) {
                pgi.m172234d(fepPackageContext.m17685l(), -3006, "verify.signature not found (RSA Required)", null, MapsKt.toMutableMap(MapsKt.plus(mapMutableMapOf, TuplesKt.m88129a("path", packagePath))), 4, null);
                return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
            }
        } else if (!m163101e(packagePath, false)) {
            pgi.m172234d(fepPackageContext.m17685l(), -3006, "verify.sign not found (AES)", null, MapsKt.toMutableMap(MapsKt.plus(mapMutableMapOf, TuplesKt.m88129a("path", packagePath))), 4, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        if (!m163097c(packagePath, mapMutableMapOf)) {
            pgi.m172234d(fepPackageContext.m17685l(), -3006, "File SHA1 mismatch", null, mapMutableMapOf, 4, null);
            return m163099k(false, null, checkConfig, packagePath, bid, baseVersion);
        }
        pgi.m172235f(fepPackageContext.m17685l(), "Package verify success: " + packagePath, null, 0, 6, null);
        return m163099k(true, fepPackageConfigM109816s, checkConfig, packagePath, bid, baseVersion);
    }
}
