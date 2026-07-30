package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0601g;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class yah extends C0601g.b {

    /* JADX INFO: renamed from: a */
    public List<MomentItem> f197201a;

    /* JADX INFO: renamed from: b */
    public List<MomentItem> f197202b;

    /* JADX INFO: renamed from: c */
    public dnr f197203c;

    /* JADX INFO: renamed from: l.yah$a */
    public class C21353a implements dnr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.Adapter f197204a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f197205b;

        public C21353a(RecyclerView.Adapter adapter, int i) {
            this.f197204a = adapter;
            this.f197205b = i;
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: a */
        public void mo3631a(int i, int i2, Object obj) {
            this.f197204a.notifyItemRangeChanged(i + this.f197205b, i2, obj);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: b */
        public void mo3632b(int i, int i2) {
            this.f197204a.notifyItemRangeInserted(i + this.f197205b, i2);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: c */
        public void mo3633c(int i, int i2) {
            this.f197204a.notifyItemRangeRemoved(i + this.f197205b, i2);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: d */
        public void mo3634d(int i, int i2) {
            RecyclerView.Adapter adapter = this.f197204a;
            int i3 = this.f197205b;
            adapter.notifyItemMoved(i + i3, i2 + i3);
        }
    }

    public yah(RecyclerView.Adapter adapter, int i) {
        this.f197203c = new C21353a(adapter, i);
    }

    @Override // androidx.recyclerview.widget.C0601g.b
    /* JADX INFO: renamed from: a */
    public boolean mo3645a(int i, int i2) {
        MomentItem momentItem = this.f197201a.get(i);
        MomentItem momentItem2 = this.f197202b.get(i2);
        if (NullChecker.m81303a(momentItem.f41351d) && NullChecker.m81303a(momentItem2.f41351d) && momentItem.f41349b == 1 && momentItem2.f41349b == 1) {
            if (m213841l(momentItem2.f41351d) || NullChecker.m81303a(momentItem.f41351d.momentVoiceLiveInfos)) {
                return momentItem.f41351d.f56011id.equals(momentItem2.f41351d.f56011id) && m213839j(momentItem.f41351d, momentItem2.f41351d);
            }
            return momentItem.f41351d.f56011id.equals(momentItem2.f41351d.f56011id) && m213838i(momentItem.f41351d, momentItem2.f41351d) && m213840k(momentItem, momentItem2) && m213835f(momentItem, momentItem2);
        }
        if (NullChecker.m81303a(momentItem.f41351d) && NullChecker.m81303a(momentItem2.f41351d) && momentItem.f41349b == 3 && momentItem2.f41349b == 3 && NullChecker.m81303a(momentItem.f41372y) && NullChecker.m81303a(momentItem2.f41372y) && NullChecker.m81303a(momentItem.f41372y.f116564a) && NullChecker.m81303a(momentItem2.f41372y.f116564a) && !vwb.m200296J(momentItem.f41372y.f116564a.recommendTopics) && !vwb.m200296J(momentItem2.f41372y.f116564a.recommendTopics)) {
            if (momentItem.f41372y.f116564a.recommendTopics.size() != momentItem2.f41372y.f116564a.recommendTopics.size()) {
                return false;
            }
            for (int i3 = 0; i3 < momentItem.f41372y.f116564a.recommendTopics.size(); i3++) {
                if (!momentItem.f41372y.f116564a.recommendTopics.get(i3).equals(momentItem2.f41372y.f116564a.recommendTopics.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        if (!NullChecker.m81303a(momentItem.f41351d) || !NullChecker.m81303a(momentItem2.f41351d) || momentItem.f41349b != 4 || momentItem2.f41349b != 4 || !NullChecker.m81303a(momentItem.f41371x) || !NullChecker.m81303a(momentItem2.f41371x) || vwb.m200296J(momentItem.f41371x.f116564a) || vwb.m200296J(momentItem2.f41371x.f116564a) || momentItem.f41371x.f116564a.size() != momentItem2.f41371x.f116564a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < momentItem.f41371x.f116564a.size(); i4++) {
            if (!momentItem.f41371x.f116564a.get(i4).userId.equals(momentItem2.f41371x.f116564a.get(i4).userId)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C0601g.b
    /* JADX INFO: renamed from: b */
    public boolean mo3646b(int i, int i2) {
        if (i != i2) {
            return false;
        }
        MomentItem momentItem = this.f197201a.get(i);
        MomentItem momentItem2 = this.f197202b.get(i2);
        return (momentItem == null || momentItem2 == null || momentItem.f41349b != momentItem2.f41349b) ? false : true;
    }

    @Override // androidx.recyclerview.widget.C0601g.b
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo3647c(int i, int i2) {
        MomentItem momentItem = this.f197201a.get(i);
        MomentItem momentItem2 = this.f197202b.get(i2);
        if (momentItem.f41349b != 0 || momentItem2.f41349b != 0 || !momentItem.f41351d.f56011id.equals(momentItem2.f41351d.f56011id)) {
            return null;
        }
        d5i d5iVar = new d5i();
        if (momentItem.f41360m == momentItem2.f41360m) {
            d5iVar.m110058a(1);
        }
        if (m213837h(momentItem.f41351d, momentItem2.f41351d)) {
            d5iVar.m110058a(2);
        }
        if (momentItem.f41361n == momentItem2.f41361n) {
            d5iVar.m110058a(4);
        }
        return d5iVar;
    }

    @Override // androidx.recyclerview.widget.C0601g.b
    /* JADX INFO: renamed from: d */
    public int mo3648d() {
        List<MomentItem> list = this.f197202b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.C0601g.b
    /* JADX INFO: renamed from: e */
    public int mo3649e() {
        List<MomentItem> list = this.f197201a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m213835f(MomentItem momentItem, MomentItem momentItem2) {
        if (!vqg.m199532Z(momentItem2.f41351d)) {
            return true;
        }
        boolean zM211769a = xyi.m211769a(momentItem2.f41351d);
        Moment moment = momentItem2.f41351d;
        if (zM211769a) {
            return moment.curForwardRenderState == 2;
        }
        return moment.curForwardRenderState == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m213836g(Moment moment, Moment moment2) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        LiveMultiCallInfo liveMultiCallInfo2 = moment2.multiCallInfo;
        return (liveMultiCallInfo == null || liveMultiCallInfo2 == null) ? liveMultiCallInfo == null && liveMultiCallInfo2 == null : !moment2.isLiveDataChange();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m213837h(Moment moment, Moment moment2) {
        boolean z = moment.hasHeadFrame;
        User userM209447e8 = FeedModule.f38855d.m209447e8(moment2.owner);
        if (userM209447e8 == null) {
            return false;
        }
        List<Double> list = userM209447e8.profile.extensions.headFrame.expiredTime;
        boolean z2 = (vwb.m200296J(list) || list.get(0).doubleValue() <= ((double) mqi0.m155944o()) || vwb.m200296J(userM209447e8.profile.extensions.headFrame.url)) ? false : true;
        if (z == z2) {
            return z2;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m213838i(Moment moment, Moment moment2) {
        Live live = moment.live;
        Live live2 = moment2.live;
        if (live == null && live2 == null) {
            return true;
        }
        return NullChecker.m81303a(live) && NullChecker.m81303a(live2) && TextUtils.equals(live.f38767id, live2.f38767id) && live.redPacketIds.size() == live2.redPacketIds.size() && m213836g(moment, moment2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m213839j(Moment moment, Moment moment2) {
        MomentVoiceLiveInfos momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        MomentVoiceLiveInfos momentVoiceLiveInfosM209314L7 = FeedModule.f38855d.m209314L7(moment2.thirdShareSource.sourceId);
        if (NullChecker.m81303a(momentVoiceLiveInfos) && NullChecker.m81303a(momentVoiceLiveInfosM209314L7)) {
            return momentVoiceLiveInfosM209314L7.equals(momentVoiceLiveInfos);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m213840k(MomentItem momentItem, MomentItem momentItem2) {
        if (!nkg.m159895n0()) {
            return true;
        }
        if (momentItem.f41351d.isVoteTopicMoment() || momentItem2.f41351d.isVoteTopicMoment()) {
            return false;
        }
        if (momentItem.f41351d.isQATopicMoment() && momentItem.f41351d.shareMyVote) {
            return false;
        }
        return (momentItem2.f41351d.isQATopicMoment() && momentItem2.f41351d.shareMyVote) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m213841l(Moment moment) {
        return NullChecker.m81303a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && BLiveType.voiceLive.equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: m */
    public void m213842m(List<MomentItem> list, List<MomentItem> list2) {
        this.f197201a = list;
        this.f197202b = list2;
    }
}
