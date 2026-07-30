package com.guardsquare.dexguard.runtime.devicefingerprinting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.If */
/* JADX INFO: loaded from: classes7.dex */
final class C3448If extends Thread {

    /* JADX INFO: renamed from: ˊ */
    private static int f11749 = 0;

    /* JADX INFO: renamed from: ˎ */
    private static int f11750 = 1;

    /* JADX INFO: renamed from: ॱ */
    private static final byte[] f11751 = {113, 69, -47, -74};

    /* JADX INFO: renamed from: ˋ */
    private final StringBuilder f11752 = new StringBuilder();

    /* JADX INFO: renamed from: ˏ */
    private final BufferedReader f11753;

    public C3448If(InputStream inputStream) {
        this.f11753 = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        while (true) {
            try {
                String line = this.f11753.readLine();
                if (line == null) {
                    this.f11753.close();
                    int i2 = f11750;
                    f11749 = ((i2 & 89) + (i2 | 89)) % 128;
                    return;
                }
                StringBuilder sb = this.f11752;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(line);
                if (f11751 == null) {
                    int i3 = f11750;
                    f11749 = ((i3 ^ 1) + ((i3 & 1) << 1)) % 128;
                    i = -3;
                } else {
                    i = 10;
                }
                sb2.append(new String(new byte[]{(byte) i}, 0).intern());
                sb.append(sb2.toString());
            } catch (IOException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ˎ */
    public final String m17431() {
        int i = f11749 + 97;
        f11750 = i % 128;
        int i2 = i % 2;
        String string = this.f11752.toString();
        if (i2 == 0) {
            int i3 = 49 / 0;
        }
        return string;
    }
}
