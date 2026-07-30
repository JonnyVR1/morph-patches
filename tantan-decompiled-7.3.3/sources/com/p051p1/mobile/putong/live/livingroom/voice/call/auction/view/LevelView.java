package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLevel;
import java.text.DecimalFormat;
import java.util.List;
import p153l.bnl0;
import p153l.j26;
import p153l.mdc0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class LevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView[] f53796d;

    /* JADX INFO: renamed from: e */
    public TextView[] f53797e;

    /* JADX INFO: renamed from: f */
    public ImageView[] f53798f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f53799g;

    /* JADX INFO: renamed from: h */
    public View[] f53800h;

    /* JADX INFO: renamed from: i */
    public int[] f53801i;

    /* JADX INFO: renamed from: j */
    public long[] f53802j;

    /* JADX INFO: renamed from: k */
    public long[] f53803k;

    /* JADX INFO: renamed from: l */
    public long f53804l;

    /* JADX INFO: renamed from: m */
    public int f53805m;

    /* JADX INFO: renamed from: n */
    public int f53806n;

    /* JADX INFO: renamed from: o */
    public String f53807o;

    public LevelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53796d = new TextView[4];
        this.f53797e = new TextView[4];
        this.f53798f = new ImageView[4];
        this.f53800h = new View[4];
        LayoutInflater.from(context).inflate(yec0.f199072f3, this);
        this.f53796d[0] = (TextView) findViewById(mdc0.f136181g3);
        this.f53796d[1] = (TextView) findViewById(mdc0.f136191h3);
        this.f53796d[2] = (TextView) findViewById(mdc0.f136201i3);
        this.f53796d[3] = (TextView) findViewById(mdc0.f136211j3);
        this.f53800h[0] = findViewById(mdc0.f136231l3);
        this.f53800h[1] = findViewById(mdc0.f136240m3);
        this.f53800h[2] = findViewById(mdc0.f136249n3);
        this.f53800h[3] = findViewById(mdc0.f136258o3);
        this.f53797e[0] = (TextView) findViewById(mdc0.f136259o4);
        this.f53797e[1] = (TextView) findViewById(mdc0.f136268p4);
        this.f53797e[2] = (TextView) findViewById(mdc0.f136277q4);
        this.f53797e[3] = (TextView) findViewById(mdc0.f136286r4);
        this.f53798f[0] = (ImageView) findViewById(mdc0.f136212j4);
        this.f53798f[1] = (ImageView) findViewById(mdc0.f136222k4);
        this.f53798f[2] = (ImageView) findViewById(mdc0.f136232l4);
        this.f53798f[3] = (ImageView) findViewById(mdc0.f136241m4);
        this.f53799g = (ProgressBar) findViewById(mdc0.f136250n4);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m79052h0(int i) {
        if (i <= 10000) {
            return i + "";
        }
        return new DecimalFormat("#").format(i / 10000.0f) + "万";
    }

    /* JADX INFO: renamed from: i0 */
    public void m79053i0(int[] iArr, long[] jArr, long j, int i) {
        TextView[] textViewArr;
        long[] jArr2;
        this.f53801i = iArr;
        this.f53802j = jArr;
        this.f53804l = j;
        this.f53805m = i;
        this.f53803k = new long[this.f53796d.length - 1];
        int length = 0;
        long j2 = jArr[0];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.f53796d;
            if (i2 >= textViewArr2.length) {
                break;
            }
            textViewArr2[i2].setText("Lv." + iArr[i2]);
            this.f53797e[i2].setText(m79052h0((int) jArr[i2]));
            int i4 = iArr[i2];
            TextView[] textViewArr3 = this.f53796d;
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
                this.f53803k[i2 - 1] = j3 - j2;
            }
            j2 = jArr[i2];
            i2++;
        }
        int i5 = 0;
        while (true) {
            textViewArr = this.f53796d;
            if (i5 >= textViewArr.length) {
                break;
            }
            bnl0.m105524M(this.f53800h[i5], false);
            if (i5 > i3 || j == 0) {
                this.f53796d[i5].setBackgroundResource(obc0.f146537w7);
                this.f53796d[i5].setTextColor(j26.m143190c(getContext(), n9c0.f140858q0));
                this.f53797e[i5].setTextColor(j26.m143190c(getContext(), n9c0.f140847m1));
                this.f53798f[i5].setImageResource(obc0.f145981B3);
            } else {
                this.f53796d[i5].setBackgroundResource(obc0.f146525v7);
                this.f53796d[i5].setTextColor(j26.m143190c(getContext(), n9c0.f140823e1));
                this.f53797e[i5].setTextColor(j26.m143190c(getContext(), n9c0.f140823e1));
                this.f53798f[i5].setImageResource(obc0.f145969A3);
            }
            i5++;
        }
        bnl0.m105524M(textViewArr[i3], true);
        if (j >= 0 && !TextUtils.isEmpty(this.f53807o)) {
            int i6 = i3 + 1;
            TextView[] textViewArr4 = this.f53796d;
            if (i6 < textViewArr4.length) {
                textViewArr4[i6].setText(this.f53807o);
                this.f53796d[i6].setTextColor(n3d0.m161277a(n9c0.f140847m1));
                this.f53796d[i6].setBackgroundResource(obc0.f146449p3);
                bnl0.m105524M(this.f53800h[i6], true);
                if (i3 == 2) {
                    bnl0.m105524M(this.f53796d[i3], false);
                }
            }
        }
        if (i3 >= iArr.length - 1) {
            length = this.f53799g.getMax();
        } else if (j != 0) {
            long j4 = j - jArr[0];
            while (true) {
                jArr2 = this.f53803k;
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
            length = ((int) (((length * (1.0f / jArr2.length)) + (length >= jArr2.length ? 0.0f : ((j4 * 1.0f) / jArr2[length]) * (1.0f / jArr2.length))) * 100.0f)) + this.f53806n;
        }
        this.f53799g.setProgress(length);
    }

    /* JADX INFO: renamed from: j0 */
    public void m79054j0(int i, long j, List<BLiveAuctionLevel> list) {
        m79055k0(i, j, list, "");
    }

    /* JADX INFO: renamed from: k0 */
    public void m79055k0(int i, long j, List<BLiveAuctionLevel> list, String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            this.f53807o = str;
        }
        if (i == -1 && j == -1) {
            i = this.f53805m;
            j = this.f53804l;
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
        m79053i0(iArr2, jArr2, j2, i3);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        offsetDescendantRectToMyCoords(this.f53798f[0], rect);
        offsetDescendantRectToMyCoords(this.f53798f[3], rect2);
        ProgressBar progressBar = this.f53799g;
        int width = progressBar.getWidth() * 100;
        int i5 = rect2.right - rect.left;
        int i6 = qa00.f156321h;
        progressBar.setMax(width / (i5 + i6));
        this.f53806n = (int) (((i6 * this.f53799g.getMax()) * 1.0f) / this.f53799g.getWidth());
    }

    public LevelView(Context context) {
        this(context, null);
    }
}
