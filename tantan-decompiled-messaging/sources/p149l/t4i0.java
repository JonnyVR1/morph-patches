package p149l;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015JC\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJi\u0010\u001f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001c2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u001e\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&¨\u0006("}, m87232d2 = {"Ll/t4i0;", "Ll/vsl;", "<init>", "()V", "", "url", "", "headers", "", "postData", "f", "(Ljava/lang/String;Ljava/util/Map;[B)Ljava/lang/String;", "Ljava/io/File;", "file", CommandMessage.PARAMS, "", "b", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)V", "", "way", "e", "(I)Ljava/lang/String;", "g", "urlString", "formData", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "", "files", "fileKeys", "c", "(Ljava/lang/String;Ljava/util/Map;[Ljava/io/File;[Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "path", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Ll/k850;", "kotlin.jvm.PlatformType", "Ll/k850;", "okHttpClient", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class t4i0 implements vsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public k850 okHttpClient = qib0.f154693H.getNormalHttp();

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
        gxc0 gxc0VarM118606k = this.okHttpClient.mo144849a(c20027aM185893l.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
            return strString;
        }
        ig3.m135964a("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, l.cll] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, l.cll] */
    @Override // p149l.vsl
    /* JADX INFO: renamed from: b */
    public void mo87144b(@Nullable String url, @Nullable File file, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) throws Exception {
        int i;
        if (file == null) {
            return;
        }
        Exception th = new Exception("Save File Failed");
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i2 >= 4) {
                break;
            }
            MDLog.m7395i("DefaultHttpRequesterImpl", "saveFile=" + i + " url=" + url);
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? M107499l = cll.m107499l(url);
                objectRef.element = M107499l;
                if (params != null) {
                    cll.C16188a c16188aM107524p = M107499l.m107524p();
                    ArrayList arrayList = new ArrayList(params.size());
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        arrayList.add(c16188aM107524p.m107534a(entry.getKey(), entry.getValue()));
                    }
                    objectRef.element = c16188aM107524p.m107537d();
                }
                stc0.C20027a c20027aM185887f = new stc0.C20027a().m185900s((cll) objectRef.element).m185887f();
                if (headers != null) {
                    c20027aM185887f.m185890i(oxk.m166552i(headers));
                }
                biw.m102123a(file, this.okHttpClient.mo144849a(c20027aM185887f.m185883b()).execute().m118606k());
                break;
            } catch (Throwable th2) {
                th = th2;
                i2 = i;
            }
        }
        if (i >= 4) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
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
            c20027aM185898q.m185893l(utc0.create(hyx.m133628d(m187205h(files[0].getAbsolutePath())), files[0]));
        } else {
            cm10.C16191a c16191a = new cm10.C16191a();
            int length = files.length;
            for (int i = 0; i < length; i++) {
                c16191a.m107600f(cm10.f81492j);
                String name = files[i].getName();
                name.getClass();
                if (C15386d.m93489w(name, "_", false, 2, null)) {
                    name.getClass();
                    name = name.substring(0, name.length() - 1);
                }
                c16191a.m107596b(fileKeys != null ? fileKeys[i] : "mkimage" + i, name, utc0.create(hyx.m133628d(m187205h(files[i].getAbsolutePath())), files[i]));
            }
            c20027aM185898q.m185893l(c16191a.m107599e());
        }
        gxc0 gxc0VarM118606k = this.okHttpClient.mo144849a(c20027aM185898q.m185883b()).execute().m118606k();
        if (gxc0VarM118606k != null && (strString = gxc0VarM118606k.string()) != null) {
            return strString;
        }
        ig3.m135964a("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, l.cll] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, l.cll] */
    @Override // p149l.vsl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo87146d(@Nullable String url, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) {
        String strString;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M107499l = cll.m107499l(url);
        objectRef.element = M107499l;
        if (params != null) {
            cll.C16188a c16188aM107524p = M107499l.m107524p();
            ArrayList arrayList = new ArrayList(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                arrayList.add(c16188aM107524p.m107534a(entry.getKey(), entry.getValue()));
            }
            objectRef.element = c16188aM107524p.m107537d();
        }
        stc0.C20027a c20027aM185887f = new stc0.C20027a().m185900s((cll) objectRef.element).m185887f();
        if (headers != null) {
            c20027aM185887f.m185890i(oxk.m166552i(headers));
        }
        gxc0 gxc0VarM118606k = this.okHttpClient.mo144849a(c20027aM185887f.m185883b()).execute().m118606k();
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
        stc0.C20027a c20027a = new stc0.C20027a();
        url.getClass();
        gxc0 gxc0VarM118606k = this.okHttpClient.mo144849a(c20027a.m185898q(url).m185890i(oxk.m166552i(headers)).m185893l(utc0.create(hyx.m133628d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), postData)).m185883b()).execute().m118606k();
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

    /* JADX INFO: renamed from: h */
    public final String m187205h(String path) {
        String contentTypeFor;
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(path, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            contentTypeFor = null;
        }
        return contentTypeFor == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : contentTypeFor;
    }
}
