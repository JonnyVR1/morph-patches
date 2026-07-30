package p149l;

import android.app.Application;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
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
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/niw;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "", "e", "()[B", "Ll/bip0;", BaseSei.INFO, "", "startOpenPage", "a", "(Ll/bip0;J)Ljava/lang/String;", "bid", "c", "(Ljava/lang/String;)Ljava/lang/String;", "startUrl", "Ll/niw$a;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ll/niw$a;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class niw {
    public static final niw INSTANCE = new niw();

    private niw() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m159566b() {
        byte[] bArrM159567e;
        StringBuilder sb = new StringBuilder();
        try {
            niw niwVar = INSTANCE;
            String strM159569c = niwVar.m159569c("1000101");
            if (TextUtils.isEmpty(strM159569c)) {
                bArrM159567e = niwVar.m159567e();
                String str = oiw.WEB_APM;
                StringBuilder sb2 = new StringBuilder("read jssdk from asset");
                sb2.append(bArrM159567e != null ? Integer.valueOf(bArrM159567e.length) : null);
                MDLog.m7389d(str, sb2.toString());
            } else if (strM159569c != null) {
                File file = new File(strM159569c);
                if (file.exists()) {
                    byte[] bArrM18410g = FileUtil.m18410g(file);
                    MDLog.m7389d(oiw.WEB_APM, "read jssdk from offline path : ".concat(strM159569c));
                    bArrM159567e = bArrM18410g;
                } else {
                    bArrM159567e = null;
                }
            } else {
                bArrM159567e = null;
            }
            if (bArrM159567e == null) {
                return null;
            }
            String strEncodeToString = Base64.encodeToString(bArrM159567e, 2);
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
            MDLog.printErrStackTrace(oiw.WEB_APM, th);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: e */
    private final byte[] m159567e() throws Throwable {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                Application applicationM184282b = shw.m184282b();
                applicationM184282b.getClass();
                inputStreamOpen = applicationM184282b.getAssets().open("mk/jssdk.min.js");
                try {
                    bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                    try {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        while (true) {
                            ?? line = bufferedReader2.readLine();
                            objectRef.element = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((String) line);
                        }
                        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        try {
                            bufferedReader2.close();
                        } catch (Exception e) {
                            MDLog.printErrStackTrace(oiw.WEB_APM, e);
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Exception e2) {
                                MDLog.printErrStackTrace(oiw.WEB_APM, e2);
                            }
                        }
                        return bytes;
                    } catch (Exception e3) {
                        e = e3;
                        MDLog.printErrStackTrace(oiw.WEB_APM, e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Exception e4) {
                                MDLog.printErrStackTrace(oiw.WEB_APM, e4);
                            }
                        }
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Exception e5) {
                                MDLog.printErrStackTrace(oiw.WEB_APM, e5);
                            }
                        }
                        return null;
                    }
                } catch (Exception e6) {
                    e = e6;
                    bufferedReader2 = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                    th = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e7) {
                            MDLog.printErrStackTrace(oiw.WEB_APM, e7);
                        }
                    }
                    if (inputStreamOpen != null) {
                        throw th;
                    }
                    try {
                        inputStreamOpen.close();
                        throw th;
                    } catch (Exception e8) {
                        MDLog.printErrStackTrace(oiw.WEB_APM, e8);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamOpen != null) {
                    throw th;
                }
                inputStreamOpen.close();
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            inputStreamOpen = null;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
            bufferedReader = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m159568a(@Nullable bip0 info, long startOpenPage) {
        StringBuilder sb = new StringBuilder("javascript:var defaultInfoH5 = {network:'");
        sb.append(info != null ? info.f75788d : null);
        sb.append("',momoid:'");
        sb.append(info != null ? info.f75787c : null);
        sb.append("',offline_version:'");
        sb.append(info != null ? info.f75789e : null);
        sb.append("',onPageStarted:'");
        sb.append(info != null ? Long.valueOf(info.f75790f) : null);
        sb.append("',webview_type:'");
        sb.append(info != null ? info.f75786b : null);
        sb.append("',touchStart:'");
        sb.append(startOpenPage);
        sb.append("'}");
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m159569c(@Nullable String bid) {
        String strM197337c;
        h460 h460VarM217446q;
        try {
            v750 v750VarM214871t = yhw.m214862s().m214871t(bid);
            if (v750VarM214871t != null && (h460VarM217446q = z750.m217446q((strM197337c = v750VarM214871t.m197337c()))) != null) {
                File[] fileArrListFiles = new File(strM197337c + File.separator + h460VarM217446q.m129225f()).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.getClass();
                        String name = file.getName();
                        name.getClass();
                        if (StringsKt.m93412P(name, "min.js", false, 2, null)) {
                            return file.getAbsolutePath();
                        }
                    }
                }
            }
            return null;
        } catch (IOException e) {
            MDLog.m7391e(oiw.WEB_APM, e.toString());
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C18702a m159570d(@Nullable String startUrl) {
        C18702a c18702a = new C18702a(startUrl);
        if (startUrl != null && !TextUtils.isEmpty(startUrl)) {
            if (C15386d.m93483J(startUrl, "https://www.immomo.com/checkurl/?url=", false, 2, null)) {
                c18702a.m159573c(true);
                c18702a.m159574d(URLDecoder.decode(startUrl.substring(37)));
                return c18702a;
            }
            if (C15386d.m93483J(startUrl, "https://passport.immomo.com/authorize?redirect_uri=", false, 2, null)) {
                c18702a.m159573c(true);
                c18702a.m159574d(URLDecoder.decode(startUrl.substring(51)));
            }
        }
        return c18702a;
    }

    /* JADX INFO: renamed from: l.niw$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, m87232d2 = {"Ll/niw$a;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "", "a", "Z", "b", "()Z", "c", "(Z)V", "isInnerUrl", "Ljava/lang/String;", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C18702a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isInnerUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String url;

        public /* synthetic */ C18702a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
        public final void m159573c(boolean z) {
            this.isInnerUrl = z;
        }

        /* JADX INFO: renamed from: d */
        public final void m159574d(@Nullable String str) {
            this.url = str;
        }

        public C18702a(@Nullable String str) {
            this.url = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C18702a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
