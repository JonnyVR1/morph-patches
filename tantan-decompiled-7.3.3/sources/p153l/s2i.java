package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class s2i implements p2i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public p2i.InterfaceC19275a<List<BubbleInfo>> f165895a;

    /* JADX INFO: renamed from: c */
    public C22507a<List<BubbleInfo>> f165897c;

    /* JADX INFO: renamed from: d */
    public String f165898d;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f165896b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f165899e = false;

    public s2i(C22507a<List<BubbleInfo>> c22507a, String str) {
        this.f165897c = c22507a;
        this.f165898d = str;
    }

    @Override // p153l.p2i
    /* JADX INFO: renamed from: a */
    public void mo113825a(p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a) {
        this.f165895a = interfaceC19275a;
    }

    /* JADX INFO: renamed from: d */
    public String m184122d() {
        return this.f165898d;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m184123e(Envelope envelope) {
        this.f165896b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f165898d = envelope.pagination.links.next;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f165895a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f165896b);
        }
        this.f165899e = false;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m184124f(Throwable th) {
        this.f165899e = false;
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f165895a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66663S0(th);
        }
    }

    @Override // p153l.p2i
    public void next() {
        if (TextUtils.isEmpty(m184122d()) || this.f165899e) {
            return;
        }
        this.f165899e = true;
        FeedModule.f39703d.m145475A7(m184122d()).subscribe(psd0.m173597H(new y20() { // from class: l.q2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155345a.m184123e((Envelope) obj);
            }
        }, new y20() { // from class: l.r2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160945a.m184124f((Throwable) obj);
            }
        }));
    }

    @Override // p153l.p2i
    public void previous() {
        this.f165896b.clear();
        this.f165896b.addAll(this.f165897c.m222761e());
        p2i.InterfaceC19275a<List<BubbleInfo>> interfaceC19275a = this.f165895a;
        if (interfaceC19275a != null) {
            interfaceC19275a.mo66669a3(this.f165896b);
        }
    }
}
