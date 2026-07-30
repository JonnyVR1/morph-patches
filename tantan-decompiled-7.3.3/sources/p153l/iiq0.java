package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class iiq0 extends ua00 {
    public iiq0() {
        super(17, 18);
    }

    @Override // p153l.ua00
    /* JADX INFO: renamed from: a */
    public void mo96672a(@NonNull n7h0 n7h0Var) {
        n7h0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        n7h0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
