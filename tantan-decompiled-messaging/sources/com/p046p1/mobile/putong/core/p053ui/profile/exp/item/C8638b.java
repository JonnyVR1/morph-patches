package com.p046p1.mobile.putong.core.p053ui.profile.exp.item;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileImageCard;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.C8638b;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.PicPostDlgView;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VSwitchButton;
import p149l.a1m;
import p149l.a2m;
import p149l.cwf0;
import p149l.dd80;
import p149l.e30;
import p149l.f6c0;
import p149l.ftd0;
import p149l.gd70;
import p149l.ic50;
import p149l.ijf;
import p149l.lqa;
import p149l.mcr;
import p149l.ml40;
import p149l.o6j0;
import p149l.roj0;
import p149l.sk1;
import p149l.t100;
import p149l.tpd0;
import p149l.u4c0;
import p149l.ubf;
import p149l.vwb;
import p149l.w0c0;
import p149l.wn90;
import p149l.x2c0;
import p149l.xdl0;
import p149l.ygh0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8638b extends AbstractC8639c {

    /* JADX INFO: renamed from: E */
    public static cwf0 f33249E = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public VSwitchButton f33250A;

    /* JADX INFO: renamed from: B */
    public boolean f33251B;

    /* JADX INFO: renamed from: C */
    public a2m f33252C;

    /* JADX INFO: renamed from: D */
    public e30<List<Media>> f33253D;

    /* JADX INFO: renamed from: u */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f33254u;

    /* JADX INFO: renamed from: v */
    public ExpEditProfileImageCardGroup f33255v;

    /* JADX INFO: renamed from: w */
    public AvatarCards f33256w;

    /* JADX INFO: renamed from: x */
    public View f33257x;

    /* JADX INFO: renamed from: y */
    public boolean f33258y;

    /* JADX INFO: renamed from: z */
    public boolean f33259z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b$a */
    public class a implements a2m {
        public a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: a */
        public void mo51215a() {
            C8638b.this.m51172x().mo51067J3();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            C8638b.this.m51214z0();
            C8638b.this.m51172x().mo51067J3();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            C8638b.this.m51214z0();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            C8638b.this.m51214z0();
        }
    }

    public C8638b(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f33254u = new tpd0("show_pic_post_dialog_count_" + CoreModule.m29931H().userId(), 0);
        this.f33251B = false;
        this.f33252C = new a();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m51179W(VReorderCard vReorderCard) {
        if (NullChecker.m81303a(vReorderCard.f33046c.f87435f.f33077j)) {
            vReorderCard.f33046c.f87435f.f33077j.run();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m51187x0() {
        f33249E.m109035k();
        f33249E.m109034j();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m51188y0(int i) {
        f33249E.m109039o(ic50.m135327j().m135333f().m145234U("p_edit_profile_post_pic_popup", ygh0.m214692m(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("popup_times", Integer.valueOf(i)))));
        f33249E.m109033i();
        f33249E.m109036l();
    }

    /* JADX INFO: renamed from: A0 */
    public void m51189A0(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33255v.m50811h(i);
        if (NullChecker.m81303a(expEditProfileImageCardM50811h)) {
            expEditProfileImageCardM50811h.mo50700r(media.mo223809clone(), new Runnable() { // from class: l.rbf
                @Override // java.lang.Runnable
                public final void run() {
                    C8638b.m51179W(expEditProfileImageCardM50811h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m51190B0(boolean z) {
        if (z) {
            this.f33259z = true;
        }
        if (NullChecker.m81303a(this.f33250A)) {
            this.f33250A.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public int m51191C0() {
        int i = 0;
        if (lqa.m150963a()) {
            AvatarCards avatarCards = this.f33256w;
            if (NullChecker.m81303a(avatarCards)) {
                if (avatarCards.m50811h(0).m50794n()) {
                    CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i < avatarCards.getChildCount() && avatarCards.m50811h(i).getMedia() != null) {
                    arrayList.add(avatarCards.m50811h(i).getMedia());
                    if (!TEnum.equals(avatarCards.m50811h(i).getMedia().status, "normal")) {
                        i2++;
                    }
                    i++;
                }
                int size = arrayList.size();
                if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
                    CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
                }
                if (size > 0) {
                    wn90.m204602F().f187269a.pictures = arrayList;
                } else if (wn90.m204602F().f187269a.pictures.isEmpty()) {
                    wn90.m204602F().f187269a.pictures = m51172x().mo51069K2().pictures;
                }
                e30<List<Media>> e30Var = this.f33253D;
                if (e30Var != null) {
                    e30Var.call(arrayList);
                }
                return i2;
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f33255v;
            if (NullChecker.m81303a(expEditProfileImageCardGroup)) {
                if (expEditProfileImageCardGroup.m50811h(0).m50794n()) {
                    CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m50811h(i).m50794n()) {
                    arrayList2.add(expEditProfileImageCardGroup.m50811h(i).f33115I);
                    if (!TEnum.equals(expEditProfileImageCardGroup.m50811h(i).f33115I.status, "normal")) {
                        i3++;
                    }
                    i++;
                }
                int size2 = arrayList2.size();
                if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
                    CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
                }
                if (size2 > 0) {
                    wn90.m204602F().f187269a.pictures = arrayList2;
                } else if (wn90.m204602F().f187269a.pictures.isEmpty()) {
                    wn90.m204602F().f187269a.pictures = m51172x().mo51069K2().pictures;
                }
                if (size2 <= expEditProfileImageCardGroup.getChildCount()) {
                    m51194F0(size2, null, expEditProfileImageCardGroup);
                }
                mo51148E();
                e30<List<Media>> e30Var2 = this.f33253D;
                if (e30Var2 != null) {
                    e30Var2.call(arrayList2);
                }
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m51192D0(User user) {
        if (m51200j0()) {
            user.profile.extensions.momentSwitch.noSyncMoment.clear();
            user.profile.extensions.momentSwitch.noSyncMoment.add(0, m51198h0() ? "false" : "true");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: E */
    public void mo51148E() {
        super.mo51148E();
        List<Integer> list = lqa.m150981s().weight.picture;
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().intValue() > 0) {
                i++;
            }
        }
        User userM94569i2 = m51172x().m94569i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM94569i2.pictures.size(), list.size()); i2++) {
            iIntValue += list.get(i2).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += list.get(i3).intValue();
        }
        m51225P(iIntValue, iIntValue2, iIntValue2 != iIntValue ? String.format("添加%s张照片", Integer.valueOf(i - userM94569i2.pictures.size())) : "", "");
    }

    /* JADX INFO: renamed from: E0 */
    public final void m51193E0() {
        if (lqa.m150963a()) {
            this.f33256w.setZ(1.0f);
            PointF pointF = new PointF();
            pointF.x = 0.5f;
            pointF.y = 0.5f;
            ((SimpleDraweeView) this.f33256w.findViewById(u4c0.f173909L5)).getHierarchy().m112076w(ftd0.f99186j);
            ((SimpleDraweeView) this.f33256w.findViewById(u4c0.f173909L5)).getHierarchy().m112075v(pointF);
            if (NullChecker.m81303a(this.f33252C)) {
                this.f33256w.setOnMediaChanged(new Runnable() { // from class: l.zbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202437a.m51213w0();
                    }
                });
                return;
            }
            return;
        }
        this.f33255v.setZ(1.0f);
        PointF pointF2 = new PointF();
        pointF2.x = 0.5f;
        pointF2.y = 0.5f;
        ((SimpleDraweeView) this.f33255v.findViewById(u4c0.f173909L5)).getHierarchy().m112076w(ftd0.f99186j);
        ((SimpleDraweeView) this.f33255v.findViewById(u4c0.f173909L5)).getHierarchy().m112075v(pointF2);
        if (NullChecker.m81303a(this.f33252C)) {
            this.f33255v.setReorderCardsCallback(this.f33252C);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m51194F0(int i, String str, ExpEditProfileImageCardGroup expEditProfileImageCardGroup) {
        if (i == expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m50811h(expEditProfileImageCardGroup.getChildCount() - 1).m50914o1(null);
            return;
        }
        expEditProfileImageCardGroup.m50811h(i).m50914o1(str);
        if (i < expEditProfileImageCardGroup.getChildCount() - 1) {
            expEditProfileImageCardGroup.m50811h(i + 1).m50914o1(null);
        }
        if (i > 0) {
            expEditProfileImageCardGroup.m50811h(i - 1).m50914o1(null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m51195e0(e30<List<Media>> e30Var) {
        this.f33253D = e30Var;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m51196f0(final ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        if (!m51202l0() || !m51201k0()) {
            return false;
        }
        PicPostDlgView picPostDlgView = (PicPostDlgView) m51172x().act().inflater().inflate(f6c0.f96030u8, (ViewGroup) null);
        picPostDlgView.m51823s(m51197g0());
        this.f33254u.put(Integer.valueOf(this.f33254u.get().intValue() + 1));
        new dd80.C16336a(m51172x().act()).m110963R(picPostDlgView).m110995x0(R$string.f18506f5, new Object[0]).m110990s0(R$string.f18537g5, new Object[0]).m110992u0(t100.f167258g, t100.f167268q).m110961P(false).m110972a0(R$string.f18445d5, new Runnable() { // from class: l.pbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f148076a.m51204n0(profileListExpandedEditFrag);
            }
        }).m110977f0(R$string.f18475e5, new Runnable() { // from class: l.qbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f153642a.m51205o0(profileListExpandedEditFrag);
            }
        }).m110980i0(x2c0.f190270jj).m110989r0();
        m51188y0(this.f33254u.get().intValue());
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<Media> m51197g0() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (lqa.m150963a()) {
            AvatarCards avatarCards = this.f33256w;
            if (NullChecker.m81303a(avatarCards)) {
                while (i < avatarCards.getChildCount()) {
                    if (avatarCards.m50811h(i).m51777m0()) {
                        arrayList.add(avatarCards.m50811h(i).getMedia());
                    }
                    i++;
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f33255v;
            if (NullChecker.m81303a(expEditProfileImageCardGroup)) {
                while (i < expEditProfileImageCardGroup.getChildCount()) {
                    if (expEditProfileImageCardGroup.m50811h(i).getAddPhotos().size() > 0) {
                        arrayList.addAll(expEditProfileImageCardGroup.m50811h(i).getAddPhotos());
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m51198h0() {
        return this.f33258y;
    }

    /* JADX INFO: renamed from: i0 */
    public void m51199i0(User user, boolean z) {
        if (m51201k0() && m51198h0() && !z) {
            wn90.m204602F().f187272d.m132487l(Integer.valueOf(gd70.f102083c));
            wn90.m204602F().f187273e.m132487l(roj0.f160388a);
        } else {
            if (z) {
                return;
            }
            wn90.m204602F().f187272d.m132487l(Integer.valueOf((NullChecker.m81303a(user) && user.status.contains(UserStatus.get(UserStatus.audit))) ? gd70.f102084d : gd70.f102085e));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m51200j0() {
        return this.f33259z;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m51201k0() {
        if (lqa.m150963a()) {
            AvatarCards avatarCards = this.f33256w;
            if (NullChecker.m81303a(avatarCards)) {
                for (int i = 0; i < avatarCards.getChildCount(); i++) {
                    if (avatarCards.m50811h(i).m51777m0()) {
                        return true;
                    }
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f33255v;
            if (NullChecker.m81303a(expEditProfileImageCardGroup)) {
                for (int i2 = 0; i2 < expEditProfileImageCardGroup.getChildCount(); i2++) {
                    if (expEditProfileImageCardGroup.m50811h(i2).m50920y0()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m51202l0() {
        return !this.f33258y && CoreModule.m29934N().mo60264Bj();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的生活照";
    }

    /* JADX INFO: renamed from: m0 */
    public final void m51203m0(Act act, String str, final Media media) {
        final User userM51154f = m51154f();
        final int size = userM51154f.pictures.size();
        TagChooseMkAct.m43222v2(act, vwb.m200299M(media), null, new Runnable() { // from class: l.acf
            @Override // java.lang.Runnable
            public final void run() {
                this.f68792a.m51208r0(userM51154f, media, size);
            }
        }, null);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return CreditScoreTaskType.pic;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m51204n0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m51190B0(true);
        profileListExpandedEditFrag.mo51123o();
        o6j0.m162859c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new o6j0.C18854a[0]);
        m51187x0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m51205o0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m51190B0(false);
        m51187x0();
        profileListExpandedEditFrag.mo51123o();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m51206p0(boolean z) {
        m51191C0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        view.setElevation(10.0f);
        view.setOutlineProvider(null);
        if (lqa.m150963a()) {
            this.f33256w.setViewCatchListener(new VReorderCards.InterfaceC8627c() { // from class: l.obf
                @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards.InterfaceC8627c
                /* JADX INFO: renamed from: a */
                public final void mo50822a(boolean z) {
                    this.f142908a.m51206p0(z);
                }
            });
        } else {
            this.f33255v.setViewCatchListener(new VReorderCards.InterfaceC8627c() { // from class: l.sbf
                @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards.InterfaceC8627c
                /* JADX INFO: renamed from: a */
                public final void mo50822a(boolean z) {
                    this.f163531a.m51207q0(z);
                }
            });
            this.f33255v.m50819q(new Runnable() { // from class: l.tbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f169253a.m51191C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m51207q0(boolean z) {
        m51191C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m51208r0(User user, Media media, int i) {
        if (user.pictures.size() >= 9) {
            return;
        }
        user.pictures.add(media);
        m51189A0(i, media);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m51209s0() {
        m51172x().mo51092Z2();
        m51172x().mo51067J3();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m51210t0(int i, String str, Media media) {
        if (i == 0) {
            m51189A0(0, media);
        } else {
            m51203m0(m51172x().act(), str, media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m51211u0(CompoundButton compoundButton, boolean z) {
        this.f33258y = z;
        this.f33259z = true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m51212v0(View view) {
        o6j0.m162859c("e_edit_profile_post_pic", "p_edit_profile_view", o6j0.C18854a.m162878h("post_pic_state", this.f33258y ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m51213w0() {
        m51172x().mo51067J3();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View view = this.f33257x;
        if (view != null) {
            return view;
        }
        this.f33252C = null;
        this.f33257x = m51172x().act().inflater().inflate(f6c0.f96075x2, viewGroup, false);
        boolean zM150963a = lqa.m150963a();
        View view2 = this.f33257x;
        if (zM150963a) {
            AvatarCards avatarCards = (AvatarCards) view2.findViewById(u4c0.f174087W);
            this.f33256w = avatarCards;
            avatarCards.setViewCount(sk1.m184570b());
            this.f33256w.setConfig(new ubf());
            this.f33256w.setOnMediaChanged(new Runnable() { // from class: l.vbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180839a.m51209s0();
                }
            });
            xdl0.m208344M(this.f33256w, true);
            xdl0.m208344M(this.f33257x.findViewById(u4c0.f174485tb), false);
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = (ExpEditProfileImageCardGroup) view2.findViewById(u4c0.f174485tb);
            this.f33255v = expEditProfileImageCardGroup;
            expEditProfileImageCardGroup.setCardsCrop(true);
            this.f33255v.setCardPadding(t100.f167259h);
            m51193E0();
            this.f33255v.setUploadDataCallback(new ijf() { // from class: l.wbf
                @Override // p149l.ijf
                /* JADX INFO: renamed from: a */
                public final void mo136608a(int i, String str, Media media) {
                    this.f185572a.m51210t0(i, str, media);
                }
            });
            this.f33255v.setViewCount(9);
            this.f33255v.setSlideWithoutPress(false);
            this.f33255v.setCurPageId("p_edit_profile_view");
            int childCount = this.f33255v.getChildCount();
            int i = 0;
            while (i < childCount) {
                ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33255v.m50811h(i);
                expEditProfileImageCardM50811h.setEnableLowPhoto(false);
                expEditProfileImageCardM50811h.f33057n = i > 0;
                expEditProfileImageCardM50811h.f33059p = i == 0;
                i++;
            }
            xdl0.m208344M(this.f33257x.findViewById(u4c0.f174087W), false);
            xdl0.m208344M(this.f33255v, true);
        }
        TextView textView = (TextView) this.f33257x.findViewById(u4c0.f173928M7);
        textView.setText("尊敬的用户，您发布的内容须遵守相关法律法规和社区规则，请严格遵守相关规定，以免违规");
        xdl0.m208344M(textView, ml40.m155115a());
        TextView textView2 = (TextView) this.f33257x.findViewById(u4c0.f174097W9);
        VSwitchButton vSwitchButton = (VSwitchButton) this.f33257x.findViewById(u4c0.f174081V9);
        this.f33250A = vSwitchButton;
        vSwitchButton.setThumbActiveColor(viewGroup.getResources().getColor(w0c0.f183749A));
        if (CoreModule.m29934N().mo60365ko()) {
            textView2.setText("上传新照片分享到动态及状态");
        }
        CoreModule.m29934N().mo60348el();
        User userM94569i2 = m51172x().m94569i2();
        if (vwb.m200296J(userM94569i2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f33258y = CoreModule.m29934N().mo60280Ha();
        } else {
            this.f33258y = "false".equals(userM94569i2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f33250A.setChecked(this.f33258y);
        o6j0.m162864h("e_edit_profile_post_pic", "p_edit_profile_view", o6j0.C18854a.m162878h("post_pic_state", this.f33258y ? "on" : BLiveOperationTitleShowType.off));
        return this.f33257x;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        this.f33250A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.xbf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f191943a.m51211u0(compoundButton, z);
            }
        });
        this.f33250A.setOnClickListener(new View.OnClickListener() { // from class: l.ybf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197328a.m51212v0(view);
            }
        });
        if (lqa.m150963a() || this.f33251B || !lqa.m150973k()) {
            return;
        }
        this.f33251B = true;
        ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33255v.m50811h(1);
        ExpEditProfileImageCard expEditProfileImageCardM50811h2 = this.f33255v.m50811h(2);
        expEditProfileImageCardM50811h.m50915p0();
        expEditProfileImageCardM50811h2.m50915p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m51214z0() {
        for (int i = 0; i < this.f33255v.getChildCount(); i++) {
            this.f33255v.m50811h(i).m50919x0(i);
        }
    }
}
