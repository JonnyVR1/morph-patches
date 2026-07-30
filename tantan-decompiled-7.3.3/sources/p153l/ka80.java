package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkSuggestAnchorItemView;

/* JADX INFO: loaded from: classes5.dex */
public class ka80 extends d3q<PkSuggestAnchorItemView> {

    /* JADX INFO: renamed from: a */
    public final dum<?> f124633a;

    /* JADX INFO: renamed from: b */
    public final BLivePkSuggestAnchor f124634b;

    /* JADX INFO: renamed from: c */
    public final String f124635c;

    /* JADX INFO: renamed from: d */
    public final z20<BLivePkSuggestAnchor, BLivePkInviteSource> f124636d;

    public ka80(dum<?> dumVar, String str, BLivePkSuggestAnchor bLivePkSuggestAnchor, z20<BLivePkSuggestAnchor, BLivePkInviteSource> z20Var) {
        this.f124633a = dumVar;
        this.f124635c = str;
        this.f124634b = bLivePkSuggestAnchor;
        this.f124636d = z20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(PkSuggestAnchorItemView pkSuggestAnchorItemView) {
        super.mo71749u(pkSuggestAnchorItemView);
        boolean zEquals = BLivePkInviteSource.query.equals(this.f124635c);
        dum<?> dumVar = this.f124633a;
        if (zEquals) {
            pkSuggestAnchorItemView.m77401d(dumVar, this.f124634b, this.f124636d);
        } else {
            pkSuggestAnchorItemView.m77403f(dumVar, this.f124634b, this.f124636d);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198755F3;
    }
}
