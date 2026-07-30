package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class spe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC18387m4> f165852a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static BLiveEffect m185363b(final String str, final e30<BLiveEffect> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(str);
        s5g0 s5g0Var = new s5g0(new d30() { // from class: l.rpe
            @Override // p149l.d30
            public final void call() {
                e30Var.call(aqe.m98261i().m98266h(str));
            }
        });
        if (bLiveEffectM98266h == null) {
            aqe.m98261i().m98281x(str, null, s5g0Var);
            return null;
        }
        if (m185365d(bLiveEffectM98266h.type).m152982e(bLiveEffectM98266h.f44359id, true, s5g0Var)) {
            return bLiveEffectM98266h;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18387m4 m185364c(String str) {
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
    public static AbstractC18387m4 m185365d(String str) {
        if (f165852a.containsKey(str)) {
            return f165852a.get(str);
        }
        AbstractC18387m4 abstractC18387m4M185364c = m185364c(str);
        f165852a.put(str, abstractC18387m4M185364c);
        return abstractC18387m4M185364c;
    }
}
