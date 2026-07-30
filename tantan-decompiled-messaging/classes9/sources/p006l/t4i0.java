package p006l;

import com.cosmos.mdlog.MDLog;
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
import kotlin.text.d;
import l.cll;
import l.cm10;
import l.gxc0;
import l.hyx;
import l.ig3;
import l.inw;
import l.k850;
import l.oxk;
import l.qkq0;
import l.qyi;
import l.stc0;
import l.utc0;
import l.vsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015JC\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJi\u0010\u001f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001c2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u001e\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&¨\u0006("}, d2 = {"Ll/t4i0;", "Ll/vsl;", "<init>", "()V", "", "url", "", "headers", "", "postData", "f", "(Ljava/lang/String;Ljava/util/Map;[B)Ljava/lang/String;", "Ljava/io/File;", "file", "params", "", "b", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)V", "", "way", "e", "(I)Ljava/lang/String;", "g", "urlString", "formData", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "d", "", "files", "fileKeys", "c", "(Ljava/lang/String;Ljava/util/Map;[Ljava/io/File;[Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "path", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Ll/k850;", "kotlin.jvm.PlatformType", "Ll/k850;", "okHttpClient", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class t4i0 implements vsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public k850 okHttpClient = qib0.f19784H.getNormalHttp();

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m24459a(@NotNull String urlString, @Nullable Map<String, String> formData, @Nullable Map<String, String> headers) {
        String strString;
        urlString.getClass();
        stc0.a aVarQ = new stc0.a().q(urlString);
        cm10.a aVar = new cm10.a();
        aVar.f(cm10.j);
        if (formData != null) {
            ArrayList arrayList = new ArrayList(formData.size());
            for (Map.Entry<String, String> entry : formData.entrySet()) {
                if (entry.getKey().length() > 0 && entry.getValue() != null) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        stc0.a aVarL = aVarQ.l(aVar.e());
        if (headers != null) {
            aVarL.i(oxk.i(headers));
        }
        gxc0 gxc0VarK = this.okHttpClient.a(aVarL.b()).execute().k();
        if (gxc0VarK != null && (strString = gxc0VarK.string()) != null) {
            return strString;
        }
        ig3.a("");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m24460b(@Nullable String url, @Nullable File file, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) throws Exception {
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
            MDLog.i("DefaultHttpRequesterImpl", "saveFile=" + i + " url=" + url);
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                cll cllVarL = cll.l(url);
                objectRef.element = cllVarL;
                if (params != null) {
                    cll.a aVarP = cllVarL.p();
                    ArrayList arrayList = new ArrayList(params.size());
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        arrayList.add(aVarP.a(entry.getKey(), entry.getValue()));
                    }
                    objectRef.element = aVarP.d();
                }
                stc0.a aVarF = new stc0.a().s((cll) objectRef.element).f();
                if (headers != null) {
                    aVarF.i(oxk.i(headers));
                }
                biw.m12703a(file, this.okHttpClient.a(aVarF.b()).execute().k());
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

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m24461c(@Nullable String url, @Nullable Map<String, String> formData, @Nullable File[] files, @Nullable String[] fileKeys, @Nullable Map<String, String> headers) {
        String strString;
        stc0.a aVarQ = new stc0.a().q(url);
        if (headers != null) {
            aVarQ.i(oxk.i(headers));
        }
        if (files == null || files.length == 0) {
            if (formData != null) {
                qyi.a aVar = new qyi.a();
                ArrayList arrayList = new ArrayList(formData.size());
                for (Map.Entry<String, String> entry : formData.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        aVar.a(entry.getKey(), entry.getValue());
                    }
                    arrayList.add(Unit.INSTANCE);
                }
                aVarQ.l(aVar.b());
            }
        } else if (files.length == 1) {
            aVarQ.l(utc0.create(hyx.d(m24466h(files[0].getAbsolutePath())), files[0]));
        } else {
            cm10.a aVar2 = new cm10.a();
            int length = files.length;
            for (int i = 0; i < length; i++) {
                aVar2.f(cm10.j);
                String name = files[i].getName();
                name.getClass();
                if (d.w(name, "_", false, 2, (Object) null)) {
                    name.getClass();
                    name = name.substring(0, name.length() - 1);
                }
                aVar2.b(fileKeys != null ? fileKeys[i] : "mkimage" + i, name, utc0.create(hyx.d(m24466h(files[i].getAbsolutePath())), files[i]));
            }
            aVarQ.l(aVar2.e());
        }
        gxc0 gxc0VarK = this.okHttpClient.a(aVarQ.b()).execute().k();
        if (gxc0VarK != null && (strString = gxc0VarK.string()) != null) {
            return strString;
        }
        ig3.a("");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public String m24462d(@Nullable String url, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) {
        String strString;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        cll cllVarL = cll.l(url);
        objectRef.element = cllVarL;
        if (params != null) {
            cll.a aVarP = cllVarL.p();
            ArrayList arrayList = new ArrayList(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                arrayList.add(aVarP.a(entry.getKey(), entry.getValue()));
            }
            objectRef.element = aVarP.d();
        }
        stc0.a aVarF = new stc0.a().s((cll) objectRef.element).f();
        if (headers != null) {
            aVarF.i(oxk.i(headers));
        }
        gxc0 gxc0VarK = this.okHttpClient.a(aVarF.b()).execute().k();
        if (gxc0VarK != null && (strString = gxc0VarK.string()) != null) {
            return strString;
        }
        ig3.a("");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public String m24463e(int way) {
        return "deviceId";
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public String m24464f(@Nullable String url, @Nullable Map<String, String> headers, @Nullable byte[] postData) {
        stc0.a aVar = new stc0.a();
        url.getClass();
        gxc0 gxc0VarK = this.okHttpClient.a(aVar.q(url).i(oxk.i(headers)).l(utc0.create(hyx.d("application/octet-stream"), postData)).b()).execute().k();
        String strString = gxc0VarK != null ? gxc0VarK.string() : null;
        inw.s("requestPostData result : " + strString);
        if (strString != null) {
            return strString;
        }
        qkq0.a("post failed");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public String m24465g(int way) {
        return "deviceParams";
    }

    /* JADX INFO: renamed from: h */
    public final String m24466h(String path) {
        String contentTypeFor;
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(path, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            contentTypeFor = null;
        }
        return contentTypeFor == null ? "application/octet-stream" : contentTypeFor;
    }
}
