package p149l;

import android.text.TextUtils;
import com.momocv.MMFrame;
import com.momocv.objectdetect.ObjectDetect;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.objectdetect.ObjectDetectParams;

/* JADX INFO: loaded from: classes.dex */
public class n050 {

    /* JADX INFO: renamed from: a */
    private ObjectDetect f136471a;

    /* JADX INFO: renamed from: b */
    private String f136472b;

    /* JADX INFO: renamed from: l.n050$b */
    public static class C18598b {

        /* JADX INFO: renamed from: a */
        private static n050 f136473a = new n050();
    }

    /* JADX INFO: renamed from: b */
    public static n050 m157240b() {
        return C18598b.f136473a;
    }

    /* JADX INFO: renamed from: c */
    private void m157241c() {
        if (this.f136471a == null) {
            this.f136471a = new ObjectDetect();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m157242a() {
        m157241c();
        if (TextUtils.isEmpty(this.f136472b)) {
            return;
        }
        m157243d(this.f136472b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m157243d(String str) {
        m157241c();
        this.f136472b = str;
        return this.f136471a.LoadModel(str);
    }

    /* JADX INFO: renamed from: e */
    public void m157244e(MMFrame mMFrame, ObjectDetectParams objectDetectParams, ObjectDetectInfo objectDetectInfo) {
        this.f136471a.ProcessFrame(mMFrame, objectDetectParams, objectDetectInfo);
    }

    /* JADX INFO: renamed from: f */
    public void m157245f() {
        ObjectDetect objectDetect = this.f136471a;
        if (objectDetect != null) {
            objectDetect.Release();
            this.f136471a = null;
        }
    }

    private n050() {
    }
}
