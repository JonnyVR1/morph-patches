package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.p000p1.mobile.putong.core.p001ui.nightclub.view.NightClubUserDetailAct;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfilePictureItemView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import l.bkb0;
import l.bt0;
import l.dbl0;
import l.e30;
import l.e51;
import l.eb2;
import l.f6c0;
import l.ftd0;
import l.hvc0;
import l.i0g0;
import l.j760;
import l.myf;
import l.o7r;
import l.osi0;
import l.qib0;
import l.s7m;
import l.sj40;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xij0;
import l.zub;
import l.zvf0;
import v.AutoVDraweeView;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rj40 implements ViewPager.j, s7m<kj40> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f18542a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f18543b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f18544c;

    /* JADX INFO: renamed from: d */
    public ImageView f18545d;

    /* JADX INFO: renamed from: e */
    public TextView f18546e;

    /* JADX INFO: renamed from: f */
    public VText f18547f;

    /* JADX INFO: renamed from: g */
    public View f18548g;

    /* JADX INFO: renamed from: h */
    public VPager f18549h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f18550i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f18551j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f18552k;

    /* JADX INFO: renamed from: l */
    public VText f18553l;

    /* JADX INFO: renamed from: m */
    public User f18554m;

    /* JADX INFO: renamed from: n */
    public final C0797a f18555n = new C0797a();

    /* JADX INFO: renamed from: o */
    public final NightClubUserDetailAct f18556o;

    /* JADX INFO: renamed from: p */
    public kj40 f18557p;

    /* JADX INFO: renamed from: l.rj40$a */
    public class C0797a extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f18558e;

        /* JADX INFO: renamed from: f */
        public List<Media> f18559f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f18560g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f18561h = -1;

        /* JADX INFO: renamed from: i */
        public int f18562i = 0;

        public C0797a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m22031v(View view) {
            rj40.this.m22027u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m22032w(View view) {
            rj40.this.m22028v();
        }

        public int getCount() {
            return this.f18559f.size();
        }

        public int getItemPosition(Object obj) {
            int i = this.f18562i;
            if (i <= 0) {
                return super/*l.w660*/.getItemPosition(obj);
            }
            this.f18562i = i - 1;
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m22033o(ViewGroup viewGroup, int i, Object obj) {
            this.f18558e = true;
            if (i == rj40.this.f18549h.getCurrentItem()) {
                dbl0.a(rj40.this.f18549h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f18560g.add((PictureView) obj);
            }
        }

        /* JADX INFO: renamed from: p */
        public Object m22034p(ViewGroup viewGroup, int i) {
            PictureView pictureView = !this.f18560g.isEmpty() ? (PictureView) this.f18560g.pop() : (PictureView) rj40.this.act().inflater().inflate(f6c0.ze, viewGroup, false);
            pictureView.A.setVisibility(8);
            pictureView.B.setVisibility(8);
            pictureView.j0(true, false);
            if (NullChecker.a(pictureView.a.getHierarchy())) {
                pictureView.a.getHierarchy().A(rj40.this.act().getResources().getDrawable(x2c0.T7));
                pictureView.a.getHierarchy().E(rj40.this.act().getResources().getDrawable(x2c0.T7));
            }
            pictureView.J(true, false);
            pictureView.setAspectRateFitWidth(0.8f);
            pictureView.a.getHierarchy().w(ftd0.i);
            m22038x(pictureView, this.f18559f.get(i), 100);
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = o7r.a(rj40.this.act()).inflate(f6c0.n9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            xdl0.c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(u4c0.c);
            View viewFindViewById2 = viewInflate.findViewById(u4c0.d);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.pj40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17413a.m22031v(view);
                }
            });
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.qj40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18010a.m22032w(view);
                }
            });
            return pictureView;
        }

        /* JADX INFO: renamed from: s */
        public View m22035s(int i) {
            View viewM22036t = m22036t(i);
            return (NullChecker.a(viewM22036t) && (viewM22036t instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM22036t).f864b : viewM22036t;
        }

        /* JADX INFO: renamed from: t */
        public View m22036t(int i) {
            if (rj40.this.f18549h == null) {
                return null;
            }
            for (int i2 = 0; i2 < rj40.this.f18549h.getChildCount(); i2++) {
                Object tag = rj40.this.f18549h.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return rj40.this.f18549h.getChildAt(i2);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: u */
        public int m22037u() {
            return rj40.this.f18549h.getCurrentItem();
        }

        /* JADX INFO: renamed from: x */
        public void m22038x(PictureView pictureView, Media media, int i) {
            pictureView.Y(media, i);
        }

        /* JADX INFO: renamed from: y */
        public void m22039y(List<Media> list) {
            if (list.equals(this.f18559f) && !this.f18558e) {
                m22040z(rj40.this.f18554m, m22037u());
                return;
            }
            this.f18558e = false;
            this.f18562i = getCount();
            this.f18559f = list;
            rj40.this.f18555n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: z */
        public void m22040z(User user, int i) {
            if (!NullChecker.a(user) || i >= user.pictures.size() || this.f18561h == i) {
                return;
            }
            this.f18561h = i;
        }
    }

    public rj40(NightClubUserDetailAct nightClubUserDetailAct) {
        this.f18556o = nightClubUserDetailAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22012d(boolean z, j760 j760Var) {
        Priority priority;
        Object obj = j760Var.a;
        String str = (!(obj instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriF = zub.f((Media) obj);
        bkb0 bkb0Var = qib0.G;
        if (((Integer) j760Var.b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) j760Var.b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        bkb0Var.w0(imageUriF, priority, str);
    }

    /* JADX INFO: renamed from: A3 */
    public void m22015A3(String str) {
        if (TextUtils.isEmpty(str)) {
            act().finish();
            return;
        }
        User userPa = CoreModule.c.e0.Pa(str);
        this.f18554m = userPa;
        if (userPa == null) {
            act().finish();
            return;
        }
        xdl0.X(this.f18545d, t100.j + xdl0.F0());
        xdl0.X(this.f18546e, t100.d(44.0f) + xdl0.F0());
        m22025q();
        this.f18551j.r();
        this.f18551j.q(this.f18554m, -1, false, false);
        this.f18552k.W(this.f18554m, -1, true);
        m22024p();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22016C0() {
        return this.f18556o;
    }

    /* JADX INFO: renamed from: i */
    public View m22017i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sj40.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22017i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m22018i1(kj40 kj40Var) {
        this.f18557p = kj40Var;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22020k() {
        m22023n(this.f18554m, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m22021l(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m22022m(View view) {
        zvf0.r("e_intl_mkt_twclub_profile_like", this.f18556o.pageId());
        if (myf.M(CoreModule.c.e0.p9())) {
            osi0.f(R.string.pc);
            return;
        }
        Counter counterO3 = CoreModule.c.o3();
        if (NullChecker.a(counterO3) && NullChecker.a(counterO3.likeLimit)) {
            CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
            if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0) {
                C0189c.m3969J1(this.f18556o, "p_intl_mkt_twclub_profile,e_intl_mkt_twclub_profile_like,click", Privilege.vip_unlimited_likes);
                return;
            }
        }
        kj40 kj40Var = this.f18557p;
        if (kj40Var != null) {
            kj40Var.m16645j0(this.f18554m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22023n(User user, final boolean z) {
        if (ConnectivityReceiver.i()) {
            vwb.z(vwb.p0(user.pictures), new e30() { // from class: l.oj40
                public final void call(Object obj) {
                    rj40.m22012d(z, (j760) obj);
                }
            });
        } else {
            qib0.G.w0(zub.f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    public void onPageSelected(int i) {
        dbl0.a(this.f18549h, false);
        this.f18550i.b(i);
        PictureView pictureViewM22035s = this.f18555n.m22035s(i);
        if ((pictureViewM22035s instanceof PictureView) && xij0.d0() && this.f18556o.lifecycle_() == c.i) {
            pictureViewM22035s.V();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: p */
    public final void m22024p() {
        String strQ;
        Location location = this.f18554m.location;
        if (location.distance < 1000) {
            strQ = Math.max(location.distance, 5) + App.e.getString(com.p1.mobile.putong.common.R.string.J0);
        } else {
            strQ = i0g0.q(location, false);
        }
        this.f18547f.setText(hvc0.c(R.string.qb) + ": " + strQ);
        CharSequence text = this.f18552k.c.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (text.toString().endsWith(hvc0.c(R.string.Xg)) || text.toString().endsWith(hvc0.c(R.string.Pi))) {
            this.f18552k.c.setText(strQ);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m22025q() {
        if (this.f18554m == null) {
            return;
        }
        e51.y(new Runnable() { // from class: l.lj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f14886a.m22020k();
            }
        });
        this.f18549h.setAdapter(this.f18555n);
        this.f18555n.m22039y(this.f18554m.pictures);
        this.f18549h.d(this);
        this.f18550i.setIndicatorCount(this.f18554m.pictures.size());
        if (this.f18554m.pictures.size() <= 1) {
            xdl0.M(this.f18550i, false);
        }
        xdl0.E0(this.f18545d, new View.OnClickListener() { // from class: l.mj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15405a.m22021l(view);
            }
        });
        xdl0.E0(this.f18553l, new View.OnClickListener() { // from class: l.nj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16070a.m22022m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m22026s(boolean z) {
        float f = z ? 1.5f : -1.5f;
        VPager vPager = this.f18549h;
        vPager.setPivotX(vPager.getWidth() / 2.0f);
        VPager vPager2 = this.f18549h;
        vPager2.setPivotY(vPager2.getHeight() / 2.0f);
        bt0.n(this.f18549h, View.ROTATION_Y, new float[]{0.0f, f, 0.0f}).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public void m22027u() {
        if (NullChecker.a(this.f18549h)) {
            if (this.f18549h.getCurrentItem() <= 0) {
                m22026s(false);
            } else {
                VPager vPager = this.f18549h;
                vPager.T(vPager.getCurrentItem() - 1, false);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m22028v() {
        if (this.f18549h.getCurrentItem() >= this.f18555n.getCount() - 1) {
            m22026s(true);
        } else {
            VPager vPager = this.f18549h;
            vPager.T(vPager.getCurrentItem() + 1, false);
        }
    }

    public void destroy() {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }
}
