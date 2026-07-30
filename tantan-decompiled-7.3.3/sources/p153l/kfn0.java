package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kfn0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceRoomFeed> f126460a;

    /* JADX INFO: renamed from: b */
    public List<BLiveVoiceFeedBanners> f126461b;

    /* JADX INFO: renamed from: c */
    public Pagination f126462c;

    /* JADX INFO: renamed from: d */
    public List<User> f126463d;

    public kfn0(BLiveEnvelope bLiveEnvelope) {
        this.f126460a = jyb.m147479J(bLiveEnvelope.data.voiceRoomFeeds) ? new ArrayList<>() : bLiveEnvelope.data.voiceRoomFeeds;
        this.f126461b = jyb.m147479J(bLiveEnvelope.data.voiceLiveBanners) ? new ArrayList<>() : bLiveEnvelope.data.voiceLiveBanners;
        this.f126462c = bLiveEnvelope.pagination;
        this.f126463d = bLiveEnvelope.data.users;
        jyb.m147537z(this.f126460a, new y20() { // from class: l.dfn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88209a.m149588l((BLiveVoiceRoomFeed) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public kfn0 m149584h(final String str) {
        if (jyb.m147479J(this.f126463d)) {
            return this;
        }
        ArrayList arrayListM147522n = jyb.m147522n(this.f126460a, new qcj() { // from class: l.ffn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f98814a.m149587k(str, (BLiveVoiceRoomFeed) obj);
            }
        });
        this.f126460a.clear();
        this.f126460a.addAll(arrayListM147522n);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public Pagination m149585i() {
        return this.f126462c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m149586j() {
        Pagination pagination = this.f126462c;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m149587k(String str, final BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        return Boolean.valueOf(((User) jyb.m147529r(this.f126463d, new qcj() { // from class: l.gfn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).f56859id.equals(bLiveVoiceRoomFeed.anchorId));
            }
        })).gender.equals(str));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m149588l(final BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        bLiveVoiceRoomFeed.user = (User) jyb.m147529r(this.f126463d, new qcj() { // from class: l.efn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(user.f56859id) && user.f56859id.equals(bLiveVoiceRoomFeed.anchorId));
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m149589m(kfn0 kfn0Var) {
        if (kfn0Var == null) {
            return;
        }
        final ArrayList arrayListM147486Q = jyb.m147486Q(this.f126460a, new qcj() { // from class: l.hfn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).liveId;
            }
        });
        final ArrayList arrayListM147486Q2 = jyb.m147486Q(this.f126460a, new qcj() { // from class: l.ifn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).anchorId;
            }
        });
        this.f126460a.addAll(jyb.m147522n(kfn0Var.f126460a, new qcj() { // from class: l.jfn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveVoiceRoomFeed bLiveVoiceRoomFeed = (BLiveVoiceRoomFeed) obj;
                return Boolean.valueOf((arrayListM147486Q.contains(bLiveVoiceRoomFeed.liveId) || arrayListM147486Q2.contains(bLiveVoiceRoomFeed.anchorId)) ? false : true);
            }
        }));
        this.f126462c = kfn0Var.f126462c;
    }

    public kfn0(List<BLiveVoiceRoomFeed> list, Pagination pagination) {
        this.f126460a = list;
        this.f126462c = pagination;
    }
}
