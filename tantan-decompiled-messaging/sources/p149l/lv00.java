package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class lv00 extends jv00 {

    /* JADX INFO: renamed from: q */
    public List<w680> f130110q;

    /* JADX INFO: renamed from: r */
    public bul f130111r;

    public lv00(Context context) {
        super(context);
        this.f130110q = new CopyOnWriteArrayList();
    }

    @Override // p149l.jv00, p149l.cul
    /* JADX INFO: renamed from: c */
    public void mo108791c(final bul bulVar) {
        super.mo108791c(bulVar);
        vwb.m200354z(this.f130110q, new e30() { // from class: l.kv00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124736a.m151832k0(bulVar, (w680) obj);
            }
        });
        this.f130110q.clear();
    }

    @Override // p149l.jv00, p149l.cul
    /* JADX INFO: renamed from: j */
    public void mo108798j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        super.mo108798j(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: j0 */
    public lv00 m151831j0() {
        C18322a c18322a = new C18322a();
        this.f130111r = c18322a;
        super.mo108791c(c18322a);
        return this;
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void m151832k0(w680 w680Var, bul bulVar) {
        switch (w680Var.f184812a) {
            case 1:
                bulVar.mo103945u1();
                break;
            case 2:
                bulVar.mo103935O();
                break;
            case 3:
                bulVar.mo103939f2();
                break;
            case 4:
                bulVar.mo103940l0(w680Var.f184813b);
                break;
            case 5:
                bulVar.mo103933D0();
                break;
            case 6:
                bulVar.mo103943q0();
                break;
            case 7:
                bulVar.mo103934F1();
                break;
            case 8:
                bulVar.mo103938c0(w680Var.f184816e);
                break;
            case 9:
                bulVar.mo103937R1(w680Var.f184814c);
                break;
        }
    }

    @Override // p149l.jv00, p149l.cul
    public void reset() {
        this.f130110q.clear();
        super.reset();
        bul bulVar = this.f130111r;
        if (bulVar != null) {
            super.mo108791c(bulVar);
        }
    }

    /* JADX INFO: renamed from: l.lv00$a */
    public class C18322a implements bul {
        public C18322a() {
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: D0 */
        public void mo103933D0() {
            gkh0.m126627j("[live]quickPlay", "proxy real onReceiveFirstIFrame");
            lv00.this.f130110q.add(new w680(5));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: F1 */
        public void mo103934F1() {
            lv00.this.f130110q.add(new w680(7));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: O */
        public void mo103935O() {
            lv00.this.f130110q.add(new w680(2));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: R1 */
        public void mo103937R1(float f) {
            lv00.this.f130110q.add(new w680(9).m201733b(f));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: c0 */
        public void mo103938c0(rwb rwbVar) {
            lv00.this.f130110q.add(new w680(8).m201732a(rwbVar));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: f2 */
        public void mo103939f2() {
            lv00.this.f130110q.add(new w680(3));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: l0 */
        public void mo103940l0(int i) {
            lv00.this.f130110q.add(new w680(4).m201734c(i));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: p1 */
        public void mo103942p1(int i) {
            lv00.this.f130110q.add(new w680(11).m201734c(i));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: q0 */
        public void mo103943q0() {
            lv00.this.f130110q.add(new w680(6));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: s1 */
        public void mo103944s1(ArrayList<String> arrayList) {
            lv00.this.f130110q.add(new w680(10).m201735d(arrayList));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: u1 */
        public void mo103945u1() {
            lv00.this.f130110q.add(new w680(1));
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: O0 */
        public void mo103936O0(BLiveCallVolume bLiveCallVolume) {
        }
    }
}
