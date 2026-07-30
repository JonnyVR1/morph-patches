package p007l;

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
import com.p003p1.mobile.putong.core.p006ui.account.AccountRecommendAct;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LogoutCounter;
import com.p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Random;
import l.e30;
import l.e3c0;
import l.eqh0;
import l.j760;
import l.mqi0;
import l.qib0;
import l.ura;
import l.xdl0;
import l.xv;
import l.zvf0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.wv */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0758wv implements s7m<C0677qv> {

    /* JADX INFO: renamed from: a */
    public VRelative f5053a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f5054b;

    /* JADX INFO: renamed from: c */
    public VText f5055c;

    /* JADX INFO: renamed from: d */
    public VText f5056d;

    /* JADX INFO: renamed from: e */
    public VText f5057e;

    /* JADX INFO: renamed from: f */
    public VText f5058f;

    /* JADX INFO: renamed from: g */
    public VText f5059g;

    /* JADX INFO: renamed from: h */
    public VText f5060h;

    /* JADX INFO: renamed from: i */
    public VRelative f5061i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f5062j;

    /* JADX INFO: renamed from: k */
    public VText f5063k;

    /* JADX INFO: renamed from: l */
    public VText f5064l;

    /* JADX INFO: renamed from: m */
    public VImage f5065m;

    /* JADX INFO: renamed from: n */
    public VRelative f5066n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f5067o;

    /* JADX INFO: renamed from: p */
    public VText f5068p;

    /* JADX INFO: renamed from: q */
    public VText f5069q;

    /* JADX INFO: renamed from: r */
    public VImage f5070r;

    /* JADX INFO: renamed from: s */
    public VLinear f5071s;

    /* JADX INFO: renamed from: t */
    public VButton f5072t;

    /* JADX INFO: renamed from: u */
    public VText f5073u;

    /* JADX INFO: renamed from: v */
    public AccountRecommendAct f5074v;

    /* JADX INFO: renamed from: w */
    public C0677qv f5075w;

    /* JADX INFO: renamed from: x */
    public User f5076x;

    public C0758wv(AccountRecommendAct accountRecommendAct) {
        this.f5074v = accountRecommendAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m11375k(View view) {
        act().onBackPressed();
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f5074v;
    }

    /* JADX INFO: renamed from: f */
    public View m11376f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xv.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0677qv c0677qv) {
        this.f5075w = c0677qv;
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11376f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m11378j() {
        xdl0.M(this.f5061i, false);
        xdl0.M(this.f5066n, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11379l(User user) {
        if (NullChecker.a(user)) {
            ura.e().d().Jk(act(), user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11380m(LogoutRecommendUser logoutRecommendUser, View view) {
        m11385s(1, 1, logoutRecommendUser);
        m11383q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11381n(LogoutRecommendUser logoutRecommendUser, View view) {
        m11385s(1, 2, logoutRecommendUser);
        m11383q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11382p(LogoutRecommendUser logoutRecommendUser, View view) {
        m11385s(1, 1, logoutRecommendUser);
        m11383q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: q */
    public void m11383q(LogoutRecommendUser logoutRecommendUser) {
        if (TextUtils.equals("match", logoutRecommendUser.type)) {
            ura.e().d().l7(act(), logoutRecommendUser.id);
            return;
        }
        if (TextUtils.equals("see", logoutRecommendUser.type)) {
            this.f5075w.duringCreated(CoreModule.c.e0.Ka(logoutRecommendUser.id)).take(1).subscribe(mkd0.m9874G(new e30() { // from class: l.vv
                public final void call(Object obj) {
                    this.f4994a.m11379l((User) obj);
                }
            }));
            return;
        }
        if (TextUtils.equals("quick_chat", logoutRecommendUser.type)) {
            ura.e().d().Si(act());
        } else if (TextUtils.equals("none", logoutRecommendUser.type)) {
            ura.e().d().rm(act(), "cards");
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11384r() {
        String str;
        this.f5054b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4094a.m11375k(view);
            }
        });
        this.f5057e.setTypeface(eqh0.c(3), 1);
        this.f5059g.setTypeface(eqh0.c(3), 1);
        User userMe_ = CoreModule.K().me_();
        this.f5076x = userMe_;
        if (NullChecker.a(userMe_)) {
            if (!TextUtils.isEmpty(this.f5076x.name)) {
                SpannableString spannableString = new SpannableString(String.format("亲爱的%s", this.f5076x.name));
                spannableString.setSpan(new StyleSpan(1), 3, this.f5076x.name.length() + 3, 33);
                this.f5055c.setText(spannableString);
            }
            int iNextInt = new Random().nextInt(4);
            VText vText = this.f5060h;
            if (iNextInt == 0) {
                str = "900m";
            } else {
                str = iNextInt + "km";
            }
            vText.setText(String.format("今日份心动已送达，最近的离你只有%s，快来看看%s是谁吧", str, this.f5076x.isFemale() ? "他" : "她"));
        }
        xdl0.M(this.f5060h, Network.isConnected(act()));
        xdl0.M(this.f5058f, Network.isConnected(act()));
        xdl0.E0(this.f5073u, this.f5075w.m10479n0());
        xdl0.E0(this.f5072t, this.f5075w.m10488z0());
    }

    /* JADX INFO: renamed from: s */
    public void m11385s(int i, int i2, LogoutRecommendUser logoutRecommendUser) {
        if (i == 0) {
            zvf0.A("e_delete_account_chat_block_recommend_user", act().pageId(), new j760[]{new j760("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new j760("uid_report", TextUtils.isEmpty(logoutRecommendUser.id) ? "" : logoutRecommendUser.id), new j760("recommend_user_location", String.format("%s", Integer.valueOf(i2)))});
        } else {
            zvf0.u("e_delete_account_chat_block_recommend_user", act().pageId(), new j760[]{new j760("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new j760("uid_report", TextUtils.isEmpty(logoutRecommendUser.id) ? "" : logoutRecommendUser.id), new j760("recommend_user_location", String.format("%s", Integer.valueOf(i2)))});
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11386u(LogoutRecommendUser logoutRecommendUser, TextView textView, TextView textView2, VDraweeView vDraweeView, VImage vImage) {
        int i = logoutRecommendUser.age;
        if (i > 0) {
            textView2.setText(String.format("%s岁", Integer.valueOf(i)));
        }
        if (!TextUtils.isEmpty(logoutRecommendUser.name)) {
            textView.setText(logoutRecommendUser.name);
        }
        qib0.G.N0(vDraweeView, logoutRecommendUser.avatar, false);
        if (TextUtils.equals("none", logoutRecommendUser.type)) {
            vImage.setImageResource(e3c0.A1);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: v */
    public void m11387v(LogoutCounter logoutCounter) {
        if (NullChecker.a(logoutCounter) && NullChecker.a(this.f5076x)) {
            if (mqi0.o() - ((long) this.f5076x.createdTime) < 86400000) {
                this.f5058f.setText(String.format("您在探探的%dh，共计收获喜欢你%d人，成功配对%d人，继续滑卡更有几率找到你喜欢的那个ta哦", Long.valueOf((mqi0.o() - ((long) this.f5076x.createdTime)) / 3600000), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
                return;
            }
            int i = logoutCounter.moments;
            VText vText = this.f5058f;
            if (i == 0) {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，主动出击更有几率找到你喜欢的那个ta哦", Integer.valueOf(ura.e().d().jt(Long.valueOf((long) this.f5076x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
            } else {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，发布动态%d条，获赞%d个，收获关注%d人", Integer.valueOf(ura.e().d().jt(Long.valueOf((long) this.f5076x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches), Integer.valueOf(logoutCounter.moments), Integer.valueOf(logoutCounter.momentLiked), Integer.valueOf(logoutCounter.followers)));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11388w(List<LogoutRecommendUser> list) {
        if (!NullChecker.a(list)) {
            m11378j();
            return;
        }
        if (list.size() != 2) {
            if (list.size() == 1) {
                final LogoutRecommendUser logoutRecommendUser = list.get(0);
                m11385s(0, 1, logoutRecommendUser);
                xdl0.M(this.f5066n, false);
                m11386u(logoutRecommendUser, this.f5064l, this.f5063k, this.f5062j, this.f5065m);
                xdl0.E0(this.f5061i, new View.OnClickListener() { // from class: l.uv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f4937a.m11382p(logoutRecommendUser, view);
                    }
                });
                return;
            }
            return;
        }
        final LogoutRecommendUser logoutRecommendUser2 = list.get(0);
        final LogoutRecommendUser logoutRecommendUser3 = list.get(1);
        m11385s(0, 1, logoutRecommendUser2);
        m11385s(0, 2, logoutRecommendUser3);
        m11386u(logoutRecommendUser2, this.f5064l, this.f5063k, this.f5062j, this.f5065m);
        m11386u(logoutRecommendUser3, this.f5069q, this.f5068p, this.f5067o, this.f5070r);
        xdl0.E0(this.f5061i, new View.OnClickListener() { // from class: l.sv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4185a.m11380m(logoutRecommendUser2, view);
            }
        });
        xdl0.E0(this.f5066n, new View.OnClickListener() { // from class: l.tv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4446a.m11381n(logoutRecommendUser3, view);
            }
        });
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
