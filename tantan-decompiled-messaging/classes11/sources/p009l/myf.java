package p009l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.fake.C0009a;
import com.p000p1.mobile.putong.core.newui.fake.C0010b;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.RepeatNetPictureDlgConfig;
import com.p1.mobile.putong.core.data.RepeatNetPictureDlgContent;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.LiveUserLevel;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import l.c30;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.e51;
import l.f6c0;
import l.gk90;
import l.j760;
import l.lva;
import l.mkd0;
import l.ogl0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.wm20;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.subjects.b;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class myf {

    /* JADX INFO: renamed from: a */
    public static cwf0 f17153a = new cwf0("p_fake_gender_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: b */
    public static b<roj0> f17154b = b.b();

    /* JADX INFO: renamed from: c */
    public static long f17155c = 0;

    /* JADX INFO: renamed from: d */
    public static String f17156d = "noPictureDlg";

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m18679A(PrivacyMembershipSetting privacyMembershipSetting, final Act act) {
        zvf0.u("e_fake_togood_privacy_button", "p_fake_togood_privacy", new j760[]{vwb.Y("button_type_fake", "open")});
        osi0.g("您已完成隐私设置，后续可以在首页右上角入口进入更改");
        PrivacyMembershipSetting privacyMembershipSettingClone = privacyMembershipSetting.clone();
        privacyMembershipSettingClone.showMeToMyLike = Boolean.TRUE;
        CoreModule.c.E0.R3(privacyMembershipSettingClone);
        e51.H(act, new Runnable() { // from class: l.dyf
            @Override // java.lang.Runnable
            public final void run() {
                myf.m18713m(act);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: B */
    public static void m18680B() {
        CoreModule.c.e0.u5.clear();
        CoreModule.c.e0.v5.clear();
        CoreModule.c.e0.w5.clear();
        CoreModule.c.e0.x5.clear();
        CoreModule.c.e0.y5.clear();
        CoreModule.c.e0.z5.clear();
    }

    /* JADX INFO: renamed from: C */
    public static void m18681C() {
        if (ogl0.C()) {
            CoreModule.c.F2.f3();
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m18682D() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.y5.get())) {
            return ((Integer) CoreModule.c.e0.z5.get()).intValue();
        }
        CoreModule.c.e0.y5.put(str);
        CoreModule.c.e0.z5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static Intent m18683E(Act act) {
        return MediaPickerAct.m9216X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build());
    }

    /* JADX INFO: renamed from: F */
    public static int m18684F() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.u5.get())) {
            return ((Integer) CoreModule.c.e0.v5.get()).intValue();
        }
        CoreModule.c.e0.u5.put(str);
        CoreModule.c.e0.v5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public static int m18685G() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.w5.get())) {
            return ((Integer) CoreModule.c.e0.x5.get()).intValue();
        }
        CoreModule.c.e0.w5.put(str);
        CoreModule.c.e0.x5.put(0);
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static String m18686H() {
        return f17156d;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m18687I() {
        if (!CoreModule.c.e0.Z7() && !CoreModule.c.e0.c8() && NullChecker.a(upa.Z0())) {
            int i = upa.Z0().trigger.aiPictureFrequency;
            int i2 = upa.Z0().trigger.totalFrequency;
            int iM18682D = m18682D();
            int iM18684F = m18684F() + m18685G() + iM18682D;
            if (iM18682D < i && iM18684F < i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m18688J() {
        if (!NullChecker.a(upa.Z0())) {
            return false;
        }
        int i = upa.Z0().trigger.netPictureFrequency;
        int i2 = upa.Z0().trigger.totalFrequency;
        int iM18682D = m18682D();
        int iM18684F = m18684F();
        return iM18684F < i && (m18685G() + iM18684F) + iM18682D < i2;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m18689K() {
        if (!NullChecker.a(upa.Z0())) {
            return false;
        }
        int i = upa.Z0().trigger.repeatPictureFrequency;
        int i2 = upa.Z0().trigger.totalFrequency;
        int iM18682D = m18682D();
        int iM18684F = m18684F();
        int iM18685G = m18685G();
        return iM18685G < i && (iM18684F + iM18685G) + iM18682D < i2;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m18690L() {
        LiveUserLevel liveUserLevel = CoreModule.c.e0.na().hierarchy;
        if (!NullChecker.a(liveUserLevel) || (liveUserLevel.superGrade <= 0 && liveUserLevel.grade < 38)) {
            return xma.F3();
        }
        return true;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m18691M(User user) {
        return NullChecker.a(user.status) && user.status.contains(UserStatus.get("hidden"));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m18692N() {
        if (!vwb.J(CoreModule.c.e0.p9().pictures)) {
            Picture picture = (Media) CoreModule.c.e0.p9().pictures.get(0);
            if (picture instanceof Picture) {
                return picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static void m18693O(final Act act, Gender gender, Runnable runnable) {
        if (TEnum.equals(CoreModule.c.e0.p9().gender, gender)) {
            runnable.run();
            CoreModule.c.e0.q1.put(Boolean.TRUE);
            return;
        }
        act.progress(R.string.J5);
        User user = new User();
        user.gender = gender;
        Settings settings = new Settings();
        settings.lookingFor = LookingFor.get(TEnum.equals(gender, "female") ? "male" : "female");
        user.settings = settings;
        act.duringCreated(f17154b.take(1)).subscribe(mkd0.G(new e30() { // from class: l.ayf
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        CoreModule.c.e0.u9(user).subscribe(mkd0.H(new e30() { // from class: l.byf
            public final void call(Object obj) {
                myf.m18714n((roj0) obj);
            }
        }, new e30() { // from class: l.cyf
            public final void call(Object obj) {
                myf.m18705e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static void m18694P() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.y5.get())) {
            tpd0 tpd0Var = CoreModule.c.e0.z5;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            CoreModule.c.e0.y5.put(str);
            CoreModule.c.e0.z5.put(1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m18695Q() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.u5.get())) {
            tpd0 tpd0Var = CoreModule.c.e0.v5;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            CoreModule.c.e0.u5.put(str);
            CoreModule.c.e0.v5.put(1);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m18696R() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.e0.w5.get())) {
            tpd0 tpd0Var = CoreModule.c.e0.x5;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            CoreModule.c.e0.w5.put(str);
            CoreModule.c.e0.x5.put(1);
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
    public static void m18697S(@NonNull final Act act, String str) {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfigZ0;
        Media media;
        String str2;
        final String str3;
        cwf0 cwf0VarM16062c;
        final dd80 dd80VarO;
        VText_Bold vText_BoldFindViewById;
        VText_Bold vText_BoldFindViewById2;
        VText_Bold vText_BoldFindViewById3;
        RepeatNetPictureDlgContent repeatNetPictureDlgContentNew_;
        TextView textView;
        final String str4;
        final String str5;
        if (TextUtils.equals(str, "noPictureDlg") || !TextUtils.equals(f17156d, "noPictureDlg") || (repeatNetPictureDlgConfigZ0 = upa.Z0()) == null) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isAudit()) {
            return;
        }
        if (!userP9.isPicVerificationVerified() || TextUtils.equals(str, "aiPictureDlg")) {
            if (!TextUtils.equals(str, "aiPictureDlg") || m18687I()) {
                if (!TextUtils.equals(str, "netPictureDlg") || m18688J()) {
                    if ((TextUtils.equals(str, "repeatPictureDlg") && !m18689K()) || (media = (Media) userP9.pictures.get(0)) == null || TextUtils.isEmpty(media.url)) {
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
                            cwf0VarM16062c = i0e.m16062c(str3, Dialog.class.getName());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("lowquality_reason", str6);
                            cwf0VarM16062c.o(jSONObject);
                            View viewInflate = LayoutInflater.from(act).inflate(f6c0.bc, (ViewGroup) null);
                            dd80VarO = new dd80.a(act).R(viewInflate).P(false).O();
                            dd80VarO.setCanceledOnTouchOutside(false);
                            VImage vImageFindViewById = viewInflate.findViewById(u4c0.A1);
                            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.O);
                            VImage vImageFindViewById2 = viewInflate.findViewById(u4c0.Hc);
                            VText_Bold vText_BoldFindViewById4 = viewInflate.findViewById(u4c0.ge);
                            VText vTextFindViewById = viewInflate.findViewById(u4c0.Zc);
                            vText_BoldFindViewById = viewInflate.findViewById(u4c0.be);
                            vText_BoldFindViewById2 = viewInflate.findViewById(u4c0.M0);
                            vText_BoldFindViewById3 = viewInflate.findViewById(u4c0.N0);
                            xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.lxf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m18725y(str3, dd80VarO, view);
                                }
                            });
                            qib0.G.L0(vDraweeViewFindViewById, media.url);
                            vImageFindViewById2.setImageResource(x2c0.yp);
                            repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                            if (TextUtils.equals(str, "repeatPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.repeatPictureDlg;
                            } else if (TextUtils.equals(str, "netPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.netPictureDlg;
                            } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.swipeLimitDlg;
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.aiPictureDlg;
                            }
                            vText_BoldFindViewById4.setText(repeatNetPictureDlgContentNew_.title);
                            vTextFindViewById.setText(repeatNetPictureDlgContentNew_.subTitle1);
                            if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                                xdl0.M(vText_BoldFindViewById, false);
                            } else {
                                vText_BoldFindViewById.setText(repeatNetPictureDlgContentNew_.subTitle2);
                            }
                            if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button1)) {
                                textView = vText_BoldFindViewById2;
                            } else {
                                textView = vText_BoldFindViewById2;
                                textView.setText(repeatNetPictureDlgContentNew_.button1);
                            }
                            if (!TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button2)) {
                                vText_BoldFindViewById3.setText(repeatNetPictureDlgContentNew_.button2);
                            }
                            final String str7 = repeatNetPictureDlgContentNew_.buttonLink1;
                            final String str8 = repeatNetPictureDlgContentNew_.buttonLink2;
                            str4 = repeatNetPictureDlgContentNew_.buttonEid1;
                            str5 = repeatNetPictureDlgContentNew_.buttonEid2;
                            xdl0.E0(textView, new View.OnClickListener() { // from class: l.wxf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m18717q(str7, act, str4, str3, dd80VarO, view);
                                }
                            });
                            xdl0.E0(vText_BoldFindViewById3, new View.OnClickListener() { // from class: l.eyf
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    myf.m18718r(str8, act, str5, str3, dd80VarO, view);
                                }
                            });
                            if (c30.f(act)) {
                                dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fyf
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        myf.f17156d = "noPictureDlg";
                                    }
                                });
                                f17156d = str;
                                dd80VarO.show();
                                i0e.m16065f(cwf0VarM16062c);
                                if (!TextUtils.isEmpty(str4)) {
                                    zvf0.x(str4, str3);
                                }
                                if (!TextUtils.isEmpty(str5)) {
                                    zvf0.x(str5, str3);
                                }
                            }
                            if (TextUtils.equals(str, "netPictureDlg")) {
                                m18695Q();
                                CoreModule.c.e0.a7("net");
                            } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                                m18696R();
                                CoreModule.c.e0.a7("repeat");
                            } else if (TextUtils.equals(str, "aiPictureDlg")) {
                                m18694P();
                                CoreModule.c.e0.a7("ai_manual");
                            }
                        }
                        if (!TextUtils.equals(str, "netPictureDlg")) {
                            str6 = TextUtils.equals(str, "aiPictureDlg") ? "ai_picture" : "repeat_picture";
                        }
                        if (!TextUtils.equals(str, "aiPictureDlg")) {
                            m18681C();
                        }
                        str2 = "p_change_avatar_reminder_popup";
                        jSONObject.put("lowquality_reason", str6);
                        cwf0VarM16062c.o(jSONObject);
                    } catch (JSONException unused) {
                    }
                    str3 = str2;
                    cwf0VarM16062c = i0e.m16062c(str3, Dialog.class.getName());
                    JSONObject jSONObject2 = new JSONObject();
                    View viewInflate2 = LayoutInflater.from(act).inflate(f6c0.bc, (ViewGroup) null);
                    dd80VarO = new dd80.a(act).R(viewInflate2).P(false).O();
                    dd80VarO.setCanceledOnTouchOutside(false);
                    VImage vImageFindViewById3 = viewInflate2.findViewById(u4c0.A1);
                    VDraweeView vDraweeViewFindViewById2 = viewInflate2.findViewById(u4c0.O);
                    VImage vImageFindViewById4 = viewInflate2.findViewById(u4c0.Hc);
                    VText_Bold vText_BoldFindViewById5 = viewInflate2.findViewById(u4c0.ge);
                    VText vTextFindViewById2 = viewInflate2.findViewById(u4c0.Zc);
                    vText_BoldFindViewById = viewInflate2.findViewById(u4c0.be);
                    vText_BoldFindViewById2 = viewInflate2.findViewById(u4c0.M0);
                    vText_BoldFindViewById3 = viewInflate2.findViewById(u4c0.N0);
                    xdl0.E0(vImageFindViewById3, new View.OnClickListener() { // from class: l.lxf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m18725y(str3, dd80VarO, view);
                        }
                    });
                    qib0.G.L0(vDraweeViewFindViewById2, media.url);
                    vImageFindViewById4.setImageResource(x2c0.yp);
                    repeatNetPictureDlgContentNew_ = RepeatNetPictureDlgContent.new_();
                    if (TextUtils.equals(str, "repeatPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.repeatPictureDlg;
                    } else if (TextUtils.equals(str, "netPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.netPictureDlg;
                    } else if (TextUtils.equals(str, "swipeLimitDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.swipeLimitDlg;
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        repeatNetPictureDlgContentNew_ = repeatNetPictureDlgConfigZ0.aiPictureDlg;
                    }
                    vText_BoldFindViewById5.setText(repeatNetPictureDlgContentNew_.title);
                    vTextFindViewById2.setText(repeatNetPictureDlgContentNew_.subTitle1);
                    if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.subTitle2)) {
                        vText_BoldFindViewById.setText(repeatNetPictureDlgContentNew_.subTitle2);
                    } else {
                        xdl0.M(vText_BoldFindViewById, false);
                    }
                    if (TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button1)) {
                        textView = vText_BoldFindViewById2;
                        textView.setText(repeatNetPictureDlgContentNew_.button1);
                    } else {
                        textView = vText_BoldFindViewById2;
                    }
                    if (!TextUtils.isEmpty(repeatNetPictureDlgContentNew_.button2)) {
                        vText_BoldFindViewById3.setText(repeatNetPictureDlgContentNew_.button2);
                    }
                    final String str9 = repeatNetPictureDlgContentNew_.buttonLink1;
                    final String str10 = repeatNetPictureDlgContentNew_.buttonLink2;
                    str4 = repeatNetPictureDlgContentNew_.buttonEid1;
                    str5 = repeatNetPictureDlgContentNew_.buttonEid2;
                    xdl0.E0(textView, new View.OnClickListener() { // from class: l.wxf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m18717q(str9, act, str4, str3, dd80VarO, view);
                        }
                    });
                    xdl0.E0(vText_BoldFindViewById3, new View.OnClickListener() { // from class: l.eyf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            myf.m18718r(str10, act, str5, str3, dd80VarO, view);
                        }
                    });
                    if (c30.f(act)) {
                        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fyf
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                myf.f17156d = "noPictureDlg";
                            }
                        });
                        f17156d = str;
                        dd80VarO.show();
                        i0e.m16065f(cwf0VarM16062c);
                        if (!TextUtils.isEmpty(str4)) {
                            zvf0.x(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            zvf0.x(str5, str3);
                        }
                    }
                    if (TextUtils.equals(str, "netPictureDlg")) {
                        m18695Q();
                        CoreModule.c.e0.a7("net");
                    } else if (TextUtils.equals(str, "repeatPictureDlg")) {
                        m18696R();
                        CoreModule.c.e0.a7("repeat");
                    } else if (TextUtils.equals(str, "aiPictureDlg")) {
                        m18694P();
                        CoreModule.c.e0.a7("ai_manual");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m18698T(final Act act, final Runnable runnable) {
        View viewInflate = act.getLayoutInflater().inflate(f6c0.e3, (ViewGroup) null, false);
        qib0.G.J0(viewInflate.findViewById(u4c0.O), CoreModule.c.e0.p9().fp().profileMiddle(), false);
        viewInflate.findViewById(u4c0.ge).setText(R.string.N4);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.b1);
        vButtonFindViewById.setText(R.string.L4);
        VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.c1);
        vButtonFindViewById2.setText(R.string.M4);
        final dd80 dd80VarO = new dd80.a(act).P(false).M(false).R(viewInflate).O();
        final String str = "p_fake_gender_popup";
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.gyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m18709i(act, runnable, dd80VarO, str, view);
            }
        });
        vButtonFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.hyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m18722v(act, runnable, dd80VarO, str, view);
            }
        });
        final c4g0 c4g0VarSubscribe = act.duringCreated(C0010b.m349r().m363q(), false).subscribe(mkd0.G(new e30() { // from class: l.iyf
            public final void call(Object obj) {
                myf.m18721u(dd80VarO, (roj0) obj);
            }
        }));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jyf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                myf.m18704d(c4g0VarSubscribe, dialogInterface);
            }
        });
        dd80VarO.show();
        i0e.m16065f(f17153a);
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.c.e0.p9().isFemale() ? "female" : "male");
        zvf0.y("e_fake_alert_gender", "p_fake_gender_popup", map);
        HashMap map2 = new HashMap();
        map2.put("fake_gender", "female");
        map2.put("fake_gender_original", CoreModule.c.e0.p9().isFemale() ? "female" : "male");
        zvf0.y("e_fake_alert_gender", "p_fake_gender_popup", map2);
    }

    /* JADX INFO: renamed from: U */
    public static void m18699U(final Act act) {
        act.duringCreated(CoreModule.c.E0.Z3()).subscribe(mkd0.G(new e30() { // from class: l.txf
            public final void call(Object obj) {
                myf.m18712l(act, (PrivacyMembershipSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static void m18700V(@NonNull final Act act, @NonNull final FakeGuideData fakeGuideData) {
        final Act act2;
        final User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null || TextUtils.isEmpty(fakeGuideData.identifier) || userP9.isAudit() || !vwb.m(userP9.pictures, new w9j() { // from class: l.kyf
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.contains(fakeGuideData.identifier));
            }
        })) {
            return;
        }
        final String str = "mainAvatar".equals(fakeGuideData.type) ? "p_fake_change_avatar_popup" : "p_secondary_avatar_change_popup";
        final cwf0 cwf0VarM16062c = i0e.m16062c(str, Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", ((DbObject) userP9).id);
            cwf0VarM16062c.o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.bc, (ViewGroup) null);
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(false).O();
        dd80VarO.setCanceledOnTouchOutside(false);
        VImage vImageFindViewById = viewInflate.findViewById(u4c0.A1);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.O);
        VImage vImageFindViewById2 = viewInflate.findViewById(u4c0.Hc);
        VText_Bold vText_BoldFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.Zc);
        VText_Bold vText_BoldFindViewById2 = viewInflate.findViewById(u4c0.be);
        VText_Bold vText_BoldFindViewById3 = viewInflate.findViewById(u4c0.M0);
        VText_Bold vText_BoldFindViewById4 = viewInflate.findViewById(u4c0.N0);
        xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.lyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myf.m18707g(str, dd80VarO, view);
            }
        });
        qib0.G.L0(vDraweeViewFindViewById, fakeGuideData.identifier);
        if ("mainAvatar".equals(fakeGuideData.type)) {
            vImageFindViewById2.setImageResource(x2c0.yp);
            vText_BoldFindViewById.setText("更换真实头像");
            vTextFindViewById.setText("当前使用的照片不真实，被喜欢的概率较低。请立即更换为本人五官清晰的正面照片，获得更多曝光，收获喜欢。");
            vText_BoldFindViewById2.setText("收到5次提醒仍未更换，系统将限制你在划卡的曝光。");
            vText_BoldFindViewById3.setText("更换头像");
            vText_BoldFindViewById4.setText("头像示例");
            xdl0.E0(vText_BoldFindViewById3, new View.OnClickListener() { // from class: l.mxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m18720t(act, str, view);
                }
            });
            xdl0.E0(vText_BoldFindViewById4, new View.OnClickListener() { // from class: l.nxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m18708h(act, userP9, str, view);
                }
            });
            act2 = act;
        } else {
            vImageFindViewById2.setImageResource(x2c0.zp);
            vText_BoldFindViewById.setText("使用真实照片作为主头像");
            vTextFindViewById.setText("当前使用的照片不真实，建议使用系统推荐已有的照片作为主头像，或更换清晰正面照，获得更多曝光，收获喜欢。");
            vText_BoldFindViewById2.setText("连续3天收到提醒仍未修改，系统会默认更换。");
            vText_BoldFindViewById3.setText("立即使用");
            vText_BoldFindViewById4.setText("修改主头像");
            act2 = act;
            xdl0.E0(vText_BoldFindViewById3, new View.OnClickListener() { // from class: l.oxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m18726z(str, userP9, fakeGuideData, dd80VarO, act2, view);
                }
            });
            xdl0.E0(vText_BoldFindViewById4, new View.OnClickListener() { // from class: l.pxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    myf.m18710j(act2, str, view);
                }
            });
        }
        final c4g0 c4g0VarSubscribe = act2.duringCreated(CoreModule.c.e0.o9().distinctUntilChanged().filter(new w9j() { // from class: l.qxf
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.a(user) && user.isAudit());
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.rxf
            public final void call(Object obj) {
                dd80VarO.dismiss();
            }
        }));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sxf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                myf.m18715o(c4g0VarSubscribe, cwf0VarM16062c, dialogInterface);
            }
        });
        if (c30.f(act2)) {
            dd80VarO.show();
            i0e.m16065f(cwf0VarM16062c);
            CoreModule.c.e0.r5.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.e0.s5.a(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m18704d(c4g0 c4g0Var, DialogInterface dialogInterface) {
        mkd0.z(c4g0Var);
        i0e.m16064e(f17153a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m18705e(Throwable th) {
        f17154b.onNext(roj0.a);
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m18707g(String str, dd80 dd80Var, View view) {
        zvf0.r("e_choose_close", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18708h(Act act, User user, String str, View view) {
        gk90.e(act, user.gender, wm20.k(act), (d30) null);
        zvf0.r("e_fake_alert_popup_example", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m18709i(Act act, Runnable runnable, dd80 dd80Var, String str, View view) {
        m18693O(act, Gender.get("male"), runnable);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "male");
        map.put("fake_gender_original", CoreModule.c.e0.p9().isFemale() ? "female" : "male");
        zvf0.s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m18710j(Act act, String str, View view) {
        act.startActivity(ProfileAct.p2(act, CoreModule.H().userId(), "", false, true));
        zvf0.r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m18712l(final Act act, final PrivacyMembershipSetting privacyMembershipSetting) {
        if (CoreModule.c.e0.Z7() && NullChecker.a(privacyMembershipSetting)) {
            final cwf0 cwf0VarM16062c = i0e.m16062c("p_fake_togood_privacy", dd80.class.getName());
            i0e.m16065f(cwf0VarM16062c);
            new dd80.a(act).y0("隐私保护功能可用").t0("为了保护您的隐私，您可以选择只对您右滑过的人可见").P(false).c0("打开", new Runnable() { // from class: l.xxf
                @Override // java.lang.Runnable
                public final void run() {
                    myf.m18679A(privacyMembershipSetting, act);
                }
            }).X("不用了", new Runnable() { // from class: l.yxf
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.u("e_fake_togood_privacy_button", "p_fake_togood_privacy", new j760[]{vwb.Y("button_type_fake", "close")});
                }
            }).n0(new DialogInterface.OnDismissListener() { // from class: l.zxf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m16064e(cwf0VarM16062c);
                }
            }).O().show();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m18713m(Act act) {
        C0009a c0009a = new C0009a(act);
        c0009a.setCanceledOnTouchOutside(false);
        c0009a.show();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m18714n(roj0 roj0Var) {
        CoreModule.c.e0.q1.put(Boolean.TRUE);
        CoreModule.c.e0.H9();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        CoreModule.c.C0.u4();
        f17154b.onNext(roj0.a);
        CoreModule.c.m0.R5();
        CoreModule.c.m0.m8();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m18715o(c4g0 c4g0Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.z(c4g0Var);
        i0e.m16064e(cwf0Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m18717q(String str, Act act, String str2, String str3, dd80 dd80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            lva.D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            zvf0.r(str2, str3);
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m18718r(String str, Act act, String str2, String str3, dd80 dd80Var, View view) {
        if (!TextUtils.isEmpty(str)) {
            lva.D(act, Uri.parse(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            zvf0.r(str2, str3);
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m18720t(Act act, String str, View view) {
        act.startActivity(ProfileAct.p2(act, CoreModule.H().userId(), "", false, true));
        zvf0.r("e_change_avatar", str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m18721u(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m18722v(Act act, Runnable runnable, dd80 dd80Var, String str, View view) {
        m18693O(act, Gender.get("female"), runnable);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        HashMap map = new HashMap();
        map.put("fake_gender", "female");
        map.put("fake_gender_original", CoreModule.c.e0.p9().isFemale() ? "female" : "male");
        zvf0.s("e_fake_alert_gender", str, map);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m18725y(String str, dd80 dd80Var, View view) {
        zvf0.r("e_choose_close", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m18726z(String str, User user, final FakeGuideData fakeGuideData, dd80 dd80Var, Act act, View view) {
        zvf0.r("e_change_secondary_avatar", str);
        int iG = vwb.G(user.pictures, new w9j() { // from class: l.uxf
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf(NullChecker.a(media) && NullChecker.a(media.url) && media.url.contains(fakeGuideData.identifier));
            }
        });
        if (iG < 0 || iG >= user.pictures.size()) {
            dd80Var.dismiss();
            return;
        }
        User userClone = user.clone();
        ((Media) userClone.pictures.get(0)).tags.clear();
        ((Media) userClone.pictures.get(iG)).tags.clear();
        Collections.swap(userClone.pictures, 0, iG);
        pj90.m20459D(act, userClone, new Runnable() { // from class: l.vxf
            @Override // java.lang.Runnable
            public final void run() {
                osi0.g("更换成功");
            }
        }, null);
    }
}
