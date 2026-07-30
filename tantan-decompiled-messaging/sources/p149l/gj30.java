package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p046p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class gj30 extends dac0<AbsMeetListData> {

    /* JADX INFO: renamed from: c */
    public final NewMeetFragPresenter f102998c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbsMeetListData> f102999d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final List<MeetLiveItemData> f103000e = new ArrayList();

    public gj30(NewMeetFragPresenter newMeetFragPresenter) {
        this.f102998c = newMeetFragPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m126430M(View view) {
        Act act = this.f102998c.act();
        if (NullChecker.m81303a(act)) {
            act.startActivity(CoreModule.m29935P().m94651a().mo33281A7(act));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f102999d.size() + m126432K();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 6) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121394j0, viewGroup, false);
        }
        if (i == 7) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121390i0, viewGroup, false);
        }
        if (i == 8) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121426r0, viewGroup, false);
        }
        if (i == 9) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121398k0, viewGroup, false);
        }
        if (i == 10) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121410n0, viewGroup, false);
        }
        return i == 11 ? o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121292E0, viewGroup, false) : u0y.m191366b(viewGroup, i);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, AbsMeetListData absMeetListData, int i, int i2) {
        if (i == 6) {
            ((MeetStateHeaderView) view).m43038Q(this.f103000e, this.f102998c);
            return;
        }
        if (i == 7) {
            ((TextView) view.findViewById(x4c0.f190983R)).setText(i0g0.m133861b0("新动态已看完，去划卡认识新朋友", vwb.m200324f0("去划卡认识新朋友"), Color.parseColor("#fe7e1d"), eqh0.m117752c(2)));
            view.setOnClickListener(new View.OnClickListener() { // from class: l.bj30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f75864a.m126430M(view2);
                }
            });
            CoreModule.f17545c.f19664m1.m34707S4();
            return;
        }
        if (i == 8) {
            ((MeetFeedNoSvipItemView) view).m42826e((MeetFeedNoSvipItemData) absMeetListData, new d30() { // from class: l.cj30
                @Override // p149l.d30
                public final void call() {
                    this.f81136a.m126434N();
                }
            }, new Function0() { // from class: l.dj30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f86502a.m126435O();
                }
            }, this.f102998c);
            return;
        }
        if (i == 9) {
            ((MeetLikersItemView) view).m42852s((MeetFeedLikersItemData) absMeetListData, this.f102998c.m43005P0(), new d30() { // from class: l.ej30
                @Override // p149l.d30
                public final void call() {
                    this.f91662a.m126437Q();
                }
            });
            return;
        }
        if (i == 10) {
            ((MeetNearbyItemView) view).m42912w((MeetFeedNearbyItemData) absMeetListData, this.f102998c.m43004O0());
        } else if (i == 11) {
            ((MeetFeedSvipWeeklyItemView) view).m42962i((MeetFeedSvipWeeklyItemData) absMeetListData, this.f102998c);
        } else {
            ((MeetFeedBaseItemView) view).m42808B0(absMeetListData, this.f102998c);
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m126432K() {
        return this.f103000e.size() > 0 ? 1 : 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbsMeetListData getItem(int i) {
        if (i != 0 || m126432K() <= 0) {
            return this.f102999d.get(i - m126432K());
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m126434N() {
        this.f102998c.m43003N0(false, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Unit m126435O() {
        return this.f102998c.m43003N0(true, "p_meet_view,e_meet_unlock,click");
    }

    /* JADX INFO: renamed from: P */
    public void m126436P(List<MeetLiveItemData> list, List<AbsMeetListData> list2) {
        this.f103000e.clear();
        if (!vwb.m200296J(list)) {
            this.f103000e.addAll(list.subList(0, Math.min(list.size(), 20)));
        }
        this.f102999d.clear();
        this.f102999d.addAll(list2);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m126437Q() {
        AbsMeetListData absMeetListData = (AbsMeetListData) vwb.m200346r(this.f102999d, new w9j() { // from class: l.fj30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbsMeetListData) obj) instanceof MeetFeedLikersItemData);
            }
        });
        if (NullChecker.m81303a(absMeetListData)) {
            this.f102999d.remove(absMeetListData);
            notifyDataSetChanged();
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (i < this.f102999d.size() - 2 || this.f102999d.isEmpty()) {
            return;
        }
        this.f102998c.m43026p1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0 && m126432K() > 0) {
            return 6;
        }
        int iM126432K = i - m126432K();
        AbsMeetListData absMeetListData = this.f102999d.get(iM126432K);
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
        return super.getItemViewType(iM126432K);
    }
}
