package p009l;

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
import com.p000p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import java.util.List;
import l.aj30;
import l.df50;
import l.hnc0;
import l.me50;
import l.s7m;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VProgressBar;
import v.VPullDownRefreshLayout;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zi30 implements s7m<NewMeetFragPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f23686a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f23687b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f23688c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f23689d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f23690e;

    /* JADX INFO: renamed from: f */
    public VImage f23691f;

    /* JADX INFO: renamed from: g */
    public final Act f23692g;

    /* JADX INFO: renamed from: h */
    public NewMeetFragPresenter f23693h;

    /* JADX INFO: renamed from: l.zi30$a */
    public class C1366a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public boolean f23694a = true;

        public C1366a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m25823a(RecyclerView recyclerView) {
            xdl0.M0(zi30.this.f23691f, recyclerView.getLayoutManager().findFirstVisibleItemPosition() >= 5);
        }

        /* JADX INFO: renamed from: b */
        public final void m25824b(RecyclerView recyclerView) {
            LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
            int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
            float f = 0.0f;
            e2y e2yVar = null;
            for (int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                if (iFindFirstVisibleItemPosition >= 0) {
                    Object objFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (objFindViewByPosition instanceof MeetFeedBaseItemView) {
                        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) objFindViewByPosition;
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
                if (this.f23694a && f > 0.2f) {
                    e2yVar.m13689N();
                } else if (f < 0.2f) {
                    e2yVar.m13688M();
                }
            }
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f23694a = true;
                m25824b(recyclerView);
            } else if (i == 1) {
                this.f23694a = true;
            } else {
                if (i != 2) {
                    return;
                }
                this.f23694a = false;
            }
        }

        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m25824b(recyclerView);
            m25823a(recyclerView);
            if (!zi30.this.m25816l(recyclerView) || CoreModule.P().g().Fs()) {
                return;
            }
            zi30.this.f23693h.m7201N0(true, "p_meet_view,e_pull,click");
        }
    }

    public zi30(Act act) {
        this.f23692g = act;
    }

    /* JADX INFO: renamed from: j */
    private void m25808j() {
        this.f23688c.setAdapter(new gj30(this.f23693h));
        this.f23688c.setLayoutManager(new LinearLayoutManager(m25810C0(), 1, false));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(t100.d);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f9f9f9"));
        this.f23688c.addItemDecoration(new h2y(shapeDrawable));
        this.f23688c.addOnScrollListener(new C1366a());
        this.f23687b.O(new df50() { // from class: l.xi30
            /* JADX INFO: renamed from: w2 */
            public final void m24911w2(hnc0 hnc0Var) {
                this.f22617a.m25817m(hnc0Var);
            }
        });
        this.f23687b.M(new me50() { // from class: l.yi30
            /* JADX INFO: renamed from: a */
            public final void m25377a(hnc0 hnc0Var) {
                this.f23080a.m25818n(hnc0Var);
            }
        });
        this.f23687b.H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m25809p(View view) {
        this.f23688c.scrollToPosition(0);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25810C0() {
        return this.f23692g;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f23692g;
    }

    /* JADX INFO: renamed from: e */
    public View m25811e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj30.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m25814i1(NewMeetFragPresenter newMeetFragPresenter) {
        this.f23693h = newMeetFragPresenter;
    }

    /* JADX INFO: renamed from: i */
    public void m25813i() {
        this.f23687b.t();
        this.f23687b.o();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25811e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m25815k() {
        xdl0.M(this.f23686a, false);
    }

    /* JADX INFO: renamed from: l */
    public boolean m25816l(RecyclerView recyclerView) {
        return recyclerView != null && recyclerView.computeVerticalScrollRange() > xdl0.w0() && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m25817m(hnc0 hnc0Var) {
        this.f23693h.m7223m1();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m25818n(hnc0 hnc0Var) {
        this.f23693h.m7226p1();
    }

    /* JADX INFO: renamed from: q */
    public void m25819q(List<AbsMeetListData> list, List<MeetLiveItemData> list2) {
        xdl0.M0(this.f23688c, true);
        xdl0.M0(this.f23689d, false);
        xdl0.M0(this.f23690e, false);
        this.f23688c.getAdapter().m15076P(list2, list);
    }

    /* JADX INFO: renamed from: r */
    public void m25820r() {
        this.f23689d.setGravity(113);
        xdl0.M0(this.f23690e, true);
        m25815k();
        m25808j();
        xdl0.E0(this.f23691f, new View.OnClickListener() { // from class: l.wi30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22130a.m25809p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m25821s() {
        xdl0.M0(this.f23688c, false);
        xdl0.M0(this.f23689d, true);
        xdl0.M0(this.f23690e, false);
    }

    /* JADX INFO: renamed from: u */
    public void m25822u(Boolean bool) {
        this.f23687b.G(bool.booleanValue());
    }

    public void destroy() {
    }
}
