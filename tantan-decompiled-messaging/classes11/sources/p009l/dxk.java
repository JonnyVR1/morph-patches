package p009l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.view.CardLabelShowView3;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a11;
import l.dcl0;
import l.eqh0;
import l.exk;
import l.f6c0;
import l.qib0;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dxk extends a11 {

    /* JADX INFO: renamed from: n */
    public static final int f12021n = f6c0.S6;

    /* JADX INFO: renamed from: a */
    public View f12022a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f12023b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f12024c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f12025d;

    /* JADX INFO: renamed from: e */
    public VLinear f12026e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f12027f;

    /* JADX INFO: renamed from: g */
    public VImage f12028g;

    /* JADX INFO: renamed from: h */
    public VText f12029h;

    /* JADX INFO: renamed from: i */
    public VText f12030i;

    /* JADX INFO: renamed from: j */
    public VFrame f12031j;

    /* JADX INFO: renamed from: k */
    public CardLabelShowView3 f12032k;

    /* JADX INFO: renamed from: l */
    public View f12033l;

    /* JADX INFO: renamed from: m */
    public String f12034m;

    /* JADX INFO: renamed from: l.dxk$a */
    public class C0858a implements CardLabelShowView3.a {
        public C0858a() {
        }

        /* JADX INFO: renamed from: a */
        public void m13505a(int i, int i2, int i3, boolean z) {
            if (z) {
                xdl0.V(dxk.this.f12033l, t100.d(16.0f) + ((i2 + i) / 2));
                dxk.this.m13504j(i);
            }
        }
    }

    /* JADX INFO: renamed from: l.dxk$b */
    public class RunnableC0859b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f12036a;

        public RunnableC0859b(User user) {
            this.f12036a = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredWidth = dxk.this.f12029h.getMeasuredWidth();
            String strConcat = this.f12036a.name;
            float fMeasureText = dxk.this.f12029h.getPaint().measureText(strConcat);
            if (measuredWidth > 0 && fMeasureText > 0.0f && t100.d(60.0f) + fMeasureText > measuredWidth) {
                int iRound = Math.round(((measuredWidth - t100.d(60.0f)) / fMeasureText) * strConcat.length());
                strConcat = (iRound > 0 ? strConcat.substring(0, iRound - 1) : "").concat("...");
            }
            dxk.this.f12029h.setText(strConcat + "  " + this.f12036a.age);
        }
    }

    /* JADX INFO: renamed from: l.dxk$c */
    public static class C0860c extends dcl0 {

        /* JADX INFO: renamed from: a */
        public String f12038a;

        public C0860c(String str) {
            this.f12038a = str;
        }

        /* JADX INFO: renamed from: a */
        public a11 m13506a(ViewGroup viewGroup) {
            return new dxk(LayoutInflater.from(viewGroup.getContext()).inflate(dxk.f12021n, viewGroup, false), this.f12038a);
        }
    }

    public dxk(@NonNull View view, String str) {
        super(view);
        m13500f(view);
        m13501g();
        this.f12034m = str;
    }

    /* JADX INFO: renamed from: a */
    public void m13499a(User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        String str;
        RoundingParams roundingParamsP = this.f12023b.getHierarchy().p();
        m13503i(user, TextUtils.equals(((DbObject) user).id, CoreModule.H().userId()), z);
        if (TextUtils.equals(this.f12034m, "preview")) {
            roundingParamsP.s(0.0f);
            xdl0.f0(this.f12026e, t100.d(60.0f));
            this.f12023b.getHierarchy().H(roundingParamsP);
            String strM19582k = o0x.m19582k();
            if (TextUtils.isEmpty(strM19582k)) {
                qib0.G.Y0(this.f12023b, x2c0.Qd);
            } else {
                qib0.G.L0(this.f12023b, strM19582k);
            }
            String strM19578g = o0x.m19578g();
            this.f12022a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM19578g) ? "#ECD3D3" : strM19578g), 16777215}));
        } else if (TextUtils.equals(this.f12034m, "profile")) {
            xdl0.f0(this.f12026e, t100.d(68.0f));
            roundingParamsP.s(0.0f);
            this.f12023b.getHierarchy().H(roundingParamsP);
            String strM19583l = o0x.m19583l();
            if (TextUtils.isEmpty(strM19583l)) {
                qib0.G.Y0(this.f12023b, x2c0.Rd);
            } else {
                qib0.G.L0(this.f12023b, strM19583l);
            }
            String strM19578g2 = o0x.m19578g();
            this.f12022a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM19578g2) ? "#ECD3D3" : strM19578g2), 16777215}));
        } else {
            roundingParamsP.s(t100.d(18.5f));
            xdl0.f0(this.f12026e, t100.d(35.0f));
            this.f12023b.getHierarchy().H(roundingParamsP);
            String strM19579h = o0x.m19579h();
            if (TextUtils.isEmpty(strM19579h)) {
                qib0.G.Y0(this.f12023b, x2c0.Md);
            } else {
                qib0.G.L0(this.f12023b, strM19579h);
            }
            String strM19578g3 = o0x.m19578g();
            String str2 = TextUtils.isEmpty(strM19578g3) ? "#ECD3D3" : strM19578g3;
            float fD = t100.d(0.0f);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str2), 16777215});
            gradientDrawable.setCornerRadii(new float[]{t100.d(18.5f), t100.d(18.5f), t100.d(18.5f), t100.d(18.5f), fD, fD, fD, fD});
            this.f12022a.setBackground(gradientDrawable);
        }
        qib0.G.L0(this.f12027f, user.fp().profileMiddle().formatted());
        this.f12029h.post(new RunnableC0859b(user));
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || vwb.J(profileExtensionMarriage.expectedTime)) {
            xdl0.M(this.f12030i, false);
        } else {
            String str3 = (String) user.profile.extensions.marriage.expectedTime.get(0);
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
            this.f12030i.setText(str4 + "的结婚预期：" + str);
            this.f12030i.setTypeface(eqh0.c(3), 1);
            xdl0.M(this.f12030i, true);
        }
        xdl0.M(this.f12028g, user.isIdAndPicBothVerified());
        List<LabelData> listM19591t = o0x.m19591t(user);
        boolean zJ = vwb.J(listM19591t);
        CardLabelShowView3 cardLabelShowView3 = this.f12032k;
        if (zJ) {
            xdl0.M(cardLabelShowView3, false);
            return;
        }
        xdl0.M(cardLabelShowView3, true);
        String strM19580i = o0x.m19580i();
        if (!TextUtils.isEmpty(strM19580i)) {
            this.f12032k.setTagBackgroundPaintLight(Color.parseColor(strM19580i));
        }
        this.f12032k.setLabel(listM19591t);
    }

    /* JADX INFO: renamed from: f */
    public final void m13500f(View view) {
        exk.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m13501g() {
        this.f12032k.setFirstLabelShowCallback(new C0858a());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m13502h(int i) {
        if (((Boolean) CoreModule.c.e0.L4.get()).booleanValue()) {
            return;
        }
        a aVar = new a(this.f12033l.getContext());
        aVar.D("符合你对理想伴侣的要求").y(true).b(5000L).N(new a.d() { // from class: l.cxk
            /* JADX INFO: renamed from: a */
            public final void m12868a(View view) {
                CoreModule.c.e0.L4.put(Boolean.TRUE);
            }
        }).v(t100.d(24.0f) + i).q(a.R | a.Q);
        d.l().u(aVar, this.f12033l, "marry_label_tips");
    }

    /* JADX INFO: renamed from: i */
    public final void m13503i(User user, boolean z, boolean z2) {
        xdl0.M(this.f12024c, false);
        xdl0.M(this.f12025d, false);
        if (z || !z2) {
            return;
        }
        if (CoreModule.c.N0.k3(user, 5)) {
            xdl0.M(this.f12024c, true);
        }
        if (NullChecker.a(user.location)) {
            Location location = user.location;
            if ((location.isHideInfo() && location.isHideRegionCountry()) || user.isHideLocationFromSVip()) {
                return;
            }
            User userMe_ = CoreModule.K().me_();
            if (location.distance >= 10000) {
                if (TextUtils.equals(userMe_.location.region.city, location.region.city)) {
                    xdl0.M(this.f12025d, true);
                    this.f12025d.setText("同城");
                    this.f12025d.setCompoundDrawablesWithIntrinsicBounds(x2c0.Nd, 0, 0, 0);
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
                sb.append(App.e.getString(R.string.J0));
            }
            xdl0.M(this.f12025d, true);
            this.f12025d.setText(sb.toString());
            this.f12025d.setCompoundDrawablesWithIntrinsicBounds(x2c0.Jo, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13504j(final int i) {
        if (((Boolean) CoreModule.c.e0.L4.get()).booleanValue()) {
            return;
        }
        d.l().k("marry_label_tips");
        this.f12033l.postDelayed(new Runnable() { // from class: l.bxk
            @Override // java.lang.Runnable
            public final void run() {
                this.f10348a.m13502h(i);
            }
        }, 500L);
    }
}
