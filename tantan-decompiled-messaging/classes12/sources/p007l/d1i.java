package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.mkd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC2315a<List<BubbleInfo>> f6773a;

    /* JADX INFO: renamed from: c */
    public a<List<BubbleInfo>> f6775c;

    /* JADX INFO: renamed from: d */
    public String f6776d;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f6774b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f6777e = false;

    public d1i(a<List<BubbleInfo>> aVar, String str) {
        this.f6775c = aVar;
        this.f6776d = str;
    }

    @Override // p007l.a1i
    /* JADX INFO: renamed from: a */
    public void mo8397a(a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a) {
        this.f6773a = interfaceC2315a;
    }

    /* JADX INFO: renamed from: d */
    public String m9293d() {
        return this.f6776d;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9294e(Envelope envelope) {
        this.f6774b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f6776d = envelope.pagination.links.next;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f6773a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f6774b);
        }
        this.f6777e = false;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9295f(Throwable th) {
        this.f6777e = false;
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f6773a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6606S0(th);
        }
    }

    @Override // p007l.a1i
    public void next() {
        if (TextUtils.isEmpty(m9293d()) || this.f6777e) {
            return;
        }
        this.f6777e = true;
        FeedModule.f316d.m16415A7(m9293d()).subscribe(mkd0.H(new e30() { // from class: l.b1i
            public final void call(Object obj) {
                this.f5888a.m9294e((Envelope) obj);
            }
        }, new e30() { // from class: l.c1i
            public final void call(Object obj) {
                this.f6489a.m9295f((Throwable) obj);
            }
        }));
    }

    @Override // p007l.a1i
    public void previous() {
        this.f6774b.clear();
        this.f6774b.addAll((Collection) this.f6775c.e());
        a1i.InterfaceC2315a<List<BubbleInfo>> interfaceC2315a = this.f6773a;
        if (interfaceC2315a != null) {
            interfaceC2315a.mo6612a3(this.f6774b);
        }
    }
}
