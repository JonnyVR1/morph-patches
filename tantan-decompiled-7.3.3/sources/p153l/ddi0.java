package p153l;

import android.annotation.SuppressLint;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import okio.Buffer;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011JK\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010\"\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0010\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u001f2\u0010\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001f2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\"\u0010#JM\u0010$\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b$\u0010%JO\u0010&\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b&\u0010%JK\u0010'\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,JU\u0010.\u001a\u00020-2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b.\u0010/JC\u00102\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m88121d2 = {"Ll/ddi0;", "Ll/ivl;", "<init>", "()V", "", "url", "Ljava/io/File;", "file", "", CommandMessage.PARAMS, "headers", "", "a", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)V", "", "way", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "", "postData", "originHost", "contentType", "Ll/jvl;", "e", "(Ljava/lang/String;[BLjava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ll/jvl;", "", "formData", "Ll/pl80;", "g", "(Ljava/util/Map;)Ll/pl80;", "", "files", "fileKeys", "b", "(Ljava/lang/String;Ljava/util/Map;[Ljava/io/File;[Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "h", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Ll/jvl;", "f", "j", "code", "message", "Ll/kvl;", "c", "(ILjava/lang/String;)Ll/kvl;", "Ll/x1d0$a;", "m", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Ll/x1d0$a;", "Ll/z1d0;", "requestBody", "o", "(Ljava/lang/String;Ll/z1d0;Ljava/util/Map;Ljava/lang/String;)Ll/x1d0$a;", "path", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Ljava/lang/String;", "Ll/k5d0;", "response", "q", "(Ljava/io/File;Ll/k5d0;)V", "Ll/rg50;", "Lkotlin/Lazy;", "p", "()Ll/rg50;", "okHttpClient", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"LogUseError"})
@SourceDebugExtension
public final class ddi0 implements ivl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy okHttpClient = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.bdi0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ddi0.m115342l();
        }
    });

    /* JADX INFO: renamed from: l */
    public static rg50 m115342l() {
        rg50.C19837b c19837bM181359v = uqb0.f180376H.getNormalHttp().m181359v();
        List<azm> listM181378p = c19837bM181359v.m181378p();
        listM181378p.getClass();
        CollectionsKt.removeAll((List) listM181378p, new Function1() { // from class: l.cdi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ddi0.m115344r((azm) obj));
            }
        });
        return c19837bM181359v.m181365c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ x1d0.C21228a m115343n(ddi0 ddi0Var, String str, Map map, Map map2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return ddi0Var.m115355m(str, map, map2, str2);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m115344r(azm azmVar) {
        return azmVar instanceof mhl;
    }

    @Override // p153l.ivl
    /* JADX INFO: renamed from: a */
    public void mo115345a(@Nullable String url, @Nullable File file, @Nullable Map<String, String> params, @Nullable Map<String, String> headers) throws Exception {
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
            ddi0 ddi0Var = this;
            String str = url;
            Map<String, String> map = params;
            Map<String, String> map2 = headers;
            try {
                ddi0Var.m115358q(file, ddi0Var.m115357p().mo181341a(m115343n(ddi0Var, str, map, map2, null, 8, null).m209028b()).execute().m138670k());
                break;
            } catch (Throwable th2) {
                th = th2;
                Log.e("DefaultHttpRequesterImpl", "", th);
                i2 = i;
                this = ddi0Var;
                url = str;
                params = map;
                headers = map2;
            }
        }
        if (i >= 4) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo115346b(@Nullable String url, @Nullable Map<String, String> formData, @Nullable File[] files, @Nullable String[] fileKeys, @Nullable Map<String, String> headers) {
        String strString;
        x1d0.C21228a c21228aM209043q = new x1d0.C21228a().m209043q(url);
        if (headers != null) {
            c21228aM209043q.m209035i(e0l.m118871i(headers));
        }
        if (files == null || files.length == 0) {
            if (formData != null) {
                l1j.C18332a c18332a = new l1j.C18332a();
                ArrayList arrayList = new ArrayList(formData.size());
                for (Map.Entry<String, String> entry : formData.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        c18332a.m152497a(entry.getKey(), entry.getValue());
                    }
                    arrayList.add(Unit.INSTANCE);
                }
                c21228aM209043q.m209038l(c18332a.m152498b());
            }
        } else if (files.length == 1) {
            c21228aM209043q.m209038l(z1d0.create(e7y.m119773d(m115359s(files[0].getAbsolutePath())), files[0]));
        } else {
            ku10.C18260a c18260a = new ku10.C18260a();
            int length = files.length;
            for (int i = 0; i < length; i++) {
                c18260a.m151432f(ku10.f128786j);
                String name = files[i].getName();
                name.getClass();
                if (C15493d.m94380w(name, "_", false, 2, null)) {
                    name.getClass();
                    name = name.substring(0, name.length() - 1);
                }
                c18260a.m151428b(fileKeys != null ? fileKeys[i] : "mkimage" + i, name, z1d0.create(e7y.m119773d(m115359s(files[i].getAbsolutePath())), files[i]));
            }
            c21228aM209043q.m209038l(c18260a.m151431e());
        }
        k5d0 k5d0VarM138670k = m115357p().mo181341a(c21228aM209043q.m209028b()).execute().m138670k();
        if (k5d0VarM138670k != null && (strString = k5d0VarM138670k.string()) != null) {
            return strString;
        }
        wg3.m206174a("");
        return null;
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: c */
    public kvl mo115347c(int code, @NotNull String message) {
        message.getClass();
        return new cnl(code, message);
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo115348d(int way) {
        return Constants.DEVICE_ID_TAG;
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: e */
    public jvl mo115349e(@NotNull String url, @Nullable byte[] postData, @Nullable Map<String, String> headers, @Nullable String originHost, @Nullable String contentType) throws IOException {
        Map<String, String> linkedHashMap;
        url.getClass();
        if (contentType == null) {
            contentType = MimeTypes.FORM_ENCODED;
        }
        e7y e7yVarM119773d = e7y.m119773d(contentType);
        if (postData == null) {
            postData = new byte[0];
        }
        z1d0 z1d0VarCreate = z1d0.create(e7yVarM119773d, postData);
        if (headers == null || (linkedHashMap = MapsKt.toMutableMap(headers)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        z1d0VarCreate.getClass();
        x1d0.C21228a c21228aM115356o = m115356o(url, z1d0VarCreate, linkedHashMap, originHost);
        c21228aM115356o.m209040n("If-None-Match");
        c21228aM115356o.m209040n("If-Modified-Since");
        i5d0 i5d0VarExecute = m115357p().mo181341a(c21228aM115356o.m209028b()).execute();
        i5d0VarExecute.getClass();
        return new enl(i5d0VarExecute);
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: f */
    public jvl mo115350f(@Nullable String url, @Nullable Map<String, String> headers, @Nullable Map<String, String> params, @Nullable String originHost) throws IOException {
        x1d0.C21228a c21228aM115355m = m115355m(url, null, headers != null ? MapsKt.toMutableMap(headers) : null, originHost);
        c21228aM115355m.m209040n("If-None-Match");
        c21228aM115355m.m209040n("If-Modified-Since");
        i5d0 i5d0VarExecute = m115357p().mo181341a(c21228aM115355m.m209028b()).execute();
        i5d0VarExecute.getClass();
        return new enl(i5d0VarExecute);
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: g */
    public pl80 mo115351g(@Nullable Map<String, String> formData) throws IOException {
        ku10.C18260a c18260a = new ku10.C18260a();
        c18260a.m151432f(ku10.f128786j);
        if (formData != null) {
            for (Map.Entry<String, String> entry : formData.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key.length() > 0) {
                    c18260a.m151427a(key, value);
                }
            }
        }
        ku10 ku10VarM151431e = c18260a.m151431e();
        Buffer buffer = new Buffer();
        ku10VarM151431e.writeTo(buffer);
        return new pl80(buffer.readByteArray(), String.valueOf(ku10VarM151431e.contentType()));
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: h */
    public jvl mo115352h(@NotNull String url, @Nullable Map<String, String> headers, @Nullable Map<String, String> params, @Nullable String originHost) throws IOException {
        url.getClass();
        i5d0 i5d0VarExecute = m115357p().mo181341a(m115355m(url, null, headers != null ? MapsKt.toMutableMap(headers) : null, originHost).m209028b()).execute();
        i5d0VarExecute.getClass();
        return new enl(i5d0VarExecute);
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: i */
    public String mo115353i(int way) {
        return "deviceParams";
    }

    @Override // p153l.ivl
    @NotNull
    /* JADX INFO: renamed from: j */
    public jvl mo115354j(@NotNull String url, @Nullable byte[] postData, @Nullable Map<String, String> headers, @Nullable String originHost, @Nullable String contentType) throws IOException {
        url.getClass();
        if (contentType == null) {
            contentType = MimeTypes.FORM_ENCODED;
        }
        e7y e7yVarM119773d = e7y.m119773d(contentType);
        if (postData == null) {
            postData = new byte[0];
        }
        z1d0 z1d0VarCreate = z1d0.create(e7yVarM119773d, postData);
        Map<String, String> mutableMap = headers != null ? MapsKt.toMutableMap(headers) : null;
        z1d0VarCreate.getClass();
        i5d0 i5d0VarExecute = m115357p().mo181341a(m115356o(url, z1d0VarCreate, mutableMap, originHost).m209028b()).execute();
        i5d0VarExecute.getClass();
        return new enl(i5d0VarExecute);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, l.rnl] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, l.rnl] */
    /* JADX INFO: renamed from: m */
    public final x1d0.C21228a m115355m(String url, Map<String, String> params, Map<String, String> headers, String originHost) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M182263l = rnl.m182263l(url);
        objectRef.element = M182263l;
        if (params != null) {
            rnl.C19886a c19886aM182288p = M182263l.m182288p();
            ArrayList arrayList = new ArrayList(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                arrayList.add(c19886aM182288p.m182298a(entry.getKey(), entry.getValue()));
            }
            objectRef.element = c19886aM182288p.m182301d();
        }
        x1d0.C21228a c21228aM209032f = new x1d0.C21228a().m209045s((rnl) objectRef.element).m209032f();
        if (headers != null) {
            c21228aM209032f.m209035i(e0l.m118871i(headers));
        }
        c21228aM209032f.getClass();
        return c21228aM209032f;
    }

    /* JADX INFO: renamed from: o */
    public final x1d0.C21228a m115356o(String url, z1d0 requestBody, Map<String, String> headers, String originHost) {
        x1d0.C21228a c21228aM209038l = new x1d0.C21228a().m209043q(url).m209038l(requestBody);
        if (headers != null) {
            c21228aM209038l.m209035i(e0l.m118871i(headers));
        }
        c21228aM209038l.getClass();
        return c21228aM209038l;
    }

    /* JADX INFO: renamed from: p */
    public final rg50 m115357p() {
        Object value = this.okHttpClient.getValue();
        value.getClass();
        return (rg50) value;
    }

    /* JADX INFO: renamed from: q */
    public final void m115358q(File file, k5d0 response) {
        FileOutputStream fileOutputStream;
        if (file == null || response == null) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream inputStreamByteStream = response.byteStream();
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStreamByteStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamByteStream;
                        try {
                            Log.e("MKResponseHelper", "", th);
                            if (fileOutputStream == null) {
                                return;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    Log.e("HTTP", "", e);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    Log.e("HTTP", "", e2);
                                }
                            }
                        }
                    }
                }
                fileOutputStream.flush();
                try {
                    inputStreamByteStream.close();
                } catch (IOException e3) {
                    Log.e("HTTP", "", e3);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m115359s(String path) {
        String contentTypeFor;
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(path, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            contentTypeFor = null;
        }
        return contentTypeFor == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : contentTypeFor;
    }
}
