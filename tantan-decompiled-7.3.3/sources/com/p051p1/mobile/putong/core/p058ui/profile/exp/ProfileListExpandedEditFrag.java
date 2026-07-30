package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.R;
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
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.C8801b;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.report.C8992f;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.a30;
import p153l.adc0;
import p153l.aw90;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.dhl;
import p153l.e4a0;
import p153l.eu4;
import p153l.ey0;
import p153l.fo0;
import p153l.ghf;
import p153l.gra;
import p153l.gt0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.l4g0;
import p153l.l51;
import p153l.lnf;
import p153l.ml70;
import p153l.nrb0;
import p153l.pcj;
import p153l.pf60;
import p153l.pq4;
import p153l.psd0;
import p153l.pza0;
import p153l.qa00;
import p153l.qcj;
import p153l.qtk;
import p153l.r1j0;
import p153l.sfj0;
import p153l.snf;
import p153l.taf;
import p153l.th0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wdf;
import p153l.wx6;
import p153l.x20;
import p153l.xc20;
import p153l.xfc0;
import p153l.xra;
import p153l.y20;
import p153l.yab;
import p153l.zyh0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListExpandedEditFrag extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: L0 */
    public static CategorySuggestions f34022L0;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f34023A;

    /* JADX INFO: renamed from: B */
    public VFrame f34024B;

    /* JADX INFO: renamed from: C */
    public VProgressBar f34025C;

    /* JADX INFO: renamed from: D */
    public VLinear f34026D;

    /* JADX INFO: renamed from: E */
    public TabLayout f34027E;

    /* JADX INFO: renamed from: E0 */
    public taf f34028E0;

    /* JADX INFO: renamed from: F */
    public ExpEditTopWarnView f34029F;

    /* JADX INFO: renamed from: F0 */
    public kcg0 f34030F0;

    /* JADX INFO: renamed from: G */
    public RecyclerView f34031G;

    /* JADX INFO: renamed from: G0 */
    public kcg0 f34032G0;

    /* JADX INFO: renamed from: H */
    public VText f34033H;

    /* JADX INFO: renamed from: H0 */
    public boolean f34034H0;

    /* JADX INFO: renamed from: I */
    public View f34035I;

    /* JADX INFO: renamed from: I0 */
    public final HashMap<String, C8798d> f34036I0;

    /* JADX INFO: renamed from: J */
    public snf f34037J;

    /* JADX INFO: renamed from: J0 */
    public l4g0 f34038J0;

    /* JADX INFO: renamed from: K */
    public lnf f34039K;

    /* JADX INFO: renamed from: K0 */
    public l4g0 f34040K0;

    /* JADX INFO: renamed from: L */
    public ExpProfileEditLinearLayoutManager f34041L;

    /* JADX INFO: renamed from: M */
    public User f34042M;

    /* JADX INFO: renamed from: O */
    public pf60<List<Literatures>, List<LiteraturesComments>> f34044O;

    /* JADX INFO: renamed from: R */
    public Animator f34047R;

    /* JADX INFO: renamed from: T */
    public String f34049T;

    /* JADX INFO: renamed from: V */
    public String f34051V;

    /* JADX INFO: renamed from: Y */
    public wdf f34054Y;

    /* JADX INFO: renamed from: Z */
    public C8801b f34055Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f34056k0;

    /* JADX INFO: renamed from: p0 */
    public zyh0 f34057p0;

    /* JADX INFO: renamed from: z */
    public VFrame f34058z;

    /* JADX INFO: renamed from: N */
    public final C22507a<uxj0> f34043N = C22507a.m222758b();

    /* JADX INFO: renamed from: P */
    public HashMap<String, String> f34045P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    public ghf f34046Q = new ghf();

    /* JADX INFO: renamed from: S */
    public boolean f34048S = true;

    /* JADX INFO: renamed from: U */
    public String f34050U = "";

    /* JADX INFO: renamed from: W */
    public boolean f34052W = false;

    /* JADX INFO: renamed from: X */
    public final List<AbstractC8802c> f34053X = new ArrayList();

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
    public class C8795a extends RecyclerView.AbstractC0584t {
        public C8795a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                ProfileListExpandedEditFrag.this.m52311q7(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i2 < 0) {
                ProfileListExpandedEditFrag.this.m52311q7(recyclerView != null);
            } else if (i2 > 0) {
                ProfileListExpandedEditFrag.this.m52311q7(recyclerView == null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$b */
    public class C8796b implements y20<List<Media>> {

        /* JADX INFO: renamed from: a */
        public int f34060a = -1;

        public C8796b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(List<Media> list) {
            if (jyb.m147479J(list)) {
                return;
            }
            int size = list.size();
            int i = this.f34060a;
            if (size != i) {
                int size2 = list.size();
                this.f34060a = size2;
                if (i == 9 || (size2 == 9 && i > 0)) {
                    ProfileListExpandedEditFrag.this.mo52250J3();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$c */
    public class C8797c implements qcj<Media, Boolean> {
        public C8797c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$d */
    public static class C8798d {

        /* JADX INFO: renamed from: a */
        public String f34063a;

        /* JADX INFO: renamed from: b */
        public boolean f34064b;

        /* JADX INFO: renamed from: c */
        public boolean f34065c;
    }

    public ProfileListExpandedEditFrag() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.l3a0
            @Override // p153l.y20
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4470c) obj).f16276c);
            }
        }));
        this.f34034H0 = false;
        creates(new y20() { // from class: l.w3a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m52169P4((Bundle) obj);
            }
        });
        this.f34036I0 = new HashMap<>();
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m52154E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E7 */
    private void m52155E7() {
        new th0.C20312a(act()).m191160s(act().getString(R$string.f19129bl)).m191148g(false).m191151j(act().getString(R$string.f19067Zk)).m191159r(act().getString(R$string.f19098al)).m191156o(new View.OnClickListener() { // from class: l.i2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112594a.m52293h7(view);
            }
        }).m191147f(act().getString(R$string.f19037Yk)).m191144c(new View.OnClickListener() { // from class: l.j2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118042a.m52295i7(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: F7 */
    private void m52157F7(int i) {
        if (i > 0) {
            m52230A7(i);
        } else {
            m52207n7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G6 */
    public /* synthetic */ void m52159G6(View view) {
        m52312r7(true);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m52167O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m52168O5(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m52169P4(Bundle bundle) {
        if (f34022L0 == null) {
            l51.m152919y(new Runnable() { // from class: l.t2a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m52190a5();
                }
            });
        }
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: T5 */
    public static /* synthetic */ Boolean m52178T5(Media media) {
        if ((media instanceof Picture) && TEnum.equals(media.status, "normal")) {
            Picture picture = (Picture) media;
            if (picture.isLow() || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m52182V5(Throwable th) {
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ void m52184W5(Throwable th) {
    }

    @MainThread
    /* JADX INFO: renamed from: Z5 */
    private void m52189Z5() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m52218t7();
        if (NullChecker.m82486a(mo52241F1(false)) && this.f34052W) {
            User user = aw90.m100562F().f73701a;
            if (!TEnum.equals(this.f34042M.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f34042M.profile.zodiac;
            }
            aw90.m100562F().f73701a = this.f34042M.mo225055clone();
            User user2 = aw90.m100562F().f73701a;
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
            Extensions extensions2 = this.f34042M.profile.extensions;
            physical.bloodType = extensions2.physical.bloodType;
            extensions.interest.emoji = extensions2.interest.emoji;
            ProfileExtensionBasic profileExtensionBasic = extensions.basic;
            ProfileExtensionBasic profileExtensionBasic2 = extensions2.basic;
            profileExtensionBasic.idealType = profileExtensionBasic2.idealType;
            profileExtensionBasic.ideal = profileExtensionBasic2.ideal;
        } else {
            this.f34052W = true;
            aw90.m100562F().f73701a = this.f34042M.mo225055clone();
        }
        m52222v7(aw90.m100562F().f73701a, false);
        this.f34039K.m154975a(this.f34051V);
        this.f34039K.m154976b(this.f34045P.get("action"));
        this.f34031G.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f34039K.m154977c(this.f34051V);
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m52190a5() {
        try {
            f34022L0 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194022a));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m52195f5(Throwable th) {
    }

    /* JADX INFO: renamed from: g6 */
    private User m52197g6() {
        User userMo225055clone = this.f34042M.mo225055clone();
        this.f34055Z.m52375D0(userMo225055clone);
        return userMo225055clone.subtract(this.f34042M);
    }

    /* JADX INFO: renamed from: i6 */
    private List<AbstractC8802c> m52200i6(List<AbstractC8802c> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8802c abstractC8802c : list) {
            if (abstractC8802c.mo52349r()) {
                arrayList.add(abstractC8802c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l7 */
    private void m52204l7() {
        bnl0.m105546b0(this.f34058z, new pcj() { // from class: l.g3a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListExpandedEditFrag.m52154E5();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    private void m52207n7() {
        if (jyb.m147479J(aw90.m100562F().f73701a.pictures)) {
            m21580b4().m21503F("你的个人资料页需要至少一张照片").m21555t0(R$string.f18776Q, new Runnable() { // from class: l.v2a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182086a.m53521tc();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
            return;
        }
        final User userM52287f6 = m52287f6();
        User userM52197g6 = m52197g6();
        boolean z = true;
        if (NullChecker.m82486a(userM52287f6) && NullChecker.m82486a(userM52197g6) && userM52287f6.equals(userM52197g6)) {
            this.f34034H0 = true;
        }
        final User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        final User userMo225055clone2 = this.f34042M.mo225055clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.m82486a(userM52287f6) && NullChecker.m82486a(userM52287f6.profile) && NullChecker.m82486a(userM52287f6.profile.extensions) && NullChecker.m82486a(userM52287f6.profile.extensions.basic) && !TextUtils.isEmpty(userM52287f6.description)) {
            arrayList.add("about_me");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!z) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(str);
            z = false;
        }
        sfj0.m185596c("e_profile_save_button", pageId(), sfj0.C20032a.m185615h("edit_profile_content_modified", sb.toString()));
        if (!NullChecker.m82486a(userM52287f6)) {
            m53521tc();
            return;
        }
        m21594o4(R$string.f18632L5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        if (NullChecker.m82486a(userM52287f6.profile) && NullChecker.m82486a(userM52287f6.profile.extensions)) {
            userM52287f6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (gra.m131676e2() && NullChecker.m82486a(userM52287f6) && NullChecker.m82486a(userM52287f6.profile) && NullChecker.m82486a(userM52287f6.profile.extensions) && NullChecker.m82486a(userM52287f6.profile.extensions.basic) && !jyb.m147479J(userM52287f6.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM52287f6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.w2a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m52167O4((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.x2a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192134a.m52246H6(userM52287f6, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173600K(new y20() { // from class: l.y2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197198a.m52248I6(zEquals, userMo225055clone, userMo225055clone2, userM52287f6, (uxj0) obj);
            }
        }, new y20() { // from class: l.z2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202665a.m52254L6(userMo225055clone2, userM52287f6, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o6 */
    private void m52209o6() {
        wdf wdfVar = new wdf(this, this);
        this.f34054Y = wdfVar;
        this.f34053X.addAll(wdfVar.m205873g());
        C8801b c8801b = (C8801b) this.f34054Y.m205874h(C8801b.class);
        this.f34055Z = c8801b;
        c8801b.m52378e0(new C8796b());
    }

    /* JADX INFO: renamed from: p6 */
    private void m52211p6() {
        ml70.m158856b().m158859e(Boolean.FALSE);
        bnl0.m105524M(this.f34023A, true);
        this.f34023A.setLeftIconResource(dbc0.f86072D);
        this.f34023A.setBackgroundColor(getResources().getColor(c9c0.f80364P0));
        act().setStatusBarColor(getResources().getColor(c9c0.f80364P0));
        act().getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(c9c0.f80364P0)));
        View viewInflate = act().inflater().inflate(kec0.f125458I9, (ViewGroup) null);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70484o4);
        vButton.setBackgroundResource(dbc0.f86104E);
        bnl0.m105539W(vButton, qa00.f156318e);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.r2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160923a.m52322z6(view);
            }
        });
        this.f34023A.m224835z(viewInflate);
        this.f34023A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.s2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165872a.m52229A6(view);
            }
        });
        if (NullChecker.m82486a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: q6 */
    private void m52213q6() {
        if (CertificationUtil.m59336l() || !nrb0.m164466b()) {
            return;
        }
        m52247H7("pic_cert_guide", true);
        psd0.m173633z(this.f34030F0);
        this.f34030F0 = duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).filter(new qcj() { // from class: l.p2a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf((verificationCenter == null || verificationCenter.picVerificationInfo == null) ? false : true);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.a3a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68284a.m52231B6((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m52214r5(C4470c c4470c) {
    }

    /* JADX INFO: renamed from: r6 */
    private void m52215r6() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.n2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139852a.m52234C6((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    private void m52218t7() {
        List<AbstractC8802c> listM52200i6 = m52200i6(this.f34053X);
        this.f34046Q.m130250L(listM52200i6);
        this.f34054Y.m205877k(this.f34027E, listM52200i6, this.f34057p0);
        m52315t6();
    }

    /* JADX INFO: renamed from: u7 */
    private void m52220u7(final List<Media> list, final boolean z) {
        boolean zM212782a = xra.m212782a();
        C8801b c8801b = this.f34055Z;
        if (zM212782a) {
            c8801b.m52333b(new x20() { // from class: l.o2a0
                @Override // p153l.x20
                public final void call() {
                    this.f144732a.m52267T6(list, z);
                }
            });
        } else {
            c8801b.m52333b(new x20() { // from class: l.q2a0
                @Override // p153l.x20
                public final void call() {
                    this.f155311a.m52269V6(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m52221v5() {
        try {
            ProfileListFrag.f34458I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194022a));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m52222v7(User user, boolean z) {
        m52218t7();
        m52220u7(user.pictures, z);
        this.f34037J.m186912m(user);
    }

    /* JADX INFO: renamed from: w7 */
    private void m52224w7(User user) {
        aw90.m100562F().f73701a = user;
        m52189Z5();
    }

    /* JADX INFO: renamed from: y7 */
    private void m52227y7(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + this.f34049T));
        }
        this.f34042M = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m52229A6(View view) {
        m52309p7();
    }

    /* JADX INFO: renamed from: A7 */
    public void m52230A7(final int i) {
        new th0.C20312a(act()).m191160s(m21603x4(R$string.f19380jr)).m191148g(false).m191150i(R$string.f19350ir).m191158q(R$string.f19320hr).m191156o(new View.OnClickListener() { // from class: l.h2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107532a.m52282c7(i, view);
            }
        }).m191146e(R$string.f19138c).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m52231B6(VerificationCenter verificationCenter) {
        m52247H7("pic_cert_guide", !CertificationUtil.m59336l());
    }

    /* JADX INFO: renamed from: B7 */
    public void m52232B7(final boolean z, String str, String str2, final qcj<Media, Boolean> qcjVar) {
        if (this.f34040K0 == null) {
            this.f34040K0 = new l4g0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new th0.C20312a(act()).m191160s(str).m191148g(false).m191151j(str2).m191159r("保存其他资料").m191156o(new View.OnClickListener() { // from class: l.k3a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123702a.m52284d7(qcjVar, view);
            }
        }).m191147f(z ? "不保存" : "继续编辑").m191144c(new View.OnClickListener() { // from class: l.m3a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134655a.m52286e7(z, view);
            }
        }).m191155n(new DialogInterface.OnShowListener() { // from class: l.n3a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f139957a.m52288f7(dialogInterface);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.o3a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f144825a.m52290g7(dialogInterface);
            }
        }).m191142a().m191141g();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo52233C2() {
        return f34022L0;
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m52234C6(User user) {
        m52227y7(user);
        this.f34043N.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: C7 */
    public final boolean m52235C7() {
        if (CoreModule.m30930K().me_().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
            return true;
        }
        if (!this.f34056k0 && CoreModule.f18264c.f20381e0.m116555e8()) {
            ey0.m123126h(act());
            return true;
        }
        if (this.f34056k0 || !CoreModule.m30930K().me_().isAudit() || gta.m132210e().m132214d().mo34721Ln()) {
            return false;
        }
        ey0.m123124f(act());
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: D2 */
    public boolean mo52236D2() {
        return true;
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m52237D6(FakeGuideData fakeGuideData) {
        m52247H7("stock_fake_guide", true);
    }

    /* JADX INFO: renamed from: D7 */
    public final void m52238D7(boolean z) {
        m52232B7(z, "检测到不符合要求的照片", "若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除", new qcj() { // from class: l.u1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m52178T5((Media) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: E */
    public void mo52239E() {
        this.f34037J.m186912m(aw90.m100562F().f73701a);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m52240E6(Bundle bundle) {
        mo52291h3();
        if (ProfileListFrag.f34458I4 == null) {
            l51.m152919y(new Runnable() { // from class: l.t3a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m52221v5();
                }
            });
        }
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: F1 */
    public User mo52241F1(boolean z) {
        if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
            if (z) {
                CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        }
        return aw90.m100562F().f73701a;
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m52242F6(uxj0 uxj0Var) {
        mo52291h3();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: G */
    public void mo52243G(View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105509E0(view, m53588N4(this.f34042M));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m52244G7() {
        pza0.m174356h("android_back");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: H3 */
    public pf60<List<Literatures>, List<LiteraturesComments>> mo52245H3() {
        return this.f34044O;
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ C22421c m52246H6(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116458E9(user);
        }
        User user2 = aw90.m100562F().f73701a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m52222v7(user2, true);
        } else {
            user2.pictures = profileEditInfo.user.pictures;
            m52222v7(user2, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H7 */
    public void m52247H7(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C8798d c8798d = this.f34036I0.get(str);
            if (c8798d == null) {
                c8798d = new C8798d();
                c8798d.f34063a = str;
            }
            c8798d.f34064b = z;
            this.f34036I0.put(str, c8798d);
        }
        boolean zM147520m = jyb.m147520m(this.f34036I0.entrySet(), new qcj() { // from class: l.t1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileListExpandedEditFrag.C8798d) ((Map.Entry) obj).getValue()).f34064b);
            }
        });
        ExpEditTopWarnView expEditTopWarnView = this.f34029F;
        if (zM147520m) {
            bnl0.m105524M(expEditTopWarnView, true);
        } else {
            bnl0.m105524M(expEditTopWarnView, false);
        }
        bnl0.m105505C0(this.f34029F, qa00.f156288A);
        C8798d c8798d2 = this.f34036I0.get("stock_fake_guide");
        if (c8798d2 != null && c8798d2.f34064b) {
            this.f34029F.m52129c("请立即更换真实头像，以免影响你在划卡的曝光", dbc0.f86783Z6, 0);
            return;
        }
        C8798d c8798d3 = this.f34036I0.get("audit_guide");
        if (c8798d3 != null && c8798d3.f34064b) {
            this.f34029F.m52129c("有资料在审核中", dbc0.f86751Y6, 0);
            return;
        }
        C8798d c8798d4 = this.f34036I0.get("pic_cert_guide");
        if (c8798d4 == null || !c8798d4.f34064b) {
            return;
        }
        this.f34029F.m52131e("完成头像认证会被优先推荐", "认证", dbc0.f86816a7, "https://auto.tancdn.com/v1/images/eyJpZCI6IjM0RVZJN1JITFNWNVdHUUtFUVBNRzdRRjVORFVGNDE0IiwidyI6MTA3NywiaCI6MTYyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE1Nzk0MDc5MzcwMzQ2ODM2NX0.png");
        bnl0.m105509E0(this.f34029F, new View.OnClickListener() { // from class: l.e2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91727a.m52300k7(view);
            }
        });
        if (!c8798d4.f34065c) {
            c8798d4.f34065c = true;
            i4g0.m138526x("e_edit_profile_view_edit_verification", "p_edit_profile_view");
        }
        bnl0.m105505C0(this.f34029F, qa00.f156290C);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m52248I6(boolean z, User user, User user2, User user3, uxj0 uxj0Var) {
        if (z) {
            CoreModule.f18264c.f20381e0.f89234g4.onNext("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            i4g0.m138495D("e_upload_photos_success", pageId(), jyb.m147494Y("upload_page_name", "edit_profile_page"), jyb.m147494Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        m53521tc();
        if (NullChecker.m82486a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f18264c.f20381e0.m116468H7();
        }
        this.f34055Z.m52382i0(this.f34042M, this.f34034H0);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo52249J1() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: J3 */
    public void mo52250J3() {
        if (this.f34042M == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f34043N.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m52251J6(Throwable th) {
        if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
            r1j0.m179419f(R$string.f19139c0);
        } else {
            r1j0.m179419f(R$string.f18664M7);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.s7m
    /* JADX INFO: renamed from: K2 */
    public User mo52252K2() {
        return this.f34042M;
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m52254L6(User user, User user2, final Throwable th) {
        if (bsj0.m106250H(th)) {
            m21598s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m21598s4();
            act().post(new Runnable() { // from class: l.u3a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177321a.m52251J6(th);
                }
            });
            return;
        }
        if (NullChecker.m82486a(act())) {
            m21598s4();
            String string = act().getString(R$string.f19129bl);
            double dDoubleValue = (NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m82486a(user2.settings) && NullChecker.m82486a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
            int iM214863T = yab.m214863T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM214863T > 120) {
                string = act().getString(R$string.f18930V3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f18960W3);
            } else if (iM214863T > 120) {
                string = act().getString(R$string.f18990X3);
            }
            m21580b4().m21503F(string).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.v3a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182175a.m52253K6();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m52255M6(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m52257O6(Throwable th) {
        m189086i2().settings.getSettingGroup().privacy.hideSchool = mo52252K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.m82486a(act())) {
            act().progressDismiss();
            act().dialog().m21499D(R$string.f18586Jl).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.u2a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177198a.m52256N6();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: P1 */
    public boolean mo52258P1() {
        return true;
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m52259P6() {
        bnl0.m105524M(this.f34026D, true);
        bnl0.m105524M(this.f34024B, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m52260Q6() {
        if (this.f34056k0) {
            bnl0.m105524M(this.f34026D, false);
        } else {
            bnl0.m105524M(this.f34024B, false);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R */
    public boolean mo52261R() {
        return CoreModule.f18264c.f20405m0.f20205x0.get().booleanValue();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R0 */
    public boolean mo52262R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m52256N6() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ pf60 m52264R6(List list) {
        return jyb.m147494Y(list, BookMoviesDramasHelper.m60629l(userId()));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: S */
    public boolean mo52265S() {
        return true;
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m52266S6(pf60 pf60Var) {
        this.f34044O = pf60Var;
        mo52250J3();
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m52267T6(List list, boolean z) {
        this.f34055Z.f34104w.setMedia(list);
        this.f34055Z.f34104w.m51994h(0).setIllegalVisible(z);
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m52268U6(Media media, Boolean bool, Boolean bool2) {
        mo52275Z2();
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m52269V6(boolean z, List list) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f34055Z.f34103v;
        expEditProfileImageCardGroup.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m51994h(i).setIllegalPicture(z && i < list.size());
            expEditProfileImageCardGroup.m51994h(i).setStyle(0);
            expEditProfileImageCardGroup.m51994h(i).m52089d1(i < list.size() ? (Media) list.get(i) : null);
            expEditProfileImageCardGroup.m51994h(i).setChangeAction(new a30() { // from class: l.p3a0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f150396a.m52268U6((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m51994h(i).m52102x0(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m52270W6(String str, List list) {
        if (jyb.m147479J(list)) {
            mo52306o();
        } else {
            eu4.m122523b().m122533k(act(), str);
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m52271X6(Throwable th) {
        mo52306o();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo52272Y0() {
        return this.f34031G;
    }

    /* JADX INFO: renamed from: Y5 */
    public View m52273Y5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e4a0.m119391b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m52274Y6(View view) {
        List<Media> listM147522n = jyb.m147522n(aw90.m100562F().f73701a.pictures, new C8797c());
        User user = aw90.m100562F().f73701a;
        if (jyb.m147479J(listM147522n)) {
            listM147522n = this.f34042M.pictures;
        }
        user.pictures = listM147522n;
        i4g0.m138520r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m52207n7();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: Z2 */
    public int mo52275Z2() {
        return this.f34055Z.m52374C0();
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m52276Z6(boolean z, View view) {
        if (!z) {
            i4g0.m138520r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            i4g0.m138520r("e_not_save", "p_lowqualityphoto_save_popup");
            m53521tc();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m52277a6() {
        if (gra.m131745s1()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m52278a7(DialogInterface dialogInterface) {
        this.f34038J0.m152774i();
        this.f34038J0.m152777l();
    }

    /* JADX INFO: renamed from: b6 */
    public final void m52279b6() {
        if (m52303m6()) {
            return;
        }
        int iM100595C = aw90.m100562F().m100595C(act(), CoreModule.f18264c.f20381e0.m116600p9(), false);
        if (!TextUtils.equals(this.f34051V, "edit_data_button") || iM100595C < 50) {
            return;
        }
        this.f34028E0.m189854q();
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m52280b7(DialogInterface dialogInterface) {
        this.f34038J0.m152776k();
        this.f34038J0.m152775j();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m52281c6() {
        if (m52235C7() || this.f34056k0) {
            return;
        }
        m52279b6();
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m52282c7(int i, View view) {
        if (i == aw90.m100562F().f73701a.pictures.size()) {
            aw90.m100562F().f73701a.pictures = this.f34042M.pictures;
        } else {
            aw90.m100562F().f73701a.pictures = jyb.m147522n(aw90.m100562F().f73701a.pictures, new qcj() { // from class: l.j3a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m52207n7();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        duringCreated(this.f34043N).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.a4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68369a.m52318w6((uxj0) obj);
            }
        }, new y20() { // from class: l.b4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.c4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m52214r5((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.d4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85017a.m52321y6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final boolean m52283d6() {
        if (gra.m131570G2() || gra.m131575H2()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m52284d7(final qcj qcjVar, View view) {
        List<Media> list = aw90.m100562F().f73701a.pictures;
        Objects.requireNonNull(qcjVar);
        List<Media> listM147522n = jyb.m147522n(list, new qcj() { // from class: l.x3a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (Boolean) qcjVar.call((Media) obj);
            }
        });
        User user = aw90.m100562F().f73701a;
        if (jyb.m147479J(listM147522n)) {
            listM147522n = this.f34042M.pictures;
        }
        user.pictures = listM147522n;
        i4g0.m138520r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m52207n7();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e6 */
    public final boolean m52285e6() {
        if (gra.m131570G2() || gra.m131575H2()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m52286e7(boolean z, View view) {
        if (!z) {
            i4g0.m138520r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            i4g0.m138520r("e_not_save", "p_lowqualityphoto_save_popup");
            m53521tc();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.k2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123588a.m52240E6((Bundle) obj);
            }
        });
        CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
        duringCreated(C4901p.f20821f0).subscribe(psd0.m173596G(new y20() { // from class: l.l2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129759a.m52242F6((uxj0) obj);
            }
        }));
        duringCreated(C4901p.f20822g0).subscribe(psd0.m173596G(new y20() { // from class: l.m2a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m52168O5((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20378d0.m151460j3()).subscribe(psd0.m173591B());
        m52305n6();
    }

    /* JADX INFO: renamed from: f6 */
    public User m52287f6() {
        if (NullChecker.m82486a(mo52241F1(false))) {
            this.f34055Z.m52375D0(mo52241F1(false));
        }
        User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        m52297j6(userMo225055clone);
        return userMo225055clone.subtract(this.f34042M);
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m52288f7(DialogInterface dialogInterface) {
        this.f34040K0.m152774i();
        this.f34040K0.m152777l();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    public String from() {
        return this.f34051V;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: g3 */
    public boolean mo52289g3() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo21585g4(bundle);
        m52211p6();
        m52204l7();
        this.f34031G.setFocusableInTouchMode(true);
        this.f34031G.setDescendantFocusability(131072);
        this.f34031G.setFocusable(true);
        this.f34031G.addItemDecoration(new dhl(qa00.m175859d(8.0f)));
        this.f34037J = new snf(this, getContext(), this.f34024B);
        this.f34041L = new ExpProfileEditLinearLayoutManager(getContext());
        this.f34031G.setItemAnimator(null);
        this.f34031G.setLayoutManager(this.f34041L);
        this.f34031G.setAdapter(this.f34046Q);
        this.f34031G.setClipChildren(false);
        C8795a c8795a = new C8795a();
        this.f34031G.addOnScrollListener(c8795a);
        this.f34037J.m186913n(c8795a);
        this.f34057p0 = new zyh0(this.f34054Y, this.f34027E, this.f34031G, this.f34041L);
        this.f34028E0 = new taf(getContext(), this.f34031G, this.f34041L, this.f34046Q, this.f34035I);
        bnl0.m105509E0(this.f34033H, new View.OnClickListener() { // from class: l.y1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197086a.m52159G6(view);
            }
        });
        if (getArguments().getInt("preview_type", 0) == 1) {
            m52312r7(false);
            m52235C7();
        } else {
            m52281c6();
        }
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m52290g7(DialogInterface dialogInterface) {
        this.f34040K0.m152776k();
        this.f34040K0.m152775j();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: h3 */
    public void mo52291h3() {
        duringCreated(CoreModule.f18264c.f20381e0.m116527W9(userId()).flatMap(new qcj() { // from class: l.b3a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20424s1.m35372s3();
            }
        }).map(new qcj() { // from class: l.c3a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79585a.m52264R6((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.d3a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84880a.m52266S6((pf60) obj);
            }
        }, new y20() { // from class: l.e3a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m52195f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public VReorderCard m52292h6(int i) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup;
        AvatarCards avatarCards;
        boolean zM212782a = xra.m212782a();
        C8801b c8801b = this.f34055Z;
        if (zM212782a) {
            if (c8801b == null || (avatarCards = c8801b.f34104w) == null) {
                return null;
            }
            return avatarCards.m51994h(i);
        }
        if (c8801b == null || (expEditProfileImageCardGroup = c8801b.f34103v) == null) {
            return null;
        }
        return expEditProfileImageCardGroup.m51994h(i);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m52293h7(View view) {
        m52207n7();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: i3 */
    public int mo52294i3() {
        return 0;
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m52295i7(View view) {
        m53521tc();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM52273Y5 = m52273Y5(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM52273Y5;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: j3 */
    public void mo52296j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.m82486a(this.f34042M)) {
            act().m68056e2();
        } else {
            act().setResult(i, intent);
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m52297j6(User user) {
        User user2;
        if (user == null || (user2 = this.f34042M) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m52298j7(int i, Media media) {
        VReorderCard vReorderCardM52292h6 = m52292h6(i);
        if (vReorderCardM52292h6 != null && (vReorderCardM52292h6 instanceof ExpEditProfileImageCard)) {
            if (media instanceof Picture) {
                ((ExpEditProfileImageCard) vReorderCardM52292h6).m52087a1((Picture) media);
            }
            mo52275Z2();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m52299k6() {
        this.f34049T = getArguments().getString("user_id");
        this.f34051V = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f34049T)) {
            CrashHelper.m82480d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f34051V), 1000);
            act().m68056e2();
            return;
        }
        this.f34050U = getArguments().getString("input_type");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f34045P = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m52300k7(View view) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
        } else if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
        } else {
            pq4.m173309q(act());
        }
        i4g0.m138520r("e_edit_profile_view_edit_verification", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: l6 */
    public final void m52301l6() {
        if (mo52241F1(false).isAudit()) {
            m52247H7("audit_guide", true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: m0 */
    public boolean mo52302m0() {
        return true;
    }

    /* JADX INFO: renamed from: m6 */
    public final boolean m52303m6() {
        if (!TextUtils.equals(this.f34051V, "from_auto_scroll_to_question") && !TextUtils.equals(this.f34051V, "p_tantanx_card")) {
            return false;
        }
        l51.m152889I(this, new Runnable() { // from class: l.f3a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96977a.m52316u6();
            }
        }, 500L);
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public void m52304m7(List<Media> list, int i) {
        this.f34054Y.m205878l(list, i);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m52299k6();
        m52209o6();
        boolean zEquals = "my_tab_profile_like".equals(this.f34051V);
        l4g0 l4g0Var = this.pageHelper;
        if (zEquals) {
            l4g0Var.m152782q(pageId());
        } else {
            l4g0Var.m152782q(pageId());
            C8992f.m55879b().m55884f(this.f34051V);
        }
        m52215r6();
        xc20.m210108t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f34039K = new lnf(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m52305n6() {
        if (eu4.m122523b().m122529g()) {
            act().duringCreated(CoreModule.f18264c.f20353U1.f98891S).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.h3a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107630a.m52317v6((Boolean) obj);
                }
            }, new y20() { // from class: l.i3a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m52184W5((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: o */
    public void mo52306o() {
        boolean zEquals = TextUtils.equals(aw90.m100562F().f73701a.description, CoreModule.f18264c.f20381e0.m116600p9().description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f34051V, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f34051V, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f34051V, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f34051V, "edit_home_page")) {
                        str = "other";
                    }
                }
            }
        }
        sfj0.m185596c("e_edit_personal_profile_finish", "p_edit_profile_view", sfj0.C20032a.m185615h("about_me_is_modified", zEquals ? "no" : "yes"), sfj0.C20032a.m185615h("previous_page", str));
        if (!NullChecker.m82486a(mo52241F1(false)) || !NullChecker.m82486a(this.f34042M)) {
            m53521tc();
            return;
        }
        this.f34055Z.m52375D0(mo52241F1(false));
        int iMo52275Z2 = mo52275Z2();
        if (m52277a6()) {
            m52323z7(false);
            return;
        }
        if (m52285e6()) {
            m52238D7(false);
            return;
        }
        if (m52283d6()) {
            m52238D7(false);
        } else if (aw90.m100562F().f73701a.equals(this.f34042M)) {
            m53521tc();
        } else {
            m52157F7(iMo52275Z2);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public void m52307o7() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = m189086i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo52252K2().settings.hideSchoolNameNoDefaults()) {
            act().progress(R$string.f18632L5);
            CoreModule.f18264c.f20381e0.m116454D9(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.v1a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181941a.m52255M6((uxj0) obj);
                }
            }, new y20() { // from class: l.w1a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f186777a.m52257O6((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                qtk.m177983L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m82486a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            aw90.m100562F().f73701a.description = jyb.m147516k(stringExtra).trim();
            mo52239E();
            m52224w7(aw90.m100562F().f73701a);
            return;
        }
        if (NullChecker.m82486a(intent) && i2 == -1 && LoopFragmentFactory.m52653N(i, aw90.m100562F().f73701a, intent)) {
            mo52239E();
            m52224w7(aw90.m100562F().f73701a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                m52307o7();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m82486a(intent)) {
            if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
                LoopFragmentFactory.m52672j(act());
                m52220u7(aw90.m100562F().f73701a.pictures, false);
                mo52239E();
                m52224w7(aw90.m100562F().f73701a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo52239E();
            m52224w7(aw90.m100562F().f73701a);
        } else if (i == 3003) {
            mo52250J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m82486a(mo52241F1(false))) {
            mo52275Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: p3 */
    public void mo52308p3(final int i, final Media media) {
        this.f34055Z.m52333b(new x20() { // from class: l.x1a0
            @Override // p153l.x20
            public final void call() {
                this.f192032a.m52298j7(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public void m52309p7() {
        if (isDetached()) {
            act().m68056e2();
            return;
        }
        int iM52314s7 = m52314s7();
        if (m52277a6()) {
            m52323z7(true);
            return;
        }
        if (m52285e6()) {
            m52238D7(true);
            return;
        }
        if (m52283d6()) {
            m52238D7(true);
            return;
        }
        if (iM52314s7 > 0) {
            m52230A7(iM52314s7);
        } else if (NullChecker.m82486a(m52287f6())) {
            m52155E7();
        } else {
            m53521tc();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_edit_profile_view";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: q */
    public ViewGroup mo52310q() {
        return this.f34058z;
    }

    /* JADX INFO: renamed from: q7 */
    public final void m52311q7(boolean z) {
        if (this.f34048S == z) {
            return;
        }
        this.f34048S = z;
        Animator animator = this.f34047R;
        if (animator != null && animator.isRunning()) {
            this.f34047R.cancel();
        }
        Animator animatorM132166l = gt0.m132166l(this.f34033H, View.TRANSLATION_Y, 0L, 300L, new LinearInterpolator(), z ? qa00.m175859d(75.0f) : 0, z ? 0 : qa00.m175859d(75.0f));
        this.f34047R = animatorM132166l;
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: r7 */
    public final void m52312r7(boolean z) {
        if (z) {
            if (this.f34056k0) {
                i4g0.m138520r("e_edit_profile_button", "p_edit_profile_view");
            } else {
                i4g0.m138520r("e_preview_button", "p_edit_profile_view");
            }
        }
        boolean z2 = this.f34056k0;
        this.f34056k0 = !z2;
        if (z) {
            float f = !z2 ? 0.0f : -bnl0.m105592y0();
            float f2 = this.f34056k0 ? -bnl0.m105592y0() : 0.0f;
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            float fM105592y0 = bnl0.m105592y0();
            Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f34026D, "translationX", 0L, 200L, linearInterpolator, f, f2), gt0.m132170p(this.f34024B, "translationX", 0L, 200L, linearInterpolator, f + fM105592y0, f2 + fM105592y0));
            gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.r3a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161025a.m52259P6();
                }
            });
            gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.s3a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165988a.m52260Q6();
                }
            });
            animatorM132180z.start();
            if (this.f34056k0) {
                this.f34028E0.m189850m();
            }
        } else {
            bnl0.m105524M(this.f34026D, false);
            bnl0.m105524M(this.f34024B, true);
        }
        if (this.f34056k0) {
            this.f34033H.setText("编辑资料");
            this.f34033H.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86134Et, 0, 0, 0);
            if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
                mo52275Z2();
            }
            act().hideInput();
            mo52239E();
            return;
        }
        if (NullChecker.m82486a(this.f34042M)) {
            if (this.f34037J.m186907h() != null) {
                this.f34037J.m186907h().mo37932s();
            }
            this.f34033H.setText("预览资料");
            this.f34033H.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86166Ft, 0, 0, 0);
            mo52239E();
            m52224w7(aw90.m100562F().f73701a);
            m52281c6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final void m52313s6() {
        if (CoreModule.f18264c.f20381e0.m116571i8()) {
            psd0.m173633z(this.f34032G0);
            this.f34032G0 = duringCreated(CoreModule.f18264c.f20381e0.m116633xa()).filter(new qcj() { // from class: l.d2a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.f2a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96863a.m52237D6((FakeGuideData) obj);
                }
            }, new y20() { // from class: l.g2a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m52182V5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s7 */
    public int m52314s7() {
        boolean zM212782a = xra.m212782a();
        C8801b c8801b = this.f34055Z;
        int i = 0;
        if (zM212782a) {
            AvatarCards avatarCards = c8801b.f34104w;
            if (!NullChecker.m82486a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m51994h(i).m51977n()) {
                if (!TEnum.equals(avatarCards.m51994h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = c8801b.f34103v;
        if (!NullChecker.m82486a(expEditProfileImageCardGroup)) {
            return 0;
        }
        int i3 = 0;
        while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m51994h(i).m51977n()) {
            if (!TEnum.equals(expEditProfileImageCardGroup.m51994h(i).f33963I.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: t6 */
    public final void m52315t6() {
        m52313s6();
        m52213q6();
        m52301l6();
        m52247H7(null, false);
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m52316u6() {
        int iM130246H;
        if (this.f34046Q == null) {
            return;
        }
        if (TextUtils.equals(this.f34051V, "from_auto_scroll_to_question")) {
            iM130246H = this.f34046Q.m130248J();
        } else {
            iM130246H = TextUtils.equals(this.f34051V, "p_tantanx_card") ? this.f34046Q.m130246H() : -1;
        }
        if (iM130246H < 0 || iM130246H >= this.f34046Q.getPageCount()) {
            return;
        }
        this.f34031G.scrollToPosition(iM130246H);
        if (NullChecker.m82486a(this.f34041L)) {
            this.f34041L.scrollToPositionWithOffset(iM130246H, 0);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.s7m
    public String userId() {
        return this.f34049T;
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m52317v6(Boolean bool) {
        eu4.m122523b().m122532j(bool.booleanValue());
        mo52306o();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m52318w6(uxj0 uxj0Var) {
        m52189Z5();
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ Boolean m52319x6() {
        if (!TextUtils.isEmpty(this.f34050U)) {
            this.f34039K.m154979e(this.f34050U);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: x7 */
    public final void m52320x7() {
        pza0.m174356h("button");
        if (this.f34055Z.m52379f0(this)) {
            return;
        }
        final String strM122525c = eu4.m122523b().m122525c(this.f34042M, aw90.m100562F().f73701a);
        if (eu4.m122523b().m122531i(strM122525c)) {
            act().duringCreated(CoreModule.f18264c.f20353U1.m125490i3("profile", strM122525c)).subscribe(psd0.m173597H(new y20() { // from class: l.y3a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197335a.m52270W6(strM122525c, (List) obj);
                }
            }, new y20() { // from class: l.z3a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202812a.m52271X6((Throwable) obj);
                }
            }));
        } else {
            mo52306o();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m52321y6(Bundle bundle) {
        if (NullChecker.m82486a(bundle)) {
            m52227y7(CoreModule.m30930K().me_());
            if (NullChecker.m82486a(m189086i2())) {
                m52222v7(aw90.m100562F().f73701a, false);
                mo52250J3();
            }
        }
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.q3a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f155434a.m52319x6();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m52322z6(View view) {
        m52320x7();
    }

    /* JADX INFO: renamed from: z7 */
    public final void m52323z7(final boolean z) {
        if (this.f34038J0 == null) {
            this.f34038J0 = new l4g0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new th0.C20312a(act()).m191160s("检测到不符合要求的照片").m191148g(false).m191151j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").m191159r("保存其他资料").m191156o(new View.OnClickListener() { // from class: l.z1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202494a.m52274Y6(view);
            }
        }).m191147f(z ? "不保存" : "继续编辑").m191144c(new View.OnClickListener() { // from class: l.a2a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67946a.m52276Z6(z, view);
            }
        }).m191155n(new DialogInterface.OnShowListener() { // from class: l.b2a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f74594a.m52278a7(dialogInterface);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.c2a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f79460a.m52280b7(dialogInterface);
            }
        }).m191142a().m191141g();
    }
}
