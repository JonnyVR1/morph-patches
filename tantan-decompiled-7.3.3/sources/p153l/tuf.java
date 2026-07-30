package p153l;

import android.text.TextUtils;
import com.momocv.beauty.BeautyProcessor;
import com.momocv.beauty.BeautyWarpInfo;
import com.momocv.beauty.BeautyWarpParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tuf {

    /* JADX INFO: renamed from: a */
    private boolean f176184a;

    /* JADX INFO: renamed from: b */
    private List<String> f176185b;

    /* JADX INFO: renamed from: c */
    private BeautyProcessor f176186c;

    /* JADX INFO: renamed from: d */
    private String f176187d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f176188e;

    /* JADX INFO: renamed from: l.tuf$b */
    public static class C20406b {

        /* JADX INFO: renamed from: a */
        private static final tuf f176189a = new tuf();
    }

    private tuf() {
        this.f176184a = false;
        this.f176188e = false;
        this.f176185b = new ArrayList(2);
    }

    /* JADX INFO: renamed from: a */
    public static tuf m192743a() {
        return C20406b.f176189a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m192744b(BeautyWarpParams beautyWarpParams, BeautyWarpInfo beautyWarpInfo) {
        if (this.f176186c == null) {
            this.f176186c = new BeautyProcessor();
        }
        if (!TextUtils.isEmpty(this.f176187d) && !this.f176188e) {
            this.f176186c.LoadWarpConfig(this.f176187d);
            this.f176188e = true;
        }
        return this.f176186c.GetWarpKeyPoints(beautyWarpParams, beautyWarpInfo);
    }

    /* JADX INFO: renamed from: c */
    public void m192745c(String str) {
        this.f176187d = str;
        this.f176188e = false;
    }

    /* JADX INFO: renamed from: d */
    public void m192746d() {
        BeautyProcessor beautyProcessor = this.f176186c;
        if (beautyProcessor != null) {
            beautyProcessor.Release();
            this.f176186c = null;
        }
    }
}
