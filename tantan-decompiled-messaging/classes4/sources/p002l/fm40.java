package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.match.a;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.d30;
import l.e30;
import l.fap;
import l.gm40;
import l.mep0;
import l.mqi0;
import l.nkp;
import l.o6j0;
import l.qj20;
import l.t100;
import l.tpd0;
import l.u59;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fm40 extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f10464e;

    /* JADX INFO: renamed from: f */
    public View f10465f;

    /* JADX INFO: renamed from: g */
    public VLinear f10466g;

    /* JADX INFO: renamed from: h */
    public VLinear f10467h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f10468i;

    /* JADX INFO: renamed from: j */
    public VImage f10469j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f10470k;

    /* JADX INFO: renamed from: l */
    public VImage f10471l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f10472m;

    /* JADX INFO: renamed from: n */
    public VImage f10473n;

    /* JADX INFO: renamed from: o */
    public VLinear f10474o;

    /* JADX INFO: renamed from: p */
    public VText_Medium f10475p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f10476q;

    /* JADX INFO: renamed from: r */
    public VImage f10477r;

    /* JADX INFO: renamed from: s */
    public Integer f10478s;

    /* JADX INFO: renamed from: l.fm40$a */
    public class RunnableC0573a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vi90 f10479a;

        public RunnableC0573a(vi90 vi90Var) {
            this.f10479a = vi90Var;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m13311b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m13312c(vi90 vi90Var, int[] iArr) {
            int iY0 = xdl0.y0() - t100.d(60.0f);
            if (fap.y() || u59.U()) {
                int[] iArr2 = new int[2];
                fm40.this.f10471l.getLocationOnScreen(iArr2);
                iY0 = ((iArr2[0] + t100.d(38.0f)) * 2) - t100.d(20.0f);
            }
            mep0.b1((ViewGroup) vi90Var.m23979a().getWindow().getDecorView().getRootView(), fm40.this.f10471l, vi90Var.m23979a().drawable(x2c0.e), vi90Var.m23979a().string(R.string.zk), -1, 14, 17, 3000, 0, 0, 0, 0, iY0, 17, 0, false, new d30() { // from class: l.em40
                public final void call() {
                    fm40.RunnableC0573a.m13311b();
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            VImage vImage = fm40.this.f10471l;
            final vi90 vi90Var = this.f10479a;
            xdl0.Q0(vImage, new e30() { // from class: l.dm40
                public final void call(Object obj) {
                    this.f9330a.m13312c(vi90Var, (int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.fm40$b */
    public static /* synthetic */ class C0574b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10481a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10482b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f10482b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10482b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10482b[LayoutDesc.ComboType.SuperLike.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Match.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Like_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10482b[LayoutDesc.ComboType.Dislike_Like_SuperLike.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f10481a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10481a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10481a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10481a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10481a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public fm40(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
        this.f10478s = Integer.valueOf(t100.o);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: c */
    public View mo13303c() {
        return this.f10465f;
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f12033b.m2923a());
        int i = C0574b.f10481a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m2927b(this.f10472m);
        }
        if (i == 2) {
            return profileButton.m2927b(this.f10468i);
        }
        if (i == 3) {
            return profileButton.m2927b(this.f10470k);
        }
        if (i == 4) {
            return profileButton.m2927b(this.f10474o);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m2927b(this.f10476q);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo13304f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return profileButtonType == ProfileButton.ProfileButtonType.SuperLike ? new ProfileButton(profileButtonType, this.f12033b.m2923a()).m2927b(this.f10470k) : super.mo13304f(profileButtonType, comboType);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: g */
    public View mo12176g() {
        return m13305n(LayoutInflater.from(this.f12034c), null);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        super.mo12177h(view);
        m14367b(this.f10472m);
        m14367b(this.f10468i);
        m14367b(this.f10470k);
        m14367b(this.f10476q);
        m13306o();
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: j */
    public void mo12178j(LayoutDesc layoutDesc) {
        this.f10475p.setText(App.e.getString(R.string.Xf));
        switch (C0574b.f10482b[layoutDesc.m2923a().ordinal()]) {
            case 1:
                xdl0.M(this.f10468i, true);
                xdl0.M(this.f10470k, true);
                xdl0.M(this.f10472m, true);
                xdl0.M(this.f10474o, true);
                xdl0.M(this.f10476q, false);
                xdl0.W(this.f10468i, this.f10478s.intValue());
                xdl0.W(this.f10470k, this.f10478s.intValue());
                xdl0.W(this.f10472m, this.f10478s.intValue());
                break;
            case 2:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, true);
                xdl0.M(this.f10472m, true);
                xdl0.M(this.f10474o, true);
                xdl0.M(this.f10476q, false);
                xdl0.W(this.f10470k, this.f10478s.intValue());
                xdl0.W(this.f10472m, this.f10478s.intValue());
                break;
            case 3:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, true);
                xdl0.M(this.f10472m, false);
                xdl0.M(this.f10474o, true);
                xdl0.M(this.f10476q, false);
                this.f10475p.setText(App.e.getString(R.string.wg));
                xdl0.W(this.f10470k, this.f10478s.intValue());
                break;
            case 4:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, true);
                xdl0.M(this.f10472m, false);
                xdl0.M(this.f10474o, false);
                xdl0.M(this.f10476q, false);
                xdl0.W(this.f10470k, 0);
                break;
            case 5:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, false);
                xdl0.M(this.f10472m, false);
                xdl0.M(this.f10474o, true);
                xdl0.M(this.f10476q, false);
                this.f10475p.setText(App.e.getString(R.string.wg));
                break;
            case 6:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, false);
                xdl0.M(this.f10472m, false);
                xdl0.M(this.f10474o, false);
                xdl0.M(this.f10476q, true);
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, false);
                xdl0.M(this.f10472m, true);
                xdl0.M(this.f10474o, false);
                xdl0.M(this.f10476q, false);
                xdl0.W(this.f10472m, 0);
                break;
            case ExpLoopInputType.GAME_NAME /* 8 */:
                xdl0.M(this.f10468i, false);
                xdl0.M(this.f10470k, false);
                xdl0.M(this.f10472m, false);
                xdl0.M(this.f10474o, false);
                xdl0.M(this.f10476q, false);
                break;
            case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                xdl0.M(this.f10468i, true);
                xdl0.M(this.f10470k, true);
                xdl0.M(this.f10472m, true);
                xdl0.M(this.f10474o, false);
                xdl0.M(this.f10476q, false);
                xdl0.W(this.f10468i, this.f10478s.intValue());
                xdl0.W(this.f10470k, this.f10478s.intValue());
                xdl0.W(this.f10472m, 0);
                break;
        }
        m13308q();
    }

    /* JADX INFO: renamed from: n */
    public View m13305n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gm40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final void m13306o() {
        if (IntlCountryCodeController.v()) {
            this.f10473n.setImageDrawable(this.f10469j.getContext().getDrawable(x2c0.Sr));
            this.f10471l.setImageDrawable(this.f12034c.getDrawable(x2c0.Tr));
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m13307p() {
        a.w().T(this.f10474o.getContext(), this.f10464e, this.f10474o, 3000);
    }

    /* JADX INFO: renamed from: q */
    public final void m13308q() {
        VLinear vLinear = this.f10474o;
        if (vLinear != null && xdl0.O0(vLinear) && a.w().N()) {
            a.w().a = true;
            this.f10474o.post(new Runnable() { // from class: l.cm40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8742a.m13307p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m13309r(vi90 vi90Var) {
        User userNa;
        User user;
        try {
            VImage vImage = this.f10471l;
            if (vImage != null && xdl0.O0(vImage) && (userNa = CoreModule.c.e0.na()) != null && TEnum.equals(userNa.gender, "male") && (user = vi90Var.f21137a) != null && TEnum.equals(user.gender, "female") && vi90Var.f21137a.popLevel > 0.675d && nkp.e() && !a.w().N() && !a.w().a) {
                if (!mqi0.D(((Long) qj20.j.get()).longValue())) {
                    qj20.i.put(0);
                    qj20.j.put(Long.valueOf(mqi0.o()));
                }
                if (((Integer) qj20.i.get()).intValue() >= 3) {
                    return;
                }
                tpd0 tpd0Var = qj20.i;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
                o6j0.h("e_superlike_usage_guide", "p_suggest_user_profile_info_view", new o6j0.a[0]);
                this.f10471l.post(new RunnableC0573a(vi90Var));
            }
        } catch (Exception unused) {
        }
    }
}
