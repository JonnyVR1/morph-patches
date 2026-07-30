package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.java_websocket.WebSocket;
import p149l.j6f;
import p149l.pkq0;
import p149l.upk0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbrv extends zzazt {
    static final zzbsz zza;
    static final zzbqn zzb;
    private static final Logger zzc = Logger.getLogger(zzbrv.class.getName());
    private static final zzbql zzd;
    private static final EnumSet zze;
    private final zzbmd zzf;
    private SSLSocketFactory zzh;
    private final zzbqw zzg = zzbqz.zza();
    private final zzbqn zzl = zzb;
    private final zzbqn zzm = zzbqn.zza(zzbjd.zzq);
    private final zzbsz zzi = zza;
    private int zzk = 1;
    private final long zzj = zzbjd.zzl;

    static {
        zzbsx zzbsxVar = new zzbsx(zzbsz.zza);
        zzbsxVar.zza(zzbsw.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzbsw.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzbsw.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzbsw.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzbsw.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzbsw.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        zzbsxVar.zzd(zzbtn.TLS_1_2);
        zzbsxVar.zzc(true);
        zza = zzbsxVar.zzf();
        zzbrn zzbrnVar = new zzbrn();
        zzd = zzbrnVar;
        zzb = zzbqn.zza(zzbrnVar);
        zze = EnumSet.of(zzbdy.MTLS, zzbdy.CUSTOM_MANAGERS);
    }

    private zzbrv(String str) {
        this.zzf = new zzbmd(str, null, null, new zzbrr(this, null), new zzbrp(this, null));
    }

    public static zzbrv zze(String str, int i) {
        return new zzbrv(zzbjd.zzd("places.googleapis.com", WebSocket.DEFAULT_WSS_PORT));
    }

    @Override // com.google.android.libraries.places.internal.zzazt
    public final zzbbs zzb() {
        return this.zzf;
    }

    public final int zzc() {
        int i = this.zzk;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        y9g0.m213537a("TLS not handled");
        return 0;
    }

    public final zzbru zzd() {
        long j = this.zzj;
        zzbsz zzbszVar = this.zzi;
        zzbqw zzbqwVar = this.zzg;
        return new zzbru(this.zzl, this.zzm, null, zzg(), null, zzbszVar, 4194304, false, Long.MAX_VALUE, j, j6f.COLOR_SPACE_UNCALIBRATED, false, Api.BaseClientBuilder.API_PRIORITY_OTHER, zzbqwVar, false, null);
    }

    public final zzbrv zzf() {
        this.zzk = 1;
        return this;
    }

    public final SSLSocketFactory zzg() {
        int i = this.zzk;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            upk0.m194883a("Unknown negotiation type: TLS");
            return null;
        }
        try {
            if (this.zzh == null) {
                this.zzh = SSLContext.getInstance(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, zzbtl.zze().zzf()).getSocketFactory();
            }
            return this.zzh;
        } catch (GeneralSecurityException e) {
            pkq0.m170054a("TLS Provider failure", e);
            return null;
        }
    }
}
