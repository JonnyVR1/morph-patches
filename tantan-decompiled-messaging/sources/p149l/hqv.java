package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hqv {

    /* JADX INFO: renamed from: a */
    public t9u f109160a;

    /* JADX INFO: renamed from: b */
    public g6n0 f109161b;

    public hqv(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if ((bLiveAbsData instanceof BLive) || bLiveAbsData.isNormalLive()) {
            this.f109160a = new t9u(vwb.m200324f0(BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user)), null);
        } else if ((bLiveAbsData instanceof BLiveVoice) || bLiveAbsData.isVoiceLive()) {
            this.f109161b = new g6n0(vwb.m200324f0(BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user)), null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static hqv m132593g() {
        return new hqv();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAbsData m132595h(int i) {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return t9uVar.f169071a.get(i).expendToFullLive();
        }
        g6n0 g6n0Var = this.f109161b;
        if (g6n0Var != null) {
            return g6n0Var.f101294a.get(i).expendToFullLive();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public BLiveSuggestLive m132596i(int i) {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return t9uVar.f169071a.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public t9u m132597j() {
        return this.f109160a;
    }

    /* JADX INFO: renamed from: k */
    public List<String> m132598k() {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return vwb.m200303Q(t9uVar.f169071a, new w9j() { // from class: l.eqv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f44450id;
                }
            });
        }
        g6n0 g6n0Var = this.f109161b;
        return g6n0Var != null ? vwb.m200303Q(g6n0Var.f101294a, new w9j() { // from class: l.fqv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).liveId;
            }
        }) : new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    public BLiveSuggestLive m132599l(final Collection<String> collection) {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return (BLiveSuggestLive) vwb.m200346r(t9uVar.f169071a, new w9j() { // from class: l.gqv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!collection.contains(((BLiveSuggestLive) obj).f44450id));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m132600m(final String str) {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return vwb.m200293G(t9uVar.f169071a, new w9j() { // from class: l.cqv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSuggestLive) obj).room.f44452id.equals(str));
                }
            });
        }
        g6n0 g6n0Var = this.f109161b;
        if (g6n0Var != null) {
            return vwb.m200293G(g6n0Var.f101294a, new w9j() { // from class: l.dqv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveVoiceRoomFeed) obj).roomId.equals(str));
                }
            });
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public int m132601n() {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            return t9uVar.f169071a.size();
        }
        g6n0 g6n0Var = this.f109161b;
        if (g6n0Var != null) {
            return g6n0Var.f101294a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public g6n0 m132602o() {
        return this.f109161b;
    }

    /* JADX INFO: renamed from: p */
    public void m132603p(t9u t9uVar) {
        t9u t9uVar2 = this.f109160a;
        if (t9uVar2 != null) {
            t9uVar2.m187676w(t9uVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m132604q(g6n0 g6n0Var) {
        g6n0 g6n0Var2 = this.f109161b;
        if (g6n0Var2 != null) {
            g6n0Var2.m124626m(g6n0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m132605r(Collection<String> collection) {
        t9u t9uVar = this.f109160a;
        if (t9uVar != null) {
            t9uVar.m187665C(collection);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m132606s(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData != null && this.f109160a != null) {
            int i = 0;
            while (true) {
                if (i >= this.f109160a.f169071a.size()) {
                    i = -1;
                    break;
                }
                BLiveSuggestLive bLiveSuggestLive = this.f109160a.f169071a.get(i);
                if (bLiveSuggestLive.f44450id.equals(bLiveAbsData.f44323id)) {
                    return false;
                }
                if (bLiveSuggestLive.room.f44452id.equals(bLiveAbsRoom.f44324id)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                this.f109160a.f169071a.set(i, BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m132607t(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.f109161b.f101294a.size()) {
                i = -1;
                break;
            }
            BLiveVoiceRoomFeed bLiveVoiceRoomFeed = this.f109161b.f101294a.get(i);
            if (bLiveVoiceRoomFeed.liveId.equals(bLiveAbsData.f44323id)) {
                return false;
            }
            if (bLiveVoiceRoomFeed.roomId.equals(bLiveAbsRoom.f44324id)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.f109161b.f101294a.set(i, BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m132608u(@Nullable BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (this.f109160a != null) {
            return m132606s(bLiveAbsData, bLiveAbsRoom, user);
        }
        if (this.f109161b != null) {
            return m132607t(bLiveAbsData, bLiveAbsRoom, user);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m132594f(String str) {
    }

    public hqv() {
    }
}
