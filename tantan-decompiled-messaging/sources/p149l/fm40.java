package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class fm40 extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f98252e;

    /* JADX INFO: renamed from: f */
    public View f98253f;

    /* JADX INFO: renamed from: g */
    public VLinear f98254g;

    /* JADX INFO: renamed from: h */
    public VLinear f98255h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f98256i;

    /* JADX INFO: renamed from: j */
    public VImage f98257j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f98258k;

    /* JADX INFO: renamed from: l */
    public VImage f98259l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f98260m;

    /* JADX INFO: renamed from: n */
    public VImage f98261n;

    /* JADX INFO: renamed from: o */
    public VLinear f98262o;

    /* JADX INFO: renamed from: p */
    public VText_Medium f98263p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f98264q;

    /* JADX INFO: renamed from: r */
    public VImage f98265r;

    /* JADX INFO: renamed from: s */
    public Integer f98266s;

    /* JADX INFO: renamed from: l.fm40$a */
    public class RunnableC16878a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vi90 f98267a;

        public RunnableC16878a(vi90 vi90Var) {
            this.f98267a = vi90Var;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m122162b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m122163c(vi90 vi90Var, int[] iArr) {
            int iM208412y0 = xdl0.m208412y0() - t100.m186890d(60.0f);
            if (fap.m120266y() || u59.m191812U()) {
                int[] iArr2 = new int[2];
                fm40.this.f98259l.getLocationOnScreen(iArr2);
                iM208412y0 = ((iArr2[0] + t100.m186890d(38.0f)) * 2) - t100.m186890d(20.0f);
            }
            mep0.m154300b1((ViewGroup) vi90Var.m198526a().getWindow().getDecorView().getRootView(), fm40.this.f98259l, vi90Var.m198526a().drawable(x2c0.f190092e), vi90Var.m198526a().string(R$string.f19129zk), -1, 14, 17, 3000, 0, 0, 0, 0, iM208412y0, 17, 0, false, new d30() { // from class: l.em40
                @Override // p149l.d30
                public final void call() {
                    fm40.RunnableC16878a.m122162b();
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            VImage vImage = fm40.this.f98259l;
            final vi90 vi90Var = this.f98267a;
            xdl0.m208353Q0(vImage, new e30() { // from class: l.dm40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86900a.m122163c(vi90Var, (int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.fm40$b */
    public static /* synthetic */ class C16879b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98269a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f98270b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f98270b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98270b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98270b[LayoutDesc.ComboType.SuperLike.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Match.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Like_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f98270b[LayoutDesc.ComboType.Dislike_Like_SuperLike.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f98269a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f98269a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f98269a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f98269a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f98269a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public fm40(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
        this.f98266s = Integer.valueOf(t100.f167266o);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: c */
    public View mo122154c() {
        return this.f98253f;
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f107690b.m52389a());
        int i = C16879b.f98269a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m52393b(this.f98260m);
        }
        if (i == 2) {
            return profileButton.m52393b(this.f98256i);
        }
        if (i == 3) {
            return profileButton.m52393b(this.f98258k);
        }
        if (i == 4) {
            return profileButton.m52393b(this.f98262o);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m52393b(this.f98264q);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo122155f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return profileButtonType == ProfileButton.ProfileButtonType.SuperLike ? new ProfileButton(profileButtonType, this.f107690b.m52389a()).m52393b(this.f98258k) : super.mo122155f(profileButtonType, comboType);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: g */
    public View mo114663g() {
        return m122156n(LayoutInflater.from(this.f107691c), null);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        super.mo114664h(view);
        m130941b(this.f98260m);
        m130941b(this.f98256i);
        m130941b(this.f98258k);
        m130941b(this.f98264q);
        m122157o();
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: j */
    public void mo114665j(LayoutDesc layoutDesc) {
        this.f98263p.setText(App.f15369e.getString(R$string.f18272Xf));
        switch (C16879b.f98270b[layoutDesc.m52389a().ordinal()]) {
            case 1:
                xdl0.m208344M(this.f98256i, true);
                xdl0.m208344M(this.f98258k, true);
                xdl0.m208344M(this.f98260m, true);
                xdl0.m208344M(this.f98262o, true);
                xdl0.m208344M(this.f98264q, false);
                xdl0.m208359W(this.f98256i, this.f98266s.intValue());
                xdl0.m208359W(this.f98258k, this.f98266s.intValue());
                xdl0.m208359W(this.f98260m, this.f98266s.intValue());
                break;
            case 2:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, true);
                xdl0.m208344M(this.f98260m, true);
                xdl0.m208344M(this.f98262o, true);
                xdl0.m208344M(this.f98264q, false);
                xdl0.m208359W(this.f98258k, this.f98266s.intValue());
                xdl0.m208359W(this.f98260m, this.f98266s.intValue());
                break;
            case 3:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, true);
                xdl0.m208344M(this.f98260m, false);
                xdl0.m208344M(this.f98262o, true);
                xdl0.m208344M(this.f98264q, false);
                this.f98263p.setText(App.f15369e.getString(R$string.f19035wg));
                xdl0.m208359W(this.f98258k, this.f98266s.intValue());
                break;
            case 4:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, true);
                xdl0.m208344M(this.f98260m, false);
                xdl0.m208344M(this.f98262o, false);
                xdl0.m208344M(this.f98264q, false);
                xdl0.m208359W(this.f98258k, 0);
                break;
            case 5:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, false);
                xdl0.m208344M(this.f98260m, false);
                xdl0.m208344M(this.f98262o, true);
                xdl0.m208344M(this.f98264q, false);
                this.f98263p.setText(App.f15369e.getString(R$string.f19035wg));
                break;
            case 6:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, false);
                xdl0.m208344M(this.f98260m, false);
                xdl0.m208344M(this.f98262o, false);
                xdl0.m208344M(this.f98264q, true);
                break;
            case 7:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, false);
                xdl0.m208344M(this.f98260m, true);
                xdl0.m208344M(this.f98262o, false);
                xdl0.m208344M(this.f98264q, false);
                xdl0.m208359W(this.f98260m, 0);
                break;
            case 8:
                xdl0.m208344M(this.f98256i, false);
                xdl0.m208344M(this.f98258k, false);
                xdl0.m208344M(this.f98260m, false);
                xdl0.m208344M(this.f98262o, false);
                xdl0.m208344M(this.f98264q, false);
                break;
            case 9:
                xdl0.m208344M(this.f98256i, true);
                xdl0.m208344M(this.f98258k, true);
                xdl0.m208344M(this.f98260m, true);
                xdl0.m208344M(this.f98262o, false);
                xdl0.m208344M(this.f98264q, false);
                xdl0.m208359W(this.f98256i, this.f98266s.intValue());
                xdl0.m208359W(this.f98258k, this.f98266s.intValue());
                xdl0.m208359W(this.f98260m, 0);
                break;
        }
        m122159q();
    }

    /* JADX INFO: renamed from: n */
    public View m122156n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gm40.m126930b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final void m122157o() {
        if (IntlCountryCodeController.m28126v()) {
            this.f98261n.setImageDrawable(this.f98257j.getContext().getDrawable(x2c0.f189745Sr));
            this.f98259l.setImageDrawable(this.f107691c.getDrawable(x2c0.f189776Tr));
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m122158p() {
        C8455a.m47588w().m47607T(this.f98262o.getContext(), this.f98252e, this.f98262o, 3000);
    }

    /* JADX INFO: renamed from: q */
    public final void m122159q() {
        VLinear vLinear = this.f98262o;
        if (vLinear != null && xdl0.m208349O0(vLinear) && C8455a.m47588w().m47602N()) {
            C8455a.m47588w().f30475a = true;
            this.f98262o.post(new Runnable() { // from class: l.cm40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81510a.m122158p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public void m122160r(vi90 vi90Var) {
        User userM169520na;
        User user;
        try {
            VImage vImage = this.f98259l;
            if (vImage != null && xdl0.m208349O0(vImage) && (userM169520na = CoreModule.f17545c.f19639e0.m169520na()) != null && TEnum.equals(userM169520na.gender, "male") && (user = vi90Var.f181561a) != null && TEnum.equals(user.gender, "female") && vi90Var.f181561a.popLevel > 0.675d && nkp.m159986e() && !C8455a.m47588w().m47602N() && !C8455a.m47588w().f30475a) {
                if (!mqi0.m155929D(qj20.f154833j.get().longValue())) {
                    qj20.f154832i.put(0);
                    qj20.f154833j.put(Long.valueOf(mqi0.m155944o()));
                }
                if (qj20.f154832i.get().intValue() >= 3) {
                    return;
                }
                tpd0 tpd0Var = qj20.f154832i;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
                o6j0.m162864h("e_superlike_usage_guide", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
                this.f98259l.post(new RunnableC16878a(vi90Var));
            }
        } catch (Exception unused) {
        }
    }
}
