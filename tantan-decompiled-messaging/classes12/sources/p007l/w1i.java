package p007l;

import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC2315a<List<BubbleInfo>> f14365a;

    /* JADX INFO: renamed from: b */
    public String f14366b;

    /* JADX INFO: renamed from: c */
    public String f14367c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f14368d = new ArrayList();

    public w1i(String str, String str2) {
        this.f14366b = str;
        this.f14367c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m15675d(Envelope envelope) {
        this.f14368d.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f14365a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f14368d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m15676e(Throwable th) {
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f14365a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6606S0(th);
        }
    }

    @Override // p007l.a1i
    /* JADX INFO: renamed from: a */
    public void mo8397a(a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a) {
        this.f14365a = interfaceC2315a;
    }

    @Override // p007l.a1i
    public void previous() {
        FeedModule.f316d.m16593Z7(this.f14366b, this.f14367c).subscribe(mkd0.H(new e30() { // from class: l.u1i
            public final void call(Object obj) {
                this.f13493a.m15675d((Envelope) obj);
            }
        }, new e30() { // from class: l.v1i
            public final void call(Object obj) {
                this.f14019a.m15676e((Throwable) obj);
            }
        }));
    }

    @Override // p007l.a1i
    public void next() {
    }
}
