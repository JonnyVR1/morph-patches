package p149l;

import android.text.TextUtils;
import com.momocv.MMFrame;
import com.momocv.handgesture.HandGesture;
import com.momocv.handgesture.HandGestureInfo;
import com.momocv.handgesture.HandGestureParams;

/* JADX INFO: loaded from: classes.dex */
public class tuk extends rw3 {

    /* JADX INFO: renamed from: d */
    private HandGesture f172184d;

    /* JADX INFO: renamed from: f */
    private String f172186f;

    /* JADX INFO: renamed from: e */
    private HandGestureParams f172185e = new HandGestureParams();

    /* JADX INFO: renamed from: g */
    private int f172187g = 0;

    /* JADX INFO: renamed from: l.tuk$a */
    public static class C20281a {

        /* JADX INFO: renamed from: a */
        private static tuk f172188a = new tuk();
    }

    /* JADX INFO: renamed from: e */
    public static tuk m190698e() {
        return C20281a.f172188a;
    }

    /* JADX INFO: renamed from: f */
    private void m190699f() {
        if (this.f172184d == null) {
            this.f172184d = new HandGesture();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m190700d() {
        m190699f();
        if (!TextUtils.isEmpty(this.f172186f)) {
            m190701g(this.f172186f);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m190701g(String str) {
        this.f172186f = str;
        m190699f();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f172184d.LoadModel(str);
    }

    /* JADX INFO: renamed from: h */
    public synchronized Object m190702h(Object obj) {
        MMFrame mMFrame = (MMFrame) obj;
        HandGestureParams handGestureParams = this.f172185e;
        handGestureParams.restore_degree_ = this.f161296a;
        handGestureParams.rotate_degree_ = this.f161297b;
        handGestureParams.fliped_show_ = this.f161298c;
        handGestureParams.handgesture_type_ = this.f172187g;
        HandGestureInfo handGestureInfo = new HandGestureInfo();
        HandGesture handGesture = this.f172184d;
        if (handGesture == null) {
            return null;
        }
        handGesture.ProcessFrame(mMFrame, this.f172185e, handGestureInfo);
        return handGestureInfo;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m190703i() {
        HandGesture handGesture = this.f172184d;
        if (handGesture != null) {
            handGesture.Release();
            this.f172184d = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m190704j(int i) {
        this.f172187g = i;
    }
}
