package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedPostTitleTagConfig;
import com.p051p1.mobile.putong.feed.data.GroupIdBox;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p051p1.mobile.putong.feed.data.NewMomentDraft;
import com.p051p1.mobile.putong.feed.data.NotifyUser;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.UserSetVisibility;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.ar2;
import p153l.asx;
import p153l.cmg;
import p153l.cn40;
import p153l.cng;
import p153l.d5i;
import p153l.dji;
import p153l.dth;
import p153l.g90;
import p153l.ikh;
import p153l.jxd0;
import p153l.jyb;
import p153l.ksg;
import p153l.l51;
import p153l.l94;
import p153l.ner;
import p153l.nt00;
import p153l.o1j0;
import p153l.oki;
import p153l.owi;
import p153l.pb1;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rkh;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vh80;
import p153l.vo5;
import p153l.vod;
import p153l.x20;
import p153l.y20;
import p153l.yaj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11408a extends ar2<C11409b> {

    /* JADX INFO: renamed from: I */
    public static C22508b<String> f41497I = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public FeedPostTitleTagConfig f41498A;

    /* JADX INFO: renamed from: B */
    public dji<NewMomentDraft> f41499B;

    /* JADX INFO: renamed from: C */
    public dji<NewMomentDraft> f41500C;

    /* JADX INFO: renamed from: D */
    public jxd0 f41501D;

    /* JADX INFO: renamed from: E */
    public boolean f41502E;

    /* JADX INFO: renamed from: F */
    public yaj0 f41503F;

    /* JADX INFO: renamed from: G */
    public ArrayList<String> f41504G;

    /* JADX INFO: renamed from: H */
    public ArrayList<NotifyUsers> f41505H;

    /* JADX INFO: renamed from: a */
    public final int f41506a;

    /* JADX INFO: renamed from: b */
    public final int f41507b;

    /* JADX INFO: renamed from: c */
    public int f41508c;

    /* JADX INFO: renamed from: d */
    public C22507a<ArrayList<Media>> f41509d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f41510e;

    /* JADX INFO: renamed from: f */
    public boolean f41511f;

    /* JADX INFO: renamed from: g */
    public boolean f41512g;

    /* JADX INFO: renamed from: h */
    public String f41513h;

    /* JADX INFO: renamed from: i */
    public String f41514i;

    /* JADX INFO: renamed from: j */
    public String f41515j;

    /* JADX INFO: renamed from: k */
    public String f41516k;

    /* JADX INFO: renamed from: l */
    public boolean f41517l;

    /* JADX INFO: renamed from: m */
    public String f41518m;

    /* JADX INFO: renamed from: n */
    public String f41519n;

    /* JADX INFO: renamed from: o */
    public DoublePair f41520o;

    /* JADX INFO: renamed from: p */
    public Audio f41521p;

    /* JADX INFO: renamed from: q */
    public MomentShareInfoParcelable f41522q;

    /* JADX INFO: renamed from: r */
    public String f41523r;

    /* JADX INFO: renamed from: s */
    public ArrayList<TopicMoment> f41524s;

    /* JADX INFO: renamed from: t */
    public String f41525t;

    /* JADX INFO: renamed from: u */
    public boolean f41526u;

    /* JADX INFO: renamed from: v */
    public double[] f41527v;

    /* JADX INFO: renamed from: w */
    public boolean f41528w;

    /* JADX INFO: renamed from: x */
    public BubbleInfo f41529x;

    /* JADX INFO: renamed from: y */
    public BubbleInfo f41530y;

    /* JADX INFO: renamed from: z */
    public NewPostAct f41531z;

    public C11408a(ner nerVar) {
        super(nerVar);
        this.f41506a = 1;
        this.f41507b = 2;
        this.f41508c = 1;
        this.f41509d = C22507a.m222758b();
        this.f41499B = new dji<>(new vod("new_moment_draft_text", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f41500C = new dji<>(new vod("new_moment_draft_media", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f41501D = FeedModule.f39703d.f121329U;
        this.f41504G = new ArrayList<>();
        this.f41505H = new ArrayList<>();
        this.f41531z = (NewPostAct) nerVar;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m63889C0(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            pb1.m171472b().mo171476e(FeedAudioRecordView.f41407y);
            pb1.m171472b().mo171476e(vo5.f184998g);
            pb1.m171472b().mo171476e(FeedAudioPlayerView.f44177w);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m63890D0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m63891E0(Throwable th) {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m63892F0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Media m63896J0(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: c1 */
    public static C22421c<String> m63899c1() {
        return f41497I.asObservable();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m63900e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m63902f1(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.rc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63908l0(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.tc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63890D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m63908l0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            f41497I.onNext(str);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private boolean m63913p1(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iM99992b = asx.m99990h().m99992b();
            int iM99994d = asx.m99990h().m99994d();
            for (Media media : arrayList) {
                if (media instanceof Video) {
                    return true;
                }
                if (media instanceof Picture) {
                    Picture picture = (Picture) media;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(oki.m168038z(picture.url), options);
                    picture.nullCheck();
                    Dimension dimension = picture.size;
                    dimension.width = options.outWidth;
                    dimension.height = options.outHeight;
                    int iBigAspectRate = picture.bigAspectRate();
                    if (picture.isHorizontal() && iBigAspectRate > iM99992b) {
                        o1j0.m165651y("图片宽度超出上限");
                        return false;
                    }
                    if (!picture.isHorizontal() && iBigAspectRate > iM99994d) {
                        o1j0.m165651y("图片长度超出上限");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m63916s0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m63919u1(Bundle bundle) {
        ((C11409b) this.viewModel).m64030D0(bundle);
        ((C11409b) this.viewModel).m64111x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m63923z1(Boolean bool) {
        ((C11409b) this.viewModel).m64029C1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m63924B1(Map map) {
        final BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m61406H().me_().f56859id);
        String str = owi.f149488g.get();
        if (!TextUtils.isEmpty(str) && bubbleInfo != null) {
            for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
                if (NullChecker.m82486a(stateEmotion) && !jyb.m147479J(stateEmotion.emotions)) {
                    Emotion emotion = (Emotion) jyb.m147529r(stateEmotion.emotions, new qcj() { // from class: l.zc40
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            Emotion emotion2 = (Emotion) obj;
                            return Boolean.valueOf(NullChecker.m82486a(emotion2) && TextUtils.equals(bubbleInfo.emotion.f39596id, emotion2.f39596id));
                        }
                    });
                    if (NullChecker.m82486a(emotion)) {
                        bubbleInfo.emotion.backgroundColor = emotion.backgroundColor;
                        break;
                    }
                }
            }
        }
        if (bubbleInfo != null) {
            this.f41530y = bubbleInfo;
            this.f41529x = bubbleInfo;
            ((C11409b) this.viewModel).m64064Y1();
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m63925C1(pf60 pf60Var) {
        for (final TopicMoment topicMoment : (List) pf60Var.f152157b) {
            if (NullChecker.m82486a(this.f41510e)) {
                topicMoment.selected = jyb.m147520m(this.f41510e, new qcj() { // from class: l.nc40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                    }
                });
            }
        }
        m63944T1(pf60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m63926D1(dji.C16549a c16549a) {
        act().progressDismiss();
        if (c16549a == null) {
            return;
        }
        ArrayList<TopicMoment> arrayList = (ArrayList) ((NewMomentDraft) c16549a.f88861a).topics;
        if (!jyb.m147479J(arrayList)) {
            m63943S1(arrayList);
        }
        ((C11409b) this.viewModel).m64106u1((NewMomentDraft) c16549a.f88861a);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m63927E1(x20 x20Var) {
        act().progressDismiss();
        x20Var.call();
        FeedDraftView.m66284P(true);
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m63928F1(Audio audio, String str, ArrayList arrayList, final x20 x20Var) {
        ArrayList<Media> arrayListM63960g1 = m63960g1();
        if (!m63968o1(arrayListM63960g1)) {
            arrayListM63960g1 = new ArrayList<>();
        }
        if (arrayListM63960g1.size() == 0 && NullChecker.m82486a(audio)) {
            arrayListM63960g1.add(audio);
        }
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = arrayListM63960g1;
        newMomentDraftNew_.text = str;
        newMomentDraftNew_.topics = arrayList;
        if (this.f41508c == 1 && arrayListM63960g1.size() > 0) {
            this.f41508c = 2;
            FeedModule.f39703d.f121331V.put(Boolean.FALSE);
        } else if (this.f41508c == 2 && arrayListM63960g1.size() == 0) {
            this.f41508c = 1;
            this.f41501D.put(Boolean.FALSE);
        }
        int i = this.f41508c;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f41499B.m116110p(newMomentDraftNew_);
            FeedModule.f39703d.f121331V.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f41500C.m116110p(newMomentDraftNew_);
            this.f41501D.put(Boolean.TRUE);
        }
        l51.m152887G(new Runnable() { // from class: l.ic40
            @Override // java.lang.Runnable
            public final void run() {
                this.f114281a.m63927E1(x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m63929H1(g90 g90Var) {
        if (g90Var == null) {
            return;
        }
        this.f41518m = g90Var.m129468c();
        this.f41519n = g90Var.m129466a();
        this.f41520o = g90Var.m129467b();
        ((C11409b) this.viewModel).m64053R1();
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m63930I1() {
        return this.f41521p == null;
    }

    /* JADX INFO: renamed from: J1 */
    public void m63931J1(Intent intent) {
        ArrayList<Media> arrayListM63960g1 = m63960g1();
        if (NullChecker.m82487b(intent) && NullChecker.m82486a(intent.getSerializableExtra("extra_images"))) {
            Collection<? extends Media> collection = (ArrayList) intent.getSerializableExtra("extra_images");
            if (this.f41517l) {
                arrayListM63960g1.addAll(collection);
            } else {
                arrayListM63960g1 = collection;
            }
            this.f41509d.onNext(arrayListM63960g1);
            ((C11409b) this.viewModel).m64115z1(arrayListM63960g1);
        }
        ((C11409b) this.viewModel).m64041J1();
        if (arrayListM63960g1.size() == 0) {
            return;
        }
        ((C11409b) this.viewModel).m64076f0(arrayListM63960g1);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m63932L1(String str, MessageLocation messageLocation) {
        MomentShareInfoParcelable momentShareInfoParcelable;
        boolean z = NullChecker.m82486a(this.f41530y) && NullChecker.m82486a(this.f41529x) && TextUtils.equals(this.f41529x.f39578id, this.f41530y.f39578id);
        if (cmg.m111238u0() && NullChecker.m82486a(this.f41529x) && !z) {
            m63933N1();
        }
        Moment moment = new Moment();
        ArrayList<Media> arrayListM63960g1 = m63960g1();
        if (!m63968o1(arrayListM63960g1)) {
            arrayListM63960g1 = new ArrayList<>();
        }
        if (!m63913p1(arrayListM63960g1)) {
            return false;
        }
        if (arrayListM63960g1.size() == 0 && !m63930I1()) {
            arrayListM63960g1.add(this.f41521p);
        }
        moment.media = arrayListM63960g1;
        moment.value = str;
        moment.location = messageLocation;
        if (!TextUtils.isEmpty(this.f41523r)) {
            GroupIdBox groupIdBox = new GroupIdBox();
            moment.group = groupIdBox;
            groupIdBox.f40071id = this.f41523r;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : arrayListM63960g1) {
            if (NullChecker.m82487b(media) && NullChecker.m82486a(media.meta) && !TextUtils.isEmpty(media.meta.sticker)) {
                arrayList.add(media.meta.sticker);
            }
        }
        if (!jyb.m147479J(arrayList)) {
            moment.setCameraStickerIds(arrayList);
        }
        if (NullChecker.m82486a(this.f41510e) && this.f41510e.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (TopicMoment topicMoment : this.f41510e) {
                TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
                topicMomentIdBox.f39672id = topicMoment.f40095id;
                topicMomentIdBox.name = topicMoment.name;
                arrayList2.add(topicMomentIdBox);
            }
            moment.topics = arrayList2;
            moment.mTopicList = this.f41510e;
        }
        moment.userSetVisibility = UserSetVisibility.get(nt00.m164664k().m164672o(((C11409b) this.viewModel).m64101s0()));
        m63902f1(str);
        moment.nullCheck();
        if (cmg.m111190R()) {
            moment.allowForward = ((C11409b) this.viewModel).f41580y.isChecked() ? MomentAllowForwardState.get(MomentAllowForwardState.allow) : MomentAllowForwardState.get(MomentAllowForwardState.disallow);
        } else {
            moment.allowForward = null;
        }
        moment.additionalData.sendFrom = null;
        boolean zM82486a = NullChecker.m82486a(this.f41522q);
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (zM82486a) {
            momentAdditionalData.share = this.f41522q;
        } else {
            momentAdditionalData.share = null;
        }
        if (cmg.m111243x() && !jyb.m147479J(this.f41505H)) {
            ArrayList arrayList3 = new ArrayList();
            for (final NotifyUsers notifyUsers : this.f41505H) {
                if (!jyb.m147520m(arrayList3, new qcj() { // from class: l.qc40
                    @Override // p153l.qcj
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
        String str2 = (!"share".equals(((NewPostAct) act()).f41468c) || (momentShareInfoParcelable = this.f41522q) == null) ? ((NewPostAct) act()).f41468c : momentShareInfoParcelable.name;
        moment.from = str2;
        if (cmg.m111220l0()) {
            moment.isNewUserAIMoment = this.f41526u;
        }
        cn40.m111368T(act(), moment, ((NewPostAct) act()).f41468c);
        if (cmg.m111220l0() && this.f41526u) {
            FeedModule.f39703d.f121286A1.onNext(uxj0.f181467a);
        }
        if (!jyb.m147479J(moment.notifyUsers)) {
            dth.m117878i();
        }
        if (!"share".equals(((NewPostAct) act()).f41468c) && !"from_h5_moment_level_open_camera".equals(((NewPostAct) act()).f41468c)) {
            m63938Q0(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: N1 */
    public void m63933N1() {
        FeedModule.f39704e.m159782V0(this.f41529x, "p_moment_post");
    }

    /* JADX INFO: renamed from: O0 */
    public void m63934O0(NotifyUsers notifyUsers, boolean z) {
        ((C11409b) this.viewModel).m64069a0(notifyUsers.name, z);
    }

    /* JADX INFO: renamed from: O1 */
    public void m63935O1() {
        dji<NewMomentDraft> djiVar;
        if ("share".equals(((NewPostAct) act()).f41468c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) act()).f41468c)) {
            if (this.f41508c == 2) {
                this.f41509d.onNext(new ArrayList<>());
            }
        } else {
            if (this.f41526u) {
                return;
            }
            if (this.f41508c == 1 && FeedModule.f39703d.f121331V.get().booleanValue()) {
                djiVar = this.f41499B;
            } else if (this.f41508c != 2 || !this.f41501D.get().booleanValue() || !this.f41511f) {
                return;
            } else {
                djiVar = this.f41500C;
            }
            act().progress(R$string.f39849X1);
            duringCreated((C22421c) djiVar.m116105k().compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.ac40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69676a.m63926D1((dji.C16549a) obj);
                }
            }));
        }
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(C11409b c11409b) {
        super.mo52715C(c11409b);
        if (cmg.m111228p0()) {
            this.f41503F = new yaj0(act(), c11409b);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m63937P1(List<TopicMoment> list) {
        int i;
        Iterator<TopicMoment> it = ((C11409b) this.viewModel).m64103t0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                it.next().selected = false;
            }
        }
        if (jyb.m147479J(list)) {
            return;
        }
        for (i = 0; i < list.size(); i++) {
            TopicMoment topicMoment = list.get(i);
            for (TopicMoment topicMoment2 : ((C11409b) this.viewModel).m64103t0()) {
                if (topicMoment.f40095id.equals(topicMoment2.f40095id)) {
                    topicMoment2.selected = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m63938Q0(x20 x20Var) {
        m63940R0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        FeedDraftView.m66284P(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m63939Q1(String str) {
        duringCreated(FeedModule.f39703d.m145714hd(str)).subscribe(psd0.m173597H(new y20() { // from class: l.fc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63916s0((uxj0) obj);
            }
        }, new y20() { // from class: l.gc40
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f39829U);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m63940R0() {
        jxd0 jxd0Var = FeedModule.f39703d.f121331V;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        this.f41499B.m116099c();
        this.f41501D.put(bool);
        this.f41500C.m116099c();
    }

    /* JADX INFO: renamed from: R1 */
    public void m63941R1(Intent intent) {
        String stringExtra = intent.getStringExtra("framePath");
        ArrayList<Media> arrayListM63960g1 = m63960g1();
        if (TextUtils.isEmpty(stringExtra) || arrayListM63960g1.size() <= 0 || !(arrayListM63960g1.get(0) instanceof Video)) {
            return;
        }
        arrayListM63960g1.get(0).cover().url = oki.m168011B(stringExtra);
        ((C11409b) this.viewModel).m64033F1(jyb.m147486Q(arrayListM63960g1, new qcj() { // from class: l.wb40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C11408a.m63896J0((Media) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public void m63942S0(TopicMoment topicMoment) {
        m63945U0(topicMoment, true);
    }

    /* JADX INFO: renamed from: S1 */
    public void m63943S1(ArrayList<TopicMoment> arrayList) {
        this.f41510e = arrayList;
        m63937P1(arrayList);
        ((C11409b) this.viewModel).m64039I1(arrayList);
    }

    /* JADX INFO: renamed from: T1 */
    public void m63944T1(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var) {
        if (pf60Var == null) {
            return;
        }
        for (final TopicMoment topicMoment : pf60Var.f152157b) {
            topicMoment.selected = jyb.m147520m(this.f41510e, new qcj() { // from class: l.mc40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                }
            });
        }
        ((C11409b) this.viewModel).m64043K1(pf60Var);
    }

    /* JADX INFO: renamed from: U0 */
    public void m63945U0(final TopicMoment topicMoment, boolean z) {
        TopicMoment topicMoment2 = (TopicMoment) jyb.m147529r(this.f41510e, new qcj() { // from class: l.zb40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
            }
        });
        if (NullChecker.m82486a(topicMoment2)) {
            if (!z) {
                o1j0.m165651y("存在重复话题");
                return;
            }
            this.f41510e.remove(topicMoment2);
        } else if (this.f41510e.size() >= 3) {
            o1j0.m165649w(R$string.f39985r1);
            return;
        } else if (!m63952X1(topicMoment, this.f41510e)) {
            this.f41510e.add(topicMoment);
            if (topicMoment.isActivityTopic()) {
                cng.m111504g().m111507d(act(), topicMoment.details.tips);
            }
        }
        m63943S1(this.f41510e);
    }

    /* JADX INFO: renamed from: U1 */
    public void m63946U1(final x20 x20Var, final String str, final Audio audio, final ArrayList<TopicMoment> arrayList) {
        act().progress(R$string.f39832U2);
        m63940R0();
        l51.m152919y(new Runnable() { // from class: l.ec40
            @Override // java.lang.Runnable
            public final void run() {
                this.f93007a.m63928F1(audio, str, arrayList, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m63947V0(ArrayList<Media> arrayList) {
        this.f41511f = act().getIntent().getBooleanExtra("read_draft", false);
        m63955Z1(arrayList);
        m63935O1();
        m63954Y1();
    }

    /* JADX INFO: renamed from: V1 */
    public void m63948V1(BubbleInfo bubbleInfo) {
        this.f41529x = bubbleInfo;
    }

    /* JADX INFO: renamed from: W0 */
    public void m63949W0(TopicMoment topicMoment) {
        this.f41510e.remove(topicMoment);
        m63943S1(this.f41510e);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m63950W1() {
        vh80.m201262f(act()).subscribe(psd0.m173597H(new y20() { // from class: l.xc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193268a.m63929H1((g90) obj);
            }
        }, new y20() { // from class: l.yc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63891E0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public void m63951X0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final x20 x20Var) {
        this.f41502E = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.jc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120019a.m63969q1(x20Var, str3, (Envelope) obj);
            }
        }, new y20() { // from class: l.kc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125019a.m63970r1(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public final boolean m63952X1(TopicMoment topicMoment, ArrayList<TopicMoment> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return false;
        }
        if (arrayList.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                o1j0.m165651y("只能添加一条匿名话题");
            } else if (cmg.m111187O()) {
                o1j0.m165651y("你已添加匿名话题，不可同选当前话题");
            } else {
                o1j0.m165651y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (cmg.m111187O()) {
            o1j0.m165651y("匿名话题与已添加话题不可同选");
        } else {
            o1j0.m165651y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m63953Y0(String str, x20 x20Var) {
        m63951X0(str, DetectCategoryType.get("moment"), "moment", null, x20Var);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m63954Y1() {
        if (cmg.m111243x()) {
            if (!TextUtils.isEmpty(this.f41525t)) {
                NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(this.f41525t);
                if (dth.m117877h(notifyUsersM145597R7)) {
                    m63934O0(notifyUsersM145597R7, false);
                }
            }
            Iterator<TopicMoment> it = this.f41510e.iterator();
            while (it.hasNext()) {
                NotifyUsers notifyUsersM117875f = dth.m117875f(it.next());
                if (NullChecker.m82486a(notifyUsersM117875f) && !this.f41505H.contains(notifyUsersM117875f) && dth.m117877h(notifyUsersM117875f)) {
                    m63934O0(notifyUsersM117875f, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m63955Z1(ArrayList<Media> arrayList) {
        if (arrayList.size() != 0) {
            this.f41508c = 2;
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(l94.m153309e().f130547g).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.uc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178405a.m63923z1((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.vc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63889C0((C4470c) obj);
            }
        }));
        if (ksg.m151199d0()) {
            this.f41528w = ikh.m140298f();
        } else {
            this.f41528w = ikh.m140299g();
        }
        if (this.f41528w && rkh.m181860d()) {
            m63950W1();
        }
        if (cmg.m111238u0()) {
            duringCreated(FeedModule.f39703d.m145548K7()).subscribe(psd0.m173596G(new y20() { // from class: l.wc40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188385a.m63924B1((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m63956a1(final String str) {
        m63951X0(str, DetectCategoryType.get("moment"), "topic", "发布内容包含不友善词汇，请重新输入", new x20() { // from class: l.yb40
            @Override // p153l.x20
            public final void call() {
                this.f198274a.m63972t1(str);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m63957b1(Bundle bundle) {
        try {
            this.f41518m = bundle.getString("extra_addressInfo_name");
            this.f41519n = bundle.getString("extra_addressInfo_address");
            this.f41520o = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            App.f16087d.m21432k(e);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m63958d1() {
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            if (d5i.m114301d() && NullChecker.m82486a(stateEmotion) && !jyb.m147479J(stateEmotion.emotions)) {
                final String strM114300c = d5i.m114300c();
                Emotion emotion = (Emotion) jyb.m147529r(stateEmotion.emotions, new qcj() { // from class: l.bc40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Emotion emotion2 = (Emotion) obj;
                        return Boolean.valueOf(NullChecker.m82486a(emotion2) && TextUtils.equals(strM114300c, emotion2.f39596id));
                    }
                });
                if (NullChecker.m82486a(emotion) && this.f41529x == null) {
                    BubbleInfo bubbleInfo = new BubbleInfo();
                    bubbleInfo.emotion = emotion;
                    TextTheme textTheme = new TextTheme();
                    textTheme.backgroundColor = emotion.backgroundColor;
                    bubbleInfo.textTheme = textTheme;
                    this.f41529x = bubbleInfo;
                    ((C11409b) this.viewModel).m64064Y1();
                }
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public BubbleInfo m63959e1() {
        return this.f41529x;
    }

    /* JADX INFO: renamed from: g1 */
    public ArrayList<Media> m63960g1() {
        ArrayList<Media> arrayListM222761e = this.f41509d.m222761e();
        return arrayListM222761e == null ? new ArrayList<>() : arrayListM222761e;
    }

    /* JADX INFO: renamed from: h1 */
    public void m63961h1(ArrayList<Media> arrayList) {
        this.f41509d.onNext(arrayList);
    }

    /* JADX INFO: renamed from: i1 */
    public void m63962i1(Bundle bundle) {
        creates(new y20() { // from class: l.hc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108674a.m63919u1((Bundle) obj);
            }
        });
        duringCreated(this.f41509d).subscribe(psd0.m173596G(new y20() { // from class: l.sc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167194a.m63973v1((ArrayList) obj);
            }
        }));
        m63964k1(((NewPostAct) act()).f41468c);
    }

    /* JADX INFO: renamed from: j1 */
    public void m63963j1() {
        FeedModule.f39703d.m145651Yc("suggest");
        duringCreated(new pcj() { // from class: l.cc40
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.m145681d8().distinctUntilChanged();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87740a.m63974x1((pf60) obj);
            }
        }));
        m63943S1(this.f41510e);
    }

    /* JADX INFO: renamed from: k1 */
    public void m63964k1(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("feed_post_title_tag_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return;
            }
            List<FeedPostTitleTagConfig> list = FeedPostTitleTagConfig.JSON_ADAPTER.ARRAY_ADAPTER().parse(strM80485F);
            if (jyb.m147479J(list)) {
                return;
            }
            for (FeedPostTitleTagConfig feedPostTitleTagConfig : list) {
                if (TextUtils.equals(str, feedPostTitleTagConfig.from)) {
                    this.f41498A = feedPostTitleTagConfig;
                    if (TextUtils.isEmpty(this.f41516k)) {
                        this.f41516k = this.f41498A.hint;
                        return;
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m63965l1() {
        duringCreated(FeedModule.f39703d.m145667b8()).subscribe(psd0.m173597H(new y20() { // from class: l.ad40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69785a.m63925C1((pf60) obj);
            }
        }, new y20() { // from class: l.xb40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63892F0((Throwable) obj);
            }
        }));
        m63939Q1("moment");
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m63966m1() {
        return "immersion_cartoon_effects".equals(((NewPostAct) act()).f41468c);
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m63967n1(ArrayList<TopicMoment> arrayList) {
        return arrayList.size() != 0 && TextUtils.equals(arrayList.get(0).name, act().getResources().getString(R$string.f39908g0));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m63968o1(ArrayList<Media> arrayList) {
        return (jyb.m147479J(arrayList) || !NullChecker.m82486a(arrayList.get(0)) || TextUtils.isEmpty(arrayList.get(0).url)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m63969q1(x20 x20Var, String str, Envelope envelope) {
        this.f41502E = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
            return;
        }
        if (ksg.m151214l(detect, "p_moment_post")) {
            o1j0.m165649w(R$string.f39989s);
        } else if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f39844W2);
        } else {
            o1j0.m165651y(str);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m63970r1(x20 x20Var, Throwable th) {
        this.f41502E = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m63971s1(TopicMoment topicMoment) {
        m63945U0(topicMoment, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m63972t1(String str) {
        duringCreated(FeedModule.f39703d.m145596R6(FeedModule.m61405F().userId(), str)).subscribe(psd0.m173597H(new y20() { // from class: l.oc40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146661a.m63971s1((TopicMoment) obj);
            }
        }, new y20() { // from class: l.pc40
            @Override // p153l.y20
            public final void call(Object obj) {
                C11408a.m63900e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m63973v1(ArrayList arrayList) {
        boolean zM151190Y = ksg.m151190Y(arrayList);
        V v2 = this.viewModel;
        if (zM151190Y) {
            ((C11409b) v2).m64026A1(arrayList);
            ((C11409b) this.viewModel).m64033F1(new ArrayList<>());
        } else {
            ((C11409b) v2).m64033F1(arrayList);
            ((C11409b) this.viewModel).m64078g0();
        }
        ((C11409b) this.viewModel).m64041J1();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m63974x1(pf60 pf60Var) {
        List listM147522n = jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.lc40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        });
        if (listM147522n.size() > 5) {
            listM147522n = listM147522n.subList(0, 5);
        }
        boolean z = !listM147522n.isEmpty();
        ArrayList arrayList = new ArrayList(listM147522n);
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = act().getResources().getString(R$string.f39908g0);
        arrayList.add(0, topicMomentNew_);
        if (cmg.m111187O() && NullChecker.m82486a(this.f41524s)) {
            if (!m63967n1(this.f41524s)) {
                this.f41524s.add(0, topicMomentNew_);
            }
            C11409b c11409b = (C11409b) this.viewModel;
            int size = this.f41524s.size();
            ArrayList<TopicMoment> arrayList2 = this.f41524s;
            ArrayList<TopicMoment> arrayListSubList = arrayList2;
            if (size > 6) {
                arrayListSubList = arrayList2.subList(0, 6);
            }
            c11409b.m64113y1(arrayListSubList);
            ((C11409b) this.viewModel).m64059V1(true);
        } else {
            if (cmg.m111228p0()) {
                this.f41503F.m214895g(arrayList);
            }
            ((C11409b) this.viewModel).m64113y1(arrayList);
            ((C11409b) this.viewModel).m64059V1(z);
        }
        m63943S1(this.f41510e);
    }
}
