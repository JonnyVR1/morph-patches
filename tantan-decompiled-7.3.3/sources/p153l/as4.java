package p153l;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.idv.identity.platform.config.Chameleon;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class as4 {

    /* JADX INFO: renamed from: z */
    private static final Map<String, List<String>> f73050z = new HashMap();

    /* JADX INFO: renamed from: a */
    private Handler f73051a;

    /* JADX INFO: renamed from: b */
    private ExecutorService f73052b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    private Camera f73053c;

    /* JADX INFO: renamed from: d */
    private List<String> f73054d;

    /* JADX INFO: renamed from: e */
    private String f73055e;

    /* JADX INFO: renamed from: f */
    private int f73056f;

    /* JADX INFO: renamed from: g */
    private String f73057g;

    /* JADX INFO: renamed from: h */
    Chameleon f73058h;

    /* JADX INFO: renamed from: i */
    private boolean f73059i;

    /* JADX INFO: renamed from: j */
    private long f73060j;

    /* JADX INFO: renamed from: k */
    private boolean f73061k;

    /* JADX INFO: renamed from: l */
    private boolean f73062l;

    /* JADX INFO: renamed from: m */
    private boolean f73063m;

    /* JADX INFO: renamed from: n */
    private float f73064n;

    /* JADX INFO: renamed from: o */
    private String f73065o;

    /* JADX INFO: renamed from: p */
    private String f73066p;

    /* JADX INFO: renamed from: q */
    private String f73067q;

    /* JADX INFO: renamed from: r */
    private int f73068r;

    /* JADX INFO: renamed from: s */
    private int f73069s;

    /* JADX INFO: renamed from: t */
    private boolean f73070t;

    /* JADX INFO: renamed from: u */
    public List<byte[]> f73071u;

    /* JADX INFO: renamed from: v */
    private List<String> f73072v;

    /* JADX INFO: renamed from: w */
    private List<String> f73073w;

    /* JADX INFO: renamed from: x */
    private JSONObject f73074x;

    /* JADX INFO: renamed from: y */
    private Runnable f73075y;

    /* JADX INFO: renamed from: l.as4$a */
    public class RunnableC15817a implements Runnable {
        public RunnableC15817a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            as4.this.f73061k = true;
            as4.this.f73062l = true;
            as4.m99866d(as4.this);
        }
    }

    /* JADX INFO: renamed from: l.as4$b */
    public class RunnableC15818b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f73077a;

        public RunnableC15818b(List list) {
            this.f73077a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (as4.this.f73059i) {
                if (as4.this.f73069s >= 1 && as4.this.f73069s <= this.f73077a.size() - 1 && as4.this.f73063m) {
                    as4.this.m99876u();
                } else if (as4.this.f73069s > this.f73077a.size() - 1) {
                    as4.this.f73059i = false;
                }
            }
        }
    }

    public as4() {
        Map<String, List<String>> map = f73050z;
        map.put("0", new ArrayList(Arrays.asList("auto")));
        map.put("1", new ArrayList(Arrays.asList("incandescent", "fluorescent", "warm-fluorescent")));
        map.put("2", new ArrayList(Arrays.asList("cloudy-daylight", "daylight", "twilight")));
        this.f73055e = "";
        this.f73056f = -1;
        this.f73057g = "";
        this.f73058h = afm.m97360H().m97475o();
        this.f73059i = false;
        this.f73060j = 400L;
        this.f73061k = false;
        this.f73062l = false;
        this.f73063m = false;
        this.f73064n = 0.6f;
        this.f73065o = "";
        this.f73066p = "";
        this.f73067q = "";
        this.f73068r = -1;
        this.f73069s = 0;
        this.f73071u = new ArrayList();
        this.f73072v = new ArrayList();
        this.f73073w = new ArrayList();
        this.f73075y = new RunnableC15817a();
        m99882r();
        Chameleon chameleon = this.f73058h;
        if (chameleon != null) {
            this.f73060j = chameleon.maxWaitTime.longValue();
        }
        this.f73051a = new Handler();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m99866d(as4 as4Var) {
        int i = as4Var.f73069s;
        as4Var.f73069s = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i */
    private byte[] m99871i(Bitmap bitmap, float f) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (f > 1.0f || f <= 0.0f) {
                if (f <= 0.0f) {
                    i = 70;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            f *= 100.0f;
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException e) {
            RecordService.getInstance().recordException(e);
        }
        i = (int) f;
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: n */
    private String m99872n() {
        if (TextUtils.isEmpty(this.f73055e) && this.f73053c != null) {
            JSONObject jSONObject = new JSONObject();
            Camera.Parameters parameters = this.f73053c.getParameters();
            if (parameters != null) {
                jSONObject.put("supportWhiteBalance", (Object) f8g0.m124535b(m99873o(), Constants.SEPARATOR_COMMA));
                jSONObject.put("horizontalViewAngle", (Object) Float.valueOf(parameters.getHorizontalViewAngle()));
                jSONObject.put("verticalViewAngle", (Object) Float.valueOf(parameters.getVerticalViewAngle()));
                jSONObject.put("supportedfocusModes", (Object) f8g0.m124535b(parameters.getSupportedFocusModes(), Constants.SEPARATOR_COMMA));
                jSONObject.put("focusMode", (Object) parameters.getFocusMode());
                Camera.Size previewSize = parameters.getPreviewSize();
                if (previewSize != null) {
                    jSONObject.put("previewWidth", (Object) Integer.valueOf(previewSize.width));
                    jSONObject.put("previewHeight", (Object) Integer.valueOf(previewSize.height));
                }
                jSONObject.put("jpegQuality", (Object) Integer.valueOf(parameters.getJpegQuality()));
                jSONObject.put("maxZoom", (Object) Integer.valueOf(parameters.getMaxZoom()));
            }
            this.f73055e = jSONObject.toJSONString();
        }
        return this.f73055e;
    }

    /* JADX INFO: renamed from: o */
    private List<String> m99873o() {
        Camera.Parameters parameters;
        List<String> list = this.f73054d;
        if (list != null) {
            return list;
        }
        Camera camera = this.f73053c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return new ArrayList();
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        this.f73054d = supportedWhiteBalance;
        return supportedWhiteBalance;
    }

    /* JADX INFO: renamed from: q */
    private void m99874q(HashMap<String, String> map, String str) {
        this.f73074x = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        m99884v(jSONArray, map, str);
        this.f73074x.put("chameleon", (Object) jSONArray);
        this.f73074x.put("deviceInfo", (Object) m99872n());
    }

    /* JADX INFO: renamed from: t */
    private void m99875t(HashMap<String, String> map, String str) {
        JSONObject jSONObject = this.f73074x;
        if (jSONObject == null) {
            m99874q(map, str);
        } else {
            m99884v(jSONObject.getJSONArray("chameleon"), map, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m99876u() {
        if (this.f73053c != null) {
            o6r0.m166282b("ChameleonHelper", "setWhiteBalance: cameraParams:");
            Camera.Parameters parameters = this.f73053c.getParameters();
            this.f73054d = m99873o();
            List<String> listM99881p = m99881p(this.f73058h.whiteBalance);
            this.f73063m = false;
            this.f73057g = parameters.getWhiteBalance();
            String str = listM99881p.get(this.f73069s);
            this.f73066p = str;
            parameters.setWhiteBalance(str);
            this.f73053c.setParameters(parameters);
            this.f73051a.postDelayed(this.f73075y, this.f73060j);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m99877j(int i) {
        Camera camera = this.f73053c;
        if (camera != null) {
            camera.getParameters();
            this.f73054d = m99873o();
        }
        Chameleon chameleon = this.f73058h;
        boolean z = false;
        if (chameleon == null) {
            return false;
        }
        List<String> listM99881p = m99881p(chameleon.whiteBalance);
        if (listM99881p != null && listM99881p.size() == this.f73058h.whiteBalance.size()) {
            m99876u();
            if (!this.f73059i) {
                this.f73059i = true;
            }
            this.f73052b.execute(new RunnableC15818b(listM99881p));
            z = true;
        }
        o6r0.m166282b("ChameleonHelper", "checkAndSetChameleon:" + z);
        return z;
    }

    /* JADX INFO: renamed from: k */
    public boolean m99878k(p94 p94Var) {
        Camera.Parameters parameters;
        o6r0.m166282b("ChameleonHelper", "checkChameleonFrame:" + this.f73062l);
        if (this.f73062l) {
            HashMap<String, String> map = new HashMap<>();
            if (this.f73053c != null) {
                map.put("whiteBalance", this.f73065o);
                map.put("zoom", this.f73067q);
            }
            OSSConfig oSSConfigM97443d0 = afm.m97360H().m97443d0();
            if (oSSConfigM97443d0 == null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "Chameleon", "errMsg", "ossConfig is null");
                return false;
            }
            String strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "chameleon", "jpeg");
            this.f73072v.add("/" + oSSConfigM97443d0.BucketName + "/" + strM96785d);
            this.f73073w.add(strM96785d);
            m99875t(map, "");
            try {
                Bitmap bitmapM109120d = cd4.m109120d(p94Var);
                if (bitmapM109120d != null) {
                    byte[] bArrM99871i = m99871i(bitmapM109120d, this.f73064n);
                    bitmapM109120d.recycle();
                    this.f73071u.add(bArrM99871i);
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "Chameleon", "errMsg", "bitmap is null");
                    this.f73071u.add(null);
                }
            } catch (Throwable th) {
                RecordService.getInstance().recordException(th);
            }
            this.f73063m = true;
            this.f73062l = false;
            Camera camera = this.f73053c;
            if (camera != null && (parameters = camera.getParameters()) != null) {
                parameters.setWhiteBalance(this.f73057g);
                int i = this.f73056f;
                if (i != -1) {
                    parameters.setZoom(i);
                }
                this.f73053c.setParameters(parameters);
            }
            if (this.f73069s > this.f73058h.whiteBalance.size() - 1) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "checkChameleonFrame", "chameleonOSSFileNames", this.f73073w.toString(), "chameleonVerifyFileNames", this.f73072v.toString(), "chameleonFrameList", this.f73071u.size() + "");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public List<byte[]> m99879l() {
        return this.f73071u;
    }

    /* JADX INFO: renamed from: m */
    public List<String> m99880m() {
        return this.f73073w;
    }

    /* JADX INFO: renamed from: p */
    public List<String> m99881p(List<Integer> list) {
        String next;
        StringBuilder sb = new StringBuilder();
        List<String> listM99873o = m99873o();
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                List<String> list2 = f73050z.get(String.valueOf(iIntValue));
                if (list2 != null) {
                    Iterator<String> it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!listM99873o.contains(next));
                    if (next != null) {
                        arrayList.add(next);
                    } else {
                        sb.append("No supported white balance for code: ");
                        sb.append(iIntValue);
                    }
                }
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "Chameleon", "chameleons", list.toString(), "SupportedWhiteBalance", listM99873o.toString(), "deviceInfo", m99872n(), "errMsg", sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public void m99882r() {
        this.f73061k = false;
        this.f73070t = false;
        this.f73074x = null;
        this.f73062l = false;
        this.f73063m = false;
        this.f73069s = 0;
        Handler handler = this.f73051a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this.f73075y);
        }
        this.f73071u.clear();
        this.f73072v.clear();
        this.f73073w.clear();
        this.f73051a = null;
    }

    /* JADX INFO: renamed from: s */
    public void m99883s(Camera camera) {
        this.f73053c = camera;
    }

    /* JADX INFO: renamed from: v */
    public void m99884v(JSONArray jSONArray, HashMap<String, String> map, String str) {
        JSONObject jSONObject = map != null ? (JSONObject) JSON.toJSON(map) : new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("errCode", (Object) str);
        }
        jSONArray.add(jSONObject);
        if (this.f73074x == null) {
            this.f73074x = new JSONObject();
        }
        this.f73074x.put("chameleon", (Object) jSONArray);
    }
}
