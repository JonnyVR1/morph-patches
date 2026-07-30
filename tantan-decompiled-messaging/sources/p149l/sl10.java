package p149l;

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
import com.immomo.moment.mediautils.C3859p;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.immomo.moment.model.VideoFragment;
import com.momo.mcamera.util.MDLogTag;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sl10 implements sam0 {

    /* JADX INFO: renamed from: C */
    boolean f165057C;

    /* JADX INFO: renamed from: D */
    String f165058D;

    /* JADX INFO: renamed from: E */
    String f165059E;

    /* JADX INFO: renamed from: a */
    private LinkedList<VideoFragment> f165060a;

    /* JADX INFO: renamed from: b */
    private String f165061b;

    /* JADX INFO: renamed from: c */
    private String f165062c;

    /* JADX INFO: renamed from: e */
    private mmw f165064e;

    /* JADX INFO: renamed from: k */
    private rlw f165070k;

    /* JADX INFO: renamed from: m */
    oa4 f165072m;

    /* JADX INFO: renamed from: q */
    WeakReference<SurfaceHolder> f165076q;

    /* JADX INFO: renamed from: r */
    private nnl.InterfaceC18741f f165077r;

    /* JADX INFO: renamed from: y */
    private EGLContext f165084y;

    /* JADX INFO: renamed from: d */
    private boolean f165063d = false;

    /* JADX INFO: renamed from: f */
    public tal0 f165065f = null;

    /* JADX INFO: renamed from: g */
    private boolean f165066g = false;

    /* JADX INFO: renamed from: h */
    private bmw f165067h = null;

    /* JADX INFO: renamed from: i */
    private int f165068i = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: n */
    private cmw f165073n = null;

    /* JADX INFO: renamed from: o */
    private rmw f165074o = null;

    /* JADX INFO: renamed from: p */
    private fmw f165075p = null;

    /* JADX INFO: renamed from: s */
    private boolean f165078s = true;

    /* JADX INFO: renamed from: t */
    private boolean f165079t = false;

    /* JADX INFO: renamed from: u */
    private int f165080u = 104;

    /* JADX INFO: renamed from: v */
    private int f165081v = 0;

    /* JADX INFO: renamed from: w */
    private int f165082w = 0;

    /* JADX INFO: renamed from: z */
    private boolean f165085z = false;

    /* JADX INFO: renamed from: A */
    private boolean f165055A = false;

    /* JADX INFO: renamed from: B */
    String f165056B = null;

    /* JADX INFO: renamed from: j */
    final Object f165069j = new Object();

    /* JADX INFO: renamed from: l */
    private tlw f165071l = new tlw();

    /* JADX INFO: renamed from: x */
    private Handler f165083x = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.sl10$a */
    public class RunnableC19975a implements Runnable {
        public RunnableC19975a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < sl10.this.f165060a.size(); i++) {
                try {
                    File file = new File(((VideoFragment) sl10.this.f165060a.get(i)).getVideoPath());
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
                    if (sl10.this.f165067h != null) {
                        sl10.this.f165067h.onError(sl10.this.f165068i + 1001, "Cancel recording happened file error !!!");
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.sl10$b */
    public class C19976b implements tmw {
        public C19976b() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Splice file is failed because of " + str);
            if (sl10.this.f165067h != null) {
                sl10.this.f165067h.onError(sl10.this.f165068i + i, "[" + (sl10.this.f165068i + i) + Constants.AES_SUFFIX + str);
            }
        }
    }

    /* JADX INFO: renamed from: l.sl10$c */
    public class C19977c implements lmw {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ mmw f165088a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f165089b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f165090c;

        public C19977c(mmw mmwVar, String str, long j) {
            this.f165088a = mmwVar;
            this.f165089b = str;
            this.f165090c = j;
        }

        @Override // p149l.lmw
        /* JADX INFO: renamed from: a */
        public void mo61016a() throws IOException {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Splicing process finished !");
            mmw mmwVar = this.f165088a;
            if (mmwVar != null) {
                mmwVar.mo101513b(100);
                this.f165088a.mo101514c();
                sl10.m184642s(this.f165089b);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraEncoderTime(System.currentTimeMillis() - this.f165090c);
            }
        }

        @Override // p149l.lmw
        public void onProcessProgress(float f) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Process " + f);
            mmw mmwVar = this.f165088a;
            if (mmwVar != null) {
                int i = (int) (f * 100.0f);
                if (i > 100) {
                    i = 100;
                }
                mmwVar.mo101513b(i);
            }
        }
    }

    /* JADX INFO: renamed from: l.sl10$d */
    public class C19978d implements imw {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ rlw f165092a;

        public C19978d(rlw rlwVar) {
            this.f165092a = rlwVar;
        }
    }

    /* JADX INFO: renamed from: l.sl10$e */
    public interface InterfaceC19979e {
    }

    /* JADX INFO: renamed from: C0 */
    private void m184631C0() {
        m184675c0(null);
        m184674b0(null);
        m184671Y(null);
        m184669W(null);
        m184659M(null);
    }

    /* JADX INFO: renamed from: G */
    private void m184632G() {
        LinkedList<VideoFragment> linkedList = this.f165060a;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        String videoPath = this.f165060a.getLast().getVideoPath();
        this.f165060a.removeLast();
        if (videoPath == null) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "The video path of videoFragments is null !!!");
        } else {
            nhi.m159401a(new File(videoPath));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m184637e(VideoFragment videoFragment) {
        if (videoFragment == null) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Don't insert empty object");
            return;
        }
        if (this.f165060a == null) {
            this.f165060a = new LinkedList<>();
        }
        this.f165060a.addLast(videoFragment);
    }

    /* JADX INFO: renamed from: l */
    private String m184639l() {
        if (TextUtils.isEmpty(this.f165061b)) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "mediaOutPath is null !!!");
            upk0.m194883a("mediaOutPath is null");
            return null;
        }
        String strReplace = this.f165061b.replace(".mp4", System.currentTimeMillis() + ".mp4");
        StringBuilder sb = new StringBuilder("jarek fragment path:");
        sb.append(strReplace);
        MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, sb.toString());
        return strReplace;
    }

    /* JADX INFO: renamed from: p */
    private List<String> m184640p() {
        if (this.f165060a == null) {
            return new LinkedList();
        }
        ArrayList arrayList = new ArrayList(this.f165060a.size());
        for (int i = 0; i < this.f165060a.size(); i++) {
            if (m184645x(this.f165060a.get(i).getVideoPath())) {
                arrayList.add(this.f165060a.get(i).getVideoPath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    private void m184641r0(nmw nmwVar) {
        if (this.f165063d) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "recording is true, have you forget to stop?");
            return;
        }
        if (TextUtils.isEmpty(this.f165061b)) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "The mediaOutPath is empty, please set outpath first !!!");
            upk0.m194883a("set outPath first");
        } else {
            String strM184639l = m184639l();
            m184661O(this.f165066g);
            m184698q0(strM184639l, this.f165062c, nmwVar);
            this.f165063d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static void m184642s(String str) throws IOException {
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
    private void m184643t(rlw rlwVar) {
        this.f165071l.f171105o = rlwVar.m179931w().m189184b();
        this.f165071l.f171106p = rlwVar.m179931w().m189183a();
        this.f165071l.f171111u = rlwVar.m179928t();
        this.f165071l.f171109s = rlwVar.m179929u();
        this.f165071l.f171107q = rlwVar.m179930v();
        this.f165071l.f171116z = rlwVar.m179921m();
        this.f165071l.f171065I = rlwVar.m179926r();
        this.f165071l.f171110t = rlwVar.m179915g();
        this.f165071l.f171066J = rlwVar.m179914f();
        this.f165071l.f171067K = rlwVar.m179923o();
        this.f165071l.f171068L = rlwVar.m179924p();
        this.f165071l.f171069M = rlwVar.m179927s();
        this.f165071l.f171059C = rlwVar.m179911c();
        this.f165071l.f171061E = rlwVar.m179910b();
        this.f165071l.f171060D = rlwVar.m179909a();
        this.f165071l.f171088c0 = rlwVar.m179919k();
        this.f165071l.f171090d0 = rlwVar.m179916h();
        this.f165071l.f171096g0 = rlwVar.m179932x();
        this.f165071l.f171077U = rlwVar.m179934z();
    }

    /* JADX INFO: renamed from: u0 */
    private synchronized void m184644u0(omw omwVar) {
        if (!this.f165063d) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "recording is false, have you forget to start?");
            return;
        }
        VideoFragment videoFragmentM184704v0 = m184704v0(omwVar);
        if (videoFragmentM184704v0 != null) {
            m184637e(videoFragmentM184704v0);
        }
        this.f165063d = false;
        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "stopRecording");
    }

    /* JADX INFO: renamed from: x */
    private boolean m184645x(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m184646A() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163229F();
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public void m184647A0(String str, boolean z) {
        m184649B0(str, false, 0, 0, 0, 0, z);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m184648B() {
        try {
            if (this.f165063d) {
                m184701t0();
            }
            m184652E();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m184649B0(String str, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163244U(str, z, i, i2, i3, i4, z2);
        }
    }

    /* JADX INFO: renamed from: C */
    public synchronized boolean m184650C(Activity activity, rlw rlwVar) {
        return m184651D(activity, xki0.m209793a(activity), rlwVar);
    }

    /* JADX INFO: renamed from: D */
    public boolean m184651D(Context context, int i, rlw rlwVar) {
        synchronized (this.f165069j) {
            try {
                this.f165070k = rlwVar;
                m184643t(rlwVar);
                tlw tlwVar = this.f165071l;
                tlwVar.f171076T = this.f165055A;
                m184702u(tlwVar);
                this.f165072m.mo163231H(this);
                this.f165072m.mo163240Q(null);
                this.f165072m.mo163232I(null);
                this.f165072m.mo163266l(this.f165077r);
                this.f165072m.mo163235L(null);
                this.f165072m.mo163281z(this.f165073n);
                this.f165072m.mo163268m0(this.f165067h);
                HashMap<String, Object> map = new HashMap<>();
                map.put("FaceInfo", Boolean.valueOf(this.f165078s));
                this.f165072m.mo163260g0(map);
                this.f165072m.mo163233J(this.f165080u);
                this.f165072m.mo163254c0(this.f165079t);
                this.f165072m.mo163230G(new C19978d(rlwVar));
                this.f165072m.mo163270o0(null);
                this.f165072m.mo163267l0(this.f165074o);
                this.f165072m.mo163249Z(null);
                this.f165072m.mo163269n0(null);
                this.f165072m.mo163246W(null);
                this.f165072m.mo163275t0(null);
                this.f165072m.mo163227D(this.f165075p);
                String str = this.f165056B;
                if (str != null) {
                    this.f165072m.mo163228E(str);
                }
                this.f165072m.mo163252b0(this.f165057C);
                this.f165072m.mo163259f0(null);
                this.f165072m.mo163238O(null);
                this.f165072m.mo163276u0(null);
                String str2 = this.f165058D;
                if (str2 != null) {
                    this.f165072m.mo163273r0(str2);
                }
                String str3 = this.f165059E;
                if (str3 != null) {
                    this.f165072m.mo163271p0(str3);
                }
                this.f165072m.mo163278w0(context);
                try {
                    if (this.f165072m.mo163226C(i, rlwVar)) {
                        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "Recoder prepare success !!!");
                        return true;
                    }
                    MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "Recoder prepare failed !!!");
                    return false;
                } catch (Exception e) {
                    MDLog.m7392e(MDLogTag.MOMENT_RECODER_TAG, "Record prepare failed ! ", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m184652E() {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163231H(null);
                    this.f165072m.release();
                    this.f165072m = null;
                }
                WeakReference<SurfaceHolder> weakReference = this.f165076q;
                if (weakReference != null) {
                    weakReference.clear();
                }
                if (this.f165083x != null) {
                    this.f165083x = null;
                }
                m184631C0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public synchronized void m184653F() {
        m184632G();
    }

    /* JADX INFO: renamed from: H */
    public void m184654H() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163250a0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m184655I() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163261h0();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m184656J(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            File file2 = new File(file.getParent(), file.getName() + ".bak");
            if (file2.exists()) {
                ArrayList arrayList = (ArrayList) if00.m135844b(file2);
                if (arrayList != null && arrayList.size() >= 1) {
                    if (this.f165060a == null) {
                        this.f165060a = new LinkedList<>();
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.f165060a.add((VideoFragment) arrayList.get(i));
                    }
                }
                return;
            }
            m184638i();
        } catch (Throwable th) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m184657K() {
        if (TextUtils.isEmpty(this.f165061b)) {
            return;
        }
        File file = new File(this.f165061b);
        File file2 = new File(file.getParent(), file.getName() + ".bak");
        LinkedList<VideoFragment> linkedList = this.f165060a;
        if (linkedList == null || linkedList.size() <= 0) {
            try {
                if (file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, e.getMessage());
                return;
            }
        }
        ArrayList arrayList = new ArrayList(this.f165060a.size());
        for (int i = 0; i < this.f165060a.size(); i++) {
            arrayList.add(this.f165060a.get(i));
        }
        try {
            file2.createNewFile();
            if00.m135845c(file2, arrayList);
        } catch (IOException e2) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Save fragments to storage failed !!!" + e2.toString());
            bmw bmwVar = this.f165067h;
            if (bmwVar != null) {
                bmwVar.onError(this.f165068i + 1007, " Save fragments to storage failed !!! " + e2.toString());
            }
            kwv.m147652b(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m184658L(us2 us2Var) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163277v0(us2Var);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m184659M(ea1 ea1Var) {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163235L(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m184660N(int i) {
        this.f165080u = i;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163233J(i);
        }
    }

    /* JADX INFO: renamed from: O */
    public synchronized void m184661O(boolean z) {
        this.f165066g = z;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163234K(z);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m184662P(ntb ntbVar) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163245V(ntbVar);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m184663Q(HashMap<String, Object> map) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163260g0(map);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m184664R(boolean z) {
        synchronized (this.f165069j) {
            try {
                this.f165078s = z;
                if (this.f165072m != null) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("FaceInfo", Boolean.valueOf(this.f165078s));
                    this.f165072m.mo163260g0(map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m184665S(String str) {
        this.f165056B = str;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163228E(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m184666T(hmw hmwVar) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163243T(hmwVar);
        }
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m184667U(String str) {
        this.f165061b = str;
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163272q0(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "The mediaOutPath is " + this.f165061b);
    }

    /* JADX INFO: renamed from: V */
    public void m184668V(boolean z) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163265k0(z);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m184669W(nnl.InterfaceC18741f interfaceC18741f) {
        synchronized (this.f165069j) {
            try {
                this.f165077r = interfaceC18741f;
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163266l(interfaceC18741f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m184670X(bmw bmwVar) {
        this.f165067h = bmwVar;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163268m0(bmwVar);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m184671Y(cmw cmwVar) {
        this.f165073n = cmwVar;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163281z(cmwVar);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m184672Z(fmw fmwVar) {
        this.f165075p = fmwVar;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163227D(fmwVar);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m184673a0(mmw mmwVar) {
        this.f165064e = mmwVar;
    }

    /* JADX INFO: renamed from: b0 */
    public void m184674b0(omw omwVar) {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163232I(omwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m184675c0(nmw nmwVar) {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163240Q(nmwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m184676d0(rmw rmwVar) {
        this.f165074o = rmwVar;
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163267l0(rmwVar);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public synchronized void m184677e0(String str) {
        this.f165062c = str;
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163242S(this.f165062c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "The origin mediaOutPath is " + this.f165062c);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m184678f() {
        LinkedList<VideoFragment> linkedList = this.f165060a;
        if (linkedList != null && linkedList.size() >= 1) {
            new Thread(new RunnableC19975a()).start();
            return;
        }
        MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Start calling cancelRecording !!!");
    }

    /* JADX INFO: renamed from: f0 */
    public void m184679f0(SurfaceHolder surfaceHolder) {
        synchronized (this.f165069j) {
            this.f165076q = new WeakReference<>(surfaceHolder);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m184680g(boolean z) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163258e0(z);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m184681g0(InterfaceC19979e interfaceC19979e) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163238O(interfaceC19979e);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m184682h(String str, String str2, Context context) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Parameter is empty ");
            return;
        }
        tal0 tal0Var = new tal0(str2, context);
        if (tal0Var.m187735e() == -1) {
            try {
                tal0Var.m187734c(str);
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, " Decide resolution failed !!! " + e.toString());
                if (this.f165067h != null) {
                    this.f165067h.onError(this.f165068i + 1008, " Decide resolution failed !!! " + e.toString());
                }
            }
        }
        tal0Var.m187737g();
    }

    /* JADX INFO: renamed from: h0 */
    public void m184683h0(float f) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163263j0(f);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m184684i0(swf0.InterfaceC20050a interfaceC20050a) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163225B(interfaceC20050a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m184685j(List<String> list, String str, String str2, mmw mmwVar, Context context) {
        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "Start calling finishRecording !!!");
        if (list != null && list.size() > 0 && str2 != null && str2.length() > 0 && context != null) {
            m184682h(list.get(0), str2, context);
        }
        m184700s0(list, str, str2, mmwVar);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoSegments(list.size());
    }

    /* JADX INFO: renamed from: j0 */
    public void m184686j0(boolean z) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163239P(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m184687k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163264k(rect, autoFocusCallback);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m184688k0(boolean z) {
        this.f165055A = z;
    }

    /* JADX INFO: renamed from: l0 */
    public void m184689l0(boolean z) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163256d0(z);
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraBeautyUseDoki(z);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m184690m() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163255d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    public synchronized tif0 m184691m0(int i, int i2) {
        tlw tlwVar = this.f165071l;
        tlwVar.f171105o = i;
        tlwVar.f171106p = i2;
        oa4 oa4Var = this.f165072m;
        if (oa4Var == null) {
            return null;
        }
        return oa4Var.mo163279x(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public synchronized int m184692n() {
        LinkedList<VideoFragment> linkedList = this.f165060a;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    /* JADX INFO: renamed from: n0 */
    public void m184693n0(int i) {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            oa4Var.mo163251b(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public List<String> m184694o() {
        return m184640p();
    }

    /* JADX INFO: renamed from: o0 */
    public void m184695o0() throws Throwable {
        synchronized (this.f165069j) {
            try {
                WeakReference<SurfaceHolder> weakReference = this.f165076q;
                if (weakReference == null || weakReference.get() == null) {
                    MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, "Invalid surfaceHolder of recoder !!!");
                    throw new Exception("Invalid surfaceHolder");
                }
                this.f165072m.mo163241R(this.f165076q.get().getSurface());
                m184691m0(this.f165076q.get().getSurfaceFrame().width(), this.f165076q.get().getSurfaceFrame().height());
            } catch (Throwable th) {
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RECODER_TAG, th);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized void m184696p0() {
        m184641r0(null);
    }

    /* JADX INFO: renamed from: q */
    public int m184697q() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163253c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public void m184698q0(@Nullable String str, @Nullable String str2, nmw nmwVar) {
        synchronized (this.f165069j) {
            try {
                if (this.f165072m != null) {
                    this.f165071l.f171107q = this.f165070k.m179930v();
                    this.f165072m.mo163240Q(null);
                    this.f165072m.mo163232I(null);
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    oa4 oa4Var = this.f165072m;
                    if (!zIsEmpty) {
                        oa4Var.mo163272q0(str);
                    } else if (TextUtils.isEmpty(oa4Var.mo163248Y())) {
                        MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "Video Output is Null!");
                        throw new RuntimeException("Video Output is Null!");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f165072m.mo163242S(str2);
                    }
                    this.f165072m.mo163237N(nmwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public synchronized long m184699r() {
        long duration;
        duration = 0;
        for (int i = 0; i < this.f165060a.size(); i++) {
            duration += this.f165060a.get(i).getDuration();
        }
        return duration;
    }

    /* JADX INFO: renamed from: s0 */
    public void m184700s0(List<String> list, String str, String str2, mmw mmwVar) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, " Start splicing videos !!!");
        if (list == null || str == null || list.size() <= 0 || list.size() != 1) {
            C3859p c3859p = new C3859p();
            c3859p.m19026p(new C19976b());
            if (c3859p.m19028r(list, str)) {
                c3859p.m19027q(new C19977c(mmwVar, str, jCurrentTimeMillis));
                c3859p.m19029s();
                return;
            }
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "When splice files the out path is empty !!!");
            if (mmwVar != null) {
                mmwVar.mo101512a("Media Path Empty");
            }
            bmw bmwVar = this.f165067h;
            if (bmwVar != null) {
                bmwVar.onError(this.f165068i + 1003, " When splice files the out path is empty !!! ");
                return;
            }
            return;
        }
        try {
            if00.m135843a(new File(list.get(0)), new File(str));
            if (mmwVar != null) {
                mmwVar.mo101514c();
                m184642s(str);
            }
        } catch (IOException e) {
            MDLog.m7391e(MDLogTag.MOMENT_RECODER_TAG, "When splice file copy failed !!! " + e.toString());
            if (mmwVar != null) {
                mmwVar.mo101512a("生成文件错误！");
            }
            bmw bmwVar2 = this.f165067h;
            if (bmwVar2 != null) {
                bmwVar2.onError(this.f165068i + 1002, "When splice file copy failed !!! " + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public synchronized void m184701t0() {
        m184644u0(null);
    }

    /* JADX INFO: renamed from: u */
    public void m184702u(tlw tlwVar) {
        if (this.f165072m == null) {
            this.f165072m = new pa4(tlwVar, this.f165084y);
            MDLog.m7395i(MDLogTag.MOMENT_RECODER_TAG, tlwVar.toString() + " isAR = " + this.f165085z);
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m184703v() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var == null) {
            return false;
        }
        return oa4Var.mo163262i0();
    }

    /* JADX INFO: renamed from: v0 */
    public VideoFragment m184704v0(omw omwVar) {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var == null) {
                    return null;
                }
                return oa4Var.mo163236M(omwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized boolean m184705w() {
        oa4 oa4Var;
        oa4Var = this.f165072m;
        return oa4Var != null && oa4Var.mo163257e();
    }

    /* JADX INFO: renamed from: w0 */
    public void m184706w0(int i) {
        synchronized (this.f165069j) {
            try {
                oa4 oa4Var = this.f165072m;
                if (oa4Var != null) {
                    oa4Var.mo163224A(i, this.f165070k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m184707x0(Activity activity) {
        m184706w0(xki0.m209793a(activity));
    }

    /* JADX INFO: renamed from: y */
    public boolean m184708y() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163280y();
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m184709y0() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163274s0();
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m184710z() {
        oa4 oa4Var = this.f165072m;
        if (oa4Var != null) {
            return oa4Var.mo163247X();
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public void m184711z0(String str, int i, int i2, int i3, int i4, boolean z) {
        m184649B0(str, false, i, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: i */
    private void m184638i() {
    }
}
