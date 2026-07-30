package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzfk;

/* JADX INFO: loaded from: classes6.dex */
public final class kfl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f126440a;

    /* JADX INFO: renamed from: b */
    public final boolean f126441b;

    /* JADX INFO: renamed from: c */
    public final boolean f126442c;

    /* JADX INFO: renamed from: l.kfl0$a */
    public static final class C18151a {

        /* JADX INFO: renamed from: a */
        public boolean f126443a = true;

        /* JADX INFO: renamed from: b */
        public boolean f126444b = false;

        /* JADX INFO: renamed from: c */
        public boolean f126445c = false;

        @NonNull
        /* JADX INFO: renamed from: a */
        public kfl0 m149565a() {
            return new kfl0(this, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C18151a m149566b(boolean z) {
            this.f126443a = z;
            return this;
        }
    }

    public /* synthetic */ kfl0(C18151a c18151a, wtx0 wtx0Var) {
        this.f126440a = c18151a.f126443a;
        this.f126441b = c18151a.f126444b;
        this.f126442c = c18151a.f126445c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m149559a() {
        return this.f126442c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m149560b() {
        return this.f126441b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m149561c() {
        return this.f126440a;
    }

    public kfl0(zzfk zzfkVar) {
        this.f126440a = zzfkVar.zza;
        this.f126441b = zzfkVar.zzb;
        this.f126442c = zzfkVar.zzc;
    }
}
