package com.p000p1.mobile.putong.core.p001ui.messages.view;

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
import com.baidu.mapapi.model.LatLng;
import com.p000p1.mobile.putong.core.p001ui.messages.view.MessageUserHeaderLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.aboutme.MessageAboutMeContentView;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import l.a1c0;
import l.bpz;
import l.c3c0;
import l.c4g0;
import l.d90;
import l.e30;
import l.e51;
import l.fcz;
import l.hmb;
import l.i0g0;
import l.j760;
import l.jjb0;
import l.jly;
import l.jzz;
import l.kzz;
import l.l6c0;
import l.lzz;
import l.mjj;
import l.mkd0;
import l.ml6;
import l.o6j0;
import l.o7r;
import l.qc2;
import l.qib0;
import l.rw6;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import l.zxz;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.wmz;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageUserHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public FrameLayout f271A;

    /* JADX INFO: renamed from: B */
    public VLinear f272B;

    /* JADX INFO: renamed from: C */
    public VText f273C;

    /* JADX INFO: renamed from: D */
    public VText f274D;

    /* JADX INFO: renamed from: E */
    public VText f275E;

    /* JADX INFO: renamed from: E0 */
    public View f276E0;

    /* JADX INFO: renamed from: F */
    public VText f277F;

    /* JADX INFO: renamed from: F0 */
    public VText f278F0;

    /* JADX INFO: renamed from: G */
    public TextView f279G;

    /* JADX INFO: renamed from: G0 */
    public VText f280G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f281H;

    /* JADX INFO: renamed from: H0 */
    public VText f282H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f283I;

    /* JADX INFO: renamed from: I0 */
    public View f284I0;

    /* JADX INFO: renamed from: J */
    public VImage f285J;

    /* JADX INFO: renamed from: J0 */
    public MessageAboutMeContentView f286J0;

    /* JADX INFO: renamed from: K */
    public VText f287K;

    /* JADX INFO: renamed from: K0 */
    public int f288K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f289L;

    /* JADX INFO: renamed from: L0 */
    public Question f290L0;

    /* JADX INFO: renamed from: M */
    public VImage f291M;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f292M0;

    /* JADX INFO: renamed from: N */
    public VText f293N;

    /* JADX INFO: renamed from: N0 */
    public TextView f294N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f295O;

    /* JADX INFO: renamed from: O0 */
    public MessageIdealTypeHeadLayout f296O0;

    /* JADX INFO: renamed from: P */
    public VImage f297P;

    /* JADX INFO: renamed from: P0 */
    public boolean f298P0;

    /* JADX INFO: renamed from: Q */
    public VText f299Q;

    /* JADX INFO: renamed from: Q0 */
    public String f300Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f301R;

    /* JADX INFO: renamed from: S */
    public VImage f302S;

    /* JADX INFO: renamed from: T */
    public VText f303T;

    /* JADX INFO: renamed from: U */
    public boolean f304U;

    /* JADX INFO: renamed from: V */
    public String f305V;

    /* JADX INFO: renamed from: W */
    public CharSequence f306W;

    /* JADX INFO: renamed from: a */
    public FrameLayout f307a;

    /* JADX INFO: renamed from: b */
    public VLinear f308b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f309c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f310d;

    /* JADX INFO: renamed from: e */
    public VImage f311e;

    /* JADX INFO: renamed from: f */
    public VImage f312f;

    /* JADX INFO: renamed from: g */
    public VLinear f313g;

    /* JADX INFO: renamed from: h */
    public TextView f314h;

    /* JADX INFO: renamed from: i */
    public TextView f315i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f316j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f317k;

    /* JADX INFO: renamed from: k0 */
    public CharSequence f318k0;

    /* JADX INFO: renamed from: l */
    public FrameLayout f319l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f320m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f321n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f322o;

    /* JADX INFO: renamed from: p */
    public VImage f323p;

    /* JADX INFO: renamed from: p0 */
    public CharSequence f324p0;

    /* JADX INFO: renamed from: q */
    public VImage f325q;

    /* JADX INFO: renamed from: r */
    public ViewStub f326r;

    /* JADX INFO: renamed from: s */
    public VText f327s;

    /* JADX INFO: renamed from: t */
    public ViewStub f328t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f329u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f330v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f331w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f332x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f333y;

    /* JADX INFO: renamed from: z */
    public VImage f334z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout$a */
    public class C0022a implements b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f335a;

        public C0022a(fcz fczVar) {
            this.f335a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public String m470a() {
            return this.f335a.r3();
        }

        /* JADX INFO: renamed from: b */
        public String m471b() {
            return this.f335a.r3();
        }

        /* JADX INFO: renamed from: c */
        public boolean m472c() {
            return CoreModule.P().i().D() && this.f335a.V2() && !User.isTeamAccount(this.f335a.r3());
        }
    }

    public MessageUserHeaderLayout(Context context) {
        super(context);
        this.f304U = false;
        this.f305V = "";
        this.f306W = "";
        this.f318k0 = "";
        this.f324p0 = "";
        this.f290L0 = null;
        this.f298P0 = false;
        this.f300Q0 = "";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m382B(List list, final Tag tag, final Tag tag2) {
        return vwb.G(list, new w9j() { // from class: l.wyz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag.category));
            }
        }) - vwb.G(list, new w9j() { // from class: l.xyz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, tag2.category));
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static String m386I(float f, String str) {
        String str2;
        if (f < 1000.0f) {
            str2 = i0g0.b.format(f) + CoreModule.b.getString(R.string.U4);
        } else {
            str2 = i0g0.b.format(f / 1000.0f) + CoreModule.b.getString(R.string.i4);
        }
        return str + "(" + str2 + ")";
    }

    /* JADX INFO: renamed from: L */
    public static String m387L(User user) {
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
        Settings settings = CoreModule.c.e0.na().settings;
        if (!jjb0.c() || !NullChecker.a(settings) || settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue() || user.location.distance <= settings.getSearchRadius().intValue()) {
            return m386I(user.location.distance, string);
        }
        j760 j760VarZ = i0g0.Z(CoreModule.c.e0.na(), user.location, false);
        return (((String) j760VarZ.a) + ((String) j760VarZ.b)).toString();
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m388P(Bitmap bitmap, int i) {
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
        String strF = RemoteConfig.x().F("icebreaking_check_txt");
        String string = CoreModule.b.getString(R.string.R5);
        if (!TextUtils.isEmpty(strF)) {
            try {
                String strOptString = new JSONObject(strF).optString("content");
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
                return c3c0.Y0;
            case "ja":
                return c3c0.Z0;
            case "ko":
                return c3c0.a1;
            case "th":
                return c3c0.b1;
            case "vi":
                return c3c0.c1;
            case "zh":
                return (Locale.getDefault().getCountry() == "TW" || Locale.getDefault().getCountry() == "HK" || Locale.getDefault().getCountry() == "MO") ? c3c0.e1 : c3c0.d1;
            default:
                return c3c0.X0;
        }
    }

    private void setMatchIcon(User user) {
        VImage vImage = this.f323p;
        if (m462s0()) {
            vImage = this.f334z;
        }
        if (user == null || vImage == null || m444a0(user)) {
            return;
        }
        if (NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.status) && ((TEnum.equals(user.localRelationship.state, "matched") || TEnum.equals(user.localRelationship.state, "liked")) && user.localRelationship.status.contains(MatchFrom.get("boosted")) && CoreModule.P().i().G1())) {
            vImage.setVisibility(0);
            if (CoreModule.P().e().wq()) {
                vImage.setImageResource(c3c0.m3);
                return;
            } else {
                vImage.setImageResource(c3c0.l3);
                return;
            }
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("superLiked")) && CoreModule.P().i().G1()) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.p3);
            return;
        }
        if (CoreModule.P().i().Q4(((DbObject) user).id)) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.g6);
            return;
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && user.localRelationship.status.contains(MatchFrom.get("letter"))) {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.o3);
            return;
        }
        Relationship relationship = user.localRelationship;
        if ((relationship != null && !TEnum.equals(relationship.state, "default") && !TEnum.equals(user.localRelationship.state, "unknown_")) || !NullChecker.a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            vImage.setVisibility(8);
        } else {
            vImage.setVisibility(0);
            vImage.setImageResource(c3c0.n3);
        }
    }

    private void setOldDateInfo(String str) {
        if (NullChecker.a(this.f327s) && NullChecker.a(str)) {
            this.f327s.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m411w(e30 e30Var, d90 d90Var) {
        if (d90Var == null) {
            e30Var.call("");
            return;
        }
        if (!TextUtils.isEmpty(d90Var.c())) {
            e30Var.call(d90Var.c());
        } else if (TextUtils.isEmpty(d90Var.f())) {
            e30Var.call("");
        } else {
            e30Var.call(d90Var.f());
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m412x(String str, MessageAboutMeContentView messageAboutMeContentView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.A("e_chat_sayhi_card", str, new j760[]{j760.a("chat_card_content_category", messageAboutMeContentView.getShowedTrackParams()), j760.a("chat_card_content", messageAboutMeContentView.getShowContent())});
    }

    /* JADX INFO: renamed from: A0 */
    public final void m415A0(final Act act, final User user, final User user2, Conversation conversation) {
        if (m444a0(user2)) {
            return;
        }
        if (!m462s0()) {
            xdl0.M(this.f327s, false);
            return;
        }
        Question question = this.f290L0;
        if (question == null) {
            e51.y(new Runnable() { // from class: l.ezz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10072a.m457n0(act, user, user2);
                }
            });
        } else {
            m416B0(act, user, user2, question);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m416B0(final Act act, final User user, final User user2, final Question question) {
        m433O(act, user2, new e30() { // from class: l.iyz
            public final void call(Object obj) {
                this.f13488a.m458o0(user2, user, act, question, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m417C0() {
        LinearLayout linearLayout = this.f320m;
        if (linearLayout == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = t100.d(232.0f);
        layoutParams.height = -2;
        this.f320m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m418D0(User user, Conversation conversation) {
        if (this.f326r == null) {
            return;
        }
        if (ml6.d(conversation)) {
            xdl0.M(this.f325q, true);
            m429K(this.f325q);
            this.f325q.setBackgroundResource(getIntlInstantMatchTagIcon());
        }
        if (ml6.d(conversation)) {
            qib0.G.I("https://auto.tancdn.com/v1/images/eyJpZCI6IlNCTEpVREI2RFdQTkw0U09OVkczNjZVUTZOVEhZNjE0IiwidyI6NDIwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjYwOTgxMTY1Nzc5NTE3NDR9.png", new e30() { // from class: l.gzz
                public final void call(Object obj) {
                    this.f11708a.m459p0((Bitmap) obj);
                }
            });
        } else if (ml6.f(conversation)) {
            qib0.G.I("https://auto.tancdn.com/v1/raw/ce8a6af5-70b4-4386-b63e-8aebd6f11c5d14.webp", new e30() { // from class: l.hzz
                public final void call(Object obj) {
                    this.f12382a.m460q0((Bitmap) obj);
                }
            });
        } else {
            this.f320m.setBackgroundResource(c3c0.q2);
        }
        boolean zZ3 = CoreModule.c.E0.z3(user);
        if (this.f276E0 == null) {
            View viewInflate = this.f326r.inflate();
            this.f276E0 = viewInflate;
            this.f278F0 = viewInflate.findViewById(y4c0.a5);
            this.f280G0 = this.f276E0.findViewById(y4c0.Z4);
            this.f282H0 = this.f276E0.findViewById(y4c0.Y4);
        }
        VText vText = this.f278F0;
        vText.setTypeface(vText.getTypeface(), 1);
        boolean zM444a0 = m444a0(user);
        VText vText2 = this.f278F0;
        if (zM444a0) {
            vText2.setText(user.publicId);
            if (user.age.intValue() > 0) {
                this.f280G0.setText(String.valueOf(user.age));
            }
        } else {
            vText2.setText(user.name);
            this.f280G0.setText(String.valueOf(user.age));
        }
        if (zZ3) {
            xdl0.M(this.f280G0, false);
        }
        xdl0.M(this.f282H0, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m419E0(User user, User user2) {
        if (user == null || user2 == null || m462s0() || m444a0(user2) || !NullChecker.a(this.f328t)) {
            return;
        }
        if (this.f284I0 == null) {
            View viewInflate = this.f328t.inflate();
            this.f284I0 = viewInflate;
            this.f286J0 = viewInflate.findViewById(y4c0.q5);
        }
        this.f286J0.setContent(jly.N().K(user, user2));
        this.f286J0.getShowedTagType().remove("about_me");
    }

    /* JADX INFO: renamed from: F */
    public View m420F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jzz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F0 */
    public void m421F0(User user, int i) {
        if (NullChecker.a(this.f322o)) {
            if (user.inactivated) {
                qib0.G.Y0(this.f322o, CoreModule.P().i().f3());
            } else {
                CoreModule.P().i().y2(this.f322o, rw6.a(user).profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.a(imageSmall)) {
            if (user.inactivated) {
                qib0.G.Y0(imageSmall, CoreModule.P().i().T0());
            } else {
                CoreModule.P().i().y2(imageSmall, rw6.a(user).profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m422G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kzz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m423G0(User user, int i) {
        if (NullChecker.a(this.f322o)) {
            if (user.inactivated) {
                qib0.G.Y0(this.f322o, CoreModule.P().i().f3());
            } else if (m441X(CoreModule.c.f0.Xe(((DbObject) user).id))) {
                qib0.G.L0(this.f322o, user.getAnonymousUrl());
            } else {
                CoreModule.P().i().y2(this.f322o, user.fp().profileBig(), i);
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.a(imageSmall)) {
            if (user.inactivated) {
                qib0.G.Y0(imageSmall, CoreModule.P().i().T0());
            } else {
                CoreModule.P().i().y2(imageSmall, user.fp().profileSmall(), i);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public View m424H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lzz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H0 */
    public void m425H0() {
        if (m462s0()) {
            return;
        }
        if (NullChecker.a(this.f320m)) {
            this.f320m.setBackgroundResource(c3c0.i4);
            LinearLayout linearLayout = this.f320m;
            int i = t100.c;
            linearLayout.setPadding(i, i, i, t100.i);
        }
        if (NullChecker.a(this.f327s)) {
            this.f327s.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m426I0(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length() + iIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(ura.e().d().I4() ? -16777216 : Color.parseColor("#cc000000")), iIndexOf, length, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: J */
    public final void m427J(StringBuilder sb, List<Tag> list) {
        if (vwb.J(list)) {
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
    public final void m428J0() {
        m462s0();
    }

    /* JADX INFO: renamed from: K */
    public void m429K(View view) {
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
            m429K((View) view.getParent());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public Bitmap m430K0(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: M */
    public final String m431M(User user) {
        StringBuilder sb = new StringBuilder();
        String strM387L = m387L(user);
        if (!TextUtils.isEmpty(strM387L) && !user.isHideLocationFromSVip()) {
            sb.append("居住在");
            sb.append(strM387L);
        }
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(CoreModule.b.getString(R.string.a5));
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public final CharSequence m432N(User user, User user2, String str) {
        CharSequence charSequenceM434Q = m434Q(user, user2);
        CharSequence[] charSequenceArr = {charSequenceM434Q};
        if (!TextUtils.isEmpty(charSequenceM434Q)) {
            if (NullChecker.a(this.f291M)) {
                boolean zA2 = CoreModule.P().i().a2();
                VImage vImage = this.f291M;
                if (zA2) {
                    vImage.setImageResource(ura.e().d().I4() ? c3c0.B2 : c3c0.A2);
                } else {
                    vImage.setImageResource(ura.e().d().I4() ? c3c0.C2 : c3c0.z2);
                }
            }
            return charSequenceArr[0];
        }
        if (!TextUtils.isEmpty(str)) {
            charSequenceArr[0] = m426I0(CoreModule.b.getString(R.string.b5) + " " + str + " " + CoreModule.b.getString(R.string.c5), str);
        }
        if (!TextUtils.isEmpty(charSequenceArr[0])) {
            return charSequenceArr[0];
        }
        if (NullChecker.a(user2.location.passby) && user2.location.passby.count > 0) {
            charSequenceArr[0] = m426I0(CoreModule.b.getString(R.string.d5) + " " + user2.location.passby.count + " " + CoreModule.b.getString(R.string.s6), String.valueOf(user2.location.passby.count));
        }
        return !TextUtils.isEmpty(charSequenceArr[0]) ? charSequenceArr[0] : m466w0(user, user2);
    }

    /* JADX INFO: renamed from: O */
    public final void m433O(Act act, User user, final e30<String> e30Var) {
        if (e30Var == null) {
            return;
        }
        Passby passby = user.location.passby;
        if (passby == null) {
            e30Var.call("");
            return;
        }
        DoublePair doublePair = passby.location.coordinates;
        LatLng latLngB = qc2.b(new LatLng(doublePair.first, doublePair.second));
        mjj mjjVarC = mjj.c(act, false);
        if (latLngB == null) {
            e30Var.call("");
        } else {
            mjjVarC.e(act, latLngB.latitude, latLngB.longitude, new e30() { // from class: l.pyz
                public final void call(Object obj) {
                    MessageUserHeaderLayout.m411w(e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.qyz
                public final void call(Object obj) {
                    e30Var.call("");
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public final CharSequence m434Q(User user, User user2) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("sports");
        arrayList.add("music");
        arrayList.add("places");
        arrayList.add("food");
        arrayList.add("movies");
        ArrayList arrayListN = vwb.n(user2.profile.tags, new w9j() { // from class: l.kyz
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.azz
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN)) {
            return "";
        }
        final ArrayList arrayListN2 = vwb.n(user.profile.tags, new w9j() { // from class: l.lyz
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.yyz
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals((String) obj2, tag.category));
                    }
                }));
            }
        });
        if (vwb.J(arrayListN2)) {
            return "";
        }
        Comparator comparator = new Comparator() { // from class: l.myz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MessageUserHeaderLayout.m382B(arrayList, (Tag) obj, (Tag) obj2);
            }
        };
        Collections.sort(arrayListN2, comparator);
        Collections.sort(arrayListN, comparator);
        ArrayList arrayListN3 = vwb.n(arrayListN, new w9j() { // from class: l.nyz
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(vwb.r(arrayListN2, new w9j() { // from class: l.bzz
                    public final Object call(Object obj2) {
                        Tag tag = tag;
                        Tag tag2 = (Tag) obj2;
                        return Boolean.valueOf(TextUtils.equals(tag.category, tag2.category) && TextUtils.equals(tag.value, tag2.value));
                    }
                })));
            }
        });
        if (vwb.J(arrayListN3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(CoreModule.b.getString(R.string.Y4) + "：");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayListN3.size(); i++) {
            if (i != 0) {
                sb2.append("、");
            }
            sb2.append(((Tag) arrayListN3.get(i)).value);
        }
        sb.append((CharSequence) sb2);
        return m426I0(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: R */
    public final CharSequence m435R(Act act, User user) {
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
        m427J(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.ryz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
            }
        }));
        m427J(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.syz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("places", ((Tag) obj).category));
            }
        }));
        m427J(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.tyz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
            }
        }));
        m427J(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.uyz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
            }
        }));
        m427J(sb, vwb.n(user.profile.tags, new w9j() { // from class: l.vyz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
            }
        }));
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        return m426I0((TEnum.equals(user.gender, "female") ? CoreModule.b.getString(R.string.b3) : CoreModule.b.getString(R.string.d3)) + "：" + sb.toString(), sb.toString());
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m436S(User user, Question question) {
        Question questionO3;
        if (vwb.J(user.profile.answers)) {
            questionO3 = null;
        } else {
            questionO3 = CoreModule.c.d0.o3(((Answer) user.profile.answers.get(0)).question);
        }
        if (questionO3 != null) {
            question = questionO3;
        }
        if (question == null) {
            return "";
        }
        return (TEnum.equals(user.gender, "female") ? CoreModule.b.getString(R.string.c3) : CoreModule.b.getString(R.string.e3)) + ": " + question.text;
    }

    /* JADX INFO: renamed from: T */
    public final String m437T(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? i0g0.j0(user.profile.zodiac) : "";
    }

    /* JADX INFO: renamed from: U */
    public void m438U(final fcz<User, bpz> fczVar) {
        if (fczVar.l7()) {
            hmb.M(this.f329u, false);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.oyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16913a.m447d0(fczVar, view);
            }
        };
        if (NullChecker.a(this.f329u)) {
            xdl0.E0(this.f329u, onClickListener);
        }
        if (NullChecker.a(this.f320m)) {
            xdl0.E0(this.f320m, onClickListener);
        }
        if (CoreModule.P().i().D() && !User.isTeamAccount(fczVar.r3()) && fczVar.V2() && !m462s0()) {
            b.t(getImageSmall(), new C0022a(fczVar), new View.OnClickListener() { // from class: l.zyz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23676a.m448e0(fczVar, view);
                }
            }, new Runnable() { // from class: l.czz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9006a.m450g0(fczVar);
                }
            });
        }
        xdl0.E0(getImageSmall(), new View.OnClickListener() { // from class: l.dzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9498a.m451h0(fczVar, view);
            }
        });
        m428J0();
        if (CoreModule.P().i().D()) {
            zxz.h().p(fczVar.r3(), "headView", getTickleAnimContent(), getImageSmall());
        }
    }

    /* JADX INFO: renamed from: V */
    public void m439V() {
        this.f329u.setBackgroundResource(c3c0.t5);
        this.f279G.setBackgroundResource(c3c0.Z1);
        this.f279G.setTextColor(Color.parseColor("#FFD489"));
        this.f285J.setImageResource(ura.e().d().I4() ? c3c0.u2 : c3c0.t2);
        this.f291M.setImageResource(ura.e().d().I4() ? c3c0.x2 : c3c0.w2);
        this.f297P.setImageResource(ura.e().d().I4() ? c3c0.F2 : c3c0.E2);
        this.f302S.setImageResource(ura.e().d().I4() ? c3c0.I2 : c3c0.H2);
    }

    /* JADX INFO: renamed from: W */
    public void m440W() {
        this.f329u.setBackgroundResource(c3c0.s5);
        this.f279G.setBackgroundResource(c3c0.Y1);
        this.f279G.setTextColor(Color.parseColor("#74502A"));
        this.f285J.setImageResource(ura.e().d().I4() ? c3c0.u2 : c3c0.t2);
        this.f291M.setImageResource(ura.e().d().I4() ? c3c0.x2 : c3c0.w2);
        this.f297P.setImageResource(ura.e().d().I4() ? c3c0.F2 : c3c0.E2);
        this.f302S.setImageResource(ura.e().d().I4() ? c3c0.I2 : c3c0.H2);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m441X(Conversation conversation) {
        MessagesAct context = getContext();
        if (NullChecker.a(conversation) && conversation.isAnonymous()) {
            return true;
        }
        return (context instanceof MessagesAct) && context.f.Y3();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m442Y() {
        MessagesAct context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = context;
            String str = messagesAct.f.b;
            if (!TextUtils.isEmpty(str) && (messagesAct.f instanceof wmz)) {
                User userPa = CoreModule.c.e0.Pa(str);
                if (NullChecker.a(userPa) && userPa.isBanedOrInactivated()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m443Z() {
        MessagesAct context = getContext();
        if (!(context instanceof MessagesAct)) {
            return false;
        }
        MessagesAct messagesAct = context;
        if (NullChecker.a(messagesAct.u2())) {
            return TEnum.equals(messagesAct.u2().status, "blocked");
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m444a0(User user) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m445b0() {
        MessagesAct context = getContext();
        if (context instanceof MessagesAct) {
            String str = context.f.b;
            if (!TextUtils.isEmpty(str)) {
                User userPa = CoreModule.c.e0.Pa(str);
                if (NullChecker.a(userPa) && userPa.isTeamAccount()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m446c0(View view, int i, int i2) {
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
    public final /* synthetic */ void m447d0(fcz fczVar, View view) {
        m461r0(false, fczVar.pageId());
        o6j0.c("e_message_head", "p_chat_view", new o6j0.a[0]);
        fczVar.v6("profile_bubble");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0 && m462s0()) {
            this.f288K0 = 0;
            if (m446c0(this.f279G, rawX, rawY)) {
                this.f288K0 = 1;
            } else if (m446c0(this.f272B, rawX, rawY) || m446c0(this.f275E, rawX, rawY) || m446c0(this.f277F, rawX, rawY)) {
                this.f288K0 = 2;
            } else if (m446c0(this.f281H, rawX, rawY)) {
                this.f288K0 = 3;
            } else if (m446c0(this.f331w, rawX, rawY) || m446c0(this.f332x, rawX, rawY)) {
                this.f288K0 = 4;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m448e0(fcz fczVar, View view) {
        o6j0.c("e_chat_avatar", fczVar.pageId(), new o6j0.a[]{o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), fczVar.r3())))});
        m461r0(false, fczVar.pageId());
        fczVar.v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m449f0() {
        if (NullChecker.a(this.f329u)) {
            this.f333y.setRotation(8.0f);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m450g0(fcz fczVar) {
        e51.H(fczVar.act(), new Runnable() { // from class: l.fzz
            @Override // java.lang.Runnable
            public final void run() {
                this.f10698a.m449f0();
            }
        }, 300L);
    }

    public VDraweeView getImageSmall() {
        return m462s0() ? this.f333y : this.f317k;
    }

    public FrameLayout getTickleAnimContent() {
        return m462s0() ? this.f271A : this.f319l;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m451h0(fcz fczVar, View view) {
        m461r0(false, fczVar.pageId());
        o6j0.c("e_chat_avatar", fczVar.pageId(), new o6j0.a[]{o6j0.a.h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.H().userId(), fczVar.r3())))});
        fczVar.v6("messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m452i0(View view) {
        this.f329u.performClick();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m453j0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m461r0(true, str);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m454k0(User user, CoreMomentInfo coreMomentInfo) {
        xdl0.M(this.f307a, true);
        if (NullChecker.a(this.f310d) && NullChecker.a(this.f311e) && NullChecker.a(this.f312f)) {
            if (coreMomentInfo.media.size() > 0) {
                xdl0.M(this.f311e, false);
                if (coreMomentInfo.media.get(0) instanceof Picture) {
                    qib0.G.L0(this.f310d, ((Media) coreMomentInfo.media.get(0)).url);
                    xdl0.M(this.f312f, coreMomentInfo.media.size() > 1);
                } else if (coreMomentInfo.media.get(0) instanceof Video) {
                    qib0.G.Q0(this.f310d, ((Video) coreMomentInfo.media.get(0)).cover.momentPictureSmall());
                    xdl0.M(this.f311e, true);
                } else {
                    qib0.G.Y0(this.f310d, ura.e().d().I4() ? c3c0.W : c3c0.V);
                }
            } else {
                qib0.G.Y0(this.f310d, ura.e().d().I4() ? c3c0.U : c3c0.T);
            }
        }
        if (NullChecker.a(this.f314h) && NullChecker.a(this.f315i)) {
            if (TextUtils.isEmpty(coreMomentInfo.value)) {
                boolean z = this.f298P0;
                TextView textView = this.f315i;
                if (z) {
                    textView.setText("你发布的动态");
                } else {
                    textView.setText(String.format("%s发布的动态", user.isFemale() ? "她" : "他"));
                }
            } else {
                this.f315i.setText(coreMomentInfo.value);
            }
            boolean z2 = this.f298P0;
            TextView textView2 = this.f314h;
            if (z2) {
                textView2.setText(String.format("我通过这条动态喜欢了%s", user.isFemale() ? "她" : "他"));
            } else {
                textView2.setText(String.format("%s通过这条动态喜欢了我", user.isFemale() ? "她" : "他"));
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m455l0(Throwable th) {
        xdl0.M(this.f307a, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m456m0(List list, Act act, User user, User user2) {
        if (!vwb.J(list)) {
            this.f290L0 = (Question) list.get(new Random().nextInt(list.size()));
        }
        m416B0(act, user, user2, this.f290L0);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m457n0(final Act act, final User user, final User user2) {
        final List listQuery = CoreModule.k.e.query((Filter) null, (Order) null, -1);
        e51.G(new Runnable() { // from class: l.jyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f14138a.m456m0(listQuery, act, user, user2);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m458o0(User user, User user2, Act act, Question question, String str) {
        StringBuilder sb = new StringBuilder();
        this.f305V = m431M(user);
        if (NullChecker.a(this.f283I)) {
            this.f287K.setText(this.f305V);
            xdl0.M(this.f283I, !TextUtils.isEmpty(this.f305V));
        } else if (!TextUtils.isEmpty(this.f305V)) {
            sb.append(this.f305V);
        }
        this.f306W = m432N(user2, user, str);
        if (NullChecker.a(this.f289L)) {
            this.f293N.setText(this.f306W);
            xdl0.M(this.f289L, !TextUtils.isEmpty(this.f306W));
        } else if (!TextUtils.isEmpty(this.f306W)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f306W);
        }
        this.f318k0 = m435R(act, user);
        if (NullChecker.a(this.f295O)) {
            this.f299Q.setText(this.f318k0);
            xdl0.M(this.f295O, !TextUtils.isEmpty(this.f318k0));
        } else if (!TextUtils.isEmpty(this.f318k0)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f318k0);
        }
        this.f324p0 = m436S(user, question);
        if (NullChecker.a(this.f301R)) {
            this.f303T.setText(this.f324p0);
            xdl0.M(this.f301R, !TextUtils.isEmpty(this.f324p0));
        } else if (!TextUtils.isEmpty(this.f324p0)) {
            sb.append(TextUtils.isEmpty(sb.toString()) ? "" : "\n");
            sb.append(this.f324p0);
        }
        if (NullChecker.a(this.f327s)) {
            if (TextUtils.isEmpty(sb.toString()) || m444a0(user)) {
                xdl0.M(this.f327s, false);
                return;
            }
            setOldDateInfo(sb.toString());
            xdl0.M(this.f327s, true);
            this.f327s.setTextColor(Color.parseColor("#66000000"));
            this.f327s.setTextSize(14.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f292M0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        View viewM424H;
        super.onFinishInflate();
        if (m462s0()) {
            viewM424H = m422G(o7r.a(getContext()), this);
            if (ura.e().d().I4()) {
                this.f273C.setTextColor(getResources().getColor(a1c0.g));
                this.f274D.setTextColor(getResources().getColor(a1c0.g));
                this.f275E.setTextColor(getResources().getColor(a1c0.i));
                this.f277F.setTextColor(getResources().getColor(a1c0.i));
                this.f279G.setTextColor(getResources().getColor(a1c0.i));
                xdl0.N(this.f285J, c3c0.v2);
                this.f287K.setTextColor(getResources().getColor(a1c0.h));
                xdl0.N(this.f291M, c3c0.y2);
                this.f293N.setTextColor(getResources().getColor(a1c0.h));
                xdl0.N(this.f297P, c3c0.G2);
                this.f299Q.setTextColor(getResources().getColor(a1c0.h));
                xdl0.N(this.f302S, c3c0.J2);
                this.f303T.setTextColor(getResources().getColor(a1c0.h));
            }
            if (m462s0()) {
                this.f279G.setVisibility(0);
                this.f279G.setText(getCheckTxt());
            }
            this.f330v.setVisibility(0);
        } else {
            viewM424H = m424H(o7r.a(getContext()), this);
        }
        setOrientation(1);
        addView(viewM424H);
        if (CoreModule.P().i().O8()) {
            View viewM420F = m420F(o7r.a(getContext()), this);
            if (ura.e().d().I4()) {
                this.f314h.setTextColor(getResources().getColor(a1c0.g));
                this.f315i.setTextColor(getResources().getColor(a1c0.i));
                this.f311e.setImageResource(c3c0.l1);
                this.f312f.setImageResource(c3c0.X);
            }
            addView(viewM420F);
        }
        TextView textView = new TextView(getContext());
        this.f294N0 = textView;
        textView.setTextColor(Color.parseColor("#4D000000"));
        this.f294N0.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.d(20.0f);
        this.f294N0.setGravity(1);
        this.f294N0.setVisibility(8);
        addView(this.f294N0, layoutParams);
        if (m462s0() && ura.e().d().xh() && !m442Y() && !m443Z() && NullChecker.a(this.f281H)) {
            int iIndexOfChild = this.f329u.indexOfChild(this.f281H);
            this.f296O0 = (MessageIdealTypeHeadLayout) LayoutInflater.from(getContext()).inflate(l6c0.H1, (ViewGroup) this.f329u, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = -t100.d(20.0f);
            marginLayoutParams.rightMargin = -t100.d(20.0f);
            this.f329u.addView(this.f296O0, iIndexOfChild, marginLayoutParams);
            xdl0.M(this.f281H, false);
            xdl0.E0(this.f296O0, new View.OnClickListener() { // from class: l.dyz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9489a.m452i0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m459p0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f320m.setBackgroundResource(c3c0.q2);
            return;
        }
        this.f320m.setBackground(new BitmapDrawable(getResources(), m388P(m430K0(bitmap, t100.d(213.0f), t100.d(280.0f)), t100.d(10.0f))));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m460q0(Bitmap bitmap) {
        if (bitmap == null) {
            this.f320m.setBackgroundResource(c3c0.q2);
            return;
        }
        this.f320m.setBackground(new BitmapDrawable(getResources(), m388P(m430K0(bitmap, t100.d(213.0f), t100.d(280.0f)), t100.d(10.0f))));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m461r0(boolean z, String str) {
        if (m462s0()) {
            if (z) {
                o6j0.h("e_match_card", str, new o6j0.a[]{o6j0.a.h("card_content_personal_info", !TextUtils.isEmpty(this.f305V) ? "1" : "0"), o6j0.a.h("card_conntent_common_info", !TextUtils.isEmpty(this.f306W) ? "1" : "0"), o6j0.a.h("card_content_tag", !TextUtils.isEmpty(this.f318k0) ? "1" : "0"), o6j0.a.h("card_content_question", TextUtils.isEmpty(this.f324p0) ? "0" : "1")});
                return;
            }
            boolean zM462s0 = m462s0();
            String str2 = this.f305V;
            if (zM462s0) {
                o6j0.c("e_match_card", str, new o6j0.a[]{o6j0.a.h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), o6j0.a.h("card_conntent_common_info", !TextUtils.isEmpty(this.f306W) ? "1" : "0"), o6j0.a.h("card_content_tag", !TextUtils.isEmpty(this.f318k0) ? "1" : "0"), o6j0.a.h("card_content_question", TextUtils.isEmpty(this.f324p0) ? "0" : "1"), o6j0.a.f("card_click_area", this.f288K0)});
            } else {
                o6j0.c("e_match_card", str, new o6j0.a[]{o6j0.a.h("card_content_personal_info", !TextUtils.isEmpty(str2) ? "1" : "0"), o6j0.a.h("card_conntent_common_info", !TextUtils.isEmpty(this.f306W) ? "1" : "0"), o6j0.a.h("card_content_tag", !TextUtils.isEmpty(this.f318k0) ? "1" : "0"), o6j0.a.h("card_content_question", TextUtils.isEmpty(this.f324p0) ? "0" : "1")});
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m462s0() {
        if (m445b0()) {
            return false;
        }
        return CoreModule.P().i().k5();
    }

    public void setFpAnonymityIncludeSelfImage(User user) {
        if (NullChecker.a(this.f322o)) {
            if (user.inactivated) {
                qib0.G.Y0(this.f322o, CoreModule.P().i().f3());
            } else if (m441X(CoreModule.c.f0.Xe(((DbObject) user).id))) {
                qib0.G.L0(this.f322o, user.getAnonymousUrl());
            } else {
                qib0.G.B0(this.f322o, rw6.b(user).profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.a(imageSmall)) {
            if (user.inactivated) {
                qib0.G.Y0(imageSmall, CoreModule.P().i().T0());
            } else if (m441X(CoreModule.c.f0.Xe(((DbObject) user).id))) {
                qib0.G.L0(imageSmall, user.getAnonymousUrl());
            } else {
                qib0.G.Q0(imageSmall, rw6.b(user).profileSmall());
            }
        }
    }

    public void setOtherSmallImage(User user) {
        if (NullChecker.a(this.f322o)) {
            if (user.inactivated) {
                qib0.G.Y0(this.f322o, CoreModule.P().i().f3());
            } else if (m441X(CoreModule.c.f0.Xe(((DbObject) user).id))) {
                qib0.G.L0(this.f322o, user.getAnonymousUrl());
            } else {
                qib0.G.B0(this.f322o, user.fp().profileBig());
            }
        }
        VDraweeView imageSmall = getImageSmall();
        if (NullChecker.a(imageSmall)) {
            if (user.inactivated) {
                qib0.G.Y0(imageSmall, CoreModule.P().i().T0());
            } else if (m441X(CoreModule.c.f0.Xe(((DbObject) user).id))) {
                qib0.G.L0(imageSmall, user.getAnonymousUrl());
            } else {
                qib0.G.Q0(imageSmall, user.fp().profileSmall());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m463t0(String str) {
        if (this.f304U) {
            return;
        }
        if (NullChecker.a(this.f286J0)) {
            m465v0(this.f286J0, str);
        }
        if (m462s0() && NullChecker.a(this.f329u)) {
            m464u0(this.f329u, str);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m464u0(View view, final String str) {
        if (view.getGlobalVisibleRect(new Rect())) {
            this.f304U = true;
            view.postDelayed(new Runnable() { // from class: l.izz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13514a.m453j0(str);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m465v0(final MessageAboutMeContentView messageAboutMeContentView, final String str) {
        if (messageAboutMeContentView.getGlobalVisibleRect(new Rect())) {
            this.f304U = true;
            messageAboutMeContentView.postDelayed(new Runnable() { // from class: l.hyz
                @Override // java.lang.Runnable
                public final void run() {
                    MessageUserHeaderLayout.m412x(str, messageAboutMeContentView);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final CharSequence m466w0(User user, User user2) {
        if (TextUtils.isEmpty(user2.profile.studies.school) || !TextUtils.equals(user.profile.studies.school, user2.profile.studies.school)) {
            return "";
        }
        if (NullChecker.a(this.f291M)) {
            boolean zA2 = CoreModule.P().i().a2();
            VImage vImage = this.f291M;
            if (zA2) {
                vImage.setImageResource(ura.e().d().I4() ? c3c0.B2 : c3c0.A2);
            } else {
                vImage.setImageResource(ura.e().d().I4() ? c3c0.C2 : c3c0.z2);
            }
        }
        return m426I0(CoreModule.b.getString(R.string.Z4) + " " + user.profile.studies.school + " " + CoreModule.b.getString(R.string.o5), user.profile.studies.school);
    }

    /* JADX INFO: renamed from: x0 */
    public void m467x0(final User user, User user2) {
        if (NullChecker.a(this.f307a)) {
            String str = "";
            if (NullChecker.a(user) && NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions)) {
                boolean zIsEmpty = TextUtils.isEmpty(user.localRelationship.relationshipExtensions.otherMomentId);
                Relationship relationship = user.localRelationship;
                if (!zIsEmpty) {
                    String str2 = relationship.relationshipExtensions.otherMomentId;
                    this.f298P0 = false;
                    this.f300Q0 = NullChecker.a(user2) ? ((DbObject) user2).id : "";
                    str = str2;
                } else if (!TextUtils.isEmpty(relationship.relationshipExtensions.momentId)) {
                    str = user.localRelationship.relationshipExtensions.momentId;
                    this.f298P0 = true;
                    this.f300Q0 = ((DbObject) user).id;
                }
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f300Q0) || TextUtils.equals(CoreMomentInfo.LOCAL_ID_INVALID, str)) {
                xdl0.M(this.f307a, false);
            } else {
                mkd0.z(this.f292M0);
                this.f292M0 = CoreModule.N().momentRefresh(this.f300Q0, str, CoreMomentInfo.JSON_ADAPTER).takeFirst(new w9j() { // from class: l.eyz
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((CoreMomentInfo) obj));
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.fyz
                    public final void call(Object obj) {
                        this.f10688a.m454k0(user, (CoreMomentInfo) obj);
                    }
                }, new e30() { // from class: l.gyz
                    public final void call(Object obj) {
                        this.f11695a.m455l0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m468y0(Act act, fcz<User, bpz> fczVar, User user, User user2) {
        setMatchIcon(user2);
        m469z0(user, user2);
        if (CoreModule.P().i().e() && NullChecker.a(this.f329u) && NullChecker.a(user2) && !user2.isHideIconFromSVipWithMe() && user2.isSupremePartner()) {
            m439V();
        } else if (CoreModule.P().i().a2() && NullChecker.a(this.f329u)) {
            m440W();
        }
        if (!user2.isTeamAccount()) {
            m417C0();
            m418D0(user2, fczVar.k);
            m419E0(user, user2);
            m463t0(fczVar.pageId());
            m415A0(act, user, user2, fczVar.k);
        } else if (fczVar.r3().equals("-10040")) {
            setOldDateInfo("你好呀，我是你的探探付费通知小助手“服务提醒”，如遇到任何付费功能相关的问题都可以找我帮你解决哦");
        } else if (fczVar.r3().equals("-10021")) {
            setOldDateInfo("AI思思来啦！是文笔超棒，共情能力超强的思思哦，和我聊聊你的感情故事吧，我会好好帮你记录下来的~");
        } else {
            setOldDateInfo(act.getString(R.string.h4));
        }
        if (NullChecker.a(this.f281H)) {
            xdl0.M(this.f281H, !m444a0(user2));
        }
        if (NullChecker.a(this.f296O0)) {
            xdl0.M(this.f281H, false);
            this.f296O0.m324g(act, user2);
        }
        if (NullChecker.a(this.f327s)) {
            xdl0.M(this.f327s, (m444a0(user2) || TextUtils.isEmpty(this.f327s.getText())) ? false : true);
        }
        if (!NullChecker.a(fczVar.k) || !NullChecker.a(fczVar.k.property) || !NullChecker.a(fczVar.k.property.conversationTag) || TextUtils.isEmpty(fczVar.k.property.conversationTag.guide)) {
            xdl0.M(this.f294N0, false);
        } else {
            this.f294N0.setText(fczVar.k.property.conversationTag.guide);
            xdl0.M(this.f294N0, true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m469z0(User user, User user2) {
        boolean z = CoreModule.c.E0.z3(user2) || m444a0(user2);
        if (NullChecker.a(this.f273C)) {
            boolean zM444a0 = m444a0(user2);
            VText vText = this.f273C;
            if (zM444a0) {
                vText.setText(user2.publicId);
            } else {
                vText.setText(user2.name);
            }
            this.f273C.getPaint().setFakeBoldText(true);
        }
        if (m462s0()) {
            if (NullChecker.a(this.f277F) && !z) {
                this.f277F.setText(" · " + user2.age + "岁");
                this.f277F.setVisibility(0);
                this.f274D.setVisibility(8);
            }
        } else if (NullChecker.a(this.f274D) && !z) {
            this.f274D.setText(String.valueOf(user2.age));
            this.f277F.setVisibility(8);
            this.f274D.setVisibility(0);
        }
        if (NullChecker.a(this.f331w)) {
            if (m441X(CoreModule.c.f0.Xe(((DbObject) user2).id))) {
                qib0.G.L0(this.f331w, user.getAnonymousUrl());
            } else {
                qib0.G.Q0(this.f331w, rw6.b(user).profileSmall());
            }
        }
        if (m444a0(user2) || !NullChecker.a(this.f275E)) {
            return;
        }
        this.f275E.setText(m437T(user2));
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f304U = false;
        this.f305V = "";
        this.f306W = "";
        this.f318k0 = "";
        this.f324p0 = "";
        this.f290L0 = null;
        this.f298P0 = false;
        this.f300Q0 = "";
    }

    public MessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f304U = false;
        this.f305V = "";
        this.f306W = "";
        this.f318k0 = "";
        this.f324p0 = "";
        this.f290L0 = null;
        this.f298P0 = false;
        this.f300Q0 = "";
    }
}
