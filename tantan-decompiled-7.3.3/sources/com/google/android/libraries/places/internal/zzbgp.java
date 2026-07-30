package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbgp implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzbgz zzb;

    public zzbgp(zzbgz zzbgzVar, Object obj) {
        this.zza = obj;
        this.zzb = zzbgzVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.libraries.places.internal.zzbgz.zzf(com.google.android.libraries.places.internal.zzbgz):com.google.android.libraries.places.internal.zzayo
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:80)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
        	at java.base/java.util.ArrayList.add(ArrayList.java:485)
        	at java.base/java.util.ArrayList.add(ArrayList.java:497)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:150)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:193)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:185)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:301)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:164)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:93)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
        	... 1 more
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r1 = this;
            com.google.android.libraries.places.internal.zzbgz r0 = r1.zzb
            com.google.android.libraries.places.internal.zzayo r0 = com.google.android.libraries.places.internal.zzbgz.zzf(r0)
            java.lang.Object r1 = r1.zza
            r0.zzd(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbgp.run():void");
    }
}
