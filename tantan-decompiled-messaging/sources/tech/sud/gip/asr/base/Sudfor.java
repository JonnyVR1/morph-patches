package tech.sud.gip.asr.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudfor implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ Sudint f210120Suddo;

    public Sudfor(Sudint sudint) {
        this.f210120Suddo = sudint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f210120Suddo.Suddo();
        Sudint sudint = this.f210120Suddo;
        sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
        sudint.Sudgoto.postDelayed(sudint.Sudelse, 10000L);
    }
}
