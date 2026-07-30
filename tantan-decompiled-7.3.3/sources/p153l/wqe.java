package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class wqe {

    /* JADX INFO: renamed from: a */
    public static Map<String, AbstractC18340l4> f190394a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static BLiveEffect m207507b(final String str, final y20<BLiveEffect> y20Var) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(str);
        aeg0 aeg0Var = new aeg0(new x20() { // from class: l.vqe
            @Override // p153l.x20
            public final void call() {
                y20Var.call(ere.m122146i().m122151h(str));
            }
        });
        if (bLiveEffectM122151h == null) {
            ere.m122146i().m122166x(str, null, aeg0Var);
            return null;
        }
        if (m207509d(bLiveEffectM122151h.type).m152744e(bLiveEffectM122151h.f45207id, true, aeg0Var)) {
            return bLiveEffectM122151h;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18340l4 m207508c(String str) {
        if (str == null) {
            return new qt40();
        }
        switch (str) {
            case "dynamicGift":
                return new jhe();
            case "game":
                return new pkj();
            case "svga":
                return new ktd0();
            case "video":
                return new jfl0();
            case "faceGift":
                return new xuf();
            default:
                return new qt40();
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC18340l4 m207509d(String str) {
        if (f190394a.containsKey(str)) {
            return f190394a.get(str);
        }
        AbstractC18340l4 abstractC18340l4M207508c = m207508c(str);
        f190394a.put(str, abstractC18340l4M207508c);
        return abstractC18340l4M207508c;
    }
}
