package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class d3i implements p2i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public p2i.InterfaceC19275a<List<BubbleInfo>> f84903a;

    /* JADX INFO: renamed from: b */
    public String f84904b;

    /* JADX INFO: renamed from: c */
    public String f84905c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f84906d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public String f84907e = "";

    /* JADX INFO: renamed from: f */
    public boolean f84908f = false;

    public d3i(String str, String str2) {
        this.f84904b = str;
        this.f84905c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m113823l(Envelope envelope) {
        this.f84906d.addAll(0, ((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m113827h("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m113824m(Throwable th) {
        m113827h("");
    }

    @Override // p153l.p2i
    /* JADX INFO: renamed from: a */
    public void mo113825a(p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a) {
        this.f84903a = interfaceC19275a;
    }

    /* JADX INFO: renamed from: g */
    public String m113826g() {
        return this.f84907e;
    }

    /* JADX INFO: renamed from: h */
    public final void m113827h(String str) {
        final String str2 = FeedModule.m61406H().me_().f56859id;
        FeedModule.f39703d.m145475A7(str).subscribe(psd0.m173597H(new y20() { // from class: l.a3i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68292a.m113829j(str2, (Envelope) obj);
            }
        }, new y20() { // from class: l.b3i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74773a.m113830k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m113828i(String str, BubbleInfo bubbleInfo) {
        String str2 = this.f84904b;
        return Boolean.valueOf((str2 == null || !str2.equals(bubbleInfo.f39578id)) && !str.equals(bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m113829j(final String str, Envelope envelope) {
        this.f84906d.addAll(jyb.m147522n(((FeedData) envelope.data.getModuleData(FeedData.class)).states, new qcj() { // from class: l.c3i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79612a.m113828i(str, (BubbleInfo) obj);
            }
        }));
        this.f84907e = envelope.pagination.links.next;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f84903a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f84906d);
        }
        this.f84908f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m113830k(Throwable th) {
        this.f84908f = false;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f84903a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66663S0(th);
        }
    }

    @Override // p153l.p2i
    public void next() {
        if (TextUtils.isEmpty(m113826g()) || this.f84908f) {
            return;
        }
        m113827h(m113826g());
        this.f84908f = true;
    }

    @Override // p153l.p2i
    public void previous() {
        this.f84906d.clear();
        if (TextUtils.isEmpty(this.f84904b)) {
            m113827h("");
        } else {
            FeedModule.f39703d.m145653Z7(this.f84904b, this.f84905c).subscribe(psd0.m173597H(new y20() { // from class: l.y2i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197258a.m113823l((Envelope) obj);
                }
            }, new y20() { // from class: l.z2i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202688a.m113824m((Throwable) obj);
                }
            }));
        }
    }
}
