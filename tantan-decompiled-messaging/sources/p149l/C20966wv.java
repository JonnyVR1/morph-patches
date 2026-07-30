package p149l;

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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LogoutCounter;
import com.p046p1.mobile.putong.core.data.LogoutRecommendUser;
import com.p046p1.mobile.putong.core.p053ui.account.AccountRecommendAct;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Random;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.wv */
/* JADX INFO: loaded from: classes8.dex */
public class C20966wv implements s7m<C19589qv> {

    /* JADX INFO: renamed from: a */
    public VRelative f188176a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f188177b;

    /* JADX INFO: renamed from: c */
    public VText f188178c;

    /* JADX INFO: renamed from: d */
    public VText f188179d;

    /* JADX INFO: renamed from: e */
    public VText f188180e;

    /* JADX INFO: renamed from: f */
    public VText f188181f;

    /* JADX INFO: renamed from: g */
    public VText f188182g;

    /* JADX INFO: renamed from: h */
    public VText f188183h;

    /* JADX INFO: renamed from: i */
    public VRelative f188184i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f188185j;

    /* JADX INFO: renamed from: k */
    public VText f188186k;

    /* JADX INFO: renamed from: l */
    public VText f188187l;

    /* JADX INFO: renamed from: m */
    public VImage f188188m;

    /* JADX INFO: renamed from: n */
    public VRelative f188189n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f188190o;

    /* JADX INFO: renamed from: p */
    public VText f188191p;

    /* JADX INFO: renamed from: q */
    public VText f188192q;

    /* JADX INFO: renamed from: r */
    public VImage f188193r;

    /* JADX INFO: renamed from: s */
    public VLinear f188194s;

    /* JADX INFO: renamed from: t */
    public VButton f188195t;

    /* JADX INFO: renamed from: u */
    public VText f188196u;

    /* JADX INFO: renamed from: v */
    public AccountRecommendAct f188197v;

    /* JADX INFO: renamed from: w */
    public C19589qv f188198w;

    /* JADX INFO: renamed from: x */
    public User f188199x;

