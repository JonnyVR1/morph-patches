package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class cqw extends u1j0 {

    /* JADX INFO: renamed from: e */
    private HashMap<CharSequence, Long> f83246e = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public static cqw m111990r() {
        cqw cqwVar = new cqw();
        cqwVar.mo111991j();
        return cqwVar;
    }

    @Override // p153l.u1j0
    /* JADX INFO: renamed from: j */
    public void mo111991j() {
        super.mo111991j();
        this.f177009a.setGravity(17, -1, 0);
    }

    @Override // p153l.u1j0
    /* JADX INFO: renamed from: q */
    public void mo111992q(CharSequence charSequence, boolean z, int i) {
        if (this.f83246e.containsKey(charSequence)) {
            if (System.currentTimeMillis() - this.f83246e.get(charSequence).longValue() < 2000) {
                return;
            }
        }
        this.f177009a.cancel();
        mo111991j();
        this.f177009a.setText(charSequence);
        if (charSequence == null || charSequence.length() <= 9 || i != 0) {
            this.f177009a.setDuration(i);
        } else {
            this.f177009a.setDuration(1);
        }
        this.f177009a.show();
        this.f83246e.clear();
        this.f83246e.put(charSequence, Long.valueOf(System.currentTimeMillis()));
    }
}
