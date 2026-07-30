package com.p000p1.mobile.putong.core.p001ui.greet;

import com.p000p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.jq2;
import l.mcr;
import p003l.eak;
import p003l.uak;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class AbstractC3134c<V extends eak> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public a<Greeting> f1842a;

    /* JADX INFO: renamed from: b */
    public String f1843b;

    /* JADX INFO: renamed from: c */
    public GreetingParam f1844c;

    /* JADX INFO: renamed from: d */
    public List<uak> f1845d;

    /* JADX INFO: renamed from: e */
    public boolean f1846e;

    /* JADX INFO: renamed from: f */
    public boolean f1847f;

    public AbstractC3134c(mcr mcrVar, GreetingParam greetingParam) {
        super(mcrVar);
        this.f1842a = a.b();
        this.f1846e = false;
        this.f1847f = false;
        this.f1843b = greetingParam.from;
        this.f1844c = greetingParam;
        this.f1845d = new ArrayList();
    }

    /* JADX INFO: renamed from: Z */
    public void mo3210Z() {
        super.Z();
        Iterator<uak> it = this.f1845d.iterator();
        while (it.hasNext()) {
            it.next().mo7384b();
        }
        this.f1847f = true;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo3211a0() {
        super.a0();
        Iterator<uak> it = this.f1845d.iterator();
        while (it.hasNext()) {
            it.next().mo7385c();
        }
        this.f1846e = true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3234e0(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(mo3217f0());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public abstract String mo3217f0();

    /* JADX INFO: renamed from: g0 */
    public Greeting m3235g0() {
        return (Greeting) this.f1842a.e();
    }

    public String getFrom() {
        return this.f1843b;
    }

    /* JADX INFO: renamed from: h0 */
    public GreetingParam m3236h0() {
        return this.f1844c;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo3221i0() {
        m3234e0(this.f1844c.greetInfo);
        this.f1842a.onNext(this.f1844c.greetInfo);
    }

    /* JADX INFO: renamed from: j0 */
    public void m3237j0(uak uakVar) {
        this.f1845d.add(uakVar);
        if (this.f1847f) {
            uakVar.mo7384b();
        }
        if (this.f1846e) {
            uakVar.mo7385c();
        }
    }
}
