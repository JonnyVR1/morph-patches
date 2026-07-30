package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class h4c implements lni<h4c> {

    /* JADX INFO: renamed from: a */
    public final long f107776a;

    /* JADX INFO: renamed from: b */
    public final long f107777b;

    /* JADX INFO: renamed from: c */
    public final long f107778c;

    /* JADX INFO: renamed from: d */
    public final boolean f107779d;

    /* JADX INFO: renamed from: e */
    public final long f107780e;

    /* JADX INFO: renamed from: f */
    public final long f107781f;

    /* JADX INFO: renamed from: g */
    public final long f107782g;

    /* JADX INFO: renamed from: h */
    public final long f107783h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final llk0 f107784i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final mre0 f107785j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Uri f107786k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final m4b0 f107787l;

    /* JADX INFO: renamed from: m */
    public final List<mr60> f107788m;

    public h4c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable m4b0 m4b0Var, @Nullable llk0 llk0Var, @Nullable mre0 mre0Var, @Nullable Uri uri, List<mr60> list) {
        this.f107776a = j;
        this.f107777b = j2;
        this.f107778c = j3;
        this.f107779d = z;
        this.f107780e = j4;
        this.f107781f = j5;
        this.f107782g = j6;
        this.f107783h = j7;
        this.f107787l = m4b0Var;
        this.f107784i = llk0Var;
        this.f107786k = uri;
        this.f107785j = mre0Var;
        this.f107788m = list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<y70> m133555c(List<y70> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.periodIndex;
        ArrayList<y70> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.groupIndex;
            y70 y70Var = list.get(i2);
            List<t1d0> list2 = y70Var.f197729c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i2);
            arrayList.add(new y70(y70Var.f197727a, y70Var.f197728b, arrayList2, y70Var.f197730d, y70Var.f197731e, y70Var.f197732f));
        } while (streamKeyPoll.periodIndex == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // p153l.lni
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h4c mo11307a(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= m133558e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long jM133559f = m133559f(i);
                if (jM133559f != -9223372036854775807L) {
                    j += jM133559f;
                }
            } else {
                mr60 mr60VarM133557d = m133557d(i);
                arrayList.add(new mr60(mr60VarM133557d.f138300a, mr60VarM133557d.f138301b - j, m133555c(mr60VarM133557d.f138302c, linkedList), mr60VarM133557d.f138303d));
            }
            i++;
        }
        long j2 = this.f107777b;
        return new h4c(this.f107776a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f107778c, this.f107779d, this.f107780e, this.f107781f, this.f107782g, this.f107783h, this.f107787l, this.f107784i, this.f107785j, this.f107786k, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final mr60 m133557d(int i) {
        return this.f107788m.get(i);
    }

    /* JADX INFO: renamed from: e */
    public final int m133558e() {
        return this.f107788m.size();
    }

    /* JADX INFO: renamed from: f */
    public final long m133559f(int i) {
        long j;
        long j2;
        if (i == this.f107788m.size() - 1) {
            j = this.f107777b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.f107788m.get(i).f138301b;
        } else {
            j = this.f107788m.get(i + 1).f138301b;
            j2 = this.f107788m.get(i).f138301b;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: g */
    public final long m133560g(int i) {
        return bmk0.m105084J0(m133559f(i));
    }
}
