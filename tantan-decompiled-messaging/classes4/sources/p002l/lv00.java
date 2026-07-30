package p002l;

import android.content.Context;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.bul;
import l.e30;
import l.gkh0;
import l.rwb;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lv00 extends jv00 {

    /* JADX INFO: renamed from: q */
    public List<w680> f15079q;

    /* JADX INFO: renamed from: r */
    public bul f15080r;

    public lv00(Context context) {
        super(context);
        this.f15079q = new CopyOnWriteArrayList();
    }

    @Override // p002l.jv00
    /* JADX INFO: renamed from: c */
    public void mo16315c(final bul bulVar) {
        super.mo16315c(bulVar);
        vwb.z(this.f15079q, new e30() { // from class: l.kv00
            public final void call(Object obj) {
                this.f14544a.m17480k0(bulVar, (w680) obj);
            }
        });
        this.f15079q.clear();
    }

    @Override // p002l.jv00
    /* JADX INFO: renamed from: j */
    public void mo16327j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        super.mo16327j(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: j0 */
    public lv00 m17479j0() {
        C0670a c0670a = new C0670a();
        this.f15080r = c0670a;
        super.mo16315c(c0670a);
        return this;
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void m17480k0(w680 w680Var, bul bulVar) {
        switch (w680Var.f21479a) {
            case 1:
                bulVar.u1();
                break;
            case 2:
                bulVar.O();
                break;
            case 3:
                bulVar.f2();
                break;
            case 4:
                bulVar.l0(w680Var.f21480b);
                break;
            case 5:
                bulVar.D0();
                break;
            case 6:
                bulVar.q0();
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                bulVar.F1();
                break;
            case ExpLoopInputType.GAME_NAME /* 8 */:
                bulVar.c0(w680Var.f21483e);
                break;
            case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                bulVar.R1(w680Var.f21481c);
                break;
        }
    }

    @Override // p002l.jv00
    public void reset() {
        this.f15079q.clear();
        super.reset();
        bul bulVar = this.f15080r;
        if (bulVar != null) {
            super.mo16315c(bulVar);
        }
    }

    /* JADX INFO: renamed from: l.lv00$a */
    public class C0670a implements bul {
        public C0670a() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m17482D0() {
            gkh0.j("[live]quickPlay", "proxy real onReceiveFirstIFrame");
            lv00.this.f15079q.add(new w680(5));
        }

        /* JADX INFO: renamed from: F1 */
        public void m17483F1() {
            lv00.this.f15079q.add(new w680(7));
        }

        /* JADX INFO: renamed from: O */
        public void m17484O() {
            lv00.this.f15079q.add(new w680(2));
        }

        /* JADX INFO: renamed from: R1 */
        public void m17486R1(float f) {
            lv00.this.f15079q.add(new w680(9).m24332b(f));
        }

        /* JADX INFO: renamed from: c0 */
        public void m17487c0(rwb rwbVar) {
            lv00.this.f15079q.add(new w680(8).m24331a(rwbVar));
        }

        /* JADX INFO: renamed from: f2 */
        public void m17488f2() {
            lv00.this.f15079q.add(new w680(3));
        }

        /* JADX INFO: renamed from: l0 */
        public void m17489l0(int i) {
            lv00.this.f15079q.add(new w680(4).m24333c(i));
        }

        /* JADX INFO: renamed from: p1 */
        public void m17490p1(int i) {
            lv00.this.f15079q.add(new w680(11).m24333c(i));
        }

        /* JADX INFO: renamed from: q0 */
        public void m17491q0() {
            lv00.this.f15079q.add(new w680(6));
        }

        /* JADX INFO: renamed from: s1 */
        public void m17492s1(ArrayList<String> arrayList) {
            lv00.this.f15079q.add(new w680(10).m24334d(arrayList));
        }

        /* JADX INFO: renamed from: u1 */
        public void m17493u1() {
            lv00.this.f15079q.add(new w680(1));
        }

        /* JADX INFO: renamed from: O0 */
        public void m17485O0(BLiveCallVolume bLiveCallVolume) {
        }
    }
}
