package p149l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopFragAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopGameCpFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileItemTextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ohj implements s7m<ehj> {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f143983a;

    /* JADX INFO: renamed from: b */
    public TextView f143984b;

    /* JADX INFO: renamed from: c */
    public EditProfileItemTextView f143985c;

    /* JADX INFO: renamed from: d */
    public EditProfileItemTextView f143986d;

    /* JADX INFO: renamed from: e */
    public EditProfileItemTextView f143987e;

    /* JADX INFO: renamed from: f */
    public EditProfileItemTextView f143988f;

    /* JADX INFO: renamed from: g */
    public VLinear f143989g;

    /* JADX INFO: renamed from: h */
    public VLinear f143990h;

    /* JADX INFO: renamed from: i */
    public VImage f143991i;

    /* JADX INFO: renamed from: j */
    public VLinear f143992j;

    /* JADX INFO: renamed from: k */
    public EditProfileGameImageView f143993k;

    /* JADX INFO: renamed from: l */
    public EditProfileGameImageView f143994l;

    /* JADX INFO: renamed from: m */
    public EditProfileGameImageView f143995m;

    /* JADX INFO: renamed from: n */
    public ProfileLoopActionLayout f143996n;

    /* JADX INFO: renamed from: o */
    public VButton f143997o;

    /* JADX INFO: renamed from: p */
    public final Act f143998p;

    /* JADX INFO: renamed from: q */
    public final ProfileLoopGameCpFrag f143999q;

    /* JADX INFO: renamed from: r */
    public ehj f144000r;

    /* JADX INFO: renamed from: s */
    public List<String> f144001s;

    /* JADX INFO: renamed from: t */
    public User f144002t;

    /* JADX INFO: renamed from: u */
    public List<EditProfileGameImageView> f144003u;

    /* JADX INFO: renamed from: l.ohj$a */
    public class C18938a implements EditProfileGameImageView.InterfaceC8741b {
        public C18938a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView.InterfaceC8741b
        /* JADX INFO: renamed from: a */
        public void mo52911a(String str) {
            if (ohj.this.f144001s != null) {
                ohj.this.f144001s.add(str);
            }
            ohj ohjVar = ohj.this;
            ohjVar.m164386H(ohjVar.f144001s);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView.InterfaceC8741b
        /* JADX INFO: renamed from: b */
        public void mo52912b(String str) {
            if (ohj.this.f144001s != null) {
                ohj.this.f144001s.remove(str);
            }
            ohj ohjVar = ohj.this;
            ohjVar.m164386H(ohjVar.f144001s);
        }
    }

    public ohj(ProfileLoopGameCpFrag profileLoopGameCpFrag) {
        this.f143999q = profileLoopGameCpFrag;
        this.f143998p = profileLoopGameCpFrag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m164367B(View view) {
        m164394u(LoopInputType.GAME_VOICE);
    }

    /* JADX INFO: renamed from: r */
    private void m164378r() {
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(100.0f)) / 3;
        xdl0.m208327D0(iM208412y0, this.f143993k, this.f143994l, this.f143995m);
        xdl0.m208325C0(this.f143993k, iM208412y0);
        xdl0.m208325C0(this.f143994l, iM208412y0);
        xdl0.m208325C0(this.f143995m, iM208412y0);
        ArrayList arrayListM200324f0 = vwb.m200324f0(this.f143993k, this.f143994l, this.f143995m);
        this.f144003u = arrayListM200324f0;
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.ghj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102662a.m164395v((EditProfileGameImageView) obj);
            }
        });
        this.f143985c.setTitle("游戏名称");
        this.f143986d.setTitle("想找人一起");
        this.f143987e.setTitle("段位");
        this.f143988f.setTitle("开麦");
        if (!(getAct() instanceof ProfileInfoLoopEditAct)) {
            this.f143985c.setRequired(true);
            this.f143986d.setRequired(true);
        }
        boolean z = getAct() instanceof ProfileInfoLoopEditAct;
        ProfileLoopActionLayout profileLoopActionLayout = this.f143996n;
        if (!z) {
            xdl0.m208344M(profileLoopActionLayout, false);
            xdl0.m208344M(this.f143984b, false);
            xdl0.m208344M(this.f143997o, true);
            xdl0.m208329E0(this.f143997o, new View.OnClickListener() { // from class: l.hhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107724a.m164379w(view);
                }
            });
            return;
        }
        xdl0.m208344M(profileLoopActionLayout, true);
        this.f143996n.m52969l(this.f143999q);
        xdl0.m208360X(this.f143985c, 0);
        xdl0.m208344M(this.f143984b, true);
        xdl0.m208344M(this.f143997o, false);
        ((ProfileInfoLoopEditAct) getAct()).m51509a2().m51548W0(this.f143999q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m164379w(View view) {
        m164383E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m164380z(View view) {
        m164394u(LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m164381A(View view) {
        m164394u(LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m164382C(View view) {
        if (!NullChecker.m81303a(this.f144001s) || this.f144001s.size() >= 3) {
            return;
        }
        this.f143993k.m52910Q();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143998p;
    }

    /* JADX INFO: renamed from: E */
    public void m164383E() {
        boolean zM200296J = vwb.m200296J(m164392q().profile.extensions.game.name);
        boolean zM200296J2 = vwb.m200296J(m164392q().profile.extensions.game.together);
        if (!zM200296J && !zM200296J2) {
            this.f144000r.m116469i0();
            zvf0.m220399u("e_game_info_submit", this.f143999q.pageId(), vwb.m200311Y("is_succeed", Integer.valueOf((zM200296J || zM200296J2) ? 0 : 1)));
            ura.m195053e().m195057d().mo33944xc(this.f144002t);
        } else {
            if (zM200296J && zM200296J2) {
                lsi0.m151568F(this.f143998p, "请填写游戏名称、想找人一起");
                return;
            }
            Act act = this.f143998p;
            if (zM200296J) {
                lsi0.m151568F(act, "请填写游戏名称");
            } else {
                lsi0.m151568F(act, "请填写想找人一起");
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m164384F() {
        if (NullChecker.m81303a(this.f144002t)) {
            ura.m195053e().m195057d().mo33944xc(this.f144002t);
        }
        zvf0.m220399u("e_game_info_submit", this.f143999q.pageId(), vwb.m200311Y("is_succeed", ""));
    }

    /* JADX INFO: renamed from: G */
    public void m164385G(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (EditProfileGameImageView editProfileGameImageView : this.f144003u) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m52908O(picture);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m164386H(List<String> list) {
        this.f144001s = pc8.m168313q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f144001s.size() ? this.f144001s.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f144003u.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m52909P(str);
            }
            i++;
        }
        m164392q().profile.extensions.game.screenshot = this.f144001s;
    }

    /* JADX INFO: renamed from: I */
    public void m164387I() {
        this.f144001s = new ArrayList();
        this.f143985c.setValue(et4.m117971a("、", m164392q().profile.extensions.game.name));
        this.f143986d.setValue(et4.m117971a("、", m164392q().profile.extensions.game.together));
        this.f143987e.setValue((String) pc8.m168316t0(m164392q().profile.extensions.game.level));
        this.f143988f.setValue((String) pc8.m168316t0(m164392q().profile.extensions.game.voice));
        m164386H(m164392q().profile.extensions.game.screenshot);
        xdl0.m208329E0(this.f143985c, new View.OnClickListener() { // from class: l.ihj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113258a.m164397y(view);
            }
        });
        xdl0.m208329E0(this.f143986d, new View.OnClickListener() { // from class: l.jhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117951a.m164380z(view);
            }
        });
        xdl0.m208329E0(this.f143987e, new View.OnClickListener() { // from class: l.khj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123171a.m164381A(view);
            }
        });
        xdl0.m208329E0(this.f143988f, new View.OnClickListener() { // from class: l.lhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128112a.m164367B(view);
            }
        });
        xdl0.m208329E0(this.f143990h, new View.OnClickListener() { // from class: l.mhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133823a.m164382C(view);
            }
        });
        if (xdl0.m208349O0(this.f143996n)) {
            this.f143996n.m52968k();
        }
        if (lqa.m150968f() && this.f143999q.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f143999q.f33455z);
            xdl0.m208360X(this.f143983a, 0);
            xdl0.m208357U(this.f143984b, t100.m186890d(7.0f));
            if (TextUtils.isEmpty(strM169801m)) {
                return;
            }
            xdl0.m208344M(this.f143984b, true);
            this.f143984b.setTextSize(15.0f);
            this.f143984b.setTextColor(Color.parseColor("#a9a9a9"));
            this.f143984b.setText(String.format("预计符合%s人的理想型", strM169801m));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m164388J(User user, LoopInputType loopInputType, List<String> list) {
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

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f143998p;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM164389m = m164389m(layoutInflater, viewGroup);
        m164378r();
        return viewM164389m;
    }

    /* JADX INFO: renamed from: m */
    public View m164389m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return phj.m168975b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ehj ehjVar) {
        this.f144000r = ehjVar;
    }

    /* JADX INFO: renamed from: p */
    public boolean m164391p() {
        if (m164392q().profile.extensions.game == null) {
            return false;
        }
        return (vwb.m200296J(m164392q().profile.extensions.game.name) && vwb.m200296J(m164392q().profile.extensions.game.together) && vwb.m200296J(m164392q().profile.extensions.game.level) && vwb.m200296J(m164392q().profile.extensions.game.voice) && vwb.m200296J(m164392q().profile.extensions.game.screenshot)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public User m164392q() {
        if (this.f144002t == null) {
            if (getAct() instanceof ProfileLoopFragAct) {
                this.f144002t = ura.m195053e().m195057d().mo33757Uc();
            } else {
                this.f144002t = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
            }
        }
        return this.f144002t;
    }

    /* JADX INFO: renamed from: s */
    public final List<String> m164393s(User user, LoopInputType loopInputType) {
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
    public final void m164394u(final LoopInputType loopInputType) {
        Intent intentM51506X1 = ProfileInfoLoopEditAct.m51506X1(this.f143998p, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, loopInputType, m164392q());
        final List<String> listM164393s = m164393s(m164392q(), loopInputType);
        if (listM164393s == null) {
            return;
        }
        this.f143998p.startActivityForResult(3500, intentM51506X1, new C4317a.a() { // from class: l.nhj
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f138995a.m164396x(loopInputType, listM164393s, i, i2, intent);
            }
        });
        this.f143998p.overridePendingTransition(tzb0.f172721h, 0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m164395v(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m52907G(this.f143998p, new C18938a());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m164396x(LoopInputType loopInputType, List list, int i, int i2, Intent intent) {
        if (i != 3500 || i2 != -1 || !NullChecker.m81303a(intent)) {
            return false;
        }
        User userMo33757Uc = ura.m195053e().m195057d().mo33757Uc();
        m164388J(m164392q(), loopInputType, m164393s(userMo33757Uc, loopInputType));
        if (getAct() instanceof ProfileInfoLoopEditAct) {
            m164388J(userMo33757Uc, loopInputType, list);
        }
        m164387I();
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m164397y(View view) {
        m164394u(LoopInputType.GAME_NAME);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
