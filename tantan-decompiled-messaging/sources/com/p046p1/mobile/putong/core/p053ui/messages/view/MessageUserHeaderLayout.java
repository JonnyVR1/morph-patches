package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.baidu.mapapi.model.LatLng;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.aboutme.MessageAboutMeContentView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.c4g0;
import p149l.d90;
import p149l.e30;
import p149l.e51;
import p149l.fcz;
import p149l.hmb;
import p149l.i0g0;
import p149l.j760;
import p149l.jjb0;
import p149l.jly;
import p149l.jzz;
import p149l.kzz;
import p149l.l6c0;
import p149l.lzz;
import p149l.mjj;
import p149l.mkd0;
import p149l.ml6;
import p149l.o6j0;
import p149l.o7r;
import p149l.qc2;
import p149l.qib0;
import p149l.rw6;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.wmz;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;
import p149l.zxz;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class MessageUserHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public FrameLayout f32449A;

    /* JADX INFO: renamed from: B */
    public VLinear f32450B;

    /* JADX INFO: renamed from: C */
    public VText f32451C;

    /* JADX INFO: renamed from: D */
    public VText f32452D;

    /* JADX INFO: renamed from: E */
    public VText f32453E;

    /* JADX INFO: renamed from: E0 */
    public View f32454E0;

    /* JADX INFO: renamed from: F */
    public VText f32455F;

    /* JADX INFO: renamed from: F0 */
    public VText f32456F0;

    /* JADX INFO: renamed from: G */
    public TextView f32457G;

    /* JADX INFO: renamed from: G0 */
    public VText f32458G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f32459H;

    /* JADX INFO: renamed from: H0 */
    public VText f32460H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f32461I;

    /* JADX INFO: renamed from: I0 */
    public View f32462I0;

    /* JADX INFO: renamed from: J */
    public VImage f32463J;

    /* JADX INFO: renamed from: J0 */
    public MessageAboutMeContentView f32464J0;

    /* JADX INFO: renamed from: K */
    public VText f32465K;

    /* JADX INFO: renamed from: K0 */
    public int f32466K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f32467L;

    /* JADX INFO: renamed from: L0 */
    public Question f32468L0;

    /* JADX INFO: renamed from: M */
    public VImage f32469M;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f32470M0;

    /* JADX INFO: renamed from: N */
    public VText f32471N;

    /* JADX INFO: renamed from: N0 */
    public TextView f32472N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f32473O;

    /* JADX INFO: renamed from: O0 */
    public MessageIdealTypeHeadLayout f32474O0;

    /* JADX INFO: renamed from: P */
    public VImage f32475P;

    /* JADX INFO: renamed from: P0 */
    public boolean f32476P0;

    /* JADX INFO: renamed from: Q */
    public VText f32477Q;

    /* JADX INFO: renamed from: Q0 */
    public String f32478Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f32479R;

    /* JADX INFO: renamed from: S */
    public VImage f32480S;

    /* JADX INFO: renamed from: T */
    public VText f32481T;

    /* JADX INFO: renamed from: U */
    public boolean f32482U;

    /* JADX INFO: renamed from: V */
    public String f32483V;

    /* JADX INFO: renamed from: W */
    public CharSequence f32484W;

    /* JADX INFO: renamed from: a */
    public FrameLayout f32485a;

    /* JADX INFO: renamed from: b */
    public VLinear f32486b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f32487c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32488d;

    /* JADX INFO: renamed from: e */
    public VImage f32489e;

    /* JADX INFO: renamed from: f */
    public VImage f32490f;

    /* JADX INFO: renamed from: g */
    public VLinear f32491g;

    /* JADX INFO: renamed from: h */
    public TextView f32492h;

    /* JADX INFO: renamed from: i */
    public TextView f32493i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f32494j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f32495k;

    /* JADX INFO: renamed from: k0 */
    public CharSequence f32496k0;

    /* JADX INFO: renamed from: l */
    public FrameLayout f32497l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f32498m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f32499n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f32500o;

    /* JADX INFO: renamed from: p */
    public VImage f32501p;

    /* JADX INFO: renamed from: p0 */
    public CharSequence f32502p0;

    /* JADX INFO: renamed from: q */
    public VImage f32503q;

    /* JADX INFO: renamed from: r */
    public ViewStub f32504r;

    /* JADX INFO: renamed from: s */
    public VText f32505s;

    /* JADX INFO: renamed from: t */
    public ViewStub f32506t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f32507u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f32508v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f32509w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f32510x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f32511y;

    /* JADX INFO: renamed from: z */
    public VImage f32512z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout$a */
    public class C8597a implements C8524b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f32513a;

        public C8597a(fcz fczVar) {
            this.f32513a = fczVar;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return this.f32513a.mo120828r3();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return this.f32513a.mo120828r3();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return CoreModule.m29935P().m94658i().mo158216D() && this.f32513a.mo120719V2() && !User.isTeamAccount(this.f32513a.mo120828r3());
        }
    }

    public MessageUserHeaderLayout(Context context) {
        super(context);
        this.f32482U = false;
        this.f32483V = "";
        this.f32484W = "";
        this.f32496k0 = "";
        this.f32502p0 = "";
        this.f32468L0 = null;
        this.f32476P0 = false;
        this.f32478Q0 = "";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m49960B(List list, final Tag tag, final Tag tag2) {
        return vwb.m200293G(list, new w9j() { // from class: l.wyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.m200293G(list, new w9j() { // from class: l.xyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static String m49964I(float f, String str) {
        String str2;
        if (f < 1000.0f) {
            str2 = i0g0.f110325b.format(f) + CoreModule.f17544b.getString(R$string.f20873U4);
        } else {
            str2 = i0g0.f110325b.format(f / 1000.0f) + CoreModule.f17544b.getString(R$string.f20993i4);
        }
        return str + "(" + str2 + ")";
    }

    /* JADX INFO: renamed from: L */
    public static String m49965L(User user) {
        Region region = user.location.region;
        String string = region.country;
        if (!TextUtils.isEmpty(region.city) || !TextUtils.isEmpty(user.location.region.district)) {
            StringBuilder sb = new StringBuilder();
            String str = user.location.region.city;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            String str2 = user.location.region.district;
            sb.append(str2 != null ? str2 : "");
            string = sb.toString();
        }
        Settings settings = CoreModule.f17545c.f19639e0.m169520na().settings;
        if (!jjb0.m141785c() || !NullChecker.m81303a(settings) || settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue() || user.location.distance <= settings.getSearchRadius().intValue()) {
            return m49964I(user.location.distance, string);
        }
        j760<String, String> j760VarM133859Z = i0g0.m133859Z(CoreModule.f17545c.f19639e0.m169520na(), user.location, false);
        return (j760VarM133859Z.f116564a + j760VarM133859Z.f116565b).toString();
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m49966P(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, width, height);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        return bitmapCreateBitmap;
    }

    private String getCheckTxt() {
        String strM79302F = RemoteConfig.m79298x().m79302F("icebreaking_check_txt");
        String string = CoreModule.f17544b.getString(R$string.f20850R5);
        if (!TextUtils.isEmpty(strM79302F)) {
            try {
                String strOptString = new JSONObject(strM79302F).optString("content");
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
            } catch (JSONException unused) {
            }
        }
        return string;
    }

    private int getIntlInstantMatchTagIcon() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                return c3c0.f78677Y0;
            case "ja":
                return c3c0.f78685Z0;
            case "ko":
                return c3c0.f78694a1;
            case "th":
                return c3c0.f78703b1;
            case "vi":
                return c3c0.f78712c1;
            case "zh":
                return (Locale.getDefault().getCountry() == "TW" || Locale.getDefault().getCountry() == "HK" || Locale.getDefault().getCountry() == "MO") ? c3c0.f78730e1 : c3c0.f78721d1;
            default:
                return c3c0.f78669X0;
        }
    }

    private void setMatchIcon(User user) {
        VImage vImage = this.f32501p;
        if (m50040s0()) {
            vImage = this.f32512z;
        }
        if (user == null || vImage == null || m50022a0(user)) {
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.status) && ((TEnum.equals(user.localRelationship.state, "matched") || TEnum.equals(user.localRelationship.state, "liked")) && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.m29935P().m94658i().mo158233G1())) {
            vImage.setVisibility(0);
            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                vImage.setImageResource(c3c0.f78804m3);
                return;
            } else {
                vImage.setImageResource(c3c0.f78795l3);
                return;
            }
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && CoreModule.m29935P().m94658i().mo158233G1()) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.f78831p3);
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158291Q4(user.f56011id)) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.f78753g6);
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.f78822o3);
            return;
        }
        Relationship relationship = user.localRelationship;
        if ((relationship != null && !TEnum.equals(relationship.state, "default") && !TEnum.equals(user.localRelationship.state, "unknown_")) || !NullChecker.m81303a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            vImage.setVisibility(8);
        } else {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.f78813n3);
        }
    }

    private void setOldDateInfo(String str) {
        if (NullChecker.m81303a(this.f32505s) && NullChecker.m81303a(str)) {
            this.f32505s.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m49989w(e30 e30Var, d90 d90Var) {
        if (d90Var == null) {
            e30Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(d90Var.mo110406c())) {
            e30Var.call(d90Var.mo110406c());
        } else if (TextUtils.isEmpty(d90Var.mo110409f())) {
            e30Var.call("");
        } else {
            e30Var.call(d90Var.mo110409f());
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m49990x(String str, MessageAboutMeContentView messageAboutMeContentView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220368A("e_chat_sayhi_card", str, j760.m140076a("chat_card_content_category", messageAboutMeContentView.getShowedTrackParams()), j760.m140076a("chat_card_content", messageAboutMeContentView.getShowContent()));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m49993A0(final Act act, final User user, final User user2, Conversation conversation) {
        if (m50022a0(user2)) {
            return;
        }
        if (!m50040s0()) {
            xdl0.m208344M(this.f32505s, false);
            return;
        }
        Question question = this.f32468L0;
        if (question == null) {
            e51.m114774y(new Runnable() { // from class: l.ezz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93945a.m50035n0(act, user, user2);
                }
            });
        } else {
            m49994B0(act, user, user2, question);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m49994B0(final Act act, final User user, final User user2, final Question question) {
        m50011O(act, user2, new e30() { // from class: l.iyz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115518a.m50036o0(user2, user, act, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m49995C0() {
        LinearLayout linearLayout = this.f32498m;
        if (linearLayout == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = t100.m186890d(232.0f);
        layoutParams.height = -2;
        this.f32498m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m49996D0(User user, Conversation conversation) {
        if (this.f32504r == null) {
            return;
        }
        if (ml6.m155119d(conversation)) {
            xdl0.m208344M(this.f32503q, true);
            m50007K(this.f32503q);
            this.f32503q.setBackgroundResource(getIntlInstantMatchTagIcon());
        }
        if (ml6.m155119d(conversation)) {
            qib0.f154691G.m102324I("https://auto.tancdn.com/v1/images/eyJpZCI6IlNCTEpVREI2RFdQTkw0U09OVkczNjZVUTZOVEhZNjE0IiwidyI6NDIwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjYwOTgxMTY1Nzc5NTE3NDR9.png", new e30() { // from class: l.gzz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f105190a.m50037p0((Bitmap) obj);
                }
            });
        } else if (ml6.m155121f(conversation)) {
            qib0.f154691G.m102324I("https://auto.tancdn.com/v1/raw/ce8a6af5-70b4-4386-b63e-8aebd6f11c5d14.webp", new e30() { // from class: l.hzz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110238a.m50038q0((Bitmap) obj);
                }
            });
        } else {
            this.f32498m.setBackgroundResource(c3c0.f78839q2);
        }
        boolean zM203803z3 = CoreModule.f17545c.f19561E0.m203803z3(user);
        if (this.f32454E0 == null) {
            View viewInflate = this.f32504r.inflate();
            this.f32454E0 = viewInflate;
            this.f32456F0 = (VText) viewInflate.findViewById(y4c0.f196093a5);
            this.f32458G0 = (VText) this.f32454E0.findViewById(y4c0.f196086Z4);
            this.f32460H0 = (VText) this.f32454E0.findViewById(y4c0.f196080Y4);
        }
        VText vText = this.f32456F0;
        vText.setTypeface(vText.getTypeface(), 1);
        boolean zM50022a0 = m50022a0(user);
        VText vText2 = this.f32456F0;
        if (zM50022a0) {
            vText2.setText(user.publicId);
            if (user.age.intValue() > 0) {
                this.f32458G0.setText(String.valueOf(user.age));
            }
        } else {
            vText2.setText(user.name);
            this.f32458G0.setText(String.valueOf(user.age));
        }
        if (zM203803z3) {
            xdl0.m208344M(this.f32458G0, false);
        }
        xdl0.m208344M(this.f32460H0, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m49997E0(User user, User user2) {
        if (user == null || user2 == null || m50040s0() || m50022a0(user2) || !NullChecker.m81303a(this.f32506t)) {
            return;
        }
        if (this.f32462I0 == null) {
            View viewInflate = this.f32506t.inflate();
            this.f32462I0 = viewInflate;
            this.f32464J0 = (MessageAboutMeContentView) viewInflate.findViewById(y4c0.f196205q5);
        }
        this.f32464J0.setContent(jly.m142126N().m142158K(user, user2));
        this.f32464J0.getShowedTagType().remove("about_me");
    }

    /* JADX INFO: renamed from: F */
    public View m49998F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jzz.m143969b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F0 */
    public void m49999F0(User user, int i) {
        if (NullChecker.m81303a(this.f32500o)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(this.f32500o, CoreModule.m29935P().m94658i().mo158375f3());
            } else {
                CoreModule.m29935P().m94658i().mo158474y2(this.f32500o, rw6.m181385a(user).profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m81303a(imageSmall)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(imageSmall, CoreModule.m29935P().m94658i().mo158306T0());
            } else {
                CoreModule.m29935P().m94658i().mo158474y2(imageSmall, rw6.m181385a(user).profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m50000G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kzz.m147964b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m50001G0(User user, int i) {
        if (NullChecker.m81303a(this.f32500o)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(this.f32500o, CoreModule.m29935P().m94658i().mo158375f3());
            } else if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id))) {
                qib0.f154691G.m102331L0(this.f32500o, user.getAnonymousUrl());
            } else {
                CoreModule.m29935P().m94658i().mo158474y2(this.f32500o, user.m60124fp().profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m81303a(imageSmall)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(imageSmall, CoreModule.m29935P().m94658i().mo158306T0());
            } else {
                CoreModule.m29935P().m94658i().mo158474y2(imageSmall, user.m60124fp().profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public View m50002H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lzz.m152409b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H0 */
    public void m50003H0() {
        if (m50040s0()) {
            return;
        }
        if (NullChecker.m81303a(this.f32498m)) {
            this.f32498m.setBackgroundResource(c3c0.f78769i4);
            LinearLayout linearLayout = this.f32498m;
            int i = t100.f167254c;
            linearLayout.setPadding(i, i, i, t100.f167260i);
        }
        if (NullChecker.m81303a(this.f32505s)) {
            this.f32505s.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m50004I0(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(ura.m195053e().m195057d().mo33699I4() ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: J */
    public final void m50005J(StringBuilder sb, List<Tag> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        int iMin = Math.min(list.size(), 3);
        for (int i = 0; i < iMin; i++) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("、");
            }
            sb.append(list.get(i).value);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m50006J0() {
        m50040s0();
    }

    /* JADX INFO: renamed from: K */
    public void m50007K(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            view.setClipToOutline(false);
        }
        if (view.getParent() instanceof View) {
            m50007K((View) view.getParent());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public Bitmap m50008K0(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: M */
    public final String m50009M(User user) {
        StringBuilder sb = new StringBuilder();
        String strM49965L = m49965L(user);
        if (!TextUtils.isEmpty(strM49965L) && !user.isHideLocationFromSVip()) {
            sb.append("居住在");
            sb.append(strM49965L);
        }
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(CoreModule.f17544b.getString(R$string.f20922a5));
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public final CharSequence m50010N(User user, User user2, String str) {
        CharSequence charSequenceM50012Q = m50012Q(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM50012Q};
        if (!TextUtils.isEmpty(charSequenceM50012Q)) {
            if (NullChecker.m81303a(this.f32469M)) {
                boolean zMo158345a2 = CoreModule.m29935P().m94658i().mo158345a2();
                VImage vImage = this.f32469M;
                if (zMo158345a2) {
                    vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78479B2 : c3c0.f78470A2);
                } else {
                    vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78488C2 : c3c0.f78920z2);
                }
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m50004I0(CoreModule.f17544b.getString(R$string.f20931b5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f20940c5), str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.m81303a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m50004I0(CoreModule.f17544b.getString(R$string.f20949d5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.location.passby.count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f21083s6), String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m50044w0(user, user2);
    }

    /* JADX INFO: renamed from: O */
    public final void m50011O(Act act, User user, final e30<String> e30Var) {
        if (e30Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            e30Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngM173860b = qc2.m173860b(new LatLng(doublePair.first, doublePair.second));
        mjj mjjVarM154842c = mjj.m154842c(act, false);
        if (latLngM173860b == null) {
            e30Var.call("");
        } else {
            mjjVarM154842c.m154844e(act, latLngM173860b.latitude, latLngM173860b.longitude, new e30() { // from class: l.pyz
                @Override // p149l.e30
                public final void call(Object obj) {
                    MessageUserHeaderLayout.m49989w(e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.qyz
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call("");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public final CharSequence m50012Q(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM200339n = vwb.m200339n(user2.profile.tags, new w9j() { // from class: l.kyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.azz
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return "";
        }
        final ArrayList arrayListM200339n2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.lyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.yyz
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.m200296J(arrayListM200339n2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.myz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MessageUserHeaderLayout.m49960B(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM200339n2, comparator);
        Collections.sort(arrayListM200339n, comparator);
        ArrayList arrayListM200339n3 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.nyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(vwb.m200346r(arrayListM200339n2, new w9j() { // from class: l.bzz
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (vwb.m200296J(arrayListM200339n3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(CoreModule.f17544b.getString(R$string.f20905Y4) + "：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListM200339n3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListM200339n3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m50004I0(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: R */
    public final CharSequence m50013R(Act act, User user) {
        StringBuilder sb = new StringBuilder();
        Profile profile = user.profile;
        if (profile.studies.active) {
            sb.append("学生");
        } else {
            if (!TextUtils.isEmpty(profile.work.industry) && !TextUtils.equals(user.profile.work.industry, "其他") && !TextUtils.equals(user.profile.work.industry, "其它") && !TextUtils.equals(user.profile.work.industry, "学生")) {
                sb.append(user.profile.work.industry);
            }
            if (!TextUtils.isEmpty(user.profile.work.department) && !TextUtils.equals(user.profile.work.department, "其他") && !TextUtils.equals(user.profile.work.department, "其它") && !TextUtils.equals(user.profile.work.department, "学生")) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("·");
                }
                sb.append(user.profile.work.department);
            }
        }
        m50005J(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.ryz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m50005J(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.syz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m50005J(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.tyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m50005J(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.uyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m50005J(sb, vwb.m200339n(user.profile.tags, new w9j() { // from class: l.vyz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m50004I0((TEnum.equals(user.gender, "female") ? CoreModule.f17544b.getString(R$string.f20929b3) : CoreModule.f17544b.getString(R$string.f20947d3)) + "：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m50014S(User user, Question question) {
        Question questionM215900o3;
        if (vwb.m200296J(user.profile.answers)) {
            questionM215900o3 = null;
        } else {
            questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(user.profile.answers.get(0).question);
        }
        if (questionM215900o3 != null) {
            question = questionM215900o3;
        }
        if (question == null) {
            return "";
        }
        return (TEnum.equals(user.gender, "female") ? CoreModule.f17544b.getString(R$string.f20938c3) : CoreModule.f17544b.getString(R$string.f20956e3)) + ": " + question.text;
    }

    /* JADX INFO: renamed from: T */
    public final String m50015T(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? i0g0.m133869j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: U */
    public void m50016U(final fcz<User, bpz> fczVar) {
        if (fczVar.mo120802l7()) {
            hmb.m131701M(this.f32507u, false);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.oyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146374a.m50025d0(fczVar, view);
            }
        };
        if (NullChecker.m81303a(this.f32507u)) {
            xdl0.m208329E0(this.f32507u, onClickListener);
        }
        if (NullChecker.m81303a(this.f32498m)) {
            xdl0.m208329E0(this.f32498m, onClickListener);
        }
        if (CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(fczVar.mo120828r3()) && fczVar.mo120719V2() && !m50040s0()) {
            C8524b.m49068t(getImageSmall(), new C8597a(fczVar), new View.OnClickListener() { // from class: l.zyz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205759a.m50026e0(fczVar, view);
                }
            }, new Runnable() { // from class: l.czz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83139a.m50028g0(fczVar);
                }
            });
        }
        xdl0.m208329E0(getImageSmall(), new View.OnClickListener() { // from class: l.dzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88523a.m50029h0(fczVar, view);
            }
        });
        m50006J0();
        if (CoreModule.m29935P().m94658i().mo158216D()) {
            zxz.m220864h().m220873p(fczVar.mo120828r3(), "headView", getTickleAnimContent(), getImageSmall());
        }
    }

    /* JADX INFO: renamed from: V */
    public void m50017V() {
        this.f32507u.setBackgroundResource(c3c0.f78869t5);
        this.f32457G.setBackgroundResource(c3c0.f78686Z1);
        this.f32457G.setTextColor(Color.parseColor("#FFD489"));
        this.f32463J.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78875u2 : c3c0.f78866t2);
        this.f32469M.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78902x2 : c3c0.f78893w2);
        this.f32475P.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78515F2 : c3c0.f78506E2);
        this.f32480S.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78542I2 : c3c0.f78533H2);
    }

    /* JADX INFO: renamed from: W */
    public void m50018W() {
        this.f32507u.setBackgroundResource(c3c0.f78860s5);
        this.f32457G.setBackgroundResource(c3c0.f78678Y1);
        this.f32457G.setTextColor(Color.parseColor("#74502A"));
        this.f32463J.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78875u2 : c3c0.f78866t2);
        this.f32469M.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78902x2 : c3c0.f78893w2);
        this.f32475P.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78515F2 : c3c0.f78506E2);
        this.f32480S.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78542I2 : c3c0.f78533H2);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m50019X(Conversation conversation) {
        Context context = getContext();
        if (NullChecker.m81303a(conversation) && conversation.isAnonymous()) {
            return true;
        }
        return (context instanceof MessagesAct) && ((MessagesAct) context).f31640f.m120734Y3();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m50020Y() {
        Context context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            String str = messagesAct.f31640f.f96910b;
            if (!TextUtils.isEmpty(str) && (messagesAct.f31640f instanceof wmz)) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isBanedOrInactivated()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m50021Z() {
        Context context = getContext();
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        MessagesAct messagesAct = (MessagesAct) context;
        if (NullChecker.m81303a(messagesAct.m48977u2())) {
            return TEnum.equals(messagesAct.m48977u2().status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m50022a0(User user) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m50023b0() {
        Context context = getContext();
        if (context instanceof MessagesAct) {
            String str = ((MessagesAct) context).f31640f.f96910b;
            if (!TextUtils.isEmpty(str)) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isTeamAccount()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m50024c0(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 >= i4 && i2 <= view.getMeasuredHeight() + i4 && i >= i3 && i <= view.getMeasuredWidth() + i3;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m50025d0(fcz fczVar, View view) {
        m50039r0(false, fczVar.pageId());
        o6j0.m162859c("e_message_head", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        fczVar.m120850v6("profile_bubble");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0 && m50040s0()) {
            this.f32466K0 = 0;
            if (m50024c0(this.f32457G, rawX, rawY)) {
                this.f32466K0 = 1;
            } else if (m50024c0(this.f32450B, rawX, rawY) || m50024c0(this.f32453E, rawX, rawY) || m50024c0(this.f32455F, rawX, rawY)) {
                this.f32466K0 = 2;
            } else if (m50024c0(this.f32459H, rawX, rawY)) {
                this.f32466K0 = 3;
            } else if (m50024c0(this.f32509w, rawX, rawY) || m50024c0(this.f32510x, rawX, rawY)) {
                this.f32466K0 = 4;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m50026e0(fcz fczVar, View view) {
        o6j0.m162859c("e_chat_avatar", fczVar.pageId(), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), fczVar.mo120828r3()))));
        m50039r0(false, fczVar.pageId());
        fczVar.m120850v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m50027f0() {
        if (NullChecker.m81303a(this.f32507u)) {
            this.f32511y.setRotation(8.0f);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m50028g0(fcz fczVar) {
        e51.m114743H(fczVar.act(), new Runnable() { // from class: l.fzz
            @Override // java.lang.Runnable
            public final void run() {
                this.f100014a.m50027f0();
            }
        }, 300L);
    }

    public VDraweeView getImageSmall() {
        return m50040s0() ? this.f32511y : this.f32495k;
    }

    public FrameLayout getTickleAnimContent() {
        return m50040s0() ? this.f32449A : this.f32497l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m50029h0(fcz fczVar, View view) {
        m50039r0(false, fczVar.pageId());
        o6j0.m162859c("e_chat_avatar", fczVar.pageId(), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), fczVar.mo120828r3()))));
        fczVar.m120850v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m50030i0(View view) {
        this.f32507u.performClick();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m50031j0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m50039r0(true, str);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m50032k0(User user, CoreMomentInfo coreMomentInfo) {
        xdl0.m208344M(this.f32485a, true);
        if (NullChecker.m81303a(this.f32488d) && NullChecker.m81303a(this.f32489e) && NullChecker.m81303a(this.f32490f)) {
            if (coreMomentInfo.media.size() > 0) {
                xdl0.m208344M(this.f32489e, false);
                if (coreMomentInfo.media.get(0) instanceof Picture) {
                    qib0.f154691G.m102331L0(this.f32488d, coreMomentInfo.media.get(0).url);
                    xdl0.m208344M(this.f32490f, coreMomentInfo.media.size() > 1);
                } else if (coreMomentInfo.media.get(0) instanceof Video) {
                    qib0.f154691G.m102341Q0(this.f32488d, ((Video) coreMomentInfo.media.get(0)).cover.momentPictureSmall());
                    xdl0.m208344M(this.f32489e, true);
                } else {
                    qib0.f154691G.m102354Y0(this.f32488d, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78660W : c3c0.f78652V);
                }
            } else {
                qib0.f154691G.m102354Y0(this.f32488d, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78644U : c3c0.f78636T);
            }
        }
        if (NullChecker.m81303a(this.f32492h) && NullChecker.m81303a(this.f32493i)) {
            if (TextUtils.isEmpty(coreMomentInfo.value)) {
                boolean z = this.f32476P0;
                TextView textView = this.f32493i;
                if (z) {
                    textView.setText("你发布的动态");
                } else {
                    textView.setText(String.format("%s发布的动态", user.isFemale() ? "她" : "他"));
                }
            } else {
                this.f32493i.setText(coreMomentInfo.value);
            }
            boolean z2 = this.f32476P0;
            TextView textView2 = this.f32492h;
            if (z2) {
                textView2.setText(String.format("我通过这条动态喜欢了%s", user.isFemale() ? "她" : "他"));
            } else {
                textView2.setText(String.format("%s通过这条动态喜欢了我", user.isFemale() ? "她" : "他"));
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m50033l0(Throwable th) {
        xdl0.m208344M(this.f32485a, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m50034m0(List list, Act act, User user, User user2) {
        if (!vwb.m200296J(list)) {
            this.f32468L0 = (Question) list.get(new Random().nextInt(list.size()));
        }
        m49994B0(act, user, user2, this.f32468L0);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m50035n0(final Act act, final User user, final User user2) {
        final List<T> listQuery = CoreModule.f17553k.f91942e.query(null, null, -1);
        e51.m114742G(new Runnable() { // from class: l.jyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f120340a.m50034m0(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m50036o0(User user, User user2, Act act, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f32483V = m50009M(user);
        if (NullChecker.m81303a(this.f32461I)) {
            this.f32465K.setText(this.f32483V);
            xdl0.m208344M(this.f32461I, !TextUtils.isEmpty(this.f32483V));
        } else if (!TextUtils.isEmpty(this.f32483V)) {
            sb.append(this.f32483V);
        }
        this.f32484W = m50010N(user2, user, str);
        boolean zM81303a = NullChecker.m81303a(this.f32467L);
        String str2 = SignParameters.NEW_LINE;
        if (zM81303a) {
            this.f32471N.setText(this.f32484W);
            xdl0.m208344M(this.f32467L, !TextUtils.isEmpty(this.f32484W));
        } else if (!TextUtils.isEmpty(this.f32484W)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f32484W);
        }
        this.f32496k0 = m50013R(act, user);
        if (NullChecker.m81303a(this.f32473O)) {
            this.f32477Q.setText(this.f32496k0);
            xdl0.m208344M(this.f32473O, !TextUtils.isEmpty(this.f32496k0));
        } else if (!TextUtils.isEmpty(this.f32496k0)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f32496k0);
        }
        this.f32502p0 = m50014S(user, question);
        if (NullChecker.m81303a(this.f32479R)) {
            this.f32481T.setText(this.f32502p0);
            xdl0.m208344M(this.f32479R, !TextUtils.isEmpty(this.f32502p0));
        } else if (!TextUtils.isEmpty(this.f32502p0)) {
            if (TextUtils.isEmpty(sb.toString())) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(this.f32502p0);
        }
        if (NullChecker.m81303a(this.f32505s)) {
            if (TextUtils.isEmpty(sb.toString()) || m50022a0(user)) {
                xdl0.m208344M(this.f32505s, false);
                return;
            }
            setOldDateInfo(sb.toString());
            xdl0.m208344M(this.f32505s, true);
            this.f32505s.setTextColor(Color.parseColor("#66000000"));
            this.f32505s.setTextSize(14.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f32470M0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        View viewM50002H;
        super.onFinishInflate();
        if (m50040s0()) {
            viewM50002H = m50000G(o7r.m163037a(getContext()), this);
            if (ura.m195053e().m195057d().mo33699I4()) {
                this.f32451C.setTextColor(getResources().getColor(a1c0.f67153g));
                this.f32452D.setTextColor(getResources().getColor(a1c0.f67153g));
                this.f32453E.setTextColor(getResources().getColor(a1c0.f67155i));
                this.f32455F.setTextColor(getResources().getColor(a1c0.f67155i));
                this.f32457G.setTextColor(getResources().getColor(a1c0.f67155i));
                xdl0.m208346N(this.f32463J, c3c0.f78884v2);
                this.f32465K.setTextColor(getResources().getColor(a1c0.f67154h));
                xdl0.m208346N(this.f32469M, c3c0.f78911y2);
                this.f32471N.setTextColor(getResources().getColor(a1c0.f67154h));
                xdl0.m208346N(this.f32475P, c3c0.f78524G2);
                this.f32477Q.setTextColor(getResources().getColor(a1c0.f67154h));
                xdl0.m208346N(this.f32480S, c3c0.f78551J2);
                this.f32481T.setTextColor(getResources().getColor(a1c0.f67154h));
            }
            if (m50040s0()) {
                this.f32457G.setVisibility(0);
                this.f32457G.setText(getCheckTxt());
            }
            this.f32508v.setVisibility(0);
        } else {
            viewM50002H = m50002H(o7r.m163037a(getContext()), this);
        }
        setOrientation(1);
        addView(viewM50002H);
        if (CoreModule.m29935P().m94658i().mo33383O8()) {
            View viewM49998F = m49998F(o7r.m163037a(getContext()), this);
            if (ura.m195053e().m195057d().mo33699I4()) {
                this.f32492h.setTextColor(getResources().getColor(a1c0.f67153g));
                this.f32493i.setTextColor(getResources().getColor(a1c0.f67155i));
                this.f32489e.setImageResource(c3c0.f78793l1);
                this.f32490f.setImageResource(c3c0.f78668X);
            }
            addView(viewM49998F);
        }
        TextView textView = new TextView(getContext());
        this.f32472N0 = textView;
        textView.setTextColor(Color.parseColor("#4D000000"));
        this.f32472N0.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.m186890d(20.0f);
        this.f32472N0.setGravity(1);
        this.f32472N0.setVisibility(8);
        addView(this.f32472N0, layoutParams);
        if (m50040s0() && ura.m195053e().m195057d().mo33947xh() && !m50020Y() && !m50021Z() && NullChecker.m81303a(this.f32459H)) {
            int iIndexOfChild = this.f32507u.indexOfChild(this.f32459H);
            this.f32474O0 = (MessageIdealTypeHeadLayout) LayoutInflater.from(getContext()).inflate(l6c0.f126306H1, (ViewGroup) this.f32507u, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = -t100.m186890d(20.0f);
            marginLayoutParams.rightMargin = -t100.m186890d(20.0f);
            this.f32507u.addView(this.f32474O0, iIndexOfChild, marginLayoutParams);
            xdl0.m208344M(this.f32459H, false);
            xdl0.m208329E0(this.f32474O0, new View.OnClickListener() { // from class: l.dyz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88444a.m50030i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m50037p0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f32498m.setBackgroundResource(c3c0.f78839q2);
            return;
        }
        this.f32498m.setBackground(new BitmapDrawable(getResources(), m49966P(m50008K0(bitmap, t100.m186890d(213.0f), t100.m186890d(280.0f)), t100.m186890d(10.0f))));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m50038q0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f32498m.setBackgroundResource(c3c0.f78839q2);
            return;
        }
        this.f32498m.setBackground(new BitmapDrawable(getResources(), m49966P(m50008K0(bitmap, t100.m186890d(213.0f), t100.m186890d(280.0f)), t100.m186890d(10.0f))));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m50039r0(boolean z, String str) {
        if (m50040s0()) {
            if (z) {
                o6j0.m162864h("e_match_card", str, o6j0.C18854a.m162878h("card_content_personal_info", !TextUtils.isEmpty(this.f32483V) ? "1" : "0"), o6j0.C18854a.m162878h("card_conntent_common_info", !TextUtils.isEmpty(this.f32484W) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_tag", !TextUtils.isEmpty(this.f32496k0) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_question", TextUtils.isEmpty(this.f32502p0) ? "0" : "1"));
                return;
            }
            boolean zM50040s0 = m50040s0();
            String str2 = this.f32483V;
            if (zM50040s0) {
                o6j0.m162859c("e_match_card", str, o6j0.C18854a.m162878h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), o6j0.C18854a.m162878h("card_conntent_common_info", !TextUtils.isEmpty(this.f32484W) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_tag", !TextUtils.isEmpty(this.f32496k0) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_question", TextUtils.isEmpty(this.f32502p0) ? "0" : "1"), o6j0.C18854a.m162876f("card_click_area", this.f32466K0));
            } else {
                o6j0.m162859c("e_match_card", str, o6j0.C18854a.m162878h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), o6j0.C18854a.m162878h("card_conntent_common_info", !TextUtils.isEmpty(this.f32484W) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_tag", !TextUtils.isEmpty(this.f32496k0) ? "1" : "0"), o6j0.C18854a.m162878h("card_content_question", TextUtils.isEmpty(this.f32502p0) ? "0" : "1"));
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m50040s0() {
        if (m50023b0()) {
            return false;
        }
        return CoreModule.m29935P().m94658i().mo158402k5();
    }

    public void setFpAnonymityIncludeSelfImage(User user) {
        if (NullChecker.m81303a(this.f32500o)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(this.f32500o, CoreModule.m29935P().m94658i().mo158375f3());
            } else if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id))) {
                qib0.f154691G.m102331L0(this.f32500o, user.getAnonymousUrl());
            } else {
                qib0.f154691G.m102312B0(this.f32500o, rw6.m181386b(user).profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m81303a(imageSmall)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(imageSmall, CoreModule.m29935P().m94658i().mo158306T0());
            } else if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id))) {
                qib0.f154691G.m102331L0(imageSmall, user.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(imageSmall, rw6.m181386b(user).profileSmall());
            }
        }
    }

    public void setOtherSmallImage(User user) {
        if (NullChecker.m81303a(this.f32500o)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(this.f32500o, CoreModule.m29935P().m94658i().mo158375f3());
            } else if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id))) {
                qib0.f154691G.m102331L0(this.f32500o, user.getAnonymousUrl());
            } else {
                qib0.f154691G.m102312B0(this.f32500o, user.m60124fp().profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m81303a(imageSmall)) {
            if (user.inactivated) {
                qib0.f154691G.m102354Y0(imageSmall, CoreModule.m29935P().m94658i().mo158306T0());
            } else if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id))) {
                qib0.f154691G.m102331L0(imageSmall, user.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(imageSmall, user.m60124fp().profileSmall());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m50041t0(String str) {
        if (this.f32482U) {
            return;
        }
        if (NullChecker.m81303a(this.f32464J0)) {
            m50043v0(this.f32464J0, str);
        }
        if (m50040s0() && NullChecker.m81303a(this.f32507u)) {
            m50042u0(this.f32507u, str);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m50042u0(View view, final String str) {
        if (view.getGlobalVisibleRect(new Rect())) {
            this.f32482U = true;
            view.postDelayed(new Runnable() { // from class: l.izz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115607a.m50031j0(str);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m50043v0(final MessageAboutMeContentView messageAboutMeContentView, final String str) {
        if (messageAboutMeContentView.getGlobalVisibleRect(new Rect())) {
            this.f32482U = true;
            messageAboutMeContentView.postDelayed(new Runnable() { // from class: l.hyz
                @Override // java.lang.Runnable
                public final void run() {
                    MessageUserHeaderLayout.m49990x(str, messageAboutMeContentView);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final CharSequence m50044w0(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.m81303a(this.f32469M)) {
            boolean zMo158345a2 = CoreModule.m29935P().m94658i().mo158345a2();
            VImage vImage = this.f32469M;
            if (zMo158345a2) {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78479B2 : c3c0.f78470A2);
            } else {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78488C2 : c3c0.f78920z2);
            }
        }
        return m50004I0(CoreModule.f17544b.getString(R$string.f20913Z4) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.profile.studies.school + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f21048o5), user.profile.studies.school);
    }

    /* JADX INFO: renamed from: x0 */
    public void m50045x0(final User user, User user2) {
        if (NullChecker.m81303a(this.f32485a)) {
            String str = "";
            if (NullChecker.m81303a(user) && NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions)) {
                boolean zIsEmpty = TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId);
                Relationship relationship = user.localRelationship;
                if (!zIsEmpty) {
                    String str2 = relationship.relationshipExtensions.otherMomentId;
                    this.f32476P0 = false;
                    this.f32478Q0 = NullChecker.m81303a(user2) ? user2.f56011id : "";
                    str = str2;
                } else if (!TextUtils.isEmpty(relationship.relationshipExtensions.momentId)) {
                    str = user.localRelationship.relationshipExtensions.momentId;
                    this.f32476P0 = true;
                    this.f32478Q0 = user.f56011id;
                }
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f32478Q0) || TextUtils.equals(CoreMomentInfo.LOCAL_ID_INVALID, str)) {
                xdl0.m208344M(this.f32485a, false);
            } else {
                mkd0.m154992z(this.f32470M0);
                this.f32470M0 = CoreModule.m29934N().momentRefresh(this.f32478Q0, str, CoreMomentInfo.JSON_ADAPTER).takeFirst(new w9j() { // from class: l.eyz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a((CoreMomentInfo) obj));
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.fyz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f99923a.m50032k0(user, (CoreMomentInfo) obj);
                    }
                }, new e30() { // from class: l.gyz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f105072a.m50033l0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m50046y0(Act act, fcz<User, bpz> fczVar, User user, User user2) {
        setMatchIcon(user2);
        m50047z0(user, user2);
        if (CoreModule.m29935P().m94658i().mo158365e() && NullChecker.m81303a(this.f32507u) && NullChecker.m81303a(user2) && !user2.isHideIconFromSVipWithMe() && user2.isSupremePartner()) {
            m50017V();
        } else if (CoreModule.m29935P().m94658i().mo158345a2() && NullChecker.m81303a(this.f32507u)) {
            m50018W();
        }
        if (!user2.isTeamAccount()) {
            m49995C0();
            m49996D0(user2, fczVar.f96919k);
            m49997E0(user, user2);
            m50041t0(fczVar.pageId());
            m49993A0(act, user, user2, fczVar.f96919k);
        } else if (fczVar.mo120828r3().equals(User.ID_TEAM_ACCOUNT_SERVICE)) {
            setOldDateInfo("你好呀，我是你的探探付费通知小助手“服务提醒”，如遇到任何付费功能相关的问题都可以找我帮你解决哦");
        } else if (fczVar.mo120828r3().equals(User.ID_AI_STORY)) {
            setOldDateInfo("AI思思来啦！是文笔超棒，共情能力超强的思思哦，和我聊聊你的感情故事吧，我会好好帮你记录下来的~");
        } else {
            setOldDateInfo(act.getString(R$string.f20984h4));
        }
        if (NullChecker.m81303a(this.f32459H)) {
            xdl0.m208344M(this.f32459H, !m50022a0(user2));
        }
        if (NullChecker.m81303a(this.f32474O0)) {
            xdl0.m208344M(this.f32459H, false);
            this.f32474O0.m49902g(act, user2);
        }
        if (NullChecker.m81303a(this.f32505s)) {
            xdl0.m208344M(this.f32505s, (m50022a0(user2) || TextUtils.isEmpty(this.f32505s.getText())) ? false : true);
        }
        if (!NullChecker.m81303a(fczVar.f96919k) || !NullChecker.m81303a(fczVar.f96919k.property) || !NullChecker.m81303a(fczVar.f96919k.property.conversationTag) || TextUtils.isEmpty(fczVar.f96919k.property.conversationTag.guide)) {
            xdl0.m208344M(this.f32472N0, false);
        } else {
            this.f32472N0.setText(fczVar.f96919k.property.conversationTag.guide);
            xdl0.m208344M(this.f32472N0, true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m50047z0(User user, User user2) {
        boolean z = CoreModule.f17545c.f19561E0.m203803z3(user2) || m50022a0(user2);
        if (NullChecker.m81303a(this.f32451C)) {
            boolean zM50022a0 = m50022a0(user2);
            VText vText = this.f32451C;
            if (zM50022a0) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f32451C.getPaint().setFakeBoldText(true);
        }
        if (m50040s0()) {
            if (NullChecker.m81303a(this.f32455F) && !z) {
                this.f32455F.setText(" · " + user2.age + "岁");
                this.f32455F.setVisibility(0);
                this.f32452D.setVisibility(8);
            }
        } else if (NullChecker.m81303a(this.f32452D) && !z) {
            this.f32452D.setText(String.valueOf(user2.age));
            this.f32455F.setVisibility(8);
            this.f32452D.setVisibility(0);
        }
        if (NullChecker.m81303a(this.f32509w)) {
            if (m50019X(CoreModule.f17545c.f19642f0.m32856Xe(user2.f56011id))) {
                qib0.f154691G.m102331L0(this.f32509w, user.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(this.f32509w, rw6.m181386b(user).profileSmall());
            }
        }
        if (m50022a0(user2) || !NullChecker.m81303a(this.f32453E)) {
            return;
        }
        this.f32453E.setText(m50015T(user2));
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32482U = false;
        this.f32483V = "";
        this.f32484W = "";
        this.f32496k0 = "";
        this.f32502p0 = "";
        this.f32468L0 = null;
        this.f32476P0 = false;
        this.f32478Q0 = "";
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32482U = false;
        this.f32483V = "";
        this.f32484W = "";
        this.f32496k0 = "";
        this.f32502p0 = "";
        this.f32468L0 = null;
        this.f32476P0 = false;
        this.f32478Q0 = "";
    }
}
