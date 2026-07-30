package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.cosmos.mdlog.MDLog;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.utils.FileUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vgx extends fnl {

    /* JADX INFO: renamed from: l.vgx$a */
    public class RunnableC20635a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181432a;

        public RunnableC20635a(JSONObject jSONObject) {
            this.f181432a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vgx.this.m198402s(this.f181432a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.vgx$b */
    public class RunnableC20636b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181434a;

        public RunnableC20636b(JSONObject jSONObject) {
            this.f181434a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            vgx.this.m198408y(this.f181434a);
        }
    }

    /* JADX INFO: renamed from: l.vgx$c */
    public class C20637c implements sgm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f181436a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f181437b;

        public C20637c(String str, String str2) {
            this.f181436a = str;
            this.f181437b = str2;
        }
    }

    /* JADX INFO: renamed from: l.vgx$d */
    public class RunnableC20638d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181439a;

        public RunnableC20638d(JSONObject jSONObject) {
            this.f181439a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vgx.this.m122322a() == null) {
                return;
            }
            String strOptString = this.f181439a.optString("url");
            String strOptString2 = this.f181439a.optString("callback");
            JSONArray jSONArrayOptJSONArray = this.f181439a.optJSONArray("images");
            if (TextUtils.isEmpty(strOptString) || jSONArrayOptJSONArray == null) {
                return;
            }
            String strM179022a = re2.m179022a(strOptString);
            int length = jSONArrayOptJSONArray.length();
            if (length <= 0) {
                return;
            }
            vsl vslVarM169154a = phw.m169153b().m169154a();
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString3 = jSONArrayOptJSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString3)) {
                    if (zhw.m218877j(strOptString3)) {
                        strOptString3 = zhw.m218868a(strOptString3);
                    }
                    File file = new File(strOptString3);
                    if (file.exists()) {
                        arrayList.add(file);
                    }
                }
            }
            try {
                String strMo87145c = vslVarM169154a.mo87145c(strM179022a, null, (File[]) arrayList.toArray(new File[length]), null, null);
                JSONObject jSONObject = new JSONObject(strMo87145c);
                int iOptInt = jSONObject.optInt("ec");
                if (iOptInt != 0 && iOptInt != 200) {
                    i = 1;
                }
                String strOptString4 = jSONObject.optString("em");
                vgx.this.m122324c(strOptString2, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message", "data"}, new String[]{i + "", strOptString4, strMo87145c}).toString());
            } catch (Exception e) {
                e.printStackTrace();
                vgx.this.m122324c(strOptString2, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{"1", e.getMessage()}).toString());
            }
        }
    }

    /* JADX INFO: renamed from: l.vgx$e */
    public class RunnableC20639e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181441a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bitmap f181442b;

        public RunnableC20639e(JSONObject jSONObject, Bitmap bitmap) {
            this.f181441a = jSONObject;
            this.f181442b = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Context contextM122322a = vgx.this.m122322a();
            if (contextM122322a == null) {
                return;
            }
            boolean z = this.f181441a.optInt("isLocal") == 1;
            String strOptString = this.f181441a.optString("callback");
            Bitmap bitmap = this.f181442b;
            if (bitmap == null || bitmap.isRecycled()) {
                vgx.this.m122324c(strOptString, vgx.m198400q(1, "截图失败", ""));
                return;
            }
            File fileM164476n = ohw.m164476n();
            if (fileM164476n == null) {
                vgx.this.m122324c(strOptString, vgx.m198400q(1, "存储截图失败", ""));
                return;
            }
            String str = System.currentTimeMillis() + ".jpg_";
            File file = new File(fileM164476n, str);
            String absolutePath = file.getAbsolutePath();
            if (vgx.m198406w(absolutePath, this.f181442b)) {
                if (z) {
                    FileUtil.m87154q(contextM122322a, file, str.substring(0, str.length() - 1));
                }
                vgx.this.m122324c(strOptString, vgx.m198400q(0, "成功", zhw.m218870c(absolutePath)));
            } else {
                vgx.this.m122324c(strOptString, vgx.m198400q(1, "存储截图失败", ""));
            }
            Bitmap bitmap2 = this.f181442b;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            this.f181442b.recycle();
            vgx.this.f98430a.setDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l.vgx$f */
    public class RunnableC20640f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181444a;

        public RunnableC20640f(JSONObject jSONObject) {
            this.f181444a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vgx.this.m122322a() == null) {
                return;
            }
            String strOptString = this.f181444a.optString("callback");
            String strOptString2 = this.f181444a.optString("data");
            String strOptString3 = this.f181444a.optString("suffix");
            if (TextUtils.isEmpty(strOptString2)) {
                vgx.this.m122325d(strOptString, "", "文件数据为空", "1");
                return;
            }
            File fileM164476n = ohw.m164476n();
            if (fileM164476n == null) {
                vgx.this.m122325d(strOptString, "", "保存文件失败", "1");
                return;
            }
            if (vgx.m198403t(strOptString3)) {
                strOptString3 = strOptString3 + "_";
            }
            if (!TextUtils.isEmpty(strOptString3) && !strOptString3.startsWith(".")) {
                strOptString3 = ".".concat(strOptString3);
            }
            File file = new File(fileM164476n, System.currentTimeMillis() + strOptString3);
            try {
                if (com.immomo.mmutil.FileUtil.m18413j(Base64.decode(strOptString2, 2), file)) {
                    vgx.this.m122325d(strOptString, liw.m149941b(new String[]{"path"}, new String[]{zhw.m218870c(file.getAbsolutePath())}).toString(), "成功", "0");
                    return;
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(fnl.f98429b, e);
            }
            vgx.this.m122325d(strOptString, "", "保存文件失败", "1");
        }
    }

    /* JADX INFO: renamed from: l.vgx$g */
    public class RunnableC20641g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181446a;

        public RunnableC20641g(JSONObject jSONObject) {
            this.f181446a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Context contextM122322a = vgx.this.m122322a();
            if (contextM122322a == null) {
                return;
            }
            String strOptString = this.f181446a.optString("callback");
            JSONObject jSONObjectOptJSONObject = this.f181446a.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            JSONObject jSONObject = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObjectOptJSONObject.optString(next);
                if (TextUtils.isEmpty(strOptString2)) {
                    vgx.this.m198404u(jSONObject, next, false);
                } else {
                    if (zhw.m218877j(strOptString2)) {
                        strOptString2 = zhw.m218868a(strOptString2);
                    }
                    File file = new File(strOptString2);
                    if (!file.exists() || file.length() <= 0) {
                        vgx.this.m198404u(jSONObject, next, false);
                    } else {
                        FileUtil.m87154q(contextM122322a, file, file.getName());
                        vgx.this.m198404u(jSONObject, next, true);
                    }
                }
            }
            vgx.this.m122324c(strOptString, jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: l.vgx$h */
    public class RunnableC20642h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181448a;

        public RunnableC20642h(JSONObject jSONObject) {
            this.f181448a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            vgx vgxVar = vgx.this;
            if (vgxVar.f98430a == null || vgxVar.m122322a() == null) {
                return;
            }
            String strOptString = this.f181448a.optString("url");
            String strOptString2 = this.f181448a.optString("callback");
            JSONObject jSONObjectOptJSONObject = this.f181448a.optJSONObject("files");
            if (TextUtils.isEmpty(strOptString) || jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                vgx.this.m122325d(strOptString2, null, "参数错误", "1");
                return;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            File[] fileArr = new File[jSONObjectOptJSONObject.length()];
            String[] strArr = new String[jSONObjectOptJSONObject.length()];
            int i = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString3 = jSONObjectOptJSONObject.optString(next, "");
                if (zhw.m218877j(strOptString3)) {
                    strOptString3 = zhw.m218868a(strOptString3);
                }
                File file = new File(strOptString3);
                if (!file.exists()) {
                    vgx.this.m122325d(strOptString2, null, "文件不存在", "1");
                    return;
                } else {
                    strArr[i] = next;
                    fileArr[i] = file;
                    i++;
                }
            }
            JSONObject jSONObjectOptJSONObject2 = this.f181448a.optJSONObject(CommandMessage.PARAMS);
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    map.put(next2, jSONObjectOptJSONObject2.optString(next2));
                }
            }
            if (map.get("uuid") != null) {
                map.put("uuid", UUID.randomUUID().toString());
            }
            try {
                vgx.this.m122326e(strOptString2, new JSONObject(phw.m169153b().m169154a().mo87145c(strOptString, map, fileArr, strArr, null)), "成功", 0);
            } catch (Exception e) {
                MDLog.printErrStackTrace(fnl.f98429b, e);
                vgx.this.m122326e(strOptString2, null, "失败", 1);
            }
        }
    }

    /* JADX INFO: renamed from: l.vgx$i */
    public class RunnableC20643i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f181450a;

        public RunnableC20643i(JSONObject jSONObject) {
            this.f181450a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            vgx vgxVar = vgx.this;
            if (vgxVar.f98430a == null || vgxVar.m122322a() == null) {
                return;
            }
            String strOptString = this.f181450a.optString("url");
            String strOptString2 = this.f181450a.optString("callback");
            JSONArray jSONArrayOptJSONArray = this.f181450a.optJSONArray("files");
            JSONObject jSONObjectOptJSONObject = this.f181450a.optJSONObject("param");
            String strOptString3 = this.f181450a.optString("fileName");
            if (TextUtils.isEmpty(strOptString) || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                vgx.this.m122325d(strOptString2, null, "参数错误", "1");
                return;
            }
            String strM179022a = re2.m179022a(strOptString);
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String strOptString4 = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString4)) {
                    if (zhw.m218877j(strOptString4)) {
                        strOptString4 = zhw.m218868a(strOptString4);
                    }
                    File file = new File(strOptString4);
                    if (file.exists() && file.length() > 0) {
                        arrayList.add(file);
                    }
                }
            }
            int size = arrayList.size();
            File[] fileArr = (File[]) arrayList.toArray(new File[size]);
            String[] strArr = new String[size];
            if (size == 1) {
                strArr[0] = strOptString3;
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = strOptString3 + i2;
                }
            }
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (objOpt != null) {
                        map.put(next, objOpt.toString());
                    }
                }
            }
            if (map.get("uuid") != null) {
                map.put("uuid", UUID.randomUUID().toString());
            }
            try {
                vgx.this.m122325d(strOptString2, phw.m169153b().m169154a().mo87145c(strM179022a, map, fileArr, strArr, null), "成功", "0");
            } catch (Exception e) {
                MDLog.printErrStackTrace(fnl.f98429b, e);
                vgx.this.m122325d(strOptString2, null, e.getMessage(), "1");
            }
        }
    }

    public vgx(MKWebView mKWebView) {
        super(mKWebView);
    }

    /* JADX INFO: renamed from: A */
    private void m198390A(JSONObject jSONObject) {
        C3804c.m18444d(2, new RunnableC20642h(jSONObject));
    }

    /* JADX INFO: renamed from: B */
    private void m198391B(JSONObject jSONObject) {
        C3804c.m18444d(2, new RunnableC20638d(jSONObject));
    }

    /* JADX INFO: renamed from: o */
    private static Bitmap m198398o(View view) {
        return m198399p(view, view.getWidth(), view.getHeight());
    }

    /* JADX INFO: renamed from: p */
    private static Bitmap m198399p(View view, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.draw(canvas);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m198400q(int i, String str, String str2) {
        return liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS, "message", "image"}, new String[]{i + "", str, str2}).toString();
    }

    /* JADX INFO: renamed from: r */
    private static Bitmap m198401r(View view) {
        view.setDrawingCacheEnabled(true);
        return view.getDrawingCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m198402s(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("cid");
        String strOptString2 = jSONObject.optString("url");
        String strOptString3 = jSONObject.optString("path");
        int iOptInt = jSONObject.optInt("compressWidth");
        int iOptInt2 = jSONObject.optInt("compressHeight");
        String strOptString4 = jSONObject.optString("callback");
        if (!b0g0.m99770c(strOptString2) || b0g0.m99770c(strOptString3) || iOptInt <= 0 || iOptInt2 <= 0) {
            qhw.m174602a().m174604c(strOptString2, new C20637c(strOptString, strOptString4));
            return;
        }
        try {
            if (zhw.m218877j(strOptString3)) {
                strOptString3 = zhw.m218868a(strOptString3);
            }
            Bitmap bitmapM212353a = y23.INSTANCE.m212353a(strOptString3, iOptInt, iOptInt2);
            if (bitmapM212353a == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cid", strOptString);
                jSONObject2.put("data", "");
                m122324c(strOptString4, jSONObject2.toString());
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapM212353a.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cid", strOptString);
            jSONObject3.put("data", strEncodeToString);
            m122324c(strOptString4, jSONObject3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static boolean m198403t(String str) {
        return "png".equalsIgnoreCase(str) || "jpg".equalsIgnoreCase(str) || "jpeg".equalsIgnoreCase(str) || "bmp".equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m198404u(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.putOpt(str, Integer.valueOf(!z ? 1 : 0));
        } catch (JSONException e) {
            MDLog.printErrStackTrace(fnl.f98429b, e);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m198405v(JSONObject jSONObject) {
        if (m122322a() == null) {
            return;
        }
        C3804c.m18444d(2, new RunnableC20640f(jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static boolean m198406w(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream2);
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                    return true;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                e.printStackTrace();
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m198407x(JSONObject jSONObject) {
        if (m122322a() == null) {
            return;
        }
        C3804c.m18444d(2, new RunnableC20641g(jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m198408y(JSONObject jSONObject) {
        if (m122322a() == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("type", 1);
        MKWebView mKWebView = this.f98430a;
        C3804c.m18444d(2, new RunnableC20639e(jSONObject, iOptInt != 0 ? m198401r(mKWebView) : m198398o((View) mKWebView.getParent().getParent())));
    }

    /* JADX INFO: renamed from: z */
    private void m198409z(JSONObject jSONObject) {
        C3804c.m18444d(2, new RunnableC20643i(jSONObject));
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        str2.getClass();
        switch (str2) {
            case "saveImagesToAlbum":
                m198407x(jSONObject);
                return true;
            case "uploadImages":
                m198391B(jSONObject);
                return true;
            case "getImageData":
                pv00.m171494b(new RunnableC20635a(jSONObject));
                return true;
            case "screenShot":
                MKWebView mKWebView = this.f98430a;
                if (mKWebView == null) {
                    return true;
                }
                mKWebView.post(new RunnableC20636b(jSONObject));
                return true;
            case "uploadFile":
                m198409z(jSONObject);
                return true;
            case "saveBase64File":
                m198405v(jSONObject);
                return true;
            case "uploadFiles":
                m198390A(jSONObject);
                return true;
            default:
                return false;
        }
    }
}
