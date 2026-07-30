package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ypj {

    /* JADX INFO: renamed from: a */
    public final List<GiftGearsFlyView> f199457a;

    /* JADX INFO: renamed from: l.ypj$a */
    public static class C21470a {
        public static ypj INSTANCE = new ypj();
    }

    public ypj() {
        this.f199457a = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static ypj m215637c() {
        return C21470a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m215638a() {
        if (vwb.m200296J(this.f199457a)) {
            return;
        }
        this.f199457a.clear();
    }

    /* JADX INFO: renamed from: b */
    public GiftGearsFlyView m215639b(Context context) {
        return this.f199457a.isEmpty() ? (GiftGearsFlyView) LayoutInflater.from(context).inflate(t6c0.f168403k1, (ViewGroup) null) : this.f199457a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m215640d(GiftGearsFlyView giftGearsFlyView) {
        if (giftGearsFlyView == null) {
            return;
        }
        ((ViewGroup) giftGearsFlyView.getParent()).removeView(giftGearsFlyView);
        giftGearsFlyView.m73830n();
        this.f199457a.add(giftGearsFlyView);
    }
}
