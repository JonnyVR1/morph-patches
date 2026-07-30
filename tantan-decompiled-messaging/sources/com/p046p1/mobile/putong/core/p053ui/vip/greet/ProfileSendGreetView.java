package com.p046p1.mobile.putong.core.p053ui.vip.greet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.greet.hello.VerticalTextSwitcher;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendGreetView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.asa0;
import p149l.azc0;
import p149l.c1m;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.n3b0;
import p149l.o6j0;
import p149l.qib0;
import p149l.sja;
import p149l.uyk;
import p149l.v9j;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileSendGreetView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public VDraweeView f37081c;

    /* JADX INFO: renamed from: d */
    public VerticalTextSwitcher f37082d;

    /* JADX INFO: renamed from: e */
    public TextView f37083e;

    /* JADX INFO: renamed from: f */
    public Act f37084f;

    /* JADX INFO: renamed from: g */
    public User f37085g;

    /* JADX INFO: renamed from: h */
    public String f37086h;

    public ProfileSendGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m56297P(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ List m56301T(User user, Map map) {
        return (List) map.get(user.f56011id);
    }

    /* JADX INFO: renamed from: X */
    private void m56302X(String str) {
        CoreModule.f17545c.f19678r0.m34088H6(str);
    }

    private String getVasTracker() {
        if (TextUtils.equals(this.f37086h, "from_meet_picks_feed") || TextUtils.equals(this.f37086h, "from_new_meet_picks_feed") || TextUtils.equals(this.f37086h, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(this.f37086h, "from_meet_feed") || TextUtils.equals(this.f37086h, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "e_meet_card_sayhi";
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: H */
    public void mo56284H(User user, boolean z, e30<String> e30Var, v9j<String> v9jVar, final String str) {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182709a.m56307a0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m56303V(View view) {
        asa0.m98585a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public String m56304W(String str) {
        String string;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_greeting");
            if (TextUtils.isEmpty(strM79302F)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strM79302F).getString(TEnum.equals(this.f37085g.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m56305Y(Act act, final User user) {
        act.duringCreated(CoreModule.f17545c.f19678r0.m34075B5()).skip(1).map(new w9j() { // from class: l.wra0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileSendGreetView.m56301T(user, (Map) obj);
            }
        }).filter(new w9j() { // from class: l.xra0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.yra0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199659a.m56308b0((List) obj);
            }
        }, new e30() { // from class: l.zra0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileSendGreetView.m56297P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m56306Z() {
        String vasTracker = getVasTracker();
        if (!TextUtils.equals(this.f37086h, "from_meet_picks_feed") && !TextUtils.equals(this.f37086h, "from_new_meet_picks_feed") && !TextUtils.equals(this.f37086h, "from_picks") && !TextUtils.equals(this.f37086h, "from_meet_picks_card")) {
            if (!TextUtils.equals(this.f37086h, "from_new_meet_see_feed") || !n3b0.m157742q()) {
                return false;
            }
            CoreModule.m29935P().m94651a().mo33565pr(this.f37084f, "e_send_message", Privilege.see_who_likes_me);
            return true;
        }
        if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale() || azc0.m99651d().m99653c()) {
            if (azc0.m99651d().m99654e() || xma.m210044G3() || sja.m184461r3() > 0) {
                return false;
            }
            CoreModule.m29935P().m94651a().mo33366Mc(this.f37084f, vasTracker);
            return true;
        }
        if (!xma.m210047L3()) {
            if (TextUtils.equals(this.f37086h, "from_meet_picks_feed")) {
                return false;
            }
            CoreModule.m29935P().m94651a().mo33401Rm(this.f37084f, vasTracker);
            return true;
        }
        if (xma.m210044G3() || sja.m184461r3() > 0) {
            return false;
        }
        CoreModule.m29935P().m94651a().mo33366Mc(this.f37084f, vasTracker);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m56307a0(String str, View view) {
        if (NullChecker.m81303a(this.f37084f) && NullChecker.m81303a(this.f37085g)) {
            o6j0.m162861e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("is_reply", 0), j760.m140076a("is_match", 0), j760.m140076a("owner_id", this.f37085g.f56011id));
            if (m56306Z()) {
                return;
            }
            C8360d.a aVar = new C8360d.a(this.f37085g.f56011id, str);
            aVar.m45918o("p_profile,greet");
            C8360d.m45892a(this.f37084f, aVar);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m56308b0(List<RecommendMessage> list) {
        if (!CoreModule.m29934N().mo60267Co() && !vwb.m200296J(list)) {
            this.f37083e.setText(String.format("回应%s", this.f37085g.isFemale() ? "她" : "他"));
        }
        List<String> listM196293b = uyk.m196293b(list);
        if (vwb.m200296J(listM196293b)) {
            return;
        }
        this.f37082d.setTextColor(getContext().getResources().getColor(w0c0.f183839d));
        this.f37082d.setTextList(listM196293b);
        this.f37082d.m45950p();
    }

    @Override // p149l.c1m
    public TextView getEnvelopSayHai() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56303V(this);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: q */
    public void mo56287q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f37084f = act;
        this.f37085g = user;
        this.f37086h = str;
        m56305Y(act, user);
        m56302X(user.f56011id);
        VerticalTextSwitcher verticalTextSwitcher = this.f37082d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        verticalTextSwitcher.setTypeface(typeface);
        this.f37083e.setTypeface(typeface);
        this.f37083e.setText(act.getString(R$string.f18141T4));
        this.f37083e.setTextColor(Color.parseColor("#ffc318"));
        this.f37082d.setTextColor(Color.parseColor("#26000000"));
        this.f37082d.setTextSize(14.0f);
        qib0.f154691G.m102354Y0(this.f37081c, x2c0.f189500L);
        StringBuilder sb = new StringBuilder("聊聊");
        sb.append(TEnum.equals(user.gender, "female") ? "她" : "他");
        sb.append("的动态吧，更有可能得到回复");
        this.f37082d.setText(m56304W(sb.toString()));
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
