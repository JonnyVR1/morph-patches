package com.idv.identity.face.photinus;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.dc4;
import p149l.ig3;
import p149l.ixq0;
import p149l.j4j;
import p149l.j6f;
import p149l.kcm;
import p149l.pcr;
import p149l.su60;
import p149l.tu60;
import p149l.uu60;
import p149l.wgq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class PhotinusEmulator implements VideoWriter.InterfaceC3542c {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<byte[]> f12060a;

    /* JADX INFO: renamed from: d */
    private int f12063d;

    /* JADX INFO: renamed from: e */
    private int f12064e;

    /* JADX INFO: renamed from: f */
    private int f12065f;

    /* JADX INFO: renamed from: g */
    private int f12066g;

    /* JADX INFO: renamed from: h */
    private int f12067h;

    /* JADX INFO: renamed from: i */
    private int f12068i;

    /* JADX INFO: renamed from: j */
    private boolean f12069j;

    /* JADX INFO: renamed from: m */
    private int[] f12072m;

    /* JADX INFO: renamed from: n */
    private int[] f12073n;

    /* JADX INFO: renamed from: o */
    private int f12074o;

    /* JADX INFO: renamed from: p */
    private int f12075p;

    /* JADX INFO: renamed from: r */
    private long f12077r;

    /* JADX INFO: renamed from: s */
    private Uri f12078s;

    /* JADX INFO: renamed from: t */
    private Uri f12079t;

    /* JADX INFO: renamed from: u */
    private su60 f12080u;

    /* JADX INFO: renamed from: y */
    private VideoWriter f12084y;

    /* JADX INFO: renamed from: z */
    private pcr f12085z;

    /* JADX INFO: renamed from: b */
    private final String[] f12061b = {j6f.TAG_APERTURE_VALUE, j6f.TAG_CONTRAST, j6f.TAG_CUSTOM_RENDERED, j6f.TAG_DEFAULT_CROP_SIZE, j6f.TAG_DEVICE_SETTING_DESCRIPTION, j6f.TAG_DIGITAL_ZOOM_RATIO, j6f.TAG_DATETIME, j6f.TAG_EXIF_VERSION, j6f.TAG_EXPOSURE_BIAS_VALUE, j6f.TAG_EXPOSURE_INDEX, j6f.TAG_EXPOSURE_MODE, j6f.TAG_EXPOSURE_PROGRAM, j6f.TAG_FOCAL_LENGTH, j6f.TAG_FOCAL_LENGTH_IN_35MM_FILM, j6f.TAG_FOCAL_PLANE_RESOLUTION_UNIT, j6f.TAG_FOCAL_PLANE_X_RESOLUTION, j6f.TAG_FOCAL_PLANE_Y_RESOLUTION, j6f.TAG_GAIN_CONTROL, j6f.TAG_MAKE, j6f.TAG_METERING_MODE, j6f.TAG_REFERENCE_BLACK_WHITE, j6f.TAG_SATURATION, j6f.TAG_SHUTTER_SPEED_VALUE, j6f.TAG_SPECTRAL_SENSITIVITY, j6f.TAG_WHITE_BALANCE, j6f.TAG_WHITE_POINT, j6f.TAG_BRIGHTNESS_VALUE, j6f.TAG_EXPOSURE_TIME, j6f.TAG_F_NUMBER, j6f.TAG_ISO_SPEED_RATINGS};

    /* JADX INFO: renamed from: c */
    private final Object f12062c = new Object();

    /* JADX INFO: renamed from: k */
    private float f12070k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f12071l = 0.0f;

    /* JADX INFO: renamed from: q */
    private State f12076q = State.INVALID;

    /* JADX INFO: renamed from: v */
    private ArrayList<j4j> f12081v = new ArrayList<>();

    /* JADX INFO: renamed from: w */
    private j4j f12082w = new j4j();

    /* JADX INFO: renamed from: x */
    private HashMap<String, String> f12083x = new HashMap<>();

    /* JADX INFO: renamed from: A */
    private AtomicBoolean f12055A = new AtomicBoolean(false);

    /* JADX INFO: renamed from: B */
    private int f12056B = 0;

    /* JADX INFO: renamed from: C */
    private final int f12057C = 5;

    /* JADX INFO: renamed from: D */
    private final Handler f12058D = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: E */
    private final Runnable f12059E = new RunnableC3539a();

    public enum State {
        INVALID(false, true),
        READY(false, false),
        AWAITING_FRAMES(false, false),
        AWAITING_COMPLETION(false, false),
        IN_COMPLETION(true, false),
        AT_FAULT(false, true),
        COMPLETED(true, true);

        public final boolean isComplete;
        public final boolean isTerminalState;

        State(boolean z, boolean z2) {
            this.isComplete = z;
            this.isTerminalState = z2;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.PhotinusEmulator$a */
    public class RunnableC3539a implements Runnable {
        public RunnableC3539a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (PhotinusEmulator.this.f12062c) {
                try {
                    if (PhotinusEmulator.this.f12076q == State.COMPLETED) {
                        return;
                    }
                    PhotinusEmulator.this.f12076q = State.AT_FAULT;
                    if (PhotinusEmulator.this.f12080u == null || !PhotinusEmulator.this.f12055A.compareAndSet(false, true)) {
                        return;
                    }
                    PhotinusEmulator.this.f12080u.mo182295b("Timeout");
                    PhotinusEmulator.this.f12080u.mo182294a(null, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m17535A(String str, int i, int i2, int i3) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            wgq0.m203079c(dc4.m110666a(this.f12060a), file, i, i2, i3);
            return true;
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m17541h(List<Map<String, Object>> list, String str, int i) {
        HashMap map = new HashMap();
        map.put("photinusColorRgb", str);
        map.put("photinusColorCnt", Integer.valueOf(i));
        list.add(map);
    }

    /* JADX INFO: renamed from: k */
    private List<Integer> m17542k() {
        ArrayList arrayList = new ArrayList();
        String strM145593x = kcm.m145452H().m145593x();
        ixq0.m138885b("DTF", "deleteDirectory: extProtocol " + strM145593x);
        Map map = (Map) JSON.parseObject(strM145593x, Map.class);
        List<Map<String, Object>> arrayList2 = new ArrayList<>();
        if (map != null && map.containsKey("photinusColorConfig")) {
            Object obj = map.get("photinusColorConfig");
            if (obj instanceof List) {
                arrayList2 = (List) obj;
            }
        }
        if (arrayList2.isEmpty()) {
            m17541h(arrayList2, "{0,0,255}", 6);
            m17541h(arrayList2, "{255,0,0}", 8);
            m17541h(arrayList2, "{0,255,0}", 9);
            m17541h(arrayList2, "{255,255,0}", 7);
        }
        for (Map<String, Object> map2 : arrayList2) {
            String str = (String) map2.get("photinusColorRgb");
            Integer num = (Integer) map2.get("photinusColorCnt");
            if (str != null && num != null) {
                for (int i = 0; i < num.intValue(); i++) {
                    arrayList.add(m17555m(str));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private String m17543n(int i) {
        Locale locale = Locale.US;
        return new SimpleDateFormat("yy.M.dd.HH.mm.ss.SSS", locale).format(new Date()) + String.format(locale, "_n%d_k%d_d%d_p%d_i%d", 5, 2, 3, 3, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: q */
    private Uri m17544q(Context context) {
        return Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "Phontinus");
    }

    /* JADX INFO: renamed from: s */
    private void m17545s(String str) {
        try {
            JSONObject object = JSON.parseObject(str);
            if (object != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorConfig", "SENSOR_INFO", object.getString("SENSOR_INFO"), "MAX_RANGE", object.getString("MAX_RANGE"), "SENSOR_ACCURACY", object.getString("SENSOR_ACCURACY"));
            }
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
        }
    }

    /* JADX INFO: renamed from: t */
    private HashMap<String, Object> m17546t(j4j j4jVar, j4j j4jVar2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("light-sensor", Float.valueOf(j4jVar.f116194a));
        map.put("horizontal-view-angle", Float.valueOf(j4jVar2.f116196c));
        map.put("vertical-view-angle", Float.valueOf(j4jVar2.f116197d));
        map.put("brightness-value", j4jVar2.f116201h);
        map.put("f-number", j4jVar2.f116200g);
        map.put("iso-speed", j4jVar2.f116199f);
        map.put("exposure-time", j4jVar2.f116198e);
        map.put("accuracy", Integer.valueOf(j4jVar.f116195b));
        return map;
    }

    /* JADX INFO: renamed from: u */
    private boolean m17547u() {
        return this.f12075p - this.f12073n.length >= 0;
    }

    /* JADX INFO: renamed from: x */
    private void m17548x(Uri uri, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uri.getPath());
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            su60 su60Var = this.f12080u;
            if (su60Var != null) {
                su60Var.onException(e);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m17549y() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f12077r;
        HashMap map = new HashMap();
        map.put("sdk-version", "1.1.1");
        map.put("rotate-angle", Integer.valueOf(this.f12065f));
        map.put("data-source", "idv-production-android-2");
        map.put("device-name", Build.MODEL);
        map.put("total-time-ms", Long.valueOf(jCurrentTimeMillis));
        map.put("sequence-index", Integer.valueOf(this.f12066g));
        map.put("sequence-length", 5);
        map.put("sequence-periods", 3);
        map.put("sequence-repeat", Integer.valueOf(this.f12067h));
        map.put("sequence-margin", Integer.valueOf(this.f12068i));
        map.put("sequence-extra", 0);
        map.put("color-magnitude", Float.valueOf(this.f12070k));
        map.put("color-offset", Float.valueOf(this.f12071l));
        map.put("video-width", Integer.valueOf(this.f12064e));
        map.put("video-height", Integer.valueOf(this.f12063d));
        if (this.f12069j) {
            map.put("smooth-transition-length", 3);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<j4j> it = this.f12081v.iterator();
        while (it.hasNext()) {
            arrayList.add(m17546t(it.next(), this.f12082w));
        }
        map.put("frame-metadata", arrayList);
        map.put("extra-exif", this.f12083x);
        String strM168368d = this.f12085z.m168368d();
        if (!TextUtils.isEmpty(strM168368d)) {
            m17545s(strM168368d);
        }
        map.put("light-sensor-config", strM168368d);
        m17548x(this.f12079t, JSON.toJSONString(map).getBytes());
    }

    @Override // com.idv.identity.face.photinus.VideoWriter.InterfaceC3542c
    /* JADX INFO: renamed from: a */
    public void mo17550a(VideoWriter videoWriter) {
        synchronized (this.f12062c) {
            try {
                if (videoWriter == this.f12084y || this.f12076q == State.IN_COMPLETION) {
                    this.f12058D.removeCallbacks(this.f12059E);
                    m17549y();
                    this.f12076q = State.COMPLETED;
                    if (this.f12080u == null || !this.f12055A.compareAndSet(false, true)) {
                        return;
                    }
                    this.f12080u.mo182294a(this.f12078s, this.f12079t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17551b() {
        synchronized (this.f12062c) {
            try {
                VideoWriter videoWriter = this.f12084y;
                if (videoWriter != null) {
                    videoWriter.m17599v();
                    VideoWriter videoWriter2 = new VideoWriter(this);
                    this.f12084y = videoWriter2;
                    videoWriter2.m17597C(this.f12078s, this.f12063d, this.f12064e, this.f12065f);
                }
                this.f12076q = State.INVALID;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[PHI: r5
      0x0078: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v4 java.lang.Integer) binds: [B:11:0x001b, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: i */
    public void m17552i(tu60 tu60Var) {
        Integer numValueOf;
        int i;
        boolean z = true;
        if (!this.f12085z.m168369e() && (i = this.f12056B) < 5) {
            this.f12056B = i + 1;
            return;
        }
        synchronized (this.f12062c) {
            try {
                numValueOf = null;
                if (this.f12076q != State.AWAITING_FRAMES) {
                    z = false;
                } else {
                    if (this.f12075p >= 0) {
                        tu60Var.f172151c.f116194a = this.f12085z.m168366b();
                        tu60Var.f172151c.f116195b = this.f12085z.m168367c();
                        this.f12084y.m17598u(tu60Var);
                        this.f12081v.add(tu60Var.f172151c);
                        if (this.f12060a == null) {
                            this.f12060a = new CopyOnWriteArrayList<>();
                        }
                        this.f12060a.add(tu60Var.f120844a);
                    }
                    int i2 = this.f12074o;
                    int[] iArr = this.f12073n;
                    numValueOf = i2 < iArr.length ? Integer.valueOf(iArr[i2]) : null;
                    this.f12075p++;
                    this.f12074o++;
                    if (m17547u()) {
                        this.f12076q = State.AWAITING_COMPLETION;
                    } else {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        su60 su60Var = this.f12080u;
        if (su60Var != null) {
            if (numValueOf != null) {
                su60Var.mo182296c(numValueOf.intValue());
            }
            if (z) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusAbandonFrames", "abandonFramesCount", String.valueOf(this.f12056B), "abandonFramesMax", String.valueOf(5));
                this.f12080u.mo182298e();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17553j() {
        CopyOnWriteArrayList<byte[]> copyOnWriteArrayList = this.f12060a;
        if (copyOnWriteArrayList == null) {
            this.f12060a = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList.clear();
        }
        synchronized (this.f12062c) {
            try {
                if (this.f12076q != State.READY) {
                    return;
                }
                this.f12074o = 0;
                this.f12075p = -3;
                this.f12081v.clear();
                this.f12076q = State.AWAITING_FRAMES;
                this.f12077r = System.currentTimeMillis();
                su60 su60Var = this.f12080u;
                if (su60Var != null) {
                    su60Var.mo182299f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m17554l() {
        boolean zM17596B = this.f12084y.m17596B();
        synchronized (this.f12062c) {
            try {
                if (this.f12076q == State.AWAITING_COMPLETION) {
                    this.f12076q = State.IN_COMPLETION;
                    if (zM17596B) {
                        this.f12084y.m17599v();
                        this.f12058D.postDelayed(this.f12059E, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM17596B || this.f12080u == null || !this.f12055A.compareAndSet(false, true)) {
            return;
        }
        this.f12080u.mo182295b("AtFault");
        this.f12080u.mo182294a(null, null);
    }

    /* JADX INFO: renamed from: m */
    public Integer m17555m(String str) {
        String[] strArrSplit = str.replace("{", "").replace("}", "").split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length != 3) {
            ig3.m135964a("Invalid RGB format");
            return null;
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            int i3 = Integer.parseInt(strArrSplit[2]);
            if (i < 0 || i > 255 || i2 < 0 || i2 > 255 || i3 < 0 || i3 > 255) {
                throw new IllegalArgumentException("RGB values must be in the range 0-255");
            }
            return Integer.valueOf(i3 | (i << 16) | RoundedDrawable.DEFAULT_BORDER_COLOR | (i2 << 8));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid RGB values", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m17556o(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m17556o(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    @Override // com.idv.identity.face.photinus.VideoWriter.InterfaceC3542c
    public void onException(Throwable th) {
        su60 su60Var = this.f12080u;
        if (su60Var != null) {
            su60Var.onException(th);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m17557p() {
        synchronized (this.f12062c) {
            try {
                pcr pcrVar = this.f12085z;
                if (pcrVar != null) {
                    pcrVar.m168365a();
                }
                VideoWriter videoWriter = this.f12084y;
                if (videoWriter != null) {
                    videoWriter.m17599v();
                    this.f12084y = null;
                }
                CopyOnWriteArrayList<byte[]> copyOnWriteArrayList = this.f12060a;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                uu60.m195326a().m195327b();
                this.f12076q = State.INVALID;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m17558r(Context context, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        synchronized (this.f12062c) {
            try {
                boolean z2 = false;
                if (!this.f12076q.isTerminalState) {
                    return false;
                }
                uu60.m195326a();
                Uri uriM17544q = m17544q(context);
                File file = new File(uriM17544q.getPath());
                if ((!file.exists() || m17556o(file)) && !file.mkdir()) {
                    z2 = true;
                }
                this.f12067h = i6;
                this.f12068i = i5;
                this.f12063d = i;
                this.f12064e = i2;
                this.f12065f = i3;
                this.f12066g = i4;
                this.f12069j = z;
                List<Integer> listM17542k = m17542k();
                ixq0.m138885b("DTF", "initialize: integers.size " + listM17542k.size());
                this.f12072m = C3544a.m17600a(listM17542k);
                int[] iArrM17600a = C3544a.m17600a(C3544a.m17602c(listM17542k, this.f12068i));
                this.f12072m = iArrM17600a;
                this.f12073n = iArrM17600a;
                ixq0.m138885b("DTF", "initialize: _colorSequence.length " + this.f12073n.length);
                String strM17543n = m17543n(this.f12066g);
                this.f12078s = Uri.withAppendedPath(uriM17544q, strM17543n + ".mp4");
                this.f12079t = Uri.withAppendedPath(uriM17544q, strM17543n + ".json");
                VideoWriter videoWriter = new VideoWriter(this);
                this.f12084y = videoWriter;
                if (!z2) {
                    videoWriter.m17597C(this.f12078s, this.f12063d, this.f12064e, this.f12065f);
                }
                this.f12085z = new pcr(context);
                this.f12082w = new j4j();
                this.f12083x = new HashMap<>();
                this.f12076q = State.READY;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m17559v(su60 su60Var) {
        this.f12080u = su60Var;
    }

    /* JADX INFO: renamed from: w */
    public void m17560w() {
        m17554l();
        su60 su60Var = this.f12080u;
        if (su60Var != null) {
            su60Var.mo182297d("NoPhotoTake");
        }
    }

    /* JADX INFO: renamed from: z */
    public String m17561z(String str, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(".mp4", ".zip");
        }
        return m17535A(str, i, i2, i3) ? str : "";
    }
}
