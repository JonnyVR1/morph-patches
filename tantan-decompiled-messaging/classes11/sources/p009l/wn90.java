package p009l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.MyTabOptV2Config;
import com.p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p1.mobile.putong.core.ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p1.mobile.putong.core.ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.TagGuidePicAct;
import com.p1.mobile.putong.core.ui.profile.VReorderCard;
import com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.c4g0;
import l.du2;
import l.e30;
import l.e51;
import l.f30;
import l.h7j;
import l.hpd0;
import l.j2e0;
import l.l0x;
import l.lqa;
import l.mkd0;
import l.osi0;
import l.pgm;
import l.qib0;
import l.rhi;
import l.roj0;
import l.sth0;
import l.t100;
import l.tpd0;
import l.upa;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.ya5;
import l.zpd0;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wn90 {

    /* JADX INFO: renamed from: u */
    public static wn90 f22200u;

    /* JADX INFO: renamed from: v */
    public static final int[] f22201v = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    /* JADX INFO: renamed from: w */
    public static final int[] f22202w = {8697535, 306771, 677704, 5580477, 861776, 890180, 4631225, 354893, 634178, 2404022, 306762, 6966718, 675154, 861510, 6116026, 742478, 879171, 2714935, 613195, 7642049, 300884, 674632, 5973436, 435536, 447557, 4905656, 177741, 612162, 2398135, 300874, 6703934, 870993, 959814, 5690554, 372046, 177732, 3749688, 601675, 8165055, 824659, 870984, 7185723, 742735, 354885, 4894137, 154957, 601410, 2921910, 693578, 8080061, 445009, 742726, 5593787, 318030, 678723, 3484600, 338764, 9082175, 955730, 436808, 7001404, 701775, 308805, 4871993, 677709, 337474, 4100917, 890185, 7711422, 354897, 617798, 5549755, 306511, 675139, 5056183, 861515, 9261759, 742482, 748103, 6909244, 613200, 301893, 4869049, 674637, 11216322, 435540, 447561, 7002685, 702033, 612166, 5543867, 300879, 412484, 3581239, 959818, 8827583, 371795, 702023, 5846716, 601680, 824901, 5065400, 870988, 894273, 2468534, 354889, 8039869, 154962, 601415, 6067642, 693582, 739907, 4937015, 709962, 9788095, 309843, 678728, 6630332, 338768, 693061, 4672185, 436812, 709953, 2415286, 308810, 6969149, 675409, 861766, 6198074, 873293, 371267, 3585335, 617803, 11841215, 306515, 675144, 7153084, 861519, 873028, 6138424, 744012, 355649, 2403766, 301898, 8014782, 674641, 697670, 5984954, 447054, 711234, 3496759, 603979, 8689601, 300883, 412488, 6726972, 959823, 436804, 4896312, 699980, 601666, 3970869, 824905, 8211133, 870993, 894277, 5614266, 354894, 683331, 4533943, 339275, 9082303, 693587, 739911, 7034171, 709967, 350789, 4873528, 678732, 338754, 3838902, 430921, 7809469, 436817, 709958, 5561018, 308814, 677699, 4532024, 861770, 9343806, 873042, 895559, 6731067, 355663, 306757, 4869817, 675148, 857409, 2986677};

    /* JADX INFO: renamed from: a */
    public User f22203a;

    /* JADX INFO: renamed from: b */
    public boolean f22204b = false;

    /* JADX INFO: renamed from: c */
    public boolean f22205c = false;

    /* JADX INFO: renamed from: d */
    public b<Integer> f22206d = b.b();

    /* JADX INFO: renamed from: e */
    public a<roj0> f22207e = a.b();

    /* JADX INFO: renamed from: f */
    public b<Integer> f22208f = b.b();

    /* JADX INFO: renamed from: g */
    public hpd0 f22209g;

    /* JADX INFO: renamed from: h */
    public tpd0 f22210h;

    /* JADX INFO: renamed from: i */
    public zpd0 f22211i;

    /* JADX INFO: renamed from: j */
    public zpd0 f22212j;

    /* JADX INFO: renamed from: k */
    public hpd0 f22213k;

    /* JADX INFO: renamed from: l */
    public tpd0 f22214l;

    /* JADX INFO: renamed from: m */
    public tpd0 f22215m;

    /* JADX INFO: renamed from: n */
    public zpd0 f22216n;

    /* JADX INFO: renamed from: o */
    public final tpd0 f22217o;

    /* JADX INFO: renamed from: p */
    public final zpd0 f22218p;

    /* JADX INFO: renamed from: q */
    public b<roj0> f22219q;

    /* JADX INFO: renamed from: r */
    public List<String> f22220r;

    /* JADX INFO: renamed from: s */
    public List<String> f22221s;

    /* JADX INFO: renamed from: t */
    public c4g0 f22222t;

    public wn90() {
        Boolean bool = Boolean.FALSE;
        this.f22209g = new hpd0("no_location_permission_dot_click", bool);
        this.f22210h = new tpd0("ui1_last_detected_media_count" + CoreModule.H().userId(), 0);
        this.f22211i = new zpd0("ui1_last_show_post_guide_tip_time" + CoreModule.H().userId(), 0L);
        this.f22212j = new zpd0("new_mine_like_click_num_" + CoreModule.H().userId(), 0L);
        this.f22213k = new hpd0("widget_dot_clicked" + CoreModule.H().userId(), bool);
        this.f22214l = new tpd0("data_integrity_progress" + CoreModule.H().userId(), -1);
        this.f22215m = new tpd0("data_integrity_start_point" + CoreModule.H().userId(), 0);
        this.f22216n = new zpd0("new_mine_like_show_num_" + CoreModule.H().userId(), 0L);
        this.f22217o = new tpd0("dating_profile_tips_show_times" + CoreModule.H().userId(), 0);
        this.f22218p = new zpd0("dating_profile_tips_last_show_time" + CoreModule.H().userId(), 0L);
        this.f22219q = b.b();
        this.f22220r = Collections.synchronizedList(new ArrayList());
        this.f22221s = new ArrayList();
        this.f22222t = null;
    }

    /* JADX INFO: renamed from: F */
    public static wn90 m24339F() {
        if (f22200u == null) {
            synchronized (wn90.class) {
                try {
                    if (f22200u == null) {
                        f22200u = new wn90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22200u;
    }

    /* JADX INFO: renamed from: J */
    public static String m24340J(int i) {
        if (i == 100) {
            return "我们通常被认为是最理想的匹配";
        }
        if (i == 90) {
            return "我们更容易建立起亲密关系";
        }
        if (i == 80) {
            return "我们在很多方面都高度契合";
        }
        if (i == 70) {
            return "我们是相似和矛盾并存的关系";
        }
        return i == 60 ? "我们有较多需要磨合的地方" : "";
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m24341Q(User user) {
        return pj90.m20479t(user);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m24342T(User user) {
        Iterator it = vwb.f0(new LoopInputType[]{LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.PROFESSION, LoopInputType.COMPANY, LoopInputType.SCHOOL_NEW, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.HANGOUTS, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE}).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (LoopFragmentFactory.K((LoopInputType) it.next(), user, "", true)) {
                i++;
            }
        }
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description) && user.description.length() >= 5 && i >= 7;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m24343U(User user) {
        int i;
        MyTabOptV2Config myTabOptV2ConfigN0 = upa.N0();
        return NullChecker.a(user) && user.isMe() && NullChecker.a(myTabOptV2ConfigN0) && myTabOptV2ConfigN0.enable && (i = myTabOptV2ConfigN0.createTimeLimit) > 0 && (((double) mqi0.m18550o()) - user.createdTime) / 1000.0d < ((double) (i * 86400)) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m24344V() {
        User userNa = CoreModule.c.e0.na();
        String userInfoForMarryStatus = userNa.getUserInfoForMarryStatus();
        if (userNa.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            osi0.g("有资料在审核中，暂不可编辑，请稍后再试");
            return true;
        }
        if (userNa.isBanedOrInactivated()) {
            osi0.g("账号已冻结");
            return true;
        }
        if (!CoreModule.c.e0.e8()) {
            return false;
        }
        osi0.g("资料功能被限制，暂无法编辑");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m24347c(f30 f30Var, Pair pair, Media media) {
        if (f30Var != null) {
            f30Var.call((String) pair.first, media);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24350f(Throwable th) {
        if (!TextUtils.isEmpty(th.getMessage())) {
            osi0.g(th.getMessage());
        }
        bvb.m12279c("", 4);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24353i(e30 e30Var, List list) {
        if (NullChecker.a(e30Var) && !vwb.J(list) && (list.get(0) instanceof Picture)) {
            e30Var.call((Picture) list.get(0));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m24354j(VReorderCard vReorderCard, Act act, Media media) {
        if (NullChecker.a(vReorderCard.c.f.j)) {
            vReorderCard.c.f.j.run();
        }
        if (act instanceof ProfileAct) {
            ((ProfileAct) act).C2().J3();
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileLoopEditPetPicFrag profileLoopEditPetPicFragZ1 = ((ProfileInfoLoopEditAct) act).Z1();
            if (profileLoopEditPetPicFragZ1 instanceof ProfileLoopEditPetPicFrag) {
                profileLoopEditPetPicFragZ1.i5(media);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: j0 */
    public static int m24355j0(User user) {
        ?? J = LoopFragmentFactory.J(LoopInputType.PROFESSION, user, "");
        int i = J;
        if (LoopFragmentFactory.J(LoopInputType.QUALIFICATION, user, "")) {
            i = J + 1;
        }
        int i2 = i;
        if (LoopFragmentFactory.J(LoopInputType.HOMETOWN, user, "")) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (LoopFragmentFactory.J(LoopInputType.FRIEND_PURPOSE, user, "")) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (LoopFragmentFactory.J(LoopInputType.HEIGHT, user, "")) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (LoopFragmentFactory.J(LoopInputType.FITNESS, user, "")) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (LoopFragmentFactory.J(LoopInputType.SMOKING, user, "")) {
            i6 = i5 + 1;
        }
        return LoopFragmentFactory.J(LoopInputType.DRINKING, user, "") ? i6 + 1 : i6;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m24358l0() {
        f22200u = null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m24361o(e30 e30Var, String str, Media media) {
        if (e30Var != null) {
            e30Var.call(media);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[DONT_INVERT] */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m24363q(Act act, int i, int i2, Intent intent) {
        ProfileAct profileAct;
        if (i2 != -1) {
            boolean z = act instanceof ProfileAct;
            if (z) {
                ProfileAct profileAct2 = (ProfileAct) act;
                if (profileAct2.C2() instanceof ProfileListFragLocalEditImpl) {
                    pj90.m20476q(pj90.f18736h).pictures = new ArrayList(pj90.m20476q(pj90.f18737i).pictures);
                    profileAct2.C2().J3();
                } else if (z) {
                    profileAct = (ProfileAct) act;
                    if (profileAct.C2() instanceof ProfileListExpandedEditFrag) {
                        pj90.m20476q(pj90.f18736h).pictures = new ArrayList(pj90.m20476q(pj90.f18737i).pictures);
                        profileAct.C2().J3();
                    }
                }
            } else if (z) {
                profileAct = (ProfileAct) act;
                if (profileAct.C2() instanceof ProfileListExpandedEditFrag) {
                    pj90.m20476q(pj90.f18736h).pictures = new ArrayList(pj90.m20476q(pj90.f18737i).pictures);
                    profileAct.C2().J3();
                }
            }
        }
        sth0.b().a();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m24364r(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m24368v(e30 e30Var, Media media) {
        if (e30Var != null) {
            e30Var.call(media);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m24369w0(Act act) {
        j2e0.m(act, Uri.parse("tantan://verification/avatar"));
    }

    /* JADX INFO: renamed from: A */
    public final VReorderCard m24370A(Act act, int i) {
        VReorderCard vReorderCardB7 = null;
        if (act instanceof ProfileAct) {
            ProfileListFragLocalEditImpl profileListFragLocalEditImplC2 = ((ProfileAct) act).C2();
            if (NullChecker.a(profileListFragLocalEditImplC2) && (profileListFragLocalEditImplC2 instanceof ProfileListFragLocalEditImpl)) {
                vReorderCardB7 = profileListFragLocalEditImplC2.b7(i);
            }
            return (NullChecker.a(profileListFragLocalEditImplC2) && (profileListFragLocalEditImplC2 instanceof ProfileListExpandedEditFrag)) ? ((ProfileListExpandedEditFrag) profileListFragLocalEditImplC2).h6(i) : vReorderCardB7;
        }
        if (act instanceof MarryEditProfileSeriesAct) {
            MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFragP0 = ((MarryEditProfileSeriesAct) act).Z1().p0();
            if (NullChecker.a(marryEditProfileBaseMvpFragP0)) {
                l0x l0xVar = marryEditProfileBaseMvpFragP0.A;
                if (l0xVar instanceof l0x) {
                    return l0xVar.e.h(i);
                }
            }
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileLoopMyLifeFrag profileLoopMyLifeFragZ1 = ((ProfileInfoLoopEditAct) act).Z1();
            if (NullChecker.a(profileLoopMyLifeFragZ1) && (profileLoopMyLifeFragZ1 instanceof ProfileLoopMyLifeFrag)) {
                return profileLoopMyLifeFragZ1.J.c.h(i);
            }
            if (profileLoopMyLifeFragZ1 instanceof ProfileLoopEditPetPicFrag) {
                return ((ProfileLoopEditPetPicFrag) profileLoopMyLifeFragZ1).J.m.h(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public int m24371B(Act act, User user) {
        return m24372C(act, user, false);
    }

    /* JADX INFO: renamed from: C */
    public int m24372C(Act act, User user, boolean z) {
        if (((Integer) this.f22214l.get()).intValue() >= 0) {
            return ((Integer) this.f22214l.get()).intValue();
        }
        if (!NullChecker.a(act) || !NullChecker.a(user)) {
            return 0;
        }
        if (upa.L3()) {
            return m24379L(user);
        }
        ProfileCompletionConfig profileCompletionConfigP = upa.p();
        if (profileCompletionConfigP.weight.picture.size() != 6) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), 6); i++) {
            fIntValue += ((Integer) profileCompletionConfigP.weight.picture.get(i)).intValue();
            sb.append("#pic->");
            sb.append(fIntValue);
        }
        if (!TextUtils.isEmpty(user.description)) {
            fIntValue += profileCompletionConfigP.weight.introduction;
            sb.append("#description->");
            sb.append(fIntValue);
        }
        if (NullChecker.a((Tag) vwb.r(user.profile.tags, new w9j() { // from class: l.an90
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigP.weight.personality;
            sb.append("#tags2->");
            sb.append(fIntValue);
        }
        if (NullChecker.a((Tag) vwb.r(user.profile.tags, new w9j() { // from class: l.ln90
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigP.weight.interest;
            sb.append("#tags3->");
            sb.append(fIntValue);
        }
        if (!vwb.J(user.profile.answers)) {
            fIntValue += profileCompletionConfigP.weight.question;
            sb.append("#answers->");
            sb.append(fIntValue);
        }
        float fM24374E = fIntValue + m24374E(user, profileCompletionConfigP.weight.information);
        sb.append("#information->");
        sb.append(fM24374E);
        float fM24373D = fM24374E + m24373D(user, profileCompletionConfigP.weight.extension);
        sb.append("#extension->");
        sb.append(fM24373D);
        if (NullChecker.a(profileCompletionConfigP)) {
            sb.append("#config=> ");
            sb.append(profileCompletionConfigP.toJson());
        }
        du2.a("[profile progress]", sb.toString());
        if (fM24373D <= 0.0f) {
            return 0;
        }
        if (fM24373D >= 100.0f) {
            return 100;
        }
        return Math.round(fM24373D);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX INFO: renamed from: D */
    public float m24373D(User user, int i) {
        float f;
        List list = user.profile.extensions.physical.height;
        if (vwb.J(list)) {
            f = 0.0f;
        } else {
            String str = (String) list.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.b.getString(R.string.Dj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        List list2 = userWealth.upperIncome;
        List list3 = userWealth.lowIncome;
        if (!vwb.J(list3) || !vwb.J(list2)) {
            String strM = h7j.M(list2, list3);
            if (!TextUtils.isEmpty(strM) && !TextUtils.equals(strM, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        List list4 = user.profile.extensions.wealth.car;
        if (!vwb.J(list4)) {
            String strN = h7j.n((String) list4.get(0));
            if (!TextUtils.isEmpty(strN) && !TextUtils.equals(strN, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        List list5 = user.profile.extensions.wealth.house;
        if (!vwb.J(list5) && (TextUtils.equals((CharSequence) list5.get(0), CoreModule.b.getString(R.string.B6)) || TextUtils.equals((CharSequence) list5.get(0), CoreModule.b.getString(R.string.Hj)))) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / 4.0f;
    }

    /* JADX INFO: renamed from: E */
    public float m24374E(User user, int i) {
        int i2;
        float f = ((TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.b.getString(R.string.Dj))) && (TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.b.getString(R.string.Dj))) && !user.profile.studies.active) ? 0.0f : 1.0f;
        Profile profile = user.profile;
        if (profile.studies.active) {
            i2 = 1;
        } else {
            if (!TextUtils.isEmpty(profile.work.company)) {
                f += 1.0f;
            }
            i2 = 2;
        }
        if (!TextUtils.isEmpty(user.profile.studies.school)) {
            f += 1.0f;
        }
        Extensions extensions = user.profile.extensions;
        boolean z = TextUtils.isEmpty(vwb.J(extensions.basic.country) ? "" : (String) extensions.basic.country.get(0)) && TextUtils.isEmpty(vwb.J(extensions.basic.province) ? "" : (String) extensions.basic.province.get(0)) && TextUtils.isEmpty(vwb.J(extensions.basic.city) ? "" : (String) extensions.basic.city.get(0));
        if (!TextUtils.isEmpty(user.profile.hometown) || !z) {
            f += 1.0f;
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            f += 1.0f;
        }
        List list = extensions.basic.qualification;
        if (!vwb.J(list)) {
            String strW = h7j.W((String) list.get(0));
            if (!TextUtils.isEmpty(strW) && !TextUtils.equals(strW, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        if (!vwb.J(user.profile.extensions.basic.friendPurpose) && !TextUtils.isEmpty((CharSequence) h7j.T(((Purpose) user.profile.extensions.basic.friendPurpose.get(0)).toString()).a)) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / (i2 + 5);
    }

    /* JADX INFO: renamed from: G */
    public long m24375G(long j) {
        return j - ((Long) this.f22212j.get()).longValue();
    }

    /* JADX INFO: renamed from: H */
    public List<String> m24376H() {
        return this.f22221s;
    }

    /* JADX INFO: renamed from: I */
    public float m24377I(User user, int i) {
        Physical physical;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (physical = extensions.physical) == null) {
            return 0.0f;
        }
        float f = (vwb.J(physical.drink) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.drink.get(0)) || TextUtils.equals(FriendPurposeHelper.DrinkType.getDes((String) user.profile.extensions.physical.drink.get(0)), CoreModule.b.getString(R.string.Dj))) ? 0.0f : 1.0f;
        if (!vwb.J(user.profile.extensions.physical.smoke) && !TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes((String) user.profile.extensions.physical.smoke.get(0)), CoreModule.b.getString(R.string.Dj))) {
            f += 1.0f;
        }
        if (!vwb.J(user.profile.extensions.physical.fitness) && !TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes((String) user.profile.extensions.physical.fitness.get(0)), CoreModule.b.getString(R.string.Dj))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX INFO: renamed from: K */
    public float m24378K(User user, int i) {
        UserWealth userWealth;
        float f;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (userWealth = extensions.wealth) == null) {
            return 0.0f;
        }
        List list = userWealth.upperIncome;
        List list2 = userWealth.lowIncome;
        if (vwb.J(list2) && vwb.J(list)) {
            f = 0.0f;
        } else {
            String strM = h7j.M(list, list2);
            if (TextUtils.isEmpty(strM) || TextUtils.equals(strM, CoreModule.b.getString(R.string.Dj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        List list3 = user.profile.extensions.wealth.car;
        if (!vwb.J(list3)) {
            String strN = h7j.n((String) list3.get(0));
            if (!TextUtils.isEmpty(strN) && !TextUtils.equals(strN, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        List list4 = user.profile.extensions.wealth.house;
        if (!vwb.J(list4) && (TextUtils.equals((CharSequence) list4.get(0), CoreModule.b.getString(R.string.B6)) || TextUtils.equals((CharSequence) list4.get(0), CoreModule.b.getString(R.string.Hj)))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: L */
    public int m24379L(User user) {
        NewProfileCompletionConfig newProfileCompletionConfigS = lqa.s();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), newProfileCompletionConfigS.weight.picture.size()); i++) {
            fIntValue += ((Integer) newProfileCompletionConfigS.weight.picture.get(i)).intValue();
        }
        float fM24380M = fIntValue + (!TextUtils.isEmpty(user.description) ? newProfileCompletionConfigS.weight.introduction : 0.0f) + (!vwb.J(user.profile.answers) ? newProfileCompletionConfigS.weight.question : 0.0f) + (m24341Q(user) ? newProfileCompletionConfigS.weight.socialPersonalityTest : 0.0f) + m24380M(user, newProfileCompletionConfigS.weight.information) + m24377I(user, newProfileCompletionConfigS.weight.livingHabit) + m24378K(user, newProfileCompletionConfigS.weight.myAssets) + (pj90.m20478s(user) ? newProfileCompletionConfigS.weight.idealType : 0.0f) + m24382O(user, newProfileCompletionConfigS.weight.others);
        if (fM24380M <= 0.0f) {
            return 0;
        }
        if (fM24380M >= 100.0f) {
            return 100;
        }
        return Math.round(fM24380M);
    }

    /* JADX INFO: renamed from: M */
    public float m24380M(User user, int i) {
        int i2;
        boolean z = false;
        float f = (vwb.J(user.profile.extensions.basic.friendPurpose) || TextUtils.isEmpty((CharSequence) h7j.T(((Purpose) user.profile.extensions.basic.friendPurpose.get(0)).toString()).a)) ? 0.0f : 1.0f;
        List list = user.profile.extensions.physical.height;
        if (!vwb.J(list)) {
            String str = (String) list.get(0);
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        boolean z2 = TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.b.getString(R.string.Dj));
        boolean z3 = TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.b.getString(R.string.Dj));
        if (!z2 || !z3 || user.profile.studies.active) {
            f += 1.0f;
        }
        Profile profile = user.profile;
        if (profile.studies.active) {
            i2 = 3;
        } else {
            if (!TextUtils.isEmpty(profile.work.company)) {
                f += 1.0f;
            }
            i2 = 4;
        }
        Extensions extensions = user.profile.extensions;
        List list2 = NullChecker.a(extensions) ? extensions.basic.qualification : null;
        if (!vwb.J(list2)) {
            String strW = h7j.W((String) list2.get(0));
            if (!TextUtils.isEmpty(strW) && !TextUtils.equals(strW, CoreModule.b.getString(R.string.Dj))) {
                f += 1.0f;
            }
        }
        if (!TextUtils.isEmpty(user.profile.studies.school)) {
            f += 1.0f;
        }
        String str2 = vwb.J(extensions.basic.country) ? "" : (String) extensions.basic.country.get(0);
        String str3 = vwb.J(extensions.basic.province) ? "" : (String) extensions.basic.province.get(0);
        String str4 = vwb.J(extensions.basic.city) ? "" : (String) extensions.basic.city.get(0);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
            z = true;
        }
        if (!TextUtils.isEmpty(user.profile.hometown) || !z) {
            f += 1.0f;
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            f += 1.0f;
        }
        int i3 = i2 + 4;
        if (f > 0.0f) {
            f = (i * f) / i3;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: N */
    public boolean m24381N() {
        return ((Boolean) this.f22209g.get()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public float m24382O(User user, int i) {
        float f = LoopFragmentFactory.J(LoopInputType.GAME_CP, user, "") ? 1.0f : 0.0f;
        if (LoopFragmentFactory.J(LoopInputType.GAME_TOGETHER, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.J(LoopInputType.GAME_VOICE, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.J(LoopInputType.GAME_LEVEL, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.J(LoopInputType.GAME_NAME, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.J(LoopInputType.PET, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.J(LoopInputType.DO_NOT_WISH, user, "")) {
            f += 1.0f;
        }
        return f == 0.0f ? f : (i * f) / 7.0f;
    }

    /* JADX INFO: renamed from: P */
    public void m24383P(final Act act, final String str, final String str2, final String str3) {
        m24401n0(act, new f30() { // from class: l.on90
            public final void call(Object obj, Object obj2) {
                this.f18181a.m24388Y(act, str, str2, str3, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: R */
    public boolean m24384R() {
        return (xma.L3() || m24386W()) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public boolean m24385S() {
        User userNa = CoreModule.c.e0.na();
        String userInfoForMarryStatus = userNa.getUserInfoForMarryStatus();
        return (userNa.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus) || userNa.isBanedOrInactivated() || CoreModule.c.e0.e8()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m24386W() {
        PicVerificationInfo picVerificationInfo = CoreModule.c.B0.q4().picVerificationInfo;
        if (NullChecker.a(picVerificationInfo)) {
            return TEnum.equals(picVerificationInfo.status, "verified") || TEnum.equals(picVerificationInfo.status, "pending");
        }
        return false;
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void m24388Y(final Act act, String str, final Media media, String str2, final String str3, String str4) {
        final User userM20476q = pj90.m20476q(str2);
        final int size = userM20476q.pictures.size();
        TagChooseMkAct.m7443v2(act, vwb.M(media), str4, new Runnable() { // from class: l.tn90
            @Override // java.lang.Runnable
            public final void run() {
                this.f20776a.m24389Z(userM20476q, str3, media, act, size);
            }
        }, null);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m24389Z(User user, String str, Media media, final Act act, int i) {
        if (user.pictures.size() < 9) {
            user.pictures.add(media);
            final VReorderCard vReorderCardM24370A = m24370A(act, i);
            if (!NullChecker.a(vReorderCardM24370A)) {
                m24411x(act, true, "from_upload_pic", str);
                return;
            } else {
                final Media mediaClone = media.clone();
                vReorderCardM24370A.r(mediaClone, new Runnable() { // from class: l.bn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        wn90.m24354j(vReorderCardM24370A, act, mediaClone);
                    }
                });
                return;
            }
        }
        if ("from_explore_upload_pic".equals(str)) {
            Media mediaClone2 = media.clone();
            if (act instanceof ProfileInfoLoopEditAct) {
                ProfileLoopEditPetPicFrag profileLoopEditPetPicFragZ1 = ((ProfileInfoLoopEditAct) act).Z1();
                if (profileLoopEditPetPicFragZ1 instanceof ProfileLoopEditPetPicFrag) {
                    profileLoopEditPetPicFragZ1.i5(mediaClone2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m24390a0(Act act, final f30 f30Var, final Pair pair, final Media media) {
        mkd0.z(this.f22222t);
        this.f22222t = null;
        bvb.m12279c("", 3);
        e51.H(act, new Runnable() { // from class: l.dn90
            @Override // java.lang.Runnable
            public final void run() {
                wn90.m24347c(f30Var, pair, media);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m24391b0(final Act act, final f30 f30Var, boolean z, final Pair pair) {
        e30<Media> e30Var = new e30() { // from class: l.vn90
            public final void call(Object obj) {
                this.f21659a.m24390a0(act, f30Var, pair, (Media) obj);
            }
        };
        if (z) {
            m24406s0((String) pair.first, e30Var);
        } else {
            e30Var.call(m24396g0((String) pair.first));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m24392c0(int i, int i2, Intent intent) {
        bvb.m12279c("", 5);
        mkd0.z(this.f22222t);
        this.f22222t = null;
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m24393d0(Runnable runnable, NewTags newTags, Act act, boolean z, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h);
        if (vwb.J(arrayList)) {
            return false;
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        Media mediaClone = ((Media) arrayList.get(0)).clone();
        ArrayList arrayList2 = new ArrayList();
        mediaClone.tags = arrayList2;
        arrayList2.add(newTags.id);
        sth0.b().c().pictures.add(mediaClone);
        m24411x(act, z, "from_tag_upload_pic", "add_photo_to_tag");
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m24394e0(Act act, String str, Media media) {
        m24411x(act, true, "from_upload_pic", str);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ boolean m24395f0(NewTags newTags, final Act act, final String str, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h);
        if (vwb.J(arrayList)) {
            return false;
        }
        Media mediaClone = ((Media) arrayList.get(0)).clone();
        ArrayList arrayList2 = new ArrayList();
        mediaClone.tags = arrayList2;
        arrayList2.add(newTags.id);
        sth0.b().c().pictures.add(mediaClone);
        m24406s0(mediaClone.url, new e30() { // from class: l.nn90
            public final void call(Object obj) {
                this.f17581a.m24394e0(act, str, (Media) obj);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final Media m24396g0(String str) {
        Picture picture = new Picture();
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        if (Uri.parse(str).isRelative()) {
            ((Media) picture).url = rhi.B(str);
        } else {
            ((Media) picture).url = str;
        }
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        ((Media) picture).mediaType = "image/jpeg";
        return picture;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m24397h0(User user) {
        return LoopFragmentFactory.J(LoopInputType.PROFESSION, user, "") && LoopFragmentFactory.J(LoopInputType.QUALIFICATION, user, "") && LoopFragmentFactory.J(LoopInputType.HOMETOWN, user, "") && LoopFragmentFactory.J(LoopInputType.FRIEND_PURPOSE, user, "") && LoopFragmentFactory.J(LoopInputType.HEIGHT, user, "") && LoopFragmentFactory.J(LoopInputType.FITNESS, user, "") && LoopFragmentFactory.J(LoopInputType.SMOKING, user, "") && LoopFragmentFactory.J(LoopInputType.DRINKING, user, "") && LoopFragmentFactory.J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.J(LoopInputType.MY_LIFT, user, "");
    }

    /* JADX INFO: renamed from: i0 */
    public void m24398i0(final Act act) {
        sth0.b().e(CoreModule.c.e0.na().clone());
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < sth0.b().c().pictures.size(); i++) {
            Media media = (Media) sth0.b().c().pictures.get(i);
            if (vwb.J(media.tags) || TextUtils.isEmpty((CharSequence) media.tags.get(0))) {
                arrayList.add(media);
            }
        }
        TagChooseMkAct.m7443v2(act, arrayList, null, new Runnable() { // from class: l.sn90
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(TagGuidePicAct.Y1(act2, true, "from_pic_match_tag", "add_tag_to_photo"));
            }
        }, null);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m24399k0(User user) {
        return (LoopFragmentFactory.J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.J(LoopInputType.MY_LIFT, user, "") && LoopFragmentFactory.J(LoopInputType.MY_QUESTION, user, "") && LoopFragmentFactory.J(LoopInputType.GAME_CP, user, "") && !vwb.J(user.profile.extensions.wealth.petImg) && LoopFragmentFactory.J(LoopInputType.MBTI_TEST, user, "")) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public void m24400m0(String str) {
        this.f22220r.remove(str);
        this.f22219q.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: n0 */
    public void m24401n0(final Act act, final f30<String, Media> f30Var, final boolean z) {
        mkd0.z(this.f22222t);
        bvb.m12279c("", 1);
        act.startActivityForResult(MediaPickerAct.m9216X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new com.p1.mobile.android.app.a.a() { // from class: l.pn90
            /* JADX INFO: renamed from: a */
            public final boolean m20515a(int i, int i2, Intent intent) {
                return this.f18794a.m24392c0(i, i2, intent);
            }
        });
        this.f22222t = bvb.m12277a().filter(new w9j() { // from class: l.qn90
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(!TextUtils.isEmpty((CharSequence) pair.first) && ((Integer) pair.second).intValue() == 2);
            }
        }).subscribe(new e30() { // from class: l.rn90
            public final void call(Object obj) {
                this.f19915a.m24391b0(act, f30Var, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m24402o0(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        this.f22214l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p0 */
    public void m24403p0(boolean z) {
        this.f22209g.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m24404q0(long j) {
        return m24375G(j) > 0;
    }

    /* JADX INFO: renamed from: r0 */
    public void m24405r0(final Act act, final boolean z, final NewTags newTags, final Runnable runnable) {
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m9216X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new com.p1.mobile.android.app.a.a() { // from class: l.jn90
            /* JADX INFO: renamed from: a */
            public final boolean m17175a(int i, int i2, Intent intent) {
                return this.f15236a.m24393d0(runnable, newTags, act, z, i, i2, intent);
            }
        });
        act.overridePendingTransition(tzb0.f20933h, 0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m24406s0(String str, final e30<Media> e30Var) {
        final Media mediaM24396g0 = m24396g0(str);
        m24412y(mediaM24396g0).flatMap(new w9j() { // from class: l.en90
            public final Object call(Object obj) {
                return ya5.L(vwb.M(mediaM24396g0), "profile", "user-profile", (Map) null, UploadSource.get("profile"));
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.fn90
            public final void call(Object obj) {
                wn90.m24353i(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.gn90
            public final void call(Object obj) {
                wn90.m24350f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m24407t0(final Act act, final NewTags newTags, final String str) {
        sth0.b().e(CoreModule.c.e0.na().clone());
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m9216X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new com.p1.mobile.android.app.a.a() { // from class: l.kn90
            /* JADX INFO: renamed from: a */
            public final boolean m17552a(int i, int i2, Intent intent) {
                return this.f15772a.m24395f0(newTags, act, str, i, i2, intent);
            }
        });
        act.overridePendingTransition(tzb0.f20933h, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m24408u0(Act act, final e30<Media> e30Var) {
        m24401n0(act, new f30() { // from class: l.un90
            public final void call(Object obj, Object obj2) {
                wn90.m24361o(e30Var, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: v0 */
    public void m24409v0(final Act act, final e30<Media> e30Var) {
        m24401n0(act, new f30() { // from class: l.cn90
            public final void call(Object obj, Object obj2) {
                Media media = (Media) obj2;
                TagChooseMkAct.m7443v2(act, vwb.M(media), null, new Runnable() { // from class: l.hn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        wn90.m24368v(e30Var, media);
                    }
                }, null);
            }
        }, true);
    }

    /* JADX INFO: renamed from: w */
    public void m24410w(String str) {
        this.f22220r.add(str);
        this.f22219q.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: x */
    public final void m24411x(final Act act, boolean z, String str, String str2) {
        if (act instanceof TagGuidePicAct) {
            ((TagGuidePicAct) act).e2();
        } else {
            act.startActivityForResult(TagGuidePicAct.Y1(act, z, str, str2), new com.p1.mobile.android.app.a.a() { // from class: l.in90
                /* JADX INFO: renamed from: a */
                public final boolean m16643a(int i, int i2, Intent intent) {
                    return wn90.m24363q(act, i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final c<roj0> m24412y(Media media) {
        return (qib0.R.c() && (media instanceof Picture)) ? qib0.R.b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.mn90
            public final Object call(Object obj) {
                return wn90.m24364r((xaj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: z */
    public void m24413z(long j) {
        if (m24404q0(j)) {
            this.f22212j.put(Long.valueOf(j));
        }
    }
}
