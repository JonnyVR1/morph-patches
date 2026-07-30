package p002l;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.g6n0;
import l.t9u;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hqv {

    /* JADX INFO: renamed from: a */
    public t9u f12229a;

    /* JADX INFO: renamed from: b */
    public g6n0 f12230b;

    public hqv(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if ((bLiveAbsData instanceof BLive) || bLiveAbsData.isNormalLive()) {
            this.f12229a = new t9u(vwb.f0(new BLiveSuggestLive[]{BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user)}), (Pagination) null);
        } else if ((bLiveAbsData instanceof BLiveVoice) || bLiveAbsData.isVoiceLive()) {
            this.f12230b = new g6n0(vwb.f0(new BLiveVoiceRoomFeed[]{BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user)}), (Pagination) null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static hqv m14713g() {
        return new hqv();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAbsData m14715h(int i) {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return ((BLiveSuggestLive) t9uVar.a.get(i)).expendToFullLive();
        }
        g6n0 g6n0Var = this.f12230b;
        if (g6n0Var != null) {
            return ((BLiveVoiceRoomFeed) g6n0Var.a.get(i)).expendToFullLive();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public BLiveSuggestLive m14716i(int i) {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return (BLiveSuggestLive) t9uVar.a.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public t9u m14717j() {
        return this.f12229a;
    }

    /* JADX INFO: renamed from: k */
    public List<String> m14718k() {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return vwb.Q(t9uVar.a, new w9j() { // from class: l.eqv
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).id;
                }
            });
        }
        g6n0 g6n0Var = this.f12230b;
        return g6n0Var != null ? vwb.Q(g6n0Var.a, new w9j() { // from class: l.fqv
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).liveId;
            }
        }) : new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    public BLiveSuggestLive m14719l(final Collection<String> collection) {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return (BLiveSuggestLive) vwb.r(t9uVar.a, new w9j() { // from class: l.gqv
                public final Object call(Object obj) {
                    return Boolean.valueOf(!collection.contains(((BLiveSuggestLive) obj).id));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m14720m(final String str) {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return vwb.G(t9uVar.a, new w9j() { // from class: l.cqv
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSuggestLive) obj).room.id.equals(str));
                }
            });
        }
        g6n0 g6n0Var = this.f12230b;
        if (g6n0Var != null) {
            return vwb.G(g6n0Var.a, new w9j() { // from class: l.dqv
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveVoiceRoomFeed) obj).roomId.equals(str));
                }
            });
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public int m14721n() {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            return t9uVar.a.size();
        }
        g6n0 g6n0Var = this.f12230b;
        if (g6n0Var != null) {
            return g6n0Var.a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public g6n0 m14722o() {
        return this.f12230b;
    }

    /* JADX INFO: renamed from: p */
    public void m14723p(t9u t9uVar) {
        t9u t9uVar2 = this.f12229a;
        if (t9uVar2 != null) {
            t9uVar2.w(t9uVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m14724q(g6n0 g6n0Var) {
        g6n0 g6n0Var2 = this.f12230b;
        if (g6n0Var2 != null) {
            g6n0Var2.m(g6n0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14725r(Collection<String> collection) {
        t9u t9uVar = this.f12229a;
        if (t9uVar != null) {
            t9uVar.C(collection);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m14726s(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData != null && this.f12229a != null) {
            int i = 0;
            while (true) {
                if (i >= this.f12229a.a.size()) {
                    i = -1;
                    break;
                }
                BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) this.f12229a.a.get(i);
                if (bLiveSuggestLive.id.equals(bLiveAbsData.id)) {
                    return false;
                }
                if (bLiveSuggestLive.room.id.equals(bLiveAbsRoom.id)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                this.f12229a.a.set(i, BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m14727t(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.f12230b.a.size()) {
                i = -1;
                break;
            }
            BLiveVoiceRoomFeed bLiveVoiceRoomFeed = (BLiveVoiceRoomFeed) this.f12230b.a.get(i);
            if (bLiveVoiceRoomFeed.liveId.equals(bLiveAbsData.id)) {
                return false;
            }
            if (bLiveVoiceRoomFeed.roomId.equals(bLiveAbsRoom.id)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.f12230b.a.set(i, BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m14728u(@Nullable BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (this.f12229a != null) {
            return m14726s(bLiveAbsData, bLiveAbsRoom, user);
        }
        if (this.f12230b != null) {
            return m14727t(bLiveAbsData, bLiveAbsRoom, user);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m14714f(String str) {
    }

    public hqv() {
    }
}
