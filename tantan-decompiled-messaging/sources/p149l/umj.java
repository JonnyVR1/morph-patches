package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class umj {

    /* JADX INFO: renamed from: a */
    public final List<BLiveGiftSkin> f177259a;

    /* JADX INFO: renamed from: b */
    public final BLiveHierarchyProgress f177260b;

    public umj(List<BLiveGiftSkin> list, BLiveHierarchyProgress bLiveHierarchyProgress) {
        this.f177259a = list;
        this.f177260b = bLiveHierarchyProgress;
    }

    /* JADX INFO: renamed from: d */
    public boolean m194367d() {
        return !vwb.m200296J(this.f177259a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m194368e() {
        return this.f177260b != null && vwb.m200296J(this.f177259a);
    }

    /* JADX INFO: renamed from: f */
    public BLiveGiftSkin m194369f() {
        if (m194367d()) {
            return this.f177259a.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public BLiveGiftSkin m194370g(final int i) {
        if (m194367d()) {
            return (BLiveGiftSkin) vwb.m200346r(this.f177259a, new w9j() { // from class: l.rmj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveGiftSkin) obj).bindGiftId.contains(Integer.valueOf(i)));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftSkin m194371h(final int i) {
        if (!m194367d()) {
            return null;
        }
        BLiveGiftSkin bLiveGiftSkin = (BLiveGiftSkin) vwb.m200346r(this.f177259a, new w9j() { // from class: l.smj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftSkin) obj).bindTabId.contains(Integer.valueOf(i)));
            }
        });
        return bLiveGiftSkin == null ? (BLiveGiftSkin) vwb.m200346r(this.f177259a, new w9j() { // from class: l.tmj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200296J(((BLiveGiftSkin) obj).bindTabId));
            }
        }) : bLiveGiftSkin;
    }

    /* JADX INFO: renamed from: i */
    public BLiveHierarchyProgress m194372i() {
        return this.f177260b;
    }
}
