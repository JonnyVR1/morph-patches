package p003l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.data.GrowthPushConfig;
import com.p000p1.mobile.putong.core.data.RecallMatch;
import com.p000p1.mobile.putong.core.p001ui.growth.views.GrowthPushPopView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Random;
import l.aci;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.vy8;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xdx;
import l.zvf0;
import rx.subjects.b;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p09 {

    /* JADX INFO: renamed from: d */
    public static volatile p09 f6785d;

    /* JADX INFO: renamed from: a */
    public b<j760<PushMessage, String>> f6786a = b.b();

    /* JADX INFO: renamed from: b */
    public PopupWindow f6787b;

    /* JADX INFO: renamed from: c */
    public j760<PushMessage, String> f6788c;

    /* JADX INFO: renamed from: l.p09$a */
    public class RunnableC3402a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f6789a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GrowthPushConfig f6790b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f6791c;

        public RunnableC3402a(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
            this.f6789a = act;
            this.f6790b = growthPushConfig;
            this.f6791c = d30Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            p09.this.m8677I(this.f6789a, this.f6790b, this.f6791c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m8650c(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8652e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8657j(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8663p(String str, Act act, roj0 roj0Var) {
        if (NullChecker.a(CoreModule.c.f0.zp(str))) {
            act.startActivity(MessagesAct.i2(act, str, false, false));
        }
    }

    /* JADX INFO: renamed from: w */
    public static p09 m8668w() {
        if (f6785d == null) {
            synchronized (p09.class) {
                try {
                    if (f6785d == null) {
                        f6785d = new p09();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6785d;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8669A(Act act, final GrowthPushConfig growthPushConfig, View view) {
        zvf0.r("e_recall_match_big_cancel", "p_recall_match_popup_big");
        this.f6787b.dismiss();
        e51.F(act, new Runnable() { // from class: l.f09
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.S1.T3("reject", growthPushConfig.tracker);
            }
        });
        this.f6787b = null;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8670B(d30 d30Var, GrowthPushConfig growthPushConfig, Act act, View view) {
        if (NullChecker.a(d30Var)) {
            this.f6787b.dismiss();
            if (growthPushConfig.isPassive) {
                zvf0.u("e_recall_match_confirm", "p_recall_match_popup", new j760[]{vwb.Y("match_uid", growthPushConfig.f71id)});
            } else {
                e51.F(act, new Runnable() { // from class: l.d09
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.y("招呼发送成功");
                    }
                });
                zvf0.u("e_match_invitation_confirm", "p_match_invitation_popup", new j760[]{vwb.Y("match_invitation_confirm_type", growthPushConfig.buttonText)});
            }
            d30Var.call();
            this.f6787b = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m8671C(final GrowthPushConfig growthPushConfig, Act act, View view) {
        if (growthPushConfig.isPassive) {
            zvf0.r("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            zvf0.r("e_match_invitation_cancel", "p_match_invitation_popup");
        }
        this.f6788c = null;
        this.f6787b.dismiss();
        e51.F(act, new Runnable() { // from class: l.e09
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.S1.T3("reject", growthPushConfig.tracker);
            }
        });
        this.f6787b = null;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m8672D(Act act, GrowthPushConfig growthPushConfig) {
        m8678J(act, growthPushConfig.tracker, growthPushConfig.f71id);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8673E(final Act act, j760 j760Var) {
        Object obj = j760Var.a;
        if (obj == null || ((PushMessage) obj).messageCustom == null) {
            return;
        }
        final PushMessageCustom pushMessageCustom = ((PushMessage) obj).messageCustom;
        if (pushMessageCustom.expire == 0.0d || mqi0.o() <= ((long) pushMessageCustom.expire)) {
            if (pushMessageCustom.isPassive) {
                e51.F(act, new Runnable() { // from class: l.k09
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.S1.T3("back_show", pushMessageCustom.tracker);
                    }
                });
            }
            if (pushMessageCustom.matched) {
                if (upa.n3()) {
                    aci.b0(act, (User) j760Var.b, false, "");
                    return;
                } else {
                    xdx.A().K(act, (User) j760Var.b, false);
                    return;
                }
            }
            User user = (User) j760Var.b;
            if (NullChecker.a(user)) {
                final GrowthPushConfig growthPushConfigNew_ = GrowthPushConfig.new_();
                growthPushConfigNew_.f71id = ((DbObject) user).id;
                growthPushConfigNew_.name = user.name;
                growthPushConfigNew_.gender = user.gender;
                growthPushConfigNew_.url = user.fp().profileSmall().formatted();
                growthPushConfigNew_.tracker = pushMessageCustom.tracker;
                growthPushConfigNew_.buttonText = pushMessageCustom.buttonText;
                growthPushConfigNew_.isPassive = pushMessageCustom.isPassive;
                if (NullChecker.a(user.location)) {
                    growthPushConfigNew_.distance = user.location.distance;
                }
                if (NullChecker.a(user.profile) && NullChecker.a(user.profile.zodiac)) {
                    growthPushConfigNew_.zodiac = i0g0.j0(user.profile.zodiac);
                }
                m8676H(act, growthPushConfigNew_, new d30() { // from class: l.l09
                    public final void call() {
                        this.f5729a.m8672D(act, growthPushConfigNew_);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m8674F(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom;
        if (pushMessage == null || (pushMessageCustom = pushMessage.messageCustom) == null) {
            return;
        }
        String str = pushMessageCustom.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6788c = new j760<>(pushMessage, str);
        if (v930.m10192h() == TabName.Card && CoreModule.c.e0.a8()) {
            return;
        }
        this.f6786a.onNext(this.f6788c);
    }

    /* JADX INFO: renamed from: G */
    public void m8675G(final Act act) {
        if (act == null) {
            return;
        }
        act.duringCreated(this.f6786a.flatMap(new w9j() { // from class: l.h09
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return CoreModule.c.e0.Ka((String) j760Var.b).first().map(new w9j() { // from class: l.m09
                    public final Object call(Object obj2) {
                        return j760.a((PushMessage) j760Var.a, (User) obj2);
                    }
                });
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.i09
            public final void call(Object obj) {
                this.f4979a.m8673E(act, (j760) obj);
            }
        }, new e30() { // from class: l.j09
            public final void call(Object obj) {
                p09.m8657j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m8676H(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
        Window window;
        View decorView;
        if (act == null || TextUtils.isEmpty(growthPushConfig.f71id) || TextUtils.isEmpty(growthPushConfig.name) || TextUtils.isEmpty(growthPushConfig.url) || TextUtils.isEmpty(growthPushConfig.tracker) || TextUtils.isEmpty(growthPushConfig.buttonText) || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC3402a(act, growthPushConfig, d30Var));
    }

    /* JADX INFO: renamed from: I */
    public final void m8677I(Act act, GrowthPushConfig growthPushConfig, d30 d30Var) {
        m8683x(act, growthPushConfig, d30Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m8678J(final Act act, String str, final String str2) {
        act.duringCreated(CoreModule.c.S1.T3("accept", str).filter(new w9j() { // from class: l.n09
            public final Object call(Object obj) {
                RecallMatch recallMatch = (RecallMatch) obj;
                return Boolean.valueOf(NullChecker.a(recallMatch) && recallMatch.matched);
            }
        }).take(1).flatMap(new w9j() { // from class: l.o09
            public final Object call(Object obj) {
                return CoreModule.c.f0.ap(str2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.xz8
            public final void call(Object obj) {
                p09.m8663p(str2, act, (roj0) obj);
            }
        }, new e30() { // from class: l.yz8
            public final void call(Object obj) {
                p09.m8652e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m8679K(Act act) {
        act.duringCreated(CoreModule.c.S1.E3().filter(new w9j() { // from class: l.wz8
            public final Object call(Object obj) {
                return p09.m8650c((Boolean) obj);
            }
        }).take(1).flatMap(new w9j() { // from class: l.g09
            public final Object call(Object obj) {
                return CoreModule.c.S1.T3("back_online", "");
            }
        })).subscribe(mkd0.F());
    }

    /* JADX INFO: renamed from: L */
    public void m8680L(TabName tabName, boolean z) {
        if (!z) {
            if (NullChecker.a(this.f6788c)) {
                this.f6786a.onNext(this.f6788c);
            }
        } else if (NullChecker.a(this.f6787b) && tabName.equals(TabName.Card)) {
            this.f6787b.dismiss();
            this.f6787b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m8681u() {
        if (NullChecker.a(this.f6787b)) {
            this.f6787b = null;
        }
        this.f6786a.onCompleted();
        f6785d = null;
    }

    /* JADX INFO: renamed from: v */
    public void m8682v(TabName tabName) {
        if (!tabName.equals(TabName.Card)) {
            if (NullChecker.a(this.f6788c)) {
                this.f6786a.onNext(this.f6788c);
            }
        } else if (CoreModule.c.e0.a8() && NullChecker.a(this.f6787b)) {
            this.f6787b.dismiss();
            this.f6787b = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8683x(final Act act, final GrowthPushConfig growthPushConfig, final d30 d30Var) {
        String str;
        int iNextInt = new Random().nextInt(19) + 80;
        String str2 = m8684y(growthPushConfig.gender) ? "她" : "他";
        String str3 = "";
        if (vy8.j() && growthPushConfig.isPassive) {
            Locale locale = Locale.CHINA;
            str = String.format(locale, "%s喜欢了你，你们的匹配度高达%d%%", str2, Integer.valueOf(iNextInt));
            int i = growthPushConfig.distance;
            if (i > 0 && i < 1000) {
                str3 = String.format(locale, "%s当前在线 · 相距%skm", str2, i0g0.b.format(i / 1000.0f));
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
        if (NullChecker.a(this.f6787b) && this.f6787b.isShowing()) {
            this.f6787b.dismiss();
        }
        if (vy8.j() && growthPushConfig.isPassive) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(f6c0.N3, (ViewGroup) null), xdl0.y0(), t100.d(236.0f), false);
            this.f6787b = popupWindow;
            popupWindow.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.B(act));
            GrowthPushPopView growthPushPopView = (GrowthPushPopView) this.f6787b.getContentView().findViewById(u4c0.J6);
            if (this.f6787b == null || growthPushPopView == null || growthPushPopView.m3355a0()) {
                return;
            }
            growthPushPopView.f1954g.setTypeface(eqh0.c(3), 1);
            growthPushPopView.f1956i.setTypeface(eqh0.c(3), 1);
            growthPushPopView.f1954g.setText(str3);
            qib0.G.O(growthPushPopView.f1958k, growthPushConfig.url, 2, 10);
            growthPushPopView.f1955h.setText(str);
            xdl0.E0(growthPushPopView.f1956i, new View.OnClickListener() { // from class: l.zz8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9342a.m8685z(d30Var, growthPushConfig, view);
                }
            });
            xdl0.E0(growthPushPopView.f1953f, new View.OnClickListener() { // from class: l.a09
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2660a.m8669A(act, growthPushConfig, view);
                }
            });
            zvf0.A("e_recall_match_big_confirm", "p_recall_match_popup_big", new j760[]{vwb.Y("match_uid", growthPushConfig.f71id)});
            zvf0.x("e_recall_match_big_cancel", "p_recall_match_popup_big");
            return;
        }
        PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(f6c0.O3, (ViewGroup) null), xdl0.y0() - xdl0.w(16.0f), t100.d(72.0f), false);
        this.f6787b = popupWindow2;
        popupWindow2.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.B(act) + xdl0.w(10.0f));
        VRelative vRelativeFindViewById = this.f6787b.getContentView().findViewById(u4c0.Hb);
        if (this.f6787b == null || vRelativeFindViewById == null) {
            return;
        }
        VDraweeView vDraweeViewFindViewById = vRelativeFindViewById.findViewById(u4c0.i3);
        VText vTextFindViewById = vRelativeFindViewById.findViewById(u4c0.De);
        VText vTextFindViewById2 = vRelativeFindViewById.findViewById(u4c0.Ce);
        VImage vImageFindViewById = vRelativeFindViewById.findViewById(u4c0.A1);
        VText vTextFindViewById3 = vRelativeFindViewById.findViewById(u4c0.C0);
        vTextFindViewById.setTypeface(eqh0.c(3));
        vTextFindViewById.setText(growthPushConfig.name);
        vTextFindViewById2.setText(str);
        if (growthPushConfig.isPassive) {
            vTextFindViewById3.setTextColor(Color.parseColor("#ffffff"));
            vTextFindViewById3.setBackgroundResource(x2c0.t);
            vTextFindViewById3.setText("立即聊天");
        } else {
            vTextFindViewById3.setTextColor(Color.parseColor("#4C000000"));
            vTextFindViewById3.setText(growthPushConfig.buttonText);
            vTextFindViewById3.setBackgroundResource(x2c0.e0);
        }
        qib0.G.O(vDraweeViewFindViewById, growthPushConfig.url, 2, 10);
        xdl0.E0(vTextFindViewById3, new View.OnClickListener() { // from class: l.b09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2909a.m8670B(d30Var, growthPushConfig, act, view);
            }
        });
        xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.c09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3494a.m8671C(growthPushConfig, act, view);
            }
        });
        if (growthPushConfig.isPassive) {
            zvf0.A("e_recall_match_confirm", "p_recall_match_popup", new j760[]{vwb.Y("match_uid", growthPushConfig.f71id)});
            zvf0.x("e_recall_match_cancel", "p_recall_match_popup");
        } else {
            zvf0.A("e_match_invitation_confirm", "p_match_invitation_popup", new j760[]{vwb.Y("match_invitation_confirm_type", growthPushConfig.buttonText)});
            zvf0.x("e_match_invitation_cancel", "p_match_invitation_popup");
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8684y(Gender gender) {
        return TEnum.equals(gender, "female");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8685z(d30 d30Var, GrowthPushConfig growthPushConfig, View view) {
        if (NullChecker.a(d30Var)) {
            this.f6787b.dismiss();
            zvf0.u("e_recall_match_big_confirm", "p_recall_match_popup_big", new j760[]{vwb.Y("match_uid", growthPushConfig.f71id)});
            d30Var.call();
            this.f6787b = null;
        }
    }
}
