package com.p000p1.mobile.putong.core.newui.messages;

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
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.p000p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CityCBanner;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.ui.greet.a;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.c4g0;
import l.e30;
import l.e51;
import l.fsl;
import l.j760;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.r56;
import l.rw6;
import l.szb0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.mqi0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VMarqueeText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationCityCentreCardLayout extends RelativeLayout implements fsl, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ConversationCityCentreCardLayout f3454a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3455b;

    /* JADX INFO: renamed from: c */
    public ImageView f3456c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3457d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3458e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3459f;

    /* JADX INFO: renamed from: g */
    public View f3460g;

    /* JADX INFO: renamed from: h */
    public VLinear f3461h;

    /* JADX INFO: renamed from: i */
    public TextView f3462i;

    /* JADX INFO: renamed from: j */
    public TextView f3463j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f3464k;

    /* JADX INFO: renamed from: l */
    public View f3465l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f3466m;

    /* JADX INFO: renamed from: n */
    public ImageView f3467n;

    /* JADX INFO: renamed from: o */
    public TextView f3468o;

    /* JADX INFO: renamed from: p */
    public TextView f3469p;

    /* JADX INFO: renamed from: q */
    public TextView f3470q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f3471r;

    /* JADX INFO: renamed from: s */
    public c4g0 f3472s;

    /* JADX INFO: renamed from: t */
    public j760<CityCData, CityCBanner> f3473t;

    /* JADX INFO: renamed from: u */
    public int f3474u;

    /* JADX INFO: renamed from: v */
    public String f3475v;

    public ConversationCityCentreCardLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4745d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    private Act m4746f() {
        return getContext();
    }

    /* JADX INFO: renamed from: o */
    private void m4747o(boolean z) {
        SVGALoader.with(getContext()).from(z ? "https://auto.tancdn.com/v1/raw/253e6c35-503a-4a4b-8b36-e056926f000714.svga" : "https://auto.tancdn.com/v1/raw/ba4ecb95-df87-4ac1-823b-8d562c8eae9314.svga").autoPlay(true).repeatCount(-1).into(this.f3471r);
    }

    private void setAdInfo(@NonNull CityCBanner cityCBanner) {
        xdl0.M(this, true);
        xdl0.M(this.f3463j, false);
        xdl0.M(this.f3462i, true);
        this.f3462i.setTextSize(12.0f);
        this.f3462i.setText(cityCBanner.title);
        this.f3464k.setText(cityCBanner.text);
        if (TextUtils.isEmpty(cityCBanner.url)) {
            this.f3459f.setImageResource(c3c0.F);
        } else {
            qib0.G.L0(this.f3459f, cityCBanner.url);
        }
        xdl0.M(this.f3470q, true);
        xdl0.M(this.f3465l, false);
        this.f3464k.setSingleLine(false);
        this.f3464k.setEllipsize(TextUtils.TruncateAt.END);
        this.f3464k.setMaxLines(2);
        zvf0.A("e_message_city_cover", "p_messages_view", new j760[]{vwb.Y("city_cover_uid", ""), vwb.Y("cover_status", 0)});
        m4747o(false);
    }

    private void setRecommendCardInfo(@NonNull CityCData cityCData) {
        String str = cityCData.userId;
        User userPa = CoreModule.c.e0.Pa(str);
        if (userPa == null) {
            m4754h();
            return;
        }
        int i = this.f3474u;
        if (i == 1) {
            zvf0.A("e_message_city_cover", "p_messages_view", new j760[]{vwb.Y("city_cover_uid", str), vwb.Y("cover_status", 1)});
            if (!m4755i(str) || TEnum.equals(CoreModule.c.e0.p9().gender, userPa.gender)) {
                m4754h();
                return;
            } else {
                ConversationCounterTypeSp.CityCentreShowBigCard.set(str, (int) (mqi0.m18550o() / 1000));
                e51.H(getContext(), new Runnable() { // from class: l.o56
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17840a.m4754h();
                    }
                }, 5000L);
                m4747o(true);
            }
        } else if (i == 2) {
            zvf0.A("e_message_city_cover", "p_messages_view", new j760[]{vwb.Y("city_cover_uid", str), vwb.Y("cover_status", 0)});
            m4747o(false);
        }
        m4759m(userPa, cityCData.cardTag);
        boolean zIsEmpty = TextUtils.isEmpty(cityCData.cityName);
        TextView textView = this.f3468o;
        if (zIsEmpty) {
            textView.setText("城市封面");
        } else {
            textView.setText(cityCData.cityName + " · 城市封面");
        }
        xdl0.M(this.f3465l, true);
    }

    /* JADX INFO: renamed from: M */
    public void m4748M(a aVar, User user, String str) {
    }

    /* JADX INFO: renamed from: O */
    public void m4749O() {
    }

    /* JADX INFO: renamed from: b */
    public void m4750b(View view, VImage vImage, VText vText, int i) {
        int i2 = t100.t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        setAlpha(fMax);
    }

    /* JADX INFO: renamed from: c */
    public void m4751c(User user, boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public final void m4752e(View view) {
        r56.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m4753g(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: h */
    public void m4754h() {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m4755i(String str) {
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.CityCentreShowBigCard;
        return (conversationCounterTypeSp.hasKey(str) && mqi0.m18534C(mqi0.m18550o(), ((long) conversationCounterTypeSp.get(str)) * 1000)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4756j(int i, j760 j760Var) {
        this.f3473t = j760Var;
        if (NullChecker.a(j760Var.a)) {
            setRecommendCardInfo((CityCData) j760Var.a);
        } else if (NullChecker.a(j760Var.b) && i == 2) {
            setAdInfo((CityCBanner) j760Var.b);
        } else {
            m4754h();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4757k(User user, String str) {
        m4758l(m4746f(), ((DbObject) user).id, 3);
    }

    /* JADX INFO: renamed from: l */
    public void m4758l(mcr mcrVar, String str, final int i) {
        this.f3474u = i;
        this.f3475v = str;
        if (i == 2) {
            xdl0.D0(t100.c().widthPixels - t100.d(141.0f), new View[]{this});
            xdl0.C0(this, t100.d(114.0f));
            this.f3462i.setTextSize(15.0f);
            this.f3456c.setImageResource(c3c0.K);
        } else if (i == 1) {
            xdl0.D0(t100.c().widthPixels - t100.d(14.0f), new View[]{this});
            xdl0.C0(this, t100.d(156.0f));
            xdl0.V(this, t100.d(7.0f));
            xdl0.C0(this.f3457d, t100.d(104.0f));
            xdl0.V(this.f3457d, t100.d(20.0f));
            xdl0.W(this.f3457d, t100.d(20.0f));
            xdl0.V(this.f3461h, t100.d(8.0f));
            xdl0.X(this.f3465l, t100.d(3.0f));
            xdl0.C0(this.f3466m, t100.d(48.0f));
            xdl0.V(this.f3466m, t100.d(16.0f));
            xdl0.W(this.f3466m, t100.d(16.0f));
            m4754h();
            this.f3462i.setTextSize(15.0f);
            this.f3456c.setImageResource(c3c0.I);
        } else if (i == 3) {
            xdl0.D0(t100.c().widthPixels - t100.d(12.0f), new View[]{this});
            xdl0.C0(this, t100.d(102.0f));
            xdl0.C0(this.f3457d, t100.d(102.0f));
            xdl0.V(this.f3457d, t100.d(20.0f));
            xdl0.W(this.f3457d, t100.d(20.0f));
            xdl0.D0(t100.d(64.0f), new View[]{this.f3458e});
            xdl0.C0(this.f3458e, t100.d(64.0f));
            xdl0.V(this.f3455b, t100.d(12.0f));
            xdl0.X(this.f3463j, t100.d(2.0f));
            xdl0.X(this.f3464k, t100.d(4.0f));
            xdl0.M(this.f3466m, false);
            this.f3462i.setTextSize(18.0f);
            this.f3463j.setTextSize(13.0f);
            this.f3464k.setTextSize(15.0f);
            this.f3456c.setImageResource(c3c0.J);
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.v(true);
        this.f3459f.getHierarchy().H(roundingParams);
        this.f3462i.getPaint().setFakeBoldText(true);
        this.f3464k.getPaint().setFakeBoldText(true);
        if (i == 3) {
            m4762q(str);
        } else {
            mkd0.z(this.f3472s);
            this.f3472s = mcrVar.duringCreated(CoreModule.c.h2.V).subscribe(mkd0.H(new e30() { // from class: l.p56
                public final void call(Object obj) {
                    this.f18395a.m4756j(i, (j760) obj);
                }
            }, new e30() { // from class: l.q56
                public final void call(Object obj) {
                    ConversationCityCentreCardLayout.m4745d((Throwable) obj);
                }
            }));
        }
        xdl0.E0(this, this);
    }

    /* JADX INFO: renamed from: m */
    public final void m4759m(User user, String str) {
        xdl0.M(this, true);
        qib0.G.Q0(this.f3459f, rw6.b(user).profileSmall());
        this.f3462i.setText(user.name);
        xdl0.M(this.f3462i, true);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        StringBuilder sb2 = new StringBuilder();
        if (!user.isHideLocationFromSVip()) {
            if (NullChecker.a(user.location.region.city)) {
                sb2.append(user.location.region.city);
            }
            if (NullChecker.a(user.location.region.district)) {
                sb2.append(user.location.region.district);
            }
            sb2.append("(");
            sb2.append(m4753g(user.location.distance));
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
        TextView textView = this.f3463j;
        if (zIsEmpty) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, true);
            this.f3463j.setText(string);
        }
        this.f3464k.setText(str);
        xdl0.M(this.f3470q, false);
        if (user.isMe() || TEnum.equals(CoreModule.c.e0.p9().gender, user.gender)) {
            xdl0.M(this.f3469p, false);
        } else {
            boolean zEquals = TEnum.equals(CoreModule.c.e0.p9().gender, user.gender);
            TextView textView2 = this.f3469p;
            if (zEquals) {
                xdl0.M(textView2, true);
                this.f3469p.setText("我要上封面");
            } else {
                xdl0.M(textView2, true);
                TextView textView3 = this.f3469p;
                StringBuilder sb3 = new StringBuilder("和");
                sb3.append(user.isFemale() ? "她" : "他");
                sb3.append("聊聊");
                textView3.setText(sb3.toString());
            }
        }
        this.f3464k.setMaxLines(1);
        this.f3464k.requestFocus();
    }

    /* JADX INFO: renamed from: n */
    public void m4760n(String str, BubbleInfo bubbleInfo, String str2) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f3474u == 3) {
            m4746f().startActivity(CoreModule.P().i().A5(m4746f(), this.f3475v, "from_greet_act", true, false, false));
            m4746f().overridePendingTransition(szb0.e, 0);
            return;
        }
        j760<CityCData, CityCBanner> j760Var = this.f3473t;
        if (j760Var == null) {
            return;
        }
        CityCData cityCData = (CityCData) j760Var.a;
        CityCBanner cityCBanner = (CityCBanner) j760Var.b;
        if (!NullChecker.a(cityCData)) {
            if (NullChecker.a(cityCBanner)) {
                if (getContext() instanceof Act) {
                    CoreModule.P().a().C7(getContext(), cityCBanner);
                }
                zvf0.u("e_message_city_cover", "p_messages_view", new j760[]{vwb.Y("city_cover_uid", ""), vwb.Y("cover_status", Integer.valueOf(this.f3474u == 1 ? 1 : 0))});
                return;
            }
            return;
        }
        if (getContext() instanceof Act) {
            Act context = getContext();
            CityCData cityCData2 = (CityCData) this.f3473t.a;
            User userP9 = CoreModule.c.e0.p9();
            User userPa = CoreModule.c.e0.Pa(cityCData2.userId);
            if (TextUtils.equals(cityCData2.userId, ((DbObject) userP9).id)) {
                CoreModule.P().a().ap(context, cityCData2);
            } else if (NullChecker.a(userPa) && TEnum.equals(userPa.gender, userP9.gender)) {
                CoreModule.P().a().ha(context, cityCData2);
            } else {
                d.e(context, cityCData2.userId);
            }
        }
        zvf0.u("e_message_city_cover", "p_messages_view", new j760[]{vwb.Y("city_cover_uid", cityCData.userId), vwb.Y("cover_status", Integer.valueOf(this.f3474u == 1 ? 1 : 0))});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4752e(this);
    }

    /* JADX INFO: renamed from: p */
    public void m4761p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3) {
    }

    /* JADX INFO: renamed from: q */
    public void m4762q(String str) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (!NullChecker.a(userPa)) {
            m4754h();
            return;
        }
        int i = (NullChecker.a(userPa.settings) && NullChecker.a(userPa.settings.getSettingGroup()) && NullChecker.a(userPa.settings.getSettingGroup().cityC)) ? userPa.settings.getSettingGroup().cityC.cost : 0;
        if (i <= 0 && NullChecker.a(CoreModule.c.h2.V.e())) {
            j760 j760Var = (j760) CoreModule.c.h2.V.e();
            if (NullChecker.a(j760Var.a) && TextUtils.equals(str, ((CityCData) j760Var.a).userId)) {
                i = ((CityCData) j760Var.a).cost;
            }
        }
        if (i <= 0) {
            m4754h();
            return;
        }
        m4759m(userPa, CoreModule.P().i().G3(i));
        xdl0.M(this.f3465l, false);
        m4747o(true);
    }

    public void setMomentId(String str) {
    }

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
