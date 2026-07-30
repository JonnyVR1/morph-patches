package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.nightclub.view.NightClubUserDetailAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfilePictureItemView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import p147v.AutoVDraweeView;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rj40 implements ViewPager.InterfaceC0716j, s7m<kj40> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f159630a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f159631b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f159632c;

    /* JADX INFO: renamed from: d */
    public ImageView f159633d;

    /* JADX INFO: renamed from: e */
    public TextView f159634e;

    /* JADX INFO: renamed from: f */
    public VText f159635f;

    /* JADX INFO: renamed from: g */
    public View f159636g;

    /* JADX INFO: renamed from: h */
    public VPager f159637h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f159638i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f159639j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f159640k;

    /* JADX INFO: renamed from: l */
    public VText f159641l;

    /* JADX INFO: renamed from: m */
    public User f159642m;

    /* JADX INFO: renamed from: n */
    public final C19710a f159643n = new C19710a();

    /* JADX INFO: renamed from: o */
    public final NightClubUserDetailAct f159644o;

    /* JADX INFO: renamed from: p */
    public kj40 f159645p;

    /* JADX INFO: renamed from: l.rj40$a */
    public class C19710a extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f159646e;

        /* JADX INFO: renamed from: f */
        public List<Media> f159647f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public Stack<View> f159648g = new Stack<>();

        /* JADX INFO: renamed from: h */
        public int f159649h = -1;

        /* JADX INFO: renamed from: i */
        public int f159650i = 0;

        public C19710a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m179572v(View view) {
            rj40.this.m179568u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m179573w(View view) {
            rj40.this.m179569v();
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f159647f.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            int i = this.f159650i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f159650i = i - 1;
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            this.f159646e = true;
            if (i == rj40.this.f159637h.getCurrentItem()) {
                dbl0.m110646a(rj40.this.f159637h, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f159648g.add((PictureView) obj);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            PictureView pictureView = !this.f159648g.isEmpty() ? (PictureView) this.f159648g.pop() : (PictureView) rj40.this.getAct().inflater().inflate(f6c0.f96120ze, viewGroup, false);
            pictureView.f28032A.setVisibility(8);
            pictureView.f28033B.setVisibility(8);
            pictureView.m44004j0(true, false);
            if (NullChecker.m81303a(pictureView.f28070a.getHierarchy())) {
                pictureView.f28070a.getHierarchy().m112046A(rj40.this.getAct().getResources().getDrawable(x2c0.f189756T7));
                pictureView.f28070a.getHierarchy().m112050E(rj40.this.getAct().getResources().getDrawable(x2c0.f189756T7));
            }
            pictureView.m43982J(true, false);
            pictureView.setAspectRateFitWidth(0.8f);
            pictureView.f28070a.getHierarchy().m112076w(ftd0.f99185i);
            m179577x(pictureView, this.f159647f.get(i), 100);
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = o7r.m163037a(rj40.this.getAct()).inflate(f6c0.f95912n9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            xdl0.m208368c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(u4c0.f174185c);
            View viewFindViewById2 = viewInflate.findViewById(u4c0.f174202d);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.pj40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149713a.m179572v(view);
                }
            });
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.qj40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154877a.m179573w(view);
                }
            });
            return pictureView;
        }

        /* JADX INFO: renamed from: s */
        public View m179574s(int i) {
            View viewM179575t = m179575t(i);
            return (NullChecker.m81303a(viewM179575t) && (viewM179575t instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM179575t).f33042b : viewM179575t;
        }

        /* JADX INFO: renamed from: t */
        public View m179575t(int i) {
            if (rj40.this.f159637h == null) {
                return null;
            }
            for (int i2 = 0; i2 < rj40.this.f159637h.getChildCount(); i2++) {
                Object tag = rj40.this.f159637h.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return rj40.this.f159637h.getChildAt(i2);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: u */
        public int m179576u() {
            return rj40.this.f159637h.getCurrentItem();
        }

        /* JADX INFO: renamed from: x */
        public void m179577x(PictureView pictureView, Media media, int i) {
            pictureView.m43994Y(media, i);
        }

        /* JADX INFO: renamed from: y */
        public void m179578y(List<Media> list) {
            if (list.equals(this.f159647f) && !this.f159646e) {
                m179579z(rj40.this.f159642m, m179576u());
                return;
            }
            this.f159646e = false;
            this.f159650i = getCount();
            this.f159647f = list;
            rj40.this.f159643n.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: z */
        public void m179579z(User user, int i) {
            if (!NullChecker.m81303a(user) || i >= user.pictures.size() || this.f159649h == i) {
                return;
            }
            this.f159649h = i;
        }
    }

    public rj40(NightClubUserDetailAct nightClubUserDetailAct) {
        this.f159644o = nightClubUserDetailAct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m179555d(boolean z, j760 j760Var) {
        Priority priority;
        F f = j760Var.f116564a;
        String str = (!(f instanceof Video) || z) ? "profile" : "";
        Picture.ImageUri imageUriM220207f = zub.m220207f((Media) f);
        bkb0 bkb0Var = qib0.f154691G;
        if (((Integer) j760Var.f116565b).intValue() == 0) {
            priority = Priority.HIGH;
        } else {
            priority = ((Integer) j760Var.f116565b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
        }
        bkb0Var.m102376w0(imageUriM220207f, priority, str);
    }

    /* JADX INFO: renamed from: A3 */
    public void m179558A3(String str) {
        if (TextUtils.isEmpty(str)) {
            getAct().lambda$debugItems$19();
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        this.f159642m = userM169430Pa;
        if (userM169430Pa == null) {
            getAct().lambda$debugItems$19();
            return;
        }
        xdl0.m208360X(this.f159633d, t100.f167261j + xdl0.m208331F0());
        xdl0.m208360X(this.f159634e, t100.m186890d(44.0f) + xdl0.m208331F0());
        m179566q();
        this.f159639j.m38899r();
        this.f159639j.m38898q(this.f159642m, -1, false, false);
        this.f159640k.m39123W(this.f159642m, -1, true);
        m179565p();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f159644o;
    }

    /* JADX INFO: renamed from: i */
    public View m179559i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sj40.m184418b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m179559i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kj40 kj40Var) {
        this.f159645p = kj40Var;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m179561k() {
        m179564n(this.f159642m, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m179562l(View view) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m179563m(View view) {
        zvf0.m220396r("e_intl_mkt_twclub_profile_like", this.f159644o.pageId());
        if (myf.m157033M(CoreModule.f17545c.f19639e0.m169527p9())) {
            osi0.m165782f(R$string.f18821pc);
            return;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (NullChecker.m81303a(counterM31484o3) && NullChecker.m81303a(counterM31484o3.likeLimit)) {
            CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
            if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0) {
                C8764c.m53403J1(this.f159644o, "p_intl_mkt_twclub_profile,e_intl_mkt_twclub_profile_like,click", Privilege.vip_unlimited_likes);
                return;
            }
        }
        kj40 kj40Var = this.f159645p;
        if (kj40Var != null) {
            kj40Var.m146177j0(this.f159642m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m179564n(User user, final boolean z) {
        if (ConnectivityReceiver.m81286i()) {
            vwb.m200354z(vwb.m200344p0(user.pictures), new e30() { // from class: l.oj40
                @Override // p149l.e30
                public final void call(Object obj) {
                    rj40.m179555d(z, (j760) obj);
                }
            });
        } else {
            qib0.f154691G.m102376w0(zub.m220207f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        dbl0.m110646a(this.f159637h, false);
        this.f159638i.m36955b(i);
        View viewM179574s = this.f159643n.m179574s(i);
        if ((viewM179574s instanceof PictureView) && xij0.m209661d0() && this.f159644o.lifecycle_() == C4319c.f15548i) {
            ((PictureView) viewM179574s).m43991V();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: p */
    public final void m179565p() {
        String strM133877q;
        Location location = this.f159642m.location;
        if (location.distance < 1000) {
            strM133877q = Math.max(location.distance, 5) + App.f15369e.getString(com.p046p1.mobile.putong.common.R$string.f17338J0);
        } else {
            strM133877q = i0g0.m133877q(location, false);
        }
        this.f159635f.setText(hvc0.m133156c(R$string.f18850qb) + ": " + strM133877q);
        CharSequence text = this.f159640k.f23777c.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (text.toString().endsWith(hvc0.m133156c(R$string.f18273Xg)) || text.toString().endsWith(hvc0.m133156c(R$string.f18035Pi))) {
            this.f159640k.f23777c.setText(strM133877q);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m179566q() {
        if (this.f159642m == null) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.lj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f128283a.m179561k();
            }
        });
        this.f159637h.setAdapter(this.f159643n);
        this.f159643n.m179578y(this.f159642m.pictures);
        this.f159637h.m4185d(this);
        this.f159638i.setIndicatorCount(this.f159642m.pictures.size());
        if (this.f159642m.pictures.size() <= 1) {
            xdl0.m208344M(this.f159638i, false);
        }
        xdl0.m208329E0(this.f159633d, new View.OnClickListener() { // from class: l.mj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134101a.m179562l(view);
            }
        });
        xdl0.m208329E0(this.f159641l, new View.OnClickListener() { // from class: l.nj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139212a.m179563m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m179567s(boolean z) {
        float f = z ? 1.5f : -1.5f;
        VPager vPager = this.f159637h;
        vPager.setPivotX(vPager.getWidth() / 2.0f);
        VPager vPager2 = this.f159637h;
        vPager2.setPivotY(vPager2.getHeight() / 2.0f);
        bt0.m103741n(this.f159637h, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: u */
    public void m179568u() {
        if (NullChecker.m81303a(this.f159637h)) {
            if (this.f159637h.getCurrentItem() <= 0) {
                m179567s(false);
            } else {
                VPager vPager = this.f159637h;
                vPager.m4176T(vPager.getCurrentItem() - 1, false);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m179569v() {
        if (this.f159637h.getCurrentItem() >= this.f159643n.getCount() - 1) {
            m179567s(true);
        } else {
            VPager vPager = this.f159637h;
            vPager.m4176T(vPager.getCurrentItem() + 1, false);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
