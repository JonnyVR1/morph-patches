package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.view.CardLabelShowView3;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class tzk extends h11 {

    /* JADX INFO: renamed from: n */
    public static final int f176765n = kec0.f125631T6;

    /* JADX INFO: renamed from: a */
    public View f176766a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f176767b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f176768c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f176769d;

    /* JADX INFO: renamed from: e */
    public VLinear f176770e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f176771f;

    /* JADX INFO: renamed from: g */
    public VImage f176772g;

    /* JADX INFO: renamed from: h */
    public VText f176773h;

    /* JADX INFO: renamed from: i */
    public VText f176774i;

    /* JADX INFO: renamed from: j */
    public VFrame f176775j;

    /* JADX INFO: renamed from: k */
    public CardLabelShowView3 f176776k;

    /* JADX INFO: renamed from: l */
    public View f176777l;

    /* JADX INFO: renamed from: m */
    public String f176778m;

    /* JADX INFO: renamed from: l.tzk$a */
    public class C20430a implements CardLabelShowView3.InterfaceC9320a {
        public C20430a() {
        }

        @Override // com.p051p1.mobile.putong.core.view.CardLabelShowView3.InterfaceC9320a
        /* JADX INFO: renamed from: a */
        public void mo60692a(int i, int i2, int i3, boolean z) {
            if (z) {
                bnl0.m105538V(tzk.this.f176777l, qa00.m175859d(16.0f) + ((i2 + i) / 2));
                tzk.this.m193683j(i);
            }
        }
    }

    /* JADX INFO: renamed from: l.tzk$b */
    public class RunnableC20431b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f176780a;

        public RunnableC20431b(User user) {
            this.f176780a = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredWidth = tzk.this.f176773h.getMeasuredWidth();
            String strConcat = this.f176780a.name;
            float fMeasureText = tzk.this.f176773h.getPaint().measureText(strConcat);
            if (measuredWidth > 0 && fMeasureText > 0.0f && qa00.m175859d(60.0f) + fMeasureText > measuredWidth) {
                int iRound = Math.round(((measuredWidth - qa00.m175859d(60.0f)) / fMeasureText) * strConcat.length());
                strConcat = (iRound > 0 ? strConcat.substring(0, iRound - 1) : "").concat("...");
            }
            tzk.this.f176773h.setText(strConcat + "  " + this.f176780a.age);
        }
    }

    /* JADX INFO: renamed from: l.tzk$c */
    public static class C20432c extends hll0 {

        /* JADX INFO: renamed from: a */
        public String f176782a;

        public C20432c(String str) {
            this.f176782a = str;
        }

        @Override // p153l.hll0
        /* JADX INFO: renamed from: a */
        public h11 mo135759a(ViewGroup viewGroup) {
            return new tzk(LayoutInflater.from(viewGroup.getContext()).inflate(tzk.f176765n, viewGroup, false), this.f176782a);
        }
    }

    public tzk(@NonNull View view, String str) {
        super(view);
        m193679f(view);
        m193680g();
        this.f176778m = str;
    }

    @Override // p153l.h11
    /* JADX INFO: renamed from: a */
    public void mo133267a(User user, boolean z) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        String str;
        RoundingParams roundingParamsM207055p = this.f176767b.getHierarchy().m207055p();
        m193682i(user, TextUtils.equals(user.f56859id, CoreModule.m30929H().userId()), z);
        if (TextUtils.equals(this.f176778m, "preview")) {
            roundingParamsM207055p.m8319s(0.0f);
            bnl0.m105554f0(this.f176770e, qa00.m175859d(60.0f));
            this.f176767b.getHierarchy().m207045H(roundingParamsM207055p);
            String strM161370k = n3x.m161370k();
            if (TextUtils.isEmpty(strM161370k)) {
                uqb0.f180374G.m127138Y0(this.f176767b, dbc0.f86534Rd);
            } else {
                uqb0.f180374G.m127115L0(this.f176767b, strM161370k);
            }
            String strM161366g = n3x.m161366g();
            this.f176766a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM161366g) ? "#ECD3D3" : strM161366g), 16777215}));
        } else if (TextUtils.equals(this.f176778m, "profile")) {
            bnl0.m105554f0(this.f176770e, qa00.m175859d(68.0f));
            roundingParamsM207055p.m8319s(0.0f);
            this.f176767b.getHierarchy().m207045H(roundingParamsM207055p);
            String strM161371l = n3x.m161371l();
            if (TextUtils.isEmpty(strM161371l)) {
                uqb0.f180374G.m127138Y0(this.f176767b, dbc0.f86566Sd);
            } else {
                uqb0.f180374G.m127115L0(this.f176767b, strM161371l);
            }
            String strM161366g2 = n3x.m161366g();
            this.f176766a.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TextUtils.isEmpty(strM161366g2) ? "#ECD3D3" : strM161366g2), 16777215}));
        } else {
            roundingParamsM207055p.m8319s(qa00.m175859d(18.5f));
            bnl0.m105554f0(this.f176770e, qa00.m175859d(35.0f));
            this.f176767b.getHierarchy().m207045H(roundingParamsM207055p);
            String strM161367h = n3x.m161367h();
            if (TextUtils.isEmpty(strM161367h)) {
                uqb0.f180374G.m127138Y0(this.f176767b, dbc0.f86406Nd);
            } else {
                uqb0.f180374G.m127115L0(this.f176767b, strM161367h);
            }
            String strM161366g3 = n3x.m161366g();
            String str2 = TextUtils.isEmpty(strM161366g3) ? "#ECD3D3" : strM161366g3;
            float fM175859d = qa00.m175859d(0.0f);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str2), 16777215});
            gradientDrawable.setCornerRadii(new float[]{qa00.m175859d(18.5f), qa00.m175859d(18.5f), qa00.m175859d(18.5f), qa00.m175859d(18.5f), fM175859d, fM175859d, fM175859d, fM175859d});
            this.f176766a.setBackground(gradientDrawable);
        }
        uqb0.f180374G.m127115L0(this.f176771f, user.m61308fp().profileMiddle().formatted());
        this.f176773h.post(new RunnableC20431b(user));
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || jyb.m147479J(profileExtensionMarriage.expectedTime)) {
            bnl0.m105524M(this.f176774i, false);
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
            this.f176774i.setText(str4 + "的结婚预期：" + str);
            this.f176774i.setTypeface(lyh0.m156283c(3), 1);
            bnl0.m105524M(this.f176774i, true);
        }
        bnl0.m105524M(this.f176772g, user.isIdAndPicBothVerified());
        List<LabelData> listM161379t = n3x.m161379t(user);
        boolean zM147479J = jyb.m147479J(listM161379t);
        CardLabelShowView3 cardLabelShowView3 = this.f176776k;
        if (zM147479J) {
            bnl0.m105524M(cardLabelShowView3, false);
            return;
        }
        bnl0.m105524M(cardLabelShowView3, true);
        String strM161368i = n3x.m161368i();
        if (!TextUtils.isEmpty(strM161368i)) {
            this.f176776k.setTagBackgroundPaintLight(Color.parseColor(strM161368i));
        }
        this.f176776k.setLabel(listM161379t);
    }

    /* JADX INFO: renamed from: f */
    public final void m193679f(View view) {
        uzk.m198843a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m193680g() {
        this.f176776k.setFirstLabelShowCallback(new C20430a());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m193681h(int i) {
        if (CoreModule.f18264c.f20381e0.f89071L4.get().booleanValue()) {
            return;
        }
        C4496a c4496a = new C4496a(this.f176777l.getContext());
        c4496a.m21848D("符合你对理想伴侣的要求").m21882y(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21858N(new C4496a.d() { // from class: l.szk
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
            /* JADX INFO: renamed from: a */
            public final void mo21886a(View view) {
                CoreModule.f18264c.f20381e0.f89071L4.put(Boolean.TRUE);
            }
        }).m21879v(qa00.m175859d(24.0f) + i).m21874q(C4496a.f16403R | C4496a.f16402Q);
        C4499d.m21895l().m21908u(c4496a, this.f176777l, "marry_label_tips");
    }

    /* JADX INFO: renamed from: i */
    public final void m193682i(User user, boolean z, boolean z2) {
        bnl0.m105524M(this.f176768c, false);
        bnl0.m105524M(this.f176769d, false);
        if (z || !z2) {
            return;
        }
        if (CoreModule.f18264c.f20330N0.m32970k3(user, 5)) {
            bnl0.m105524M(this.f176768c, true);
        }
        if (NullChecker.m82486a(user.location)) {
            Location location = user.location;
            if ((location.isHideInfo() && location.isHideRegionCountry()) || user.isHideLocationFromSVip()) {
                return;
            }
            User userMe_ = CoreModule.m30930K().me_();
            if (location.distance >= 10000) {
                if (TextUtils.equals(userMe_.location.region.city, location.region.city)) {
                    bnl0.m105524M(this.f176769d, true);
                    this.f176769d.setText("同城");
                    this.f176769d.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86438Od, 0, 0, 0);
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
                sb.append(App.f16088e.getString(R$string.f18057J0));
            }
            bnl0.m105524M(this.f176769d, true);
            this.f176769d.setText(sb.toString());
            this.f176769d.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87587xp, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m193683j(final int i) {
        if (CoreModule.f18264c.f20381e0.f89071L4.get().booleanValue()) {
            return;
        }
        C4499d.m21895l().m21899k("marry_label_tips");
        this.f176777l.postDelayed(new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f165548a.m193681h(i);
            }
        }, 500L);
    }
}
