package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFriendItemView;

/* JADX INFO: loaded from: classes5.dex */
public class t6j extends d1q<PkFriendItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveAnchor f168619a;

    /* JADX INFO: renamed from: b */
    public PkFriendInfo f168620b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveAnchor, PkFriendInfo> f168621c;

    public t6j(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        this.f168619a = bLiveAnchor;
        this.f168620b = pkFriendInfo;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(PkFriendItemView pkFriendItemView) {
        super.mo70566u(pkFriendItemView);
        pkFriendItemView.m76170e(this.f168619a, this.f168620b, this.f168621c);
    }

    /* JADX INFO: renamed from: I */
    public void m187382I(f30<BLiveAnchor, PkFriendInfo> f30Var) {
        this.f168621c = f30Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t6j t6jVar = (t6j) obj;
            if (v050.m196470a(this.f168619a.f44331id, t6jVar.f168619a.f44331id) && v050.m196470a(Boolean.valueOf(this.f168619a.isPking), Boolean.valueOf(t6jVar.f168619a.isPking)) && v050.m196470a(Boolean.valueOf(this.f168619a.liveSetting.unacceptPk), Boolean.valueOf(t6jVar.f168619a.liveSetting.unacceptPk))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        BLiveAnchor bLiveAnchor = this.f168619a;
        return v050.m196471b(bLiveAnchor.f44331id, Boolean.valueOf(bLiveAnchor.isPking), Boolean.valueOf(this.f168619a.liveSetting.unacceptPk));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167987C3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return jn70.f118826q;
    }
}
