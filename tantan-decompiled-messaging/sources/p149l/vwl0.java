package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import p147v.VLinear;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class vwl0<D extends nnn0> implements s7m<xwl0<D>> {

    /* JADX INFO: renamed from: a */
    public final w1t f183354a = new w1t(true);

    /* JADX INFO: renamed from: b */
    public xwl0<D> f183355b;

    /* JADX INFO: renamed from: c */
    public final VirtualVoiceUserCardMedalAndNameView f183356c;

    public vwl0(VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView) {
        this.f183356c = virtualVoiceUserCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: i */
    private void m200423i(User user) {
        if (user.isHideLocationFromSVip()) {
            xdl0.m208344M(this.f183356c.f53858i, false);
        } else {
            String str = user.location.region.city;
            xdl0.m208344M(this.f183356c.f53858i, !TextUtils.isEmpty(str));
            this.f183356c.f53858i.setText(str);
        }
        String strM133876p = i0g0.m133876p(user.location.distance, true);
        xdl0.m208344M(this.f183356c.f53859j, (user.isMe() || user.isHideLocationFromSVip() || TextUtils.isEmpty(strM133876p)) ? false : true);
        this.f183356c.f53859j.setText(strM133876p);
        if (xdl0.m208349O0(this.f183356c.f53856g) && xdl0.m208349O0(this.f183356c.f53858i)) {
            xdl0.m208344M(this.f183356c.f53857h, true);
        } else {
            xdl0.m208344M(this.f183356c.f53857h, false);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183356c.f53850a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xwl0<D> xwl0Var) {
        this.f183355b = xwl0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m200425d(BLiveMedal bLiveMedal) {
        this.f183355b.m211339n4(bLiveMedal);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m200426e(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        this.f183355b.mo129310p3(3800, bLiveUserProfileConfigHierarchy.jumpScheme);
    }

    /* JADX INFO: renamed from: f */
    public void m200427f(@Nullable p1k0 p1k0Var) {
        mqv<User> mqvVar = p1k0Var == null ? null : p1k0Var.f146688c;
        if (d1t.m109678a(mqvVar).m109681d()) {
            this.f183356c.f53860k.setVisibility(8);
            this.f183356c.f53850a.setVisibility(0);
            this.f183356c.f53850a.setText(((d1t) mqvVar.m156004g()).f83297a.name);
        } else {
            if (mqvVar == null) {
                p1k0Var = null;
            }
            m200430l(p1k0Var);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m200428j(User user) {
        String string = user.gender.toString();
        int iIntValue = user.age.intValue();
        xdl0.m208344M(this.f183356c.f53851b, true);
        this.f183356c.f53852c.setBackgroundResource(TextUtils.equals(string, "male") ? i3c0.f110996ea : i3c0.f110984da);
        VLinear vLinear = this.f183356c.f53851b;
        boolean zEquals = TextUtils.equals(string, "male");
        xwl0<D> xwl0Var = this.f183355b;
        vLinear.setBackground(fce.m120425b(zEquals ? xwl0Var.act().getResources().getColor(h1c0.f105356c1) : xwl0Var.act().getResources().getColor(h1c0.f105353b1), t100.m186890d(4.0f)));
        boolean zIsHideAgeFromSVipWithOutMe = user.isHideAgeFromSVipWithOutMe();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f183356c;
        if (!zIsHideAgeFromSVipWithOutMe) {
            xdl0.m208344M(virtualVoiceUserCardMedalAndNameView.f53853d, true);
            this.f183356c.f53851b.setPadding(t100.f167252a, 0, t100.f167256e, 0);
            this.f183356c.f53853d.setText(String.valueOf(iIntValue));
        } else {
            xdl0.m208344M(virtualVoiceUserCardMedalAndNameView.f53853d, false);
            VLinear vLinear2 = this.f183356c.f53851b;
            int i = t100.f167252a;
            vLinear2.setPadding(i, 0, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m200429k(BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, User user) {
        xdl0.m208344M(this.f183356c.f53856g, false);
        if (bLiveVoiceUserProfileConfig == null || user == null) {
            return;
        }
        if (!TextUtils.equals(bLiveVoiceUserProfileConfig.relationState, "beLiked")) {
            if (TextUtils.equals(bLiveVoiceUserProfileConfig.relationState, "likeMatched")) {
                this.f183356c.f53856g.setText("相互喜欢");
                xdl0.m208344M(this.f183356c.f53856g, true);
                return;
            }
            return;
        }
        boolean zIsFemale = user.isFemale();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f183356c;
        if (zIsFemale) {
            virtualVoiceUserCardMedalAndNameView.f53856g.setText("她喜欢了你");
        } else {
            virtualVoiceUserCardMedalAndNameView.f53856g.setText("他喜欢了你");
        }
        xdl0.m208344M(this.f183356c.f53856g, true);
    }

    /* JADX INFO: renamed from: l */
    public void m200430l(@Nullable p1k0 p1k0Var) {
        mqv<User> mqvVar;
        User user = null;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM167098r = p1k0Var == null ? null : p1k0Var.m167098r();
        if (p1k0Var != null && (mqvVar = p1k0Var.f146688c) != null) {
            user = mqvVar.f135304a;
        }
        if (user == null) {
            this.f183356c.f53850a.setVisibility(8);
            this.f183356c.f53860k.setVisibility(8);
            return;
        }
        m200429k(bLiveVoiceUserProfileConfigM167098r, user);
        m200423i(user);
        String strM114327n = e0o0.m114327n(p1k0Var.m167098r().identity);
        xdl0.m208344M(this.f183356c.f53863n, !TextUtils.isEmpty(strM114327n));
        this.f183356c.f53863n.setText(strM114327n);
        this.f183356c.f53863n.setBackgroundResource(e0o0.m114326m(p1k0Var.m167098r().identity));
        xdl0.m208360X(this.f183356c.f53854e, t100.m186890d(5.0f));
        m200428j(user);
        w1t w1tVar = this.f183354a;
        Act act = getAct();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f183356c;
        w1tVar.m200966k(act, virtualVoiceUserCardMedalAndNameView.f53866q, virtualVoiceUserCardMedalAndNameView.f53867r, virtualVoiceUserCardMedalAndNameView.f53868s, virtualVoiceUserCardMedalAndNameView.f53869t);
        this.f183354a.m200980z(user, true);
        this.f183354a.m200962B(new e30() { // from class: l.twl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172402a.m200425d((BLiveMedal) obj);
            }
        });
        this.f183356c.f53850a.setText(user.name);
        this.f183356c.f53850a.setVisibility(0);
        this.f183356c.f53850a.setTextColor(Color.parseColor("#ccffffff"));
        xdl0.m208344M(this.f183356c.f53860k, true);
        xdl0.m208344M(this.f183356c.f53855f, true);
        this.f183356c.f53864o.setVisibility(8);
        m200431m(p1k0Var);
        if (xdl0.m208349O0(this.f183356c.f53856g) || xdl0.m208349O0(this.f183356c.f53858i) || xdl0.m208349O0(this.f183356c.f53859j)) {
            xdl0.m208357U(this.f183356c.f53855f, t100.m186890d(12.0f));
        } else {
            xdl0.m208357U(this.f183356c.f53855f, t100.m186890d(0.0f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m200431m(p1k0 p1k0Var) {
        if (p1k0Var.m167096p() == null) {
            xdl0.m208344M(this.f183356c.f53861l, false);
            return;
        }
        BLiveUserLevel bLiveUserLevelM167090j = p1k0Var.m167090j();
        if (bLiveUserLevelM167090j == null || TextUtils.isEmpty(bLiveUserLevelM167090j.backendUrl)) {
            xdl0.m208344M(this.f183356c.f53861l, false);
        } else {
            xdl0.m208344M(this.f183356c.f53861l, true);
            sxj.m186442c(bLiveUserLevelM167090j.backendUrl, this.f183356c.f53861l, ney.m159134a(p1k0Var.m167096p().grade) ? sxj.f166798b : sxj.f166797a);
        }
        final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchyM167094n = p1k0Var.m167094n();
        if (bLiveUserProfileConfigHierarchyM167094n == null || TextUtils.isEmpty(bLiveUserProfileConfigHierarchyM167094n.iconUrl)) {
            xdl0.m208344M(this.f183356c.f53862m, false);
            return;
        }
        xdl0.m208344M(this.f183356c.f53862m, true);
        sxj.m186442c(bLiveUserProfileConfigHierarchyM167094n.iconUrl, this.f183356c.f53862m, sxj.f166797a);
        xdl0.m208329E0(this.f183356c.f53862m, new View.OnClickListener() { // from class: l.uwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178657a.m200426e(bLiveUserProfileConfigHierarchyM167094n, view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
