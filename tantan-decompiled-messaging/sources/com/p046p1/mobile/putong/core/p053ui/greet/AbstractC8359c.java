package com.p046p1.mobile.putong.core.p053ui.greet;

import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.eak;
import p149l.jq2;
import p149l.mcr;
import p149l.uak;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.c */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC8359c<V extends eak> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public C22392a<Greeting> f29448a;

    /* JADX INFO: renamed from: b */
    public String f29449b;

    /* JADX INFO: renamed from: c */
    public GreetingParam f29450c;

    /* JADX INFO: renamed from: d */
    public List<uak> f29451d;

    /* JADX INFO: renamed from: e */
    public boolean f29452e;

    /* JADX INFO: renamed from: f */
    public boolean f29453f;

    public AbstractC8359c(mcr mcrVar, GreetingParam greetingParam) {
        super(mcrVar);
        this.f29448a = C22392a.m221512b();
        this.f29452e = false;
        this.f29453f = false;
        this.f29449b = greetingParam.from;
        this.f29450c = greetingParam;
        this.f29451d = new ArrayList();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Iterator<uak> it = this.f29451d.iterator();
        while (it.hasNext()) {
            it.next().mo140693b();
        }
        this.f29453f = true;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        Iterator<uak> it = this.f29451d.iterator();
        while (it.hasNext()) {
            it.next().mo140694c();
        }
        this.f29452e = true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m45888e0(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(mo45871f0());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public abstract String mo45871f0();

    /* JADX INFO: renamed from: g0 */
    public Greeting m45889g0() {
        return this.f29448a.m221515e();
    }

    public String getFrom() {
        return this.f29449b;
    }

    /* JADX INFO: renamed from: h0 */
    public GreetingParam m45890h0() {
        return this.f29450c;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo45875i0() {
        m45888e0(this.f29450c.greetInfo);
        this.f29448a.onNext(this.f29450c.greetInfo);
    }

    /* JADX INFO: renamed from: j0 */
    public void m45891j0(uak uakVar) {
        this.f29451d.add(uakVar);
        if (this.f29453f) {
            uakVar.mo140693b();
        }
        if (this.f29452e) {
            uakVar.mo140694c();
        }
    }
}
