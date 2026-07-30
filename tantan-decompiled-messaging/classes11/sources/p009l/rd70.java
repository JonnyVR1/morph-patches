package p009l;

import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.le2;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.pgm;
import l.qzb0;
import l.rhi;
import l.t95;
import l.vwb;
import l.w9j;
import l.ya5;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rd70 {

    /* JADX INFO: renamed from: a */
    public static Map<Long, Pair<f400, C1173d>> f19746a = new HashMap();

    /* JADX INFO: renamed from: l.rd70$a */
    public class C1170a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f19747a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1173d f19748b;

        public C1170a(f400 f400Var, C1173d c1173d) {
            this.f19747a = f400Var;
            this.f19748b = c1173d;
        }

        public void call() {
            rd70.m21596m(this.f19747a, this.f19748b);
        }
    }

    /* JADX INFO: renamed from: l.rd70$b */
    public class C1171b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f19749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1173d f19750b;

        public C1171b(f400 f400Var, C1173d c1173d) {
            this.f19749a = f400Var;
            this.f19750b = c1173d;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            rd70.m21594k(this.f19749a, this.f19750b, new C1174e(new C1172c[0], 1));
        }
    }

    /* JADX INFO: renamed from: l.rd70$c */
    public static class C1172c {

        /* JADX INFO: renamed from: a */
        public String f19751a;

        /* JADX INFO: renamed from: b */
        public String f19752b;

        /* JADX INFO: renamed from: c */
        public String f19753c;

        /* JADX INFO: renamed from: d */
        public long f19754d;

        /* JADX INFO: renamed from: e */
        public int f19755e;

        /* JADX INFO: renamed from: f */
        public int f19756f;

        /* JADX INFO: renamed from: g */
        public String f19757g;

        public C1172c(String str, String str2, String str3, long j, int i, int i2, String str4) {
            this.f19751a = str;
            this.f19752b = str2;
            this.f19753c = str3;
            this.f19754d = j;
            this.f19755e = i;
            this.f19756f = i2;
            this.f19757g = str4;
        }
    }

    /* JADX INFO: renamed from: l.rd70$d */
    public static class C1173d {

        /* JADX INFO: renamed from: a */
        public int f19758a;

        /* JADX INFO: renamed from: b */
        public int f19759b;

        /* JADX INFO: renamed from: c */
        public String[] f19760c;

        /* JADX INFO: renamed from: d */
        public boolean f19761d;

        /* JADX INFO: renamed from: e */
        public boolean f19762e;

        /* JADX INFO: renamed from: f */
        public String f19763f;

        /* JADX INFO: renamed from: g */
        public int f19764g;

        public C1173d(int i, int i2, String[] strArr, boolean z, boolean z2, String str, int i3) {
            this.f19758a = i;
            this.f19759b = i2;
            this.f19760c = strArr;
            this.f19761d = z;
            this.f19762e = z2;
            this.f19763f = str;
            this.f19764g = i3;
        }
    }

    /* JADX INFO: renamed from: l.rd70$e */
    public static class C1174e {

        /* JADX INFO: renamed from: a */
        public C1172c[] f19765a;

        /* JADX INFO: renamed from: b */
        public int f19766b;

        public C1174e(C1172c[] c1172cArr, int i) {
            this.f19765a = c1172cArr;
            this.f19766b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21584a(f400 f400Var, C1173d c1173d, List list, List list2, Throwable th) {
        f400Var.mo12184c().progressDismiss();
        lsi0.w(R.string.F);
        m21594k(f400Var, c1173d, m21592i(c1173d, list, list2, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21585b(f400 f400Var, C1173d c1173d, List list, Throwable th) {
        f400Var.mo12184c().progressDismiss();
        lsi0.w(R.string.F);
        m21594k(f400Var, c1173d, m21592i(c1173d, list, null, null));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21586c(f400 f400Var, C1173d c1173d, List list, List list2, List list3) {
        f400Var.mo12184c().progressDismiss();
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Media) it.next()).url);
        }
        m21594k(f400Var, c1173d, m21592i(c1173d, list, list2, arrayList));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21587d(final C1173d c1173d, final f400 f400Var, final List list, final List list2) {
        if (c1173d.f19761d) {
            ya5.K(list2, "profile", (String) null, UploadSource.get("report")).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.pd70
                public final void call(Object obj) {
                    rd70.m21586c(f400Var, c1173d, list, list2, (List) obj);
                }
            }, new e30() { // from class: l.qd70
                public final void call(Object obj) {
                    rd70.m21584a(f400Var, c1173d, list, list2, (Throwable) obj);
                }
            }));
        } else {
            f400Var.mo12184c().progressDismiss();
            m21594k(f400Var, c1173d, m21592i(c1173d, list, list2, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public static C1172c m21591h(Media media, Media media2, boolean z) throws Throwable {
        String strC;
        FileInputStream fileInputStream;
        Throwable th;
        String json = new Gson().toJson((Picture) media);
        String strZ = rhi.z(media2.url);
        pgm pgmVar = new pgm(strZ);
        Dimension dimension = new Dimension(pgmVar.d);
        File file = new File(strZ);
        if (z) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    strC = le2.c(bArr, 2);
                    t95.b(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    t95.b(fileInputStream2);
                    strC = "";
                } catch (Throwable th2) {
                    th = th2;
                    t95.b(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            strC = "";
        }
        return new C1172c(strC, "", json, file.length(), dimension.width, dimension.height, pgmVar.i);
    }

    /* JADX INFO: renamed from: i */
    public static C1174e m21592i(@NonNull C1173d c1173d, @NonNull List<Media> list, @Nullable List<Media> list2, @Nullable List<String> list3) throws Throwable {
        if (vwb.J(list2)) {
            return new C1174e(new C1172c[0], 5);
        }
        C1172c[] c1172cArr = new C1172c[list2.size()];
        boolean z = c1173d.f19761d && (vwb.J(list3) || list3.size() != list2.size());
        for (int i = 0; i < list2.size(); i++) {
            C1172c c1172cM21591h = m21591h(list.get(i), list2.get(i), c1173d.f19762e);
            if (c1173d.f19761d && !z) {
                c1172cM21591h.f19752b = list3.get(i);
            }
            c1172cArr[i] = c1172cM21591h;
        }
        return new C1174e(c1172cArr, z ? 4 : 0);
    }

    /* JADX INFO: renamed from: j */
    public static void m21593j(long j, @NonNull ArrayList<Media> arrayList) {
        Pair<f400, C1173d> pairRemove = f19746a.remove(Long.valueOf(j));
        if (NullChecker.a(pairRemove)) {
            final f400 f400Var = (f400) pairRemove.first;
            final C1173d c1173d = (C1173d) pairRemove.second;
            final ArrayList arrayListN = vwb.n(arrayList, new w9j() { // from class: l.md70
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            if (arrayListN.isEmpty()) {
                m21594k(f400Var, c1173d, new C1174e(new C1172c[0], 3));
            } else {
                f400Var.mo12184c().progress(R.string.W);
                new lsx(arrayListN, c1173d.f19759b, 1, Bitmap.CompressFormat.JPEG, true).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.nd70
                    public final void call(Object obj) {
                        rd70.m21587d(c1173d, f400Var, arrayListN, (List) obj);
                    }
                }, new e30() { // from class: l.od70
                    public final void call(Object obj) {
                        rd70.m21585b(f400Var, c1173d, arrayListN, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21594k(@NonNull f400 f400Var, @NonNull C1173d c1173d, @NonNull C1174e c1174e) {
        String string;
        try {
            string = m21598o(c1174e, c1173d.f19764g).toString();
        } catch (JSONException unused) {
            string = "";
        }
        f400Var.m14203f(c1173d.f19763f, string);
    }

    /* JADX INFO: renamed from: l */
    public static C1173d m21595l(@NonNull JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("maxCount", 9);
        int iOptInt2 = jSONObject.optInt("pixelLimit", Integer.MAX_VALUE);
        int i = iOptInt2 == -1 ? Integer.MAX_VALUE : iOptInt2;
        boolean zEquals = "1".equals(jSONObject.optString("needUpload"));
        boolean zOptBoolean = jSONObject.optBoolean("needBase64", true);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("selected");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i2, ""));
            }
        }
        return new C1173d(iOptInt, i, (String[]) arrayList.toArray(new String[0]), zEquals, zOptBoolean, jSONObject.optString("callback", ""), jSONObject.optInt("sizeLimit", -1));
    }

    /* JADX INFO: renamed from: m */
    public static void m21596m(@NonNull f400 f400Var, @NonNull C1173d c1173d) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f19746a.put(Long.valueOf(jCurrentTimeMillis), new Pair<>(f400Var, c1173d));
        ArrayList arrayList = new ArrayList();
        for (String str : c1173d.f19760c) {
            arrayList.add((Picture) new Gson().fromJson(str, Picture.class));
        }
        f400Var.mo12184c().startActivityForResult(MediaPickerAct.m9216X1(f400Var.mo12184c(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().showPreviewEditBtn(false).withMaxPickCount(c1173d.f19758a).build()).withAlreadySelectedMedia(arrayList).withSelectedFolderPath("").withFromType(8).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().jsBridgeTimestamp(jCurrentTimeMillis).build()), 66);
        f400Var.mo12184c().overridePendingTransition(qzb0.d, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m21597n(@NonNull f400 f400Var, @NonNull JSONObject jSONObject) {
        C1173d c1173dM21595l = m21595l(jSONObject);
        C1170a c1170a = new C1170a(f400Var, c1173dM21595l);
        C1171b c1171b = new C1171b(f400Var, c1173dM21595l);
        if (zqx.m25938k()) {
            new zqx().m25939d(f400Var.mo12184c(), null, c1170a, c1171b, null, null, null);
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(c1170a, c1171b).m10220i(f400Var.mo12184c());
        }
    }

    /* JADX INFO: renamed from: o */
    public static JSONObject m21598o(@NonNull C1174e c1174e, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (C1172c c1172c : c1174e.f19765a) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("base64", c1172c.f19751a);
            jSONObject2.put("url", c1172c.f19752b);
            jSONObject2.put("path", c1172c.f19753c);
            jSONObject2.put("size", c1172c.f19754d);
            jSONObject2.put("pixelWidth", c1172c.f19755e);
            jSONObject2.put("pixelheight", c1172c.f19756f);
            jSONObject2.put("mediaType", c1172c.f19757g);
            j += c1172c.f19754d;
            jSONArray.put(jSONObject2);
        }
        if (i != -1 && j >= i) {
            jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 5);
            return jSONObject;
        }
        jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, jSONArray);
        jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, c1174e.f19766b);
        return jSONObject;
    }
}
