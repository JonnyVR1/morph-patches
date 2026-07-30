package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import p151v.VLinear;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class z5m0<D extends rwn0> implements iam<b6m0<D>> {

    /* JADX INFO: renamed from: a */
    public final x3t f203069a = new x3t(true);

    /* JADX INFO: renamed from: b */
    public b6m0<D> f203070b;

    /* JADX INFO: renamed from: c */
    public final VirtualVoiceUserCardMedalAndNameView f203071c;

    public z5m0(VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView) {
        this.f203071c = virtualVoiceUserCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: i */
    private void m218711i(User user) {
        if (user.isHideLocationFromSVip()) {
            bnl0.m105524M(this.f203071c.f54706i, false);
        } else {
            String str = user.location.region.city;
            bnl0.m105524M(this.f203071c.f54706i, !TextUtils.isEmpty(str));
            this.f203071c.f54706i.setText(str);
        }
        String strM175811p = q8g0.m175811p(user.location.distance, true);
        bnl0.m105524M(this.f203071c.f54707j, (user.isMe() || user.isHideLocationFromSVip() || TextUtils.isEmpty(strM175811p)) ? false : true);
        this.f203071c.f54707j.setText(strM175811p);
        if (bnl0.m105529O0(this.f203071c.f54704g) && bnl0.m105529O0(this.f203071c.f54706i)) {
            bnl0.m105524M(this.f203071c.f54705h, true);
        } else {
            bnl0.m105524M(this.f203071c.f54705h, false);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203071c.f54698a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b6m0<D> b6m0Var) {
        this.f203070b = b6m0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m218713d(BLiveMedal bLiveMedal) {
        this.f203070b.m102772n4(bLiveMedal);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m218714e(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        this.f203070b.mo138869p3(3800, bLiveUserProfileConfigHierarchy.jumpScheme);
    }

    /* JADX INFO: renamed from: f */
    public void m218715f(@Nullable vak0 vak0Var) {
        nsv<User> nsvVar = vak0Var == null ? null : vak0Var.f183108c;
        if (e3t.m119319a(nsvVar).m119322d()) {
            this.f203071c.f54708k.setVisibility(8);
            this.f203071c.f54698a.setVisibility(0);
            this.f203071c.f54698a.setText(((e3t) nsvVar.m164642g()).f91997a.name);
        } else {
            if (nsvVar == null) {
                vak0Var = null;
            }
            m218718l(vak0Var);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m218716j(User user) {
        String string = user.gender.toString();
        int iIntValue = user.age.intValue();
        bnl0.m105524M(this.f203071c.f54699b, true);
        this.f203071c.f54700c.setBackgroundResource(TextUtils.equals(string, "male") ? obc0.f146324ea : obc0.f146312da);
        VLinear vLinear = this.f203071c.f54699b;
        boolean zEquals = TextUtils.equals(string, "male");
        b6m0<D> b6m0Var = this.f203070b;
        vLinear.setBackground(jde.m144406b(zEquals ? b6m0Var.act().getResources().getColor(n9c0.f140817c1) : b6m0Var.act().getResources().getColor(n9c0.f140814b1), qa00.m175859d(4.0f)));
        boolean zIsHideAgeFromSVipWithOutMe = user.isHideAgeFromSVipWithOutMe();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f203071c;
        if (!zIsHideAgeFromSVipWithOutMe) {
            bnl0.m105524M(virtualVoiceUserCardMedalAndNameView.f54701d, true);
            this.f203071c.f54699b.setPadding(qa00.f156314a, 0, qa00.f156318e, 0);
            this.f203071c.f54701d.setText(String.valueOf(iIntValue));
        } else {
            bnl0.m105524M(virtualVoiceUserCardMedalAndNameView.f54701d, false);
            VLinear vLinear2 = this.f203071c.f54699b;
            int i = qa00.f156314a;
            vLinear2.setPadding(i, 0, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m218717k(BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, User user) {
        bnl0.m105524M(this.f203071c.f54704g, false);
        if (bLiveVoiceUserProfileConfig == null || user == null) {
            return;
        }
        if (!TextUtils.equals(bLiveVoiceUserProfileConfig.relationState, "beLiked")) {
            if (TextUtils.equals(bLiveVoiceUserProfileConfig.relationState, "likeMatched")) {
                this.f203071c.f54704g.setText("相互喜欢");
                bnl0.m105524M(this.f203071c.f54704g, true);
                return;
            }
            return;
        }
        boolean zIsFemale = user.isFemale();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f203071c;
        if (zIsFemale) {
            virtualVoiceUserCardMedalAndNameView.f54704g.setText("她喜欢了你");
        } else {
            virtualVoiceUserCardMedalAndNameView.f54704g.setText("他喜欢了你");
        }
        bnl0.m105524M(this.f203071c.f54704g, true);
    }

    /* JADX INFO: renamed from: l */
    public void m218718l(@Nullable vak0 vak0Var) {
        nsv<User> nsvVar;
        User user = null;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM200543r = vak0Var == null ? null : vak0Var.m200543r();
        if (vak0Var != null && (nsvVar = vak0Var.f183108c) != null) {
            user = nsvVar.f143542a;
        }
        if (user == null) {
            this.f203071c.f54698a.setVisibility(8);
            this.f203071c.f54708k.setVisibility(8);
            return;
        }
        m218717k(bLiveVoiceUserProfileConfigM200543r, user);
        m218711i(user);
        String strM139142n = i9o0.m139142n(vak0Var.m200543r().identity);
        bnl0.m105524M(this.f203071c.f54711n, !TextUtils.isEmpty(strM139142n));
        this.f203071c.f54711n.setText(strM139142n);
        this.f203071c.f54711n.setBackgroundResource(i9o0.m139141m(vak0Var.m200543r().identity));
        bnl0.m105540X(this.f203071c.f54702e, qa00.m175859d(5.0f));
        m218716j(user);
        x3t x3tVar = this.f203069a;
        Act act = getAct();
        VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView = this.f203071c;
        x3tVar.m209278k(act, virtualVoiceUserCardMedalAndNameView.f54714q, virtualVoiceUserCardMedalAndNameView.f54715r, virtualVoiceUserCardMedalAndNameView.f54716s, virtualVoiceUserCardMedalAndNameView.f54717t);
        this.f203069a.m209292z(user, true);
        this.f203069a.m209274B(new y20() { // from class: l.x5m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192508a.m218713d((BLiveMedal) obj);
            }
        });
        this.f203071c.f54698a.setText(user.name);
        this.f203071c.f54698a.setVisibility(0);
        this.f203071c.f54698a.setTextColor(Color.parseColor("#ccffffff"));
        bnl0.m105524M(this.f203071c.f54708k, true);
        bnl0.m105524M(this.f203071c.f54703f, true);
        this.f203071c.f54712o.setVisibility(8);
        m218719m(vak0Var);
        if (bnl0.m105529O0(this.f203071c.f54704g) || bnl0.m105529O0(this.f203071c.f54706i) || bnl0.m105529O0(this.f203071c.f54707j)) {
            bnl0.m105537U(this.f203071c.f54703f, qa00.m175859d(12.0f));
        } else {
            bnl0.m105537U(this.f203071c.f54703f, qa00.m175859d(0.0f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m218719m(vak0 vak0Var) {
        if (vak0Var.m200541p() == null) {
            bnl0.m105524M(this.f203071c.f54709l, false);
            return;
        }
        BLiveUserLevel bLiveUserLevelM200535j = vak0Var.m200535j();
        if (bLiveUserLevelM200535j == null || TextUtils.isEmpty(bLiveUserLevelM200535j.backendUrl)) {
            bnl0.m105524M(this.f203071c.f54709l, false);
        } else {
            bnl0.m105524M(this.f203071c.f54709l, true);
            i0k.m137976c(bLiveUserLevelM200535j.backendUrl, this.f203071c.f54709l, kny.m150553a(vak0Var.m200541p().grade) ? i0k.f112379b : i0k.f112378a);
        }
        final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchyM200539n = vak0Var.m200539n();
        if (bLiveUserProfileConfigHierarchyM200539n == null || TextUtils.isEmpty(bLiveUserProfileConfigHierarchyM200539n.iconUrl)) {
            bnl0.m105524M(this.f203071c.f54710m, false);
            return;
        }
        bnl0.m105524M(this.f203071c.f54710m, true);
        i0k.m137976c(bLiveUserProfileConfigHierarchyM200539n.iconUrl, this.f203071c.f54710m, i0k.f112378a);
        bnl0.m105509E0(this.f203071c.f54710m, new View.OnClickListener() { // from class: l.y5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197572a.m218714e(bLiveUserProfileConfigHierarchyM200539n, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
