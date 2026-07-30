package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p051p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class ur30 extends jic0<AbsMeetListData> {

    /* JADX INFO: renamed from: c */
    public final NewMeetFragPresenter f180561c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbsMeetListData> f180562d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final List<MeetLiveItemData> f180563e = new ArrayList();

    public ur30(NewMeetFragPresenter newMeetFragPresenter) {
        this.f180561c = newMeetFragPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m197449M(View view) {
        Act act = this.f180561c.act();
        if (NullChecker.m82486a(act)) {
            act.startActivity(CoreModule.m30933P().m143405a().mo34284A7(act));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f180562d.size() + m197451K();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 6) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152002j0, viewGroup, false);
        }
        if (i == 7) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151998i0, viewGroup, false);
        }
        if (i == 8) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152034r0, viewGroup, false);
        }
        if (i == 9) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152006k0, viewGroup, false);
        }
        if (i == 10) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152018n0, viewGroup, false);
        }
        return i == 11 ? p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151900E0, viewGroup, false) : r9y.m180663b(viewGroup, i);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, AbsMeetListData absMeetListData, int i, int i2) {
        if (i == 6) {
            ((MeetStateHeaderView) view).m44049Q(this.f180563e, this.f180561c);
            return;
        }
        if (i == 7) {
            ((TextView) view.findViewById(ddc0.f87888R)).setText(q8g0.m175796b0("新动态已看完，去划卡认识新朋友", jyb.m147507f0("去划卡认识新朋友"), Color.parseColor("#fe7e1d"), lyh0.m156283c(2)));
            view.setOnClickListener(new View.OnClickListener() { // from class: l.pr30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f153722a.m197449M(view2);
                }
            });
            CoreModule.f18264c.f20406m1.m35710S4();
            return;
        }
        if (i == 8) {
            ((MeetFeedNoSvipItemView) view).m43837e((MeetFeedNoSvipItemData) absMeetListData, new x20() { // from class: l.qr30
                @Override // p153l.x20
                public final void call() {
                    this.f159061a.m197453N();
                }
            }, new Function0() { // from class: l.rr30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f164543a.m197454O();
                }
            }, this.f180561c);
            return;
        }
        if (i == 9) {
            ((MeetLikersItemView) view).m43863s((MeetFeedLikersItemData) absMeetListData, this.f180561c.m44016P0(), new x20() { // from class: l.sr30
                @Override // p153l.x20
                public final void call() {
                    this.f170303a.m197456Q();
                }
            });
            return;
        }
        if (i == 10) {
            ((MeetNearbyItemView) view).m43923w((MeetFeedNearbyItemData) absMeetListData, this.f180561c.m44015O0());
        } else if (i == 11) {
            ((MeetFeedSvipWeeklyItemView) view).m43973i((MeetFeedSvipWeeklyItemData) absMeetListData, this.f180561c);
        } else {
            ((MeetFeedBaseItemView) view).m43819B0(absMeetListData, this.f180561c);
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m197451K() {
        return this.f180563e.size() > 0 ? 1 : 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbsMeetListData getItem(int i) {
        if (i != 0 || m197451K() <= 0) {
            return this.f180562d.get(i - m197451K());
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m197453N() {
        this.f180561c.m44014N0(false, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Unit m197454O() {
        return this.f180561c.m44014N0(true, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: P */
    public void m197455P(List<MeetLiveItemData> list, List<AbsMeetListData> list2) {
        this.f180563e.clear();
        if (!jyb.m147479J(list)) {
            this.f180563e.addAll(list.subList(0, Math.min(list.size(), 20)));
        }
        this.f180562d.clear();
        this.f180562d.addAll(list2);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m197456Q() {
        AbsMeetListData absMeetListData = (AbsMeetListData) jyb.m147529r(this.f180562d, new qcj() { // from class: l.tr30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbsMeetListData) obj) instanceof MeetFeedLikersItemData);
            }
        });
        if (NullChecker.m82486a(absMeetListData)) {
            this.f180562d.remove(absMeetListData);
            notifyDataSetChanged();
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (i < this.f180562d.size() - 2 || this.f180562d.isEmpty()) {
            return;
        }
        this.f180561c.m44037p1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0 && m197451K() > 0) {
            return 6;
        }
        int iM197451K = i - m197451K();
        AbsMeetListData absMeetListData = this.f180562d.get(iM197451K);
        if (absMeetListData instanceof MeetGuideToSwipeCardItemData) {
            return 7;
        }
        if (absMeetListData instanceof MeetFeedImageItemData) {
            return 1;
        }
        if (absMeetListData instanceof MeetFeedVideoItemData) {
            return 2;
        }
        if (absMeetListData instanceof MeetFeedSeeItemData) {
            return 4;
        }
        if (absMeetListData instanceof MeetFeedUserItemData) {
            return 5;
        }
        if (absMeetListData instanceof MeetFeedNoSvipItemData) {
            return 8;
        }
        if (absMeetListData instanceof MeetFeedLikersItemData) {
            return 9;
        }
        if (absMeetListData instanceof MeetFeedNearbyItemData) {
            return 10;
        }
        if (absMeetListData instanceof MeetFeedSvipWeeklyItemData) {
            return 11;
        }
        return super.getItemViewType(iM197451K);
    }
}
