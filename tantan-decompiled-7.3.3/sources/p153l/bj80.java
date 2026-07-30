package p153l;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class bj80 {

    /* JADX INFO: renamed from: a */
    public final int f76964a;

    /* JADX INFO: renamed from: b */
    public final int f76965b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f76966c;

    /* JADX INFO: renamed from: d */
    public final int f76967d;

    /* JADX INFO: renamed from: e */
    public final int f76968e;

    /* JADX INFO: renamed from: f */
    public boolean f76969f;

    /* JADX INFO: renamed from: g */
    public final int f76970g;

    public bj80(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        wn80.m207184i(i >= 0 && i2 >= i);
        this.f76965b = i;
        this.f76964a = i2;
        this.f76966c = sparseIntArray;
        this.f76967d = i3;
        this.f76968e = i4;
        this.f76970g = i5;
    }

    public bj80(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }
}
