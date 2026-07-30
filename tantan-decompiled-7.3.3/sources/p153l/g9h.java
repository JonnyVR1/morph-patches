package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class g9h implements iam<b9h> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f102847a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f102848b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f102849c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f102850d;

    /* JADX INFO: renamed from: e */
    public b9h f102851e;

    /* JADX INFO: renamed from: f */
    public VFrame f102852f;

    /* JADX INFO: renamed from: g */
    public VText f102853g;

    /* JADX INFO: renamed from: h */
    public Act f102854h;

    /* JADX INFO: renamed from: i */
    public keh f102855i = new leh();

    /* JADX INFO: renamed from: j */
    public y20<Intent> f102856j = dmk0.m116962a(400, new y20() { // from class: l.c9h
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f80485a.m129584n((Intent) obj);
        }
    });

    public g9h(Act act) {
        this.f102854h = act;
    }

    /* JADX INFO: renamed from: i */
    private void m129577i() {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) this.f102854h.getSupportFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f102850d = photoAlbumFeedFrag;
        if (NullChecker.m82486a(photoAlbumFeedFrag)) {
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFragM65543M4 = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_nearby_online", -1, User.ID_TEAM_ACCOUNT, 11);
        AbstractC0428k abstractC0428kM2568m = this.f102854h.getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, photoAlbumFeedFragM65543M4, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m129578e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h9h.m134059b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b9h b9hVar) {
        this.f102851e = b9hVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM129578e = m129578e(layoutInflater, viewGroup);
        this.f102848b.setTitle(this.f102854h.getString(R$string.f39812R0));
        this.f102848b.setLeftIconAsBack(this.f102854h);
        this.f102852f = new VFrame(this.f102854h);
        VText vText = new VText(this.f102854h);
        this.f102853g = vText;
        this.f102852f.addView(vText, new FrameLayout.LayoutParams(-2, -2));
        this.f102853g.setText(R$string.f39747G1);
        this.f102853g.setTextSize(12.0f);
        this.f102853g.setTextColor(-1);
        this.f102853g.setTypeface(lyh0.m156283c(3), 1);
        this.f102853g.setPadding(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f));
        this.f102853g.setBackgroundResource(lbc0.f131124q5);
        this.f102848b.setRightIconViews(this.f102852f);
        m129580j(this.f102852f);
        m129577i();
        return viewM129578e;
    }

    /* JADX INFO: renamed from: j */
    public final void m129580j(View view) {
        i4g0.m138526x("e_moment_post", "p_nearby_online");
        view.setOnClickListener(new View.OnClickListener() { // from class: l.d9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f85775a.m129582l(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.e9h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f92634a.m129583m(view2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m129581k() {
        this.f102854h.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.f9h
            @Override // p153l.y20
            public final void call(Object obj) {
                C4470c.f16263e;
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m129582l(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        this.f102855i.mo149319a(this.f102854h, "p_nearby_online", null, this.f102856j);
        i4g0.m138520r("e_moment_post", "p_nearby_online");
        l94.m153309e().m153318j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m129583m(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return true;
        }
        i4g0.m138520r("e_moment_post", "p_nearby_online");
        l94.m153309e().m153318j();
        cn40.m111396k0(this.f102854h, jyb.m147507f0(new Media[0]), true, "camera");
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m129584n(Intent intent) {
        this.f102854h.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
