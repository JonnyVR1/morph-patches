package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class isv {

    /* JADX INFO: renamed from: a */
    public ubu f116760a;

    /* JADX INFO: renamed from: b */
    public kfn0 f116761b;

    public isv(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if ((bLiveAbsData instanceof BLive) || bLiveAbsData.isNormalLive()) {
            this.f116760a = new ubu(jyb.m147507f0(BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user)), null);
        } else if ((bLiveAbsData instanceof BLiveVoice) || bLiveAbsData.isVoiceLive()) {
            this.f116761b = new kfn0(jyb.m147507f0(BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user)), null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static isv m141975g() {
        return new isv();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAbsData m141977h(int i) {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return ubuVar.f178357a.get(i).expendToFullLive();
        }
        kfn0 kfn0Var = this.f116761b;
        if (kfn0Var != null) {
            return kfn0Var.f126460a.get(i).expendToFullLive();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public BLiveSuggestLive m141978i(int i) {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return ubuVar.f178357a.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public ubu m141979j() {
        return this.f116760a;
    }

    /* JADX INFO: renamed from: k */
    public List<String> m141980k() {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return jyb.m147486Q(ubuVar.f178357a, new qcj() { // from class: l.fsv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f45298id;
                }
            });
        }
        kfn0 kfn0Var = this.f116761b;
        return kfn0Var != null ? jyb.m147486Q(kfn0Var.f126460a, new qcj() { // from class: l.gsv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).liveId;
            }
        }) : new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    public BLiveSuggestLive m141981l(final Collection<String> collection) {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return (BLiveSuggestLive) jyb.m147529r(ubuVar.f178357a, new qcj() { // from class: l.hsv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!collection.contains(((BLiveSuggestLive) obj).f45298id));
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m141982m(final String str) {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return jyb.m147476G(ubuVar.f178357a, new qcj() { // from class: l.dsv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSuggestLive) obj).room.f45300id.equals(str));
                }
            });
        }
        kfn0 kfn0Var = this.f116761b;
        if (kfn0Var != null) {
            return jyb.m147476G(kfn0Var.f126460a, new qcj() { // from class: l.esv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveVoiceRoomFeed) obj).roomId.equals(str));
                }
            });
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public int m141983n() {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            return ubuVar.f178357a.size();
        }
        kfn0 kfn0Var = this.f116761b;
        if (kfn0Var != null) {
            return kfn0Var.f126460a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public kfn0 m141984o() {
        return this.f116761b;
    }

    /* JADX INFO: renamed from: p */
    public void m141985p(ubu ubuVar) {
        ubu ubuVar2 = this.f116760a;
        if (ubuVar2 != null) {
            ubuVar2.m195330w(ubuVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m141986q(kfn0 kfn0Var) {
        kfn0 kfn0Var2 = this.f116761b;
        if (kfn0Var2 != null) {
            kfn0Var2.m149589m(kfn0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m141987r(Collection<String> collection) {
        ubu ubuVar = this.f116760a;
        if (ubuVar != null) {
            ubuVar.m195319C(collection);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m141988s(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData != null && this.f116760a != null) {
            int i = 0;
            while (true) {
                if (i >= this.f116760a.f178357a.size()) {
                    i = -1;
                    break;
                }
                BLiveSuggestLive bLiveSuggestLive = this.f116760a.f178357a.get(i);
                if (bLiveSuggestLive.f45298id.equals(bLiveAbsData.f45171id)) {
                    return false;
                }
                if (bLiveSuggestLive.room.f45300id.equals(bLiveAbsRoom.f45172id)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                this.f116760a.f178357a.set(i, BLiveSuggestLive.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m141989t(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (bLiveAbsData == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.f116761b.f126460a.size()) {
                i = -1;
                break;
            }
            BLiveVoiceRoomFeed bLiveVoiceRoomFeed = this.f116761b.f126460a.get(i);
            if (bLiveVoiceRoomFeed.liveId.equals(bLiveAbsData.f45171id)) {
                return false;
            }
            if (bLiveVoiceRoomFeed.roomId.equals(bLiveAbsRoom.f45172id)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.f116761b.f126460a.set(i, BLiveVoiceRoomFeed.convertFrom(bLiveAbsData, bLiveAbsRoom, user));
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m141990u(@Nullable BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        if (this.f116760a != null) {
            return m141988s(bLiveAbsData, bLiveAbsRoom, user);
        }
        if (this.f116761b != null) {
            return m141989t(bLiveAbsData, bLiveAbsRoom, user);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m141976f(String str) {
    }

    public isv() {
    }
}
