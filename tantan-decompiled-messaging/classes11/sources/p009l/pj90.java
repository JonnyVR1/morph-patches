package p009l;

import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.profile.R$string;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.ProfileCountInfo;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.ui.ProfileEditInfoException;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCards;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a2m;
import l.c30;
import l.e30;
import l.ftd0;
import l.j760;
import l.l0x;
import l.lqa;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.sth0;
import l.t100;
import l.tw6;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.xx0;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pj90 {

    /* JADX INFO: renamed from: h */
    public static String f18736h = "data_from_edit";

    /* JADX INFO: renamed from: i */
    public static String f18737i = "data_from_tag_instance";

    /* JADX INFO: renamed from: j */
    public static String f18738j = "data_from_marry";

    /* JADX INFO: renamed from: k */
    public static String f18739k = "data_from_pick";

    /* JADX INFO: renamed from: l */
    public static String f18740l = "data_from_explore";

    /* JADX INFO: renamed from: m */
    public static String f18741m;

    /* JADX INFO: renamed from: n */
    public static final String f18742n;

    /* JADX INFO: renamed from: o */
    public static final String f18743o;

    /* JADX INFO: renamed from: p */
    public static final String f18744p;

    /* JADX INFO: renamed from: q */
    public static final String f18745q;

    /* JADX INFO: renamed from: r */
    public static final String f18746r;

    /* JADX INFO: renamed from: s */
    public static j760<String, IdealInfo> f18747s;

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f18748a;

    /* JADX INFO: renamed from: b */
    public Act f18749b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final VText f18750c;

    /* JADX INFO: renamed from: d */
    public final boolean f18751d;

    /* JADX INFO: renamed from: e */
    public final boolean f18752e;

    /* JADX INFO: renamed from: f */
    public a2m f18753f;

    /* JADX INFO: renamed from: g */
    public VText f18754g;

    /* JADX INFO: renamed from: l.pj90$a */
    public static /* synthetic */ class C1117a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18755a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f18755a = iArr;
            try {
                iArr[LoopInputType.FITNESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18755a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18755a[LoopInputType.COMPANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18755a[LoopInputType.DRINKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18755a[LoopInputType.QUALIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18755a[LoopInputType.HOUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18755a[LoopInputType.INCOME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18755a[LoopInputType.SCHOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18755a[LoopInputType.SCHOOL_NEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18755a[LoopInputType.HEIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18755a[LoopInputType.SMOKING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18755a[LoopInputType.PROFESSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18755a[LoopInputType.SIGNATURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18755a[LoopInputType.PET.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18755a[LoopInputType.MBTI_TEST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18755a[LoopInputType.MY_LIFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18755a[LoopInputType.GAME_CP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static {
        f18741m = (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-tags/index.html?speed=true&_bid=1004745&hideNavigationBar=1&hideNotch=1&preview=true&picIdxList=%s&showAddTagBtn=false&datingTagsFrom=%s#/tagEditing");
        f18742n = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1#/personalityIntroduction?ownresult=false&mbti=";
        f18743o = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-optimization-MBTI/index.html?speed=true&_bid=1004746&hideNavigationBar=1&hideNotch=1&from=%s";
        f18744p = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1#/";
        f18745q = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating-ideal-type/index.html?speed=true&_bid=1005037&hideNavigationBar=1&hideNotch=1&uid=$#/all";
        f18746r = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/certification-benefits/index.html?speed=true&_bid=1005355&hideNavigationBar=1&hideNotch=1&likedByLimit=%s&from=%s&receiveLikeNum=%s#/";
        f18747s = null;
    }

    public pj90(Act act, @Nullable VText vText) {
        boolean zR = lqa.r();
        this.f18751d = zR;
        this.f18752e = zR;
        this.f18749b = act;
        this.f18750c = vText;
    }

    /* JADX INFO: renamed from: A */
    public static void m20457A(Act act, String str) {
        m20458B(act, str, null);
    }

    /* JADX INFO: renamed from: B */
    public static void m20458B(Act act, String str, final Runnable runnable) {
        act.startActivityForResult(MkWebViewAct.m10586d2(act, "", String.format(f18746r, Integer.valueOf(ura.e().d().y6()), str, Integer.valueOf(CoreModule.c.m0.m6())), true, true, true, null), new a.a() { // from class: l.kj90
            /* JADX INFO: renamed from: a */
            public final boolean m17542a(int i, int i2, Intent intent) {
                return pj90.m20465e(runnable, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m20459D(@NonNull final Act act, @NonNull User user, final Runnable runnable, final Runnable runnable2) {
        if (c30.f(act)) {
            final User userSubtract = user.clone().subtract(CoreModule.c.e0.p9());
            if (userSubtract == null && NullChecker.a(runnable)) {
                runnable.run();
            }
            ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
            profileEditInfoNew_.user = user;
            act.progress(R$string.f6549R0);
            act.duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.lj90
                public final Object call(Object obj) {
                    return pj90.m20461a((Throwable) obj);
                }
            }).flatMap(new w9j() { // from class: l.mj90
                public final Object call(Object obj) {
                    return pj90.m20462b(userSubtract, (ProfileEditInfo) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.nj90
                public final void call(Object obj) {
                    pj90.m20468h(act, runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.oj90
                public final void call(Object obj) {
                    pj90.m20463c(act, runnable2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m20460E(int i) {
        if (i > 10000) {
            return (i / 10000) + "w";
        }
        if (i <= 1000) {
            return String.valueOf(i);
        }
        return (i / 1000) + "k";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ProfileEditInfo m20461a(Throwable th) {
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.core.ui.ProfileEditInfoException */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ c m20462b(User user, ProfileEditInfo profileEditInfo) throws ProfileEditInfoException {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.u9(user);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20463c(Act act, Runnable runnable, Throwable th) {
        if (c30.f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (th instanceof ProfileEditInfoException) {
            if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act.pageId())) {
                lsi0.w(R$string.f6701s);
            } else {
                osi0.f(R$string.f6584Y0);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m20465e(Runnable runnable, int i, int i2, Intent intent) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (!CoreModule.P().a().Sk()) {
            return false;
        }
        CoreModule.c.B0.r4("question");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m20466f(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        CoreModule.N().Pf(act, user, CoreModule.N().Kk(user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m20467g(Runnable runnable, Act act, User user, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        CoreModule.N().Pf(act, user, CoreModule.N().Kk(user));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m20468h(Act act, Runnable runnable, roj0 roj0Var) {
        if (c30.f(act)) {
            act.progressDismiss();
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m20470j(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        xh0.a aVar = new xh0.a(act);
        aVar.j(m20472l(act, user.isFemale() ? "她" : "他")).s(act.getString(R$string.f6504I0)).r(act.getString(R$string.f6553S)).o(new View.OnClickListener() { // from class: l.jj90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pj90.m20467g(runnable, act, user, view);
            }
        }).e(R$string.f6593a);
        aVar.a().g();
    }

    /* JADX INFO: renamed from: k */
    public static void m20471k(Act act) {
        if (CoreModule.K().me_().isBanned()) {
            JailedDialogLikeAct.o2(true);
        } else if (CoreModule.c.e0.e8()) {
            xx0.h(act);
        } else if (CoreModule.K().me_().isAudit()) {
            xx0.f(act);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m20472l(Act act, String str) {
        if (!CoreModule.K().a().F()) {
            return act.getString(R$string.f6509J0);
        }
        return "拉黑后，" + str + "不能对你发送消息、打招呼、资料留言、点赞、评论，同时系统将不再为你推荐该用户。你可在“设置-隐私和通知-黑名单”内解除拉黑。";
    }

    /* JADX INFO: renamed from: m */
    public static String m20473m(LoopInputType loopInputType) {
        ProfileCountInfo profileCountInfo;
        List list = (List) CoreModule.c.e0.b7.e();
        final String strM20475o = m20475o(loopInputType);
        return (vwb.J(list) || TextUtils.isEmpty(strM20475o) || (profileCountInfo = (ProfileCountInfo) vwb.r(list, new w9j() { // from class: l.ij90
            public final Object call(Object obj) {
                return Boolean.valueOf(((ProfileCountInfo) obj).profile.equals(strM20475o));
            }
        })) == null) ? "" : m20460E(profileCountInfo.count);
    }

    /* JADX INFO: renamed from: n */
    public static LoopInputType m20474n(String str) {
        if (str.equals("fitness")) {
            return LoopInputType.FITNESS;
        }
        if (str.equals("car")) {
            return LoopInputType.CAR;
        }
        if (str.equals("company")) {
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
        if (str.equals("work")) {
            return LoopInputType.PROFESSION;
        }
        if (str.equals("game")) {
            return LoopInputType.GAME_CP;
        }
        if (str.equals("pic")) {
            return LoopInputType.MY_LIFT;
        }
        if (str.equals("mbti")) {
            return LoopInputType.MBTI_TEST;
        }
        if (str.equals("pet")) {
            return LoopInputType.PET;
        }
        if (str.equals("signature")) {
            return LoopInputType.SIGNATURE;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m20475o(LoopInputType loopInputType) {
        switch (C1117a.f18755a[loopInputType.ordinal()]) {
            case 1:
                return "fitness";
            case 2:
                return "car";
            case 3:
                return "company";
            case 4:
                return "drink";
            case 5:
                return "education";
            case 6:
                return "houseInfo";
            case 7:
                return "income";
            case 8:
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return "school";
            case 10:
                return "height";
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                return "smoke";
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                return "work";
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                return "signature";
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                return "pet";
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                return "mbti";
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                return "pic";
            case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                return "game";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: q */
    public static User m20476q(String str) {
        User userUc;
        if (TextUtils.equals(f18736h, str) || TextUtils.equals(f18740l, str)) {
            userUc = ura.e().d().Uc();
        } else if (TextUtils.equals(f18737i, str)) {
            userUc = sth0.b().c();
        } else {
            userUc = (TextUtils.equals(f18738j, str) || TextUtils.equals(str, f18739k)) ? l0x.l : null;
        }
        return userUc == null ? CoreModule.c.e0.na().clone() : userUc;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m20477r(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.J(profileExtensionBasic.unideal) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.unideal.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m20478s(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.J(profileExtensionBasic.ideal)) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m20479t(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        return (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.J(profileExtensionBasic.mbti) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.mbti.get(0))) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m20480v(String str) {
        return TextUtils.equals(str, CoreModule.b.getString(R$string.f6662l2)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露");
    }

    /* JADX INFO: renamed from: x */
    public static String m20481x(Act act, boolean z) {
        return z ? act.getString(R$string.f6543Q) : act.getString(R$string.f6548R);
    }

    /* JADX INFO: renamed from: y */
    public static void m20482y(final Act act, final User user, final Runnable runnable) {
        if (user == null) {
            return;
        }
        xh0.a aVar = new xh0.a(act);
        aVar.j(m20481x(act, user.isFemale())).s(act.getString(R$string.f6538P)).r(act.getString(R$string.f6553S)).o(new View.OnClickListener() { // from class: l.hj90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pj90.m20466f(runnable, act, user, view);
            }
        }).e(R$string.f6593a);
        aVar.a().g();
    }

    /* JADX INFO: renamed from: C */
    public final void m20483C() {
        this.f18748a.setZ(1.0f);
        this.f18754g.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        this.f18748a.findViewById(a5c0.f9306v).getHierarchy().w(ftd0.j);
        this.f18748a.findViewById(a5c0.f9306v).getHierarchy().v(pointF);
        VText vText = this.f18750c;
        if (vText != null) {
            if (this.f18752e) {
                vText.setBackgroundColor(0);
                xdl0.U(this.f18750c, t100.d(13.0f));
            } else {
                int i = t100.j;
                vText.setPadding(i, t100.d(11.0f), i, t100.d(11.0f));
                this.f18750c.setBackgroundColor(this.f18749b.color(c1c0.f10401e));
                this.f18750c.setCompoundDrawablePadding(t100.h);
                VText vText2 = this.f18750c;
                int i2 = t100.k;
                xdl0.V(vText2, i2);
                xdl0.W(this.f18750c, i2);
                xdl0.U(this.f18750c, i);
            }
        }
        this.f18748a.setOnDraggingListener(new e30() { // from class: l.gj90
            public final void call(Object obj) {
                this.f13600a.m20486w((Boolean) obj);
            }
        });
        if (NullChecker.a(this.f18753f)) {
            this.f18748a.setReorderCardsCallback(this.f18753f);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m20484p() {
        return this.f18754g;
    }

    /* JADX INFO: renamed from: u */
    public Pair<View, MediaReorderCards> m20485u(ViewGroup viewGroup, boolean z) {
        boolean z2 = this.f18752e;
        Act act = this.f18749b;
        if (!z2) {
            View viewInflate = act.inflater().inflate(n6c0.f17332u0, viewGroup, false);
            this.f18754g = viewInflate.findViewById(a5c0.f9282b);
            if (z) {
                viewGroup.addView(viewInflate);
            }
            MediaReorderCards mediaReorderCardsFindViewById = viewInflate.findViewById(a5c0.f9262I);
            this.f18748a = mediaReorderCardsFindViewById;
            mediaReorderCardsFindViewById.setCardsCrop(true);
            m20483C();
            return new Pair<>(viewInflate, this.f18748a);
        }
        View viewInflate2 = act.inflater().inflate(n6c0.f17332u0, viewGroup, false);
        this.f18754g = viewInflate2.findViewById(a5c0.f9282b);
        if (z) {
            viewGroup.addView(viewInflate2);
        }
        MediaReorderCards mediaReorderCardsFindViewById2 = viewInflate2.findViewById(a5c0.f9262I);
        this.f18748a = mediaReorderCardsFindViewById2;
        mediaReorderCardsFindViewById2.setCardsCrop(true);
        m20483C();
        viewInflate2.findViewById(a5c0.f9296l).setVisibility(8);
        viewInflate2.findViewById(a5c0.f9259F).setVisibility(8);
        return new Pair<>(viewInflate2, this.f18748a);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m20486w(Boolean bool) {
        VText vText = this.f18754g;
        boolean z = false;
        if (!lqa.w() && !bool.booleanValue() && !this.f18748a.h(0).L0()) {
            z = true;
        }
        xdl0.M(vText, z);
    }

    /* JADX INFO: renamed from: z */
    public void m20487z(a2m a2mVar) {
        this.f18753f = a2mVar;
    }
}
