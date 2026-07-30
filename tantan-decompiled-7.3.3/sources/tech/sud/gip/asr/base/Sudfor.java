package tech.sud.gip.asr.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudfor implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ Sudint f211041Suddo;

    public Sudfor(Sudint sudint) {
        this.f211041Suddo = sudint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f211041Suddo.Suddo();
        Sudint sudint = this.f211041Suddo;
        sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
        sudint.Sudgoto.postDelayed(sudint.Sudelse, 10000L);
    }
}
