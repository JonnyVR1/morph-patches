package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullDownRefreshLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class nr30 implements iam<NewMeetFragPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f143363a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f143364b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f143365c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f143366d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f143367e;

    /* JADX INFO: renamed from: f */
    public VImage f143368f;

    /* JADX INFO: renamed from: g */
    public final Act f143369g;

    /* JADX INFO: renamed from: h */
    public NewMeetFragPresenter f143370h;

    /* JADX INFO: renamed from: l.nr30$a */
    public class C18934a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f143371a = true;

        public C18934a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m164459a(RecyclerView recyclerView) {
            bnl0.m105525M0(nr30.this.f143368f, ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() >= 5);
        }

        /* JADX INFO: renamed from: b */
        public final void m164460b(RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            float f = 0.0f;
            bby bbyVar = null;
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                if (iFindFirstVisibleItemPosition >= 0) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition instanceof MeetFeedBaseItemView) {
                        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) viewFindViewByPosition;
                        czl contentView = meetFeedBaseItemView.getContentView();
                        if (contentView instanceof bby) {
                            float feedVisiblePercentInWindow = meetFeedBaseItemView.getFeedVisiblePercentInWindow();
                            if (feedVisiblePercentInWindow > f) {
                                f = feedVisiblePercentInWindow;
                                bbyVar = (bby) contentView;
                            }
                        }
                    }
                }
            }
            if (bbyVar != null) {
                if (this.f143371a && f > 0.2f) {
                    bbyVar.m103351N();
                } else if (f < 0.2f) {
                    bbyVar.m103350M();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f143371a = true;
                m164460b(recyclerView);
            } else if (i == 1) {
                this.f143371a = true;
            } else {
                if (i != 2) {
                    return;
                }
                this.f143371a = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m164460b(recyclerView);
            m164459a(recyclerView);
            if (!nr30.this.m164452l(recyclerView) || CoreModule.m30933P().m143410g().mo36014Fs()) {
                return;
            }
            nr30.this.f143370h.m44014N0(true, "p_meet_view,e_pull,click");
        }
    }

    public nr30(Act act) {
        this.f143369g = act;
    }

    /* JADX INFO: renamed from: j */
    private void m164446j() {
        this.f143365c.setAdapter(new ur30(this.f143370h));
        this.f143365c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(qa00.f156317d);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f9f9f9"));
        this.f143365c.addItemDecoration(new eby(shapeDrawable));
        this.f143365c.addOnScrollListener(new C18934a());
        this.f143364b.mo224405O(new jn50() { // from class: l.lr30
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f133288a.m164453m(mvc0Var);
            }
        });
        this.f143364b.mo224404M(new tm50() { // from class: l.mr30
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f138297a.m164454n(mvc0Var);
            }
        });
        this.f143364b.m225002H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m164447p(View view) {
        this.f143365c.scrollToPosition(0);
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143369g;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f143369g;
    }

    /* JADX INFO: renamed from: e */
    public View m164448e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return or30.m168858b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(NewMeetFragPresenter newMeetFragPresenter) {
        this.f143370h = newMeetFragPresenter;
    }

    /* JADX INFO: renamed from: i */
    public void m164450i() {
        this.f143364b.m225021t();
        this.f143364b.m225016o();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m164448e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m164451k() {
        bnl0.m105524M(this.f143363a, false);
    }

    /* JADX INFO: renamed from: l */
    public boolean m164452l(RecyclerView recyclerView) {
        return recyclerView != null && recyclerView.computeVerticalScrollRange() > bnl0.m105588w0() && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m164453m(mvc0 mvc0Var) {
        this.f143370h.m44034m1();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m164454n(mvc0 mvc0Var) {
        this.f143370h.m44037p1();
    }

    /* JADX INFO: renamed from: q */
    public void m164455q(List<AbsMeetListData> list, List<MeetLiveItemData> list2) {
        bnl0.m105525M0(this.f143365c, true);
        bnl0.m105525M0(this.f143366d, false);
        bnl0.m105525M0(this.f143367e, false);
        ((ur30) this.f143365c.getAdapter()).m197455P(list2, list);
    }

    /* JADX INFO: renamed from: r */
    public void m164456r() {
        this.f143366d.setGravity(113);
        bnl0.m105525M0(this.f143367e, true);
        m164451k();
        m164446j();
        bnl0.m105509E0(this.f143368f, new View.OnClickListener() { // from class: l.kr30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128411a.m164447p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m164457s() {
        bnl0.m105525M0(this.f143365c, false);
        bnl0.m105525M0(this.f143366d, true);
        bnl0.m105525M0(this.f143367e, false);
    }

    /* JADX INFO: renamed from: u */
    public void m164458u(Boolean bool) {
        this.f143364b.m225001G(bool.booleanValue());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
