package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFriendItemView;

/* JADX INFO: loaded from: classes5.dex */
public class n9j extends d3q<PkFriendItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveAnchor f140893a;

    /* JADX INFO: renamed from: b */
    public PkFriendInfo f140894b;

    /* JADX INFO: renamed from: c */
    public z20<BLiveAnchor, PkFriendInfo> f140895c;

    public n9j(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        this.f140893a = bLiveAnchor;
        this.f140894b = pkFriendInfo;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(PkFriendItemView pkFriendItemView) {
        super.mo71749u(pkFriendItemView);
        pkFriendItemView.m77353e(this.f140893a, this.f140894b, this.f140895c);
    }

    /* JADX INFO: renamed from: I */
    public void m161983I(z20<BLiveAnchor, PkFriendInfo> z20Var) {
        this.f140895c = z20Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            n9j n9jVar = (n9j) obj;
            if (k950.m148863a(this.f140893a.f45179id, n9jVar.f140893a.f45179id) && k950.m148863a(Boolean.valueOf(this.f140893a.isPking), Boolean.valueOf(n9jVar.f140893a.isPking)) && k950.m148863a(Boolean.valueOf(this.f140893a.liveSetting.unacceptPk), Boolean.valueOf(n9jVar.f140893a.liveSetting.unacceptPk))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        BLiveAnchor bLiveAnchor = this.f140893a;
        return k950.m148864b(bLiveAnchor.f45179id, Boolean.valueOf(bLiveAnchor.isPking), Boolean.valueOf(this.f140893a.liveSetting.unacceptPk));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198719C3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return pv70.f154266q;
    }
}
