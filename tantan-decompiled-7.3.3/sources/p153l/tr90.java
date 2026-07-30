package p153l;

import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.ProfileCountInfo;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.ProfileEditInfoException;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.List;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class tr90 {

    /* JADX INFO: renamed from: h */
    public static String f175814h = "data_from_edit";

    /* JADX INFO: renamed from: i */
    public static String f175815i = "data_from_tag_instance";

    /* JADX INFO: renamed from: j */
    public static String f175816j = "data_from_marry";

    /* JADX INFO: renamed from: k */
    public static String f175817k = "data_from_pick";

    /* JADX INFO: renamed from: l */
    public static String f175818l = "data_from_explore";

    /* JADX INFO: renamed from: m */
    public static String f175819m;

    /* JADX INFO: renamed from: n */
    public static final String f175820n;

    /* JADX INFO: renamed from: o */
    public static final String f175821o;

    /* JADX INFO: renamed from: p */
    public static final String f175822p;

    /* JADX INFO: renamed from: q */
    public static final String f175823q;

    /* JADX INFO: renamed from: r */
    public static final String f175824r;

    /* JADX INFO: renamed from: s */
    public static pf60<String, IdealInfo> f175825s;

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f175826a;

    /* JADX INFO: renamed from: b */
    public Act f175827b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final VText f175828c;

    /* JADX INFO: renamed from: d */
    public final boolean f175829d;

    /* JADX INFO: renamed from: e */
    public final boolean f175830e;

    /* JADX INFO: renamed from: f */
    public t4m f175831f;

    /* JADX INFO: renamed from: g */
    public VText f175832g;

    /* JADX INFO: renamed from: l.tr90$a */
    public static /* synthetic */ class C20381a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f175833a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f175833a = iArr;
            try {
                iArr[LoopInputType.FITNESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f175833a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f175833a[LoopInputType.COMPANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f175833a[LoopInputType.DRINKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f175833a[LoopInputType.QUALIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f175833a[LoopInputType.HOUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f175833a[LoopInputType.INCOME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f175833a[LoopInputType.SCHOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f175833a[LoopInputType.SCHOOL_NEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f175833a[LoopInputType.HEIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f175833a[LoopInputType.SMOKING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f175833a[LoopInputType.PROFESSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f175833a[LoopInputType.SIGNATURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f175833a[LoopInputType.PET.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f175833a[LoopInputType.MBTI_TEST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f175833a[LoopInputType.MY_LIFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f175833a[LoopInputType.GAME_CP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static {
        f175819m = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s#/tagEditing");
        f175820n = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1#/personalityIntroduction?ownresult=false&mbti=";
        f175821o = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1&from=%s";
        f175822p = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1#/";
        f175823q = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1&uid=$#/all";
        f175824r = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/certification-benefits/index.html?speed=true&_bid=1005355&hideNavigationBar=1&hideNotch=1&likedByLimit=%s&from=%s&receiveLikeNum=%s#/";
        f175825s = null;
    }

    public tr90(Act act, @Nullable VText vText) {
        boolean zM212799r = xra.m212799r();
        this.f175829d = zM212799r;
        this.f175830e = zM212799r;
        this.f175827b = act;
        this.f175828c = vText;
    }

    /* JADX INFO: renamed from: A */
    public static void m192410A(Act act, String str) {
        m192411B(act, str, null);
    }

    /* JADX INFO: renamed from: B */
    public static void m192411B(Act act, String str, final Runnable runnable) {
        act.startActivityForResult(MkWebViewAct.m81422e2(act, "", String.format(f175824r, Integer.valueOf(gta.m132210e().m132214d().mo34955y6()), str, Integer.valueOf(CoreModule.f18264c.f20405m0.m32128m6())), true, true, true, null), new C4468a.a() { // from class: l.or90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return tr90.m192418e(runnable, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m192412D(@NonNull final Act act, @NonNull User user, final Runnable runnable, final Runnable runnable2) {
        if (w20.m204491f(act)) {
            final User userSubtract = user.mo225055clone().subtract(CoreModule.f18264c.f20381e0.m116600p9());
            if (userSubtract == null && NullChecker.m82486a(runnable)) {
                runnable.run();
            }
            ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
            profileEditInfoNew_.user = user;
            act.progress(R$string.f28619R0);
            act.duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.pr90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tr90.m192414a((Throwable) obj);
                }
            }).flatMap(new qcj() { // from class: l.qr90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tr90.m192415b(userSubtract, (ProfileEditInfo) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.rr90
                @Override // p153l.y20
                public final void call(Object obj) {
                    tr90.m192421h(act, runnable, (uxj0) obj);
                }
            }, new y20() { // from class: l.sr90
                @Override // p153l.y20
                public final void call(Object obj) {
                    tr90.m192416c(act, runnable2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m192413E(int i) {
        if (i > 10000) {
            return (i / 10000) + "w";
        }
        if (i <= 1000) {
            return String.valueOf(i);
        }
        return (i / 1000) + "k";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ProfileEditInfo m192414a(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22421c m192415b(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116620u9(user);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m192416c(Act act, Runnable runnable, Throwable th) {
        if (w20.m204491f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (th instanceof ProfileEditInfoException) {
            if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act.pageId())) {
                o1j0.m165649w(R$string.f28771s);
            } else {
                r1j0.m179419f(R$string.f28654Y0);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m192418e(Runnable runnable, int i, int i2, Intent intent) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (!CoreModule.m30933P().m143405a().mo34409Sk()) {
            return false;
        }
        CoreModule.f18264c.f20294B0.m32622r4("question");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m192419f(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        CoreModule.m30932N().mo61489Pf(act, user, CoreModule.m30932N().mo61472Kk(user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m192420g(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        CoreModule.m30932N().mo61489Pf(act, user, CoreModule.m30932N().mo61472Kk(user));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m192421h(Act act, Runnable runnable, uxj0 uxj0Var) {
        if (w20.m204491f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m192423j(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(m192425l(act, user.isFemale() ? "她" : "他")).m191160s(act.getString(R$string.f28574I0)).m191159r(act.getString(R$string.f28623S)).m191156o(new View.OnClickListener() { // from class: l.nr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tr90.m192420g(runnable, act, user, view);
            }
        }).m191146e(R$string.f28663a);
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: k */
    public static void m192424k(Act act) {
        if (CoreModule.m30930K().me_().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
        } else if (CoreModule.f18264c.f20381e0.m116555e8()) {
            ey0.m123126h(act);
        } else if (CoreModule.m30930K().me_().isAudit()) {
            ey0.m123124f(act);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m192425l(Act act, String str) {
        if (!CoreModule.m30930K().mo31745a().mo192242F()) {
            return act.getString(R$string.f28579J0);
        }
        return "拉黑后，" + str + "不能对你发送消息、打招呼、资料留言、点赞、评论，同时系统将不再为你推荐该用户。你可在“设置-隐私和通知-黑名单”内解除拉黑。";
    }

    /* JADX INFO: renamed from: m */
    public static String m192426m(LoopInputType loopInputType) {
        ProfileCountInfo profileCountInfo;
        List<ProfileCountInfo> listM222761e = CoreModule.f18264c.f20381e0.f89197b7.m222761e();
        final String strM192428o = m192428o(loopInputType);
        return (jyb.m147479J(listM222761e) || TextUtils.isEmpty(strM192428o) || (profileCountInfo = (ProfileCountInfo) jyb.m147529r(listM222761e, new qcj() { // from class: l.mr90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileCountInfo) obj).profile.equals(strM192428o));
            }
        })) == null) ? "" : m192413E(profileCountInfo.count);
    }

    /* JADX INFO: renamed from: n */
    public static LoopInputType m192427n(String str) {
        if (str.equals("fitness")) {
            return LoopInputType.FITNESS;
        }
        if (str.equals(ProfileLikeCategoryType.car)) {
            return LoopInputType.CAR;
        }
        if (str.equals(ProfileLikeCategoryType.company)) {
            return LoopInputType.COMPANY;
        }
        if (str.equals("drink")) {
            return LoopInputType.DRINKING;
        }
        if (str.equals("education")) {
            return LoopInputType.QUALIFICATION;
        }
        if (str.equals("houseInfo")) {
            return LoopInputType.HOUSE;
        }
        if (str.equals("income")) {
            return LoopInputType.INCOME;
        }
        if (str.equals("school")) {
            return LoopInputType.SCHOOL_NEW;
        }
        if (str.equals("height")) {
            return LoopInputType.HEIGHT;
        }
        if (str.equals("smoke")) {
            return LoopInputType.SMOKING;
        }
        if (str.equals(Work.TYPE)) {
            return LoopInputType.PROFESSION;
        }
        if (str.equals("game")) {
            return LoopInputType.GAME_CP;
        }
        if (str.equals(CreditScoreTaskType.pic)) {
            return LoopInputType.MY_LIFT;
        }
        if (str.equals(ProfileLikeType.mbti)) {
            return LoopInputType.MBTI_TEST;
        }
        if (str.equals("pet")) {
            return LoopInputType.PET;
        }
        if (str.equals(SocialOperation.GAME_SIGNATURE)) {
            return LoopInputType.SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m192428o(LoopInputType loopInputType) {
        switch (C20381a.f175833a[loopInputType.ordinal()]) {
            case 1:
                return "fitness";
            case 2:
                return ProfileLikeCategoryType.car;
            case 3:
                return ProfileLikeCategoryType.company;
            case 4:
                return "drink";
            case 5:
                return "education";
            case 6:
                return "houseInfo";
            case 7:
                return "income";
            case 8:
            case 9:
                return "school";
            case 10:
                return "height";
            case 11:
                return "smoke";
            case 12:
                return Work.TYPE;
            case 13:
                return SocialOperation.GAME_SIGNATURE;
            case 14:
                return "pet";
            case 15:
                return ProfileLikeType.mbti;
            case 16:
                return CreditScoreTaskType.pic;
            case 17:
                return "game";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: q */
    public static User m192429q(String str) {
        User userMo34760Uc;
        if (TextUtils.equals(f175814h, str) || TextUtils.equals(f175818l, str)) {
            userMo34760Uc = gta.m132210e().m132214d().mo34760Uc();
        } else if (TextUtils.equals(f175815i, str)) {
            userMo34760Uc = a2i0.m95674b().m95676c();
        } else {
            userMo34760Uc = (TextUtils.equals(f175816j, str) || TextUtils.equals(str, f175817k)) ? k3x.f123778l : null;
        }
        return userMo34760Uc == null ? CoreModule.f18264c.f20381e0.m116593na().mo225055clone() : userMo34760Uc;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m192430r(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || jyb.m147479J(profileExtensionBasic.unideal) || TextUtils.isEmpty(user.profile.extensions.basic.unideal.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m192431s(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || jyb.m147479J(profileExtensionBasic.ideal)) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m192432t(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || jyb.m147479J(profileExtensionBasic.mbti) || TextUtils.isEmpty(user.profile.extensions.basic.mbti.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m192433v(String str) {
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f28732l2)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露");
    }

    /* JADX INFO: renamed from: x */
    public static String m192434x(Act act, boolean z) {
        return z ? act.getString(R$string.f28613Q) : act.getString(R$string.f28618R);
    }

    /* JADX INFO: renamed from: y */
    public static void m192435y(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(m192434x(act, user.isFemale())).m191160s(act.getString(R$string.f28608P)).m191159r(act.getString(R$string.f28623S)).m191156o(new View.OnClickListener() { // from class: l.lr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tr90.m192419f(runnable, act, user, view);
            }
        }).m191146e(R$string.f28663a);
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: C */
    public final void m192436C() {
        this.f175826a.setZ(1.0f);
        this.f175832g.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        ((SimpleDraweeView) this.f175826a.findViewById(gdc0.f103694v)).getHierarchy().m207062w(h1e0.f107453j);
        ((SimpleDraweeView) this.f175826a.findViewById(gdc0.f103694v)).getHierarchy().m207061v(pointF);
        VText vText = this.f175828c;
        if (vText != null) {
            if (this.f175830e) {
                vText.setBackgroundColor(0);
                bnl0.m105537U(this.f175828c, qa00.m175859d(13.0f));
            } else {
                int i = qa00.f156323j;
                vText.setPadding(i, qa00.m175859d(11.0f), i, qa00.m175859d(11.0f));
                this.f175828c.setBackgroundColor(this.f175827b.color(j9c0.f118868e));
                this.f175828c.setCompoundDrawablePadding(qa00.f156321h);
                VText vText2 = this.f175828c;
                int i2 = qa00.f156324k;
                bnl0.m105538V(vText2, i2);
                bnl0.m105539W(this.f175828c, i2);
                bnl0.m105537U(this.f175828c, i);
            }
        }
        this.f175826a.setOnDraggingListener(new y20() { // from class: l.kr90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128433a.m192439w((Boolean) obj);
            }
        });
        if (NullChecker.m82486a(this.f175831f)) {
            this.f175826a.setReorderCardsCallback(this.f175831f);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m192437p() {
        return this.f175832g;
    }

    /* JADX INFO: renamed from: u */
    public Pair<View, MediaReorderCards> m192438u(ViewGroup viewGroup, boolean z) {
        boolean z2 = this.f175830e;
        Act act = this.f175827b;
        if (!z2) {
            View viewInflate = act.inflater().inflate(sec0.f167595u0, viewGroup, false);
            this.f175832g = (VText) viewInflate.findViewById(gdc0.f103670b);
            if (z) {
                viewGroup.addView(viewInflate);
            }
            MediaReorderCards mediaReorderCards = (MediaReorderCards) viewInflate.findViewById(gdc0.f103650I);
            this.f175826a = mediaReorderCards;
            mediaReorderCards.setCardsCrop(true);
            m192436C();
            return new Pair<>(viewInflate, this.f175826a);
        }
        View viewInflate2 = act.inflater().inflate(sec0.f167595u0, viewGroup, false);
        this.f175832g = (VText) viewInflate2.findViewById(gdc0.f103670b);
        if (z) {
            viewGroup.addView(viewInflate2);
        }
        MediaReorderCards mediaReorderCards2 = (MediaReorderCards) viewInflate2.findViewById(gdc0.f103650I);
        this.f175826a = mediaReorderCards2;
        mediaReorderCards2.setCardsCrop(true);
        m192436C();
        viewInflate2.findViewById(gdc0.f103684l).setVisibility(8);
        viewInflate2.findViewById(gdc0.f103647F).setVisibility(8);
        return new Pair<>(viewInflate2, this.f175826a);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m192439w(Boolean bool) {
        VText vText = this.f175832g;
        boolean z = false;
        if (!xra.m212804w() && !bool.booleanValue() && !this.f175826a.m51994h(0).m51840L0()) {
            z = true;
        }
        bnl0.m105524M(vText, z);
    }

    /* JADX INFO: renamed from: z */
    public void m192440z(t4m t4mVar) {
        this.f175831f = t4mVar;
    }
}
