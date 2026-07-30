package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC2315a<List<BubbleInfo>> f10973a;

    /* JADX INFO: renamed from: b */
    public String f10974b;

    /* JADX INFO: renamed from: c */
    public String f10975c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f10976d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public String f10977e = "";

    /* JADX INFO: renamed from: f */
    public boolean f10978f = false;

    public o1i(String str, String str2) {
        this.f10974b = str;
        this.f10975c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m12418l(Envelope envelope) {
        this.f10976d.addAll(0, ((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m12421h("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m12419m(Throwable th) {
        m12421h("");
    }

    @Override // p007l.a1i
    /* JADX INFO: renamed from: a */
    public void mo8397a(a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a) {
        this.f10973a = interfaceC2315a;
    }

    /* JADX INFO: renamed from: g */
    public String m12420g() {
        return this.f10977e;
    }

    /* JADX INFO: renamed from: h */
    public final void m12421h(String str) {
        final String str2 = ((DbObject) FeedModule.m1140H().me_()).id;
        FeedModule.f316d.m16415A7(str).subscribe(mkd0.H(new e30() { // from class: l.l1i
            public final void call(Object obj) {
                this.f9844a.m12423j(str2, (Envelope) obj);
            }
        }, new e30() { // from class: l.m1i
            public final void call(Object obj) {
                this.f10184a.m12424k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m12422i(String str, BubbleInfo bubbleInfo) {
        String str2 = this.f10974b;
        return Boolean.valueOf((str2 == null || !str2.equals(bubbleInfo.f191id)) && !str.equals(bubbleInfo.owner.f264id));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12423j(final String str, Envelope envelope) {
        this.f10976d.addAll(vwb.n(((FeedData) envelope.data.getModuleData(FeedData.class)).states, new w9j() { // from class: l.n1i
            public final Object call(Object obj) {
                return this.f10621a.m12422i(str, (BubbleInfo) obj);
            }
        }));
        this.f10977e = envelope.pagination.links.next;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f10973a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f10976d);
        }
        this.f10978f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m12424k(Throwable th) {
        this.f10978f = false;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f10973a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6606S0(th);
        }
    }

    @Override // p007l.a1i
    public void next() {
        if (TextUtils.isEmpty(m12420g()) || this.f10978f) {
            return;
        }
        m12421h(m12420g());
        this.f10978f = true;
    }

    @Override // p007l.a1i
    public void previous() {
        this.f10976d.clear();
        if (TextUtils.isEmpty(this.f10974b)) {
            m12421h("");
        } else {
            FeedModule.f316d.m16593Z7(this.f10974b, this.f10975c).subscribe(mkd0.H(new e30() { // from class: l.j1i
                public final void call(Object obj) {
                    this.f9183a.m12418l((Envelope) obj);
                }
            }, new e30() { // from class: l.k1i
                public final void call(Object obj) {
                    this.f9571a.m12419m((Throwable) obj);
                }
            }));
        }
    }
}
