package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.scrap.ScrapItemView;
import com.p1.mobile.putong.live.base.data.BLiveScrapBrief;
import l.d1q;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o4e0 extends d1q<ScrapItemView> {

    /* JADX INFO: renamed from: a */
    public InterfaceC0712a f16361a;

    /* JADX INFO: renamed from: b */
    public BLiveScrapBrief f16362b;

    /* JADX INFO: renamed from: l.o4e0$a */
    public interface InterfaceC0712a {
        /* JADX INFO: renamed from: z */
        void mo15647z(o4e0 o4e0Var);
    }

    public o4e0(BLiveScrapBrief bLiveScrapBrief) {
        this.f16362b = bLiveScrapBrief;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m19206I(View view) {
        InterfaceC0712a interfaceC0712a = this.f16361a;
        if (interfaceC0712a != null) {
            interfaceC0712a.mo15647z(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m19210u(ScrapItemView scrapItemView) {
        super.u(scrapItemView);
        BLiveScrapBrief bLiveScrapBrief = this.f16362b;
        scrapItemView.m7567o0(bLiveScrapBrief, bLiveScrapBrief != null && bLiveScrapBrief.isSelected);
        xdl0.E0(scrapItemView, new View.OnClickListener() { // from class: l.n4e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15823a.m19206I(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public void m19208K(InterfaceC0712a interfaceC0712a) {
        this.f16361a = interfaceC0712a;
    }

    /* JADX INFO: renamed from: o */
    public int m19209o() {
        return t6c0.f19968p5;
    }
}
