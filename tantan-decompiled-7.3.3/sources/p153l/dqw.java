package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dqw extends t1j0 {

    /* JADX INFO: renamed from: e */
    private HashMap<CharSequence, Long> f90298e = new HashMap<>();

    /* JADX INFO: renamed from: t */
    public static dqw m117573t() {
        dqw dqwVar = new dqw();
        dqwVar.mo117574j();
        return dqwVar;
    }

    @Override // p153l.t1j0
    /* JADX INFO: renamed from: j */
    public void mo117574j() {
        super.mo117574j();
        this.f171678a.setGravity(17, -1, 0);
    }

    @Override // p153l.t1j0
    /* JADX INFO: renamed from: s */
    public void mo117575s(CharSequence charSequence, boolean z, int i) {
        if (this.f90298e.containsKey(charSequence)) {
            if (System.currentTimeMillis() - this.f90298e.get(charSequence).longValue() < 2000) {
                return;
            }
        }
        this.f171678a.cancel();
        mo117574j();
        this.f171678a.setText(charSequence);
        if (charSequence == null || charSequence.length() <= 9 || i != 0) {
            this.f171678a.setDuration(i);
        } else {
            this.f171678a.setDuration(1);
        }
        this.f171678a.show();
        this.f90298e.clear();
        this.f90298e.put(charSequence, Long.valueOf(System.currentTimeMillis()));
    }
}
