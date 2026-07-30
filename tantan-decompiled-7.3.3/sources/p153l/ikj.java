package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopFragAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopGameCpFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileItemTextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ikj implements iam<yjj> {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f115379a;

    /* JADX INFO: renamed from: b */
    public TextView f115380b;

    /* JADX INFO: renamed from: c */
    public EditProfileItemTextView f115381c;

    /* JADX INFO: renamed from: d */
    public EditProfileItemTextView f115382d;

    /* JADX INFO: renamed from: e */
    public EditProfileItemTextView f115383e;

    /* JADX INFO: renamed from: f */
    public EditProfileItemTextView f115384f;

    /* JADX INFO: renamed from: g */
    public VLinear f115385g;

    /* JADX INFO: renamed from: h */
    public VLinear f115386h;

    /* JADX INFO: renamed from: i */
    public VImage f115387i;

    /* JADX INFO: renamed from: j */
    public VLinear f115388j;

    /* JADX INFO: renamed from: k */
    public EditProfileGameImageView f115389k;

    /* JADX INFO: renamed from: l */
    public EditProfileGameImageView f115390l;

    /* JADX INFO: renamed from: m */
    public EditProfileGameImageView f115391m;

    /* JADX INFO: renamed from: n */
    public ProfileLoopActionLayout f115392n;

    /* JADX INFO: renamed from: o */
    public VButton f115393o;

    /* JADX INFO: renamed from: p */
    public final Act f115394p;

    /* JADX INFO: renamed from: q */
    public final ProfileLoopGameCpFrag f115395q;

    /* JADX INFO: renamed from: r */
    public yjj f115396r;

    /* JADX INFO: renamed from: s */
    public List<String> f115397s;

    /* JADX INFO: renamed from: t */
    public User f115398t;

    /* JADX INFO: renamed from: u */
    public List<EditProfileGameImageView> f115399u;

    /* JADX INFO: renamed from: l.ikj$a */
    public class C17730a implements EditProfileGameImageView.InterfaceC8904b {
        public C17730a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView.InterfaceC8904b
        /* JADX INFO: renamed from: a */
        public void mo54094a(String str) {
            if (ikj.this.f115397s != null) {
                ikj.this.f115397s.add(str);
            }
            ikj ikjVar = ikj.this;
            ikjVar.m140344H(ikjVar.f115397s);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView.InterfaceC8904b
        /* JADX INFO: renamed from: b */
        public void mo54095b(String str) {
            if (ikj.this.f115397s != null) {
                ikj.this.f115397s.remove(str);
            }
            ikj ikjVar = ikj.this;
            ikjVar.m140344H(ikjVar.f115397s);
        }
    }

    public ikj(ProfileLoopGameCpFrag profileLoopGameCpFrag) {
        this.f115395q = profileLoopGameCpFrag;
        this.f115394p = profileLoopGameCpFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m140325B(View view) {
        m140352u(LoopInputType.GAME_VOICE);
    }

    /* JADX INFO: renamed from: r */
    private void m140336r() {
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(100.0f)) / 3;
        bnl0.m105507D0(iM105592y0, this.f115389k, this.f115390l, this.f115391m);
        bnl0.m105505C0(this.f115389k, iM105592y0);
        bnl0.m105505C0(this.f115390l, iM105592y0);
        bnl0.m105505C0(this.f115391m, iM105592y0);
        ArrayList arrayListM147507f0 = jyb.m147507f0(this.f115389k, this.f115390l, this.f115391m);
        this.f115399u = arrayListM147507f0;
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.akj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72010a.m140353v((EditProfileGameImageView) obj);
            }
        });
        this.f115381c.setTitle("游戏名称");
        this.f115382d.setTitle("想找人一起");
        this.f115383e.setTitle("段位");
        this.f115384f.setTitle("开麦");
        if (!(getAct() instanceof ProfileInfoLoopEditAct)) {
            this.f115381c.setRequired(true);
            this.f115382d.setRequired(true);
        }
        boolean z = getAct() instanceof ProfileInfoLoopEditAct;
        ProfileLoopActionLayout profileLoopActionLayout = this.f115392n;
        if (!z) {
            bnl0.m105524M(profileLoopActionLayout, false);
            bnl0.m105524M(this.f115380b, false);
            bnl0.m105524M(this.f115393o, true);
            bnl0.m105509E0(this.f115393o, new View.OnClickListener() { // from class: l.bkj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77080a.m140337w(view);
                }
            });
            return;
        }
        bnl0.m105524M(profileLoopActionLayout, true);
        this.f115392n.m54152l(this.f115395q);
        bnl0.m105540X(this.f115381c, 0);
        bnl0.m105524M(this.f115380b, true);
        bnl0.m105524M(this.f115393o, false);
        ((ProfileInfoLoopEditAct) getAct()).m52692b2().m52731W0(this.f115395q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m140337w(View view) {
        m140341E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m140338z(View view) {
        m140352u(LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m140339A(View view) {
        m140352u(LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m140340C(View view) {
        if (!NullChecker.m82486a(this.f115397s) || this.f115397s.size() >= 3) {
            return;
        }
        this.f115389k.m54093Q();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115394p;
    }

    /* JADX INFO: renamed from: E */
    public void m140341E() {
        boolean zM147479J = jyb.m147479J(m140350q().profile.extensions.game.name);
        boolean zM147479J2 = jyb.m147479J(m140350q().profile.extensions.game.together);
        if (!zM147479J && !zM147479J2) {
            this.f115396r.m216412i0();
            i4g0.m138523u("e_game_info_submit", this.f115395q.pageId(), jyb.m147494Y("is_succeed", Integer.valueOf((zM147479J || zM147479J2) ? 0 : 1)));
            gta.m132210e().m132214d().mo34947xc(this.f115398t);
        } else {
            if (zM147479J && zM147479J2) {
                o1j0.m165624F(this.f115394p, "请填写游戏名称、想找人一起");
                return;
            }
            Act act = this.f115394p;
            if (zM147479J) {
                o1j0.m165624F(act, "请填写游戏名称");
            } else {
                o1j0.m165624F(act, "请填写想找人一起");
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m140342F() {
        if (NullChecker.m82486a(this.f115398t)) {
            gta.m132210e().m132214d().mo34947xc(this.f115398t);
        }
        i4g0.m138523u("e_game_info_submit", this.f115395q.pageId(), jyb.m147494Y("is_succeed", ""));
    }

    /* JADX INFO: renamed from: G */
    public void m140343G(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (EditProfileGameImageView editProfileGameImageView : this.f115399u) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m54091O(picture);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m140344H(List<String> list) {
        this.f115397s = td8.m190607q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f115397s.size() ? this.f115397s.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f115399u.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m54092P(str);
            }
            i++;
        }
        m140350q().profile.extensions.game.screenshot = this.f115397s;
    }

    /* JADX INFO: renamed from: I */
    public void m140345I() {
        this.f115397s = new ArrayList();
        this.f115381c.setValue(du4.m118067a("、", m140350q().profile.extensions.game.name));
        this.f115382d.setValue(du4.m118067a("、", m140350q().profile.extensions.game.together));
        this.f115383e.setValue((String) td8.m190610t0(m140350q().profile.extensions.game.level));
        this.f115384f.setValue((String) td8.m190610t0(m140350q().profile.extensions.game.voice));
        m140344H(m140350q().profile.extensions.game.screenshot);
        bnl0.m105509E0(this.f115381c, new View.OnClickListener() { // from class: l.ckj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82285a.m140355y(view);
            }
        });
        bnl0.m105509E0(this.f115382d, new View.OnClickListener() { // from class: l.dkj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89407a.m140338z(view);
            }
        });
        bnl0.m105509E0(this.f115383e, new View.OnClickListener() { // from class: l.ekj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94380a.m140339A(view);
            }
        });
        bnl0.m105509E0(this.f115384f, new View.OnClickListener() { // from class: l.fkj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99516a.m140325B(view);
            }
        });
        bnl0.m105509E0(this.f115386h, new View.OnClickListener() { // from class: l.gkj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104737a.m140340C(view);
            }
        });
        if (bnl0.m105529O0(this.f115392n)) {
            this.f115392n.m54151k();
        }
        if (xra.m212787f() && this.f115395q.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f115395q.f34303z);
            bnl0.m105540X(this.f115379a, 0);
            bnl0.m105537U(this.f115380b, qa00.m175859d(7.0f));
            if (TextUtils.isEmpty(strM192426m)) {
                return;
            }
            bnl0.m105524M(this.f115380b, true);
            this.f115380b.setTextSize(15.0f);
            this.f115380b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f115380b.setText(String.format("预计符合%s人的理想型", strM192426m));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m140346J(User user, LoopInputType loopInputType, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        if (loopInputType == LoopInputType.GAME_NAME) {
            user.profile.extensions.game.name = arrayList;
            return;
        }
        if (loopInputType == LoopInputType.GAME_TOGETHER) {
            user.profile.extensions.game.together = arrayList;
        } else if (loopInputType == LoopInputType.GAME_LEVEL) {
            user.profile.extensions.game.level = arrayList;
        } else if (loopInputType == LoopInputType.GAME_VOICE) {
            user.profile.extensions.game.voice = arrayList;
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f115394p;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM140347m = m140347m(layoutInflater, viewGroup);
        m140336r();
        return viewM140347m;
    }

    /* JADX INFO: renamed from: m */
    public View m140347m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jkj.m145848b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yjj yjjVar) {
        this.f115396r = yjjVar;
    }

    /* JADX INFO: renamed from: p */
    public boolean m140349p() {
        if (m140350q().profile.extensions.game == null) {
            return false;
        }
        return (jyb.m147479J(m140350q().profile.extensions.game.name) && jyb.m147479J(m140350q().profile.extensions.game.together) && jyb.m147479J(m140350q().profile.extensions.game.level) && jyb.m147479J(m140350q().profile.extensions.game.voice) && jyb.m147479J(m140350q().profile.extensions.game.screenshot)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public User m140350q() {
        if (this.f115398t == null) {
            if (getAct() instanceof ProfileLoopFragAct) {
                this.f115398t = gta.m132210e().m132214d().mo34760Uc();
            } else {
                this.f115398t = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
            }
        }
        return this.f115398t;
    }

    /* JADX INFO: renamed from: s */
    public final List<String> m140351s(User user, LoopInputType loopInputType) {
        if (loopInputType == LoopInputType.GAME_NAME) {
            return user.profile.extensions.game.name;
        }
        if (loopInputType == LoopInputType.GAME_TOGETHER) {
            return user.profile.extensions.game.together;
        }
        if (loopInputType == LoopInputType.GAME_LEVEL) {
            return user.profile.extensions.game.level;
        }
        if (loopInputType == LoopInputType.GAME_VOICE) {
            return user.profile.extensions.game.voice;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m140352u(final LoopInputType loopInputType) {
        Intent intentM52689Y1 = ProfileInfoLoopEditAct.m52689Y1(this.f115394p, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, loopInputType, m140350q());
        final List<String> listM140351s = m140351s(m140350q(), loopInputType);
        if (listM140351s == null) {
            return;
        }
        this.f115394p.startActivityForResult(3500, intentM52689Y1, new C4468a.a() { // from class: l.hkj
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f110436a.m140354x(loopInputType, listM140351s, i, i2, intent);
            }
        });
        this.f115394p.overridePendingTransition(z7c0.f203239h, 0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m140353v(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m54090G(this.f115394p, new C17730a());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m140354x(LoopInputType loopInputType, List list, int i, int i2, Intent intent) {
        if (i != 3500 || i2 != -1 || !NullChecker.m82486a(intent)) {
            return false;
        }
        User userMo34760Uc = gta.m132210e().m132214d().mo34760Uc();
        m140346J(m140350q(), loopInputType, m140351s(userMo34760Uc, loopInputType));
        if (getAct() instanceof ProfileInfoLoopEditAct) {
            m140346J(userMo34760Uc, loopInputType, list);
        }
        m140345I();
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m140355y(View view) {
        m140352u(LoopInputType.GAME_NAME);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
