package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kpj {

    /* JADX INFO: renamed from: a */
    public final List<BLiveGiftSkin> f127893a;

    /* JADX INFO: renamed from: b */
    public final BLiveHierarchyProgress f127894b;

    public kpj(List<BLiveGiftSkin> list, BLiveHierarchyProgress bLiveHierarchyProgress) {
        this.f127893a = list;
        this.f127894b = bLiveHierarchyProgress;
    }

    /* JADX INFO: renamed from: d */
    public boolean m150732d() {
        return !jyb.m147479J(this.f127893a);
    }

    /* JADX INFO: renamed from: e */
    public boolean m150733e() {
        return this.f127894b != null && jyb.m147479J(this.f127893a);
    }

    /* JADX INFO: renamed from: f */
    public BLiveGiftSkin m150734f() {
        if (m150732d()) {
            return this.f127893a.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public BLiveGiftSkin m150735g(final int i) {
        if (m150732d()) {
            return (BLiveGiftSkin) jyb.m147529r(this.f127893a, new qcj() { // from class: l.hpj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveGiftSkin) obj).bindGiftId.contains(Integer.valueOf(i)));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftSkin m150736h(final int i) {
        if (!m150732d()) {
            return null;
        }
        BLiveGiftSkin bLiveGiftSkin = (BLiveGiftSkin) jyb.m147529r(this.f127893a, new qcj() { // from class: l.ipj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftSkin) obj).bindTabId.contains(Integer.valueOf(i)));
            }
        });
        return bLiveGiftSkin == null ? (BLiveGiftSkin) jyb.m147529r(this.f127893a, new qcj() { // from class: l.jpj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147479J(((BLiveGiftSkin) obj).bindTabId));
            }
        }) : bLiveGiftSkin;
    }

    /* JADX INFO: renamed from: i */
    public BLiveHierarchyProgress m150737i() {
        return this.f127894b;
    }
}
