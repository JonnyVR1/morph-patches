package com.guardsquare.dexguard;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.qkq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class onOptionsItemSelected extends FilterInputStream {
    private static final short unregisterForContextMenu = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int Movie;
    private int decodeByteArray;
    private int height;
    private int onContextItemSelected;
    private byte[] onOptionsItemSelected;
    private byte[] openContextMenu;
    private int registerForContextMenu;
    private byte[] setContentView;
    private int setTime;
    private int valueOf;
    private int values;
    private int width;

    public onOptionsItemSelected(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.valueOf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.setContentView = new byte[8];
        this.onOptionsItemSelected = new byte[8];
        this.openContextMenu = new byte[8];
        this.registerForContextMenu = 8;
        this.width = 8;
        this.values = Math.min(Math.max(i2, 5), 16);
        this.Movie = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.onOptionsItemSelected, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i != 0) {
            int i4 = (int) j;
            this.onContextItemSelected = i4;
            this.setTime = i4 * i;
            this.decodeByteArray = i4 ^ i;
            this.height = (int) (j >> 32);
            return;
        }
        this.onContextItemSelected = (int) j;
        long j2 = j >> 3;
        short s = unregisterForContextMenu;
        this.setTime = (int) ((((long) s) * j2) >> 32);
        this.decodeByteArray = (int) (j >> 32);
        this.height = (int) (j2 + ((long) s));
    }

    private void setContentView() {
        if (this.Movie == 3) {
            byte[] bArr = this.setContentView;
            System.arraycopy(bArr, 0, this.openContextMenu, 0, bArr.length);
        }
        byte[] bArr2 = this.setContentView;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) + ((bArr2[1] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << Tnaf.POW_2_WIDTH)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.values;
            if (i3 >= i4) {
                break;
            }
            short s = unregisterForContextMenu;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.decodeByteArray)) ^ ((i >>> 5) + this.height);
            i -= (((i2 << 4) + this.onContextItemSelected) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.setTime);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.setContentView;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.Movie == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.setContentView;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.onOptionsItemSelected[i5]);
            }
            byte[] bArr5 = this.openContextMenu;
            System.arraycopy(bArr5, 0, this.onOptionsItemSelected, 0, bArr5.length);
        }
    }

    private int unregisterForContextMenu() throws IOException {
        if (this.valueOf == Integer.MAX_VALUE) {
            this.valueOf = ((FilterInputStream) this).in.read();
        }
        if (this.registerForContextMenu == 8) {
            byte[] bArr = this.setContentView;
            int i = this.valueOf;
            bArr[0] = (byte) i;
            if (i < 0) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.setContentView, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            setContentView();
            int i4 = ((FilterInputStream) this).in.read();
            this.valueOf = i4;
            this.registerForContextMenu = 0;
            this.width = i4 < 0 ? 8 - (this.setContentView[7] & 255) : 8;
        }
        return this.width;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterForContextMenu();
        return this.width - this.registerForContextMenu;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            unregisterForContextMenu();
            int i5 = this.registerForContextMenu;
            if (i5 >= this.width) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.setContentView;
            this.registerForContextMenu = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        unregisterForContextMenu();
        int i = this.registerForContextMenu;
        if (i >= this.width) {
            return -1;
        }
        byte[] bArr = this.setContentView;
        this.registerForContextMenu = i + 1;
        return bArr[i] & 255;
    }
}
