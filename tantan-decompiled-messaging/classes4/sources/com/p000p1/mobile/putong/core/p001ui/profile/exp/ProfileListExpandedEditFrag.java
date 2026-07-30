package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.animation.Animator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.C0063b;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCards;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.ProfileListFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.report.f;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.ark;
import l.aw90;
import l.bt0;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.f6c0;
import l.ft4;
import l.g30;
import l.j760;
import l.jjb0;
import l.jo0;
import l.l9b;
import l.lqa;
import l.lra0;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.p420;
import l.qib0;
import l.qp4;
import l.roj0;
import l.t100;
import l.t7c0;
import l.tw6;
import l.u4c0;
import l.upa;
import l.ura;
import l.v9j;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wn90;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.xx0;
import l.yij0;
import l.zvf0;
import p002l.agf;
import p002l.fmf;
import p002l.gd70;
import p002l.mmf;
import p002l.n9f;
import p002l.nel;
import p002l.qcf;
import p002l.rqh0;
import rx.subjects.a;
import v.VButton;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileListExpandedEditFrag extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: L0 */
    public static CategorySuggestions f996L0;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f997A;

    /* JADX INFO: renamed from: B */
    public VFrame f998B;

    /* JADX INFO: renamed from: C */
    public VProgressBar f999C;

    /* JADX INFO: renamed from: D */
    public VLinear f1000D;

    /* JADX INFO: renamed from: E */
    public TabLayout f1001E;

    /* JADX INFO: renamed from: E0 */
    public n9f f1002E0;

    /* JADX INFO: renamed from: F */
    public ExpEditTopWarnView f1003F;

    /* JADX INFO: renamed from: F0 */
    public c4g0 f1004F0;

    /* JADX INFO: renamed from: G */
    public RecyclerView f1005G;

    /* JADX INFO: renamed from: G0 */
    public c4g0 f1006G0;

    /* JADX INFO: renamed from: H */
    public VText f1007H;

    /* JADX INFO: renamed from: H0 */
    public boolean f1008H0;

    /* JADX INFO: renamed from: I */
    public View f1009I;

    /* JADX INFO: renamed from: I0 */
    public final HashMap<String, C0060d> f1010I0;

    /* JADX INFO: renamed from: J */
    public mmf f1011J;

    /* JADX INFO: renamed from: J0 */
    public cwf0 f1012J0;

    /* JADX INFO: renamed from: K */
    public fmf f1013K;

    /* JADX INFO: renamed from: K0 */
    public cwf0 f1014K0;

    /* JADX INFO: renamed from: L */
    public ExpProfileEditLinearLayoutManager f1015L;

    /* JADX INFO: renamed from: M */
    public User f1016M;

    /* JADX INFO: renamed from: O */
    public j760<List<Literatures>, List<LiteraturesComments>> f1018O;

    /* JADX INFO: renamed from: R */
    public Animator f1021R;

    /* JADX INFO: renamed from: T */
    public String f1023T;

    /* JADX INFO: renamed from: V */
    public String f1025V;

    /* JADX INFO: renamed from: Y */
    public qcf f1028Y;

    /* JADX INFO: renamed from: Z */
    public C0063b f1029Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f1030k0;

    /* JADX INFO: renamed from: p0 */
    public rqh0 f1031p0;

    /* JADX INFO: renamed from: z */
    public VFrame f1032z;

    /* JADX INFO: renamed from: N */
    public final a<roj0> f1017N = a.b();

    /* JADX INFO: renamed from: P */
    public HashMap<String, String> f1019P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    public agf f1020Q = new agf();

    /* JADX INFO: renamed from: S */
    public boolean f1022S = true;

    /* JADX INFO: renamed from: U */
    public String f1024U = "";

    /* JADX INFO: renamed from: W */
    public boolean f1026W = false;

    /* JADX INFO: renamed from: X */
    public final List<AbstractC0064c> f1027X = new ArrayList();

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$a */
    public class C0057a extends RecyclerView.t {
        public C0057a() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                ProfileListExpandedEditFrag.this.m1580q7(true);
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i2 < 0) {
                ProfileListExpandedEditFrag.this.m1580q7(recyclerView != null);
            } else if (i2 > 0) {
                ProfileListExpandedEditFrag.this.m1580q7(recyclerView == null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$b */
    public class C0058b implements e30<List<Media>> {

        /* JADX INFO: renamed from: a */
        public int f1034a = -1;

        public C0058b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(List<Media> list) {
            if (vwb.J(list)) {
                return;
            }
            int size = list.size();
            int i = this.f1034a;
            if (size != i) {
                int size2 = list.size();
                this.f1034a = size2;
                if (i == 9 || (size2 == 9 && i > 0)) {
                    ProfileListExpandedEditFrag.this.mo1515J3();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$c */
    public class C0059c implements w9j<Media, Boolean> {
        public C0059c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$d */
    public static class C0060d {

        /* JADX INFO: renamed from: a */
        public String f1037a;

        /* JADX INFO: renamed from: b */
        public boolean f1038b;

        /* JADX INFO: renamed from: c */
        public boolean f1039c;
    }

    public ProfileListExpandedEditFrag() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.hv90
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((c) obj).c);
            }
        }));
        this.f1008H0 = false;
        creates(new e30() { // from class: l.sv90
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m1434P4((Bundle) obj);
            }
        });
        this.f1010I0 = new HashMap<>();
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m1419E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E7 */
    private void m1420E7() {
        new xh0.a(act()).s(act().getString(R.string.Fk)).g(false).j(act().getString(R.string.Dk)).r(act().getString(R.string.Ek)).o(new View.OnClickListener() { // from class: l.eu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9967a.m1561h7(view);
            }
        }).f(act().getString(R.string.Ck)).c(new View.OnClickListener() { // from class: l.fu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10636a.m1563i7(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: F7 */
    private void m1422F7(int i) {
        if (i > 0) {
            m1495A7(i);
        } else {
            m1472n7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G6 */
    public /* synthetic */ void m1424G6(View view) {
        m1581r7(true);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m1432O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m1433O5(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m1434P4(Bundle bundle) {
        if (f996L0 == null) {
            e51.y(new Runnable() { // from class: l.pu90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m1455a5();
                }
            });
        }
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: T5 */
    public static /* synthetic */ Boolean m1443T5(Media media) {
        if ((media instanceof Picture) && TEnum.equals(media.status, "normal")) {
            Picture picture = (Picture) media;
            if (picture.isLow() || picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE")) || picture.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"))) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m1447V5(Throwable th) {
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ void m1449W5(Throwable th) {
    }

    @MainThread
    /* JADX INFO: renamed from: Z5 */
    private void m1454Z5() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m1483t7();
        if (NullChecker.a(mo1506F1(false)) && this.f1026W) {
            User user = wn90.F().a;
            if (!TEnum.equals(this.f1016M.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f1016M.profile.zodiac;
            }
            wn90.F().a = this.f1016M.clone();
            User user2 = wn90.F().a;
            user2.description = user.description;
            user2.pictures = user.pictures;
            user2.profile = user.profile;
            user2.voice = user.voice;
            user2.name = user.name;
            Settings settings = user2.settings;
            settings.birthdate = user.settings.birthdate;
            settings.getSettingGroup().privacy.hideSchool = user.settings.getSettingGroup().privacy.hideSchool;
            Extensions extensions = user2.profile.extensions;
            Physical physical = extensions.physical;
            Extensions extensions2 = this.f1016M.profile.extensions;
            physical.bloodType = extensions2.physical.bloodType;
            extensions.interest.emoji = extensions2.interest.emoji;
            ProfileExtensionBasic profileExtensionBasic = extensions.basic;
            ProfileExtensionBasic profileExtensionBasic2 = extensions2.basic;
            profileExtensionBasic.idealType = profileExtensionBasic2.idealType;
            profileExtensionBasic.ideal = profileExtensionBasic2.ideal;
        } else {
            this.f1026W = true;
            wn90.F().a = this.f1016M.clone();
        }
        m1487v7(wn90.F().a, false);
        this.f1013K.m13313a(this.f1025V);
        this.f1013K.m13314b(this.f1019P.get("action"));
        this.f1005G.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f1013K.m13315c(this.f1025V);
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m1455a5() {
        try {
            f996L0 = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.a));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m1460f5(Throwable th) {
    }

    /* JADX INFO: renamed from: g6 */
    private User m1462g6() {
        User userClone = this.f1016M.clone();
        this.f1029Z.m1644D0(userClone);
        return userClone.subtract(this.f1016M);
    }

    /* JADX INFO: renamed from: i6 */
    private List<AbstractC0064c> m1465i6(List<AbstractC0064c> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0064c abstractC0064c : list) {
            if (abstractC0064c.mo1618r()) {
                arrayList.add(abstractC0064c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l7 */
    private void m1469l7() {
        xdl0.b0(this.f1032z, new v9j() { // from class: l.cv90
            public final Object call() {
                return ProfileListExpandedEditFrag.m1419E5();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    private void m1472n7() {
        if (vwb.J(wn90.F().a.pictures)) {
            b4().F("你的个人资料页需要至少一张照片").t0(R.string.Q, new Runnable() { // from class: l.ru90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18682a.m2871tc();
                }
            }).k0(R.string.c).z0();
            return;
        }
        final User userM1554f6 = m1554f6();
        User userM1462g6 = m1462g6();
        boolean z = true;
        if (NullChecker.a(userM1554f6) && NullChecker.a(userM1462g6) && userM1554f6.equals(userM1462g6)) {
            this.f1008H0 = true;
        }
        final User userClone = wn90.F().a.clone();
        final User userClone2 = this.f1016M.clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.a(userM1554f6) && NullChecker.a(userM1554f6.profile) && NullChecker.a(userM1554f6.profile.extensions) && NullChecker.a(userM1554f6.profile.extensions.basic) && !TextUtils.isEmpty(userM1554f6.description)) {
            arrayList.add("about_me");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        o6j0.c("e_profile_save_button", pageId(), new o6j0.a[]{o6j0.a.h("edit_profile_content_modified", sb.toString())});
        if (!NullChecker.a(userM1554f6)) {
            m2871tc();
            return;
        }
        o4(R.string.J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        if (NullChecker.a(userM1554f6.profile) && NullChecker.a(userM1554f6.profile.extensions)) {
            userM1554f6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.e2() && NullChecker.a(userM1554f6) && NullChecker.a(userM1554f6.profile) && NullChecker.a(userM1554f6.profile.extensions) && NullChecker.a(userM1554f6.profile.extensions.basic) && !vwb.J(userM1554f6.profile.extensions.basic.friendPurpose)) ? TEnum.equals((Purpose) userM1554f6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.su90
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m1432O4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.tu90
            public final Object call(Object obj) {
                return this.f20379a.m1511H6(userM1554f6, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.K(new e30() { // from class: l.uu90
            public final void call(Object obj) {
                this.f20796a.m1513I6(zEquals, userClone, userClone2, userM1554f6, (roj0) obj);
            }
        }, new e30() { // from class: l.vu90
            public final void call(Object obj) {
                this.f21325a.m1519L6(userClone2, userM1554f6, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o6 */
    private void m1474o6() {
        qcf qcfVar = new qcf(this, this);
        this.f1028Y = qcfVar;
        this.f1027X.addAll(qcfVar.m21160g());
        C0063b c0063b = (C0063b) this.f1028Y.m21161h(C0063b.class);
        this.f1029Z = c0063b;
        c0063b.m1647e0(new C0058b());
    }

    /* JADX INFO: renamed from: p6 */
    private void m1476p6() {
        gd70.m13725b().m13728e(Boolean.FALSE);
        xdl0.M(this.f997A, true);
        this.f997A.setLeftIconResource(x2c0.C);
        this.f997A.setBackgroundColor(getResources().getColor(w0c0.O0));
        act().setStatusBarColor(getResources().getColor(w0c0.O0));
        act().getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(w0c0.O0)));
        View viewInflate = act().inflater().inflate(f6c0.B9, (ViewGroup) null);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.m4);
        vButtonFindViewById.setBackgroundResource(x2c0.D);
        xdl0.W(vButtonFindViewById, t100.e);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.nu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16199a.m1591z6(view);
            }
        });
        this.f997A.z(new View[]{viewInflate});
        this.f997A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ou90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16794a.m1494A6(view);
            }
        });
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: q6 */
    private void m1478q6() {
        if (CertificationUtil.l() || !jjb0.b()) {
            return;
        }
        m1512H7("pic_cert_guide", true);
        mkd0.z(this.f1004F0);
        this.f1004F0 = duringCreated(CoreModule.c.B0.j4()).filter(new w9j() { // from class: l.lu90
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf((verificationCenter == null || verificationCenter.picVerificationInfo == null) ? false : true);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.wu90
            public final void call(Object obj) {
                this.f21986a.m1496B6((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m1479r5(c cVar) {
    }

    /* JADX INFO: renamed from: r6 */
    private void m1480r6() {
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ju90
            public final void call(Object obj) {
                this.f14024a.m1499C6((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    private void m1483t7() {
        List<AbstractC0064c> listM1465i6 = m1465i6(this.f1027X);
        this.f1020Q.m9625L(listM1465i6);
        this.f1028Y.m21164k(this.f1001E, listM1465i6, this.f1031p0);
        m1584t6();
    }

    /* JADX INFO: renamed from: u7 */
    private void m1485u7(final List<Media> list, final boolean z) {
        boolean zA = lqa.a();
        C0063b c0063b = this.f1029Z;
        if (zA) {
            c0063b.m1602b(new d30() { // from class: l.ku90
                public final void call() {
                    this.f14529a.m1532T6(list, z);
                }
            });
        } else {
            c0063b.m1602b(new d30() { // from class: l.mu90
                public final void call() {
                    this.f15634a.m1534V6(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m1486v5() {
        try {
            ProfileListFrag.f1432I4 = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.a));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m1487v7(User user, boolean z) {
        m1483t7();
        m1485u7(user.pictures, z);
        this.f1011J.m18036m(user);
    }

    /* JADX INFO: renamed from: w7 */
    private void m1489w7(User user) {
        wn90.F().a = user;
        m1454Z5();
    }

    /* JADX INFO: renamed from: y7 */
    private void m1492y7(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + this.f1023T));
        }
        this.f1016M = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m1494A6(View view) {
        m1579p7();
    }

    /* JADX INFO: renamed from: A7 */
    public void m1495A7(final int i) {
        new xh0.a(act()).s(x4(R.string.Oq)).g(false).i(R.string.Nq).q(R.string.Mq).o(new View.OnClickListener() { // from class: l.du90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9425a.m1547c7(i, view);
            }
        }).e(R.string.c).a().g();
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m1496B6(VerificationCenter verificationCenter) {
        m1512H7("pic_cert_guide", !CertificationUtil.l());
    }

    /* JADX INFO: renamed from: B7 */
    public void m1497B7(final boolean z, String str, String str2, final w9j<Media, Boolean> w9jVar) {
        if (this.f1014K0 == null) {
            this.f1014K0 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.a(act()).s(str).g(false).j(str2).r("保存其他资料").o(new View.OnClickListener() { // from class: l.gv90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11635a.m1550d7(w9jVar, view);
            }
        }).f(z ? "不保存" : "继续编辑").c(new View.OnClickListener() { // from class: l.iv90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13430a.m1552e7(z, view);
            }
        }).n(new DialogInterface.OnShowListener() { // from class: l.jv90
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f14048a.m1555f7(dialogInterface);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.kv90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14550a.m1558g7(dialogInterface);
            }
        }).a().g();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo1498C2() {
        return f996L0;
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m1499C6(User user) {
        m1492y7(user);
        this.f1017N.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: C7 */
    public final boolean m1500C7() {
        if (CoreModule.K().me_().isBanned()) {
            JailedDialogLikeAct.o2(true);
            return true;
        }
        if (!this.f1030k0 && CoreModule.c.e0.e8()) {
            xx0.h(act());
            return true;
        }
        if (this.f1030k0 || !CoreModule.K().me_().isAudit() || ura.e().d().Ln()) {
            return false;
        }
        xx0.f(act());
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo1501D2() {
        return true;
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m1502D6(FakeGuideData fakeGuideData) {
        m1512H7("stock_fake_guide", true);
    }

    /* JADX INFO: renamed from: D7 */
    public final void m1503D7(boolean z) {
        m1497B7(z, "检测到不符合要求的照片", "若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除", new w9j() { // from class: l.qt90
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m1443T5((Media) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: E */
    public void mo1504E() {
        this.f1011J.m18036m(wn90.F().a);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m1505E6(Bundle bundle) {
        mo1559h3();
        if (ProfileListFrag.f1432I4 == null) {
            e51.y(new Runnable() { // from class: l.pv90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m1486v5();
                }
            });
        }
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo1506F1(boolean z) {
        if (!NullChecker.a(wn90.F().a)) {
            if (z) {
                CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            wn90.F().a = CoreModule.c.e0.p9().clone();
        }
        return wn90.F().a;
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m1507F6(roj0 roj0Var) {
        mo1559h3();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: G */
    public void mo1508G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.E0(view, m2939N4(this.f1016M));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m1509G7() {
        lra0.h("android_back");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo1510H3() {
        return this.f1018O;
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ rx.c m1511H6(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.E9(user);
        }
        User user2 = wn90.F().a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        if (TextUtils.isEmpty(((Media) user3.pictures.get(0)).url)) {
            m1487v7(user2, true);
        } else {
            user2.pictures = profileEditInfo.user.pictures;
            m1487v7(user2, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H7 */
    public void m1512H7(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C0060d c0060d = this.f1010I0.get(str);
            if (c0060d == null) {
                c0060d = new C0060d();
                c0060d.f1037a = str;
            }
            c0060d.f1038b = z;
            this.f1010I0.put(str, c0060d);
        }
        boolean zM = vwb.m(this.f1010I0.entrySet(), new w9j() { // from class: l.pt90
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileListExpandedEditFrag.C0060d) ((Map.Entry) obj).getValue()).f1038b);
            }
        });
        ExpEditTopWarnView expEditTopWarnView = this.f1003F;
        if (zM) {
            xdl0.M(expEditTopWarnView, true);
        } else {
            xdl0.M(expEditTopWarnView, false);
        }
        xdl0.C0(this.f1003F, t100.A);
        C0060d c0060d2 = this.f1010I0.get("stock_fake_guide");
        if (c0060d2 != null && c0060d2.f1038b) {
            this.f1003F.m1394c("请立即更换真实头像，以免影响你在划卡的曝光", x2c0.Y6, 0);
            return;
        }
        C0060d c0060d3 = this.f1010I0.get("audit_guide");
        if (c0060d3 != null && c0060d3.f1038b) {
            this.f1003F.m1394c("有资料在审核中", x2c0.X6, 0);
            return;
        }
        C0060d c0060d4 = this.f1010I0.get("pic_cert_guide");
        if (c0060d4 == null || !c0060d4.f1038b) {
            return;
        }
        this.f1003F.m1396e("完成头像认证会被优先推荐", "认证", x2c0.Z6, "https://auto.tancdn.com/v1/images/eyJpZCI6IjM0RVZJN1JITFNWNVdHUUtFUVBNRzdRRjVORFVGNDE0IiwidyI6MTA3NywiaCI6MTYyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE1Nzk0MDc5MzcwMzQ2ODM2NX0.png");
        xdl0.E0(this.f1003F, new View.OnClickListener() { // from class: l.au90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7884a.m1568k7(view);
            }
        });
        if (!c0060d4.f1039c) {
            c0060d4.f1039c = true;
            zvf0.x("e_edit_profile_view_edit_verification", "p_edit_profile_view");
        }
        xdl0.C0(this.f1003F, t100.C);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m1513I6(boolean z, User user, User user2, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.c.e0.g4.onNext("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.D("e_upload_photos_success", pageId(), new j760[]{vwb.Y("upload_page_name", "edit_profile_page"), vwb.Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size()))});
        }
        m2871tc();
        if (NullChecker.a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.c.e0.H7();
        }
        this.f1029Z.m1651i0(this.f1016M, this.f1008H0);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo1514J1() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo1515J3() {
        if (this.f1016M == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f1017N.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m1516J6(Throwable th) {
        if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
            osi0.f(R.string.c0);
        } else {
            osi0.f(R.string.K7);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo1517K2() {
        return this.f1016M;
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m1519L6(User user, User user2, final Throwable th) {
        if (yij0.H(th)) {
            s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            s4();
            act().post(new Runnable() { // from class: l.qv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18243a.m1516J6(th);
                }
            });
            return;
        }
        if (NullChecker.a(act())) {
            s4();
            String string = act().getString(R.string.Fk);
            double dDoubleValue = (NullChecker.a(user.settings) && NullChecker.a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : 0.0d;
            if (NullChecker.a(user2.settings) && NullChecker.a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
            int iT = l9b.T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iT > 120) {
                string = act().getString(R.string.T3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R.string.U3);
            } else if (iT > 120) {
                string = act().getString(R.string.V3);
            }
            b4().F(string).t0(R.string.Q, new Runnable() { // from class: l.rv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18690a.m1518K6();
                }
            }).k0(R.string.c).z0();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m1520M6(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m1522O6(Throwable th) {
        m9268i2().settings.getSettingGroup().privacy.hideSchool = mo1517K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.a(act())) {
            act().progressDismiss();
            act().dialog().D(R.string.nl).t0(R.string.Q, new Runnable() { // from class: l.qu90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18234a.m1521N6();
                }
            }).k0(R.string.c).z0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo1523P1() {
        return true;
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m1524P6() {
        xdl0.M(this.f1000D, true);
        xdl0.M(this.f998B, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m1525Q6() {
        if (this.f1030k0) {
            xdl0.M(this.f1000D, false);
        } else {
            xdl0.M(this.f998B, false);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo1526R() {
        return ((Boolean) CoreModule.c.m0.x0.get()).booleanValue();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo1527R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m1521N6() {
        act().finish();
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ j760 m1529R6(List list) {
        return vwb.Y(list, BookMoviesDramasHelper.l(userId()));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo1530S() {
        return true;
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m1531S6(j760 j760Var) {
        this.f1018O = j760Var;
        mo1515J3();
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m1532T6(List list, boolean z) {
        this.f1029Z.f1078w.setMedia(list);
        this.f1029Z.f1078w.m1257h(0).setIllegalVisible(z);
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m1533U6(Media media, Boolean bool, Boolean bool2) {
        mo1540Z2();
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m1534V6(boolean z, List list) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f1029Z.f1077v;
        expEditProfileImageCardGroup.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m1257h(i).setIllegalPicture(z && i < list.size());
            expEditProfileImageCardGroup.m1257h(i).setStyle(0);
            expEditProfileImageCardGroup.m1257h(i).m1352d1(i < list.size() ? (Media) list.get(i) : null);
            expEditProfileImageCardGroup.m1257h(i).setChangeAction(new g30() { // from class: l.lv90
                /* JADX INFO: renamed from: a */
                public final void m17494a(Object obj, Object obj2, Object obj3) {
                    this.f15084a.m1533U6((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m1257h(i).m1365x0(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m1535W6(String str, List list) {
        if (vwb.J(list)) {
            mo1575o();
        } else {
            ft4.b().k(act(), str);
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m1536X6(Throwable th) {
        mo1575o();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo1537Y0() {
        return this.f1005G;
    }

    /* JADX INFO: renamed from: Y5 */
    public View m1538Y5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aw90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m1539Y6(View view) {
        List listN = vwb.n(wn90.F().a.pictures, new C0059c());
        User user = wn90.F().a;
        if (vwb.J(listN)) {
            listN = this.f1016M.pictures;
        }
        user.pictures = listN;
        zvf0.r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m1472n7();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo1540Z2() {
        return this.f1029Z.m1643C0();
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m1541Z6(boolean z, View view) {
        if (!z) {
            zvf0.r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.r("e_not_save", "p_lowqualityphoto_save_popup");
            m2871tc();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m1542a6() {
        if (upa.s1()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m1543a7(DialogInterface dialogInterface) {
        this.f1012J0.i();
        this.f1012J0.l();
    }

    /* JADX INFO: renamed from: b6 */
    public final void m1544b6() {
        if (m1571m6()) {
            return;
        }
        int iC = wn90.F().C(act(), CoreModule.c.e0.p9(), false);
        if (!TextUtils.equals(this.f1025V, "edit_data_button") || iC < 50) {
            return;
        }
        this.f1002E0.m18545q();
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m1545b7(DialogInterface dialogInterface) {
        this.f1012J0.k();
        this.f1012J0.j();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m1546c6() {
        if (m1500C7() || this.f1030k0) {
            return;
        }
        m1544b6();
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m1547c7(int i, View view) {
        if (i == wn90.F().a.pictures.size()) {
            wn90.F().a.pictures = this.f1016M.pictures;
        } else {
            wn90.F().a.pictures = vwb.n(wn90.F().a.pictures, new w9j() { // from class: l.fv90
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m1472n7();
    }

    /* JADX INFO: renamed from: d4 */
    public void m1548d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        wn90.F().a = CoreModule.c.e0.na().clone();
        duringCreated(this.f1017N).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.wv90
            public final void call(Object obj) {
                this.f21998a.m1587w6((roj0) obj);
            }
        }, new e30() { // from class: l.xv90
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.yv90
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m1479r5((c) obj);
            }
        }));
        creates(new e30() { // from class: l.zv90
            public final void call(Object obj) {
                this.f23601a.m1590y6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final boolean m1549d6() {
        if (upa.G2() || upa.H2()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m1550d7(final w9j w9jVar, View view) {
        List list = wn90.F().a.pictures;
        Objects.requireNonNull(w9jVar);
        List listN = vwb.n(list, new w9j() { // from class: l.tv90
            public final Object call(Object obj) {
                return (Boolean) w9jVar.call((Media) obj);
            }
        });
        User user = wn90.F().a;
        if (vwb.J(listN)) {
            listN = this.f1016M.pictures;
        }
        user.pictures = listN;
        zvf0.r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m1472n7();
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e6 */
    public final boolean m1551e6() {
        if (upa.G2() || upa.H2()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m1552e7(boolean z, View view) {
        if (!z) {
            zvf0.r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.r("e_not_save", "p_lowqualityphoto_save_popup");
            m2871tc();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m1553f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        creates(new e30() { // from class: l.gu90
            public final void call(Object obj) {
                this.f11629a.m1505E6((Bundle) obj);
            }
        });
        CoreModule.c.B0.p4(CoreModule.H().userId());
        duringCreated(p.f0).subscribe(mkd0.G(new e30() { // from class: l.hu90
            public final void call(Object obj) {
                this.f12270a.m1507F6((roj0) obj);
            }
        }));
        duringCreated(p.g0).subscribe(mkd0.G(new e30() { // from class: l.iu90
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m1433O5((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.d0.j3()).subscribe(mkd0.B());
        m1574n6();
    }

    /* JADX INFO: renamed from: f6 */
    public User m1554f6() {
        if (NullChecker.a(mo1506F1(false))) {
            this.f1029Z.m1644D0(mo1506F1(false));
        }
        User userClone = wn90.F().a.clone();
        m1565j6(userClone);
        return userClone.subtract(this.f1016M);
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m1555f7(DialogInterface dialogInterface) {
        this.f1014K0.i();
        this.f1014K0.l();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    public String from() {
        return this.f1025V;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo1556g3() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m1557g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m1476p6();
        m1469l7();
        this.f1005G.setFocusableInTouchMode(true);
        this.f1005G.setDescendantFocusability(131072);
        this.f1005G.setFocusable(true);
        this.f1005G.addItemDecoration(new nel(t100.d(8.0f)));
        this.f1011J = new mmf(this, getContext(), this.f998B);
        this.f1015L = new ExpProfileEditLinearLayoutManager(getContext());
        this.f1005G.setItemAnimator((RecyclerView.l) null);
        this.f1005G.setLayoutManager(this.f1015L);
        this.f1005G.setAdapter(this.f1020Q);
        this.f1005G.setClipChildren(false);
        C0057a c0057a = new C0057a();
        this.f1005G.addOnScrollListener(c0057a);
        this.f1011J.m18037n(c0057a);
        this.f1031p0 = new rqh0(this.f1028Y, this.f1001E, this.f1005G, this.f1015L);
        this.f1002E0 = new n9f(getContext(), this.f1005G, this.f1015L, this.f1020Q, this.f1009I);
        xdl0.E0(this.f1007H, new View.OnClickListener() { // from class: l.ut90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20786a.m1424G6(view);
            }
        });
        if (getArguments().getInt("preview_type", 0) == 1) {
            m1581r7(false);
            m1500C7();
        } else {
            m1546c6();
        }
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m1558g7(DialogInterface dialogInterface) {
        this.f1014K0.k();
        this.f1014K0.j();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo1559h3() {
        duringCreated(CoreModule.c.e0.W9(userId()).flatMap(new w9j() { // from class: l.xu90
            public final Object call(Object obj) {
                return CoreModule.c.s1.s3();
            }
        }).map(new w9j() { // from class: l.yu90
            public final Object call(Object obj) {
                return this.f23103a.m1529R6((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.zu90
            public final void call(Object obj) {
                this.f23590a.m1531S6((j760) obj);
            }
        }, new e30() { // from class: l.av90
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m1460f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public VReorderCard m1560h6(int i) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup;
        AvatarCards avatarCards;
        boolean zA = lqa.a();
        C0063b c0063b = this.f1029Z;
        if (zA) {
            if (c0063b == null || (avatarCards = c0063b.f1078w) == null) {
                return null;
            }
            return avatarCards.m1257h(i);
        }
        if (c0063b == null || (expEditProfileImageCardGroup = c0063b.f1077v) == null) {
            return null;
        }
        return expEditProfileImageCardGroup.m1257h(i);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m1561h7(View view) {
        m1472n7();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo1562i3() {
        return 0;
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m1563i7(View view) {
        m2871tc();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM1538Y5 = m1538Y5(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM1538Y5;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo1564j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.a(this.f1016M)) {
            act().finish();
        } else {
            act().setResult(i, intent);
            act().finish();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m1565j6(User user) {
        User user2;
        if (user == null || (user2 = this.f1016M) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m1566j7(int i, Media media) {
        VReorderCard vReorderCardM1560h6 = m1560h6(i);
        if (vReorderCardM1560h6 != null && (vReorderCardM1560h6 instanceof ExpEditProfileImageCard)) {
            if (media instanceof Picture) {
                ((ExpEditProfileImageCard) vReorderCardM1560h6).m1350a1((Picture) media);
            }
            mo1540Z2();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m1567k6() {
        this.f1023T = getArguments().getString(SysnotifListener.KEY_USER_ID);
        this.f1025V = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f1023T)) {
            CrashHelper.d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f1025V), 1000);
            act().finish();
            return;
        }
        this.f1024U = getArguments().getString("input_type");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f1019P = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m1568k7(View view) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
        } else if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
        } else {
            qp4.q(act());
        }
        zvf0.r("e_edit_profile_view_edit_verification", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: l6 */
    public final void m1569l6() {
        if (mo1506F1(false).isAudit()) {
            m1512H7("audit_guide", true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo1570m0() {
        return true;
    }

    /* JADX INFO: renamed from: m6 */
    public final boolean m1571m6() {
        if (!TextUtils.equals(this.f1025V, "from_auto_scroll_to_question") && !TextUtils.equals(this.f1025V, "p_tantanx_card")) {
            return false;
        }
        e51.I(this, new Runnable() { // from class: l.bv90
            @Override // java.lang.Runnable
            public final void run() {
                this.f8370a.m1585u6();
            }
        }, 500L);
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public void m1572m7(List<Media> list, int i) {
        this.f1028Y.m21165l(list, i);
    }

    /* JADX INFO: renamed from: n4 */
    public void m1573n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m1567k6();
        m1474o6();
        boolean zEquals = "my_tab_profile_like".equals(this.f1025V);
        cwf0 cwf0Var = ((PutongFrag) this).pageHelper;
        if (zEquals) {
            cwf0Var.q(pageId());
        } else {
            cwf0Var.q(pageId());
            f.b().f(this.f1025V);
        }
        m1480r6();
        p420.t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f1013K = new fmf(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m1574n6() {
        if (ft4.b().g()) {
            act().duringCreated(CoreModule.c.U1.S).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.dv90
                public final void call(Object obj) {
                    this.f9437a.m1586v6((Boolean) obj);
                }
            }, new e30() { // from class: l.ev90
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m1449W5((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: o */
    public void mo1575o() {
        boolean zEquals = TextUtils.equals(wn90.F().a.description, CoreModule.c.e0.p9().description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f1025V, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f1025V, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f1025V, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f1025V, "edit_home_page")) {
                        str = LiveMessage.LiveMessageType.OTHER;
                    }
                }
            }
        }
        o6j0.c("e_edit_personal_profile_finish", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.a.h("previous_page", str)});
        if (!NullChecker.a(mo1506F1(false)) || !NullChecker.a(this.f1016M)) {
            m2871tc();
            return;
        }
        this.f1029Z.m1644D0(mo1506F1(false));
        int iMo1540Z2 = mo1540Z2();
        if (m1542a6()) {
            m1592z7(false);
            return;
        }
        if (m1551e6()) {
            m1503D7(false);
            return;
        }
        if (m1549d6()) {
            m1503D7(false);
        } else if (wn90.F().a.equals(this.f1016M)) {
            m2871tc();
        } else {
            m1422F7(iMo1540Z2);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public void m1576o7() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = m9268i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo1517K2().settings.hideSchoolNameNoDefaults()) {
            act().progress(R.string.J5);
            CoreModule.c.e0.D9(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.rt90
                public final void call(Object obj) {
                    this.f18673a.m1520M6((roj0) obj);
                }
            }, new e30() { // from class: l.st90
                public final void call(Object obj) {
                    this.f19282a.m1522O6((Throwable) obj);
                }
            }));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.F().a.description = vwb.k(stringExtra).trim();
            mo1504E();
            m1489w7(wn90.F().a);
            return;
        }
        if (NullChecker.a(intent) && i2 == -1 && LoopFragmentFactory.m1952N(i, wn90.F().a, intent)) {
            mo1504E();
            m1489w7(wn90.F().a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                m1576o7();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.a(intent)) {
            if (NullChecker.a(wn90.F().a)) {
                LoopFragmentFactory.m1971j(act());
                m1485u7(wn90.F().a.pictures, false);
                mo1504E();
                m1489w7(wn90.F().a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo1504E();
            m1489w7(wn90.F().a);
        } else if (i == 3003) {
            mo1515J3();
        } else {
            super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        if (NullChecker.a(mo1506F1(false))) {
            mo1540Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo1577p() {
        return this.f1032z;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo1578p3(final int i, final Media media) {
        this.f1029Z.m1602b(new d30() { // from class: l.tt90
            public final void call() {
                this.f20368a.m1566j7(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public void m1579p7() {
        if (isDetached()) {
            act().finish();
            return;
        }
        int iM1583s7 = m1583s7();
        if (m1542a6()) {
            m1592z7(true);
            return;
        }
        if (m1551e6()) {
            m1503D7(true);
            return;
        }
        if (m1549d6()) {
            m1503D7(true);
            return;
        }
        if (iM1583s7 > 0) {
            m1495A7(iM1583s7);
        } else if (NullChecker.a(m1554f6())) {
            m1420E7();
        } else {
            m2871tc();
        }
    }

    @Override // p002l.a1m
    public String pageId() {
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: q7 */
    public final void m1580q7(boolean z) {
        if (this.f1022S == z) {
            return;
        }
        this.f1022S = z;
        Animator animator = this.f1021R;
        if (animator != null && animator.isRunning()) {
            this.f1021R.cancel();
        }
        Animator animatorL = bt0.l(this.f1007H, View.TRANSLATION_Y, 0L, 300L, new LinearInterpolator(), new float[]{z ? t100.d(75.0f) : 0, z ? 0 : t100.d(75.0f)});
        this.f1021R = animatorL;
        animatorL.start();
    }

    /* JADX INFO: renamed from: r7 */
    public final void m1581r7(boolean z) {
        if (z) {
            if (this.f1030k0) {
                zvf0.r("e_edit_profile_button", "p_edit_profile_view");
            } else {
                zvf0.r("e_preview_button", "p_edit_profile_view");
            }
        }
        boolean z2 = this.f1030k0;
        this.f1030k0 = !z2;
        if (z) {
            float f = !z2 ? 0.0f : -xdl0.y0();
            float f2 = this.f1030k0 ? -xdl0.y0() : 0.0f;
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            float fY0 = xdl0.y0();
            Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f1000D, "translationX", 0L, 200L, linearInterpolator, new float[]{f, f2}), bt0.p(this.f998B, "translationX", 0L, 200L, linearInterpolator, new float[]{f + fY0, f2 + fY0})});
            bt0.v(animatorZ, new Runnable() { // from class: l.nv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16220a.m1524P6();
                }
            });
            bt0.f(animatorZ, new Runnable() { // from class: l.ov90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16801a.m1525Q6();
                }
            });
            animatorZ.start();
            if (this.f1030k0) {
                this.f1002E0.m18541m();
            }
        } else {
            xdl0.M(this.f1000D, false);
            xdl0.M(this.f998B, true);
        }
        if (this.f1030k0) {
            this.f1007H.setText("编辑资料");
            this.f1007H.setCompoundDrawablesWithIntrinsicBounds(x2c0.Ps, 0, 0, 0);
            if (NullChecker.a(wn90.F().a)) {
                mo1540Z2();
            }
            act().hideInput();
            mo1504E();
            return;
        }
        if (NullChecker.a(this.f1016M)) {
            if (this.f1011J.m18031h() != null) {
                this.f1011J.m18031h().s();
            }
            this.f1007H.setText("预览资料");
            this.f1007H.setCompoundDrawablesWithIntrinsicBounds(x2c0.Qs, 0, 0, 0);
            mo1504E();
            m1489w7(wn90.F().a);
            m1546c6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final void m1582s6() {
        if (CoreModule.c.e0.i8()) {
            mkd0.z(this.f1006G0);
            this.f1006G0 = duringCreated(CoreModule.c.e0.xa()).filter(new w9j() { // from class: l.zt90
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.bu90
                public final void call(Object obj) {
                    this.f8361a.m1502D6((FakeGuideData) obj);
                }
            }, new e30() { // from class: l.cu90
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m1447V5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s7 */
    public int m1583s7() {
        boolean zA = lqa.a();
        C0063b c0063b = this.f1029Z;
        int i = 0;
        if (zA) {
            AvatarCards avatarCards = c0063b.f1078w;
            if (!NullChecker.a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m1257h(i).m1240n()) {
                if (!TEnum.equals(avatarCards.m1257h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = c0063b.f1077v;
        if (!NullChecker.a(expEditProfileImageCardGroup)) {
            return 0;
        }
        int i3 = 0;
        while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m1257h(i).m1240n()) {
            if (!TEnum.equals(expEditProfileImageCardGroup.m1257h(i).f937I.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: t6 */
    public final void m1584t6() {
        m1582s6();
        m1478q6();
        m1569l6();
        m1512H7(null, false);
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m1585u6() {
        int iM9621H;
        if (this.f1020Q == null) {
            return;
        }
        if (TextUtils.equals(this.f1025V, "from_auto_scroll_to_question")) {
            iM9621H = this.f1020Q.m9623J();
        } else {
            iM9621H = TextUtils.equals(this.f1025V, "p_tantanx_card") ? this.f1020Q.m9621H() : -1;
        }
        if (iM9621H < 0 || iM9621H >= this.f1020Q.m9618C()) {
            return;
        }
        this.f1005G.scrollToPosition(iM9621H);
        if (NullChecker.a(this.f1015L)) {
            this.f1015L.scrollToPositionWithOffset(iM9621H, 0);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.c5m
    public String userId() {
        return this.f1023T;
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m1586v6(Boolean bool) {
        ft4.b().j(bool.booleanValue());
        mo1575o();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m1587w6(roj0 roj0Var) {
        m1454Z5();
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ Boolean m1588x6() {
        if (!TextUtils.isEmpty(this.f1024U)) {
            this.f1013K.m13317e(this.f1024U);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: x7 */
    public final void m1589x7() {
        lra0.h("button");
        if (this.f1029Z.m1648f0(this)) {
            return;
        }
        final String strC = ft4.b().c(this.f1016M, wn90.F().a);
        if (ft4.b().i(strC)) {
            act().duringCreated(CoreModule.c.U1.i3("profile", strC)).subscribe(mkd0.H(new e30() { // from class: l.uv90
                public final void call(Object obj) {
                    this.f20843a.m1535W6(strC, (List) obj);
                }
            }, new e30() { // from class: l.vv90
                public final void call(Object obj) {
                    this.f21340a.m1536X6((Throwable) obj);
                }
            }));
        } else {
            mo1575o();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m1590y6(Bundle bundle) {
        if (NullChecker.a(bundle)) {
            m1492y7(CoreModule.K().me_());
            if (NullChecker.a(m9268i2())) {
                m1487v7(wn90.F().a, false);
                mo1515J3();
            }
        }
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.mv90
            public final Object call() {
                return this.f15668a.m1588x6();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m1591z6(View view) {
        m1589x7();
    }

    /* JADX INFO: renamed from: z7 */
    public final void m1592z7(final boolean z) {
        if (this.f1012J0 == null) {
            this.f1012J0 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.a(act()).s("检测到不符合要求的照片").g(false).j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").r("保存其他资料").o(new View.OnClickListener() { // from class: l.vt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21294a.m1539Y6(view);
            }
        }).f(z ? "不保存" : "继续编辑").c(new View.OnClickListener() { // from class: l.wt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21970a.m1541Z6(z, view);
            }
        }).n(new DialogInterface.OnShowListener() { // from class: l.xt90
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f22449a.m1543a7(dialogInterface);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.yt90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f23073a.m1545b7(dialogInterface);
            }
        }).a().g();
    }
}
