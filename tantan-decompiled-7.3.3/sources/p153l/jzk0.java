package p153l;

import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class jzk0 {

    /* JADX INFO: renamed from: a */
    public int f123270a;

    /* JADX INFO: renamed from: b */
    public int f123271b;

    /* JADX INFO: renamed from: c */
    public int f123272c;

    /* JADX INFO: renamed from: d */
    public int f123273d;

    /* JADX INFO: renamed from: e */
    public int f123274e;

    /* JADX INFO: renamed from: f */
    public VReorderCards f123275f;

    /* JADX INFO: renamed from: g */
    public VReorderCard f123276g;

    public jzk0(VReorderCards vReorderCards, int i) {
        this.f123274e = i;
        this.f123275f = vReorderCards;
    }

    /* JADX INFO: renamed from: a */
    public void m147663a() {
        if (!this.f123276g.f33893b) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                VReorderCards vReorderCards = this.f123275f;
                if (i3 >= vReorderCards.f33919d) {
                    break;
                }
                arrayList.add(vReorderCards.f33931p[i3].f123276g);
                if (this.f123275f.f33931p[i3].f123276g.f33893b && i2 < 0) {
                    i2 = i3;
                }
                i3++;
            }
            int i4 = this.f123274e;
            if (i2 < i4 && i2 >= 0) {
                arrayList.remove(i4);
                arrayList.add(i2, this.f123276g);
            }
            while (true) {
                VReorderCards vReorderCards2 = this.f123275f;
                if (i >= vReorderCards2.f33919d) {
                    break;
                }
                vReorderCards2.f33931p[i].m147668f((VReorderCard) arrayList.get(i));
                this.f123275f.f33931p[i].f123276g.m51985y();
                i++;
            }
        }
        t4m t4mVar = this.f123275f.f33923h;
        if (t4mVar != null) {
            t4mVar.mo48723c();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m147664b() {
        return (this.f123272c + this.f123270a) / 2;
    }

    /* JADX INFO: renamed from: c */
    public int m147665c() {
        return (this.f123271b + this.f123273d) / 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m147666d(int i, int i2) {
        return i >= this.f123270a && i <= this.f123272c && i2 >= this.f123271b && i2 <= this.f123273d;
    }

    /* JADX INFO: renamed from: e */
    public void m147667e() {
        VReorderCards vReorderCards;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            VReorderCards vReorderCards2 = this.f123275f;
            if (i2 >= vReorderCards2.f33919d) {
                break;
            }
            if (i2 != this.f123274e) {
                VReorderCard vReorderCard = vReorderCards2.f33931p[i2].f123276g;
                if (vReorderCard.f33893b) {
                    arrayList2.add(vReorderCard);
                } else {
                    arrayList.add(vReorderCard);
                }
            }
            i2++;
        }
        arrayList.add(this.f123276g);
        arrayList.addAll(arrayList2);
        while (true) {
            vReorderCards = this.f123275f;
            if (i >= vReorderCards.f33919d) {
                break;
            }
            vReorderCards.f33931p[i].m147668f((VReorderCard) arrayList.get(i));
            this.f123275f.f33931p[i].f123276g.m51971g();
            i++;
        }
        t4m t4mVar = vReorderCards.f33923h;
        if (t4mVar != null) {
            t4mVar.mo48722b();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m147668f(VReorderCard vReorderCard) {
        this.f123276g = vReorderCard;
        vReorderCard.f33894c = this;
    }

    /* JADX INFO: renamed from: g */
    public void m147669g(int i, int i2, int i3, int i4) {
        this.f123270a = i;
        this.f123271b = i2;
        this.f123272c = i3;
        this.f123273d = i4;
    }

    /* JADX INFO: renamed from: h */
    public int m147670h() {
        return this.f123272c - this.f123270a;
    }
}
