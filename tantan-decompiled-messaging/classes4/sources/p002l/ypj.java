package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ypj {

    /* JADX INFO: renamed from: a */
    public final List<GiftGearsFlyView> f23032a;

    /* JADX INFO: renamed from: l.ypj$a */
    public static class C0926a {
        public static ypj INSTANCE = new ypj();
    }

    public ypj() {
        this.f23032a = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static ypj m26870c() {
        return C0926a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m26871a() {
        if (vwb.J(this.f23032a)) {
            return;
        }
        this.f23032a.clear();
    }

    /* JADX INFO: renamed from: b */
    public GiftGearsFlyView m26872b(Context context) {
        return this.f23032a.isEmpty() ? (GiftGearsFlyView) LayoutInflater.from(context).inflate(t6c0.f19899k1, (ViewGroup) null) : this.f23032a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m26873d(GiftGearsFlyView giftGearsFlyView) {
        if (giftGearsFlyView == null) {
            return;
        }
        ((ViewGroup) giftGearsFlyView.getParent()).removeView(giftGearsFlyView);
        giftGearsFlyView.m7386n();
        this.f23032a.add(giftGearsFlyView);
    }
}
