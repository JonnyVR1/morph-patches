package com.p051p1.mobile.putong.core.p058ui.messages.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.aboutme.MessageAboutMeContentView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.clz;
import p153l.edc0;
import p153l.fmj;
import p153l.g800;
import p153l.g9c0;
import p153l.gta;
import p153l.guy;
import p153l.h800;
import p153l.i4g0;
import p153l.i800;
import p153l.ibc0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.nrb0;
import p153l.p9r;
import p153l.pf60;
import p153l.pm6;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.sfj0;
import p153l.tvz;
import p153l.uqb0;
import p153l.ux6;
import p153l.vnb;
import p153l.w600;
import p153l.xc2;
import p153l.y20;
import p153l.yxz;
import p153l.z80;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class MessageUserHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public FrameLayout f33297A;

    /* JADX INFO: renamed from: B */
    public VLinear f33298B;

    /* JADX INFO: renamed from: C */
    public VText f33299C;

    /* JADX INFO: renamed from: D */
    public VText f33300D;

    /* JADX INFO: renamed from: E */
    public VText f33301E;

    /* JADX INFO: renamed from: E0 */
    public View f33302E0;

    /* JADX INFO: renamed from: F */
    public VText f33303F;

    /* JADX INFO: renamed from: F0 */
    public VText f33304F0;

    /* JADX INFO: renamed from: G */
    public TextView f33305G;

    /* JADX INFO: renamed from: G0 */
    public VText f33306G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f33307H;

    /* JADX INFO: renamed from: H0 */
    public VText f33308H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f33309I;

    /* JADX INFO: renamed from: I0 */
    public View f33310I0;

    /* JADX INFO: renamed from: J */
    public VImage f33311J;

    /* JADX INFO: renamed from: J0 */
    public MessageAboutMeContentView f33312J0;

    /* JADX INFO: renamed from: K */
    public VText f33313K;

    /* JADX INFO: renamed from: K0 */
    public int f33314K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f33315L;

    /* JADX INFO: renamed from: L0 */
    public Question f33316L0;

    /* JADX INFO: renamed from: M */
    public VImage f33317M;

    /* JADX INFO: renamed from: M0 */
    public kcg0 f33318M0;

    /* JADX INFO: renamed from: N */
    public VText f33319N;

    /* JADX INFO: renamed from: N0 */
    public TextView f33320N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f33321O;

    /* JADX INFO: renamed from: O0 */
    public MessageIdealTypeHeadLayout f33322O0;

    /* JADX INFO: renamed from: P */
    public VImage f33323P;

    /* JADX INFO: renamed from: P0 */
    public boolean f33324P0;

    /* JADX INFO: renamed from: Q */
    public VText f33325Q;

    /* JADX INFO: renamed from: Q0 */
    public String f33326Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f33327R;

    /* JADX INFO: renamed from: S */
    public VImage f33328S;

    /* JADX INFO: renamed from: T */
    public VText f33329T;

    /* JADX INFO: renamed from: U */
    public boolean f33330U;

    /* JADX INFO: renamed from: V */
    public String f33331V;

    /* JADX INFO: renamed from: W */
    public CharSequence f33332W;

    /* JADX INFO: renamed from: a */
    public FrameLayout f33333a;

    /* JADX INFO: renamed from: b */
    public VLinear f33334b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f33335c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f33336d;

    /* JADX INFO: renamed from: e */
    public VImage f33337e;

    /* JADX INFO: renamed from: f */
    public VImage f33338f;

    /* JADX INFO: renamed from: g */
    public VLinear f33339g;

    /* JADX INFO: renamed from: h */
    public TextView f33340h;

    /* JADX INFO: renamed from: i */
    public TextView f33341i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f33342j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f33343k;

    /* JADX INFO: renamed from: k0 */
    public CharSequence f33344k0;

    /* JADX INFO: renamed from: l */
    public FrameLayout f33345l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f33346m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f33347n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f33348o;

    /* JADX INFO: renamed from: p */
    public VImage f33349p;

    /* JADX INFO: renamed from: p0 */
    public CharSequence f33350p0;

    /* JADX INFO: renamed from: q */
    public VImage f33351q;

    /* JADX INFO: renamed from: r */
    public ViewStub f33352r;

    /* JADX INFO: renamed from: s */
    public VText f33353s;

    /* JADX INFO: renamed from: t */
    public ViewStub f33354t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f33355u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f33356v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f33357w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f33358x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f33359y;

    /* JADX INFO: renamed from: z */
    public VImage f33360z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout$a */
    public class C8760a implements C8687b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f33361a;

        public C8760a(clz clzVar) {
            this.f33361a = clzVar;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return this.f33361a.mo111034r3();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return this.f33361a.mo111034r3();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return CoreModule.m30933P().m143412i().mo180308D() && this.f33361a.mo110925V2() && !User.isTeamAccount(this.f33361a.mo111034r3());
        }
    }

    public MessageUserHeaderLayout(Context context) {
        super(context);
        this.f33330U = false;
        this.f33331V = "";
        this.f33332W = "";
        this.f33344k0 = "";
        this.f33350p0 = "";
        this.f33316L0 = null;
        this.f33324P0 = false;
        this.f33326Q0 = "";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m51143B(List list, final Tag tag, final Tag tag2) {
        return jyb.m147476G(list, new qcj() { // from class: l.t700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - jyb.m147476G(list, new qcj() { // from class: l.u700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static String m51147I(float f, String str) {
        String str2;
        if (f < 1000.0f) {
            str2 = q8g0.f156109b.format(f) + CoreModule.f18263b.getString(R$string.f21615U4);
        } else {
            str2 = q8g0.f156109b.format(f / 1000.0f) + CoreModule.f18263b.getString(R$string.f21735i4);
        }
        return str + "(" + str2 + ")";
    }

    /* JADX INFO: renamed from: L */
    public static String m51148L(User user) {
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
        Settings settings = CoreModule.f18264c.f20381e0.m116593na().settings;
        if (!nrb0.m164467c() || !NullChecker.m82486a(settings) || settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue() || user.location.distance <= settings.getSearchRadius().intValue()) {
            return m51147I(user.location.distance, string);
        }
        pf60<String, String> pf60VarM175794Z = q8g0.m175794Z(CoreModule.f18264c.f20381e0.m116593na(), user.location, false);
        return (pf60VarM175794Z.f152156a + pf60VarM175794Z.f152157b).toString();
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m51149P(Bitmap bitmap, int i) {
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
        String strM80485F = RemoteConfig.m80481x().m80485F("icebreaking_check_txt");
        String string = CoreModule.f18263b.getString(R$string.f21592R5);
        if (!TextUtils.isEmpty(strM80485F)) {
            try {
                String strOptString = new JSONObject(strM80485F).optString("content");
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
                return ibc0.f113952Y0;
            case "ja":
                return ibc0.f113960Z0;
            case "ko":
                return ibc0.f113969a1;
            case "th":
                return ibc0.f113978b1;
            case "vi":
                return ibc0.f113987c1;
            case "zh":
                return (Locale.getDefault().getCountry() == "TW" || Locale.getDefault().getCountry() == "HK" || Locale.getDefault().getCountry() == "MO") ? ibc0.f114005e1 : ibc0.f113996d1;
            default:
                return ibc0.f113944X0;
        }
    }

    private void setMatchIcon(User user) {
        VImage vImage = this.f33349p;
        if (m51223s0()) {
            vImage = this.f33360z;
        }
        if (user == null || vImage == null || m51205a0(user)) {
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.status) && ((TEnum.equals(user.localRelationship.state, "matched") || TEnum.equals(user.localRelationship.state, "liked")) && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.m30933P().m143412i().mo180325G1())) {
            vImage.setVisibility(0);
            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                vImage.setImageResource(ibc0.f114079m3);
                return;
            } else {
                vImage.setImageResource(ibc0.f114070l3);
                return;
            }
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && CoreModule.m30933P().m143412i().mo180325G1()) {
            vImage.setVisibility(0);
            vImage.setImageResource(ibc0.f114106p3);
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180383Q4(user.f56859id)) {
            vImage.setVisibility(0);
            vImage.setImageResource(ibc0.f114028g6);
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            vImage.setVisibility(0);
            vImage.setImageResource(ibc0.f114097o3);
            return;
        }
        Relationship relationship = user.localRelationship;
        if ((relationship != null && !TEnum.equals(relationship.state, "default") && !TEnum.equals(user.localRelationship.state, "unknown_")) || !NullChecker.m82486a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            vImage.setVisibility(8);
        } else {
            vImage.setVisibility(0);
            vImage.setImageResource(ibc0.f114088n3);
        }
    }

    private void setOldDateInfo(String str) {
        if (NullChecker.m82486a(this.f33353s) && NullChecker.m82486a(str)) {
            this.f33353s.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m51172w(y20 y20Var, z80 z80Var) {
        if (z80Var == null) {
            y20Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(z80Var.mo143671c())) {
            y20Var.call(z80Var.mo143671c());
        } else if (TextUtils.isEmpty(z80Var.mo143672f())) {
            y20Var.call("");
        } else {
            y20Var.call(z80Var.mo143672f());
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m51173x(String str, MessageAboutMeContentView messageAboutMeContentView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138492A("e_chat_sayhi_card", str, pf60.m172085a("chat_card_content_category", messageAboutMeContentView.getShowedTrackParams()), pf60.m172085a("chat_card_content", messageAboutMeContentView.getShowContent()));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m51176A0(final Act act, final User user, final User user2, Conversation conversation) {
        if (m51205a0(user2)) {
            return;
        }
        if (!m51223s0()) {
            bnl0.m105524M(this.f33353s, false);
            return;
        }
        Question question = this.f33316L0;
        if (question == null) {
            l51.m152919y(new Runnable() { // from class: l.b800
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75385a.m51218n0(act, user, user2);
                }
            });
        } else {
            m51177B0(act, user, user2, question);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m51177B0(final Act act, final User user, final User user2, final Question question) {
        m51194O(act, user2, new y20() { // from class: l.f700
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97471a.m51219o0(user2, user, act, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m51178C0() {
        LinearLayout linearLayout = this.f33346m;
        if (linearLayout == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = qa00.m175859d(232.0f);
        layoutParams.height = -2;
        this.f33346m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m51179D0(User user, Conversation conversation) {
        if (this.f33352r == null) {
            return;
        }
        if (pm6.m172916d(conversation)) {
            bnl0.m105524M(this.f33351q, true);
            m51190K(this.f33351q);
            this.f33351q.setBackgroundResource(getIntlInstantMatchTagIcon());
        }
        if (pm6.m172916d(conversation)) {
            uqb0.f180374G.m127108I("https://auto.tancdn.com/v1/images/eyJpZCI6IlNCTEpVREI2RFdQTkw0U09OVkczNjZVUTZOVEhZNjE0IiwidyI6NDIwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjYwOTgxMTY1Nzc5NTE3NDR9.png", new y20() { // from class: l.d800
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85565a.m51220p0((Bitmap) obj);
                }
            });
        } else if (pm6.m172918f(conversation)) {
            uqb0.f180374G.m127108I("https://auto.tancdn.com/v1/raw/ce8a6af5-70b4-4386-b63e-8aebd6f11c5d14.webp", new y20() { // from class: l.e800
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92499a.m51221q0((Bitmap) obj);
                }
            });
        } else {
            this.f33346m.setBackgroundResource(ibc0.f114114q2);
        }
        boolean zM141091z3 = CoreModule.f18264c.f20303E0.m141091z3(user);
        if (this.f33302E0 == null) {
            View viewInflate = this.f33352r.inflate();
            this.f33302E0 = viewInflate;
            this.f33304F0 = (VText) viewInflate.findViewById(edc0.f93328a5);
            this.f33306G0 = (VText) this.f33302E0.findViewById(edc0.f93321Z4);
            this.f33308H0 = (VText) this.f33302E0.findViewById(edc0.f93315Y4);
        }
        VText vText = this.f33304F0;
        vText.setTypeface(vText.getTypeface(), 1);
        boolean zM51205a0 = m51205a0(user);
        VText vText2 = this.f33304F0;
        if (zM51205a0) {
            vText2.setText(user.publicId);
            if (user.age.intValue() > 0) {
                this.f33306G0.setText(String.valueOf(user.age));
            }
        } else {
            vText2.setText(user.name);
            this.f33306G0.setText(String.valueOf(user.age));
        }
        if (zM141091z3) {
            bnl0.m105524M(this.f33306G0, false);
        }
        bnl0.m105524M(this.f33308H0, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m51180E0(User user, User user2) {
        if (user == null || user2 == null || m51223s0() || m51205a0(user2) || !NullChecker.m82486a(this.f33354t)) {
            return;
        }
        if (this.f33310I0 == null) {
            View viewInflate = this.f33354t.inflate();
            this.f33310I0 = viewInflate;
            this.f33312J0 = (MessageAboutMeContentView) viewInflate.findViewById(edc0.f93440q5);
        }
        this.f33312J0.setContent(guy.m132421N().m132453K(user, user2));
        this.f33312J0.getShowedTagType().remove("about_me");
    }

    /* JADX INFO: renamed from: F */
    public View m51181F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g800.m129373b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F0 */
    public void m51182F0(User user, int i) {
        if (NullChecker.m82486a(this.f33348o)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(this.f33348o, CoreModule.m30933P().m143412i().mo180467f3());
            } else {
                CoreModule.m30933P().m143412i().mo180566y2(this.f33348o, ux6.m198403a(user).profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m82486a(imageSmall)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(imageSmall, CoreModule.m30933P().m143412i().mo180398T0());
            } else {
                CoreModule.m30933P().m143412i().mo180566y2(imageSmall, ux6.m198403a(user).profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m51183G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h800.m133889b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m51184G0(User user, int i) {
        if (NullChecker.m82486a(this.f33348o)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(this.f33348o, CoreModule.m30933P().m143412i().mo180467f3());
            } else if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id))) {
                uqb0.f180374G.m127115L0(this.f33348o, user.getAnonymousUrl());
            } else {
                CoreModule.m30933P().m143412i().mo180566y2(this.f33348o, user.m61308fp().profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m82486a(imageSmall)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(imageSmall, CoreModule.m30933P().m143412i().mo180398T0());
            } else {
                CoreModule.m30933P().m143412i().mo180566y2(imageSmall, user.m61308fp().profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public View m51185H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i800.m138992b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H0 */
    public void m51186H0() {
        if (m51223s0()) {
            return;
        }
        if (NullChecker.m82486a(this.f33346m)) {
            this.f33346m.setBackgroundResource(ibc0.f114044i4);
            LinearLayout linearLayout = this.f33346m;
            int i = qa00.f156316c;
            linearLayout.setPadding(i, i, i, qa00.f156322i);
        }
        if (NullChecker.m82486a(this.f33353s)) {
            this.f33353s.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m51187I0(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(gta.m132210e().m132214d().mo34702I4() ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: J */
    public final void m51188J(StringBuilder sb, List<Tag> list) {
        if (jyb.m147479J(list)) {
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
    public final void m51189J0() {
        m51223s0();
    }

    /* JADX INFO: renamed from: K */
    public void m51190K(View view) {
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
            m51190K((View) view.getParent());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public Bitmap m51191K0(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: M */
    public final String m51192M(User user) {
        StringBuilder sb = new StringBuilder();
        String strM51148L = m51148L(user);
        if (!TextUtils.isEmpty(strM51148L) && !user.isHideLocationFromSVip()) {
            sb.append("居住在");
            sb.append(strM51148L);
        }
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(CoreModule.f18263b.getString(R$string.f21664a5));
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public final CharSequence m51193N(User user, User user2, String str) {
        CharSequence charSequenceM51195Q = m51195Q(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM51195Q};
        if (!TextUtils.isEmpty(charSequenceM51195Q)) {
            if (NullChecker.m82486a(this.f33317M)) {
                boolean zMo180437a2 = CoreModule.m30933P().m143412i().mo180437a2();
                VImage vImage = this.f33317M;
                if (zMo180437a2) {
                    vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113754B2 : ibc0.f113745A2);
                } else {
                    vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113763C2 : ibc0.f114195z2);
                }
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m51187I0(CoreModule.f18263b.getString(R$string.f21673b5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f21682c5), str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.m82486a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m51187I0(CoreModule.f18263b.getString(R$string.f21691d5) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.location.passby.count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f21825s6), String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m51227w0(user, user2);
    }

    /* JADX INFO: renamed from: O */
    public final void m51194O(Act act, User user, final y20<String> y20Var) {
        if (y20Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            y20Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngM210088b = xc2.m210088b(new LatLng(doublePair.first, doublePair.second));
        fmj fmjVarM126236c = fmj.m126236c(act, false);
        if (latLngM210088b == null) {
            y20Var.call("");
        } else {
            fmjVarM126236c.m126239e(act, latLngM210088b.latitude, latLngM210088b.longitude, new y20() { // from class: l.m700
                @Override // p153l.y20
                public final void call(Object obj) {
                    MessageUserHeaderLayout.m51172w(y20Var, (z80) obj);
                }
            }, new y20() { // from class: l.n700
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call("");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public final CharSequence m51195Q(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListM147522n = jyb.m147522n(user2.profile.tags, new qcj() { // from class: l.h700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.x700
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return "";
        }
        final ArrayList arrayListM147522n2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.i700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.v700
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (jyb.m147479J(arrayListM147522n2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.j700
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MessageUserHeaderLayout.m51143B(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListM147522n2, comparator);
        Collections.sort(arrayListM147522n, comparator);
        ArrayList arrayListM147522n3 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.k700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(jyb.m147529r(arrayListM147522n2, new qcj() { // from class: l.y700
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (jyb.m147479J(arrayListM147522n3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(CoreModule.f18263b.getString(R$string.f21647Y4) + "：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListM147522n3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListM147522n3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m51187I0(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: R */
    public final CharSequence m51196R(Act act, User user) {
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
        m51188J(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.o700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m51188J(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.p700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m51188J(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.q700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m51188J(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.r700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m51188J(sb, jyb.m147522n(user.profile.tags, new qcj() { // from class: l.s700
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m51187I0((TEnum.equals(user.gender, "female") ? CoreModule.f18263b.getString(R$string.f21671b3) : CoreModule.f18263b.getString(R$string.f21689d3)) + "：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m51197S(User user, Question question) {
        Question questionM151465o3;
        if (jyb.m147479J(user.profile.answers)) {
            questionM151465o3 = null;
        } else {
            questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(user.profile.answers.get(0).question);
        }
        if (questionM151465o3 != null) {
            question = questionM151465o3;
        }
        if (question == null) {
            return "";
        }
        return (TEnum.equals(user.gender, "female") ? CoreModule.f18263b.getString(R$string.f21680c3) : CoreModule.f18263b.getString(R$string.f21698e3)) + ": " + question.text;
    }

    /* JADX INFO: renamed from: T */
    public final String m51198T(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? q8g0.m175804j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: U */
    public void m51199U(final clz<User, yxz> clzVar) {
        if (clzVar.mo111008l7()) {
            vnb.m201946M(this.f33355u, false);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.l700
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130315a.m51208d0(clzVar, view);
            }
        };
        if (NullChecker.m82486a(this.f33355u)) {
            bnl0.m105509E0(this.f33355u, onClickListener);
        }
        if (NullChecker.m82486a(this.f33346m)) {
            bnl0.m105509E0(this.f33346m, onClickListener);
        }
        if (CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(clzVar.mo111034r3()) && clzVar.mo110925V2() && !m51223s0()) {
            C8687b.m50251t(getImageSmall(), new C8760a(clzVar), new View.OnClickListener() { // from class: l.w700
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187700a.m51209e0(clzVar, view);
                }
            }, new Runnable() { // from class: l.z700
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203211a.m51211g0(clzVar);
                }
            });
        }
        bnl0.m105509E0(getImageSmall(), new View.OnClickListener() { // from class: l.a800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68876a.m51212h0(clzVar, view);
            }
        });
        m51189J0();
        if (CoreModule.m30933P().m143412i().mo180308D()) {
            w600.m205009h().m205018p(clzVar.mo111034r3(), "headView", getTickleAnimContent(), getImageSmall());
        }
    }

    /* JADX INFO: renamed from: V */
    public void m51200V() {
        this.f33355u.setBackgroundResource(ibc0.f114144t5);
        this.f33305G.setBackgroundResource(ibc0.f113961Z1);
        this.f33305G.setTextColor(Color.parseColor("#FFD489"));
        this.f33311J.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114150u2 : ibc0.f114141t2);
        this.f33317M.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114177x2 : ibc0.f114168w2);
        this.f33323P.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113790F2 : ibc0.f113781E2);
        this.f33328S.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113817I2 : ibc0.f113808H2);
    }

    /* JADX INFO: renamed from: W */
    public void m51201W() {
        this.f33355u.setBackgroundResource(ibc0.f114135s5);
        this.f33305G.setBackgroundResource(ibc0.f113953Y1);
        this.f33305G.setTextColor(Color.parseColor("#74502A"));
        this.f33311J.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114150u2 : ibc0.f114141t2);
        this.f33317M.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114177x2 : ibc0.f114168w2);
        this.f33323P.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113790F2 : ibc0.f113781E2);
        this.f33328S.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113817I2 : ibc0.f113808H2);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m51202X(Conversation conversation) {
        Context context = getContext();
        if (NullChecker.m82486a(conversation) && conversation.isAnonymous()) {
            return true;
        }
        return (context instanceof MessagesAct) && ((MessagesAct) context).f32488f.m110940Y3();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m51203Y() {
        Context context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            String str = messagesAct.f32488f.f82473b;
            if (!TextUtils.isEmpty(str) && (messagesAct.f32488f instanceof tvz)) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isBanedOrInactivated()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m51204Z() {
        Context context = getContext();
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        MessagesAct messagesAct = (MessagesAct) context;
        if (NullChecker.m82486a(messagesAct.m50161v2())) {
            return TEnum.equals(messagesAct.m50161v2().status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m51205a0(User user) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m51206b0() {
        Context context = getContext();
        if (context instanceof MessagesAct) {
            String str = ((MessagesAct) context).f32488f.f82473b;
            if (!TextUtils.isEmpty(str)) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isTeamAccount()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m51207c0(View view, int i, int i2) {
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
    public final /* synthetic */ void m51208d0(clz clzVar, View view) {
        m51222r0(false, clzVar.pageId());
        sfj0.m185596c("e_message_head", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        clzVar.m111056v6("profile_bubble");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0 && m51223s0()) {
            this.f33314K0 = 0;
            if (m51207c0(this.f33305G, rawX, rawY)) {
                this.f33314K0 = 1;
            } else if (m51207c0(this.f33298B, rawX, rawY) || m51207c0(this.f33301E, rawX, rawY) || m51207c0(this.f33303F, rawX, rawY)) {
                this.f33314K0 = 2;
            } else if (m51207c0(this.f33307H, rawX, rawY)) {
                this.f33314K0 = 3;
            } else if (m51207c0(this.f33357w, rawX, rawY) || m51207c0(this.f33358x, rawX, rawY)) {
                this.f33314K0 = 4;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m51209e0(clz clzVar, View view) {
        sfj0.m185596c("e_chat_avatar", clzVar.pageId(), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), clzVar.mo111034r3()))));
        m51222r0(false, clzVar.pageId());
        clzVar.m111056v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m51210f0() {
        if (NullChecker.m82486a(this.f33355u)) {
            this.f33359y.setRotation(8.0f);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m51211g0(clz clzVar) {
        l51.m152888H(clzVar.act(), new Runnable() { // from class: l.c800
            @Override // java.lang.Runnable
            public final void run() {
                this.f80173a.m51210f0();
            }
        }, 300L);
    }

    public VDraweeView getImageSmall() {
        return m51223s0() ? this.f33359y : this.f33343k;
    }

    public FrameLayout getTickleAnimContent() {
        return m51223s0() ? this.f33297A : this.f33345l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m51212h0(clz clzVar, View view) {
        m51222r0(false, clzVar.pageId());
        sfj0.m185596c("e_chat_avatar", clzVar.pageId(), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), clzVar.mo111034r3()))));
        clzVar.m111056v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m51213i0(View view) {
        this.f33355u.performClick();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m51214j0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m51222r0(true, str);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m51215k0(User user, CoreMomentInfo coreMomentInfo) {
        bnl0.m105524M(this.f33333a, true);
        if (NullChecker.m82486a(this.f33336d) && NullChecker.m82486a(this.f33337e) && NullChecker.m82486a(this.f33338f)) {
            if (coreMomentInfo.media.size() > 0) {
                bnl0.m105524M(this.f33337e, false);
                if (coreMomentInfo.media.get(0) instanceof Picture) {
                    uqb0.f180374G.m127115L0(this.f33336d, coreMomentInfo.media.get(0).url);
                    bnl0.m105524M(this.f33338f, coreMomentInfo.media.size() > 1);
                } else if (coreMomentInfo.media.get(0) instanceof Video) {
                    uqb0.f180374G.m127125Q0(this.f33336d, ((Video) coreMomentInfo.media.get(0)).cover.momentPictureSmall());
                    bnl0.m105524M(this.f33337e, true);
                } else {
                    uqb0.f180374G.m127138Y0(this.f33336d, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113935W : ibc0.f113927V);
                }
            } else {
                uqb0.f180374G.m127138Y0(this.f33336d, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113919U : ibc0.f113911T);
            }
        }
        if (NullChecker.m82486a(this.f33340h) && NullChecker.m82486a(this.f33341i)) {
            if (TextUtils.isEmpty(coreMomentInfo.value)) {
                boolean z = this.f33324P0;
                TextView textView = this.f33341i;
                if (z) {
                    textView.setText("你发布的动态");
                } else {
                    textView.setText(String.format("%s发布的动态", user.isFemale() ? "她" : "他"));
                }
            } else {
                this.f33341i.setText(coreMomentInfo.value);
            }
            boolean z2 = this.f33324P0;
            TextView textView2 = this.f33340h;
            if (z2) {
                textView2.setText(String.format("我通过这条动态喜欢了%s", user.isFemale() ? "她" : "他"));
            } else {
                textView2.setText(String.format("%s通过这条动态喜欢了我", user.isFemale() ? "她" : "他"));
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m51216l0(Throwable th) {
        bnl0.m105524M(this.f33333a, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m51217m0(List list, Act act, User user, User user2) {
        if (!jyb.m147479J(list)) {
            this.f33316L0 = (Question) list.get(new Random().nextInt(list.size()));
        }
        m51177B0(act, user, user2, this.f33316L0);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m51218n0(final Act act, final User user, final User user2) {
        final List<T> listQuery = CoreModule.f18272k.f115537e.query(null, null, -1);
        l51.m152887G(new Runnable() { // from class: l.g700
            @Override // java.lang.Runnable
            public final void run() {
                this.f102497a.m51217m0(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m51219o0(User user, User user2, Act act, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f33331V = m51192M(user);
        if (NullChecker.m82486a(this.f33309I)) {
            this.f33313K.setText(this.f33331V);
            bnl0.m105524M(this.f33309I, !TextUtils.isEmpty(this.f33331V));
        } else if (!TextUtils.isEmpty(this.f33331V)) {
            sb.append(this.f33331V);
        }
        this.f33332W = m51193N(user2, user, str);
        boolean zM82486a = NullChecker.m82486a(this.f33315L);
        String str2 = SignParameters.NEW_LINE;
        if (zM82486a) {
            this.f33319N.setText(this.f33332W);
            bnl0.m105524M(this.f33315L, !TextUtils.isEmpty(this.f33332W));
        } else if (!TextUtils.isEmpty(this.f33332W)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f33332W);
        }
        this.f33344k0 = m51196R(act, user);
        if (NullChecker.m82486a(this.f33321O)) {
            this.f33325Q.setText(this.f33344k0);
            bnl0.m105524M(this.f33321O, !TextUtils.isEmpty(this.f33344k0));
        } else if (!TextUtils.isEmpty(this.f33344k0)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : SignParameters.NEW_LINE);
            sb.append(this.f33344k0);
        }
        this.f33350p0 = m51197S(user, question);
        if (NullChecker.m82486a(this.f33327R)) {
            this.f33329T.setText(this.f33350p0);
            bnl0.m105524M(this.f33327R, !TextUtils.isEmpty(this.f33350p0));
        } else if (!TextUtils.isEmpty(this.f33350p0)) {
            if (TextUtils.isEmpty(sb.toString())) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(this.f33350p0);
        }
        if (NullChecker.m82486a(this.f33353s)) {
            if (TextUtils.isEmpty(sb.toString()) || m51205a0(user)) {
                bnl0.m105524M(this.f33353s, false);
                return;
            }
            setOldDateInfo(sb.toString());
            bnl0.m105524M(this.f33353s, true);
            this.f33353s.setTextColor(Color.parseColor("#66000000"));
            this.f33353s.setTextSize(14.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f33318M0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        View viewM51185H;
        super.onFinishInflate();
        if (m51223s0()) {
            viewM51185H = m51183G(p9r.m171370a(getContext()), this);
            if (gta.m132210e().m132214d().mo34702I4()) {
                this.f33299C.setTextColor(getResources().getColor(g9c0.f102817g));
                this.f33300D.setTextColor(getResources().getColor(g9c0.f102817g));
                this.f33301E.setTextColor(getResources().getColor(g9c0.f102819i));
                this.f33303F.setTextColor(getResources().getColor(g9c0.f102819i));
                this.f33305G.setTextColor(getResources().getColor(g9c0.f102819i));
                bnl0.m105526N(this.f33311J, ibc0.f114159v2);
                this.f33313K.setTextColor(getResources().getColor(g9c0.f102818h));
                bnl0.m105526N(this.f33317M, ibc0.f114186y2);
                this.f33319N.setTextColor(getResources().getColor(g9c0.f102818h));
                bnl0.m105526N(this.f33323P, ibc0.f113799G2);
                this.f33325Q.setTextColor(getResources().getColor(g9c0.f102818h));
                bnl0.m105526N(this.f33328S, ibc0.f113826J2);
                this.f33329T.setTextColor(getResources().getColor(g9c0.f102818h));
            }
            if (m51223s0()) {
                this.f33305G.setVisibility(0);
                this.f33305G.setText(getCheckTxt());
            }
            this.f33356v.setVisibility(0);
        } else {
            viewM51185H = m51185H(p9r.m171370a(getContext()), this);
        }
        setOrientation(1);
        addView(viewM51185H);
        if (CoreModule.m30933P().m143412i().mo34386O8()) {
            View viewM51181F = m51181F(p9r.m171370a(getContext()), this);
            if (gta.m132210e().m132214d().mo34702I4()) {
                this.f33340h.setTextColor(getResources().getColor(g9c0.f102817g));
                this.f33341i.setTextColor(getResources().getColor(g9c0.f102819i));
                this.f33337e.setImageResource(ibc0.f114068l1);
                this.f33338f.setImageResource(ibc0.f113943X);
            }
            addView(viewM51181F);
        }
        TextView textView = new TextView(getContext());
        this.f33320N0 = textView;
        textView.setTextColor(Color.parseColor("#4D000000"));
        this.f33320N0.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = qa00.m175859d(20.0f);
        this.f33320N0.setGravity(1);
        this.f33320N0.setVisibility(8);
        addView(this.f33320N0, layoutParams);
        if (m51223s0() && gta.m132210e().m132214d().mo34950xh() && !m51203Y() && !m51204Z() && NullChecker.m82486a(this.f33307H)) {
            int iIndexOfChild = this.f33355u.indexOfChild(this.f33307H);
            this.f33322O0 = (MessageIdealTypeHeadLayout) LayoutInflater.from(getContext()).inflate(qec0.f156862H1, (ViewGroup) this.f33355u, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = -qa00.m175859d(20.0f);
            marginLayoutParams.rightMargin = -qa00.m175859d(20.0f);
            this.f33355u.addView(this.f33322O0, iIndexOfChild, marginLayoutParams);
            bnl0.m105524M(this.f33307H, false);
            bnl0.m105509E0(this.f33322O0, new View.OnClickListener() { // from class: l.a700
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68781a.m51213i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m51220p0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f33346m.setBackgroundResource(ibc0.f114114q2);
            return;
        }
        this.f33346m.setBackground(new BitmapDrawable(getResources(), m51149P(m51191K0(bitmap, qa00.m175859d(213.0f), qa00.m175859d(280.0f)), qa00.m175859d(10.0f))));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m51221q0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f33346m.setBackgroundResource(ibc0.f114114q2);
            return;
        }
        this.f33346m.setBackground(new BitmapDrawable(getResources(), m51149P(m51191K0(bitmap, qa00.m175859d(213.0f), qa00.m175859d(280.0f)), qa00.m175859d(10.0f))));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m51222r0(boolean z, String str) {
        if (m51223s0()) {
            if (z) {
                sfj0.m185601h("e_match_card", str, sfj0.C20032a.m185615h("card_content_personal_info", !TextUtils.isEmpty(this.f33331V) ? "1" : "0"), sfj0.C20032a.m185615h("card_conntent_common_info", !TextUtils.isEmpty(this.f33332W) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_tag", !TextUtils.isEmpty(this.f33344k0) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_question", TextUtils.isEmpty(this.f33350p0) ? "0" : "1"));
                return;
            }
            boolean zM51223s0 = m51223s0();
            String str2 = this.f33331V;
            if (zM51223s0) {
                sfj0.m185596c("e_match_card", str, sfj0.C20032a.m185615h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), sfj0.C20032a.m185615h("card_conntent_common_info", !TextUtils.isEmpty(this.f33332W) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_tag", !TextUtils.isEmpty(this.f33344k0) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_question", TextUtils.isEmpty(this.f33350p0) ? "0" : "1"), sfj0.C20032a.m185613f("card_click_area", this.f33314K0));
            } else {
                sfj0.m185596c("e_match_card", str, sfj0.C20032a.m185615h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), sfj0.C20032a.m185615h("card_conntent_common_info", !TextUtils.isEmpty(this.f33332W) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_tag", !TextUtils.isEmpty(this.f33344k0) ? "1" : "0"), sfj0.C20032a.m185615h("card_content_question", TextUtils.isEmpty(this.f33350p0) ? "0" : "1"));
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m51223s0() {
        if (m51206b0()) {
            return false;
        }
        return CoreModule.m30933P().m143412i().mo180494k5();
    }

    public void setFpAnonymityIncludeSelfImage(User user) {
        if (NullChecker.m82486a(this.f33348o)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(this.f33348o, CoreModule.m30933P().m143412i().mo180467f3());
            } else if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id))) {
                uqb0.f180374G.m127115L0(this.f33348o, user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127096B0(this.f33348o, ux6.m198404b(user).profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m82486a(imageSmall)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(imageSmall, CoreModule.m30933P().m143412i().mo180398T0());
            } else if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id))) {
                uqb0.f180374G.m127115L0(imageSmall, user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(imageSmall, ux6.m198404b(user).profileSmall());
            }
        }
    }

    public void setOtherSmallImage(User user) {
        if (NullChecker.m82486a(this.f33348o)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(this.f33348o, CoreModule.m30933P().m143412i().mo180467f3());
            } else if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id))) {
                uqb0.f180374G.m127115L0(this.f33348o, user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127096B0(this.f33348o, user.m61308fp().profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.m82486a(imageSmall)) {
            if (user.inactivated) {
                uqb0.f180374G.m127138Y0(imageSmall, CoreModule.m30933P().m143412i().mo180398T0());
            } else if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id))) {
                uqb0.f180374G.m127115L0(imageSmall, user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(imageSmall, user.m61308fp().profileSmall());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m51224t0(String str) {
        if (this.f33330U) {
            return;
        }
        if (NullChecker.m82486a(this.f33312J0)) {
            m51226v0(this.f33312J0, str);
        }
        if (m51223s0() && NullChecker.m82486a(this.f33355u)) {
            m51225u0(this.f33355u, str);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m51225u0(View view, final String str) {
        if (view.getGlobalVisibleRect(new Rect())) {
            this.f33330U = true;
            view.postDelayed(new Runnable() { // from class: l.f800
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97694a.m51214j0(str);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m51226v0(final MessageAboutMeContentView messageAboutMeContentView, final String str) {
        if (messageAboutMeContentView.getGlobalVisibleRect(new Rect())) {
            this.f33330U = true;
            messageAboutMeContentView.postDelayed(new Runnable() { // from class: l.e700
                @Override // java.lang.Runnable
                public final void run() {
                    MessageUserHeaderLayout.m51173x(str, messageAboutMeContentView);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final CharSequence m51227w0(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.m82486a(this.f33317M)) {
            boolean zMo180437a2 = CoreModule.m30933P().m143412i().mo180437a2();
            VImage vImage = this.f33317M;
            if (zMo180437a2) {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113754B2 : ibc0.f113745A2);
            } else {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113763C2 : ibc0.f114195z2);
            }
        }
        return m51187I0(CoreModule.f18263b.getString(R$string.f21655Z4) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.profile.studies.school + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f21790o5), user.profile.studies.school);
    }

    /* JADX INFO: renamed from: x0 */
    public void m51228x0(final User user, User user2) {
        if (NullChecker.m82486a(this.f33333a)) {
            String str = "";
            if (NullChecker.m82486a(user) && NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions)) {
                boolean zIsEmpty = TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId);
                Relationship relationship = user.localRelationship;
                if (!zIsEmpty) {
                    String str2 = relationship.relationshipExtensions.otherMomentId;
                    this.f33324P0 = false;
                    this.f33326Q0 = NullChecker.m82486a(user2) ? user2.f56859id : "";
                    str = str2;
                } else if (!TextUtils.isEmpty(relationship.relationshipExtensions.momentId)) {
                    str = user.localRelationship.relationshipExtensions.momentId;
                    this.f33324P0 = true;
                    this.f33326Q0 = user.f56859id;
                }
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f33326Q0) || TextUtils.equals(CoreMomentInfo.LOCAL_ID_INVALID, str)) {
                bnl0.m105524M(this.f33333a, false);
            } else {
                psd0.m173633z(this.f33318M0);
                this.f33318M0 = CoreModule.m30932N().momentRefresh(this.f33326Q0, str, CoreMomentInfo.JSON_ADAPTER).takeFirst(new qcj() { // from class: l.b700
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a((CoreMomentInfo) obj));
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.c700
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80048a.m51215k0(user, (CoreMomentInfo) obj);
                    }
                }, new y20() { // from class: l.d700
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f85437a.m51216l0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m51229y0(Act act, clz<User, yxz> clzVar, User user, User user2) {
        setMatchIcon(user2);
        m51230z0(user, user2);
        if (CoreModule.m30933P().m143412i().mo180457e() && NullChecker.m82486a(this.f33355u) && NullChecker.m82486a(user2) && !user2.isHideIconFromSVipWithMe() && user2.isSupremePartner()) {
            m51200V();
        } else if (CoreModule.m30933P().m143412i().mo180437a2() && NullChecker.m82486a(this.f33355u)) {
            m51201W();
        }
        if (!user2.isTeamAccount()) {
            m51178C0();
            m51179D0(user2, clzVar.f82482k);
            m51180E0(user, user2);
            m51224t0(clzVar.pageId());
            m51176A0(act, user, user2, clzVar.f82482k);
        } else if (clzVar.mo111034r3().equals(User.ID_TEAM_ACCOUNT_SERVICE)) {
            setOldDateInfo("你好呀，我是你的探探付费通知小助手“服务提醒”，如遇到任何付费功能相关的问题都可以找我帮你解决哦");
        } else if (clzVar.mo111034r3().equals(User.ID_AI_STORY)) {
            setOldDateInfo("AI思思来啦！是文笔超棒，共情能力超强的思思哦，和我聊聊你的感情故事吧，我会好好帮你记录下来的~");
        } else {
            setOldDateInfo(act.getString(R$string.f21726h4));
        }
        if (NullChecker.m82486a(this.f33307H)) {
            bnl0.m105524M(this.f33307H, !m51205a0(user2));
        }
        if (NullChecker.m82486a(this.f33322O0)) {
            bnl0.m105524M(this.f33307H, false);
            this.f33322O0.m51085g(act, user2);
        }
        if (NullChecker.m82486a(this.f33353s)) {
            bnl0.m105524M(this.f33353s, (m51205a0(user2) || TextUtils.isEmpty(this.f33353s.getText())) ? false : true);
        }
        if (!NullChecker.m82486a(clzVar.f82482k) || !NullChecker.m82486a(clzVar.f82482k.property) || !NullChecker.m82486a(clzVar.f82482k.property.conversationTag) || TextUtils.isEmpty(clzVar.f82482k.property.conversationTag.guide)) {
            bnl0.m105524M(this.f33320N0, false);
        } else {
            this.f33320N0.setText(clzVar.f82482k.property.conversationTag.guide);
            bnl0.m105524M(this.f33320N0, true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m51230z0(User user, User user2) {
        boolean z = CoreModule.f18264c.f20303E0.m141091z3(user2) || m51205a0(user2);
        if (NullChecker.m82486a(this.f33299C)) {
            boolean zM51205a0 = m51205a0(user2);
            VText vText = this.f33299C;
            if (zM51205a0) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f33299C.getPaint().setFakeBoldText(true);
        }
        if (m51223s0()) {
            if (NullChecker.m82486a(this.f33303F) && !z) {
                this.f33303F.setText(" · " + user2.age + "岁");
                this.f33303F.setVisibility(0);
                this.f33300D.setVisibility(8);
            }
        } else if (NullChecker.m82486a(this.f33300D) && !z) {
            this.f33300D.setText(String.valueOf(user2.age));
            this.f33303F.setVisibility(8);
            this.f33300D.setVisibility(0);
        }
        if (NullChecker.m82486a(this.f33357w)) {
            if (m51202X(CoreModule.f18264c.f20384f0.m33859Xe(user2.f56859id))) {
                uqb0.f180374G.m127115L0(this.f33357w, user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(this.f33357w, ux6.m198404b(user).profileSmall());
            }
        }
        if (m51205a0(user2) || !NullChecker.m82486a(this.f33301E)) {
            return;
        }
        this.f33301E.setText(m51198T(user2));
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33330U = false;
        this.f33331V = "";
        this.f33332W = "";
        this.f33344k0 = "";
        this.f33350p0 = "";
        this.f33316L0 = null;
        this.f33324P0 = false;
        this.f33326Q0 = "";
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33330U = false;
        this.f33331V = "";
        this.f33332W = "";
        this.f33344k0 = "";
        this.f33350p0 = "";
        this.f33316L0 = null;
        this.f33324P0 = false;
        this.f33326Q0 = "";
    }
}
