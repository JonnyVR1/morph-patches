package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.view.CardLabelShowView3;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class dxk extends a11 {

    /* JADX INFO: renamed from: n */
    public static final int f88290n = f6c0.f95561S6;

    /* JADX INFO: renamed from: a */
    public View f88291a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f88292b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f88293c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f88294d;

    /* JADX INFO: renamed from: e */
    public VLinear f88295e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f88296f;

    /* JADX INFO: renamed from: g */
    public VImage f88297g;

    /* JADX INFO: renamed from: h */
    public VText f88298h;

    /* JADX INFO: renamed from: i */
    public VText f88299i;

    /* JADX INFO: renamed from: j */
    public VFrame f88300j;

    /* JADX INFO: renamed from: k */
    public CardLabelShowView3 f88301k;

    /* JADX INFO: renamed from: l */
    public View f88302l;

    /* JADX INFO: renamed from: m */
    public String f88303m;

    /* JADX INFO: renamed from: l.dxk$a */
    public class C16495a implements CardLabelShowView3.InterfaceC9157a {
        public C16495a() {
        }

        @Override // com.p046p1.mobile.putong.core.view.CardLabelShowView3.InterfaceC9157a
        /* JADX INFO: renamed from: a */
        public void mo59508a(int i, int i2, int i3, boolean z) {
            if (z) {
                xdl0.m208358V(dxk.this.f88302l, t100.m186890d(16.0f) + ((i2 + i) / 2));
                dxk.this.m114015j(i);
            }
        }
    }

    /* JADX INFO: renamed from: l.dxk$b */
    public class RunnableC16496b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f88305a;

        public RunnableC16496b(User user) {
            this.f88305a = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredWidth = dxk.this.f88298h.getMeasuredWidth();
            String strConcat = this.f88305a.name;
            float fMeasureText = dxk.this.f88298h.getPaint().measureText(strConcat);
            if (measuredWidth > 0 && fMeasureText > 0.0f && t100.m186890d(60.0f) + fMeasureText > measuredWidth) {
                int iRound = Math.round(((measuredWidth - t100.m186890d(60.0f)) / fMeasureText) * strConcat.length());
                strConcat = (iRound > 0 ? strConcat.substring(0, iRound - 1) : "").concat("...");
            }
            dxk.this.f88298h.setText(strConcat + "  " + this.f88305a.age);
        }
    }

    /* JADX INFO: renamed from: l.dxk$c */
    public static class C16497c extends dcl0 {

        /* JADX INFO: renamed from: a */
        public String f88307a;

        public C16497c(String str) {
            this.f88307a = str;
        }

        @Override // p149l.dcl0
        /* JADX INFO: renamed from: a */
        public a11 mo103900a(ViewGroup viewGroup) {
            return new dxk(LayoutInflater.from(viewGroup.getContext()).inflate(dxk.f88290n, viewGroup, false), this.f88307a);
        }
    }

    public dxk(@NonNull View view, String str) {
        super(view);
        m114011f(view);
        m114012g();
        this.f88303m = str;
    }

    @Override // p149l.a11
    /* JADX INFO: renamed from: a */
    public void mo94503a(User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        String str;
        RoundingParams roundingParamsM112069p = this.f88292b.getHierarchy().m112069p();
        m114014i(user, TextUtils.equals(user.f56011id, CoreModule.m29931H().userId()), z);
        if (TextUtils.equals(this.f88303m, "preview")) {
            roundingParamsM112069p.m8265s(0.0f);
            xdl0.m208374f0(this.f88295e, t100.m186890d(60.0f));
            this.f88292b.getHierarchy().m112053H(roundingParamsM112069p);
            String strM162202k = o0x.m162202k();
            if (TextUtils.isEmpty(strM162202k)) {
                qib0.f154691G.m102354Y0(this.f88292b, x2c0.f189669Qd);
            } else {
                qib0.f154691G.m102331L0(this.f88292b, strM162202k);
            }
            String strM162198g = o0x.m162198g();
            this.f88291a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM162198g) ? "#ECD3D3" : strM162198g), 16777215}));
        } else if (TextUtils.equals(this.f88303m, "profile")) {
            xdl0.m208374f0(this.f88295e, t100.m186890d(68.0f));
            roundingParamsM112069p.m8265s(0.0f);
            this.f88292b.getHierarchy().m112053H(roundingParamsM112069p);
            String strM162203l = o0x.m162203l();
            if (TextUtils.isEmpty(strM162203l)) {
                qib0.f154691G.m102354Y0(this.f88292b, x2c0.f189700Rd);
            } else {
                qib0.f154691G.m102331L0(this.f88292b, strM162203l);
            }
            String strM162198g2 = o0x.m162198g();
            this.f88291a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM162198g2) ? "#ECD3D3" : strM162198g2), 16777215}));
        } else {
            roundingParamsM112069p.m8265s(t100.m186890d(18.5f));
            xdl0.m208374f0(this.f88295e, t100.m186890d(35.0f));
            this.f88292b.getHierarchy().m112053H(roundingParamsM112069p);
            String strM162199h = o0x.m162199h();
            if (TextUtils.isEmpty(strM162199h)) {
                qib0.f154691G.m102354Y0(this.f88292b, x2c0.f189545Md);
            } else {
                qib0.f154691G.m102331L0(this.f88292b, strM162199h);
            }
            String strM162198g3 = o0x.m162198g();
            String str2 = TextUtils.isEmpty(strM162198g3) ? "#ECD3D3" : strM162198g3;
            float fM186890d = t100.m186890d(0.0f);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str2), 16777215});
            gradientDrawable.setCornerRadii(new float[]{t100.m186890d(18.5f), t100.m186890d(18.5f), t100.m186890d(18.5f), t100.m186890d(18.5f), fM186890d, fM186890d, fM186890d, fM186890d});
            this.f88291a.setBackground(gradientDrawable);
        }
        qib0.f154691G.m102331L0(this.f88296f, user.m60124fp().profileMiddle().formatted());
        this.f88298h.post(new RunnableC16496b(user));
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.m200296J(profileExtensionMarriage.expectedTime)) {
            xdl0.m208344M(this.f88299i, false);
        } else {
            String str3 = user.profile.extensions.marriage.expectedTime.get(0);
            str3.getClass();
            switch (str3) {
                case "in_one_year":
                    str = "希望一年内结婚";
                    break;
                case "at_right_time":
                    str = "时机成熟就结婚";
                    break;
                case "in_two_years":
                    str = "希望两年内结婚";
                    break;
                default:
                    str = "随缘";
                    break;
            }
            String str4 = user.isFemale() ? "她" : "他";
            this.f88299i.setText(str4 + "的结婚预期：" + str);
            this.f88299i.setTypeface(eqh0.m117752c(3), 1);
            xdl0.m208344M(this.f88299i, true);
        }
        xdl0.m208344M(this.f88297g, user.isIdAndPicBothVerified());
        List<LabelData> listM162211t = o0x.m162211t(user);
        boolean zM200296J = vwb.m200296J(listM162211t);
        CardLabelShowView3 cardLabelShowView3 = this.f88301k;
        if (zM200296J) {
            xdl0.m208344M(cardLabelShowView3, false);
            return;
        }
        xdl0.m208344M(cardLabelShowView3, true);
        String strM162200i = o0x.m162200i();
        if (!TextUtils.isEmpty(strM162200i)) {
            this.f88301k.setTagBackgroundPaintLight(Color.parseColor(strM162200i));
        }
        this.f88301k.setLabel(listM162211t);
    }

    /* JADX INFO: renamed from: f */
    public final void m114011f(View view) {
        exk.m118672a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m114012g() {
        this.f88301k.setFirstLabelShowCallback(new C16495a());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m114013h(int i) {
        if (CoreModule.f17545c.f19639e0.f149214L4.get().booleanValue()) {
            return;
        }
        C4345a c4345a = new C4345a(this.f88302l.getContext());
        c4345a.m20849D("符合你对理想伴侣的要求").m20883y(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20859N(new C4345a.d() { // from class: l.cxk
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
            /* JADX INFO: renamed from: a */
            public final void mo20887a(View view) {
                CoreModule.f17545c.f19639e0.f149214L4.put(Boolean.TRUE);
            }
        }).m20880v(t100.m186890d(24.0f) + i).m20875q(C4345a.f15684R | C4345a.f15683Q);
        C4348d.m20896l().m20909u(c4345a, this.f88302l, "marry_label_tips");
    }

    /* JADX INFO: renamed from: i */
    public final void m114014i(User user, boolean z, boolean z2) {
        xdl0.m208344M(this.f88293c, false);
        xdl0.m208344M(this.f88294d, false);
        if (z || !z2) {
            return;
        }
        if (CoreModule.f17545c.f19588N0.m31967k3(user, 5)) {
            xdl0.m208344M(this.f88293c, true);
        }
        if (NullChecker.m81303a(user.location)) {
            Location location = user.location;
            if ((location.isHideInfo() && location.isHideRegionCountry()) || user.isHideLocationFromSVip()) {
                return;
            }
            User userMe_ = CoreModule.m29932K().me_();
            if (location.distance >= 10000) {
                if (TextUtils.equals(userMe_.location.region.city, location.region.city)) {
                    xdl0.m208344M(this.f88294d, true);
                    this.f88294d.setText("同城");
                    this.f88294d.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189576Nd, 0, 0, 0);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("距你");
            int i = location.distance;
            if (i > 1000) {
                sb.append(i / 1000);
                int i2 = (location.distance / 100) % 10;
                if (i2 > 0) {
                    sb.append(".");
                    sb.append(i2);
                }
                sb.append("km");
            } else if (i == 1000) {
                sb.append("1km");
            } else {
                if (i <= 100) {
                    i = 100;
                }
                sb.append(i);
                sb.append(App.f15369e.getString(R$string.f17338J0));
            }
            xdl0.m208344M(this.f88294d, true);
            this.f88294d.setText(sb.toString());
            this.f88294d.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189463Jo, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m114015j(final int i) {
        if (CoreModule.f17545c.f19639e0.f149214L4.get().booleanValue()) {
            return;
        }
        C4348d.m20896l().m20900k("marry_label_tips");
        this.f88302l.postDelayed(new Runnable() { // from class: l.bxk
            @Override // java.lang.Runnable
            public final void run() {
                this.f77799a.m114013h(i);
            }
        }, 500L);
    }
}
