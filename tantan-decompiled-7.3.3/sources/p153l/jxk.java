package p153l;

import android.text.TextUtils;
import com.momocv.MMFrame;
import com.momocv.handgesture.HandGesture;
import com.momocv.handgesture.HandGestureInfo;
import com.momocv.handgesture.HandGestureParams;

/* JADX INFO: loaded from: classes.dex */
public class jxk extends qx3 {

    /* JADX INFO: renamed from: d */
    private HandGesture f123040d;

    /* JADX INFO: renamed from: f */
    private String f123042f;

    /* JADX INFO: renamed from: e */
    private HandGestureParams f123041e = new HandGestureParams();

    /* JADX INFO: renamed from: g */
    private int f123043g = 0;

    /* JADX INFO: renamed from: l.jxk$a */
    public static class C18052a {

        /* JADX INFO: renamed from: a */
        private static jxk f123044a = new jxk();
    }

    /* JADX INFO: renamed from: e */
    public static jxk m147356e() {
        return C18052a.f123044a;
    }

    /* JADX INFO: renamed from: f */
    private void m147357f() {
        if (this.f123040d == null) {
            this.f123040d = new HandGesture();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m147358d() {
        m147357f();
        if (!TextUtils.isEmpty(this.f123042f)) {
            m147359g(this.f123042f);
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m147359g(String str) {
        this.f123042f = str;
        m147357f();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f123040d.LoadModel(str);
    }

    /* JADX INFO: renamed from: h */
    public synchronized Object m147360h(Object obj) {
        MMFrame mMFrame = (MMFrame) obj;
        HandGestureParams handGestureParams = this.f123041e;
        handGestureParams.restore_degree_ = this.f160005a;
        handGestureParams.rotate_degree_ = this.f160006b;
        handGestureParams.fliped_show_ = this.f160007c;
        handGestureParams.handgesture_type_ = this.f123043g;
        HandGestureInfo handGestureInfo = new HandGestureInfo();
        HandGesture handGesture = this.f123040d;
        if (handGesture == null) {
            return null;
        }
        handGesture.ProcessFrame(mMFrame, this.f123041e, handGestureInfo);
        return handGestureInfo;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m147361i() {
        HandGesture handGesture = this.f123040d;
        if (handGesture != null) {
            handGesture.Release();
            this.f123040d = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m147362j(int i) {
        this.f123043g = i;
    }
}
