package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LogoutCounter;
import com.p051p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p051p1.mobile.putong.core.p058ui.account.AccountRecommendAct;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Random;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.qv */
/* JADX INFO: loaded from: classes9.dex */
public class C19679qv implements iam<C18277kv> {

    /* JADX INFO: renamed from: a */
    public VRelative f159659a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f159660b;

    /* JADX INFO: renamed from: c */
    public VText f159661c;

    /* JADX INFO: renamed from: d */
    public VText f159662d;

    /* JADX INFO: renamed from: e */
    public VText f159663e;

    /* JADX INFO: renamed from: f */
    public VText f159664f;

    /* JADX INFO: renamed from: g */
    public VText f159665g;

    /* JADX INFO: renamed from: h */
    public VText f159666h;

    /* JADX INFO: renamed from: i */
    public VRelative f159667i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f159668j;

    /* JADX INFO: renamed from: k */
    public VText f159669k;

    /* JADX INFO: renamed from: l */
    public VText f159670l;

    /* JADX INFO: renamed from: m */
    public VImage f159671m;

    /* JADX INFO: renamed from: n */
    public VRelative f159672n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f159673o;

    /* JADX INFO: renamed from: p */
    public VText f159674p;

    /* JADX INFO: renamed from: q */
    public VText f159675q;

    /* JADX INFO: renamed from: r */
    public VImage f159676r;

    /* JADX INFO: renamed from: s */
    public VLinear f159677s;

    /* JADX INFO: renamed from: t */
    public VButton f159678t;

    /* JADX INFO: renamed from: u */
    public VText f159679u;

    /* JADX INFO: renamed from: v */
    public AccountRecommendAct f159680v;

    /* JADX INFO: renamed from: w */
    public C18277kv f159681w;

    /* JADX INFO: renamed from: x */
    public User f159682x;

