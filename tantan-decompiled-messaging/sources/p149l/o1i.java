package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class o1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC15512a<List<BubbleInfo>> f141430a;

    /* JADX INFO: renamed from: b */
    public String f141431b;

    /* JADX INFO: renamed from: c */
    public String f141432c;

    /* JADX INFO: renamed from: d */
    public List<BubbleInfo> f141433d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public String f141434e = "";

    /* JADX INFO: renamed from: f */
    public boolean f141435f = false;

    public o1i(String str, String str2) {
        this.f141431b = str;
        this.f141432c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m162246l(Envelope envelope) {
        this.f141433d.addAll(0, ((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        m162249h("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m162247m(Throwable th) {
        m162249h("");
    }

    @Override // p149l.a1i
    /* JADX INFO: renamed from: a */
    public void mo94564a(a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a) {
        this.f141430a = interfaceC15512a;
    }

    /* JADX INFO: renamed from: g */
    public String m162248g() {
        return this.f141434e;
    }

    /* JADX INFO: renamed from: h */
    public final void m162249h(String str) {
        final String str2 = FeedModule.m60222H().me_().f56011id;
        FeedModule.f38855d.m209234A7(str).subscribe(mkd0.m154956H(new e30() { // from class: l.l1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125654a.m162251j(str2, (Envelope) obj);
            }
        }, new e30() { // from class: l.m1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130833a.m162252k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m162250i(String str, BubbleInfo bubbleInfo) {
        String str2 = this.f141431b;
        return Boolean.valueOf((str2 == null || !str2.equals(bubbleInfo.f38730id)) && !str.equals(bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m162251j(final String str, Envelope envelope) {
        this.f141433d.addAll(vwb.m200339n(((FeedData) envelope.data.getModuleData(FeedData.class)).states, new w9j() { // from class: l.n1i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136636a.m162250i(str, (BubbleInfo) obj);
            }
        }));
        this.f141434e = envelope.pagination.links.next;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f141430a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f141433d);
        }
        this.f141435f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m162252k(Throwable th) {
        this.f141435f = false;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f141430a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65480S0(th);
        }
    }

    @Override // p149l.a1i
    public void next() {
        if (TextUtils.isEmpty(m162248g()) || this.f141435f) {
            return;
        }
        m162249h(m162248g());
        this.f141435f = true;
    }

    @Override // p149l.a1i
    public void previous() {
        this.f141433d.clear();
        if (TextUtils.isEmpty(this.f141431b)) {
            m162249h("");
        } else {
            FeedModule.f38855d.m209412Z7(this.f141431b, this.f141432c).subscribe(mkd0.m154956H(new e30() { // from class: l.j1i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115814a.m162246l((Envelope) obj);
                }
            }, new e30() { // from class: l.k1i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120588a.m162247m((Throwable) obj);
                }
            }));
        }
    }
}
