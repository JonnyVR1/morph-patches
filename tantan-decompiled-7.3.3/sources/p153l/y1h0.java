package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkSuggestItemView;

/* JADX INFO: loaded from: classes5.dex */
public class y1h0 extends d3q<PkSuggestItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveAnchor f197099a;

    /* JADX INFO: renamed from: b */
    public PkFriendInfo f197100b;

    /* JADX INFO: renamed from: c */
    public z20<BLiveAnchor, PkFriendInfo> f197101c;

    public y1h0(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        this.f197099a = bLiveAnchor;
        this.f197100b = pkFriendInfo;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(PkSuggestItemView pkSuggestItemView) {
        super.mo71749u(pkSuggestItemView);
        pkSuggestItemView.m77405e(this.f197099a, this.f197100b, this.f197101c);
    }

    /* JADX INFO: renamed from: I */
    public void m213940I(z20<BLiveAnchor, PkFriendInfo> z20Var) {
        this.f197101c = z20Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y1h0 y1h0Var = (y1h0) obj;
            if (k950.m148863a(this.f197099a.f45179id, y1h0Var.f197099a.f45179id) && k950.m148863a(Boolean.valueOf(this.f197099a.isPking), Boolean.valueOf(y1h0Var.f197099a.isPking)) && k950.m148863a(Boolean.valueOf(this.f197099a.liveSetting.unacceptPk), Boolean.valueOf(y1h0Var.f197099a.liveSetting.unacceptPk))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        BLiveAnchor bLiveAnchor = this.f197099a;
        return k950.m148864b(bLiveAnchor.f45179id, Boolean.valueOf(bLiveAnchor.isPking), Boolean.valueOf(this.f197099a.liveSetting.unacceptPk));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198743E3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return pv70.f154267r;
    }
}
