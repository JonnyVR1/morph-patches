package com.guardsquare.dexguard.runtime.devicefingerprinting;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ı */
/* JADX INFO: loaded from: classes7.dex */
public final class C3450 extends C3452 {

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ı$ǃ, reason: contains not printable characters */
    public static class C22683 extends C3452.C22684 {

        /* JADX INFO: renamed from: ˎ */
        private static int f11754 = 1;

        /* JADX INFO: renamed from: ˏ */
        private static int f11755;

        @Override // com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.C22684
        /* JADX INFO: renamed from: ˋ */
        public final /* bridge */ /* synthetic */ void mo17432(boolean z) {
            f11754 = (f11755 + 77) % 128;
            super.mo17432(z);
            int i = f11755;
            f11754 = ((i & 101) + (i | 101)) % 128;
        }
    }
}
