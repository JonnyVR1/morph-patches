package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.qkq0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1fSDK extends FilterInputStream {
    private static final short getCurrencyIso4217Code = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private int equals;
    private byte[] getMediationNetwork;
    private int getMonetizationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private final int toString;
    private int valueOf;

    private AFj1fSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.valueOf = 1;
        this.AFAdRevenueData = new byte[8];
        this.getRevenue = new byte[8];
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = 8;
        this.component2 = 8;
        this.component3 = Math.min(Math.max(i2, 5), 16);
        this.areAllFieldsValid = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.getRevenue, 0, 8);
        }
        long j = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i == 0) {
            this.component1 = (int) j;
            long j2 = j >> 3;
            short s = getCurrencyIso4217Code;
            this.hashCode = (int) ((((long) s) * j2) >> 32);
            this.equals = (int) (j >> 32);
            this.copy = (int) (j2 + ((long) s));
        } else {
            int i4 = (int) j;
            this.component1 = i4;
            this.hashCode = i4 * i;
            this.equals = i ^ i4;
            this.copy = (int) (j >> 32);
        }
        this.copydefault = 100;
        this.toString = 100;
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.component4 == Integer.MAX_VALUE) {
            this.component4 = ((FilterInputStream) this).in.read();
        }
        if (this.getMonetizationNetwork == 8) {
            byte[] bArr = this.AFAdRevenueData;
            int i = this.component4;
            bArr[0] = (byte) i;
            if (i < 0) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.AFAdRevenueData, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                qkq0.m175383a("unexpected block size");
                return 0;
            }
            int i4 = this.copydefault;
            if (i4 == this.toString) {
                getMediationNetwork();
            } else {
                if (this.valueOf <= i4) {
                    getMediationNetwork();
                }
                int i5 = this.valueOf;
                if (i5 < this.toString) {
                    this.valueOf = i5 + 1;
                } else {
                    this.valueOf = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.component4 = i6;
            this.getMonetizationNetwork = 0;
            this.component2 = i6 < 0 ? 8 - (this.AFAdRevenueData[7] & 255) : 8;
        }
        return this.component2;
    }

    private void getMediationNetwork() {
        if (this.areAllFieldsValid == 3) {
            byte[] bArr = this.AFAdRevenueData;
            System.arraycopy(bArr, 0, this.getMediationNetwork, 0, bArr.length);
        }
        byte[] bArr2 = this.AFAdRevenueData;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) + ((bArr2[1] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << Tnaf.POW_2_WIDTH)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.component3;
            if (i3 >= i4) {
                break;
            }
            short s = getCurrencyIso4217Code;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.equals)) ^ ((i >>> 5) + this.copy);
            i -= (((i2 << 4) + this.component1) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.hashCode);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.AFAdRevenueData;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.areAllFieldsValid == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.AFAdRevenueData;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.getRevenue[i5]);
            }
            byte[] bArr5 = this.getMediationNetwork;
            System.arraycopy(bArr5, 0, this.getRevenue, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.component2 - this.getMonetizationNetwork;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getCurrencyIso4217Code();
            int i5 = this.getMonetizationNetwork;
            if (i5 >= this.component2) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFAdRevenueData;
            this.getMonetizationNetwork = i5 + 1;
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
        getCurrencyIso4217Code();
        int i = this.getMonetizationNetwork;
        if (i >= this.component2) {
            return -1;
        }
        byte[] bArr = this.AFAdRevenueData;
        this.getMonetizationNetwork = i + 1;
        return bArr[i] & 255;
    }

    public AFj1fSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }
}
