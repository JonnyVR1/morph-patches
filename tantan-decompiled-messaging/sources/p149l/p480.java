package p149l;

import android.graphics.Bitmap;
import io.agora.rtc2.Constants;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class p480 extends wfw {

    /* JADX INFO: renamed from: c */
    private final byte[] f147044c;

    /* JADX INFO: renamed from: d */
    private final int f147045d;

    /* JADX INFO: renamed from: e */
    private final int f147046e;

    /* JADX INFO: renamed from: f */
    private final int f147047f;

    /* JADX INFO: renamed from: g */
    private final int f147048g;

    public p480(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            ig3.m135964a("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.f147044c = bArr;
        this.f147045d = i;
        this.f147046e = i2;
        this.f147047f = i3;
        this.f147048g = i4;
    }

    @Override // p149l.wfw
    /* JADX INFO: renamed from: b */
    public byte[] mo167373b() {
        int iM202992d = m202992d();
        int iM202991a = m202991a();
        int i = this.f147045d;
        if (iM202992d == i && iM202991a == this.f147046e) {
            return this.f147044c;
        }
        int i2 = iM202992d * iM202991a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f147048g * i) + this.f147047f;
        byte[] bArr2 = this.f147044c;
        if (iM202992d == i) {
            System.arraycopy(bArr2, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < iM202991a; i4++) {
            System.arraycopy(bArr2, i3, bArr, i4 * iM202992d, iM202992d);
            i3 += this.f147045d;
        }
        return bArr;
    }

    @Override // p149l.wfw
    /* JADX INFO: renamed from: c */
    public byte[] mo167374c(int i, byte[] bArr) {
        if (i < 0 || i >= m202991a()) {
            k250.m144273a("Requested row is outside the image: ", i);
            return null;
        }
        int iM202992d = m202992d();
        if (bArr == null || bArr.length < iM202992d) {
            bArr = new byte[iM202992d];
        }
        System.arraycopy(this.f147044c, ((i + this.f147048g) * this.f147045d) + this.f147047f, bArr, 0, iM202992d);
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public Bitmap m167375g() {
        int iM202992d = m202992d();
        int iM202991a = m202991a();
        int[] iArr = new int[iM202992d * iM202991a];
        byte[] bArr = this.f147044c;
        int i = (this.f147048g * this.f147045d) + this.f147047f;
        for (int i2 = 0; i2 < iM202991a; i2++) {
            int i3 = i2 * iM202992d;
            for (int i4 = 0; i4 < iM202992d; i4++) {
                iArr[i3 + i4] = ((bArr[i + i4] & 255) * Constants.AUDIO_ENCODING_TYPE_AAC_16000_LOW) | RoundedDrawable.DEFAULT_BORDER_COLOR;
            }
            i += this.f147045d;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM202992d, iM202991a, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, iM202992d, 0, 0, iM202992d, iM202991a);
        return bitmapCreateBitmap;
    }
}
