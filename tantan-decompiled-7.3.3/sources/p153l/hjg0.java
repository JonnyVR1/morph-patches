package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class hjg0 {

    /* JADX INFO: renamed from: a */
    public final boolean[] f110204a = new boolean[256];

    /* JADX INFO: renamed from: b */
    public final byte[] f110205b = new byte[256];

    /* JADX INFO: renamed from: c */
    public final byte[] f110206c = new byte[18002];

    /* JADX INFO: renamed from: d */
    public final byte[] f110207d = new byte[18002];

    /* JADX INFO: renamed from: e */
    public final int[] f110208e = new int[256];

    /* JADX INFO: renamed from: f */
    public final int[][] f110209f;

    /* JADX INFO: renamed from: g */
    public final int[][] f110210g;

    /* JADX INFO: renamed from: h */
    public final int[][] f110211h;

    /* JADX INFO: renamed from: i */
    public final int[] f110212i;

    /* JADX INFO: renamed from: j */
    public final int[] f110213j;

    /* JADX INFO: renamed from: k */
    public final char[] f110214k;

    /* JADX INFO: renamed from: l */
    public final char[][] f110215l;

    /* JADX INFO: renamed from: m */
    public final byte[] f110216m;

    /* JADX INFO: renamed from: n */
    public int[] f110217n;

    /* JADX INFO: renamed from: o */
    public final byte[] f110218o;

    public hjg0(int i) {
        Class cls = Integer.TYPE;
        this.f110209f = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f110210g = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f110211h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f110212i = new int[6];
        this.f110213j = new int[257];
        this.f110214k = new char[256];
        this.f110215l = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        this.f110216m = new byte[6];
        this.f110218o = new byte[i * LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY];
    }
}
