package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzfk;

/* JADX INFO: loaded from: classes6.dex */
public final class g6l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f101272a;

    /* JADX INFO: renamed from: b */
    public final boolean f101273b;

    /* JADX INFO: renamed from: c */
    public final boolean f101274c;

    /* JADX INFO: renamed from: l.g6l0$a */
    public static final class C17012a {

        /* JADX INFO: renamed from: a */
        public boolean f101275a = true;

        /* JADX INFO: renamed from: b */
        public boolean f101276b = false;

        /* JADX INFO: renamed from: c */
        public boolean f101277c = false;

        @NonNull
        /* JADX INFO: renamed from: a */
        public g6l0 m124603a() {
            return new g6l0(this, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C17012a m124604b(boolean z) {
            this.f101275a = z;
            return this;
        }
    }

    public /* synthetic */ g6l0(C17012a c17012a, qkx0 qkx0Var) {
        this.f101272a = c17012a.f101275a;
        this.f101273b = c17012a.f101276b;
        this.f101274c = c17012a.f101277c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m124597a() {
        return this.f101274c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m124598b() {
        return this.f101273b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m124599c() {
        return this.f101272a;
    }

    public g6l0(zzfk zzfkVar) {
        this.f101272a = zzfkVar.zza;
        this.f101273b = zzfkVar.zzb;
        this.f101274c = zzfkVar.zzc;
    }
}
