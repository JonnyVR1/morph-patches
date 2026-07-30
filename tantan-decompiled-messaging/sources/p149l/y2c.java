package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class y2c implements pki<y2c> {

    /* JADX INFO: renamed from: a */
    public final long f195507a;

    /* JADX INFO: renamed from: b */
    public final long f195508b;

    /* JADX INFO: renamed from: c */
    public final long f195509c;

    /* JADX INFO: renamed from: d */
    public final boolean f195510d;

    /* JADX INFO: renamed from: e */
    public final long f195511e;

    /* JADX INFO: renamed from: f */
    public final long f195512f;

    /* JADX INFO: renamed from: g */
    public final long f195513g;

    /* JADX INFO: renamed from: h */
    public final long f195514h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final fck0 f195515i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final hje0 f195516j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Uri f195517k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final iwa0 f195518l;

    /* JADX INFO: renamed from: m */
    public final List<hj60> f195519m;

    public y2c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable iwa0 iwa0Var, @Nullable fck0 fck0Var, @Nullable hje0 hje0Var, @Nullable Uri uri, List<hj60> list) {
        this.f195507a = j;
        this.f195508b = j2;
        this.f195509c = j3;
        this.f195510d = z;
        this.f195511e = j4;
        this.f195512f = j5;
        this.f195513g = j6;
        this.f195514h = j7;
        this.f195518l = iwa0Var;
        this.f195515i = fck0Var;
        this.f195517k = uri;
        this.f195516j = hje0Var;
        this.f195519m = list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<c80> m212358c(List<c80> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.periodIndex;
        ArrayList<c80> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.groupIndex;
            c80 c80Var = list.get(i2);
            List<otc0> list2 = c80Var.f79672c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i2);
            arrayList.add(new c80(c80Var.f79670a, c80Var.f79671b, arrayList2, c80Var.f79673d, c80Var.f79674e, c80Var.f79675f));
        } while (streamKeyPoll.periodIndex == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // p149l.pki
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y2c mo11253a(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= m212361e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long jM212362f = m212362f(i);
                if (jM212362f != -9223372036854775807L) {
                    j += jM212362f;
                }
            } else {
                hj60 hj60VarM212360d = m212360d(i);
                arrayList.add(new hj60(hj60VarM212360d.f108036a, hj60VarM212360d.f108037b - j, m212358c(hj60VarM212360d.f108038c, linkedList), hj60VarM212360d.f108039d));
            }
            i++;
        }
        long j2 = this.f195508b;
        return new y2c(this.f195507a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f195509c, this.f195510d, this.f195511e, this.f195512f, this.f195513g, this.f195514h, this.f195518l, this.f195515i, this.f195516j, this.f195517k, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final hj60 m212360d(int i) {
        return this.f195519m.get(i);
    }

    /* JADX INFO: renamed from: e */
    public final int m212361e() {
        return this.f195519m.size();
    }

    /* JADX INFO: renamed from: f */
    public final long m212362f(int i) {
        long j;
        long j2;
        if (i == this.f195519m.size() - 1) {
            j = this.f195508b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.f195519m.get(i).f108037b;
        } else {
            j = this.f195519m.get(i + 1).f108037b;
            j2 = this.f195519m.get(i).f108037b;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: g */
    public final long m212363g(int i) {
        return vck0.m197806J0(m212362f(i));
    }
}
