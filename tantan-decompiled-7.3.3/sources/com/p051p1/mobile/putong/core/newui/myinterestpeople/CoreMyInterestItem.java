package com.p051p1.mobile.putong.core.newui.myinterestpeople;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardScrollView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardSmartScrollBar;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VText;
import p151v.VText_Tags;
import p153l.bnl0;
import p153l.byd0;
import p153l.c39;
import p153l.c9c0;
import p153l.dbc0;
import p153l.df00;
import p153l.epc0;
import p153l.f59;
import p153l.h1e0;
import p153l.i4g0;
import p153l.jyb;
import p153l.m2a;
import p153l.pzi0;
import p153l.q2a;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.r2a;
import p153l.rcj;
import p153l.uqb0;
import p153l.vl5;
import p153l.x0e0;
import p153l.zvk;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestItem extends FrameLayout implements c39<f59>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public LinearLayout f26698A;

    /* JADX INFO: renamed from: B */
    public VText f26699B;

    /* JADX INFO: renamed from: C */
    public VText f26700C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f26701D;

    /* JADX INFO: renamed from: E */
    public VText f26702E;

    /* JADX INFO: renamed from: E0 */
    public VText f26703E0;

    /* JADX INFO: renamed from: F */
    public VText f26704F;

    /* JADX INFO: renamed from: F0 */
    public VText f26705F0;

    /* JADX INFO: renamed from: G */
    public LinearLayout f26706G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f26707G0;

    /* JADX INFO: renamed from: H */
    public VText f26708H;

    /* JADX INFO: renamed from: H0 */
    public VText f26709H0;

    /* JADX INFO: renamed from: I */
    public VText f26710I;

    /* JADX INFO: renamed from: I0 */
    public VText f26711I0;

    /* JADX INFO: renamed from: J */
    public LinearLayout f26712J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f26713J0;

    /* JADX INFO: renamed from: K */
    public VText f26714K;

    /* JADX INFO: renamed from: K0 */
    public VText f26715K0;

    /* JADX INFO: renamed from: L */
    public VText f26716L;

    /* JADX INFO: renamed from: L0 */
    public VText f26717L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f26718M;

    /* JADX INFO: renamed from: M0 */
    public LinearLayout f26719M0;

    /* JADX INFO: renamed from: N */
    public VText f26720N;

    /* JADX INFO: renamed from: N0 */
    public VText f26721N0;

    /* JADX INFO: renamed from: O */
    public VText f26722O;

    /* JADX INFO: renamed from: O0 */
    public VText f26723O0;

    /* JADX INFO: renamed from: P */
    public LinearLayout f26724P;

    /* JADX INFO: renamed from: P0 */
    public VText f26725P0;

    /* JADX INFO: renamed from: Q */
    public VText f26726Q;

    /* JADX INFO: renamed from: Q0 */
    public LinearLayout f26727Q0;

    /* JADX INFO: renamed from: R */
    public VText f26728R;

    /* JADX INFO: renamed from: R0 */
    public VText f26729R0;

    /* JADX INFO: renamed from: S */
    public LinearLayout f26730S;

    /* JADX INFO: renamed from: S0 */
    public VText f26731S0;

    /* JADX INFO: renamed from: T */
    public VText f26732T;

    /* JADX INFO: renamed from: T0 */
    public LinearLayout f26733T0;

    /* JADX INFO: renamed from: U */
    public VText f26734U;

    /* JADX INFO: renamed from: U0 */
    public VText f26735U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f26736V;

    /* JADX INFO: renamed from: V0 */
    public VText f26737V0;

    /* JADX INFO: renamed from: W */
    public VText f26738W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f26739W0;

    /* JADX INFO: renamed from: X0 */
    public VText f26740X0;

    /* JADX INFO: renamed from: Y0 */
    public VText f26741Y0;

    /* JADX INFO: renamed from: Z0 */
    public LinearLayout f26742Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f26743a;

    /* JADX INFO: renamed from: a1 */
    public VText f26744a1;

    /* JADX INFO: renamed from: b */
    public FeedPoiCardScrollView f26745b;

    /* JADX INFO: renamed from: b1 */
    public VText f26746b1;

    /* JADX INFO: renamed from: c */
    public LinearLayout f26747c;

    /* JADX INFO: renamed from: c1 */
    public TextView f26748c1;

    /* JADX INFO: renamed from: d */
    public VDraweeView f26749d;

    /* JADX INFO: renamed from: d1 */
    public VText_Tags f26750d1;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f26751e;

    /* JADX INFO: renamed from: e1 */
    public TextView f26752e1;

    /* JADX INFO: renamed from: f */
    public ImageView f26753f;

    /* JADX INFO: renamed from: f1 */
    public TextView f26754f1;

    /* JADX INFO: renamed from: g */
    public TextView f26755g;

    /* JADX INFO: renamed from: g1 */
    public FeedPoiCardSmartScrollBar f26756g1;

    /* JADX INFO: renamed from: h */
    public LinearLayout f26757h;

    /* JADX INFO: renamed from: h1 */
    public r2a f26758h1;

    /* JADX INFO: renamed from: i */
    public VText f26759i;

    /* JADX INFO: renamed from: i1 */
    public f59 f26760i1;

    /* JADX INFO: renamed from: j */
    public VText f26761j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f26762j1;

    /* JADX INFO: renamed from: k */
    public ImageView f26763k;

    /* JADX INFO: renamed from: k0 */
    public VText f26764k0;

    /* JADX INFO: renamed from: l */
    public ImageView f26765l;

    /* JADX INFO: renamed from: m */
    public VText f26766m;

    /* JADX INFO: renamed from: n */
    public TextView f26767n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f26768o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f26769p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f26770p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f26771q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f26772r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f26773s;

    /* JADX INFO: renamed from: t */
    public VText f26774t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f26775u;

    /* JADX INFO: renamed from: v */
    public VText f26776v;

    /* JADX INFO: renamed from: w */
    public VText f26777w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f26778x;

    /* JADX INFO: renamed from: y */
    public VText f26779y;

    /* JADX INFO: renamed from: z */
    public VText f26780z;

    public CoreMyInterestItem(@NonNull Context context) {
        super(context);
        this.f26762j1 = new HashMap<>();
    }

    /* JADX INFO: renamed from: I */
    public static SpannableStringBuilder m43573I(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
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
        if (NullChecker.m82486a(listSubList2)) {
            for (Tag tag : listSubList2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag.category);
                    df00 df00Var = new df00(CoreModule.f18263b, tag.value, -1, -98787, i, 6, i2, 13.0f, true, qa00.m175859d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(df00Var, i3, i4, 33);
                    i3 = i4;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        if (NullChecker.m82486a(listSubList)) {
            for (Tag tag2 : listSubList) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag2.category);
                    int i5 = i3 + 1;
                    spannableStringBuilder.setSpan(new df00(CoreModule.f18263b, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, qa00.m175859d(3.0f), true, qa00.m175859d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m43574Y() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: v */
    public static String m43584v(Profile profile) {
        if (!NullChecker.m82486a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = jyb.m147479J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = jyb.m147479J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = jyb.m147479J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public static long m43585w(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m43586A(f59 f59Var, View view) {
        this.f26758h1.mo43645e(f59Var, true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m43587C(f59 f59Var, View view) {
        this.f26758h1.mo43641O(f59Var);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m43588D(f59 f59Var, View view) {
        this.f26758h1.mo43645e(f59Var, true);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m43589E(f59 f59Var, View view) {
        this.f26758h1.mo43641O(f59Var);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m43590F(f59 f59Var, View view) {
        this.f26758h1.mo43645e(f59Var, true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m43591G(f59 f59Var, View view) {
        this.f26758h1.mo43645e(f59Var, false);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m43592H(f59 f59Var, View view) {
        this.f26758h1.mo43653r0(f59Var);
    }

    /* JADX INFO: renamed from: J */
    public void m43593J(f59 f59Var) {
        this.f26760i1 = f59Var;
        super.m107771a(f59Var);
    }

    /* JADX INFO: renamed from: K */
    public void m43594K() {
        if (CoreModule.m30932N().mo61573so() && this.f26760i1.m124110d()) {
            if ((!pzi0.m174438C(CoreModule.m30932N().mo61575tf().get().longValue(), pzi0.m174454o()) || CoreModule.m30932N().mo61465Hj()) && !CoreModule.m30932N().mo61465Hj()) {
                C4496a c4496a = new C4496a(m43616r());
                c4496a.m21848D("点击礼貌回谢，表达你的感谢").m21870l(qa00.m175859d(9.0f)).m21869k(m43616r().getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21849E(true).m21881x(-qa00.m175859d(5.0f)).m21878u(qa00.m175859d(0.0f)).m21860b(3000L).m21857M(true).m21863e(false).m21872o(zvk.f206226C, qa00.m175859d(56.0f)).m21874q(C4496a.f16402Q | zvk.f206226C);
                C4499d.m21895l().m21908u(c4496a, this.f26754f1, "SHARE_TIP_MYINTEREST");
                CoreModule.m30932N().mo61575tf().put(Long.valueOf(pzi0.m174454o()));
                return;
            }
            return;
        }
        byd0 byd0Var = new byd0("show_guide_time_interest_people" + CoreModule.m30929H().userId(), 0L);
        if (pzi0.m174438C(byd0Var.get().longValue(), pzi0.m174454o())) {
            return;
        }
        C4496a c4496a2 = new C4496a(m43616r());
        String strM43621y = m43621y(this.f26760i1.m124109c());
        c4496a2.m21848D("他们都对你很感兴趣，对" + strM43621y + "感兴趣就关注" + strM43621y + "吧").m21870l(qa00.m175859d(9.0f)).m21869k(m43616r().getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21849E(true).m21881x(-qa00.m175859d(12.0f)).m21878u(qa00.m175859d(40.0f)).m21860b(3000L).m21857M(true).m21863e(false).m21872o(zvk.f206226C, qa00.m175859d(10.0f)).m21874q(C4496a.f16402Q | C4496a.f16401P);
        C4499d.m21895l().m21908u(c4496a2, this.f26754f1, "SHARE_TIP_MYINTEREST");
        byd0Var.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: L */
    public final void m43595L(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            uqb0.f180374G.m127125Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                uqb0.f180374G.m127125Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().mo118277c(new x0e0(m43616r().getResources().getDrawable(dbc0.f87309p8), h1e0.f107450g));
            }
        }
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo43611d(final f59 f59Var) {
        if (f59Var.m124111e()) {
            this.f26754f1.setText("直接配对");
            f59Var.m124113g(7);
            this.f26754f1.setOnClickListener(new View.OnClickListener() { // from class: l.g2a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f101815a.m43586A(f59Var, view);
                }
            });
            return;
        }
        if (!f59Var.m124110d()) {
            this.f26754f1.setText("回关");
            f59Var.m124113g(2);
        } else {
            if (CoreModule.m30932N().mo61573so()) {
                if (!CoreModule.m30932N().mo61465Hj()) {
                    this.f26754f1.setText("礼貌回谢");
                    f59Var.m124113g(5);
                    bnl0.m105509E0(this.f26754f1, new View.OnClickListener() { // from class: l.k2a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f123586a.m43590F(f59Var, view);
                        }
                    });
                    return;
                }
                if (epc0.m121848c(f59Var.m124109c().f56859id)) {
                    this.f26754f1.setText("聊天");
                    f59Var.m124113g(3);
                    bnl0.m105509E0(this.f26754f1, new View.OnClickListener() { // from class: l.h2a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f107530a.m43587C(f59Var, view);
                        }
                    });
                    return;
                } else if (CoreModule.m30932N().mo61583vj(CoreModule.f18264c.f20381e0.m116600p9().isFemale()) && NullChecker.m82486a(CoreModule.f18264c.m32487o3()) && CoreModule.f18264c.m32487o3().flower.count > 0) {
                    this.f26754f1.setText("送小红花");
                    f59Var.m124113g(6);
                    bnl0.m105509E0(this.f26754f1, new View.OnClickListener() { // from class: l.i2a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f112592a.m43588D(f59Var, view);
                        }
                    });
                    return;
                } else {
                    this.f26754f1.setText("打招呼");
                    f59Var.m124113g(4);
                    bnl0.m105509E0(this.f26754f1, new View.OnClickListener() { // from class: l.j2a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f118040a.m43589E(f59Var, view);
                        }
                    });
                    return;
                }
            }
            this.f26754f1.setText("关注");
            f59Var.m124113g(1);
        }
        this.f26754f1.setOnClickListener(new View.OnClickListener() { // from class: l.l2a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129757a.m43591G(f59Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m43597N(User user) {
        final ArrayList arrayListM147522n;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f26750d1.setVisibility(8);
            this.f26748c1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListM147522n = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(CoreModule.m30930K().me_().profile.tags);
            ArrayList arrayListM147522n2 = jyb.m147522n(hashSet, new m2a(hashSet2));
            arrayListM147522n = jyb.m147522n(hashSet, new qcj() { // from class: l.n2a
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListM147522n2;
        }
        this.f26750d1.setTags(new rcj() { // from class: l.o2a
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return CoreMyInterestItem.m43573I(arrayList, arrayListM147522n, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), qa00.m175859d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m43598O(User user) {
        if (user == null) {
            return;
        }
        this.f26759i.setText(user.name);
        this.f26759i.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26761j.setText(String.valueOf(user.age));
        bnl0.m105524M(this.f26761j, !user.isHideAgeFromSVipWithOutMe());
        m43605V(user, this.f26766m);
        bnl0.m105524M(this.f26765l, false);
        bnl0.m105524M(this.f26763k, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            bnl0.m105524M(this.f26761j, false);
        }
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo43613f(final f59 f59Var) {
        boolean zM124111e = f59Var.m124111e();
        TextView textView = this.f26752e1;
        if (zM124111e) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f26752e1.setOnClickListener(new View.OnClickListener() { // from class: l.p2a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150256a.m43592H(f59Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m43600Q(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f26716L.setText(R$string.f19684tl);
            this.f26722O.setText(profile.studies.major);
            this.f26722O.setHint(R$string.f19467ml);
            this.f26728R.setVisibility(8);
        } else {
            this.f26728R.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f26716L.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f26716L.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f26716L;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f26716L.setHint("添加职业信息");
            this.f26728R.setText(profile.work.company);
        }
        StringBuilder sb = new StringBuilder(profile.studies.school);
        if (NullChecker.m82486a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            sb.append("(");
            sb.append(m43616r().getString(R$string.f18348C0));
            sb.append(")");
        }
        this.f26734U.setText(sb.toString());
        m43608Z(this.f26734U);
        m43607X(this.f26704F, 8);
        m43607X(this.f26710I, 8);
        if (!m43574Y() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            bnl0.m105524M(this.f26700C, false);
        } else {
            bnl0.m105525M0(this.f26700C, true);
            this.f26700C.setText(m43622z(profile.extensions.physical.bloodType.get(0)));
        }
        this.f26705F0.setText(m43620x(profile));
        this.f26717L0.setText(profile.hangouts);
        m43608Z(this.f26716L);
        m43608Z(this.f26722O);
        m43608Z(this.f26728R);
        m43608Z(this.f26705F0);
        m43608Z(this.f26717L0);
        m43607X(this.f26722O, 8);
        String strM175804j0 = q8g0.m175804j0(profile.zodiac);
        if (TextUtils.isEmpty(strM175804j0) || m43574Y()) {
            this.f26778x.setVisibility(8);
        } else {
            this.f26780z.setText(strM175804j0);
            this.f26778x.setVisibility(0);
            this.f26774t.setVisibility(0);
        }
        String str = CoreModule.m30930K().getUserById(user.f56859id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        LinearLayout linearLayout = this.f26719M0;
        if (zIsEmpty2) {
            m43607X(linearLayout, 8);
        } else {
            m43607X(linearLayout, 0);
            this.f26723O0.setText(str);
        }
        this.f26774t.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26714K.setText(m43616r().getResources().getString(R$string.f19529ol));
        if (!m43574Y() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        bnl0.m105525M0(this.f26698A, true);
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo43612e(f59 f59Var) {
        m43605V(f59Var.m124109c(), this.f26766m);
        m43598O(f59Var.m124109c());
        uqb0.f180374G.m127115L0(this.f26749d, f59Var.m124109c().m61308fp().profileBig().formatted());
        RoundingParams roundingParamsM8302b = RoundingParams.m8302b(qa00.m175859d(16.0f), qa00.m175859d(16.0f), 0.0f, 0.0f);
        roundingParamsM8302b.m8322v(false);
        this.f26749d.getHierarchy().m207064y(0);
        this.f26749d.getHierarchy().m207045H(roundingParamsM8302b);
        if (f59Var.m124111e()) {
            this.f26753f.setImageResource(dbc0.f87641zf);
            this.f26755g.setText(String.format("%s通过精选动态喜欢了你", m43621y(f59Var.m124109c())));
            return;
        }
        boolean zM124110d = f59Var.m124110d();
        ImageView imageView = this.f26753f;
        if (zM124110d) {
            imageView.setImageResource(dbc0.f87641zf);
            this.f26755g.setText(String.format("%s点赞了你", m43621y(f59Var.m124109c())));
        } else {
            imageView.setImageResource(dbc0.f87609yf);
            this.f26755g.setText(String.format("%s关注了你", m43621y(f59Var.m124109c())));
        }
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo43609b(f59 f59Var) {
        m43618t(this.f26700C, this.f26698A);
        m43618t(this.f26704F, this.f26701D);
        m43618t(this.f26710I, this.f26706G);
        m43618t(this.f26716L, this.f26712J);
        m43618t(this.f26722O, this.f26718M);
        m43618t(this.f26728R, this.f26724P);
        m43618t(this.f26734U, this.f26730S);
        m43618t(this.f26705F0, this.f26770p0);
        m43618t(this.f26717L0, this.f26713J0);
        m43618t(this.f26711I0, this.f26707G0);
        m43618t(this.f26764k0, this.f26736V);
        VText vText = this.f26725P0;
        m43618t(vText, vText);
        m43618t(this.f26731S0, this.f26727Q0);
        m43618t(this.f26737V0, this.f26733T0);
        m43618t(this.f26741Y0, this.f26739W0);
        m43618t(this.f26746b1, this.f26742Z0);
        m43600Q(f59Var.m124109c());
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo43614g(f59 f59Var) {
        m43597N(f59Var.m124109c());
    }

    @Override // p153l.c39
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo43610c(f59 f59Var) {
        List<CoreMomentInfo> listM124108b = f59Var.m124108b();
        if (jyb.m147479J(listM124108b)) {
            this.f26767n.setVisibility(8);
            this.f26768o.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM124108b.size() && i != 4; i2++) {
            CoreMomentInfo coreMomentInfo = listM124108b.get(i2);
            if (coreMomentInfo.media.size() != 0 && ((coreMomentInfo.media.get(0) instanceof Picture) || (coreMomentInfo.media.get(0) instanceof Video))) {
                for (Media media : coreMomentInfo.media) {
                    if (i == 0) {
                        m43595L(media, this.f26769p);
                    } else if (i == 1) {
                        m43595L(media, this.f26771q);
                    } else if (i == 2) {
                        m43595L(media, this.f26772r);
                    } else if (i == 3) {
                        m43595L(media, this.f26773s);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m43617s();
        } else {
            this.f26767n.setVisibility(8);
            this.f26768o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m43605V(User user, VText vText) {
        String strM43619u = m43619u(user);
        if (NullChecker.m82487b(user.profile) && NullChecker.m82487b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m82486a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM43619u)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM43619u);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM43619u);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM43619u);
                return;
            }
        }
        if (TextUtils.isEmpty(strM43619u)) {
            m43607X(vText, 8);
        } else {
            vText.setText(strM43619u);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m43606W(View view, float f) {
        view.setOutlineProvider(new vl5(qa00.m175859d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: X */
    public void m43607X(View view, int i) {
        View view2 = this.f26762j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m43608Z(VText vText) {
        bnl0.m105527N0(vText);
        m43607X(vText, vText.getVisibility());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM124109c = this.f26760i1.m124109c();
        i4g0.m138523u("e_interested_user_card", "p_interested_user", jyb.m147494Y("notes_type", this.f26760i1.m124111e() ? "respond_match" : userM124109c.activityUser.action), jyb.m147494Y("card_user_id", userM124109c.f56859id));
        m43616r().startActivity(CoreModule.m30932N().mo61523bb(m43616r(), userM124109c.f56859id, "FROM_MINE_INTEREST_LIST", -1, "", 2, "p_interested_user", false));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43615q(this);
        this.f26756g1.m44203b(this.f26745b);
        m43606W(this.f26743a, 16.0f);
        this.f26747c.setOnClickListener(this);
        setBackgroundResource(dbc0.f86546Rp);
    }

    /* JADX INFO: renamed from: q */
    public final void m43615q(View view) {
        q2a.m175016a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m43616r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public final void m43617s() {
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(96.0f)) / 4;
        bnl0.m105505C0(this.f26769p, iM105592y0);
        bnl0.m105505C0(this.f26771q, iM105592y0);
        bnl0.m105505C0(this.f26772r, iM105592y0);
        bnl0.m105505C0(this.f26773s, iM105592y0);
        bnl0.m105507D0(iM105592y0, this.f26769p);
        bnl0.m105507D0(iM105592y0, this.f26771q);
        bnl0.m105507D0(iM105592y0, this.f26772r);
        bnl0.m105507D0(iM105592y0, this.f26773s);
    }

    public void setClickCallBack(r2a r2aVar) {
        this.f26758h1 = r2aVar;
    }

    /* JADX INFO: renamed from: t */
    public void m43618t(View view, View view2) {
        this.f26762j1.put(view, view2);
    }

    /* JADX INFO: renamed from: u */
    public final String m43619u(User user) {
        String string;
        CharSequence charSequenceM175811p = "";
        if (user.location == null) {
            return "";
        }
        if (!CoreModule.m30930K().hideActiveTime(user)) {
            string = m43616r().getResources().getString(R$string.f18857Sk, pzi0.m174442G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = m43616r().getResources().getString(R$string.f18857Sk, pzi0.m174442G(m43585w(user)));
            if (user.isMe()) {
                string = string + m43616r().getResources().getString(R$string.f19449m3);
            }
        } else {
            string = "";
        }
        if (!CoreModule.m30930K().hideLocation(user)) {
            boolean zEquals = user.f56859id.equals(CoreModule.m30930K().me_().f56859id);
            Location location = user.location;
            charSequenceM175811p = zEquals ? q8g0.m175811p(location.distance, true) : q8g0.m175786R(location);
        }
        if (TextUtils.isEmpty(charSequenceM175811p)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceM175811p) : m43616r().getString(R$string.f19591ql, charSequenceM175811p, string);
    }

    /* JADX INFO: renamed from: x */
    public final String m43620x(Profile profile) {
        String strM43584v = m43584v(profile);
        return TextUtils.isEmpty(strM43584v) ? profile.hometown : strM43584v;
    }

    /* JADX INFO: renamed from: y */
    public String m43621y(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: z */
    public String m43622z(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return m43616r().getResources().getString(R$string.f19632s0);
            case "B":
                return m43616r().getResources().getString(R$string.f19694u0);
            case "O":
                return m43616r().getResources().getString(R$string.f19725v0);
            case "AB":
                return m43616r().getResources().getString(R$string.f19663t0);
            case "UNKNOWN":
                return m43616r().getResources().getString(R$string.f19756w0);
            default:
                return "";
        }
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26762j1 = new HashMap<>();
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26762j1 = new HashMap<>();
    }
}
