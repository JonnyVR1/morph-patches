package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class tu40 extends lp90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f176144e;

    /* JADX INFO: renamed from: f */
    public View f176145f;

    /* JADX INFO: renamed from: g */
    public VLinear f176146g;

    /* JADX INFO: renamed from: h */
    public VLinear f176147h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f176148i;

    /* JADX INFO: renamed from: j */
    public VImage f176149j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f176150k;

    /* JADX INFO: renamed from: l */
    public VImage f176151l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f176152m;

    /* JADX INFO: renamed from: n */
    public VImage f176153n;

    /* JADX INFO: renamed from: o */
    public VLinear f176154o;

    /* JADX INFO: renamed from: p */
    public VText_Medium f176155p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f176156q;

    /* JADX INFO: renamed from: r */
    public VImage f176157r;

    /* JADX INFO: renamed from: s */
    public Integer f176158s;

    /* JADX INFO: renamed from: l.tu40$a */
    public class RunnableC20403a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zq90 f176159a;

        public RunnableC20403a(zq90 zq90Var) {
            this.f176159a = zq90Var;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m192735b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m192736c(zq90 zq90Var, int[] iArr) {
            int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(60.0f);
            if (fcp.m125033y() || d79.m114663V()) {
                int[] iArr2 = new int[2];
                tu40.this.f176151l.getLocationOnScreen(iArr2);
                iM105592y0 = ((iArr2[0] + qa00.m175859d(38.0f)) * 2) - qa00.m175859d(20.0f);
            }
            qnp0.m177259b1((ViewGroup) zq90Var.m220974a().getWindow().getDecorView().getRootView(), tu40.this.f176151l, zq90Var.m220974a().drawable(dbc0.f86972f), zq90Var.m220974a().string(R$string.f18947Vk), -1, 14, 17, 3000, 0, 0, 0, 0, iM105592y0, 17, 0, false, new x20() { // from class: l.su40
                @Override // p153l.x20
                public final void call() {
                    tu40.RunnableC20403a.m192735b();
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            VImage vImage = tu40.this.f176151l;
            final zq90 zq90Var = this.f176159a;
            bnl0.m105533Q0(vImage, new y20() { // from class: l.ru40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164898a.m192736c(zq90Var, (int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.tu40$b */
    public static /* synthetic */ class C20404b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176161a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f176162b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f176162b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f176162b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f176162b[LayoutDesc.ComboType.SuperLike.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Match.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Like_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f176162b[LayoutDesc.ComboType.Dislike_Like_SuperLike.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f176161a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f176161a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f176161a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f176161a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f176161a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public tu40(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
        this.f176158s = Integer.valueOf(qa00.f156328o);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: c */
    public View mo155165c() {
        return this.f176145f;
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f133028b.m53572a());
        int i = C20404b.f176161a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m53576b(this.f176152m);
        }
        if (i == 2) {
            return profileButton.m53576b(this.f176148i);
        }
        if (i == 3) {
            return profileButton.m53576b(this.f176150k);
        }
        if (i == 4) {
            return profileButton.m53576b(this.f176154o);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m53576b(this.f176156q);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo155167f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return profileButtonType == ProfileButton.ProfileButtonType.SuperLike ? new ProfileButton(profileButtonType, this.f133028b.m53572a()).m53576b(this.f176150k) : super.mo155167f(profileButtonType, comboType);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return m192729n(LayoutInflater.from(this.f133029c), null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        super.mo112046h(view);
        m155164b(this.f176152m);
        m155164b(this.f176148i);
        m155164b(this.f176150k);
        m155164b(this.f176156q);
        m192730o();
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
        this.f176155p.setText(App.f16088e.getString(R$string.f19586qg));
        switch (C20404b.f176162b[layoutDesc.m53572a().ordinal()]) {
            case 1:
                bnl0.m105524M(this.f176148i, true);
                bnl0.m105524M(this.f176150k, true);
                bnl0.m105524M(this.f176152m, true);
                bnl0.m105524M(this.f176154o, true);
                bnl0.m105524M(this.f176156q, false);
                bnl0.m105539W(this.f176148i, this.f176158s.intValue());
                bnl0.m105539W(this.f176150k, this.f176158s.intValue());
                bnl0.m105539W(this.f176152m, this.f176158s.intValue());
                break;
            case 2:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, true);
                bnl0.m105524M(this.f176152m, true);
                bnl0.m105524M(this.f176154o, true);
                bnl0.m105524M(this.f176156q, false);
                bnl0.m105539W(this.f176150k, this.f176158s.intValue());
                bnl0.m105539W(this.f176152m, this.f176158s.intValue());
                break;
            case 3:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, true);
                bnl0.m105524M(this.f176152m, false);
                bnl0.m105524M(this.f176154o, true);
                bnl0.m105524M(this.f176156q, false);
                this.f176155p.setText(App.f16088e.getString(R$string.f18763Pg));
                bnl0.m105539W(this.f176150k, this.f176158s.intValue());
                break;
            case 4:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, true);
                bnl0.m105524M(this.f176152m, false);
                bnl0.m105524M(this.f176154o, false);
                bnl0.m105524M(this.f176156q, false);
                bnl0.m105539W(this.f176150k, 0);
                break;
            case 5:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, false);
                bnl0.m105524M(this.f176152m, false);
                bnl0.m105524M(this.f176154o, true);
                bnl0.m105524M(this.f176156q, false);
                this.f176155p.setText(App.f16088e.getString(R$string.f18763Pg));
                break;
            case 6:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, false);
                bnl0.m105524M(this.f176152m, false);
                bnl0.m105524M(this.f176154o, false);
                bnl0.m105524M(this.f176156q, true);
                break;
            case 7:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, false);
                bnl0.m105524M(this.f176152m, true);
                bnl0.m105524M(this.f176154o, false);
                bnl0.m105524M(this.f176156q, false);
                bnl0.m105539W(this.f176152m, 0);
                break;
            case 8:
                bnl0.m105524M(this.f176148i, false);
                bnl0.m105524M(this.f176150k, false);
                bnl0.m105524M(this.f176152m, false);
                bnl0.m105524M(this.f176154o, false);
                bnl0.m105524M(this.f176156q, false);
                break;
            case 9:
                bnl0.m105524M(this.f176148i, true);
                bnl0.m105524M(this.f176150k, true);
                bnl0.m105524M(this.f176152m, true);
                bnl0.m105524M(this.f176154o, false);
                bnl0.m105524M(this.f176156q, false);
                bnl0.m105539W(this.f176148i, this.f176158s.intValue());
                bnl0.m105539W(this.f176150k, this.f176158s.intValue());
                bnl0.m105539W(this.f176152m, 0);
                break;
        }
        m192732q();
    }

    /* JADX INFO: renamed from: n */
    public View m192729n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uu40.m198150b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final void m192730o() {
        if (IntlCountryCodeController.m29125v()) {
            this.f176153n.setImageDrawable(this.f176149j.getContext().getDrawable(dbc0.f86197Gs));
            this.f176151l.setImageDrawable(this.f133029c.getDrawable(dbc0.f86229Hs));
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m192731p() {
        C8618a.m48771w().m48790T(this.f176154o.getContext(), this.f176144e, this.f176154o, 3000);
    }

    /* JADX INFO: renamed from: q */
    public final void m192732q() {
        VLinear vLinear = this.f176154o;
        if (vLinear != null && bnl0.m105529O0(vLinear) && C8618a.m48771w().m48785N()) {
            C8618a.m48771w().f31323a = true;
            this.f176154o.post(new Runnable() { // from class: l.qu40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159519a.m192731p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m192733r(zq90 zq90Var) {
        User userM116593na;
        User user;
        try {
            VImage vImage = this.f176151l;
            if (vImage != null && bnl0.m105529O0(vImage) && (userM116593na = CoreModule.f18264c.f20381e0.m116593na()) != null && TEnum.equals(userM116593na.gender, "male") && (user = zq90Var.f205576a) != null && TEnum.equals(user.gender, "female") && zq90Var.f205576a.popLevel > 0.675d && nmp.m163836e() && !C8618a.m48771w().m48785N() && !C8618a.m48771w().f31323a) {
                if (!pzi0.m174439D(as20.f73025j.get().longValue())) {
                    as20.f73024i.put(0);
                    as20.f73025j.put(Long.valueOf(pzi0.m174454o()));
                }
                if (as20.f73024i.get().intValue() >= 3) {
                    return;
                }
                vxd0 vxd0Var = as20.f73024i;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
                sfj0.m185601h("e_superlike_usage_guide", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
                this.f176151l.post(new RunnableC20403a(zq90Var));
            }
        } catch (Exception unused) {
        }
    }
}
