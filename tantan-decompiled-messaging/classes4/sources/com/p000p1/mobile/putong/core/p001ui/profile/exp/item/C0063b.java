package com.p000p1.mobile.putong.core.p001ui.profile.exp.item;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileImageCard;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.C0063b;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCards;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.PicPostDlgView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.cwf0;
import l.dd80;
import l.e30;
import l.f6c0;
import l.ftd0;
import l.ic50;
import l.j760;
import l.lqa;
import l.mcr;
import l.ml40;
import l.o6j0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.wn90;
import l.x2c0;
import l.xdl0;
import l.ygh0;
import org.jetbrains.annotations.NotNull;
import p002l.a1m;
import p002l.a2m;
import p002l.gd70;
import p002l.ijf;
import p002l.sk1;
import p002l.ubf;
import v.VSwitchButton;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0063b extends AbstractC0064c {

    /* JADX INFO: renamed from: E */
    public static cwf0 f1071E = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public VSwitchButton f1072A;

    /* JADX INFO: renamed from: B */
    public boolean f1073B;

    /* JADX INFO: renamed from: C */
    public a2m f1074C;

    /* JADX INFO: renamed from: D */
    public e30<List<Media>> f1075D;

    /* JADX INFO: renamed from: u */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f1076u;

    /* JADX INFO: renamed from: v */
    public ExpEditProfileImageCardGroup f1077v;

    /* JADX INFO: renamed from: w */
    public AvatarCards f1078w;

    /* JADX INFO: renamed from: x */
    public View f1079x;

    /* JADX INFO: renamed from: y */
    public boolean f1080y;

    /* JADX INFO: renamed from: z */
    public boolean f1081z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.b$a */
    public class a implements a2m {
        public a() {
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: a */
        public void mo1667a() {
            C0063b.this.m1624x().mo1515J3();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: b */
        public void mo1668b() {
            C0063b.this.m1666z0();
            C0063b.this.m1624x().mo1515J3();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: c */
        public void mo1669c() {
            C0063b.this.m1666z0();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: d */
        public void mo1670d() {
            C0063b.this.m1666z0();
        }
    }

    public C0063b(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f1076u = new tpd0("show_pic_post_dialog_count_" + CoreModule.H().userId(), 0);
        this.f1073B = false;
        this.f1074C = new a();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m1631W(VReorderCard vReorderCard) {
        if (NullChecker.a(vReorderCard.f868c.f9399f.f899j)) {
            vReorderCard.f868c.f9399f.f899j.run();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m1639x0() {
        f1071E.k();
        f1071E.j();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m1640y0(int i) {
        f1071E.o(ic50.j().f().U("p_edit_profile_post_pic_popup", ygh0.m(new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("popup_times", Integer.valueOf(i))})));
        f1071E.i();
        f1071E.l();
    }

    /* JADX INFO: renamed from: A0 */
    public void m1641A0(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1077v.m1257h(i);
        if (NullChecker.a(expEditProfileImageCardM1257h)) {
            expEditProfileImageCardM1257h.mo1136r(media.clone(), new Runnable() { // from class: l.rbf
                @Override // java.lang.Runnable
                public final void run() {
                    C0063b.m1631W(expEditProfileImageCardM1257h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m1642B0(boolean z) {
        if (z) {
            this.f1081z = true;
        }
        if (NullChecker.a(this.f1072A)) {
            this.f1072A.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public int m1643C0() {
        int i = 0;
        if (lqa.a()) {
            AvatarCards avatarCards = this.f1078w;
            if (NullChecker.a(avatarCards)) {
                if (avatarCards.m1257h(0).m1240n()) {
                    CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i < avatarCards.getChildCount() && avatarCards.m1257h(i).getMedia() != null) {
                    arrayList.add(avatarCards.m1257h(i).getMedia());
                    if (!TEnum.equals(avatarCards.m1257h(i).getMedia().status, "normal")) {
                        i2++;
                    }
                    i++;
                }
                int size = arrayList.size();
                if (!NullChecker.a(wn90.F().a)) {
                    CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    wn90.F().a = CoreModule.c.e0.p9().clone();
                }
                if (size > 0) {
                    wn90.F().a.pictures = arrayList;
                } else if (wn90.F().a.pictures.isEmpty()) {
                    wn90.F().a.pictures = m1624x().mo1517K2().pictures;
                }
                e30<List<Media>> e30Var = this.f1075D;
                if (e30Var != null) {
                    e30Var.call(arrayList);
                }
                return i2;
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f1077v;
            if (NullChecker.a(expEditProfileImageCardGroup)) {
                if (expEditProfileImageCardGroup.m1257h(0).m1240n()) {
                    CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
                }
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m1257h(i).m1240n()) {
                    arrayList2.add(expEditProfileImageCardGroup.m1257h(i).f937I);
                    if (!TEnum.equals(expEditProfileImageCardGroup.m1257h(i).f937I.status, "normal")) {
                        i3++;
                    }
                    i++;
                }
                int size2 = arrayList2.size();
                if (!NullChecker.a(wn90.F().a)) {
                    CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                    wn90.F().a = CoreModule.c.e0.p9().clone();
                }
                if (size2 > 0) {
                    wn90.F().a.pictures = arrayList2;
                } else if (wn90.F().a.pictures.isEmpty()) {
                    wn90.F().a.pictures = m1624x().mo1517K2().pictures;
                }
                if (size2 <= expEditProfileImageCardGroup.getChildCount()) {
                    m1646F0(size2, null, expEditProfileImageCardGroup);
                }
                mo1600E();
                e30<List<Media>> e30Var2 = this.f1075D;
                if (e30Var2 != null) {
                    e30Var2.call(arrayList2);
                }
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: D0 */
    public void m1644D0(User user) {
        if (m1652j0()) {
            user.profile.extensions.momentSwitch.noSyncMoment.clear();
            user.profile.extensions.momentSwitch.noSyncMoment.add(0, m1650h0() ? "false" : "true");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: E */
    public void mo1600E() {
        super.mo1600E();
        List list = lqa.s().weight.picture;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() > 0) {
                i++;
            }
        }
        User userM9268i2 = m1624x().m9268i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM9268i2.pictures.size(), list.size()); i2++) {
            iIntValue += ((Integer) list.get(i2)).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += ((Integer) list.get(i3)).intValue();
        }
        m1680P(iIntValue, iIntValue2, iIntValue2 != iIntValue ? String.format("添加%s张照片", Integer.valueOf(i - userM9268i2.pictures.size())) : "", "");
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1645E0() {
        if (lqa.a()) {
            this.f1078w.setZ(1.0f);
            PointF pointF = new PointF();
            pointF.x = 0.5f;
            pointF.y = 0.5f;
            this.f1078w.findViewById(u4c0.L5).getHierarchy().w(ftd0.j);
            this.f1078w.findViewById(u4c0.L5).getHierarchy().v(pointF);
            if (NullChecker.a(this.f1074C)) {
                this.f1078w.setOnMediaChanged(new Runnable() { // from class: l.zbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23328a.m1665w0();
                    }
                });
                return;
            }
            return;
        }
        this.f1077v.setZ(1.0f);
        PointF pointF2 = new PointF();
        pointF2.x = 0.5f;
        pointF2.y = 0.5f;
        this.f1077v.findViewById(u4c0.L5).getHierarchy().w(ftd0.j);
        this.f1077v.findViewById(u4c0.L5).getHierarchy().v(pointF2);
        if (NullChecker.a(this.f1074C)) {
            this.f1077v.setReorderCardsCallback(this.f1074C);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1646F0(int i, String str, ExpEditProfileImageCardGroup expEditProfileImageCardGroup) {
        if (i == expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m1257h(expEditProfileImageCardGroup.getChildCount() - 1).m1360o1(null);
            return;
        }
        expEditProfileImageCardGroup.m1257h(i).m1360o1(str);
        if (i < expEditProfileImageCardGroup.getChildCount() - 1) {
            expEditProfileImageCardGroup.m1257h(i + 1).m1360o1(null);
        }
        if (i > 0) {
            expEditProfileImageCardGroup.m1257h(i - 1).m1360o1(null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m1647e0(e30<List<Media>> e30Var) {
        this.f1075D = e30Var;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.profilelist.PicPostDlgView] */
    /* JADX INFO: renamed from: f0 */
    public boolean m1648f0(final ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        if (!m1654l0() || !m1653k0()) {
            return false;
        }
        ?? r0 = (PicPostDlgView) m1624x().act().inflater().inflate(f6c0.u8, (ViewGroup) null);
        r0.m2351s(m1649g0());
        this.f1076u.put(Integer.valueOf(((Integer) this.f1076u.get()).intValue() + 1));
        new dd80.a(m1624x().act()).R((View) r0).x0(R.string.f5, new Object[0]).s0(R.string.g5, new Object[0]).u0(t100.g, t100.q).P(false).a0(R.string.d5, new Runnable() { // from class: l.pbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f17179a.m1656n0(profileListExpandedEditFrag);
            }
        }).f0(R.string.e5, new Runnable() { // from class: l.qbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f17889a.m1657o0(profileListExpandedEditFrag);
            }
        }).i0(x2c0.jj).r0();
        m1640y0(((Integer) this.f1076u.get()).intValue());
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<Media> m1649g0() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (lqa.a()) {
            AvatarCards avatarCards = this.f1078w;
            if (NullChecker.a(avatarCards)) {
                while (i < avatarCards.getChildCount()) {
                    if (avatarCards.m1257h(i).m2305m0()) {
                        arrayList.add(avatarCards.m1257h(i).getMedia());
                    }
                    i++;
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f1077v;
            if (NullChecker.a(expEditProfileImageCardGroup)) {
                while (i < expEditProfileImageCardGroup.getChildCount()) {
                    if (expEditProfileImageCardGroup.m1257h(i).getAddPhotos().size() > 0) {
                        arrayList.addAll(expEditProfileImageCardGroup.m1257h(i).getAddPhotos());
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m1650h0() {
        return this.f1080y;
    }

    /* JADX INFO: renamed from: i0 */
    public void m1651i0(User user, boolean z) {
        if (m1653k0() && m1650h0() && !z) {
            wn90.F().d.onNext(Integer.valueOf(gd70.f11374c));
            wn90.F().e.onNext(roj0.a);
        } else {
            if (z) {
                return;
            }
            wn90.F().d.onNext(Integer.valueOf((NullChecker.a(user) && user.status.contains(UserStatus.get("audit"))) ? gd70.f11375d : gd70.f11376e));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m1652j0() {
        return this.f1081z;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m1653k0() {
        if (lqa.a()) {
            AvatarCards avatarCards = this.f1078w;
            if (NullChecker.a(avatarCards)) {
                for (int i = 0; i < avatarCards.getChildCount(); i++) {
                    if (avatarCards.m1257h(i).m2305m0()) {
                        return true;
                    }
                }
            }
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f1077v;
            if (NullChecker.a(expEditProfileImageCardGroup)) {
                for (int i2 = 0; i2 < expEditProfileImageCardGroup.getChildCount(); i2++) {
                    if (expEditProfileImageCardGroup.m1257h(i2).m1366y0()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m1654l0() {
        return !this.f1080y && CoreModule.N().Bj();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的生活照";
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1655m0(Act act, String str, final Media media) {
        final User userM1606f = m1606f();
        final int size = userM1606f.pictures.size();
        TagChooseMkAct.v2(act, vwb.M(media), (String) null, new Runnable() { // from class: l.acf
            @Override // java.lang.Runnable
            public final void run() {
                this.f7495a.m1660r0(userM1606f, media, size);
            }
        }, (Runnable) null);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "pic";
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m1656n0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m1642B0(true);
        profileListExpandedEditFrag.mo1575o();
        o6j0.c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new o6j0.a[0]);
        m1639x0();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m1657o0(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        m1642B0(false);
        m1639x0();
        profileListExpandedEditFrag.mo1575o();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m1658p0(boolean z) {
        m1643C0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        view.setElevation(10.0f);
        view.setOutlineProvider(null);
        if (lqa.a()) {
            this.f1078w.setViewCatchListener(new VReorderCards.InterfaceC0052c() { // from class: l.obf
                @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards.InterfaceC0052c
                /* JADX INFO: renamed from: a */
                public final void mo1268a(boolean z) {
                    this.f16480a.m1658p0(z);
                }
            });
        } else {
            this.f1077v.setViewCatchListener(new VReorderCards.InterfaceC0052c() { // from class: l.sbf
                @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards.InterfaceC0052c
                /* JADX INFO: renamed from: a */
                public final void mo1268a(boolean z) {
                    this.f18910a.m1659q0(z);
                }
            });
            this.f1077v.m1265q(new Runnable() { // from class: l.tbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20165a.m1643C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m1659q0(boolean z) {
        m1643C0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m1660r0(User user, Media media, int i) {
        if (user.pictures.size() >= 9) {
            return;
        }
        user.pictures.add(media);
        m1641A0(i, media);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m1661s0() {
        m1624x().mo1540Z2();
        m1624x().mo1515J3();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m1662t0(int i, String str, Media media) {
        if (i == 0) {
            m1641A0(0, media);
        } else {
            m1655m0(m1624x().act(), str, media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m1663u0(CompoundButton compoundButton, boolean z) {
        this.f1080y = z;
        this.f1081z = true;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m1664v0(View view) {
        o6j0.c("e_edit_profile_post_pic", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("post_pic_state", this.f1080y ? "on" : "off")});
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m1665w0() {
        m1624x().mo1515J3();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View view = this.f1079x;
        if (view != null) {
            return view;
        }
        this.f1074C = null;
        this.f1079x = m1624x().act().inflater().inflate(f6c0.x2, viewGroup, false);
        boolean zA = lqa.a();
        View view2 = this.f1079x;
        if (zA) {
            AvatarCards avatarCards = (AvatarCards) view2.findViewById(u4c0.W);
            this.f1078w = avatarCards;
            avatarCards.setViewCount(sk1.m22498b());
            this.f1078w.setConfig(new ubf());
            this.f1078w.setOnMediaChanged(new Runnable() { // from class: l.vbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21058a.m1661s0();
                }
            });
            xdl0.M(this.f1078w, true);
            xdl0.M(this.f1079x.findViewById(u4c0.tb), false);
        } else {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup = (ExpEditProfileImageCardGroup) view2.findViewById(u4c0.tb);
            this.f1077v = expEditProfileImageCardGroup;
            expEditProfileImageCardGroup.setCardsCrop(true);
            this.f1077v.setCardPadding(t100.h);
            m1645E0();
            this.f1077v.setUploadDataCallback(new ijf() { // from class: l.wbf
                @Override // p002l.ijf
                /* JADX INFO: renamed from: a */
                public final void mo15212a(int i, String str, Media media) {
                    this.f21604a.m1662t0(i, str, media);
                }
            });
            this.f1077v.setViewCount(9);
            this.f1077v.setSlideWithoutPress(false);
            this.f1077v.setCurPageId("p_edit_profile_view");
            int childCount = this.f1077v.getChildCount();
            int i = 0;
            while (i < childCount) {
                ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1077v.m1257h(i);
                expEditProfileImageCardM1257h.setEnableLowPhoto(false);
                expEditProfileImageCardM1257h.f879n = i > 0;
                expEditProfileImageCardM1257h.f881p = i == 0;
                i++;
            }
            xdl0.M(this.f1079x.findViewById(u4c0.W), false);
            xdl0.M(this.f1077v, true);
        }
        TextView textView = (TextView) this.f1079x.findViewById(u4c0.M7);
        textView.setText("尊敬的用户，您发布的内容须遵守相关法律法规和社区规则，请严格遵守相关规定，以免违规");
        xdl0.M(textView, ml40.a());
        TextView textView2 = (TextView) this.f1079x.findViewById(u4c0.W9);
        VSwitchButton vSwitchButtonFindViewById = this.f1079x.findViewById(u4c0.V9);
        this.f1072A = vSwitchButtonFindViewById;
        vSwitchButtonFindViewById.setThumbActiveColor(viewGroup.getResources().getColor(w0c0.A));
        if (CoreModule.N().ko()) {
            textView2.setText("上传新照片分享到动态及状态");
        }
        CoreModule.N().el();
        User userM9268i2 = m1624x().m9268i2();
        if (vwb.J(userM9268i2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f1080y = CoreModule.N().Ha();
        } else {
            this.f1080y = "false".equals((String) userM9268i2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f1072A.setChecked(this.f1080y);
        o6j0.h("e_edit_profile_post_pic", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("post_pic_state", this.f1080y ? "on" : "off")});
        return this.f1079x;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        this.f1072A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.xbf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f22209a.m1663u0(compoundButton, z);
            }
        });
        this.f1072A.setOnClickListener(new View.OnClickListener() { // from class: l.ybf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22785a.m1664v0(view);
            }
        });
        if (lqa.a() || this.f1073B || !lqa.k()) {
            return;
        }
        this.f1073B = true;
        ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1077v.m1257h(1);
        ExpEditProfileImageCard expEditProfileImageCardM1257h2 = this.f1077v.m1257h(2);
        expEditProfileImageCardM1257h.m1361p0();
        expEditProfileImageCardM1257h2.m1361p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m1666z0() {
        for (int i = 0; i < this.f1077v.getChildCount(); i++) {
            this.f1077v.m1257h(i).m1365x0(i);
        }
    }
}
