package p149l;

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
public class nw3 {

    /* JADX INFO: renamed from: f */
    private static nw3 f140865f;

    /* JADX INFO: renamed from: a */
    private String f140866a;

    /* JADX INFO: renamed from: b */
    private Context f140867b;

    /* JADX INFO: renamed from: c */
    private String f140868c = "CVSDK_TAG  ";

    /* JADX INFO: renamed from: d */
    private vkd0 f140869d;

    /* JADX INFO: renamed from: e */
    private String f140870e;

    /* JADX INFO: renamed from: l.nw3$a */
    public class C18788a implements f600 {
        public C18788a() {
        }

        @Override // p149l.f600
        /* JADX INFO: renamed from: a */
        public void mo119577a(String str, int i, String str2) {
            tjw.m189413h(str, i, str2);
        }
    }

    /* JADX INFO: renamed from: l.nw3$b */
    public class C18789b extends vkd0 {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ vkd0 f140872c;

        public C18789b(vkd0 vkd0Var) {
            this.f140872c = vkd0Var;
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: b */
        public String mo161783b() {
            return this.f140872c.mo161783b();
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: c */
        public String mo161784c() {
            return this.f140872c.mo161784c();
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: d */
        public String mo161785d() {
            if (!TextUtils.isEmpty(this.f140872c.mo161785d())) {
                nw3.this.f140870e = this.f140872c.mo161785d();
            }
            return this.f140872c.mo161785d();
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: f */
        public String mo161786f() {
            return this.f140872c.mo161786f();
        }

        @Override // p149l.vkd0
        /* JADX INFO: renamed from: g */
        public boolean mo161787g() {
            return this.f140872c.mo161787g();
        }
    }

    /* JADX INFO: renamed from: l.nw3$d */
    public class C18791d implements h600 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f140879a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h600 f140880b;

        public C18791d(List list, h600 h600Var) {
            this.f140879a = list;
            this.f140880b = h600Var;
        }

        @Override // p149l.h600
        /* JADX INFO: renamed from: a */
        public void mo129467a(int i, String str) {
            String[] strArr = (String[]) this.f140879a.remove(0);
            if (strArr == null || strArr.length <= 0) {
                MLog.m19461e(nw3.this.f140868c, "onFailed:  errorMsg " + str);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    sb.append(str2);
                    sb.append("-");
                    MLog.m19461e(nw3.this.f140868c, " onFailed: " + str2 + ",errorMsg " + str);
                }
                e600.m114939a(sb.toString(), i != 1 ? 2 : 1, i + "-" + str);
            }
            nw3.this.m161775d(this.f140879a, this.f140880b);
        }

        @Override // p149l.h600
        public void onProcess(int i, double d) {
            MLog.m19459d(nw3.this.f140868c, "onProcess->" + i, new Object[0]);
        }

        @Override // p149l.h600
        public void onSuccess() {
            String[] strArr = (String[]) this.f140879a.remove(0);
            if (strArr != null) {
                for (String str : strArr) {
                    MLog.m19459d(nw3.this.f140868c, " onSuccess: " + str, new Object[0]);
                }
            } else {
                MLog.m19461e(nw3.this.f140868c, " onSuccess: item == null???/");
            }
            nw3.this.m161775d(this.f140879a, this.f140880b);
        }
    }

    private nw3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m161775d(List<String[]> list, h600 h600Var) {
        if (list.size() == 0) {
            MLog.m19459d("lclclc_", "        最终回调 ", new Object[0]);
            h600Var.onSuccess();
        } else {
            MLog.m19459d("lclclc_", " download ", new Object[0]);
            r600.m177960b().m177964e(new C18791d(list, h600Var), list.get(0));
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized nw3 m161776e() {
        try {
            if (f140865f == null) {
                f140865f = new nw3();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f140865f;
    }

    /* JADX INFO: renamed from: f */
    private String[] m161777f(int i) {
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
    private void m161778j() {
        MLog.m19459d("MMfileLog---", "registerErrorLogProxy", new Object[0]);
        m161782k(new C18788a());
    }

    /* JADX INFO: renamed from: g */
    public void m161779g(Context context, vkd0 vkd0Var) {
        if (!TextUtils.isEmpty(this.f140866a) && this.f140866a.equals(vkd0Var.mo161783b())) {
            MLog.m19459d("CVCenter---------", "CVCenter is init for this appid: " + this.f140866a, new Object[0]);
            return;
        }
        this.f140867b = context.getApplicationContext();
        this.f140866a = vkd0Var.mo161783b();
        C18789b c18789b = new C18789b(vkd0Var);
        this.f140869d = c18789b;
        c18789b.f181780a = vkd0Var.f181780a;
        if (vkd0Var.mo197681a()) {
            MLog.m19461e("CVCenter---------", "the autoDownloadConfig was deprecated!It does't work no longer");
        }
        ivc0.m138543d(this.f140867b, this.f140869d);
        m161778j();
    }

    /* JADX INFO: renamed from: h */
    public boolean m161780h(int i) {
        String[] strArrM161777f = m161777f(i);
        if (strArrM161777f == null) {
            k250.m144273a("暂不支持该类型:", i);
            return false;
        }
        for (String str : strArrM161777f) {
            File fileM177963c = r600.m177960b().m177963c(str);
            if (fileM177963c == null || !fileM177963c.exists()) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: i */
    public void m161781i(DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener, int... iArr) {
        ArrayList arrayList = new ArrayList();
        if (iArr == null || iArr.length == 0) {
            ig3.m135964a("输入检测器可变参数不能为空");
            return;
        }
        for (int i : iArr) {
            String[] strArrM161777f = m161777f(i);
            if (strArrM161777f == null) {
                k250.m144273a("暂不支持该类型:", i);
                return;
            }
            arrayList.add(strArrM161777f);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashMap map = new HashMap();
        MLog.m19459d(this.f140868c, " prepareDetector ", new Object[0]);
        m161775d(arrayList2, new C18790c(arrayList, map, iArr, detectorListener$OnDetectorPreparedListener));
    }

    /* JADX INFO: renamed from: k */
    public void m161782k(f600 f600Var) {
        if (e600.f89486a == null) {
            e600.f89486a = f600Var;
        }
    }

    /* JADX INFO: renamed from: l.nw3$c */
    public class C18790c implements h600 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f140874a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f140875b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int[] f140876c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DetectorListener$OnDetectorPreparedListener f140877d;

        public C18790c(List list, Map map, int[] iArr, DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener) {
            this.f140874a = list;
            this.f140875b = map;
            this.f140876c = iArr;
            this.f140877d = detectorListener$OnDetectorPreparedListener;
        }

        @Override // p149l.h600
        /* JADX INFO: renamed from: a */
        public void mo129467a(int i, String str) {
            MLog.m19461e(nw3.this.f140868c, "download onFailed: " + str);
        }

        @Override // p149l.h600
        public void onSuccess() {
            for (int i = 0; i < this.f140874a.size(); i++) {
                boolean z = true;
                for (String str : (String[]) this.f140874a.get(i)) {
                    File fileM177963c = r600.m177960b().m177963c(str);
                    z &= fileM177963c != null && fileM177963c.exists();
                }
                this.f140875b.put(Integer.valueOf(this.f140876c[i]), Boolean.valueOf(z));
                MLog.m19459d(nw3.this.f140868c, "  download 返回结果: " + this.f140876c[i] + "->" + z, new Object[0]);
            }
            DetectorListener$OnDetectorPreparedListener detectorListener$OnDetectorPreparedListener = this.f140877d;
            if (detectorListener$OnDetectorPreparedListener != null) {
                detectorListener$OnDetectorPreparedListener.mo18293a(this.f140875b);
            }
        }

        @Override // p149l.h600
        public void onProcess(int i, double d) {
        }
    }
}
