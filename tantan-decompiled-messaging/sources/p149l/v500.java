package p149l;

import android.text.TextUtils;
import com.immomo.moment.mediautils.cmds.VideoEffects;

/* JADX INFO: loaded from: classes7.dex */
public class v500 {

    /* JADX INFO: renamed from: a */
    public String f179990a;

    /* JADX INFO: renamed from: b */
    public String f179991b;

    /* JADX INFO: renamed from: c */
    public int f179992c = 0;

    /* JADX INFO: renamed from: d */
    public int f179993d = 0;

    /* JADX INFO: renamed from: e */
    public int f179994e = 100;

    /* JADX INFO: renamed from: f */
    public int f179995f = 0;

    /* JADX INFO: renamed from: g */
    public VideoEffects f179996g;

    /* JADX INFO: renamed from: a */
    public boolean m197095a() {
        return !TextUtils.isEmpty(this.f179991b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof v500) {
            v500 v500Var = (v500) obj;
            if (c0g0.m104751b(this.f179990a) && this.f179990a.equals(v500Var.f179990a)) {
                return true;
            }
        }
        return false;
    }
}
