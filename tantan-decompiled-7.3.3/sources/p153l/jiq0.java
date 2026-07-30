package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class jiq0 extends ua00 {
    public jiq0() {
        super(18, 19);
    }

    @Override // p153l.ua00
    /* JADX INFO: renamed from: a */
    public void mo96672a(@NonNull n7h0 n7h0Var) {
        n7h0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
