package p153l;

import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.gson.Gson;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class xl70 {

    /* JADX INFO: renamed from: a */
    public static Map<Long, Pair<xc00, C21369d>> f194872a = new HashMap();

    /* JADX INFO: renamed from: l.xl70$a */
    public class C21366a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f194873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C21369d f194874b;

        public C21366a(xc00 xc00Var, C21369d c21369d) {
            this.f194873a = xc00Var;
            this.f194874b = c21369d;
        }

        @Override // p153l.x20
        public void call() {
            xl70.m211540m(this.f194873a, this.f194874b);
        }
    }

    /* JADX INFO: renamed from: l.xl70$b */
    public class C21367b implements y20<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f194875a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C21369d f194876b;

        public C21367b(xc00 xc00Var, C21369d c21369d) {
            this.f194875a = xc00Var;
            this.f194876b = c21369d;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            xl70.m211538k(this.f194875a, this.f194876b, new C21370e(new C21368c[0], 1));
        }
    }

    /* JADX INFO: renamed from: l.xl70$c */
    public static class C21368c {

        /* JADX INFO: renamed from: a */
        public String f194877a;

        /* JADX INFO: renamed from: b */
        public String f194878b;

        /* JADX INFO: renamed from: c */
        public String f194879c;

        /* JADX INFO: renamed from: d */
        public long f194880d;

        /* JADX INFO: renamed from: e */
        public int f194881e;

        /* JADX INFO: renamed from: f */
        public int f194882f;

        /* JADX INFO: renamed from: g */
        public String f194883g;

        public C21368c(String str, String str2, String str3, long j, int i, int i2, String str4) {
            this.f194877a = str;
            this.f194878b = str2;
            this.f194879c = str3;
            this.f194880d = j;
            this.f194881e = i;
            this.f194882f = i2;
            this.f194883g = str4;
        }
    }

    /* JADX INFO: renamed from: l.xl70$d */
    public static class C21369d {

        /* JADX INFO: renamed from: a */
        public int f194884a;

        /* JADX INFO: renamed from: b */
        public int f194885b;

        /* JADX INFO: renamed from: c */
        public String[] f194886c;

        /* JADX INFO: renamed from: d */
        public boolean f194887d;

        /* JADX INFO: renamed from: e */
        public boolean f194888e;

        /* JADX INFO: renamed from: f */
        public String f194889f;

        /* JADX INFO: renamed from: g */
        public int f194890g;

        public C21369d(int i, int i2, String[] strArr, boolean z, boolean z2, String str, int i3) {
            this.f194884a = i;
            this.f194885b = i2;
            this.f194886c = strArr;
            this.f194887d = z;
            this.f194888e = z2;
            this.f194889f = str;
            this.f194890g = i3;
        }
    }

    /* JADX INFO: renamed from: l.xl70$e */
    public static class C21370e {

        /* JADX INFO: renamed from: a */
        public C21368c[] f194891a;

        /* JADX INFO: renamed from: b */
        public int f194892b;

        public C21370e(C21368c[] c21368cArr, int i) {
            this.f194891a = c21368cArr;
            this.f194892b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m211528a(xc00 xc00Var, C21369d c21369d, List list, List list2, Throwable th) {
        xc00Var.mo99543c().progressDismiss();
        o1j0.m165649w(R$string.f18040F);
        m211538k(xc00Var, c21369d, m211536i(c21369d, list, list2, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m211529b(xc00 xc00Var, C21369d c21369d, List list, Throwable th) {
        xc00Var.mo99543c().progressDismiss();
        o1j0.m165649w(R$string.f18040F);
        m211538k(xc00Var, c21369d, m211536i(c21369d, list, null, null));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m211530c(xc00 xc00Var, C21369d c21369d, List list, List list2, List list3) {
        xc00Var.mo99543c().progressDismiss();
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Media) it.next()).url);
        }
        m211538k(xc00Var, c21369d, m211536i(c21369d, list, list2, arrayList));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211531d(final C21369d c21369d, final xc00 xc00Var, final List list, final List list2) {
        if (c21369d.f194887d) {
            yb5.m214982K(list2, "profile", null, UploadSource.get("report")).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.vl70
                @Override // p153l.y20
                public final void call(Object obj) {
                    xl70.m211530c(xc00Var, c21369d, list, list2, (List) obj);
                }
            }, new y20() { // from class: l.wl70
                @Override // p153l.y20
                public final void call(Object obj) {
                    xl70.m211528a(xc00Var, c21369d, list, list2, (Throwable) obj);
                }
            }));
        } else {
            xc00Var.mo99543c().progressDismiss();
            m211538k(xc00Var, c21369d, m211536i(c21369d, list, list2, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public static C21368c m211535h(Media media, Media media2, boolean z) throws Throwable {
        String strM190678c;
        FileInputStream fileInputStream;
        Throwable th;
        String json = new Gson().toJson((Picture) media);
        String strM168038z = oki.m168038z(media2.url);
        sim simVar = new sim(strM168038z);
        Dimension dimension = new Dimension(simVar.f168843d);
        File file = new File(strM168038z);
        if (z) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    strM190678c = te2.m190678c(bArr, 2);
                    ua5.m195158b(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    ua5.m195158b(fileInputStream2);
                    strM190678c = "";
                } catch (Throwable th2) {
                    th = th2;
                    ua5.m195158b(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            strM190678c = "";
        }
        return new C21368c(strM190678c, "", json, file.length(), dimension.width, dimension.height, simVar.f168848i);
    }

    /* JADX INFO: renamed from: i */
    public static C21370e m211536i(@NonNull C21369d c21369d, @NonNull List<Media> list, @Nullable List<Media> list2, @Nullable List<String> list3) throws Throwable {
        if (jyb.m147479J(list2)) {
            return new C21370e(new C21368c[0], 5);
        }
        C21368c[] c21368cArr = new C21368c[list2.size()];
        boolean z = c21369d.f194887d && (jyb.m147479J(list3) || list3.size() != list2.size());
        for (int i = 0; i < list2.size(); i++) {
            C21368c c21368cM211535h = m211535h(list.get(i), list2.get(i), c21369d.f194888e);
            if (c21369d.f194887d && !z) {
                c21368cM211535h.f194878b = list3.get(i);
            }
            c21368cArr[i] = c21368cM211535h;
        }
        return new C21370e(c21368cArr, z ? 4 : 0);
    }

    /* JADX INFO: renamed from: j */
    public static void m211537j(long j, @NonNull ArrayList<Media> arrayList) {
        Pair<xc00, C21369d> pairRemove = f194872a.remove(Long.valueOf(j));
        if (NullChecker.m82486a(pairRemove)) {
            final xc00 xc00Var = (xc00) pairRemove.first;
            final C21369d c21369d = (C21369d) pairRemove.second;
            final ArrayList arrayListM147522n = jyb.m147522n(arrayList, new qcj() { // from class: l.sl70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            if (arrayListM147522n.isEmpty()) {
                m211538k(xc00Var, c21369d, new C21370e(new C21368c[0], 3));
            } else {
                xc00Var.mo99543c().progress(R$string.f18108W);
                new i1y(arrayListM147522n, c21369d.f194885b, 1, Bitmap.CompressFormat.JPEG, true).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.tl70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        xl70.m211531d(c21369d, xc00Var, arrayListM147522n, (List) obj);
                    }
                }, new y20() { // from class: l.ul70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        xl70.m211529b(xc00Var, c21369d, arrayListM147522n, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m211538k(@NonNull xc00 xc00Var, @NonNull C21369d c21369d, @NonNull C21370e c21370e) {
        String string;
        try {
            string = m211542o(c21370e, c21369d.f194890g).toString();
        } catch (JSONException unused) {
            string = "";
        }
        xc00Var.m210086f(c21369d.f194889f, string);
    }

    /* JADX INFO: renamed from: l */
    public static C21369d m211539l(@NonNull JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("maxCount", 9);
        int iOptInt2 = jSONObject.optInt("pixelLimit", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int i = iOptInt2 == -1 ? Integer.MAX_VALUE : iOptInt2;
        boolean zEquals = "1".equals(jSONObject.optString("needUpload"));
        boolean zOptBoolean = jSONObject.optBoolean("needBase64", true);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(MatchFrom.selected);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i2, ""));
            }
        }
        return new C21369d(iOptInt, i, (String[]) arrayList.toArray(new String[0]), zEquals, zOptBoolean, jSONObject.optString("callback", ""), jSONObject.optInt("sizeLimit", -1));
    }

    /* JADX INFO: renamed from: m */
    public static void m211540m(@NonNull xc00 xc00Var, @NonNull C21369d c21369d) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f194872a.put(Long.valueOf(jCurrentTimeMillis), new Pair<>(xc00Var, c21369d));
        ArrayList arrayList = new ArrayList();
        for (String str : c21369d.f194886c) {
            arrayList.add((Picture) new Gson().fromJson(str, Picture.class));
        }
        xc00Var.mo99543c().startActivityForResult(MediaPickerAct.m80102Y1(xc00Var.mo99543c(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().showPreviewEditBtn(false).withMaxPickCount(c21369d.f194884a).build()).withAlreadySelectedMedia(arrayList).withSelectedFolderPath("").withFromType(8).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().jsBridgeTimestamp(jCurrentTimeMillis).build()), 66);
        xc00Var.mo99543c().overridePendingTransition(w7c0.f187734d, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m211541n(@NonNull xc00 xc00Var, @NonNull JSONObject jSONObject) {
        C21369d c21369dM211539l = m211539l(jSONObject);
        C21366a c21366a = new C21366a(xc00Var, c21369dM211539l);
        C21367b c21367b = new C21367b(xc00Var, c21369dM211539l);
        if (wzx.m208784k()) {
            new wzx().m208785d(xc00Var.mo99543c(), null, c21366a, c21367b, null, null, null);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(c21366a, c21367b).m81074i(xc00Var.mo99543c());
        }
    }

    /* JADX INFO: renamed from: o */
    public static JSONObject m211542o(@NonNull C21370e c21370e, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (C21368c c21368c : c21370e.f194891a) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("base64", c21368c.f194877a);
            jSONObject2.put("url", c21368c.f194878b);
            jSONObject2.put("path", c21368c.f194879c);
            jSONObject2.put("size", c21368c.f194880d);
            jSONObject2.put("pixelWidth", c21368c.f194881e);
            jSONObject2.put("pixelheight", c21368c.f194882f);
            jSONObject2.put("mediaType", c21368c.f194883g);
            j += c21368c.f194880d;
            jSONArray.put(jSONObject2);
        }
        if (i != -1 && j >= i) {
            jSONObject.put("code", 5);
            return jSONObject;
        }
        jSONObject.put("data", jSONArray);
        jSONObject.put("code", c21370e.f194892b);
        return jSONObject;
    }
}
