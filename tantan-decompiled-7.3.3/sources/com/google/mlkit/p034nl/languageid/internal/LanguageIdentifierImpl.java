package com.google.mlkit.p034nl.languageid.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.InterfaceC0485n;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_language_id_common.zzhw;
import com.google.android.gms.internal.mlkit_language_id_common.zzhx;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p034nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p153l.bzx0;
import p153l.c7f;
import p153l.csx0;
import p153l.ctx0;
import p153l.drw0;
import p153l.e9y0;
import p153l.frx0;
import p153l.fxx0;
import p153l.ig4;
import p153l.jxx0;
import p153l.kcy0;
import p153l.kzx0;
import p153l.lay0;
import p153l.lsx0;
import p153l.lyv0;
import p153l.r560;
import p153l.rd00;
import p153l.tsy0;
import p153l.vay0;
import p153l.wyx0;
import p153l.yxx0;
import p153l.z8r;
import p153l.zay0;

/* JADX INFO: loaded from: classes7.dex */
public class LanguageIdentifierImpl implements LanguageIdentifier {
    private final z8r zza;
    private final lay0 zzb;
    private final vay0 zzc;
    private final Executor zzd;
    private final AtomicReference zze;
    private final ig4 zzf = new ig4();
    private final zzhw zzg;

    /* JADX INFO: renamed from: com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl$a */
    @KeepForSdk
    public static final class C3387a {

        /* JADX INFO: renamed from: a */
        public final lay0 f11542a;

        /* JADX INFO: renamed from: b */
        public final drw0 f11543b;

        /* JADX INFO: renamed from: c */
        public final c7f f11544c;

        public C3387a(drw0 drw0Var, c7f c7fVar) {
            this.f11543b = drw0Var;
            this.f11544c = c7fVar;
            this.f11542a = kcy0.m149142b(true != drw0Var.m117715m() ? "play-services-mlkit-language-id" : "language-id");
        }

        @NonNull
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        public LanguageIdentifier m16938a(@NonNull z8r z8rVar) {
            this.f11543b.m117714l(z8rVar);
            return LanguageIdentifierImpl.zza(z8rVar, this.f11543b, this.f11542a, this.f11544c);
        }
    }

    private LanguageIdentifierImpl(z8r z8rVar, drw0 drw0Var, lay0 lay0Var, Executor executor) {
        this.zza = z8rVar;
        this.zzb = lay0Var;
        this.zzd = executor;
        this.zze = new AtomicReference(drw0Var);
        this.zzg = drw0Var.m117715m() ? zzhw.TYPE_THICK : zzhw.TYPE_THIN;
        this.zzc = vay0.m200635a(rd00.m180828c().m180834b());
    }

    @VisibleForTesting
    public static LanguageIdentifier zza(z8r z8rVar, drw0 drw0Var, lay0 lay0Var, c7f c7fVar) {
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(z8rVar, drw0Var, lay0Var, c7fVar.m108304a(z8rVar.m219022b()));
        lay0 lay0Var2 = languageIdentifierImpl.zzb;
        ctx0 ctx0Var = new ctx0();
        ctx0Var.m112558c(languageIdentifierImpl.zzg);
        fxx0 fxx0Var = new fxx0();
        fxx0Var.m128049f(zzf(languageIdentifierImpl.zza.m219021a()));
        ctx0Var.m112560e(fxx0Var.m128050i());
        lay0Var2.m153546c(zay0.m219145e(ctx0Var, 1), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE);
        ((drw0) languageIdentifierImpl.zze.get()).m219395d();
        return languageIdentifierImpl;
    }

