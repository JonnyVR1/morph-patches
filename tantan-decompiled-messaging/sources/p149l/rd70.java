package p149l;

import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.gson.Gson;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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

/* JADX INFO: loaded from: classes11.dex */
public class rd70 {

    /* JADX INFO: renamed from: a */
    public static Map<Long, Pair<f400, C19677d>> f158876a = new HashMap();

    /* JADX INFO: renamed from: l.rd70$a */
    public class C19674a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f158877a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19677d f158878b;

        public C19674a(f400 f400Var, C19677d c19677d) {
            this.f158877a = f400Var;
            this.f158878b = c19677d;
        }

        @Override // p149l.d30
        public void call() {
            rd70.m178955m(this.f158877a, this.f158878b);
        }
    }

    /* JADX INFO: renamed from: l.rd70$b */
    public class C19675b implements e30<PermissionHelper.PermissionDeniedReason> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f158879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19677d f158880b;

        public C19675b(f400 f400Var, C19677d c19677d) {
            this.f158879a = f400Var;
            this.f158880b = c19677d;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            rd70.m178953k(this.f158879a, this.f158880b, new C19678e(new C19676c[0], 1));
        }
    }

    /* JADX INFO: renamed from: l.rd70$c */
    public static class C19676c {

        /* JADX INFO: renamed from: a */
        public String f158881a;

        /* JADX INFO: renamed from: b */
        public String f158882b;

        /* JADX INFO: renamed from: c */
        public String f158883c;

        /* JADX INFO: renamed from: d */
        public long f158884d;

        /* JADX INFO: renamed from: e */
        public int f158885e;

        /* JADX INFO: renamed from: f */
        public int f158886f;

        /* JADX INFO: renamed from: g */
        public String f158887g;

        public C19676c(String str, String str2, String str3, long j, int i, int i2, String str4) {
            this.f158881a = str;
            this.f158882b = str2;
            this.f158883c = str3;
            this.f158884d = j;
            this.f158885e = i;
            this.f158886f = i2;
            this.f158887g = str4;
        }
    }

    /* JADX INFO: renamed from: l.rd70$d */
    public static class C19677d {

        /* JADX INFO: renamed from: a */
        public int f158888a;

        /* JADX INFO: renamed from: b */
        public int f158889b;

        /* JADX INFO: renamed from: c */
        public String[] f158890c;

        /* JADX INFO: renamed from: d */
        public boolean f158891d;

        /* JADX INFO: renamed from: e */
        public boolean f158892e;

        /* JADX INFO: renamed from: f */
        public String f158893f;

        /* JADX INFO: renamed from: g */
        public int f158894g;

        public C19677d(int i, int i2, String[] strArr, boolean z, boolean z2, String str, int i3) {
            this.f158888a = i;
            this.f158889b = i2;
            this.f158890c = strArr;
            this.f158891d = z;
            this.f158892e = z2;
            this.f158893f = str;
            this.f158894g = i3;
        }
    }

    /* JADX INFO: renamed from: l.rd70$e */
    public static class C19678e {

        /* JADX INFO: renamed from: a */
        public C19676c[] f158895a;

        /* JADX INFO: renamed from: b */
        public int f158896b;

        public C19678e(C19676c[] c19676cArr, int i) {
            this.f158895a = c19676cArr;
            this.f158896b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178943a(f400 f400Var, C19677d c19677d, List list, List list2, Throwable th) {
        f400Var.mo102961c().progressDismiss();
        lsi0.m151593w(R$string.f17321F);
        m178953k(f400Var, c19677d, m178951i(c19677d, list, list2, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m178944b(f400 f400Var, C19677d c19677d, List list, Throwable th) {
        f400Var.mo102961c().progressDismiss();
        lsi0.m151593w(R$string.f17321F);
        m178953k(f400Var, c19677d, m178951i(c19677d, list, null, null));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m178945c(f400 f400Var, C19677d c19677d, List list, List list2, List list3) {
        f400Var.mo102961c().progressDismiss();
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Media) it.next()).url);
        }
        m178953k(f400Var, c19677d, m178951i(c19677d, list, list2, arrayList));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178946d(final C19677d c19677d, final f400 f400Var, final List list, final List list2) {
        if (c19677d.f158891d) {
            ya5.m213795K(list2, "profile", null, UploadSource.get("report")).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.pd70
                @Override // p149l.e30
                public final void call(Object obj) {
                    rd70.m178945c(f400Var, c19677d, list, list2, (List) obj);
                }
            }, new e30() { // from class: l.qd70
                @Override // p149l.e30
                public final void call(Object obj) {
                    rd70.m178943a(f400Var, c19677d, list, list2, (Throwable) obj);
                }
            }));
        } else {
            f400Var.mo102961c().progressDismiss();
            m178953k(f400Var, c19677d, m178951i(c19677d, list, list2, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public static C19676c m178950h(Media media, Media media2, boolean z) throws Throwable {
        String strM149477c;
        FileInputStream fileInputStream;
        Throwable th;
        String json = new Gson().toJson((Picture) media);
        String strM179382z = rhi.m179382z(media2.url);
        pgm pgmVar = new pgm(strM179382z);
        Dimension dimension = new Dimension(pgmVar.f148730d);
        File file = new File(strM179382z);
        if (z) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    strM149477c = le2.m149477c(bArr, 2);
                    t95.m187604b(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    t95.m187604b(fileInputStream2);
                    strM149477c = "";
                } catch (Throwable th2) {
                    th = th2;
                    t95.m187604b(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            strM149477c = "";
        }
        return new C19676c(strM149477c, "", json, file.length(), dimension.width, dimension.height, pgmVar.f148735i);
    }

    /* JADX INFO: renamed from: i */
    public static C19678e m178951i(@NonNull C19677d c19677d, @NonNull List<Media> list, @Nullable List<Media> list2, @Nullable List<String> list3) throws Throwable {
        if (vwb.m200296J(list2)) {
            return new C19678e(new C19676c[0], 5);
        }
        C19676c[] c19676cArr = new C19676c[list2.size()];
        boolean z = c19677d.f158891d && (vwb.m200296J(list3) || list3.size() != list2.size());
        for (int i = 0; i < list2.size(); i++) {
            C19676c c19676cM178950h = m178950h(list.get(i), list2.get(i), c19677d.f158892e);
            if (c19677d.f158891d && !z) {
                c19676cM178950h.f158882b = list3.get(i);
            }
            c19676cArr[i] = c19676cM178950h;
        }
        return new C19678e(c19676cArr, z ? 4 : 0);
    }

    /* JADX INFO: renamed from: j */
    public static void m178952j(long j, @NonNull ArrayList<Media> arrayList) {
        Pair<f400, C19677d> pairRemove = f158876a.remove(Long.valueOf(j));
        if (NullChecker.m81303a(pairRemove)) {
            final f400 f400Var = (f400) pairRemove.first;
            final C19677d c19677d = (C19677d) pairRemove.second;
            final ArrayList arrayListM200339n = vwb.m200339n(arrayList, new w9j() { // from class: l.md70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            if (arrayListM200339n.isEmpty()) {
                m178953k(f400Var, c19677d, new C19678e(new C19676c[0], 3));
            } else {
                f400Var.mo102961c().progress(R$string.f17389W);
                new lsx(arrayListM200339n, c19677d.f158889b, 1, Bitmap.CompressFormat.JPEG, true).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.nd70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        rd70.m178946d(c19677d, f400Var, arrayListM200339n, (List) obj);
                    }
                }, new e30() { // from class: l.od70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        rd70.m178944b(f400Var, c19677d, arrayListM200339n, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m178953k(@NonNull f400 f400Var, @NonNull C19677d c19677d, @NonNull C19678e c19678e) {
        String string;
        try {
            string = m178957o(c19678e, c19677d.f158894g).toString();
        } catch (JSONException unused) {
            string = "";
        }
        f400Var.m119269f(c19677d.f158893f, string);
    }

    /* JADX INFO: renamed from: l */
    public static C19677d m178954l(@NonNull JSONObject jSONObject) {
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
        return new C19677d(iOptInt, i, (String[]) arrayList.toArray(new String[0]), zEquals, zOptBoolean, jSONObject.optString("callback", ""), jSONObject.optInt("sizeLimit", -1));
    }

    /* JADX INFO: renamed from: m */
    public static void m178955m(@NonNull f400 f400Var, @NonNull C19677d c19677d) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f158876a.put(Long.valueOf(jCurrentTimeMillis), new Pair<>(f400Var, c19677d));
        ArrayList arrayList = new ArrayList();
        for (String str : c19677d.f158890c) {
            arrayList.add((Picture) new Gson().fromJson(str, Picture.class));
        }
        f400Var.mo102961c().startActivityForResult(MediaPickerAct.m78919X1(f400Var.mo102961c(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().showPreviewEditBtn(false).withMaxPickCount(c19677d.f158888a).build()).withAlreadySelectedMedia(arrayList).withSelectedFolderPath("").withFromType(8).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().jsBridgeTimestamp(jCurrentTimeMillis).build()), 66);
        f400Var.mo102961c().overridePendingTransition(qzb0.f157023d, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m178956n(@NonNull f400 f400Var, @NonNull JSONObject jSONObject) {
        C19677d c19677dM178954l = m178954l(jSONObject);
        C19674a c19674a = new C19674a(f400Var, c19677dM178954l);
        C19675b c19675b = new C19675b(f400Var, c19677dM178954l);
        if (zqx.m219898k()) {
            new zqx().m219899d(f400Var.mo102961c(), null, c19674a, c19675b, null, null, null);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(c19674a, c19675b).m79891i(f400Var.mo102961c());
        }
    }

    /* JADX INFO: renamed from: o */
    public static JSONObject m178957o(@NonNull C19678e c19678e, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (C19676c c19676c : c19678e.f158895a) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("base64", c19676c.f158881a);
            jSONObject2.put("url", c19676c.f158882b);
            jSONObject2.put("path", c19676c.f158883c);
            jSONObject2.put("size", c19676c.f158884d);
            jSONObject2.put("pixelWidth", c19676c.f158885e);
            jSONObject2.put("pixelheight", c19676c.f158886f);
            jSONObject2.put("mediaType", c19676c.f158887g);
            j += c19676c.f158884d;
            jSONArray.put(jSONObject2);
        }
        if (i != -1 && j >= i) {
            jSONObject.put("code", 5);
            return jSONObject;
        }
        jSONObject.put("data", jSONArray);
        jSONObject.put("code", c19678e.f158896b);
        return jSONObject;
    }
}
