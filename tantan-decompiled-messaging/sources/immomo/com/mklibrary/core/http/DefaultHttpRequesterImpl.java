package immomo.com.mklibrary.core.http;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.FileUtil;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cll;
import p149l.cm10;
import p149l.gxc0;
import p149l.hyx;
import p149l.ig3;
import p149l.inw;
import p149l.k850;
import p149l.oxk;
import p149l.qkq0;
import p149l.qyi;
import p149l.stc0;
import p149l.utc0;
import p149l.vsl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u0013\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018JC\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010\u001e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJE\u0010\u001f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010 Ji\u0010$\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0010\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010!2\u0010\u0010#\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010!2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Limmomo/com/mklibrary/core/http/DefaultHttpRequesterImpl;", "Ll/vsl;", "<init>", "()V", "", "path", "j", "(Ljava/lang/String;)Ljava/lang/String;", "url", "", "headers", "", "postData", "f", "(Ljava/lang/String;Ljava/util/Map;[B)Ljava/lang/String;", "Ljava/io/File;", "file", CommandMessage.PARAMS, "", "b", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)V", "", "way", "e", "(I)Ljava/lang/String;", "g", "urlString", "formData", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)[B", "", "files", "fileKeys", "c", "(Ljava/lang/String;Ljava/util/Map;[Ljava/io/File;[Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Ll/k850;", "Lkotlin/Lazy;", "h", "()Ll/k850;", "okHttpClient", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class DefaultHttpRequesterImpl implements vsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy okHttpClient = LazyKt__LazyJVMKt.m87229b(new Function0<k850>() { // from class: immomo.com.mklibrary.core.http.DefaultHttpRequesterImpl$okHttpClient$2
        @Override // kotlin.jvm.functions.Function0
        public final k850 invoke() {
            return new k850().m144867v().m144882c();
        }
    });

    /* JADX INFO: renamed from: h */
    private final k850 m87141h() {
        return (k850) this.okHttpClient.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final String m87142j(String path) {
        String contentTypeFor;
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(path, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            contentTypeFor = null;
        }
        return contentTypeFor == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : contentTypeFor;
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo87143a(@NotNull String urlString, @Nullable Map<String, String> formData, @Nullable Map<String, String> headers) {
        String strString;
        urlString.getClass();
        stc0.C20027a c20027aM185898q = new stc0.C20027a().m185898q(urlString);
        cm10.C16191a c16191a = new cm10.C16191a();
        c16191a.m107600f(cm10.f81492j);
        if (formData != null) {
            ArrayList arrayList = new ArrayList(formData.size());
            for (Map.Entry<String, String> entry : formData.entrySet()) {
                if (entry.getKey().length() > 0 && entry.getValue() != null) {
                    c16191a.m107595a(entry.getKey(), entry.getValue());
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        stc0.C20027a c20027aM185893l = c20027aM185898q.m185893l(c16191a.m107599e());
        if (headers != null) {
            c20027aM185893l.m185890i(oxk.m166552i(headers));
        }
        gxc0 gxc0VarM118606k = m87141h().mo144849a(c20027aM185893l.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
            return strString;
        }
        ig3.m135964a("");
        return null;
    }

    @Override // p149l.vsl
    /* JADX INFO: renamed from: b */
    public void mo87144b(@Nullable String url, @Nullable File file, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) throws Throwable {
        FileUtil.m18413j(m87150i(url, params, headers), file);
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo87145c(@Nullable String url, @Nullable Map<String, String> formData, @Nullable File[] files, @Nullable String[] fileKeys, @Nullable Map<String, String> headers) {
        String strString;
        stc0.C20027a c20027aM185898q = new stc0.C20027a().m185898q(url);
        if (headers != null) {
            c20027aM185898q.m185890i(oxk.m166552i(headers));
        }
        if (files == null || files.length == 0) {
            if (formData != null) {
                qyi.C19606a c19606a = new qyi.C19606a();
                ArrayList arrayList = new ArrayList(formData.size());
                for (Map.Entry<String, String> entry : formData.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        c19606a.m177040a(entry.getKey(), entry.getValue());
                    }
                    arrayList.add(Unit.INSTANCE);
                }
                c20027aM185898q.m185893l(c19606a.m177041b());
            }
        } else if (files.length == 1) {
            c20027aM185898q.m185893l(utc0.create(hyx.m133628d(m87142j(files[0].getAbsolutePath())), files[0]));
        } else {
            cm10.C16191a c16191a = new cm10.C16191a();
            int length = files.length;
            for (int i = 0; i < length; i++) {
                c16191a.m107600f(cm10.f81492j);
                String name = files[i].getName();
                name.getClass();
                if (C15386d.m93489w(name, "_", false, 2, null)) {
                    name = name.substring(0, name.length() - 1);
                }
                c16191a.m107596b(fileKeys != null ? fileKeys[i] : "mkimage" + i, name, utc0.create(hyx.m133628d(m87142j(files[i].getAbsolutePath())), files[i]));
            }
            c20027aM185898q.m185893l(c16191a.m107599e());
        }
        gxc0 gxc0VarM118606k = m87141h().mo144849a(c20027aM185898q.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
            return strString;
        }
        ig3.m135964a("");
        return null;
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo87146d(@Nullable String url, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) {
        String strString;
        cll cllVarM107499l = cll.m107499l(url);
        if (params != null) {
            cll.C16188a c16188aM107524p = cllVarM107499l.m107524p();
            ArrayList arrayList = new ArrayList(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                arrayList.add(c16188aM107524p.m107534a(entry.getKey(), entry.getValue()));
            }
            cllVarM107499l = c16188aM107524p.m107537d();
        }
        stc0.C20027a c20027aM185887f = new stc0.C20027a().m185900s(cllVarM107499l).m185887f();
        if (headers != null) {
            c20027aM185887f.m185890i(oxk.m166552i(headers));
        }
        gxc0 gxc0VarM118606k = m87141h().mo144849a(c20027aM185887f.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
            return strString;
        }
        ig3.m135964a("");
        return null;
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo87147e(int way) {
        return Constants.DEVICE_ID_TAG;
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo87148f(@Nullable String url, @Nullable Map<String, String> headers, @Nullable byte[] postData) {
        k850 k850Var = new k850();
        stc0.C20027a c20027a = new stc0.C20027a();
        if (url == null) {
            Intrinsics.m87497m();
        }
        gxc0 gxc0VarM118606k = k850Var.mo144849a(c20027a.m185898q(url).m185890i(oxk.m166552i(headers)).m185893l(utc0.create(hyx.m133628d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), postData)).m185883b()).execute().m118606k();
        String strString = gxc0VarM118606k != null ? gxc0VarM118606k.string() : null;
        inw.m137181s("requestPostData result : " + strString);
        if (strString != null) {
            return strString;
        }
        qkq0.m175383a("post failed");
        return null;
    }

    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: g */
    public String mo87149g(int way) {
        return "deviceParams";
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public byte[] m87150i(@Nullable String url, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) {
        byte[] bArrBytes;
        cll cllVarM107499l = cll.m107499l(url);
        if (params != null) {
            cll.C16188a c16188aM107524p = cllVarM107499l.m107524p();
            ArrayList arrayList = new ArrayList(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                arrayList.add(c16188aM107524p.m107534a(entry.getKey(), entry.getValue()));
            }
            cllVarM107499l = c16188aM107524p.m107537d();
        }
        stc0.C20027a c20027aM185887f = new stc0.C20027a().m185900s(cllVarM107499l).m185887f();
        if (headers != null) {
            c20027aM185887f.m185890i(oxk.m166552i(headers));
        }
        gxc0 gxc0VarM118606k = m87141h().mo144849a(c20027aM185887f.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (bArrBytes = gxc0VarM118606k.bytes()) != null) {
            return bArrBytes;
        }
        ig3.m135964a("");
        return null;
    }
}
