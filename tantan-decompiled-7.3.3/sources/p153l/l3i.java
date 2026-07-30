package p153l;

import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l3i implements p2i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public p2i.InterfaceC19275a<List<BubbleInfo>> f129883a;

    /* JADX INFO: renamed from: b */
    public String f129884b;

    /* JADX INFO: renamed from: c */
    public String f129885c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f129886d = new ArrayList();

    public l3i(String str, String str2) {
        this.f129884b = str;
        this.f129885c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m152710d(Envelope envelope) {
        this.f129886d.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f129883a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f129886d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m152711e(Throwable th) {
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f129883a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66663S0(th);
        }
    }

    @Override // p153l.p2i
    /* JADX INFO: renamed from: a */
    public void mo113825a(p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a) {
        this.f129883a = interfaceC19275a;
    }

    @Override // p153l.p2i
    public void previous() {
        FeedModule.f39703d.m145653Z7(this.f129884b, this.f129885c).subscribe(psd0.m173597H(new y20() { // from class: l.j3i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118186a.m152710d((Envelope) obj);
            }
        }, new y20() { // from class: l.k3i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123719a.m152711e((Throwable) obj);
            }
        }));
    }

    @Override // p153l.p2i
    public void next() {
    }
}
