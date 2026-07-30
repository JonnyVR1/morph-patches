package com.p046p1.mobile.putong.feed.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.api.FeedServiceImpl;
import com.p046p1.mobile.putong.feed.data.Configs;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p046p1.mobile.putong.feed.data.StateGuide;
import com.p046p1.mobile.putong.feed.data.ThirdShareSource;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.UserSetVisibility;
import com.p046p1.mobile.putong.feed.newui.camera.IVVideoEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p046p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p046p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumfans.PhotoAlbumFansAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p046p1.mobile.putong.feed.p060ui.moments.CaptionAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedFrag;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedPreviewAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfilePreviewAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileTextAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsSimpleTextAct;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VImage;
import p149l.C18367m2;
import p149l.a8h;
import p149l.aug;
import p149l.beh;
import p149l.chh;
import p149l.d30;
import p149l.dpl;
import p149l.e30;
import p149l.exq;
import p149l.f3c0;
import p149l.f8c;
import p149l.hli;
import p149l.hpd0;
import p149l.hrg;
import p149l.j760;
import p149l.k8k0;
import p149l.k90;
import p149l.kyg;
import p149l.lsi0;
import p149l.m3i;
import p149l.mah;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n3h;
import p149l.nbq0;
import p149l.nkg;
import p149l.o3h;
import p149l.o3i;
import p149l.o6c0;
import p149l.oe40;
import p149l.okg;
import p149l.omg;
import p149l.p980;
import p149l.pmg;
import p149l.q860;
import p149l.qi00;
import p149l.qmg;
import p149l.r7i;
import p149l.rmg;
import p149l.roj0;
import p149l.rrl;
import p149l.s1i;
import p149l.srl;
import p149l.sti;
import p149l.swh;
import p149l.t2h;
import p149l.u2h;
import p149l.ubx;
import p149l.ufh;
import p149l.uuv;
import p149l.vb4;
import p149l.vch;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.wch;
import p149l.xaj0;
import p149l.xia;
import p149l.xzl;
import p149l.ya00;
import p149l.ywl;
import p149l.z7h;
import p149l.zi60;
import p149l.zij0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
@Route(name = "feed服务", path = "/feed_service/service")
public class FeedServiceImpl implements FeedService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f39190a = new okg();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.FeedServiceImpl$a */
    public static /* synthetic */ class C10733a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39191a;

        static {
            int[] iArr = new int[FeedMomentListType.values().length];
            f39191a = iArr;
            try {
                iArr[FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39191a[FeedMomentListType.LIVE_SQUARE_DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m60233F(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m60234H(Envelope envelope) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m60236K(Act act, boolean z, User user, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.m151587q(z ? act.getString(R$string.f38909I) : act.getString(R$string.f38982U0), act.getResources().getDrawable(f3c0.f94467Z1));
        FeedModule.f38855d.m209437cc(user.f56011id, !z);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ xaj0 m60237L(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m60222H().me_().f56011id);
        if (bubbleInfo == null) {
            return new xaj0(null, null, null);
        }
        Emotion emotion = bubbleInfo.emotion;
        return new xaj0(emotion.f38748id, emotion.text, emotion.emojiUrl);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m60238M(MessageLocation messageLocation, Moment moment, e30 e30Var, k90 k90Var) {
        if (NullChecker.m81303a(k90Var)) {
            messageLocation.name = k90Var.m144984c();
            messageLocation.address = k90Var.m144982a();
            messageLocation.coordinates = k90Var.m144983b();
        }
        moment.location = messageLocation;
        FeedModule.f38854c.m60735k4(moment, e30Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m60241Q(Moment moment, MessageLocation messageLocation, e30 e30Var, Throwable th) {
        moment.location = messageLocation;
        FeedModule.f38854c.m60735k4(moment, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ q860 m60242R(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m219047b(q860Var.f153135a, jsonAdapter), q860Var.f153136b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m60243S(long j, final Moment moment) {
        String str;
        String str2;
        int i;
        int i2;
        List<Moment> listM221515e;
        if (moment == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(moment.media)) {
            if (TextUtils.isEmpty(moment.value)) {
                str = "";
                str2 = str;
                i = 0;
            } else {
                i2 = 3;
            }
            if (i > 0) {
                f8c.m119878o().m119881B(new d30() { // from class: l.bzh
                    @Override // p149l.d30
                    public final void call() {
                        FeedServiceImpl.m60244T(moment);
                    }
                });
                FeedModule.m60222H().mo30798mq(moment.owner, moment.f56011id, i, arrayList, moment.value, str, moment.createdTime, str2);
                listM221515e = FeedModule.f38855d.f193067s0.m221515e();
                if (vwb.m200296J(listM221515e)) {
                    FeedModule.m60222H().mo30796ml(moment.owner);
                    return;
                }
                if (mqi0.m155944o() - ((long) listM221515e.get(0).createdTime) > j) {
                    FeedModule.m60222H().mo30796ml(moment.owner);
                }
            }
        }
        boolean z = moment.media.get(0) instanceof Audio;
        List<Media> list = moment.media;
        if (z) {
            String str3 = String.format("%s''", Integer.valueOf(Math.round(((Audio) list.get(0)).duration)));
            i2 = 4;
            str = str3;
            str2 = "";
        } else {
            boolean z2 = list.get(0) instanceof Video;
            List<Media> list2 = moment.media;
            if (z2) {
                String str4 = String.format("%.1f", Float.valueOf(((Video) list2.get(0)).duration));
                arrayList.add(moment.media.get(0).cover().url);
                i2 = 2;
                str2 = str4;
                str = "";
            } else {
                Iterator<Media> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().cover().url);
                }
                i2 = 1;
            }
        }
        i = i2;
        if (i > 0) {
            f8c.m119878o().m119881B(new d30() { // from class: l.bzh
                @Override // p149l.d30
                public final void call() {
                    FeedServiceImpl.m60244T(moment);
                }
            });
            FeedModule.m60222H().mo30798mq(moment.owner, moment.f56011id, i, arrayList, moment.value, str, moment.createdTime, str2);
            listM221515e = FeedModule.f38855d.f193067s0.m221515e();
            if (vwb.m200296J(listM221515e)) {
                FeedModule.m60222H().mo30796ml(moment.owner);
                return;
            }
            if (mqi0.m155944o() - ((long) listM221515e.get(0).createdTime) > j) {
                FeedModule.m60222H().mo30796ml(moment.owner);
            }
        }
        str = "";
        str2 = str;
        i = i2;
        if (i > 0) {
            f8c.m119878o().m119881B(new d30() { // from class: l.bzh
                @Override // p149l.d30
                public final void call() {
                    FeedServiceImpl.m60244T(moment);
                }
            });
            FeedModule.m60222H().mo30798mq(moment.owner, moment.f56011id, i, arrayList, moment.value, str, moment.createdTime, str2);
            listM221515e = FeedModule.f38855d.f193067s0.m221515e();
            if (vwb.m200296J(listM221515e)) {
                FeedModule.m60222H().mo30796ml(moment.owner);
                return;
            }
            if (mqi0.m155944o() - ((long) listM221515e.get(0).createdTime) > j) {
                FeedModule.m60222H().mo30796ml(moment.owner);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m60244T(Moment moment) {
        FeedModule.f38860i.f77913c.upsert(moment);
        FeedModule.m60222H().mo30825uf(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m60246W(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m60248Y(Moment moment, Throwable th) {
        lsi0.m151595y("发布失败");
        zi60.m218961w().m218983o(moment, "p_moment_post", th, false, null);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m60249Z(Moment moment, long j, roj0 roj0Var) {
        lsi0.m151595y("发布成功");
        r7i.m178139j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        zi60.m218961w().m218982n(moment, "p_moment_post", 201, false, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ q860 m60252c0(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m219047b(q860Var.f153135a, jsonAdapter), q860Var.f153136b);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ q860 m60253d0(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m219047b(q860Var.f153135a, jsonAdapter), q860Var.f153136b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ j760 m60256g0(JsonAdapter jsonAdapter, j760 j760Var) {
        return new j760((Integer) j760Var.f116564a, zij0.m219048c((ValueObject) j760Var.f116565b, jsonAdapter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Moment m60257h0(xaj0 xaj0Var) {
        return (Moment) xaj0Var.f191751a;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Af */
    public void mo60258Af(Context context, Media media, ArrayList<Media> arrayList) {
        context.startActivity(NewAlbumPreviewNoEditAct.m62327g2(context, media, arrayList));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ah */
    public boolean mo60259Ah() {
        return FeedModule.f38858g.m121845a();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: At */
    public String mo60260At() {
        return uuv.m196014d0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bd */
    public boolean mo60261Bd() {
        return nkg.m159873c0() || nkg.m159875d0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bg */
    public C22306c<Envelope> mo60262Bg(String str, String str2) {
        return FeedModule.f38855d.m209290Hb(str, str2, true);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bh */
    public void mo60263Bh(Act act, boolean z) {
        hrg.m132673g().m132676f(act, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bj */
    public boolean mo60264Bj() {
        return FeedModule.f38855d.f193029Z.get().booleanValue();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: C6 */
    public qmg mo60265C6(FeedMomentListType feedMomentListType) {
        int i = C10733a.f39191a[feedMomentListType.ordinal()];
        if (i != 1) {
            return i != 2 ? new rmg() : new pmg();
        }
        return new rmg();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ca */
    public <T extends ValueObject> List<T> mo60266Ca(Envelope envelope, JsonAdapter<T> jsonAdapter) {
        return zij0.m219047b(((FeedData) envelope.getModuleData(FeedData.class)).moments, jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Co */
    public boolean mo60267Co() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Cr */
    public void mo60268Cr(Act act, String str, e30<Boolean> e30Var) {
        vqg.m199497B(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: D8 */
    public void mo60269D8(String str, String str2) {
        FeedModule.f38860i.f77913c.m189029L(str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Dk */
    public void mo60270Dk(Act act, String str, String str2, String str3) {
        BubbleInfo bubbleInfoM209293I7 = FeedModule.f38855d.m209293I7();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bubbleInfoM209293I7);
        act.startActivity(FeedStatusPageAct.m65561q2(act, arrayList, 0, "", str3));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: E6 */
    public Intent mo60271E6(Context context, String str, String str2) {
        return QATopicAggregationActivity.m65975V1(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ea */
    public void mo60272Ea() {
        m3i.m152923m().m152929l();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ee */
    public void mo60273Ee(Envelope envelope, HashMap<String, List<Media>> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (vwb.m200296J(list)) {
            return;
        }
        for (Moment moment : list) {
            if (!vwb.m200296J(moment.media)) {
                if (map.containsKey(moment.owner)) {
                    map.get(moment.owner).addAll(moment.media);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(moment.media);
                    map.put(moment.owner, arrayList);
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ek */
    public boolean mo60274Ek(User user) {
        return swh.m186175l(user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Fm */
    public void mo60275Fm(String str, boolean z) {
        PhotoAlbumFeedFrag.f41626G.onNext(new j760<>(str, Boolean.valueOf(z)));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gc */
    public BubbleInfo mo60276Gc() {
        return FeedModule.f38855d.m209293I7();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gk */
    public nbq0 mo60277Gk(Act act, String str) {
        return new FeedWriterLevelView(act, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gm */
    public List<String> mo60278Gm() {
        return vqg.f182645i;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: H7 */
    public C22393b<j760<Boolean, Boolean>> mo60279H7() {
        return FeedStatusPageAct.f42749B;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ha */
    public boolean mo60280Ha() {
        return FeedModule.f38855d.f193033b0.get().booleanValue();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Hj */
    public boolean mo60281Hj() {
        return nkg.m159900q();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ib */
    public boolean mo60282Ib(String str) {
        return TextUtils.equals(str, "p_meet_greet") || TextUtils.equals(str, "p_state_explore");
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: In */
    public void mo60283In(RelativeLayout relativeLayout, VImage vImage) {
        vImage.setImageResource(u2h.m191499h() ? f3c0.f94590o5 : f3c0.f94582n5);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Jg */
    public void mo60284Jg(Act act, String str, String str2) {
        final Moment moment = new Moment();
        moment.value = str;
        moment.userSetVisibility = UserSetVisibility.get("everyone");
        moment.nullCheck();
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        momentAdditionalData.sendFrom = null;
        momentAdditionalData.share = null;
        ThirdShareSource thirdShareSourceNew_ = ThirdShareSource.new_();
        thirdShareSourceNew_.sourceId = str2;
        thirdShareSourceNew_.sourceType = BLiveType.voiceLive;
        moment.thirdShareSource = thirdShareSourceNew_;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f38855d.m209255Cc(moment).subscribe(mkd0.m154956H(new e30() { // from class: l.ezh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60249Z(moment, jElapsedRealtime, (roj0) obj);
            }
        }, new e30() { // from class: l.fzh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60248Y(moment, (Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: K8 */
    public boolean mo60285K8() {
        return nkg.m159851H();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ka */
    public xaj0<Integer, List<String>, Boolean> mo60286Ka(String str) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        if (NullChecker.m81303a(momentM209572w7)) {
            return new xaj0<>(Integer.valueOf(momentM209572w7.likes.count), momentM209572w7.likes.ids, Boolean.valueOf(momentM209572w7.haveLiked));
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ke */
    public C22306c<Envelope> mo60287Ke() {
        return FeedModule.f38855d.m209593yc(omg.m165077g("limit=20"));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kk */
    public boolean mo60288Kk(User user) {
        if (user == null) {
            return false;
        }
        List<String> listM121233n = FeedModule.f38854c.f39209M.m121233n();
        return NullChecker.m81303a(listM121233n) && listM121233n.contains(user.f56011id);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kn */
    public C22306c<roj0> mo60289Kn(String str, String str2, boolean z, String str3) {
        return FeedModule.f38855d.m209276Fb(str, str2, z, str3).flatMap(new w9j() { // from class: l.syh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(roj0.f160388a);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kr */
    public void mo60290Kr(Act act, String str, String str2, final e30<String> e30Var) {
        final Moment moment = new Moment();
        ThirdShareSource thirdShareSourceNew_ = ThirdShareSource.new_();
        thirdShareSourceNew_.sourceType = "aiStory";
        thirdShareSourceNew_.sourceId = str2;
        moment.thirdShareSource = thirdShareSourceNew_;
        moment.media = vwb.m200324f0(new Media[0]);
        moment.value = str;
        final MessageLocation messageLocationNew_ = MessageLocation.new_();
        moment.nullCheck();
        moment.allowForward = null;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        momentAdditionalData.sendFrom = null;
        momentAdditionalData.share = null;
        moment.from = "aiStory";
        p980.m167863f(act).subscribe(mkd0.m154956H(new e30() { // from class: l.czh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60238M(messageLocationNew_, moment, e30Var, (k90) obj);
            }
        }, new e30() { // from class: l.dzh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60241Q(moment, messageLocationNew_, e30Var, (Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lj */
    public boolean mo60291Lj() {
        return nkg.m159856M();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ll */
    public C22306c<Envelope> mo60292Ll(String str, String str2) {
        return FeedModule.f38855d.m209390W6(str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lq */
    public boolean mo60293Lq() {
        return nkg.m159911v0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: M8 */
    public boolean mo60294M8() {
        return nkg.m159889k0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Mh */
    public <T extends ValueObject> T mo60295Mh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m219048c(FeedModule.f38854c.m60709X3(str), jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nh */
    public Intent mo60296Nh(Context context, String str, String str2, String str3, String str4) {
        return TopicVoteAggregationAct.m66173Y1(context, str, str2, str3, str4);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nj */
    public boolean mo60297Nj() {
        return nkg.m159853J();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nr */
    public void mo60298Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            oe40.m163846k0(act, arrayList, z, str);
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f39247id = str2;
        topicMomentNew_.name = str3;
        oe40.m163852n0(act, arrayList, z, str, null, null, topicMomentNew_, str4);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ns */
    public int mo60299Ns() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oh */
    public <T extends ValueObject> T mo60300Oh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m219048c((Moment) FeedModule.f38860i.f77913c.cached(str), jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oj */
    public DbLinks mo60301Oj(String str) {
        return (DbLinks) FeedModule.f38860i.f77916f.query(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ol */
    public C22306c<MusicContent> mo60302Ol(Music music) {
        return FeedModule.f38853b.m60516b2(music);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P6 */
    public Intent mo60303P6(Act act, boolean z, BubbleInfo bubbleInfo, String str) {
        return FeedStatusPageAct.m65563r2(act, z, bubbleInfo, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P9 */
    public <T extends ValueObject> C22306c<T> mo60304P9(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<T>) FeedModule.f38860i.f77913c.uiGet(str).map(new w9j() { // from class: l.azh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219048c((Moment) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pf */
    public void mo60305Pf(final Act act, final User user, final boolean z) {
        if (user == null) {
            return;
        }
        act.progress(R$string.f38984U2, true);
        FeedModule.f38854c.f39209M.m60772M(user.f56011id, !z).subscribe(mkd0.m154956H(new e30() { // from class: l.tyh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60236K(act, z, user, (roj0) obj);
            }
        }, new e30() { // from class: l.uyh
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pm */
    public boolean mo60306Pm() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pn */
    public List<Followship> mo60307Pn(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return feedData == null ? new ArrayList() : feedData.followships;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qm */
    public boolean mo60308Qm(String str) {
        return vqg.m199571t(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qn */
    public void mo60309Qn(Act act) {
        ComicFaceRecorderActivity.m62060h2(act);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: R9 */
    public void mo60310R9(View view, float f) {
        exq.m118693b(view, f);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rc */
    public boolean mo60311Rc() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rd */
    public Intent mo60312Rd(Act act, String str, String str2, boolean z) {
        return FeedPoiAggregationAct.m65010V1(act, str, str2, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Re */
    public void mo60313Re(boolean z) {
        FeedModule.f38855d.f192989H = z;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rf */
    public void mo60314Rf(ArrayList<String> arrayList) {
        FeedModule.f38860i.f77913c.m189026I(arrayList);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: S6 */
    public zpd0 mo60315S6() {
        return ya00.f197098K;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sd */
    public List<String> mo60316Sd() {
        return vqg.m199573u();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sg */
    public void mo60317Sg(Act act, String str, String str2, boolean z, String str3) {
        act.startActivity(FeedStatusPageAct.m65560p2(act, str, str2, true, str3));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: T7 */
    public void mo60318T7(Act act, User user, String str, @Nullable e30<Relationship> e30Var) {
        swh.m186169f(act, user, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tf */
    public void mo60319Tf(Act act, String str) {
        mo60317Sg(act, null, null, true, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tg */
    public C22306c<xaj0<String, String, String>> mo60320Tg() {
        if (FeedModule.f38855d.m209307K7().m221515e().get(FeedModule.m60222H().me_().f56011id) == null) {
            FeedModule.f38855d.m209300J7().subscribe(mkd0.m154956H(new e30() { // from class: l.pyh
                @Override // p149l.e30
                public final void call(Object obj) {
                    FeedServiceImpl.m60234H((Envelope) obj);
                }
            }, new e30() { // from class: l.qyh
                @Override // p149l.e30
                public final void call(Object obj) {
                    FeedServiceImpl.m60233F((Throwable) obj);
                }
            }));
        }
        return FeedModule.f38855d.m209307K7().map(new w9j() { // from class: l.ryh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60237L((Map) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ti */
    public <T extends ValueObject> T mo60321Ti(JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m219048c(o3i.m162431e(), jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tp */
    public boolean mo60322Tp() {
        return nkg.m159896o();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: U6 */
    public void mo60323U6(BubbleInfo bubbleInfo, String str) {
        FeedModule.f38856e.m132649V0(bubbleInfo, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ui */
    public boolean mo60324Ui(String str) {
        return TextUtils.equals(str, "p_meet_greet");
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Um */
    public void mo60325Um(String str) {
        FeedModule.m60224Um(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ur */
    public String mo60326Ur(String str) {
        return zi60.m218961w().m218993z(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: V9 */
    public String mo60327V9() {
        return mah.m153662b().m153664c();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vg */
    public boolean mo60328Vg() {
        return nkg.m159862S();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vo */
    public boolean mo60329Vo() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vp */
    public void mo60330Vp(Act act, User user, String str) {
        swh.m186168e(act, user, str, false);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wd */
    public C22306c<Envelope> mo60331Wd(String str) {
        return FeedModule.f38855d.m209369T6(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wm */
    public boolean mo60332Wm() {
        return nkg.m159868Y();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yb */
    public void mo60333Yb(Act act, String str, boolean z) {
        FeedModule.f38858g.m121846b(act, str, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yc */
    public void mo60334Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2) {
        zi60.m218961w().m218974f((Moment) zij0.m219048c(valueObject, Moment.JSON_ADAPTER), str, z, i, z2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yr */
    public C22306c<List<BubbleInfo>> mo60335Yr() {
        return FeedModule.f38855d.m209419a8();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Z6 */
    public C22306c<Envelope> mo60336Z6(String str) {
        return FeedModule.f38855d.m209377U7(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Zk */
    public User mo60337Zk(String str) {
        return FeedModule.f38855d.m209447e8(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: a6 */
    public C22306c<roj0> mo60338a6() {
        return FeedModule.f38855d.f193008O0.map(new w9j() { // from class: l.nzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public void addOnGetMediaAction(Activity activity, e30<Boolean> e30Var) {
        if (activity instanceof MomentDetailAct) {
            ((MomentDetailAct) activity).m64831a2().m64858M4(e30Var);
        }
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentActivitiesAct(Context context, String str) {
        return MomentActivitiesAct.m66642X1(context, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentDetailAct(Context context, String str, String str2, String str3) {
        return MomentDetailAct.C11306a.m64834a(context).m64839f(str).m64846m(str2).m64847n(str3).m64853t(true).m64835b();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedAct(Context context) {
        return MomentsFeedAct.m66830X1(context);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedPreviewAct(Context context, String str, int i, boolean z, String str2, String str3) {
        return MomentsFeedPreviewAct.m66872a2(context, str, i, z, str2, str3);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsInProfileAct(Context context, String str, String str2) {
        return MomentsInProfileAct.m66912V1(context, str, str2);
    }

    public Intent argsToMomentsInProfilePreviewAct(Context context, String str, String str2) {
        return MomentsInProfilePreviewAct.m66919I2(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsSimpleTextAct(Context context, String str, String str2) {
        return MomentsSimpleTextAct.m67022a2(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumActivitiesAct(Context context, String str, boolean z, boolean z2, boolean z3) {
        return PhotoAlbumActivitiesAct.m64971V1(context, str, z, z2, z3);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void argsToPhotoAlbumFansAct(Act act, String str, boolean z) {
        act.startActivity(PhotoAlbumFansAct.m65009V1(act, str, z));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumFeedAct(Context context, String str, String str2, int i, @Nullable String str3, int i2) {
        return PhotoAlbumFeedAct.m64356X1(context, str, str2, i, str3, i2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bb */
    public Intent mo60339bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z) {
        return PhotoAlbumFeedAct.m64357Y1(context, str, str2, i, str3, i2, str4, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bt */
    public boolean mo60340bt() {
        return false;
    }

    public xzl buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        return PhotoAlbumFeedBaseFrag.m64034o5(str, str2, i, str3, i2, str4, str5);
    }

    public Fragment buildPhotoAlbumFrag() {
        return nkg.m159904s() ? new NewPhotoAlbumFrag() : new PhotoAlbumFrag();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<roj0> cameraSdkLoaded() {
        return vb4.m197680n();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cd */
    public boolean mo60341cd() {
        return nkg.m159848E();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cg */
    public void mo60342cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map) {
        oe40.m163816R(act, "share", new MomentShareInfoParcelable(str2, str3, str4, str5, str, str7, str6));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cj */
    public void mo60343cj(Act act, String str) {
        m3i.m152923m().m152942z(act, str);
    }

    public C22306c<roj0> coreCameraRefreshFilters() {
        return FeedModule.f38853b.f39192H.m121236q();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<roj0> coreMomentActivityPoll() {
        C10735b c10735b = FeedModule.f38854c;
        return c10735b == null ? C22306c.error(new Exception("coreMomentActivityPoll FeedModule.coreMoment == null")) : c10735b.m60698S2();
    }

    public <T extends ValueObject> C22393b<T> coreMomentAddMomentSub(final JsonAdapter<T> jsonAdapter) {
        final C22393b<T> c22393bM221521b = C22393b.m221521b();
        FeedModule.f38854c.f39205I.subscribe(mkd0.m154955G(new e30() { // from class: l.hzh
            @Override // p149l.e30
            public final void call(Object obj) {
                c22393bM221521b.onNext(zij0.m219048c((Moment) obj, jsonAdapter));
            }
        }));
        return c22393bM221521b;
    }

    public <T extends ValueObject> C22306c<List<T>> coreMomentCachedMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<List<T>>) FeedModule.f38854c.m60706W2(str, 0).filter(new w9j() { // from class: l.oyh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((q860) obj));
            }
        }).map(new w9j() { // from class: l.zyh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219047b(((q860) obj).f153135a, jsonAdapter);
            }
        });
    }

    public C22306c<roj0> coreMomentDeleteLocal(long j) {
        return FeedModule.f38854c.m60728h3(j);
    }

    public C22393b<String> coreMomentDeleteMomentSub() {
        return FeedModule.f38854c.f39206J;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean coreMomentHasMoments(String str) {
        return FeedModule.f38854c.m60730i3(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void coreMomentLatest(String str) {
        FeedModule.f38854c.m60694P3(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<Envelope> coreMomentLike(String str, String str2, boolean z) {
        return FeedModule.f38854c.m60697R3(str, str2, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22306c<q860<T>> coreMomentMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<q860<T>>) FeedModule.f38854c.m60713Z3(str).map(new w9j() { // from class: l.mzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60242R(jsonAdapter, (q860) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public dpl coreMomentMutedUsers() {
        return new chh();
    }

    public C22306c<roj0> coreMomentNext(String str) {
        return FeedModule.f38854c.m60717b4(str);
    }

    public C22306c<roj0> coreMomentPost(String str) {
        Moment moment;
        try {
            moment = Moment.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            moment = null;
        }
        return moment == null ? C22393b.m221521b() : FeedModule.f38854c.m60733j4(moment);
    }

    public C22306c<roj0> coreMomentPrevious(boolean z) {
        return FeedModule.f38854c.m60739m4(false);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cq */
    public <T extends ValueObject> C22306c<j760<Links, List<T>>> mo60344cq(String str, boolean z, final JsonAdapter<T> jsonAdapter, String str2) {
        return (C22306c<j760<Links, List<T>>>) FeedModule.f38855d.m209542rc(str, z, str2).map(new w9j() { // from class: l.jzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return j760.m140076a((Links) j760Var.f116564a, zij0.m219047b((List) j760Var.f116565b, jsonAdapter));
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: d */
    public void mo60345d(Throwable th) {
        t2h.m186976g(th);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: di */
    public <T extends ValueObject> C22306c<List<T>> mo60346di(final JsonAdapter<T> jsonAdapter) {
        return (C22306c<List<T>>) FeedModule.f38855d.m209444dc().map(new w9j() { // from class: l.vyh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219047b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: dr */
    public TabName mo60347dr() {
        if (nkg.m159912w()) {
            return TabName.Moment;
        }
        TabName tabNameTransform = TabName.transform(sti.f166368l.get());
        if (tabNameTransform == null) {
            return nkg.m159910v() ? TabName.Moment : TabName.Card;
        }
        return tabNameTransform;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: el */
    public C22306c<roj0> mo60348el() {
        return FeedModule.f38855d.m209475i8(false);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: et */
    public void mo60349et() {
        vb4.m197678l();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f6 */
    public void mo60350f6(DbLinks dbLinks) {
        FeedModule.f38860i.f77916f.upsert(dbLinks);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f9 */
    public C22393b<Boolean> mo60351f9() {
        return FeedModule.f38855d.f193070t1;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fc */
    public int mo60352fc() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = sti.f166364h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<roj0> filter() {
        return FeedModule.f38853b.m60520f2();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<Followship> following(String str, User user, boolean z, String str2, String str3) {
        return FeedModule.f38855d.m209460g7(str, user, z, str2, str3);
    }

    public C22306c<Followship> followingToChat(String str, User user) {
        return FeedModule.f38855d.m209495l7(str, user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        return FeedModule.f38855d.m209467h7(str, user, z, str2, str3, str4);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fs */
    public boolean mo60353fs() {
        return nkg.m159917y0();
    }

    @NonNull
    public C18367m2 getAbHooker() {
        return this.f39190a;
    }

    public Class getCaptionActClass() {
        return CaptionAct.class;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public vch getFeedMediaHandler(Act act) {
        return new wch();
    }

    public rrl getFollowIncreaseIncomeHelper() {
        return new n3h();
    }

    public srl getFollowTipsPopupManager() {
        return new o3h();
    }

    public C22393b<j760<User, Boolean>> getFollowingChangedSub() {
        return FeedModule.f38855d.f193012Q0;
    }

    public C22392a<Double> getLatestTopicCreateTimeSub() {
        return FeedModule.f38855d.m209272F7();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getMoMoVerificationAppId() {
        return vb4.f180803a;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22393b<j760<User, Boolean>> getMomentLikeChangedSub() {
        return FeedModule.f38855d.f193016S0;
    }

    public ywl getMomentTrack() {
        return new ufh();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22393b<roj0> getMomentsPreviousSub() {
        return FeedModule.f38855d.f193079y0;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getTopShowingPageId(Fragment fragment) {
        if (isPhotoAlbumFrag(fragment)) {
            if (fragment instanceof PhotoAlbumFrag) {
                return ((PhotoAlbumFrag) fragment).m63796k6();
            }
            if (fragment instanceof NewPhotoAlbumFrag) {
                return ((NewPhotoAlbumFrag) fragment).m64280C6();
            }
        }
        return "";
    }

    @Override // p149l.k8k0
    public User getUserById(String str) {
        return k8k0.C17956a.m144943a(this, str);
    }

    @Override // p149l.k8k0
    public User getUserByIdInModule(String str) {
        return FeedModule.f38855d.m209447e8(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: gk */
    public C22306c<Envelope> mo60354gk(String str) {
        return FeedModule.f38855d.m209405Y7(str, null);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: h8 */
    public int mo60355h8() {
        return beh.m101354a();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hk */
    public void mo60356hk(Act act, e30<String> e30Var) {
        StateGuide stateGuide;
        String str = sti.f166364h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0) {
            return;
        }
        kyg.m147873h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, e30Var, null);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hr */
    public boolean mo60357hr(Activity activity) {
        return (activity instanceof MomentsFeedPreviewAct) || (activity instanceof MomentsInProfilePreviewAct) || (activity instanceof MomentsInProfileTextAct);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ia */
    public View mo60358ia(Context context, User user, int i) {
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(context, o6c0.f142212i3, null);
        feedUserSexAndAgeView.m66375d(user, 6, i);
        return feedUserSexAndAgeView;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ik */
    public Fragment mo60359ik() {
        return new MomentsFeedFrag();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void initCameraSdk(d30 d30Var) {
        vb4.m197676j();
    }

    public void initMomentPostState() {
        oe40.m163807I();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isCameraSdkLoaded() {
        return vb4.m197675i();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof NewCaptionAct) || (activity instanceof MomentsFeedPreviewAct) || (activity instanceof CompactMediaPickerAct) || (activity instanceof MediaPickerBaseAct) || (activity instanceof MediaPickerAct) || (activity instanceof MediaPreviewAct) || (activity instanceof CropperAct) || (activity instanceof MusicAggregateAct) || (activity instanceof MusicCenterAct) || (activity instanceof MusicListAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewPostAct) || (activity instanceof FeedVideoFlowAct) || (activity instanceof PhotoAlbumFeedPreviewAct);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByFollowship(User user) {
        return ubx.m192938b(user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByRelationship(User user) {
        return ubx.m192939c(user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentDetailAct(Activity activity) {
        return activity instanceof MomentDetailAct;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentsFeedAct(Activity activity) {
        return activity instanceof MomentsFeedAct;
    }

    public boolean isMomentsFeedFrag(Fragment fragment) {
        return fragment instanceof MomentsFeedFrag;
    }

    public boolean isPhotoAlbumFeedFrag(Fragment fragment) {
        return fragment instanceof PhotoAlbumFeedFrag;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPhotoAlbumFrag(Fragment fragment) {
        return (fragment instanceof PhotoAlbumFrag) || (fragment instanceof NewPhotoAlbumFrag);
    }

    public boolean isPostAlbumPage(Act act) {
        return (act instanceof NewCaptionAct) || (act instanceof MediaPickerBaseAct) || (act instanceof MediaPickerAct);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPostingMoment() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j8 */
    public Intent mo60360j8(Context context, String str, String str2, boolean z, String str3) {
        return TopicAggregationAct.m66081V1(context, str, str2, z, str3);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j9 */
    public void mo60361j9(Act act, String str) {
        s1i.m181966f(act, str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jb */
    public C22392a<Boolean> mo60362jb() {
        return FeedModule.f38855d.f193081z0;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jk */
    public void mo60363jk() {
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ke */
    public boolean mo60364ke() {
        return nkg.m159910v() || nkg.m159912w();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ko */
    public boolean mo60365ko() {
        return nkg.m159909u0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: kq */
    public void mo60366kq(Relationship relationship) {
        FeedModule.f38855d.f193080y1.onNext(relationship);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: l8 */
    public C22306c<Envelope> mo60367l8(String str, String str2) {
        return FeedModule.f38855d.m209412Z7(str, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ld */
    public boolean mo60368ld() {
        return nkg.m159907t0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: le */
    public void mo60369le(Act act, boolean z, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            oe40.m163848l0(act, vwb.m200324f0(new Media[0]), z, str, str5, "");
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f39247id = str2;
        topicMomentNew_.name = str3;
        oe40.m163852n0(act, vwb.m200324f0(new Media[0]), z, str, str5, null, topicMomentNew_, str4);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ln */
    public hpd0 mo60370ln() {
        return FeedModule.f38855d.f192992I;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mn */
    public boolean mo60371mn(User user) {
        return swh.m186171h(user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22306c<T> momentRefresh(String str, String str2, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<T>) FeedModule.f38855d.m209360Rb(str, str2).map(new w9j() { // from class: l.gzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219048c((ValueObject) ((xaj0) obj).f191751a, jsonAdapter);
            }
        });
    }

    public void momentSeeLikeRefreshLikersData() {
        qi00.m174710k();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mr */
    public boolean mo60372mr() {
        return nkg.m159840A();
    }

    public C22306c<roj0> mute(String str, boolean z) {
        return FeedModule.f38855d.m209437cc(str, z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n */
    public void mo60373n(e30<List<MMPresetFilter>> e30Var) {
        hli.m131661j().m131668m(FeedModule.f38852a, e30Var);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n7 */
    public boolean mo60374n7() {
        return false;
    }

    public C22306c<roj0> needBindPhone() {
        return FeedModule.f38855d.m209475i8(false);
    }

    @Override // p149l.k8k0
    public boolean needUpdateUser() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ni */
    public C22306c<Music> mo60375ni(int i) {
        return FeedModule.f38853b.m60513Y1(i);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nm */
    public void mo60376nm(Act act, int i) {
        new aug(act, i, "").m98979l();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nq */
    public C22393b<Boolean> mo60377nq() {
        return xia.f192973M1;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oa */
    public <T extends ValueObject> void mo60378oa(Act act, Bundle bundle, T t) {
        act.startActivity(IVVideoEditAct.m60957X1(act, bundle));
    }

    public <T extends ValueObject> C22306c<j760<Integer, T>> observeMomentPostState(final JsonAdapter<T> jsonAdapter) {
        return (C22306c<j760<Integer, T>>) oe40.m163824Z().map(new w9j() { // from class: l.izh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60256g0(jsonAdapter, (j760) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oh */
    public String mo60379oh(Fragment fragment) {
        if (fragment instanceof NewPhotoAlbumFrag) {
            return ((NewPhotoAlbumFrag) fragment).m64279B6();
        }
        return fragment instanceof PhotoAlbumFrag ? ((PhotoAlbumFrag) fragment).m63794j6() : "";
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: or */
    public C22306c<Followship> mo60380or(String str, User user, boolean z, String str2) {
        return FeedModule.f38855d.m209502m7(str, user, z, str2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: p6 */
    public void mo60381p6(boolean z) {
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: pd */
    public String mo60382pd() {
        return uuv.m196012c0();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22306c<j760<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter) {
        return mo60344cq(str, z, jsonAdapter, "");
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: po */
    public void mo60383po(Act act, String str, e30<Detect> e30Var) {
        vqg.m199563p(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2) {
        FeedModule.f38855d.m209312Kc(relationship, user, z, z2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qg */
    public boolean mo60384qg() {
        return nkg.m159918z();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qn */
    public boolean mo60385qn() {
        return nkg.m159852I();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qo */
    public void mo60386qo(Act act) {
        act.startActivity(PhotoAlbumActivitiesAct.m64971V1(act, PhotoAlbumActivitiesAct.f42244j, true, false, false));
    }

    public void refreshTopicFeed(String str) {
        FeedModule.f38855d.m209410Yc(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: s9 */
    public C22393b<j760<User, Boolean>> mo60387s9() {
        return FeedModule.f38855d.f193012Q0;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: sh */
    public boolean mo60388sh() {
        return FeedModule.f38855d.f192989H;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: so */
    public boolean mo60389so() {
        return nkg.m159854K();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInnerCameraForResult(Act act, String str, int i) {
        oe40.m163860r0(act, str, i);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInstaLikePickerAct(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) InstaLikePickerAct.class));
    }

    public boolean syncTryLoadLibs() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: t6 */
    public void mo60390t6(Act act, boolean z, String str) {
        act.startActivity(FeedStatusPageAct.m65563r2(act, z, null, str));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: tf */
    public zpd0 mo60391tf() {
        return FeedModule.f38855d.f193001L;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        oe40.m163846k0(act, arrayList, z, str);
    }

    public void toCaptionPageWithSendAction(Act act, ArrayList<Media> arrayList) {
        oe40.m163854o0(act, arrayList);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u0 */
    public boolean mo60392u0(Activity activity) {
        return activity instanceof MomentsFeedPreviewAct;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u6 */
    public boolean mo60393u6() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u9 */
    public void mo60394u9(String str) {
        if (vwb.m200298L(str)) {
            return;
        }
        FeedModule.f38860i.f77913c.delete(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ua */
    public boolean mo60395ua() {
        return nkg.m159850G();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ud */
    public boolean mo60396ud(User user) {
        return swh.m186172i(user);
    }

    public C22306c<roj0> unReadFansUpdate() {
        return FeedModule.f38855d.m209529pd();
    }

    public void updateLatestTopicCreateTime() {
        FeedModule.f38855d.m209571vd();
    }

    @Override // p149l.k8k0
    public void updateUser(User user) {
        FeedModule.f38855d.m209240Ad(user);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void updateUserOnBlock(String str) {
        FeedModule.f38855d.m209248Bd(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: us */
    public <T extends ValueObject> T mo60397us(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m219048c(FeedModule.f38855d.m209572w7(str), jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr) {
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            return new z7h(3).mo201114a(act, map, viewArr);
        }
        if (u2h.m191495d() || u2h.m191494c()) {
            return new a8h().mo201114a(act, map, viewArr);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: va */
    public void mo60398va(Act act, String str, String str2) {
        final long jM199503E = vqg.m199503E() * 3600000;
        act.duringCreated(FeedModule.f38855d.m209381Ub(str, str2, false, "")).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.wyh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60257h0((xaj0) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.xyh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60243S(jM199503E, (Moment) obj);
            }
        }, new e30() { // from class: l.yyh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedServiceImpl.m60246W((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vj */
    public boolean mo60399vj(boolean z) {
        return nkg.m159849F(z);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vm */
    public C22306c<BubbleInfo> mo60400vm(String str) {
        return FeedModule.f38855d.m209461g8(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xa */
    public boolean mo60401xa(String str) {
        return m3i.m152923m().m152927j() && o3i.m162433g(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xl */
    public C22306c<Envelope> mo60402xl(String str) {
        return FeedModule.f38855d.m209593yc(omg.m165077g(str));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xm */
    public void mo60403xm(Object obj) {
        if (obj instanceof Moment) {
            FeedModule.f38860i.f77913c.insert((Moment) obj);
        }
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yj */
    public void mo60404yj(String str) {
        FeedModule.f38860i.f77913c.m189025H(str);
        FeedModule.f38860i.f77914d.m100795F(str);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yq */
    public String mo60405yq() {
        return sti.f166363g.get();
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: zd */
    public void mo60406zd(Envelope envelope, HashMap<String, String> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().owner;
            map.put(str, str);
        }
    }

    public xzl buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2) {
        return PhotoAlbumFeedBaseFrag.m64033n5(str, str2, i, str3, i2);
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22306c<roj0> coreMomentPrevious(String str) {
        return FeedModule.f38854c.m60737l4(str);
    }

    public void startInstaLikePickerAct(Act act) {
        act.startActivity(new Intent(act, (Class<?>) InstaLikePickerAct.class));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22306c<q860<T>> coreMomentMoments(final JsonAdapter<T> jsonAdapter) {
        return (C22306c<q860<T>>) FeedModule.f38854c.m60711Y3().map(new w9j() { // from class: l.kzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60252c0(jsonAdapter, (q860) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22306c<q860<T>> coreMomentCachedMoments(String str, int i, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<q860<T>>) FeedModule.f38854c.m60706W2(str, i).map(new w9j() { // from class: l.lzh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedServiceImpl.m60253d0(jsonAdapter, (q860) obj);
            }
        });
    }
}
