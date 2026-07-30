package com.p046p1.mobile.putong.core.p053ui.profile.exp;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.C8638b;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.report.C8829f;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.agf;
import p149l.ark;
import p149l.aw90;
import p149l.bt0;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.fmf;
import p149l.ft4;
import p149l.g30;
import p149l.gd70;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.l9b;
import p149l.lqa;
import p149l.lra0;
import p149l.mkd0;
import p149l.mmf;
import p149l.n9f;
import p149l.nel;
import p149l.o6j0;
import p149l.osi0;
import p149l.p420;
import p149l.qcf;
import p149l.qib0;
import p149l.qp4;
import p149l.roj0;
import p149l.rqh0;
import p149l.t100;
import p149l.t7c0;
import p149l.tw6;
import p149l.u4c0;
import p149l.upa;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.wn90;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.xx0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListExpandedEditFrag extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: L0 */
    public static CategorySuggestions f33174L0;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f33175A;

    /* JADX INFO: renamed from: B */
    public VFrame f33176B;

    /* JADX INFO: renamed from: C */
    public VProgressBar f33177C;

    /* JADX INFO: renamed from: D */
    public VLinear f33178D;

    /* JADX INFO: renamed from: E */
    public TabLayout f33179E;

    /* JADX INFO: renamed from: E0 */
    public n9f f33180E0;

    /* JADX INFO: renamed from: F */
    public ExpEditTopWarnView f33181F;

    /* JADX INFO: renamed from: F0 */
    public c4g0 f33182F0;

    /* JADX INFO: renamed from: G */
    public RecyclerView f33183G;

    /* JADX INFO: renamed from: G0 */
    public c4g0 f33184G0;

    /* JADX INFO: renamed from: H */
    public VText f33185H;

    /* JADX INFO: renamed from: H0 */
    public boolean f33186H0;

    /* JADX INFO: renamed from: I */
    public View f33187I;

    /* JADX INFO: renamed from: I0 */
    public final HashMap<String, C8635d> f33188I0;

    /* JADX INFO: renamed from: J */
    public mmf f33189J;

    /* JADX INFO: renamed from: J0 */
    public cwf0 f33190J0;

    /* JADX INFO: renamed from: K */
    public fmf f33191K;

    /* JADX INFO: renamed from: K0 */
    public cwf0 f33192K0;

    /* JADX INFO: renamed from: L */
    public ExpProfileEditLinearLayoutManager f33193L;

    /* JADX INFO: renamed from: M */
    public User f33194M;

    /* JADX INFO: renamed from: O */
    public j760<List<Literatures>, List<LiteraturesComments>> f33196O;

    /* JADX INFO: renamed from: R */
    public Animator f33199R;

    /* JADX INFO: renamed from: T */
    public String f33201T;

    /* JADX INFO: renamed from: V */
    public String f33203V;

    /* JADX INFO: renamed from: Y */
    public qcf f33206Y;

    /* JADX INFO: renamed from: Z */
    public C8638b f33207Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f33208k0;

    /* JADX INFO: renamed from: p0 */
    public rqh0 f33209p0;

    /* JADX INFO: renamed from: z */
    public VFrame f33210z;

    /* JADX INFO: renamed from: N */
    public final C22392a<roj0> f33195N = C22392a.m221512b();

    /* JADX INFO: renamed from: P */
    public HashMap<String, String> f33197P = new HashMap<>();

    /* JADX INFO: renamed from: Q */
    public agf f33198Q = new agf();

    /* JADX INFO: renamed from: S */
    public boolean f33200S = true;

    /* JADX INFO: renamed from: U */
    public String f33202U = "";

    /* JADX INFO: renamed from: W */
    public boolean f33204W = false;

    /* JADX INFO: renamed from: X */
    public final List<AbstractC8639c> f33205X = new ArrayList();

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
    public class C8632a extends RecyclerView.AbstractC0582t {
        public C8632a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                ProfileListExpandedEditFrag.this.m51128q7(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i2 < 0) {
                ProfileListExpandedEditFrag.this.m51128q7(recyclerView != null);
            } else if (i2 > 0) {
                ProfileListExpandedEditFrag.this.m51128q7(recyclerView == null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$b */
    public class C8633b implements e30<List<Media>> {

        /* JADX INFO: renamed from: a */
        public int f33212a = -1;

        public C8633b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(List<Media> list) {
            if (vwb.m200296J(list)) {
                return;
            }
            int size = list.size();
            int i = this.f33212a;
            if (size != i) {
                int size2 = list.size();
                this.f33212a = size2;
                if (i == 9 || (size2 == 9 && i > 0)) {
                    ProfileListExpandedEditFrag.this.mo51067J3();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$c */
    public class C8634c implements w9j<Media, Boolean> {
        public C8634c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag$d */
    public static class C8635d {

        /* JADX INFO: renamed from: a */
        public String f33215a;

        /* JADX INFO: renamed from: b */
        public boolean f33216b;

        /* JADX INFO: renamed from: c */
        public boolean f33217c;
    }

    public ProfileListExpandedEditFrag() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.hv90
            @Override // p149l.e30
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4319c) obj).f15557c);
            }
        }));
        this.f33186H0 = false;
        creates(new e30() { // from class: l.sv90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m50986P4((Bundle) obj);
            }
        });
        this.f33188I0 = new HashMap<>();
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m50971E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E7 */
    private void m50972E7() {
        new xh0.C21150a(act()).m208740s(act().getString(R$string.f17737Fk)).m208728g(false).m208731j(act().getString(R$string.f17677Dk)).m208739r(act().getString(R$string.f17707Ek)).m208736o(new View.OnClickListener() { // from class: l.eu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93222a.m51110h7(view);
            }
        }).m208727f(act().getString(R$string.f17647Ck)).m208724c(new View.OnClickListener() { // from class: l.fu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99323a.m51112i7(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: F7 */
    private void m50974F7(int i) {
        if (i > 0) {
            m51047A7(i);
        } else {
            m51024n7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G6 */
    public /* synthetic */ void m50976G6(View view) {
        m51129r7(true);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m50984O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m50985O5(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m50986P4(Bundle bundle) {
        if (f33174L0 == null) {
            e51.m114774y(new Runnable() { // from class: l.pu90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m51007a5();
                }
            });
        }
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: T5 */
    public static /* synthetic */ Boolean m50995T5(Media media) {
        if ((media instanceof Picture) && TEnum.equals(media.status, "normal")) {
            Picture picture = (Picture) media;
            if (picture.isLow() || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m50999V5(Throwable th) {
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ void m51001W5(Throwable th) {
    }

    @MainThread
    /* JADX INFO: renamed from: Z5 */
    private void m51006Z5() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m51035t7();
        if (NullChecker.m81303a(mo51058F1(false)) && this.f33204W) {
            User user = wn90.m204602F().f187269a;
            if (!TEnum.equals(this.f33194M.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f33194M.profile.zodiac;
            }
            wn90.m204602F().f187269a = this.f33194M.mo223809clone();
            User user2 = wn90.m204602F().f187269a;
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
            Extensions extensions2 = this.f33194M.profile.extensions;
            physical.bloodType = extensions2.physical.bloodType;
            extensions.interest.emoji = extensions2.interest.emoji;
            ProfileExtensionBasic profileExtensionBasic = extensions.basic;
            ProfileExtensionBasic profileExtensionBasic2 = extensions2.basic;
            profileExtensionBasic.idealType = profileExtensionBasic2.idealType;
            profileExtensionBasic.ideal = profileExtensionBasic2.ideal;
        } else {
            this.f33204W = true;
            wn90.m204602F().f187269a = this.f33194M.mo223809clone();
        }
        m51039v7(wn90.m204602F().f187269a, false);
        this.f33191K.m122165a(this.f33203V);
        this.f33191K.m122166b(this.f33197P.get("action"));
        this.f33183G.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f33191K.m122167c(this.f33203V);
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m51007a5() {
        try {
            f33174L0 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168687a));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m51012f5(Throwable th) {
    }

    /* JADX INFO: renamed from: g6 */
    private User m51014g6() {
        User userMo223809clone = this.f33194M.mo223809clone();
        this.f33207Z.m51192D0(userMo223809clone);
        return userMo223809clone.subtract(this.f33194M);
    }

    /* JADX INFO: renamed from: i6 */
    private List<AbstractC8639c> m51017i6(List<AbstractC8639c> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8639c abstractC8639c : list) {
            if (abstractC8639c.mo51166r()) {
                arrayList.add(abstractC8639c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l7 */
    private void m51021l7() {
        xdl0.m208366b0(this.f33210z, new v9j() { // from class: l.cv90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListExpandedEditFrag.m50971E5();
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    private void m51024n7() {
        if (vwb.m200296J(wn90.m204602F().f187269a.pictures)) {
            m20581b4().m20504F("你的个人资料页需要至少一张照片").m20556t0(R$string.f18046Q, new Runnable() { // from class: l.ru90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161040a.m52338tc();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
            return;
        }
        final User userM51104f6 = m51104f6();
        User userM51014g6 = m51014g6();
        boolean z = true;
        if (NullChecker.m81303a(userM51104f6) && NullChecker.m81303a(userM51014g6) && userM51104f6.equals(userM51014g6)) {
            this.f33186H0 = true;
        }
        final User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        final User userMo223809clone2 = this.f33194M.mo223809clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.m81303a(userM51104f6) && NullChecker.m81303a(userM51104f6.profile) && NullChecker.m81303a(userM51104f6.profile.extensions) && NullChecker.m81303a(userM51104f6.profile.extensions.basic) && !TextUtils.isEmpty(userM51104f6.description)) {
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
        o6j0.m162859c("e_profile_save_button", pageId(), o6j0.C18854a.m162878h("edit_profile_content_modified", sb.toString()));
        if (!NullChecker.m81303a(userM51104f6)) {
            m52338tc();
            return;
        }
        m20595o4(R$string.f17842J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        if (NullChecker.m81303a(userM51104f6.profile) && NullChecker.m81303a(userM51104f6.profile.extensions)) {
            userM51104f6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.m194745e2() && NullChecker.m81303a(userM51104f6) && NullChecker.m81303a(userM51104f6.profile) && NullChecker.m81303a(userM51104f6.profile.extensions) && NullChecker.m81303a(userM51104f6.profile.extensions.basic) && !vwb.m200296J(userM51104f6.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM51104f6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.su90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m50984O4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.tu90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172156a.m51063H6(userM51104f6, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154959K(new e30() { // from class: l.uu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178327a.m51065I6(zEquals, userMo223809clone, userMo223809clone2, userM51104f6, (roj0) obj);
            }
        }, new e30() { // from class: l.vu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183043a.m51071L6(userMo223809clone2, userM51104f6, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o6 */
    private void m51026o6() {
        qcf qcfVar = new qcf(this, this);
        this.f33206Y = qcfVar;
        this.f33205X.addAll(qcfVar.m173874g());
        C8638b c8638b = (C8638b) this.f33206Y.m173875h(C8638b.class);
        this.f33207Z = c8638b;
        c8638b.m51195e0(new C8633b());
    }

    /* JADX INFO: renamed from: p6 */
    private void m51028p6() {
        gd70.m125540b().m125543e(Boolean.FALSE);
        xdl0.m208344M(this.f33175A, true);
        this.f33175A.setLeftIconResource(x2c0.f189217C);
        this.f33175A.setBackgroundColor(getResources().getColor(w0c0.f183792O0));
        act().setStatusBarColor(getResources().getColor(w0c0.f183792O0));
        act().getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(w0c0.f183792O0)));
        View viewInflate = act().inflater().inflate(f6c0.f95292B9, (ViewGroup) null);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174359m4);
        vButton.setBackgroundResource(x2c0.f189249D);
        xdl0.m208359W(vButton, t100.f167256e);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.nu90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140588a.m51139z6(view);
            }
        });
        this.f33175A.m223589z(viewInflate);
        this.f33175A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ou90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145678a.m51046A6(view);
            }
        });
        if (NullChecker.m81303a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: q6 */
    private void m51030q6() {
        if (CertificationUtil.m58153l() || !jjb0.m141784b()) {
            return;
        }
        m51064H7("pic_cert_guide", true);
        mkd0.m154992z(this.f33182F0);
        this.f33182F0 = duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).filter(new w9j() { // from class: l.lu90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf((verificationCenter == null || verificationCenter.picVerificationInfo == null) ? false : true);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.wu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188099a.m51048B6((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m51031r5(C4319c c4319c) {
    }

    /* JADX INFO: renamed from: r6 */
    private void m51032r6() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ju90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119748a.m51051C6((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    private void m51035t7() {
        List<AbstractC8639c> listM51017i6 = m51017i6(this.f33205X);
        this.f33198Q.m96302L(listM51017i6);
        this.f33206Y.m173878k(this.f33179E, listM51017i6, this.f33209p0);
        m51132t6();
    }

    /* JADX INFO: renamed from: u7 */
    private void m51037u7(final List<Media> list, final boolean z) {
        boolean zM150963a = lqa.m150963a();
        C8638b c8638b = this.f33207Z;
        if (zM150963a) {
            c8638b.m51150b(new d30() { // from class: l.ku90
                @Override // p149l.d30
                public final void call() {
                    this.f124668a.m51084T6(list, z);
                }
            });
        } else {
            c8638b.m51150b(new d30() { // from class: l.mu90
                @Override // p149l.d30
                public final void call() {
                    this.f135769a.m51086V6(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m51038v5() {
        try {
            ProfileListFrag.f33610I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168687a));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m51039v7(User user, boolean z) {
        m51035t7();
        m51037u7(user.pictures, z);
        this.f33189J.m155389m(user);
    }

    /* JADX INFO: renamed from: w7 */
    private void m51041w7(User user) {
        wn90.m204602F().f187269a = user;
        m51006Z5();
    }

    /* JADX INFO: renamed from: y7 */
    private void m51044y7(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + this.f33201T));
        }
        this.f33194M = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m51046A6(View view) {
        m51127p7();
    }

    /* JADX INFO: renamed from: A7 */
    public void m51047A7(final int i) {
        new xh0.C21150a(act()).m208740s(m20604x4(R$string.f18013Oq)).m208728g(false).m208730i(R$string.f17983Nq).m208738q(R$string.f17953Mq).m208736o(new View.OnClickListener() { // from class: l.du90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87959a.m51099c7(i, view);
            }
        }).m208726e(R$string.f18408c).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m51048B6(VerificationCenter verificationCenter) {
        m51064H7("pic_cert_guide", !CertificationUtil.m58153l());
    }

    /* JADX INFO: renamed from: B7 */
    public void m51049B7(final boolean z, String str, String str2, final w9j<Media, Boolean> w9jVar) {
        if (this.f33192K0 == null) {
            this.f33192K0 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.C21150a(act()).m208740s(str).m208728g(false).m208731j(str2).m208739r("保存其他资料").m208736o(new View.OnClickListener() { // from class: l.gv90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104545a.m51101d7(w9jVar, view);
            }
        }).m208727f(z ? "不保存" : "继续编辑").m208724c(new View.OnClickListener() { // from class: l.iv90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115104a.m51103e7(z, view);
            }
        }).m208735n(new DialogInterface.OnShowListener() { // from class: l.jv90
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f119917a.m51105f7(dialogInterface);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.kv90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f124759a.m51107g7(dialogInterface);
            }
        }).m208722a().m208721g();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo51050C2() {
        return f33174L0;
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m51051C6(User user) {
        m51044y7(user);
        this.f33195N.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: C7 */
    public final boolean m51052C7() {
        if (CoreModule.m29932K().me_().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
            return true;
        }
        if (!this.f33208k0 && CoreModule.f17545c.f19639e0.m169482e8()) {
            xx0.m211439h(act());
            return true;
        }
        if (this.f33208k0 || !CoreModule.m29932K().me_().isAudit() || ura.m195053e().m195057d().mo33718Ln()) {
            return false;
        }
        xx0.m211437f(act());
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo51053D2() {
        return true;
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m51054D6(FakeGuideData fakeGuideData) {
        m51064H7("stock_fake_guide", true);
    }

    /* JADX INFO: renamed from: D7 */
    public final void m51055D7(boolean z) {
        m51049B7(z, "检测到不符合要求的照片", "若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除", new w9j() { // from class: l.qt90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListExpandedEditFrag.m50995T5((Media) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: E */
    public void mo51056E() {
        this.f33189J.m155389m(wn90.m204602F().f187269a);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m51057E6(Bundle bundle) {
        mo51108h3();
        if (ProfileListFrag.f33610I4 == null) {
            e51.m114774y(new Runnable() { // from class: l.pv90
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListExpandedEditFrag.m51038v5();
                }
            });
        }
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo51058F1(boolean z) {
        if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
            if (z) {
                CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        }
        return wn90.m204602F().f187269a;
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m51059F6(roj0 roj0Var) {
        mo51108h3();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: G */
    public void mo51060G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208329E0(view, m52405N4(this.f33194M));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m51061G7() {
        lra0.m151149h("android_back");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo51062H3() {
        return this.f33196O;
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ C22306c m51063H6(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169385E9(user);
        }
        User user2 = wn90.m204602F().f187269a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m51039v7(user2, true);
        } else {
            user2.pictures = profileEditInfo.user.pictures;
            m51039v7(user2, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H7 */
    public void m51064H7(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C8635d c8635d = this.f33188I0.get(str);
            if (c8635d == null) {
                c8635d = new C8635d();
                c8635d.f33215a = str;
            }
            c8635d.f33216b = z;
            this.f33188I0.put(str, c8635d);
        }
        boolean zM200337m = vwb.m200337m(this.f33188I0.entrySet(), new w9j() { // from class: l.pt90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileListExpandedEditFrag.C8635d) ((Map.Entry) obj).getValue()).f33216b);
            }
        });
        ExpEditTopWarnView expEditTopWarnView = this.f33181F;
        if (zM200337m) {
            xdl0.m208344M(expEditTopWarnView, true);
        } else {
            xdl0.m208344M(expEditTopWarnView, false);
        }
        xdl0.m208325C0(this.f33181F, t100.f167226A);
        C8635d c8635d2 = this.f33188I0.get("stock_fake_guide");
        if (c8635d2 != null && c8635d2.f33216b) {
            this.f33181F.m50946c("请立即更换真实头像，以免影响你在划卡的曝光", x2c0.f189910Y6, 0);
            return;
        }
        C8635d c8635d3 = this.f33188I0.get("audit_guide");
        if (c8635d3 != null && c8635d3.f33216b) {
            this.f33181F.m50946c("有资料在审核中", x2c0.f189879X6, 0);
            return;
        }
        C8635d c8635d4 = this.f33188I0.get("pic_cert_guide");
        if (c8635d4 == null || !c8635d4.f33216b) {
            return;
        }
        this.f33181F.m50948e("完成头像认证会被优先推荐", "认证", x2c0.f189941Z6, "https://auto.tancdn.com/v1/images/eyJpZCI6IjM0RVZJN1JITFNWNVdHUUtFUVBNRzdRRjVORFVGNDE0IiwidyI6MTA3NywiaCI6MTYyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE1Nzk0MDc5MzcwMzQ2ODM2NX0.png");
        xdl0.m208329E0(this.f33181F, new View.OnClickListener() { // from class: l.au90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71738a.m51117k7(view);
            }
        });
        if (!c8635d4.f33217c) {
            c8635d4.f33217c = true;
            zvf0.m220402x("e_edit_profile_view_edit_verification", "p_edit_profile_view");
        }
        xdl0.m208325C0(this.f33181F, t100.f167228C);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m51065I6(boolean z, User user, User user2, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.f17545c.f19639e0.f149377g4.onNext("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.m220371D("e_upload_photos_success", pageId(), vwb.m200311Y("upload_page_name", "edit_profile_page"), vwb.m200311Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        m52338tc();
        if (NullChecker.m81303a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f17545c.f19639e0.m169395H7();
        }
        this.f33207Z.m51199i0(this.f33194M, this.f33186H0);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo51066J1() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo51067J3() {
        if (this.f33194M == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f33195N.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m51068J6(Throwable th) {
        if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
            osi0.m165782f(R$string.f18409c0);
        } else {
            osi0.m165782f(R$string.f17874K7);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo51069K2() {
        return this.f33194M;
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m51071L6(User user, User user2, final Throwable th) {
        if (yij0.m214930H(th)) {
            m20599s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m20599s4();
            act().post(new Runnable() { // from class: l.qv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156593a.m51068J6(th);
                }
            });
            return;
        }
        if (NullChecker.m81303a(act())) {
            m20599s4();
            String string = act().getString(R$string.f17737Fk);
            double dDoubleValue = (NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m81303a(user2.settings) && NullChecker.m81303a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
            int iM149011T = l9b.m149011T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM149011T > 120) {
                string = act().getString(R$string.f18140T3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f18170U3);
            } else if (iM149011T > 120) {
                string = act().getString(R$string.f18200V3);
            }
            m20581b4().m20504F(string).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.rv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161182a.m51070K6();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m51072M6(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m51074O6(Throwable th) {
        m94569i2().settings.getSettingGroup().privacy.hideSchool = mo51069K2().settings.hideSchoolNameNoDefaults();
        if (NullChecker.m81303a(act())) {
            act().progressDismiss();
            act().dialog().m20500D(R$string.f18768nl).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.qu90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156462a.m51073N6();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo51075P1() {
        return true;
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m51076P6() {
        xdl0.m208344M(this.f33178D, true);
        xdl0.m208344M(this.f33176B, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m51077Q6() {
        if (this.f33208k0) {
            xdl0.m208344M(this.f33178D, false);
        } else {
            xdl0.m208344M(this.f33176B, false);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo51078R() {
        return CoreModule.f17545c.f19663m0.f19463x0.get().booleanValue();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo51079R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m51073N6() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ j760 m51081R6(List list) {
        return vwb.m200311Y(list, BookMoviesDramasHelper.m59445l(userId()));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo51082S() {
        return true;
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m51083S6(j760 j760Var) {
        this.f33196O = j760Var;
        mo51067J3();
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m51084T6(List list, boolean z) {
        this.f33207Z.f33256w.setMedia(list);
        this.f33207Z.f33256w.m50811h(0).setIllegalVisible(z);
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m51085U6(Media media, Boolean bool, Boolean bool2) {
        mo51092Z2();
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m51086V6(boolean z, List list) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f33207Z.f33255v;
        expEditProfileImageCardGroup.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            expEditProfileImageCardGroup.m50811h(i).setIllegalPicture(z && i < list.size());
            expEditProfileImageCardGroup.m50811h(i).setStyle(0);
            expEditProfileImageCardGroup.m50811h(i).m50906d1(i < list.size() ? (Media) list.get(i) : null);
            expEditProfileImageCardGroup.m50811h(i).setChangeAction(new g30() { // from class: l.lv90
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f130148a.m51085U6((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m50811h(i).m50919x0(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m51087W6(String str, List list) {
        if (vwb.m200296J(list)) {
            mo51123o();
        } else {
            ft4.m123008b().m123018k(act(), str);
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m51088X6(Throwable th) {
        mo51123o();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo51089Y0() {
        return this.f33183G;
    }

    /* JADX INFO: renamed from: Y5 */
    public View m51090Y5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aw90.m99259b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m51091Y6(View view) {
        List<Media> listM200339n = vwb.m200339n(wn90.m204602F().f187269a.pictures, new C8634c());
        User user = wn90.m204602F().f187269a;
        if (vwb.m200296J(listM200339n)) {
            listM200339n = this.f33194M.pictures;
        }
        user.pictures = listM200339n;
        zvf0.m220396r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m51024n7();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo51092Z2() {
        return this.f33207Z.m51191C0();
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m51093Z6(boolean z, View view) {
        if (!z) {
            zvf0.m220396r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.m220396r("e_not_save", "p_lowqualityphoto_save_popup");
            m52338tc();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m51094a6() {
        if (upa.m194814s1()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m51095a7(DialogInterface dialogInterface) {
        this.f33190J0.m109033i();
        this.f33190J0.m109036l();
    }

    /* JADX INFO: renamed from: b6 */
    public final void m51096b6() {
        if (m51120m6()) {
            return;
        }
        int iM204635C = wn90.m204602F().m204635C(act(), CoreModule.f17545c.f19639e0.m169527p9(), false);
        if (!TextUtils.equals(this.f33203V, "edit_data_button") || iM204635C < 50) {
            return;
        }
        this.f33180E0.m158556q();
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m51097b7(DialogInterface dialogInterface) {
        this.f33190J0.m109035k();
        this.f33190J0.m109034j();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m51098c6() {
        if (m51052C7() || this.f33208k0) {
            return;
        }
        m51096b6();
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m51099c7(int i, View view) {
        if (i == wn90.m204602F().f187269a.pictures.size()) {
            wn90.m204602F().f187269a.pictures = this.f33194M.pictures;
        } else {
            wn90.m204602F().f187269a.pictures = vwb.m200339n(wn90.m204602F().f187269a.pictures, new w9j() { // from class: l.fv90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m51024n7();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        duringCreated(this.f33195N).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.wv90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188226a.m51135w6((roj0) obj);
            }
        }, new e30() { // from class: l.xv90
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.yv90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m51031r5((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.zv90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204981a.m51138y6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final boolean m51100d6() {
        if (upa.m194639G2() || upa.m194644H2()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m51101d7(final w9j w9jVar, View view) {
        List<Media> list = wn90.m204602F().f187269a.pictures;
        Objects.requireNonNull(w9jVar);
        List<Media> listM200339n = vwb.m200339n(list, new w9j() { // from class: l.tv90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (Boolean) w9jVar.call((Media) obj);
            }
        });
        User user = wn90.m204602F().f187269a;
        if (vwb.m200296J(listM200339n)) {
            listM200339n = this.f33194M.pictures;
        }
        user.pictures = listM200339n;
        zvf0.m220396r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m51024n7();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e6 */
    public final boolean m51102e6() {
        if (upa.m194639G2() || upa.m194644H2()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m51103e7(boolean z, View view) {
        if (!z) {
            zvf0.m220396r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.m220396r("e_not_save", "p_lowqualityphoto_save_popup");
            m52338tc();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.gu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104384a.m51057E6((Bundle) obj);
            }
        });
        CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
        duringCreated(C4750p.f20079f0).subscribe(mkd0.m154955G(new e30() { // from class: l.hu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109552a.m51059F6((roj0) obj);
            }
        }));
        duringCreated(C4750p.f20080g0).subscribe(mkd0.m154955G(new e30() { // from class: l.iu90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m50985O5((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19636d0.m215895j3()).subscribe(mkd0.m154950B());
        m51122n6();
    }

    /* JADX INFO: renamed from: f6 */
    public User m51104f6() {
        if (NullChecker.m81303a(mo51058F1(false))) {
            this.f33207Z.m51192D0(mo51058F1(false));
        }
        User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        m51114j6(userMo223809clone);
        return userMo223809clone.subtract(this.f33194M);
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m51105f7(DialogInterface dialogInterface) {
        this.f33192K0.m109033i();
        this.f33192K0.m109036l();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    public String from() {
        return this.f33203V;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo51106g3() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo20586g4(bundle);
        m51028p6();
        m51021l7();
        this.f33183G.setFocusableInTouchMode(true);
        this.f33183G.setDescendantFocusability(131072);
        this.f33183G.setFocusable(true);
        this.f33183G.addItemDecoration(new nel(t100.m186890d(8.0f)));
        this.f33189J = new mmf(this, getContext(), this.f33176B);
        this.f33193L = new ExpProfileEditLinearLayoutManager(getContext());
        this.f33183G.setItemAnimator(null);
        this.f33183G.setLayoutManager(this.f33193L);
        this.f33183G.setAdapter(this.f33198Q);
        this.f33183G.setClipChildren(false);
        C8632a c8632a = new C8632a();
        this.f33183G.addOnScrollListener(c8632a);
        this.f33189J.m155390n(c8632a);
        this.f33209p0 = new rqh0(this.f33206Y, this.f33179E, this.f33183G, this.f33193L);
        this.f33180E0 = new n9f(getContext(), this.f33183G, this.f33193L, this.f33198Q, this.f33187I);
        xdl0.m208329E0(this.f33185H, new View.OnClickListener() { // from class: l.ut90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178242a.m50976G6(view);
            }
        });
        if (getArguments().getInt("preview_type", 0) == 1) {
            m51129r7(false);
            m51052C7();
        } else {
            m51098c6();
        }
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m51107g7(DialogInterface dialogInterface) {
        this.f33192K0.m109035k();
        this.f33192K0.m109034j();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo51108h3() {
        duringCreated(CoreModule.f17545c.f19639e0.m169454W9(userId()).flatMap(new w9j() { // from class: l.xu90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19682s1.m34369s3();
            }
        }).map(new w9j() { // from class: l.yu90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f200057a.m51081R6((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.zu90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204829a.m51083S6((j760) obj);
            }
        }, new e30() { // from class: l.av90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListExpandedEditFrag.m51012f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public VReorderCard m51109h6(int i) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup;
        AvatarCards avatarCards;
        boolean zM150963a = lqa.m150963a();
        C8638b c8638b = this.f33207Z;
        if (zM150963a) {
            if (c8638b == null || (avatarCards = c8638b.f33256w) == null) {
                return null;
            }
            return avatarCards.m50811h(i);
        }
        if (c8638b == null || (expEditProfileImageCardGroup = c8638b.f33255v) == null) {
            return null;
        }
        return expEditProfileImageCardGroup.m50811h(i);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m51110h7(View view) {
        m51024n7();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo51111i3() {
        return 0;
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m51112i7(View view) {
        m52338tc();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM51090Y5 = m51090Y5(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM51090Y5;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo51113j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.m81303a(this.f33194M)) {
            act().m66873d2();
        } else {
            act().setResult(i, intent);
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m51114j6(User user) {
        User user2;
        if (user == null || (user2 = this.f33194M) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m51115j7(int i, Media media) {
        VReorderCard vReorderCardM51109h6 = m51109h6(i);
        if (vReorderCardM51109h6 != null && (vReorderCardM51109h6 instanceof ExpEditProfileImageCard)) {
            if (media instanceof Picture) {
                ((ExpEditProfileImageCard) vReorderCardM51109h6).m50904a1((Picture) media);
            }
            mo51092Z2();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m51116k6() {
        this.f33201T = getArguments().getString("user_id");
        this.f33203V = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f33201T)) {
            CrashHelper.m81297d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f33203V), 1000);
            act().m66873d2();
            return;
        }
        this.f33202U = getArguments().getString("input_type");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f33197P = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m51117k7(View view) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
        } else if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
        } else {
            qp4.m175811q(act());
        }
        zvf0.m220396r("e_edit_profile_view_edit_verification", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: l6 */
    public final void m51118l6() {
        if (mo51058F1(false).isAudit()) {
            m51064H7("audit_guide", true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo51119m0() {
        return true;
    }

    /* JADX INFO: renamed from: m6 */
    public final boolean m51120m6() {
        if (!TextUtils.equals(this.f33203V, "from_auto_scroll_to_question") && !TextUtils.equals(this.f33203V, "p_tantanx_card")) {
            return false;
        }
        e51.m114744I(this, new Runnable() { // from class: l.bv90
            @Override // java.lang.Runnable
            public final void run() {
                this.f77412a.m51133u6();
            }
        }, 500L);
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public void m51121m7(List<Media> list, int i) {
        this.f33206Y.m173879l(list, i);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m51116k6();
        m51026o6();
        boolean zEquals = "my_tab_profile_like".equals(this.f33203V);
        cwf0 cwf0Var = this.pageHelper;
        if (zEquals) {
            cwf0Var.m109041q(pageId());
        } else {
            cwf0Var.m109041q(pageId());
            C8829f.m54696b().m54701f(this.f33203V);
        }
        m51032r6();
        p420.m167354t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        this.f33191K = new fmf(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m51122n6() {
        if (ft4.m123008b().m123014g()) {
            act().duringCreated(CoreModule.f17545c.f19611U1.f75278S).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.dv90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88049a.m51134v6((Boolean) obj);
                }
            }, new e30() { // from class: l.ev90
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m51001W5((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: o */
    public void mo51123o() {
        boolean zEquals = TextUtils.equals(wn90.m204602F().f187269a.description, CoreModule.f17545c.f19639e0.m169527p9().description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f33203V, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f33203V, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f33203V, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f33203V, "edit_home_page")) {
                        str = "other";
                    }
                }
            }
        }
        o6j0.m162859c("e_edit_personal_profile_finish", "p_edit_profile_view", o6j0.C18854a.m162878h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.C18854a.m162878h("previous_page", str));
        if (!NullChecker.m81303a(mo51058F1(false)) || !NullChecker.m81303a(this.f33194M)) {
            m52338tc();
            return;
        }
        this.f33207Z.m51192D0(mo51058F1(false));
        int iMo51092Z2 = mo51092Z2();
        if (m51094a6()) {
            m51140z7(false);
            return;
        }
        if (m51102e6()) {
            m51055D7(false);
            return;
        }
        if (m51100d6()) {
            m51055D7(false);
        } else if (wn90.m204602F().f187269a.equals(this.f33194M)) {
            m52338tc();
        } else {
            m50974F7(iMo51092Z2);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public void m51124o7() {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hideSchool = m94569i2().settings.hideSchoolNameNoDefaults();
        if (settingGroups.privacy.hideSchool != mo51069K2().settings.hideSchoolNameNoDefaults()) {
            act().progress(R$string.f17842J5);
            CoreModule.f17545c.f19639e0.m169381D9(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.rt90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160952a.m51072M6((roj0) obj);
                }
            }, new e30() { // from class: l.st90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166308a.m51074O6((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.m98433L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m81303a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.m204602F().f187269a.description = vwb.m200333k(stringExtra).trim();
            mo51056E();
            m51041w7(wn90.m204602F().f187269a);
            return;
        }
        if (NullChecker.m81303a(intent) && i2 == -1 && LoopFragmentFactory.m51470N(i, wn90.m204602F().f187269a, intent)) {
            mo51056E();
            m51041w7(wn90.m204602F().f187269a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                m51124o7();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m81303a(intent)) {
            if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
                LoopFragmentFactory.m51489j(act());
                m51037u7(wn90.m204602F().f187269a.pictures, false);
                mo51056E();
                m51041w7(wn90.m204602F().f187269a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo51056E();
            m51041w7(wn90.m204602F().f187269a);
        } else if (i == 3003) {
            mo51067J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m81303a(mo51058F1(false))) {
            mo51092Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo51125p() {
        return this.f33210z;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo51126p3(final int i, final Media media) {
        this.f33207Z.m51150b(new d30() { // from class: l.tt90
            @Override // p149l.d30
            public final void call() {
                this.f172001a.m51115j7(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public void m51127p7() {
        if (isDetached()) {
            act().m66873d2();
            return;
        }
        int iM51131s7 = m51131s7();
        if (m51094a6()) {
            m51140z7(true);
            return;
        }
        if (m51102e6()) {
            m51055D7(true);
            return;
        }
        if (m51100d6()) {
            m51055D7(true);
            return;
        }
        if (iM51131s7 > 0) {
            m51047A7(iM51131s7);
        } else if (NullChecker.m81303a(m51104f6())) {
            m50972E7();
        } else {
            m52338tc();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: q7 */
    public final void m51128q7(boolean z) {
        if (this.f33200S == z) {
            return;
        }
        this.f33200S = z;
        Animator animator = this.f33199R;
        if (animator != null && animator.isRunning()) {
            this.f33199R.cancel();
        }
        Animator animatorM103739l = bt0.m103739l(this.f33185H, View.TRANSLATION_Y, 0L, 300L, new LinearInterpolator(), z ? t100.m186890d(75.0f) : 0, z ? 0 : t100.m186890d(75.0f));
        this.f33199R = animatorM103739l;
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: r7 */
    public final void m51129r7(boolean z) {
        if (z) {
            if (this.f33208k0) {
                zvf0.m220396r("e_edit_profile_button", "p_edit_profile_view");
            } else {
                zvf0.m220396r("e_preview_button", "p_edit_profile_view");
            }
        }
        boolean z2 = this.f33208k0;
        this.f33208k0 = !z2;
        if (z) {
            float f = !z2 ? 0.0f : -xdl0.m208412y0();
            float f2 = this.f33208k0 ? -xdl0.m208412y0() : 0.0f;
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            float fM208412y0 = xdl0.m208412y0();
            Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f33178D, "translationX", 0L, 200L, linearInterpolator, f, f2), bt0.m103743p(this.f33176B, "translationX", 0L, 200L, linearInterpolator, f + fM208412y0, f2 + fM208412y0));
            bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.nv90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140697a.m51076P6();
                }
            });
            bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.ov90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145790a.m51077Q6();
                }
            });
            animatorM103753z.start();
            if (this.f33208k0) {
                this.f33180E0.m158552m();
            }
        } else {
            xdl0.m208344M(this.f33178D, false);
            xdl0.m208344M(this.f33176B, true);
        }
        if (this.f33208k0) {
            this.f33185H.setText("编辑资料");
            this.f33185H.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189653Ps, 0, 0, 0);
            if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
                mo51092Z2();
            }
            act().hideInput();
            mo51056E();
            return;
        }
        if (NullChecker.m81303a(this.f33194M)) {
            if (this.f33189J.m155384h() != null) {
                this.f33189J.m155384h().mo36929s();
            }
            this.f33185H.setText("预览资料");
            this.f33185H.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189684Qs, 0, 0, 0);
            mo51056E();
            m51041w7(wn90.m204602F().f187269a);
            m51098c6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final void m51130s6() {
        if (CoreModule.f17545c.f19639e0.m169498i8()) {
            mkd0.m154992z(this.f33184G0);
            this.f33184G0 = duringCreated(CoreModule.f17545c.f19639e0.m169560xa()).filter(new w9j() { // from class: l.zt90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(fakeGuideData != null && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.bu90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77292a.m51054D6((FakeGuideData) obj);
                }
            }, new e30() { // from class: l.cu90
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListExpandedEditFrag.m50999V5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s7 */
    public int m51131s7() {
        boolean zM150963a = lqa.m150963a();
        C8638b c8638b = this.f33207Z;
        int i = 0;
        if (zM150963a) {
            AvatarCards avatarCards = c8638b.f33256w;
            if (!NullChecker.m81303a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m50811h(i).m50794n()) {
                if (!TEnum.equals(avatarCards.m50811h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = c8638b.f33255v;
        if (!NullChecker.m81303a(expEditProfileImageCardGroup)) {
            return 0;
        }
        int i3 = 0;
        while (i < expEditProfileImageCardGroup.getChildCount() && !expEditProfileImageCardGroup.m50811h(i).m50794n()) {
            if (!TEnum.equals(expEditProfileImageCardGroup.m50811h(i).f33115I.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: t6 */
    public final void m51132t6() {
        m51130s6();
        m51030q6();
        m51118l6();
        m51064H7(null, false);
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m51133u6() {
        int iM96298H;
        if (this.f33198Q == null) {
            return;
        }
        if (TextUtils.equals(this.f33203V, "from_auto_scroll_to_question")) {
            iM96298H = this.f33198Q.m96300J();
        } else {
            iM96298H = TextUtils.equals(this.f33203V, "p_tantanx_card") ? this.f33198Q.m96298H() : -1;
        }
        if (iM96298H < 0 || iM96298H >= this.f33198Q.getPageCount()) {
            return;
        }
        this.f33183G.scrollToPosition(iM96298H);
        if (NullChecker.m81303a(this.f33193L)) {
            this.f33193L.scrollToPositionWithOffset(iM96298H, 0);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.c5m
    public String userId() {
        return this.f33201T;
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m51134v6(Boolean bool) {
        ft4.m123008b().m123017j(bool.booleanValue());
        mo51123o();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m51135w6(roj0 roj0Var) {
        m51006Z5();
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ Boolean m51136x6() {
        if (!TextUtils.isEmpty(this.f33202U)) {
            this.f33191K.m122169e(this.f33202U);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: x7 */
    public final void m51137x7() {
        lra0.m151149h("button");
        if (this.f33207Z.m51196f0(this)) {
            return;
        }
        final String strM123010c = ft4.m123008b().m123010c(this.f33194M, wn90.m204602F().f187269a);
        if (ft4.m123008b().m123016i(strM123010c)) {
            act().duringCreated(CoreModule.f17545c.f19611U1.m101523i3("profile", strM123010c)).subscribe(mkd0.m154956H(new e30() { // from class: l.uv90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178517a.m51087W6(strM123010c, (List) obj);
                }
            }, new e30() { // from class: l.vv90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183203a.m51088X6((Throwable) obj);
                }
            }));
        } else {
            mo51123o();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m51138y6(Bundle bundle) {
        if (NullChecker.m81303a(bundle)) {
            m51044y7(CoreModule.m29932K().me_());
            if (NullChecker.m81303a(m94569i2())) {
                m51039v7(wn90.m204602F().f187269a, false);
                mo51067J3();
            }
        }
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.mv90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135891a.m51136x6();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m51139z6(View view) {
        m51137x7();
    }

    /* JADX INFO: renamed from: z7 */
    public final void m51140z7(final boolean z) {
        if (this.f33190J0 == null) {
            this.f33190J0 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.C21150a(act()).m208740s("检测到不符合要求的照片").m208728g(false).m208731j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").m208739r("保存其他资料").m208736o(new View.OnClickListener() { // from class: l.vt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182914a.m51091Y6(view);
            }
        }).m208727f(z ? "不保存" : "继续编辑").m208724c(new View.OnClickListener() { // from class: l.wt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188004a.m51093Z6(z, view);
            }
        }).m208735n(new DialogInterface.OnShowListener() { // from class: l.xt90
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f194362a.m51095a7(dialogInterface);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.yt90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f199896a.m51097b7(dialogInterface);
            }
        }).m208722a().m208721g();
    }
}
