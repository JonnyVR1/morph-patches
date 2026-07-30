package p149l;

import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class w1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC15512a<List<BubbleInfo>> f184008a;

    /* JADX INFO: renamed from: b */
    public String f184009b;

    /* JADX INFO: renamed from: c */
    public String f184010c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f184011d = new ArrayList();

    public w1i(String str, String str2) {
        this.f184009b = str;
        this.f184010c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m200934d(Envelope envelope) {
        this.f184011d.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f184008a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f184011d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m200935e(Throwable th) {
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f184008a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65480S0(th);
        }
    }

    @Override // p149l.a1i
    /* JADX INFO: renamed from: a */
    public void mo94564a(a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a) {
        this.f184008a = interfaceC15512a;
    }

    @Override // p149l.a1i
    public void previous() {
        FeedModule.f38855d.m209412Z7(this.f184009b, this.f184010c).subscribe(mkd0.m154956H(new e30() { // from class: l.u1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173016a.m200934d((Envelope) obj);
            }
        }, new e30() { // from class: l.v1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179252a.m200935e((Throwable) obj);
            }
        }));
    }

    @Override // p149l.a1i
    public void next() {
    }
}
