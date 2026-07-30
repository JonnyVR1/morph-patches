package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class enw extends rsi0 {

    /* JADX INFO: renamed from: e */
    private HashMap<CharSequence, Long> f92340e = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public static enw m117294r() {
        enw enwVar = new enw();
        enwVar.mo117295j();
        return enwVar;
    }

    @Override // p149l.rsi0
    /* JADX INFO: renamed from: j */
    public void mo117295j() {
        super.mo117295j();
        this.f160869a.setGravity(17, -1, 0);
    }

    @Override // p149l.rsi0
    /* JADX INFO: renamed from: q */
    public void mo117296q(CharSequence charSequence, boolean z, int i) {
        if (this.f92340e.containsKey(charSequence)) {
            if (System.currentTimeMillis() - this.f92340e.get(charSequence).longValue() < 2000) {
                return;
            }
        }
        this.f160869a.cancel();
        mo117295j();
        this.f160869a.setText(charSequence);
        if (charSequence == null || charSequence.length() <= 9 || i != 0) {
            this.f160869a.setDuration(i);
        } else {
            this.f160869a.setDuration(1);
        }
        this.f160869a.show();
        this.f92340e.clear();
        this.f92340e.put(charSequence, Long.valueOf(System.currentTimeMillis()));
    }
}
