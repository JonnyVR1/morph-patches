package p002l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopFragAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopGameCpFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileItemTextView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.et4;
import l.j760;
import l.lqa;
import l.lsi0;
import l.pc8;
import l.phj;
import l.pj90;
import l.s7m;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ohj implements s7m<ehj> {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f16599a;

    /* JADX INFO: renamed from: b */
    public TextView f16600b;

    /* JADX INFO: renamed from: c */
    public EditProfileItemTextView f16601c;

    /* JADX INFO: renamed from: d */
    public EditProfileItemTextView f16602d;

    /* JADX INFO: renamed from: e */
    public EditProfileItemTextView f16603e;

    /* JADX INFO: renamed from: f */
    public EditProfileItemTextView f16604f;

    /* JADX INFO: renamed from: g */
    public VLinear f16605g;

    /* JADX INFO: renamed from: h */
    public VLinear f16606h;

    /* JADX INFO: renamed from: i */
    public VImage f16607i;

    /* JADX INFO: renamed from: j */
    public VLinear f16608j;

    /* JADX INFO: renamed from: k */
    public EditProfileGameImageView f16609k;

    /* JADX INFO: renamed from: l */
    public EditProfileGameImageView f16610l;

    /* JADX INFO: renamed from: m */
    public EditProfileGameImageView f16611m;

    /* JADX INFO: renamed from: n */
    public ProfileLoopActionLayout f16612n;

    /* JADX INFO: renamed from: o */
    public VButton f16613o;

    /* JADX INFO: renamed from: p */
    public final Act f16614p;

    /* JADX INFO: renamed from: q */
    public final ProfileLoopGameCpFrag f16615q;

    /* JADX INFO: renamed from: r */
    public ehj f16616r;

    /* JADX INFO: renamed from: s */
    public List<String> f16617s;

    /* JADX INFO: renamed from: t */
    public User f16618t;

    /* JADX INFO: renamed from: u */
    public List<EditProfileGameImageView> f16619u;

    /* JADX INFO: renamed from: l.ohj$a */
    public class C0722a implements EditProfileGameImageView.InterfaceC0166b {
        public C0722a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView.InterfaceC0166b
        /* JADX INFO: renamed from: a */
        public void mo3466a(String str) {
            if (ohj.this.f16617s != null) {
                ohj.this.f16617s.add(str);
            }
            ohj ohjVar = ohj.this;
            ohjVar.m19529H(ohjVar.f16617s);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView.InterfaceC0166b
        /* JADX INFO: renamed from: b */
        public void mo3467b(String str) {
            if (ohj.this.f16617s != null) {
                ohj.this.f16617s.remove(str);
            }
            ohj ohjVar = ohj.this;
            ohjVar.m19529H(ohjVar.f16617s);
        }
    }

    public ohj(ProfileLoopGameCpFrag profileLoopGameCpFrag) {
        this.f16615q = profileLoopGameCpFrag;
        this.f16614p = profileLoopGameCpFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m19509B(View view) {
        m19538u(LoopInputType.GAME_VOICE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m19520r() {
        int iY0 = (xdl0.y0() - t100.d(100.0f)) / 3;
        xdl0.D0(iY0, new View[]{this.f16609k, this.f16610l, this.f16611m});
        xdl0.C0(this.f16609k, iY0);
        xdl0.C0(this.f16610l, iY0);
        xdl0.C0(this.f16611m, iY0);
        ArrayList arrayListF0 = vwb.f0(new EditProfileGameImageView[]{this.f16609k, this.f16610l, this.f16611m});
        this.f16619u = arrayListF0;
        vwb.z(arrayListF0, new e30() { // from class: l.ghj
            public final void call(Object obj) {
                this.f11442a.m19539v((EditProfileGameImageView) obj);
            }
        });
        this.f16601c.setTitle("游戏名称");
        this.f16602d.setTitle("想找人一起");
        this.f16603e.setTitle("段位");
        this.f16604f.setTitle("开麦");
        if (!(act() instanceof ProfileInfoLoopEditAct)) {
            this.f16601c.setRequired(true);
            this.f16602d.setRequired(true);
        }
        boolean z = act() instanceof ProfileInfoLoopEditAct;
        ProfileLoopActionLayout profileLoopActionLayout = this.f16612n;
        if (!z) {
            xdl0.M(profileLoopActionLayout, false);
            xdl0.M(this.f16600b, false);
            xdl0.M(this.f16613o, true);
            xdl0.E0(this.f16613o, new View.OnClickListener() { // from class: l.hhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12038a.m19521w(view);
                }
            });
            return;
        }
        xdl0.M(profileLoopActionLayout, true);
        this.f16612n.m3527l(this.f16615q);
        xdl0.X(this.f16601c, 0);
        xdl0.M(this.f16600b, true);
        xdl0.M(this.f16613o, false);
        act().m1991a2().m2030W0(this.f16615q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m19521w(View view) {
        m19526E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m19522z(View view) {
        m19538u(LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m19523A(View view) {
        m19538u(LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m19524C(View view) {
        if (!NullChecker.a(this.f16617s) || this.f16617s.size() >= 3) {
            return;
        }
        this.f16609k.m3463Q();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19525C0() {
        return this.f16614p;
    }

    /* JADX INFO: renamed from: E */
    public void m19526E() {
        boolean zJ = vwb.J(m19536q().profile.extensions.game.name);
        boolean zJ2 = vwb.J(m19536q().profile.extensions.game.together);
        if (!zJ && !zJ2) {
            this.f16616r.m12545i0();
            zvf0.u("e_game_info_submit", this.f16615q.pageId(), new j760[]{vwb.Y("is_succeed", Integer.valueOf((zJ || zJ2) ? 0 : 1))});
            ura.e().d().xc(this.f16618t);
        } else {
            if (zJ && zJ2) {
                lsi0.F(this.f16614p, "请填写游戏名称、想找人一起");
                return;
            }
            Act act = this.f16614p;
            if (zJ) {
                lsi0.F(act, "请填写游戏名称");
            } else {
                lsi0.F(act, "请填写想找人一起");
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m19527F() {
        if (NullChecker.a(this.f16618t)) {
            ura.e().d().xc(this.f16618t);
        }
        zvf0.u("e_game_info_submit", this.f16615q.pageId(), new j760[]{vwb.Y("is_succeed", "")});
    }

    /* JADX INFO: renamed from: G */
    public void m19528G(List<Media> list) {
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            for (EditProfileGameImageView editProfileGameImageView : this.f16619u) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m3461O(picture2);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m19529H(List<String> list) {
        this.f16617s = pc8.q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f16617s.size() ? this.f16617s.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f16619u.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m3462P(str);
            }
            i++;
        }
        m19536q().profile.extensions.game.screenshot = this.f16617s;
    }

    /* JADX INFO: renamed from: I */
    public void m19530I() {
        this.f16617s = new ArrayList();
        this.f16601c.setValue(et4.a("、", m19536q().profile.extensions.game.name));
        this.f16602d.setValue(et4.a("、", m19536q().profile.extensions.game.together));
        this.f16603e.setValue((String) pc8.t0(m19536q().profile.extensions.game.level));
        this.f16604f.setValue((String) pc8.t0(m19536q().profile.extensions.game.voice));
        m19529H(m19536q().profile.extensions.game.screenshot);
        xdl0.E0(this.f16601c, new View.OnClickListener() { // from class: l.ihj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13247a.m19541y(view);
            }
        });
        xdl0.E0(this.f16602d, new View.OnClickListener() { // from class: l.jhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13775a.m19522z(view);
            }
        });
        xdl0.E0(this.f16603e, new View.OnClickListener() { // from class: l.khj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14331a.m19523A(view);
            }
        });
        xdl0.E0(this.f16604f, new View.OnClickListener() { // from class: l.lhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14875a.m19509B(view);
            }
        });
        xdl0.E0(this.f16606h, new View.OnClickListener() { // from class: l.mhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15387a.m19524C(view);
            }
        });
        if (xdl0.O0(this.f16612n)) {
            this.f16612n.m3526k();
        }
        if (lqa.f() && this.f16615q.m2081U4()) {
            String strM = pj90.m(this.f16615q.f1277z);
            xdl0.X(this.f16599a, 0);
            xdl0.U(this.f16600b, t100.d(7.0f));
            if (TextUtils.isEmpty(strM)) {
                return;
            }
            xdl0.M(this.f16600b, true);
            this.f16600b.setTextSize(15.0f);
            this.f16600b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f16600b.setText(String.format("预计符合%s人的理想型", strM));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m19531J(User user, LoopInputType loopInputType, List<String> list) {
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

    @Nullable
    public Act act() {
        return this.f16614p;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM19533m = m19533m(layoutInflater, viewGroup);
        m19520r();
        return viewM19533m;
    }

    /* JADX INFO: renamed from: m */
    public View m19533m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return phj.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m19532i1(ehj ehjVar) {
        this.f16616r = ehjVar;
    }

    /* JADX INFO: renamed from: p */
    public boolean m19535p() {
        if (m19536q().profile.extensions.game == null) {
            return false;
        }
        return (vwb.J(m19536q().profile.extensions.game.name) && vwb.J(m19536q().profile.extensions.game.together) && vwb.J(m19536q().profile.extensions.game.level) && vwb.J(m19536q().profile.extensions.game.voice) && vwb.J(m19536q().profile.extensions.game.screenshot)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public User m19536q() {
        if (this.f16618t == null) {
            if (act() instanceof ProfileLoopFragAct) {
                this.f16618t = ura.e().d().Uc();
            } else {
                this.f16618t = ura.e().d().Uc().clone();
            }
        }
        return this.f16618t;
    }

    /* JADX INFO: renamed from: s */
    public final List<String> m19537s(User user, LoopInputType loopInputType) {
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
    public final void m19538u(final LoopInputType loopInputType) {
        Intent intentM1988X1 = ProfileInfoLoopEditAct.m1988X1(this.f16614p, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, loopInputType, m19536q());
        final List<String> listM19537s = m19537s(m19536q(), loopInputType);
        if (listM19537s == null) {
            return;
        }
        this.f16614p.startActivityForResult(3500, intentM1988X1, new a.a() { // from class: l.nhj
            /* JADX INFO: renamed from: a */
            public final boolean m18761a(int i, int i2, Intent intent) {
                return this.f16036a.m19540x(loopInputType, listM19537s, i, i2, intent);
            }
        });
        this.f16614p.overridePendingTransition(tzb0.h, 0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m19539v(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m3460G(this.f16614p, new C0722a());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m19540x(LoopInputType loopInputType, List list, int i, int i2, Intent intent) {
        if (i != 3500 || i2 != -1 || !NullChecker.a(intent)) {
            return false;
        }
        User userUc = ura.e().d().Uc();
        m19531J(m19536q(), loopInputType, m19537s(userUc, loopInputType));
        if (act() instanceof ProfileInfoLoopEditAct) {
            m19531J(userUc, loopInputType, list);
        }
        m19530I();
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m19541y(View view) {
        m19538u(LoopInputType.GAME_NAME);
    }

    public void destroy() {
    }
}
