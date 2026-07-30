package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p149l.evj0;
import p149l.p11;
import p149l.pki;
import p149l.v5j0;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C2000a implements pki<C2000a> {

    /* JADX INFO: renamed from: a */
    public final int f9048a;

    /* JADX INFO: renamed from: b */
    public final int f9049b;

    /* JADX INFO: renamed from: c */
    public final int f9050c;

    /* JADX INFO: renamed from: d */
    public final boolean f9051d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final a f9052e;

    /* JADX INFO: renamed from: f */
    public final b[] f9053f;

    /* JADX INFO: renamed from: g */
    public final long f9054g;

    /* JADX INFO: renamed from: h */
    public final long f9055h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final UUID f9056a;

        /* JADX INFO: renamed from: b */
        public final byte[] f9057b;

        /* JADX INFO: renamed from: c */
        public final v5j0[] f9058c;

        public a(UUID uuid, byte[] bArr, v5j0[] v5j0VarArr) {
            this.f9056a = uuid;
            this.f9057b = bArr;
            this.f9058c = v5j0VarArr;
        }
    }

    public C2000a(int i, int i2, long j, long j2, long j3, int i3, boolean z, @Nullable a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : vck0.m197832W0(j2, 1000000L, j), j3 != 0 ? vck0.m197832W0(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    @Override // p149l.pki
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2000a mo11253a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            b bVar2 = this.f9053f[streamKey.groupIndex];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m11729b((C1871k[]) arrayList3.toArray(new C1871k[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f9068j[streamKey.streamIndex]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m11729b((C1871k[]) arrayList3.toArray(new C1871k[0])));
        }
        return new C2000a(this.f9048a, this.f9049b, this.f9054g, this.f9055h, this.f9050c, this.f9051d, this.f9052e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f9059a;

        /* JADX INFO: renamed from: b */
        public final String f9060b;

        /* JADX INFO: renamed from: c */
        public final long f9061c;

        /* JADX INFO: renamed from: d */
        public final String f9062d;

        /* JADX INFO: renamed from: e */
        public final int f9063e;

        /* JADX INFO: renamed from: f */
        public final int f9064f;

        /* JADX INFO: renamed from: g */
        public final int f9065g;

        /* JADX INFO: renamed from: h */
        public final int f9066h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public final String f9067i;

        /* JADX INFO: renamed from: j */
        public final C1871k[] f9068j;

        /* JADX INFO: renamed from: k */
        public final int f9069k;

        /* JADX INFO: renamed from: l */
        public final String f9070l;

        /* JADX INFO: renamed from: m */
        public final String f9071m;

        /* JADX INFO: renamed from: n */
        public final List<Long> f9072n;

        /* JADX INFO: renamed from: o */
        public final long[] f9073o;

        /* JADX INFO: renamed from: p */
        public final long f9074p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @Nullable String str5, C1871k[] c1871kArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, c1871kArr, list, vck0.m197834X0(list, 1000000L, j), vck0.m197832W0(j2, 1000000L, j));
        }

        /* JADX INFO: renamed from: a */
        public Uri m11728a(int i, int i2) {
            p11.m167013g(this.f9068j != null);
            p11.m167013g(this.f9072n != null);
            p11.m167013g(i2 < this.f9072n.size());
            String string = Integer.toString(this.f9068j[i].f7744h);
            String string2 = this.f9072n.get(i2).toString();
            return evj0.m118284e(this.f9070l, this.f9071m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        /* JADX INFO: renamed from: b */
        public b m11729b(C1871k[] c1871kArr) {
            return new b(this.f9070l, this.f9071m, this.f9059a, this.f9060b, this.f9061c, this.f9062d, this.f9063e, this.f9064f, this.f9065g, this.f9066h, this.f9067i, c1871kArr, this.f9072n, this.f9073o, this.f9074p);
        }

        /* JADX INFO: renamed from: c */
        public long m11730c(int i) {
            if (i == this.f9069k - 1) {
                return this.f9074p;
            }
            long[] jArr = this.f9073o;
            return jArr[i + 1] - jArr[i];
        }

        /* JADX INFO: renamed from: d */
        public int m11731d(long j) {
            return vck0.m197863i(this.f9073o, j, true, true);
        }

        /* JADX INFO: renamed from: e */
        public long m11732e(int i) {
            return this.f9073o[i];
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @Nullable String str5, C1871k[] c1871kArr, List<Long> list, long[] jArr, long j2) {
            this.f9070l = str;
            this.f9071m = str2;
            this.f9059a = i;
            this.f9060b = str3;
            this.f9061c = j;
            this.f9062d = str4;
            this.f9063e = i2;
            this.f9064f = i3;
            this.f9065g = i4;
            this.f9066h = i5;
            this.f9067i = str5;
            this.f9068j = c1871kArr;
            this.f9072n = list;
            this.f9073o = jArr;
            this.f9074p = j2;
            this.f9069k = list.size();
        }
    }

    public C2000a(int i, int i2, long j, long j2, int i3, boolean z, @Nullable a aVar, b[] bVarArr) {
        this.f9048a = i;
        this.f9049b = i2;
        this.f9054g = j;
        this.f9055h = j2;
        this.f9050c = i3;
        this.f9051d = z;
        this.f9052e = aVar;
        this.f9053f = bVarArr;
    }
}
