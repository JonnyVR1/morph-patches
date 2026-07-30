package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dqk0 {

    /* JADX INFO: renamed from: a */
    public int f9394a;

    /* JADX INFO: renamed from: b */
    public int f9395b;

    /* JADX INFO: renamed from: c */
    public int f9396c;

    /* JADX INFO: renamed from: d */
    public int f9397d;

    /* JADX INFO: renamed from: e */
    public int f9398e;

    /* JADX INFO: renamed from: f */
    public VReorderCards f9399f;

    /* JADX INFO: renamed from: g */
    public VReorderCard f9400g;

    public dqk0(VReorderCards vReorderCards, int i) {
        this.f9398e = i;
        this.f9399f = vReorderCards;
    }

    /* JADX INFO: renamed from: a */
    public void m11993a() {
        if (!this.f9400g.f867b) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                VReorderCards vReorderCards = this.f9399f;
                if (i3 >= vReorderCards.f893d) {
                    break;
                }
                arrayList.add(vReorderCards.f905p[i3].f9400g);
                if (this.f9399f.f905p[i3].f9400g.f867b && i2 < 0) {
                    i2 = i3;
                }
                i3++;
            }
            int i4 = this.f9398e;
            if (i2 < i4 && i2 >= 0) {
                arrayList.remove(i4);
                arrayList.add(i2, this.f9400g);
            }
            while (true) {
                VReorderCards vReorderCards2 = this.f9399f;
                if (i >= vReorderCards2.f893d) {
                    break;
                }
                vReorderCards2.f905p[i].m11998f((VReorderCard) arrayList.get(i));
                this.f9399f.f905p[i].f9400g.m1248y();
                i++;
            }
        }
        a2m a2mVar = this.f9399f.f897h;
        if (a2mVar != null) {
            a2mVar.mo1669c();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m11994b() {
        return (this.f9396c + this.f9394a) / 2;
    }

    /* JADX INFO: renamed from: c */
    public int m11995c() {
        return (this.f9395b + this.f9397d) / 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m11996d(int i, int i2) {
        return i >= this.f9394a && i <= this.f9396c && i2 >= this.f9395b && i2 <= this.f9397d;
    }

    /* JADX INFO: renamed from: e */
    public void m11997e() {
        VReorderCards vReorderCards;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            VReorderCards vReorderCards2 = this.f9399f;
            if (i2 >= vReorderCards2.f893d) {
                break;
            }
            if (i2 != this.f9398e) {
                VReorderCard vReorderCard = vReorderCards2.f905p[i2].f9400g;
                if (vReorderCard.f867b) {
                    arrayList2.add(vReorderCard);
                } else {
                    arrayList.add(vReorderCard);
                }
            }
            i2++;
        }
        arrayList.add(this.f9400g);
        arrayList.addAll(arrayList2);
        while (true) {
            vReorderCards = this.f9399f;
            if (i >= vReorderCards.f893d) {
                break;
            }
            vReorderCards.f905p[i].m11998f((VReorderCard) arrayList.get(i));
            this.f9399f.f905p[i].f9400g.m1234g();
            i++;
        }
        a2m a2mVar = vReorderCards.f897h;
        if (a2mVar != null) {
            a2mVar.mo1668b();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11998f(VReorderCard vReorderCard) {
        this.f9400g = vReorderCard;
        vReorderCard.f868c = this;
    }

    /* JADX INFO: renamed from: g */
    public void m11999g(int i, int i2, int i3, int i4) {
        this.f9394a = i;
        this.f9395b = i2;
        this.f9396c = i3;
        this.f9397d = i4;
    }

    /* JADX INFO: renamed from: h */
    public int m12000h() {
        return this.f9396c - this.f9394a;
    }
}
