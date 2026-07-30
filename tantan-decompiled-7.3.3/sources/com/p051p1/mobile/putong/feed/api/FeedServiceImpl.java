package com.p051p1.mobile.putong.feed.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.api.FeedServiceImpl;
import com.p051p1.mobile.putong.feed.data.Configs;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p051p1.mobile.putong.feed.data.StateGuide;
import com.p051p1.mobile.putong.feed.data.ThirdShareSource;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.UserSetVisibility;
import com.p051p1.mobile.putong.feed.newui.camera.IVVideoEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p051p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p051p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumfans.PhotoAlbumFansAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p051p1.mobile.putong.feed.p065ui.moments.CaptionAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedFrag;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedPreviewAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfilePreviewAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileTextAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsSimpleTextAct;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VImage;
import p153l.C18526m2;
import p153l.b5i;
import p153l.bch;
import p153l.bkj0;
import p153l.byd0;
import p153l.c5h;
import p153l.cmg;
import p153l.cn40;
import p153l.csj0;
import p153l.d5h;
import p153l.d5i;
import p153l.dmg;
import p153l.dog;
import p153l.doi;
import p153l.eog;
import p153l.er60;
import p153l.eul;
import p153l.ezq;
import p153l.fog;
import p153l.ful;
import p153l.g90;
import p153l.g9i;
import p153l.gog;
import p153l.h3i;
import p153l.hj00;
import p153l.hyh;
import p153l.i4h;
import p153l.j4h;
import p153l.jhh;
import p153l.jka;
import p153l.jxd0;
import p153l.jyb;
import p153l.keh;
import p153l.ksg;
import p153l.l9c;
import p153l.lbc0;
import p153l.leh;
import p153l.o1j0;
import p153l.o9h;
import p153l.owi;
import p153l.p9h;
import p153l.pf60;
import p153l.prl;
import p153l.psd0;
import p153l.pvg;
import p153l.pzi0;
import p153l.qcj;
import p153l.qfh;
import p153l.qhk0;
import p153l.r2m;
import p153l.rih;
import p153l.rzl;
import p153l.skq0;
import p153l.tec0;
import p153l.tex;
import p153l.uc4;
import p153l.uxj0;
import p153l.vg60;
import p153l.vh80;
import p153l.vwv;
import p153l.wsg;
import p153l.x20;
import p153l.y20;
import p153l.zq00;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "feed服务", path = "/feed_service/service")
public class FeedServiceImpl implements FeedService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f40038a = new dmg();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.FeedServiceImpl$a */
    public static /* synthetic */ class C10896a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40039a;

        static {
            int[] iArr = new int[FeedMomentListType.values().length];
            f40039a = iArr;
            try {
                iArr[FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40039a[FeedMomentListType.LIVE_SQUARE_DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m61417F(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m61418H(Envelope envelope) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m61420K(Act act, boolean z, User user, uxj0 uxj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        o1j0.m165643q(z ? act.getString(R$string.f39757I) : act.getString(R$string.f39830U0), act.getResources().getDrawable(lbc0.f130985Z1));
        FeedModule.f39703d.m145678cc(user.f56859id, !z);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ bkj0 m61421L(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m61406H().me_().f56859id);
        if (bubbleInfo == null) {
            return new bkj0(null, null, null);
        }
        Emotion emotion = bubbleInfo.emotion;
        return new bkj0(emotion.f39596id, emotion.text, emotion.emojiUrl);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m61422M(MessageLocation messageLocation, Moment moment, y20 y20Var, g90 g90Var) {
        if (NullChecker.m82486a(g90Var)) {
            messageLocation.name = g90Var.m129468c();
            messageLocation.address = g90Var.m129466a();
            messageLocation.coordinates = g90Var.m129467b();
        }
        moment.location = messageLocation;
        FeedModule.f39702c.m61919k4(moment, y20Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m61425Q(Moment moment, MessageLocation messageLocation, y20 y20Var, Throwable th) {
        moment.location = messageLocation;
        FeedModule.f39702c.m61919k4(moment, y20Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ vg60 m61426R(JsonAdapter jsonAdapter, vg60 vg60Var) {
        return new vg60(csj0.m112184b(vg60Var.f184001a, jsonAdapter), vg60Var.f184002b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m61427S(long j, final Moment moment) {
        String str;
        String str2;
        int i;
        int i2;
        List<Moment> listM222761e;
        if (moment == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(moment.media)) {
            if (TextUtils.isEmpty(moment.value)) {
                str = "";
                str2 = str;
                i = 0;
            } else {
                i2 = 3;
            }
            if (i > 0) {
                l9c.m153394o().m153397B(new x20() { // from class: l.q0i
                    @Override // p153l.x20
                    public final void call() {
                        FeedServiceImpl.m61428T(moment);
                    }
                });
                FeedModule.m61406H().mo31801mq(moment.owner, moment.f56859id, i, arrayList, moment.value, str, moment.createdTime, str2);
                listM222761e = FeedModule.f39703d.f121377s0.m222761e();
                if (jyb.m147479J(listM222761e)) {
                    FeedModule.m61406H().mo31799ml(moment.owner);
                    return;
                }
                if (pzi0.m174454o() - ((long) listM222761e.get(0).createdTime) > j) {
                    FeedModule.m61406H().mo31799ml(moment.owner);
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
            l9c.m153394o().m153397B(new x20() { // from class: l.q0i
                @Override // p153l.x20
                public final void call() {
                    FeedServiceImpl.m61428T(moment);
                }
            });
            FeedModule.m61406H().mo31801mq(moment.owner, moment.f56859id, i, arrayList, moment.value, str, moment.createdTime, str2);
            listM222761e = FeedModule.f39703d.f121377s0.m222761e();
            if (jyb.m147479J(listM222761e)) {
                FeedModule.m61406H().mo31799ml(moment.owner);
                return;
            }
            if (pzi0.m174454o() - ((long) listM222761e.get(0).createdTime) > j) {
                FeedModule.m61406H().mo31799ml(moment.owner);
            }
        }
        str = "";
        str2 = str;
        i = i2;
        if (i > 0) {
            l9c.m153394o().m153397B(new x20() { // from class: l.q0i
                @Override // p153l.x20
                public final void call() {
                    FeedServiceImpl.m61428T(moment);
                }
            });
            FeedModule.m61406H().mo31801mq(moment.owner, moment.f56859id, i, arrayList, moment.value, str, moment.createdTime, str2);
            listM222761e = FeedModule.f39703d.f121377s0.m222761e();
            if (jyb.m147479J(listM222761e)) {
                FeedModule.m61406H().mo31799ml(moment.owner);
                return;
            }
            if (pzi0.m174454o() - ((long) listM222761e.get(0).createdTime) > j) {
                FeedModule.m61406H().mo31799ml(moment.owner);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m61428T(Moment moment) {
        FeedModule.f39708i.f160257c.upsert(moment);
        FeedModule.m61406H().mo31828uf(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m61430W(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m61432Y(Moment moment, Throwable th) {
        o1j0.m165651y("发布失败");
        er60.m122104w().m122126o(moment, "p_moment_post", th, false, null);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m61433Z(Moment moment, long j, uxj0 uxj0Var) {
        o1j0.m165651y("发布成功");
        g9i.m129585j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        er60.m122104w().m122125n(moment, "p_moment_post", 201, false, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ vg60 m61436c0(JsonAdapter jsonAdapter, vg60 vg60Var) {
        return new vg60(csj0.m112184b(vg60Var.f184001a, jsonAdapter), vg60Var.f184002b);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ vg60 m61437d0(JsonAdapter jsonAdapter, vg60 vg60Var) {
        return new vg60(csj0.m112184b(vg60Var.f184001a, jsonAdapter), vg60Var.f184002b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ pf60 m61440g0(JsonAdapter jsonAdapter, pf60 pf60Var) {
        return new pf60((Integer) pf60Var.f152156a, csj0.m112185c((ValueObject) pf60Var.f152157b, jsonAdapter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Moment m61441h0(bkj0 bkj0Var) {
        return (Moment) bkj0Var.f77081a;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Af */
    public void mo61442Af(Context context, Media media, ArrayList<Media> arrayList) {
        context.startActivity(NewAlbumPreviewNoEditAct.m63510h2(context, media, arrayList));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ah */
    public boolean mo61443Ah() {
        return FeedModule.f39706g.m145953a();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: At */
    public String mo61444At() {
        return vwv.m203797d0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bd */
    public boolean mo61445Bd() {
        return cmg.m111202c0() || cmg.m111204d0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bg */
    public C22421c<Envelope> mo61446Bg(String str, String str2) {
        return FeedModule.f39703d.m145531Hb(str, str2, true);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bh */
    public void mo61447Bh(Act act, boolean z) {
        wsg.m207772g().m207775f(act, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bj */
    public boolean mo61448Bj() {
        return FeedModule.f39703d.f121339Z.get().booleanValue();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: C6 */
    public fog mo61449C6(FeedMomentListType feedMomentListType) {
        int i = C10896a.f40039a[feedMomentListType.ordinal()];
        if (i != 1) {
            return i != 2 ? new gog() : new eog();
        }
        return new gog();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ca */
    public <T extends ValueObject> List<T> mo61450Ca(Envelope envelope, JsonAdapter<T> jsonAdapter) {
        return csj0.m112184b(((FeedData) envelope.getModuleData(FeedData.class)).moments, jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Co */
    public boolean mo61451Co() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Cr */
    public void mo61452Cr(Act act, String str, y20<Boolean> y20Var) {
        ksg.m151156B(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: D8 */
    public void mo61453D8(String str, String str2) {
        FeedModule.f39708i.f160257c.m112016L(str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Dk */
    public void mo61454Dk(Act act, String str, String str2, String str3) {
        BubbleInfo bubbleInfoM145534I7 = FeedModule.f39703d.m145534I7();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bubbleInfoM145534I7);
        act.startActivity(FeedStatusPageAct.m66746r2(act, arrayList, 0, "", str3));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: E6 */
    public Intent mo61455E6(Context context, String str, String str2) {
        return QATopicAggregationActivity.m67158X1(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ea */
    public void mo61456Ea() {
        b5i.m102594m().m102600l();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ee */
    public void mo61457Ee(Envelope envelope, HashMap<String, List<Media>> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (jyb.m147479J(list)) {
            return;
        }
        for (Moment moment : list) {
            if (!jyb.m147479J(moment.media)) {
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

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ek */
    public boolean mo61458Ek(User user) {
        return hyh.m137735l(user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Fm */
    public void mo61459Fm(String str, boolean z) {
        PhotoAlbumFeedFrag.f42474G.onNext(new pf60<>(str, Boolean.valueOf(z)));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gc */
    public BubbleInfo mo61460Gc() {
        return FeedModule.f39703d.m145534I7();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gk */
    public skq0 mo61461Gk(Act act, String str) {
        return new FeedWriterLevelView(act, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gm */
    public List<String> mo61462Gm() {
        return ksg.f128568i;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: H7 */
    public C22508b<pf60<Boolean, Boolean>> mo61463H7() {
        return FeedStatusPageAct.f43597B;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ha */
    public boolean mo61464Ha() {
        return FeedModule.f39703d.f121343b0.get().booleanValue();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Hj */
    public boolean mo61465Hj() {
        return cmg.m111229q();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ib */
    public boolean mo61466Ib(String str) {
        return TextUtils.equals(str, "p_meet_greet") || TextUtils.equals(str, "p_state_explore");
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: In */
    public void mo61467In(RelativeLayout relativeLayout, VImage vImage) {
        vImage.setImageResource(j4h.m143424h() ? lbc0.f131108o5 : lbc0.f131100n5);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Jg */
    public void mo61468Jg(Act act, String str, String str2) {
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
        FeedModule.f39703d.m145496Cc(moment).subscribe(psd0.m173597H(new y20() { // from class: l.t0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61433Z(moment, jElapsedRealtime, (uxj0) obj);
            }
        }, new y20() { // from class: l.u0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61432Y(moment, (Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: K8 */
    public boolean mo61469K8() {
        return cmg.m111180H();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ka */
    public bkj0<Integer, List<String>, Boolean> mo61470Ka(String str) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        if (NullChecker.m82486a(momentM145813w7)) {
            return new bkj0<>(Integer.valueOf(momentM145813w7.likes.count), momentM145813w7.likes.ids, Boolean.valueOf(momentM145813w7.haveLiked));
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ke */
    public C22421c<Envelope> mo61471Ke() {
        return FeedModule.f39703d.m145834yc(dog.m117238g("limit=20"));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kk */
    public boolean mo61472Kk(User user) {
        if (user == null) {
            return false;
        }
        List<String> listM159277n = FeedModule.f39702c.f40057M.m159277n();
        return NullChecker.m82486a(listM159277n) && listM159277n.contains(user.f56859id);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kn */
    public C22421c<uxj0> mo61473Kn(String str, String str2, boolean z, String str3) {
        return FeedModule.f39703d.m145517Fb(str, str2, z, str3).flatMap(new qcj() { // from class: l.h0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(uxj0.f181467a);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kr */
    public void mo61474Kr(Act act, String str, String str2, final y20<String> y20Var) {
        final Moment moment = new Moment();
        ThirdShareSource thirdShareSourceNew_ = ThirdShareSource.new_();
        thirdShareSourceNew_.sourceType = "aiStory";
        thirdShareSourceNew_.sourceId = str2;
        moment.thirdShareSource = thirdShareSourceNew_;
        moment.media = jyb.m147507f0(new Media[0]);
        moment.value = str;
        final MessageLocation messageLocationNew_ = MessageLocation.new_();
        moment.nullCheck();
        moment.allowForward = null;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        momentAdditionalData.sendFrom = null;
        momentAdditionalData.share = null;
        moment.from = "aiStory";
        vh80.m201262f(act).subscribe(psd0.m173597H(new y20() { // from class: l.r0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61422M(messageLocationNew_, moment, y20Var, (g90) obj);
            }
        }, new y20() { // from class: l.s0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61425Q(moment, messageLocationNew_, y20Var, (Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lj */
    public boolean mo61475Lj() {
        return cmg.m111185M();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ll */
    public C22421c<Envelope> mo61476Ll(String str, String str2) {
        return FeedModule.f39703d.m145631W6(str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lq */
    public boolean mo61477Lq() {
        return cmg.m111240v0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: M8 */
    public boolean mo61478M8() {
        return cmg.m111218k0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Mh */
    public <T extends ValueObject> T mo61479Mh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) csj0.m112185c(FeedModule.f39702c.m61893X3(str), jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nh */
    public Intent mo61480Nh(Context context, String str, String str2, String str3, String str4) {
        return TopicVoteAggregationAct.m67356Z1(context, str, str2, str3, str4);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nj */
    public boolean mo61481Nj() {
        return cmg.m111182J();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nr */
    public void mo61482Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            cn40.m111396k0(act, arrayList, z, str);
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f40095id = str2;
        topicMomentNew_.name = str3;
        cn40.m111402n0(act, arrayList, z, str, null, null, topicMomentNew_, str4);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ns */
    public int mo61483Ns() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oh */
    public <T extends ValueObject> T mo61484Oh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) csj0.m112185c((Moment) FeedModule.f39708i.f160257c.cached(str), jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oj */
    public DbLinks mo61485Oj(String str) {
        return (DbLinks) FeedModule.f39708i.f160260f.query(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ol */
    public C22421c<MusicContent> mo61486Ol(Music music) {
        return FeedModule.f39701b.m61700b2(music);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P6 */
    public Intent mo61487P6(Act act, boolean z, BubbleInfo bubbleInfo, String str) {
        return FeedStatusPageAct.m66747s2(act, z, bubbleInfo, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P9 */
    public <T extends ValueObject> C22421c<T> mo61488P9(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<T>) FeedModule.f39708i.f160257c.uiGet(str).map(new qcj() { // from class: l.p0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112185c((Moment) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pf */
    public void mo61489Pf(final Act act, final User user, final boolean z) {
        if (user == null) {
            return;
        }
        act.progress(R$string.f39832U2, true);
        FeedModule.f39702c.f40057M.m61956M(user.f56859id, !z).subscribe(psd0.m173597H(new y20() { // from class: l.i0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61420K(act, z, user, (uxj0) obj);
            }
        }, new y20() { // from class: l.j0i
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pm */
    public boolean mo61490Pm() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pn */
    public List<Followship> mo61491Pn(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return feedData == null ? new ArrayList() : feedData.followships;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qm */
    public boolean mo61492Qm(String str) {
        return ksg.m151230t(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qn */
    public void mo61493Qn(Act act) {
        ComicFaceRecorderActivity.m63243i2(act);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: R9 */
    public void mo61494R9(View view, float f) {
        ezq.m123397b(view, f);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rc */
    public boolean mo61495Rc() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rd */
    public Intent mo61496Rd(Act act, String str, String str2, boolean z) {
        return FeedPoiAggregationAct.m66193X1(act, str, str2, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Re */
    public void mo61497Re(boolean z) {
        FeedModule.f39703d.f121299H = z;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rf */
    public void mo61498Rf(ArrayList<String> arrayList) {
        FeedModule.f39708i.f160257c.m112013I(arrayList);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: S6 */
    public byd0 mo61499S6() {
        return hj00.f110108K;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sd */
    public List<String> mo61500Sd() {
        return ksg.m151232u();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sg */
    public void mo61501Sg(Act act, String str, String str2, boolean z, String str3) {
        act.startActivity(FeedStatusPageAct.m66744q2(act, str, str2, true, str3));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: T7 */
    public void mo61502T7(Act act, User user, String str, @Nullable y20<Relationship> y20Var) {
        hyh.m137729f(act, user, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tf */
    public void mo61503Tf(Act act, String str) {
        mo61501Sg(act, null, null, true, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tg */
    public C22421c<bkj0<String, String, String>> mo61504Tg() {
        if (FeedModule.f39703d.m145548K7().m222761e().get(FeedModule.m61406H().me_().f56859id) == null) {
            FeedModule.f39703d.m145541J7().subscribe(psd0.m173597H(new y20() { // from class: l.e0i
                @Override // p153l.y20
                public final void call(Object obj) {
                    FeedServiceImpl.m61418H((Envelope) obj);
                }
            }, new y20() { // from class: l.f0i
                @Override // p153l.y20
                public final void call(Object obj) {
                    FeedServiceImpl.m61417F((Throwable) obj);
                }
            }));
        }
        return FeedModule.f39703d.m145548K7().map(new qcj() { // from class: l.g0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61421L((Map) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ti */
    public <T extends ValueObject> T mo61505Ti(JsonAdapter<T> jsonAdapter) {
        return (T) csj0.m112185c(d5i.m114302e(), jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tp */
    public boolean mo61506Tp() {
        return cmg.m111225o();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: U6 */
    public void mo61507U6(BubbleInfo bubbleInfo, String str) {
        FeedModule.f39704e.m159782V0(bubbleInfo, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ui */
    public boolean mo61508Ui(String str) {
        return TextUtils.equals(str, "p_meet_greet");
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Um */
    public void mo61509Um(String str) {
        FeedModule.m61408Um(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ur */
    public String mo61510Ur(String str) {
        return er60.m122104w().m122136z(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: V9 */
    public String mo61511V9() {
        return bch.m103508b().m103510c();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vg */
    public boolean mo61512Vg() {
        return cmg.m111191S();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vo */
    public boolean mo61513Vo() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vp */
    public void mo61514Vp(Act act, User user, String str) {
        hyh.m137728e(act, user, str, false);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wd */
    public C22421c<Envelope> mo61515Wd(String str) {
        return FeedModule.f39703d.m145610T6(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wm */
    public boolean mo61516Wm() {
        return cmg.m111197Y();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yb */
    public void mo61517Yb(Act act, String str, boolean z) {
        FeedModule.f39706g.m145954b(act, str, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yc */
    public void mo61518Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2) {
        er60.m122104w().m122117f((Moment) csj0.m112185c(valueObject, Moment.JSON_ADAPTER), str, z, i, z2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yr */
    public C22421c<List<BubbleInfo>> mo61519Yr() {
        return FeedModule.f39703d.m145660a8();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Z6 */
    public C22421c<Envelope> mo61520Z6(String str) {
        return FeedModule.f39703d.m145618U7(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Zk */
    public User mo61521Zk(String str) {
        return FeedModule.f39703d.m145688e8(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: a6 */
    public C22421c<uxj0> mo61522a6() {
        return FeedModule.f39703d.f121318O0.map(new qcj() { // from class: l.c1i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public void addOnGetMediaAction(Activity activity, y20<Boolean> y20Var) {
        if (activity instanceof MomentDetailAct) {
            ((MomentDetailAct) activity).m66014b2().m66041M4(y20Var);
        }
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentActivitiesAct(Context context, String str) {
        return MomentActivitiesAct.m67825Y1(context, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentDetailAct(Context context, String str, String str2, String str3) {
        return MomentDetailAct.C11469a.m66017a(context).m66022f(str).m66029m(str2).m66030n(str3).m66036t(true).m66018b();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedAct(Context context) {
        return MomentsFeedAct.m68013Y1(context);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedPreviewAct(Context context, String str, int i, boolean z, String str2, String str3) {
        return MomentsFeedPreviewAct.m68055b2(context, str, i, z, str2, str3);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsInProfileAct(Context context, String str, String str2) {
        return MomentsInProfileAct.m68095X1(context, str, str2);
    }

    public Intent argsToMomentsInProfilePreviewAct(Context context, String str, String str2) {
        return MomentsInProfilePreviewAct.m68103K2(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsSimpleTextAct(Context context, String str, String str2) {
        return MomentsSimpleTextAct.m68205b2(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumActivitiesAct(Context context, String str, boolean z, boolean z2, boolean z3) {
        return PhotoAlbumActivitiesAct.m66154X1(context, str, z, z2, z3);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void argsToPhotoAlbumFansAct(Act act, String str, boolean z) {
        act.startActivity(PhotoAlbumFansAct.m66192X1(act, str, z));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumFeedAct(Context context, String str, String str2, int i, @Nullable String str3, int i2) {
        return PhotoAlbumFeedAct.m65539Y1(context, str, str2, i, str3, i2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bb */
    public Intent mo61523bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z) {
        return PhotoAlbumFeedAct.m65540Z1(context, str, str2, i, str3, i2, str4, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bt */
    public boolean mo61524bt() {
        return false;
    }

    public r2m buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        return PhotoAlbumFeedBaseFrag.m65217o5(str, str2, i, str3, i2, str4, str5);
    }

    public Fragment buildPhotoAlbumFrag() {
        return cmg.m111233s() ? new NewPhotoAlbumFrag() : new PhotoAlbumFrag();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<uxj0> cameraSdkLoaded() {
        return uc4.m195364n();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cd */
    public boolean mo61525cd() {
        return cmg.m111177E();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cg */
    public void mo61526cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map) {
        cn40.m111366R(act, "share", new MomentShareInfoParcelable(str2, str3, str4, str5, str, str7, str6));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cj */
    public void mo61527cj(Act act, String str) {
        b5i.m102594m().m102613z(act, str);
    }

    public C22421c<uxj0> coreCameraRefreshFilters() {
        return FeedModule.f39701b.f40040H.m159280q();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<uxj0> coreMomentActivityPoll() {
        C10898b c10898b = FeedModule.f39702c;
        return c10898b == null ? C22421c.error(new Exception("coreMomentActivityPoll FeedModule.coreMoment == null")) : c10898b.m61882S2();
    }

    public <T extends ValueObject> C22508b<T> coreMomentAddMomentSub(final JsonAdapter<T> jsonAdapter) {
        final C22508b<T> c22508bM222767b = C22508b.m222767b();
        FeedModule.f39702c.f40053I.subscribe(psd0.m173596G(new y20() { // from class: l.w0i
            @Override // p153l.y20
            public final void call(Object obj) {
                c22508bM222767b.onNext(csj0.m112185c((Moment) obj, jsonAdapter));
            }
        }));
        return c22508bM222767b;
    }

    public <T extends ValueObject> C22421c<List<T>> coreMomentCachedMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<List<T>>) FeedModule.f39702c.m61890W2(str, 0).filter(new qcj() { // from class: l.d0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((vg60) obj));
            }
        }).map(new qcj() { // from class: l.o0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112184b(((vg60) obj).f184001a, jsonAdapter);
            }
        });
    }

    public C22421c<uxj0> coreMomentDeleteLocal(long j) {
        return FeedModule.f39702c.m61912h3(j);
    }

    public C22508b<String> coreMomentDeleteMomentSub() {
        return FeedModule.f39702c.f40054J;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean coreMomentHasMoments(String str) {
        return FeedModule.f39702c.m61914i3(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void coreMomentLatest(String str) {
        FeedModule.f39702c.m61878P3(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<Envelope> coreMomentLike(String str, String str2, boolean z) {
        return FeedModule.f39702c.m61881R3(str, str2, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22421c<vg60<T>> coreMomentMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<vg60<T>>) FeedModule.f39702c.m61897Z3(str).map(new qcj() { // from class: l.b1i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61426R(jsonAdapter, (vg60) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public prl coreMomentMutedUsers() {
        return new rih();
    }

    public C22421c<uxj0> coreMomentNext(String str) {
        return FeedModule.f39702c.m61901b4(str);
    }

    public C22421c<uxj0> coreMomentPost(String str) {
        Moment moment;
        try {
            moment = Moment.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            moment = null;
        }
        return moment == null ? C22508b.m222767b() : FeedModule.f39702c.m61917j4(moment);
    }

    public C22421c<uxj0> coreMomentPrevious(boolean z) {
        return FeedModule.f39702c.m61923m4(false);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cq */
    public <T extends ValueObject> C22421c<pf60<Links, List<T>>> mo61528cq(String str, boolean z, final JsonAdapter<T> jsonAdapter, String str2) {
        return (C22421c<pf60<Links, List<T>>>) FeedModule.f39703d.m145783rc(str, z, str2).map(new qcj() { // from class: l.y0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return pf60.m172085a((Links) pf60Var.f152156a, csj0.m112184b((List) pf60Var.f152157b, jsonAdapter));
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: d */
    public void mo61529d(Throwable th) {
        i4h.m138538g(th);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: di */
    public <T extends ValueObject> C22421c<List<T>> mo61530di(final JsonAdapter<T> jsonAdapter) {
        return (C22421c<List<T>>) FeedModule.f39703d.m145685dc().map(new qcj() { // from class: l.k0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112184b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: dr */
    public TabName mo61531dr() {
        if (cmg.m111241w()) {
            return TabName.Moment;
        }
        TabName tabNameTransform = TabName.transform(owi.f149493l.get());
        if (tabNameTransform == null) {
            return cmg.m111239v() ? TabName.Moment : TabName.Card;
        }
        return tabNameTransform;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: el */
    public C22421c<uxj0> mo61532el() {
        return FeedModule.f39703d.m145716i8(false);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: et */
    public void mo61533et() {
        uc4.m195362l();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f6 */
    public void mo61534f6(DbLinks dbLinks) {
        FeedModule.f39708i.f160260f.upsert(dbLinks);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f9 */
    public C22508b<Boolean> mo61535f9() {
        return FeedModule.f39703d.f121380t1;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fc */
    public int mo61536fc() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = owi.f149489h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<uxj0> filter() {
        return FeedModule.f39701b.m61704f2();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<Followship> following(String str, User user, boolean z, String str2, String str3) {
        return FeedModule.f39703d.m145701g7(str, user, z, str2, str3);
    }

    public C22421c<Followship> followingToChat(String str, User user) {
        return FeedModule.f39703d.m145736l7(str, user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        return FeedModule.f39703d.m145708h7(str, user, z, str2, str3, str4);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fs */
    public boolean mo61537fs() {
        return cmg.m111246y0();
    }

    @NonNull
    public C18526m2 getAbHooker() {
        return this.f40038a;
    }

    public Class getCaptionActClass() {
        return CaptionAct.class;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public keh getFeedMediaHandler(Act act) {
        return new leh();
    }

    public eul getFollowIncreaseIncomeHelper() {
        return new c5h();
    }

    public ful getFollowTipsPopupManager() {
        return new d5h();
    }

    public C22508b<pf60<User, Boolean>> getFollowingChangedSub() {
        return FeedModule.f39703d.f121322Q0;
    }

    public C22507a<Double> getLatestTopicCreateTimeSub() {
        return FeedModule.f39703d.m145513F7();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getMoMoVerificationAppId() {
        return uc4.f178403a;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22508b<pf60<User, Boolean>> getMomentLikeChangedSub() {
        return FeedModule.f39703d.f121326S0;
    }

    public rzl getMomentTrack() {
        return new jhh();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22508b<uxj0> getMomentsPreviousSub() {
        return FeedModule.f39703d.f121389y0;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getTopShowingPageId(Fragment fragment) {
        if (isPhotoAlbumFrag(fragment)) {
            if (fragment instanceof PhotoAlbumFrag) {
                return ((PhotoAlbumFrag) fragment).m64979k6();
            }
            if (fragment instanceof NewPhotoAlbumFrag) {
                return ((NewPhotoAlbumFrag) fragment).m65463C6();
            }
        }
        return "";
    }

    @Override // p153l.qhk0
    public User getUserById(String str) {
        return qhk0.C19577a.m176593a(this, str);
    }

    @Override // p153l.qhk0
    public User getUserByIdInModule(String str) {
        return FeedModule.f39703d.m145688e8(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: gk */
    public C22421c<Envelope> mo61538gk(String str) {
        return FeedModule.f39703d.m145646Y7(str, null);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: h8 */
    public int mo61539h8() {
        return qfh.m176369a();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hk */
    public void mo61540hk(Act act, y20<String> y20Var) {
        StateGuide stateGuide;
        String str = owi.f149489h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0) {
            return;
        }
        zzg.m222256h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, y20Var, null);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hr */
    public boolean mo61541hr(Activity activity) {
        return (activity instanceof MomentsFeedPreviewAct) || (activity instanceof MomentsInProfilePreviewAct) || (activity instanceof MomentsInProfileTextAct);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ia */
    public View mo61542ia(Context context, User user, int i) {
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(context, tec0.f173681i3, null);
        feedUserSexAndAgeView.m67558d(user, 6, i);
        return feedUserSexAndAgeView;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ik */
    public Fragment mo61543ik() {
        return new MomentsFeedFrag();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void initCameraSdk(x20 x20Var) {
        uc4.m195360j();
    }

    public void initMomentPostState() {
        cn40.m111357I();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isCameraSdkLoaded() {
        return uc4.m195359i();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof NewCaptionAct) || (activity instanceof MomentsFeedPreviewAct) || (activity instanceof CompactMediaPickerAct) || (activity instanceof MediaPickerBaseAct) || (activity instanceof MediaPickerAct) || (activity instanceof MediaPreviewAct) || (activity instanceof CropperAct) || (activity instanceof MusicAggregateAct) || (activity instanceof MusicCenterAct) || (activity instanceof MusicListAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewPostAct) || (activity instanceof FeedVideoFlowAct) || (activity instanceof PhotoAlbumFeedPreviewAct);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByFollowship(User user) {
        return tex.m190901b(user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByRelationship(User user) {
        return tex.m190902c(user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentDetailAct(Activity activity) {
        return activity instanceof MomentDetailAct;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentsFeedAct(Activity activity) {
        return activity instanceof MomentsFeedAct;
    }

    public boolean isMomentsFeedFrag(Fragment fragment) {
        return fragment instanceof MomentsFeedFrag;
    }

    public boolean isPhotoAlbumFeedFrag(Fragment fragment) {
        return fragment instanceof PhotoAlbumFeedFrag;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPhotoAlbumFrag(Fragment fragment) {
        return (fragment instanceof PhotoAlbumFrag) || (fragment instanceof NewPhotoAlbumFrag);
    }

    public boolean isPostAlbumPage(Act act) {
        return (act instanceof NewCaptionAct) || (act instanceof MediaPickerBaseAct) || (act instanceof MediaPickerAct);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPostingMoment() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j8 */
    public Intent mo61544j8(Context context, String str, String str2, boolean z, String str3) {
        return TopicAggregationAct.m67264X1(context, str, str2, z, str3);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j9 */
    public void mo61545j9(Act act, String str) {
        h3i.m133488f(act, str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jb */
    public C22507a<Boolean> mo61546jb() {
        return FeedModule.f39703d.f121391z0;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jk */
    public void mo61547jk() {
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ke */
    public boolean mo61548ke() {
        return cmg.m111239v() || cmg.m111241w();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ko */
    public boolean mo61549ko() {
        return cmg.m111238u0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: kq */
    public void mo61550kq(Relationship relationship) {
        FeedModule.f39703d.f121390y1.onNext(relationship);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: l8 */
    public C22421c<Envelope> mo61551l8(String str, String str2) {
        return FeedModule.f39703d.m145653Z7(str, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ld */
    public boolean mo61552ld() {
        return cmg.m111236t0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: le */
    public void mo61553le(Act act, boolean z, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            cn40.m111398l0(act, jyb.m147507f0(new Media[0]), z, str, str5, "");
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f40095id = str2;
        topicMomentNew_.name = str3;
        cn40.m111402n0(act, jyb.m147507f0(new Media[0]), z, str, str5, null, topicMomentNew_, str4);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ln */
    public jxd0 mo61554ln() {
        return FeedModule.f39703d.f121302I;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mn */
    public boolean mo61555mn(User user) {
        return hyh.m137731h(user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22421c<T> momentRefresh(String str, String str2, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<T>) FeedModule.f39703d.m145601Rb(str, str2).map(new qcj() { // from class: l.v0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112185c((ValueObject) ((bkj0) obj).f77081a, jsonAdapter);
            }
        });
    }

    public void momentSeeLikeRefreshLikersData() {
        zq00.m220944k();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mr */
    public boolean mo61556mr() {
        return cmg.m111169A();
    }

    public C22421c<uxj0> mute(String str, boolean z) {
        return FeedModule.f39703d.m145678cc(str, z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n */
    public void mo61557n(y20<List<MMPresetFilter>> y20Var) {
        doi.m117277j().m117284m(FeedModule.f39700a, y20Var);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n7 */
    public boolean mo61558n7() {
        return false;
    }

    public C22421c<uxj0> needBindPhone() {
        return FeedModule.f39703d.m145716i8(false);
    }

    @Override // p153l.qhk0
    public boolean needUpdateUser() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ni */
    public C22421c<Music> mo61559ni(int i) {
        return FeedModule.f39701b.m61697Y1(i);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nm */
    public void mo61560nm(Act act, int i) {
        new pvg(act, i, "").m173953l();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nq */
    public C22508b<Boolean> mo61561nq() {
        return jka.f121283M1;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oa */
    public <T extends ValueObject> void mo61562oa(Act act, Bundle bundle, T t) {
        act.startActivity(IVVideoEditAct.m62141Y1(act, bundle));
    }

    public <T extends ValueObject> C22421c<pf60<Integer, T>> observeMomentPostState(final JsonAdapter<T> jsonAdapter) {
        return (C22421c<pf60<Integer, T>>) cn40.m111374Z().map(new qcj() { // from class: l.x0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61440g0(jsonAdapter, (pf60) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oh */
    public String mo61563oh(Fragment fragment) {
        if (fragment instanceof NewPhotoAlbumFrag) {
            return ((NewPhotoAlbumFrag) fragment).m65462B6();
        }
        return fragment instanceof PhotoAlbumFrag ? ((PhotoAlbumFrag) fragment).m64977j6() : "";
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: or */
    public C22421c<Followship> mo61564or(String str, User user, boolean z, String str2) {
        return FeedModule.f39703d.m145743m7(str, user, z, str2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: p6 */
    public void mo61565p6(boolean z) {
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: pd */
    public String mo61566pd() {
        return vwv.m203795c0();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22421c<pf60<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter) {
        return mo61528cq(str, z, jsonAdapter, "");
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: po */
    public void mo61567po(Act act, String str, y20<Detect> y20Var) {
        ksg.m151222p(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2) {
        FeedModule.f39703d.m145553Kc(relationship, user, z, z2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qg */
    public boolean mo61568qg() {
        return cmg.m111247z();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qn */
    public boolean mo61569qn() {
        return cmg.m111181I();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qo */
    public void mo61570qo(Act act) {
        act.startActivity(PhotoAlbumActivitiesAct.m66154X1(act, PhotoAlbumActivitiesAct.f43092j, true, false, false));
    }

    public void refreshTopicFeed(String str) {
        FeedModule.f39703d.m145651Yc(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: s9 */
    public C22508b<pf60<User, Boolean>> mo61571s9() {
        return FeedModule.f39703d.f121322Q0;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: sh */
    public boolean mo61572sh() {
        return FeedModule.f39703d.f121299H;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: so */
    public boolean mo61573so() {
        return cmg.m111183K();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInnerCameraForResult(Act act, String str, int i) {
        cn40.m111410r0(act, str, i);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInstaLikePickerAct(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) InstaLikePickerAct.class));
    }

    public boolean syncTryLoadLibs() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: t6 */
    public void mo61574t6(Act act, boolean z, String str) {
        act.startActivity(FeedStatusPageAct.m66747s2(act, z, null, str));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: tf */
    public byd0 mo61575tf() {
        return FeedModule.f39703d.f121311L;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        cn40.m111396k0(act, arrayList, z, str);
    }

    public void toCaptionPageWithSendAction(Act act, ArrayList<Media> arrayList) {
        cn40.m111404o0(act, arrayList);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u0 */
    public boolean mo61576u0(Activity activity) {
        return activity instanceof MomentsFeedPreviewAct;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u6 */
    public boolean mo61577u6() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u9 */
    public void mo61578u9(String str) {
        if (jyb.m147481L(str)) {
            return;
        }
        FeedModule.f39708i.f160257c.delete(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ua */
    public boolean mo61579ua() {
        return cmg.m111179G();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ud */
    public boolean mo61580ud(User user) {
        return hyh.m137732i(user);
    }

    public C22421c<uxj0> unReadFansUpdate() {
        return FeedModule.f39703d.m145770pd();
    }

    public void updateLatestTopicCreateTime() {
        FeedModule.f39703d.m145812vd();
    }

    @Override // p153l.qhk0
    public void updateUser(User user) {
        FeedModule.f39703d.m145481Ad(user);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void updateUserOnBlock(String str) {
        FeedModule.f39703d.m145489Bd(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: us */
    public <T extends ValueObject> T mo61581us(String str, JsonAdapter<T> jsonAdapter) {
        return (T) csj0.m112185c(FeedModule.f39703d.m145813w7(str), jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr) {
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            return new o9h(3).mo152787a(act, map, viewArr);
        }
        if (j4h.m143420d() || j4h.m143419c()) {
            return new p9h().mo152787a(act, map, viewArr);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: va */
    public void mo61582va(Act act, String str, String str2) {
        final long jM151162E = ksg.m151162E() * 3600000;
        act.duringCreated(FeedModule.f39703d.m145622Ub(str, str2, false, "")).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.l0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61441h0((bkj0) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.m0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61427S(jM151162E, (Moment) obj);
            }
        }, new y20() { // from class: l.n0i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedServiceImpl.m61430W((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vj */
    public boolean mo61583vj(boolean z) {
        return cmg.m111178F(z);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vm */
    public C22421c<BubbleInfo> mo61584vm(String str) {
        return FeedModule.f39703d.m145702g8(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xa */
    public boolean mo61585xa(String str) {
        return b5i.m102594m().m102598j() && d5i.m114304g(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xl */
    public C22421c<Envelope> mo61586xl(String str) {
        return FeedModule.f39703d.m145834yc(dog.m117238g(str));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xm */
    public void mo61587xm(Object obj) {
        if (obj instanceof Moment) {
            FeedModule.f39708i.f160257c.insert((Moment) obj);
        }
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yj */
    public void mo61588yj(String str) {
        FeedModule.f39708i.f160257c.m112012H(str);
        FeedModule.f39708i.f160258d.m149783F(str);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yq */
    public String mo61589yq() {
        return owi.f149488g.get();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: zd */
    public void mo61590zd(Envelope envelope, HashMap<String, String> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().owner;
            map.put(str, str);
        }
    }

    public r2m buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2) {
        return PhotoAlbumFeedBaseFrag.m65216n5(str, str2, i, str3, i2);
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public C22421c<uxj0> coreMomentPrevious(String str) {
        return FeedModule.f39702c.m61921l4(str);
    }

    public void startInstaLikePickerAct(Act act) {
        act.startActivity(new Intent(act, (Class<?>) InstaLikePickerAct.class));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22421c<vg60<T>> coreMomentMoments(final JsonAdapter<T> jsonAdapter) {
        return (C22421c<vg60<T>>) FeedModule.f39702c.m61895Y3().map(new qcj() { // from class: l.z0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61436c0(jsonAdapter, (vg60) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> C22421c<vg60<T>> coreMomentCachedMoments(String str, int i, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<vg60<T>>) FeedModule.f39702c.m61890W2(str, i).map(new qcj() { // from class: l.a1i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedServiceImpl.m61437d0(jsonAdapter, (vg60) obj);
            }
        });
    }
}
