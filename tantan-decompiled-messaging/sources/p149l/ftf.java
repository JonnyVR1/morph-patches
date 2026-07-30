package p149l;

import android.text.TextUtils;
import com.momocv.beauty.BeautyProcessor;
import com.momocv.beauty.BeautyWarpInfo;
import com.momocv.beauty.BeautyWarpParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ftf {

    /* JADX INFO: renamed from: a */
    private boolean f99189a;

    /* JADX INFO: renamed from: b */
    private List<String> f99190b;

    /* JADX INFO: renamed from: c */
    private BeautyProcessor f99191c;

    /* JADX INFO: renamed from: d */
    private String f99192d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f99193e;

    /* JADX INFO: renamed from: l.ftf$b */
    public static class C16920b {

        /* JADX INFO: renamed from: a */
        private static final ftf f99194a = new ftf();
    }

    private ftf() {
        this.f99189a = false;
        this.f99193e = false;
        this.f99190b = new ArrayList(2);
    }

    /* JADX INFO: renamed from: a */
    public static ftf m123031a() {
        return C16920b.f99194a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m123032b(BeautyWarpParams beautyWarpParams, BeautyWarpInfo beautyWarpInfo) {
        if (this.f99191c == null) {
            this.f99191c = new BeautyProcessor();
        }
        if (!TextUtils.isEmpty(this.f99192d) && !this.f99193e) {
            this.f99191c.LoadWarpConfig(this.f99192d);
            this.f99193e = true;
        }
        return this.f99191c.GetWarpKeyPoints(beautyWarpParams, beautyWarpInfo);
    }

    /* JADX INFO: renamed from: c */
    public void m123033c(String str) {
        this.f99192d = str;
        this.f99193e = false;
    }

    /* JADX INFO: renamed from: d */
    public void m123034d() {
        BeautyProcessor beautyProcessor = this.f99191c;
        if (beautyProcessor != null) {
            beautyProcessor.Release();
            this.f99191c = null;
        }
    }
}
