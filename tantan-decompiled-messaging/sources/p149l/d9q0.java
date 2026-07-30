package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class d9q0 extends x100 {
    public d9q0() {
        super(17, 18);
    }

    @Override // p149l.x100
    /* JADX INFO: renamed from: a */
    public void mo94585a(@NonNull fzg0 fzg0Var) {
        fzg0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        fzg0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
