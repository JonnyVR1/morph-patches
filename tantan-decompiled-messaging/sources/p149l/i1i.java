package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class i1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC15512a<List<BubbleInfo>> f110458a;

    /* JADX INFO: renamed from: c */
    public String f110460c;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f110459b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f110461d = false;

    @Override // p149l.a1i
    /* JADX INFO: renamed from: a */
    public void mo94564a(a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a) {
        this.f110458a = interfaceC15512a;
    }

    /* JADX INFO: renamed from: f */
    public void m133990f() {
        if (this.f110459b.size() > 0 && NullChecker.m81303a(FeedModule.m60222H().me_()) && NullChecker.m81303a(this.f110459b.get(0)) && TextUtils.equals(FeedModule.m60222H().me_().f56011id, this.f110459b.get(0).owner.f38803id)) {
            this.f110459b.remove(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m133991g() {
        return this.f110460c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m133992h(Envelope envelope) {
        this.f110459b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f110460c = envelope.pagination.links.next;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f110458a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f110459b);
        }
        this.f110461d = false;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m133993i(Throwable th) {
        this.f110461d = false;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f110458a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65480S0(th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m133994j(Envelope envelope) {
        this.f110459b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m133990f();
        this.f110460c = envelope.pagination.links.next;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f110458a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f110459b);
        }
        this.f110461d = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m133995k(Throwable th) {
        this.f110461d = false;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f110458a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65480S0(th);
        }
    }

    @Override // p149l.a1i
    public void next() {
        if (TextUtils.isEmpty(m133991g()) || this.f110461d) {
            return;
        }
        this.f110461d = true;
        FeedModule.f38855d.m209234A7(m133991g()).subscribe(mkd0.m154956H(new e30() { // from class: l.g1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100180a.m133992h((Envelope) obj);
            }
        }, new e30() { // from class: l.h1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105431a.m133993i((Throwable) obj);
            }
        }));
    }

    @Override // p149l.a1i
    public void previous() {
        FeedModule.f38855d.m209234A7(m133991g()).subscribe(mkd0.m154956H(new e30() { // from class: l.e1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88829a.m133994j((Envelope) obj);
            }
        }, new e30() { // from class: l.f1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94098a.m133995k((Throwable) obj);
            }
        }));
    }
}
