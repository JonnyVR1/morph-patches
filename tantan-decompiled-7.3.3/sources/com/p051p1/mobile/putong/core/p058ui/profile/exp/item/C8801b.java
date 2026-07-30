package com.p051p1.mobile.putong.core.p058ui.profile.exp.item;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileImageCard;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.C8801b;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.PicPostDlgView;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VSwitchButton;
import p153l.adc0;
import p153l.adf;
import p153l.au40;
import p153l.aw90;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fph0;
import p153l.h1e0;
import p153l.jl80;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.ml70;
import p153l.ner;
import p153l.okf;
import p153l.pk50;
import p153l.qa00;
import p153l.sfj0;
import p153l.t3m;
import p153l.t4m;
import p153l.uxj0;
import p153l.vxd0;
import p153l.xra;
import p153l.y20;
import p153l.zk1;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8801b extends AbstractC8802c {

    /* JADX INFO: renamed from: E */
    public static l4g0 f34097E = new l4g0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public VSwitchButton f34098A;

    /* JADX INFO: renamed from: B */
    public boolean f34099B;

    /* JADX INFO: renamed from: C */
    public t4m f34100C;

    /* JADX INFO: renamed from: D */
    public y20<List<Media>> f34101D;

    /* JADX INFO: renamed from: u */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f34102u;

    /* JADX INFO: renamed from: v */
    public ExpEditProfileImageCardGroup f34103v;

    /* JADX INFO: renamed from: w */
    public AvatarCards f34104w;

    /* JADX INFO: renamed from: x */
    public View f34105x;

    /* JADX INFO: renamed from: y */
    public boolean f34106y;

    /* JADX INFO: renamed from: z */
    public boolean f34107z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b$a */
    public class a implements t4m {
        public a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: a */
        public void mo52398a() {
            C8801b.this.m52355x().mo52250J3();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            C8801b.this.m52397z0();
            C8801b.this.m52355x().mo52250J3();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            C8801b.this.m52397z0();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            C8801b.this.m52397z0();
        }
    }

    public C8801b(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f34102u = new vxd0("show_pic_post_dialog_count_" + CoreModule.m30929H().userId(), 0);
        this.f34099B = false;
        this.f34100C = new a();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m52362W(VReorderCard vReorderCard) {
        if (NullChecker.m82486a(vReorderCard.f33894c.f123275f.f33925j)) {
            vReorderCard.f33894c.f123275f.f33925j.run();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m52370x0() {
        f34097E.m152776k();
        f34097E.m152775j();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m52371y0(int i) {
        f34097E.m152780o(pk50.m172568j().m172574f().m181657U("p_edit_profile_post_pic_popup", fph0.m126680m(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("popup_times", Integer.valueOf(i)))));
        f34097E.m152774i();
        f34097E.m152777l();
    }

    /* JADX INFO: renamed from: A0 */
    public void m52372A0(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34103v.m51994h(i);
        if (NullChecker.m82486a(expEditProfileImageCardM51994h)) {
            expEditProfileImageCardM51994h.mo51883r(media.mo225055clone(), new Runnable() { // from class: l.xcf
                @Override // java.lang.Runnable
                public final void run() {
                    C8801b.m52362W(expEditProfileImageCardM51994h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m52373B0(boolean z) {
        if (z) {
            this.f34107z = true;
        }
        if (NullChecker.m82486a(this.f34098A)) {
            this.f34098A.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public int m52374C0() {
        int i = 0;
        if (xra.m212782a()) {
            AvatarCards avatarCards = this.f34104w;
            if (NullChecker.m82486a(avatarCards)) {
                if (avatarCards.m51994h(0).m51977n()) {
                    CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i < avatarCards.getChildCount() && avatarCards.m51994h(i).getMedia() != null) {
                    arrayList.add(avatarCards.m51994h(i).getMedia());
                    if (!TEnum.equals(avatarCards.m51994h(i).getMedia().status, "normal")) {
                        i2++;
                    }
                    i++;
                }
                int size = arrayList.size();
                if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
                    CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
                }
                if (size > 0) {
                    aw90.m100562F().f73701a.pictures = arrayList;
                } else if (aw90.m100562F().f73701a.pictures.isEmpty()) {
                    aw90.m100562F().f73701a.pictures = m52355x().mo52252K2().pictures;
                }
                y20<List<Media>> y20Var = this.f34101D;
                if (y20Var != null) {
                    y20Var.call(arrayList);
                }
                return i2;
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f34103v;
            if (NullChecker.m82486a(expEditProfileImageCardGroup)) {
                if (expEditProfileImageCardGroup.m51994h(0).m51977n()) {
                    CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m51994h(i).m51977n()) {
                    arrayList2.add(expEditProfileImageCardGroup.m51994h(i).f33963I);
                    if (!TEnum.equals(expEditProfileImageCardGroup.m51994h(i).f33963I.status, "normal")) {
                        i3++;
                    }
                    i++;
                }
                int size2 = arrayList2.size();
                if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
                    CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
                }
                if (size2 > 0) {
                    aw90.m100562F().f73701a.pictures = arrayList2;
                } else if (aw90.m100562F().f73701a.pictures.isEmpty()) {
                    aw90.m100562F().f73701a.pictures = m52355x().mo52252K2().pictures;
                }
                if (size2 <= expEditProfileImageCardGroup.getChildCount()) {
                    m52377F0(size2, null, expEditProfileImageCardGroup);
                }
                mo52331E();
                y20<List<Media>> y20Var2 = this.f34101D;
                if (y20Var2 != null) {
                    y20Var2.call(arrayList2);
                }
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m52375D0(User user) {
        if (m52383j0()) {
            user.profile.extensions.momentSwitch.noSyncMoment.clear();
            user.profile.extensions.momentSwitch.noSyncMoment.add(0, m52381h0() ? "false" : "true");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: E */
    public void mo52331E() {
        super.mo52331E();
        List<Integer> list = xra.m212800s().weight.picture;
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().intValue() > 0) {
                i++;
            }
        }
        User userM189086i2 = m52355x().m189086i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM189086i2.pictures.size(), list.size()); i2++) {
            iIntValue += list.get(i2).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += list.get(i3).intValue();
        }
        m52408P(iIntValue, iIntValue2, iIntValue2 != iIntValue ? String.format("添加%s张照片", Integer.valueOf(i - userM189086i2.pictures.size())) : "", "");
    }

    /* JADX INFO: renamed from: E0 */
    public final void m52376E0() {
        if (xra.m212782a()) {
            this.f34104w.setZ(1.0f);
            PointF pointF = new PointF();
            pointF.x = 0.5f;
            pointF.y = 0.5f;
            ((SimpleDraweeView) this.f34104w.findViewById(adc0.f70031N5)).getHierarchy().m207062w(h1e0.f107453j);
            ((SimpleDraweeView) this.f34104w.findViewById(adc0.f70031N5)).getHierarchy().m207061v(pointF);
            if (NullChecker.m82486a(this.f34100C)) {
                this.f34104w.setOnMediaChanged(new Runnable() { // from class: l.fdf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98471a.m52396w0();
                    }
                });
                return;
            }
            return;
        }
        this.f34103v.setZ(1.0f);
        PointF pointF2 = new PointF();
        pointF2.x = 0.5f;
        pointF2.y = 0.5f;
        ((SimpleDraweeView) this.f34103v.findViewById(adc0.f70031N5)).getHierarchy().m207062w(h1e0.f107453j);
        ((SimpleDraweeView) this.f34103v.findViewById(adc0.f70031N5)).getHierarchy().m207061v(pointF2);
        if (NullChecker.m82486a(this.f34100C)) {
            this.f34103v.setReorderCardsCallback(this.f34100C);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m52377F0(int i, String str, ExpEditProfileImageCardGroup expEditProfileImageCardGroup) {
        if (i == expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m51994h(expEditProfileImageCardGroup.getChildCount() - 1).m52097o1(null);
            return;
        }
        expEditProfileImageCardGroup.m51994h(i).m52097o1(str);
        if (i < expEditProfileImageCardGroup.getChildCount() - 1) {
            expEditProfileImageCardGroup.m51994h(i + 1).m52097o1(null);
        }
        if (i > 0) {
            expEditProfileImageCardGroup.m51994h(i - 1).m52097o1(null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m52378e0(y20<List<Media>> y20Var) {
        this.f34101D = y20Var;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m52379f0(final ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        if (!m52385l0() || !m52384k0()) {
            return false;
        }
        PicPostDlgView picPostDlgView = (PicPostDlgView) m52355x().act().inflater().inflate(kec0.f125341B8, (ViewGroup) null);
        picPostDlgView.m53006s(m52380g0());
        this.f34102u.put(Integer.valueOf(this.f34102u.get().intValue() + 1));
        new jl80.C17971a(m52355x().act()).m146023R(picPostDlgView).m146055x0(R$string.f19298h5, new Object[0]).m146050s0(R$string.f19329i5, new Object[0]).m146052u0(qa00.f156320g, qa00.f156330q).m146021P(false).m146032a0(R$string.f19236f5, new Runnable() { // from class: l.vcf
            @Override // java.lang.Runnable
            public final void run() {
                this.f183461a.m52387n0(profileListExpandedEditFrag);
            }
        }).m146037f0(R$string.f19267g5, new Runnable() { // from class: l.wcf
            @Override // java.lang.Runnable
            public final void run() {
                this.f188470a.m52388o0(profileListExpandedEditFrag);
            }
        }).m146040i0(dbc0.f86732Xj).m146049r0();
        m52371y0(this.f34102u.get().intValue());
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<Media> m52380g0() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (xra.m212782a()) {
            AvatarCards avatarCards = this.f34104w;
            if (NullChecker.m82486a(avatarCards)) {
                while (i < avatarCards.getChildCount()) {
                    if (avatarCards.m51994h(i).m52960m0()) {
                        arrayList.add(avatarCards.m51994h(i).getMedia());
                    }
                    i++;
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f34103v;
            if (NullChecker.m82486a(expEditProfileImageCardGroup)) {
                while (i < expEditProfileImageCardGroup.getChildCount()) {
                    if (expEditProfileImageCardGroup.m51994h(i).getAddPhotos().size() > 0) {
                        arrayList.addAll(expEditProfileImageCardGroup.m51994h(i).getAddPhotos());
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m52381h0() {
        return this.f34106y;
    }

    /* JADX INFO: renamed from: i0 */
    public void m52382i0(User user, boolean z) {
        if (m52384k0() && m52381h0() && !z) {
            aw90.m100562F().f73704d.m137019l(Integer.valueOf(ml70.f137369c));
            aw90.m100562F().f73705e.m137019l(uxj0.f181467a);
        } else {
            if (z) {
                return;
            }
            aw90.m100562F().f73704d.m137019l(Integer.valueOf((NullChecker.m82486a(user) && user.status.contains(UserStatus.get(UserStatus.audit))) ? ml70.f137370d : ml70.f137371e));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m52383j0() {
        return this.f34107z;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m52384k0() {
        if (xra.m212782a()) {
            AvatarCards avatarCards = this.f34104w;
            if (NullChecker.m82486a(avatarCards)) {
                for (int i = 0; i < avatarCards.getChildCount(); i++) {
                    if (avatarCards.m51994h(i).m52960m0()) {
                        return true;
                    }
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f34103v;
            if (NullChecker.m82486a(expEditProfileImageCardGroup)) {
                for (int i2 = 0; i2 < expEditProfileImageCardGroup.getChildCount(); i2++) {
                    if (expEditProfileImageCardGroup.m51994h(i2).m52103y0()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m52385l0() {
        return !this.f34106y && CoreModule.m30932N().mo61448Bj();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的生活照";
    }

    /* JADX INFO: renamed from: m0 */
    public final void m52386m0(Act act, String str, final Media media) {
        final User userM52337f = m52337f();
        final int size = userM52337f.pictures.size();
        TagChooseMkAct.m44233w2(act, jyb.m147482M(media), null, new Runnable() { // from class: l.gdf
            @Override // java.lang.Runnable
            public final void run() {
                this.f103705a.m52391r0(userM52337f, media, size);
            }
        }, null);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return CreditScoreTaskType.pic;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m52387n0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m52373B0(true);
        profileListExpandedEditFrag.mo52306o();
        sfj0.m185596c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new sfj0.C20032a[0]);
        m52370x0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m52388o0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m52373B0(false);
        m52370x0();
        profileListExpandedEditFrag.mo52306o();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m52389p0(boolean z) {
        m52374C0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        view.setElevation(10.0f);
        view.setOutlineProvider(null);
        if (xra.m212782a()) {
            this.f34104w.setViewCatchListener(new VReorderCards.InterfaceC8790c() { // from class: l.ucf
                @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards.InterfaceC8790c
                /* JADX INFO: renamed from: a */
                public final void mo52005a(boolean z) {
                    this.f178423a.m52389p0(z);
                }
            });
        } else {
            this.f34103v.setViewCatchListener(new VReorderCards.InterfaceC8790c() { // from class: l.ycf
                @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards.InterfaceC8790c
                /* JADX INFO: renamed from: a */
                public final void mo52005a(boolean z) {
                    this.f198502a.m52390q0(z);
                }
            });
            this.f34103v.m52002q(new Runnable() { // from class: l.zcf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203749a.m52374C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m52390q0(boolean z) {
        m52374C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m52391r0(User user, Media media, int i) {
        if (user.pictures.size() >= 9) {
            return;
        }
        user.pictures.add(media);
        m52372A0(i, media);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m52392s0() {
        m52355x().mo52275Z2();
        m52355x().mo52250J3();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m52393t0(int i, String str, Media media) {
        if (i == 0) {
            m52372A0(0, media);
        } else {
            m52386m0(m52355x().act(), str, media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m52394u0(CompoundButton compoundButton, boolean z) {
        this.f34106y = z;
        this.f34107z = true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m52395v0(View view) {
        sfj0.m185596c("e_edit_profile_post_pic", "p_edit_profile_view", sfj0.C20032a.m185615h("post_pic_state", this.f34106y ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m52396w0() {
        m52355x().mo52250J3();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View view = this.f34105x;
        if (view != null) {
            return view;
        }
        this.f34100C = null;
        this.f34105x = m52355x().act().inflater().inflate(kec0.f126129x2, viewGroup, false);
        boolean zM212782a = xra.m212782a();
        View view2 = this.f34105x;
        if (zM212782a) {
            AvatarCards avatarCards = (AvatarCards) view2.findViewById(adc0.f70178W);
            this.f34104w = avatarCards;
            avatarCards.setViewCount(zk1.m219993b());
            this.f34104w.setConfig(new adf());
            this.f34104w.setOnMediaChanged(new Runnable() { // from class: l.bdf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76262a.m52392s0();
                }
            });
            bnl0.m105524M(this.f34104w, true);
            bnl0.m105524M(this.f34105x.findViewById(adc0.f70610vb), false);
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = (ExpEditProfileImageCardGroup) view2.findViewById(adc0.f70610vb);
            this.f34103v = expEditProfileImageCardGroup;
            expEditProfileImageCardGroup.setCardsCrop(true);
            this.f34103v.setCardPadding(qa00.f156321h);
            m52376E0();
            this.f34103v.setUploadDataCallback(new okf() { // from class: l.cdf
                @Override // p153l.okf
                /* JADX INFO: renamed from: a */
                public final void mo109169a(int i, String str, Media media) {
                    this.f81182a.m52393t0(i, str, media);
                }
            });
            this.f34103v.setViewCount(9);
            this.f34103v.setSlideWithoutPress(false);
            this.f34103v.setCurPageId("p_edit_profile_view");
            int childCount = this.f34103v.getChildCount();
            int i = 0;
            while (i < childCount) {
                ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34103v.m51994h(i);
                expEditProfileImageCardM51994h.setEnableLowPhoto(false);
                expEditProfileImageCardM51994h.f33905n = i > 0;
                expEditProfileImageCardM51994h.f33907p = i == 0;
                i++;
            }
            bnl0.m105524M(this.f34105x.findViewById(adc0.f70178W), false);
            bnl0.m105524M(this.f34103v, true);
        }
        TextView textView = (TextView) this.f34105x.findViewById(adc0.f70050O7);
        textView.setText("尊敬的用户，您发布的内容须遵守相关法律法规和社区规则，请严格遵守相关规定，以免违规");
        bnl0.m105524M(textView, au40.m100355a());
        TextView textView2 = (TextView) this.f34105x.findViewById(adc0.f70220Y9);
        VSwitchButton vSwitchButton = (VSwitchButton) this.f34105x.findViewById(adc0.f70204X9);
        this.f34098A = vSwitchButton;
        vSwitchButton.setThumbActiveColor(viewGroup.getResources().getColor(c9c0.f80318A));
        if (CoreModule.m30932N().mo61549ko()) {
            textView2.setText("上传新照片分享到动态及状态");
        }
        CoreModule.m30932N().mo61532el();
        User userM189086i2 = m52355x().m189086i2();
        if (jyb.m147479J(userM189086i2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f34106y = CoreModule.m30932N().mo61464Ha();
        } else {
            this.f34106y = "false".equals(userM189086i2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f34098A.setChecked(this.f34106y);
        sfj0.m185601h("e_edit_profile_post_pic", "p_edit_profile_view", sfj0.C20032a.m185615h("post_pic_state", this.f34106y ? "on" : BLiveOperationTitleShowType.off));
        return this.f34105x;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        this.f34098A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ddf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f87932a.m52394u0(compoundButton, z);
            }
        });
        this.f34098A.setOnClickListener(new View.OnClickListener() { // from class: l.edf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93507a.m52395v0(view);
            }
        });
        if (xra.m212782a() || this.f34099B || !xra.m212792k()) {
            return;
        }
        this.f34099B = true;
        ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34103v.m51994h(1);
        ExpEditProfileImageCard expEditProfileImageCardM51994h2 = this.f34103v.m51994h(2);
        expEditProfileImageCardM51994h.m52098p0();
        expEditProfileImageCardM51994h2.m52098p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m52397z0() {
        for (int i = 0; i < this.f34103v.getChildCount(); i++) {
            this.f34103v.m51994h(i).m52102x0(i);
        }
    }
}
