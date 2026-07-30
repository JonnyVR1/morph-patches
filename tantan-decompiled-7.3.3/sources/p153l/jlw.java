package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.p036mk.business.webmonitor.MKWebMonitorManager;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/jlw;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "", "e", "()[B", "Ll/frp0;", BaseSei.INFO, "", "startOpenPage", "a", "(Ll/frp0;J)Ljava/lang/String;", "bid", "c", "(Ljava/lang/String;)Ljava/lang/String;", "startUrl", "Ll/jlw$a;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/jlw$a;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class jlw {
    public static final jlw INSTANCE = new jlw();

    private jlw() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m146115b() {
        byte[] bArrM146116e;
        StringBuilder sb = new StringBuilder();
        try {
            jlw jlwVar = INSTANCE;
            String strM146118c = jlwVar.m146118c("1000597");
            if (TextUtils.isEmpty(strM146118c)) {
                bArrM146116e = jlwVar.m146116e();
                String str = MKWebMonitorManager.WEB_APM;
                StringBuilder sb2 = new StringBuilder("read jssdk from asset");
                sb2.append(bArrM146116e != null ? Integer.valueOf(bArrM146116e.length) : null);
                jzv.m147728a(str, sb2.toString());
            } else if (strM146118c != null) {
                File file = new File(strM146118c);
                if (file.exists()) {
                    byte[] bArrM17533q = FileUtil.m17533q(file);
                    jzv.m147728a(MKWebMonitorManager.WEB_APM, "read jssdk from offline path : ".concat(strM146118c));
                    bArrM146116e = bArrM17533q;
                } else {
                    bArrM146116e = null;
                }
            } else {
                bArrM146116e = null;
            }
            if (bArrM146116e == null) {
                return null;
            }
            String strEncodeToString = Base64.encodeToString(bArrM146116e, 2);
            sb.append("javascript:");
            sb.append("(function() {");
            sb.append("var parent = document.getElementsByTagName('body').item(0);");
            sb.append("var script = document.createElement('script');");
            sb.append("script.type = 'text/javascript';");
            sb.append("script.innerHTML = window.atob('");
            sb.append(strEncodeToString);
            sb.append("');");
            sb.append("parent.appendChild(script)");
            sb.append("})()");
        } catch (Throwable th) {
            jzv.m147730c(MKWebMonitorManager.WEB_APM, "", th);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0042: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:67), block:B:20:0x0042 */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: e */
    private final byte[] m146116e() throws Throwable {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        AssetManager assets;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                Context contextM155971a = lv0.m155971a();
                inputStreamOpen = (contextM155971a == null || (assets = contextM155971a.getAssets()) == null) ? null : assets.open("mk/jssdk.min.js");
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                    try {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            objectRef.element = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((String) line);
                        }
                        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        try {
                            bufferedReader.close();
                        } catch (Exception e) {
                            jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e);
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Exception e2) {
                                jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e2);
                            }
                        }
                        return bytes;
                    } catch (Exception e3) {
                        e = e3;
                        jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e4) {
                                jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e4);
                            }
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Exception e5) {
                                jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e5);
                            }
                        }
                        return null;
                    }
                } catch (Exception e6) {
                    e = e6;
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (Exception e7) {
                            jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e7);
                        }
                    }
                    if (inputStreamOpen == null) {
                        throw th;
                    }
                    try {
                        inputStreamOpen.close();
                        throw th;
                    } catch (Exception e8) {
                        jzv.m147730c(MKWebMonitorManager.WEB_APM, "", e8);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader3 = bufferedReader2;
            }
        } catch (Exception e9) {
            e = e9;
            inputStreamOpen = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m146117a(@Nullable frp0 info, long startOpenPage) {
        StringBuilder sb = new StringBuilder("javascript:var defaultInfoH5 = {network:'");
        sb.append(info != null ? info.f100448d : null);
        sb.append("',momoid:'");
        sb.append(info != null ? info.f100447c : null);
        sb.append("',offline_version:'");
        sb.append(info != null ? info.f100449e : null);
        sb.append("',onPageStarted:'");
        sb.append(info != null ? Long.valueOf(info.f100450f) : null);
        sb.append("',webview_type:'");
        sb.append(info != null ? info.f100446b : null);
        sb.append("',touchStart:'");
        sb.append(startOpenPage);
        sb.append("'}");
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m146118c(@NotNull String bid) {
        bid.getClass();
        try {
            FepManager fepManagerM17610a = FepManager.INSTANCE.m17610a();
            String strM107682c = c2f.m107682c();
            strM107682c.getClass();
            zgi zgiVarM17591l = fepManagerM17610a.m17591l(strM107682c, CheckPolicy.LOCAL_ONLY);
            if (zgiVarM17591l != null) {
                String strM219626i = zgiVarM17591l.m219626i();
                FepPackageConfig fepPackageConfigM219623f = zgiVarM17591l.m219623f();
                if (fepPackageConfigM219623f != null) {
                    File[] fileArrListFiles = new File(strM219626i + File.separator + fepPackageConfigM219623f.getUrl()).listFiles();
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            file.getClass();
                            String name = file.getName();
                            name.getClass();
                            if (StringsKt.m94303P(name, "h5-jssdk.min.js", false, 2, null)) {
                                String absolutePath = file.getAbsolutePath();
                                jzv.m147732e(MKWebMonitorManager.WEB_APM, "getSdkLocalPath=" + absolutePath);
                                return absolutePath;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (IOException e) {
            jzv.m147729b(MKWebMonitorManager.WEB_APM, e.toString());
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C17976a m146119d(@Nullable String startUrl) {
        C17976a c17976a = new C17976a(startUrl);
        if (startUrl != null && !TextUtils.isEmpty(startUrl)) {
            if (C15493d.m94374J(startUrl, "https://www.immomo.com/checkurl/?url=", false, 2, null)) {
                c17976a.m146122c(true);
                c17976a.m146123d(URLDecoder.decode(startUrl.substring(37)));
                return c17976a;
            }
            if (C15493d.m94374J(startUrl, "https://passport.immomo.com/authorize?redirect_uri=", false, 2, null)) {
                c17976a.m146122c(true);
                c17976a.m146123d(URLDecoder.decode(startUrl.substring(51)));
            }
        }
        return c17976a;
    }

    /* JADX INFO: renamed from: l.jlw$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, m88121d2 = {"Ll/jlw$a;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "", "a", "Z", "b", "()Z", "c", "(Z)V", "isInnerUrl", "Ljava/lang/String;", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C17976a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isInnerUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String url;

        public /* synthetic */ C17976a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsInnerUrl() {
            return this.isInnerUrl;
        }

        /* JADX INFO: renamed from: c */
        public final void m146122c(boolean z) {
            this.isInnerUrl = z;
        }

        /* JADX INFO: renamed from: d */
        public final void m146123d(@Nullable String str) {
            this.url = str;
        }

        public C17976a(@Nullable String str) {
            this.url = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C17976a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
