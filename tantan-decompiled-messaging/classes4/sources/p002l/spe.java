package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import java.util.HashMap;
import java.util.Map;
import l.d30;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class spe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC0675m4> f19236a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static BLiveEffect m22602b(final String str, final e30<BLiveEffect> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(str);
        s5g0 s5g0Var = new s5g0(new d30() { // from class: l.rpe
            public final void call() {
                e30Var.call(aqe.m10039i().m10044h(str));
            }
        });
        if (bLiveEffectM10044h == null) {
            aqe.m10039i().m10059x(str, null, s5g0Var);
            return null;
        }
        if (m22604d(bLiveEffectM10044h.type).m17695e(bLiveEffectM10044h.id, true, s5g0Var)) {
            return bLiveEffectM10044h;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0675m4 m22603c(String str) {
        if (str == null) {
            return new cl40();
        }
        switch (str) {
            case "dynamicGift":
                return new fge();
            case "game":
                return new vhj();
            case "svga":
                return new ild0();
            case "video":
                return new f6l0();
            case "faceGift":
                return new jtf();
            default:
                return new cl40();
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC0675m4 m22604d(String str) {
        if (f19236a.containsKey(str)) {
            return f19236a.get(str);
        }
        AbstractC0675m4 abstractC0675m4M22603c = m22603c(str);
        f19236a.put(str, abstractC0675m4M22603c);
        return abstractC0675m4M22603c;
    }
}
