package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class x2i implements p2i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public p2i.InterfaceC19275a<List<BubbleInfo>> f192151a;

    /* JADX INFO: renamed from: c */
    public String f192153c;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f192152b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f192154d = false;

    @Override // p153l.p2i
    /* JADX INFO: renamed from: a */
    public void mo113825a(p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a) {
        this.f192151a = interfaceC19275a;
    }

    /* JADX INFO: renamed from: f */
    public void m209149f() {
        if (this.f192152b.size() > 0 && NullChecker.m82486a(FeedModule.m61406H().me_()) && NullChecker.m82486a(this.f192152b.get(0)) && TextUtils.equals(FeedModule.m61406H().me_().f56859id, this.f192152b.get(0).owner.f39651id)) {
            this.f192152b.remove(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m209150g() {
        return this.f192153c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m209151h(Envelope envelope) {
        this.f192152b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f192153c = envelope.pagination.links.next;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f192151a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f192152b);
        }
        this.f192154d = false;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m209152i(Throwable th) {
        this.f192154d = false;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f192151a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66663S0(th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m209153j(Envelope envelope) {
        this.f192152b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m209149f();
        this.f192153c = envelope.pagination.links.next;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f192151a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f192152b);
        }
        this.f192154d = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m209154k(Throwable th) {
        this.f192154d = false;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f192151a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66663S0(th);
        }
    }

    @Override // p153l.p2i
    public void next() {
        if (TextUtils.isEmpty(m209150g()) || this.f192154d) {
            return;
        }
        this.f192154d = true;
        FeedModule.f39703d.m145475A7(m209150g()).subscribe(psd0.m173597H(new y20() { // from class: l.v2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182093a.m209151h((Envelope) obj);
            }
        }, new y20() { // from class: l.w2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186900a.m209152i((Throwable) obj);
            }
        }));
    }

    @Override // p153l.p2i
    public void previous() {
        FeedModule.f39703d.m145475A7(m209150g()).subscribe(psd0.m173597H(new y20() { // from class: l.t2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171762a.m209153j((Envelope) obj);
            }
        }, new y20() { // from class: l.u2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177217a.m209154k((Throwable) obj);
            }
        }));
    }
}
