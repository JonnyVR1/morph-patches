package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class osj {

    /* JADX INFO: renamed from: a */
    public final List<GiftGearsFlyView> f148879a;

    /* JADX INFO: renamed from: l.osj$a */
    public static class C19205a {
        public static osj INSTANCE = new osj();
    }

    public osj() {
        this.f148879a = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static osj m169050c() {
        return C19205a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m169051a() {
        if (jyb.m147479J(this.f148879a)) {
            return;
        }
        this.f148879a.clear();
    }

    /* JADX INFO: renamed from: b */
    public GiftGearsFlyView m169052b(Context context) {
        return this.f148879a.isEmpty() ? (GiftGearsFlyView) LayoutInflater.from(context).inflate(yec0.f199135k1, (ViewGroup) null) : this.f148879a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m169053d(GiftGearsFlyView giftGearsFlyView) {
        if (giftGearsFlyView == null) {
            return;
        }
        ((ViewGroup) giftGearsFlyView.getParent()).removeView(giftGearsFlyView);
        giftGearsFlyView.m75013n();
        this.f148879a.add(giftGearsFlyView);
    }
}
