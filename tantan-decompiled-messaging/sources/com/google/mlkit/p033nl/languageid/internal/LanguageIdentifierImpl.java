package com.google.mlkit.p033nl.languageid.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.InterfaceC0484n;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_language_id_common.zzhw;
import com.google.android.gms.internal.mlkit_language_id_common.zzhx;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p033nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p149l.c500;
import p149l.dox0;
import p149l.e3y0;
import p149l.eqx0;
import p149l.f1y0;
import p149l.fjx0;
import p149l.fpv0;
import p149l.jf4;
import p149l.lx50;
import p149l.njy0;
import p149l.p1y0;
import p149l.qpx0;
import p149l.sox0;
import p149l.t1y0;
import p149l.vpx0;
import p149l.w5f;
import p149l.wix0;
import p149l.wjx0;
import p149l.xhw0;
import p149l.y6r;
import p149l.yzx0;
import p149l.zhx0;
import p149l.znx0;

/* JADX INFO: loaded from: classes7.dex */
public class LanguageIdentifierImpl implements LanguageIdentifier {
    private final y6r zza;
    private final f1y0 zzb;
    private final p1y0 zzc;
    private final Executor zzd;
    private final AtomicReference zze;
    private final jf4 zzf = new jf4();
    private final zzhw zzg;

    /* JADX INFO: renamed from: com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl$a */
    @KeepForSdk
    public static final class C3364a {

        /* JADX INFO: renamed from: a */
        public final f1y0 f11505a;

        /* JADX INFO: renamed from: b */
        public final xhw0 f11506b;

        /* JADX INFO: renamed from: c */
        public final w5f f11507c;

        public C3364a(xhw0 xhw0Var, w5f w5fVar) {
            this.f11506b = xhw0Var;
            this.f11507c = w5fVar;
            this.f11505a = e3y0.m114643b(true != xhw0Var.m208849m() ? "play-services-mlkit-language-id" : "language-id");
        }

        @NonNull
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        public LanguageIdentifier m16883a(@NonNull y6r y6rVar) {
            this.f11506b.m208848l(y6rVar);
            return LanguageIdentifierImpl.zza(y6rVar, this.f11506b, this.f11505a, this.f11507c);
        }
    }

    private LanguageIdentifierImpl(y6r y6rVar, xhw0 xhw0Var, f1y0 f1y0Var, Executor executor) {
        this.zza = y6rVar;
        this.zzb = f1y0Var;
        this.zzd = executor;
        this.zze = new AtomicReference(xhw0Var);
        this.zzg = xhw0Var.m208849m() ? zzhw.TYPE_THICK : zzhw.TYPE_THIN;
        this.zzc = p1y0.m167120a(c500.m105245c().m105251b());
    }

    @VisibleForTesting
    public static LanguageIdentifier zza(y6r y6rVar, xhw0 xhw0Var, f1y0 f1y0Var, w5f w5fVar) {
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(y6rVar, xhw0Var, f1y0Var, w5fVar.m201618a(y6rVar.m213239b()));
        f1y0 f1y0Var2 = languageIdentifierImpl.zzb;
        wjx0 wjx0Var = new wjx0();
        wjx0Var.m203576c(languageIdentifierImpl.zzg);
        znx0 znx0Var = new znx0();
        znx0Var.m219504f(zzf(languageIdentifierImpl.zza.m213238a()));
        wjx0Var.m203578e(znx0Var.m219505i());
        f1y0Var2.m119151c(t1y0.m186932e(wjx0Var, 1), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE);
        ((xhw0) languageIdentifierImpl.zze.get()).m173118d();
        return languageIdentifierImpl;
    }

