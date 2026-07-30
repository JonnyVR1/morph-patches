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
import p153l.a370;
import p153l.afm;
import p153l.bqq0;
import p153l.cd4;
import p153l.e7j;
import p153l.o6r0;
import p153l.p7f;
import p153l.qer;
import p153l.wg3;
import p153l.y270;
import p153l.z270;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class PhotinusEmulator implements VideoWriter.InterfaceC3701c {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<byte[]> f12801a;

    /* JADX INFO: renamed from: d */
    private int f12804d;

    /* JADX INFO: renamed from: e */
    private int f12805e;

    /* JADX INFO: renamed from: f */
    private int f12806f;

    /* JADX INFO: renamed from: g */
    private int f12807g;

    /* JADX INFO: renamed from: h */
    private int f12808h;

    /* JADX INFO: renamed from: i */
    private int f12809i;

    /* JADX INFO: renamed from: j */
    private boolean f12810j;

    /* JADX INFO: renamed from: m */
    private int[] f12813m;

    /* JADX INFO: renamed from: n */
    private int[] f12814n;

    /* JADX INFO: renamed from: o */
    private int f12815o;

    /* JADX INFO: renamed from: p */
    private int f12816p;

    /* JADX INFO: renamed from: r */
    private long f12818r;

    /* JADX INFO: renamed from: s */
    private Uri f12819s;

    /* JADX INFO: renamed from: t */
    private Uri f12820t;

    /* JADX INFO: renamed from: u */
    private y270 f12821u;

    /* JADX INFO: renamed from: y */
    private VideoWriter f12825y;

    /* JADX INFO: renamed from: z */
    private qer f12826z;

    /* JADX INFO: renamed from: b */
    private final String[] f12802b = {p7f.TAG_APERTURE_VALUE, p7f.TAG_CONTRAST, p7f.TAG_CUSTOM_RENDERED, p7f.TAG_DEFAULT_CROP_SIZE, p7f.TAG_DEVICE_SETTING_DESCRIPTION, p7f.TAG_DIGITAL_ZOOM_RATIO, p7f.TAG_DATETIME, p7f.TAG_EXIF_VERSION, p7f.TAG_EXPOSURE_BIAS_VALUE, p7f.TAG_EXPOSURE_INDEX, p7f.TAG_EXPOSURE_MODE, p7f.TAG_EXPOSURE_PROGRAM, p7f.TAG_FOCAL_LENGTH, p7f.TAG_FOCAL_LENGTH_IN_35MM_FILM, p7f.TAG_FOCAL_PLANE_RESOLUTION_UNIT, p7f.TAG_FOCAL_PLANE_X_RESOLUTION, p7f.TAG_FOCAL_PLANE_Y_RESOLUTION, p7f.TAG_GAIN_CONTROL, p7f.TAG_MAKE, p7f.TAG_METERING_MODE, p7f.TAG_REFERENCE_BLACK_WHITE, p7f.TAG_SATURATION, p7f.TAG_SHUTTER_SPEED_VALUE, p7f.TAG_SPECTRAL_SENSITIVITY, p7f.TAG_WHITE_BALANCE, p7f.TAG_WHITE_POINT, p7f.TAG_BRIGHTNESS_VALUE, p7f.TAG_EXPOSURE_TIME, p7f.TAG_F_NUMBER, p7f.TAG_ISO_SPEED_RATINGS};

    /* JADX INFO: renamed from: c */
    private final Object f12803c = new Object();

    /* JADX INFO: renamed from: k */
    private float f12811k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f12812l = 0.0f;

    /* JADX INFO: renamed from: q */
    private State f12817q = State.INVALID;

    /* JADX INFO: renamed from: v */
    private ArrayList<e7j> f12822v = new ArrayList<>();

    /* JADX INFO: renamed from: w */
    private e7j f12823w = new e7j();

    /* JADX INFO: renamed from: x */
    private HashMap<String, String> f12824x = new HashMap<>();

    /* JADX INFO: renamed from: A */
    private AtomicBoolean f12796A = new AtomicBoolean(false);

    /* JADX INFO: renamed from: B */
    private int f12797B = 0;

    /* JADX INFO: renamed from: C */
    private final int f12798C = 5;

    /* JADX INFO: renamed from: D */
    private final Handler f12799D = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: E */
    private final Runnable f12800E = new RunnableC3698a();

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
    public class RunnableC3698a implements Runnable {
        public RunnableC3698a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (PhotinusEmulator.this.f12803c) {
                try {
                    if (PhotinusEmulator.this.f12817q == State.COMPLETED) {
                        return;
                    }
                    PhotinusEmulator.this.f12817q = State.AT_FAULT;
                    if (PhotinusEmulator.this.f12821u == null || !PhotinusEmulator.this.f12796A.compareAndSet(false, true)) {
                        return;
                    }
                    PhotinusEmulator.this.f12821u.mo205963b("Timeout");
                    PhotinusEmulator.this.f12821u.mo205962a(null, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m18612A(String str, int i, int i2, int i3) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            bqq0.m105954c(cd4.m109117a(this.f12801a), file, i, i2, i3);
            return true;
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m18618h(List<Map<String, Object>> list, String str, int i) {
        HashMap map = new HashMap();
        map.put("photinusColorRgb", str);
        map.put("photinusColorCnt", Integer.valueOf(i));
        list.add(map);
    }

    /* JADX INFO: renamed from: k */
    private List<Integer> m18619k() {
        ArrayList arrayList = new ArrayList();
        String strM97501x = afm.m97360H().m97501x();
        o6r0.m166282b("DTF", "deleteDirectory: extProtocol " + strM97501x);
        Map map = (Map) JSON.parseObject(strM97501x, Map.class);
        List<Map<String, Object>> arrayList2 = new ArrayList<>();
        if (map != null && map.containsKey("photinusColorConfig")) {
            Object obj = map.get("photinusColorConfig");
            if (obj instanceof List) {
                arrayList2 = (List) obj;
            }
        }
        if (arrayList2.isEmpty()) {
            m18618h(arrayList2, "{0,0,255}", 6);
            m18618h(arrayList2, "{255,0,0}", 8);
            m18618h(arrayList2, "{0,255,0}", 9);
            m18618h(arrayList2, "{255,255,0}", 7);
        }
        for (Map<String, Object> map2 : arrayList2) {
            String str = (String) map2.get("photinusColorRgb");
            Integer num = (Integer) map2.get("photinusColorCnt");
            if (str != null && num != null) {
                for (int i = 0; i < num.intValue(); i++) {
                    arrayList.add(m18632m(str));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private String m18620n(int i) {
        Locale locale = Locale.US;
        return new SimpleDateFormat("yy.M.dd.HH.mm.ss.SSS", locale).format(new Date()) + String.format(locale, "_n%d_k%d_d%d_p%d_i%d", 5, 2, 3, 3, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: q */
    private Uri m18621q(Context context) {
        return Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "Phontinus");
    }

    /* JADX INFO: renamed from: s */
    private void m18622s(String str) {
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
    private HashMap<String, Object> m18623t(e7j e7jVar, e7j e7jVar2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("light-sensor", Float.valueOf(e7jVar.f92436a));
        map.put("horizontal-view-angle", Float.valueOf(e7jVar2.f92438c));
        map.put("vertical-view-angle", Float.valueOf(e7jVar2.f92439d));
        map.put("brightness-value", e7jVar2.f92443h);
        map.put("f-number", e7jVar2.f92442g);
        map.put("iso-speed", e7jVar2.f92441f);
        map.put("exposure-time", e7jVar2.f92440e);
        map.put("accuracy", Integer.valueOf(e7jVar.f92437b));
        return map;
    }

    /* JADX INFO: renamed from: u */
    private boolean m18624u() {
        return this.f12816p - this.f12814n.length >= 0;
    }

    /* JADX INFO: renamed from: x */
    private void m18625x(Uri uri, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uri.getPath());
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            y270 y270Var = this.f12821u;
            if (y270Var != null) {
                y270Var.onException(e);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m18626y() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f12818r;
        HashMap map = new HashMap();
        map.put("sdk-version", "1.1.1");
        map.put("rotate-angle", Integer.valueOf(this.f12806f));
        map.put("data-source", "idv-production-android-2");
        map.put("device-name", Build.MODEL);
        map.put("total-time-ms", Long.valueOf(jCurrentTimeMillis));
        map.put("sequence-index", Integer.valueOf(this.f12807g));
        map.put("sequence-length", 5);
        map.put("sequence-periods", 3);
        map.put("sequence-repeat", Integer.valueOf(this.f12808h));
        map.put("sequence-margin", Integer.valueOf(this.f12809i));
        map.put("sequence-extra", 0);
        map.put("color-magnitude", Float.valueOf(this.f12811k));
        map.put("color-offset", Float.valueOf(this.f12812l));
        map.put("video-width", Integer.valueOf(this.f12805e));
        map.put("video-height", Integer.valueOf(this.f12804d));
        if (this.f12810j) {
            map.put("smooth-transition-length", 3);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e7j> it = this.f12822v.iterator();
        while (it.hasNext()) {
            arrayList.add(m18623t(it.next(), this.f12823w));
        }
        map.put("frame-metadata", arrayList);
        map.put("extra-exif", this.f12824x);
        String strM176262d = this.f12826z.m176262d();
        if (!TextUtils.isEmpty(strM176262d)) {
            m18622s(strM176262d);
        }
        map.put("light-sensor-config", strM176262d);
        m18625x(this.f12820t, JSON.toJSONString(map).getBytes());
    }

    @Override // com.idv.identity.face.photinus.VideoWriter.InterfaceC3701c
    /* JADX INFO: renamed from: a */
    public void mo18627a(VideoWriter videoWriter) {
        synchronized (this.f12803c) {
            try {
                if (videoWriter == this.f12825y || this.f12817q == State.IN_COMPLETION) {
                    this.f12799D.removeCallbacks(this.f12800E);
                    m18626y();
                    this.f12817q = State.COMPLETED;
                    if (this.f12821u == null || !this.f12796A.compareAndSet(false, true)) {
                        return;
                    }
                    this.f12821u.mo205962a(this.f12819s, this.f12820t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18628b() {
        synchronized (this.f12803c) {
            try {
                VideoWriter videoWriter = this.f12825y;
                if (videoWriter != null) {
                    videoWriter.m18676v();
                    VideoWriter videoWriter2 = new VideoWriter(this);
                    this.f12825y = videoWriter2;
                    videoWriter2.m18674C(this.f12819s, this.f12804d, this.f12805e, this.f12806f);
                }
                this.f12817q = State.INVALID;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[PHI: r5
      0x0078: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v4 java.lang.Integer) binds: [B:11:0x001b, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: i */
    public void m18629i(z270 z270Var) {
        Integer numValueOf;
        int i;
        boolean z = true;
        if (!this.f12826z.m176263e() && (i = this.f12797B) < 5) {
            this.f12797B = i + 1;
            return;
        }
        synchronized (this.f12803c) {
            try {
                numValueOf = null;
                if (this.f12817q != State.AWAITING_FRAMES) {
                    z = false;
                } else {
                    if (this.f12816p >= 0) {
                        z270Var.f202655c.f92436a = this.f12826z.m176260b();
                        z270Var.f202655c.f92437b = this.f12826z.m176261c();
                        this.f12825y.m18675u(z270Var);
                        this.f12822v.add(z270Var.f202655c);
                        if (this.f12801a == null) {
                            this.f12801a = new CopyOnWriteArrayList<>();
                        }
                        this.f12801a.add(z270Var.f97404a);
                    }
                    int i2 = this.f12815o;
                    int[] iArr = this.f12814n;
                    numValueOf = i2 < iArr.length ? Integer.valueOf(iArr[i2]) : null;
                    this.f12816p++;
                    this.f12815o++;
                    if (m18624u()) {
                        this.f12817q = State.AWAITING_COMPLETION;
                    } else {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y270 y270Var = this.f12821u;
        if (y270Var != null) {
            if (numValueOf != null) {
                y270Var.mo205964c(numValueOf.intValue());
            }
            if (z) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusAbandonFrames", "abandonFramesCount", String.valueOf(this.f12797B), "abandonFramesMax", String.valueOf(5));
                this.f12821u.mo205966e();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m18630j() {
        CopyOnWriteArrayList<byte[]> copyOnWriteArrayList = this.f12801a;
        if (copyOnWriteArrayList == null) {
            this.f12801a = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList.clear();
        }
        synchronized (this.f12803c) {
            try {
                if (this.f12817q != State.READY) {
                    return;
                }
                this.f12815o = 0;
                this.f12816p = -3;
                this.f12822v.clear();
                this.f12817q = State.AWAITING_FRAMES;
                this.f12818r = System.currentTimeMillis();
                y270 y270Var = this.f12821u;
                if (y270Var != null) {
                    y270Var.mo205967f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m18631l() {
        boolean zM18673B = this.f12825y.m18673B();
        synchronized (this.f12803c) {
            try {
                if (this.f12817q == State.AWAITING_COMPLETION) {
                    this.f12817q = State.IN_COMPLETION;
                    if (zM18673B) {
                        this.f12825y.m18676v();
                        this.f12799D.postDelayed(this.f12800E, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM18673B || this.f12821u == null || !this.f12796A.compareAndSet(false, true)) {
            return;
        }
        this.f12821u.mo205963b("AtFault");
        this.f12821u.mo205962a(null, null);
    }

    /* JADX INFO: renamed from: m */
    public Integer m18632m(String str) {
        String[] strArrSplit = str.replace("{", "").replace("}", "").split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length != 3) {
            wg3.m206174a("Invalid RGB format");
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
    public boolean m18633o(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m18633o(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    @Override // com.idv.identity.face.photinus.VideoWriter.InterfaceC3701c
    public void onException(Throwable th) {
        y270 y270Var = this.f12821u;
        if (y270Var != null) {
            y270Var.onException(th);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m18634p() {
        synchronized (this.f12803c) {
            try {
                qer qerVar = this.f12826z;
                if (qerVar != null) {
                    qerVar.m176259a();
                }
                VideoWriter videoWriter = this.f12825y;
                if (videoWriter != null) {
                    videoWriter.m18676v();
                    this.f12825y = null;
                }
                CopyOnWriteArrayList<byte[]> copyOnWriteArrayList = this.f12801a;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                a370.m95774a().m95775b();
                this.f12817q = State.INVALID;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m18635r(Context context, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        synchronized (this.f12803c) {
            try {
                boolean z2 = false;
                if (!this.f12817q.isTerminalState) {
                    return false;
                }
                a370.m95774a();
                Uri uriM18621q = m18621q(context);
                File file = new File(uriM18621q.getPath());
                if ((!file.exists() || m18633o(file)) && !file.mkdir()) {
                    z2 = true;
                }
                this.f12808h = i6;
                this.f12809i = i5;
                this.f12804d = i;
                this.f12805e = i2;
                this.f12806f = i3;
                this.f12807g = i4;
                this.f12810j = z;
                List<Integer> listM18619k = m18619k();
                o6r0.m166282b("DTF", "initialize: integers.size " + listM18619k.size());
                this.f12813m = C3703a.m18677a(listM18619k);
                int[] iArrM18677a = C3703a.m18677a(C3703a.m18679c(listM18619k, this.f12809i));
                this.f12813m = iArrM18677a;
                this.f12814n = iArrM18677a;
                o6r0.m166282b("DTF", "initialize: _colorSequence.length " + this.f12814n.length);
                String strM18620n = m18620n(this.f12807g);
                this.f12819s = Uri.withAppendedPath(uriM18621q, strM18620n + ".mp4");
                this.f12820t = Uri.withAppendedPath(uriM18621q, strM18620n + ".json");
                VideoWriter videoWriter = new VideoWriter(this);
                this.f12825y = videoWriter;
                if (!z2) {
                    videoWriter.m18674C(this.f12819s, this.f12804d, this.f12805e, this.f12806f);
                }
                this.f12826z = new qer(context);
                this.f12823w = new e7j();
                this.f12824x = new HashMap<>();
                this.f12817q = State.READY;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m18636v(y270 y270Var) {
        this.f12821u = y270Var;
    }

    /* JADX INFO: renamed from: w */
    public void m18637w() {
        m18631l();
        y270 y270Var = this.f12821u;
        if (y270Var != null) {
            y270Var.mo205965d("NoPhotoTake");
        }
    }

    /* JADX INFO: renamed from: z */
    public String m18638z(String str, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(".mp4", ".zip");
        }
        return m18612A(str, i, i2, i3) ? str : "";
    }
}
