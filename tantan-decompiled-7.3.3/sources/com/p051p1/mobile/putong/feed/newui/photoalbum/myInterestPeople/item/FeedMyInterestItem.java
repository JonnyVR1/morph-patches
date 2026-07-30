package com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.MatchScData;
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
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VScroll;
import p151v.VText;
import p151v.VText_Tags;
import p153l.bch;
import p153l.bjh;
import p153l.bnl0;
import p153l.byd0;
import p153l.cmg;
import p153l.ezq;
import p153l.h1e0;
import p153l.hfh;
import p153l.i4g0;
import p153l.jyb;
import p153l.k9c0;
import p153l.lbc0;
import p153l.lrl;
import p153l.m2a;
import p153l.mah;
import p153l.p6i;
import p153l.pf60;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.rcj;
import p153l.tfj0;
import p153l.uqb0;
import p153l.uql;
import p153l.x0e0;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMyInterestItem extends FrameLayout implements uql<mah>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VText f42974A;

    /* JADX INFO: renamed from: B */
    public VText f42975B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f42976C;

    /* JADX INFO: renamed from: D */
    public VText f42977D;

    /* JADX INFO: renamed from: E */
    public VText f42978E;

    /* JADX INFO: renamed from: E0 */
    public VText f42979E0;

    /* JADX INFO: renamed from: F */
    public LinearLayout f42980F;

    /* JADX INFO: renamed from: F0 */
    public LinearLayout f42981F0;

    /* JADX INFO: renamed from: G */
    public VText f42982G;

    /* JADX INFO: renamed from: G0 */
    public VText f42983G0;

    /* JADX INFO: renamed from: H */
    public VText f42984H;

    /* JADX INFO: renamed from: H0 */
    public VText f42985H0;

    /* JADX INFO: renamed from: I */
    public LinearLayout f42986I;

    /* JADX INFO: renamed from: I0 */
    public LinearLayout f42987I0;

    /* JADX INFO: renamed from: J */
    public VText f42988J;

    /* JADX INFO: renamed from: J0 */
    public VText f42989J0;

    /* JADX INFO: renamed from: K */
    public VText f42990K;

    /* JADX INFO: renamed from: K0 */
    public VText f42991K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f42992L;

    /* JADX INFO: renamed from: L0 */
    public LinearLayout f42993L0;

    /* JADX INFO: renamed from: M */
    public VText f42994M;

    /* JADX INFO: renamed from: M0 */
    public VText f42995M0;

    /* JADX INFO: renamed from: N */
    public VText f42996N;

    /* JADX INFO: renamed from: N0 */
    public VText f42997N0;

    /* JADX INFO: renamed from: O */
    public LinearLayout f42998O;

    /* JADX INFO: renamed from: O0 */
    public VText f42999O0;

    /* JADX INFO: renamed from: P */
    public VText f43000P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f43001P0;

    /* JADX INFO: renamed from: Q */
    public VText f43002Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f43003Q0;

    /* JADX INFO: renamed from: R */
    public LinearLayout f43004R;

    /* JADX INFO: renamed from: R0 */
    public VText f43005R0;

    /* JADX INFO: renamed from: S */
    public VText f43006S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f43007S0;

    /* JADX INFO: renamed from: T */
    public VText f43008T;

    /* JADX INFO: renamed from: T0 */
    public VText f43009T0;

    /* JADX INFO: renamed from: U */
    public LinearLayout f43010U;

    /* JADX INFO: renamed from: U0 */
    public VText f43011U0;

    /* JADX INFO: renamed from: V */
    public VText f43012V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f43013V0;

    /* JADX INFO: renamed from: W */
    public VText f43014W;

    /* JADX INFO: renamed from: W0 */
    public VText f43015W0;

    /* JADX INFO: renamed from: X0 */
    public VText f43016X0;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f43017Y0;

    /* JADX INFO: renamed from: Z0 */
    public VText f43018Z0;

    /* JADX INFO: renamed from: a */
    public VScroll f43019a;

    /* JADX INFO: renamed from: a1 */
    public VText f43020a1;

    /* JADX INFO: renamed from: b */
    public LinearLayout f43021b;

    /* JADX INFO: renamed from: b1 */
    public TextView f43022b1;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43023c;

    /* JADX INFO: renamed from: c1 */
    public VText_Tags f43024c1;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f43025d;

    /* JADX INFO: renamed from: d1 */
    public TextView f43026d1;

    /* JADX INFO: renamed from: e */
    public ImageView f43027e;

    /* JADX INFO: renamed from: e1 */
    public TextView f43028e1;

    /* JADX INFO: renamed from: f */
    public TextView f43029f;

    /* JADX INFO: renamed from: f1 */
    public SmartScrollBar f43030f1;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43031g;

    /* JADX INFO: renamed from: g1 */
    public Act f43032g1;

    /* JADX INFO: renamed from: h */
    public VText f43033h;

    /* JADX INFO: renamed from: h1 */
    public lrl f43034h1;

    /* JADX INFO: renamed from: i */
    public VText f43035i;

    /* JADX INFO: renamed from: i1 */
    public mah f43036i1;

    /* JADX INFO: renamed from: j */
    public ImageView f43037j;

    /* JADX INFO: renamed from: j1 */
    public final HashMap<View, View> f43038j1;

    /* JADX INFO: renamed from: k */
    public ImageView f43039k;

    /* JADX INFO: renamed from: k0 */
    public LinearLayout f43040k0;

    /* JADX INFO: renamed from: k1 */
    public int f43041k1;

    /* JADX INFO: renamed from: l */
    public VText f43042l;

    /* JADX INFO: renamed from: m */
    public TextView f43043m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f43044n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f43045o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f43046p;

    /* JADX INFO: renamed from: p0 */
    public VText f43047p0;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43048q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f43049r;

    /* JADX INFO: renamed from: s */
    public VText f43050s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f43051t;

    /* JADX INFO: renamed from: u */
    public VText f43052u;

    /* JADX INFO: renamed from: v */
    public VText f43053v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f43054w;

    /* JADX INFO: renamed from: x */
    public VText f43055x;

    /* JADX INFO: renamed from: y */
    public VText f43056y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f43057z;

    public FeedMyInterestItem(@NonNull Act act, lrl lrlVar, int i) {
        super(act);
        this.f43038j1 = new HashMap<>();
        this.f43032g1 = act;
        this.f43034h1 = lrlVar;
        View viewM66127q = m66127q(LayoutInflater.from(act), this);
        addView(viewM66127q);
        ezq.m123397b(viewM66127q, 16.0f);
        setBackgroundColor(0);
        this.f43021b.setOnClickListener(this);
        setBackgroundResource(lbc0.f130960V4);
        this.f43041k1 = i;
    }

    /* JADX INFO: renamed from: F */
    public static SpannableStringBuilder m66090F(List<Tag> list, List<Tag> list2, int i, boolean z, int i2) {
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
                    hfh hfhVar = new hfh(FeedModule.f39700a, tag.value, -1, -98787, i, 6, i2, 13.0f, true, qa00.m175859d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(hfhVar, i3, i4, 33);
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
                    spannableStringBuilder.setSpan(new hfh(FeedModule.f39700a, tag2.value, -436207616, 16777215, i, 6, i2, 13.0f, 117440512, qa00.m175859d(3.0f), true, qa00.m175859d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m66091T() {
        Locale locale = Locale.getDefault();
        return (locale != null && "ja".equals(locale.getLanguage())) || (locale != null && "ko".equals(locale.getLanguage()));
    }

    /* JADX INFO: renamed from: u */
    public static String m66099u(Profile profile) {
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

    /* JADX INFO: renamed from: v */
    public static long m66100v(User user) {
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
    public final /* synthetic */ void m66101A(Boolean bool) {
        Act act = this.f43032g1;
        if (act == null || act.isDestroyed() || this.f43032g1.isFinishing() || !bool.booleanValue()) {
            return;
        }
        r1j0.m179420g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m66102C(mah mahVar, View view) {
        FeedModule.m61406H().mo31733Vk(this.f43032g1, bch.m103508b().m103510c(), mahVar.m157649b().f56859id, null, null, Channel.get(Channel.reply_thanks), new y20() { // from class: l.ajh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71823a.m66101A((Boolean) obj);
            }
        });
        tfj0.m190940c("e_polite_gratitude", "p_interested_user", pf60.m172085a("moments_user_id", mahVar.m157649b().f56859id));
        this.f43034h1.mo66082q0(mahVar, true);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m66103D(mah mahVar, View view) {
        tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, "p_interested_user", pf60.m172085a("card_user_id", mahVar.m157649b().f56859id));
        this.f43034h1.mo66082q0(mahVar, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m66104E(mah mahVar, View view) {
        tfj0.m190940c("e_interested_user_card_close", "p_interested_user", pf60.m172085a("card_user_id", mahVar.m157649b().f56859id));
        this.f43034h1.mo66072U(mahVar);
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo66119a(mah mahVar) {
        this.f43036i1 = mahVar;
        super.mo66119a(mahVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m66106H(Media media, VDraweeView vDraweeView) {
        if (media instanceof Picture) {
            uqb0.f180374G.m127125Q0(vDraweeView, ((Picture) media).momentPictureSmall());
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                uqb0.f180374G.m127125Q0(vDraweeView, video.cover.momentPictureSmall());
                vDraweeView.getHierarchy().mo118277c(new x0e0(this.f43032g1.getResources().getDrawable(lbc0.f131048h1), h1e0.f107450g));
            }
        }
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo66122d(final mah mahVar) {
        if (mahVar.m157651d()) {
            this.f43028e1.setText("直接配对");
            this.f43028e1.setOnClickListener(new View.OnClickListener() { // from class: l.xih
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194464a.m66134z(mahVar, view);
                }
            });
            return;
        }
        if (mahVar.m157650c()) {
            boolean zM111183K = cmg.m111183K();
            TextView textView = this.f43028e1;
            if (zM111183K) {
                textView.setText("礼貌回谢");
                bnl0.m105509E0(this.f43028e1, new View.OnClickListener() { // from class: l.yih
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f200085a.m66102C(mahVar, view);
                    }
                });
                return;
            }
            textView.setText("关注");
        } else {
            this.f43028e1.setText("回关");
        }
        this.f43028e1.setOnClickListener(new View.OnClickListener() { // from class: l.zih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204562a.m66103D(mahVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m66108J(User user) {
        final ArrayList arrayListM147522n;
        final ArrayList arrayList;
        HashSet hashSet = new HashSet(user.profile.tags);
        if (hashSet.isEmpty()) {
            this.f43024c1.setVisibility(8);
            this.f43022b1.setVisibility(8);
            return;
        }
        if (user.isMe()) {
            arrayListM147522n = new ArrayList(hashSet);
            arrayList = new ArrayList();
        } else {
            final HashSet hashSet2 = new HashSet(FeedModule.m61406H().me_().profile.tags);
            ArrayList arrayListM147522n2 = jyb.m147522n(hashSet, new m2a(hashSet2));
            arrayListM147522n = jyb.m147522n(hashSet, new qcj() { // from class: l.uih
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet2.contains((Tag) obj));
                }
            });
            arrayList = arrayListM147522n2;
        }
        this.f43024c1.setTags(new rcj() { // from class: l.vih
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return FeedMyInterestItem.m66090F(arrayList, arrayListM147522n, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), qa00.m175859d(16.0f));
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m66109K(User user) {
        if (user == null) {
            return;
        }
        this.f43033h.setText(user.name);
        this.f43033h.setTypeface(Typeface.DEFAULT_BOLD);
        this.f43035i.setText(String.valueOf(user.age));
        bnl0.m105524M(this.f43035i, !user.isHideAgeFromSVipWithOutMe());
        m66116R(user, this.f43042l);
        bnl0.m105524M(this.f43039k, false);
        bnl0.m105524M(this.f43037j, false);
        if (user.isMe() && user.isHideAgeFromSVip()) {
            bnl0.m105524M(this.f43035i, false);
        }
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo66124f(final mah mahVar) {
        boolean zM157651d = mahVar.m157651d();
        TextView textView = this.f43026d1;
        if (zM157651d) {
            textView.setText("错过她");
        } else {
            textView.setText("不感兴趣");
        }
        this.f43026d1.setOnClickListener(new View.OnClickListener() { // from class: l.wih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189357a.m66104E(mahVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m66111M(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            this.f42990K.setText(R$string.f39744F4);
            this.f42996N.setText(profile.studies.major);
            this.f42996N.setHint(R$string.f39726C4);
            this.f43002Q.setVisibility(8);
        } else {
            this.f43002Q.setVisibility(0);
            if (TextUtils.isEmpty(profile.work.industry)) {
                this.f42990K.setText(profile.work.department);
            } else if ((TextUtils.equals(profile.work.industry, "其他") || TextUtils.equals(profile.work.industry, "其它")) && !TextUtils.isEmpty(profile.work.department) && (TextUtils.equals(profile.work.department, "其他") || TextUtils.equals(profile.work.department, "其它"))) {
                this.f42990K.setText("其他");
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.work.department);
                VText vText = this.f42990K;
                if (zIsEmpty) {
                    vText.setText(profile.work.industry);
                } else {
                    vText.setText(profile.work.industry + "·" + profile.work.department);
                }
            }
            this.f42990K.setHint("添加职业信息");
            this.f43002Q.setText(profile.work.company);
        }
        String str = profile.studies.school;
        if (NullChecker.m82486a(user.settings) && user.settings.hideSchoolName() && user.isMe()) {
            str = profile.studies.school + "(" + this.f43032g1.getString(R$string.f40025y) + ")";
        }
        this.f43008T.setText(str);
        m66118U(this.f43008T);
        m66117S(this.f42978E, 8);
        m66117S(this.f42984H, 8);
        if (!m66091T() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            bnl0.m105524M(this.f42975B, false);
        } else {
            bnl0.m105525M0(this.f42975B, true);
            this.f42975B.setText(m66133y(profile.extensions.physical.bloodType.get(0)));
        }
        this.f42979E0.setText(m66131w(profile));
        this.f42991K0.setText(profile.hangouts);
        m66118U(this.f42990K);
        m66118U(this.f42996N);
        m66118U(this.f43002Q);
        m66118U(this.f42979E0);
        m66118U(this.f42991K0);
        m66117S(this.f42996N, 8);
        String strM175804j0 = q8g0.m175804j0(profile.zodiac);
        if (TextUtils.isEmpty(strM175804j0) || m66091T()) {
            this.f43054w.setVisibility(8);
        } else {
            this.f43056y.setText(strM175804j0);
            this.f43054w.setVisibility(0);
            this.f43050s.setVisibility(0);
        }
        String str2 = FeedModule.m61406H().getUserById(user.f56859id).description;
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        LinearLayout linearLayout = this.f42993L0;
        if (zIsEmpty2) {
            m66117S(linearLayout, 8);
        } else {
            m66117S(linearLayout, 0);
            this.f42997N0.setText(str2);
        }
        this.f43050s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f42988J.setText(this.f43032g1.getResources().getString(R$string.f39732D4));
        if (!m66091T() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return;
        }
        bnl0.m105525M0(this.f43057z, true);
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo66123e(mah mahVar) {
        m66116R(mahVar.m157649b(), this.f43042l);
        m66109K(mahVar.m157649b());
        uqb0.f180374G.m127115L0(this.f43023c, mahVar.m157649b().m61308fp().profileBig().formatted());
        RoundingParams roundingParamsM8302b = RoundingParams.m8302b(qa00.m175859d(16.0f), qa00.m175859d(16.0f), 0.0f, 0.0f);
        roundingParamsM8302b.m8322v(false);
        this.f43023c.getHierarchy().m207064y(0);
        this.f43023c.getHierarchy().m207045H(roundingParamsM8302b);
        if (mahVar.m157651d()) {
            this.f43027e.setImageResource(lbc0.f130950U1);
            this.f43029f.setText(String.format("%s通过精选动态喜欢了你", m66132x(mahVar.m157649b())));
            return;
        }
        boolean zM157650c = mahVar.m157650c();
        ImageView imageView = this.f43027e;
        if (zM157650c) {
            imageView.setImageResource(lbc0.f130950U1);
            this.f43029f.setText(String.format("%s点赞了你", m66132x(mahVar.m157649b())));
        } else {
            imageView.setImageResource(lbc0.f130943T1);
            this.f43029f.setText(String.format("%s关注了你", m66132x(mahVar.m157649b())));
        }
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo66120b(mah mahVar) {
        m66129s(this.f42975B, this.f43057z);
        m66129s(this.f42978E, this.f42976C);
        m66129s(this.f42984H, this.f42980F);
        m66129s(this.f42990K, this.f42986I);
        m66129s(this.f42996N, this.f42992L);
        m66129s(this.f43002Q, this.f42998O);
        m66129s(this.f43008T, this.f43004R);
        m66129s(this.f42979E0, this.f43040k0);
        m66129s(this.f42991K0, this.f42987I0);
        m66129s(this.f42985H0, this.f42981F0);
        m66129s(this.f43014W, this.f43010U);
        VText vText = this.f42999O0;
        m66129s(vText, vText);
        m66129s(this.f43005R0, this.f43001P0);
        m66129s(this.f43011U0, this.f43007S0);
        m66129s(this.f43016X0, this.f43013V0);
        m66129s(this.f43020a1, this.f43017Y0);
        m66111M(mahVar.m157649b());
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo66125g(mah mahVar) {
        m66108J(mahVar.m157649b());
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo66121c(mah mahVar) {
        List<Moment> listM157648a = mahVar.m157648a();
        if (jyb.m147479J(listM157648a)) {
            this.f43043m.setVisibility(8);
            this.f43044n.setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM157648a.size() && i != 4; i2++) {
            Moment moment = listM157648a.get(i2);
            if (moment.media.size() != 0 && ((moment.media.get(0) instanceof Picture) || (moment.media.get(0) instanceof Video))) {
                for (Media media : moment.media) {
                    if (i == 0) {
                        m66106H(media, this.f43045o);
                    } else if (i == 1) {
                        m66106H(media, this.f43046p);
                    } else if (i == 2) {
                        m66106H(media, this.f43048q);
                    } else if (i == 3) {
                        m66106H(media, this.f43049r);
                    }
                    i++;
                    if (i == 4) {
                        break;
                    }
                }
            }
        }
        if (i != 0) {
            m66128r();
        } else {
            this.f43043m.setVisibility(8);
            this.f43044n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m66116R(User user, VText vText) {
        String strM66130t = m66130t(user);
        if (NullChecker.m82487b(user.profile) && NullChecker.m82487b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (user.isMe() && NullChecker.m82486a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM66130t)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM66130t);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM66130t);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + " · " + strM66130t);
                return;
            }
        }
        if (TextUtils.isEmpty(strM66130t)) {
            m66117S(vText, 8);
        } else {
            vText.setText(strM66130t);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m66117S(View view, int i) {
        View view2 = this.f43038j1.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m66118U(VText vText) {
        bnl0.m105527N0(vText);
        m66117S(vText, vText.getVisibility());
    }

    public int getPosition() {
        return this.f43041k1;
    }

    @Override // p153l.uql
    /* JADX INFO: renamed from: h */
    public void mo66126h() {
        if (cmg.m111183K() && this.f43036i1.m157650c()) {
            if (p6i.m170903l(FeedModule.f39703d.f121311L.get().longValue(), pzi0.m174454o())) {
                return;
            }
            C4496a c4496a = new C4496a(this.f43032g1);
            c4496a.m21848D("点击礼貌回谢，表达你的感谢").m21870l(qa00.m175859d(9.0f)).m21869k(this.f43032g1.getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21881x(-qa00.m175859d(12.0f)).m21878u(qa00.m175859d(40.0f)).m21860b(3000L).m21857M(true).m21863e(false).m21872o(zvk.f206226C, qa00.m175859d(10.0f)).m21874q(C4496a.f16402Q | C4496a.f16401P);
            C4499d.m21895l().m21908u(c4496a, this.f43028e1, "SHARE_TIP_MYINTEREST");
            FeedModule.f39703d.f121311L.put(Long.valueOf(pzi0.m174454o()));
            return;
        }
        byd0 byd0Var = new byd0("show_guide_time_interest_people" + FeedModule.m61405F().userId(), 0L);
        if (p6i.m170903l(byd0Var.get().longValue(), pzi0.m174454o())) {
            return;
        }
        C4496a c4496a2 = new C4496a(this.f43032g1);
        String strM66132x = m66132x(this.f43036i1.m157649b());
        c4496a2.m21848D("他们都对你很感兴趣，对" + strM66132x + "感兴趣就关注" + strM66132x + "吧").m21870l(qa00.m175859d(9.0f)).m21869k(this.f43032g1.getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21881x(-qa00.m175859d(12.0f)).m21878u(qa00.m175859d(40.0f)).m21860b(3000L).m21857M(true).m21863e(false).m21872o(zvk.f206226C, qa00.m175859d(10.0f)).m21874q(C4496a.f16402Q | C4496a.f16401P);
        C4499d.m21895l().m21908u(c4496a2, this.f43028e1, "SHARE_TIP_MYINTEREST");
        byd0Var.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        User userM157649b = this.f43036i1.m157649b();
        i4g0.m138523u("e_interested_user_card", "p_interested_user", jyb.m147494Y("notes_type", this.f43036i1.m157651d() ? "respond_match" : userM157649b.activityUser.action), jyb.m147494Y("card_user_id", userM157649b.f56859id));
        Act act = this.f43032g1;
        act.startActivity(PhotoAlbumFeedAct.m65538X1(act, userM157649b.f56859id, "FROM_MINE_INTEREST_LIST", -1, 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43030f1.m66139e(this.f43019a);
        this.f43030f1.setMaxLength(this.f43021b.getMeasuredHeight());
        this.f43030f1.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public View m66127q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bjh.m104625b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public final void m66128r() {
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(96.0f)) / 4;
        bnl0.m105505C0(this.f43045o, iM105592y0);
        bnl0.m105505C0(this.f43046p, iM105592y0);
        bnl0.m105505C0(this.f43048q, iM105592y0);
        bnl0.m105505C0(this.f43049r, iM105592y0);
        bnl0.m105507D0(iM105592y0, this.f43045o);
        bnl0.m105507D0(iM105592y0, this.f43046p);
        bnl0.m105507D0(iM105592y0, this.f43048q);
        bnl0.m105507D0(iM105592y0, this.f43049r);
    }

    /* JADX INFO: renamed from: s */
    public void m66129s(View view, View view2) {
        this.f43038j1.put(view, view2);
    }

    /* JADX INFO: renamed from: t */
    public final String m66130t(User user) {
        String string;
        CharSequence charSequenceM175811p = "";
        if (user.location == null) {
            return "";
        }
        if (!FeedModule.m61406H().hideActiveTime(user)) {
            string = this.f43032g1.getResources().getString(R$string.f39720B4, pzi0.m174442G(user.location.updatedTime));
        } else if (user.isHideActiveFromSVip()) {
            string = this.f43032g1.getResources().getString(R$string.f39720B4, pzi0.m174442G(m66100v(user)));
            if (user.isMe()) {
                string = string + this.f43032g1.getResources().getString(R$string.f39763J);
            }
        } else {
            string = "";
        }
        if (!FeedModule.m61406H().hideLocation(user)) {
            boolean zEquals = user.f56859id.equals(FeedModule.m61406H().me_().f56859id);
            Location location = user.location;
            charSequenceM175811p = zEquals ? q8g0.m175811p(location.distance, true) : q8g0.m175786R(location);
        }
        if (TextUtils.isEmpty(charSequenceM175811p)) {
            return string;
        }
        return TextUtils.isEmpty(string) ? String.valueOf(charSequenceM175811p) : this.f43032g1.getString(R$string.f39738E4, charSequenceM175811p, string);
    }

    /* JADX INFO: renamed from: w */
    public final String m66131w(Profile profile) {
        String strM66099u = m66099u(profile);
        return TextUtils.isEmpty(strM66099u) ? profile.hometown : strM66099u;
    }

    /* JADX INFO: renamed from: x */
    public String m66132x(User user) {
        return user.isFemale() ? "她" : "他";
    }

    /* JADX INFO: renamed from: y */
    public String m66133y(BloodType bloodType) {
        String string = bloodType.toString();
        string.getClass();
        switch (string) {
            case "A":
                return this.f43032g1.getResources().getString(R$string.f39995t);
            case "B":
                return this.f43032g1.getResources().getString(R$string.f40007v);
            case "O":
                return this.f43032g1.getResources().getString(R$string.f40013w);
            case "AB":
                return this.f43032g1.getResources().getString(R$string.f40001u);
            case "UNKNOWN":
                return this.f43032g1.getResources().getString(R$string.f40019x);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66134z(mah mahVar, View view) {
        FeedModule.m61406H().mo31728Rs(this.f43032g1, mahVar.m157649b(), true, LikeFrom.get("momentPick"), null, true, "featured");
        tfj0.m190940c("e_respond_match", "p_interested_user", pf60.m172085a("user_id", mahVar.m157649b().f56859id));
        this.f43034h1.mo66082q0(mahVar, true);
    }
}
