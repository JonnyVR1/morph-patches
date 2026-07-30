package p153l;

import android.text.TextUtils;
import com.immomo.moment.mediautils.cmds.VideoEffects;

/* JADX INFO: loaded from: classes6.dex */
public class fe00 {

    /* JADX INFO: renamed from: a */
    public String f98533a;

    /* JADX INFO: renamed from: b */
    public String f98534b;

    /* JADX INFO: renamed from: c */
    public int f98535c = 0;

    /* JADX INFO: renamed from: d */
    public int f98536d = 0;

    /* JADX INFO: renamed from: e */
    public int f98537e = 100;

    /* JADX INFO: renamed from: f */
    public int f98538f = 0;

    /* JADX INFO: renamed from: g */
    public VideoEffects f98539g;

    /* JADX INFO: renamed from: a */
    public boolean m125154a() {
        return !TextUtils.isEmpty(this.f98534b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof fe00) {
            fe00 fe00Var = (fe00) obj;
            if (k8g0.m148709b(this.f98533a) && this.f98533a.equals(fe00Var.f98533a)) {
                return true;
            }
        }
        return false;
    }
}
