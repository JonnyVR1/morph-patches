package p153l;

import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareLiveVideoItemView;

/* JADX INFO: loaded from: classes9.dex */
public class eyu extends d3q<LiveSquareLiveVideoItemView> {

    /* JADX INFO: renamed from: a */
    public LiveSquareLiveVideoItemView f96508a;

    /* JADX INFO: renamed from: b */
    public final BLiveSuggestLive f96509b;

    /* JADX INFO: renamed from: c */
    public final a1u f96510c;

    /* JADX INFO: renamed from: d */
    public qwl f96511d;

    /* JADX INFO: renamed from: e */
    public final y20<Integer> f96512e;

    /* JADX INFO: renamed from: f */
    public final int f96513f;

    /* JADX INFO: renamed from: g */
    public long f96514g = 0;

    /* JADX INFO: renamed from: h */
    public int f96515h = 0;

    /* JADX INFO: renamed from: i */
    public kcg0 f96516i;

    /* JADX INFO: renamed from: l.eyu$a */
    public class C16868a extends lct {
        public C16868a() {
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: l0 */
        public void mo123267l0(int i) {
            super.mo123267l0(i);
            if (eyu.this.f96512e != null) {
                eyu.this.f96512e.call(Integer.valueOf(eyu.this.f96513f + 1));
            }
            eyu.this.f96515h |= 4;
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: u1 */
        public void mo120249u1() {
            super.mo120249u1();
            eyu.this.f96515h |= 2;
            eyu.this.f96514g = pzi0.m174454o();
        }
    }

    public eyu(BLiveSuggestLive bLiveSuggestLive, a1u a1uVar, int i, y20<Integer> y20Var) {
        this.f96509b = bLiveSuggestLive;
        this.f96510c = a1uVar;
        this.f96512e = y20Var;
        this.f96513f = i;
    }

    /* JADX INFO: renamed from: P */
    public BLiveSuggestLive m123258P() {
        return this.f96509b;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m123259Q(View view) {
        a1u a1uVar = this.f96510c;
        BLiveSuggestLive bLiveSuggestLive = this.f96509b;
        a1uVar.mo70293R2(bLiveSuggestLive, "square-curated", bLiveSuggestLive.recommendInfo.category);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m123260R(vxj0 vxj0Var) {
        m123263U();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView) {
        super.mo71749u(liveSquareLiveVideoItemView);
        this.f96508a = liveSquareLiveVideoItemView;
        ynp0.m216919D(liveSquareLiveVideoItemView.f47183e);
        liveSquareLiveVideoItemView.f47186h.getPaint().setFakeBoldText(true);
        liveSquareLiveVideoItemView.f47184f.getPaint().setFakeBoldText(true);
        liveSquareLiveVideoItemView.f47184f.setText(this.f96509b.anchor.name);
        liveSquareLiveVideoItemView.f47185g.setText(this.f96509b.room.title);
        izs.m142865p("context_livingAct", liveSquareLiveVideoItemView.f47182d, this.f96509b.anchor.profilePicture, 1, qa00.f156328o);
        bnl0.m105509E0(liveSquareLiveVideoItemView, new View.OnClickListener() { // from class: l.cyu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84406a.m123259Q(view);
            }
        });
        liveSquareLiveVideoItemView.f47187i.m69683j("https://fe-static.tancdn.com/v1/raw/31515b01-0b72-4801-b382-5b9fa7546bb112.svga", -1);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView) {
        super.mo72183w(liveSquareLiveVideoItemView);
        liveSquareLiveVideoItemView.f47187i.m69687n();
        qwl qwlVar = this.f96511d;
        if (qwlVar != null) {
            qwlVar.mo178522b(true);
        }
        psd0.m173633z(this.f96516i);
    }

    /* JADX INFO: renamed from: U */
    public final void m123263U() {
        qwl qwlVar = this.f96511d;
        BLiveSuggestLive bLiveSuggestLive = this.f96509b;
        qwlVar.mo178530j(bLiveSuggestLive.streamFlvUrl, bLiveSuggestLive.streamFlvUrlIpv6, bLiveSuggestLive.room.f45300id, String.valueOf(bLiveSuggestLive.streamCdnInfo.provider), String.valueOf(this.f96509b.streamCdnInfo.businessType));
        this.f96515h = 1;
        this.f96511d.mo178523c(new C16868a());
    }

    /* JADX INFO: renamed from: V */
    public Pair<Long, Boolean> m123264V() {
        psd0.m173633z(this.f96516i);
        qwl qwlVar = this.f96511d;
        if (qwlVar != null) {
            qwlVar.mo178522b(true);
        }
        long j = this.f96514g;
        long jM174454o = (j == 0 || j >= pzi0.m174454o()) ? 0L : pzi0.m174454o() - this.f96514g;
        int i = this.f96515h;
        if ((i & 4) > 0 && (i & 2) > 0 && this.f96514g > 0) {
            this.f96514g = 0L;
            this.f96515h = 0;
            return new Pair<>(Long.valueOf(jM174454o), Boolean.TRUE);
        }
        boolean z = (i & 4) == 0;
        this.f96514g = 0L;
        this.f96515h = 0;
        return new Pair<>(Long.valueOf(jM174454o), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: W */
    public void m123265W(qwl qwlVar) {
        qwl qwlVar2 = this.f96511d;
        if (qwlVar2 != null && qwlVar2 != qwlVar) {
            qwlVar2.mo178522b(false);
        }
        psd0.m173633z(this.f96516i);
        BLiveSuggestLive bLiveSuggestLive = this.f96509b;
        if (bLiveSuggestLive == null || bLiveSuggestLive.streamFlvUrl.equals(qwlVar.mo178529i()) || this.f96508a == null) {
            return;
        }
        this.f96511d = qwlVar;
        qwlVar.reset();
        qwlVar.setMute(true);
        qwlVar.mo178526f(this.f96508a.f47183e);
        this.f96516i = wgt.m206249p(iit.INSTANCE.m140128N(), this.f96510c.getAct(), new Object[0]).subscribe(dhw.m115829h(new y20() { // from class: l.dyu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91289a.m123260R((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m123266X(boolean z) {
        qwl qwlVar = this.f96511d;
        if (qwlVar != null) {
            qwlVar.setMute(z);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193836Y0;
    }
}
