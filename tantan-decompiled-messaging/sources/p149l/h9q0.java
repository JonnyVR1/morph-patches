package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class h9q0 extends x100 {
    public h9q0() {
        super(22, 23);
    }

    @Override // p149l.x100
    /* JADX INFO: renamed from: a */
    public void mo94585a(@NonNull fzg0 fzg0Var) {
        fzg0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