    private final void zze(long j, boolean z, @Nullable kzx0 kzx0Var, @Nullable wyx0 wyx0Var, zzhx zzhxVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzb.m153548e(new lyv0(this, jElapsedRealtime, z, zzhxVar, kzx0Var, wyx0Var), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzc.m200637c(this.zzg == zzhw.TYPE_THICK ? 24603 : 24602, zzhxVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    private static final lsx0 zzf(@Nullable Float f) {
        csx0 csx0Var = new csx0();
        csx0Var.m112439a(Float.valueOf(f == null ? -1.0f : f.floatValue()));
        return csx0Var.m112440b();
    }

    @Override // com.google.mlkit.p034nl.languageid.LanguageIdentifier, java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0485n(Lifecycle.Event.ON_DESTROY)
    public void close() {
        drw0 drw0Var = (drw0) this.zze.getAndSet(null);
        if (drw0Var == null) {
            return;
        }
        this.zzf.m139763a();
        drw0Var.m219396f(this.zzd);
        lay0 lay0Var = this.zzb;
        ctx0 ctx0Var = new ctx0();
        ctx0Var.m112558c(this.zzg);
        fxx0 fxx0Var = new fxx0();
        fxx0Var.m128049f(zzf(this.zza.m219021a()));
        ctx0Var.m112560e(fxx0Var.m128050i());
        lay0Var.m153546c(zay0.m219145e(ctx0Var, 1), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.zzg == zzhw.TYPE_THICK ? r560.f161293a : new Feature[]{r560.f161304l};
    }

    @Override // com.google.mlkit.p034nl.languageid.LanguageIdentifier
    @NonNull
    public final Task<String> identifyLanguage(@NonNull final String str) {
        Preconditions.checkNotNull(str, "Text can not be null");
        final drw0 drw0Var = (drw0) this.zze.get();
        Preconditions.checkState(drw0Var != null, "LanguageIdentification has been closed");
        final boolean zM219394b = true ^ drw0Var.m219394b();
        return drw0Var.m219393a(this.zzd, new Callable() { // from class: l.z1v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f202604a.zzc(drw0Var, str, zM219394b);
            }
        }, this.zzf.m139764b());
    }

    @Override // com.google.mlkit.p034nl.languageid.LanguageIdentifier
    @NonNull
    public final Task<List<IdentifiedLanguage>> identifyPossibleLanguages(@NonNull final String str) {
        Preconditions.checkNotNull(str, "Text can not be null");
        final drw0 drw0Var = (drw0) this.zze.get();
        Preconditions.checkState(drw0Var != null, "LanguageIdentification has been closed");
        final boolean zM219394b = true ^ drw0Var.m219394b();
        return drw0Var.m219393a(this.zzd, new Callable() { // from class: l.u4u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f177505a.zzd(drw0Var, str, zM219394b);
            }
        }, this.zzf.m139764b());
    }

    public final /* synthetic */ e9y0 zzb(long j, boolean z, zzhx zzhxVar, kzx0 kzx0Var, wyx0 wyx0Var) {
        fxx0 fxx0Var = new fxx0();
        fxx0Var.m128049f(zzf(this.zza.m219021a()));
        frx0 frx0Var = new frx0();
        frx0Var.m127009a(Long.valueOf(j));
        frx0Var.m127011c(Boolean.valueOf(z));
        frx0Var.m127010b(zzhxVar);
        fxx0Var.m128048e(frx0Var.m127012d());
        if (kzx0Var != null) {
            fxx0Var.m128047d(kzx0Var);
        }
        if (wyx0Var != null) {
            fxx0Var.m128046c(wyx0Var);
        }
        ctx0 ctx0Var = new ctx0();
        ctx0Var.m112558c(this.zzg);
        ctx0Var.m112560e(fxx0Var.m128050i());
        return zay0.m219144d(ctx0Var);
    }

    public final /* synthetic */ String zzc(drw0 drw0Var, String str, boolean z) throws Exception {
        LanguageIdentifierImpl languageIdentifierImpl;
        boolean z2;
        RuntimeException runtimeException;
        float fFloatValue;
        wyx0 wyx0VarM217744c;
        Float fM219021a = this.zza.m219021a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String strSubstring = str.substring(0, Math.min(str.length(), 200));
            if (fM219021a != null) {
                try {
                    fFloatValue = fM219021a.floatValue();
                } catch (RuntimeException e) {
                    runtimeException = e;
                    languageIdentifierImpl = this;
                    z2 = z;
                    languageIdentifierImpl.zze(jElapsedRealtime, z2, null, null, zzhx.UNKNOWN_ERROR);
                    throw runtimeException;
                }
            } else {
                fFloatValue = 0.5f;
            }
            String strM117712j = drw0Var.m117712j(strSubstring, fFloatValue);
            if (strM117712j == null) {
                wyx0VarM217744c = null;
            } else {
                yxx0 yxx0Var = new yxx0();
                jxx0 jxx0Var = new jxx0();
                jxx0Var.m147449b(strM117712j);
                yxx0Var.m217743b(jxx0Var.m147450c());
                wyx0VarM217744c = yxx0Var.m217744c();
            }
            languageIdentifierImpl = this;
            z2 = z;
            try {
                languageIdentifierImpl.zze(jElapsedRealtime, z2, null, wyx0VarM217744c, zzhx.NO_ERROR);
                return strM117712j;
            } catch (RuntimeException e2) {
                e = e2;
                runtimeException = e;
                languageIdentifierImpl.zze(jElapsedRealtime, z2, null, null, zzhx.UNKNOWN_ERROR);
                throw runtimeException;
            }
        } catch (RuntimeException e3) {
            e = e3;
            languageIdentifierImpl = this;
            z2 = z;
        }
    }

    public final /* synthetic */ List zzd(drw0 drw0Var, String str, boolean z) throws Exception {
        LanguageIdentifierImpl languageIdentifierImpl;
        boolean z2;
        RuntimeException runtimeException;
        float fFloatValue;
        Float fM219021a = this.zza.m219021a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String strSubstring = str.substring(0, Math.min(str.length(), 200));
            if (fM219021a != null) {
                try {
                    fFloatValue = fM219021a.floatValue();
                } catch (RuntimeException e) {
                    runtimeException = e;
                    languageIdentifierImpl = this;
                    z2 = z;
                    languageIdentifierImpl.zze(jElapsedRealtime, z2, null, null, zzhx.UNKNOWN_ERROR);
                    throw runtimeException;
                }
            } else {
                fFloatValue = 0.01f;
            }
            List<IdentifiedLanguage> listM117713k = drw0Var.m117713k(strSubstring, fFloatValue);
            tsy0 tsy0Var = new tsy0();
            for (IdentifiedLanguage identifiedLanguage : listM117713k) {
                jxx0 jxx0Var = new jxx0();
                jxx0Var.m147449b(identifiedLanguage.m16935b());
                jxx0Var.m147448a(Float.valueOf(identifiedLanguage.m16934a()));
                tsy0Var.m192645c(jxx0Var.m147450c());
            }
            bzx0 bzx0Var = new bzx0();
            bzx0Var.m107271b(tsy0Var.m192646d());
            languageIdentifierImpl = this;
            z2 = z;
            try {
                languageIdentifierImpl.zze(jElapsedRealtime, z2, bzx0Var.m107272c(), null, zzhx.NO_ERROR);
                return listM117713k;
            } catch (RuntimeException e2) {
                e = e2;
                runtimeException = e;
                languageIdentifierImpl.zze(jElapsedRealtime, z2, null, null, zzhx.UNKNOWN_ERROR);
                throw runtimeException;
            }
        } catch (RuntimeException e3) {
            e = e3;
            languageIdentifierImpl = this;
            z2 = z;
        }
    }
}
