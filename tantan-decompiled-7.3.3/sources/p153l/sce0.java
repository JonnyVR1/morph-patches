package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.ScrapItemView;

/* JADX INFO: loaded from: classes4.dex */
public class sce0 extends d3q<ScrapItemView> {

    /* JADX INFO: renamed from: a */
    public InterfaceC20016a f167248a;

    /* JADX INFO: renamed from: b */
    public BLiveScrapBrief f167249b;

    /* JADX INFO: renamed from: l.sce0$a */
    public interface InterfaceC20016a {
        /* JADX INFO: renamed from: z */
        void mo162552z(sce0 sce0Var);
    }

    public sce0(BLiveScrapBrief bLiveScrapBrief) {
        this.f167249b = bLiveScrapBrief;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m185375I(View view) {
        InterfaceC20016a interfaceC20016a = this.f167248a;
        if (interfaceC20016a != null) {
            interfaceC20016a.mo162552z(this);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(ScrapItemView scrapItemView) {
        super.mo71749u(scrapItemView);
        BLiveScrapBrief bLiveScrapBrief = this.f167249b;
        scrapItemView.m75189o0(bLiveScrapBrief, bLiveScrapBrief != null && bLiveScrapBrief.isSelected);
        bnl0.m105509E0(scrapItemView, new View.OnClickListener() { // from class: l.rce0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162204a.m185375I(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public void m185377K(InterfaceC20016a interfaceC20016a) {
        this.f167248a = interfaceC20016a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199204p5;
    }
}
