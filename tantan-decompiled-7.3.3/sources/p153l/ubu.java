package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ubu {

    /* JADX INFO: renamed from: a */
    public List<BLiveSuggestLive> f178357a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Pagination f178358b;

    public ubu(List<BLiveSuggestLive> list, Pagination pagination) {
        if (!jyb.m147479J(list)) {
            this.f178357a.addAll(list);
        }
        this.f178358b = pagination;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ BLiveSuggestLive m195314l(BLiveSuggestLive bLiveSuggestLive) {
        return bLiveSuggestLive;
    }

    /* JADX INFO: renamed from: o */
    public static ubu m195316o() {
        return new ubu(new ArrayList(), null);
    }

    /* JADX INFO: renamed from: A */
    public final void m195317A(@NonNull List<BLiveSuggestLive> list) {
        final ArrayList arrayListM147486Q = jyb.m147486Q(this.f178357a, new qcj() { // from class: l.pbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        });
        final ArrayList arrayListM147486Q2 = jyb.m147486Q(this.f178357a, new qcj() { // from class: l.qbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).anchor.f45299id;
            }
        });
        this.f178357a.addAll(jyb.m147522n(list, new qcj() { // from class: l.rbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) obj;
                return Boolean.valueOf((arrayListM147486Q.contains(bLiveSuggestLive.f45298id) || arrayListM147486Q2.contains(bLiveSuggestLive.anchor.f45299id)) ? false : true);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public BLiveSuggestLive m195318B(final String str) {
        return (BLiveSuggestLive) jyb.m147529r(this.f178357a, new qcj() { // from class: l.nbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveSuggestLive) obj).f45298id));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m195319C(final Collection<String> collection) {
        jyb.m147503d0(this.f178357a, new qcj() { // from class: l.kbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Collection collection2 = collection;
                return Boolean.valueOf(collection2 != null && collection2.contains(((BLiveSuggestLive) obj).f45298id));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m195320D() {
        Iterator<BLiveSuggestLive> it = this.f178357a.iterator();
        while (it.hasNext()) {
            it.next().state = "onlive";
        }
    }

    /* JADX INFO: renamed from: E */
    public void m195321E(List<BLiveSuggestLive> list, int i) {
        HashMap mapM147502d = jyb.m147502d(list, new qcj() { // from class: l.hbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        }, new qcj() { // from class: l.lbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ubu.m195314l((BLiveSuggestLive) obj);
            }
        });
        int i2 = 0;
        for (BLiveSuggestLive bLiveSuggestLive : this.f178357a) {
            if (mapM147502d.containsKey(bLiveSuggestLive.f45298id)) {
                BLiveSuggestLive bLiveSuggestLive2 = (BLiveSuggestLive) mapM147502d.get(bLiveSuggestLive.f45298id);
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
    public ubu m195322n() {
        return new ubu(this.f178357a, this.f178358b);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m195323p() {
        return jyb.m147486Q(this.f178357a, new qcj() { // from class: l.jbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public int m195324q(List<BLiveSuggestLive> list, List<BLiveSuggestLive> list2) {
        ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.mbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        });
        Iterator<BLiveSuggestLive> it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!arrayListM147486Q.contains(it.next().f45298id)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    public Pagination m195325r() {
        return this.f178358b;
    }

    /* JADX INFO: renamed from: s */
    public List<String> m195326s(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i && i2 < this.f178357a.size(); i2++) {
            BLiveSuggestLive bLiveSuggestLive = this.f178357a.get(i2);
            BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
            if (bLiveSuggestLiveRoom != null && !TextUtils.isEmpty(bLiveSuggestLiveRoom.coverUrl)) {
                arrayList.add(bLiveSuggestLive.room.coverUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public boolean m195327t() {
        Pagination pagination = this.f178358b;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m195328u(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!jyb.m147486Q(this.f178357a, new qcj() { // from class: l.ibu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        }).contains(bLiveSuggestLive.f45298id));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Boolean m195329v(BLiveSuggestLive bLiveSuggestLive) {
        return Boolean.valueOf(!jyb.m147486Q(this.f178357a, new qcj() { // from class: l.tbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).anchor.f45299id;
            }
        }).contains(bLiveSuggestLive.anchor.f45299id));
    }

    /* JADX INFO: renamed from: w */
    public final void m195330w(@Nullable ubu ubuVar) {
        m195331x(ubuVar, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m195331x(@Nullable ubu ubuVar, boolean z) {
        if (ubuVar == null) {
            return;
        }
        if (z) {
            this.f178357a.addAll(ubuVar.f178357a);
        } else {
            m195317A(ubuVar.f178357a);
        }
        this.f178358b = ubuVar.f178358b;
    }

    /* JADX INFO: renamed from: y */
    public ubu m195332y(ubu ubuVar) {
        if (ubuVar == null) {
            m195320D();
            return this;
        }
        ArrayList arrayListM147522n = jyb.m147522n(ubuVar.f178357a, new qcj() { // from class: l.sbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167178a.m195328u((BLiveSuggestLive) obj);
            }
        });
        int i = 0;
        for (int i2 = 0; i2 < this.f178357a.size(); i2++) {
            if (!this.f178357a.get(i2).isOnLive() && i < arrayListM147522n.size()) {
                this.f178357a.set(i2, (BLiveSuggestLive) arrayListM147522n.get(i));
                i++;
            }
        }
        m195320D();
        return this;
    }

    /* JADX INFO: renamed from: z */
    public ubu m195333z(ubu ubuVar) {
        if (ubuVar == null) {
            m195320D();
            return this;
        }
        ArrayList arrayListM147522n = jyb.m147522n(ubuVar.f178357a, new qcj() { // from class: l.obu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146621a.m195329v((BLiveSuggestLive) obj);
            }
        });
        int i = 0;
        for (int i2 = 0; i2 < this.f178357a.size(); i2++) {
            if (!this.f178357a.get(i2).isOnLive() && i < arrayListM147522n.size()) {
                this.f178357a.set(i2, (BLiveSuggestLive) arrayListM147522n.get(i));
                i++;
            }
        }
        m195320D();
        return this;
    }
}
