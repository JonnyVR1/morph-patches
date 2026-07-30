package com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.MatchScData;
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
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VScroll;
import p147v.VText;
import p147v.VText_Tags;
import p149l.a5i;
import p149l.b1a;
import p149l.e1c0;
import p149l.e30;
import p149l.exq;
import p149l.f3c0;
import p149l.ftd0;
import p149l.i0g0;
import p149l.j760;
import p149l.jol;
import p149l.jtk;
import p149l.mah;
import p149l.mhh;
import p149l.mqi0;
import p149l.nkg;
import p149l.osi0;
import p149l.p6j0;
import p149l.qib0;
import p149l.sdh;
import p149l.t100;
import p149l.vsd0;
import p149l.vwb;
import p149l.w9j;
import p149l.x8h;
import p149l.x9j;
import p149l.xdl0;
import p149l.zol;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMyInterestItem extends FrameLayout implements jol<x8h>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VText f42126A;

    /* JADX INFO: renamed from: B */
    public VText f42127B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f42128C;

    /* JADX INFO: renamed from: D */
    public VText f42129D;

    /* JADX INFO: renamed from: E */
    public VText f42130E;

    /* JADX INFO: renamed from: E0 */
    public VText f42131E0;

    /* JADX INFO: renamed from: F */
    public LinearLayout f42132F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f42133F0;

    /* JADX INFO: renamed from: G */
    public VText f42134G;

    /* JADX INFO: renamed from: G0 */
    public VText f42135G0;

    /* JADX INFO: renamed from: H */
    public VText f42136H;

    /* JADX INFO: renamed from: H0 */
    public VText f42137H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f42138I;

    /* JADX INFO: renamed from: I0 */
    public LinearLayout f42139I0;

    /* JADX INFO: renamed from: J */
    public VText f42140J;

    /* JADX INFO: renamed from: J0 */
    public VText f42141J0;

    /* JADX INFO: renamed from: K */
    public VText f42142K;

    /* JADX INFO: renamed from: K0 */
    public VText f42143K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f42144L;

    /* JADX INFO: renamed from: L0 */
    public LinearLayout f42145L0;

    /* JADX INFO: renamed from: M */
    public VText f42146M;

    /* JADX INFO: renamed from: M0 */
    public VText f42147M0;

    /* JADX INFO: renamed from: N */
    public VText f42148N;

    /* JADX INFO: renamed from: N0 */
    public VText f42149N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f42150O;

    /* JADX INFO: renamed from: O0 */
    public VText f42151O0;

    /* JADX INFO: renamed from: P */
    public VText f42152P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f42153P0;

    /* JADX INFO: renamed from: Q */
    public VText f42154Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f42155Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f42156R;

    /* JADX INFO: renamed from: R0 */
    public VText f42157R0;

    /* JADX INFO: renamed from: S */
    public VText f42158S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f42159S0;

    /* JADX INFO: renamed from: T */
    public VText f42160T;

    /* JADX INFO: renamed from: T0 */
    public VText f42161T0;

    /* JADX INFO: renamed from: U */
    public LinearLayout f42162U;

    /* JADX INFO: renamed from: U0 */
    public VText f42163U0;

    /* JADX INFO: renamed from: V */
    public VText f42164V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f42165V0;

    /* JADX INFO: renamed from: W */
    public VText f42166W;

    /* JADX INFO: renamed from: W0 */
    public VText f42167W0;

    /* JADX INFO: renamed from: X0 */
    public VText f42168X0;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f42169Y0;

    /* JADX INFO: renamed from: Z0 */
    public VText f42170Z0;

    /* JADX INFO: renamed from: a */
    public VScroll f42171a;

    /* JADX INFO: renamed from: a1 */
    public VText f42172a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f42173b;

    /* JADX INFO: renamed from: b1 */
    public TextView f42174b1;

    /* JADX INFO: renamed from: c */
    public VDraweeView f42175c;

    /* JADX INFO: renamed from: c1 */
    public VText_Tags f42176c1;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f42177d;

    /* JADX INFO: renamed from: d1 */
    public TextView f42178d1;

    /* JADX INFO: renamed from: e */
    public ImageView f42179e;

    /* JADX INFO: renamed from: e1 */
    public TextView f42180e1;

    /* JADX INFO: renamed from: f */
    public TextView f42181f;

    /* JADX INFO: renamed from: f1 */
    public SmartScrollBar f42182f1;

    /* JADX INFO: renamed from: g */
    public LinearLayout f42183g;

    /* JADX INFO: renamed from: g1 */
    public Act f42184g1;

    /* JADX INFO: renamed from: h */
    public VText f42185h;

    /* JADX INFO: renamed from: h1 */
    public zol f42186h1;

    /* JADX INFO: renamed from: i */
    public VText f42187i;

    /* JADX INFO: renamed from: i1 */
    public x8h f42188i1;

    /* JADX INFO: renamed from: j */
    public ImageView f42189j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f42190j1;

    /* JADX INFO: renamed from: k */
    public ImageView f42191k;

    /* JADX INFO: renamed from: k0 */
    public LinearLayout f42192k0;

    /* JADX INFO: renamed from: k1 */
    public int f42193k1;

    /* JADX INFO: renamed from: l */
    public VText f42194l;

    /* JADX INFO: renamed from: m */
    public TextView f42195m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f42196n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f42197o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f42198p;

    /* JADX INFO: renamed from: p0 */
    public VText f42199p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f42200q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f42201r;

    /* JADX INFO: renamed from: s */
    public VText f42202s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f42203t;

    /* JADX INFO: renamed from: u */
    public VText f42204u;

    /* JADX INFO: renamed from: v */
    public VText f42205v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f42206w;

    /* JADX INFO: renamed from: x */
    public VText f42207x;

    /* JADX INFO: renamed from: y */
    public VText f42208y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f42209z;

    public FeedMyInterestItem(@NonNull Act act, zol zolVar, int i) {
        super(act);
        this.f42190j1 = new HashMap<>();
        this.f42184g1 = act;
        this.f42186h1 = zolVar;
        View viewM64944q = m64944q(LayoutInflater.from(act), this);
        addView(viewM64944q);
        exq.m118693b(viewM64944q, 16.0f);
        setBackgroundColor(0);
        this.f42173b.setOnClickListener(this);
        setBackgroundResource(f3c0.f94442V4);
        this.f42193k1 = i;
    }

    /* JADX INFO: renamed from: F */
    public static SpannableStringBuilder m64907F(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
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
                    sdh sdhVar = new sdh(FeedModule.f38852a, tag.value, -1, -98787, i, 6, i2, 13.0f, true, t100.m186890d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(sdhVar, i3, i4, 33);
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
                    spannableStringBuilder.setSpan(new sdh(FeedModule.f38852a, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, t100.m186890d(3.0f), true, t100.m186890d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m64908T() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: u */
    public static String m64916u(Profile profile) {
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

    /* JADX INFO: renamed from: v */
    public static long m64917v(User user) {
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
    public final /* synthetic */ void m64918A(Boolean bool) {
        Act act = this.f42184g1;
        if (act == null || act.isDestroyed() || this.f42184g1.isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.m165783g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m64919C(x8h x8hVar, View view) {
        FeedModule.m60222H().mo30730Vk(this.f42184g1, mah.m153662b().m153664c(), x8hVar.m207396b().f56011id, null, null, Channel.get(Channel.reply_thanks), new e30() { // from class: l.lhh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128101a.m64918A((Boolean) obj);
            }
        });
        p6j0.m167669c("e_polite_gratitude", "p_interested_user", j760.m140076a("moments_user_id", x8hVar.m207396b().f56011id));
        this.f42186h1.mo64898p0(x8hVar, true);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m64920D(x8h x8hVar, View view) {
        p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.m140076a("card_user_id", x8hVar.m207396b().f56011id));
        this.f42186h1.mo64898p0(x8hVar, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m64921E(x8h x8hVar, View view) {
        p6j0.m167669c("e_interested_user_card_close", "p_interested_user", j760.m140076a("card_user_id", x8hVar.m207396b().f56011id));
        this.f42186h1.mo64888T(x8hVar);
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo64936a(x8h x8hVar) {
        this.f42188i1 = x8hVar;
        super.mo64936a(x8hVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m64923H(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            qib0.f154691G.m102341Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                qib0.f154691G.m102341Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().mo112056c(new vsd0(this.f42184g1.getResources().getDrawable(f3c0.f94530h1), ftd0.f99183g));
            }
        }
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo64939d(final x8h x8hVar) {
        if (x8hVar.m207398d()) {
            this.f42180e1.setText("直接配对");
            this.f42180e1.setOnClickListener(new View.OnClickListener() { // from class: l.ihh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113251a.m64951z(x8hVar, view);
                }
            });
            return;
        }
        if (x8hVar.m207397c()) {
            boolean zM159854K = nkg.m159854K();
            TextView textView = this.f42180e1;
            if (zM159854K) {
                textView.setText("礼貌回谢");
                xdl0.m208329E0(this.f42180e1, new View.OnClickListener() { // from class: l.jhh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f117940a.m64919C(x8hVar, view);
                    }
                });
                return;
            }
            textView.setText("关注");
        } else {
            this.f42180e1.setText("回关");
        }
        this.f42180e1.setOnClickListener(new View.OnClickListener() { // from class: l.khh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123147a.m64920D(x8hVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m64925J(User user) {
        final ArrayList arrayListM200339n;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f42176c1.setVisibility(8);
            this.f42174b1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListM200339n = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(FeedModule.m60222H().me_().profile.tags);
            ArrayList arrayListM200339n2 = vwb.m200339n(hashSet, new b1a(hashSet2));
            arrayListM200339n = vwb.m200339n(hashSet, new w9j() { // from class: l.fhh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListM200339n2;
        }
        this.f42176c1.setTags(new x9j() { // from class: l.ghh
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return FeedMyInterestItem.m64907F(arrayList, arrayListM200339n, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), t100.m186890d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m64926K(User user) {
        if (user == null) {
            return;
        }
        this.f42185h.setText(user.name);
        this.f42185h.setTypeface(Typeface.DEFAULT_BOLD);
        this.f42187i.setText(String.valueOf(user.age));
        xdl0.m208344M(this.f42187i, !user.isHideAgeFromSVipWithOutMe());
        m64933R(user, this.f42194l);
        xdl0.m208344M(this.f42191k, false);
        xdl0.m208344M(this.f42189j, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            xdl0.m208344M(this.f42187i, false);
        }
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo64941f(final x8h x8hVar) {
        boolean zM207398d = x8hVar.m207398d();
        TextView textView = this.f42178d1;
        if (zM207398d) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f42178d1.setOnClickListener(new View.OnClickListener() { // from class: l.hhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107720a.m64921E(x8hVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m64928M(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f42142K.setText(R$string.f38896F4);
            this.f42148N.setText(profile.studies.major);
            this.f42148N.setHint(R$string.f38878C4);
            this.f42154Q.setVisibility(8);
        } else {
            this.f42154Q.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f42142K.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f42142K.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f42142K;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f42142K.setHint("添加职业信息");
            this.f42154Q.setText(profile.work.company);
        }
        String str = profile.studies.school;
        if (NullChecker.m81303a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            str = profile.studies.school + "(" + this.f42184g1.getString(R$string.f39177y) + ")";
        }
        this.f42160T.setText(str);
        m64935U(this.f42160T);
        m64934S(this.f42130E, 8);
        m64934S(this.f42136H, 8);
        if (!m64908T() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.m208344M(this.f42127B, false);
        } else {
            xdl0.m208345M0(this.f42127B, true);
            this.f42127B.setText(m64950y(profile.extensions.physical.bloodType.get(0)));
        }
        this.f42131E0.setText(m64948w(profile));
        this.f42143K0.setText(profile.hangouts);
        m64935U(this.f42142K);
        m64935U(this.f42148N);
        m64935U(this.f42154Q);
        m64935U(this.f42131E0);
        m64935U(this.f42143K0);
        m64934S(this.f42148N, 8);
        String strM133869j0 = i0g0.m133869j0(profile.zodiac);
        if (TextUtils.isEmpty(strM133869j0) || m64908T()) {
            this.f42206w.setVisibility(8);
        } else {
            this.f42208y.setText(strM133869j0);
            this.f42206w.setVisibility(0);
            this.f42202s.setVisibility(0);
        }
        String str2 = FeedModule.m60222H().getUserById(user.f56011id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        LinearLayout linearLayout = this.f42145L0;
        if (zIsEmpty2) {
            m64934S(linearLayout, 8);
        } else {
            m64934S(linearLayout, 0);
            this.f42149N0.setText(str2);
        }
        this.f42202s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f42140J.setText(this.f42184g1.getResources().getString(R$string.f38884D4));
        if (!m64908T() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        xdl0.m208345M0(this.f42209z, true);
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo64940e(x8h x8hVar) {
        m64933R(x8hVar.m207396b(), this.f42194l);
        m64926K(x8hVar.m207396b());
        qib0.f154691G.m102331L0(this.f42175c, x8hVar.m207396b().m60124fp().profileBig().formatted());
        RoundingParams roundingParamsM8248b = RoundingParams.m8248b(t100.m186890d(16.0f), t100.m186890d(16.0f), 0.0f, 0.0f);
        roundingParamsM8248b.m8268v(false);
        this.f42175c.getHierarchy().m112078y(0);
        this.f42175c.getHierarchy().m112053H(roundingParamsM8248b);
        if (x8hVar.m207398d()) {
            this.f42179e.setImageResource(f3c0.f94432U1);
            this.f42181f.setText(String.format("%s通过精选动态喜欢了你", m64949x(x8hVar.m207396b())));
            return;
        }
        boolean zM207397c = x8hVar.m207397c();
        ImageView imageView = this.f42179e;
        if (zM207397c) {
            imageView.setImageResource(f3c0.f94432U1);
            this.f42181f.setText(String.format("%s点赞了你", m64949x(x8hVar.m207396b())));
        } else {
            imageView.setImageResource(f3c0.f94425T1);
            this.f42181f.setText(String.format("%s关注了你", m64949x(x8hVar.m207396b())));
        }
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo64937b(x8h x8hVar) {
        m64946s(this.f42127B, this.f42209z);
        m64946s(this.f42130E, this.f42128C);
        m64946s(this.f42136H, this.f42132F);
        m64946s(this.f42142K, this.f42138I);
        m64946s(this.f42148N, this.f42144L);
        m64946s(this.f42154Q, this.f42150O);
        m64946s(this.f42160T, this.f42156R);
        m64946s(this.f42131E0, this.f42192k0);
        m64946s(this.f42143K0, this.f42139I0);
        m64946s(this.f42137H0, this.f42133F0);
        m64946s(this.f42166W, this.f42162U);
        VText vText = this.f42151O0;
        m64946s(vText, vText);
        m64946s(this.f42157R0, this.f42153P0);
        m64946s(this.f42163U0, this.f42159S0);
        m64946s(this.f42168X0, this.f42165V0);
        m64946s(this.f42172a1, this.f42169Y0);
        m64928M(x8hVar.m207396b());
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo64942g(x8h x8hVar) {
        m64925J(x8hVar.m207396b());
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo64938c(x8h x8hVar) {
        List<Moment> listM207395a = x8hVar.m207395a();
        if (vwb.m200296J(listM207395a)) {
            this.f42195m.setVisibility(8);
            this.f42196n.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM207395a.size() && i != 4; i2++) {
            Moment moment = listM207395a.get(i2);
            if (moment.media.size() != 0 && ((moment.media.get(0) instanceof Picture) || (moment.media.get(0) instanceof Video))) {
                for (Media media : moment.media) {
                    if (i == 0) {
                        m64923H(media, this.f42197o);
                    } else if (i == 1) {
                        m64923H(media, this.f42198p);
                    } else if (i == 2) {
                        m64923H(media, this.f42200q);
                    } else if (i == 3) {
                        m64923H(media, this.f42201r);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m64945r();
        } else {
            this.f42195m.setVisibility(8);
            this.f42196n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m64933R(User user, VText vText) {
        String strM64947t = m64947t(user);
        if (NullChecker.m81304b(user.profile) && NullChecker.m81304b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m81303a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM64947t)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM64947t);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM64947t);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM64947t);
                return;
            }
        }
        if (TextUtils.isEmpty(strM64947t)) {
            m64934S(vText, 8);
        } else {
            vText.setText(strM64947t);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m64934S(View view, int i) {
        View view2 = this.f42190j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m64935U(VText vText) {
        xdl0.m208347N0(vText);
        m64934S(vText, vText.getVisibility());
    }

    public int getPosition() {
        return this.f42193k1;
    }

    @Override // p149l.jol
    /* JADX INFO: renamed from: h */
    public void mo64943h() {
        if (nkg.m159854K() && this.f42188i1.m207397c()) {
            if (a5i.m95036l(FeedModule.f38855d.f193001L.get().longValue(), mqi0.m155944o())) {
                return;
            }
            C4345a c4345a = new C4345a(this.f42184g1);
            c4345a.m20849D("点击礼貌回谢，表达你的感谢").m20871l(t100.m186890d(9.0f)).m20870k(this.f42184g1.getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20882x(-t100.m186890d(12.0f)).m20879u(t100.m186890d(40.0f)).m20861b(3000L).m20858M(true).m20864e(false).m20873o(jtk.f119616C, t100.m186890d(10.0f)).m20875q(C4345a.f15683Q | C4345a.f15682P);
            C4348d.m20896l().m20909u(c4345a, this.f42180e1, "SHARE_TIP_MYINTEREST");
            FeedModule.f38855d.f193001L.put(Long.valueOf(mqi0.m155944o()));
            return;
        }
        zpd0 zpd0Var = new zpd0("show_guide_time_interest_people" + FeedModule.m60221F().userId(), 0L);
        if (a5i.m95036l(zpd0Var.get().longValue(), mqi0.m155944o())) {
            return;
        }
        C4345a c4345a2 = new C4345a(this.f42184g1);
        String strM64949x = m64949x(this.f42188i1.m207396b());
        c4345a2.m20849D("他们都对你很感兴趣，对" + strM64949x + "感兴趣就关注" + strM64949x + "吧").m20871l(t100.m186890d(9.0f)).m20870k(this.f42184g1.getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20882x(-t100.m186890d(12.0f)).m20879u(t100.m186890d(40.0f)).m20861b(3000L).m20858M(true).m20864e(false).m20873o(jtk.f119616C, t100.m186890d(10.0f)).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a2, this.f42180e1, "SHARE_TIP_MYINTEREST");
        zpd0Var.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM207396b = this.f42188i1.m207396b();
        zvf0.m220399u("e_interested_user_card", "p_interested_user", vwb.m200311Y("notes_type", this.f42188i1.m207398d() ? "respond_match" : userM207396b.activityUser.action), vwb.m200311Y("card_user_id", userM207396b.f56011id));
        Act act = this.f42184g1;
        act.startActivity(PhotoAlbumFeedAct.m64355V1(act, userM207396b.f56011id, "FROM_MINE_INTEREST_LIST", -1, 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f42182f1.m64956e(this.f42171a);
        this.f42182f1.setMaxLength(this.f42173b.getMeasuredHeight());
        this.f42182f1.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public View m64944q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mhh.m154621b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public final void m64945r() {
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(96.0f)) / 4;
        xdl0.m208325C0(this.f42197o, iM208412y0);
        xdl0.m208325C0(this.f42198p, iM208412y0);
        xdl0.m208325C0(this.f42200q, iM208412y0);
        xdl0.m208325C0(this.f42201r, iM208412y0);
        xdl0.m208327D0(iM208412y0, this.f42197o);
        xdl0.m208327D0(iM208412y0, this.f42198p);
        xdl0.m208327D0(iM208412y0, this.f42200q);
        xdl0.m208327D0(iM208412y0, this.f42201r);
    }

    /* JADX INFO: renamed from: s */
    public void m64946s(View view, View view2) {
        this.f42190j1.put(view, view2);
    }

    /* JADX INFO: renamed from: t */
    public final String m64947t(User user) {
        String string;
        CharSequence charSequenceM133876p = "";
        if (user.location == null) {
            return "";
        }
        if (!FeedModule.m60222H().hideActiveTime(user)) {
            string = this.f42184g1.getResources().getString(R$string.f38872B4, mqi0.m155932G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = this.f42184g1.getResources().getString(R$string.f38872B4, mqi0.m155932G(m64917v(user)));
            if (user.isMe()) {
                string = string + this.f42184g1.getResources().getString(R$string.f38915J);
            }
        } else {
            string = "";
        }
        if (!FeedModule.m60222H().hideLocation(user)) {
            boolean zEquals = user.f56011id.equals(FeedModule.m60222H().me_().f56011id);
            Location location = user.location;
            charSequenceM133876p = zEquals ? i0g0.m133876p(location.distance, true) : i0g0.m133851R(location);
        }
        if (TextUtils.isEmpty(charSequenceM133876p)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceM133876p) : this.f42184g1.getString(R$string.f38890E4, charSequenceM133876p, string);
    }

    /* JADX INFO: renamed from: w */
    public final String m64948w(Profile profile) {
        String strM64916u = m64916u(profile);
        return TextUtils.isEmpty(strM64916u) ? profile.hometown : strM64916u;
    }

    /* JADX INFO: renamed from: x */
    public String m64949x(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: y */
    public String m64950y(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return this.f42184g1.getResources().getString(R$string.f39147t);
            case "B":
                return this.f42184g1.getResources().getString(R$string.f39159v);
            case "O":
                return this.f42184g1.getResources().getString(R$string.f39165w);
            case "AB":
                return this.f42184g1.getResources().getString(R$string.f39153u);
            case "UNKNOWN":
                return this.f42184g1.getResources().getString(R$string.f39171x);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m64951z(x8h x8hVar, View view) {
        FeedModule.m60222H().mo30725Rs(this.f42184g1, x8hVar.m207396b(), true, LikeFrom.get("momentPick"), null, true, "featured");
        p6j0.m167669c("e_respond_match", "p_interested_user", j760.m140076a("user_id", x8hVar.m207396b().f56011id));
        this.f42186h1.mo64898p0(x8hVar, true);
    }
}
