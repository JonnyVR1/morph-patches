package com.p051p1.mobile.putong.core.p058ui.greet;

import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.subjects.C22507a;
import p153l.ar2;
import p153l.ldk;
import p153l.ner;
import p153l.vck;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8522c<V extends vck> extends ar2<V> {

    /* JADX INFO: renamed from: a */
    public C22507a<Greeting> f30296a;

    /* JADX INFO: renamed from: b */
    public String f30297b;

    /* JADX INFO: renamed from: c */
    public GreetingParam f30298c;

    /* JADX INFO: renamed from: d */
    public List<ldk> f30299d;

    /* JADX INFO: renamed from: e */
    public boolean f30300e;

    /* JADX INFO: renamed from: f */
    public boolean f30301f;

    public AbstractC8522c(ner nerVar, GreetingParam greetingParam) {
        super(nerVar);
        this.f30296a = C22507a.m222758b();
        this.f30300e = false;
        this.f30301f = false;
        this.f30297b = greetingParam.from;
        this.f30298c = greetingParam;
        this.f30299d = new ArrayList();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Iterator<ldk> it = this.f30299d.iterator();
        while (it.hasNext()) {
            it.next().mo97077b();
        }
        this.f30301f = true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        Iterator<ldk> it = this.f30299d.iterator();
        while (it.hasNext()) {
            it.next().mo97078c();
        }
        this.f30300e = true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m47071e0(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(mo47054f0());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public abstract String mo47054f0();

    /* JADX INFO: renamed from: g0 */
    public Greeting m47072g0() {
        return this.f30296a.m222761e();
    }

    public String getFrom() {
        return this.f30297b;
    }

    /* JADX INFO: renamed from: h0 */
    public GreetingParam m47073h0() {
        return this.f30298c;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo47058i0() {
        m47071e0(this.f30298c.greetInfo);
        this.f30296a.onNext(this.f30298c.greetInfo);
    }

    /* JADX INFO: renamed from: j0 */
    public void m47074j0(ldk ldkVar) {
        this.f30299d.add(ldkVar);
        if (this.f30301f) {
            ldkVar.mo97077b();
        }
        if (this.f30300e) {
            ldkVar.mo97078c();
        }
    }
}
