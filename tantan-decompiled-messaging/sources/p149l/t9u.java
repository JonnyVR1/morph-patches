package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t9u {

    /* JADX INFO: renamed from: a */
    public List<BLiveSuggestLive> f169071a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Pagination f169072b;

    public t9u(List<BLiveSuggestLive> list, Pagination pagination) {
        if (!vwb.m200296J(list)) {
            this.f169071a.addAll(list);
        }
        this.f169072b = pagination;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ BLiveSuggestLive m187660l(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive;
    }

    /* JADX INFO: renamed from: o */
    public static t9u m187662o() {
        return new t9u(new ArrayList(), null);
    }

    /* JADX INFO: renamed from: A */
    public final void m187663A(@NonNull List<BLiveSuggestLive> list) {
        final ArrayList arrayListM200303Q = vwb.m200303Q(this.f169071a, new w9j() { // from class: l.o9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        });
        final ArrayList arrayListM200303Q2 = vwb.m200303Q(this.f169071a, new w9j() { // from class: l.p9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).anchor.f44451id;
            }
        });
        this.f169071a.addAll(vwb.m200339n(list, new w9j() { // from class: l.q9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) obj;
                return Boolean.valueOf((arrayListM200303Q.contains(bLiveSuggestLive.f44450id) || arrayListM200303Q2.contains(bLiveSuggestLive.anchor.f44451id)) ? false : true);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public BLiveSuggestLive m187664B(final String str) {
        return (BLiveSuggestLive) vwb.m200346r(this.f169071a, new w9j() { // from class: l.m9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveSuggestLive) obj).f44450id));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m187665C(final Collection<String> collection) {
        vwb.m200320d0(this.f169071a, new w9j() { // from class: l.j9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Collection collection2 = collection;
                return Boolean.valueOf(collection2 != null && collection2.contains(((BLiveSuggestLive) obj).f44450id));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m187666D() {
        Iterator<BLiveSuggestLive> it = this.f169071a.iterator();
        while (it.hasNext()) {
            it.next().state = "onlive";
        }
    }

    /* JADX INFO: renamed from: E */
    public void m187667E(List<BLiveSuggestLive> list, int i) {
        HashMap mapM200319d = vwb.m200319d(list, new w9j() { // from class: l.g9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        }, new w9j() { // from class: l.k9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return t9u.m187660l((BLiveSuggestLive) obj);
            }
        });
        int i2 = 0;
        for (BLiveSuggestLive bLiveSuggestLive : this.f169071a) {
            if (mapM200319d.containsKey(bLiveSuggestLive.f44450id)) {
                BLiveSuggestLive bLiveSuggestLive2 = (BLiveSuggestLive) mapM200319d.get(bLiveSuggestLive.f44450id);
                if (!bLiveSuggestLive2.isOnLive()) {
                    bLiveSuggestLive.state = bLiveSuggestLive2.state;
                    i2++;
                }
            }
            if (i2 >= i) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public t9u m187668n() {
        return new t9u(this.f169071a, this.f169072b);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m187669p() {
        return vwb.m200303Q(this.f169071a, new w9j() { // from class: l.i9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public int m187670q(List<BLiveSuggestLive> list, List<BLiveSuggestLive> list2) {
        ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.l9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        });
        Iterator<BLiveSuggestLive> it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!arrayListM200303Q.contains(it.next().f44450id)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    public Pagination m187671r() {
        return this.f169072b;
    }

    /* JADX INFO: renamed from: s */
    public List<String> m187672s(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i && i2 < this.f169071a.size(); i2++) {
            BLiveSuggestLive bLiveSuggestLive = this.f169071a.get(i2);
            BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
            if (bLiveSuggestLiveRoom != null && !TextUtils.isEmpty(bLiveSuggestLiveRoom.coverUrl)) {
                arrayList.add(bLiveSuggestLive.room.coverUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public boolean m187673t() {
        Pagination pagination = this.f169072b;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m187674u(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!vwb.m200303Q(this.f169071a, new w9j() { // from class: l.h9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        }).contains(bLiveSuggestLive.f44450id));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Boolean m187675v(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!vwb.m200303Q(this.f169071a, new w9j() { // from class: l.s9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).anchor.f44451id;
            }
        }).contains(bLiveSuggestLive.anchor.f44451id));
    }

    /* JADX INFO: renamed from: w */
    public final void m187676w(@Nullable t9u t9uVar) {
        m187677x(t9uVar, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m187677x(@Nullable t9u t9uVar, boolean z) {
        if (t9uVar == null) {
            return;
        }
        if (z) {
            this.f169071a.addAll(t9uVar.f169071a);
        } else {
            m187663A(t9uVar.f169071a);
        }
        this.f169072b = t9uVar.f169072b;
    }

    /* JADX INFO: renamed from: y */
    public t9u m187678y(t9u t9uVar) {
        if (t9uVar == null) {
            m187666D();
            return this;
        }
        ArrayList arrayListM200339n = vwb.m200339n(t9uVar.f169071a, new w9j() { // from class: l.r9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158444a.m187674u((BLiveSuggestLive) obj);
            }
        });
        int i = 0;
        for (int i2 = 0; i2 < this.f169071a.size(); i2++) {
            if (!this.f169071a.get(i2).isOnLive() && i < arrayListM200339n.size()) {
                this.f169071a.set(i2, (BLiveSuggestLive) arrayListM200339n.get(i));
                i++;
            }
        }
        m187666D();
        return this;
    }

    /* JADX INFO: renamed from: z */
    public t9u m187679z(t9u t9uVar) {
        if (t9uVar == null) {
            m187666D();
            return this;
        }
        ArrayList arrayListM200339n = vwb.m200339n(t9uVar.f169071a, new w9j() { // from class: l.n9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137835a.m187675v((BLiveSuggestLive) obj);
            }
        });
        int i = 0;
        for (int i2 = 0; i2 < this.f169071a.size(); i2++) {
            if (!this.f169071a.get(i2).isOnLive() && i < arrayListM200339n.size()) {
                this.f169071a.set(i2, (BLiveSuggestLive) arrayListM200339n.get(i));
                i++;
            }
        }
        m187666D();
        return this;
    }
}
