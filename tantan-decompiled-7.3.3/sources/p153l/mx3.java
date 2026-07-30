package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class mx3 {

    /* JADX INFO: renamed from: f */
    private static mx3 f139177f;

    /* JADX INFO: renamed from: a */
    private String f139178a;

    /* JADX INFO: renamed from: b */
    private Context f139179b;

    /* JADX INFO: renamed from: c */
    private String f139180c = "CVSDK_TAG  ";

    /* JADX INFO: renamed from: d */
    private ysd0 f139181d;

    /* JADX INFO: renamed from: e */
    private String f139182e;

    /* JADX INFO: renamed from: l.mx3$a */
    public class C18729a implements oe00 {
        public C18729a() {
        }

        @Override // p153l.oe00
        /* JADX INFO: renamed from: a */
        public void mo160633a(String str, int i, String str2) {
            smw.m186853h(str, i, str2);
        }
    }

    /* JADX INFO: renamed from: l.mx3$b */
    public class C18730b extends ysd0 {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ysd0 f139184c;

        public C18730b(ysd0 ysd0Var) {
            this.f139184c = ysd0Var;
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: b */
        public String mo160634b() {
            return this.f139184c.mo160634b();
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: c */
        public String mo160635c() {
            return this.f139184c.mo160635c();
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: d */
        public String mo160636d() {
            if (!TextUtils.isEmpty(this.f139184c.mo160636d())) {
                mx3.this.f139182e = this.f139184c.mo160636d();
            }
            return this.f139184c.mo160636d();
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: f */
        public String mo160637f() {
            return this.f139184c.mo160637f();
        }

        @Override // p153l.ysd0
        /* JADX INFO: renamed from: g */
        public boolean mo160638g() {
            return this.f139184c.mo160638g();
        }
    }

    /* JADX INFO: renamed from: l.mx3$d */
    public class C18732d implements qe00 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f139191a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ qe00 f139192b;

        public C18732d(List list, qe00 qe00Var) {
            this.f139191a = list;
            this.f139192b = qe00Var;
        }

        @Override // p153l.qe00
        /* JADX INFO: renamed from: a */
        public void mo160639a(int i, String str) {
            String[] strArr = (String[]) this.f139191a.remove(0);
            if (strArr == null || strArr.length <= 0) {
                MLog.m20460e(mx3.this.f139180c, "onFailed:  errorMsg " + str);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    sb.append(str2);
                    sb.append("-");
                    MLog.m20460e(mx3.this.f139180c, " onFailed: " + str2 + ",errorMsg " + str);
                }
                ne00.m162805a(sb.toString(), i != 1 ? 2 : 1, i + "-" + str);
            }
            mx3.this.m160625d(this.f139191a, this.f139192b);
        }

        @Override // p153l.qe00
        public void onProcess(int i, double d) {
            MLog.m20458d(mx3.this.f139180c, "onProcess->" + i, new Object[0]);
        }

        @Override // p153l.qe00
        public void onSuccess() {
            String[] strArr = (String[]) this.f139191a.remove(0);
            if (strArr != null) {
                for (String str : strArr) {
                    MLog.m20458d(mx3.this.f139180c, " onSuccess: " + str, new Object[0]);
                }
            } else {
                MLog.m20460e(mx3.this.f139180c, " onSuccess: item == null???/");
            }
            mx3.this.m160625d(this.f139191a, this.f139192b);
        }
    }

    private mx3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m160625d(List<String[]> list, qe00 qe00Var) {
        if (list.size() == 0) {
            MLog.m20458d("lclclc_", "        最终回调 ", new Object[0]);
            qe00Var.onSuccess();
        } else {
            MLog.m20458d("lclclc_", " download ", new Object[0]);
            af00.m97267b().m97271e(new C18732d(list, qe00Var), list.get(0));
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized mx3 m160626e() {
        try {
            if (f139177f == null) {
                f139177f = new mx3();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f139177f;
    }

    /* JADX INFO: renamed from: f */
    private String[] m160627f(int i) {
        if (i == 1) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_facedetect_model"};
        }
        if (i == 2) {
            return new String[]{"mmcv_android_od_model"};
        }
        if (i == 12) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_mace_fd_model"};
        }
        if (i == 15) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_fd_240_model"};
        }
        if (i == 3) {
            return new String[]{"mmcv_android_mace_moment_sg_model"};
        }
        if (i == 4) {
            return new String[]{"mmcv_android_barenessdetect_model"};
        }
        if (i == 9) {
            return new String[]{"mmcv_android_facerigv3_model"};
        }
        if (i == 10) {
            return new String[]{"mmcv_android_handgesture_model"};
        }
        if (i == 5) {
            return new String[]{"mmcv_android_bodylandmark_model"};
        }
        if (i == 11) {
            return new String[]{"mmcv_android_facequality_model"};
        }
        if (i == 13) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_live_fd_model"};
        }
        if (i == 14) {
            return new String[]{"mmcv_android_face_sg_model"};
        }
        if (i == 115) {
            return new String[]{"mmcv_android_byte_model"};
        }
        if (i == 16) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_222_big_fd_model"};
        }
        if (i == 17) {
            return new String[]{"mmcv_android_fa_model", "mmcv_android_222_small_fd_model"};
        }
        if (i == 18) {
            return new String[]{"mmcv_android_live_bodylandmark_model"};
        }
        if (i == 19) {
            return new String[]{"mmcv_android_live_engine_beauty_resource_model"};
        }
        if (i == 20) {
            return new String[]{"mmcv_android_cartoon_boy_model"};
        }
        if (i == 21) {
            return new String[]{"mmcv_android_cartoon_girl_model"};
        }
        if (i == 22) {
            return new String[]{"mmcv_android_cartoon_meiman_model"};
        }
        if (i == 23) {
            return new String[]{"mmcv_android_cartoon_watercolor_model"};
        }
        if (i == 24) {
            return new String[]{"mmcv_android_pick_nose_model"};
        }
        if (i == 25) {
            return new String[]{"mmcv_android_cartoon_pout_model"};
        }
        if (i == 26) {
            return new String[]{"mmcv_android_cartoon_fake_laugh_model"};
        }
        if (i == 27) {
            return new String[]{"mmcv_android_hand_segment_model"};
        }
        if (i == 28) {
            return new String[]{"mmcv_android_cartoon_cry_face_model"};
        }
        if (i == 29) {
            return new String[]{"mmcv_android_ar_gift_model"};
        }
        if (i == 30) {
            return new String[]{"mmcv_android_cartoon_a_project_model"};
        }
        if (i == 31) {
            return new String[]{"mmcv_android_stylize_face_model"};
        }
        if (i == 32) {
            return new String[]{"mmcv_android_small_stylize_face_model"};
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m160628j() {
        MLog.m20458d("MMfileLog---", "registerErrorLogProxy", new Object[0]);
        m160632k(new C18729a());
    }

    /* JADX INFO: renamed from: g */
    public void m160629g(Context context, ysd0 ysd0Var) {
        if (!TextUtils.isEmpty(this.f139178a) && this.f139178a.equals(ysd0Var.mo160634b())) {
            MLog.m20458d("CVCenter---------", "CVCenter is init for this appid: " + this.f139178a, new Object[0]);
            return;
        }
        this.f139179b = context.getApplicationContext();
        this.f139178a = ysd0Var.mo160634b();
        C18730b c18730b = new C18730b(ysd0Var);
        this.f139181d = c18730b;
        c18730b.f201391a = ysd0Var.f201391a;
        if (ysd0Var.mo195365a()) {
            MLog.m20460e("CVCenter---------", "the autoDownloadConfig was deprecated!It does't work no longer");
        }
        l3d0.m152690d(this.f139179b, this.f139181d);
        m160628j();
    }

    /* JADX INFO: renamed from: h */
    public boolean m160630h(int i) {
        String[] strArrM160627f = m160627f(i);
        if (strArrM160627f == null) {
            za50.m219101a("暂不支持该类型:", i);
            return false;
        }
        for (String str : strArrM160627f) {
            File fileM97270c = af00.m97267b().m97270c(str);
            if (fileM97270c == null || !fileM97270c.exists()) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: i */
    public void m160631i(DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener, int... iArr) {
        ArrayList arrayList = new ArrayList();
        if (iArr == null || iArr.length == 0) {
            wg3.m206174a("输入检测器可变参数不能为空");
            return;
        }
        for (int i : iArr) {
            String[] strArrM160627f = m160627f(i);
            if (strArrM160627f == null) {
                za50.m219101a("暂不支持该类型:", i);
                return;
            }
            arrayList.add(strArrM160627f);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashMap map = new HashMap();
        MLog.m20458d(this.f139180c, " prepareDetector ", new Object[0]);
        m160625d(arrayList2, new C18731c(arrayList, map, iArr, detectorListener$OnDetectorPreparedListener));
    }

    /* JADX INFO: renamed from: k */
    public void m160632k(oe00 oe00Var) {
        if (ne00.f141563a == null) {
            ne00.f141563a = oe00Var;
        }
    }

    /* JADX INFO: renamed from: l.mx3$c */
    public class C18731c implements qe00 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f139186a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f139187b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int[] f139188c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DetectorListener$OnDetectorPreparedListener f139189d;

        public C18731c(List list, Map map, int[] iArr, DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener) {
            this.f139186a = list;
            this.f139187b = map;
            this.f139188c = iArr;
            this.f139189d = detectorListener$OnDetectorPreparedListener;
        }

        @Override // p153l.qe00
        /* JADX INFO: renamed from: a */
        public void mo160639a(int i, String str) {
            MLog.m20460e(mx3.this.f139180c, "download onFailed: " + str);
        }

        @Override // p153l.qe00
        public void onSuccess() {
            for (int i = 0; i < this.f139186a.size(); i++) {
                boolean z = true;
                for (String str : (String[]) this.f139186a.get(i)) {
                    File fileM97270c = af00.m97267b().m97270c(str);
                    z &= fileM97270c != null && fileM97270c.exists();
                }
                this.f139187b.put(Integer.valueOf(this.f139188c[i]), Boolean.valueOf(z));
                MLog.m20458d(mx3.this.f139180c, "  download 返回结果: " + this.f139188c[i] + "->" + z, new Object[0]);
            }
            DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener = this.f139189d;
            if (detectorListener$OnDetectorPreparedListener != null) {
                detectorListener$OnDetectorPreparedListener.mo19370a(this.f139187b);
            }
        }

        @Override // p153l.qe00
        public void onProcess(int i, double d) {
        }
    }
}
