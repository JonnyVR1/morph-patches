package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLevel;
import java.text.DecimalFormat;
import java.util.List;
import p149l.e16;
import p149l.g5c0;
import p149l.h1c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.t100;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView[] f52948d;

    /* JADX INFO: renamed from: e */
    public TextView[] f52949e;

    /* JADX INFO: renamed from: f */
    public ImageView[] f52950f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f52951g;

    /* JADX INFO: renamed from: h */
    public View[] f52952h;

    /* JADX INFO: renamed from: i */
    public int[] f52953i;

    /* JADX INFO: renamed from: j */
    public long[] f52954j;

    /* JADX INFO: renamed from: k */
    public long[] f52955k;

    /* JADX INFO: renamed from: l */
    public long f52956l;

    /* JADX INFO: renamed from: m */
    public int f52957m;

    /* JADX INFO: renamed from: n */
    public int f52958n;

    /* JADX INFO: renamed from: o */
    public String f52959o;

    public LevelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52948d = new TextView[4];
        this.f52949e = new TextView[4];
        this.f52950f = new ImageView[4];
        this.f52952h = new View[4];
        LayoutInflater.from(context).inflate(t6c0.f168340f3, this);
        this.f52948d[0] = (TextView) findViewById(g5c0.f100936g3);
        this.f52948d[1] = (TextView) findViewById(g5c0.f100946h3);
        this.f52948d[2] = (TextView) findViewById(g5c0.f100956i3);
        this.f52948d[3] = (TextView) findViewById(g5c0.f100966j3);
        this.f52952h[0] = findViewById(g5c0.f100986l3);
        this.f52952h[1] = findViewById(g5c0.f100995m3);
        this.f52952h[2] = findViewById(g5c0.f101004n3);
        this.f52952h[3] = findViewById(g5c0.f101013o3);
        this.f52949e[0] = (TextView) findViewById(g5c0.f101014o4);
        this.f52949e[1] = (TextView) findViewById(g5c0.f101023p4);
        this.f52949e[2] = (TextView) findViewById(g5c0.f101032q4);
        this.f52949e[3] = (TextView) findViewById(g5c0.f101041r4);
        this.f52950f[0] = (ImageView) findViewById(g5c0.f100967j4);
        this.f52950f[1] = (ImageView) findViewById(g5c0.f100977k4);
        this.f52950f[2] = (ImageView) findViewById(g5c0.f100987l4);
        this.f52950f[3] = (ImageView) findViewById(g5c0.f100996m4);
        this.f52951g = (ProgressBar) findViewById(g5c0.f101005n4);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m77869h0(int i) {
        if (i <= 10000) {
            return i + "";
        }
        return new DecimalFormat("#").format(i / 10000.0f) + "万";
    }

    /* JADX INFO: renamed from: i0 */
    public void m77870i0(int[] iArr, long[] jArr, long j, int i) {
        TextView[] textViewArr;
        long[] jArr2;
        this.f52953i = iArr;
        this.f52954j = jArr;
        this.f52956l = j;
        this.f52957m = i;
        this.f52955k = new long[this.f52948d.length - 1];
        int length = 0;
        long j2 = jArr[0];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.f52948d;
            if (i2 >= textViewArr2.length) {
                break;
            }
            textViewArr2[i2].setText("Lv." + iArr[i2]);
            this.f52949e[i2].setText(m77869h0((int) jArr[i2]));
            int i4 = iArr[i2];
            TextView[] textViewArr3 = this.f52948d;
            if (i4 == 0) {
                textViewArr3[i2].setVisibility(4);
            } else {
                textViewArr3[i2].setVisibility(0);
            }
            long j3 = jArr[i2];
            if (j3 <= j) {
                i3 = i2;
            }
            if (i2 > 0) {
                this.f52955k[i2 - 1] = j3 - j2;
            }
            j2 = jArr[i2];
            i2++;
        }
        int i5 = 0;
        while (true) {
            textViewArr = this.f52948d;
            if (i5 >= textViewArr.length) {
                break;
            }
            xdl0.m208344M(this.f52952h[i5], false);
            if (i5 > i3 || j == 0) {
                this.f52948d[i5].setBackgroundResource(i3c0.f111209w7);
                this.f52948d[i5].setTextColor(e16.m114375c(getContext(), h1c0.f105397q0));
                this.f52949e[i5].setTextColor(e16.m114375c(getContext(), h1c0.f105386m1));
                this.f52950f[i5].setImageResource(i3c0.f110653B3);
            } else {
                this.f52948d[i5].setBackgroundResource(i3c0.f111197v7);
                this.f52948d[i5].setTextColor(e16.m114375c(getContext(), h1c0.f105362e1));
                this.f52949e[i5].setTextColor(e16.m114375c(getContext(), h1c0.f105362e1));
                this.f52950f[i5].setImageResource(i3c0.f110641A3);
            }
            i5++;
        }
        xdl0.m208344M(textViewArr[i3], true);
        if (j >= 0 && !TextUtils.isEmpty(this.f52959o)) {
            int i6 = i3 + 1;
            TextView[] textViewArr4 = this.f52948d;
            if (i6 < textViewArr4.length) {
                textViewArr4[i6].setText(this.f52959o);
                this.f52948d[i6].setTextColor(kvc0.m147352a(h1c0.f105386m1));
                this.f52948d[i6].setBackgroundResource(i3c0.f111121p3);
                xdl0.m208344M(this.f52952h[i6], true);
                if (i3 == 2) {
                    xdl0.m208344M(this.f52948d[i3], false);
                }
            }
        }
        if (i3 >= iArr.length - 1) {
            length = this.f52951g.getMax();
        } else if (j != 0) {
            long j4 = j - jArr[0];
            while (true) {
                jArr2 = this.f52955k;
                if (length >= jArr2.length) {
                    break;
                }
                long j5 = jArr2[length];
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                length++;
            }
            length = ((int) (((length * (1.0f / jArr2.length)) + (length >= jArr2.length ? 0.0f : ((j4 * 1.0f) / jArr2[length]) * (1.0f / jArr2.length))) * 100.0f)) + this.f52958n;
        }
        this.f52951g.setProgress(length);
    }

    /* JADX INFO: renamed from: j0 */
    public void m77871j0(int i, long j, List<BLiveAuctionLevel> list) {
        m77872k0(i, j, list, "");
    }

    /* JADX INFO: renamed from: k0 */
    public void m77872k0(int i, long j, List<BLiveAuctionLevel> list, String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            this.f52959o = str;
        }
        if (i == -1 && j == -1) {
            i = this.f52957m;
            j = this.f52956l;
        }
        int i3 = i;
        long j2 = j;
        int size = list == null ? 0 : list.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        for (int i4 = 0; i4 < size; i4++) {
            BLiveAuctionLevel bLiveAuctionLevel = list.get(i4);
            iArr[i4] = bLiveAuctionLevel.level;
            jArr[i4] = bLiveAuctionLevel.minWorth;
        }
        if (i3 >= 7) {
            i2 = i3;
        } else if (i3 >= 5) {
            i2 = 4;
        } else {
            i2 = i3 >= 3 ? 2 : 0;
        }
        if (size - i2 < 4) {
            i2 = size - 4;
        }
        int[] iArr2 = new int[4];
        long[] jArr2 = new long[4];
        System.arraycopy(iArr, i2, iArr2, 0, 4);
        System.arraycopy(jArr, i2, jArr2, 0, 4);
        m77870i0(iArr2, jArr2, j2, i3);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        offsetDescendantRectToMyCoords(this.f52950f[0], rect);
        offsetDescendantRectToMyCoords(this.f52950f[3], rect2);
        ProgressBar progressBar = this.f52951g;
        int width = progressBar.getWidth() * 100;
        int i5 = rect2.right - rect.left;
        int i6 = t100.f167259h;
        progressBar.setMax(width / (i5 + i6));
        this.f52958n = (int) (((i6 * this.f52951g.getMax()) * 1.0f) / this.f52951g.getWidth());
    }

    public LevelView(Context context) {
        this(context, null);
    }
}
