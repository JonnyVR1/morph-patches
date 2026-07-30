package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkSuggestItemView;

/* JADX INFO: loaded from: classes5.dex */
public class qtg0 extends d1q<PkSuggestItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveAnchor f156354a;

    /* JADX INFO: renamed from: b */
    public PkFriendInfo f156355b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveAnchor, PkFriendInfo> f156356c;

    public qtg0(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        this.f156354a = bLiveAnchor;
        this.f156355b = pkFriendInfo;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(PkSuggestItemView pkSuggestItemView) {
        super.mo70566u(pkSuggestItemView);
        pkSuggestItemView.m76222e(this.f156354a, this.f156355b, this.f156356c);
    }

    /* JADX INFO: renamed from: I */
    public void m176446I(f30<BLiveAnchor, PkFriendInfo> f30Var) {
        this.f156356c = f30Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qtg0 qtg0Var = (qtg0) obj;
            if (v050.m196470a(this.f156354a.f44331id, qtg0Var.f156354a.f44331id) && v050.m196470a(Boolean.valueOf(this.f156354a.isPking), Boolean.valueOf(qtg0Var.f156354a.isPking)) && v050.m196470a(Boolean.valueOf(this.f156354a.liveSetting.unacceptPk), Boolean.valueOf(qtg0Var.f156354a.liveSetting.unacceptPk))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        BLiveAnchor bLiveAnchor = this.f156354a;
        return v050.m196471b(bLiveAnchor.f44331id, Boolean.valueOf(bLiveAnchor.isPking), Boolean.valueOf(this.f156354a.liveSetting.unacceptPk));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168011E3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return jn70.f118827r;
    }
}
