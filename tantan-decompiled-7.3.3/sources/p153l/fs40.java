package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.nightclub.view.NightClubUserDetailAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfilePictureItemView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import p151v.AutoVDraweeView;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fs40 implements ViewPager.InterfaceC0718j, iam<yr40> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f100525a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f100526b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f100527c;

    /* JADX INFO: renamed from: d */
    public ImageView f100528d;

    /* JADX INFO: renamed from: e */
    public TextView f100529e;

    /* JADX INFO: renamed from: f */
    public VText f100530f;

    /* JADX INFO: renamed from: g */
    public View f100531g;

    /* JADX INFO: renamed from: h */
    public VPager f100532h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f100533i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f100534j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f100535k;

    /* JADX INFO: renamed from: l */
    public VText f100536l;

    /* JADX INFO: renamed from: m */
    public User f100537m;

    /* JADX INFO: renamed from: n */
    public final C17053a f100538n = new C17053a();

    /* JADX INFO: renamed from: o */
    public final NightClubUserDetailAct f100539o;

    /* JADX INFO: renamed from: p */
    public yr40 f100540p;

    /* JADX INFO: renamed from: l.fs40$a */
    public class C17053a extends lb2 {

        /* JADX INFO: renamed from: e */
        public boolean f100541e;

        /* JADX INFO: renamed from: f */
        public List<Media> f100542f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f100543g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f100544h = -1;

        /* JADX INFO: renamed from: i */
        public int f100545i = 0;

        public C17053a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m127044v(View view) {
            fs40.this.m127040u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m127045w(View view) {
            fs40.this.m127041v();
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f100542f.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            int i = this.f100545i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f100545i = i - 1;
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            this.f100541e = true;
            if (i == fs40.this.f100532h.getCurrentItem()) {
                hkl0.m135638a(fs40.this.f100532h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f100543g.add((PictureView) obj);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            PictureView pictureView = !this.f100543g.isEmpty() ? (PictureView) this.f100543g.pop() : (PictureView) fs40.this.getAct().inflater().inflate(kec0.f125431Ge, viewGroup, false);
            pictureView.f28880A.setVisibility(8);
            pictureView.f28881B.setVisibility(8);
            pictureView.m45187j0(true, false);
            if (NullChecker.m82486a(pictureView.f28918a.getHierarchy())) {
                pictureView.f28918a.getHierarchy().m207038A(fs40.this.getAct().getResources().getDrawable(dbc0.f86624U7));
                pictureView.f28918a.getHierarchy().m207042E(fs40.this.getAct().getResources().getDrawable(dbc0.f86624U7));
            }
            pictureView.m45165J(true, false);
            pictureView.setAspectRateFitWidth(0.8f);
            pictureView.f28918a.getHierarchy().m207062w(h1e0.f107452i);
            m127049x(pictureView, this.f100542f.get(i), 100);
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = p9r.m171370a(fs40.this.getAct()).inflate(kec0.f126085u9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            bnl0.m105548c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(adc0.f70276c);
            View viewFindViewById2 = viewInflate.findViewById(adc0.f70293d);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ds40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90456a.m127044v(view);
                }
            });
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.es40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f95565a.m127045w(view);
                }
            });
            return pictureView;
        }

        /* JADX INFO: renamed from: s */
        public View m127046s(int i) {
            View viewM127047t = m127047t(i);
            return (NullChecker.m82486a(viewM127047t) && (viewM127047t instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM127047t).f33890b : viewM127047t;
        }

        /* JADX INFO: renamed from: t */
        public View m127047t(int i) {
            if (fs40.this.f100532h == null) {
                return null;
            }
            for (int i2 = 0; i2 < fs40.this.f100532h.getChildCount(); i2++) {
                Object tag = fs40.this.f100532h.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return fs40.this.f100532h.getChildAt(i2);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: u */
        public int m127048u() {
            return fs40.this.f100532h.getCurrentItem();
        }

        /* JADX INFO: renamed from: x */
        public void m127049x(PictureView pictureView, Media media, int i) {
            pictureView.m45177Y(media, i);
        }

        /* JADX INFO: renamed from: y */
        public void m127050y(List<Media> list) {
            if (list.equals(this.f100542f) && !this.f100541e) {
                m127051z(fs40.this.f100537m, m127048u());
                return;
            }
            this.f100541e = false;
            this.f100545i = getCount();
            this.f100542f = list;
            fs40.this.f100538n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: z */
        public void m127051z(User user, int i) {
            if (!NullChecker.m82486a(user) || i >= user.pictures.size() || this.f100544h == i) {
                return;
            }
            this.f100544h = i;
        }
    }

    public fs40(NightClubUserDetailAct nightClubUserDetailAct) {
        this.f100539o = nightClubUserDetailAct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m127027d(boolean z, pf60 pf60Var) {
        Priority priority;
        F f = pf60Var.f152156a;
        String str = (!(f instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriM164968f = nwb.m164968f((Media) f);
        fsb0 fsb0Var = uqb0.f180374G;
        if (((Integer) pf60Var.f152157b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) pf60Var.f152157b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        fsb0Var.m127159w0(imageUriM164968f, priority, str);
    }

    /* JADX INFO: renamed from: A3 */
    public void m127030A3(String str) {
        if (TextUtils.isEmpty(str)) {
            getAct().lambda$debugItems$19();
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        this.f100537m = userM116503Pa;
        if (userM116503Pa == null) {
            getAct().lambda$debugItems$19();
            return;
        }
        bnl0.m105540X(this.f100528d, qa00.f156323j + bnl0.m105511F0());
        bnl0.m105540X(this.f100529e, qa00.m175859d(44.0f) + bnl0.m105511F0());
        m127038q();
        this.f100534j.m39902r();
        this.f100534j.m39901q(this.f100537m, -1, false, false);
        this.f100535k.m40126W(this.f100537m, -1, true);
        m127037p();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f100539o;
    }

    /* JADX INFO: renamed from: i */
    public View m127031i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gs40.m131958b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m127031i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yr40 yr40Var) {
        this.f100540p = yr40Var;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m127033k() {
        m127036n(this.f100537m, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m127034l(View view) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m127035m(View view) {
        i4g0.m138520r("e_intl_mkt_twclub_profile_like", this.f100539o.pageId());
        if (a0g.m95357M(CoreModule.f18264c.f20381e0.m116600p9())) {
            r1j0.m179419f(R$string.f18422Ec);
            return;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (NullChecker.m82486a(counterM32487o3) && NullChecker.m82486a(counterM32487o3.likeLimit)) {
            CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
            if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0) {
                C8927c.m54586J1(this.f100539o, "p_intl_mkt_twclub_profile,e_intl_mkt_twclub_profile_like,click", Privilege.vip_unlimited_likes);
                return;
            }
        }
        yr40 yr40Var = this.f100540p;
        if (yr40Var != null) {
            yr40Var.m217163j0(this.f100537m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m127036n(User user, final boolean z) {
        if (ConnectivityReceiver.m82469i()) {
            jyb.m147537z(jyb.m147527p0(user.pictures), new y20() { // from class: l.cs40
                @Override // p153l.y20
                public final void call(Object obj) {
                    fs40.m127027d(z, (pf60) obj);
                }
            });
        } else {
            uqb0.f180374G.m127159w0(nwb.m164968f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        hkl0.m135638a(this.f100532h, false);
        this.f100533i.m37958b(i);
        View viewM127046s = this.f100538n.m127046s(i);
        if ((viewM127046s instanceof PictureView) && asj0.m99935d0() && this.f100539o.lifecycle_() == C4470c.f16267i) {
            ((PictureView) viewM127046s).m45174V();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: p */
    public final void m127037p() {
        String strM175812q;
        Location location = this.f100537m.location;
        if (location.distance < 1000) {
            strM175812q = Math.max(location.distance, 5) + App.f16088e.getString(com.p051p1.mobile.putong.common.R$string.f18057J0);
        } else {
            strM175812q = q8g0.m175812q(location, false);
        }
        this.f100530f.setText(k3d0.m148007c(R$string.f18452Fb) + ": " + strM175812q);
        CharSequence text = this.f100535k.f24519c.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (text.toString().endsWith(k3d0.m148007c(R$string.f19649sh)) || text.toString().endsWith(k3d0.m148007c(R$string.f19434lj))) {
            this.f100535k.f24519c.setText(strM175812q);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m127038q() {
        if (this.f100537m == null) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.zr40
            @Override // java.lang.Runnable
            public final void run() {
                this.f205734a.m127033k();
            }
        });
        this.f100532h.setAdapter(this.f100538n);
        this.f100538n.m127050y(this.f100537m.pictures);
        this.f100532h.m4187d(this);
        this.f100533i.setIndicatorCount(this.f100537m.pictures.size());
        if (this.f100537m.pictures.size() <= 1) {
            bnl0.m105524M(this.f100533i, false);
        }
        bnl0.m105509E0(this.f100528d, new View.OnClickListener() { // from class: l.as40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73079a.m127034l(view);
            }
        });
        bnl0.m105509E0(this.f100536l, new View.OnClickListener() { // from class: l.bs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78124a.m127035m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m127039s(boolean z) {
        float f = z ? 1.5f : -1.5f;
        VPager vPager = this.f100532h;
        vPager.setPivotX(vPager.getWidth() / 2.0f);
        VPager vPager2 = this.f100532h;
        vPager2.setPivotY(vPager2.getHeight() / 2.0f);
        gt0.m132168n(this.f100532h, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public void m127040u() {
        if (NullChecker.m82486a(this.f100532h)) {
            if (this.f100532h.getCurrentItem() <= 0) {
                m127039s(false);
            } else {
                VPager vPager = this.f100532h;
                vPager.m4178T(vPager.getCurrentItem() - 1, false);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m127041v() {
        if (this.f100532h.getCurrentItem() >= this.f100538n.getCount() - 1) {
            m127039s(true);
        } else {
            VPager vPager = this.f100532h;
            vPager.m4178T(vPager.getCurrentItem() + 1, false);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
