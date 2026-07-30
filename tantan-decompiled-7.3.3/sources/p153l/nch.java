package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0603g;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class nch extends C0603g.b {

    /* JADX INFO: renamed from: a */
    public List<MomentItem> f141355a;

    /* JADX INFO: renamed from: b */
    public List<MomentItem> f141356b;

    /* JADX INFO: renamed from: c */
    public epr f141357c;

    /* JADX INFO: renamed from: l.nch$a */
    public class C18853a implements epr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.Adapter f141358a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f141359b;

        public C18853a(RecyclerView.Adapter adapter, int i) {
            this.f141358a = adapter;
            this.f141359b = i;
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: a */
        public void mo3632a(int i, int i2, Object obj) {
            this.f141358a.notifyItemRangeChanged(i + this.f141359b, i2, obj);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: b */
        public void mo3633b(int i, int i2) {
            this.f141358a.notifyItemRangeInserted(i + this.f141359b, i2);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: c */
        public void mo3634c(int i, int i2) {
            this.f141358a.notifyItemRangeRemoved(i + this.f141359b, i2);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: d */
        public void mo3635d(int i, int i2) {
            RecyclerView.Adapter adapter = this.f141358a;
            int i3 = this.f141359b;
            adapter.notifyItemMoved(i + i3, i2 + i3);
        }
    }

    public nch(RecyclerView.Adapter adapter, int i) {
        this.f141357c = new C18853a(adapter, i);
    }

    @Override // androidx.recyclerview.widget.C0603g.b
    /* JADX INFO: renamed from: a */
    public boolean mo3646a(int i, int i2) {
        MomentItem momentItem = this.f141355a.get(i);
        MomentItem momentItem2 = this.f141356b.get(i2);
        if (NullChecker.m82486a(momentItem.f42199d) && NullChecker.m82486a(momentItem2.f42199d) && momentItem.f42197b == 1 && momentItem2.f42197b == 1) {
            if (m162559l(momentItem2.f42199d) || NullChecker.m82486a(momentItem.f42199d.momentVoiceLiveInfos)) {
                return momentItem.f42199d.f56859id.equals(momentItem2.f42199d.f56859id) && m162557j(momentItem.f42199d, momentItem2.f42199d);
            }
            return momentItem.f42199d.f56859id.equals(momentItem2.f42199d.f56859id) && m162556i(momentItem.f42199d, momentItem2.f42199d) && m162558k(momentItem, momentItem2) && m162553f(momentItem, momentItem2);
        }
        if (NullChecker.m82486a(momentItem.f42199d) && NullChecker.m82486a(momentItem2.f42199d) && momentItem.f42197b == 3 && momentItem2.f42197b == 3 && NullChecker.m82486a(momentItem.f42220y) && NullChecker.m82486a(momentItem2.f42220y) && NullChecker.m82486a(momentItem.f42220y.f152156a) && NullChecker.m82486a(momentItem2.f42220y.f152156a) && !jyb.m147479J(momentItem.f42220y.f152156a.recommendTopics) && !jyb.m147479J(momentItem2.f42220y.f152156a.recommendTopics)) {
            if (momentItem.f42220y.f152156a.recommendTopics.size() != momentItem2.f42220y.f152156a.recommendTopics.size()) {
                return false;
            }
            for (int i3 = 0; i3 < momentItem.f42220y.f152156a.recommendTopics.size(); i3++) {
                if (!momentItem.f42220y.f152156a.recommendTopics.get(i3).equals(momentItem2.f42220y.f152156a.recommendTopics.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        if (!NullChecker.m82486a(momentItem.f42199d) || !NullChecker.m82486a(momentItem2.f42199d) || momentItem.f42197b != 4 || momentItem2.f42197b != 4 || !NullChecker.m82486a(momentItem.f42219x) || !NullChecker.m82486a(momentItem2.f42219x) || jyb.m147479J(momentItem.f42219x.f152156a) || jyb.m147479J(momentItem2.f42219x.f152156a) || momentItem.f42219x.f152156a.size() != momentItem2.f42219x.f152156a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < momentItem.f42219x.f152156a.size(); i4++) {
            if (!momentItem.f42219x.f152156a.get(i4).userId.equals(momentItem2.f42219x.f152156a.get(i4).userId)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C0603g.b
    /* JADX INFO: renamed from: b */
    public boolean mo3647b(int i, int i2) {
        if (i != i2) {
            return false;
        }
        MomentItem momentItem = this.f141355a.get(i);
        MomentItem momentItem2 = this.f141356b.get(i2);
        return (momentItem == null || momentItem2 == null || momentItem.f42197b != momentItem2.f42197b) ? false : true;
    }

    @Override // androidx.recyclerview.widget.C0603g.b
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo3648c(int i, int i2) {
        MomentItem momentItem = this.f141355a.get(i);
        MomentItem momentItem2 = this.f141356b.get(i2);
        if (momentItem.f42197b != 0 || momentItem2.f42197b != 0 || !momentItem.f42199d.f56859id.equals(momentItem2.f42199d.f56859id)) {
            return null;
        }
        s6i s6iVar = new s6i();
        if (momentItem.f42208m == momentItem2.f42208m) {
            s6iVar.m184912a(1);
        }
        if (m162555h(momentItem.f42199d, momentItem2.f42199d)) {
            s6iVar.m184912a(2);
        }
        if (momentItem.f42209n == momentItem2.f42209n) {
            s6iVar.m184912a(4);
        }
        return s6iVar;
    }

    @Override // androidx.recyclerview.widget.C0603g.b
    /* JADX INFO: renamed from: d */
    public int mo3649d() {
        List<MomentItem> list = this.f141356b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.C0603g.b
    /* JADX INFO: renamed from: e */
    public int mo3650e() {
        List<MomentItem> list = this.f141355a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m162553f(MomentItem momentItem, MomentItem momentItem2) {
        if (!ksg.m151191Z(momentItem2.f42199d)) {
            return true;
        }
        boolean zM184047a = s1j.m184047a(momentItem2.f42199d);
        Moment moment = momentItem2.f42199d;
        if (zM184047a) {
            return moment.curForwardRenderState == 2;
        }
        return moment.curForwardRenderState == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m162554g(Moment moment, Moment moment2) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        LiveMultiCallInfo liveMultiCallInfo2 = moment2.multiCallInfo;
        return (liveMultiCallInfo == null || liveMultiCallInfo2 == null) ? liveMultiCallInfo == null && liveMultiCallInfo2 == null : !moment2.isLiveDataChange();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m162555h(Moment moment, Moment moment2) {
        boolean z = moment.hasHeadFrame;
        User userM145688e8 = FeedModule.f39703d.m145688e8(moment2.owner);
        if (userM145688e8 == null) {
            return false;
        }
        List<Double> list = userM145688e8.profile.extensions.headFrame.expiredTime;
        boolean z2 = (jyb.m147479J(list) || list.get(0).doubleValue() <= ((double) pzi0.m174454o()) || jyb.m147479J(userM145688e8.profile.extensions.headFrame.url)) ? false : true;
        if (z == z2) {
            return z2;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m162556i(Moment moment, Moment moment2) {
        Live live = moment.live;
        Live live2 = moment2.live;
        if (live == null && live2 == null) {
            return true;
        }
        return NullChecker.m82486a(live) && NullChecker.m82486a(live2) && TextUtils.equals(live.f39615id, live2.f39615id) && live.redPacketIds.size() == live2.redPacketIds.size() && m162554g(moment, moment2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m162557j(Moment moment, Moment moment2) {
        MomentVoiceLiveInfos momentVoiceLiveInfos = moment.momentVoiceLiveInfos;
        MomentVoiceLiveInfos momentVoiceLiveInfosM145555L7 = FeedModule.f39703d.m145555L7(moment2.thirdShareSource.sourceId);
        if (NullChecker.m82486a(momentVoiceLiveInfos) && NullChecker.m82486a(momentVoiceLiveInfosM145555L7)) {
            return momentVoiceLiveInfosM145555L7.equals(momentVoiceLiveInfos);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m162558k(MomentItem momentItem, MomentItem momentItem2) {
        if (!cmg.m111224n0()) {
            return true;
        }
        if (momentItem.f42199d.isVoteTopicMoment() || momentItem2.f42199d.isVoteTopicMoment()) {
            return false;
        }
        if (momentItem.f42199d.isQATopicMoment() && momentItem.f42199d.shareMyVote) {
            return false;
        }
        return (momentItem2.f42199d.isQATopicMoment() && momentItem2.f42199d.shareMyVote) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m162559l(Moment moment) {
        return NullChecker.m82486a(moment.thirdShareSource) && !TextUtils.isEmpty(moment.thirdShareSource.sourceId) && BLiveType.voiceLive.equals(moment.thirdShareSource.sourceType);
    }

    /* JADX INFO: renamed from: m */
    public void m162560m(List<MomentItem> list, List<MomentItem> list2) {
        this.f141355a = list;
        this.f141356b = list2;
    }
}
