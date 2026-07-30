package com.p000p1.mobile.putong.core.newui.myinterestpeople;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardScrollView;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardSmartScrollBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import l.f1a;
import l.ftd0;
import l.j760;
import l.qib0;
import l.sk5;
import l.t100;
import l.u600;
import l.vsd0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xgc0;
import l.zpd0;
import l.zvf0;
import p009l.g1a;
import p009l.i0g0;
import p009l.jtk;
import p009l.mqi0;
import p009l.t19;
import p009l.w39;
import v.VDraweeView;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreMyInterestItem extends FrameLayout implements t19<w39>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public LinearLayout f4734A;

    /* JADX INFO: renamed from: B */
    public VText f4735B;

    /* JADX INFO: renamed from: C */
    public VText f4736C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f4737D;

    /* JADX INFO: renamed from: E */
    public VText f4738E;

    /* JADX INFO: renamed from: E0 */
    public VText f4739E0;

    /* JADX INFO: renamed from: F */
    public VText f4740F;

    /* JADX INFO: renamed from: F0 */
    public VText f4741F0;

    /* JADX INFO: renamed from: G */
    public LinearLayout f4742G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f4743G0;

    /* JADX INFO: renamed from: H */
    public VText f4744H;

    /* JADX INFO: renamed from: H0 */
    public VText f4745H0;

    /* JADX INFO: renamed from: I */
    public VText f4746I;

    /* JADX INFO: renamed from: I0 */
    public VText f4747I0;

    /* JADX INFO: renamed from: J */
    public LinearLayout f4748J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f4749J0;

    /* JADX INFO: renamed from: K */
    public VText f4750K;

    /* JADX INFO: renamed from: K0 */
    public VText f4751K0;

    /* JADX INFO: renamed from: L */
    public VText f4752L;

    /* JADX INFO: renamed from: L0 */
    public VText f4753L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f4754M;

    /* JADX INFO: renamed from: M0 */
    public LinearLayout f4755M0;

    /* JADX INFO: renamed from: N */
    public VText f4756N;

    /* JADX INFO: renamed from: N0 */
    public VText f4757N0;

    /* JADX INFO: renamed from: O */
    public VText f4758O;

    /* JADX INFO: renamed from: O0 */
    public VText f4759O0;

    /* JADX INFO: renamed from: P */
    public LinearLayout f4760P;

    /* JADX INFO: renamed from: P0 */
    public VText f4761P0;

    /* JADX INFO: renamed from: Q */
    public VText f4762Q;

    /* JADX INFO: renamed from: Q0 */
    public LinearLayout f4763Q0;

    /* JADX INFO: renamed from: R */
    public VText f4764R;

    /* JADX INFO: renamed from: R0 */
    public VText f4765R0;

    /* JADX INFO: renamed from: S */
    public LinearLayout f4766S;

    /* JADX INFO: renamed from: S0 */
    public VText f4767S0;

    /* JADX INFO: renamed from: T */
    public VText f4768T;

    /* JADX INFO: renamed from: T0 */
    public LinearLayout f4769T0;

    /* JADX INFO: renamed from: U */
    public VText f4770U;

    /* JADX INFO: renamed from: U0 */
    public VText f4771U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f4772V;

    /* JADX INFO: renamed from: V0 */
    public VText f4773V0;

    /* JADX INFO: renamed from: W */
    public VText f4774W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f4775W0;

    /* JADX INFO: renamed from: X0 */
    public VText f4776X0;

    /* JADX INFO: renamed from: Y0 */
    public VText f4777Y0;

    /* JADX INFO: renamed from: Z0 */
    public LinearLayout f4778Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f4779a;

    /* JADX INFO: renamed from: a1 */
    public VText f4780a1;

    /* JADX INFO: renamed from: b */
    public FeedPoiCardScrollView f4781b;

    /* JADX INFO: renamed from: b1 */
    public VText f4782b1;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4783c;

    /* JADX INFO: renamed from: c1 */
    public TextView f4784c1;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4785d;

    /* JADX INFO: renamed from: d1 */
    public VText_Tags f4786d1;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f4787e;

    /* JADX INFO: renamed from: e1 */
    public TextView f4788e1;

    /* JADX INFO: renamed from: f */
    public ImageView f4789f;

    /* JADX INFO: renamed from: f1 */
    public TextView f4790f1;

    /* JADX INFO: renamed from: g */
    public TextView f4791g;

    /* JADX INFO: renamed from: g1 */
    public FeedPoiCardSmartScrollBar f4792g1;

    /* JADX INFO: renamed from: h */
    public LinearLayout f4793h;

    /* JADX INFO: renamed from: h1 */
    public g1a f4794h1;

    /* JADX INFO: renamed from: i */
    public VText f4795i;

    /* JADX INFO: renamed from: i1 */
    public w39 f4796i1;

    /* JADX INFO: renamed from: j */
    public VText f4797j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f4798j1;

    /* JADX INFO: renamed from: k */
    public ImageView f4799k;

    /* JADX INFO: renamed from: k0 */
    public VText f4800k0;

    /* JADX INFO: renamed from: l */
    public ImageView f4801l;

    /* JADX INFO: renamed from: m */
    public VText f4802m;

    /* JADX INFO: renamed from: n */
    public TextView f4803n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f4804o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f4805p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f4806p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f4807q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f4808r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f4809s;

    /* JADX INFO: renamed from: t */
    public VText f4810t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f4811u;

    /* JADX INFO: renamed from: v */
    public VText f4812v;

    /* JADX INFO: renamed from: w */
    public VText f4813w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f4814x;

    /* JADX INFO: renamed from: y */
    public VText f4815y;

    /* JADX INFO: renamed from: z */
    public VText f4816z;

    public CoreMyInterestItem(@NonNull Context context) {
        super(context);
        this.f4798j1 = new HashMap<>();
    }

    /* JADX INFO: renamed from: I */
    public static SpannableStringBuilder m6725I(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
        List<Tag> listSubList;
        List<Tag> listSubList2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = list.size();
        int i3 = 0;
        if (size >= 3) {
            listSubList2 = list.subList(0, 3);
            list2.clear();
            listSubList = list2;
        } else {
            listSubList = list2.subList(0, Math.min(3 - size, list2.size()));
            listSubList2 = list;
        }
        if (NullChecker.a(listSubList2)) {
            for (Tag tag : listSubList2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag.category);
                    u600 u600Var = new u600(CoreModule.b, tag.value, -1, -98787, i, 6, i2, 13.0f, true, t100.d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(u600Var, i3, i4, 33);
                    i3 = i4;
                } else {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            }
        }
        if (NullChecker.a(listSubList)) {
            for (Tag tag2 : listSubList) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag2.category);
                    int i5 = i3 + 1;
                    spannableStringBuilder.setSpan(new u600(CoreModule.b, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, t100.d(3.0f), true, t100.d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m6726Y() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: v */
    public static String m6736v(Profile profile) {
        if (!NullChecker.a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.J(profile.extensions.basic.country) ? "" : (String) profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.J(profile.extensions.basic.province) ? "" : (String) profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.J(profile.extensions.basic.city) ? "" : (String) profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public static long m6737w(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m6738A(w39 w39Var, View view) {
        this.f4794h1.mo6797e(w39Var, true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6739C(w39 w39Var, View view) {
        this.f4794h1.mo6793M(w39Var);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m6740D(w39 w39Var, View view) {
        this.f4794h1.mo6797e(w39Var, true);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6741E(w39 w39Var, View view) {
        this.f4794h1.mo6793M(w39Var);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6742F(w39 w39Var, View view) {
        this.f4794h1.mo6797e(w39Var, true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6743G(w39 w39Var, View view) {
        this.f4794h1.mo6797e(w39Var, false);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6744H(w39 w39Var, View view) {
        this.f4794h1.mo6805q0(w39Var);
    }

    /* JADX INFO: renamed from: J */
    public void m6745J(w39 w39Var) {
        this.f4796i1 = w39Var;
        super.m22425a(w39Var);
    }

    /* JADX INFO: renamed from: K */
    public void m6746K() {
        if (CoreModule.N().so() && this.f4796i1.m23800d()) {
            if ((!mqi0.m18534C(((Long) CoreModule.N().tf().get()).longValue(), mqi0.m18550o()) || CoreModule.N().Hj()) && !CoreModule.N().Hj()) {
                a aVar = new a(m6768r());
                aVar.D("点击礼貌回谢，表达你的感谢").l(t100.d(9.0f)).k(new int[]{m6768r().getResources().getColor(w0c0.I)}).J(13.0f).E(true).x(-t100.d(5.0f)).u(t100.d(0.0f)).b(3000L).M(true).e(false).o(jtk.f15295C, t100.d(56.0f)).q(a.Q | jtk.f15295C);
                d.l().u(aVar, this.f4790f1, "SHARE_TIP_MYINTEREST");
                CoreModule.N().tf().put(Long.valueOf(mqi0.m18550o()));
                return;
            }
            return;
        }
        zpd0 zpd0Var = new zpd0("show_guide_time_interest_people" + CoreModule.H().userId(), 0L);
        if (mqi0.m18534C(((Long) zpd0Var.get()).longValue(), mqi0.m18550o())) {
            return;
        }
        a aVar2 = new a(m6768r());
        String strM6773y = m6773y(this.f4796i1.m23799c());
        aVar2.D("他们都对你很感兴趣，对" + strM6773y + "感兴趣就关注" + strM6773y + "吧").l(t100.d(9.0f)).k(new int[]{m6768r().getResources().getColor(w0c0.I)}).J(13.0f).E(true).x(-t100.d(12.0f)).u(t100.d(40.0f)).b(3000L).M(true).e(false).o(jtk.f15295C, t100.d(10.0f)).q(a.Q | a.P);
        d.l().u(aVar2, this.f4790f1, "SHARE_TIP_MYINTEREST");
        zpd0Var.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: L */
    public final void m6747L(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            qib0.G.Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.b(video.cover) && NullChecker.b(((Media) video.cover).url)) {
                qib0.G.Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().c(new vsd0(m6768r().getResources().getDrawable(x2c0.o8), ftd0.g));
            }
        }
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo6763d(final w39 w39Var) {
        if (w39Var.m23801e()) {
            this.f4790f1.setText("直接配对");
            w39Var.m23803g(7);
            this.f4790f1.setOnClickListener(new View.OnClickListener() { // from class: l.v0a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21406a.m6738A(w39Var, view);
                }
            });
            return;
        }
        if (!w39Var.m23800d()) {
            this.f4790f1.setText("回关");
            w39Var.m23803g(2);
        } else {
            if (CoreModule.N().so()) {
                if (!CoreModule.N().Hj()) {
                    this.f4790f1.setText("礼貌回谢");
                    w39Var.m23803g(5);
                    xdl0.E0(this.f4790f1, new View.OnClickListener() { // from class: l.z0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f23312a.m6742F(w39Var, view);
                        }
                    });
                    return;
                }
                if (xgc0.c(((DbObject) w39Var.m23799c()).id)) {
                    this.f4790f1.setText("聊天");
                    w39Var.m23803g(3);
                    xdl0.E0(this.f4790f1, new View.OnClickListener() { // from class: l.w0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f21831a.m6739C(w39Var, view);
                        }
                    });
                    return;
                } else if (CoreModule.N().vj(CoreModule.c.e0.p9().isFemale()) && NullChecker.a(CoreModule.c.o3()) && CoreModule.c.o3().flower.count > 0) {
                    this.f4790f1.setText("送小红花");
                    w39Var.m23803g(6);
                    xdl0.E0(this.f4790f1, new View.OnClickListener() { // from class: l.x0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f22390a.m6740D(w39Var, view);
                        }
                    });
                    return;
                } else {
                    this.f4790f1.setText("打招呼");
                    w39Var.m23803g(4);
                    xdl0.E0(this.f4790f1, new View.OnClickListener() { // from class: l.y0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f22841a.m6741E(w39Var, view);
                        }
                    });
                    return;
                }
            }
            this.f4790f1.setText("关注");
            w39Var.m23803g(1);
        }
        this.f4790f1.setOnClickListener(new View.OnClickListener() { // from class: l.a1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9184a.m6743G(w39Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m6749N(User user) {
        final ArrayList arrayListN;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f4786d1.setVisibility(8);
            this.f4784c1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListN = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(CoreModule.K().me_().profile.tags);
            ArrayList arrayListN2 = vwb.n(hashSet, new w9j() { // from class: l.b1a
                public final Object call(Object obj) {
                    return Boolean.valueOf(hashSet2.contains((Tag) obj));
                }
            });
            arrayListN = vwb.n(hashSet, new w9j() { // from class: l.c1a
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListN2;
        }
        this.f4786d1.setTags(new x9j() { // from class: l.d1a
            public final Object call(Object obj, Object obj2) {
                return CoreMyInterestItem.m6725I(arrayList, arrayListN, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), t100.d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m6750O(User user) {
        if (user == null) {
            return;
        }
        this.f4795i.setText(user.name);
        this.f4795i.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4797j.setText(String.valueOf(user.age));
        xdl0.M(this.f4797j, !user.isHideAgeFromSVipWithOutMe());
        m6757V(user, this.f4802m);
        xdl0.M(this.f4801l, false);
        xdl0.M(this.f4799k, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            xdl0.M(this.f4797j, false);
        }
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo6765f(final w39 w39Var) {
        boolean zM23801e = w39Var.m23801e();
        TextView textView = this.f4788e1;
        if (zM23801e) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f4788e1.setOnClickListener(new View.OnClickListener() { // from class: l.e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12137a.m6744H(w39Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m6752Q(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f4752L.setText(R.string.Xk);
            this.f4758O.setText(profile.studies.major);
            this.f4758O.setHint(R.string.Qk);
            this.f4764R.setVisibility(8);
        } else {
            this.f4764R.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f4752L.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f4752L.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f4752L;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f4752L.setHint("添加职业信息");
            this.f4764R.setText(profile.work.company);
        }
        StringBuilder sb = new StringBuilder(profile.studies.school);
        if (NullChecker.a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            sb.append("(");
            sb.append(m6768r().getString(R.string.C0));
            sb.append(")");
        }
        this.f4770U.setText(sb.toString());
        m6760Z(this.f4770U);
        m6759X(this.f4740F, 8);
        m6759X(this.f4746I, 8);
        if (!m6726Y() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.M(this.f4736C, false);
        } else {
            xdl0.M0(this.f4736C, true);
            this.f4736C.setText(m6774z((BloodType) profile.extensions.physical.bloodType.get(0)));
        }
        this.f4741F0.setText(m6772x(profile));
        this.f4753L0.setText(profile.hangouts);
        m6760Z(this.f4752L);
        m6760Z(this.f4758O);
        m6760Z(this.f4764R);
        m6760Z(this.f4741F0);
        m6760Z(this.f4753L0);
        m6759X(this.f4758O, 8);
        String strM16137j0 = i0g0.m16137j0(profile.zodiac);
        if (TextUtils.isEmpty(strM16137j0) || m6726Y()) {
            this.f4814x.setVisibility(8);
        } else {
            this.f4816z.setText(strM16137j0);
            this.f4814x.setVisibility(0);
            this.f4810t.setVisibility(0);
        }
        String str = CoreModule.K().getUserById(((DbObject) user).id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        LinearLayout linearLayout = this.f4755M0;
        if (zIsEmpty2) {
            m6759X(linearLayout, 8);
        } else {
            m6759X(linearLayout, 0);
            this.f4759O0.setText(str);
        }
        this.f4810t.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4750K.setText(m6768r().getResources().getString(R.string.Sk));
        if (!m6726Y() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        xdl0.M0(this.f4734A, true);
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo6764e(w39 w39Var) {
        m6757V(w39Var.m23799c(), this.f4802m);
        m6750O(w39Var.m23799c());
        qib0.G.L0(this.f4785d, w39Var.m23799c().fp().profileBig().formatted());
        RoundingParams roundingParamsB = RoundingParams.b(t100.d(16.0f), t100.d(16.0f), 0.0f, 0.0f);
        roundingParamsB.v(false);
        this.f4785d.getHierarchy().y(0);
        this.f4785d.getHierarchy().H(roundingParamsB);
        if (w39Var.m23801e()) {
            this.f4789f.setImageResource(x2c0.Ke);
            this.f4791g.setText(String.format("%s通过精选动态喜欢了你", m6773y(w39Var.m23799c())));
            return;
        }
        boolean zM23800d = w39Var.m23800d();
        ImageView imageView = this.f4789f;
        if (zM23800d) {
            imageView.setImageResource(x2c0.Ke);
            this.f4791g.setText(String.format("%s点赞了你", m6773y(w39Var.m23799c())));
        } else {
            imageView.setImageResource(x2c0.Je);
            this.f4791g.setText(String.format("%s关注了你", m6773y(w39Var.m23799c())));
        }
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo6761b(w39 w39Var) {
        m6770t(this.f4736C, this.f4734A);
        m6770t(this.f4740F, this.f4737D);
        m6770t(this.f4746I, this.f4742G);
        m6770t(this.f4752L, this.f4748J);
        m6770t(this.f4758O, this.f4754M);
        m6770t(this.f4764R, this.f4760P);
        m6770t(this.f4770U, this.f4766S);
        m6770t(this.f4741F0, this.f4806p0);
        m6770t(this.f4753L0, this.f4749J0);
        m6770t(this.f4747I0, this.f4743G0);
        m6770t(this.f4800k0, this.f4772V);
        VText vText = this.f4761P0;
        m6770t(vText, vText);
        m6770t(this.f4767S0, this.f4763Q0);
        m6770t(this.f4773V0, this.f4769T0);
        m6770t(this.f4777Y0, this.f4775W0);
        m6770t(this.f4782b1, this.f4778Z0);
        m6752Q(w39Var.m23799c());
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo6766g(w39 w39Var) {
        m6749N(w39Var.m23799c());
    }

    @Override // p009l.t19
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo6762c(w39 w39Var) {
        List<CoreMomentInfo> listM23798b = w39Var.m23798b();
        if (vwb.J(listM23798b)) {
            this.f4803n.setVisibility(8);
            this.f4804o.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM23798b.size() && i != 4; i2++) {
            CoreMomentInfo coreMomentInfo = listM23798b.get(i2);
            if (coreMomentInfo.media.size() != 0 && ((coreMomentInfo.media.get(0) instanceof Picture) || (coreMomentInfo.media.get(0) instanceof Video))) {
                for (Media media : coreMomentInfo.media) {
                    if (i == 0) {
                        m6747L(media, this.f4805p);
                    } else if (i == 1) {
                        m6747L(media, this.f4807q);
                    } else if (i == 2) {
                        m6747L(media, this.f4808r);
                    } else if (i == 3) {
                        m6747L(media, this.f4809s);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m6769s();
        } else {
            this.f4803n.setVisibility(8);
            this.f4804o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m6757V(User user, VText vText) {
        String strM6771u = m6771u(user);
        if (NullChecker.b(user.profile) && NullChecker.b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM6771u)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM6771u);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM6771u);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM6771u);
                return;
            }
        }
        if (TextUtils.isEmpty(strM6771u)) {
            m6759X(vText, 8);
        } else {
            vText.setText(strM6771u);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m6758W(View view, float f) {
        view.setOutlineProvider(new sk5(t100.d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: X */
    public void m6759X(View view, int i) {
        View view2 = this.f4798j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m6760Z(VText vText) {
        xdl0.N0(vText);
        m6759X(vText, vText.getVisibility());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM23799c = this.f4796i1.m23799c();
        zvf0.u("e_interested_user_card", "p_interested_user", new j760[]{vwb.Y("notes_type", this.f4796i1.m23801e() ? "respond_match" : userM23799c.activityUser.action), vwb.Y("card_user_id", ((DbObject) userM23799c).id)});
        m6768r().startActivity(CoreModule.N().bb(m6768r(), ((DbObject) userM23799c).id, "FROM_MINE_INTEREST_LIST", -1, "", 2, "p_interested_user", false));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6767q(this);
        this.f4792g1.m7408b(this.f4781b);
        m6758W(this.f4779a, 16.0f);
        this.f4783c.setOnClickListener(this);
        setBackgroundResource(x2c0.dp);
    }

    /* JADX INFO: renamed from: q */
    public final void m6767q(View view) {
        f1a.a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m6768r() {
        return getContext();
    }

    /* JADX INFO: renamed from: s */
    public final void m6769s() {
        int iY0 = (xdl0.y0() - t100.d(96.0f)) / 4;
        xdl0.C0(this.f4805p, iY0);
        xdl0.C0(this.f4807q, iY0);
        xdl0.C0(this.f4808r, iY0);
        xdl0.C0(this.f4809s, iY0);
        xdl0.D0(iY0, new View[]{this.f4805p});
        xdl0.D0(iY0, new View[]{this.f4807q});
        xdl0.D0(iY0, new View[]{this.f4808r});
        xdl0.D0(iY0, new View[]{this.f4809s});
    }

    public void setClickCallBack(g1a g1aVar) {
        this.f4794h1 = g1aVar;
    }

    /* JADX INFO: renamed from: t */
    public void m6770t(View view, View view2) {
        this.f4798j1.put(view, view2);
    }

    /* JADX INFO: renamed from: u */
    public final String m6771u(User user) {
        String string;
        CharSequence charSequenceM16144p = "";
        if (user.location == null) {
            return "";
        }
        if (!CoreModule.K().hideActiveTime(user)) {
            string = m6768r().getResources().getString(R.string.wk, mqi0.m18538G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = m6768r().getResources().getString(R.string.wk, mqi0.m18538G(m6737w(user)));
            if (user.isMe()) {
                string = string + m6768r().getResources().getString(R.string.k3);
            }
        } else {
            string = "";
        }
        if (!CoreModule.K().hideLocation(user)) {
            boolean zEquals = ((DbObject) user).id.equals(((DbObject) CoreModule.K().me_()).id);
            Location location = user.location;
            charSequenceM16144p = zEquals ? i0g0.m16144p(location.distance, true) : i0g0.m16119R(location);
        }
        if (TextUtils.isEmpty(charSequenceM16144p)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceM16144p) : m6768r().getString(R.string.Uk, charSequenceM16144p, string);
    }

    /* JADX INFO: renamed from: x */
    public final String m6772x(Profile profile) {
        String strM6736v = m6736v(profile);
        return TextUtils.isEmpty(strM6736v) ? profile.hometown : strM6736v;
    }

    /* JADX INFO: renamed from: y */
    public String m6773y(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: z */
    public String m6774z(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return m6768r().getResources().getString(R.string.s0);
            case "B":
                return m6768r().getResources().getString(R.string.u0);
            case "O":
                return m6768r().getResources().getString(R.string.v0);
            case "AB":
                return m6768r().getResources().getString(R.string.t0);
            case "UNKNOWN":
                return m6768r().getResources().getString(R.string.w0);
            default:
                return "";
        }
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4798j1 = new HashMap<>();
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4798j1 = new HashMap<>();
    }
}
