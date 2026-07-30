package p153l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class af00 {

    /* JADX INFO: renamed from: c */
    private static af00 f70837c;

    /* JADX INFO: renamed from: d */
    public static Object f70838d = new Object();

    /* JADX INFO: renamed from: a */
    private Map<String, aje> f70839a;

    /* JADX INFO: renamed from: b */
    private bje f70840b;

    /* JADX INFO: renamed from: l.af00$a */
    public class C15692a implements bje.InterfaceC16025b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f70841a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ qe00 f70842b;

        public C15692a(String[] strArr, qe00 qe00Var) {
            this.f70841a = strArr;
            this.f70842b = qe00Var;
        }

        @Override // p153l.bje.InterfaceC16025b
        /* JADX INFO: renamed from: a */
        public void mo97272a() {
            LinkedList linkedList = new LinkedList();
            long jM216068a = yie.m216068a();
            for (String str : this.f70841a) {
                aje ajeVar = (aje) af00.this.f70839a.get(str);
                if (ajeVar == null) {
                    mce.m157919a("do not exit dynamic resource: ", str);
                    return;
                }
                ajeVar.m98370e();
                linkedList.add(ajeVar);
                ajeVar.m98376k(jM216068a);
            }
            if (linkedList.isEmpty()) {
                return;
            }
            loh0 loh0Var = new loh0((aje[]) linkedList.toArray(new aje[linkedList.size()]));
            loh0Var.m155058f(this.f70842b);
            loh0Var.m155054a();
        }

        @Override // p153l.bje.InterfaceC16025b
        public void onFailed(String str) {
            MLog.m20460e("lclclc_", str);
            qe00 qe00Var = this.f70842b;
            if (qe00Var != null) {
                qe00Var.mo160639a(1, str);
            }
        }
    }

    private af00() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f70839a = linkedHashMap;
        linkedHashMap.put("mmcv_android_facedetect_model", new aje("mmcv_android_facedetect_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_live_fd_model", new aje("mmcv_android_live_fd_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_mace_fd_model", new aje("mmcv_android_mace_fd_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_fa_model", new aje("mmcv_android_fa_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_bodylandmark_model", new aje("mmcv_android_bodylandmark_model", true, 3, m97269f(true)));
        linkedHashMap.put("mmcv_android_od_model", new aje("mmcv_android_od_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_barenessdetect_model", new aje("mmcv_android_barenessdetect_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_mace_moment_sg_model", new aje("mmcv_android_mace_moment_sg_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_facerigv3_model", new aje("mmcv_android_facerigv3_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_facequality_model", new aje("mmcv_android_facequality_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_face_sg_model", new aje("mmcv_android_face_sg_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_fd_240_model", new aje("mmcv_android_fd_240_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_222_big_fd_model", new aje("mmcv_android_222_big_fd_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_222_small_fd_model", new aje("mmcv_android_222_small_fd_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_live_bodylandmark_model", new aje("mmcv_android_live_bodylandmark_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_live_engine_beauty_resource_model", new aje("mmcv_android_live_engine_beauty_resource_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_girl_model", new aje("mmcv_android_cartoon_girl_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_boy_model", new aje("mmcv_android_cartoon_boy_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_meiman_model", new aje("mmcv_android_cartoon_meiman_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_watercolor_model", new aje("mmcv_android_cartoon_watercolor_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_pout_model", new aje("mmcv_android_cartoon_pout_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_fake_laugh_model", new aje("mmcv_android_cartoon_fake_laugh_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_a_project_model", new aje("mmcv_android_cartoon_a_project_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_stylize_face_model", new aje("mmcv_android_stylize_face_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_small_stylize_face_model", new aje("mmcv_android_small_stylize_face_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_hand_segment_model", new aje("mmcv_android_hand_segment_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_cartoon_cry_face_model", new aje("mmcv_android_cartoon_cry_face_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_pick_nose_model", new aje("mmcv_android_pick_nose_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_ar_gift_model", new aje("mmcv_android_ar_gift_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_handgesture_model", new aje("mmcv_android_handgesture_model", true, 3, m97269f(false)));
        linkedHashMap.put("mmcv_android_byte_model", new aje("mmcv_android_byte_model", true, 3, m97269f(false)));
        bje bjeVar = new bje(linkedHashMap, this);
        this.f70840b = bjeVar;
        bjeVar.m104615f();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized af00 m97267b() {
        try {
            if (f70837c == null) {
                f70838d = new Object();
                f70837c = new af00();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f70837c;
    }

    /* JADX INFO: renamed from: d */
    private File m97268d(aje ajeVar) {
        synchronized (f70838d) {
            if (ajeVar != null) {
                try {
                    if (ajeVar.m98372g()) {
                        return zie.m219737j(ajeVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m97269f(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public File m97270c(String str) {
        return m97268d(this.f70839a.get(str));
    }

    /* JADX INFO: renamed from: e */
    public void m97271e(qe00 qe00Var, String... strArr) {
        if (strArr == null) {
            azk0.m101074a("dynamicResourceNames can not be empty");
        } else {
            MLog.m20458d("lclclc_", " requestAllConfigs ", new Object[0]);
            this.f70840b.m104617i(new C15692a(strArr, qe00Var));
        }
    }
}
