package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.MyTabOptV2Config;
import com.p046p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class wn90 {

    /* JADX INFO: renamed from: u */
    public static wn90 f187266u;

    /* JADX INFO: renamed from: v */
    public static final int[] f187267v = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, HttpStatus.NOT_MODIFIED_304, 334, 365};

    /* JADX INFO: renamed from: w */
    public static final int[] f187268w = {8697535, 306771, 677704, 5580477, 861776, 890180, 4631225, 354893, 634178, 2404022, 306762, 6966718, 675154, 861510, 6116026, 742478, 879171, 2714935, 613195, 7642049, 300884, 674632, 5973436, 435536, 447557, 4905656, 177741, 612162, 2398135, 300874, 6703934, 870993, 959814, 5690554, 372046, 177732, 3749688, 601675, 8165055, 824659, 870984, 7185723, 742735, 354885, 4894137, 154957, 601410, 2921910, 693578, 8080061, 445009, 742726, 5593787, 318030, 678723, 3484600, 338764, 9082175, 955730, 436808, 7001404, 701775, 308805, 4871993, 677709, 337474, 4100917, 890185, 7711422, 354897, 617798, 5549755, 306511, 675139, 5056183, 861515, 9261759, 742482, 748103, 6909244, 613200, 301893, 4869049, 674637, 11216322, 435540, 447561, 7002685, 702033, 612166, 5543867, 300879, 412484, 3581239, 959818, 8827583, 371795, 702023, 5846716, 601680, 824901, 5065400, 870988, 894273, 2468534, 354889, 8039869, 154962, 601415, 6067642, 693582, 739907, 4937015, 709962, 9788095, 309843, 678728, 6630332, 338768, 693061, 4672185, 436812, 709953, 2415286, 308810, 6969149, 675409, 861766, 6198074, 873293, 371267, 3585335, 617803, 11841215, 306515, 675144, 7153084, 861519, 873028, 6138424, 744012, 355649, 2403766, 301898, 8014782, 674641, 697670, 5984954, 447054, 711234, 3496759, 603979, 8689601, 300883, 412488, 6726972, 959823, 436804, 4896312, 699980, 601666, 3970869, 824905, 8211133, 870993, 894277, 5614266, 354894, 683331, 4533943, 339275, 9082303, 693587, 739911, 7034171, 709967, 350789, 4873528, 678732, 338754, 3838902, 430921, 7809469, 436817, 709958, 5561018, 308814, 677699, 4532024, 861770, 9343806, 873042, 895559, 6731067, 355663, 306757, 4869817, 675148, 857409, 2986677};

    /* JADX INFO: renamed from: a */
    public User f187269a;

    /* JADX INFO: renamed from: b */
    public boolean f187270b = false;

    /* JADX INFO: renamed from: c */
    public boolean f187271c = false;

    /* JADX INFO: renamed from: d */
    public C22393b<Integer> f187272d = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public C22392a<roj0> f187273e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public C22393b<Integer> f187274f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public hpd0 f187275g;

    /* JADX INFO: renamed from: h */
    public tpd0 f187276h;

    /* JADX INFO: renamed from: i */
    public zpd0 f187277i;

    /* JADX INFO: renamed from: j */
    public zpd0 f187278j;

    /* JADX INFO: renamed from: k */
    public hpd0 f187279k;

    /* JADX INFO: renamed from: l */
    public tpd0 f187280l;

    /* JADX INFO: renamed from: m */
    public tpd0 f187281m;

    /* JADX INFO: renamed from: n */
    public zpd0 f187282n;

    /* JADX INFO: renamed from: o */
    public final tpd0 f187283o;

    /* JADX INFO: renamed from: p */
    public final zpd0 f187284p;

    /* JADX INFO: renamed from: q */
    public C22393b<roj0> f187285q;

    /* JADX INFO: renamed from: r */
    public List<String> f187286r;

    /* JADX INFO: renamed from: s */
    public List<String> f187287s;

    /* JADX INFO: renamed from: t */
    public c4g0 f187288t;

    public wn90() {
        Boolean bool = Boolean.FALSE;
        this.f187275g = new hpd0("no_location_permission_dot_click", bool);
        this.f187276h = new tpd0("ui1_last_detected_media_count" + CoreModule.m29931H().userId(), 0);
        this.f187277i = new zpd0("ui1_last_show_post_guide_tip_time" + CoreModule.m29931H().userId(), 0L);
        this.f187278j = new zpd0("new_mine_like_click_num_" + CoreModule.m29931H().userId(), 0L);
        this.f187279k = new hpd0("widget_dot_clicked" + CoreModule.m29931H().userId(), bool);
        this.f187280l = new tpd0("data_integrity_progress" + CoreModule.m29931H().userId(), -1);
        this.f187281m = new tpd0("data_integrity_start_point" + CoreModule.m29931H().userId(), 0);
        this.f187282n = new zpd0("new_mine_like_show_num_" + CoreModule.m29931H().userId(), 0L);
        this.f187283o = new tpd0("dating_profile_tips_show_times" + CoreModule.m29931H().userId(), 0);
        this.f187284p = new zpd0("dating_profile_tips_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f187285q = C22393b.m221521b();
        this.f187286r = Collections.synchronizedList(new ArrayList());
        this.f187287s = new ArrayList();
        this.f187288t = null;
    }

    /* JADX INFO: renamed from: F */
    public static wn90 m204602F() {
        if (f187266u == null) {
            synchronized (wn90.class) {
                try {
                    if (f187266u == null) {
                        f187266u = new wn90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f187266u;
    }

    /* JADX INFO: renamed from: J */
    public static String m204603J(int i) {
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
    public static boolean m204604Q(User user) {
        return pj90.m169807t(user);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m204605T(User user) {
        Iterator it = vwb.m200324f0(LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.PROFESSION, LoopInputType.COMPANY, LoopInputType.SCHOOL_NEW, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.HANGOUTS, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (LoopFragmentFactory.m51467K((LoopInputType) it.next(), user, "", true)) {
                i++;
            }
        }
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description) && user.description.length() >= 5 && i >= 7;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m204606U(User user) {
        int i;
        MyTabOptV2Config myTabOptV2ConfigM194672N0 = upa.m194672N0();
        return NullChecker.m81303a(user) && user.isMe() && NullChecker.m81303a(myTabOptV2ConfigM194672N0) && myTabOptV2ConfigM194672N0.enable && (i = myTabOptV2ConfigM194672N0.createTimeLimit) > 0 && (((double) mqi0.m155944o()) - user.createdTime) / 1000.0d < ((double) (i * MMKV.ExpireInDay)) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m204607V() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        String userInfoForMarryStatus = userM169520na.getUserInfoForMarryStatus();
        if (userM169520na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            osi0.m165783g("有资料在审核中，暂不可编辑，请稍后再试");
            return true;
        }
        if (userM169520na.isBanedOrInactivated()) {
            osi0.m165783g("账号已冻结");
            return true;
        }
        if (!CoreModule.f17545c.f19639e0.m169482e8()) {
            return false;
        }
        osi0.m165783g("资料功能被限制，暂无法编辑");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m204610c(f30 f30Var, Pair pair, Media media) {
        if (f30Var != null) {
            f30Var.call((String) pair.first, media);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m204613f(Throwable th) {
        if (!TextUtils.isEmpty(th.getMessage())) {
            osi0.m165783g(th.getMessage());
        }
        bvb.m104013c("", 4);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m204616i(e30 e30Var, List list) {
        if (NullChecker.m81303a(e30Var) && !vwb.m200296J(list) && (list.get(0) instanceof Picture)) {
            e30Var.call((Picture) list.get(0));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m204617j(VReorderCard vReorderCard, Act act, Media media) {
        if (NullChecker.m81303a(vReorderCard.f33046c.f87435f.f33077j)) {
            vReorderCard.f33046c.f87435f.f33077j.run();
        }
        if (act instanceof ProfileAct) {
            ((ProfileListFragLocalEditImpl) ((ProfileAct) act).m50748C2()).mo51067J3();
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFragM51508Z1 = ((ProfileInfoLoopEditAct) act).m51508Z1();
            if (profileEditLoopBaseFragM51508Z1 instanceof ProfileLoopEditPetPicFrag) {
                ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM51508Z1).m51648i5(media);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: j0 */
    public static int m204618j0(User user) {
        ?? M51466J = LoopFragmentFactory.m51466J(LoopInputType.PROFESSION, user, "");
        int i = M51466J;
        if (LoopFragmentFactory.m51466J(LoopInputType.QUALIFICATION, user, "")) {
            i = M51466J + 1;
        }
        int i2 = i;
        if (LoopFragmentFactory.m51466J(LoopInputType.HOMETOWN, user, "")) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (LoopFragmentFactory.m51466J(LoopInputType.FRIEND_PURPOSE, user, "")) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (LoopFragmentFactory.m51466J(LoopInputType.HEIGHT, user, "")) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (LoopFragmentFactory.m51466J(LoopInputType.FITNESS, user, "")) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (LoopFragmentFactory.m51466J(LoopInputType.SMOKING, user, "")) {
            i6 = i5 + 1;
        }
        return LoopFragmentFactory.m51466J(LoopInputType.DRINKING, user, "") ? i6 + 1 : i6;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m204621l0() {
        f187266u = null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m204624o(e30 e30Var, String str, Media media) {
        if (e30Var != null) {
            e30Var.call(media);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[DONT_INVERT] */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m204626q(Act act, int i, int i2, Intent intent) {
        ProfileAct profileAct;
        if (i2 != -1) {
            boolean z = act instanceof ProfileAct;
            if (z) {
                ProfileAct profileAct2 = (ProfileAct) act;
                if (profileAct2.m50748C2() instanceof ProfileListFragLocalEditImpl) {
                    pj90.m169804q(pj90.f149720h).pictures = new ArrayList(pj90.m169804q(pj90.f149721i).pictures);
                    ((ProfileListFragLocalEditImpl) profileAct2.m50748C2()).mo51067J3();
                } else if (z) {
                    profileAct = (ProfileAct) act;
                    if (profileAct.m50748C2() instanceof ProfileListExpandedEditFrag) {
                        pj90.m169804q(pj90.f149720h).pictures = new ArrayList(pj90.m169804q(pj90.f149721i).pictures);
                        ((ProfileListExpandedEditFrag) profileAct.m50748C2()).mo51067J3();
                    }
                }
            } else if (z) {
                profileAct = (ProfileAct) act;
                if (profileAct.m50748C2() instanceof ProfileListExpandedEditFrag) {
                    pj90.m169804q(pj90.f149720h).pictures = new ArrayList(pj90.m169804q(pj90.f149721i).pictures);
                    ((ProfileListExpandedEditFrag) profileAct.m50748C2()).mo51067J3();
                }
            }
        }
        sth0.m185950b().m185951a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m204627r(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m204631v(e30 e30Var, Media media) {
        if (e30Var != null) {
            e30Var.call(media);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m204632w0(Act act) {
        j2e0.m139446m(act, Uri.parse("tantan://verification/avatar"));
    }

    /* JADX INFO: renamed from: A */
    public final VReorderCard m204633A(Act act, int i) {
        VReorderCard vReorderCardM52610b7 = null;
        if (act instanceof ProfileAct) {
            PutongFrag putongFragM50748C2 = ((ProfileAct) act).m50748C2();
            if (NullChecker.m81303a(putongFragM50748C2) && (putongFragM50748C2 instanceof ProfileListFragLocalEditImpl)) {
                vReorderCardM52610b7 = ((ProfileListFragLocalEditImpl) putongFragM50748C2).m52610b7(i);
            }
            return (NullChecker.m81303a(putongFragM50748C2) && (putongFragM50748C2 instanceof ProfileListExpandedEditFrag)) ? ((ProfileListExpandedEditFrag) putongFragM50748C2).m51109h6(i) : vReorderCardM52610b7;
        }
        if (act instanceof MarryEditProfileSeriesAct) {
            MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFragM220975p0 = ((MarryEditProfileSeriesAct) act).m47453Z1().m220975p0();
            if (NullChecker.m81303a(marryEditProfileBaseMvpFragM220975p0)) {
                VV vv = marryEditProfileBaseMvpFragM220975p0.f30419A;
                if (vv instanceof l0x) {
                    return ((l0x) vv).f125584e.m50811h(i);
                }
            }
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFragM51508Z1 = ((ProfileInfoLoopEditAct) act).m51508Z1();
            if (NullChecker.m81303a(profileEditLoopBaseFragM51508Z1) && (profileEditLoopBaseFragM51508Z1 instanceof ProfileLoopMyLifeFrag)) {
                return ((ProfileLoopMyLifeFrag) profileEditLoopBaseFragM51508Z1).f33518J.f193085c.m50811h(i);
            }
            if (profileEditLoopBaseFragM51508Z1 instanceof ProfileLoopEditPetPicFrag) {
                return ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM51508Z1).f33508J.f138718m.m50811h(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public int m204634B(Act act, User user) {
        return m204635C(act, user, false);
    }

    /* JADX INFO: renamed from: C */
    public int m204635C(Act act, User user, boolean z) {
        if (this.f187280l.get().intValue() >= 0) {
            return this.f187280l.get().intValue();
        }
        if (!NullChecker.m81303a(act) || !NullChecker.m81303a(user)) {
            return 0;
        }
        if (upa.m194665L3()) {
            return m204642L(user);
        }
        ProfileCompletionConfig profileCompletionConfigM194797p = upa.m194797p();
        if (profileCompletionConfigM194797p.weight.picture.size() != 6) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), 6); i++) {
            fIntValue += profileCompletionConfigM194797p.weight.picture.get(i).intValue();
            sb.append("#pic->");
            sb.append(fIntValue);
        }
        if (!TextUtils.isEmpty(user.description)) {
            fIntValue += profileCompletionConfigM194797p.weight.introduction;
            sb.append("#description->");
            sb.append(fIntValue);
        }
        if (NullChecker.m81303a((Tag) vwb.m200346r(user.profile.tags, new w9j() { // from class: l.an90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigM194797p.weight.personality;
            sb.append("#tags2->");
            sb.append(fIntValue);
        }
        if (NullChecker.m81303a((Tag) vwb.m200346r(user.profile.tags, new w9j() { // from class: l.ln90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigM194797p.weight.interest;
            sb.append("#tags3->");
            sb.append(fIntValue);
        }
        if (!vwb.m200296J(user.profile.answers)) {
            fIntValue += profileCompletionConfigM194797p.weight.question;
            sb.append("#answers->");
            sb.append(fIntValue);
        }
        float fM204637E = fIntValue + m204637E(user, profileCompletionConfigM194797p.weight.information);
        sb.append("#information->");
        sb.append(fM204637E);
        float fM204636D = fM204637E + m204636D(user, profileCompletionConfigM194797p.weight.extension);
        sb.append("#extension->");
        sb.append(fM204636D);
        if (NullChecker.m81303a(profileCompletionConfigM194797p)) {
            sb.append("#config=> ");
            sb.append(profileCompletionConfigM194797p.toJson());
        }
        du2.m113670a("[profile progress]", sb.toString());
        if (fM204636D <= 0.0f) {
            return 0;
        }
        if (fM204636D >= 100.0f) {
            return 100;
        }
        return Math.round(fM204636D);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX INFO: renamed from: D */
    public float m204636D(User user, int i) {
        float f;
        List<String> list = user.profile.extensions.physical.height;
        if (vwb.m200296J(list)) {
            f = 0.0f;
        } else {
            String str = list.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        List<String> list2 = userWealth.upperIncome;
        List<String> list3 = userWealth.lowIncome;
        if (!vwb.m200296J(list3) || !vwb.m200296J(list2)) {
            String strM129701M = h7j.m129701M(list2, list3);
            if (!TextUtils.isEmpty(strM129701M) && !TextUtils.equals(strM129701M, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        List<String> list4 = user.profile.extensions.wealth.car;
        if (!vwb.m200296J(list4)) {
            String strM129730n = h7j.m129730n(list4.get(0));
            if (!TextUtils.isEmpty(strM129730n) && !TextUtils.equals(strM129730n, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        List<String> list5 = user.profile.extensions.wealth.house;
        if (!vwb.m200296J(list5) && (TextUtils.equals(list5.get(0), CoreModule.f17544b.getString(R$string.f17603B6)) || TextUtils.equals(list5.get(0), CoreModule.f17544b.getString(R$string.f17796Hj)))) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / 4.0f;
    }

    /* JADX INFO: renamed from: E */
    public float m204637E(User user, int i) {
        int i2;
        float f = ((TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f17544b.getString(R$string.f17676Dj))) && (TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.f17544b.getString(R$string.f17676Dj))) && !user.profile.studies.active) ? 0.0f : 1.0f;
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
        boolean z = TextUtils.isEmpty(vwb.m200296J(extensions.basic.country) ? "" : extensions.basic.country.get(0)) && TextUtils.isEmpty(vwb.m200296J(extensions.basic.province) ? "" : extensions.basic.province.get(0)) && TextUtils.isEmpty(vwb.m200296J(extensions.basic.city) ? "" : extensions.basic.city.get(0));
        if (!TextUtils.isEmpty(user.profile.hometown) || !z) {
            f += 1.0f;
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            f += 1.0f;
        }
        List<String> list = extensions.basic.qualification;
        if (!vwb.m200296J(list)) {
            String strM129711W = h7j.m129711W(list.get(0));
            if (!TextUtils.isEmpty(strM129711W) && !TextUtils.equals(strM129711W, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        if (!vwb.m200296J(user.profile.extensions.basic.friendPurpose) && !TextUtils.isEmpty(h7j.m129708T(user.profile.extensions.basic.friendPurpose.get(0).toString()).f191751a)) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / (i2 + 5);
    }

    /* JADX INFO: renamed from: G */
    public long m204638G(long j) {
        return j - this.f187278j.get().longValue();
    }

    /* JADX INFO: renamed from: H */
    public List<String> m204639H() {
        return this.f187287s;
    }

    /* JADX INFO: renamed from: I */
    public float m204640I(User user, int i) {
        Physical physical;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (physical = extensions.physical) == null) {
            return 0.0f;
        }
        float f = (vwb.m200296J(physical.drink) || TextUtils.isEmpty(user.profile.extensions.physical.drink.get(0)) || TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(user.profile.extensions.physical.drink.get(0)), CoreModule.f17544b.getString(R$string.f17676Dj))) ? 0.0f : 1.0f;
        if (!vwb.m200296J(user.profile.extensions.physical.smoke) && !TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(user.profile.extensions.physical.smoke.get(0)), CoreModule.f17544b.getString(R$string.f17676Dj))) {
            f += 1.0f;
        }
        if (!vwb.m200296J(user.profile.extensions.physical.fitness) && !TextUtils.isEmpty(user.profile.extensions.physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes(user.profile.extensions.physical.fitness.get(0)), CoreModule.f17544b.getString(R$string.f17676Dj))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX INFO: renamed from: K */
    public float m204641K(User user, int i) {
        UserWealth userWealth;
        float f;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (userWealth = extensions.wealth) == null) {
            return 0.0f;
        }
        List<String> list = userWealth.upperIncome;
        List<String> list2 = userWealth.lowIncome;
        if (vwb.m200296J(list2) && vwb.m200296J(list)) {
            f = 0.0f;
        } else {
            String strM129701M = h7j.m129701M(list, list2);
            if (TextUtils.isEmpty(strM129701M) || TextUtils.equals(strM129701M, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        List<String> list3 = user.profile.extensions.wealth.car;
        if (!vwb.m200296J(list3)) {
            String strM129730n = h7j.m129730n(list3.get(0));
            if (!TextUtils.isEmpty(strM129730n) && !TextUtils.equals(strM129730n, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        List<String> list4 = user.profile.extensions.wealth.house;
        if (!vwb.m200296J(list4) && (TextUtils.equals(list4.get(0), CoreModule.f17544b.getString(R$string.f17603B6)) || TextUtils.equals(list4.get(0), CoreModule.f17544b.getString(R$string.f17796Hj)))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: L */
    public int m204642L(User user) {
        NewProfileCompletionConfig newProfileCompletionConfigM150981s = lqa.m150981s();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), newProfileCompletionConfigM150981s.weight.picture.size()); i++) {
            fIntValue += newProfileCompletionConfigM150981s.weight.picture.get(i).intValue();
        }
        float fM204643M = fIntValue + (!TextUtils.isEmpty(user.description) ? newProfileCompletionConfigM150981s.weight.introduction : 0.0f) + (!vwb.m200296J(user.profile.answers) ? newProfileCompletionConfigM150981s.weight.question : 0.0f) + (m204604Q(user) ? newProfileCompletionConfigM150981s.weight.socialPersonalityTest : 0.0f) + m204643M(user, newProfileCompletionConfigM150981s.weight.information) + m204640I(user, newProfileCompletionConfigM150981s.weight.livingHabit) + m204641K(user, newProfileCompletionConfigM150981s.weight.myAssets) + (pj90.m169806s(user) ? newProfileCompletionConfigM150981s.weight.idealType : 0.0f) + m204645O(user, newProfileCompletionConfigM150981s.weight.others);
        if (fM204643M <= 0.0f) {
            return 0;
        }
        if (fM204643M >= 100.0f) {
            return 100;
        }
        return Math.round(fM204643M);
    }

    /* JADX INFO: renamed from: M */
    public float m204643M(User user, int i) {
        int i2;
        boolean z = false;
        float f = (vwb.m200296J(user.profile.extensions.basic.friendPurpose) || TextUtils.isEmpty(h7j.m129708T(user.profile.extensions.basic.friendPurpose.get(0).toString()).f191751a)) ? 0.0f : 1.0f;
        List<String> list = user.profile.extensions.physical.height;
        if (!vwb.m200296J(list)) {
            String str = list.get(0);
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        boolean z2 = TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f17544b.getString(R$string.f17676Dj));
        boolean z3 = TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.f17544b.getString(R$string.f17676Dj));
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
        List<String> list2 = NullChecker.m81303a(extensions) ? extensions.basic.qualification : null;
        if (!vwb.m200296J(list2)) {
            String strM129711W = h7j.m129711W(list2.get(0));
            if (!TextUtils.isEmpty(strM129711W) && !TextUtils.equals(strM129711W, CoreModule.f17544b.getString(R$string.f17676Dj))) {
                f += 1.0f;
            }
        }
        if (!TextUtils.isEmpty(user.profile.studies.school)) {
            f += 1.0f;
        }
        String str2 = vwb.m200296J(extensions.basic.country) ? "" : extensions.basic.country.get(0);
        String str3 = vwb.m200296J(extensions.basic.province) ? "" : extensions.basic.province.get(0);
        String str4 = vwb.m200296J(extensions.basic.city) ? "" : extensions.basic.city.get(0);
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
    public boolean m204644N() {
        return this.f187275g.get().booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public float m204645O(User user, int i) {
        float f = LoopFragmentFactory.m51466J(LoopInputType.GAME_CP, user, "") ? 1.0f : 0.0f;
        if (LoopFragmentFactory.m51466J(LoopInputType.GAME_TOGETHER, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m51466J(LoopInputType.GAME_VOICE, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m51466J(LoopInputType.GAME_LEVEL, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m51466J(LoopInputType.GAME_NAME, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m51466J(LoopInputType.PET, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m51466J(LoopInputType.DO_NOT_WISH, user, "")) {
            f += 1.0f;
        }
        return f == 0.0f ? f : (i * f) / 7.0f;
    }

    /* JADX INFO: renamed from: P */
    public void m204646P(final Act act, final String str, final String str2, final String str3) {
        m204664n0(act, new f30() { // from class: l.on90
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f144751a.m204651Y(act, str, str2, str3, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: R */
    public boolean m204647R() {
        return (xma.m210047L3() || m204649W()) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public boolean m204648S() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        String userInfoForMarryStatus = userM169520na.getUserInfoForMarryStatus();
        return (userM169520na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus) || userM169520na.isBanedOrInactivated() || CoreModule.f17545c.f19639e0.m169482e8()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m204649W() {
        PicVerificationInfo picVerificationInfo = CoreModule.f17545c.f19552B0.m31618q4().picVerificationInfo;
        if (NullChecker.m81303a(picVerificationInfo)) {
            return TEnum.equals(picVerificationInfo.status, "verified") || TEnum.equals(picVerificationInfo.status, "pending");
        }
        return false;
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void m204651Y(final Act act, String str, final Media media, String str2, final String str3, String str4) {
        final User userM169804q = pj90.m169804q(str2);
        final int size = userM169804q.pictures.size();
        TagChooseMkAct.m43222v2(act, vwb.m200299M(media), str4, new Runnable() { // from class: l.tn90
            @Override // java.lang.Runnable
            public final void run() {
                this.f171218a.m204652Z(userM169804q, str3, media, act, size);
            }
        }, null);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m204652Z(User user, String str, Media media, final Act act, int i) {
        if (user.pictures.size() < 9) {
            user.pictures.add(media);
            final VReorderCard vReorderCardM204633A = m204633A(act, i);
            if (!NullChecker.m81303a(vReorderCardM204633A)) {
                m204674x(act, true, "from_upload_pic", str);
                return;
            } else {
                final Media mediaMo223809clone = media.mo223809clone();
                vReorderCardM204633A.mo50700r(mediaMo223809clone, new Runnable() { // from class: l.bn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        wn90.m204617j(vReorderCardM204633A, act, mediaMo223809clone);
                    }
                });
                return;
            }
        }
        if ("from_explore_upload_pic".equals(str)) {
            Media mediaMo223809clone2 = media.mo223809clone();
            if (act instanceof ProfileInfoLoopEditAct) {
                ProfileEditLoopBaseFrag profileEditLoopBaseFragM51508Z1 = ((ProfileInfoLoopEditAct) act).m51508Z1();
                if (profileEditLoopBaseFragM51508Z1 instanceof ProfileLoopEditPetPicFrag) {
                    ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM51508Z1).m51648i5(mediaMo223809clone2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m204653a0(Act act, final f30 f30Var, final Pair pair, final Media media) {
        mkd0.m154992z(this.f187288t);
        this.f187288t = null;
        bvb.m104013c("", 3);
        e51.m114743H(act, new Runnable() { // from class: l.dn90
            @Override // java.lang.Runnable
            public final void run() {
                wn90.m204610c(f30Var, pair, media);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m204654b0(final Act act, final f30 f30Var, boolean z, final Pair pair) {
        e30<Media> e30Var = new e30() { // from class: l.vn90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182217a.m204653a0(act, f30Var, pair, (Media) obj);
            }
        };
        if (z) {
            m204669s0((String) pair.first, e30Var);
        } else {
            e30Var.call(m204659g0((String) pair.first));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m204655c0(int i, int i2, Intent intent) {
        bvb.m104013c("", 5);
        mkd0.m154992z(this.f187288t);
        this.f187288t = null;
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m204656d0(Runnable runnable, NewTags newTags, Act act, boolean z, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(arrayList)) {
            return false;
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        Media mediaMo223809clone = ((Media) arrayList.get(0)).mo223809clone();
        ArrayList arrayList2 = new ArrayList();
        mediaMo223809clone.tags = arrayList2;
        arrayList2.add(newTags.f20457id);
        sth0.m185950b().m185952c().pictures.add(mediaMo223809clone);
        m204674x(act, z, "from_tag_upload_pic", "add_photo_to_tag");
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m204657e0(Act act, String str, Media media) {
        m204674x(act, true, "from_upload_pic", str);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ boolean m204658f0(NewTags newTags, final Act act, final String str, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(arrayList)) {
            return false;
        }
        Media mediaMo223809clone = ((Media) arrayList.get(0)).mo223809clone();
        ArrayList arrayList2 = new ArrayList();
        mediaMo223809clone.tags = arrayList2;
        arrayList2.add(newTags.f20457id);
        sth0.m185950b().m185952c().pictures.add(mediaMo223809clone);
        m204669s0(mediaMo223809clone.url, new e30() { // from class: l.nn90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139704a.m204657e0(act, str, (Media) obj);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final Media m204659g0(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        if (Uri.parse(str).isRelative()) {
            picture.url = rhi.m179355B(str);
        } else {
            picture.url = str;
        }
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        return picture;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m204660h0(User user) {
        return LoopFragmentFactory.m51466J(LoopInputType.PROFESSION, user, "") && LoopFragmentFactory.m51466J(LoopInputType.QUALIFICATION, user, "") && LoopFragmentFactory.m51466J(LoopInputType.HOMETOWN, user, "") && LoopFragmentFactory.m51466J(LoopInputType.FRIEND_PURPOSE, user, "") && LoopFragmentFactory.m51466J(LoopInputType.HEIGHT, user, "") && LoopFragmentFactory.m51466J(LoopInputType.FITNESS, user, "") && LoopFragmentFactory.m51466J(LoopInputType.SMOKING, user, "") && LoopFragmentFactory.m51466J(LoopInputType.DRINKING, user, "") && LoopFragmentFactory.m51466J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.m51466J(LoopInputType.MY_LIFT, user, "");
    }

    /* JADX INFO: renamed from: i0 */
    public void m204661i0(final Act act) {
        sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < sth0.m185950b().m185952c().pictures.size(); i++) {
            Media media = sth0.m185950b().m185952c().pictures.get(i);
            if (vwb.m200296J(media.tags) || TextUtils.isEmpty(media.tags.get(0))) {
                arrayList.add(media);
            }
        }
        TagChooseMkAct.m43222v2(act, arrayList, null, new Runnable() { // from class: l.sn90
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(TagGuidePicAct.m50772Y1(act2, true, "from_pic_match_tag", "add_tag_to_photo"));
            }
        }, null);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m204662k0(User user) {
        return (LoopFragmentFactory.m51466J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.m51466J(LoopInputType.MY_LIFT, user, "") && LoopFragmentFactory.m51466J(LoopInputType.MY_QUESTION, user, "") && LoopFragmentFactory.m51466J(LoopInputType.GAME_CP, user, "") && !vwb.m200296J(user.profile.extensions.wealth.petImg) && LoopFragmentFactory.m51466J(LoopInputType.MBTI_TEST, user, "")) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public void m204663m0(String str) {
        this.f187286r.remove(str);
        this.f187285q.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: n0 */
    public void m204664n0(final Act act, final f30<String, Media> f30Var, final boolean z) {
        mkd0.m154992z(this.f187288t);
        bvb.m104013c("", 1);
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4317a.a() { // from class: l.pn90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f150375a.m204655c0(i, i2, intent);
            }
        });
        this.f187288t = bvb.m104011a().filter(new w9j() { // from class: l.qn90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(!TextUtils.isEmpty((CharSequence) pair.first) && ((Integer) pair.second).intValue() == 2);
            }
        }).subscribe(new e30() { // from class: l.rn90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160251a.m204654b0(act, f30Var, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m204665o0(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        this.f187280l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p0 */
    public void m204666p0(boolean z) {
        this.f187275g.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m204667q0(long j) {
        return m204638G(j) > 0;
    }

    /* JADX INFO: renamed from: r0 */
    public void m204668r0(final Act act, final boolean z, final NewTags newTags, final Runnable runnable) {
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4317a.a() { // from class: l.jn90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f118840a.m204656d0(runnable, newTags, act, z, i, i2, intent);
            }
        });
        act.overridePendingTransition(tzb0.f172721h, 0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m204669s0(String str, final e30<Media> e30Var) {
        final Media mediaM204659g0 = m204659g0(str);
        m204675y(mediaM204659g0).flatMap(new w9j() { // from class: l.en90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213796L(vwb.m200299M(mediaM204659g0), "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.fn90
            @Override // p149l.e30
            public final void call(Object obj) {
                wn90.m204616i(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.gn90
            @Override // p149l.e30
            public final void call(Object obj) {
                wn90.m204613f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m204670t0(final Act act, final NewTags newTags, final String str) {
        sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4317a.a() { // from class: l.kn90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f123868a.m204658f0(newTags, act, str, i, i2, intent);
            }
        });
        act.overridePendingTransition(tzb0.f172721h, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m204671u0(Act act, final e30<Media> e30Var) {
        m204664n0(act, new f30() { // from class: l.un90
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                wn90.m204624o(e30Var, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: v0 */
    public void m204672v0(final Act act, final e30<Media> e30Var) {
        m204664n0(act, new f30() { // from class: l.cn90
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                Media media = (Media) obj2;
                TagChooseMkAct.m43222v2(act, vwb.m200299M(media), null, new Runnable() { // from class: l.hn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        wn90.m204631v(e30Var, media);
                    }
                }, null);
            }
        }, true);
    }

    /* JADX INFO: renamed from: w */
    public void m204673w(String str) {
        this.f187286r.add(str);
        this.f187285q.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: x */
    public final void m204674x(final Act act, boolean z, String str, String str2) {
        if (act instanceof TagGuidePicAct) {
            ((TagGuidePicAct) act).m50778e2();
        } else {
            act.startActivityForResult(TagGuidePicAct.m50772Y1(act, z, str, str2), new C4317a.a() { // from class: l.in90
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return wn90.m204626q(act, i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final C22306c<roj0> m204675y(Media media) {
        return (qib0.f154703R.m94727c() && (media instanceof Picture)) ? qib0.f154703R.m94726b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.mn90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wn90.m204627r((xaj0) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: z */
    public void m204676z(long j) {
        if (m204667q0(j)) {
            this.f187278j.put(Long.valueOf(j));
        }
    }
}
