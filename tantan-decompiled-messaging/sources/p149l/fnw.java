package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fnw extends qsi0 {

    /* JADX INFO: renamed from: e */
    private HashMap<CharSequence, Long> f98477e = new HashMap<>();

    /* JADX INFO: renamed from: p */
    public static fnw m122382p() {
        fnw fnwVar = new fnw();
        fnwVar.mo122383i();
        return fnwVar;
    }

    @Override // p149l.qsi0
    /* JADX INFO: renamed from: i */
    public void mo122383i() {
        super.mo122383i();
        this.f156234a.setGravity(17, -1, 0);
    }

    @Override // p149l.qsi0
    /* JADX INFO: renamed from: o */
    public void mo122384o(CharSequence charSequence, boolean z, int i) {
        if (this.f98477e.containsKey(charSequence)) {
            if (System.currentTimeMillis() - this.f98477e.get(charSequence).longValue() < 2000) {
                return;
            }
        }
        this.f156234a.cancel();
        mo122383i();
        this.f156234a.setText(charSequence);
        if (charSequence == null || charSequence.length() <= 9 || i != 0) {
            this.f156234a.setDuration(i);
        } else {
            this.f156234a.setDuration(1);
        }
        this.f156234a.show();
        this.f98477e.clear();
        this.f98477e.put(charSequence, Long.valueOf(System.currentTimeMillis()));
    }
}
