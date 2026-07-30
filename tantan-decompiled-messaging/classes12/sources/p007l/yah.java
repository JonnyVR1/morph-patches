package p007l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import l.dnr;
import l.mqi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yah extends g.b {

    /* JADX INFO: renamed from: a */
    public List<MomentItem> f15372a;

    /* JADX INFO: renamed from: b */
    public List<MomentItem> f15373b;

    /* JADX INFO: renamed from: c */
    public dnr f15374c;

    /* JADX INFO: renamed from: l.yah$a */
    public class C2537a implements dnr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.Adapter f15375a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15376b;

        public C2537a(RecyclerView.Adapter adapter, int i) {
            this.f15375a = adapter;
            this.f15376b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m17089a(int i, int i2, Object obj) {
            this.f15375a.notifyItemRangeChanged(i + this.f15376b, i2, obj);
        }

        /* JADX INFO: renamed from: b */
        public void m17090b(int i, int i2) {
            this.f15375a.notifyItemRangeInserted(i + this.f15376b, i2);
        }

        /* JADX INFO: renamed from: c */
        public void m17091c(int i, int i2) {
            this.f15375a.notifyItemRangeRemoved(i + this.f15376b, i2);
        }

        /* JADX INFO: renamed from: d */
        public void m17092d(int i, int i2) {
            RecyclerView.Adapter adapter = this.f15375a;
            int i3 = this.f15376b;
            adapter.notifyItemMoved(i + i3, i2 + i3);
        }
    }

    public yah(RecyclerView.Adapter adapter, int i) {
        this.f15374c = new C2537a(adapter, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m17076a(int i, int i2) {
        MomentItem momentItem = this.f15372a.get(i);
        MomentItem momentItem2 = this.f15373b.get(i2);
        if (NullChecker.a(momentItem.f2812d) && NullChecker.a(momentItem2.f2812d) && momentItem.f2810b == 1 && momentItem2.f2810b == 1) {
            if (m17087l(momentItem2.f2812d) || NullChecker.a(momentItem.f2812d.momentVoiceLiveInfos)) {
                return ((DbObject) momentItem.f2812d).id.equals(((DbObject) momentItem2.f2812d).id) && m17085j(momentItem.f2812d, momentItem2.f2812d);
            }
            return ((DbObject) momentItem.f2812d).id.equals(((DbObject) momentItem2.f2812d).id) && m17084i(momentItem.f2812d, momentItem2.f2812d) && m17086k(momentItem, momentItem2) && m17081f(momentItem, momentItem2);
        }
        if (NullChecker.a(momentItem.f2812d) && NullChecker.a(momentItem2.f2812d) && momentItem.f2810b == 3 && momentItem2.f2810b == 3 && NullChecker.a(momentItem.f2833y) && NullChecker.a(momentItem2.f2833y) && NullChecker.a(momentItem.f2833y.a) && NullChecker.a(momentItem2.f2833y.a) && !vwb.J(((TopicOperations) momentItem.f2833y.a).recommendTopics) && !vwb.J(((TopicOperations) momentItem2.f2833y.a).recommendTopics)) {
            if (((TopicOperations) momentItem.f2833y.a).recommendTopics.size() != ((TopicOperations) momentItem2.f2833y.a).recommendTopics.size()) {
                return false;
            }
            for (int i3 = 0; i3 < ((TopicOperations) momentItem.f2833y.a).recommendTopics.size(); i3++) {
                if (!((TopicOperations) momentItem.f2833y.a).recommendTopics.get(i3).equals(((TopicOperations) momentItem2.f2833y.a).recommendTopics.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        if (!NullChecker.a(momentItem.f2812d) || !NullChecker.a(momentItem2.f2812d) || momentItem.f2810b != 4 || momentItem2.f2810b != 4 || !NullChecker.a(momentItem.f2832x) || !NullChecker.a(momentItem2.f2832x) || vwb.J((Collection) momentItem.f2832x.a) || vwb.J((Collection) momentItem2.f2832x.a) || ((List) momentItem.f2832x.a).size() != ((List) momentItem2.f2832x.a).size()) {
            return false;
        }
        for (int i4 = 0; i4 < ((List) momentItem.f2832x.a).size(); i4++) {
            if (!((RecommendUsers) ((List) momentItem.f2832x.a).get(i4)).userId.equals(((RecommendUsers) ((List) momentItem2.f2832x.a).get(i4)).userId)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m17077b(int i, int i2) {
        if (i != i2) {
            return false;
        }
        MomentItem momentItem = this.f15372a.get(i);
        MomentItem momentItem2 = this.f15373b.get(i2);
        return (momentItem == null || momentItem2 == null || momentItem.f2810b != momentItem2.f2810b) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Object m17078c(int i, int i2) {
        MomentItem momentItem = this.f15372a.get(i);
        MomentItem momentItem2 = this.f15373b.get(i2);
        if (momentItem.f2810b != 0 || momentItem2.f2810b != 0 || !((DbObject) momentItem.f2812d).id.equals(((DbObject) momentItem2.f2812d).id)) {
            return null;
        }
        d5i d5iVar = new d5i();
        if (momentItem.f2821m == momentItem2.f2821m) {
            d5iVar.m9307a(1);
        }
        if (m17083h(momentItem.f2812d, momentItem2.f2812d)) {
            d5iVar.m9307a(2);
        }
        if (momentItem.f2822n == momentItem2.f2822n) {
            d5iVar.m9307a(4);
        }
        return d5iVar;
    }

    /* JADX INFO: renamed from: d */
    public int m17079d() {
        List<MomentItem> list = this.f15373b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: e */
    public int m17080e() {
        List<MomentItem> list = this.f15372a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17081f(MomentItem momentItem, MomentItem momentItem2) {
        if (!vqg.m15502Z(momentItem2.f2812d)) {
            return true;
        }
        boolean zM16874a = xyi.m16874a(momentItem2.f2812d);
        Moment moment = momentItem2.f2812d;
        if (zM16874a) {
            return moment.curForwardRenderState == 2;
        }
        return moment.curForwardRenderState == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17082g(Moment moment, Moment moment2) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        LiveMultiCallInfo liveMultiCallInfo2 = moment2.multiCallInfo;
        return (liveMultiCallInfo == null || liveMultiCallInfo2 == null) ? liveMultiCallInfo == null && liveMultiCallInfo2 == null : !moment2.isLiveDataChange();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17083h(Moment moment, Moment moment2) {
        boolean z = moment.hasHeadFrame;
        User userM16628e8 = FeedModule.f316d.m16628e8(moment2.owner);
        if (userM16628e8 == null) {
            return false;
        }
        List<Double> list = userM16628e8.profile.extensions.headFrame.expiredTime;
        boolean z2 = (vwb.J(list) || list.get(0).doubleValue() <= ((double) mqi0.o()) || vwb.J(userM16628e8.profile.extensions.headFrame.url)) ? false : true;
        if (z == z2) {
            return z2;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17084i(Moment moment, Moment moment2) {
        Live live = moment.live;
        Live live2 = moment2.live;
        if (live == null && live2 == null) {
            return true;
        }
        return NullChecker.a(live) && NullChecker.a(live2) && TextUtils.equals(live.f228id, live2.f228id) && live.redPacketIds.size() == live2.redPacketIds.size() && m17082g(moment, moment2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m17085j(Moment moment, Moment moment2) {
        MomentVoiceLiveInfos momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        MomentVoiceLiveInfos momentVoiceLiveInfosM16495L7 = FeedModule.f316d.m16495L7(moment2.thirdShareSource.sourceId);
        if (NullChecker.a(momentVoiceLiveInfos) && NullChecker.a(momentVoiceLiveInfosM16495L7)) {
            return momentVoiceLiveInfosM16495L7.equals(momentVoiceLiveInfos);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17086k(MomentItem momentItem, MomentItem momentItem2) {
        if (!nkg.m12254n0()) {
            return true;
        }
        if (momentItem.f2812d.isVoteTopicMoment() || momentItem2.f2812d.isVoteTopicMoment()) {
            return false;
        }
        if (momentItem.f2812d.isQATopicMoment() && momentItem.f2812d.shareMyVote) {
            return false;
        }
        return (momentItem2.f2812d.isQATopicMoment() && momentItem2.f2812d.shareMyVote) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17087l(Moment moment) {
        return NullChecker.a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && "voiceLive".equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: m */
    public void m17088m(List<MomentItem> list, List<MomentItem> list2) {
        this.f15372a = list;
        this.f15373b = list2;
    }
}