    private final void zze(long j, boolean z, @Nullable eqx0 eqx0Var, @Nullable qpx0 qpx0Var, zzhx zzhxVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzb.m119153e(new fpv0(this, jElapsedRealtime, z, zzhxVar, eqx0Var, qpx0Var), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzc.m167122c(this.zzg == zzhw.TYPE_THICK ? 24603 : 24602, zzhxVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    private static final fjx0 zzf(@Nullable Float f) {
        wix0 wix0Var = new wix0();
        wix0Var.m203357a(Float.valueOf(f == null ? -1.0f : f.floatValue()));
        return wix0Var.m203358b();
    }

    @Override // com.google.mlkit.p033nl.languageid.LanguageIdentifier, java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0484n(Lifecycle.Event.ON_DESTROY)
    public void close() {
        xhw0 xhw0Var = (xhw0) this.zze.getAndSet(null);
        if (xhw0Var == null) {
            return;
        }
        this.zzf.m141172a();
        xhw0Var.m173120f(this.zzd);
        f1y0 f1y0Var = this.zzb;
        wjx0 wjx0Var = new wjx0();
        wjx0Var.m203576c(this.zzg);
        znx0 znx0Var = new znx0();
        znx0Var.m219504f(zzf(this.zza.m213238a()));
        wjx0Var.m203578e(znx0Var.m219505i());
        f1y0Var.m119151c(t1y0.m186932e(wjx0Var, 1), zzhy.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.zzg == zzhw.TYPE_THICK ? lx50.f130361a : new Feature[]{lx50.f130372l};
    }

    @Override // com.google.mlkit.p033nl.languageid.LanguageIdentifier
    @NonNull
    public final Task<String> identifyLanguage(@NonNull final String str) {
        Preconditions.checkNotNull(str, "Text can not be null");
        final xhw0 xhw0Var = (xhw0) this.zze.get();
        Preconditions.checkState(xhw0Var != null, "LanguageIdentification has been closed");
        final boolean zM173116b = true ^ xhw0Var.m173116b();
        return xhw0Var.m173115a(this.zzd, new Callable() { // from class: l.tsu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f171966a.zzc(xhw0Var, str, zM173116b);
            }
        }, this.zzf.m141173b());
    }

    @Override // com.google.mlkit.p033nl.languageid.LanguageIdentifier
    @NonNull
    public final Task<List<IdentifiedLanguage>> identifyPossibleLanguages(@NonNull final String str) {
        Preconditions.checkNotNull(str, "Text can not be null");
        final xhw0 xhw0Var = (xhw0) this.zze.get();
        Preconditions.checkState(xhw0Var != null, "LanguageIdentification has been closed");
        final boolean zM173116b = true ^ xhw0Var.m173116b();
        return xhw0Var.m173115a(this.zzd, new Callable() { // from class: l.ovt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f145848a.zzd(xhw0Var, str, zM173116b);
            }
        }, this.zzf.m141173b());
    }

    public final /* synthetic */ yzx0 zzb(long j, boolean z, zzhx zzhxVar, eqx0 eqx0Var, qpx0 qpx0Var) {
        znx0 znx0Var = new znx0();
        znx0Var.m219504f(zzf(this.zza.m213238a()));
        zhx0 zhx0Var = new zhx0();
        zhx0Var.m218884a(Long.valueOf(j));
        zhx0Var.m218886c(Boolean.valueOf(z));
        zhx0Var.m218885b(zzhxVar);
        znx0Var.m219503e(zhx0Var.m218887d());
        if (eqx0Var != null) {
            znx0Var.m219502d(eqx0Var);
        }
        if (qpx0Var != null) {
            znx0Var.m219501c(qpx0Var);
        }
        wjx0 wjx0Var = new wjx0();
        wjx0Var.m203576c(this.zzg);
        wjx0Var.m203578e(znx0Var.m219505i());
        return t1y0.m186931d(wjx0Var);
    }

    public final /* synthetic */ String zzc(xhw0 xhw0Var, String str, boolean z) throws Exception {
        LanguageIdentifierImpl languageIdentifierImpl;
        boolean z2;
        RuntimeException runtimeException;
        float fFloatValue;
        qpx0 qpx0VarM185308c;
        Float fM213238a = this.zza.m213238a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String strSubstring = str.substring(0, Math.min(str.length(), 200));
            if (fM213238a != null) {
                try {
                    fFloatValue = fM213238a.floatValue();
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
            String strM208846j = xhw0Var.m208846j(strSubstring, fFloatValue);
            if (strM208846j == null) {
                qpx0VarM185308c = null;
            } else {
                sox0 sox0Var = new sox0();
                dox0 dox0Var = new dox0();
                dox0Var.m112835b(strM208846j);
                sox0Var.m185307b(dox0Var.m112836c());
                qpx0VarM185308c = sox0Var.m185308c();
            }
            languageIdentifierImpl = this;
            z2 = z;
            try {
                languageIdentifierImpl.zze(jElapsedRealtime, z2, null, qpx0VarM185308c, zzhx.NO_ERROR);
                return strM208846j;
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

    public final /* synthetic */ List zzd(xhw0 xhw0Var, String str, boolean z) throws Exception {
        LanguageIdentifierImpl languageIdentifierImpl;
        boolean z2;
        RuntimeException runtimeException;
        float fFloatValue;
        Float fM213238a = this.zza.m213238a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String strSubstring = str.substring(0, Math.min(str.length(), 200));
            if (fM213238a != null) {
                try {
                    fFloatValue = fM213238a.floatValue();
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
            List<IdentifiedLanguage> listM208847k = xhw0Var.m208847k(strSubstring, fFloatValue);
            njy0 njy0Var = new njy0();
            for (IdentifiedLanguage identifiedLanguage : listM208847k) {
                dox0 dox0Var = new dox0();
                dox0Var.m112835b(identifiedLanguage.m16880b());
                dox0Var.m112834a(Float.valueOf(identifiedLanguage.m16879a()));
                njy0Var.m159815c(dox0Var.m112836c());
            }
            vpx0 vpx0Var = new vpx0();
            vpx0Var.m199389b(njy0Var.m159816d());
            languageIdentifierImpl = this;
            z2 = z;
            try {
                languageIdentifierImpl.zze(jElapsedRealtime, z2, vpx0Var.m199390c(), null, zzhx.NO_ERROR);
                return listM208847k;
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
