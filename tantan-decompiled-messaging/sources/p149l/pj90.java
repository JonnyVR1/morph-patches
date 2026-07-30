package p149l;

import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.ProfileCountInfo;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.ProfileEditInfoException;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.List;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pj90 {

    /* JADX INFO: renamed from: h */
    public static String f149720h = "data_from_edit";

    /* JADX INFO: renamed from: i */
    public static String f149721i = "data_from_tag_instance";

    /* JADX INFO: renamed from: j */
    public static String f149722j = "data_from_marry";

    /* JADX INFO: renamed from: k */
    public static String f149723k = "data_from_pick";

    /* JADX INFO: renamed from: l */
    public static String f149724l = "data_from_explore";

    /* JADX INFO: renamed from: m */
    public static String f149725m;

    /* JADX INFO: renamed from: n */
    public static final String f149726n;

    /* JADX INFO: renamed from: o */
    public static final String f149727o;

    /* JADX INFO: renamed from: p */
    public static final String f149728p;

    /* JADX INFO: renamed from: q */
    public static final String f149729q;

    /* JADX INFO: renamed from: r */
    public static final String f149730r;

    /* JADX INFO: renamed from: s */
    public static j760<String, IdealInfo> f149731s;

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f149732a;

    /* JADX INFO: renamed from: b */
    public Act f149733b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final VText f149734c;

    /* JADX INFO: renamed from: d */
    public final boolean f149735d;

    /* JADX INFO: renamed from: e */
    public final boolean f149736e;

    /* JADX INFO: renamed from: f */
    public a2m f149737f;

    /* JADX INFO: renamed from: g */
    public VText f149738g;

    /* JADX INFO: renamed from: l.pj90$a */
    public static /* synthetic */ class C19242a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f149739a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f149739a = iArr;
            try {
                iArr[LoopInputType.FITNESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f149739a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f149739a[LoopInputType.COMPANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f149739a[LoopInputType.DRINKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f149739a[LoopInputType.QUALIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f149739a[LoopInputType.HOUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f149739a[LoopInputType.INCOME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f149739a[LoopInputType.SCHOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f149739a[LoopInputType.SCHOOL_NEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f149739a[LoopInputType.HEIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f149739a[LoopInputType.SMOKING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f149739a[LoopInputType.PROFESSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f149739a[LoopInputType.SIGNATURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f149739a[LoopInputType.PET.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f149739a[LoopInputType.MBTI_TEST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f149739a[LoopInputType.MY_LIFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f149739a[LoopInputType.GAME_CP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static {
        f149725m = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s#/tagEditing");
        f149726n = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1#/personalityIntroduction?ownresult=false&mbti=";
        f149727o = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1&from=%s";
        f149728p = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1#/";
        f149729q = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1&uid=$#/all";
        f149730r = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/certification-benefits/index.html?speed=true&_bid=1005355&hideNavigationBar=1&hideNotch=1&likedByLimit=%s&from=%s&receiveLikeNum=%s#/";
        f149731s = null;
    }

    public pj90(Act act, @Nullable VText vText) {
        boolean zM150980r = lqa.m150980r();
        this.f149735d = zM150980r;
        this.f149736e = zM150980r;
        this.f149733b = act;
        this.f149734c = vText;
    }

    /* JADX INFO: renamed from: A */
    public static void m169785A(Act act, String str) {
        m169786B(act, str, null);
    }

    /* JADX INFO: renamed from: B */
    public static void m169786B(Act act, String str, final Runnable runnable) {
        act.startActivityForResult(MkWebViewAct.m80239d2(act, "", String.format(f149730r, Integer.valueOf(ura.m195053e().m195057d().mo33952y6()), str, Integer.valueOf(CoreModule.f17545c.f19663m0.m31125m6())), true, true, true, null), new C4317a.a() { // from class: l.kj90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return pj90.m169793e(runnable, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m169787D(@NonNull final Act act, @NonNull User user, final Runnable runnable, final Runnable runnable2) {
        if (c30.m104964f(act)) {
            final User userSubtract = user.mo223809clone().subtract(CoreModule.f17545c.f19639e0.m169527p9());
            if (userSubtract == null && NullChecker.m81303a(runnable)) {
                runnable.run();
            }
            ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
            profileEditInfoNew_.user = user;
            act.progress(R$string.f27771R0);
            act.duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.lj90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return pj90.m169789a((Throwable) obj);
                }
            }).flatMap(new w9j() { // from class: l.mj90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return pj90.m169790b(userSubtract, (ProfileEditInfo) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.nj90
                @Override // p149l.e30
                public final void call(Object obj) {
                    pj90.m169796h(act, runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.oj90
                @Override // p149l.e30
                public final void call(Object obj) {
                    pj90.m169791c(act, runnable2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m169788E(int i) {
        if (i > 10000) {
            return (i / 10000) + "w";
        }
        if (i <= 1000) {
            return String.valueOf(i);
        }
        return (i / 1000) + "k";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ProfileEditInfo m169789a(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22306c m169790b(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169547u9(user);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m169791c(Act act, Runnable runnable, Throwable th) {
        if (c30.m104964f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (th instanceof ProfileEditInfoException) {
            if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act.pageId())) {
                lsi0.m151593w(R$string.f27923s);
            } else {
                osi0.m165782f(R$string.f27806Y0);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m169793e(Runnable runnable, int i, int i2, Intent intent) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (!CoreModule.m29935P().m94651a().mo33406Sk()) {
            return false;
        }
        CoreModule.f17545c.f19552B0.m31619r4("question");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m169794f(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        CoreModule.m29934N().mo60305Pf(act, user, CoreModule.m29934N().mo60288Kk(user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m169795g(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        CoreModule.m29934N().mo60305Pf(act, user, CoreModule.m29934N().mo60288Kk(user));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m169796h(Act act, Runnable runnable, roj0 roj0Var) {
        if (c30.m104964f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m169798j(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(m169800l(act, user.isFemale() ? "她" : "他")).m208740s(act.getString(R$string.f27726I0)).m208739r(act.getString(R$string.f27775S)).m208736o(new View.OnClickListener() { // from class: l.jj90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pj90.m169795g(runnable, act, user, view);
            }
        }).m208726e(R$string.f27815a);
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: k */
    public static void m169799k(Act act) {
        if (CoreModule.m29932K().me_().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
        } else if (CoreModule.f17545c.f19639e0.m169482e8()) {
            xx0.m211439h(act);
        } else if (CoreModule.m29932K().me_().isAudit()) {
            xx0.m211437f(act);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m169800l(Act act, String str) {
        if (!CoreModule.m29932K().mo30742a().mo165299F()) {
            return act.getString(R$string.f27731J0);
        }
        return "拉黑后，" + str + "不能对你发送消息、打招呼、资料留言、点赞、评论，同时系统将不再为你推荐该用户。你可在“设置-隐私和通知-黑名单”内解除拉黑。";
    }

    /* JADX INFO: renamed from: m */
    public static String m169801m(LoopInputType loopInputType) {
        ProfileCountInfo profileCountInfo;
        List<ProfileCountInfo> listM221515e = CoreModule.f17545c.f19639e0.f149340b7.m221515e();
        final String strM169803o = m169803o(loopInputType);
        return (vwb.m200296J(listM221515e) || TextUtils.isEmpty(strM169803o) || (profileCountInfo = (ProfileCountInfo) vwb.m200346r(listM221515e, new w9j() { // from class: l.ij90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileCountInfo) obj).profile.equals(strM169803o));
            }
        })) == null) ? "" : m169788E(profileCountInfo.count);
    }

    /* JADX INFO: renamed from: n */
    public static LoopInputType m169802n(String str) {
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
    public static String m169803o(LoopInputType loopInputType) {
        switch (C19242a.f149739a[loopInputType.ordinal()]) {
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
    public static User m169804q(String str) {
        User userMo33757Uc;
        if (TextUtils.equals(f149720h, str) || TextUtils.equals(f149724l, str)) {
            userMo33757Uc = ura.m195053e().m195057d().mo33757Uc();
        } else if (TextUtils.equals(f149721i, str)) {
            userMo33757Uc = sth0.m185950b().m185952c();
        } else {
            userMo33757Uc = (TextUtils.equals(f149722j, str) || TextUtils.equals(str, f149723k)) ? l0x.f125581l : null;
        }
        return userMo33757Uc == null ? CoreModule.f17545c.f19639e0.m169520na().mo223809clone() : userMo33757Uc;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m169805r(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.m200296J(profileExtensionBasic.unideal) || TextUtils.isEmpty(user.profile.extensions.basic.unideal.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m169806s(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.m200296J(profileExtensionBasic.ideal)) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m169807t(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.m200296J(profileExtensionBasic.mbti) || TextUtils.isEmpty(user.profile.extensions.basic.mbti.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m169808v(String str) {
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f27884l2)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露");
    }

    /* JADX INFO: renamed from: x */
    public static String m169809x(Act act, boolean z) {
        return z ? act.getString(R$string.f27765Q) : act.getString(R$string.f27770R);
    }

    /* JADX INFO: renamed from: y */
    public static void m169810y(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(m169809x(act, user.isFemale())).m208740s(act.getString(R$string.f27760P)).m208739r(act.getString(R$string.f27775S)).m208736o(new View.OnClickListener() { // from class: l.hj90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pj90.m169794f(runnable, act, user, view);
            }
        }).m208726e(R$string.f27815a);
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: C */
    public final void m169811C() {
        this.f149732a.setZ(1.0f);
        this.f149738g.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        ((SimpleDraweeView) this.f149732a.findViewById(a5c0.f67699v)).getHierarchy().m112076w(ftd0.f99186j);
        ((SimpleDraweeView) this.f149732a.findViewById(a5c0.f67699v)).getHierarchy().m112075v(pointF);
        VText vText = this.f149734c;
        if (vText != null) {
            if (this.f149736e) {
                vText.setBackgroundColor(0);
                xdl0.m208357U(this.f149734c, t100.m186890d(13.0f));
            } else {
                int i = t100.f167261j;
                vText.setPadding(i, t100.m186890d(11.0f), i, t100.m186890d(11.0f));
                this.f149734c.setBackgroundColor(this.f149733b.color(c1c0.f78248e));
                this.f149734c.setCompoundDrawablePadding(t100.f167259h);
                VText vText2 = this.f149734c;
                int i2 = t100.f167262k;
                xdl0.m208358V(vText2, i2);
                xdl0.m208359W(this.f149734c, i2);
                xdl0.m208357U(this.f149734c, i);
            }
        }
        this.f149732a.setOnDraggingListener(new e30() { // from class: l.gj90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103018a.m169814w((Boolean) obj);
            }
        });
        if (NullChecker.m81303a(this.f149737f)) {
            this.f149732a.setReorderCardsCallback(this.f149737f);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m169812p() {
        return this.f149738g;
    }

    /* JADX INFO: renamed from: u */
    public Pair<View, MediaReorderCards> m169813u(ViewGroup viewGroup, boolean z) {
        boolean z2 = this.f149736e;
        Act act = this.f149733b;
        if (!z2) {
            View viewInflate = act.inflater().inflate(n6c0.f137381u0, viewGroup, false);
            this.f149738g = (VText) viewInflate.findViewById(a5c0.f67675b);
            if (z) {
                viewGroup.addView(viewInflate);
            }
            MediaReorderCards mediaReorderCards = (MediaReorderCards) viewInflate.findViewById(a5c0.f67655I);
            this.f149732a = mediaReorderCards;
            mediaReorderCards.setCardsCrop(true);
            m169811C();
            return new Pair<>(viewInflate, this.f149732a);
        }
        View viewInflate2 = act.inflater().inflate(n6c0.f137381u0, viewGroup, false);
        this.f149738g = (VText) viewInflate2.findViewById(a5c0.f67675b);
        if (z) {
            viewGroup.addView(viewInflate2);
        }
        MediaReorderCards mediaReorderCards2 = (MediaReorderCards) viewInflate2.findViewById(a5c0.f67655I);
        this.f149732a = mediaReorderCards2;
        mediaReorderCards2.setCardsCrop(true);
        m169811C();
        viewInflate2.findViewById(a5c0.f67689l).setVisibility(8);
        viewInflate2.findViewById(a5c0.f67652F).setVisibility(8);
        return new Pair<>(viewInflate2, this.f149732a);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m169814w(Boolean bool) {
        VText vText = this.f149738g;
        boolean z = false;
        if (!lqa.m150985w() && !bool.booleanValue() && !this.f149732a.m50811h(0).m50657L0()) {
            z = true;
        }
        xdl0.m208344M(vText, z);
    }

    /* JADX INFO: renamed from: z */
    public void m169815z(a2m a2mVar) {
        this.f149737f = a2mVar;
    }
}
