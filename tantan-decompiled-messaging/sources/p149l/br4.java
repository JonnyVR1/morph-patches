package p149l;

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
public class br4 {

    /* JADX INFO: renamed from: z */
    private static final Map<String, List<String>> f76832z = new HashMap();

    /* JADX INFO: renamed from: a */
    private Handler f76833a;

    /* JADX INFO: renamed from: b */
    private ExecutorService f76834b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    private Camera f76835c;

    /* JADX INFO: renamed from: d */
    private List<String> f76836d;

    /* JADX INFO: renamed from: e */
    private String f76837e;

    /* JADX INFO: renamed from: f */
    private int f76838f;

    /* JADX INFO: renamed from: g */
    private String f76839g;

    /* JADX INFO: renamed from: h */
    Chameleon f76840h;

    /* JADX INFO: renamed from: i */
    private boolean f76841i;

    /* JADX INFO: renamed from: j */
    private long f76842j;

    /* JADX INFO: renamed from: k */
    private boolean f76843k;

    /* JADX INFO: renamed from: l */
    private boolean f76844l;

    /* JADX INFO: renamed from: m */
    private boolean f76845m;

    /* JADX INFO: renamed from: n */
    private float f76846n;

    /* JADX INFO: renamed from: o */
    private String f76847o;

    /* JADX INFO: renamed from: p */
    private String f76848p;

    /* JADX INFO: renamed from: q */
    private String f76849q;

    /* JADX INFO: renamed from: r */
    private int f76850r;

    /* JADX INFO: renamed from: s */
    private int f76851s;

    /* JADX INFO: renamed from: t */
    private boolean f76852t;

    /* JADX INFO: renamed from: u */
    public List<byte[]> f76853u;

    /* JADX INFO: renamed from: v */
    private List<String> f76854v;

    /* JADX INFO: renamed from: w */
    private List<String> f76855w;

    /* JADX INFO: renamed from: x */
    private JSONObject f76856x;

    /* JADX INFO: renamed from: y */
    private Runnable f76857y;

