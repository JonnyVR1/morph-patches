package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p153l.bmk0;
import p153l.h4k0;
import p153l.lni;
import p153l.w11;
import p153l.zej0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C2023a implements lni<C2023a> {

    /* JADX INFO: renamed from: a */
    public final int f9085a;

    /* JADX INFO: renamed from: b */
    public final int f9086b;

    /* JADX INFO: renamed from: c */
    public final int f9087c;

    /* JADX INFO: renamed from: d */
    public final boolean f9088d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final a f9089e;

    /* JADX INFO: renamed from: f */
    public final b[] f9090f;

    /* JADX INFO: renamed from: g */
    public final long f9091g;

    /* JADX INFO: renamed from: h */
    public final long f9092h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final UUID f9093a;

        /* JADX INFO: renamed from: b */
        public final byte[] f9094b;

        /* JADX INFO: renamed from: c */
        public final zej0[] f9095c;

        public a(UUID uuid, byte[] bArr, zej0[] zej0VarArr) {
            this.f9093a = uuid;
            this.f9094b = bArr;
            this.f9095c = zej0VarArr;
        }
    }

    public C2023a(int i, int i2, long j, long j2, long j3, int i3, boolean z, @Nullable a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : bmk0.m105110W0(j2, 1000000L, j), j3 != 0 ? bmk0.m105110W0(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    @Override // p153l.lni
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2023a mo11307a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            b bVar2 = this.f9090f[streamKey.groupIndex];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m11783b((C1894k[]) arrayList3.toArray(new C1894k[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f9105j[streamKey.streamIndex]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m11783b((C1894k[]) arrayList3.toArray(new C1894k[0])));
        }
        return new C2023a(this.f9085a, this.f9086b, this.f9091g, this.f9092h, this.f9087c, this.f9088d, this.f9089e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f9096a;

        /* JADX INFO: renamed from: b */
        public final String f9097b;

        /* JADX INFO: renamed from: c */
        public final long f9098c;

        /* JADX INFO: renamed from: d */
        public final String f9099d;

        /* JADX INFO: renamed from: e */
        public final int f9100e;

        /* JADX INFO: renamed from: f */
        public final int f9101f;

        /* JADX INFO: renamed from: g */
        public final int f9102g;

        /* JADX INFO: renamed from: h */
        public final int f9103h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public final String f9104i;

        /* JADX INFO: renamed from: j */
        public final C1894k[] f9105j;

        /* JADX INFO: renamed from: k */
        public final int f9106k;

        /* JADX INFO: renamed from: l */
        public final String f9107l;

        /* JADX INFO: renamed from: m */
        public final String f9108m;

        /* JADX INFO: renamed from: n */
        public final List<Long> f9109n;

        /* JADX INFO: renamed from: o */
        public final long[] f9110o;

        /* JADX INFO: renamed from: p */
        public final long f9111p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @Nullable String str5, C1894k[] c1894kArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, c1894kArr, list, bmk0.m105112X0(list, 1000000L, j), bmk0.m105110W0(j2, 1000000L, j));
        }

        /* JADX INFO: renamed from: a */
        public Uri m11782a(int i, int i2) {
            w11.m204371g(this.f9105j != null);
            w11.m204371g(this.f9109n != null);
            w11.m204371g(i2 < this.f9109n.size());
            String string = Integer.toString(this.f9105j[i].f7781h);
            String string2 = this.f9109n.get(i2).toString();
            return h4k0.m133582e(this.f9107l, this.f9108m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        /* JADX INFO: renamed from: b */
        public b m11783b(C1894k[] c1894kArr) {
            return new b(this.f9107l, this.f9108m, this.f9096a, this.f9097b, this.f9098c, this.f9099d, this.f9100e, this.f9101f, this.f9102g, this.f9103h, this.f9104i, c1894kArr, this.f9109n, this.f9110o, this.f9111p);
        }

        /* JADX INFO: renamed from: c */
        public long m11784c(int i) {
            if (i == this.f9106k - 1) {
                return this.f9111p;
            }
            long[] jArr = this.f9110o;
            return jArr[i + 1] - jArr[i];
        }

        /* JADX INFO: renamed from: d */
        public int m11785d(long j) {
            return bmk0.m105141i(this.f9110o, j, true, true);
        }

        /* JADX INFO: renamed from: e */
        public long m11786e(int i) {
            return this.f9110o[i];
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @Nullable String str5, C1894k[] c1894kArr, List<Long> list, long[] jArr, long j2) {
            this.f9107l = str;
            this.f9108m = str2;
            this.f9096a = i;
            this.f9097b = str3;
            this.f9098c = j;
            this.f9099d = str4;
            this.f9100e = i2;
            this.f9101f = i3;
            this.f9102g = i4;
            this.f9103h = i5;
            this.f9104i = str5;
            this.f9105j = c1894kArr;
            this.f9109n = list;
            this.f9110o = jArr;
            this.f9111p = j2;
            this.f9106k = list.size();
        }
    }

    public C2023a(int i, int i2, long j, long j2, int i3, boolean z, @Nullable a aVar, b[] bVarArr) {
        this.f9085a = i;
        this.f9086b = i2;
        this.f9091g = j;
        this.f9092h = j2;
        this.f9087c = i3;
        this.f9088d = z;
        this.f9089e = aVar;
        this.f9090f = bVarArr;
    }
}
