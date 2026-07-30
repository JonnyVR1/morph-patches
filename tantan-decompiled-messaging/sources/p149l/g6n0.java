package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class g6n0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceRoomFeed> f101294a;

    /* JADX INFO: renamed from: b */
    public List<BLiveVoiceFeedBanners> f101295b;

    /* JADX INFO: renamed from: c */
    public Pagination f101296c;

    /* JADX INFO: renamed from: d */
    public List<User> f101297d;

    public g6n0(BLiveEnvelope bLiveEnvelope) {
        this.f101294a = vwb.m200296J(bLiveEnvelope.data.voiceRoomFeeds) ? new ArrayList<>() : bLiveEnvelope.data.voiceRoomFeeds;
        this.f101295b = vwb.m200296J(bLiveEnvelope.data.voiceLiveBanners) ? new ArrayList<>() : bLiveEnvelope.data.voiceLiveBanners;
        this.f101296c = bLiveEnvelope.pagination;
        this.f101297d = bLiveEnvelope.data.users;
        vwb.m200354z(this.f101294a, new e30() { // from class: l.z5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201835a.m124625l((BLiveVoiceRoomFeed) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public g6n0 m124621h(final String str) {
        if (vwb.m200296J(this.f101297d)) {
            return this;
        }
        ArrayList arrayListM200339n = vwb.m200339n(this.f101294a, new w9j() { // from class: l.b6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73852a.m124624k(str, (BLiveVoiceRoomFeed) obj);
            }
        });
        this.f101294a.clear();
        this.f101294a.addAll(arrayListM200339n);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public Pagination m124622i() {
        return this.f101296c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m124623j() {
        Pagination pagination = this.f101296c;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m124624k(String str, final BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        return Boolean.valueOf(((User) vwb.m200346r(this.f101297d, new w9j() { // from class: l.c6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).f56011id.equals(bLiveVoiceRoomFeed.anchorId));
            }
        })).gender.equals(str));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m124625l(final BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        bLiveVoiceRoomFeed.user = (User) vwb.m200346r(this.f101297d, new w9j() { // from class: l.a6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(user.f56011id) && user.f56011id.equals(bLiveVoiceRoomFeed.anchorId));
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m124626m(g6n0 g6n0Var) {
        if (g6n0Var == null) {
            return;
        }
        final ArrayList arrayListM200303Q = vwb.m200303Q(this.f101294a, new w9j() { // from class: l.d6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).liveId;
            }
        });
        final ArrayList arrayListM200303Q2 = vwb.m200303Q(this.f101294a, new w9j() { // from class: l.e6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceRoomFeed) obj).anchorId;
            }
        });
        this.f101294a.addAll(vwb.m200339n(g6n0Var.f101294a, new w9j() { // from class: l.f6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveVoiceRoomFeed bLiveVoiceRoomFeed = (BLiveVoiceRoomFeed) obj;
                return Boolean.valueOf((arrayListM200303Q.contains(bLiveVoiceRoomFeed.liveId) || arrayListM200303Q2.contains(bLiveVoiceRoomFeed.anchorId)) ? false : true);
            }
        }));
        this.f101296c = g6n0Var.f101296c;
    }

    public g6n0(List<BLiveVoiceRoomFeed> list, Pagination pagination) {
        this.f101294a = list;
        this.f101296c = pagination;
    }
}
