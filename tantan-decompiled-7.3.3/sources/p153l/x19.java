package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GrowthPushConfig;
import com.p051p1.mobile.putong.core.data.RecallMatch;
import com.p051p1.mobile.putong.core.p058ui.growth.views.GrowthPushPopView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Random;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class x19 {

    /* JADX INFO: renamed from: d */
    public static volatile x19 f192023d;

    /* JADX INFO: renamed from: a */
    public C22508b<pf60<PushMessage, String>> f192024a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public PopupWindow f192025b;

    /* JADX INFO: renamed from: c */
    public pf60<PushMessage, String> f192026c;

    /* JADX INFO: renamed from: l.x19$a */
    public class RunnableC21227a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GrowthPushConfig f192028b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x20 f192029c;

        public RunnableC21227a(Act act, GrowthPushConfig growthPushConfig, x20 x20Var) {
            this.f192027a = act;
            this.f192028b = growthPushConfig;
            this.f192029c = x20Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            x19.this.m209005I(this.f192027a, this.f192028b, this.f192029c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m208978c(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m208980e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m208985j(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m208991p(String str, Act act, uxj0 uxj0Var) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m34219zp(str))) {
            act.startActivity(MessagesAct.m50126k2(act, str, false, false));
        }
    }

    /* JADX INFO: renamed from: w */
    public static x19 m208996w() {
        if (f192023d == null) {
            synchronized (x19.class) {
                try {
                    if (f192023d == null) {
                        f192023d = new x19();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192023d;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m208997A(Act act, final GrowthPushConfig growthPushConfig, View view) {
        i4g0.m138520r("e_recall_match_big_cancel", "p_recall_match_popup_big");
        this.f192025b.dismiss();
        l51.m152886F(act, new Runnable() { // from class: l.n19
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20347S1.m113553T3("reject", growthPushConfig.tracker);
            }
        });
        this.f192025b = null;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m208998B(x20 x20Var, GrowthPushConfig growthPushConfig, Act act, View view) {
        if (NullChecker.m82486a(x20Var)) {
            this.f192025b.dismiss();
            if (growthPushConfig.isPassive) {
                i4g0.m138523u("e_recall_match_confirm", "p_recall_match_popup", jyb.m147494Y("match_uid", growthPushConfig.f21151id));
            } else {
                l51.m152886F(act, new Runnable() { // from class: l.l19
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165651y("招呼发送成功");
                    }
                });
                i4g0.m138523u("e_match_invitation_confirm", "p_match_invitation_popup", jyb.m147494Y("match_invitation_confirm_type", growthPushConfig.buttonText));
            }
            x20Var.call();
            this.f192025b = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m208999C(final GrowthPushConfig growthPushConfig, Act act, View view) {
        if (growthPushConfig.isPassive) {
            i4g0.m138520r("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            i4g0.m138520r("e_match_invitation_cancel", "p_match_invitation_popup");
        }
        this.f192026c = null;
        this.f192025b.dismiss();
        l51.m152886F(act, new Runnable() { // from class: l.m19
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20347S1.m113553T3("reject", growthPushConfig.tracker);
            }
        });
        this.f192025b = null;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m209000D(Act act, GrowthPushConfig growthPushConfig) {
        m209006J(act, growthPushConfig.tracker, growthPushConfig.f21151id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m209001E(final Act act, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        if (f == 0 || ((PushMessage) f).messageCustom == null) {
            return;
        }
        final PushMessageCustom pushMessageCustom = ((PushMessage) f).messageCustom;
        if (pushMessageCustom.expire == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pzi0.m174454o() <= ((long) pushMessageCustom.expire)) {
            if (pushMessageCustom.isPassive) {
                l51.m152886F(act, new Runnable() { // from class: l.s19
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20347S1.m113553T3("back_show", pushMessageCustom.tracker);
                    }
                });
            }
            if (pushMessageCustom.matched) {
                if (gra.m131722n3()) {
                    pdi.m171817b0(act, (User) pf60Var.f152157b, false, "");
                    return;
                } else {
                    wgx.m206283A().m206311K(act, (User) pf60Var.f152157b, false);
                    return;
                }
            }
            User user = (User) pf60Var.f152157b;
            if (NullChecker.m82486a(user)) {
                final GrowthPushConfig growthPushConfigNew_ = GrowthPushConfig.new_();
                growthPushConfigNew_.f21151id = user.f56859id;
                growthPushConfigNew_.name = user.name;
                growthPushConfigNew_.gender = user.gender;
                growthPushConfigNew_.url = user.m61308fp().profileSmall().formatted();
                growthPushConfigNew_.tracker = pushMessageCustom.tracker;
                growthPushConfigNew_.buttonText = pushMessageCustom.buttonText;
                growthPushConfigNew_.isPassive = pushMessageCustom.isPassive;
                if (NullChecker.m82486a(user.location)) {
                    growthPushConfigNew_.distance = user.location.distance;
                }
                if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.zodiac)) {
                    growthPushConfigNew_.zodiac = q8g0.m175804j0(user.profile.zodiac);
                }
                m209004H(act, growthPushConfigNew_, new x20() { // from class: l.t19
                    @Override // p153l.x20
                    public final void call() {
                        this.f171609a.m209000D(act, growthPushConfigNew_);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m209002F(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom;
        if (pushMessage == null || (pushMessageCustom = pushMessage.messageCustom) == null) {
            return;
        }
        String str = pushMessageCustom.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f192026c = new pf60<>(pushMessage, str);
        if (ji30.m144964h() == TabName.Card && CoreModule.f18264c.f20381e0.m116541a8()) {
            return;
        }
        this.f192024a.m137019l(this.f192026c);
    }

    /* JADX INFO: renamed from: G */
    public void m209003G(final Act act) {
        if (act == null) {
            return;
        }
        act.duringCreated((C22421c) this.f192024a.flatMap(new qcj() { // from class: l.p19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return CoreModule.f18264c.f20381e0.m116483Ka((String) pf60Var.f152157b).first().map(new qcj() { // from class: l.u19
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return pf60.m172085a((PushMessage) pf60Var.f152156a, (User) obj2);
                    }
                });
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.q19
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155160a.m209001E(act, (pf60) obj);
            }
        }, new y20() { // from class: l.r19
            @Override // p153l.y20
            public final void call(Object obj) {
                x19.m208985j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m209004H(Act act, GrowthPushConfig growthPushConfig, x20 x20Var) {
        Window window;
        View decorView;
        if (act == null || TextUtils.isEmpty(growthPushConfig.f21151id) || TextUtils.isEmpty(growthPushConfig.name) || TextUtils.isEmpty(growthPushConfig.url) || TextUtils.isEmpty(growthPushConfig.tracker) || TextUtils.isEmpty(growthPushConfig.buttonText) || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC21227a(act, growthPushConfig, x20Var));
    }

    /* JADX INFO: renamed from: I */
    public final void m209005I(Act act, GrowthPushConfig growthPushConfig, x20 x20Var) {
        m209011x(act, growthPushConfig, x20Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m209006J(final Act act, String str, final String str2) {
        act.duringCreated((C22421c) CoreModule.f18264c.f20347S1.m113553T3("accept", str).filter(new qcj() { // from class: l.v19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                RecallMatch recallMatch = (RecallMatch) obj;
                return Boolean.valueOf(NullChecker.m82486a(recallMatch) && recallMatch.matched);
            }
        }).take(1).flatMap(new qcj() { // from class: l.w19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33905ap(str2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.f19
            @Override // p153l.y20
            public final void call(Object obj) {
                x19.m208991p(str2, act, (uxj0) obj);
            }
        }, new y20() { // from class: l.g19
            @Override // p153l.y20
            public final void call(Object obj) {
                x19.m208980e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m209007K(Act act) {
        act.duringCreated((C22421c) CoreModule.f18264c.f20347S1.m113538E3().filter(new qcj() { // from class: l.e19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x19.m208978c((Boolean) obj);
            }
        }).take(1).flatMap(new qcj() { // from class: l.o19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20347S1.m113553T3("back_online", "");
            }
        })).subscribe(psd0.m173595F());
    }

    /* JADX INFO: renamed from: L */
    public void m209008L(TabName tabName, boolean z) {
        if (!z) {
            if (NullChecker.m82486a(this.f192026c)) {
                this.f192024a.m137019l(this.f192026c);
            }
        } else if (NullChecker.m82486a(this.f192025b) && tabName.equals(TabName.Card)) {
            this.f192025b.dismiss();
            this.f192025b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m209009u() {
        if (NullChecker.m82486a(this.f192025b)) {
            this.f192025b = null;
        }
        this.f192024a.onCompleted();
        f192023d = null;
    }

    /* JADX INFO: renamed from: v */
    public void m209010v(TabName tabName) {
        if (!tabName.equals(TabName.Card)) {
            if (NullChecker.m82486a(this.f192026c)) {
                this.f192024a.m137019l(this.f192026c);
            }
        } else if (CoreModule.f18264c.f20381e0.m116541a8() && NullChecker.m82486a(this.f192025b)) {
            this.f192025b.dismiss();
            this.f192025b = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m209011x(final Act act, final GrowthPushConfig growthPushConfig, final x20 x20Var) {
        String str;
        int iNextInt = new Random().nextInt(19) + 80;
        String str2 = m209012y(growthPushConfig.gender) ? "她" : "他";
        String str3 = "";
        if (d09.m113373j() && growthPushConfig.isPassive) {
            Locale locale = Locale.CHINA;
            str = String.format(locale, "%s喜欢了你，你们的匹配度高达%d%%", str2, Integer.valueOf(iNextInt));
            int i = growthPushConfig.distance;
            if (i > 0 && i < 1000) {
                str3 = String.format(locale, "%s当前在线 · 相距%skm", str2, q8g0.f156109b.format(i / 1000.0f));
            } else if (i <= 0 || i / 1000 >= 20) {
                str3 = String.format("%s当前在线 · %s", str2, TextUtils.isEmpty(growthPushConfig.zodiac) ? "" : growthPushConfig.zodiac);
            } else {
                str3 = String.format(locale, "%s当前在线 · 相距%dkm", str2, Integer.valueOf(i / 1000));
            }
        } else if (growthPushConfig.isPassive) {
            str = String.format("%s喜欢了你，期待回复", str2);
        } else {
            int i2 = growthPushConfig.distance;
            if (i2 <= 0 || i2 / 1000 >= 20) {
                str = iNextInt > 90 ? String.format(Locale.CHINA, "匹配度%d%%，立即聊天认识", Integer.valueOf(iNextInt)) : "正等你聊天，快打个招呼";
            } else {
                str = "你们距离很近，立即聊天认识";
            }
        }
        if (NullChecker.m82486a(this.f192025b) && this.f192025b.isShowing()) {
            this.f192025b.dismiss();
        }
        if (d09.m113373j() && growthPushConfig.isPassive) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(kec0.f125532N3, (ViewGroup) null), bnl0.m105592y0(), qa00.m175859d(236.0f), false);
            this.f192025b = popupWindow;
            popupWindow.showAtLocation(act.getWindow().getDecorView(), 49, 0, wgx.m206284B(act));
            GrowthPushPopView growthPushPopView = (GrowthPushPopView) this.f192025b.getContentView().findViewById(adc0.f69998L6);
            if (this.f192025b == null || growthPushPopView == null || growthPushPopView.m47183a0()) {
                return;
            }
            growthPushPopView.f30408g.setTypeface(lyh0.m156283c(3), 1);
            growthPushPopView.f30410i.setTypeface(lyh0.m156283c(3), 1);
            growthPushPopView.f30408g.setText(str3);
            uqb0.f180374G.m127120O(growthPushPopView.f30412k, growthPushConfig.url, 2, 10);
            growthPushPopView.f30409h.setText(str);
            bnl0.m105509E0(growthPushPopView.f30410i, new View.OnClickListener() { // from class: l.h19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107419a.m209013z(x20Var, growthPushConfig, view);
                }
            });
            bnl0.m105509E0(growthPushPopView.f30407f, new View.OnClickListener() { // from class: l.i19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112499a.m208997A(act, growthPushConfig, view);
                }
            });
            i4g0.m138492A("e_recall_match_big_confirm", "p_recall_match_popup_big", jyb.m147494Y("match_uid", growthPushConfig.f21151id));
            i4g0.m138526x("e_recall_match_big_cancel", "p_recall_match_popup_big");
            return;
        }
        PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(kec0.f125548O3, (ViewGroup) null), bnl0.m105592y0() - bnl0.m105587w(16.0f), qa00.m175859d(72.0f), false);
        this.f192025b = popupWindow2;
        popupWindow2.showAtLocation(act.getWindow().getDecorView(), 49, 0, wgx.m206284B(act) + bnl0.m105587w(10.0f));
        VRelative vRelative = (VRelative) this.f192025b.getContentView().findViewById(adc0.f69969Jb);
        if (this.f192025b == null || vRelative == null) {
            return;
        }
        VDraweeView vDraweeView = (VDraweeView) vRelative.findViewById(adc0.f70415k3);
        VText vText = (VText) vRelative.findViewById(adc0.f69921Ge);
        VText vText2 = (VText) vRelative.findViewById(adc0.f69904Fe);
        VImage vImage = (VImage) vRelative.findViewById(adc0.f69806A1);
        VText vText3 = (VText) vRelative.findViewById(adc0.f69839C0);
        vText.setTypeface(lyh0.m156283c(3));
        vText.setText(growthPushConfig.name);
        vText2.setText(str);
        if (growthPushConfig.isPassive) {
            vText3.setTextColor(Color.parseColor("#ffffff"));
            vText3.setBackgroundResource(dbc0.f87465u);
            vText3.setText("立即聊天");
        } else {
            vText3.setTextColor(Color.parseColor("#4C000000"));
            vText3.setText(growthPushConfig.buttonText);
            vText3.setBackgroundResource(dbc0.f86973f0);
        }
        uqb0.f180374G.m127120O(vDraweeView, growthPushConfig.url, 2, 10);
        bnl0.m105509E0(vText3, new View.OnClickListener() { // from class: l.j19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117941a.m208998B(x20Var, growthPushConfig, act, view);
            }
        });
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.k19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123454a.m208999C(growthPushConfig, act, view);
            }
        });
        if (growthPushConfig.isPassive) {
            i4g0.m138492A("e_recall_match_confirm", "p_recall_match_popup", jyb.m147494Y("match_uid", growthPushConfig.f21151id));
            i4g0.m138526x("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            i4g0.m138492A("e_match_invitation_confirm", "p_match_invitation_popup", jyb.m147494Y("match_invitation_confirm_type", growthPushConfig.buttonText));
            i4g0.m138526x("e_match_invitation_cancel", "p_match_invitation_popup");
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m209012y(Gender gender) {
        return TEnum.equals(gender, "female");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m209013z(x20 x20Var, GrowthPushConfig growthPushConfig, View view) {
        if (NullChecker.m82486a(x20Var)) {
            this.f192025b.dismiss();
            i4g0.m138523u("e_recall_match_big_confirm", "p_recall_match_popup_big", jyb.m147494Y("match_uid", growthPushConfig.f21151id));
            x20Var.call();
            this.f192025b = null;
        }
    }
}
