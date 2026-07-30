package p149l;

import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareLiveVideoItemView;

/* JADX INFO: loaded from: classes13.dex */
public class dwu extends d1q<LiveSquareLiveVideoItemView> {

    /* JADX INFO: renamed from: a */
    public LiveSquareLiveVideoItemView f88207a;

    /* JADX INFO: renamed from: b */
    public final BLiveSuggestLive f88208b;

    /* JADX INFO: renamed from: c */
    public final zyt f88209c;

    /* JADX INFO: renamed from: d */
    public cul f88210d;

    /* JADX INFO: renamed from: e */
    public final e30<Integer> f88211e;

    /* JADX INFO: renamed from: f */
    public final int f88212f;

    /* JADX INFO: renamed from: g */
    public long f88213g = 0;

    /* JADX INFO: renamed from: h */
    public int f88214h = 0;

    /* JADX INFO: renamed from: i */
    public c4g0 f88215i;

    /* JADX INFO: renamed from: l.dwu$a */
    public class C16489a extends kat {
        public C16489a() {
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: l0 */
        public void mo103940l0(int i) {
            super.mo103940l0(i);
            if (dwu.this.f88211e != null) {
                dwu.this.f88211e.call(Integer.valueOf(dwu.this.f88212f + 1));
            }
            dwu.this.f88214h |= 4;
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: u1 */
        public void mo103945u1() {
            super.mo103945u1();
            dwu.this.f88214h |= 2;
            dwu.this.f88213g = mqi0.m155944o();
        }
    }

    public dwu(BLiveSuggestLive bLiveSuggestLive, zyt zytVar, int i, e30<Integer> e30Var) {
        this.f88208b = bLiveSuggestLive;
        this.f88209c = zytVar;
        this.f88211e = e30Var;
        this.f88212f = i;
    }

    /* JADX INFO: renamed from: P */
    public BLiveSuggestLive m113951P() {
        return this.f88208b;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m113952Q(View view) {
        zyt zytVar = this.f88209c;
        BLiveSuggestLive bLiveSuggestLive = this.f88208b;
        zytVar.mo69110R2(bLiveSuggestLive, "square-curated", bLiveSuggestLive.recommendInfo.category);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m113953R(soj0 soj0Var) {
        m113956U();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView) {
        super.mo70566u(liveSquareLiveVideoItemView);
        this.f88207a = liveSquareLiveVideoItemView;
        uep0.m193309D(liveSquareLiveVideoItemView.f46335e);
        liveSquareLiveVideoItemView.f46338h.getPaint().setFakeBoldText(true);
        liveSquareLiveVideoItemView.f46336f.getPaint().setFakeBoldText(true);
        liveSquareLiveVideoItemView.f46336f.setText(this.f88208b.anchor.name);
        liveSquareLiveVideoItemView.f46337g.setText(this.f88208b.room.title);
        hxs.m133403p("context_livingAct", liveSquareLiveVideoItemView.f46334d, this.f88208b.anchor.profilePicture, 1, t100.f167266o);
        xdl0.m208329E0(liveSquareLiveVideoItemView, new View.OnClickListener() { // from class: l.bwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77709a.m113952Q(view);
            }
        });
        liveSquareLiveVideoItemView.f46339i.m68500j("https://fe-static.tancdn.com/v1/raw/31515b01-0b72-4801-b382-5b9fa7546bb112.svga", -1);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView) {
        super.mo71000w(liveSquareLiveVideoItemView);
        liveSquareLiveVideoItemView.f46339i.m68504n();
        cul culVar = this.f88210d;
        if (culVar != null) {
            culVar.mo108790b(true);
        }
        mkd0.m154992z(this.f88215i);
    }

    /* JADX INFO: renamed from: U */
    public final void m113956U() {
        cul culVar = this.f88210d;
        BLiveSuggestLive bLiveSuggestLive = this.f88208b;
        culVar.mo108798j(bLiveSuggestLive.streamFlvUrl, bLiveSuggestLive.streamFlvUrlIpv6, bLiveSuggestLive.room.f44452id, String.valueOf(bLiveSuggestLive.streamCdnInfo.provider), String.valueOf(this.f88208b.streamCdnInfo.businessType));
        this.f88214h = 1;
        this.f88210d.mo108791c(new C16489a());
    }

    /* JADX INFO: renamed from: V */
    public Pair<Long, Boolean> m113957V() {
        mkd0.m154992z(this.f88215i);
        cul culVar = this.f88210d;
        if (culVar != null) {
            culVar.mo108790b(true);
        }
        long j = this.f88213g;
        long jM155944o = (j == 0 || j >= mqi0.m155944o()) ? 0L : mqi0.m155944o() - this.f88213g;
        int i = this.f88214h;
        if ((i & 4) > 0 && (i & 2) > 0 && this.f88213g > 0) {
            this.f88213g = 0L;
            this.f88214h = 0;
            return new Pair<>(Long.valueOf(jM155944o), Boolean.TRUE);
        }
        boolean z = (i & 4) == 0;
        this.f88213g = 0L;
        this.f88214h = 0;
        return new Pair<>(Long.valueOf(jM155944o), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: W */
    public void m113958W(cul culVar) {
        cul culVar2 = this.f88210d;
        if (culVar2 != null && culVar2 != culVar) {
            culVar2.mo108790b(false);
        }
        mkd0.m154992z(this.f88215i);
        BLiveSuggestLive bLiveSuggestLive = this.f88208b;
        if (bLiveSuggestLive == null || bLiveSuggestLive.streamFlvUrl.equals(culVar.mo108797i()) || this.f88207a == null) {
            return;
        }
        this.f88210d = culVar;
        culVar.reset();
        culVar.setMute(true);
        culVar.mo108794f(this.f88207a.f46335e);
        this.f88215i = vet.m198232p(hgt.INSTANCE.m130907N(), this.f88209c.getAct(), new Object[0]).subscribe(ffw.m121197h(new e30() { // from class: l.cwu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82812a.m113953R((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m113959X(boolean z) {
        cul culVar = this.f88210d;
        if (culVar != null) {
            culVar.setMute(z);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162722Y0;
    }
}
