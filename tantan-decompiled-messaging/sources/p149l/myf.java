package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.RepeatNetPictureDlgConfig;
import com.p046p1.mobile.putong.core.data.RepeatNetPictureDlgContent;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.fake.DialogC7845a;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.LiveUserLevel;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class myf {

    /* JADX INFO: renamed from: a */
    public static cwf0 f136293a = new cwf0("p_fake_gender_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public static C22393b<roj0> f136294b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public static long f136295c = 0;

    /* JADX INFO: renamed from: d */
    public static String f136296d = "noPictureDlg";

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m157021A(PrivacyMembershipSetting privacyMembershipSetting, final Act act) {
        zvf0.m220399u("e_fake_togood_privacy_button", "p_fake_togood_privacy", vwb.m200311Y("button_type_fake", "open"));
        osi0.m165783g("您已完成隐私设置，后续可以在首页右上角入口进入更改");
        PrivacyMembershipSetting privacyMembershipSettingMo223809clone = privacyMembershipSetting.mo223809clone();
        privacyMembershipSettingMo223809clone.showMeToMyLike = Boolean.TRUE;
        CoreModule.f17545c.f19561E0.m203788R3(privacyMembershipSettingMo223809clone);
        e51.m114743H(act, new Runnable() { // from class: l.dyf
            @Override // java.lang.Runnable
            public final void run() {
                myf.m157055m(act);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: B */
    public static void m157022B() {
        CoreModule.f17545c.f19639e0.f149484u5.clear();
        CoreModule.f17545c.f19639e0.f149491v5.clear();
        CoreModule.f17545c.f19639e0.f149498w5.clear();
        CoreModule.f17545c.f19639e0.f149505x5.clear();
        CoreModule.f17545c.f19639e0.f149512y5.clear();
        CoreModule.f17545c.f19639e0.f149519z5.clear();
    }

    /* JADX INFO: renamed from: C */
    public static void m157023C() {
        if (ogl0.m164224C()) {
            CoreModule.f17545c.f19566F2.m204902f3();
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m157024D() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149512y5.get())) {
            return CoreModule.f17545c.f19639e0.f149519z5.get().intValue();
        }
        CoreModule.f17545c.f19639e0.f149512y5.put(str);
        CoreModule.f17545c.f19639e0.f149519z5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static Intent m157025E(Act act) {
        return MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build());
    }

    /* JADX INFO: renamed from: F */
    public static int m157026F() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149484u5.get())) {
            return CoreModule.f17545c.f19639e0.f149491v5.get().intValue();
        }
        CoreModule.f17545c.f19639e0.f149484u5.put(str);
        CoreModule.f17545c.f19639e0.f149491v5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public static int m157027G() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149498w5.get())) {
            return CoreModule.f17545c.f19639e0.f149505x5.get().intValue();
        }
        CoreModule.f17545c.f19639e0.f149498w5.put(str);
        CoreModule.f17545c.f19639e0.f149505x5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static String m157028H() {
        return f136296d;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m157029I() {
        if (!CoreModule.f17545c.f19639e0.m169464Z7() && !CoreModule.f17545c.f19639e0.m169476c8() && NullChecker.m81303a(upa.m194721Z0())) {
            int i = upa.m194721Z0().trigger.aiPictureFrequency;
            int i2 = upa.m194721Z0().trigger.totalFrequency;
            int iM157024D = m157024D();
            int iM157026F = m157026F() + m157027G() + iM157024D;
            if (iM157024D < i && iM157026F < i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m157030J() {
        if (!NullChecker.m81303a(upa.m194721Z0())) {
            return false;
        }
        int i = upa.m194721Z0().trigger.netPictureFrequency;
        int i2 = upa.m194721Z0().trigger.totalFrequency;
        int iM157024D = m157024D();
        int iM157026F = m157026F();
        return iM157026F < i && (m157027G() + iM157026F) + iM157024D < i2;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m157031K() {
        if (!NullChecker.m81303a(upa.m194721Z0())) {
            return false;
        }
        int i = upa.m194721Z0().trigger.repeatPictureFrequency;
        int i2 = upa.m194721Z0().trigger.totalFrequency;
        int iM157024D = m157024D();
        int iM157026F = m157026F();
        int iM157027G = m157027G();
        return iM157027G < i && (iM157026F + iM157027G) + iM157024D < i2;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m157032L() {
        LiveUserLevel liveUserLevel = CoreModule.f17545c.f19639e0.m169520na().hierarchy;
        if (!NullChecker.m81303a(liveUserLevel) || (liveUserLevel.superGrade <= 0 && liveUserLevel.grade < 38)) {
            return xma.m210043F3();
        }
        return true;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m157033M(User user) {
        return NullChecker.m81303a(user.status) && user.status.contains(UserStatus.get("hidden"));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m157034N() {
        if (!vwb.m200296J(CoreModule.f17545c.f19639e0.m169527p9().pictures)) {
            Media media = CoreModule.f17545c.f19639e0.m169527p9().pictures.get(0);
            if (media instanceof Picture) {
                return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static void m157035O(final Act act, Gender gender, Runnable runnable) {
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, gender)) {
            runnable.run();
            CoreModule.f17545c.f19639e0.f149452q1.put(Boolean.TRUE);
            return;
        }
        act.progress(R$string.f17842J5);
        User user = new User();
        user.gender = gender;
        Settings settings = new Settings();
        settings.lookingFor = LookingFor.get(TEnum.equals(gender, "female") ? "male" : "female");
        user.settings = settings;
        act.duringCreated(f136294b.take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.ayf
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        CoreModule.f17545c.f19639e0.m169547u9(user).subscribe(mkd0.m154956H(new e30() { // from class: l.byf
            @Override // p149l.e30
            public final void call(Object obj) {
                myf.m157056n((roj0) obj);
            }
        }, new e30() { // from class: l.cyf
            @Override // p149l.e30
            public final void call(Object obj) {
                myf.m157047e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static void m157036P() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149512y5.get())) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149519z5;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            CoreModule.f17545c.f19639e0.f149512y5.put(str);
            CoreModule.f17545c.f19639e0.f149519z5.put(1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m157037Q() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149484u5.get())) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149491v5;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            CoreModule.f17545c.f19639e0.f149484u5.put(str);
            CoreModule.f17545c.f19639e0.f149491v5.put(1);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m157038R() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19639e0.f149498w5.get())) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149505x5;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            CoreModule.f17545c.f19639e0.f149498w5.put(str);
            CoreModule.f17545c.f19639e0.f149505x5.put(1);
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
    public static void m157039S(@NonNull final Act act, String str) {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfigM194721Z0;
        Media media;
        String str2;
        final String str3;
        cwf0 cwf0VarM133794c;
        final dd80 dd80VarM110960O;
        VText_Bold vText_Bold;
        VText_Bold vText_Bold2;
        VText_Bold vText_Bold3;
        RepeatNetPictureDlgContent repeatNetPictureDlgContentNew_;
        VText_Bold vText_Bold4;
        final String str4;
        final String str5;
        if (TextUtils.equals(str, "noPictureDlg") || !TextUtils.equals(f136296d, "noPictureDlg") || (repeatNetPictureDlgConfigM194721Z0 = upa.m194721Z0()) == null) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isAudit()) {
            return;
        }
        if (!userM169527p9.isPicVerificationVerified() || TextUtils.equals(str, "aiPictureDlg")) {
            if (!TextUtils.equals(str, "aiPictureDlg") || m157029I()) {
                if (!TextUtils.equals(str, "netPictureDlg") || m157030J()) {
                    if ((TextUtils.equals(str, "repeatPictureDlg") && !m157031K()) || (media = userM169527p9.pictures.get(0)) == null || TextUtils.isEmpty(media.url)) {
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
                            cwf0VarM133794c = i0e.m133794c(str3, Dialog.class.getName());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("lowquality_reason", str6);
                            cwf0VarM133794c.m109039o(jSONObject);
                            View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95712bc, (ViewGroup) null);
                            dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110960O();
                            dd80VarM110960O.setCanceledOnTouchOutside(false);
                            VImage vImage = (VImage) viewInflate.findViewById(u4c0.f173718A1);
                            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173954O);
                            VImage vImage2 = (VImage) viewInflate.findViewById(u4c0.f173848Hc);
                            VText_Bold vText_Bold5 = (VText_Bold) viewInflate.findViewById(u4c0.f174268ge);
                            VText vText = (VText) viewInflate.findViewById(u4c0.f174148Zc);
                            vText_Bold = (VText_Bold) viewInflate.findViewById(u4c0.f174183be);
                            vText_Bold2 = (VText_Bold) viewInflate.findViewById(u4c0.f173921M0);
                            vText_Bold3 = (VText_Bold) viewInflate.findViewById(u4c0.f173938N0);
                            xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.lxf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m157067y(str3, dd80VarM110960O, view);
                                }
                            });
                            qib0.f154691G.m102331L0(vDraweeView, media.url);
                            vImage2.setImageResource(x2c0.f190756yp);
                            repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                            if (TextUtils.equals(str, "repeatPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.repeatPictureDlg;
                            } else if (TextUtils.equals(str, "netPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.netPictureDlg;
                            } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.swipeLimitDlg;
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.aiPictureDlg;
                            }
                            vText_Bold5.setText(repeatNetPictureDlgContentNew_.title);
                            vText.setText(repeatNetPictureDlgContentNew_.subTitle1);
                            if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                                xdl0.m208344M(vText_Bold, false);
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
                            xdl0.m208329E0(vText_Bold4, new View.OnClickListener() { // from class: l.wxf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m157059q(str7, act, str4, str3, dd80VarM110960O, view);
                                }
                            });
                            xdl0.m208329E0(vText_Bold3, new View.OnClickListener() { // from class: l.eyf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m157060r(str8, act, str5, str3, dd80VarM110960O, view);
                                }
                            });
                            if (c30.m104964f(act)) {
                                dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fyf
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        myf.f136296d = "noPictureDlg";
                                    }
                                });
                                f136296d = str;
                                dd80VarM110960O.show();
                                i0e.m133797f(cwf0VarM133794c);
                                if (!TextUtils.isEmpty(str4)) {
                                    zvf0.m220402x(str4, str3);
                                }
                                if (!TextUtils.isEmpty(str5)) {
                                    zvf0.m220402x(str5, str3);
                                }
                            }
                            if (TextUtils.equals(str, "netPictureDlg")) {
                                m157037Q();
                                CoreModule.f17545c.f19639e0.m169467a7("net");
                            } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                                m157038R();
                                CoreModule.f17545c.f19639e0.m169467a7("repeat");
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                m157036P();
                                CoreModule.f17545c.f19639e0.m169467a7("ai_manual");
                            }
                        }
                        if (!TextUtils.equals(str, "netPictureDlg")) {
                            str6 = TextUtils.equals(str, "aiPictureDlg") ? MessageType.ai_picture : "repeat_picture";
                        }
                        if (!TextUtils.equals(str, "aiPictureDlg")) {
                            m157023C();
                        }
                        str2 = "p_change_avatar_reminder_popup";
                        jSONObject.put("lowquality_reason", str6);
                        cwf0VarM133794c.m109039o(jSONObject);
                    } catch (JSONException unused) {
                    }
                    str3 = str2;
                    cwf0VarM133794c = i0e.m133794c(str3, Dialog.class.getName());
                    JSONObject jSONObject2 = new JSONObject();
                    View viewInflate2 = LayoutInflater.from(act).inflate(f6c0.f95712bc, (ViewGroup) null);
                    dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate2).m110961P(false).m110960O();
                    dd80VarM110960O.setCanceledOnTouchOutside(false);
                    VImage vImage3 = (VImage) viewInflate2.findViewById(u4c0.f173718A1);
                    VDraweeView vDraweeView2 = (VDraweeView) viewInflate2.findViewById(u4c0.f173954O);
                    VImage vImage4 = (VImage) viewInflate2.findViewById(u4c0.f173848Hc);
                    VText_Bold vText_Bold6 = (VText_Bold) viewInflate2.findViewById(u4c0.f174268ge);
                    VText vText2 = (VText) viewInflate2.findViewById(u4c0.f174148Zc);
                    vText_Bold = (VText_Bold) viewInflate2.findViewById(u4c0.f174183be);
                    vText_Bold2 = (VText_Bold) viewInflate2.findViewById(u4c0.f173921M0);
                    vText_Bold3 = (VText_Bold) viewInflate2.findViewById(u4c0.f173938N0);
                    xdl0.m208329E0(vImage3, new View.OnClickListener() { // from class: l.lxf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m157067y(str3, dd80VarM110960O, view);
                        }
                    });
                    qib0.f154691G.m102331L0(vDraweeView2, media.url);
                    vImage4.setImageResource(x2c0.f190756yp);
                    repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                    if (TextUtils.equals(str, "repeatPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.repeatPictureDlg;
                    } else if (TextUtils.equals(str, "netPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.netPictureDlg;
                    } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.swipeLimitDlg;
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigM194721Z0.aiPictureDlg;
                    }
                    vText_Bold6.setText(repeatNetPictureDlgContentNew_.title);
                    vText2.setText(repeatNetPictureDlgContentNew_.subTitle1);
                    if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                        vText_Bold.setText(repeatNetPictureDlgContentNew_.subTitle2);
                    } else {
                        xdl0.m208344M(vText_Bold, false);
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
                    xdl0.m208329E0(vText_Bold4, new View.OnClickListener() { // from class: l.wxf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m157059q(str9, act, str4, str3, dd80VarM110960O, view);
                        }
                    });
                    xdl0.m208329E0(vText_Bold3, new View.OnClickListener() { // from class: l.eyf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m157060r(str10, act, str5, str3, dd80VarM110960O, view);
                        }
                    });
                    if (c30.m104964f(act)) {
                        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fyf
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                myf.f136296d = "noPictureDlg";
                            }
                        });
                        f136296d = str;
                        dd80VarM110960O.show();
                        i0e.m133797f(cwf0VarM133794c);
                        if (!TextUtils.isEmpty(str4)) {
                            zvf0.m220402x(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            zvf0.m220402x(str5, str3);
                        }
                    }
                    if (TextUtils.equals(str, "netPictureDlg")) {
                        m157037Q();
                        CoreModule.f17545c.f19639e0.m169467a7("net");
                    } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                        m157038R();
                        CoreModule.f17545c.f19639e0.m169467a7("repeat");
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        m157036P();
                        CoreModule.f17545c.f19639e0.m169467a7("ai_manual");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m157040T(final Act act, final Runnable runnable) {
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f95754e3, (ViewGroup) null, false);
        qib0.f154691G.m102327J0((SimpleDraweeView) viewInflate.findViewById(u4c0.f173954O), CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle(), false);
        ((VText) viewInflate.findViewById(u4c0.f174268ge)).setText(R$string.f17961N4);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174170b1);
        vButton.setText(R$string.f17901L4);
        VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174187c1);
        vButton2.setText(R$string.f17931M4);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110961P(false).m110958M(false).m110963R(viewInflate).m110960O();
        final String str = "p_fake_gender_popup";
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.gyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m157051i(act, runnable, dd80VarM110960O, str, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.hyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m157064v(act, runnable, dd80VarM110960O, str, view);
            }
        });
        final c4g0 c4g0VarSubscribe = act.duringCreated((C22306c) C7846b.m36420r().m36434q(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.iyf
            @Override // p149l.e30
            public final void call(Object obj) {
                myf.m157063u(dd80VarM110960O, (roj0) obj);
            }
        }));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jyf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                myf.m157046d(c4g0VarSubscribe, dialogInterface);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(f136293a);
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "female" : "male");
        zvf0.m220403y("e_fake_alert_gender", "p_fake_gender_popup", map);
        HashMap map2 = new HashMap();
        map2.put("fake_gender", "female");
        map2.put("fake_gender_original", CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "female" : "male");
        zvf0.m220403y("e_fake_alert_gender", "p_fake_gender_popup", map2);
    }

    /* JADX INFO: renamed from: U */
    public static void m157041U(final Act act) {
        act.duringCreated(CoreModule.f17545c.f19561E0.m203796Z3()).subscribe(mkd0.m154955G(new e30() { // from class: l.txf
            @Override // p149l.e30
            public final void call(Object obj) {
                myf.m157054l(act, (PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static void m157042V(@NonNull final Act act, @NonNull final FakeGuideData fakeGuideData) {
        final Act act2;
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || TextUtils.isEmpty(fakeGuideData.identifier) || userM169527p9.isAudit() || !vwb.m200337m(userM169527p9.pictures, new w9j() { // from class: l.kyf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.contains(fakeGuideData.identifier));
            }
        })) {
            return;
        }
        final String str = "mainAvatar".equals(fakeGuideData.type) ? "p_fake_change_avatar_popup" : "p_secondary_avatar_change_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c(str, Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", userM169527p9.f56011id);
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95712bc, (ViewGroup) null);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f173718A1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173954O);
        VImage vImage2 = (VImage) viewInflate.findViewById(u4c0.f173848Hc);
        VText_Bold vText_Bold = (VText_Bold) viewInflate.findViewById(u4c0.f174268ge);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VText_Bold vText_Bold2 = (VText_Bold) viewInflate.findViewById(u4c0.f174183be);
        VText_Bold vText_Bold3 = (VText_Bold) viewInflate.findViewById(u4c0.f173921M0);
        VText_Bold vText_Bold4 = (VText_Bold) viewInflate.findViewById(u4c0.f173938N0);
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.lyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m157049g(str, dd80VarM110960O, view);
            }
        });
        qib0.f154691G.m102331L0(vDraweeView, fakeGuideData.identifier);
        if ("mainAvatar".equals(fakeGuideData.type)) {
            vImage2.setImageResource(x2c0.f190756yp);
            vText_Bold.setText("更换真实头像");
            vText.setText("当前使用的照片不真实，被喜欢的概率较低。请立即更换为本人五官清晰的正面照片，获得更多曝光，收获喜欢。");
            vText_Bold2.setText("收到5次提醒仍未更换，系统将限制你在划卡的曝光。");
            vText_Bold3.setText("更换头像");
            vText_Bold4.setText("头像示例");
            xdl0.m208329E0(vText_Bold3, new View.OnClickListener() { // from class: l.mxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m157062t(act, str, view);
                }
            });
            xdl0.m208329E0(vText_Bold4, new View.OnClickListener() { // from class: l.nxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m157050h(act, userM169527p9, str, view);
                }
            });
            act2 = act;
        } else {
            vImage2.setImageResource(x2c0.f190788zp);
            vText_Bold.setText("使用真实照片作为主头像");
            vText.setText("当前使用的照片不真实，建议使用系统推荐已有的照片作为主头像，或更换清晰正面照，获得更多曝光，收获喜欢。");
            vText_Bold2.setText("连续3天收到提醒仍未修改，系统会默认更换。");
            vText_Bold3.setText("立即使用");
            vText_Bold4.setText("修改主头像");
            act2 = act;
            xdl0.m208329E0(vText_Bold3, new View.OnClickListener() { // from class: l.oxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m157068z(str, userM169527p9, fakeGuideData, dd80VarM110960O, act2, view);
                }
            });
            xdl0.m208329E0(vText_Bold4, new View.OnClickListener() { // from class: l.pxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m157052j(act2, str, view);
                }
            });
        }
        final c4g0 c4g0VarSubscribe = act2.duringCreated(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged().filter(new w9j() { // from class: l.qxf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81303a(user) && user.isAudit());
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.rxf
            @Override // p149l.e30
            public final void call(Object obj) {
                dd80VarM110960O.dismiss();
            }
        }));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sxf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                myf.m157057o(c4g0VarSubscribe, cwf0VarM133794c, dialogInterface);
            }
        });
        if (c30.m104964f(act2)) {
            dd80VarM110960O.show();
            i0e.m133797f(cwf0VarM133794c);
            CoreModule.f17545c.f19639e0.f149463r5.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149470s5.m189988a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m157046d(c4g0 c4g0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(c4g0Var);
        i0e.m133796e(f136293a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m157047e(Throwable th) {
        f136294b.m132487l(roj0.f160388a);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m157049g(String str, dd80 dd80Var, View view) {
        zvf0.m220396r("e_choose_close", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m157050h(Act act, User user, String str, View view) {
        gk90.m126611e(act, user.gender, wm20.m203971k(act), null);
        zvf0.m220396r("e_fake_alert_popup_example", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m157051i(Act act, Runnable runnable, dd80 dd80Var, String str, View view) {
        m157035O(act, Gender.get("male"), runnable);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "female" : "male");
        zvf0.m220397s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m157052j(Act act, String str, View view) {
        act.startActivity(ProfileAct.m50738p2(act, CoreModule.m29931H().userId(), "", false, true));
        zvf0.m220396r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m157054l(final Act act, final PrivacyMembershipSetting privacyMembershipSetting) {
        if (CoreModule.f17545c.f19639e0.m169464Z7() && NullChecker.m81303a(privacyMembershipSetting)) {
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_fake_togood_privacy", dd80.class.getName());
            i0e.m133797f(cwf0VarM133794c);
            new dd80.C16336a(act).m110996y0("隐私保护功能可用").m110991t0("为了保护您的隐私，您可以选择只对您右滑过的人可见").m110961P(false).m110974c0("打开", new Runnable() { // from class: l.xxf
                @Override // java.lang.Runnable
                public final void run() {
                    myf.m157021A(privacyMembershipSetting, act);
                }
            }).m110969X("不用了", new Runnable() { // from class: l.yxf
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.m220399u("e_fake_togood_privacy_button", "p_fake_togood_privacy", vwb.m200311Y("button_type_fake", "close"));
                }
            }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zxf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            }).m110960O().show();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m157055m(Act act) {
        DialogC7845a dialogC7845a = new DialogC7845a(act);
        dialogC7845a.setCanceledOnTouchOutside(false);
        dialogC7845a.show();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m157056n(roj0 roj0Var) {
        CoreModule.f17545c.f19639e0.f149452q1.put(Boolean.TRUE);
        CoreModule.f17545c.f19639e0.m169397H9();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        CoreModule.f17545c.f19555C0.m210112u4();
        f136294b.m132487l(roj0.f160388a);
        CoreModule.f17545c.f19663m0.m31043R5();
        CoreModule.f17545c.f19663m0.m31127m8();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m157057o(c4g0 c4g0Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(c4g0Var);
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m157059q(String str, Act act, String str2, String str3, dd80 dd80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            lva.m151843D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            zvf0.m220396r(str2, str3);
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m157060r(String str, Act act, String str2, String str3, dd80 dd80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            lva.m151843D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            zvf0.m220396r(str2, str3);
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m157062t(Act act, String str, View view) {
        act.startActivity(ProfileAct.m50738p2(act, CoreModule.m29931H().userId(), "", false, true));
        zvf0.m220396r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m157063u(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m157064v(Act act, Runnable runnable, dd80 dd80Var, String str, View view) {
        m157035O(act, Gender.get("female"), runnable);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "female");
        map.put("fake_gender_original", CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "female" : "male");
        zvf0.m220397s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m157067y(String str, dd80 dd80Var, View view) {
        zvf0.m220396r("e_choose_close", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m157068z(String str, User user, final FakeGuideData fakeGuideData, dd80 dd80Var, Act act, View view) {
        zvf0.m220396r("e_change_secondary_avatar", str);
        int iM200293G = vwb.m200293G(user.pictures, new w9j() { // from class: l.uxf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf(NullChecker.m81303a(media) && NullChecker.m81303a(media.url) && media.url.contains(fakeGuideData.identifier));
            }
        });
        if (iM200293G < 0 || iM200293G >= user.pictures.size()) {
            dd80Var.dismiss();
            return;
        }
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.pictures.get(0).tags.clear();
        userMo223809clone.pictures.get(iM200293G).tags.clear();
        Collections.swap(userMo223809clone.pictures, 0, iM200293G);
        pj90.m169787D(act, userMo223809clone, new Runnable() { // from class: l.vxf
            @Override // java.lang.Runnable
            public final void run() {
                osi0.m165783g("更换成功");
            }
        }, null);
    }
}
