package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.scrap.ScrapItemView;

/* JADX INFO: loaded from: classes4.dex */
public class o4e0 extends d1q<ScrapItemView> {

    /* JADX INFO: renamed from: a */
    public InterfaceC18839a f141766a;

    /* JADX INFO: renamed from: b */
    public BLiveScrapBrief f141767b;

    /* JADX INFO: renamed from: l.o4e0$a */
    public interface InterfaceC18839a {
        /* JADX INFO: renamed from: z */
        void mo139680z(o4e0 o4e0Var);
    }

    public o4e0(BLiveScrapBrief bLiveScrapBrief) {
        this.f141767b = bLiveScrapBrief;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m162560I(View view) {
        InterfaceC18839a interfaceC18839a = this.f141766a;
        if (interfaceC18839a != null) {
            interfaceC18839a.mo139680z(this);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(ScrapItemView scrapItemView) {
        super.mo70566u(scrapItemView);
        BLiveScrapBrief bLiveScrapBrief = this.f141767b;
        scrapItemView.m74006o0(bLiveScrapBrief, bLiveScrapBrief != null && bLiveScrapBrief.isSelected);
        xdl0.m208329E0(scrapItemView, new View.OnClickListener() { // from class: l.n4e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137093a.m162560I(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public void m162562K(InterfaceC18839a interfaceC18839a) {
        this.f141766a = interfaceC18839a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168472p5;
    }
}
