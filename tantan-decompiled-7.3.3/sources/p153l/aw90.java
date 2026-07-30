package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.MyTabOptV2Config;
import com.p051p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class aw90 {

    /* JADX INFO: renamed from: u */
    public static aw90 f73698u;

    /* JADX INFO: renamed from: v */
    public static final int[] f73699v = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, HttpStatus.NOT_MODIFIED_304, 334, 365};

    /* JADX INFO: renamed from: w */
    public static final int[] f73700w = {8697535, 306771, 677704, 5580477, 861776, 890180, 4631225, 354893, 634178, 2404022, 306762, 6966718, 675154, 861510, 6116026, 742478, 879171, 2714935, 613195, 7642049, 300884, 674632, 5973436, 435536, 447557, 4905656, 177741, 612162, 2398135, 300874, 6703934, 870993, 959814, 5690554, 372046, 177732, 3749688, 601675, 8165055, 824659, 870984, 7185723, 742735, 354885, 4894137, 154957, 601410, 2921910, 693578, 8080061, 445009, 742726, 5593787, 318030, 678723, 3484600, 338764, 9082175, 955730, 436808, 7001404, 701775, 308805, 4871993, 677709, 337474, 4100917, 890185, 7711422, 354897, 617798, 5549755, 306511, 675139, 5056183, 861515, 9261759, 742482, 748103, 6909244, 613200, 301893, 4869049, 674637, 11216322, 435540, 447561, 7002685, 702033, 612166, 5543867, 300879, 412484, 3581239, 959818, 8827583, 371795, 702023, 5846716, 601680, 824901, 5065400, 870988, 894273, 2468534, 354889, 8039869, 154962, 601415, 6067642, 693582, 739907, 4937015, 709962, 9788095, 309843, 678728, 6630332, 338768, 693061, 4672185, 436812, 709953, 2415286, 308810, 6969149, 675409, 861766, 6198074, 873293, 371267, 3585335, 617803, 11841215, 306515, 675144, 7153084, 861519, 873028, 6138424, 744012, 355649, 2403766, 301898, 8014782, 674641, 697670, 5984954, 447054, 711234, 3496759, 603979, 8689601, 300883, 412488, 6726972, 959823, 436804, 4896312, 699980, 601666, 3970869, 824905, 8211133, 870993, 894277, 5614266, 354894, 683331, 4533943, 339275, 9082303, 693587, 739911, 7034171, 709967, 350789, 4873528, 678732, 338754, 3838902, 430921, 7809469, 436817, 709958, 5561018, 308814, 677699, 4532024, 861770, 9343806, 873042, 895559, 6731067, 355663, 306757, 4869817, 675148, 857409, 2986677};

    /* JADX INFO: renamed from: a */
    public User f73701a;

    /* JADX INFO: renamed from: b */
    public boolean f73702b = false;

    /* JADX INFO: renamed from: c */
    public boolean f73703c = false;

    /* JADX INFO: renamed from: d */
    public C22508b<Integer> f73704d = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public C22507a<uxj0> f73705e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public C22508b<Integer> f73706f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public jxd0 f73707g;

    /* JADX INFO: renamed from: h */
    public vxd0 f73708h;

    /* JADX INFO: renamed from: i */
    public byd0 f73709i;

    /* JADX INFO: renamed from: j */
    public byd0 f73710j;

    /* JADX INFO: renamed from: k */
    public jxd0 f73711k;

    /* JADX INFO: renamed from: l */
    public vxd0 f73712l;

    /* JADX INFO: renamed from: m */
    public vxd0 f73713m;

    /* JADX INFO: renamed from: n */
    public byd0 f73714n;

    /* JADX INFO: renamed from: o */
    public final vxd0 f73715o;

    /* JADX INFO: renamed from: p */
    public final byd0 f73716p;

    /* JADX INFO: renamed from: q */
    public C22508b<uxj0> f73717q;

    /* JADX INFO: renamed from: r */
    public List<String> f73718r;

    /* JADX INFO: renamed from: s */
    public List<String> f73719s;

    /* JADX INFO: renamed from: t */
    public kcg0 f73720t;

    public aw90() {
        Boolean bool = Boolean.FALSE;
        this.f73707g = new jxd0("no_location_permission_dot_click", bool);
        this.f73708h = new vxd0("ui1_last_detected_media_count" + CoreModule.m30929H().userId(), 0);
        this.f73709i = new byd0("ui1_last_show_post_guide_tip_time" + CoreModule.m30929H().userId(), 0L);
        this.f73710j = new byd0("new_mine_like_click_num_" + CoreModule.m30929H().userId(), 0L);
        this.f73711k = new jxd0("widget_dot_clicked" + CoreModule.m30929H().userId(), bool);
        this.f73712l = new vxd0("data_integrity_progress" + CoreModule.m30929H().userId(), -1);
        this.f73713m = new vxd0("data_integrity_start_point" + CoreModule.m30929H().userId(), 0);
        this.f73714n = new byd0("new_mine_like_show_num_" + CoreModule.m30929H().userId(), 0L);
        this.f73715o = new vxd0("dating_profile_tips_show_times" + CoreModule.m30929H().userId(), 0);
        this.f73716p = new byd0("dating_profile_tips_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f73717q = C22508b.m222767b();
        this.f73718r = Collections.synchronizedList(new ArrayList());
        this.f73719s = new ArrayList();
        this.f73720t = null;
    }

    /* JADX INFO: renamed from: F */
    public static aw90 m100562F() {
        if (f73698u == null) {
            synchronized (aw90.class) {
                try {
                    if (f73698u == null) {
                        f73698u = new aw90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f73698u;
    }

    /* JADX INFO: renamed from: J */
    public static String m100563J(int i) {
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
    public static boolean m100564Q(User user) {
        return tr90.m192432t(user);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m100565T(User user) {
        Iterator it = jyb.m147507f0(LoopInputType.FRIEND_PURPOSE, LoopInputType.HEIGHT, LoopInputType.PROFESSION, LoopInputType.COMPANY, LoopInputType.SCHOOL_NEW, LoopInputType.QUALIFICATION, LoopInputType.HOMETOWN, LoopInputType.HANGOUTS, LoopInputType.FITNESS, LoopInputType.DRINKING, LoopInputType.SMOKING, LoopInputType.INCOME, LoopInputType.CAR, LoopInputType.HOUSE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (LoopFragmentFactory.m52650K((LoopInputType) it.next(), user, "", true)) {
                i++;
            }
        }
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description) && user.description.length() >= 5 && i >= 7;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m100566U(User user) {
        int i;
        MyTabOptV2Config myTabOptV2ConfigM131603N0 = gra.m131603N0();
        return NullChecker.m82486a(user) && user.isMe() && NullChecker.m82486a(myTabOptV2ConfigM131603N0) && myTabOptV2ConfigM131603N0.enable && (i = myTabOptV2ConfigM131603N0.createTimeLimit) > 0 && (((double) pzi0.m174454o()) - user.createdTime) / 1000.0d < ((double) (i * MMKV.ExpireInDay)) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m100567V() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        String userInfoForMarryStatus = userM116593na.getUserInfoForMarryStatus();
        if (userM116593na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            r1j0.m179420g("有资料在审核中，暂不可编辑，请稍后再试");
            return true;
        }
        if (userM116593na.isBanedOrInactivated()) {
            r1j0.m179420g("账号已冻结");
            return true;
        }
        if (!CoreModule.f18264c.f20381e0.m116555e8()) {
            return false;
        }
        r1j0.m179420g("资料功能被限制，暂无法编辑");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100570c(z20 z20Var, Pair pair, Media media) {
        if (z20Var != null) {
            z20Var.call((String) pair.first, media);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m100573f(Throwable th) {
        if (!TextUtils.isEmpty(th.getMessage())) {
            r1j0.m179420g(th.getMessage());
        }
        pwb.m174055c("", 4);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m100576i(y20 y20Var, List list) {
        if (NullChecker.m82486a(y20Var) && !jyb.m147479J(list) && (list.get(0) instanceof Picture)) {
            y20Var.call((Picture) list.get(0));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m100577j(VReorderCard vReorderCard, Act act, Media media) {
        if (NullChecker.m82486a(vReorderCard.f33894c.f123275f.f33925j)) {
            vReorderCard.f33894c.f123275f.f33925j.run();
        }
        if (act instanceof ProfileAct) {
            ((ProfileListFragLocalEditImpl) ((ProfileAct) act).m51931D2()).mo52250J3();
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFragM52691a2 = ((ProfileInfoLoopEditAct) act).m52691a2();
            if (profileEditLoopBaseFragM52691a2 instanceof ProfileLoopEditPetPicFrag) {
                ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM52691a2).m52831i5(media);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: j0 */
    public static int m100578j0(User user) {
        ?? M52649J = LoopFragmentFactory.m52649J(LoopInputType.PROFESSION, user, "");
        int i = M52649J;
        if (LoopFragmentFactory.m52649J(LoopInputType.QUALIFICATION, user, "")) {
            i = M52649J + 1;
        }
        int i2 = i;
        if (LoopFragmentFactory.m52649J(LoopInputType.HOMETOWN, user, "")) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (LoopFragmentFactory.m52649J(LoopInputType.FRIEND_PURPOSE, user, "")) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (LoopFragmentFactory.m52649J(LoopInputType.HEIGHT, user, "")) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (LoopFragmentFactory.m52649J(LoopInputType.FITNESS, user, "")) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (LoopFragmentFactory.m52649J(LoopInputType.SMOKING, user, "")) {
            i6 = i5 + 1;
        }
        return LoopFragmentFactory.m52649J(LoopInputType.DRINKING, user, "") ? i6 + 1 : i6;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m100581l0() {
        f73698u = null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m100584o(y20 y20Var, String str, Media media) {
        if (y20Var != null) {
            y20Var.call(media);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[DONT_INVERT] */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m100586q(Act act, int i, int i2, Intent intent) {
        ProfileAct profileAct;
        if (i2 != -1) {
            boolean z = act instanceof ProfileAct;
            if (z) {
                ProfileAct profileAct2 = (ProfileAct) act;
                if (profileAct2.m51931D2() instanceof ProfileListFragLocalEditImpl) {
                    tr90.m192429q(tr90.f175814h).pictures = new ArrayList(tr90.m192429q(tr90.f175815i).pictures);
                    ((ProfileListFragLocalEditImpl) profileAct2.m51931D2()).mo52250J3();
                } else if (z) {
                    profileAct = (ProfileAct) act;
                    if (profileAct.m51931D2() instanceof ProfileListExpandedEditFrag) {
                        tr90.m192429q(tr90.f175814h).pictures = new ArrayList(tr90.m192429q(tr90.f175815i).pictures);
                        ((ProfileListExpandedEditFrag) profileAct.m51931D2()).mo52250J3();
                    }
                }
            } else if (z) {
                profileAct = (ProfileAct) act;
                if (profileAct.m51931D2() instanceof ProfileListExpandedEditFrag) {
                    tr90.m192429q(tr90.f175814h).pictures = new ArrayList(tr90.m192429q(tr90.f175815i).pictures);
                    ((ProfileListExpandedEditFrag) profileAct.m51931D2()).mo52250J3();
                }
            }
        }
        a2i0.m95674b().m95675a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ uxj0 m100587r(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m100591v(y20 y20Var, Media media) {
        if (y20Var != null) {
            y20Var.call(media);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m100592w0(Act act) {
        nae0.m162083m(act, Uri.parse("tantan://verification/avatar"));
    }

    /* JADX INFO: renamed from: A */
    public final VReorderCard m100593A(Act act, int i) {
        VReorderCard vReorderCardM53793b7 = null;
        if (act instanceof ProfileAct) {
            PutongFrag putongFragM51931D2 = ((ProfileAct) act).m51931D2();
            if (NullChecker.m82486a(putongFragM51931D2) && (putongFragM51931D2 instanceof ProfileListFragLocalEditImpl)) {
                vReorderCardM53793b7 = ((ProfileListFragLocalEditImpl) putongFragM51931D2).m53793b7(i);
            }
            return (NullChecker.m82486a(putongFragM51931D2) && (putongFragM51931D2 instanceof ProfileListExpandedEditFrag)) ? ((ProfileListExpandedEditFrag) putongFragM51931D2).m52292h6(i) : vReorderCardM53793b7;
        }
        if (act instanceof MarryEditProfileSeriesAct) {
            MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFragM213992p0 = ((MarryEditProfileSeriesAct) act).m48636a2().m213992p0();
            if (NullChecker.m82486a(marryEditProfileBaseMvpFragM213992p0)) {
                VV vv = marryEditProfileBaseMvpFragM213992p0.f31267A;
                if (vv instanceof k3x) {
                    return ((k3x) vv).f123781e.m51994h(i);
                }
            }
        } else if (act instanceof ProfileInfoLoopEditAct) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFragM52691a2 = ((ProfileInfoLoopEditAct) act).m52691a2();
            if (NullChecker.m82486a(profileEditLoopBaseFragM52691a2) && (profileEditLoopBaseFragM52691a2 instanceof ProfileLoopMyLifeFrag)) {
                return ((ProfileLoopMyLifeFrag) profileEditLoopBaseFragM52691a2).f34366J.f77995c.m51994h(i);
            }
            if (profileEditLoopBaseFragM52691a2 instanceof ProfileLoopEditPetPicFrag) {
                return ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM52691a2).f34356J.f163973m.m51994h(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public int m100594B(Act act, User user) {
        return m100595C(act, user, false);
    }

    /* JADX INFO: renamed from: C */
    public int m100595C(Act act, User user, boolean z) {
        if (this.f73712l.get().intValue() >= 0) {
            return this.f73712l.get().intValue();
        }
        if (!NullChecker.m82486a(act) || !NullChecker.m82486a(user)) {
            return 0;
        }
        if (gra.m131596L3()) {
            return m100602L(user);
        }
        ProfileCompletionConfig profileCompletionConfigM131728p = gra.m131728p();
        if (profileCompletionConfigM131728p.weight.picture.size() != 6) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), 6); i++) {
            fIntValue += profileCompletionConfigM131728p.weight.picture.get(i).intValue();
            sb.append("#pic->");
            sb.append(fIntValue);
        }
        if (!TextUtils.isEmpty(user.description)) {
            fIntValue += profileCompletionConfigM131728p.weight.introduction;
            sb.append("#description->");
            sb.append(fIntValue);
        }
        if (NullChecker.m82486a((Tag) jyb.m147529r(user.profile.tags, new qcj() { // from class: l.ev90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigM131728p.weight.personality;
            sb.append("#tags2->");
            sb.append(fIntValue);
        }
        if (NullChecker.m82486a((Tag) jyb.m147529r(user.profile.tags, new qcj() { // from class: l.pv90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
            }
        }))) {
            fIntValue += profileCompletionConfigM131728p.weight.interest;
            sb.append("#tags3->");
            sb.append(fIntValue);
        }
        if (!jyb.m147479J(user.profile.answers)) {
            fIntValue += profileCompletionConfigM131728p.weight.question;
            sb.append("#answers->");
            sb.append(fIntValue);
        }
        float fM100597E = fIntValue + m100597E(user, profileCompletionConfigM131728p.weight.information);
        sb.append("#information->");
        sb.append(fM100597E);
        float fM100596D = fM100597E + m100596D(user, profileCompletionConfigM131728p.weight.extension);
        sb.append("#extension->");
        sb.append(fM100596D);
        if (NullChecker.m82486a(profileCompletionConfigM131728p)) {
            sb.append("#config=> ");
            sb.append(profileCompletionConfigM131728p.toJson());
        }
        tu2.m192703a("[profile progress]", sb.toString());
        if (fM100596D <= 0.0f) {
            return 0;
        }
        if (fM100596D >= 100.0f) {
            return 100;
        }
        return Math.round(fM100596D);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX INFO: renamed from: D */
    public float m100596D(User user, int i) {
        float f;
        List<String> list = user.profile.extensions.physical.height;
        if (jyb.m147479J(list)) {
            f = 0.0f;
        } else {
            String str = list.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        List<String> list2 = userWealth.upperIncome;
        List<String> list3 = userWealth.lowIncome;
        if (!jyb.m147479J(list3) || !jyb.m147479J(list2)) {
            String strM103172M = baj.m103172M(list2, list3);
            if (!TextUtils.isEmpty(strM103172M) && !TextUtils.equals(strM103172M, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        List<String> list4 = user.profile.extensions.wealth.car;
        if (!jyb.m147479J(list4)) {
            String strM103201n = baj.m103201n(list4.get(0));
            if (!TextUtils.isEmpty(strM103201n) && !TextUtils.equals(strM103201n, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        List<String> list5 = user.profile.extensions.wealth.house;
        if (!jyb.m147479J(list5) && (TextUtils.equals(list5.get(0), CoreModule.f18263b.getString(R$string.f18385D6)) || TextUtils.equals(list5.get(0), CoreModule.f18263b.getString(R$string.f19190dk)))) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / 4.0f;
    }

    /* JADX INFO: renamed from: E */
    public float m100597E(User user, int i) {
        int i2;
        float f = ((TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f18263b.getString(R$string.f19066Zj))) && (TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.f18263b.getString(R$string.f19066Zj))) && !user.profile.studies.active) ? 0.0f : 1.0f;
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
        boolean z = TextUtils.isEmpty(jyb.m147479J(extensions.basic.country) ? "" : extensions.basic.country.get(0)) && TextUtils.isEmpty(jyb.m147479J(extensions.basic.province) ? "" : extensions.basic.province.get(0)) && TextUtils.isEmpty(jyb.m147479J(extensions.basic.city) ? "" : extensions.basic.city.get(0));
        if (!TextUtils.isEmpty(user.profile.hometown) || !z) {
            f += 1.0f;
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            f += 1.0f;
        }
        List<String> list = extensions.basic.qualification;
        if (!jyb.m147479J(list)) {
            String strM103182W = baj.m103182W(list.get(0));
            if (!TextUtils.isEmpty(strM103182W) && !TextUtils.equals(strM103182W, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        if (!jyb.m147479J(user.profile.extensions.basic.friendPurpose) && !TextUtils.isEmpty(baj.m103179T(user.profile.extensions.basic.friendPurpose.get(0).toString()).f77081a)) {
            f += 1.0f;
        }
        return f <= 0.0f ? f : (i * f) / (i2 + 5);
    }

    /* JADX INFO: renamed from: G */
    public long m100598G(long j) {
        return j - this.f73710j.get().longValue();
    }

    /* JADX INFO: renamed from: H */
    public List<String> m100599H() {
        return this.f73719s;
    }

    /* JADX INFO: renamed from: I */
    public float m100600I(User user, int i) {
        Physical physical;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (physical = extensions.physical) == null) {
            return 0.0f;
        }
        float f = (jyb.m147479J(physical.drink) || TextUtils.isEmpty(user.profile.extensions.physical.drink.get(0)) || TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(user.profile.extensions.physical.drink.get(0)), CoreModule.f18263b.getString(R$string.f19066Zj))) ? 0.0f : 1.0f;
        if (!jyb.m147479J(user.profile.extensions.physical.smoke) && !TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(user.profile.extensions.physical.smoke.get(0)), CoreModule.f18263b.getString(R$string.f19066Zj))) {
            f += 1.0f;
        }
        if (!jyb.m147479J(user.profile.extensions.physical.fitness) && !TextUtils.isEmpty(user.profile.extensions.physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes(user.profile.extensions.physical.fitness.get(0)), CoreModule.f18263b.getString(R$string.f19066Zj))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX INFO: renamed from: K */
    public float m100601K(User user, int i) {
        UserWealth userWealth;
        float f;
        Extensions extensions = user.profile.extensions;
        if (extensions == null || (userWealth = extensions.wealth) == null) {
            return 0.0f;
        }
        List<String> list = userWealth.upperIncome;
        List<String> list2 = userWealth.lowIncome;
        if (jyb.m147479J(list2) && jyb.m147479J(list)) {
            f = 0.0f;
        } else {
            String strM103172M = baj.m103172M(list, list2);
            if (TextUtils.isEmpty(strM103172M) || TextUtils.equals(strM103172M, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        }
        List<String> list3 = user.profile.extensions.wealth.car;
        if (!jyb.m147479J(list3)) {
            String strM103201n = baj.m103201n(list3.get(0));
            if (!TextUtils.isEmpty(strM103201n) && !TextUtils.equals(strM103201n, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        List<String> list4 = user.profile.extensions.wealth.house;
        if (!jyb.m147479J(list4) && (TextUtils.equals(list4.get(0), CoreModule.f18263b.getString(R$string.f18385D6)) || TextUtils.equals(list4.get(0), CoreModule.f18263b.getString(R$string.f19190dk)))) {
            f += 1.0f;
        }
        if (f > 0.0f) {
            f = (i * f) / 3.0f;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: L */
    public int m100602L(User user) {
        NewProfileCompletionConfig newProfileCompletionConfigM212800s = xra.m212800s();
        float fIntValue = 0.0f;
        for (int i = 0; i < Math.min(user.pictures.size(), newProfileCompletionConfigM212800s.weight.picture.size()); i++) {
            fIntValue += newProfileCompletionConfigM212800s.weight.picture.get(i).intValue();
        }
        float fM100603M = fIntValue + (!TextUtils.isEmpty(user.description) ? newProfileCompletionConfigM212800s.weight.introduction : 0.0f) + (!jyb.m147479J(user.profile.answers) ? newProfileCompletionConfigM212800s.weight.question : 0.0f) + (m100564Q(user) ? newProfileCompletionConfigM212800s.weight.socialPersonalityTest : 0.0f) + m100603M(user, newProfileCompletionConfigM212800s.weight.information) + m100600I(user, newProfileCompletionConfigM212800s.weight.livingHabit) + m100601K(user, newProfileCompletionConfigM212800s.weight.myAssets) + (tr90.m192431s(user) ? newProfileCompletionConfigM212800s.weight.idealType : 0.0f) + m100605O(user, newProfileCompletionConfigM212800s.weight.others);
        if (fM100603M <= 0.0f) {
            return 0;
        }
        if (fM100603M >= 100.0f) {
            return 100;
        }
        return Math.round(fM100603M);
    }

    /* JADX INFO: renamed from: M */
    public float m100603M(User user, int i) {
        int i2;
        boolean z = false;
        float f = (jyb.m147479J(user.profile.extensions.basic.friendPurpose) || TextUtils.isEmpty(baj.m103179T(user.profile.extensions.basic.friendPurpose.get(0).toString()).f77081a)) ? 0.0f : 1.0f;
        List<String> list = user.profile.extensions.physical.height;
        if (!jyb.m147479J(list)) {
            String str = list.get(0);
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        boolean z2 = TextUtils.isEmpty(user.profile.work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f18263b.getString(R$string.f19066Zj));
        boolean z3 = TextUtils.isEmpty(user.profile.work.department) || TextUtils.equals(user.profile.work.department, CoreModule.f18263b.getString(R$string.f19066Zj));
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
        List<String> list2 = NullChecker.m82486a(extensions) ? extensions.basic.qualification : null;
        if (!jyb.m147479J(list2)) {
            String strM103182W = baj.m103182W(list2.get(0));
            if (!TextUtils.isEmpty(strM103182W) && !TextUtils.equals(strM103182W, CoreModule.f18263b.getString(R$string.f19066Zj))) {
                f += 1.0f;
            }
        }
        if (!TextUtils.isEmpty(user.profile.studies.school)) {
            f += 1.0f;
        }
        String str2 = jyb.m147479J(extensions.basic.country) ? "" : extensions.basic.country.get(0);
        String str3 = jyb.m147479J(extensions.basic.province) ? "" : extensions.basic.province.get(0);
        String str4 = jyb.m147479J(extensions.basic.city) ? "" : extensions.basic.city.get(0);
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
    public boolean m100604N() {
        return this.f73707g.get().booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public float m100605O(User user, int i) {
        float f = LoopFragmentFactory.m52649J(LoopInputType.GAME_CP, user, "") ? 1.0f : 0.0f;
        if (LoopFragmentFactory.m52649J(LoopInputType.GAME_TOGETHER, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m52649J(LoopInputType.GAME_VOICE, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m52649J(LoopInputType.GAME_LEVEL, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m52649J(LoopInputType.GAME_NAME, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m52649J(LoopInputType.PET, user, "")) {
            f += 1.0f;
        }
        if (LoopFragmentFactory.m52649J(LoopInputType.DO_NOT_WISH, user, "")) {
            f += 1.0f;
        }
        return f == 0.0f ? f : (i * f) / 7.0f;
    }

    /* JADX INFO: renamed from: P */
    public void m100606P(final Act act, final String str, final String str2, final String str3) {
        m100624n0(act, new z20() { // from class: l.sv90
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f170817a.m100611Y(act, str, str2, str3, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: R */
    public boolean m100607R() {
        return (joa.m146361M3() || m100609W()) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public boolean m100608S() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        String userInfoForMarryStatus = userM116593na.getUserInfoForMarryStatus();
        return (userM116593na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus) || userM116593na.isBanedOrInactivated() || CoreModule.f18264c.f20381e0.m116555e8()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m100609W() {
        PicVerificationInfo picVerificationInfo = CoreModule.f18264c.f20294B0.m32621q4().picVerificationInfo;
        if (NullChecker.m82486a(picVerificationInfo)) {
            return TEnum.equals(picVerificationInfo.status, "verified") || TEnum.equals(picVerificationInfo.status, "pending");
        }
        return false;
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void m100611Y(final Act act, String str, final Media media, String str2, final String str3, String str4) {
        final User userM192429q = tr90.m192429q(str2);
        final int size = userM192429q.pictures.size();
        TagChooseMkAct.m44233w2(act, jyb.m147482M(media), str4, new Runnable() { // from class: l.xv90
            @Override // java.lang.Runnable
            public final void run() {
                this.f196364a.m100612Z(userM192429q, str3, media, act, size);
            }
        }, null);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m100612Z(User user, String str, Media media, final Act act, int i) {
        if (user.pictures.size() < 9) {
            user.pictures.add(media);
            final VReorderCard vReorderCardM100593A = m100593A(act, i);
            if (!NullChecker.m82486a(vReorderCardM100593A)) {
                m100634x(act, true, "from_upload_pic", str);
                return;
            } else {
                final Media mediaMo225055clone = media.mo225055clone();
                vReorderCardM100593A.mo51883r(mediaMo225055clone, new Runnable() { // from class: l.fv90
                    @Override // java.lang.Runnable
                    public final void run() {
                        aw90.m100577j(vReorderCardM100593A, act, mediaMo225055clone);
                    }
                });
                return;
            }
        }
        if ("from_explore_upload_pic".equals(str)) {
            Media mediaMo225055clone2 = media.mo225055clone();
            if (act instanceof ProfileInfoLoopEditAct) {
                ProfileEditLoopBaseFrag profileEditLoopBaseFragM52691a2 = ((ProfileInfoLoopEditAct) act).m52691a2();
                if (profileEditLoopBaseFragM52691a2 instanceof ProfileLoopEditPetPicFrag) {
                    ((ProfileLoopEditPetPicFrag) profileEditLoopBaseFragM52691a2).m52831i5(mediaMo225055clone2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m100613a0(Act act, final z20 z20Var, final Pair pair, final Media media) {
        psd0.m173633z(this.f73720t);
        this.f73720t = null;
        pwb.m174055c("", 3);
        l51.m152888H(act, new Runnable() { // from class: l.hv90
            @Override // java.lang.Runnable
            public final void run() {
                aw90.m100570c(z20Var, pair, media);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m100614b0(final Act act, final z20 z20Var, boolean z, final Pair pair) {
        y20<Media> y20Var = new y20() { // from class: l.zv90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206193a.m100613a0(act, z20Var, pair, (Media) obj);
            }
        };
        if (z) {
            m100629s0((String) pair.first, y20Var);
        } else {
            y20Var.call(m100619g0((String) pair.first));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m100615c0(int i, int i2, Intent intent) {
        pwb.m174055c("", 5);
        psd0.m173633z(this.f73720t);
        this.f73720t = null;
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m100616d0(Runnable runnable, NewTags newTags, Act act, boolean z, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(arrayList)) {
            return false;
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        Media mediaMo225055clone = ((Media) arrayList.get(0)).mo225055clone();
        ArrayList arrayList2 = new ArrayList();
        mediaMo225055clone.tags = arrayList2;
        arrayList2.add(newTags.f21199id);
        a2i0.m95674b().m95676c().pictures.add(mediaMo225055clone);
        m100634x(act, z, "from_tag_upload_pic", "add_photo_to_tag");
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m100617e0(Act act, String str, Media media) {
        m100634x(act, true, "from_upload_pic", str);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ boolean m100618f0(NewTags newTags, final Act act, final String str, int i, int i2, Intent intent) {
        if (intent == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(arrayList)) {
            return false;
        }
        Media mediaMo225055clone = ((Media) arrayList.get(0)).mo225055clone();
        ArrayList arrayList2 = new ArrayList();
        mediaMo225055clone.tags = arrayList2;
        arrayList2.add(newTags.f21199id);
        a2i0.m95674b().m95676c().pictures.add(mediaMo225055clone);
        m100629s0(mediaMo225055clone.url, new y20() { // from class: l.rv90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164991a.m100617e0(act, str, (Media) obj);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final Media m100619g0(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        if (Uri.parse(str).isRelative()) {
            picture.url = oki.m168011B(str);
        } else {
            picture.url = str;
        }
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        return picture;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m100620h0(User user) {
        return LoopFragmentFactory.m52649J(LoopInputType.PROFESSION, user, "") && LoopFragmentFactory.m52649J(LoopInputType.QUALIFICATION, user, "") && LoopFragmentFactory.m52649J(LoopInputType.HOMETOWN, user, "") && LoopFragmentFactory.m52649J(LoopInputType.FRIEND_PURPOSE, user, "") && LoopFragmentFactory.m52649J(LoopInputType.HEIGHT, user, "") && LoopFragmentFactory.m52649J(LoopInputType.FITNESS, user, "") && LoopFragmentFactory.m52649J(LoopInputType.SMOKING, user, "") && LoopFragmentFactory.m52649J(LoopInputType.DRINKING, user, "") && LoopFragmentFactory.m52649J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.m52649J(LoopInputType.MY_LIFT, user, "");
    }

    /* JADX INFO: renamed from: i0 */
    public void m100621i0(final Act act) {
        a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < a2i0.m95674b().m95676c().pictures.size(); i++) {
            Media media = a2i0.m95674b().m95676c().pictures.get(i);
            if (jyb.m147479J(media.tags) || TextUtils.isEmpty(media.tags.get(0))) {
                arrayList.add(media);
            }
        }
        TagChooseMkAct.m44233w2(act, arrayList, null, new Runnable() { // from class: l.wv90
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(TagGuidePicAct.m51955Z1(act2, true, "from_pic_match_tag", "add_tag_to_photo"));
            }
        }, null);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m100622k0(User user) {
        return (LoopFragmentFactory.m52649J(LoopInputType.SIGNATURE, user, "") && LoopFragmentFactory.m52649J(LoopInputType.MY_LIFT, user, "") && LoopFragmentFactory.m52649J(LoopInputType.MY_QUESTION, user, "") && LoopFragmentFactory.m52649J(LoopInputType.GAME_CP, user, "") && !jyb.m147479J(user.profile.extensions.wealth.petImg) && LoopFragmentFactory.m52649J(LoopInputType.MBTI_TEST, user, "")) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public void m100623m0(String str) {
        this.f73718r.remove(str);
        this.f73717q.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: n0 */
    public void m100624n0(final Act act, final z20<String, Media> z20Var, final boolean z) {
        psd0.m173633z(this.f73720t);
        pwb.m174055c("", 1);
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4468a.a() { // from class: l.tv90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f176248a.m100615c0(i, i2, intent);
            }
        });
        this.f73720t = pwb.m174053a().filter(new qcj() { // from class: l.uv90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(!TextUtils.isEmpty((CharSequence) pair.first) && ((Integer) pair.second).intValue() == 2);
            }
        }).subscribe(new y20() { // from class: l.vv90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185912a.m100614b0(act, z20Var, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m100625o0(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        this.f73712l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p0 */
    public void m100626p0(boolean z) {
        this.f73707g.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m100627q0(long j) {
        return m100598G(j) > 0;
    }

    /* JADX INFO: renamed from: r0 */
    public void m100628r0(final Act act, final boolean z, final NewTags newTags, final Runnable runnable) {
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4468a.a() { // from class: l.nv90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f143784a.m100616d0(runnable, newTags, act, z, i, i2, intent);
            }
        });
        act.overridePendingTransition(z7c0.f203239h, 0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m100629s0(String str, final y20<Media> y20Var) {
        final Media mediaM100619g0 = m100619g0(str);
        m100635y(mediaM100619g0).flatMap(new qcj() { // from class: l.iv90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214983L(jyb.m147482M(mediaM100619g0), "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.jv90
            @Override // p153l.y20
            public final void call(Object obj) {
                aw90.m100576i(y20Var, (List) obj);
            }
        }, new y20() { // from class: l.kv90
            @Override // p153l.y20
            public final void call(Object obj) {
                aw90.m100573f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m100630t0(final Act act, final NewTags newTags, final String str) {
        a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        if (newTags == null) {
            return;
        }
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), new C4468a.a() { // from class: l.ov90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f149240a.m100618f0(newTags, act, str, i, i2, intent);
            }
        });
        act.overridePendingTransition(z7c0.f203239h, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m100631u0(Act act, final y20<Media> y20Var) {
        m100624n0(act, new z20() { // from class: l.yv90
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                aw90.m100584o(y20Var, (String) obj, (Media) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: v0 */
    public void m100632v0(final Act act, final y20<Media> y20Var) {
        m100624n0(act, new z20() { // from class: l.gv90
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                Media media = (Media) obj2;
                TagChooseMkAct.m44233w2(act, jyb.m147482M(media), null, new Runnable() { // from class: l.lv90
                    @Override // java.lang.Runnable
                    public final void run() {
                        aw90.m100591v(y20Var, media);
                    }
                }, null);
            }
        }, true);
    }

    /* JADX INFO: renamed from: w */
    public void m100633w(String str) {
        this.f73718r.add(str);
        this.f73717q.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: x */
    public final void m100634x(final Act act, boolean z, String str, String str2) {
        if (act instanceof TagGuidePicAct) {
            ((TagGuidePicAct) act).m51961g2();
        } else {
            act.startActivityForResult(TagGuidePicAct.m51955Z1(act, z, str, str2), new C4468a.a() { // from class: l.mv90
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return aw90.m100586q(act, i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final C22421c<uxj0> m100635y(Media media) {
        return (uqb0.f180386R.m184740c() && (media instanceof Picture)) ? uqb0.f180386R.m184739b(Uri.parse(media.url).getPath()).map(new qcj() { // from class: l.qv90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aw90.m100587r((bkj0) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: z */
    public void m100636z(long j) {
        if (m100627q0(j)) {
            this.f73710j.put(Long.valueOf(j));
        }
    }
}
