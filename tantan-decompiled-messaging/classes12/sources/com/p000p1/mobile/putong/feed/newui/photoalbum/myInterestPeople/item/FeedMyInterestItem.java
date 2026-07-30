package com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.BloodType;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.Location;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.SettingGroups;
import com.p000p1.mobile.putong.data.Studies;
import com.p000p1.mobile.putong.data.SvipPrivacySettings;
import com.p000p1.mobile.putong.data.Tag;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import l.b1a;
import l.e30;
import l.ftd0;
import l.i0g0;
import l.j760;
import l.jtk;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vsd0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import p007l.a5i;
import p007l.e1c0;
import p007l.exq;
import p007l.f3c0;
import p007l.jol;
import p007l.mah;
import p007l.mhh;
import p007l.nkg;
import p007l.p6j0;
import p007l.sdh;
import p007l.x8h;
import p007l.zol;
import v.VDraweeView;
import v.VScroll;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMyInterestItem extends FrameLayout implements jol<x8h>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VText f3587A;

    /* JADX INFO: renamed from: B */
    public VText f3588B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f3589C;

    /* JADX INFO: renamed from: D */
    public VText f3590D;

    /* JADX INFO: renamed from: E */
    public VText f3591E;

    /* JADX INFO: renamed from: E0 */
    public VText f3592E0;

    /* JADX INFO: renamed from: F */
    public LinearLayout f3593F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f3594F0;

    /* JADX INFO: renamed from: G */
    public VText f3595G;

    /* JADX INFO: renamed from: G0 */
    public VText f3596G0;

    /* JADX INFO: renamed from: H */
    public VText f3597H;

    /* JADX INFO: renamed from: H0 */
    public VText f3598H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f3599I;

    /* JADX INFO: renamed from: I0 */
    public LinearLayout f3600I0;

    /* JADX INFO: renamed from: J */
    public VText f3601J;

    /* JADX INFO: renamed from: J0 */
    public VText f3602J0;

    /* JADX INFO: renamed from: K */
    public VText f3603K;

    /* JADX INFO: renamed from: K0 */
    public VText f3604K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f3605L;

    /* JADX INFO: renamed from: L0 */
    public LinearLayout f3606L0;

    /* JADX INFO: renamed from: M */
    public VText f3607M;

    /* JADX INFO: renamed from: M0 */
    public VText f3608M0;

    /* JADX INFO: renamed from: N */
    public VText f3609N;

    /* JADX INFO: renamed from: N0 */
    public VText f3610N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f3611O;

    /* JADX INFO: renamed from: O0 */
    public VText f3612O0;

    /* JADX INFO: renamed from: P */
    public VText f3613P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f3614P0;

    /* JADX INFO: renamed from: Q */
    public VText f3615Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f3616Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f3617R;

    /* JADX INFO: renamed from: R0 */
    public VText f3618R0;

    /* JADX INFO: renamed from: S */
    public VText f3619S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f3620S0;

    /* JADX INFO: renamed from: T */
    public VText f3621T;

    /* JADX INFO: renamed from: T0 */
    public VText f3622T0;

    /* JADX INFO: renamed from: U */
    public LinearLayout f3623U;

    /* JADX INFO: renamed from: U0 */
    public VText f3624U0;

    /* JADX INFO: renamed from: V */
    public VText f3625V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f3626V0;

    /* JADX INFO: renamed from: W */
    public VText f3627W;

    /* JADX INFO: renamed from: W0 */
    public VText f3628W0;

    /* JADX INFO: renamed from: X0 */
    public VText f3629X0;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f3630Y0;

    /* JADX INFO: renamed from: Z0 */
    public VText f3631Z0;

    /* JADX INFO: renamed from: a */
    public VScroll f3632a;

    /* JADX INFO: renamed from: a1 */
    public VText f3633a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3634b;

    /* JADX INFO: renamed from: b1 */
    public TextView f3635b1;

    /* JADX INFO: renamed from: c */
    public VDraweeView f3636c;

    /* JADX INFO: renamed from: c1 */
    public VText_Tags f3637c1;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3638d;

    /* JADX INFO: renamed from: d1 */
    public TextView f3639d1;

    /* JADX INFO: renamed from: e */
    public ImageView f3640e;

    /* JADX INFO: renamed from: e1 */
    public TextView f3641e1;

    /* JADX INFO: renamed from: f */
    public TextView f3642f;

    /* JADX INFO: renamed from: f1 */
    public SmartScrollBar f3643f1;

    /* JADX INFO: renamed from: g */
    public LinearLayout f3644g;

    /* JADX INFO: renamed from: g1 */
    public Act f3645g1;

    /* JADX INFO: renamed from: h */
    public VText f3646h;

    /* JADX INFO: renamed from: h1 */
    public zol f3647h1;

    /* JADX INFO: renamed from: i */
    public VText f3648i;

    /* JADX INFO: renamed from: i1 */
    public x8h f3649i1;

    /* JADX INFO: renamed from: j */
    public ImageView f3650j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f3651j1;

    /* JADX INFO: renamed from: k */
    public ImageView f3652k;

    /* JADX INFO: renamed from: k0 */
    public LinearLayout f3653k0;

    /* JADX INFO: renamed from: k1 */
    public int f3654k1;

    /* JADX INFO: renamed from: l */
    public VText f3655l;

    /* JADX INFO: renamed from: m */
    public TextView f3656m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f3657n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f3658o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f3659p;

    /* JADX INFO: renamed from: p0 */
    public VText f3660p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f3661q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f3662r;

    /* JADX INFO: renamed from: s */
    public VText f3663s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f3664t;

    /* JADX INFO: renamed from: u */
    public VText f3665u;

    /* JADX INFO: renamed from: v */
    public VText f3666v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f3667w;

    /* JADX INFO: renamed from: x */
    public VText f3668x;

    /* JADX INFO: renamed from: y */
    public VText f3669y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f3670z;

    public FeedMyInterestItem(@NonNull Act act, zol zolVar, int i) {
        super(act);
        this.f3651j1 = new HashMap<>();
        this.f3645g1 = act;
        this.f3647h1 = zolVar;
        View viewM6043q = m6043q(LayoutInflater.from(act), this);
        addView(viewM6043q);
        exq.m9962b(viewM6043q, 16.0f);
        setBackgroundColor(0);
        this.f3634b.setOnClickListener(this);
        setBackgroundResource(f3c0.f7725V4);
        this.f3654k1 = i;
    }

    /* JADX INFO: renamed from: F */
    public static SpannableStringBuilder m6006F(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
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
                    sdh sdhVar = new sdh(FeedModule.f313a, tag.value, -1, -98787, i, 6, i2, 13.0f, true, t100.d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(sdhVar, i3, i4, 33);
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
                    spannableStringBuilder.setSpan(new sdh(FeedModule.f313a, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, t100.d(3.0f), true, t100.d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m6007T() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: u */
    public static String m6015u(Profile profile) {
        if (!NullChecker.a(profile)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = vwb.J(profile.extensions.basic.country) ? "" : profile.extensions.basic.country.get(0);
        if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
            sb.append(str);
        }
        String str2 = vwb.J(profile.extensions.basic.province) ? "" : profile.extensions.basic.province.get(0);
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str2);
        }
        String str3 = vwb.J(profile.extensions.basic.city) ? "" : profile.extensions.basic.city.get(0);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("·");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static long m6016v(User user) {
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
    public final /* synthetic */ void m6017A(Boolean bool) {
        Act act = this.f3645g1;
        if (act == null || act.isDestroyed() || this.f3645g1.isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6018C(x8h x8hVar, View view) {
        FeedModule.m1140H().Vk(this.f3645g1, mah.m11869b().m11871c(), ((DbObject) x8hVar.m16037b()).id, (String) null, (String) null, Channel.get(Channel.reply_thanks), new e30() { // from class: l.lhh
            public final void call(Object obj) {
                this.f10042a.m6017A((Boolean) obj);
            }
        });
        p6j0.m12913c("e_polite_gratitude", "p_interested_user", j760.a("moments_user_id", ((DbObject) x8hVar.m16037b()).id));
        this.f3647h1.mo5997p0(x8hVar, true);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m6019D(x8h x8hVar, View view) {
        p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.a("card_user_id", ((DbObject) x8hVar.m16037b()).id));
        this.f3647h1.mo5997p0(x8hVar, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6020E(x8h x8hVar, View view) {
        p6j0.m12913c("e_interested_user_card_close", "p_interested_user", j760.a("card_user_id", ((DbObject) x8hVar.m16037b()).id));
        this.f3647h1.mo5987T(x8hVar);
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo6035a(x8h x8hVar) {
        this.f3649i1 = x8hVar;
        super.mo6035a(x8hVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m6022H(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            qib0.G.Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.b(video.cover) && NullChecker.b(video.cover.url)) {
                qib0.G.Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().c(new vsd0(this.f3645g1.getResources().getDrawable(f3c0.f7813h1), ftd0.g));
            }
        }
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo6038d(final x8h x8hVar) {
        if (x8hVar.m16039d()) {
            this.f3641e1.setText("直接配对");
            this.f3641e1.setOnClickListener(new View.OnClickListener() { // from class: l.ihh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9018a.m6050z(x8hVar, view);
                }
            });
            return;
        }
        if (x8hVar.m16038c()) {
            boolean zM12213K = nkg.m12213K();
            TextView textView = this.f3641e1;
            if (zM12213K) {
                textView.setText("礼貌回谢");
                xdl0.E0(this.f3641e1, new View.OnClickListener() { // from class: l.jhh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9363a.m6018C(x8hVar, view);
                    }
                });
                return;
            }
            textView.setText("关注");
        } else {
            this.f3641e1.setText("回关");
        }
        this.f3641e1.setOnClickListener(new View.OnClickListener() { // from class: l.khh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9720a.m6019D(x8hVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m6024J(User user) {
        final ArrayList arrayListN;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f3637c1.setVisibility(8);
            this.f3635b1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListN = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(FeedModule.m1140H().me_().profile.tags);
            ArrayList arrayListN2 = vwb.n(hashSet, new b1a(hashSet2));
            arrayListN = vwb.n(hashSet, new w9j() { // from class: l.fhh
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListN2;
        }
        this.f3637c1.setTags(new x9j() { // from class: l.ghh
            public final Object call(Object obj, Object obj2) {
                return FeedMyInterestItem.m6006F(arrayList, arrayListN, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), t100.d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m6025K(User user) {
        if (user == null) {
            return;
        }
        this.f3646h.setText(user.name);
        this.f3646h.setTypeface(Typeface.DEFAULT_BOLD);
        this.f3648i.setText(String.valueOf(user.age));
        xdl0.M(this.f3648i, !user.isHideAgeFromSVipWithOutMe());
        m6032R(user, this.f3655l);
        xdl0.M(this.f3652k, false);
        xdl0.M(this.f3650j, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            xdl0.M(this.f3648i, false);
        }
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo6040f(final x8h x8hVar) {
        boolean zM16039d = x8hVar.m16039d();
        TextView textView = this.f3639d1;
        if (zM16039d) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f3639d1.setOnClickListener(new View.OnClickListener() { // from class: l.hhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8721a.m6020E(x8hVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m6027M(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f3603K.setText(R$string.f357F4);
            this.f3609N.setText(profile.studies.major);
            this.f3609N.setHint(R$string.f339C4);
            this.f3615Q.setVisibility(8);
        } else {
            this.f3615Q.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f3603K.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f3603K.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f3603K;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f3603K.setHint("添加职业信息");
            this.f3615Q.setText(profile.work.company);
        }
        String str = profile.studies.school;
        if (NullChecker.a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            str = profile.studies.school + "(" + this.f3645g1.getString(R$string.f638y) + ")";
        }
        this.f3621T.setText(str);
        m6034U(this.f3621T);
        m6033S(this.f3591E, 8);
        m6033S(this.f3597H, 8);
        if (!m6007T() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.M(this.f3588B, false);
        } else {
            xdl0.M0(this.f3588B, true);
            this.f3588B.setText(m6049y(profile.extensions.physical.bloodType.get(0)));
        }
        this.f3592E0.setText(m6047w(profile));
        this.f3604K0.setText(profile.hangouts);
        m6034U(this.f3603K);
        m6034U(this.f3609N);
        m6034U(this.f3615Q);
        m6034U(this.f3592E0);
        m6034U(this.f3604K0);
        m6033S(this.f3609N, 8);
        String strJ0 = i0g0.j0(profile.zodiac);
        if (TextUtils.isEmpty(strJ0) || m6007T()) {
            this.f3667w.setVisibility(8);
        } else {
            this.f3669y.setText(strJ0);
            this.f3667w.setVisibility(0);
            this.f3663s.setVisibility(0);
        }
        String str2 = FeedModule.m1140H().getUserById(((DbObject) user).id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        LinearLayout linearLayout = this.f3606L0;
        if (zIsEmpty2) {
            m6033S(linearLayout, 8);
        } else {
            m6033S(linearLayout, 0);
            this.f3610N0.setText(str2);
        }
        this.f3663s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f3601J.setText(this.f3645g1.getResources().getString(R$string.f345D4));
        if (!m6007T() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        xdl0.M0(this.f3670z, true);
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo6039e(x8h x8hVar) {
        m6032R(x8hVar.m16037b(), this.f3655l);
        m6025K(x8hVar.m16037b());
        qib0.G.L0(this.f3636c, x8hVar.m16037b().m1042fp().profileBig().formatted());
        RoundingParams roundingParamsB = RoundingParams.b(t100.d(16.0f), t100.d(16.0f), 0.0f, 0.0f);
        roundingParamsB.v(false);
        this.f3636c.getHierarchy().y(0);
        this.f3636c.getHierarchy().H(roundingParamsB);
        if (x8hVar.m16039d()) {
            this.f3640e.setImageResource(f3c0.f7715U1);
            this.f3642f.setText(String.format("%s通过精选动态喜欢了你", m6048x(x8hVar.m16037b())));
            return;
        }
        boolean zM16038c = x8hVar.m16038c();
        ImageView imageView = this.f3640e;
        if (zM16038c) {
            imageView.setImageResource(f3c0.f7715U1);
            this.f3642f.setText(String.format("%s点赞了你", m6048x(x8hVar.m16037b())));
        } else {
            imageView.setImageResource(f3c0.f7708T1);
            this.f3642f.setText(String.format("%s关注了你", m6048x(x8hVar.m16037b())));
        }
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo6036b(x8h x8hVar) {
        m6045s(this.f3588B, this.f3670z);
        m6045s(this.f3591E, this.f3589C);
        m6045s(this.f3597H, this.f3593F);
        m6045s(this.f3603K, this.f3599I);
        m6045s(this.f3609N, this.f3605L);
        m6045s(this.f3615Q, this.f3611O);
        m6045s(this.f3621T, this.f3617R);
        m6045s(this.f3592E0, this.f3653k0);
        m6045s(this.f3604K0, this.f3600I0);
        m6045s(this.f3598H0, this.f3594F0);
        m6045s(this.f3627W, this.f3623U);
        VText vText = this.f3612O0;
        m6045s(vText, vText);
        m6045s(this.f3618R0, this.f3614P0);
        m6045s(this.f3624U0, this.f3620S0);
        m6045s(this.f3629X0, this.f3626V0);
        m6045s(this.f3633a1, this.f3630Y0);
        m6027M(x8hVar.m16037b());
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo6041g(x8h x8hVar) {
        m6024J(x8hVar.m16037b());
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo6037c(x8h x8hVar) {
        List<Moment> listM16036a = x8hVar.m16036a();
        if (vwb.J(listM16036a)) {
            this.f3656m.setVisibility(8);
            this.f3657n.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM16036a.size() && i != 4; i2++) {
            Moment moment = listM16036a.get(i2);
            if (moment.media.size() != 0 && ((moment.media.get(0) instanceof Picture) || (moment.media.get(0) instanceof Video))) {
                for (Media media : moment.media) {
                    if (i == 0) {
                        m6022H(media, this.f3658o);
                    } else if (i == 1) {
                        m6022H(media, this.f3659p);
                    } else if (i == 2) {
                        m6022H(media, this.f3661q);
                    } else if (i == 3) {
                        m6022H(media, this.f3662r);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m6044r();
        } else {
            this.f3656m.setVisibility(8);
            this.f3657n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m6032R(User user, VText vText) {
        String strM6046t = m6046t(user);
        if (NullChecker.b(user.profile) && NullChecker.b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM6046t)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM6046t);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM6046t);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM6046t);
                return;
            }
        }
        if (TextUtils.isEmpty(strM6046t)) {
            m6033S(vText, 8);
        } else {
            vText.setText(strM6046t);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m6033S(View view, int i) {
        View view2 = this.f3651j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m6034U(VText vText) {
        xdl0.N0(vText);
        m6033S(vText, vText.getVisibility());
    }

    public int getPosition() {
        return this.f3654k1;
    }

    @Override // p007l.jol
    /* JADX INFO: renamed from: h */
    public void mo6042h() {
        if (nkg.m12213K() && this.f3649i1.m16038c()) {
            if (a5i.m8412l(((Long) FeedModule.f316d.f14936L.get()).longValue(), mqi0.o())) {
                return;
            }
            a aVar = new a(this.f3645g1);
            aVar.D("点击礼貌回谢，表达你的感谢").l(t100.d(9.0f)).k(new int[]{this.f3645g1.getResources().getColor(e1c0.f7154n)}).J(13.0f).E(true).x(-t100.d(12.0f)).u(t100.d(40.0f)).b(3000L).M(true).e(false).o(jtk.C, t100.d(10.0f)).q(a.Q | a.P);
            d.l().u(aVar, this.f3641e1, "SHARE_TIP_MYINTEREST");
            FeedModule.f316d.f14936L.put(Long.valueOf(mqi0.o()));
            return;
        }
        zpd0 zpd0Var = new zpd0("show_guide_time_interest_people" + FeedModule.m1139F().userId(), 0L);
        if (a5i.m8412l(((Long) zpd0Var.get()).longValue(), mqi0.o())) {
            return;
        }
        a aVar2 = new a(this.f3645g1);
        String strM6048x = m6048x(this.f3649i1.m16037b());
        aVar2.D("他们都对你很感兴趣，对" + strM6048x + "感兴趣就关注" + strM6048x + "吧").l(t100.d(9.0f)).k(new int[]{this.f3645g1.getResources().getColor(e1c0.f7154n)}).J(13.0f).E(true).x(-t100.d(12.0f)).u(t100.d(40.0f)).b(3000L).M(true).e(false).o(jtk.C, t100.d(10.0f)).q(a.Q | a.P);
        d.l().u(aVar2, this.f3641e1, "SHARE_TIP_MYINTEREST");
        zpd0Var.put(Long.valueOf(mqi0.o()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM16037b = this.f3649i1.m16037b();
        zvf0.u("e_interested_user_card", "p_interested_user", new j760[]{vwb.Y("notes_type", this.f3649i1.m16039d() ? "respond_match" : userM16037b.activityUser.action), vwb.Y("card_user_id", ((DbObject) userM16037b).id)});
        Act act = this.f3645g1;
        act.startActivity(PhotoAlbumFeedAct.m5428V1(act, ((DbObject) userM16037b).id, "FROM_MINE_INTEREST_LIST", -1, 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f3643f1.m6055e(this.f3632a);
        this.f3643f1.setMaxLength(this.f3634b.getMeasuredHeight());
        this.f3643f1.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public View m6043q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mhh.m11931b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public final void m6044r() {
        int iY0 = (xdl0.y0() - t100.d(96.0f)) / 4;
        xdl0.C0(this.f3658o, iY0);
        xdl0.C0(this.f3659p, iY0);
        xdl0.C0(this.f3661q, iY0);
        xdl0.C0(this.f3662r, iY0);
        xdl0.D0(iY0, new View[]{this.f3658o});
        xdl0.D0(iY0, new View[]{this.f3659p});
        xdl0.D0(iY0, new View[]{this.f3661q});
        xdl0.D0(iY0, new View[]{this.f3662r});
    }

    /* JADX INFO: renamed from: s */
    public void m6045s(View view, View view2) {
        this.f3651j1.put(view, view2);
    }

    /* JADX INFO: renamed from: t */
    public final String m6046t(User user) {
        String string;
        CharSequence charSequenceP = "";
        if (user.location == null) {
            return "";
        }
        if (!FeedModule.m1140H().hideActiveTime(user)) {
            string = this.f3645g1.getResources().getString(R$string.f333B4, mqi0.G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = this.f3645g1.getResources().getString(R$string.f333B4, mqi0.G(m6016v(user)));
            if (user.isMe()) {
                string = string + this.f3645g1.getResources().getString(R$string.f376J);
            }
        } else {
            string = "";
        }
        if (!FeedModule.m1140H().hideLocation(user)) {
            boolean zEquals = ((DbObject) user).id.equals(((DbObject) FeedModule.m1140H().me_()).id);
            Location location = user.location;
            charSequenceP = zEquals ? i0g0.p(location.distance, true) : i0g0.R(location);
        }
        if (TextUtils.isEmpty(charSequenceP)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceP) : this.f3645g1.getString(R$string.f351E4, charSequenceP, string);
    }

    /* JADX INFO: renamed from: w */
    public final String m6047w(Profile profile) {
        String strM6015u = m6015u(profile);
        return TextUtils.isEmpty(strM6015u) ? profile.hometown : strM6015u;
    }

    /* JADX INFO: renamed from: x */
    public String m6048x(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: y */
    public String m6049y(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return this.f3645g1.getResources().getString(R$string.f608t);
            case "B":
                return this.f3645g1.getResources().getString(R$string.f620v);
            case "O":
                return this.f3645g1.getResources().getString(R$string.f626w);
            case "AB":
                return this.f3645g1.getResources().getString(R$string.f614u);
            case "UNKNOWN":
                return this.f3645g1.getResources().getString(R$string.f632x);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m6050z(x8h x8hVar, View view) {
        FeedModule.m1140H().Rs(this.f3645g1, x8hVar.m16037b(), true, LikeFrom.get("momentPick"), (String) null, true, "featured");
        p6j0.m12913c("e_respond_match", "p_interested_user", j760.a("user_id", ((DbObject) x8hVar.m16037b()).id));
        this.f3647h1.mo5997p0(x8hVar, true);
    }
}
