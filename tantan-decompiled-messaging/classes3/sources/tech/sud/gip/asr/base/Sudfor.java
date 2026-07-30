package tech.sud.gip.asr.base;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Sudfor implements Runnable {
    public final /* synthetic */ Sudint Suddo;

    public Sudfor(Sudint sudint) {
        this.Suddo = sudint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Suddo.Suddo();
        Sudint sudint = this.Suddo;
        sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
        sudint.Sudgoto.postDelayed(sudint.Sudelse, 10000L);
    }
}
