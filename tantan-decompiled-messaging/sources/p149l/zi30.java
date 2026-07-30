package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullDownRefreshLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class zi30 implements s7m<NewMeetFragPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f203282a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f203283b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f203284c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f203285d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f203286e;

    /* JADX INFO: renamed from: f */
    public VImage f203287f;

    /* JADX INFO: renamed from: g */
    public final Act f203288g;

    /* JADX INFO: renamed from: h */
    public NewMeetFragPresenter f203289h;

    /* JADX INFO: renamed from: l.zi30$a */
    public class C21712a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f203290a = true;

        public C21712a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m218957a(RecyclerView recyclerView) {
            xdl0.m208345M0(zi30.this.f203287f, ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() >= 5);
        }

        /* JADX INFO: renamed from: b */
        public final void m218958b(RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            float f = 0.0f;
            e2y e2yVar = null;
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                if (iFindFirstVisibleItemPosition >= 0) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition instanceof MeetFeedBaseItemView) {
                        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) viewFindViewByPosition;
                        kwl contentView = meetFeedBaseItemView.getContentView();
                        if (contentView instanceof e2y) {
                            float feedVisiblePercentInWindow = meetFeedBaseItemView.getFeedVisiblePercentInWindow();
                            if (feedVisiblePercentInWindow > f) {
                                f = feedVisiblePercentInWindow;
                                e2yVar = (e2y) contentView;
                            }
                        }
                    }
                }
            }
            if (e2yVar != null) {
                if (this.f203290a && f > 0.2f) {
                    e2yVar.m114568N();
                } else if (f < 0.2f) {
                    e2yVar.m114567M();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f203290a = true;
                m218958b(recyclerView);
            } else if (i == 1) {
                this.f203290a = true;
            } else {
                if (i != 2) {
                    return;
                }
                this.f203290a = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m218958b(recyclerView);
            m218957a(recyclerView);
            if (!zi30.this.m218950l(recyclerView) || CoreModule.m29935P().m94656g().mo35011Fs()) {
                return;
            }
            zi30.this.f203289h.m43003N0(true, "p_meet_view,e_pull,click");
        }
    }

    public zi30(Act act) {
        this.f203288g = act;
    }

    /* JADX INFO: renamed from: j */
    private void m218944j() {
        this.f203284c.setAdapter(new gj30(this.f203289h));
        this.f203284c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(t100.f167255d);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f9f9f9"));
        this.f203284c.addItemDecoration(new h2y(shapeDrawable));
        this.f203284c.addOnScrollListener(new C21712a());
        this.f203283b.mo223159O(new df50() { // from class: l.xi30
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f192958a.m218951m(hnc0Var);
            }
        });
        this.f203283b.mo223158M(new me50() { // from class: l.yi30
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f198441a.m218952n(hnc0Var);
            }
        });
        this.f203283b.m223756H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m218945p(View view) {
        this.f203284c.scrollToPosition(0);
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203288g;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f203288g;
    }

    /* JADX INFO: renamed from: e */
    public View m218946e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj30.m96970b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(NewMeetFragPresenter newMeetFragPresenter) {
        this.f203289h = newMeetFragPresenter;
    }

    /* JADX INFO: renamed from: i */
    public void m218948i() {
        this.f203283b.m223775t();
        this.f203283b.m223770o();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218946e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m218949k() {
        xdl0.m208344M(this.f203282a, false);
    }

    /* JADX INFO: renamed from: l */
    public boolean m218950l(RecyclerView recyclerView) {
        return recyclerView != null && recyclerView.computeVerticalScrollRange() > xdl0.m208408w0() && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m218951m(hnc0 hnc0Var) {
        this.f203289h.m43023m1();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m218952n(hnc0 hnc0Var) {
        this.f203289h.m43026p1();
    }

    /* JADX INFO: renamed from: q */
    public void m218953q(List<AbsMeetListData> list, List<MeetLiveItemData> list2) {
        xdl0.m208345M0(this.f203284c, true);
        xdl0.m208345M0(this.f203285d, false);
        xdl0.m208345M0(this.f203286e, false);
        ((gj30) this.f203284c.getAdapter()).m126436P(list2, list);
    }

    /* JADX INFO: renamed from: r */
    public void m218954r() {
        this.f203285d.setGravity(113);
        xdl0.m208345M0(this.f203286e, true);
        m218949k();
        m218944j();
        xdl0.m208329E0(this.f203287f, new View.OnClickListener() { // from class: l.wi30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186499a.m218945p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m218955s() {
        xdl0.m208345M0(this.f203284c, false);
        xdl0.m208345M0(this.f203285d, true);
        xdl0.m208345M0(this.f203286e, false);
    }

    /* JADX INFO: renamed from: u */
    public void m218956u(Boolean bool) {
        this.f203283b.m223755G(bool.booleanValue());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
