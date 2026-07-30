package com.p051p1.mobile.putong.core.p058ui.vip.greet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.greet.hello.VerticalTextSwitcher;
import com.p051p1.mobile.putong.core.p058ui.vip.greet.ProfileSendGreetView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.c9c0;
import p153l.d7d0;
import p153l.dbc0;
import p153l.e0b0;
import p153l.ela;
import p153l.joa;
import p153l.jyb;
import p153l.k1l;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.v3m;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileSendGreetView extends VLinear implements v3m {

    /* JADX INFO: renamed from: c */
    public VDraweeView f37929c;

    /* JADX INFO: renamed from: d */
    public VerticalTextSwitcher f37930d;

    /* JADX INFO: renamed from: e */
    public TextView f37931e;

    /* JADX INFO: renamed from: f */
    public Act f37932f;

    /* JADX INFO: renamed from: g */
    public User f37933g;

    /* JADX INFO: renamed from: h */
    public String f37934h;

    public ProfileSendGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m57480P(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ List m57484T(User user, Map map) {
        return (List) map.get(user.f56859id);
    }

    /* JADX INFO: renamed from: X */
    private void m57485X(String str) {
        CoreModule.f18264c.f20420r0.m35091H6(str);
    }

    private String getVasTracker() {
        if (TextUtils.equals(this.f37934h, "from_meet_picks_feed") || TextUtils.equals(this.f37934h, "from_new_meet_picks_feed") || TextUtils.equals(this.f37934h, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(this.f37934h, "from_meet_feed") || TextUtils.equals(this.f37934h, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "e_meet_card_sayhi";
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: H */
    public void mo57467H(User user, boolean z, y20<String> y20Var, pcj<String> pcjVar, final String str) {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.zza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206685a.m57490a0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m57486V(View view) {
        e0b0.m118833a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public String m57487W(String str) {
        String string;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_greeting");
            if (TextUtils.isEmpty(strM80485F)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strM80485F).getString(TEnum.equals(this.f37933g.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m57488Y(Act act, final User user) {
        act.duringCreated(CoreModule.f18264c.f20420r0.m35078B5()).skip(1).map(new qcj() { // from class: l.a0b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileSendGreetView.m57484T(user, (Map) obj);
            }
        }).filter(new qcj() { // from class: l.b0b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.c0b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79246a.m57491b0((List) obj);
            }
        }, new y20() { // from class: l.d0b0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileSendGreetView.m57480P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m57489Z() {
        String vasTracker = getVasTracker();
        if (!TextUtils.equals(this.f37934h, "from_meet_picks_feed") && !TextUtils.equals(this.f37934h, "from_new_meet_picks_feed") && !TextUtils.equals(this.f37934h, "from_picks") && !TextUtils.equals(this.f37934h, "from_meet_picks_card")) {
            if (!TextUtils.equals(this.f37934h, "from_new_meet_see_feed") || !rbb0.m180744q()) {
                return false;
            }
            CoreModule.m30933P().m143405a().mo34568pr(this.f37932f, "e_send_message", Privilege.see_who_likes_me);
            return true;
        }
        if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale() || d7d0.m114719d().m114721c()) {
            if (d7d0.m114719d().m114722e() || joa.m146358H3() || ela.m121122r3() > 0) {
                return false;
            }
            CoreModule.m30933P().m143405a().mo34369Mc(this.f37932f, vasTracker);
            return true;
        }
        if (!joa.m146361M3()) {
            if (TextUtils.equals(this.f37934h, "from_meet_picks_feed")) {
                return false;
            }
            CoreModule.m30933P().m143405a().mo34404Rm(this.f37932f, vasTracker);
            return true;
        }
        if (joa.m146358H3() || ela.m121122r3() > 0) {
            return false;
        }
        CoreModule.m30933P().m143405a().mo34369Mc(this.f37932f, vasTracker);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m57490a0(String str, View view) {
        if (NullChecker.m82486a(this.f37932f) && NullChecker.m82486a(this.f37933g)) {
            sfj0.m185598e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("is_reply", 0), pf60.m172085a("is_match", 0), pf60.m172085a("owner_id", this.f37933g.f56859id));
            if (m57489Z()) {
                return;
            }
            C8523d.a aVar = new C8523d.a(this.f37933g.f56859id, str);
            aVar.m47101o("p_profile,greet");
            C8523d.m47075a(this.f37932f, aVar);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m57491b0(List<RecommendMessage> list) {
        if (!CoreModule.m30932N().mo61451Co() && !jyb.m147479J(list)) {
            this.f37931e.setText(String.format("回应%s", this.f37933g.isFemale() ? "她" : "他"));
        }
        List<String> listM147865b = k1l.m147865b(list);
        if (jyb.m147479J(listM147865b)) {
            return;
        }
        this.f37930d.setTextColor(getContext().getResources().getColor(c9c0.f80408d));
        this.f37930d.setTextList(listM147865b);
        this.f37930d.m47133p();
    }

    @Override // p153l.v3m
    public TextView getEnvelopSayHai() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57486V(this);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: q */
    public void mo57470q(Act act, String str, User user, pcj<String> pcjVar, String str2) {
        this.f37932f = act;
        this.f37933g = user;
        this.f37934h = str;
        m57488Y(act, user);
        m57485X(user.f56859id);
        VerticalTextSwitcher verticalTextSwitcher = this.f37930d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        verticalTextSwitcher.setTypeface(typeface);
        this.f37931e.setTypeface(typeface);
        this.f37931e.setText(act.getString(R$string.f18931V4));
        this.f37931e.setTextColor(Color.parseColor("#ffc318"));
        this.f37930d.setTextColor(Color.parseColor("#26000000"));
        this.f37930d.setTextSize(14.0f);
        uqb0.f180374G.m127138Y0(this.f37929c, dbc0.f86360M);
        StringBuilder sb = new StringBuilder("聊聊");
        sb.append(TEnum.equals(user.gender, "female") ? "她" : "他");
        sb.append("的动态吧，更有可能得到回复");
        this.f37930d.setText(m57487W(sb.toString()));
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