    /* JADX INFO: renamed from: l.br4$a */
    public class RunnableC15946a implements Runnable {
        public RunnableC15946a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            br4.this.f76843k = true;
            br4.this.f76844l = true;
            br4.m103454d(br4.this);
        }
    }

    /* JADX INFO: renamed from: l.br4$b */
    public class RunnableC15947b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f76859a;

        public RunnableC15947b(List list) {
            this.f76859a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (br4.this.f76841i) {
                if (br4.this.f76851s >= 1 && br4.this.f76851s <= this.f76859a.size() - 1 && br4.this.f76845m) {
                    br4.this.m103464u();
                } else if (br4.this.f76851s > this.f76859a.size() - 1) {
                    br4.this.f76841i = false;
                }
            }
        }
    }

    public br4() {
        Map<String, List<String>> map = f76832z;
        map.put("0", new ArrayList(Arrays.asList("auto")));
        map.put("1", new ArrayList(Arrays.asList("incandescent", "fluorescent", "warm-fluorescent")));
        map.put("2", new ArrayList(Arrays.asList("cloudy-daylight", "daylight", "twilight")));
        this.f76837e = "";
        this.f76838f = -1;
        this.f76839g = "";
        this.f76840h = kcm.m145452H().m145567o();
        this.f76841i = false;
        this.f76842j = 400L;
        this.f76843k = false;
        this.f76844l = false;
        this.f76845m = false;
        this.f76846n = 0.6f;
        this.f76847o = "";
        this.f76848p = "";
        this.f76849q = "";
        this.f76850r = -1;
        this.f76851s = 0;
        this.f76853u = new ArrayList();
        this.f76854v = new ArrayList();
        this.f76855w = new ArrayList();
        this.f76857y = new RunnableC15946a();
        m103470r();
        Chameleon chameleon = this.f76840h;
        if (chameleon != null) {
            this.f76842j = chameleon.maxWaitTime.longValue();
        }
        this.f76833a = new Handler();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m103454d(br4 br4Var) {
        int i = br4Var.f76851s;
        br4Var.f76851s = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i */
    private byte[] m103459i(Bitmap bitmap, float f) {
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
    private String m103460n() {
        if (TextUtils.isEmpty(this.f76837e) && this.f76835c != null) {
            JSONObject jSONObject = new JSONObject();
            Camera.Parameters parameters = this.f76835c.getParameters();
            if (parameters != null) {
                jSONObject.put("supportWhiteBalance", (Object) yzf0.m216681b(m103461o(), Constants.SEPARATOR_COMMA));
                jSONObject.put("horizontalViewAngle", (Object) Float.valueOf(parameters.getHorizontalViewAngle()));
                jSONObject.put("verticalViewAngle", (Object) Float.valueOf(parameters.getVerticalViewAngle()));
                jSONObject.put("supportedfocusModes", (Object) yzf0.m216681b(parameters.getSupportedFocusModes(), Constants.SEPARATOR_COMMA));
                jSONObject.put("focusMode", (Object) parameters.getFocusMode());
                Camera.Size previewSize = parameters.getPreviewSize();
                if (previewSize != null) {
                    jSONObject.put("previewWidth", (Object) Integer.valueOf(previewSize.width));
                    jSONObject.put("previewHeight", (Object) Integer.valueOf(previewSize.height));
                }
                jSONObject.put("jpegQuality", (Object) Integer.valueOf(parameters.getJpegQuality()));
                jSONObject.put("maxZoom", (Object) Integer.valueOf(parameters.getMaxZoom()));
            }
            this.f76837e = jSONObject.toJSONString();
        }
        return this.f76837e;
    }

    /* JADX INFO: renamed from: o */
    private List<String> m103461o() {
        Camera.Parameters parameters;
        List<String> list = this.f76836d;
        if (list != null) {
            return list;
        }
        Camera camera = this.f76835c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return new ArrayList();
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        this.f76836d = supportedWhiteBalance;
        return supportedWhiteBalance;
    }

    /* JADX INFO: renamed from: q */
    private void m103462q(HashMap<String, String> map, String str) {
        this.f76856x = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        m103472v(jSONArray, map, str);
        this.f76856x.put("chameleon", (Object) jSONArray);
        this.f76856x.put("deviceInfo", (Object) m103460n());
    }

    /* JADX INFO: renamed from: t */
    private void m103463t(HashMap<String, String> map, String str) {
        JSONObject jSONObject = this.f76856x;
        if (jSONObject == null) {
            m103462q(map, str);
        } else {
            m103472v(jSONObject.getJSONArray("chameleon"), map, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m103464u() {
        if (this.f76835c != null) {
            ixq0.m138885b("ChameleonHelper", "setWhiteBalance: cameraParams:");
            Camera.Parameters parameters = this.f76835c.getParameters();
            this.f76836d = m103461o();
            List<String> listM103469p = m103469p(this.f76840h.whiteBalance);
            this.f76845m = false;
            this.f76839g = parameters.getWhiteBalance();
            String str = listM103469p.get(this.f76851s);
            this.f76848p = str;
            parameters.setWhiteBalance(str);
            this.f76835c.setParameters(parameters);
            this.f76833a.postDelayed(this.f76857y, this.f76842j);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m103465j(int i) {
        Camera camera = this.f76835c;
        if (camera != null) {
            camera.getParameters();
            this.f76836d = m103461o();
        }
        Chameleon chameleon = this.f76840h;
        boolean z = false;
        if (chameleon == null) {
            return false;
        }
        List<String> listM103469p = m103469p(chameleon.whiteBalance);
        if (listM103469p != null && listM103469p.size() == this.f76840h.whiteBalance.size()) {
            m103464u();
            if (!this.f76841i) {
                this.f76841i = true;
            }
            this.f76834b.execute(new RunnableC15947b(listM103469p));
            z = true;
        }
        ixq0.m138885b("ChameleonHelper", "checkAndSetChameleon:" + z);
        return z;
    }

    /* JADX INFO: renamed from: k */
    public boolean m103466k(q84 q84Var) {
        Camera.Parameters parameters;
        ixq0.m138885b("ChameleonHelper", "checkChameleonFrame:" + this.f76844l);
        if (this.f76844l) {
            HashMap<String, String> map = new HashMap<>();
            if (this.f76835c != null) {
                map.put("whiteBalance", this.f76847o);
                map.put("zoom", this.f76849q);
            }
            OSSConfig oSSConfigM145535d0 = kcm.m145452H().m145535d0();
            if (oSSConfigM145535d0 == null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "Chameleon", "errMsg", "ossConfig is null");
                return false;
            }
            String strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "chameleon", "jpeg");
            this.f76854v.add("/" + oSSConfigM145535d0.BucketName + "/" + strM109840d);
            this.f76855w.add(strM109840d);
            m103463t(map, "");
            try {
                Bitmap bitmapM110669d = dc4.m110669d(q84Var);
                if (bitmapM110669d != null) {
                    byte[] bArrM103459i = m103459i(bitmapM110669d, this.f76846n);
                    bitmapM110669d.recycle();
                    this.f76853u.add(bArrM103459i);
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "Chameleon", "errMsg", "bitmap is null");
                    this.f76853u.add(null);
                }
            } catch (Throwable th) {
                RecordService.getInstance().recordException(th);
            }
            this.f76845m = true;
            this.f76844l = false;
            Camera camera = this.f76835c;
            if (camera != null && (parameters = camera.getParameters()) != null) {
                parameters.setWhiteBalance(this.f76839g);
                int i = this.f76838f;
                if (i != -1) {
                    parameters.setZoom(i);
                }
                this.f76835c.setParameters(parameters);
            }
            if (this.f76851s > this.f76840h.whiteBalance.size() - 1) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "checkChameleonFrame", "chameleonOSSFileNames", this.f76855w.toString(), "chameleonVerifyFileNames", this.f76854v.toString(), "chameleonFrameList", this.f76853u.size() + "");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public List<byte[]> m103467l() {
        return this.f76853u;
    }

    /* JADX INFO: renamed from: m */
    public List<String> m103468m() {
        return this.f76855w;
    }

    /* JADX INFO: renamed from: p */
    public List<String> m103469p(List<Integer> list) {
        String next;
        StringBuilder sb = new StringBuilder();
        List<String> listM103461o = m103461o();
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                List<String> list2 = f76832z.get(String.valueOf(iIntValue));
                if (list2 != null) {
                    Iterator<String> it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!listM103461o.contains(next));
                    if (next != null) {
                        arrayList.add(next);
                    } else {
                        sb.append("No supported white balance for code: ");
                        sb.append(iIntValue);
                    }
                }
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "Chameleon", "chameleons", list.toString(), "SupportedWhiteBalance", listM103461o.toString(), "deviceInfo", m103460n(), "errMsg", sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public void m103470r() {
        this.f76843k = false;
        this.f76852t = false;
        this.f76856x = null;
        this.f76844l = false;
        this.f76845m = false;
        this.f76851s = 0;
        Handler handler = this.f76833a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this.f76857y);
        }
        this.f76853u.clear();
        this.f76854v.clear();
        this.f76855w.clear();
        this.f76833a = null;
    }

    /* JADX INFO: renamed from: s */
    public void m103471s(Camera camera) {
        this.f76835c = camera;
    }

    /* JADX INFO: renamed from: v */
    public void m103472v(JSONArray jSONArray, HashMap<String, String> map, String str) {
        JSONObject jSONObject = map != null ? (JSONObject) JSON.toJSON(map) : new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("errCode", (Object) str);
        }
        jSONArray.add(jSONObject);
        if (this.f76856x == null) {
            this.f76856x = new JSONObject();
        }
        this.f76856x.put("chameleon", (Object) jSONArray);
    }
}
