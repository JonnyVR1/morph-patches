package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedPostTitleTagConfig;
import com.p046p1.mobile.putong.feed.data.GroupIdBox;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p046p1.mobile.putong.feed.data.NewMomentDraft;
import com.p046p1.mobile.putong.feed.data.NotifyUser;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.UserSetVisibility;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.cjh;
import p149l.d30;
import p149l.djx;
import p149l.e30;
import p149l.e51;
import p149l.el00;
import p149l.ggi;
import p149l.hpd0;
import p149l.ib1;
import p149l.j760;
import p149l.jq2;
import p149l.k90;
import p149l.lsi0;
import p149l.m84;
import p149l.mcr;
import p149l.mkd0;
import p149l.nkg;
import p149l.nlg;
import p149l.o3i;
import p149l.oe40;
import p149l.orh;
import p149l.p980;
import p149l.qib0;
import p149l.qnd;
import p149l.rhi;
import p149l.rn5;
import p149l.roj0;
import p149l.sti;
import p149l.tih;
import p149l.u1j0;
import p149l.v9j;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11245a extends jq2<C11246b> {

    /* JADX INFO: renamed from: I */
    public static C22393b<String> f40649I = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public FeedPostTitleTagConfig f40650A;

    /* JADX INFO: renamed from: B */
    public ggi<NewMomentDraft> f40651B;

    /* JADX INFO: renamed from: C */
    public ggi<NewMomentDraft> f40652C;

    /* JADX INFO: renamed from: D */
    public hpd0 f40653D;

    /* JADX INFO: renamed from: E */
    public boolean f40654E;

    /* JADX INFO: renamed from: F */
    public u1j0 f40655F;

    /* JADX INFO: renamed from: G */
    public ArrayList<String> f40656G;

    /* JADX INFO: renamed from: H */
    public ArrayList<NotifyUsers> f40657H;

    /* JADX INFO: renamed from: a */
    public final int f40658a;

    /* JADX INFO: renamed from: b */
    public final int f40659b;

    /* JADX INFO: renamed from: c */
    public int f40660c;

    /* JADX INFO: renamed from: d */
    public C22392a<ArrayList<Media>> f40661d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f40662e;

    /* JADX INFO: renamed from: f */
    public boolean f40663f;

    /* JADX INFO: renamed from: g */
    public boolean f40664g;

    /* JADX INFO: renamed from: h */
    public String f40665h;

    /* JADX INFO: renamed from: i */
    public String f40666i;

    /* JADX INFO: renamed from: j */
    public String f40667j;

    /* JADX INFO: renamed from: k */
    public String f40668k;

    /* JADX INFO: renamed from: l */
    public boolean f40669l;

    /* JADX INFO: renamed from: m */
    public String f40670m;

    /* JADX INFO: renamed from: n */
    public String f40671n;

    /* JADX INFO: renamed from: o */
    public DoublePair f40672o;

    /* JADX INFO: renamed from: p */
    public Audio f40673p;

    /* JADX INFO: renamed from: q */
    public MomentShareInfoParcelable f40674q;

    /* JADX INFO: renamed from: r */
    public String f40675r;

    /* JADX INFO: renamed from: s */
    public ArrayList<TopicMoment> f40676s;

    /* JADX INFO: renamed from: t */
    public String f40677t;

    /* JADX INFO: renamed from: u */
    public boolean f40678u;

    /* JADX INFO: renamed from: v */
    public double[] f40679v;

    /* JADX INFO: renamed from: w */
    public boolean f40680w;

    /* JADX INFO: renamed from: x */
    public BubbleInfo f40681x;

    /* JADX INFO: renamed from: y */
    public BubbleInfo f40682y;

    /* JADX INFO: renamed from: z */
    public NewPostAct f40683z;

    public C11245a(mcr mcrVar) {
        super(mcrVar);
        this.f40658a = 1;
        this.f40659b = 2;
        this.f40660c = 1;
        this.f40661d = C22392a.m221512b();
        this.f40651B = new ggi<>(new qnd("new_moment_draft_text", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f40652C = new ggi<>(new qnd("new_moment_draft_media", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);
        this.f40653D = FeedModule.f38855d.f193019U;
        this.f40656G = new ArrayList<>();
        this.f40657H = new ArrayList<>();
        this.f40683z = (NewPostAct) mcrVar;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m62706C0(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            ib1.m135233b().mo135237e(FeedAudioRecordView.f40559y);
            ib1.m135233b().mo135237e(rn5.f160238g);
            ib1.m135233b().mo135237e(FeedAudioPlayerView.f43329w);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m62707D0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m62708E0(Throwable th) {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m62709F0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Media m62713J0(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: c1 */
    public static C22306c<String> m62716c1() {
        return f40649I.asObservable();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m62717e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m62719f1(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.d440
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62725l0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.f440
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62707D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m62725l0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            f40649I.onNext(str);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private boolean m62730p1(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iM112146b = djx.m112144h().m112146b();
            int iM112148d = djx.m112144h().m112148d();
            for (Media media : arrayList) {
                if (media instanceof Video) {
                    return true;
                }
                if (media instanceof Picture) {
                    Picture picture = (Picture) media;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(rhi.m179382z(picture.url), options);
                    picture.nullCheck();
                    Dimension dimension = picture.size;
                    dimension.width = options.outWidth;
                    dimension.height = options.outHeight;
                    int iBigAspectRate = picture.bigAspectRate();
                    if (picture.isHorizontal() && iBigAspectRate > iM112146b) {
                        lsi0.m151595y("图片宽度超出上限");
                        return false;
                    }
                    if (!picture.isHorizontal() && iBigAspectRate > iM112148d) {
                        lsi0.m151595y("图片长度超出上限");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m62733s0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m62736u1(Bundle bundle) {
        ((C11246b) this.viewModel).m62847D0(bundle);
        ((C11246b) this.viewModel).m62928x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m62740z1(Boolean bool) {
        ((C11246b) this.viewModel).m62846C1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m62741B1(Map map) {
        final BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m60222H().me_().f56011id);
        String str = sti.f166363g.get();
        if (!TextUtils.isEmpty(str) && bubbleInfo != null) {
            for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
                if (NullChecker.m81303a(stateEmotion) && !vwb.m200296J(stateEmotion.emotions)) {
                    Emotion emotion = (Emotion) vwb.m200346r(stateEmotion.emotions, new w9j() { // from class: l.l440
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            Emotion emotion2 = (Emotion) obj;
                            return Boolean.valueOf(NullChecker.m81303a(emotion2) && TextUtils.equals(bubbleInfo.emotion.f38748id, emotion2.f38748id));
                        }
                    });
                    if (NullChecker.m81303a(emotion)) {
                        bubbleInfo.emotion.backgroundColor = emotion.backgroundColor;
                        break;
                    }
                }
            }
        }
        if (bubbleInfo != null) {
            this.f40682y = bubbleInfo;
            this.f40681x = bubbleInfo;
            ((C11246b) this.viewModel).m62881Y1();
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m62742C1(j760 j760Var) {
        for (final TopicMoment topicMoment : (List) j760Var.f116565b) {
            if (NullChecker.m81303a(this.f40662e)) {
                topicMoment.selected = vwb.m200337m(this.f40662e, new w9j() { // from class: l.z340
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                    }
                });
            }
        }
        m62761T1(j760Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m62743D1(ggi.C17074a c17074a) {
        act().progressDismiss();
        if (c17074a == null) {
            return;
        }
        ArrayList<TopicMoment> arrayList = (ArrayList) ((NewMomentDraft) c17074a.f102512a).topics;
        if (!vwb.m200296J(arrayList)) {
            m62760S1(arrayList);
        }
        ((C11246b) this.viewModel).m62923u1((NewMomentDraft) c17074a.f102512a);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m62744E1(d30 d30Var) {
        act().progressDismiss();
        d30Var.call();
        FeedDraftView.m65101P(true);
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m62745F1(Audio audio, String str, ArrayList arrayList, final d30 d30Var) {
        ArrayList<Media> arrayListM62777g1 = m62777g1();
        if (!m62785o1(arrayListM62777g1)) {
            arrayListM62777g1 = new ArrayList<>();
        }
        if (arrayListM62777g1.size() == 0 && NullChecker.m81303a(audio)) {
            arrayListM62777g1.add(audio);
        }
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = arrayListM62777g1;
        newMomentDraftNew_.text = str;
        newMomentDraftNew_.topics = arrayList;
        if (this.f40660c == 1 && arrayListM62777g1.size() > 0) {
            this.f40660c = 2;
            FeedModule.f38855d.f193021V.put(Boolean.FALSE);
        } else if (this.f40660c == 2 && arrayListM62777g1.size() == 0) {
            this.f40660c = 1;
            this.f40653D.put(Boolean.FALSE);
        }
        int i = this.f40660c;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f40651B.m125978p(newMomentDraftNew_);
            FeedModule.f38855d.f193021V.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f40652C.m125978p(newMomentDraftNew_);
            this.f40653D.put(Boolean.TRUE);
        }
        e51.m114742G(new Runnable() { // from class: l.u340
            @Override // java.lang.Runnable
            public final void run() {
                this.f173571a.m62744E1(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m62746H1(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        this.f40670m = k90Var.m144984c();
        this.f40671n = k90Var.m144982a();
        this.f40672o = k90Var.m144983b();
        ((C11246b) this.viewModel).m62870R1();
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m62747I1() {
        return this.f40673p == null;
    }

    /* JADX INFO: renamed from: J1 */
    public void m62748J1(Intent intent) {
        ArrayList<Media> arrayListM62777g1 = m62777g1();
        if (NullChecker.m81304b(intent) && NullChecker.m81303a(intent.getSerializableExtra("extra_images"))) {
            Collection<? extends Media> collection = (ArrayList) intent.getSerializableExtra("extra_images");
            if (this.f40669l) {
                arrayListM62777g1.addAll(collection);
            } else {
                arrayListM62777g1 = collection;
            }
            this.f40661d.onNext(arrayListM62777g1);
            ((C11246b) this.viewModel).m62932z1(arrayListM62777g1);
        }
        ((C11246b) this.viewModel).m62858J1();
        if (arrayListM62777g1.size() == 0) {
            return;
        }
        ((C11246b) this.viewModel).m62893f0(arrayListM62777g1);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m62749L1(String str, MessageLocation messageLocation) {
        MomentShareInfoParcelable momentShareInfoParcelable;
        boolean z = NullChecker.m81303a(this.f40682y) && NullChecker.m81303a(this.f40681x) && TextUtils.equals(this.f40681x.f38730id, this.f40682y.f38730id);
        if (nkg.m159909u0() && NullChecker.m81303a(this.f40681x) && !z) {
            m62750N1();
        }
        Moment moment = new Moment();
        ArrayList<Media> arrayListM62777g1 = m62777g1();
        if (!m62785o1(arrayListM62777g1)) {
            arrayListM62777g1 = new ArrayList<>();
        }
        if (!m62730p1(arrayListM62777g1)) {
            return false;
        }
        if (arrayListM62777g1.size() == 0 && !m62747I1()) {
            arrayListM62777g1.add(this.f40673p);
        }
        moment.media = arrayListM62777g1;
        moment.value = str;
        moment.location = messageLocation;
        if (!TextUtils.isEmpty(this.f40675r)) {
            GroupIdBox groupIdBox = new GroupIdBox();
            moment.group = groupIdBox;
            groupIdBox.f39223id = this.f40675r;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : arrayListM62777g1) {
            if (NullChecker.m81304b(media) && NullChecker.m81303a(media.meta) && !TextUtils.isEmpty(media.meta.sticker)) {
                arrayList.add(media.meta.sticker);
            }
        }
        if (!vwb.m200296J(arrayList)) {
            moment.setCameraStickerIds(arrayList);
        }
        if (NullChecker.m81303a(this.f40662e) && this.f40662e.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (TopicMoment topicMoment : this.f40662e) {
                TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
                topicMomentIdBox.f38824id = topicMoment.f39247id;
                topicMomentIdBox.name = topicMoment.name;
                arrayList2.add(topicMomentIdBox);
            }
            moment.topics = arrayList2;
            moment.mTopicList = this.f40662e;
        }
        moment.userSetVisibility = UserSetVisibility.get(el00.m117022k().m117030o(((C11246b) this.viewModel).m62918s0()));
        m62719f1(str);
        moment.nullCheck();
        if (nkg.m159861R()) {
            moment.allowForward = ((C11246b) this.viewModel).f40732y.isChecked() ? MomentAllowForwardState.get(MomentAllowForwardState.allow) : MomentAllowForwardState.get(MomentAllowForwardState.disallow);
        } else {
            moment.allowForward = null;
        }
        moment.additionalData.sendFrom = null;
        boolean zM81303a = NullChecker.m81303a(this.f40674q);
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        if (zM81303a) {
            momentAdditionalData.share = this.f40674q;
        } else {
            momentAdditionalData.share = null;
        }
        if (nkg.m159914x() && !vwb.m200296J(this.f40657H)) {
            ArrayList arrayList3 = new ArrayList();
            for (final NotifyUsers notifyUsers : this.f40657H) {
                if (!vwb.m200337m(arrayList3, new w9j() { // from class: l.c440
                    @Override // p149l.w9j
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
        String str2 = (!"share".equals(((NewPostAct) act()).f40620c) || (momentShareInfoParcelable = this.f40674q) == null) ? ((NewPostAct) act()).f40620c : momentShareInfoParcelable.name;
        moment.from = str2;
        if (nkg.m159891l0()) {
            moment.isNewUserAIMoment = this.f40678u;
        }
        oe40.m163818T(act(), moment, ((NewPostAct) act()).f40620c);
        if (nkg.m159891l0() && this.f40678u) {
            FeedModule.f38855d.f192976A1.onNext(roj0.f160388a);
        }
        if (!vwb.m200296J(moment.notifyUsers)) {
            orh.m165576i();
        }
        if (!"share".equals(((NewPostAct) act()).f40620c) && !"from_h5_moment_level_open_camera".equals(((NewPostAct) act()).f40620c)) {
            m62755Q0(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: N1 */
    public void m62750N1() {
        FeedModule.f38856e.m132649V0(this.f40681x, "p_moment_post");
    }

    /* JADX INFO: renamed from: O0 */
    public void m62751O0(NotifyUsers notifyUsers, boolean z) {
        ((C11246b) this.viewModel).m62886a0(notifyUsers.name, z);
    }

    /* JADX INFO: renamed from: O1 */
    public void m62752O1() {
        ggi<NewMomentDraft> ggiVar;
        if ("share".equals(((NewPostAct) act()).f40620c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) act()).f40620c)) {
            if (this.f40660c == 2) {
                this.f40661d.onNext(new ArrayList<>());
            }
        } else {
            if (this.f40678u) {
                return;
            }
            if (this.f40660c == 1 && FeedModule.f38855d.f193021V.get().booleanValue()) {
                ggiVar = this.f40651B;
            } else if (this.f40660c != 2 || !this.f40653D.get().booleanValue() || !this.f40663f) {
                return;
            } else {
                ggiVar = this.f40652C;
            }
            act().progress(R$string.f39001X1);
            duringCreated((C22306c) ggiVar.m125973k().compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.m340
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131012a.m62743D1((ggi.C17074a) obj);
                }
            }));
        }
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(C11246b c11246b) {
        super.mo51532C(c11246b);
        if (nkg.m159899p0()) {
            this.f40655F = new u1j0(act(), c11246b);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m62754P1(List<TopicMoment> list) {
        int i;
        Iterator<TopicMoment> it = ((C11246b) this.viewModel).m62920t0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                it.next().selected = false;
            }
        }
        if (vwb.m200296J(list)) {
            return;
        }
        for (i = 0; i < list.size(); i++) {
            TopicMoment topicMoment = list.get(i);
            for (TopicMoment topicMoment2 : ((C11246b) this.viewModel).m62920t0()) {
                if (topicMoment.f39247id.equals(topicMoment2.f39247id)) {
                    topicMoment2.selected = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m62755Q0(d30 d30Var) {
        m62757R0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        FeedDraftView.m65101P(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m62756Q1(String str) {
        duringCreated(FeedModule.f38855d.m209473hd(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.r340
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62733s0((roj0) obj);
            }
        }, new e30() { // from class: l.s340
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f38981U);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m62757R0() {
        hpd0 hpd0Var = FeedModule.f38855d.f193021V;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f40651B.m125967c();
        this.f40653D.put(bool);
        this.f40652C.m125967c();
    }

    /* JADX INFO: renamed from: R1 */
    public void m62758R1(Intent intent) {
        String stringExtra = intent.getStringExtra("framePath");
        ArrayList<Media> arrayListM62777g1 = m62777g1();
        if (TextUtils.isEmpty(stringExtra) || arrayListM62777g1.size() <= 0 || !(arrayListM62777g1.get(0) instanceof Video)) {
            return;
        }
        arrayListM62777g1.get(0).cover().url = rhi.m179355B(stringExtra);
        ((C11246b) this.viewModel).m62850F1(vwb.m200303Q(arrayListM62777g1, new w9j() { // from class: l.i340
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C11245a.m62713J0((Media) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public void m62759S0(TopicMoment topicMoment) {
        m62762U0(topicMoment, true);
    }

    /* JADX INFO: renamed from: S1 */
    public void m62760S1(ArrayList<TopicMoment> arrayList) {
        this.f40662e = arrayList;
        m62754P1(arrayList);
        ((C11246b) this.viewModel).m62856I1(arrayList);
    }

    /* JADX INFO: renamed from: T1 */
    public void m62761T1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        if (j760Var == null) {
            return;
        }
        for (final TopicMoment topicMoment : j760Var.f116565b) {
            topicMoment.selected = vwb.m200337m(this.f40662e, new w9j() { // from class: l.y340
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                }
            });
        }
        ((C11246b) this.viewModel).m62860K1(j760Var);
    }

    /* JADX INFO: renamed from: U0 */
    public void m62762U0(final TopicMoment topicMoment, boolean z) {
        TopicMoment topicMoment2 = (TopicMoment) vwb.m200346r(this.f40662e, new w9j() { // from class: l.l340
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
            }
        });
        if (NullChecker.m81303a(topicMoment2)) {
            if (!z) {
                lsi0.m151595y("存在重复话题");
                return;
            }
            this.f40662e.remove(topicMoment2);
        } else if (this.f40662e.size() >= 3) {
            lsi0.m151593w(R$string.f39137r1);
            return;
        } else if (!m62769X1(topicMoment, this.f40662e)) {
            this.f40662e.add(topicMoment);
            if (topicMoment.isActivityTopic()) {
                nlg.m160044g().m160047d(act(), topicMoment.details.tips);
            }
        }
        m62760S1(this.f40662e);
    }

    /* JADX INFO: renamed from: U1 */
    public void m62763U1(final d30 d30Var, final String str, final Audio audio, final ArrayList<TopicMoment> arrayList) {
        act().progress(R$string.f38984U2);
        m62757R0();
        e51.m114774y(new Runnable() { // from class: l.q340
            @Override // java.lang.Runnable
            public final void run() {
                this.f152370a.m62745F1(audio, str, arrayList, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m62764V0(ArrayList<Media> arrayList) {
        this.f40663f = act().getIntent().getBooleanExtra("read_draft", false);
        m62772Z1(arrayList);
        m62752O1();
        m62771Y1();
    }

    /* JADX INFO: renamed from: V1 */
    public void m62765V1(BubbleInfo bubbleInfo) {
        this.f40681x = bubbleInfo;
    }

    /* JADX INFO: renamed from: W0 */
    public void m62766W0(TopicMoment topicMoment) {
        this.f40662e.remove(topicMoment);
        m62760S1(this.f40662e);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m62767W1() {
        p980.m167863f(act()).subscribe(mkd0.m154956H(new e30() { // from class: l.j440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116140a.m62746H1((k90) obj);
            }
        }, new e30() { // from class: l.k440
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62708E0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public void m62768X0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f40654E = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.v340
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179622a.m62786q1(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.w340
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184302a.m62787r1(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public final boolean m62769X1(TopicMoment topicMoment, ArrayList<TopicMoment> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return false;
        }
        if (arrayList.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.m151595y("只能添加一条匿名话题");
            } else if (nkg.m159858O()) {
                lsi0.m151595y("你已添加匿名话题，不可同选当前话题");
            } else {
                lsi0.m151595y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (nkg.m159858O()) {
            lsi0.m151595y("匿名话题与已添加话题不可同选");
        } else {
            lsi0.m151595y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m62770Y0(String str, d30 d30Var) {
        m62768X0(str, DetectCategoryType.get("moment"), "moment", null, d30Var);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m62771Y1() {
        if (nkg.m159914x()) {
            if (!TextUtils.isEmpty(this.f40677t)) {
                NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(this.f40677t);
                if (orh.m165575h(notifyUsersM209356R7)) {
                    m62751O0(notifyUsersM209356R7, false);
                }
            }
            Iterator<TopicMoment> it = this.f40662e.iterator();
            while (it.hasNext()) {
                NotifyUsers notifyUsersM165573f = orh.m165573f(it.next());
                if (NullChecker.m81303a(notifyUsersM165573f) && !this.f40657H.contains(notifyUsersM165573f) && orh.m165575h(notifyUsersM165573f)) {
                    m62751O0(notifyUsersM165573f, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m62772Z1(ArrayList<Media> arrayList) {
        if (arrayList.size() != 0) {
            this.f40660c = 2;
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(m84.m153429e().f132516g).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.g440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100540a.m62740z1((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.h440
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62706C0((C4319c) obj);
            }
        }));
        if (vqg.m199540d0()) {
            this.f40680w = tih.m189190f();
        } else {
            this.f40680w = tih.m189191g();
        }
        if (this.f40680w && cjh.m107158d()) {
            m62767W1();
        }
        if (nkg.m159909u0()) {
            duringCreated(FeedModule.f38855d.m209307K7()).subscribe(mkd0.m154955G(new e30() { // from class: l.i440
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111406a.m62741B1((Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m62773a1(final String str) {
        m62768X0(str, DetectCategoryType.get("moment"), "topic", "发布内容包含不友善词汇，请重新输入", new d30() { // from class: l.k340
            @Override // p149l.d30
            public final void call() {
                this.f120794a.m62789t1(str);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m62774b1(Bundle bundle) {
        try {
            this.f40670m = bundle.getString("extra_addressInfo_name");
            this.f40671n = bundle.getString("extra_addressInfo_address");
            this.f40672o = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            App.f15368d.m20433k(e);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m62775d1() {
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            if (o3i.m162430d() && NullChecker.m81303a(stateEmotion) && !vwb.m200296J(stateEmotion.emotions)) {
                final String strM162429c = o3i.m162429c();
                Emotion emotion = (Emotion) vwb.m200346r(stateEmotion.emotions, new w9j() { // from class: l.n340
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Emotion emotion2 = (Emotion) obj;
                        return Boolean.valueOf(NullChecker.m81303a(emotion2) && TextUtils.equals(strM162429c, emotion2.f38748id));
                    }
                });
                if (NullChecker.m81303a(emotion) && this.f40681x == null) {
                    BubbleInfo bubbleInfo = new BubbleInfo();
                    bubbleInfo.emotion = emotion;
                    TextTheme textTheme = new TextTheme();
                    textTheme.backgroundColor = emotion.backgroundColor;
                    bubbleInfo.textTheme = textTheme;
                    this.f40681x = bubbleInfo;
                    ((C11246b) this.viewModel).m62881Y1();
                }
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public BubbleInfo m62776e1() {
        return this.f40681x;
    }

    /* JADX INFO: renamed from: g1 */
    public ArrayList<Media> m62777g1() {
        ArrayList<Media> arrayListM221515e = this.f40661d.m221515e();
        return arrayListM221515e == null ? new ArrayList<>() : arrayListM221515e;
    }

    /* JADX INFO: renamed from: h1 */
    public void m62778h1(ArrayList<Media> arrayList) {
        this.f40661d.onNext(arrayList);
    }

    /* JADX INFO: renamed from: i1 */
    public void m62779i1(Bundle bundle) {
        creates(new e30() { // from class: l.t340
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167591a.m62736u1((Bundle) obj);
            }
        });
        duringCreated(this.f40661d).subscribe(mkd0.m154955G(new e30() { // from class: l.e440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89248a.m62790v1((ArrayList) obj);
            }
        }));
        m62781k1(((NewPostAct) act()).f40620c);
    }

    /* JADX INFO: renamed from: j1 */
    public void m62780j1() {
        FeedModule.f38855d.m209410Yc("suggest");
        duringCreated(new v9j() { // from class: l.o340
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.m209440d8().distinctUntilChanged();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.p340
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146959a.m62791x1((j760) obj);
            }
        }));
        m62760S1(this.f40662e);
    }

    /* JADX INFO: renamed from: k1 */
    public void m62781k1(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("feed_post_title_tag_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            List<FeedPostTitleTagConfig> list = FeedPostTitleTagConfig.JSON_ADAPTER.ARRAY_ADAPTER().parse(strM79302F);
            if (vwb.m200296J(list)) {
                return;
            }
            for (FeedPostTitleTagConfig feedPostTitleTagConfig : list) {
                if (TextUtils.equals(str, feedPostTitleTagConfig.from)) {
                    this.f40650A = feedPostTitleTagConfig;
                    if (TextUtils.isEmpty(this.f40668k)) {
                        this.f40668k = this.f40650A.hint;
                        return;
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m62782l1() {
        duringCreated(FeedModule.f38855d.m209426b8()).subscribe(mkd0.m154956H(new e30() { // from class: l.m440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131227a.m62742C1((j760) obj);
            }
        }, new e30() { // from class: l.j340
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62709F0((Throwable) obj);
            }
        }));
        m62756Q1("moment");
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m62783m1() {
        return "immersion_cartoon_effects".equals(((NewPostAct) act()).f40620c);
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m62784n1(ArrayList<TopicMoment> arrayList) {
        return arrayList.size() != 0 && TextUtils.equals(arrayList.get(0).name, act().getResources().getString(R$string.f39060g0));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m62785o1(ArrayList<Media> arrayList) {
        return (vwb.m200296J(arrayList) || !NullChecker.m81303a(arrayList.get(0)) || TextUtils.isEmpty(arrayList.get(0).url)) ? false : true;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m62786q1(d30 d30Var, String str, Envelope envelope) {
        this.f40654E = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m199555l(detect, "p_moment_post")) {
            lsi0.m151593w(R$string.f39141s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f38996W2);
        } else {
            lsi0.m151595y(str);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m62787r1(d30 d30Var, Throwable th) {
        this.f40654E = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m62788s1(TopicMoment topicMoment) {
        m62762U0(topicMoment, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m62789t1(String str) {
        duringCreated(FeedModule.f38855d.m209355R6(FeedModule.m60221F().userId(), str)).subscribe(mkd0.m154956H(new e30() { // from class: l.a440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67441a.m62788s1((TopicMoment) obj);
            }
        }, new e30() { // from class: l.b440
            @Override // p149l.e30
            public final void call(Object obj) {
                C11245a.m62717e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m62790v1(ArrayList arrayList) {
        boolean zM199531Y = vqg.m199531Y(arrayList);
        V v2 = this.viewModel;
        if (zM199531Y) {
            ((C11246b) v2).m62843A1(arrayList);
            ((C11246b) this.viewModel).m62850F1(new ArrayList<>());
        } else {
            ((C11246b) v2).m62850F1(arrayList);
            ((C11246b) this.viewModel).m62895g0();
        }
        ((C11246b) this.viewModel).m62858J1();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m62791x1(j760 j760Var) {
        List listM200339n = vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.x340
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        });
        if (listM200339n.size() > 5) {
            listM200339n = listM200339n.subList(0, 5);
        }
        boolean z = !listM200339n.isEmpty();
        ArrayList arrayList = new ArrayList(listM200339n);
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.name = act().getResources().getString(R$string.f39060g0);
        arrayList.add(0, topicMomentNew_);
        if (nkg.m159858O() && NullChecker.m81303a(this.f40676s)) {
            if (!m62784n1(this.f40676s)) {
                this.f40676s.add(0, topicMomentNew_);
            }
            C11246b c11246b = (C11246b) this.viewModel;
            int size = this.f40676s.size();
            ArrayList<TopicMoment> arrayList2 = this.f40676s;
            ArrayList<TopicMoment> arrayListSubList = arrayList2;
            if (size > 6) {
                arrayListSubList = arrayList2.subList(0, 6);
            }
            c11246b.m62930y1(arrayListSubList);
            ((C11246b) this.viewModel).m62876V1(true);
        } else {
            if (nkg.m159899p0()) {
                this.f40655F.m191422g(arrayList);
            }
            ((C11246b) this.viewModel).m62930y1(arrayList);
            ((C11246b) this.viewModel).m62876V1(z);
        }
        m62760S1(this.f40662e);
    }
}
