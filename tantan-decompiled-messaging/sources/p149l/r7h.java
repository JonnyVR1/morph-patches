package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class r7h implements s7m<m7h> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f158028a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f158029b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f158030c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f158031d;

    /* JADX INFO: renamed from: e */
    public m7h f158032e;

    /* JADX INFO: renamed from: f */
    public VFrame f158033f;

    /* JADX INFO: renamed from: g */
    public VText f158034g;

    /* JADX INFO: renamed from: h */
    public Act f158035h;

    /* JADX INFO: renamed from: i */
    public vch f158036i = new wch();

    /* JADX INFO: renamed from: j */
    public e30<Intent> f158037j = xck0.m208120a(400, new e30() { // from class: l.n7h
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f137530a.m178138n((Intent) obj);
        }
    });

    public r7h(Act act) {
        this.f158035h = act;
    }

    /* JADX INFO: renamed from: i */
    private void m178131i() {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) this.f158035h.getSupportFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f158031d = photoAlbumFeedFrag;
        if (NullChecker.m81303a(photoAlbumFeedFrag)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFragM64360M4 = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_nearby_online", -1, User.ID_TEAM_ACCOUNT, 11);
        AbstractC0427k abstractC0427kM2567m = this.f158035h.getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, photoAlbumFeedFragM64360M4, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m178132e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s7h.m182486b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m7h m7hVar) {
        this.f158032e = m7hVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM178132e = m178132e(layoutInflater, viewGroup);
        this.f158029b.setTitle(this.f158035h.getString(R$string.f38964R0));
        this.f158029b.setLeftIconAsBack(this.f158035h);
        this.f158033f = new VFrame(this.f158035h);
        VText vText = new VText(this.f158035h);
        this.f158034g = vText;
        this.f158033f.addView(vText, new FrameLayout.LayoutParams(-2, -2));
        this.f158034g.setText(R$string.f38899G1);
        this.f158034g.setTextSize(12.0f);
        this.f158034g.setTextColor(-1);
        this.f158034g.setTypeface(eqh0.m117752c(3), 1);
        this.f158034g.setPadding(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f));
        this.f158034g.setBackgroundResource(f3c0.f94606q5);
        this.f158029b.setRightIconViews(this.f158033f);
        m178134j(this.f158033f);
        m178131i();
        return viewM178132e;
    }

    /* JADX INFO: renamed from: j */
    public final void m178134j(View view) {
        zvf0.m220402x("e_moment_post", "p_nearby_online");
        view.setOnClickListener(new View.OnClickListener() { // from class: l.o7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142491a.m178136l(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p7h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f147508a.m178137m(view2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m178135k() {
        this.f158035h.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.q7h
            @Override // p149l.e30
            public final void call(Object obj) {
                C4319c.f15544e;
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m178136l(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        this.f158036i.mo197762a(this.f158035h, "p_nearby_online", null, this.f158037j);
        zvf0.m220396r("e_moment_post", "p_nearby_online");
        m84.m153429e().m153438j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m178137m(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return true;
        }
        zvf0.m220396r("e_moment_post", "p_nearby_online");
        m84.m153429e().m153438j();
        oe40.m163846k0(this.f158035h, vwb.m200324f0(new Media[0]), true, "camera");
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m178138n(Intent intent) {
        this.f158035h.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
