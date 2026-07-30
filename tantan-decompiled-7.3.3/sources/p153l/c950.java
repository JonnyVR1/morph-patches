package p153l;

import android.text.TextUtils;
import com.momocv.MMFrame;
import com.momocv.objectdetect.ObjectDetect;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.objectdetect.ObjectDetectParams;

/* JADX INFO: loaded from: classes.dex */
public class c950 {

    /* JADX INFO: renamed from: a */
    private ObjectDetect f80297a;

    /* JADX INFO: renamed from: b */
    private String f80298b;

    /* JADX INFO: renamed from: l.c950$b */
    public static class C16215b {

        /* JADX INFO: renamed from: a */
        private static c950 f80299a = new c950();
    }

    /* JADX INFO: renamed from: b */
    public static c950 m108407b() {
        return C16215b.f80299a;
    }

    /* JADX INFO: renamed from: c */
    private void m108408c() {
        if (this.f80297a == null) {
            this.f80297a = new ObjectDetect();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m108409a() {
        m108408c();
        if (TextUtils.isEmpty(this.f80298b)) {
            return;
        }
        m108410d(this.f80298b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m108410d(String str) {
        m108408c();
        this.f80298b = str;
        return this.f80297a.LoadModel(str);
    }

    /* JADX INFO: renamed from: e */
    public void m108411e(MMFrame mMFrame, ObjectDetectParams objectDetectParams, ObjectDetectInfo objectDetectInfo) {
        this.f80297a.ProcessFrame(mMFrame, objectDetectParams, objectDetectInfo);
    }

    /* JADX INFO: renamed from: f */
    public void m108412f() {
        ObjectDetect objectDetect = this.f80297a;
        if (objectDetect != null) {
            objectDetect.Release();
            this.f80297a = null;
        }
    }

    private c950() {
    }
}