    public C19679qv(AccountRecommendAct accountRecommendAct) {
        this.f159680v = accountRecommendAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m178232k(View view) {
        getAct().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f159680v;
    }

    /* JADX INFO: renamed from: f */
    public View m178233f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19914rv.m183234b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C18277kv c18277kv) {
        this.f159681w = c18277kv;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m178233f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m178235j() {
        bnl0.m105524M(this.f159667i, false);
        bnl0.m105524M(this.f159672n, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m178236l(User user) {
        if (NullChecker.m82486a(user)) {
            gta.m132210e().m132214d().mo34714Jk(getAct(), user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m178237m(LogoutRecommendUser logoutRecommendUser, View view) {
        m178242s(1, 1, logoutRecommendUser);
        m178240q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m178238n(LogoutRecommendUser logoutRecommendUser, View view) {
        m178242s(1, 2, logoutRecommendUser);
        m178240q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m178239p(LogoutRecommendUser logoutRecommendUser, View view) {
        m178242s(1, 1, logoutRecommendUser);
        m178240q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: q */
    public void m178240q(LogoutRecommendUser logoutRecommendUser) {
        if (TextUtils.equals("match", logoutRecommendUser.type)) {
            gta.m132210e().m132214d().mo34879l7(getAct(), logoutRecommendUser.f21178id);
            return;
        }
        if (TextUtils.equals("see", logoutRecommendUser.type)) {
            this.f159681w.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(logoutRecommendUser.f21178id)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.pv
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154256a.m178236l((User) obj);
                }
            }));
            return;
        }
        if (TextUtils.equals(UnlockConversationType.quick_chat, logoutRecommendUser.type)) {
            gta.m132210e().m132214d().mo34753Si(getAct());
        } else if (TextUtils.equals("none", logoutRecommendUser.type)) {
            gta.m132210e().m132214d().mo34918rm(getAct(), "cards");
            getAct().m48999H2();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m178241r() {
        String str;
        this.f159660b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.lv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133669a.m178232k(view);
            }
        });
        this.f159663e.setTypeface(lyh0.m156283c(3), 1);
        this.f159665g.setTypeface(lyh0.m156283c(3), 1);
        User userMe_ = CoreModule.m30930K().me_();
        this.f159682x = userMe_;
        if (NullChecker.m82486a(userMe_)) {
            if (!TextUtils.isEmpty(this.f159682x.name)) {
                SpannableString spannableString = new SpannableString(String.format("亲爱的%s", this.f159682x.name));
                spannableString.setSpan(new StyleSpan(1), 3, this.f159682x.name.length() + 3, 33);
                this.f159661c.setText(spannableString);
            }
            int iNextInt = new Random().nextInt(4);
            VText vText = this.f159666h;
            if (iNextInt == 0) {
                str = "900m";
            } else {
                str = iNextInt + "km";
            }
            vText.setText(String.format("今日份心动已送达，最近的离你只有%s，快来看看%s是谁吧", str, this.f159682x.isFemale() ? "他" : "她"));
        }
        bnl0.m105524M(this.f159666h, Network.isConnected(getAct()));
        bnl0.m105524M(this.f159664f, Network.isConnected(getAct()));
        bnl0.m105509E0(this.f159679u, this.f159681w.m151637n0());
        bnl0.m105509E0(this.f159678t, this.f159681w.m151646z0());
    }

    /* JADX INFO: renamed from: s */
    public void m178242s(int i, int i2, LogoutRecommendUser logoutRecommendUser) {
        if (i == 0) {
            i4g0.m138492A("e_delete_account_chat_block_recommend_user", getAct().pageId(), new pf60("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new pf60("uid_report", TextUtils.isEmpty(logoutRecommendUser.f21178id) ? "" : logoutRecommendUser.f21178id), new pf60("recommend_user_location", String.format("%s", Integer.valueOf(i2))));
        } else {
            i4g0.m138523u("e_delete_account_chat_block_recommend_user", getAct().pageId(), new pf60("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new pf60("uid_report", TextUtils.isEmpty(logoutRecommendUser.f21178id) ? "" : logoutRecommendUser.f21178id), new pf60("recommend_user_location", String.format("%s", Integer.valueOf(i2))));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m178243u(LogoutRecommendUser logoutRecommendUser, TextView textView, TextView textView2, VDraweeView vDraweeView, VImage vImage) {
        int i = logoutRecommendUser.age;
        if (i > 0) {
            textView2.setText(String.format("%s岁", Integer.valueOf(i)));
        }
        if (!TextUtils.isEmpty(logoutRecommendUser.name)) {
            textView.setText(logoutRecommendUser.name);
        }
        uqb0.f180374G.m127119N0(vDraweeView, logoutRecommendUser.avatar, false);
        if (TextUtils.equals("none", logoutRecommendUser.type)) {
            vImage.setImageResource(kbc0.f124770A1);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: v */
    public void m178244v(LogoutCounter logoutCounter) {
        if (NullChecker.m82486a(logoutCounter) && NullChecker.m82486a(this.f159682x)) {
            if (pzi0.m174454o() - ((long) this.f159682x.createdTime) < 86400000) {
                this.f159664f.setText(String.format("您在探探的%dh，共计收获喜欢你%d人，成功配对%d人，继续滑卡更有几率找到你喜欢的那个ta哦", Long.valueOf((pzi0.m174454o() - ((long) this.f159682x.createdTime)) / 3600000), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
                return;
            }
            int i = logoutCounter.moments;
            VText vText = this.f159664f;
            if (i == 0) {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，主动出击更有几率找到你喜欢的那个ta哦", Integer.valueOf(gta.m132210e().m132214d().mo34868jt(Long.valueOf((long) this.f159682x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
            } else {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，发布动态%d条，获赞%d个，收获关注%d人", Integer.valueOf(gta.m132210e().m132214d().mo34868jt(Long.valueOf((long) this.f159682x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches), Integer.valueOf(logoutCounter.moments), Integer.valueOf(logoutCounter.momentLiked), Integer.valueOf(logoutCounter.followers)));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m178245w(List<LogoutRecommendUser> list) {
        if (!NullChecker.m82486a(list)) {
            m178235j();
            return;
        }
        if (list.size() != 2) {
            if (list.size() == 1) {
                final LogoutRecommendUser logoutRecommendUser = list.get(0);
                m178242s(0, 1, logoutRecommendUser);
                bnl0.m105524M(this.f159672n, false);
                m178243u(logoutRecommendUser, this.f159670l, this.f159669k, this.f159668j, this.f159671m);
                bnl0.m105509E0(this.f159667i, new View.OnClickListener() { // from class: l.ov
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f149224a.m178239p(logoutRecommendUser, view);
                    }
                });
                return;
            }
            return;
        }
        final LogoutRecommendUser logoutRecommendUser2 = list.get(0);
        final LogoutRecommendUser logoutRecommendUser3 = list.get(1);
        m178242s(0, 1, logoutRecommendUser2);
        m178242s(0, 2, logoutRecommendUser3);
        m178243u(logoutRecommendUser2, this.f159670l, this.f159669k, this.f159668j, this.f159671m);
        m178243u(logoutRecommendUser3, this.f159675q, this.f159674p, this.f159673o, this.f159676r);
        bnl0.m105509E0(this.f159667i, new View.OnClickListener() { // from class: l.mv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138865a.m178237m(logoutRecommendUser2, view);
            }
        });
        bnl0.m105509E0(this.f159672n, new View.OnClickListener() { // from class: l.nv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143755a.m178238n(logoutRecommendUser3, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