    public C20966wv(AccountRecommendAct accountRecommendAct) {
        this.f188197v = accountRecommendAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m205691k(View view) {
        getAct().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188197v;
    }

    /* JADX INFO: renamed from: f */
    public View m205692f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21226xv.m211237b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C19589qv c19589qv) {
        this.f188198w = c19589qv;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m205692f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m205694j() {
        xdl0.m208344M(this.f188184i, false);
        xdl0.m208344M(this.f188189n, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m205695l(User user) {
        if (NullChecker.m81303a(user)) {
            ura.m195053e().m195057d().mo33711Jk(getAct(), user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m205696m(LogoutRecommendUser logoutRecommendUser, View view) {
        m205701s(1, 1, logoutRecommendUser);
        m205699q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m205697n(LogoutRecommendUser logoutRecommendUser, View view) {
        m205701s(1, 2, logoutRecommendUser);
        m205699q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m205698p(LogoutRecommendUser logoutRecommendUser, View view) {
        m205701s(1, 1, logoutRecommendUser);
        m205699q(logoutRecommendUser);
    }

    /* JADX INFO: renamed from: q */
    public void m205699q(LogoutRecommendUser logoutRecommendUser) {
        if (TextUtils.equals("match", logoutRecommendUser.type)) {
            ura.m195053e().m195057d().mo33876l7(getAct(), logoutRecommendUser.f20436id);
            return;
        }
        if (TextUtils.equals("see", logoutRecommendUser.type)) {
            this.f188198w.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(logoutRecommendUser.f20436id)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.vv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183141a.m205695l((User) obj);
                }
            }));
            return;
        }
        if (TextUtils.equals(UnlockConversationType.quick_chat, logoutRecommendUser.type)) {
            ura.m195053e().m195057d().mo33750Si(getAct());
        } else if (TextUtils.equals("none", logoutRecommendUser.type)) {
            ura.m195053e().m195057d().mo33915rm(getAct(), "cards");
            getAct().m47815F2();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m205700r() {
        String str;
        this.f188177b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161153a.m205691k(view);
            }
        });
        this.f188180e.setTypeface(eqh0.m117752c(3), 1);
        this.f188182g.setTypeface(eqh0.m117752c(3), 1);
        User userMe_ = CoreModule.m29932K().me_();
        this.f188199x = userMe_;
        if (NullChecker.m81303a(userMe_)) {
            if (!TextUtils.isEmpty(this.f188199x.name)) {
                SpannableString spannableString = new SpannableString(String.format("亲爱的%s", this.f188199x.name));
                spannableString.setSpan(new StyleSpan(1), 3, this.f188199x.name.length() + 3, 33);
                this.f188178c.setText(spannableString);
            }
            int iNextInt = new Random().nextInt(4);
            VText vText = this.f188183h;
            if (iNextInt == 0) {
                str = "900m";
            } else {
                str = iNextInt + "km";
            }
            vText.setText(String.format("今日份心动已送达，最近的离你只有%s，快来看看%s是谁吧", str, this.f188199x.isFemale() ? "他" : "她"));
        }
        xdl0.m208344M(this.f188183h, Network.isConnected(getAct()));
        xdl0.m208344M(this.f188181f, Network.isConnected(getAct()));
        xdl0.m208329E0(this.f188196u, this.f188198w.m176680n0());
        xdl0.m208329E0(this.f188195t, this.f188198w.m176689z0());
    }

    /* JADX INFO: renamed from: s */
    public void m205701s(int i, int i2, LogoutRecommendUser logoutRecommendUser) {
        if (i == 0) {
            zvf0.m220368A("e_delete_account_chat_block_recommend_user", getAct().pageId(), new j760("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new j760("uid_report", TextUtils.isEmpty(logoutRecommendUser.f20436id) ? "" : logoutRecommendUser.f20436id), new j760("recommend_user_location", String.format("%s", Integer.valueOf(i2))));
        } else {
            zvf0.m220399u("e_delete_account_chat_block_recommend_user", getAct().pageId(), new j760("user_from_where", !TextUtils.isEmpty(logoutRecommendUser.type) ? logoutRecommendUser.type : ""), new j760("uid_report", TextUtils.isEmpty(logoutRecommendUser.f20436id) ? "" : logoutRecommendUser.f20436id), new j760("recommend_user_location", String.format("%s", Integer.valueOf(i2))));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m205702u(LogoutRecommendUser logoutRecommendUser, TextView textView, TextView textView2, VDraweeView vDraweeView, VImage vImage) {
        int i = logoutRecommendUser.age;
        if (i > 0) {
            textView2.setText(String.format("%s岁", Integer.valueOf(i)));
        }
        if (!TextUtils.isEmpty(logoutRecommendUser.name)) {
            textView.setText(logoutRecommendUser.name);
        }
        qib0.f154691G.m102335N0(vDraweeView, logoutRecommendUser.avatar, false);
        if (TextUtils.equals("none", logoutRecommendUser.type)) {
            vImage.setImageResource(e3c0.f89007A1);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: v */
    public void m205703v(LogoutCounter logoutCounter) {
        if (NullChecker.m81303a(logoutCounter) && NullChecker.m81303a(this.f188199x)) {
            if (mqi0.m155944o() - ((long) this.f188199x.createdTime) < 86400000) {
                this.f188181f.setText(String.format("您在探探的%dh，共计收获喜欢你%d人，成功配对%d人，继续滑卡更有几率找到你喜欢的那个ta哦", Long.valueOf((mqi0.m155944o() - ((long) this.f188199x.createdTime)) / 3600000), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
                return;
            }
            int i = logoutCounter.moments;
            VText vText = this.f188181f;
            if (i == 0) {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，主动出击更有几率找到你喜欢的那个ta哦", Integer.valueOf(ura.m195053e().m195057d().mo33865jt(Long.valueOf((long) this.f188199x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches)));
            } else {
                vText.setText(String.format("您在探探的%d天，共计收获喜欢你%d人，成功配对%d人，发布动态%d条，获赞%d个，收获关注%d人", Integer.valueOf(ura.m195053e().m195057d().mo33865jt(Long.valueOf((long) this.f188199x.createdTime))), Integer.valueOf(logoutCounter.liked), Integer.valueOf(logoutCounter.matches), Integer.valueOf(logoutCounter.moments), Integer.valueOf(logoutCounter.momentLiked), Integer.valueOf(logoutCounter.followers)));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m205704w(List<LogoutRecommendUser> list) {
        if (!NullChecker.m81303a(list)) {
            m205694j();
            return;
        }
        if (list.size() != 2) {
            if (list.size() == 1) {
                final LogoutRecommendUser logoutRecommendUser = list.get(0);
                m205701s(0, 1, logoutRecommendUser);
                xdl0.m208344M(this.f188189n, false);
                m205702u(logoutRecommendUser, this.f188187l, this.f188186k, this.f188185j, this.f188188m);
                xdl0.m208329E0(this.f188184i, new View.OnClickListener() { // from class: l.uv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f178488a.m205698p(logoutRecommendUser, view);
                    }
                });
                return;
            }
            return;
        }
        final LogoutRecommendUser logoutRecommendUser2 = list.get(0);
        final LogoutRecommendUser logoutRecommendUser3 = list.get(1);
        m205701s(0, 1, logoutRecommendUser2);
        m205701s(0, 2, logoutRecommendUser3);
        m205702u(logoutRecommendUser2, this.f188187l, this.f188186k, this.f188185j, this.f188188m);
        m205702u(logoutRecommendUser3, this.f188192q, this.f188191p, this.f188190o, this.f188193r);
        xdl0.m208329E0(this.f188184i, new View.OnClickListener() { // from class: l.sv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166510a.m205696m(logoutRecommendUser2, view);
            }
        });
        xdl0.m208329E0(this.f188189n, new View.OnClickListener() { // from class: l.tv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172237a.m205697n(logoutRecommendUser3, view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
