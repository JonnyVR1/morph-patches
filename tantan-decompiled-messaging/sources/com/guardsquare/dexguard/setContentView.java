package com.guardsquare.dexguard;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.qkq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class setContentView extends FilterInputStream {
    private int Movie;
    private int onContextItemSelected;
    private byte[] onOptionsItemSelected;
    private final int openContextMenu;
    private byte[] registerForContextMenu;
    private byte[] setContentView;
    private openContextMenu unregisterForContextMenu;
    private int valueOf;
    private int values;
    private int[] width;

    public setContentView(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.values = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.openContextMenu = iMin;
        this.registerForContextMenu = new byte[8];
        byte[] bArr2 = new byte[8];
        this.setContentView = bArr2;
        this.onOptionsItemSelected = new byte[8];
        this.width = new int[2];
        this.Movie = 8;
        this.onContextItemSelected = 8;
        this.valueOf = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.unregisterForContextMenu = new openContextMenu(iArr, iMin, true, false);
    }

    private void registerForContextMenu() {
        if (this.valueOf == 2) {
            byte[] bArr = this.registerForContextMenu;
            System.arraycopy(bArr, 0, this.onOptionsItemSelected, 0, bArr.length);
        }
        byte[] bArr2 = this.registerForContextMenu;
        int i = ((bArr2[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) + ((bArr2[1] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << Tnaf.POW_2_WIDTH)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.openContextMenu;
        openContextMenu opencontextmenu = this.unregisterForContextMenu;
        unregisterForContextMenu.unregisterForContextMenu(i, i2, false, i3, opencontextmenu.registerForContextMenu, opencontextmenu.setContentView, this.width);
        int[] iArr = this.width;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.registerForContextMenu;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.valueOf == 2) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.registerForContextMenu;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.setContentView[i6]);
            }
            byte[] bArr5 = this.onOptionsItemSelected;
            System.arraycopy(bArr5, 0, this.setContentView, 0, bArr5.length);
        }
    }

    private int unregisterForContextMenu() throws IOException {
        if (this.values == Integer.MAX_VALUE) {
            this.values = ((FilterInputStream) this).in.read();
        }
        if (this.Movie == 8) {
            byte[] bArr = this.registerForContextMenu;
            int i = this.values;
            bArr[0] = (byte) i;
            if (i < 0) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.registerForContextMenu, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            registerForContextMenu();
            int i4 = ((FilterInputStream) this).in.read();
            this.values = i4;
            this.Movie = 0;
            this.onContextItemSelected = i4 < 0 ? 8 - (this.registerForContextMenu[7] & 255) : 8;
        }
        return this.onContextItemSelected;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterForContextMenu();
        return this.onContextItemSelected - this.Movie;
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
            int i5 = this.Movie;
            if (i5 >= this.onContextItemSelected) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.registerForContextMenu;
            this.Movie = i5 + 1;
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
        int i = this.Movie;
        if (i >= this.onContextItemSelected) {
            return -1;
        }
        byte[] bArr = this.registerForContextMenu;
        this.Movie = i + 1;
        return bArr[i] & 255;
    }
}
