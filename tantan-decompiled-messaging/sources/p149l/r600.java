package p149l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class r600 {

    /* JADX INFO: renamed from: c */
    private static r600 f157882c;

    /* JADX INFO: renamed from: d */
    public static Object f157883d = new Object();

    /* JADX INFO: renamed from: a */
    private Map<String, whe> f157884a;

    /* JADX INFO: renamed from: b */
    private xhe f157885b;

    /* JADX INFO: renamed from: l.r600$a */
    public class C19647a implements xhe.InterfaceC21152b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f157886a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h600 f157887b;

        public C19647a(String[] strArr, h600 h600Var) {
            this.f157886a = strArr;
            this.f157887b = h600Var;
        }

        @Override // p149l.xhe.InterfaceC21152b
        /* JADX INFO: renamed from: a */
        public void mo177965a() {
            LinkedList linkedList = new LinkedList();
            long jM193705a = uhe.m193705a();
            for (String str : this.f157886a) {
                whe wheVar = (whe) r600.this.f157884a.get(str);
                if (wheVar == null) {
                    ibe.m135253a("do not exit dynamic resource: ", str);
                    return;
                }
                wheVar.m203129e();
                linkedList.add(wheVar);
                wheVar.m203135k(jM193705a);
            }
            if (linkedList.isEmpty()) {
                return;
            }
            egh0 egh0Var = new egh0((whe[]) linkedList.toArray(new whe[linkedList.size()]));
            egh0Var.m116288f(this.f157887b);
            egh0Var.m116284a();
        }

        @Override // p149l.xhe.InterfaceC21152b
        public void onFailed(String str) {
            MLog.m19461e("lclclc_", str);
            h600 h600Var = this.f157887b;
            if (h600Var != null) {
                h600Var.mo129467a(1, str);
            }
        }
    }

    private r600() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f157884a = linkedHashMap;
        linkedHashMap.put("mmcv_android_facedetect_model", new whe("mmcv_android_facedetect_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_live_fd_model", new whe("mmcv_android_live_fd_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_mace_fd_model", new whe("mmcv_android_mace_fd_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_fa_model", new whe("mmcv_android_fa_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_bodylandmark_model", new whe("mmcv_android_bodylandmark_model", true, 3, m177962f(true)));
        linkedHashMap.put("mmcv_android_od_model", new whe("mmcv_android_od_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_barenessdetect_model", new whe("mmcv_android_barenessdetect_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_mace_moment_sg_model", new whe("mmcv_android_mace_moment_sg_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_facerigv3_model", new whe("mmcv_android_facerigv3_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_facequality_model", new whe("mmcv_android_facequality_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_face_sg_model", new whe("mmcv_android_face_sg_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_fd_240_model", new whe("mmcv_android_fd_240_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_222_big_fd_model", new whe("mmcv_android_222_big_fd_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_222_small_fd_model", new whe("mmcv_android_222_small_fd_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_live_bodylandmark_model", new whe("mmcv_android_live_bodylandmark_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_live_engine_beauty_resource_model", new whe("mmcv_android_live_engine_beauty_resource_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_girl_model", new whe("mmcv_android_cartoon_girl_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_boy_model", new whe("mmcv_android_cartoon_boy_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_meiman_model", new whe("mmcv_android_cartoon_meiman_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_watercolor_model", new whe("mmcv_android_cartoon_watercolor_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_pout_model", new whe("mmcv_android_cartoon_pout_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_fake_laugh_model", new whe("mmcv_android_cartoon_fake_laugh_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_a_project_model", new whe("mmcv_android_cartoon_a_project_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_stylize_face_model", new whe("mmcv_android_stylize_face_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_small_stylize_face_model", new whe("mmcv_android_small_stylize_face_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_hand_segment_model", new whe("mmcv_android_hand_segment_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_cartoon_cry_face_model", new whe("mmcv_android_cartoon_cry_face_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_pick_nose_model", new whe("mmcv_android_pick_nose_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_ar_gift_model", new whe("mmcv_android_ar_gift_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_handgesture_model", new whe("mmcv_android_handgesture_model", true, 3, m177962f(false)));
        linkedHashMap.put("mmcv_android_byte_model", new whe("mmcv_android_byte_model", true, 3, m177962f(false)));
        xhe xheVar = new xhe(linkedHashMap, this);
        this.f157885b = xheVar;
        xheVar.m208793f();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized r600 m177960b() {
        try {
            if (f157882c == null) {
                f157883d = new Object();
                f157882c = new r600();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f157882c;
    }

    /* JADX INFO: renamed from: d */
    private File m177961d(whe wheVar) {
        synchronized (f157883d) {
            if (wheVar != null) {
                try {
                    if (wheVar.m203131g()) {
                        return vhe.m198451j(wheVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m177962f(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public File m177963c(String str) {
        return m177961d(this.f157884a.get(str));
    }

    /* JADX INFO: renamed from: e */
    public void m177964e(h600 h600Var, String... strArr) {
        if (strArr == null) {
            upk0.m194883a("dynamicResourceNames can not be empty");
        } else {
            MLog.m19459d("lclclc_", " requestAllConfigs ", new Object[0]);
            this.f157885b.m208795i(new C19647a(strArr, h600Var));
        }
    }
}
