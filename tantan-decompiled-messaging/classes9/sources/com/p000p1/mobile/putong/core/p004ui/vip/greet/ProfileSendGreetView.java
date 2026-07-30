package com.p000p1.mobile.putong.core.p004ui.vip.greet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.greet.ProfileSendGreetView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.greet.hello.VerticalTextSwitcher;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.asa0;
import l.e30;
import l.j760;
import l.mkd0;
import l.n3b0;
import l.o6j0;
import l.uyk;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.azc0;
import p006l.c1m;
import p006l.qib0;
import p006l.sja;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileSendGreetView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public VDraweeView f6862c;

    /* JADX INFO: renamed from: d */
    public VerticalTextSwitcher f6863d;

    /* JADX INFO: renamed from: e */
    public TextView f6864e;

    /* JADX INFO: renamed from: f */
    public Act f6865f;

    /* JADX INFO: renamed from: g */
    public User f6866g;

    /* JADX INFO: renamed from: h */
    public String f6867h;

    public ProfileSendGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m9731P(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ List m9735T(User user, Map map) {
        return (List) map.get(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: X */
    private void m9736X(String str) {
        CoreModule.f1534c.f3667r0.m6025H6(str);
    }

    private String getVasTracker() {
        if (TextUtils.equals(this.f6867h, "from_meet_picks_feed") || TextUtils.equals(this.f6867h, "from_new_meet_picks_feed") || TextUtils.equals(this.f6867h, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(this.f6867h, "from_meet_feed") || TextUtils.equals(this.f6867h, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "e_meet_card_sayhi";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.c1m
    /* JADX INFO: renamed from: H */
    public void mo9718H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, final String str) {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.vra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24428a.m9741a0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m9737V(View view) {
        asa0.a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public String m9738W(String str) {
        String string;
        try {
            String strF = RemoteConfig.x().F("moment_greeting");
            if (TextUtils.isEmpty(strF)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strF).getString(TEnum.equals(this.f6866g.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m9739Y(Act act, final User user) {
        act.duringCreated(CoreModule.f1534c.f3667r0.m6012B5()).skip(1).map(new w9j() { // from class: l.wra0
            public final Object call(Object obj) {
                return ProfileSendGreetView.m9735T(user, (Map) obj);
            }
        }).filter(new w9j() { // from class: l.xra0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.yra0
            public final void call(Object obj) {
                this.f28356a.m9742b0((List) obj);
            }
        }, new e30() { // from class: l.zra0
            public final void call(Object obj) {
                ProfileSendGreetView.m9731P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m9740Z() {
        String vasTracker = getVasTracker();
        if (!TextUtils.equals(this.f6867h, "from_meet_picks_feed") && !TextUtils.equals(this.f6867h, "from_new_meet_picks_feed") && !TextUtils.equals(this.f6867h, "from_picks") && !TextUtils.equals(this.f6867h, "from_meet_picks_card")) {
            if (!TextUtils.equals(this.f6867h, "from_new_meet_see_feed") || !n3b0.q()) {
                return false;
            }
            CoreModule.m1854P().m11706a().m5502pr(this.f6865f, "e_send_message", Privilege.see_who_likes_me);
            return true;
        }
        if (!CoreModule.f1534c.f3628e0.m21490p9().isFemale() || azc0.m12352d().m12354c()) {
            if (azc0.m12352d().m12355e() || xma.m27352G3() || sja.m23841r3() > 0) {
                return false;
            }
            CoreModule.m1854P().m11706a().m5303Mc(this.f6865f, vasTracker);
            return true;
        }
        if (!xma.m27355L3()) {
            if (TextUtils.equals(this.f6867h, "from_meet_picks_feed")) {
                return false;
            }
            CoreModule.m1854P().m11706a().m5338Rm(this.f6865f, vasTracker);
            return true;
        }
        if (xma.m27352G3() || sja.m23841r3() > 0) {
            return false;
        }
        CoreModule.m1854P().m11706a().m5303Mc(this.f6865f, vasTracker);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m9741a0(String str, View view) {
        if (NullChecker.a(this.f6865f) && NullChecker.a(this.f6866g)) {
            o6j0.e("e_send_message", "p_suggest_user_profile_info_view", new j760[]{j760.a("is_reply", 0), j760.a("is_match", 0), j760.a("owner_id", ((DbObject) this.f6866g).id)});
            if (m9740Z()) {
                return;
            }
            d.a aVar = new d.a(((DbObject) this.f6866g).id, str);
            aVar.o("p_profile,greet");
            d.a(this.f6865f, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m9742b0(List<RecommendMessage> list) {
        if (!CoreModule.m1853N().Co() && !vwb.J(list)) {
            this.f6864e.setText(String.format("回应%s", this.f6866g.isFemale() ? "她" : "他"));
        }
        List listB = uyk.b(list);
        if (vwb.J(listB)) {
            return;
        }
        this.f6863d.setTextColor(getContext().getResources().getColor(w0c0.f24679d));
        this.f6863d.setTextList(listB);
        this.f6863d.p();
    }

    @Override // p006l.c1m
    public TextView getEnvelopSayHai() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9737V(this);
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: q */
    public void mo9721q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f6865f = act;
        this.f6866g = user;
        this.f6867h = str;
        m9739Y(act, user);
        m9736X(((DbObject) user).id);
        VerticalTextSwitcher verticalTextSwitcher = this.f6863d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        verticalTextSwitcher.setTypeface(typeface);
        this.f6864e.setTypeface(typeface);
        this.f6864e.setText(act.getString(R$string.f2130T4));
        this.f6864e.setTextColor(Color.parseColor("#ffc318"));
        this.f6863d.setTextColor(Color.parseColor("#26000000"));
        this.f6863d.setTextSize(14.0f);
        qib0.f19782G.m12767Y0(this.f6862c, x2c0.f26036L);
        StringBuilder sb = new StringBuilder("聊聊");
        sb.append(TEnum.equals(user.gender, "female") ? "她" : "他");
        sb.append("的动态吧，更有可能得到回复");
        this.f6863d.setText(m9738W(sb.toString()));
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
