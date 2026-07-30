package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedPostTitleTagConfig;
import com.p000p1.mobile.putong.feed.data.GroupIdBox;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p000p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p000p1.mobile.putong.feed.data.NewMomentDraft;
import com.p000p1.mobile.putong.feed.data.NotifyUser;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.UserSetVisibility;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.djx;
import l.e30;
import l.e51;
import l.ggi;
import l.hpd0;
import l.ib1;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.qnd;
import l.rhi;
import l.roj0;
import l.s7m;
import l.v9j;
import l.vwb;
import l.w9j;
import p007l.cjh;
import p007l.el00;
import p007l.k90;
import p007l.m84;
import p007l.nkg;
import p007l.nlg;
import p007l.o3i;
import p007l.oe40;
import p007l.orh;
import p007l.p980;
import p007l.rn5;
import p007l.sti;
import p007l.tih;
import p007l.u1j0;
import p007l.vqg;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2089a extends jq2<C2090b> {

    /* JADX INFO: renamed from: I */
    public static b<String> f2110I = b.b();

    /* JADX INFO: renamed from: A */
    public FeedPostTitleTagConfig f2111A;

    /* JADX INFO: renamed from: B */
    public ggi<NewMomentDraft> f2112B;

    /* JADX INFO: renamed from: C */
    public ggi<NewMomentDraft> f2113C;

    /* JADX INFO: renamed from: D */
    public hpd0 f2114D;

    /* JADX INFO: renamed from: E */
    public boolean f2115E;

    /* JADX INFO: renamed from: F */
    public u1j0 f2116F;

    /* JADX INFO: renamed from: G */
    public ArrayList<String> f2117G;

    /* JADX INFO: renamed from: H */
    public ArrayList<NotifyUsers> f2118H;

    /* JADX INFO: renamed from: a */
    public final int f2119a;

    /* JADX INFO: renamed from: b */
    public final int f2120b;

    /* JADX INFO: renamed from: c */
    public int f2121c;

    /* JADX INFO: renamed from: d */
    public a<ArrayList<Media>> f2122d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f2123e;

    /* JADX INFO: renamed from: f */
    public boolean f2124f;

    /* JADX INFO: renamed from: g */
    public boolean f2125g;

    /* JADX INFO: renamed from: h */
    public String f2126h;

    /* JADX INFO: renamed from: i */
    public String f2127i;

    /* JADX INFO: renamed from: j */
    public String f2128j;

    /* JADX INFO: renamed from: k */
    public String f2129k;

    /* JADX INFO: renamed from: l */
    public boolean f2130l;

    /* JADX INFO: renamed from: m */
    public String f2131m;

    /* JADX INFO: renamed from: n */
    public String f2132n;

    /* JADX INFO: renamed from: o */
    public DoublePair f2133o;

    /* JADX INFO: renamed from: p */
    public Audio f2134p;

    /* JADX INFO: renamed from: q */
    public MomentShareInfoParcelable f2135q;

    /* JADX INFO: renamed from: r */
    public String f2136r;

    /* JADX INFO: renamed from: s */
    public ArrayList<TopicMoment> f2137s;

    /* JADX INFO: renamed from: t */
    public String f2138t;

    /* JADX INFO: renamed from: u */
    public boolean f2139u;

    /* JADX INFO: renamed from: v */
    public double[] f2140v;

    /* JADX INFO: renamed from: w */
    public boolean f2141w;

    /* JADX INFO: renamed from: x */
    public BubbleInfo f2142x;

    /* JADX INFO: renamed from: y */
    public BubbleInfo f2143y;

    /* JADX INFO: renamed from: z */
    public NewPostAct f2144z;

    public C2089a(mcr mcrVar) {
        super(mcrVar);
        this.f2119a = 1;
        this.f2120b = 2;
        this.f2121c = 1;
        this.f2122d = a.b();
        this.f2112B = new ggi<>(new qnd("new_moment_draft_text", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f2113C = new ggi<>(new qnd("new_moment_draft_media", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f2114D = FeedModule.f316d.f14954U;
        this.f2117G = new ArrayList<>();
        this.f2118H = new ArrayList<>();
        this.f2144z = (NewPostAct) mcrVar;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m3711C0(c cVar) {
        if (cVar == c.m) {
            ib1.b().e(FeedAudioRecordView.f2020y);
            ib1.b().e(rn5.f12686g);
            ib1.b().e(FeedAudioPlayerView.f4790w);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m3712D0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m3713E0(Throwable th) {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m3714F0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Media m3718J0(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: c1 */
    public static rx.c<String> m3721c1() {
        return f2110I.asObservable();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m3722e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m3724f1(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.d440
            public final void call(Object obj) {
                C2089a.m3730l0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.f440
            public final void call(Object obj) {
                C2089a.m3712D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m3730l0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            f2110I.onNext(str);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private boolean m3735p1(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iB = djx.h().b();
            int iD = djx.h().d();
            for (Media media : arrayList) {
                if (media instanceof Video) {
                    return true;
                }
                if (media instanceof Picture) {
                    Picture picture = (Picture) media;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(rhi.z(picture.url), options);
                    picture.nullCheck();
                    Dimension dimension = picture.size;
                    dimension.width = options.outWidth;
                    dimension.height = options.outHeight;
                    int iBigAspectRate = picture.bigAspectRate();
                    if (picture.isHorizontal() && iBigAspectRate > iB) {
                        lsi0.y("图片宽度超出上限");
                        return false;
                    }
                    if (!picture.isHorizontal() && iBigAspectRate > iD) {
                        lsi0.y("图片长度超出上限");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m3738s0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m3741u1(Bundle bundle) {
        ((C2090b) ((jq2) this).viewModel).m3855D0(bundle);
        ((C2090b) ((jq2) this).viewModel).m3937x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m3745z1(Boolean bool) {
        ((C2090b) ((jq2) this).viewModel).m3854C1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m3746B1(Map map) {
        final BubbleInfo bubbleInfo = (BubbleInfo) map.get(((DbObject) FeedModule.m1140H().me_()).id);
        String str = (String) sti.f13081g.get();
        if (!TextUtils.isEmpty(str) && bubbleInfo != null) {
            for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
                if (NullChecker.a(stateEmotion) && !vwb.J(stateEmotion.emotions)) {
                    Emotion emotion = (Emotion) vwb.r(stateEmotion.emotions, new w9j() { // from class: l.l440
                        public final Object call(Object obj) {
                            Emotion emotion2 = (Emotion) obj;
                            return Boolean.valueOf(NullChecker.a(emotion2) && TextUtils.equals(bubbleInfo.emotion.f209id, emotion2.f209id));
                        }
                    });
                    if (NullChecker.a(emotion)) {
                        bubbleInfo.emotion.backgroundColor = emotion.backgroundColor;
                        break;
                    }
                }
            }
        }
        if (bubbleInfo != null) {
            this.f2143y = bubbleInfo;
            this.f2142x = bubbleInfo;
            ((C2090b) ((jq2) this).viewModel).m3889Y1();
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m3748C1(j760 j760Var) {
        for (final TopicMoment topicMoment : (List) j760Var.b) {
            if (NullChecker.a(this.f2123e)) {
                topicMoment.selected = vwb.m(this.f2123e, new w9j() { // from class: l.z340
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                    }
                });
            }
        }
        m3767T1(j760Var);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m3749D1(ggi.a aVar) {
        act().progressDismiss();
        if (aVar == null) {
            return;
        }
        ArrayList<TopicMoment> arrayList = (ArrayList) ((NewMomentDraft) aVar.a).topics;
        if (!vwb.J(arrayList)) {
            m3766S1(arrayList);
        }
        ((C2090b) ((jq2) this).viewModel).m3932u1((NewMomentDraft) aVar.a);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m3750E1(d30 d30Var) {
        act().progressDismiss();
        d30Var.call();
        FeedDraftView.m6202P(true);
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m3751F1(Audio audio, String str, ArrayList arrayList, final d30 d30Var) {
        ArrayList<Media> arrayListM3784g1 = m3784g1();
        if (!m3792o1(arrayListM3784g1)) {
            arrayListM3784g1 = new ArrayList<>();
        }
        if (arrayListM3784g1.size() == 0 && NullChecker.a(audio)) {
            arrayListM3784g1.add(audio);
        }
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = arrayListM3784g1;
        newMomentDraftNew_.text = str;
        newMomentDraftNew_.topics = arrayList;
        if (this.f2121c == 1 && arrayListM3784g1.size() > 0) {
            this.f2121c = 2;
            FeedModule.f316d.f14956V.put(Boolean.FALSE);
        } else if (this.f2121c == 2 && arrayListM3784g1.size() == 0) {
            this.f2121c = 1;
            this.f2114D.put(Boolean.FALSE);
        }
        int i = this.f2121c;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f2112B.p(newMomentDraftNew_);
            FeedModule.f316d.f14956V.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f2113C.p(newMomentDraftNew_);
            this.f2114D.put(Boolean.TRUE);
        }
        e51.G(new Runnable() { // from class: l.u340
            @Override // java.lang.Runnable
            public final void run() {
                this.f13517a.m3750E1(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m3752H1(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        this.f2131m = k90Var.m11398c();
        this.f2132n = k90Var.m11396a();
        this.f2133o = k90Var.m11397b();
        ((C2090b) ((jq2) this).viewModel).m3878R1();
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m3753I1() {
        return this.f2134p == null;
    }

    /* JADX INFO: renamed from: J1 */
    public void m3754J1(Intent intent) {
        ArrayList<Media> arrayListM3784g1 = m3784g1();
        if (NullChecker.b(intent) && NullChecker.a(intent.getSerializableExtra("extra_images"))) {
            Collection<? extends Media> collection = (ArrayList) intent.getSerializableExtra("extra_images");
            if (this.f2130l) {
                arrayListM3784g1.addAll(collection);
            } else {
                arrayListM3784g1 = collection;
            }
            this.f2122d.onNext(arrayListM3784g1);
            ((C2090b) ((jq2) this).viewModel).m3941z1(arrayListM3784g1);
        }
        ((C2090b) ((jq2) this).viewModel).m3866J1();
        if (arrayListM3784g1.size() == 0) {
            return;
        }
        ((C2090b) ((jq2) this).viewModel).m3901f0(arrayListM3784g1);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m3755L1(String str, MessageLocation messageLocation) {
        MomentShareInfoParcelable momentShareInfoParcelable;
        boolean z = NullChecker.a(this.f2143y) && NullChecker.a(this.f2142x) && TextUtils.equals(this.f2142x.f191id, this.f2143y.f191id);
        if (nkg.m12268u0() && NullChecker.a(this.f2142x) && !z) {
            m3756N1();
        }
        Moment moment = new Moment();
        ArrayList<Media> arrayListM3784g1 = m3784g1();
        if (!m3792o1(arrayListM3784g1)) {
            arrayListM3784g1 = new ArrayList<>();
        }
        if (!m3735p1(arrayListM3784g1)) {
            return false;
        }
        if (arrayListM3784g1.size() == 0 && !m3753I1()) {
            arrayListM3784g1.add(this.f2134p);
        }
        moment.media = arrayListM3784g1;
        moment.value = str;
        moment.location = messageLocation;
        if (!TextUtils.isEmpty(this.f2136r)) {
            GroupIdBox groupIdBox = new GroupIdBox();
            moment.group = groupIdBox;
            groupIdBox.f684id = this.f2136r;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : arrayListM3784g1) {
            if (NullChecker.b(media) && NullChecker.a(media.meta) && !TextUtils.isEmpty(media.meta.sticker)) {
                arrayList.add(media.meta.sticker);
            }
        }
        if (!vwb.J(arrayList)) {
            moment.setCameraStickerIds(arrayList);
        }
        if (NullChecker.a(this.f2123e) && this.f2123e.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (TopicMoment topicMoment : this.f2123e) {
                TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
                topicMomentIdBox.f285id = topicMoment.f708id;
                topicMomentIdBox.name = topicMoment.name;
                arrayList2.add(topicMomentIdBox);
            }
            moment.topics = arrayList2;
            moment.mTopicList = this.f2123e;
        }
        moment.userSetVisibility = UserSetVisibility.get(el00.m9903k().m9911o(((C2090b) ((jq2) this).viewModel).m3927s0()));
        m3724f1(str);
        moment.nullCheck();
        if (nkg.m12220R()) {
            moment.allowForward = ((C2090b) ((jq2) this).viewModel).f2193y.isChecked() ? MomentAllowForwardState.get(MomentAllowForwardState.allow) : MomentAllowForwardState.get(MomentAllowForwardState.disallow);
        } else {
            moment.allowForward = null;
        }
        moment.additionalData.sendFrom = null;
        boolean zA = NullChecker.a(this.f2135q);
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (zA) {
            momentAdditionalData.share = this.f2135q;
        } else {
            momentAdditionalData.share = null;
        }
        if (nkg.m12273x() && !vwb.J(this.f2118H)) {
            ArrayList arrayList3 = new ArrayList();
            for (final NotifyUsers notifyUsers : this.f2118H) {
                if (!vwb.m(arrayList3, new w9j() { // from class: l.c440
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((NotifyUser) obj).userId, notifyUsers.userId));
                    }
                })) {
                    NotifyUser notifyUserNew_ = NotifyUser.new_();
                    notifyUserNew_.userId = notifyUsers.userId;
                    notifyUserNew_.name = notifyUsers.name;
                    arrayList3.add(notifyUserNew_);
                }
            }
            moment.notifyUsers = arrayList3;
        }
        String str2 = (!"share".equals(act().f2081c) || (momentShareInfoParcelable = this.f2135q) == null) ? act().f2081c : momentShareInfoParcelable.name;
        moment.from = str2;
        if (nkg.m12250l0()) {
            moment.isNewUserAIMoment = this.f2139u;
        }
        oe40.m12555T(act(), moment, act().f2081c);
        if (nkg.m12250l0() && this.f2139u) {
            FeedModule.f316d.f14911A1.onNext(roj0.a);
        }
        if (!vwb.J(moment.notifyUsers)) {
            orh.m12753i();
        }
        if (!"share".equals(act().f2081c) && !"from_h5_moment_level_open_camera".equals(act().f2081c)) {
            m3761Q0(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: N1 */
    public void m3756N1() {
        FeedModule.f317e.m10712V0(this.f2142x, "p_moment_post");
    }

    /* JADX INFO: renamed from: O0 */
    public void m3757O0(NotifyUsers notifyUsers, boolean z) {
        ((C2090b) ((jq2) this).viewModel).m3894a0(notifyUsers.name, z);
    }

    /* JADX INFO: renamed from: O1 */
    public void m3758O1() {
        ggi<NewMomentDraft> ggiVar;
        if ("share".equals(act().f2081c) || "from_h5_moment_level_open_camera".equals(act().f2081c)) {
            if (this.f2121c == 2) {
                this.f2122d.onNext(new ArrayList());
            }
        } else {
            if (this.f2139u) {
                return;
            }
            if (this.f2121c == 1 && ((Boolean) FeedModule.f316d.f14956V.get()).booleanValue()) {
                ggiVar = this.f2112B;
            } else if (this.f2121c != 2 || !((Boolean) this.f2114D.get()).booleanValue() || !this.f2124f) {
                return;
            } else {
                ggiVar = this.f2113C;
            }
            act().progress(R$string.f462X1);
            duringCreated(ggiVar.k().compose(mkd0.C())).subscribe(mkd0.G(new e30() { // from class: l.m340
                public final void call(Object obj) {
                    this.f10196a.m3749D1((ggi.a) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void m3747C(C2090b c2090b) {
        super.C(c2090b);
        if (nkg.m12258p0()) {
            this.f2116F = new u1j0(act(), c2090b);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m3760P1(List<TopicMoment> list) {
        int i;
        Iterator<TopicMoment> it = ((C2090b) ((jq2) this).viewModel).m3929t0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                it.next().selected = false;
            }
        }
        if (vwb.J(list)) {
            return;
        }
        for (i = 0; i < list.size(); i++) {
            TopicMoment topicMoment = list.get(i);
            for (TopicMoment topicMoment2 : ((C2090b) ((jq2) this).viewModel).m3929t0()) {
                if (topicMoment.f708id.equals(topicMoment2.f708id)) {
                    topicMoment2.selected = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m3761Q0(d30 d30Var) {
        m3763R0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        FeedDraftView.m6202P(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m3762Q1(String str) {
        duringCreated(FeedModule.f316d.m16654hd(str)).subscribe(mkd0.H(new e30() { // from class: l.r340
            public final void call(Object obj) {
                C2089a.m3738s0((roj0) obj);
            }
        }, new e30() { // from class: l.s340
            public final void call(Object obj) {
                lsi0.w(R$string.f442U);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m3763R0() {
        hpd0 hpd0Var = FeedModule.f316d.f14956V;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f2112B.c();
        this.f2114D.put(bool);
        this.f2113C.c();
    }

    /* JADX INFO: renamed from: R1 */
    public void m3764R1(Intent intent) {
        String stringExtra = intent.getStringExtra("framePath");
        ArrayList<Media> arrayListM3784g1 = m3784g1();
        if (TextUtils.isEmpty(stringExtra) || arrayListM3784g1.size() <= 0 || !(arrayListM3784g1.get(0) instanceof Video)) {
            return;
        }
        arrayListM3784g1.get(0).cover().url = rhi.B(stringExtra);
        ((C2090b) ((jq2) this).viewModel).m3858F1(vwb.Q(arrayListM3784g1, new w9j() { // from class: l.i340
            public final Object call(Object obj) {
                return C2089a.m3718J0((Media) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public void m3765S0(TopicMoment topicMoment) {
        m3768U0(topicMoment, true);
    }

    /* JADX INFO: renamed from: S1 */
    public void m3766S1(ArrayList<TopicMoment> arrayList) {
        this.f2123e = arrayList;
        m3760P1(arrayList);
        ((C2090b) ((jq2) this).viewModel).m3864I1(arrayList);
    }

    /* JADX INFO: renamed from: T1 */
    public void m3767T1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        if (j760Var == null) {
            return;
        }
        for (final TopicMoment topicMoment : (List) j760Var.b) {
            topicMoment.selected = vwb.m(this.f2123e, new w9j() { // from class: l.y340
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                }
            });
        }
        ((C2090b) ((jq2) this).viewModel).m3868K1(j760Var);
    }

    /* JADX INFO: renamed from: U0 */
    public void m3768U0(final TopicMoment topicMoment, boolean z) {
        TopicMoment topicMoment2 = (TopicMoment) vwb.r(this.f2123e, new w9j() { // from class: l.l340
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
            }
        });
        if (NullChecker.a(topicMoment2)) {
            if (!z) {
                lsi0.y("存在重复话题");
                return;
            }
            this.f2123e.remove(topicMoment2);
        } else if (this.f2123e.size() >= 3) {
            lsi0.w(R$string.f598r1);
            return;
        } else if (!m3775X1(topicMoment, this.f2123e)) {
            this.f2123e.add(topicMoment);
            if (topicMoment.isActivityTopic()) {
                nlg.m12287g().m12290d(act(), topicMoment.details.tips);
            }
        }
        m3766S1(this.f2123e);
    }

    /* JADX INFO: renamed from: U1 */
    public void m3769U1(final d30 d30Var, final String str, final Audio audio, final ArrayList<TopicMoment> arrayList) {
        act().progress(R$string.f445U2);
        m3763R0();
        e51.y(new Runnable() { // from class: l.q340
            @Override // java.lang.Runnable
            public final void run() {
                this.f12061a.m3751F1(audio, str, arrayList, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m3770V0(ArrayList<Media> arrayList) {
        this.f2124f = act().getIntent().getBooleanExtra("read_draft", false);
        m3778Z1(arrayList);
        m3758O1();
        m3777Y1();
    }

    /* JADX INFO: renamed from: V1 */
    public void m3771V1(BubbleInfo bubbleInfo) {
        this.f2142x = bubbleInfo;
    }

    /* JADX INFO: renamed from: W0 */
    public void m3772W0(TopicMoment topicMoment) {
        this.f2123e.remove(topicMoment);
        m3766S1(this.f2123e);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m3773W1() {
        p980.m12949f(act()).subscribe(mkd0.H(new e30() { // from class: l.j440
            public final void call(Object obj) {
                this.f9218a.m3752H1((k90) obj);
            }
        }, new e30() { // from class: l.k440
            public final void call(Object obj) {
                C2089a.m3713E0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public void m3774X0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f2115E = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.v340
            public final void call(Object obj) {
                this.f14031a.m3793q1(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.w340
            public final void call(Object obj) {
                this.f14381a.m3794r1(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public final boolean m3775X1(TopicMoment topicMoment, ArrayList<TopicMoment> arrayList) {
        if (vwb.J(arrayList)) {
            return false;
        }
        if (arrayList.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.y("只能添加一条匿名话题");
            } else if (nkg.m12217O()) {
                lsi0.y("你已添加匿名话题，不可同选当前话题");
            } else {
                lsi0.y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (nkg.m12217O()) {
            lsi0.y("匿名话题与已添加话题不可同选");
        } else {
            lsi0.y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m3776Y0(String str, d30 d30Var) {
        m3774X0(str, DetectCategoryType.get("moment"), "moment", null, d30Var);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m3777Y1() {
        if (nkg.m12273x()) {
            if (!TextUtils.isEmpty(this.f2138t)) {
                NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(this.f2138t);
                if (orh.m12752h(notifyUsersM16537R7)) {
                    m3757O0(notifyUsersM16537R7, false);
                }
            }
            Iterator<TopicMoment> it = this.f2123e.iterator();
            while (it.hasNext()) {
                NotifyUsers notifyUsersM12750f = orh.m12750f(it.next());
                if (NullChecker.a(notifyUsersM12750f) && !this.f2118H.contains(notifyUsersM12750f) && orh.m12752h(notifyUsersM12750f)) {
                    m3757O0(notifyUsersM12750f, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m3778Z1(ArrayList<Media> arrayList) {
        if (arrayList.size() != 0) {
            this.f2121c = 2;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3779a0() {
        super.a0();
        duringCreated(m84.m11844e().f10261g).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.g440
            public final void call(Object obj) {
                this.f8345a.m3745z1((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.h440
            public final void call(Object obj) {
                C2089a.m3711C0((c) obj);
            }
        }));
        if (vqg.m15510d0()) {
            this.f2141w = tih.m14557f();
        } else {
            this.f2141w = tih.m14558g();
        }
        if (this.f2141w && cjh.m9194d()) {
            m3773W1();
        }
        if (nkg.m12268u0()) {
            duringCreated(FeedModule.f316d.m16488K7()).subscribe(mkd0.G(new e30() { // from class: l.i440
                public final void call(Object obj) {
                    this.f8890a.m3746B1((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m3780a1(final String str) {
        m3774X0(str, DetectCategoryType.get("moment"), SchemeKey.topic, "发布内容包含不友善词汇，请重新输入", new d30() { // from class: l.k340
            public final void call() {
                this.f9579a.m3796t1(str);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m3781b1(Bundle bundle) {
        try {
            this.f2131m = bundle.getString("extra_addressInfo_name");
            this.f2132n = bundle.getString("extra_addressInfo_address");
            this.f2133o = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.c(e);
            App.d.k(e);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m3782d1() {
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            if (o3i.m12434d() && NullChecker.a(stateEmotion) && !vwb.J(stateEmotion.emotions)) {
                final String strM12433c = o3i.m12433c();
                Emotion emotion = (Emotion) vwb.r(stateEmotion.emotions, new w9j() { // from class: l.n340
                    public final Object call(Object obj) {
                        Emotion emotion2 = (Emotion) obj;
                        return Boolean.valueOf(NullChecker.a(emotion2) && TextUtils.equals(strM12433c, emotion2.f209id));
                    }
                });
                if (NullChecker.a(emotion) && this.f2142x == null) {
                    BubbleInfo bubbleInfo = new BubbleInfo();
                    bubbleInfo.emotion = emotion;
                    TextTheme textTheme = new TextTheme();
                    textTheme.backgroundColor = emotion.backgroundColor;
                    bubbleInfo.textTheme = textTheme;
                    this.f2142x = bubbleInfo;
                    ((C2090b) ((jq2) this).viewModel).m3889Y1();
                }
            }
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public BubbleInfo m3783e1() {
        return this.f2142x;
    }

    /* JADX INFO: renamed from: g1 */
    public ArrayList<Media> m3784g1() {
        ArrayList<Media> arrayList = (ArrayList) this.f2122d.e();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: renamed from: h1 */
    public void m3785h1(ArrayList<Media> arrayList) {
        this.f2122d.onNext(arrayList);
    }

    /* JADX INFO: renamed from: i1 */
    public void m3786i1(Bundle bundle) {
        creates(new e30() { // from class: l.t340
            public final void call(Object obj) {
                this.f13172a.m3741u1((Bundle) obj);
            }
        });
        duringCreated(this.f2122d).subscribe(mkd0.G(new e30() { // from class: l.e440
            public final void call(Object obj) {
                this.f7201a.m3797v1((ArrayList) obj);
            }
        }));
        m3788k1(act().f2081c);
    }

    /* JADX INFO: renamed from: j1 */
    public void m3787j1() {
        FeedModule.f316d.m16591Yc("suggest");
        duringCreated(new v9j() { // from class: l.o340
            public final Object call() {
                return FeedModule.f316d.m16621d8().distinctUntilChanged();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.p340
            public final void call(Object obj) {
                this.f11680a.m3798x1((j760) obj);
            }
        }));
        m3766S1(this.f2123e);
    }

    /* JADX INFO: renamed from: k1 */
    public void m3788k1(String str) {
        try {
            String strF = RemoteConfig.x().F("feed_post_title_tag_config");
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            List<FeedPostTitleTagConfig> list = (List) FeedPostTitleTagConfig.JSON_ADAPTER.ARRAY_ADAPTER().parse(strF);
            if (vwb.J(list)) {
                return;
            }
            for (FeedPostTitleTagConfig feedPostTitleTagConfig : list) {
                if (TextUtils.equals(str, feedPostTitleTagConfig.from)) {
                    this.f2111A = feedPostTitleTagConfig;
                    if (TextUtils.isEmpty(this.f2129k)) {
                        this.f2129k = this.f2111A.hint;
                        return;
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m3789l1() {
        duringCreated(FeedModule.f316d.m16607b8()).subscribe(mkd0.H(new e30() { // from class: l.m440
            public final void call(Object obj) {
                this.f10212a.m3748C1((j760) obj);
            }
        }, new e30() { // from class: l.j340
            public final void call(Object obj) {
                C2089a.m3714F0((Throwable) obj);
            }
        }));
        m3762Q1("moment");
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m3790m1() {
        return "immersion_cartoon_effects".equals(act().f2081c);
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m3791n1(ArrayList<TopicMoment> arrayList) {
        return arrayList.size() != 0 && TextUtils.equals(arrayList.get(0).name, act().getResources().getString(R$string.f521g0));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m3792o1(ArrayList<Media> arrayList) {
        return (vwb.J(arrayList) || !NullChecker.a(arrayList.get(0)) || TextUtils.isEmpty(arrayList.get(0).url)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m3793q1(d30 d30Var, String str, Envelope envelope) {
        this.f2115E = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m15525l(detect, "p_moment_post")) {
            lsi0.w(R$string.f602s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.w(R$string.f457W2);
        } else {
            lsi0.y(str);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m3794r1(d30 d30Var, Throwable th) {
        this.f2115E = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m3795s1(TopicMoment topicMoment) {
        m3768U0(topicMoment, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m3796t1(String str) {
        duringCreated(FeedModule.f316d.m16536R6(FeedModule.m1139F().userId(), str)).subscribe(mkd0.H(new e30() { // from class: l.a440
            public final void call(Object obj) {
                this.f5571a.m3795s1((TopicMoment) obj);
            }
        }, new e30() { // from class: l.b440
            public final void call(Object obj) {
                C2089a.m3722e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m3797v1(ArrayList arrayList) {
        boolean zM15501Y = vqg.m15501Y(arrayList);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zM15501Y) {
            ((C2090b) s7mVar).m3850A1(arrayList);
            ((C2090b) ((jq2) this).viewModel).m3858F1(new ArrayList<>());
        } else {
            ((C2090b) s7mVar).m3858F1(arrayList);
            ((C2090b) ((jq2) this).viewModel).m3903g0();
        }
        ((C2090b) ((jq2) this).viewModel).m3866J1();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m3798x1(j760 j760Var) {
        List listN = vwb.n((Collection) j760Var.b, new w9j() { // from class: l.x340
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        });
        if (listN.size() > 5) {
            listN = listN.subList(0, 5);
        }
        boolean z = !listN.isEmpty();
        ArrayList arrayList = new ArrayList(listN);
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = act().getResources().getString(R$string.f521g0);
        arrayList.add(0, topicMomentNew_);
        if (nkg.m12217O() && NullChecker.a(this.f2137s)) {
            if (!m3791n1(this.f2137s)) {
                this.f2137s.add(0, topicMomentNew_);
            }
            C2090b c2090b = (C2090b) ((jq2) this).viewModel;
            int size = this.f2137s.size();
            ArrayList<TopicMoment> arrayList2 = this.f2137s;
            ArrayList<TopicMoment> arrayListSubList = arrayList2;
            if (size > 6) {
                arrayListSubList = arrayList2.subList(0, 6);
            }
            c2090b.m3939y1(arrayListSubList);
            ((C2090b) ((jq2) this).viewModel).m3884V1(true);
        } else {
            if (nkg.m12258p0()) {
                this.f2116F.m14712g(arrayList);
            }
            ((C2090b) ((jq2) this).viewModel).m3939y1(arrayList);
            ((C2090b) ((jq2) this).viewModel).m3884V1(z);
        }
        m3766S1(this.f2123e);
    }
}
