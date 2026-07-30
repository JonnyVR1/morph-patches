package p153l;

import android.graphics.Bitmap;
import io.agora.rtc2.Constants;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class vc80 extends uhw {

    /* JADX INFO: renamed from: c */
    private final byte[] f183343c;

    /* JADX INFO: renamed from: d */
    private final int f183344d;

    /* JADX INFO: renamed from: e */
    private final int f183345e;

    /* JADX INFO: renamed from: f */
    private final int f183346f;

    /* JADX INFO: renamed from: g */
    private final int f183347g;

    public vc80(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            wg3.m206174a("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.f183343c = bArr;
        this.f183344d = i;
        this.f183345e = i2;
        this.f183346f = i3;
        this.f183347g = i4;
    }

    @Override // p153l.uhw
    /* JADX INFO: renamed from: b */
    public byte[] mo196127b() {
        int iM196129d = m196129d();
        int iM196126a = m196126a();
        int i = this.f183344d;
        if (iM196129d == i && iM196126a == this.f183345e) {
            return this.f183343c;
        }
        int i2 = iM196129d * iM196126a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f183347g * i) + this.f183346f;
        byte[] bArr2 = this.f183343c;
        if (iM196129d == i) {
            System.arraycopy(bArr2, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < iM196126a; i4++) {
            System.arraycopy(bArr2, i3, bArr, i4 * iM196129d, iM196129d);
            i3 += this.f183344d;
        }
        return bArr;
    }

    @Override // p153l.uhw
    /* JADX INFO: renamed from: c */
    public byte[] mo196128c(int i, byte[] bArr) {
        if (i < 0 || i >= m196126a()) {
            za50.m219101a("Requested row is outside the image: ", i);
            return null;
        }
        int iM196129d = m196129d();
        if (bArr == null || bArr.length < iM196129d) {
            bArr = new byte[iM196129d];
        }
        System.arraycopy(this.f183343c, ((i + this.f183347g) * this.f183344d) + this.f183346f, bArr, 0, iM196129d);
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public Bitmap m200794g() {
        int iM196129d = m196129d();
        int iM196126a = m196126a();
        int[] iArr = new int[iM196129d * iM196126a];
        byte[] bArr = this.f183343c;
        int i = (this.f183347g * this.f183344d) + this.f183346f;
        for (int i2 = 0; i2 < iM196126a; i2++) {
            int i3 = i2 * iM196129d;
            for (int i4 = 0; i4 < iM196129d; i4++) {
                iArr[i3 + i4] = ((bArr[i + i4] & 255) * Constants.AUDIO_ENCODING_TYPE_AAC_16000_LOW) | RoundedDrawable.DEFAULT_BORDER_COLOR;
            }
            i += this.f183344d;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM196129d, iM196126a, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, iM196129d, 0, 0, iM196129d, iM196126a);
        return bitmapCreateBitmap;
    }
}
