package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsc implements Runnable {
    final /* synthetic */ CountDownLatch zza;
    final /* synthetic */ zzbri zzb;
    final /* synthetic */ zzbsf zzc;

    public zzbsc(zzbsf zzbsfVar, CountDownLatch countDownLatch, zzbri zzbriVar) {
        this.zza = countDownLatch;
        this.zzb = zzbriVar;
        this.zzc = zzbsfVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Socket socketZzA;
        try {
            this.zza.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        zzbwd zzbwdVarZzb = zzbwh.zzb(new zzbsb(this));
        try {
            try {
                zzbsf zzbsfVar = this.zzc;
                zzbaa zzbaaVar = zzbsfVar.zza;
                SSLSession session = null;
                if (zzbaaVar == null) {
                    socketZzA = zzbsfVar.zzE.createSocket(zzbsfVar.zze.getAddress(), this.zzc.zze.getPort());
                } else {
                    if (!(zzbaaVar.zze() instanceof InetSocketAddress)) {
                        throw new zzbdp(zzbdo.zzo.zzg("Unsupported SocketAddress implementation ".concat(String.valueOf(this.zzc.zza.zze().getClass()))), null);
                    }
                    socketZzA = zzbsf.zzA(zzbsfVar, zzbaaVar.zzd(), (InetSocketAddress) zzbaaVar.zze(), this.zzc.zza.zzc(), this.zzc.zza.zzb());
                }
                zzbsf zzbsfVar2 = this.zzc;
                Socket socket = socketZzA;
                if (zzbsfVar2.zzF != null) {
                    SSLSocketFactory sSLSocketFactory = zzbsfVar2.zzF;
                    String strZzy = zzbsfVar2.zzy();
                    int iZzi = this.zzc.zzi();
                    zzbsz zzbszVar = this.zzc.zzJ;
                    zzmt.zzc(sSLSocketFactory, "sslSocketFactory");
                    zzmt.zzc(socketZzA, "socket");
                    zzmt.zzc(zzbszVar, "spec");
                    SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socketZzA, strZzy, iZzi, true);
                    zzbszVar.zza(sSLSocket, false);
                    String strZzb = zzbsk.zzd().zzb(sSLSocket, strZzy, zzbszVar.zzb() ? zzbsm.zza : null);
                    List list = zzbsm.zza;
                    zzmt.zzr(list.contains(zzbtm.zza(strZzb)), "Only " + String.valueOf(list) + " are supported, but negotiated protocol is %s", strZzb);
                    if (!zzbte.zza.verify((strZzy.startsWith("[") && strZzy.endsWith(Constants.AES_SUFFIX)) ? strZzy.substring(1, strZzy.length() - 1) : strZzy, sSLSocket.getSession())) {
                        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(strZzy));
                    }
                    session = sSLSocket.getSession();
                    socket = sSLSocket;
                }
                socket.setTcpNoDelay(true);
                zzbwd zzbwdVarZzb2 = zzbwh.zzb(zzbwh.zzd(socket));
                this.zzb.zzm(zzbwh.zzc(socket), socket);
                zzbsf zzbsfVar3 = this.zzc;
                zzayb zzaybVarZzb = zzbsfVar3.zzy.zzb();
                zzaybVarZzb.zzb(zzazw.zza, socket.getRemoteSocketAddress());
                zzaybVarZzb.zzb(zzazw.zzb, socket.getLocalSocketAddress());
                zzaybVarZzb.zzb(zzazw.zzc, session);
                zzaybVarZzb.zzb(zzbit.zza, session == null ? zzbdf.NONE : zzbdf.PRIVACY_AND_INTEGRITY);
                zzbsfVar3.zzy = zzaybVarZzb.zzc();
                zzbsf zzbsfVar4 = this.zzc;
                zzbsfVar4.zzx = new zzbse(zzbsfVar4, zzbsfVar4.zzk.zzc(zzbwdVarZzb2, true));
                synchronized (this.zzc.zzo) {
                    try {
                        zzbsf zzbsfVar5 = this.zzc;
                        zzmt.zzc(socket, "socket");
                        zzbsfVar5.zzG = socket;
                        if (session != null) {
                            this.zzc.zzP = new zzbaf(new zzbag(session));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (zzbdp e) {
                this.zzc.zzaa(0, zzbtp.INTERNAL_ERROR, e.zza());
                zzbsf zzbsfVar6 = this.zzc;
                zzbsfVar6.zzx = new zzbse(zzbsfVar6, zzbsfVar6.zzk.zzc(zzbwdVarZzb, true));
            } catch (Exception e2) {
                this.zzc.zzb(e2);
                zzbsf zzbsfVar7 = this.zzc;
                zzbsfVar7.zzx = new zzbse(zzbsfVar7, zzbsfVar7.zzk.zzc(zzbwdVarZzb, true));
            }
        } catch (Throwable th2) {
            zzbsf zzbsfVar8 = this.zzc;
            zzbsfVar8.zzx = new zzbse(zzbsfVar8, zzbsfVar8.zzk.zzc(zzbwdVarZzb, true));
            throw th2;
        }
    }
}
