package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rut0 implements ezt0, eyt0 {

    /* JADX INFO: renamed from: a */
    public final Context f161138a;

    /* JADX INFO: renamed from: b */
    public final kxv0 f161139b;

    /* JADX INFO: renamed from: c */
    public final qss0 f161140c;

    public rut0(Context context, kxv0 kxv0Var, qss0 qss0Var) {
        this.f161138a = context;
        this.f161139b = kxv0Var;
        this.f161140c = qss0Var;
    }

    @Override // p149l.ezt0
    public final void zzr() {
        rss0 rss0Var = this.f161139b.f125192e0;
        if (rss0Var == null || !rss0Var.f160891a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f161139b.f125192e0.f160892b.isEmpty()) {
            return;
        }
        arrayList.add(this.f161139b.f125192e0.f160892b);
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: B */
    public final void mo102676B(@Nullable Context context) {
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: K */
    public final void mo102677K(@Nullable Context context) {
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: P */
    public final void mo102680P(@Nullable Context context) {
    }
}
