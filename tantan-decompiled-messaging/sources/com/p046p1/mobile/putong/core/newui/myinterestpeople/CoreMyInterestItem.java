package com.p046p1.mobile.putong.core.newui.myinterestpeople;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardScrollView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardSmartScrollBar;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VText;
import p147v.VText_Tags;
import p149l.b1a;
import p149l.f1a;
import p149l.ftd0;
import p149l.g1a;
import p149l.i0g0;
import p149l.jtk;
import p149l.mqi0;
import p149l.qib0;
import p149l.sk5;
import p149l.t100;
import p149l.t19;
import p149l.u600;
import p149l.vsd0;
import p149l.vwb;
import p149l.w0c0;
import p149l.w39;
import p149l.w9j;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xgc0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestItem extends FrameLayout implements t19<w39>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public LinearLayout f25956A;

    /* JADX INFO: renamed from: B */
    public VText f25957B;

    /* JADX INFO: renamed from: C */
    public VText f25958C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f25959D;

    /* JADX INFO: renamed from: E */
    public VText f25960E;

    /* JADX INFO: renamed from: E0 */
    public VText f25961E0;

    /* JADX INFO: renamed from: F */
    public VText f25962F;

    /* JADX INFO: renamed from: F0 */
    public VText f25963F0;

    /* JADX INFO: renamed from: G */
    public LinearLayout f25964G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f25965G0;

    /* JADX INFO: renamed from: H */
    public VText f25966H;

    /* JADX INFO: renamed from: H0 */
    public VText f25967H0;

    /* JADX INFO: renamed from: I */
    public VText f25968I;

    /* JADX INFO: renamed from: I0 */
    public VText f25969I0;

    /* JADX INFO: renamed from: J */
    public LinearLayout f25970J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f25971J0;

    /* JADX INFO: renamed from: K */
    public VText f25972K;

    /* JADX INFO: renamed from: K0 */
    public VText f25973K0;

    /* JADX INFO: renamed from: L */
    public VText f25974L;

    /* JADX INFO: renamed from: L0 */
    public VText f25975L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f25976M;

    /* JADX INFO: renamed from: M0 */
    public LinearLayout f25977M0;

    /* JADX INFO: renamed from: N */
    public VText f25978N;

    /* JADX INFO: renamed from: N0 */
    public VText f25979N0;

    /* JADX INFO: renamed from: O */
    public VText f25980O;

    /* JADX INFO: renamed from: O0 */
    public VText f25981O0;

    /* JADX INFO: renamed from: P */
    public LinearLayout f25982P;

    /* JADX INFO: renamed from: P0 */
    public VText f25983P0;

    /* JADX INFO: renamed from: Q */
    public VText f25984Q;

    /* JADX INFO: renamed from: Q0 */
    public LinearLayout f25985Q0;

    /* JADX INFO: renamed from: R */
    public VText f25986R;

    /* JADX INFO: renamed from: R0 */
    public VText f25987R0;

    /* JADX INFO: renamed from: S */
    public LinearLayout f25988S;

    /* JADX INFO: renamed from: S0 */
    public VText f25989S0;

    /* JADX INFO: renamed from: T */
    public VText f25990T;

    /* JADX INFO: renamed from: T0 */
    public LinearLayout f25991T0;

    /* JADX INFO: renamed from: U */
    public VText f25992U;

    /* JADX INFO: renamed from: U0 */
    public VText f25993U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f25994V;

    /* JADX INFO: renamed from: V0 */
    public VText f25995V0;

    /* JADX INFO: renamed from: W */
    public VText f25996W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f25997W0;

    /* JADX INFO: renamed from: X0 */
    public VText f25998X0;

    /* JADX INFO: renamed from: Y0 */
    public VText f25999Y0;

    /* JADX INFO: renamed from: Z0 */
    public LinearLayout f26000Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f26001a;

    /* JADX INFO: renamed from: a1 */
    public VText f26002a1;

    /* JADX INFO: renamed from: b */
    public FeedPoiCardScrollView f26003b;

    /* JADX INFO: renamed from: b1 */
    public VText f26004b1;

    /* JADX INFO: renamed from: c */
    public LinearLayout f26005c;

    /* JADX INFO: renamed from: c1 */
    public TextView f26006c1;

    /* JADX INFO: renamed from: d */
    public VDraweeView f26007d;

    /* JADX INFO: renamed from: d1 */
    public VText_Tags f26008d1;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f26009e;

    /* JADX INFO: renamed from: e1 */
    public TextView f26010e1;

    /* JADX INFO: renamed from: f */
    public ImageView f26011f;

    /* JADX INFO: renamed from: f1 */
    public TextView f26012f1;

    /* JADX INFO: renamed from: g */
    public TextView f26013g;

    /* JADX INFO: renamed from: g1 */
    public FeedPoiCardSmartScrollBar f26014g1;

    /* JADX INFO: renamed from: h */
    public LinearLayout f26015h;

    /* JADX INFO: renamed from: h1 */
    public g1a f26016h1;

    /* JADX INFO: renamed from: i */
    public VText f26017i;

    /* JADX INFO: renamed from: i1 */
    public w39 f26018i1;

    /* JADX INFO: renamed from: j */
    public VText f26019j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f26020j1;

    /* JADX INFO: renamed from: k */
    public ImageView f26021k;

    /* JADX INFO: renamed from: k0 */
    public VText f26022k0;

    /* JADX INFO: renamed from: l */
    public ImageView f26023l;

    /* JADX INFO: renamed from: m */
    public VText f26024m;

    /* JADX INFO: renamed from: n */
    public TextView f26025n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f26026o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f26027p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f26028p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f26029q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f26030r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f26031s;

    /* JADX INFO: renamed from: t */
    public VText f26032t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f26033u;

    /* JADX INFO: renamed from: v */
    public VText f26034v;

    /* JADX INFO: renamed from: w */
    public VText f26035w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f26036x;

    /* JADX INFO: renamed from: y */
    public VText f26037y;

    /* JADX INFO: renamed from: z */
    public VText f26038z;

    public CoreMyInterestItem(@NonNull Context context) {
        super(context);
        this.f26020j1 = new HashMap<>();
    }

    /* JADX INFO: renamed from: I */
    public static SpannableStringBuilder m42562I(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
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
        if (NullChecker.m81303a(listSubList2)) {
            for (Tag tag : listSubList2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag.category);
                    u600 u600Var = new u600(CoreModule.f17544b, tag.value, -1, -98787, i, 6, i2, 13.0f, true, t100.m186890d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(u600Var, i3, i4, 33);
                    i3 = i4;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        if (NullChecker.m81303a(listSubList)) {
            for (Tag tag2 : listSubList) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag2.category);
                    int i5 = i3 + 1;
                    spannableStringBuilder.setSpan(new u600(CoreModule.f17544b, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, t100.m186890d(3.0f), true, t100.m186890d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m42563Y() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: v */
    public static String m42573v(Profile profile) {
        if (!NullChecker.m81303a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.m200296J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.m200296J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.m200296J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public static long m42574w(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m81303a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m42575A(w39 w39Var, View view) {
        this.f26016h1.mo42634e(w39Var, true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m42576C(w39 w39Var, View view) {
        this.f26016h1.mo42630M(w39Var);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m42577D(w39 w39Var, View view) {
        this.f26016h1.mo42634e(w39Var, true);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m42578E(w39 w39Var, View view) {
        this.f26016h1.mo42630M(w39Var);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m42579F(w39 w39Var, View view) {
        this.f26016h1.mo42634e(w39Var, true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m42580G(w39 w39Var, View view) {
        this.f26016h1.mo42634e(w39Var, false);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m42581H(w39 w39Var, View view) {
        this.f26016h1.mo42642q0(w39Var);
    }

    /* JADX INFO: renamed from: J */
    public void m42582J(w39 w39Var) {
        this.f26018i1 = w39Var;
        super.m186896a(w39Var);
    }

    /* JADX INFO: renamed from: K */
    public void m42583K() {
        if (CoreModule.m29934N().mo60389so() && this.f26018i1.m201264d()) {
            if ((!mqi0.m155928C(CoreModule.m29934N().mo60391tf().get().longValue(), mqi0.m155944o()) || CoreModule.m29934N().mo60281Hj()) && !CoreModule.m29934N().mo60281Hj()) {
                C4345a c4345a = new C4345a(m42605r());
                c4345a.m20849D("点击礼貌回谢，表达你的感谢").m20871l(t100.m186890d(9.0f)).m20870k(m42605r().getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20850E(true).m20882x(-t100.m186890d(5.0f)).m20879u(t100.m186890d(0.0f)).m20861b(3000L).m20858M(true).m20864e(false).m20873o(jtk.f119616C, t100.m186890d(56.0f)).m20875q(C4345a.f15683Q | jtk.f119616C);
                C4348d.m20896l().m20909u(c4345a, this.f26012f1, "SHARE_TIP_MYINTEREST");
                CoreModule.m29934N().mo60391tf().put(Long.valueOf(mqi0.m155944o()));
                return;
            }
            return;
        }
        zpd0 zpd0Var = new zpd0("show_guide_time_interest_people" + CoreModule.m29931H().userId(), 0L);
        if (mqi0.m155928C(zpd0Var.get().longValue(), mqi0.m155944o())) {
            return;
        }
        C4345a c4345a2 = new C4345a(m42605r());
        String strM42610y = m42610y(this.f26018i1.m201263c());
        c4345a2.m20849D("他们都对你很感兴趣，对" + strM42610y + "感兴趣就关注" + strM42610y + "吧").m20871l(t100.m186890d(9.0f)).m20870k(m42605r().getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20850E(true).m20882x(-t100.m186890d(12.0f)).m20879u(t100.m186890d(40.0f)).m20861b(3000L).m20858M(true).m20864e(false).m20873o(jtk.f119616C, t100.m186890d(10.0f)).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a2, this.f26012f1, "SHARE_TIP_MYINTEREST");
        zpd0Var.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: L */
    public final void m42584L(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            qib0.f154691G.m102341Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                qib0.f154691G.m102341Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().mo112056c(new vsd0(m42605r().getResources().getDrawable(x2c0.f190419o8), ftd0.f99183g));
            }
        }
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo42600d(final w39 w39Var) {
        if (w39Var.m201265e()) {
            this.f26012f1.setText("直接配对");
            w39Var.m201267g(7);
            this.f26012f1.setOnClickListener(new View.OnClickListener() { // from class: l.v0a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179082a.m42575A(w39Var, view);
                }
            });
            return;
        }
        if (!w39Var.m201264d()) {
            this.f26012f1.setText("回关");
            w39Var.m201267g(2);
        } else {
            if (CoreModule.m29934N().mo60389so()) {
                if (!CoreModule.m29934N().mo60281Hj()) {
                    this.f26012f1.setText("礼貌回谢");
                    w39Var.m201267g(5);
                    xdl0.m208329E0(this.f26012f1, new View.OnClickListener() { // from class: l.z0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f200946a.m42579F(w39Var, view);
                        }
                    });
                    return;
                }
                if (xgc0.m208625c(w39Var.m201263c().f56011id)) {
                    this.f26012f1.setText("聊天");
                    w39Var.m201267g(3);
                    xdl0.m208329E0(this.f26012f1, new View.OnClickListener() { // from class: l.w0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f183738a.m42576C(w39Var, view);
                        }
                    });
                    return;
                } else if (CoreModule.m29934N().mo60399vj(CoreModule.f17545c.f19639e0.m169527p9().isFemale()) && NullChecker.m81303a(CoreModule.f17545c.m31484o3()) && CoreModule.f17545c.m31484o3().flower.count > 0) {
                    this.f26012f1.setText("送小红花");
                    w39Var.m201267g(6);
                    xdl0.m208329E0(this.f26012f1, new View.OnClickListener() { // from class: l.x0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f188942a.m42577D(w39Var, view);
                        }
                    });
                    return;
                } else {
                    this.f26012f1.setText("打招呼");
                    w39Var.m201267g(4);
                    xdl0.m208329E0(this.f26012f1, new View.OnClickListener() { // from class: l.y0a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f195284a.m42578E(w39Var, view);
                        }
                    });
                    return;
                }
            }
            this.f26012f1.setText("关注");
            w39Var.m201267g(1);
        }
        this.f26012f1.setOnClickListener(new View.OnClickListener() { // from class: l.a1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67113a.m42580G(w39Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m42586N(User user) {
        final ArrayList arrayListM200339n;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f26008d1.setVisibility(8);
            this.f26006c1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListM200339n = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(CoreModule.m29932K().me_().profile.tags);
            ArrayList arrayListM200339n2 = vwb.m200339n(hashSet, new b1a(hashSet2));
            arrayListM200339n = vwb.m200339n(hashSet, new w9j() { // from class: l.c1a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListM200339n2;
        }
        this.f26008d1.setTags(new x9j() { // from class: l.d1a
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return CoreMyInterestItem.m42562I(arrayList, arrayListM200339n, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), t100.m186890d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m42587O(User user) {
        if (user == null) {
            return;
        }
        this.f26017i.setText(user.name);
        this.f26017i.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26019j.setText(String.valueOf(user.age));
        xdl0.m208344M(this.f26019j, !user.isHideAgeFromSVipWithOutMe());
        m42594V(user, this.f26024m);
        xdl0.m208344M(this.f26023l, false);
        xdl0.m208344M(this.f26021k, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            xdl0.m208344M(this.f26019j, false);
        }
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo42602f(final w39 w39Var) {
        boolean zM201265e = w39Var.m201265e();
        TextView textView = this.f26010e1;
        if (zM201265e) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f26010e1.setOnClickListener(new View.OnClickListener() { // from class: l.e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88738a.m42581H(w39Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m42589Q(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f25974L.setText(R$string.f18277Xk);
            this.f25980O.setText(profile.studies.major);
            this.f25980O.setHint(R$string.f18067Qk);
            this.f25986R.setVisibility(8);
        } else {
            this.f25986R.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f25974L.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f25974L.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f25974L;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f25974L.setHint("添加职业信息");
            this.f25986R.setText(profile.work.company);
        }
        StringBuilder sb = new StringBuilder(profile.studies.school);
        if (NullChecker.m81303a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            sb.append("(");
            sb.append(m42605r().getString(R$string.f17627C0));
            sb.append(")");
        }
        this.f25992U.setText(sb.toString());
        m42597Z(this.f25992U);
        m42596X(this.f25962F, 8);
        m42596X(this.f25968I, 8);
        if (!m42563Y() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.m208344M(this.f25958C, false);
        } else {
            xdl0.m208345M0(this.f25958C, true);
            this.f25958C.setText(m42611z(profile.extensions.physical.bloodType.get(0)));
        }
        this.f25963F0.setText(m42609x(profile));
        this.f25975L0.setText(profile.hangouts);
        m42597Z(this.f25974L);
        m42597Z(this.f25980O);
        m42597Z(this.f25986R);
        m42597Z(this.f25963F0);
        m42597Z(this.f25975L0);
        m42596X(this.f25980O, 8);
        String strM133869j0 = i0g0.m133869j0(profile.zodiac);
        if (TextUtils.isEmpty(strM133869j0) || m42563Y()) {
            this.f26036x.setVisibility(8);
        } else {
            this.f26038z.setText(strM133869j0);
            this.f26036x.setVisibility(0);
            this.f26032t.setVisibility(0);
        }
        String str = CoreModule.m29932K().getUserById(user.f56011id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        LinearLayout linearLayout = this.f25977M0;
        if (zIsEmpty2) {
            m42596X(linearLayout, 8);
        } else {
            m42596X(linearLayout, 0);
            this.f25981O0.setText(str);
        }
        this.f26032t.setTypeface(Typeface.DEFAULT_BOLD);
        this.f25972K.setText(m42605r().getResources().getString(R$string.f18127Sk));
        if (!m42563Y() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        xdl0.m208345M0(this.f25956A, true);
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo42601e(w39 w39Var) {
        m42594V(w39Var.m201263c(), this.f26024m);
        m42587O(w39Var.m201263c());
        qib0.f154691G.m102331L0(this.f26007d, w39Var.m201263c().m60124fp().profileBig().formatted());
        RoundingParams roundingParamsM8248b = RoundingParams.m8248b(t100.m186890d(16.0f), t100.m186890d(16.0f), 0.0f, 0.0f);
        roundingParamsM8248b.m8268v(false);
        this.f26007d.getHierarchy().m112078y(0);
        this.f26007d.getHierarchy().m112053H(roundingParamsM8248b);
        if (w39Var.m201265e()) {
            this.f26011f.setImageResource(x2c0.f189484Ke);
            this.f26013g.setText(String.format("%s通过精选动态喜欢了你", m42610y(w39Var.m201263c())));
            return;
        }
        boolean zM201264d = w39Var.m201264d();
        ImageView imageView = this.f26011f;
        if (zM201264d) {
            imageView.setImageResource(x2c0.f189484Ke);
            this.f26013g.setText(String.format("%s点赞了你", m42610y(w39Var.m201263c())));
        } else {
            imageView.setImageResource(x2c0.f189453Je);
            this.f26013g.setText(String.format("%s关注了你", m42610y(w39Var.m201263c())));
        }
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo42598b(w39 w39Var) {
        m42607t(this.f25958C, this.f25956A);
        m42607t(this.f25962F, this.f25959D);
        m42607t(this.f25968I, this.f25964G);
        m42607t(this.f25974L, this.f25970J);
        m42607t(this.f25980O, this.f25976M);
        m42607t(this.f25986R, this.f25982P);
        m42607t(this.f25992U, this.f25988S);
        m42607t(this.f25963F0, this.f26028p0);
        m42607t(this.f25975L0, this.f25971J0);
        m42607t(this.f25969I0, this.f25965G0);
        m42607t(this.f26022k0, this.f25994V);
        VText vText = this.f25983P0;
        m42607t(vText, vText);
        m42607t(this.f25989S0, this.f25985Q0);
        m42607t(this.f25995V0, this.f25991T0);
        m42607t(this.f25999Y0, this.f25997W0);
        m42607t(this.f26004b1, this.f26000Z0);
        m42589Q(w39Var.m201263c());
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo42603g(w39 w39Var) {
        m42586N(w39Var.m201263c());
    }

    @Override // p149l.t19
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo42599c(w39 w39Var) {
        List<CoreMomentInfo> listM201262b = w39Var.m201262b();
        if (vwb.m200296J(listM201262b)) {
            this.f26025n.setVisibility(8);
            this.f26026o.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM201262b.size() && i != 4; i2++) {
            CoreMomentInfo coreMomentInfo = listM201262b.get(i2);
            if (coreMomentInfo.media.size() != 0 && ((coreMomentInfo.media.get(0) instanceof Picture) || (coreMomentInfo.media.get(0) instanceof Video))) {
                for (Media media : coreMomentInfo.media) {
                    if (i == 0) {
                        m42584L(media, this.f26027p);
                    } else if (i == 1) {
                        m42584L(media, this.f26029q);
                    } else if (i == 2) {
                        m42584L(media, this.f26030r);
                    } else if (i == 3) {
                        m42584L(media, this.f26031s);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m42606s();
        } else {
            this.f26025n.setVisibility(8);
            this.f26026o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m42594V(User user, VText vText) {
        String strM42608u = m42608u(user);
        if (NullChecker.m81304b(user.profile) && NullChecker.m81304b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m81303a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM42608u)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM42608u);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM42608u);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM42608u);
                return;
            }
        }
        if (TextUtils.isEmpty(strM42608u)) {
            m42596X(vText, 8);
        } else {
            vText.setText(strM42608u);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m42595W(View view, float f) {
        view.setOutlineProvider(new sk5(t100.m186890d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: X */
    public void m42596X(View view, int i) {
        View view2 = this.f26020j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m42597Z(VText vText) {
        xdl0.m208347N0(vText);
        m42596X(vText, vText.getVisibility());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM201263c = this.f26018i1.m201263c();
        zvf0.m220399u("e_interested_user_card", "p_interested_user", vwb.m200311Y("notes_type", this.f26018i1.m201265e() ? "respond_match" : userM201263c.activityUser.action), vwb.m200311Y("card_user_id", userM201263c.f56011id));
        m42605r().startActivity(CoreModule.m29934N().mo60339bb(m42605r(), userM201263c.f56011id, "FROM_MINE_INTEREST_LIST", -1, "", 2, "p_interested_user", false));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42604q(this);
        this.f26014g1.m43192b(this.f26003b);
        m42595W(this.f26001a, 16.0f);
        this.f26005c.setOnClickListener(this);
        setBackgroundResource(x2c0.f190086dp);
    }

    /* JADX INFO: renamed from: q */
    public final void m42604q(View view) {
        f1a.m119107a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m42605r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public final void m42606s() {
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(96.0f)) / 4;
        xdl0.m208325C0(this.f26027p, iM208412y0);
        xdl0.m208325C0(this.f26029q, iM208412y0);
        xdl0.m208325C0(this.f26030r, iM208412y0);
        xdl0.m208325C0(this.f26031s, iM208412y0);
        xdl0.m208327D0(iM208412y0, this.f26027p);
        xdl0.m208327D0(iM208412y0, this.f26029q);
        xdl0.m208327D0(iM208412y0, this.f26030r);
        xdl0.m208327D0(iM208412y0, this.f26031s);
    }

    public void setClickCallBack(g1a g1aVar) {
        this.f26016h1 = g1aVar;
    }

    /* JADX INFO: renamed from: t */
    public void m42607t(View view, View view2) {
        this.f26020j1.put(view, view2);
    }

    /* JADX INFO: renamed from: u */
    public final String m42608u(User user) {
        String string;
        CharSequence charSequenceM133876p = "";
        if (user.location == null) {
            return "";
        }
        if (!CoreModule.m29932K().hideActiveTime(user)) {
            string = m42605r().getResources().getString(R$string.f19039wk, mqi0.m155932G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = m42605r().getResources().getString(R$string.f19039wk, mqi0.m155932G(m42574w(user)));
            if (user.isMe()) {
                string = string + m42605r().getResources().getString(R$string.f18657k3);
            }
        } else {
            string = "";
        }
        if (!CoreModule.m29932K().hideLocation(user)) {
            boolean zEquals = user.f56011id.equals(CoreModule.m29932K().me_().f56011id);
            Location location = user.location;
            charSequenceM133876p = zEquals ? i0g0.m133876p(location.distance, true) : i0g0.m133851R(location);
        }
        if (TextUtils.isEmpty(charSequenceM133876p)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceM133876p) : m42605r().getString(R$string.f18187Uk, charSequenceM133876p, string);
    }

    /* JADX INFO: renamed from: x */
    public final String m42609x(Profile profile) {
        String strM42573v = m42573v(profile);
        return TextUtils.isEmpty(strM42573v) ? profile.hometown : strM42573v;
    }

    /* JADX INFO: renamed from: y */
    public String m42610y(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: z */
    public String m42611z(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return m42605r().getResources().getString(R$string.f18899s0);
            case "B":
                return m42605r().getResources().getString(R$string.f18959u0);
            case "O":
                return m42605r().getResources().getString(R$string.f18989v0);
            case "AB":
                return m42605r().getResources().getString(R$string.f18929t0);
            case "UNKNOWN":
                return m42605r().getResources().getString(R$string.f19019w0);
            default:
                return "";
        }
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26020j1 = new HashMap<>();
    }

    public CoreMyInterestItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26020j1 = new HashMap<>();
    }
}
