package p149l;

import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class dqk0 {

    /* JADX INFO: renamed from: a */
    public int f87430a;

    /* JADX INFO: renamed from: b */
    public int f87431b;

    /* JADX INFO: renamed from: c */
    public int f87432c;

    /* JADX INFO: renamed from: d */
    public int f87433d;

    /* JADX INFO: renamed from: e */
    public int f87434e;

    /* JADX INFO: renamed from: f */
    public VReorderCards f87435f;

    /* JADX INFO: renamed from: g */
    public VReorderCard f87436g;

    public dqk0(VReorderCards vReorderCards, int i) {
        this.f87434e = i;
        this.f87435f = vReorderCards;
    }

    /* JADX INFO: renamed from: a */
    public void m113074a() {
        if (!this.f87436g.f33045b) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                VReorderCards vReorderCards = this.f87435f;
                if (i3 >= vReorderCards.f33071d) {
                    break;
                }
                arrayList.add(vReorderCards.f33083p[i3].f87436g);
                if (this.f87435f.f33083p[i3].f87436g.f33045b && i2 < 0) {
                    i2 = i3;
                }
                i3++;
            }
            int i4 = this.f87434e;
            if (i2 < i4 && i2 >= 0) {
                arrayList.remove(i4);
                arrayList.add(i2, this.f87436g);
            }
            while (true) {
                VReorderCards vReorderCards2 = this.f87435f;
                if (i >= vReorderCards2.f33071d) {
                    break;
                }
                vReorderCards2.f33083p[i].m113079f((VReorderCard) arrayList.get(i));
                this.f87435f.f33083p[i].f87436g.m50802y();
                i++;
            }
        }
        a2m a2mVar = this.f87435f.f33075h;
        if (a2mVar != null) {
            a2mVar.mo47540c();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m113075b() {
        return (this.f87432c + this.f87430a) / 2;
    }

    /* JADX INFO: renamed from: c */
    public int m113076c() {
        return (this.f87431b + this.f87433d) / 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m113077d(int i, int i2) {
        return i >= this.f87430a && i <= this.f87432c && i2 >= this.f87431b && i2 <= this.f87433d;
    }

    /* JADX INFO: renamed from: e */
    public void m113078e() {
        VReorderCards vReorderCards;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            VReorderCards vReorderCards2 = this.f87435f;
            if (i2 >= vReorderCards2.f33071d) {
                break;
            }
            if (i2 != this.f87434e) {
                VReorderCard vReorderCard = vReorderCards2.f33083p[i2].f87436g;
                if (vReorderCard.f33045b) {
                    arrayList2.add(vReorderCard);
                } else {
                    arrayList.add(vReorderCard);
                }
            }
            i2++;
        }
        arrayList.add(this.f87436g);
        arrayList.addAll(arrayList2);
        while (true) {
            vReorderCards = this.f87435f;
            if (i >= vReorderCards.f33071d) {
                break;
            }
            vReorderCards.f33083p[i].m113079f((VReorderCard) arrayList.get(i));
            this.f87435f.f33083p[i].f87436g.m50788g();
            i++;
        }
        a2m a2mVar = vReorderCards.f33075h;
        if (a2mVar != null) {
            a2mVar.mo47539b();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m113079f(VReorderCard vReorderCard) {
        this.f87436g = vReorderCard;
        vReorderCard.f33046c = this;
    }

    /* JADX INFO: renamed from: g */
    public void m113080g(int i, int i2, int i3, int i4) {
        this.f87430a = i;
        this.f87431b = i2;
        this.f87432c = i3;
        this.f87433d = i4;
    }

    /* JADX INFO: renamed from: h */
    public int m113081h() {
        return this.f87432c - this.f87430a;
    }
}
