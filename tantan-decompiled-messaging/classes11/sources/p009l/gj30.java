package p009l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p000p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.d30;
import l.dac0;
import l.eqh0;
import l.k6c0;
import l.vwb;
import l.w9j;
import l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gj30 extends dac0<AbsMeetListData> {

    /* JADX INFO: renamed from: c */
    public final NewMeetFragPresenter f13594c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbsMeetListData> f13595d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final List<MeetLiveItemData> f13596e = new ArrayList();

    public gj30(NewMeetFragPresenter newMeetFragPresenter) {
        this.f13594c = newMeetFragPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m15067M(View view) {
        Act act = this.f13594c.act();
        if (NullChecker.a(act)) {
            act.startActivity(CoreModule.P().a().A7(act));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m15069C() {
        return this.f13595d.size() + m15072K();
    }

    /* JADX INFO: renamed from: D */
    public View m15070D(ViewGroup viewGroup, int i) {
        if (i == 6) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.j0, viewGroup, false);
        }
        if (i == 7) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.i0, viewGroup, false);
        }
        if (i == 8) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.r0, viewGroup, false);
        }
        if (i == 9) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.k0, viewGroup, false);
        }
        if (i == 10) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.n0, viewGroup, false);
        }
        return i == 11 ? o7r.m19649a(viewGroup.getContext()).inflate(k6c0.E0, viewGroup, false) : u0y.m22737b(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m15068A(View view, AbsMeetListData absMeetListData, int i, int i2) {
        if (i == 6) {
            ((MeetStateHeaderView) view).m7240Q(this.f13596e, this.f13594c);
            return;
        }
        if (i == 7) {
            ((TextView) view.findViewById(x4c0.R)).setText(i0g0.m16129b0("新动态已看完，去划卡认识新朋友", vwb.f0(new String[]{"去划卡认识新朋友"}), Color.parseColor("#fe7e1d"), eqh0.c(2)));
            view.setOnClickListener(new View.OnClickListener() { // from class: l.bj30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10124a.m15067M(view2);
                }
            });
            CoreModule.c.m1.S4();
            return;
        }
        if (i == 8) {
            ((MeetFeedNoSvipItemView) view).m7000e((MeetFeedNoSvipItemData) absMeetListData, new d30() { // from class: l.cj30
                public final void call() {
                    this.f10623a.m15074N();
                }
            }, new Function0() { // from class: l.dj30
                public final Object invoke() {
                    return this.f11855a.m15075O();
                }
            }, this.f13594c);
            return;
        }
        if (i == 9) {
            ((MeetLikersItemView) view).m7026s((MeetFeedLikersItemData) absMeetListData, this.f13594c.m7203P0(), new d30() { // from class: l.ej30
                public final void call() {
                    this.f12584a.m15077Q();
                }
            });
            return;
        }
        if (i == 10) {
            ((MeetNearbyItemView) view).m7094w((MeetFeedNearbyItemData) absMeetListData, this.f13594c.m7202O0());
        } else if (i == 11) {
            ((MeetFeedSvipWeeklyItemView) view).m7157i((MeetFeedSvipWeeklyItemData) absMeetListData, this.f13594c);
        } else {
            ((MeetFeedBaseItemView) view).m6982B0(absMeetListData, this.f13594c);
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m15072K() {
        return this.f13596e.size() > 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbsMeetListData getItem(int i) {
        if (i != 0 || m15072K() <= 0) {
            return this.f13595d.get(i - m15072K());
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m15074N() {
        this.f13594c.m7201N0(false, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Unit m15075O() {
        return this.f13594c.m7201N0(true, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: P */
    public void m15076P(List<MeetLiveItemData> list, List<AbsMeetListData> list2) {
        this.f13596e.clear();
        if (!vwb.J(list)) {
            this.f13596e.addAll(list.subList(0, Math.min(list.size(), 20)));
        }
        this.f13595d.clear();
        this.f13595d.addAll(list2);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m15077Q() {
        AbsMeetListData absMeetListData = (AbsMeetListData) vwb.r(this.f13595d, new w9j() { // from class: l.fj30
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbsMeetListData) obj) instanceof MeetFeedLikersItemData);
            }
        });
        if (NullChecker.a(absMeetListData)) {
            this.f13595d.remove(absMeetListData);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15078e(int i) {
        if (i < this.f13595d.size() - 2 || this.f13595d.isEmpty()) {
            return;
        }
        this.f13594c.m7226p1();
    }

    public int getItemViewType(int i) {
        if (i == 0 && m15072K() > 0) {
            return 6;
        }
        int iM15072K = i - m15072K();
        IMeetListData iMeetListData = this.f13595d.get(iM15072K);
        if (iMeetListData instanceof MeetGuideToSwipeCardItemData) {
            return 7;
        }
        if (iMeetListData instanceof MeetFeedImageItemData) {
            return 1;
        }
        if (iMeetListData instanceof MeetFeedVideoItemData) {
            return 2;
        }
        if (iMeetListData instanceof MeetFeedSeeItemData) {
            return 4;
        }
        if (iMeetListData instanceof MeetFeedUserItemData) {
            return 5;
        }
        if (iMeetListData instanceof MeetFeedNoSvipItemData) {
            return 8;
        }
        if (iMeetListData instanceof MeetFeedLikersItemData) {
            return 9;
        }
        if (iMeetListData instanceof MeetFeedNearbyItemData) {
            return 10;
        }
        if (iMeetListData instanceof MeetFeedSvipWeeklyItemData) {
            return 11;
        }
        return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(iM15072K);
    }
}
