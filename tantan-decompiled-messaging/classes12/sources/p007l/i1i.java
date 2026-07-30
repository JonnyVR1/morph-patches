package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC2315a<List<BubbleInfo>> f8864a;

    /* JADX INFO: renamed from: c */
    public String f8866c;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f8865b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f8867d = false;

    @Override // p007l.a1i
    /* JADX INFO: renamed from: a */
    public void mo8397a(a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a) {
        this.f8864a = interfaceC2315a;
    }

    /* JADX INFO: renamed from: f */
    public void m10765f() {
        if (this.f8865b.size() > 0 && NullChecker.a(FeedModule.m1140H().me_()) && NullChecker.a(this.f8865b.get(0)) && TextUtils.equals(((DbObject) FeedModule.m1140H().me_()).id, this.f8865b.get(0).owner.f264id)) {
            this.f8865b.remove(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m10766g() {
        return this.f8866c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m10767h(Envelope envelope) {
        this.f8865b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f8866c = envelope.pagination.links.next;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f8864a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f8865b);
        }
        this.f8867d = false;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m10768i(Throwable th) {
        this.f8867d = false;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f8864a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6606S0(th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10769j(Envelope envelope) {
        this.f8865b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m10765f();
        this.f8866c = envelope.pagination.links.next;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f8864a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f8865b);
        }
        this.f8867d = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10770k(Throwable th) {
        this.f8867d = false;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f8864a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6606S0(th);
        }
    }

    @Override // p007l.a1i
    public void next() {
        if (TextUtils.isEmpty(m10766g()) || this.f8867d) {
            return;
        }
        this.f8867d = true;
        FeedModule.f316d.m16415A7(m10766g()).subscribe(mkd0.H(new e30() { // from class: l.g1i
            public final void call(Object obj) {
                this.f8298a.m10767h((Envelope) obj);
            }
        }, new e30() { // from class: l.h1i
            public final void call(Object obj) {
                this.f8557a.m10768i((Throwable) obj);
            }
        }));
    }

    @Override // p007l.a1i
    public void previous() {
        FeedModule.f316d.m16415A7(m10766g()).subscribe(mkd0.H(new e30() { // from class: l.e1i
            public final void call(Object obj) {
                this.f7171a.m10769j((Envelope) obj);
            }
        }, new e30() { // from class: l.f1i
            public final void call(Object obj) {
                this.f7518a.m10770k((Throwable) obj);
            }
        }));
    }
}
