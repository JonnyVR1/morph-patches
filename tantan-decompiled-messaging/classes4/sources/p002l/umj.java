package p002l;

import com.p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class umj {

    /* JADX INFO: renamed from: a */
    public final List<BLiveGiftSkin> f20720a;

    /* JADX INFO: renamed from: b */
    public final BLiveHierarchyProgress f20721b;

    public umj(List<BLiveGiftSkin> list, BLiveHierarchyProgress bLiveHierarchyProgress) {
        this.f20720a = list;
        this.f20721b = bLiveHierarchyProgress;
    }

    /* JADX INFO: renamed from: d */
    public boolean m23557d() {
        return !vwb.J(this.f20720a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m23558e() {
        return this.f20721b != null && vwb.J(this.f20720a);
    }

    /* JADX INFO: renamed from: f */
    public BLiveGiftSkin m23559f() {
        if (m23557d()) {
            return this.f20720a.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public BLiveGiftSkin m23560g(final int i) {
        if (m23557d()) {
            return (BLiveGiftSkin) vwb.r(this.f20720a, new w9j() { // from class: l.rmj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveGiftSkin) obj).bindGiftId.contains(Integer.valueOf(i)));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftSkin m23561h(final int i) {
        if (!m23557d()) {
            return null;
        }
        BLiveGiftSkin bLiveGiftSkin = (BLiveGiftSkin) vwb.r(this.f20720a, new w9j() { // from class: l.smj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftSkin) obj).bindTabId.contains(Integer.valueOf(i)));
            }
        });
        return bLiveGiftSkin == null ? (BLiveGiftSkin) vwb.r(this.f20720a, new w9j() { // from class: l.tmj
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.J(((BLiveGiftSkin) obj).bindTabId));
            }
        }) : bLiveGiftSkin;
    }

    /* JADX INFO: renamed from: i */
    public BLiveHierarchyProgress m23562i() {
        return this.f20721b;
    }
}
