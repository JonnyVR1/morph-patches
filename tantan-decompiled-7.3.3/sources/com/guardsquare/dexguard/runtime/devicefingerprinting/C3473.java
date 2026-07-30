package com.guardsquare.dexguard.runtime.devicefingerprinting;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ı */
/* JADX INFO: loaded from: classes7.dex */
public final class C3473 extends C3475 {

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ı$ǃ, reason: contains not printable characters */
    public static class C22799 extends C3475.C22800 {

        /* JADX INFO: renamed from: ˎ */
        private static int f11791 = 1;

        /* JADX INFO: renamed from: ˏ */
        private static int f11792;

        @Override // com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.C22800
        /* JADX INFO: renamed from: ˋ */
        public final /* bridge */ /* synthetic */ void mo17487(boolean z) {
            f11791 = (f11792 + 77) % 128;
            super.mo17487(z);
            int i = f11792;
            f11791 = ((i & 101) + (i | 101)) % 128;
        }
    }
}
