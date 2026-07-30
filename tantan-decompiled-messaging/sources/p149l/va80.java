package p149l;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class va80 {

    /* JADX INFO: renamed from: a */
    public final int f180716a;

    /* JADX INFO: renamed from: b */
    public final int f180717b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f180718c;

    /* JADX INFO: renamed from: d */
    public final int f180719d;

    /* JADX INFO: renamed from: e */
    public final int f180720e;

    /* JADX INFO: renamed from: f */
    public boolean f180721f;

    /* JADX INFO: renamed from: g */
    public final int f180722g;

    public va80(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        rf80.m179118i(i >= 0 && i2 >= i);
        this.f180717b = i;
        this.f180716a = i2;
        this.f180718c = sparseIntArray;
        this.f180719d = i3;
        this.f180720e = i4;
        this.f180722g = i5;
    }

    public va80(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }
}
