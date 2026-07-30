package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GrowthPushConfig;
import com.p046p1.mobile.putong.core.data.RecallMatch;
import com.p046p1.mobile.putong.core.p053ui.growth.views.GrowthPushPopView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Random;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p09 {

    /* JADX INFO: renamed from: d */
    public static volatile p09 f146565d;

    /* JADX INFO: renamed from: a */
    public C22393b<j760<PushMessage, String>> f146566a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public PopupWindow f146567b;

    /* JADX INFO: renamed from: c */
    public j760<PushMessage, String> f146568c;

    /* JADX INFO: renamed from: l.p09$a */
    public class RunnableC19091a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f146569a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GrowthPushConfig f146570b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f146571c;

        public RunnableC19091a(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
            this.f146569a = act;
            this.f146570b = growthPushConfig;
            this.f146571c = d30Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            p09.this.m166957I(this.f146569a, this.f146570b, this.f146571c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m166930c(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m166932e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m166937j(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m166943p(String str, Act act, roj0 roj0Var) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m33216zp(str))) {
            act.startActivity(MessagesAct.m48943i2(act, str, false, false));
        }
    }

    /* JADX INFO: renamed from: w */
    public static p09 m166948w() {
        if (f146565d == null) {
            synchronized (p09.class) {
                try {
                    if (f146565d == null) {
                        f146565d = new p09();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146565d;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m166949A(Act act, final GrowthPushConfig growthPushConfig, View view) {
        zvf0.m220396r("e_recall_match_big_cancel", "p_recall_match_popup_big");
        this.f146567b.dismiss();
        e51.m114741F(act, new Runnable() { // from class: l.f09
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19605S1.m200729T3("reject", growthPushConfig.tracker);
            }
        });
        this.f146567b = null;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m166950B(d30 d30Var, GrowthPushConfig growthPushConfig, Act act, View view) {
        if (NullChecker.m81303a(d30Var)) {
            this.f146567b.dismiss();
            if (growthPushConfig.isPassive) {
                zvf0.m220399u("e_recall_match_confirm", "p_recall_match_popup", vwb.m200311Y("match_uid", growthPushConfig.f20409id));
            } else {
                e51.m114741F(act, new Runnable() { // from class: l.d09
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151595y("招呼发送成功");
                    }
                });
                zvf0.m220399u("e_match_invitation_confirm", "p_match_invitation_popup", vwb.m200311Y("match_invitation_confirm_type", growthPushConfig.buttonText));
            }
            d30Var.call();
            this.f146567b = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m166951C(final GrowthPushConfig growthPushConfig, Act act, View view) {
        if (growthPushConfig.isPassive) {
            zvf0.m220396r("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            zvf0.m220396r("e_match_invitation_cancel", "p_match_invitation_popup");
        }
        this.f146568c = null;
        this.f146567b.dismiss();
        e51.m114741F(act, new Runnable() { // from class: l.e09
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19605S1.m200729T3("reject", growthPushConfig.tracker);
            }
        });
        this.f146567b = null;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m166952D(Act act, GrowthPushConfig growthPushConfig) {
        m166958J(act, growthPushConfig.tracker, growthPushConfig.f20409id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m166953E(final Act act, j760 j760Var) {
        F f = j760Var.f116564a;
        if (f == 0 || ((PushMessage) f).messageCustom == null) {
            return;
        }
        final PushMessageCustom pushMessageCustom = ((PushMessage) f).messageCustom;
        if (pushMessageCustom.expire == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || mqi0.m155944o() <= ((long) pushMessageCustom.expire)) {
            if (pushMessageCustom.isPassive) {
                e51.m114741F(act, new Runnable() { // from class: l.k09
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19605S1.m200729T3("back_show", pushMessageCustom.tracker);
                    }
                });
            }
            if (pushMessageCustom.matched) {
                if (upa.m194791n3()) {
                    aci.m95751b0(act, (User) j760Var.f116565b, false, "");
                    return;
                } else {
                    xdx.m208433A().m208461K(act, (User) j760Var.f116565b, false);
                    return;
                }
            }
            User user = (User) j760Var.f116565b;
            if (NullChecker.m81303a(user)) {
                final GrowthPushConfig growthPushConfigNew_ = GrowthPushConfig.new_();
                growthPushConfigNew_.f20409id = user.f56011id;
                growthPushConfigNew_.name = user.name;
                growthPushConfigNew_.gender = user.gender;
                growthPushConfigNew_.url = user.m60124fp().profileSmall().formatted();
                growthPushConfigNew_.tracker = pushMessageCustom.tracker;
                growthPushConfigNew_.buttonText = pushMessageCustom.buttonText;
                growthPushConfigNew_.isPassive = pushMessageCustom.isPassive;
                if (NullChecker.m81303a(user.location)) {
                    growthPushConfigNew_.distance = user.location.distance;
                }
                if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.zodiac)) {
                    growthPushConfigNew_.zodiac = i0g0.m133869j0(user.profile.zodiac);
                }
                m166956H(act, growthPushConfigNew_, new d30() { // from class: l.l09
                    @Override // p149l.d30
                    public final void call() {
                        this.f125477a.m166952D(act, growthPushConfigNew_);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m166954F(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom;
        if (pushMessage == null || (pushMessageCustom = pushMessage.messageCustom) == null) {
            return;
        }
        String str = pushMessageCustom.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f146568c = new j760<>(pushMessage, str);
        if (v930.m197534h() == TabName.Card && CoreModule.f17545c.f19639e0.m169468a8()) {
            return;
        }
        this.f146566a.m132487l(this.f146568c);
    }

    /* JADX INFO: renamed from: G */
    public void m166955G(final Act act) {
        if (act == null) {
            return;
        }
        act.duringCreated((C22306c) this.f146566a.flatMap(new w9j() { // from class: l.h09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return CoreModule.f17545c.f19639e0.m169410Ka((String) j760Var.f116565b).first().map(new w9j() { // from class: l.m09
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return j760.m140076a((PushMessage) j760Var.f116564a, (User) obj2);
                    }
                });
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.i09
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110266a.m166953E(act, (j760) obj);
            }
        }, new e30() { // from class: l.j09
            @Override // p149l.e30
            public final void call(Object obj) {
                p09.m166937j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m166956H(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
        Window window;
        View decorView;
        if (act == null || TextUtils.isEmpty(growthPushConfig.f20409id) || TextUtils.isEmpty(growthPushConfig.name) || TextUtils.isEmpty(growthPushConfig.url) || TextUtils.isEmpty(growthPushConfig.tracker) || TextUtils.isEmpty(growthPushConfig.buttonText) || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC19091a(act, growthPushConfig, d30Var));
    }

    /* JADX INFO: renamed from: I */
    public final void m166957I(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
        m166963x(act, growthPushConfig, d30Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m166958J(final Act act, String str, final String str2) {
        act.duringCreated((C22306c) CoreModule.f17545c.f19605S1.m200729T3("accept", str).filter(new w9j() { // from class: l.n09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                RecallMatch recallMatch = (RecallMatch) obj;
                return Boolean.valueOf(NullChecker.m81303a(recallMatch) && recallMatch.matched);
            }
        }).take(1).flatMap(new w9j() { // from class: l.o09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32902ap(str2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.xz8
            @Override // p149l.e30
            public final void call(Object obj) {
                p09.m166943p(str2, act, (roj0) obj);
            }
        }, new e30() { // from class: l.yz8
            @Override // p149l.e30
            public final void call(Object obj) {
                p09.m166932e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m166959K(Act act) {
        act.duringCreated((C22306c) CoreModule.f17545c.f19605S1.m200714E3().filter(new w9j() { // from class: l.wz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p09.m166930c((Boolean) obj);
            }
        }).take(1).flatMap(new w9j() { // from class: l.g09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19605S1.m200729T3("back_online", "");
            }
        })).subscribe(mkd0.m154954F());
    }

    /* JADX INFO: renamed from: L */
    public void m166960L(TabName tabName, boolean z) {
        if (!z) {
            if (NullChecker.m81303a(this.f146568c)) {
                this.f146566a.m132487l(this.f146568c);
            }
        } else if (NullChecker.m81303a(this.f146567b) && tabName.equals(TabName.Card)) {
            this.f146567b.dismiss();
            this.f146567b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m166961u() {
        if (NullChecker.m81303a(this.f146567b)) {
            this.f146567b = null;
        }
        this.f146566a.onCompleted();
        f146565d = null;
    }

    /* JADX INFO: renamed from: v */
    public void m166962v(TabName tabName) {
        if (!tabName.equals(TabName.Card)) {
            if (NullChecker.m81303a(this.f146568c)) {
                this.f146566a.m132487l(this.f146568c);
            }
        } else if (CoreModule.f17545c.f19639e0.m169468a8() && NullChecker.m81303a(this.f146567b)) {
            this.f146567b.dismiss();
            this.f146567b = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m166963x(final Act act, final GrowthPushConfig growthPushConfig, final d30 d30Var) {
        String str;
        int iNextInt = new Random().nextInt(19) + 80;
        String str2 = m166964y(growthPushConfig.gender) ? "她" : "他";
        String str3 = "";
        if (vy8.m200612j() && growthPushConfig.isPassive) {
            Locale locale = Locale.CHINA;
            str = String.format(locale, "%s喜欢了你，你们的匹配度高达%d%%", str2, Integer.valueOf(iNextInt));
            int i = growthPushConfig.distance;
            if (i > 0 && i < 1000) {
                str3 = String.format(locale, "%s当前在线 · 相距%skm", str2, i0g0.f110325b.format(i / 1000.0f));
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
        if (NullChecker.m81303a(this.f146567b) && this.f146567b.isShowing()) {
            this.f146567b.dismiss();
        }
        if (vy8.m200612j() && growthPushConfig.isPassive) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(f6c0.f95478N3, (ViewGroup) null), xdl0.m208412y0(), t100.m186890d(236.0f), false);
            this.f146567b = popupWindow;
            popupWindow.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m208434B(act));
            GrowthPushPopView growthPushPopView = (GrowthPushPopView) this.f146567b.getContentView().findViewById(u4c0.f173876J6);
            if (this.f146567b == null || growthPushPopView == null || growthPushPopView.m46000a0()) {
                return;
            }
            growthPushPopView.f29560g.setTypeface(eqh0.m117752c(3), 1);
            growthPushPopView.f29562i.setTypeface(eqh0.m117752c(3), 1);
            growthPushPopView.f29560g.setText(str3);
            qib0.f154691G.m102336O(growthPushPopView.f29564k, growthPushConfig.url, 2, 10);
            growthPushPopView.f29561h.setText(str);
            xdl0.m208329E0(growthPushPopView.f29562i, new View.OnClickListener() { // from class: l.zz8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205783a.m166965z(d30Var, growthPushConfig, view);
                }
            });
            xdl0.m208329E0(growthPushPopView.f29559f, new View.OnClickListener() { // from class: l.a09
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f67013a.m166949A(act, growthPushConfig, view);
                }
            });
            zvf0.m220368A("e_recall_match_big_confirm", "p_recall_match_popup_big", vwb.m200311Y("match_uid", growthPushConfig.f20409id));
            zvf0.m220402x("e_recall_match_big_cancel", "p_recall_match_popup_big");
            return;
        }
        PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(f6c0.f95494O3, (ViewGroup) null), xdl0.m208412y0() - xdl0.m208407w(16.0f), t100.m186890d(72.0f), false);
        this.f146567b = popupWindow2;
        popupWindow2.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m208434B(act) + xdl0.m208407w(10.0f));
        VRelative vRelative = (VRelative) this.f146567b.getContentView().findViewById(u4c0.f173847Hb);
        if (this.f146567b == null || vRelative == null) {
            return;
        }
        VDraweeView vDraweeView = (VDraweeView) vRelative.findViewById(u4c0.f174291i3);
        VText vText = (VText) vRelative.findViewById(u4c0.f173782De);
        VText vText2 = (VText) vRelative.findViewById(u4c0.f173765Ce);
        VImage vImage = (VImage) vRelative.findViewById(u4c0.f173718A1);
        VText vText3 = (VText) vRelative.findViewById(u4c0.f173751C0);
        vText.setTypeface(eqh0.m117752c(3));
        vText.setText(growthPushConfig.name);
        vText2.setText(str);
        if (growthPushConfig.isPassive) {
            vText3.setTextColor(Color.parseColor("#ffffff"));
            vText3.setBackgroundResource(x2c0.f190570t);
            vText3.setText("立即聊天");
        } else {
            vText3.setTextColor(Color.parseColor("#4C000000"));
            vText3.setText(growthPushConfig.buttonText);
            vText3.setBackgroundResource(x2c0.f190093e0);
        }
        qib0.f154691G.m102336O(vDraweeView, growthPushConfig.url, 2, 10);
        xdl0.m208329E0(vText3, new View.OnClickListener() { // from class: l.b09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72414a.m166950B(d30Var, growthPushConfig, act, view);
            }
        });
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.c09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78120a.m166951C(growthPushConfig, act, view);
            }
        });
        if (growthPushConfig.isPassive) {
            zvf0.m220368A("e_recall_match_confirm", "p_recall_match_popup", vwb.m200311Y("match_uid", growthPushConfig.f20409id));
            zvf0.m220402x("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            zvf0.m220368A("e_match_invitation_confirm", "p_match_invitation_popup", vwb.m200311Y("match_invitation_confirm_type", growthPushConfig.buttonText));
            zvf0.m220402x("e_match_invitation_cancel", "p_match_invitation_popup");
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m166964y(Gender gender) {
        return TEnum.equals(gender, "female");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m166965z(d30 d30Var, GrowthPushConfig growthPushConfig, View view) {
        if (NullChecker.m81303a(d30Var)) {
            this.f146567b.dismiss();
            zvf0.m220399u("e_recall_match_big_confirm", "p_recall_match_popup_big", vwb.m200311Y("match_uid", growthPushConfig.f20409id));
            d30Var.call();
            this.f146567b = null;
        }
    }
}
