package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g9q0 extends x100 {
    public g9q0() {
        super(20, 21);
    }

    @Override // p149l.x100
    /* JADX INFO: renamed from: a */
    public void mo94585a(@NonNull fzg0 fzg0Var) {
        fzg0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
