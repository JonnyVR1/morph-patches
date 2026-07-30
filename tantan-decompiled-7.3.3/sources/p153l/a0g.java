package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.RepeatNetPictureDlgConfig;
import com.p051p1.mobile.putong.core.data.RepeatNetPictureDlgContent;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.fake.DialogC7996a;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.LiveUserLevel;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class a0g {

    /* JADX INFO: renamed from: a */
    public static l4g0 f67709a = new l4g0("p_fake_gender_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public static C22508b<uxj0> f67710b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public static long f67711c = 0;

    /* JADX INFO: renamed from: d */
    public static String f67712d = "noPictureDlg";

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m95345A(PrivacyMembershipSetting privacyMembershipSetting, final Act act) {
        i4g0.m138523u("e_fake_togood_privacy_button", "p_fake_togood_privacy", jyb.m147494Y("button_type_fake", "open"));
        r1j0.m179420g("您已完成隐私设置，后续可以在首页右上角入口进入更改");
        PrivacyMembershipSetting privacyMembershipSettingMo225055clone = privacyMembershipSetting.mo225055clone();
        privacyMembershipSettingMo225055clone.showMeToMyLike = Boolean.TRUE;
        CoreModule.f18264c.f20303E0.m141076R3(privacyMembershipSettingMo225055clone);
        l51.m152888H(act, new Runnable() { // from class: l.rzf
            @Override // java.lang.Runnable
            public final void run() {
                a0g.m95379m(act);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: B */
    public static void m95346B() {
        CoreModule.f18264c.f20381e0.f89341u5.clear();
        CoreModule.f18264c.f20381e0.f89348v5.clear();
        CoreModule.f18264c.f20381e0.f89355w5.clear();
        CoreModule.f18264c.f20381e0.f89362x5.clear();
        CoreModule.f18264c.f20381e0.f89369y5.clear();
        CoreModule.f18264c.f20381e0.f89376z5.clear();
    }

    /* JADX INFO: renamed from: C */
    public static void m95347C() {
        if (spl0.m187351C()) {
            CoreModule.f18264c.f20308F2.m106089f3();
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m95348D() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89369y5.get())) {
            return CoreModule.f18264c.f20381e0.f89376z5.get().intValue();
        }
        CoreModule.f18264c.f20381e0.f89369y5.put(str);
        CoreModule.f18264c.f20381e0.f89376z5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static Intent m95349E(Act act) {
        return MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build());
    }

    /* JADX INFO: renamed from: F */
    public static int m95350F() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89341u5.get())) {
            return CoreModule.f18264c.f20381e0.f89348v5.get().intValue();
        }
        CoreModule.f18264c.f20381e0.f89341u5.put(str);
        CoreModule.f18264c.f20381e0.f89348v5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public static int m95351G() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89355w5.get())) {
            return CoreModule.f18264c.f20381e0.f89362x5.get().intValue();
        }
        CoreModule.f18264c.f20381e0.f89355w5.put(str);
        CoreModule.f18264c.f20381e0.f89362x5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static String m95352H() {
        return f67712d;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m95353I() {
        if (!CoreModule.f18264c.f20381e0.m116537Z7() && !CoreModule.f18264c.f20381e0.m116549c8() && NullChecker.m82486a(gra.m131652Z0())) {
            int i = gra.m131652Z0().trigger.aiPictureFrequency;
            int i2 = gra.m131652Z0().trigger.totalFrequency;
            int iM95348D = m95348D();
            int iM95350F = m95350F() + m95351G() + iM95348D;
            if (iM95348D < i && iM95350F < i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m95354J() {
        if (!NullChecker.m82486a(gra.m131652Z0())) {
            return false;
        }
        int i = gra.m131652Z0().trigger.netPictureFrequency;
        int i2 = gra.m131652Z0().trigger.totalFrequency;
        int iM95348D = m95348D();
        int iM95350F = m95350F();
        return iM95350F < i && (m95351G() + iM95350F) + iM95348D < i2;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m95355K() {
        if (!NullChecker.m82486a(gra.m131652Z0())) {
            return false;
        }
        int i = gra.m131652Z0().trigger.repeatPictureFrequency;
        int i2 = gra.m131652Z0().trigger.totalFrequency;
        int iM95348D = m95348D();
        int iM95350F = m95350F();
        int iM95351G = m95351G();
        return iM95351G < i && (iM95350F + iM95351G) + iM95348D < i2;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m95356L() {
        LiveUserLevel liveUserLevel = CoreModule.f18264c.f20381e0.m116593na().hierarchy;
        if (!NullChecker.m82486a(liveUserLevel) || (liveUserLevel.superGrade <= 0 && liveUserLevel.grade < 38)) {
            return joa.m146357G3();
        }
        return true;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m95357M(User user) {
        return NullChecker.m82486a(user.status) && user.status.contains(UserStatus.get("hidden"));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m95358N() {
        if (!jyb.m147479J(CoreModule.f18264c.f20381e0.m116600p9().pictures)) {
            Media media = CoreModule.f18264c.f20381e0.m116600p9().pictures.get(0);
            if (media instanceof Picture) {
                return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static void m95359O(final Act act, Gender gender, Runnable runnable) {
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, gender)) {
            runnable.run();
            CoreModule.f18264c.f20381e0.f89309q1.put(Boolean.TRUE);
            return;
        }
        act.progress(R$string.f18632L5);
        User user = new User();
        user.gender = gender;
        Settings settings = new Settings();
        settings.lookingFor = LookingFor.get(TEnum.equals(gender, "female") ? "male" : "female");
        user.settings = settings;
        act.duringCreated(f67710b.take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.ozf
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        CoreModule.f18264c.f20381e0.m116620u9(user).subscribe(psd0.m173597H(new y20() { // from class: l.pzf
            @Override // p153l.y20
            public final void call(Object obj) {
                a0g.m95380n((uxj0) obj);
            }
        }, new y20() { // from class: l.qzf
            @Override // p153l.y20
            public final void call(Object obj) {
                a0g.m95371e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static void m95360P() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89369y5.get())) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89376z5;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            CoreModule.f18264c.f20381e0.f89369y5.put(str);
            CoreModule.f18264c.f20381e0.f89376z5.put(1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m95361Q() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89341u5.get())) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89348v5;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            CoreModule.f18264c.f20381e0.f89341u5.put(str);
            CoreModule.f18264c.f20381e0.f89348v5.put(1);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m95362R() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20381e0.f89355w5.get())) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89362x5;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            CoreModule.f18264c.f20381e0.f89355w5.put(str);
            CoreModule.f18264c.f20381e0.f89362x5.put(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:0x0215  */
    /* JADX INFO: renamed from: S */
    public static void m95363S(@NonNull final Act act, String str) {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfigM131652Z0;
        Media media;
        String str2;
        final String str3;
        l4g0 l4g0VarM204399c;
        final jl80 jl80VarM146020O;
        VText_Bold vText_Bold;
        VText_Bold vText_Bold2;
        VText_Bold vText_Bold3;
        RepeatNetPictureDlgContent repeatNetPictureDlgContentNew_;
        VText_Bold vText_Bold4;
        final String str4;
        final String str5;
        if (TextUtils.equals(str, "noPictureDlg") || !TextUtils.equals(f67712d, "noPictureDlg") || (repeatNetPictureDlgConfigM131652Z0 = gra.m131652Z0()) == null) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isAudit()) {
            return;
        }
        if (!userM116600p9.isPicVerificationVerified() || TextUtils.equals(str, "aiPictureDlg")) {
            if (!TextUtils.equals(str, "aiPictureDlg") || m95353I()) {
                if (!TextUtils.equals(str, "netPictureDlg") || m95354J()) {
                    if ((TextUtils.equals(str, "repeatPictureDlg") && !m95355K()) || (media = userM116600p9.pictures.get(0)) == null || TextUtils.isEmpty(media.url)) {
                        return;
                    }
                    String str6 = "net_picture";
                    try {
                        if (!TextUtils.equals(str, "netPictureDlg") && !TextUtils.equals(str, "repeatPictureDlg") && !TextUtils.equals(str, "aiPictureDlg")) {
                            if (TextUtils.equals(str, "swipeLimitDlg")) {
                                str2 = "p_limit_change_avatar_popup";
                            } else {
                                str6 = "";
                                str3 = "";
                            }
                            l4g0VarM204399c = w1e.m204399c(str3, Dialog.class.getName());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("lowquality_reason", str6);
                            l4g0VarM204399c.m152780o(jSONObject);
                            View viewInflate = LayoutInflater.from(act).inflate(kec0.f125885ic, (ViewGroup) null);
                            jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146020O();
                            jl80VarM146020O.setCanceledOnTouchOutside(false);
                            VImage vImage = (VImage) viewInflate.findViewById(adc0.f69806A1);
                            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70042O);
                            VImage vImage2 = (VImage) viewInflate.findViewById(adc0.f69970Jc);
                            VText_Bold vText_Bold5 = (VText_Bold) viewInflate.findViewById(adc0.f70409je);
                            VText vText = (VText) viewInflate.findViewById(adc0.f70273bd);
                            vText_Bold = (VText_Bold) viewInflate.findViewById(adc0.f70325ee);
                            vText_Bold2 = (VText_Bold) viewInflate.findViewById(adc0.f70009M0);
                            vText_Bold3 = (VText_Bold) viewInflate.findViewById(adc0.f70026N0);
                            bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.zyf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    a0g.m95391y(str3, jl80VarM146020O, view);
                                }
                            });
                            uqb0.f180374G.m127115L0(vDraweeView, media.url);
                            vImage2.setImageResource(dbc0.f87228mq);
                            repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                            if (TextUtils.equals(str, "repeatPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.repeatPictureDlg;
                            } else if (TextUtils.equals(str, "netPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.netPictureDlg;
                            } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.swipeLimitDlg;
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.aiPictureDlg;
                            }
                            vText_Bold5.setText(repeatNetPictureDlgContentNew_.title);
                            vText.setText(repeatNetPictureDlgContentNew_.subTitle1);
                            if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                                bnl0.m105524M(vText_Bold, false);
                            } else {
                                vText_Bold.setText(repeatNetPictureDlgContentNew_.subTitle2);
                            }
                            if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button1)) {
                                vText_Bold4 = vText_Bold2;
                            } else {
                                vText_Bold4 = vText_Bold2;
                                vText_Bold4.setText(repeatNetPictureDlgContentNew_.button1);
                            }
                            if (!TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button2)) {
                                vText_Bold3.setText(repeatNetPictureDlgContentNew_.button2);
                            }
                            final String str7 = repeatNetPictureDlgContentNew_.buttonLink1;
                            final String str8 = repeatNetPictureDlgContentNew_.buttonLink2;
                            str4 = repeatNetPictureDlgContentNew_.buttonEid1;
                            str5 = repeatNetPictureDlgContentNew_.buttonEid2;
                            bnl0.m105509E0(vText_Bold4, new View.OnClickListener() { // from class: l.kzf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    a0g.m95383q(str7, act, str4, str3, jl80VarM146020O, view);
                                }
                            });
                            bnl0.m105509E0(vText_Bold3, new View.OnClickListener() { // from class: l.szf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    a0g.m95384r(str8, act, str5, str3, jl80VarM146020O, view);
                                }
                            });
                            if (w20.m204491f(act)) {
                                jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tzf
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        a0g.f67712d = "noPictureDlg";
                                    }
                                });
                                f67712d = str;
                                jl80VarM146020O.show();
                                w1e.m204402f(l4g0VarM204399c);
                                if (!TextUtils.isEmpty(str4)) {
                                    i4g0.m138526x(str4, str3);
                                }
                                if (!TextUtils.isEmpty(str5)) {
                                    i4g0.m138526x(str5, str3);
                                }
                            }
                            if (TextUtils.equals(str, "netPictureDlg")) {
                                m95361Q();
                                CoreModule.f18264c.f20381e0.m116540a7("net");
                            } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                                m95362R();
                                CoreModule.f18264c.f20381e0.m116540a7("repeat");
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                m95360P();
                                CoreModule.f18264c.f20381e0.m116540a7("ai_manual");
                            }
                        }
                        if (!TextUtils.equals(str, "netPictureDlg")) {
                            str6 = TextUtils.equals(str, "aiPictureDlg") ? MessageType.ai_picture : "repeat_picture";
                        }
                        if (!TextUtils.equals(str, "aiPictureDlg")) {
                            m95347C();
                        }
                        str2 = "p_change_avatar_reminder_popup";
                        jSONObject.put("lowquality_reason", str6);
                        l4g0VarM204399c.m152780o(jSONObject);
                    } catch (JSONException unused) {
                    }
                    str3 = str2;
                    l4g0VarM204399c = w1e.m204399c(str3, Dialog.class.getName());
                    JSONObject jSONObject2 = new JSONObject();
                    View viewInflate2 = LayoutInflater.from(act).inflate(kec0.f125885ic, (ViewGroup) null);
                    jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate2).m146021P(false).m146020O();
                    jl80VarM146020O.setCanceledOnTouchOutside(false);
                    VImage vImage3 = (VImage) viewInflate2.findViewById(adc0.f69806A1);
                    VDraweeView vDraweeView2 = (VDraweeView) viewInflate2.findViewById(adc0.f70042O);
                    VImage vImage4 = (VImage) viewInflate2.findViewById(adc0.f69970Jc);
                    VText_Bold vText_Bold6 = (VText_Bold) viewInflate2.findViewById(adc0.f70409je);
                    VText vText2 = (VText) viewInflate2.findViewById(adc0.f70273bd);
                    vText_Bold = (VText_Bold) viewInflate2.findViewById(adc0.f70325ee);
                    vText_Bold2 = (VText_Bold) viewInflate2.findViewById(adc0.f70009M0);
                    vText_Bold3 = (VText_Bold) viewInflate2.findViewById(adc0.f70026N0);
                    bnl0.m105509E0(vImage3, new View.OnClickListener() { // from class: l.zyf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a0g.m95391y(str3, jl80VarM146020O, view);
                        }
                    });
                    uqb0.f180374G.m127115L0(vDraweeView2, media.url);
                    vImage4.setImageResource(dbc0.f87228mq);
                    repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                    if (TextUtils.equals(str, "repeatPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.repeatPictureDlg;
                    } else if (TextUtils.equals(str, "netPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.netPictureDlg;
                    } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.swipeLimitDlg;
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM131652Z0.aiPictureDlg;
                    }
                    vText_Bold6.setText(repeatNetPictureDlgContentNew_.title);
                    vText2.setText(repeatNetPictureDlgContentNew_.subTitle1);
                    if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                        vText_Bold.setText(repeatNetPictureDlgContentNew_.subTitle2);
                    } else {
                        bnl0.m105524M(vText_Bold, false);
                    }
                    if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button1)) {
                        vText_Bold4 = vText_Bold2;
                        vText_Bold4.setText(repeatNetPictureDlgContentNew_.button1);
                    } else {
                        vText_Bold4 = vText_Bold2;
                    }
                    if (!TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button2)) {
                        vText_Bold3.setText(repeatNetPictureDlgContentNew_.button2);
                    }
                    final String str9 = repeatNetPictureDlgContentNew_.buttonLink1;
                    final String str10 = repeatNetPictureDlgContentNew_.buttonLink2;
                    str4 = repeatNetPictureDlgContentNew_.buttonEid1;
                    str5 = repeatNetPictureDlgContentNew_.buttonEid2;
                    bnl0.m105509E0(vText_Bold4, new View.OnClickListener() { // from class: l.kzf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a0g.m95383q(str9, act, str4, str3, jl80VarM146020O, view);
                        }
                    });
                    bnl0.m105509E0(vText_Bold3, new View.OnClickListener() { // from class: l.szf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a0g.m95384r(str10, act, str5, str3, jl80VarM146020O, view);
                        }
                    });
                    if (w20.m204491f(act)) {
                        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tzf
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                a0g.f67712d = "noPictureDlg";
                            }
                        });
                        f67712d = str;
                        jl80VarM146020O.show();
                        w1e.m204402f(l4g0VarM204399c);
                        if (!TextUtils.isEmpty(str4)) {
                            i4g0.m138526x(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            i4g0.m138526x(str5, str3);
                        }
                    }
                    if (TextUtils.equals(str, "netPictureDlg")) {
                        m95361Q();
                        CoreModule.f18264c.f20381e0.m116540a7("net");
                    } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                        m95362R();
                        CoreModule.f18264c.f20381e0.m116540a7("repeat");
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        m95360P();
                        CoreModule.f18264c.f20381e0.m116540a7("ai_manual");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m95364T(final Act act, final Runnable runnable) {
        View viewInflate = act.getLayoutInflater().inflate(kec0.f125808e3, (ViewGroup) null, false);
        uqb0.f180374G.m127111J0((SimpleDraweeView) viewInflate.findViewById(adc0.f70042O), CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle(), false);
        ((VText) viewInflate.findViewById(adc0.f70409je)).setText(R$string.f18751P4);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70261b1);
        vButton.setText(R$string.f18691N4);
        VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f70278c1);
        vButton2.setText(R$string.f18721O4);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146021P(false).m146018M(false).m146023R(viewInflate).m146020O();
        final String str = "p_fake_gender_popup";
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.uzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0g.m95375i(act, runnable, jl80VarM146020O, str, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.vzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0g.m95388v(act, runnable, jl80VarM146020O, str, view);
            }
        });
        final kcg0 kcg0VarSubscribe = act.duringCreated((C22421c) C7997b.m37423r().m37437q(), false).subscribe(psd0.m173596G(new y20() { // from class: l.wzf
            @Override // p153l.y20
            public final void call(Object obj) {
                a0g.m95387u(jl80VarM146020O, (uxj0) obj);
            }
        }));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xzf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a0g.m95370d(kcg0VarSubscribe, dialogInterface);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(f67709a);
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "female" : "male");
        i4g0.m138527y("e_fake_alert_gender", "p_fake_gender_popup", map);
        HashMap map2 = new HashMap();
        map2.put("fake_gender", "female");
        map2.put("fake_gender_original", CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "female" : "male");
        i4g0.m138527y("e_fake_alert_gender", "p_fake_gender_popup", map2);
    }

    /* JADX INFO: renamed from: U */
    public static void m95365U(final Act act) {
        act.duringCreated(CoreModule.f18264c.f20303E0.m141084Z3()).subscribe(psd0.m173596G(new y20() { // from class: l.hzf
            @Override // p153l.y20
            public final void call(Object obj) {
                a0g.m95378l(act, (PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static void m95366V(@NonNull final Act act, @NonNull final FakeGuideData fakeGuideData) {
        final Act act2;
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || TextUtils.isEmpty(fakeGuideData.identifier) || userM116600p9.isAudit() || !jyb.m147520m(userM116600p9.pictures, new qcj() { // from class: l.yzf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.contains(fakeGuideData.identifier));
            }
        })) {
            return;
        }
        final String str = "mainAvatar".equals(fakeGuideData.type) ? "p_fake_change_avatar_popup" : "p_secondary_avatar_change_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c(str, Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", userM116600p9.f56859id);
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(kec0.f125885ic, (ViewGroup) null);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f69806A1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70042O);
        VImage vImage2 = (VImage) viewInflate.findViewById(adc0.f69970Jc);
        VText_Bold vText_Bold = (VText_Bold) viewInflate.findViewById(adc0.f70409je);
        VText vText = (VText) viewInflate.findViewById(adc0.f70273bd);
        VText_Bold vText_Bold2 = (VText_Bold) viewInflate.findViewById(adc0.f70325ee);
        VText_Bold vText_Bold3 = (VText_Bold) viewInflate.findViewById(adc0.f70009M0);
        VText_Bold vText_Bold4 = (VText_Bold) viewInflate.findViewById(adc0.f70026N0);
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.zzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0g.m95373g(str, jl80VarM146020O, view);
            }
        });
        uqb0.f180374G.m127115L0(vDraweeView, fakeGuideData.identifier);
        if ("mainAvatar".equals(fakeGuideData.type)) {
            vImage2.setImageResource(dbc0.f87228mq);
            vText_Bold.setText("更换真实头像");
            vText.setText("当前使用的照片不真实，被喜欢的概率较低。请立即更换为本人五官清晰的正面照片，获得更多曝光，收获喜欢。");
            vText_Bold2.setText("收到5次提醒仍未更换，系统将限制你在划卡的曝光。");
            vText_Bold3.setText("更换头像");
            vText_Bold4.setText("头像示例");
            bnl0.m105509E0(vText_Bold3, new View.OnClickListener() { // from class: l.azf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0g.m95386t(act, str, view);
                }
            });
            bnl0.m105509E0(vText_Bold4, new View.OnClickListener() { // from class: l.bzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0g.m95374h(act, userM116600p9, str, view);
                }
            });
            act2 = act;
        } else {
            vImage2.setImageResource(dbc0.f87261nq);
            vText_Bold.setText("使用真实照片作为主头像");
            vText.setText("当前使用的照片不真实，建议使用系统推荐已有的照片作为主头像，或更换清晰正面照，获得更多曝光，收获喜欢。");
            vText_Bold2.setText("连续3天收到提醒仍未修改，系统会默认更换。");
            vText_Bold3.setText("立即使用");
            vText_Bold4.setText("修改主头像");
            act2 = act;
            bnl0.m105509E0(vText_Bold3, new View.OnClickListener() { // from class: l.czf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0g.m95392z(str, userM116600p9, fakeGuideData, jl80VarM146020O, act2, view);
                }
            });
            bnl0.m105509E0(vText_Bold4, new View.OnClickListener() { // from class: l.dzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0g.m95376j(act2, str, view);
                }
            });
        }
        final kcg0 kcg0VarSubscribe = act2.duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged().filter(new qcj() { // from class: l.ezf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82486a(user) && user.isAudit());
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.fzf
            @Override // p153l.y20
            public final void call(Object obj) {
                jl80VarM146020O.dismiss();
            }
        }));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gzf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a0g.m95381o(kcg0VarSubscribe, l4g0VarM204399c, dialogInterface);
            }
        });
        if (w20.m204491f(act2)) {
            jl80VarM146020O.show();
            w1e.m204402f(l4g0VarM204399c);
            CoreModule.f18264c.f20381e0.f89320r5.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89327s5.m203841a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m95370d(kcg0 kcg0Var, DialogInterface dialogInterface) {
        psd0.m173633z(kcg0Var);
        w1e.m204401e(f67709a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m95371e(Throwable th) {
        f67710b.m137019l(uxj0.f181467a);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m95373g(String str, jl80 jl80Var, View view) {
        i4g0.m138520r("e_choose_close", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m95374h(Act act, User user, String str, View view) {
        ks90.m151153e(act, user.gender, gv20.m132476k(act), null);
        i4g0.m138520r("e_fake_alert_popup_example", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m95375i(Act act, Runnable runnable, jl80 jl80Var, String str, View view) {
        m95359O(act, Gender.get("male"), runnable);
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "female" : "male");
        i4g0.m138521s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m95376j(Act act, String str, View view) {
        act.startActivity(ProfileAct.m51922q2(act, CoreModule.m30929H().userId(), "", false, true));
        i4g0.m138520r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m95378l(final Act act, final PrivacyMembershipSetting privacyMembershipSetting) {
        if (CoreModule.f18264c.f20381e0.m116537Z7() && NullChecker.m82486a(privacyMembershipSetting)) {
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_fake_togood_privacy", jl80.class.getName());
            w1e.m204402f(l4g0VarM204399c);
            new jl80.C17971a(act).m146056y0("隐私保护功能可用").m146051t0("为了保护您的隐私，您可以选择只对您右滑过的人可见").m146021P(false).m146034c0("打开", new Runnable() { // from class: l.lzf
                @Override // java.lang.Runnable
                public final void run() {
                    a0g.m95345A(privacyMembershipSetting, act);
                }
            }).m146029X("不用了", new Runnable() { // from class: l.mzf
                @Override // java.lang.Runnable
                public final void run() {
                    i4g0.m138523u("e_fake_togood_privacy_button", "p_fake_togood_privacy", jyb.m147494Y("button_type_fake", "close"));
                }
            }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.nzf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            }).m146020O().show();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m95379m(Act act) {
        DialogC7996a dialogC7996a = new DialogC7996a(act);
        dialogC7996a.setCanceledOnTouchOutside(false);
        dialogC7996a.show();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m95380n(uxj0 uxj0Var) {
        CoreModule.f18264c.f20381e0.f89309q1.put(Boolean.TRUE);
        CoreModule.f18264c.f20381e0.m116470H9();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        CoreModule.f18264c.f20297C0.m146425v4();
        f67710b.m137019l(uxj0.f181467a);
        CoreModule.f18264c.f20405m0.m32046R5();
        CoreModule.f18264c.f20405m0.m32130m8();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m95381o(kcg0 kcg0Var, l4g0 l4g0Var, DialogInterface dialogInterface) {
        psd0.m173633z(kcg0Var);
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m95383q(String str, Act act, String str2, String str3, jl80 jl80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            xwa.m213304D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            i4g0.m138520r(str2, str3);
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m95384r(String str, Act act, String str2, String str3, jl80 jl80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            xwa.m213304D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            i4g0.m138520r(str2, str3);
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m95386t(Act act, String str, View view) {
        act.startActivity(ProfileAct.m51922q2(act, CoreModule.m30929H().userId(), "", false, true));
        i4g0.m138520r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m95387u(jl80 jl80Var, uxj0 uxj0Var) {
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m95388v(Act act, Runnable runnable, jl80 jl80Var, String str, View view) {
        m95359O(act, Gender.get("female"), runnable);
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "female");
        map.put("fake_gender_original", CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "female" : "male");
        i4g0.m138521s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m95391y(String str, jl80 jl80Var, View view) {
        i4g0.m138520r("e_choose_close", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m95392z(String str, User user, final FakeGuideData fakeGuideData, jl80 jl80Var, Act act, View view) {
        i4g0.m138520r("e_change_secondary_avatar", str);
        int iM147476G = jyb.m147476G(user.pictures, new qcj() { // from class: l.izf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf(NullChecker.m82486a(media) && NullChecker.m82486a(media.url) && media.url.contains(fakeGuideData.identifier));
            }
        });
        if (iM147476G < 0 || iM147476G >= user.pictures.size()) {
            jl80Var.dismiss();
            return;
        }
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.pictures.get(0).tags.clear();
        userMo225055clone.pictures.get(iM147476G).tags.clear();
        Collections.swap(userMo225055clone.pictures, 0, iM147476G);
        tr90.m192412D(act, userMo225055clone, new Runnable() { // from class: l.jzf
            @Override // java.lang.Runnable
            public final void run() {
                r1j0.m179420g("更换成功");
            }
        }, null);
    }
}
