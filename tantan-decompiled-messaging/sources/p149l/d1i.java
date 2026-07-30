package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class d1i implements a1i<List<BubbleInfo>> {

    /* JADX INFO: renamed from: a */
    public a1i.InterfaceC15512a<List<BubbleInfo>> f83265a;

    /* JADX INFO: renamed from: c */
    public C22392a<List<BubbleInfo>> f83267c;

    /* JADX INFO: renamed from: d */
    public String f83268d;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f83266b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f83269e = false;

    public d1i(C22392a<List<BubbleInfo>> c22392a, String str) {
        this.f83267c = c22392a;
        this.f83268d = str;
    }

    @Override // p149l.a1i
    /* JADX INFO: renamed from: a */
    public void mo94564a(a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a) {
        this.f83265a = interfaceC15512a;
    }

    /* JADX INFO: renamed from: d */
    public String m109616d() {
        return this.f83268d;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m109617e(Envelope envelope) {
        this.f83266b.addAll(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f83268d = envelope.pagination.links.next;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f83265a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f83266b);
        }
        this.f83269e = false;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m109618f(Throwable th) {
        this.f83269e = false;
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f83265a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65480S0(th);
        }
    }

    @Override // p149l.a1i
    public void next() {
        if (TextUtils.isEmpty(m109616d()) || this.f83269e) {
            return;
        }
        this.f83269e = true;
        FeedModule.f38855d.m209234A7(m109616d()).subscribe(mkd0.m154956H(new e30() { // from class: l.b1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72599a.m109617e((Envelope) obj);
            }
        }, new e30() { // from class: l.c1i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78274a.m109618f((Throwable) obj);
            }
        }));
    }

    @Override // p149l.a1i
    public void previous() {
        this.f83266b.clear();
        this.f83266b.addAll(this.f83267c.m221515e());
        a1i.InterfaceC15512a<List<BubbleInfo>> interfaceC15512a = this.f83265a;
        if (interfaceC15512a != null) {
            interfaceC15512a.mo65486a3(this.f83266b);
        }
    }
}
