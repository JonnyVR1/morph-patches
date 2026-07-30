package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkSuggestAnchorItemView;

/* JADX INFO: loaded from: classes5.dex */
public class e280 extends d1q<PkSuggestAnchorItemView> {

    /* JADX INFO: renamed from: a */
    public final bsm<?> f88897a;

    /* JADX INFO: renamed from: b */
    public final BLivePkSuggestAnchor f88898b;

    /* JADX INFO: renamed from: c */
    public final String f88899c;

    /* JADX INFO: renamed from: d */
    public final f30<BLivePkSuggestAnchor, BLivePkInviteSource> f88900d;

    public e280(bsm<?> bsmVar, String str, BLivePkSuggestAnchor bLivePkSuggestAnchor, f30<BLivePkSuggestAnchor, BLivePkInviteSource> f30Var) {
        this.f88897a = bsmVar;
        this.f88899c = str;
        this.f88898b = bLivePkSuggestAnchor;
        this.f88900d = f30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(PkSuggestAnchorItemView pkSuggestAnchorItemView) {
        super.mo70566u(pkSuggestAnchorItemView);
        boolean zEquals = BLivePkInviteSource.query.equals(this.f88899c);
        bsm<?> bsmVar = this.f88897a;
        if (zEquals) {
            pkSuggestAnchorItemView.m76218d(bsmVar, this.f88898b, this.f88900d);
        } else {
            pkSuggestAnchorItemView.m76220f(bsmVar, this.f88898b, this.f88900d);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168023F3;
    }
}
