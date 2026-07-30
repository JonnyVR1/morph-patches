package p007l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.eqh0;
import l.mkd0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xck0;
import l.zvf0;
import v.VFrame;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r7h implements s7m<m7h> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f12503a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f12504b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f12505c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f12506d;

    /* JADX INFO: renamed from: e */
    public m7h f12507e;

    /* JADX INFO: renamed from: f */
    public VFrame f12508f;

    /* JADX INFO: renamed from: g */
    public VText f12509g;

    /* JADX INFO: renamed from: h */
    public Act f12510h;

    /* JADX INFO: renamed from: i */
    public vch f12511i = new wch();

    /* JADX INFO: renamed from: j */
    public e30<Intent> f12512j = xck0.a(400, new e30() { // from class: l.n7h
        public final void call(Object obj) {
            this.f10693a.m13851n((Intent) obj);
        }
    });

    public r7h(Act act) {
        this.f12510h = act;
    }

    /* JADX INFO: renamed from: i */
    private void m13842i() {
        PhotoAlbumFeedFrag photoAlbumFeedFragI0 = this.f12510h.getSupportFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f12506d = photoAlbumFeedFragI0;
        if (NullChecker.a(photoAlbumFeedFragI0)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFragM5434M4 = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_nearby_online", -1, User.ID_TEAM_ACCOUNT, 11);
        k kVarM = this.f12510h.getSupportFragmentManager().m();
        kVarM.c(b5c0.f6046g, photoAlbumFeedFragM5434M4, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13843C0() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m13844e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s7h.m14034b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m13846i1(m7h m7hVar) {
        this.f12507e = m7hVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM13844e = m13844e(layoutInflater, viewGroup);
        this.f12504b.setTitle(this.f12510h.getString(R$string.f425R0));
        this.f12504b.setLeftIconAsBack(this.f12510h);
        this.f12508f = new VFrame(this.f12510h);
        View vText = new VText(this.f12510h);
        this.f12509g = vText;
        this.f12508f.addView(vText, new FrameLayout.LayoutParams(-2, -2));
        this.f12509g.setText(R$string.f360G1);
        this.f12509g.setTextSize(12.0f);
        this.f12509g.setTextColor(-1);
        this.f12509g.setTypeface(eqh0.c(3), 1);
        this.f12509g.setPadding(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f));
        this.f12509g.setBackgroundResource(f3c0.f7889q5);
        this.f12504b.setRightIconViews(new View[]{this.f12508f});
        m13847j(this.f12508f);
        m13842i();
        return viewM13844e;
    }

    /* JADX INFO: renamed from: j */
    public final void m13847j(View view) {
        zvf0.x("e_moment_post", "p_nearby_online");
        view.setOnClickListener(new View.OnClickListener() { // from class: l.o7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11363a.m13849l(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p7h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f11716a.m13850m(view2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m13848k() {
        this.f12510h.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.q7h
            public final void call(Object obj) {
                c.e;
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m13849l(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        this.f12511i.mo15419a(this.f12510h, "p_nearby_online", null, this.f12512j);
        zvf0.r("e_moment_post", "p_nearby_online");
        m84.m11844e().m11853j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m13850m(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return true;
        }
        zvf0.r("e_moment_post", "p_nearby_online");
        m84.m11844e().m11853j();
        oe40.m12583k0(this.f12510h, vwb.f0(new Media[0]), true, "camera");
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m13851n(Intent intent) {
        this.f12510h.startActivityForResult(intent, 786);
    }

    public void destroy() {
    }
}
