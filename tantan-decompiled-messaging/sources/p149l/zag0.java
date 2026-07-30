package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class zag0 {

    /* JADX INFO: renamed from: a */
    public final boolean[] f202347a = new boolean[256];

    /* JADX INFO: renamed from: b */
    public final byte[] f202348b = new byte[256];

    /* JADX INFO: renamed from: c */
    public final byte[] f202349c = new byte[18002];

    /* JADX INFO: renamed from: d */
    public final byte[] f202350d = new byte[18002];

    /* JADX INFO: renamed from: e */
    public final int[] f202351e = new int[256];

    /* JADX INFO: renamed from: f */
    public final int[][] f202352f;

    /* JADX INFO: renamed from: g */
    public final int[][] f202353g;

    /* JADX INFO: renamed from: h */
    public final int[][] f202354h;

    /* JADX INFO: renamed from: i */
    public final int[] f202355i;

    /* JADX INFO: renamed from: j */
    public final int[] f202356j;

    /* JADX INFO: renamed from: k */
    public final char[] f202357k;

    /* JADX INFO: renamed from: l */
    public final char[][] f202358l;

    /* JADX INFO: renamed from: m */
    public final byte[] f202359m;

    /* JADX INFO: renamed from: n */
    public int[] f202360n;

    /* JADX INFO: renamed from: o */
    public final byte[] f202361o;

    public zag0(int i) {
        Class cls = Integer.TYPE;
        this.f202352f = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f202353g = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f202354h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f202355i = new int[6];
        this.f202356j = new int[257];
        this.f202357k = new char[256];
        this.f202358l = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        this.f202359m = new byte[6];
        this.f202361o = new byte[i * LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY];
    }
}
