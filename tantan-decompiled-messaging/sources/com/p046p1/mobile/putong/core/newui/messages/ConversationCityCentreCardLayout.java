package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.c3c0;
import p149l.c4g0;
import p149l.e30;
import p149l.e51;
import p149l.fsl;
import p149l.j760;
import p149l.mcr;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.r56;
import p149l.rw6;
import p149l.szb0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationCityCentreCardLayout extends RelativeLayout implements fsl, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationCityCentreCardLayout f24676a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f24677b;

    /* JADX INFO: renamed from: c */
    public ImageView f24678c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f24679d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24680e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f24681f;

    /* JADX INFO: renamed from: g */
    public View f24682g;

    /* JADX INFO: renamed from: h */
    public VLinear f24683h;

    /* JADX INFO: renamed from: i */
    public TextView f24684i;

    /* JADX INFO: renamed from: j */
    public TextView f24685j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f24686k;

    /* JADX INFO: renamed from: l */
    public View f24687l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f24688m;

    /* JADX INFO: renamed from: n */
    public ImageView f24689n;

    /* JADX INFO: renamed from: o */
    public TextView f24690o;

    /* JADX INFO: renamed from: p */
    public TextView f24691p;

    /* JADX INFO: renamed from: q */
    public TextView f24692q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f24693r;

    /* JADX INFO: renamed from: s */
    public c4g0 f24694s;

    /* JADX INFO: renamed from: t */
    public j760<CityCData, CityCBanner> f24695t;

    /* JADX INFO: renamed from: u */
    public int f24696u;

    /* JADX INFO: renamed from: v */
    public String f24697v;

    public ConversationCityCentreCardLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m40650d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    private Act m40651f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: o */
    private void m40652o(boolean z) {
        SVGALoader.with(getContext()).from(z ? "https://auto.tancdn.com/v1/raw/253e6c35-503a-4a4b-8b36-e056926f000714.svga" : "https://auto.tancdn.com/v1/raw/ba4ecb95-df87-4ac1-823b-8d562c8eae9314.svga").autoPlay(true).repeatCount(-1).into(this.f24693r);
    }

    private void setAdInfo(@NonNull CityCBanner cityCBanner) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f24685j, false);
        xdl0.m208344M(this.f24684i, true);
        this.f24684i.setTextSize(12.0f);
        this.f24684i.setText(cityCBanner.title);
        this.f24686k.setText(cityCBanner.text);
        if (TextUtils.isEmpty(cityCBanner.url)) {
            this.f24681f.setImageResource(c3c0.f78512F);
        } else {
            qib0.f154691G.m102331L0(this.f24681f, cityCBanner.url);
        }
        xdl0.m208344M(this.f24692q, true);
        xdl0.m208344M(this.f24687l, false);
        this.f24686k.setSingleLine(false);
        this.f24686k.setEllipsize(TextUtils.TruncateAt.END);
        this.f24686k.setMaxLines(2);
        zvf0.m220368A("e_message_city_cover", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_cover_uid", ""), vwb.m200311Y("cover_status", 0));
        m40652o(false);
    }

    private void setRecommendCardInfo(@NonNull CityCData cityCData) {
        String str = cityCData.userId;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa == null) {
            m40659h();
            return;
        }
        int i = this.f24696u;
        if (i == 1) {
            zvf0.m220368A("e_message_city_cover", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_cover_uid", str), vwb.m200311Y("cover_status", 1));
            if (!m40660i(str) || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, userM169430Pa.gender)) {
                m40659h();
                return;
            } else {
                ConversationCounterTypeSp.CityCentreShowBigCard.set(str, (int) (mqi0.m155944o() / 1000));
                e51.m114743H(getContext(), new Runnable() { // from class: l.o56
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f141875a.m40659h();
                    }
                }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                m40652o(true);
            }
        } else if (i == 2) {
            zvf0.m220368A("e_message_city_cover", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_cover_uid", str), vwb.m200311Y("cover_status", 0));
            m40652o(false);
        }
        m40664m(userM169430Pa, cityCData.cardTag);
        boolean zIsEmpty = TextUtils.isEmpty(cityCData.cityName);
        TextView textView = this.f24690o;
        if (zIsEmpty) {
            textView.setText("城市封面");
        } else {
            textView.setText(cityCData.cityName + " · 城市封面");
        }
        xdl0.m208344M(this.f24687l, true);
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: M */
    public void mo40653M(C8357a c8357a, User user, String str) {
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: O */
    public void mo40654O() {
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: b */
    public void mo40655b(View view, VImage vImage, VText vText, int i) {
        int i2 = t100.f167271t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        setAlpha(fMax);
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: c */
    public void mo40656c(User user, boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public final void m40657e(View view) {
        r56.m177881a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m40658g(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: h */
    public void m40659h() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m40660i(String str) {
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.CityCentreShowBigCard;
        return (conversationCounterTypeSp.hasKey(str) && mqi0.m155928C(mqi0.m155944o(), ((long) conversationCounterTypeSp.get(str)) * 1000)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m40661j(int i, j760 j760Var) {
        this.f24695t = j760Var;
        if (NullChecker.m81303a(j760Var.f116564a)) {
            setRecommendCardInfo((CityCData) j760Var.f116564a);
        } else if (NullChecker.m81303a(j760Var.f116565b) && i == 2) {
            setAdInfo((CityCBanner) j760Var.f116565b);
        } else {
            m40659h();
        }
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: k */
    public void mo40662k(User user, String str) {
        m40663l(m40651f(), user.f56011id, 3);
    }

    /* JADX INFO: renamed from: l */
    public void m40663l(mcr mcrVar, String str, final int i) {
        this.f24696u = i;
        this.f24697v = str;
        if (i == 2) {
            xdl0.m208327D0(t100.m186889c().widthPixels - t100.m186890d(141.0f), this);
            xdl0.m208325C0(this, t100.m186890d(114.0f));
            this.f24684i.setTextSize(15.0f);
            this.f24678c.setImageResource(c3c0.f78557K);
        } else if (i == 1) {
            xdl0.m208327D0(t100.m186889c().widthPixels - t100.m186890d(14.0f), this);
            xdl0.m208325C0(this, t100.m186890d(156.0f));
            xdl0.m208358V(this, t100.m186890d(7.0f));
            xdl0.m208325C0(this.f24679d, t100.m186890d(104.0f));
            xdl0.m208358V(this.f24679d, t100.m186890d(20.0f));
            xdl0.m208359W(this.f24679d, t100.m186890d(20.0f));
            xdl0.m208358V(this.f24683h, t100.m186890d(8.0f));
            xdl0.m208360X(this.f24687l, t100.m186890d(3.0f));
            xdl0.m208325C0(this.f24688m, t100.m186890d(48.0f));
            xdl0.m208358V(this.f24688m, t100.m186890d(16.0f));
            xdl0.m208359W(this.f24688m, t100.m186890d(16.0f));
            m40659h();
            this.f24684i.setTextSize(15.0f);
            this.f24678c.setImageResource(c3c0.f78539I);
        } else if (i == 3) {
            xdl0.m208327D0(t100.m186889c().widthPixels - t100.m186890d(12.0f), this);
            xdl0.m208325C0(this, t100.m186890d(102.0f));
            xdl0.m208325C0(this.f24679d, t100.m186890d(102.0f));
            xdl0.m208358V(this.f24679d, t100.m186890d(20.0f));
            xdl0.m208359W(this.f24679d, t100.m186890d(20.0f));
            xdl0.m208327D0(t100.m186890d(64.0f), this.f24680e);
            xdl0.m208325C0(this.f24680e, t100.m186890d(64.0f));
            xdl0.m208358V(this.f24677b, t100.m186890d(12.0f));
            xdl0.m208360X(this.f24685j, t100.m186890d(2.0f));
            xdl0.m208360X(this.f24686k, t100.m186890d(4.0f));
            xdl0.m208344M(this.f24688m, false);
            this.f24684i.setTextSize(18.0f);
            this.f24685j.setTextSize(13.0f);
            this.f24686k.setTextSize(15.0f);
            this.f24678c.setImageResource(c3c0.f78548J);
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(true);
        this.f24681f.getHierarchy().m112053H(roundingParams);
        this.f24684i.getPaint().setFakeBoldText(true);
        this.f24686k.getPaint().setFakeBoldText(true);
        if (i == 3) {
            m40667q(str);
        } else {
            mkd0.m154992z(this.f24694s);
            this.f24694s = mcrVar.duringCreated(CoreModule.f17545c.f19650h2.f118818V).subscribe(mkd0.m154956H(new e30() { // from class: l.p56
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147260a.m40661j(i, (j760) obj);
                }
            }, new e30() { // from class: l.q56
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationCityCentreCardLayout.m40650d((Throwable) obj);
                }
            }));
        }
        xdl0.m208329E0(this, this);
    }

    /* JADX INFO: renamed from: m */
    public final void m40664m(User user, String str) {
        xdl0.m208344M(this, true);
        qib0.f154691G.m102341Q0(this.f24681f, rw6.m181386b(user).profileSmall());
        this.f24684i.setText(user.name);
        xdl0.m208344M(this.f24684i, true);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        StringBuilder sb2 = new StringBuilder();
        if (!user.isHideLocationFromSVip()) {
            if (NullChecker.m81303a(user.location.region.city)) {
                sb2.append(user.location.region.city);
            }
            if (NullChecker.m81303a(user.location.region.district)) {
                sb2.append(user.location.region.district);
            }
            sb2.append("(");
            sb2.append(m40658g(user.location.distance));
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
        TextView textView = this.f24685j;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, true);
            this.f24685j.setText(string);
        }
        this.f24686k.setText(str);
        xdl0.m208344M(this.f24692q, false);
        if (user.isMe() || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, user.gender)) {
            xdl0.m208344M(this.f24691p, false);
        } else {
            boolean zEquals = TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, user.gender);
            TextView textView2 = this.f24691p;
            if (zEquals) {
                xdl0.m208344M(textView2, true);
                this.f24691p.setText("我要上封面");
            } else {
                xdl0.m208344M(textView2, true);
                TextView textView3 = this.f24691p;
                StringBuilder sb3 = new StringBuilder("和");
                sb3.append(user.isFemale() ? "她" : "他");
                sb3.append("聊聊");
                textView3.setText(sb3.toString());
            }
        }
        this.f24686k.setMaxLines(1);
        this.f24686k.requestFocus();
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: n */
    public void mo40665n(String str, BubbleInfo bubbleInfo, String str2) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f24696u == 3) {
            m40651f().startActivity(CoreModule.m29935P().m94658i().mo158203A5(m40651f(), this.f24697v, "from_greet_act", true, false, false));
            m40651f().overridePendingTransition(szb0.f167030e, 0);
            return;
        }
        j760<CityCData, CityCBanner> j760Var = this.f24695t;
        if (j760Var == null) {
            return;
        }
        CityCData cityCData = j760Var.f116564a;
        CityCBanner cityCBanner = j760Var.f116565b;
        if (!NullChecker.m81303a(cityCData)) {
            if (NullChecker.m81303a(cityCBanner)) {
                if (getContext() instanceof Act) {
                    CoreModule.m29935P().m94651a().mo33295C7((Act) getContext(), cityCBanner);
                }
                zvf0.m220399u("e_message_city_cover", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_cover_uid", ""), vwb.m200311Y("cover_status", Integer.valueOf(this.f24696u == 1 ? 1 : 0)));
                return;
            }
            return;
        }
        if (getContext() instanceof Act) {
            Act act = (Act) getContext();
            CityCData cityCData2 = this.f24695t.f116564a;
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(cityCData2.userId);
            if (TextUtils.equals(cityCData2.userId, userM169527p9.f56011id)) {
                CoreModule.m29935P().m94651a().mo33467ap(act, cityCData2);
            } else if (NullChecker.m81303a(userM169430Pa) && TEnum.equals(userM169430Pa.gender, userM169527p9.gender)) {
                CoreModule.m29935P().m94651a().mo33509ha(act, cityCData2);
            } else {
                C8360d.m45896e(act, cityCData2.userId);
            }
        }
        zvf0.m220399u("e_message_city_cover", OMSDialogPositon.p_messages_view, vwb.m200311Y("city_cover_uid", cityCData.userId), vwb.m200311Y("cover_status", Integer.valueOf(this.f24696u == 1 ? 1 : 0)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40657e(this);
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: p */
    public void mo40666p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3) {
    }

    /* JADX INFO: renamed from: q */
    public void m40667q(String str) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (!NullChecker.m81303a(userM169430Pa)) {
            m40659h();
            return;
        }
        int i = (NullChecker.m81303a(userM169430Pa.settings) && NullChecker.m81303a(userM169430Pa.settings.getSettingGroup()) && NullChecker.m81303a(userM169430Pa.settings.getSettingGroup().cityC)) ? userM169430Pa.settings.getSettingGroup().cityC.cost : 0;
        if (i <= 0 && NullChecker.m81303a(CoreModule.f17545c.f19650h2.f118818V.m221515e())) {
            j760<CityCData, CityCBanner> j760VarM221515e = CoreModule.f17545c.f19650h2.f118818V.m221515e();
            if (NullChecker.m81303a(j760VarM221515e.f116564a) && TextUtils.equals(str, j760VarM221515e.f116564a.userId)) {
                i = j760VarM221515e.f116564a.cost;
            }
        }
        if (i <= 0) {
            m40659h();
            return;
        }
        m40664m(userM169430Pa, CoreModule.m29935P().m94658i().mo158234G3(i));
        xdl0.m208344M(this.f24687l, false);
        m40652o(true);
    }

    @Override // p149l.fsl
    public void setMomentId(String str) {
    }

    @Override // p149l.fsl
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
