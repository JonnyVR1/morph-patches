package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.immomo.moment.mediautils.C4002p;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.immomo.moment.model.VideoFragment;
import com.momo.mcamera.util.MDLogTag;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cu10 implements wjm0 {

    /* JADX INFO: renamed from: C */
    boolean f83777C;

    /* JADX INFO: renamed from: D */
    String f83778D;

    /* JADX INFO: renamed from: E */
    String f83779E;

    /* JADX INFO: renamed from: a */
    private LinkedList<VideoFragment> f83780a;

    /* JADX INFO: renamed from: b */
    private String f83781b;

    /* JADX INFO: renamed from: c */
    private String f83782c;

    /* JADX INFO: renamed from: e */
    private lpw f83784e;

    /* JADX INFO: renamed from: k */
    private qow f83790k;

    /* JADX INFO: renamed from: m */
    nb4 f83792m;

    /* JADX INFO: renamed from: q */
    WeakReference<SurfaceHolder> f83796q;

    /* JADX INFO: renamed from: r */
    private ypl.InterfaceC21661f f83797r;

    /* JADX INFO: renamed from: y */
    private EGLContext f83804y;

    /* JADX INFO: renamed from: d */
    private boolean f83783d = false;

    /* JADX INFO: renamed from: f */
    public xjl0 f83785f = null;

    /* JADX INFO: renamed from: g */
    private boolean f83786g = false;

    /* JADX INFO: renamed from: h */
    private apw f83787h = null;

    /* JADX INFO: renamed from: i */
    private int f83788i = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: n */
    private bpw f83793n = null;

    /* JADX INFO: renamed from: o */
    private qpw f83794o = null;

    /* JADX INFO: renamed from: p */
    private epw f83795p = null;

    /* JADX INFO: renamed from: s */
    private boolean f83798s = true;

    /* JADX INFO: renamed from: t */
    private boolean f83799t = false;

    /* JADX INFO: renamed from: u */
    private int f83800u = 104;

    /* JADX INFO: renamed from: v */
    private int f83801v = 0;

    /* JADX INFO: renamed from: w */
    private int f83802w = 0;

    /* JADX INFO: renamed from: z */
    private boolean f83805z = false;

    /* JADX INFO: renamed from: A */
    private boolean f83775A = false;

    /* JADX INFO: renamed from: B */
    String f83776B = null;

    /* JADX INFO: renamed from: j */
    final Object f83789j = new Object();

    /* JADX INFO: renamed from: l */
    private sow f83791l = new sow();

    /* JADX INFO: renamed from: x */
    private Handler f83803x = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.cu10$a */
    public class RunnableC16362a implements Runnable {
        public RunnableC16362a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < cu10.this.f83780a.size(); i++) {
                try {
                    File file = new File(((VideoFragment) cu10.this.f83780a.get(i)).getVideoPath());
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
                    if (cu10.this.f83787h != null) {
                        cu10.this.f83787h.onError(cu10.this.f83788i + 1001, "Cancel recording happened file error !!!");
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.cu10$b */
    public class C16363b implements spw {
        public C16363b() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Splice file is failed because of " + str);
            if (cu10.this.f83787h != null) {
                cu10.this.f83787h.onError(cu10.this.f83788i + i, "[" + (cu10.this.f83788i + i) + Constants.AES_SUFFIX + str);
            }
        }
    }

    /* JADX INFO: renamed from: l.cu10$c */
    public class C16364c implements kpw {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ lpw f83808a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f83809b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f83810c;

        public C16364c(lpw lpwVar, String str, long j) {
            this.f83808a = lpwVar;
            this.f83809b = str;
            this.f83810c = j;
        }

        @Override // p153l.kpw
        /* JADX INFO: renamed from: a */
        public void mo62200a() throws IOException {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Splicing process finished !");
            lpw lpwVar = this.f83808a;
            if (lpwVar != null) {
                lpwVar.mo97169b(100);
                this.f83808a.mo97170c();
                cu10.m112577s(this.f83809b);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraEncoderTime(System.currentTimeMillis() - this.f83810c);
            }
        }

        @Override // p153l.kpw
        public void onProcessProgress(float f) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Process " + f);
            lpw lpwVar = this.f83808a;
            if (lpwVar != null) {
                int i = (int) (f * 100.0f);
                if (i > 100) {
                    i = 100;
                }
                lpwVar.mo97169b(i);
            }
        }
    }

    /* JADX INFO: renamed from: l.cu10$d */
    public class C16365d implements hpw {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qow f83812a;

        public C16365d(qow qowVar) {
            this.f83812a = qowVar;
        }
    }

    /* JADX INFO: renamed from: l.cu10$e */
    public interface InterfaceC16366e {
    }

    /* JADX INFO: renamed from: C0 */
    private void m112566C0() {
        m112610c0(null);
        m112609b0(null);
        m112606Y(null);
        m112604W(null);
        m112594M(null);
    }

    /* JADX INFO: renamed from: G */
    private void m112567G() {
        LinkedList<VideoFragment> linkedList = this.f83780a;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        String videoPath = this.f83780a.getLast().getVideoPath();
        this.f83780a.removeLast();
        if (videoPath == null) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "The video path of videoFragments is null !!!");
        } else {
            kki.m150098a(new File(videoPath));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m112572e(VideoFragment videoFragment) {
        if (videoFragment == null) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Don't insert empty object");
            return;
        }
        if (this.f83780a == null) {
            this.f83780a = new LinkedList<>();
        }
        this.f83780a.addLast(videoFragment);
    }

    /* JADX INFO: renamed from: l */
    private String m112574l() {
        if (TextUtils.isEmpty(this.f83781b)) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "mediaOutPath is null !!!");
            azk0.m101074a("mediaOutPath is null");
            return null;
        }
        String strReplace = this.f83781b.replace(".mp4", System.currentTimeMillis() + ".mp4");
        StringBuilder sb = new StringBuilder("jarek fragment path:");
        sb.append(strReplace);
        MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, sb.toString());
        return strReplace;
    }

    /* JADX INFO: renamed from: p */
    private List<String> m112575p() {
        if (this.f83780a == null) {
            return new LinkedList();
        }
        ArrayList arrayList = new ArrayList(this.f83780a.size());
        for (int i = 0; i < this.f83780a.size(); i++) {
            if (m112580x(this.f83780a.get(i).getVideoPath())) {
                arrayList.add(this.f83780a.get(i).getVideoPath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    private void m112576r0(mpw mpwVar) {
        if (this.f83783d) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "recording is true, have you forget to stop?");
            return;
        }
        if (TextUtils.isEmpty(this.f83781b)) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "The mediaOutPath is empty, please set outpath first !!!");
            azk0.m101074a("set outPath first");
        } else {
            String strM112574l = m112574l();
            m112596O(this.f83786g);
            m112633q0(strM112574l, this.f83782c, mpwVar);
            this.f83783d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static void m112577s(String str) throws IOException {
        File file = new File(str);
        long length = (file.exists() && file.isFile()) ? file.length() : 0L;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        videoDataRetrieverBySoft.init(str);
        int frameRate = videoDataRetrieverBySoft.getFrameRate();
        videoDataRetrieverBySoft.release();
        try {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileBitrate(Integer.parseInt(strExtractMetadata));
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileWidth(Integer.parseInt(strExtractMetadata2));
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileHeight(Integer.parseInt(strExtractMetadata3));
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileDuration(Long.parseLong(strExtractMetadata4));
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileSize(length);
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoFileFps(frameRate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m112578t(qow qowVar) {
        this.f83791l.f169975o = qowVar.m177371w().m112050b();
        this.f83791l.f169976p = qowVar.m177371w().m112049a();
        this.f83791l.f169981u = qowVar.m177368t();
        this.f83791l.f169979s = qowVar.m177369u();
        this.f83791l.f169977q = qowVar.m177370v();
        this.f83791l.f169986z = qowVar.m177361m();
        this.f83791l.f169935I = qowVar.m177366r();
        this.f83791l.f169980t = qowVar.m177355g();
        this.f83791l.f169936J = qowVar.m177354f();
        this.f83791l.f169937K = qowVar.m177363o();
        this.f83791l.f169938L = qowVar.m177364p();
        this.f83791l.f169939M = qowVar.m177367s();
        this.f83791l.f169929C = qowVar.m177351c();
        this.f83791l.f169931E = qowVar.m177350b();
        this.f83791l.f169930D = qowVar.m177349a();
        this.f83791l.f169958c0 = qowVar.m177359k();
        this.f83791l.f169960d0 = qowVar.m177356h();
        this.f83791l.f169966g0 = qowVar.m177372x();
        this.f83791l.f169947U = qowVar.m177374z();
    }

    /* JADX INFO: renamed from: u0 */
    private synchronized void m112579u0(npw npwVar) {
        if (!this.f83783d) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "recording is false, have you forget to start?");
            return;
        }
        VideoFragment videoFragmentM112639v0 = m112639v0(npwVar);
        if (videoFragmentM112639v0 != null) {
            m112572e(videoFragmentM112639v0);
        }
        this.f83783d = false;
        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "stopRecording");
    }

    /* JADX INFO: renamed from: x */
    private boolean m112580x(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m112581A() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162115F();
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public void m112582A0(String str, boolean z) {
        m112584B0(str, false, 0, 0, 0, 0, z);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m112583B() {
        try {
            if (this.f83783d) {
                m112636t0();
            }
            m112587E();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m112584B0(String str, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162130U(str, z, i, i2, i3, i4, z2);
        }
    }

    /* JADX INFO: renamed from: C */
    public synchronized boolean m112585C(Activity activity, qow qowVar) {
        return m112586D(activity, xti0.m213097a(activity), qowVar);
    }

    /* JADX INFO: renamed from: D */
    public boolean m112586D(Context context, int i, qow qowVar) {
        synchronized (this.f83789j) {
            try {
                this.f83790k = qowVar;
                m112578t(qowVar);
                sow sowVar = this.f83791l;
                sowVar.f169946T = this.f83775A;
                m112637u(sowVar);
                this.f83792m.mo162117H(this);
                this.f83792m.mo162126Q(null);
                this.f83792m.mo162118I(null);
                this.f83792m.mo162152l(this.f83797r);
                this.f83792m.mo162121L(null);
                this.f83792m.mo162167z(this.f83793n);
                this.f83792m.mo162154m0(this.f83787h);
                HashMap<String, Object> map = new HashMap<>();
                map.put("FaceInfo", Boolean.valueOf(this.f83798s));
                this.f83792m.mo162146g0(map);
                this.f83792m.mo162119J(this.f83800u);
                this.f83792m.mo162140c0(this.f83799t);
                this.f83792m.mo162116G(new C16365d(qowVar));
                this.f83792m.mo162156o0(null);
                this.f83792m.mo162153l0(this.f83794o);
                this.f83792m.mo162135Z(null);
                this.f83792m.mo162155n0(null);
                this.f83792m.mo162132W(null);
                this.f83792m.mo162161t0(null);
                this.f83792m.mo162113D(this.f83795p);
                String str = this.f83776B;
                if (str != null) {
                    this.f83792m.mo162114E(str);
                }
                this.f83792m.mo162138b0(this.f83777C);
                this.f83792m.mo162145f0(null);
                this.f83792m.mo162124O(null);
                this.f83792m.mo162162u0(null);
                String str2 = this.f83778D;
                if (str2 != null) {
                    this.f83792m.mo162159r0(str2);
                }
                String str3 = this.f83779E;
                if (str3 != null) {
                    this.f83792m.mo162157p0(str3);
                }
                this.f83792m.mo162164w0(context);
                try {
                    if (this.f83792m.mo162112C(i, qowVar)) {
                        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "Recoder prepare success !!!");
                        return true;
                    }
                    MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "Recoder prepare failed !!!");
                    return false;
                } catch (Exception e) {
                    MDLog.m7446e(MDLogTag.MOMENT_RECODER_TAG, "Record prepare failed ! ", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m112587E() {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162117H(null);
                    this.f83792m.release();
                    this.f83792m = null;
                }
                WeakReference<SurfaceHolder> weakReference = this.f83796q;
                if (weakReference != null) {
                    weakReference.clear();
                }
                if (this.f83803x != null) {
                    this.f83803x = null;
                }
                m112566C0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public synchronized void m112588F() {
        m112567G();
    }

    /* JADX INFO: renamed from: H */
    public void m112589H() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162136a0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m112590I() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162147h0();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m112591J(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            File file2 = new File(file.getParent(), file.getName() + ".bak");
            if (file2.exists()) {
                ArrayList arrayList = (ArrayList) rn00.m182117b(file2);
                if (arrayList != null && arrayList.size() >= 1) {
                    if (this.f83780a == null) {
                        this.f83780a = new LinkedList<>();
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.f83780a.add((VideoFragment) arrayList.get(i));
                    }
                }
                return;
            }
            m112573i();
        } catch (Throwable th) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m112592K() {
        if (TextUtils.isEmpty(this.f83781b)) {
            return;
        }
        File file = new File(this.f83781b);
        File file2 = new File(file.getParent(), file.getName() + ".bak");
        LinkedList<VideoFragment> linkedList = this.f83780a;
        if (linkedList == null || linkedList.size() <= 0) {
            try {
                if (file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, e.getMessage());
                return;
            }
        }
        ArrayList arrayList = new ArrayList(this.f83780a.size());
        for (int i = 0; i < this.f83780a.size(); i++) {
            arrayList.add(this.f83780a.get(i));
        }
        try {
            file2.createNewFile();
            rn00.m182118c(file2, arrayList);
        } catch (IOException e2) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Save fragments to storage failed !!!" + e2.toString());
            apw apwVar = this.f83787h;
            if (apwVar != null) {
                apwVar.onError(this.f83788i + 1007, " Save fragments to storage failed !!! " + e2.toString());
            }
            lyv.m156388b(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m112593L(kt2 kt2Var) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162163v0(kt2Var);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m112594M(la1 la1Var) {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162121L(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m112595N(int i) {
        this.f83800u = i;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162119J(i);
        }
    }

    /* JADX INFO: renamed from: O */
    public synchronized void m112596O(boolean z) {
        this.f83786g = z;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162120K(z);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m112597P(bvb bvbVar) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162131V(bvbVar);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m112598Q(HashMap<String, Object> map) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162146g0(map);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m112599R(boolean z) {
        synchronized (this.f83789j) {
            try {
                this.f83798s = z;
                if (this.f83792m != null) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("FaceInfo", Boolean.valueOf(this.f83798s));
                    this.f83792m.mo162146g0(map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m112600S(String str) {
        this.f83776B = str;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162114E(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m112601T(gpw gpwVar) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162129T(gpwVar);
        }
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m112602U(String str) {
        this.f83781b = str;
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162158q0(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "The mediaOutPath is " + this.f83781b);
    }

    /* JADX INFO: renamed from: V */
    public void m112603V(boolean z) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162151k0(z);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m112604W(ypl.InterfaceC21661f interfaceC21661f) {
        synchronized (this.f83789j) {
            try {
                this.f83797r = interfaceC21661f;
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162152l(interfaceC21661f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m112605X(apw apwVar) {
        this.f83787h = apwVar;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162154m0(apwVar);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m112606Y(bpw bpwVar) {
        this.f83793n = bpwVar;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162167z(bpwVar);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m112607Z(epw epwVar) {
        this.f83795p = epwVar;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162113D(epwVar);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m112608a0(lpw lpwVar) {
        this.f83784e = lpwVar;
    }

    /* JADX INFO: renamed from: b0 */
    public void m112609b0(npw npwVar) {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162118I(npwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m112610c0(mpw mpwVar) {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162126Q(mpwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m112611d0(qpw qpwVar) {
        this.f83794o = qpwVar;
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162153l0(qpwVar);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public synchronized void m112612e0(String str) {
        this.f83782c = str;
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162128S(this.f83782c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "The origin mediaOutPath is " + this.f83782c);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m112613f() {
        LinkedList<VideoFragment> linkedList = this.f83780a;
        if (linkedList != null && linkedList.size() >= 1) {
            new Thread(new RunnableC16362a()).start();
            return;
        }
        MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Start calling cancelRecording !!!");
    }

    /* JADX INFO: renamed from: f0 */
    public void m112614f0(SurfaceHolder surfaceHolder) {
        synchronized (this.f83789j) {
            this.f83796q = new WeakReference<>(surfaceHolder);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m112615g(boolean z) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162144e0(z);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m112616g0(InterfaceC16366e interfaceC16366e) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162124O(interfaceC16366e);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m112617h(String str, String str2, Context context) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Parameter is empty ");
            return;
        }
        xjl0 xjl0Var = new xjl0(str2, context);
        if (xjl0Var.m211233e() == -1) {
            try {
                xjl0Var.m211232c(str);
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, " Decide resolution failed !!! " + e.toString());
                if (this.f83787h != null) {
                    this.f83787h.onError(this.f83788i + 1008, " Decide resolution failed !!! " + e.toString());
                }
            }
        }
        xjl0Var.m211235g();
    }

    /* JADX INFO: renamed from: h0 */
    public void m112618h0(float f) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162149j0(f);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m112619i0(c5g0.InterfaceC16197a interfaceC16197a) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162111B(interfaceC16197a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m112620j(List<String> list, String str, String str2, lpw lpwVar, Context context) {
        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "Start calling finishRecording !!!");
        if (list != null && list.size() > 0 && str2 != null && str2.length() > 0 && context != null) {
            m112617h(list.get(0), str2, context);
        }
        m112635s0(list, str, str2, lpwVar);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoSegments(list.size());
    }

    /* JADX INFO: renamed from: j0 */
    public void m112621j0(boolean z) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162125P(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m112622k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162150k(rect, autoFocusCallback);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m112623k0(boolean z) {
        this.f83775A = z;
    }

    /* JADX INFO: renamed from: l0 */
    public void m112624l0(boolean z) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162142d0(z);
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraBeautyUseDoki(z);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m112625m() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162141d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    public synchronized crf0 m112626m0(int i, int i2) {
        sow sowVar = this.f83791l;
        sowVar.f169975o = i;
        sowVar.f169976p = i2;
        nb4 nb4Var = this.f83792m;
        if (nb4Var == null) {
            return null;
        }
        return nb4Var.mo162165x(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public synchronized int m112627n() {
        LinkedList<VideoFragment> linkedList = this.f83780a;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    /* JADX INFO: renamed from: n0 */
    public void m112628n0(int i) {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            nb4Var.mo162137b(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public List<String> m112629o() {
        return m112575p();
    }

    /* JADX INFO: renamed from: o0 */
    public void m112630o0() throws Throwable {
        synchronized (this.f83789j) {
            try {
                WeakReference<SurfaceHolder> weakReference = this.f83796q;
                if (weakReference == null || weakReference.get() == null) {
                    MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, "Invalid surfaceHolder of recoder !!!");
                    throw new Exception("Invalid surfaceHolder");
                }
                this.f83792m.mo162127R(this.f83796q.get().getSurface());
                m112626m0(this.f83796q.get().getSurfaceFrame().width(), this.f83796q.get().getSurfaceFrame().height());
            } catch (Throwable th) {
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized void m112631p0() {
        m112576r0(null);
    }

    /* JADX INFO: renamed from: q */
    public int m112632q() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162139c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public void m112633q0(@Nullable String str, @Nullable String str2, mpw mpwVar) {
        synchronized (this.f83789j) {
            try {
                if (this.f83792m != null) {
                    this.f83791l.f169977q = this.f83790k.m177370v();
                    this.f83792m.mo162126Q(null);
                    this.f83792m.mo162118I(null);
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    nb4 nb4Var = this.f83792m;
                    if (!zIsEmpty) {
                        nb4Var.mo162158q0(str);
                    } else if (TextUtils.isEmpty(nb4Var.mo162134Y())) {
                        MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "Video Output is Null!");
                        throw new RuntimeException("Video Output is Null!");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f83792m.mo162128S(str2);
                    }
                    this.f83792m.mo162123N(mpwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public synchronized long m112634r() {
        long duration;
        duration = 0;
        for (int i = 0; i < this.f83780a.size(); i++) {
            duration += this.f83780a.get(i).getDuration();
        }
        return duration;
    }

    /* JADX INFO: renamed from: s0 */
    public void m112635s0(List<String> list, String str, String str2, lpw lpwVar) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, " Start splicing videos !!!");
        if (list == null || str == null || list.size() <= 0 || list.size() != 1) {
            C4002p c4002p = new C4002p();
            c4002p.m20006p(new C16363b());
            if (c4002p.m20008r(list, str)) {
                c4002p.m20007q(new C16364c(lpwVar, str, jCurrentTimeMillis));
                c4002p.m20009s();
                return;
            }
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "When splice files the out path is empty !!!");
            if (lpwVar != null) {
                lpwVar.mo97168a("Media Path Empty");
            }
            apw apwVar = this.f83787h;
            if (apwVar != null) {
                apwVar.onError(this.f83788i + 1003, " When splice files the out path is empty !!! ");
                return;
            }
            return;
        }
        try {
            rn00.m182116a(new File(list.get(0)), new File(str));
            if (lpwVar != null) {
                lpwVar.mo97170c();
                m112577s(str);
            }
        } catch (IOException e) {
            MDLog.m7445e(MDLogTag.MOMENT_RECODER_TAG, "When splice file copy failed !!! " + e.toString());
            if (lpwVar != null) {
                lpwVar.mo97168a("生成文件错误！");
            }
            apw apwVar2 = this.f83787h;
            if (apwVar2 != null) {
                apwVar2.onError(this.f83788i + 1002, "When splice file copy failed !!! " + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public synchronized void m112636t0() {
        m112579u0(null);
    }

    /* JADX INFO: renamed from: u */
    public void m112637u(sow sowVar) {
        if (this.f83792m == null) {
            this.f83792m = new ob4(sowVar, this.f83804y);
            MDLog.m7449i(MDLogTag.MOMENT_RECODER_TAG, sowVar.toString() + " isAR = " + this.f83805z);
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m112638v() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var == null) {
            return false;
        }
        return nb4Var.mo162148i0();
    }

    /* JADX INFO: renamed from: v0 */
    public VideoFragment m112639v0(npw npwVar) {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var == null) {
                    return null;
                }
                return nb4Var.mo162122M(npwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized boolean m112640w() {
        nb4 nb4Var;
        nb4Var = this.f83792m;
        return nb4Var != null && nb4Var.mo162143e();
    }

    /* JADX INFO: renamed from: w0 */
    public void m112641w0(int i) {
        synchronized (this.f83789j) {
            try {
                nb4 nb4Var = this.f83792m;
                if (nb4Var != null) {
                    nb4Var.mo162110A(i, this.f83790k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m112642x0(Activity activity) {
        m112641w0(xti0.m213097a(activity));
    }

    /* JADX INFO: renamed from: y */
    public boolean m112643y() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162166y();
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m112644y0() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162160s0();
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m112645z() {
        nb4 nb4Var = this.f83792m;
        if (nb4Var != null) {
            return nb4Var.mo162133X();
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public void m112646z0(String str, int i, int i2, int i3, int i4, boolean z) {
        m112584B0(str, false, i, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: i */
    private void m112573i() {
    }
}
