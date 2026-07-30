package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.ner;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.tul;
import p153l.uqb0;
import p153l.ux6;
import p153l.w66;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationCityCentreCardLayout extends RelativeLayout implements tul, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationCityCentreCardLayout f25418a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f25419b;

    /* JADX INFO: renamed from: c */
    public ImageView f25420c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f25421d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25422e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25423f;

    /* JADX INFO: renamed from: g */
    public View f25424g;

    /* JADX INFO: renamed from: h */
    public VLinear f25425h;

    /* JADX INFO: renamed from: i */
    public TextView f25426i;

    /* JADX INFO: renamed from: j */
    public TextView f25427j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f25428k;

    /* JADX INFO: renamed from: l */
    public View f25429l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f25430m;

    /* JADX INFO: renamed from: n */
    public ImageView f25431n;

    /* JADX INFO: renamed from: o */
    public TextView f25432o;

    /* JADX INFO: renamed from: p */
    public TextView f25433p;

    /* JADX INFO: renamed from: q */
    public TextView f25434q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f25435r;

    /* JADX INFO: renamed from: s */
    public kcg0 f25436s;

    /* JADX INFO: renamed from: t */
    public pf60<CityCData, CityCBanner> f25437t;

    /* JADX INFO: renamed from: u */
    public int f25438u;

    /* JADX INFO: renamed from: v */
    public String f25439v;

    public ConversationCityCentreCardLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m41661d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    private Act m41662f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: o */
    private void m41663o(boolean z) {
        SVGALoader.with(getContext()).from(z ? "https://auto.tancdn.com/v1/raw/253e6c35-503a-4a4b-8b36-e056926f000714.svga" : "https://auto.tancdn.com/v1/raw/ba4ecb95-df87-4ac1-823b-8d562c8eae9314.svga").autoPlay(true).repeatCount(-1).into(this.f25435r);
    }

    private void setAdInfo(@NonNull CityCBanner cityCBanner) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f25427j, false);
        bnl0.m105524M(this.f25426i, true);
        this.f25426i.setTextSize(12.0f);
        this.f25426i.setText(cityCBanner.title);
        this.f25428k.setText(cityCBanner.text);
        if (TextUtils.isEmpty(cityCBanner.url)) {
            this.f25423f.setImageResource(ibc0.f113787F);
        } else {
            uqb0.f180374G.m127115L0(this.f25423f, cityCBanner.url);
        }
        bnl0.m105524M(this.f25434q, true);
        bnl0.m105524M(this.f25429l, false);
        this.f25428k.setSingleLine(false);
        this.f25428k.setEllipsize(TextUtils.TruncateAt.END);
        this.f25428k.setMaxLines(2);
        i4g0.m138492A("e_message_city_cover", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_cover_uid", ""), jyb.m147494Y("cover_status", 0));
        m41663o(false);
    }

    private void setRecommendCardInfo(@NonNull CityCData cityCData) {
        String str = cityCData.userId;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa == null) {
            m41670h();
            return;
        }
        int i = this.f25438u;
        if (i == 1) {
            i4g0.m138492A("e_message_city_cover", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_cover_uid", str), jyb.m147494Y("cover_status", 1));
            if (!m41671i(str) || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, userM116503Pa.gender)) {
                m41670h();
                return;
            } else {
                ConversationCounterTypeSp.CityCentreShowBigCard.set(str, (int) (pzi0.m174454o() / 1000));
                l51.m152888H(getContext(), new Runnable() { // from class: l.t66
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f172293a.m41670h();
                    }
                }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                m41663o(true);
            }
        } else if (i == 2) {
            i4g0.m138492A("e_message_city_cover", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_cover_uid", str), jyb.m147494Y("cover_status", 0));
            m41663o(false);
        }
        m41675m(userM116503Pa, cityCData.cardTag);
        boolean zIsEmpty = TextUtils.isEmpty(cityCData.cityName);
        TextView textView = this.f25432o;
        if (zIsEmpty) {
            textView.setText("城市封面");
        } else {
            textView.setText(cityCData.cityName + " · 城市封面");
        }
        bnl0.m105524M(this.f25429l, true);
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: M */
    public void mo41664M(C8520a c8520a, User user, String str) {
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: O */
    public void mo41665O() {
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: b */
    public void mo41666b(View view, VImage vImage, VText vText, int i) {
        int i2 = qa00.f156333t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        setAlpha(fMax);
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: c */
    public void mo41667c(User user, boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public final void m41668e(View view) {
        w66.m205080a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m41669g(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: h */
    public void m41670h() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m41671i(String str) {
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.CityCentreShowBigCard;
        return (conversationCounterTypeSp.hasKey(str) && pzi0.m174438C(pzi0.m174454o(), ((long) conversationCounterTypeSp.get(str)) * 1000)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m41672j(int i, pf60 pf60Var) {
        this.f25437t = pf60Var;
        if (NullChecker.m82486a(pf60Var.f152156a)) {
            setRecommendCardInfo((CityCData) pf60Var.f152156a);
        } else if (NullChecker.m82486a(pf60Var.f152157b) && i == 2) {
            setAdInfo((CityCBanner) pf60Var.f152157b);
        } else {
            m41670h();
        }
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: k */
    public void mo41673k(User user, String str) {
        m41674l(m41662f(), user.f56859id, 3);
    }

    /* JADX INFO: renamed from: l */
    public void m41674l(ner nerVar, String str, final int i) {
        this.f25438u = i;
        this.f25439v = str;
        if (i == 2) {
            bnl0.m105507D0(qa00.m175858c().widthPixels - qa00.m175859d(141.0f), this);
            bnl0.m105505C0(this, qa00.m175859d(114.0f));
            this.f25426i.setTextSize(15.0f);
            this.f25420c.setImageResource(ibc0.f113832K);
        } else if (i == 1) {
            bnl0.m105507D0(qa00.m175858c().widthPixels - qa00.m175859d(14.0f), this);
            bnl0.m105505C0(this, qa00.m175859d(156.0f));
            bnl0.m105538V(this, qa00.m175859d(7.0f));
            bnl0.m105505C0(this.f25421d, qa00.m175859d(104.0f));
            bnl0.m105538V(this.f25421d, qa00.m175859d(20.0f));
            bnl0.m105539W(this.f25421d, qa00.m175859d(20.0f));
            bnl0.m105538V(this.f25425h, qa00.m175859d(8.0f));
            bnl0.m105540X(this.f25429l, qa00.m175859d(3.0f));
            bnl0.m105505C0(this.f25430m, qa00.m175859d(48.0f));
            bnl0.m105538V(this.f25430m, qa00.m175859d(16.0f));
            bnl0.m105539W(this.f25430m, qa00.m175859d(16.0f));
            m41670h();
            this.f25426i.setTextSize(15.0f);
            this.f25420c.setImageResource(ibc0.f113814I);
        } else if (i == 3) {
            bnl0.m105507D0(qa00.m175858c().widthPixels - qa00.m175859d(12.0f), this);
            bnl0.m105505C0(this, qa00.m175859d(102.0f));
            bnl0.m105505C0(this.f25421d, qa00.m175859d(102.0f));
            bnl0.m105538V(this.f25421d, qa00.m175859d(20.0f));
            bnl0.m105539W(this.f25421d, qa00.m175859d(20.0f));
            bnl0.m105507D0(qa00.m175859d(64.0f), this.f25422e);
            bnl0.m105505C0(this.f25422e, qa00.m175859d(64.0f));
            bnl0.m105538V(this.f25419b, qa00.m175859d(12.0f));
            bnl0.m105540X(this.f25427j, qa00.m175859d(2.0f));
            bnl0.m105540X(this.f25428k, qa00.m175859d(4.0f));
            bnl0.m105524M(this.f25430m, false);
            this.f25426i.setTextSize(18.0f);
            this.f25427j.setTextSize(13.0f);
            this.f25428k.setTextSize(15.0f);
            this.f25420c.setImageResource(ibc0.f113823J);
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(true);
        this.f25423f.getHierarchy().m207045H(roundingParams);
        this.f25426i.getPaint().setFakeBoldText(true);
        this.f25428k.getPaint().setFakeBoldText(true);
        if (i == 3) {
            m41678q(str);
        } else {
            psd0.m173633z(this.f25436s);
            this.f25436s = nerVar.duringCreated(CoreModule.f18264c.f20392h2.f142919V).subscribe(psd0.m173597H(new y20() { // from class: l.u66
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177708a.m41672j(i, (pf60) obj);
                }
            }, new y20() { // from class: l.v66
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationCityCentreCardLayout.m41661d((Throwable) obj);
                }
            }));
        }
        bnl0.m105509E0(this, this);
    }

    /* JADX INFO: renamed from: m */
    public final void m41675m(User user, String str) {
        bnl0.m105524M(this, true);
        uqb0.f180374G.m127125Q0(this.f25423f, ux6.m198404b(user).profileSmall());
        this.f25426i.setText(user.name);
        bnl0.m105524M(this.f25426i, true);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        StringBuilder sb2 = new StringBuilder();
        if (!user.isHideLocationFromSVip()) {
            if (NullChecker.m82486a(user.location.region.city)) {
                sb2.append(user.location.region.city);
            }
            if (NullChecker.m82486a(user.location.region.district)) {
                sb2.append(user.location.region.district);
            }
            sb2.append("(");
            sb2.append(m41669g(user.location.distance));
            sb2.append(")");
        }
        if (!TextUtils.isEmpty(sb2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(" · ");
            }
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        TextView textView = this.f25427j;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, true);
            this.f25427j.setText(string);
        }
        this.f25428k.setText(str);
        bnl0.m105524M(this.f25434q, false);
        if (user.isMe() || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, user.gender)) {
            bnl0.m105524M(this.f25433p, false);
        } else {
            boolean zEquals = TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, user.gender);
            TextView textView2 = this.f25433p;
            if (zEquals) {
                bnl0.m105524M(textView2, true);
                this.f25433p.setText("我要上封面");
            } else {
                bnl0.m105524M(textView2, true);
                TextView textView3 = this.f25433p;
                StringBuilder sb3 = new StringBuilder("和");
                sb3.append(user.isFemale() ? "她" : "他");
                sb3.append("聊聊");
                textView3.setText(sb3.toString());
            }
        }
        this.f25428k.setMaxLines(1);
        this.f25428k.requestFocus();
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: n */
    public void mo41676n(String str, BubbleInfo bubbleInfo, String str2) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f25438u == 3) {
            m41662f().startActivity(CoreModule.m30933P().m143412i().mo180295A5(m41662f(), this.f25439v, "from_greet_act", true, false, false));
            m41662f().overridePendingTransition(y7c0.f197767e, 0);
            return;
        }
        pf60<CityCData, CityCBanner> pf60Var = this.f25437t;
        if (pf60Var == null) {
            return;
        }
        CityCData cityCData = pf60Var.f152156a;
        CityCBanner cityCBanner = pf60Var.f152157b;
        if (!NullChecker.m82486a(cityCData)) {
            if (NullChecker.m82486a(cityCBanner)) {
                if (getContext() instanceof Act) {
                    CoreModule.m30933P().m143405a().mo34298C7((Act) getContext(), cityCBanner);
                }
                i4g0.m138523u("e_message_city_cover", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_cover_uid", ""), jyb.m147494Y("cover_status", Integer.valueOf(this.f25438u == 1 ? 1 : 0)));
                return;
            }
            return;
        }
        if (getContext() instanceof Act) {
            Act act = (Act) getContext();
            CityCData cityCData2 = this.f25437t.f152156a;
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(cityCData2.userId);
            if (TextUtils.equals(cityCData2.userId, userM116600p9.f56859id)) {
                CoreModule.m30933P().m143405a().mo34470ap(act, cityCData2);
            } else if (NullChecker.m82486a(userM116503Pa) && TEnum.equals(userM116503Pa.gender, userM116600p9.gender)) {
                CoreModule.m30933P().m143405a().mo34512ha(act, cityCData2);
            } else {
                C8523d.m47079e(act, cityCData2.userId);
            }
        }
        i4g0.m138523u("e_message_city_cover", OMSDialogPositon.p_messages_view, jyb.m147494Y("city_cover_uid", cityCData.userId), jyb.m147494Y("cover_status", Integer.valueOf(this.f25438u == 1 ? 1 : 0)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41668e(this);
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: p */
    public void mo41677p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3) {
    }

    /* JADX INFO: renamed from: q */
    public void m41678q(String str) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (!NullChecker.m82486a(userM116503Pa)) {
            m41670h();
            return;
        }
        int i = (NullChecker.m82486a(userM116503Pa.settings) && NullChecker.m82486a(userM116503Pa.settings.getSettingGroup()) && NullChecker.m82486a(userM116503Pa.settings.getSettingGroup().cityC)) ? userM116503Pa.settings.getSettingGroup().cityC.cost : 0;
        if (i <= 0 && NullChecker.m82486a(CoreModule.f18264c.f20392h2.f142919V.m222761e())) {
            pf60<CityCData, CityCBanner> pf60VarM222761e = CoreModule.f18264c.f20392h2.f142919V.m222761e();
            if (NullChecker.m82486a(pf60VarM222761e.f152156a) && TextUtils.equals(str, pf60VarM222761e.f152156a.userId)) {
                i = pf60VarM222761e.f152156a.cost;
            }
        }
        if (i <= 0) {
            m41670h();
            return;
        }
        m41675m(userM116503Pa, CoreModule.m30933P().m143412i().mo180326G3(i));
        bnl0.m105524M(this.f25429l, false);
        m41663o(true);
    }

    @Override // p153l.tul
    public void setMomentId(String str) {
    }

    @Override // p153l.tul
    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
    }

    public void setShowGreetLayout(boolean z) {
    }

    public ConversationCityCentreCardLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationCityCentreCardLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
