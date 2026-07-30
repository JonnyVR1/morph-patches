package com.p051p1.mobile.putong.core.p058ui.account;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.crl;
import p153l.egc0;
import p153l.fo0;
import p153l.gta;
import p153l.i4g0;
import p153l.j9c0;
import p153l.jyb;
import p153l.kbc0;
import p153l.kcg0;
import p153l.lyh0;
import p153l.nlq;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.tzi0;
import p153l.uqb0;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: loaded from: classes9.dex */
public class JailedDialogLikeAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public LinearLayout f29091c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f29092d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29093e;

    /* JADX INFO: renamed from: f */
    public VText f29094f;

    /* JADX INFO: renamed from: g */
    public VText f29095g;

    /* JADX INFO: renamed from: h */
    public VButton f29096h;

    /* JADX INFO: renamed from: i */
    public VText f29097i;

    /* JADX INFO: renamed from: j */
    public boolean f29098j;

    /* JADX INFO: renamed from: h2 */
    public static JSONObject m45366h2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m45367k2(View view) {
        m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        this.f29098j = getIntent().getBooleanExtra("CLOSE_PRE_ACT", false);
        if (bnl0.m105588w0() < 960) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29094f.getLayoutParams();
            layoutParams.topMargin = qa00.m175859d(8.0f);
            this.f29094f.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f29096h.getLayoutParams();
            layoutParams2.setMargins(qa00.m175859d(12.0f), qa00.m175859d(5.0f), qa00.m175859d(12.0f), qa00.m175859d(12.0f));
            this.f29096h.setLayoutParams(layoutParams2);
        }
        final User userMe_ = CoreModule.m30930K().me_();
        this.f29091c.setOnClickListener(new View.OnClickListener() { // from class: l.hlq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110526a.m45367k2(view);
            }
        });
        this.f29091c.setOnClickListener(null);
        if (userMe_.isBanned()) {
            this.f29093e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124775C0 : kbc0.f124886l);
            this.f29094f.setText(act().getString(R$string.f28783u));
            ((LinearLayout.LayoutParams) this.f29096h.getLayoutParams()).bottomMargin = qa00.f156335v;
            this.f29096h.setText(act().getString(R$string.f28777t));
            this.f29096h.setOnClickListener(new View.OnClickListener() { // from class: l.ilq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115598a.m45373l2(view);
                }
            });
            if (m45372i2()) {
                this.f29095g.setText("您好，系统检测到您的账号存在安全风险，为保护您的安全，将暂时限制您的相关社交功能使用。");
            } else if (TextUtils.isEmpty(userMe_.banStatus.text)) {
                boolean zEquals = TextUtils.equals("zh", Locale.getDefault().getLanguage());
                VText vText = this.f29095g;
                if (zEquals) {
                    vText.setText("你的账号存在违规行为，严重影响了其他用户的社交体验，现已被冻结，无法继续使用");
                } else {
                    vText.setText(R$string.f28615Q1);
                }
            } else {
                this.f29095g.setText(Html.fromHtml(userMe_.banStatus.text));
            }
            bnl0.m105524M(this.f29097i, false);
        } else {
            if (userMe_.isJailed()) {
                this.f29093e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124781E0 : kbc0.f124890m0);
                String str = userMe_.state.jailed.reason;
                this.f29094f.setText(q8g0.m175796b0(act().getString(R$string.f28666a2, str).toString(), jyb.m147507f0(str), color(j9c0.f118869f), lyh0.m156283c(2)));
            } else if (userMe_.isRestrict()) {
                this.f29093e.setImageResource(kbc0.f124773B1);
                this.f29094f.setText(R$string.f28715i3);
                this.f29096h.setText(R$string.f28720j2);
            }
            String string = act().getString(R$string.f28645W1);
            String string2 = act().getString(R$string.f28650X1);
            String string3 = act().getString(R$string.f28655Y1);
            String string4 = act().getString(R$string.f28635U1);
            this.f29095g.setText(q8g0.m175796b0((userMe_.isJailed() ? act().getString(R$string.f28640V1, string, string2, string3, string4) : act().getString(R$string.f28709h3, string2, string3, string4)).toString(), jyb.m147507f0(string, string2, string3, string4), color(j9c0.f118869f), lyh0.m156283c(2)));
            this.f29096h.setOnClickListener(new View.OnClickListener() { // from class: l.jlq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121587a.m45374m2(view);
                }
            });
            m45376q2(userMe_);
            final kcg0 kcg0VarSubscribe = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.klq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127405a.m45375n2(userMe_, (Long) obj);
                }
            }));
            lifecycle().filter(new qcj() { // from class: l.llq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.mlq
                @Override // p153l.y20
                public final void call(Object obj) {
                    kcg0VarSubscribe.unsubscribe();
                }
            }));
        }
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f29096h.setBackgroundResource(kbc0.f124880j);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static void m45368o2() {
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        CoreModule.f18263b.startActivity(intent);
    }

    /* JADX INFO: renamed from: p2 */
    public static void m45369p2(boolean z) {
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) JailedDialogLikeAct.class);
        intent.putExtra("CLOSE_PRE_ACT", z);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        CoreModule.f18263b.startActivity(intent);
    }

    /* JADX INFO: renamed from: e2 */
    public View m45370e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nlq.m163765b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m51642n2() {
        super.m51642n2();
        if (Build.VERSION.SDK_INT <= 34) {
            overridePendingTransition(0, z7c0.f203235d);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m45371g2() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null) {
                    gta.m132210e().m132214d().mo34800ag(activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m45372i2() {
        CoreModule.m30930K().me_();
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM45370e2 = m45370e2(layoutInflater, null);
        ViewGroup.LayoutParams layoutParams = this.f29096h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        this.f29096h.setLayoutParams(layoutParams);
        return viewM45370e2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.glq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104878a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m45373l2(View view) {
        act().startActivity(BanDetailAct.m45294X1(act()));
        i4g0.m138520r("e_banned_warn_alert_detail", pageId());
        if (!m45372i2()) {
            m51642n2();
        }
        if (this.f29098j) {
            m45371g2();
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m45374m2(View view) {
        i4g0.m138520r("e_banned_warn_alert_detail", pageId());
        super.m51642n2();
        startActivity(CoreModule.m30930K().startMessagesAct(this.act, User.ID_TEAM_ACCOUNT, true, false));
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m45375n2(User user, Long l2) {
        m45376q2(user);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m45372i2()) {
            return;
        }
        super.onBackPressed();
        if (this.f29098j) {
            m45371g2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        User userMe_ = CoreModule.m30930K().me_();
        String str = "";
        if (userMe_.isBanned()) {
            str = userMe_.banStatus.code + "";
        }
        this.pageHelper.m152780o(m45366h2("passive", "alert", "alert_special", "null", "anywhere", ChatGroupStatus.banned, str));
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_banned_warn_alert";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: q2 */
    public void m45376q2(User user) {
        long j;
        if (NullChecker.m82487b(user)) {
            boolean zIsJailed = user.isJailed();
            UserState userState = user.state;
            j = (long) (zIsJailed ? userState.jailed : userState.restricted).expireTime;
        } else {
            j = 0;
        }
        long jGuessedCurrentServerTime = j - uqb0.f180376H.guessedCurrentServerTime();
        int i = (int) (jGuessedCurrentServerTime / 86400000);
        if (jGuessedCurrentServerTime <= 0) {
            m51642n2();
        }
        String str = i + act().getString(R$string.f28633U);
        if (i > 0) {
            jGuessedCurrentServerTime -= ((long) i) * 86400000;
        }
        String strM193664b = tzi0.m193664b(jGuessedCurrentServerTime);
        this.f29097i.setText(q8g0.m175796b0((act().getString(R$string.f28660Z1) + str + strM193664b).toString(), jyb.m147507f0(String.valueOf(i), strM193664b), color(j9c0.f118869f), lyh0.m156283c(2)));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(egc0.f93916d);
    }
}
