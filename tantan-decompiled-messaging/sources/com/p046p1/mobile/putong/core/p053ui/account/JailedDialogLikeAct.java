package com.p046p1.mobile.putong.core.p053ui.account;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c1c0;
import p149l.c4g0;
import p149l.e30;
import p149l.e3c0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.jo0;
import p149l.mkd0;
import p149l.ojq;
import p149l.qib0;
import p149l.qqi0;
import p149l.rol;
import p149l.t100;
import p149l.tzb0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.z7c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes8.dex */
public class JailedDialogLikeAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public LinearLayout f28243c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28244d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f28245e;

    /* JADX INFO: renamed from: f */
    public VText f28246f;

    /* JADX INFO: renamed from: g */
    public VText f28247g;

    /* JADX INFO: renamed from: h */
    public VButton f28248h;

    /* JADX INFO: renamed from: i */
    public VText f28249i;

    /* JADX INFO: renamed from: j */
    public boolean f28250j;

    /* JADX INFO: renamed from: g2 */
    public static JSONObject m44183g2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m44184i2(View view) {
        m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        this.f28250j = getIntent().getBooleanExtra("CLOSE_PRE_ACT", false);
        if (xdl0.m208408w0() < 960) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f28246f.getLayoutParams();
            layoutParams.topMargin = t100.m186890d(8.0f);
            this.f28246f.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f28248h.getLayoutParams();
            layoutParams2.setMargins(t100.m186890d(12.0f), t100.m186890d(5.0f), t100.m186890d(12.0f), t100.m186890d(12.0f));
            this.f28248h.setLayoutParams(layoutParams2);
        }
        final User userMe_ = CoreModule.m29932K().me_();
        this.f28243c.setOnClickListener(new View.OnClickListener() { // from class: l.ijq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113590a.m44184i2(view);
            }
        });
        this.f28243c.setOnClickListener(null);
        if (userMe_.isBanned()) {
            this.f28245e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89012C0 : e3c0.f89123l);
            this.f28246f.setText(act().getString(R$string.f27935u));
            ((LinearLayout.LayoutParams) this.f28248h.getLayoutParams()).bottomMargin = t100.f167273v;
            this.f28248h.setText(act().getString(R$string.f27929t));
            this.f28248h.setOnClickListener(new View.OnClickListener() { // from class: l.jjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118312a.m44190k2(view);
                }
            });
            if (m44189h2()) {
                this.f28247g.setText("您好，系统检测到您的账号存在安全风险，为保护您的安全，将暂时限制您的相关社交功能使用。");
            } else if (TextUtils.isEmpty(userMe_.banStatus.text)) {
                boolean zEquals = TextUtils.equals("zh", Locale.getDefault().getLanguage());
                VText vText = this.f28247g;
                if (zEquals) {
                    vText.setText("你的账号存在违规行为，严重影响了其他用户的社交体验，现已被冻结，无法继续使用");
                } else {
                    vText.setText(R$string.f27767Q1);
                }
            } else {
                this.f28247g.setText(Html.fromHtml(userMe_.banStatus.text));
            }
            xdl0.m208344M(this.f28249i, false);
        } else {
            if (userMe_.isJailed()) {
                this.f28245e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89018E0 : e3c0.f89127m0);
                String str = userMe_.state.jailed.reason;
                this.f28246f.setText(i0g0.m133861b0(act().getString(R$string.f27818a2, str).toString(), vwb.m200324f0(str), color(c1c0.f78249f), eqh0.m117752c(2)));
            } else if (userMe_.isRestrict()) {
                this.f28245e.setImageResource(e3c0.f89010B1);
                this.f28246f.setText(R$string.f27867i3);
                this.f28248h.setText(R$string.f27872j2);
            }
            String string = act().getString(R$string.f27797W1);
            String string2 = act().getString(R$string.f27802X1);
            String string3 = act().getString(R$string.f27807Y1);
            String string4 = act().getString(R$string.f27787U1);
            this.f28247g.setText(i0g0.m133861b0((userMe_.isJailed() ? act().getString(R$string.f27792V1, string, string2, string3, string4) : act().getString(R$string.f27861h3, string2, string3, string4)).toString(), vwb.m200324f0(string, string2, string3, string4), color(c1c0.f78249f), eqh0.m117752c(2)));
            this.f28248h.setOnClickListener(new View.OnClickListener() { // from class: l.kjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123495a.m44191l2(view);
                }
            });
            m44193p2(userMe_);
            final c4g0 c4g0VarSubscribe = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ljq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128379a.m44192m2(userMe_, (Long) obj);
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.mjq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.njq
                @Override // p149l.e30
                public final void call(Object obj) {
                    c4g0VarSubscribe.unsubscribe();
                }
            }));
        }
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f28248h.setBackgroundResource(e3c0.f89117j);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public static void m44185n2() {
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(268435456);
        CoreModule.f17544b.startActivity(intent);
    }

    /* JADX INFO: renamed from: o2 */
    public static void m44186o2(boolean z) {
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) JailedDialogLikeAct.class);
        intent.putExtra("CLOSE_PRE_ACT", z);
        intent.setFlags(268435456);
        CoreModule.f17544b.startActivity(intent);
    }

    /* JADX INFO: renamed from: d2 */
    public View m44187d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ojq.m164750b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m44188e2() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null) {
                    ura.m195053e().m195057d().mo33797ag(activity);
                }
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m50458m2() {
        super.m50458m2();
        if (Build.VERSION.SDK_INT <= 34) {
            overridePendingTransition(0, tzb0.f172717d);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m44189h2() {
        CoreModule.m29932K().me_();
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44187d2 = m44187d2(layoutInflater, null);
        ViewGroup.LayoutParams layoutParams = this.f28248h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        this.f28248h.setLayoutParams(layoutParams);
        return viewM44187d2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.hjq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108106a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m44190k2(View view) {
        act().startActivity(BanDetailAct.m44111V1(act()));
        zvf0.m220396r("e_banned_warn_alert_detail", pageId());
        if (!m44189h2()) {
            m50458m2();
        }
        if (this.f28250j) {
            m44188e2();
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m44191l2(View view) {
        zvf0.m220396r("e_banned_warn_alert_detail", pageId());
        super.m50458m2();
        startActivity(CoreModule.m29932K().startMessagesAct(this.act, User.ID_TEAM_ACCOUNT, true, false));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m44192m2(User user, Long l2) {
        m44193p2(user);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m44189h2()) {
            return;
        }
        super.onBackPressed();
        if (this.f28250j) {
            m44188e2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        User userMe_ = CoreModule.m29932K().me_();
        String str = "";
        if (userMe_.isBanned()) {
            str = userMe_.banStatus.code + "";
        }
        this.pageHelper.m109039o(m44183g2("passive", "alert", "alert_special", "null", "anywhere", ChatGroupStatus.banned, str));
        super.onStartLifecycle();
    }

    /* JADX INFO: renamed from: p2 */
    public void m44193p2(User user) {
        long j;
        if (NullChecker.m81304b(user)) {
            boolean zIsJailed = user.isJailed();
            UserState userState = user.state;
            j = (long) (zIsJailed ? userState.jailed : userState.restricted).expireTime;
        } else {
            j = 0;
        }
        long jGuessedCurrentServerTime = j - qib0.f154693H.guessedCurrentServerTime();
        int i = (int) (jGuessedCurrentServerTime / 86400000);
        if (jGuessedCurrentServerTime <= 0) {
            m50458m2();
        }
        String str = i + act().getString(R$string.f27785U);
        if (i > 0) {
            jGuessedCurrentServerTime -= ((long) i) * 86400000;
        }
        String strM175934b = qqi0.m175934b(jGuessedCurrentServerTime);
        this.f28249i.setText(i0g0.m133861b0((act().getString(R$string.f27812Z1) + str + strM175934b).toString(), vwb.m200324f0(String.valueOf(i), strM175934b), color(c1c0.f78249f), eqh0.m117752c(2)));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_banned_warn_alert";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(z7c0.f202001d);
    }
}
