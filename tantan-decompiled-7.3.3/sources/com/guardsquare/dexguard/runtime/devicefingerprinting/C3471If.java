package com.guardsquare.dexguard.runtime.devicefingerprinting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.If */
/* JADX INFO: loaded from: classes7.dex */
final class C3471If extends Thread {

    /* JADX INFO: renamed from: ˊ */
    private static int f11786 = 0;

    /* JADX INFO: renamed from: ˎ */
    private static int f11787 = 1;

    /* JADX INFO: renamed from: ॱ */
    private static final byte[] f11788 = {113, 69, -47, -74};

    /* JADX INFO: renamed from: ˋ */
    private final StringBuilder f11789 = new StringBuilder();

    /* JADX INFO: renamed from: ˏ */
    private final BufferedReader f11790;

    public C3471If(InputStream inputStream) {
        this.f11790 = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        while (true) {
            try {
                String line = this.f11790.readLine();
                if (line == null) {
                    this.f11790.close();
                    int i2 = f11787;
                    f11786 = ((i2 & 89) + (i2 | 89)) % 128;
                    return;
                }
                StringBuilder sb = this.f11789;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(line);
                if (f11788 == null) {
                    int i3 = f11787;
                    f11786 = ((i3 ^ 1) + ((i3 & 1) << 1)) % 128;
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
    public final String m17486() {
        int i = f11786 + 97;
        f11787 = i % 128;
        int i2 = i % 2;
        String string = this.f11789.toString();
        if (i2 == 0) {
            int i3 = 49 / 0;
        }
        return string;
    }
}
