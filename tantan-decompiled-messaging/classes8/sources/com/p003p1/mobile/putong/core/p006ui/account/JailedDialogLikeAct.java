package com.p003p1.mobile.putong.core.p006ui.account;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.c1c0;
import l.c4g0;
import l.e30;
import l.e3c0;
import l.eqh0;
import l.i0g0;
import l.jo0;
import l.ojq;
import l.qib0;
import l.qqi0;
import l.rol;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.z7c0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.mkd0;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class JailedDialogLikeAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public LinearLayout f1814c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1815d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1816e;

    /* JADX INFO: renamed from: f */
    public VText f1817f;

    /* JADX INFO: renamed from: g */
    public VText f1818g;

    /* JADX INFO: renamed from: h */
    public VButton f1819h;

    /* JADX INFO: renamed from: i */
    public VText f1820i;

    /* JADX INFO: renamed from: j */
    public boolean f1821j;

    /* JADX INFO: renamed from: g2 */
    public static JSONObject m8533g2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ban_type", str7);
            jSONObject.put("tooltips_trigger_mode", str);
            jSONObject.put("tooltips_type", str2);
            jSONObject.put("tooltips_type_ui", str3);
            jSONObject.put("tooltips_trigger_module", str4);
            jSONObject.put("tooltips_trigger_page", str5);
            jSONObject.put("tooltips_trigger_reason", str6);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m8534i2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        this.f1821j = getIntent().getBooleanExtra("CLOSE_PRE_ACT", false);
        if (xdl0.w0() < 960) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1817f.getLayoutParams();
            layoutParams.topMargin = t100.d(8.0f);
            this.f1817f.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1819h.getLayoutParams();
            layoutParams2.setMargins(t100.d(12.0f), t100.d(5.0f), t100.d(12.0f), t100.d(12.0f));
            this.f1819h.setLayoutParams(layoutParams2);
        }
        final User userMe_ = CoreModule.K().me_();
        this.f1814c.setOnClickListener(new View.OnClickListener() { // from class: l.ijq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2916a.m8534i2(view);
            }
        });
        this.f1814c.setOnClickListener(null);
        if (userMe_.isBanned()) {
            this.f1816e.setImageResource(ura.e().d().I4() ? e3c0.C0 : e3c0.l);
            this.f1817f.setText(act().getString(R.string.u));
            ((LinearLayout.LayoutParams) this.f1819h.getLayoutParams()).bottomMargin = t100.v;
            this.f1819h.setText(act().getString(R.string.t));
            this.f1819h.setOnClickListener(new View.OnClickListener() { // from class: l.jjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2996a.m8540k2(view);
                }
            });
            if (m8539h2()) {
                this.f1818g.setText("您好，系统检测到您的账号存在安全风险，为保护您的安全，将暂时限制您的相关社交功能使用。");
            } else if (TextUtils.isEmpty(userMe_.banStatus.text)) {
                boolean zEquals = TextUtils.equals("zh", Locale.getDefault().getLanguage());
                VText vText = this.f1818g;
                if (zEquals) {
                    vText.setText("你的账号存在违规行为，严重影响了其他用户的社交体验，现已被冻结，无法继续使用");
                } else {
                    vText.setText(R.string.Q1);
                }
            } else {
                this.f1818g.setText(Html.fromHtml(userMe_.banStatus.text));
            }
            xdl0.M(this.f1820i, false);
        } else {
            if (userMe_.isJailed()) {
                this.f1816e.setImageResource(ura.e().d().I4() ? e3c0.E0 : e3c0.m0);
                String str = userMe_.state.jailed.reason;
                this.f1817f.setText(i0g0.b0(act().getString(R.string.a2, str).toString(), vwb.f0(new String[]{str}), color(c1c0.f), eqh0.c(2)));
            } else if (userMe_.isRestrict()) {
                this.f1816e.setImageResource(e3c0.B1);
                this.f1817f.setText(R.string.i3);
                this.f1819h.setText(R.string.j2);
            }
            String string = act().getString(R.string.W1);
            String string2 = act().getString(R.string.X1);
            String string3 = act().getString(R.string.Y1);
            String string4 = act().getString(R.string.U1);
            this.f1818g.setText(i0g0.b0((userMe_.isJailed() ? act().getString(R.string.V1, string, string2, string3, string4) : act().getString(R.string.h3, string2, string3, string4)).toString(), vwb.f0(new String[]{string, string2, string3, string4}), color(c1c0.f), eqh0.c(2)));
            this.f1819h.setOnClickListener(new View.OnClickListener() { // from class: l.kjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3074a.m8541l2(view);
                }
            });
            m8543p2(userMe_);
            final c4g0 c4g0VarSubscribe = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.m9874G(new e30() { // from class: l.ljq
                public final void call(Object obj) {
                    this.f3233a.m8542m2(userMe_, (Long) obj);
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.mjq
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C0231c) obj) == C0231c.f1251m);
                }
            }).subscribe(mkd0.m9874G(new e30() { // from class: l.njq
                public final void call(Object obj) {
                    c4g0VarSubscribe.unsubscribe();
                }
            }));
        }
        if (ura.e().d().I4()) {
            this.f1819h.setBackgroundResource(e3c0.j);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public static void m8535n2() {
        Intent intent = new Intent(CoreModule.b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(268435456);
        CoreModule.b.startActivity(intent);
    }

    /* JADX INFO: renamed from: o2 */
    public static void m8536o2(boolean z) {
        Intent intent = new Intent(CoreModule.b, (Class<?>) JailedDialogLikeAct.class);
        intent.putExtra("CLOSE_PRE_ACT", z);
        intent.setFlags(268435456);
        CoreModule.b.startActivity(intent);
    }

    /* JADX INFO: renamed from: d2 */
    public View m8537d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ojq.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m8538e2() {
        Iterator<ArrayList<Act.C0211r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C0211r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f1042a.get();
                if (activity != null) {
                    ura.e().d().ag(activity);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.lambda$debugItems$19();
        if (Build.VERSION.SDK_INT <= 34) {
            overridePendingTransition(0, tzb0.d);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m8539h2() {
        CoreModule.K().me_();
        return false;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8537d2 = m8537d2(layoutInflater, null);
        ViewGroup.LayoutParams layoutParams = this.f1819h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        this.f1819h.setLayoutParams(layoutParams);
        return viewM8537d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.hjq
            public final void call(Object obj) {
                this.f2844a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m8540k2(View view) {
        act().startActivity(BanDetailAct.m8459V1(act()));
        zvf0.r("e_banned_warn_alert_detail", pageId());
        if (!m8539h2()) {
            finish();
        }
        if (this.f1821j) {
            m8538e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m8541l2(View view) {
        zvf0.r("e_banned_warn_alert_detail", pageId());
        super/*com.p1.mobile.android.app.Act*/.lambda$debugItems$19();
        startActivity(CoreModule.K().startMessagesAct(this.act, "-1", true, false));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m8542m2(User user, Long l2) {
        m8543p2(user);
    }

    public void onBackPressed() {
        if (m8539h2()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        if (this.f1821j) {
            m8538e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStartLifecycle() {
        User userMe_ = CoreModule.K().me_();
        String str = "";
        if (userMe_.isBanned()) {
            str = userMe_.banStatus.code + "";
        }
        ((PutongAct) this).pageHelper.o(m8533g2("passive", "alert", "alert_special", "null", "anywhere", "banned", str));
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p2 */
    public void m8543p2(User user) {
        long j;
        if (NullChecker.b(user)) {
            boolean zIsJailed = user.isJailed();
            UserState userState = user.state;
            j = (long) (zIsJailed ? userState.jailed : userState.restricted).expireTime;
        } else {
            j = 0;
        }
        long jGuessedCurrentServerTime = j - qib0.H.guessedCurrentServerTime();
        int i = (int) (jGuessedCurrentServerTime / 86400000);
        if (jGuessedCurrentServerTime <= 0) {
            finish();
        }
        String str = i + act().getString(R.string.U);
        if (i > 0) {
            jGuessedCurrentServerTime -= ((long) i) * 86400000;
        }
        String strB = qqi0.b(jGuessedCurrentServerTime);
        this.f1820i.setText(i0g0.b0((act().getString(R.string.Z1) + str + strB).toString(), vwb.f0(new String[]{String.valueOf(i), strB}), color(c1c0.f), eqh0.c(2)));
    }

    public String pageId() {
        return "p_banned_warn_alert";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }

    public void setTheme() {
        setTheme(z7c0.d);
    }
}
