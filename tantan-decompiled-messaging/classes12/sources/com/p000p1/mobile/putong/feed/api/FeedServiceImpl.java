package com.p000p1.mobile.putong.feed.api;

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
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.api.FeedServiceImpl;
import com.p000p1.mobile.putong.feed.data.Configs;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p000p1.mobile.putong.feed.data.StateGuide;
import com.p000p1.mobile.putong.feed.data.ThirdShareSource;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.UserSetVisibility;
import com.p000p1.mobile.putong.feed.newui.camera.IVVideoEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p000p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p000p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumfans.PhotoAlbumFansAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p000p1.mobile.putong.feed.p005ui.moments.CaptionAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentActivitiesAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedFrag;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedPreviewAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfilePreviewAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileTextAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsSimpleTextAct;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.hpd0;
import l.j760;
import l.k8k0;
import l.lsi0;
import l.m2;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.zpd0;
import p007l.a8h;
import p007l.aug;
import p007l.beh;
import p007l.chh;
import p007l.dpl;
import p007l.exq;
import p007l.f3c0;
import p007l.f8c;
import p007l.hli;
import p007l.hrg;
import p007l.k90;
import p007l.kyg;
import p007l.m3i;
import p007l.mah;
import p007l.n3h;
import p007l.nbq0;
import p007l.nkg;
import p007l.o3h;
import p007l.o3i;
import p007l.o6c0;
import p007l.oe40;
import p007l.okg;
import p007l.omg;
import p007l.p980;
import p007l.pmg;
import p007l.qi00;
import p007l.qmg;
import p007l.r7i;
import p007l.rmg;
import p007l.rrl;
import p007l.s1i;
import p007l.srl;
import p007l.sti;
import p007l.swh;
import p007l.t2h;
import p007l.u2h;
import p007l.ubx;
import p007l.ufh;
import p007l.uuv;
import p007l.vb4;
import p007l.vch;
import p007l.vqg;
import p007l.wch;
import p007l.xia;
import p007l.xzl;
import p007l.ya00;
import p007l.ywl;
import p007l.z7h;
import p007l.zi60;
import p007l.zij0;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Route(name = "feed服务", path = "/feed_service/service")
public class FeedServiceImpl implements FeedService {

    /* JADX INFO: renamed from: a */
    public m2 f651a = new okg();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.FeedServiceImpl$a */
    public static /* synthetic */ class C1577a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f652a;

        static {
            int[] iArr = new int[FeedMomentListType.values().length];
            f652a = iArr;
            try {
                iArr[FeedMomentListType.PERSONAL_PAGE_IN_MINE_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f652a[FeedMomentListType.LIVE_SQUARE_DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m1159F(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m1160H(Envelope envelope) {
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m1162K(Act act, boolean z, User user, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.q(z ? act.getString(R$string.f370I) : act.getString(R$string.f443U0), act.getResources().getDrawable(f3c0.f7750Z1));
        FeedModule.f316d.m16618cc(((DbObject) user).id, !z);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ xaj0 m1163L(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(((DbObject) FeedModule.m1140H().me_()).id);
        if (bubbleInfo == null) {
            return new xaj0((Object) null, (Object) null, (Object) null);
        }
        Emotion emotion = bubbleInfo.emotion;
        return new xaj0(emotion.f209id, emotion.text, emotion.emojiUrl);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m1164M(MessageLocation messageLocation, Moment moment, e30 e30Var, k90 k90Var) {
        if (NullChecker.a(k90Var)) {
            messageLocation.name = k90Var.m11398c();
            messageLocation.address = k90Var.m11396a();
            messageLocation.coordinates = k90Var.m11397b();
        }
        moment.location = messageLocation;
        FeedModule.f315c.m1661k4(moment, e30Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m1167Q(Moment moment, MessageLocation messageLocation, e30 e30Var, Throwable th) {
        moment.location = messageLocation;
        FeedModule.f315c.m1661k4(moment, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ q860 m1168R(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m17470b(q860Var.a, jsonAdapter), q860Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1169S(long j, final Moment moment) {
        String str;
        String str2;
        int i;
        int i2;
        List list;
        if (moment == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (vwb.J(moment.media)) {
            if (TextUtils.isEmpty(moment.value)) {
                str = "";
                str2 = str;
                i = 0;
            } else {
                i2 = 3;
            }
            if (i > 0) {
                f8c.m10082o().m10085B(new d30() { // from class: l.bzh
                    public final void call() {
                        FeedServiceImpl.m1170T(moment);
                    }
                });
                FeedModule.m1140H().mq(moment.owner, ((DbObject) moment).id, i, arrayList, moment.value, str, moment.createdTime, str2);
                list = (List) FeedModule.f316d.f15002s0.e();
                if (vwb.J(list)) {
                    FeedModule.m1140H().ml(moment.owner);
                    return;
                }
                if (mqi0.o() - ((long) ((Moment) list.get(0)).createdTime) > j) {
                    FeedModule.m1140H().ml(moment.owner);
                }
            }
        }
        boolean z = moment.media.get(0) instanceof Audio;
        List<Media> list2 = moment.media;
        if (z) {
            String str3 = String.format("%s''", Integer.valueOf(Math.round(((Audio) list2.get(0)).duration)));
            i2 = 4;
            str = str3;
            str2 = "";
        } else {
            boolean z2 = list2.get(0) instanceof Video;
            List<Media> list3 = moment.media;
            if (z2) {
                String str4 = String.format("%.1f", Float.valueOf(((Video) list3.get(0)).duration));
                arrayList.add(moment.media.get(0).cover().url);
                i2 = 2;
                str2 = str4;
                str = "";
            } else {
                Iterator<Media> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().cover().url);
                }
                i2 = 1;
            }
        }
        i = i2;
        if (i > 0) {
            f8c.m10082o().m10085B(new d30() { // from class: l.bzh
                public final void call() {
                    FeedServiceImpl.m1170T(moment);
                }
            });
            FeedModule.m1140H().mq(moment.owner, ((DbObject) moment).id, i, arrayList, moment.value, str, moment.createdTime, str2);
            list = (List) FeedModule.f316d.f15002s0.e();
            if (vwb.J(list)) {
                FeedModule.m1140H().ml(moment.owner);
                return;
            }
            if (mqi0.o() - ((long) ((Moment) list.get(0)).createdTime) > j) {
                FeedModule.m1140H().ml(moment.owner);
            }
        }
        str = "";
        str2 = str;
        i = i2;
        if (i > 0) {
            f8c.m10082o().m10085B(new d30() { // from class: l.bzh
                public final void call() {
                    FeedServiceImpl.m1170T(moment);
                }
            });
            FeedModule.m1140H().mq(moment.owner, ((DbObject) moment).id, i, arrayList, moment.value, str, moment.createdTime, str2);
            list = (List) FeedModule.f316d.f15002s0.e();
            if (vwb.J(list)) {
                FeedModule.m1140H().ml(moment.owner);
                return;
            }
            if (mqi0.o() - ((long) ((Moment) list.get(0)).createdTime) > j) {
                FeedModule.m1140H().ml(moment.owner);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m1170T(Moment moment) {
        FeedModule.f321i.f6464c.upsert(moment);
        FeedModule.m1140H().uf(moment.owner);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m1172W(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m1174Y(Moment moment, Throwable th) {
        lsi0.y("发布失败");
        zi60.m17436w().m17458o(moment, "p_moment_post", th, false, null);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m1175Z(Moment moment, long j, roj0 roj0Var) {
        lsi0.y("发布成功");
        r7i.m13852j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        zi60.m17436w().m17457n(moment, "p_moment_post", 201, false, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ q860 m1178c0(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m17470b(q860Var.a, jsonAdapter), q860Var.b);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ q860 m1179d0(JsonAdapter jsonAdapter, q860 q860Var) {
        return new q860(zij0.m17470b(q860Var.a, jsonAdapter), q860Var.b);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ j760 m1182g0(JsonAdapter jsonAdapter, j760 j760Var) {
        return new j760((Integer) j760Var.a, zij0.m17471c((ValueObject) j760Var.b, jsonAdapter));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Moment m1183h0(xaj0 xaj0Var) {
        return (Moment) xaj0Var.a;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Af */
    public void mo1184Af(Context context, Media media, ArrayList<Media> arrayList) {
        context.startActivity(NewAlbumPreviewNoEditAct.m3319g2(context, media, arrayList));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ah */
    public boolean mo1185Ah() {
        return FeedModule.f319g.m10115a();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: At */
    public String mo1186At() {
        return uuv.m15148d0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bd */
    public boolean mo1187Bd() {
        return nkg.m12232c0() || nkg.m12234d0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bg */
    public c<Envelope> mo1188Bg(String str, String str2) {
        return FeedModule.f316d.m16471Hb(str, str2, true);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bh */
    public void mo1189Bh(Act act, boolean z) {
        hrg.m10716g().m10719f(act, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Bj */
    public boolean mo1190Bj() {
        return ((Boolean) FeedModule.f316d.f14964Z.get()).booleanValue();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: C6 */
    public qmg mo1191C6(FeedMomentListType feedMomentListType) {
        int i = C1577a.f652a[feedMomentListType.ordinal()];
        if (i != 1) {
            return i != 2 ? new rmg() : new pmg();
        }
        return new rmg();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ca */
    public <T extends ValueObject> List<T> mo1192Ca(Envelope envelope, JsonAdapter<T> jsonAdapter) {
        return zij0.m17470b(((FeedData) envelope.getModuleData(FeedData.class)).moments, jsonAdapter);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Co */
    public boolean mo1193Co() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Cr */
    public void mo1194Cr(Act act, String str, e30<Boolean> e30Var) {
        vqg.m15467B(act, str, e30Var);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: D8 */
    public void mo1195D8(String str, String str2) {
        FeedModule.f321i.f6464c.m14540L(str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Dk */
    public void mo1196Dk(Act act, String str, String str2, String str3) {
        BubbleInfo bubbleInfoM16474I7 = FeedModule.f316d.m16474I7();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bubbleInfoM16474I7);
        act.startActivity(FeedStatusPageAct.m6688q2(act, arrayList, 0, "", str3));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: E6 */
    public Intent mo1197E6(Context context, String str, String str2) {
        return QATopicAggregationActivity.m7127V1(context, str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ea */
    public void mo1198Ea() {
        m3i.m11762m().m11768l();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ee */
    public void mo1199Ee(Envelope envelope, HashMap<String, List<Media>> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (vwb.J(list)) {
            return;
        }
        for (Moment moment : list) {
            if (!vwb.J(moment.media)) {
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

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ek */
    public boolean mo1200Ek(User user) {
        return swh.m14344l(user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Fm */
    public void mo1201Fm(String str, boolean z) {
        PhotoAlbumFeedFrag.f3087G.onNext(new j760(str, Boolean.valueOf(z)));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gc */
    public BubbleInfo mo1202Gc() {
        return FeedModule.f316d.m16474I7();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gk */
    public nbq0 mo1203Gk(Act act, String str) {
        return new FeedWriterLevelView((Context) act, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Gm */
    public List<String> mo1204Gm() {
        return vqg.f14276i;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: H7 */
    public b<j760<Boolean, Boolean>> mo1205H7() {
        return FeedStatusPageAct.f4210B;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ha */
    public boolean mo1206Ha() {
        return ((Boolean) FeedModule.f316d.f14968b0.get()).booleanValue();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Hj */
    public boolean mo1207Hj() {
        return nkg.m12259q();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ib */
    public boolean mo1208Ib(String str) {
        return TextUtils.equals(str, "p_meet_greet") || TextUtils.equals(str, "p_state_explore");
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: In */
    public void mo1209In(RelativeLayout relativeLayout, VImage vImage) {
        vImage.setImageResource(u2h.m14723h() ? f3c0.f7873o5 : f3c0.f7865n5);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Jg */
    public void mo1210Jg(Act act, String str, String str2) {
        final Moment moment = new Moment();
        moment.value = str;
        moment.userSetVisibility = UserSetVisibility.get("everyone");
        moment.nullCheck();
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        momentAdditionalData.sendFrom = null;
        momentAdditionalData.share = null;
        ThirdShareSource thirdShareSourceNew_ = ThirdShareSource.new_();
        thirdShareSourceNew_.sourceId = str2;
        thirdShareSourceNew_.sourceType = "voiceLive";
        moment.thirdShareSource = thirdShareSourceNew_;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f316d.m16436Cc(moment).subscribe(mkd0.H(new e30() { // from class: l.ezh
            public final void call(Object obj) {
                FeedServiceImpl.m1175Z(moment, jElapsedRealtime, (roj0) obj);
            }
        }, new e30() { // from class: l.fzh
            public final void call(Object obj) {
                FeedServiceImpl.m1174Y(moment, (Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: K8 */
    public boolean mo1211K8() {
        return nkg.m12210H();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ka */
    public xaj0<Integer, List<String>, Boolean> mo1212Ka(String str) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        if (NullChecker.a(momentM16753w7)) {
            return new xaj0<>(Integer.valueOf(momentM16753w7.likes.count), momentM16753w7.likes.ids, Boolean.valueOf(momentM16753w7.haveLiked));
        }
        return null;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ke */
    public c<Envelope> mo1213Ke() {
        return FeedModule.f316d.m16774yc(omg.m12695g("limit=20"));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kk */
    public boolean mo1214Kk(User user) {
        if (user == null) {
            return false;
        }
        List list = (List) FeedModule.f315c.f670M.n();
        return NullChecker.a(list) && list.contains(((DbObject) user).id);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kn */
    public c<roj0> mo1215Kn(String str, String str2, boolean z, String str3) {
        return FeedModule.f316d.m16457Fb(str, str2, z, str3).flatMap(new w9j() { // from class: l.syh
            public final Object call(Object obj) {
                return c.just(roj0.a);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Kr */
    public void mo1216Kr(Act act, String str, String str2, final e30<String> e30Var) {
        final Moment moment = new Moment();
        ThirdShareSource thirdShareSourceNew_ = ThirdShareSource.new_();
        thirdShareSourceNew_.sourceType = "aiStory";
        thirdShareSourceNew_.sourceId = str2;
        moment.thirdShareSource = thirdShareSourceNew_;
        moment.media = vwb.f0(new Media[0]);
        moment.value = str;
        final MessageLocation messageLocationNew_ = MessageLocation.new_();
        moment.nullCheck();
        moment.allowForward = null;
        MomentAdditionalData momentAdditionalData = moment.additionalData;
        momentAdditionalData.sendFrom = null;
        momentAdditionalData.share = null;
        moment.from = "aiStory";
        p980.m12949f(act).subscribe(mkd0.H(new e30() { // from class: l.czh
            public final void call(Object obj) {
                FeedServiceImpl.m1164M(messageLocationNew_, moment, e30Var, (k90) obj);
            }
        }, new e30() { // from class: l.dzh
            public final void call(Object obj) {
                FeedServiceImpl.m1167Q(moment, messageLocationNew_, e30Var, (Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lj */
    public boolean mo1217Lj() {
        return nkg.m12215M();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ll */
    public c<Envelope> mo1218Ll(String str, String str2) {
        return FeedModule.f316d.m16571W6(str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Lq */
    public boolean mo1219Lq() {
        return nkg.m12270v0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: M8 */
    public boolean mo1220M8() {
        return nkg.m12248k0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Mh */
    public <T extends ValueObject> T mo1221Mh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m17471c(FeedModule.f315c.m1635X3(str), jsonAdapter);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nh */
    public Intent mo1222Nh(Context context, String str, String str2, String str3, String str4) {
        return TopicVoteAggregationAct.m7329Y1(context, str, str2, str3, str4);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nj */
    public boolean mo1223Nj() {
        return nkg.m12212J();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Nr */
    public void mo1224Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            oe40.m12583k0(act, arrayList, z, str);
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f708id = str2;
        topicMomentNew_.name = str3;
        oe40.m12589n0(act, arrayList, z, str, null, null, topicMomentNew_, str4);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ns */
    public int mo1225Ns() {
        return 3;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oh */
    public <T extends ValueObject> T mo1226Oh(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m17471c((Moment) FeedModule.f321i.f6464c.cached(str), jsonAdapter);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Oj */
    public DbLinks mo1227Oj(String str) {
        return (DbLinks) FeedModule.f321i.f6467f.query(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ol */
    public c<MusicContent> mo1228Ol(Music music) {
        return FeedModule.f314b.m1442b2(music);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P6 */
    public Intent mo1229P6(Act act, boolean z, BubbleInfo bubbleInfo, String str) {
        return FeedStatusPageAct.m6690r2(act, z, bubbleInfo, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: P9 */
    public <T extends ValueObject> c<T> mo1230P9(String str, final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f321i.f6464c.uiGet(str).map(new w9j() { // from class: l.azh
            public final Object call(Object obj) {
                return zij0.m17471c((Moment) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pf */
    public void mo1231Pf(final Act act, final User user, final boolean z) {
        if (user == null) {
            return;
        }
        act.progress(R$string.f445U2, true);
        FeedModule.f315c.f670M.m1698M(((DbObject) user).id, !z).subscribe(mkd0.H(new e30() { // from class: l.tyh
            public final void call(Object obj) {
                FeedServiceImpl.m1162K(act, z, user, (roj0) obj);
            }
        }, new e30() { // from class: l.uyh
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pm */
    public boolean mo1232Pm() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Pn */
    public List<Followship> mo1233Pn(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return feedData == null ? new ArrayList() : feedData.followships;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qm */
    public boolean mo1234Qm(String str) {
        return vqg.m15541t(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Qn */
    public void mo1235Qn(Act act) {
        ComicFaceRecorderActivity.m3041h2(act);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: R9 */
    public void mo1236R9(View view, float f) {
        exq.m9962b(view, f);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rc */
    public boolean mo1237Rc() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rd */
    public Intent mo1238Rd(Act act, String str, String str2, boolean z) {
        return FeedPoiAggregationAct.m6111V1(act, str, str2, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Re */
    public void mo1239Re(boolean z) {
        FeedModule.f316d.f14924H = z;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Rf */
    public void mo1240Rf(ArrayList<String> arrayList) {
        FeedModule.f321i.f6464c.m14537I(arrayList);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: S6 */
    public zpd0 mo1241S6() {
        return ya00.f15332K;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sd */
    public List<String> mo1242Sd() {
        return vqg.m15543u();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Sg */
    public void mo1243Sg(Act act, String str, String str2, boolean z, String str3) {
        act.startActivity(FeedStatusPageAct.m6687p2(act, str, str2, true, str3));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: T7 */
    public void mo1244T7(Act act, User user, String str, @Nullable e30<Relationship> e30Var) {
        swh.m14338f(act, user, str, e30Var);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tf */
    public void mo1245Tf(Act act, String str) {
        mo1243Sg(act, null, null, true, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tg */
    public c<xaj0<String, String, String>> mo1246Tg() {
        if (((Map) FeedModule.f316d.m16488K7().e()).get(((DbObject) FeedModule.m1140H().me_()).id) == null) {
            FeedModule.f316d.m16481J7().subscribe(mkd0.H(new e30() { // from class: l.pyh
                public final void call(Object obj) {
                    FeedServiceImpl.m1160H((Envelope) obj);
                }
            }, new e30() { // from class: l.qyh
                public final void call(Object obj) {
                    FeedServiceImpl.m1159F((Throwable) obj);
                }
            }));
        }
        return FeedModule.f316d.m16488K7().map(new w9j() { // from class: l.ryh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1163L((Map) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ti */
    public <T extends ValueObject> T mo1247Ti(JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m17471c(o3i.m12435e(), jsonAdapter);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Tp */
    public boolean mo1248Tp() {
        return nkg.m12255o();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: U6 */
    public void mo1249U6(BubbleInfo bubbleInfo, String str) {
        FeedModule.f317e.m10712V0(bubbleInfo, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ui */
    public boolean mo1250Ui(String str) {
        return TextUtils.equals(str, "p_meet_greet");
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Um */
    public void mo1251Um(String str) {
        FeedModule.m1142Um(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Ur */
    public String mo1252Ur(String str) {
        return zi60.m17436w().m17468z(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: V9 */
    public String mo1253V9() {
        return mah.m11869b().m11871c();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vg */
    public boolean mo1254Vg() {
        return nkg.m12221S();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vo */
    public boolean mo1255Vo() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Vp */
    public void mo1256Vp(Act act, User user, String str) {
        swh.m14337e(act, user, str, false);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wd */
    public c<Envelope> mo1257Wd(String str) {
        return FeedModule.f316d.m16550T6(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Wm */
    public boolean mo1258Wm() {
        return nkg.m12227Y();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yb */
    public void mo1259Yb(Act act, String str, boolean z) {
        FeedModule.f319g.m10116b(act, str, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yc */
    public void mo1260Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2) {
        zi60.m17436w().m17449f(zij0.m17471c(valueObject, Moment.JSON_ADAPTER), str, z, i, z2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Yr */
    public c<List<BubbleInfo>> mo1261Yr() {
        return FeedModule.f316d.m16600a8();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Z6 */
    public c<Envelope> mo1262Z6(String str) {
        return FeedModule.f316d.m16558U7(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: Zk */
    public User mo1263Zk(String str) {
        return FeedModule.f316d.m16628e8(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: a6 */
    public c<roj0> mo1264a6() {
        return FeedModule.f316d.f14943O0.map(new w9j() { // from class: l.nzh
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addOnGetMediaAction(Activity activity, e30<Boolean> e30Var) {
        if (activity instanceof MomentDetailAct) {
            ((MomentDetailAct) activity).m5928a2().m5955M4(e30Var);
        }
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentActivitiesAct(Context context, String str) {
        return MomentActivitiesAct.m7833X1(context, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentDetailAct(Context context, String str, String str2, String str3) {
        return MomentDetailAct.C2150a.m5931a(context).m5936f(str).m5943m(str2).m5944n(str3).m5950t(true).m5932b();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedAct(Context context) {
        return MomentsFeedAct.m8021X1(context);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsFeedPreviewAct(Context context, String str, int i, boolean z, String str2, String str3) {
        return MomentsFeedPreviewAct.m8066a2(context, str, i, z, str2, str3);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsInProfileAct(Context context, String str, String str2) {
        return MomentsInProfileAct.m8110V1(context, str, str2);
    }

    public Intent argsToMomentsInProfilePreviewAct(Context context, String str, String str2) {
        return MomentsInProfilePreviewAct.m8117I2(context, str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToMomentsSimpleTextAct(Context context, String str, String str2) {
        return MomentsSimpleTextAct.m8225a2(context, str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumActivitiesAct(Context context, String str, boolean z, boolean z2, boolean z3) {
        return PhotoAlbumActivitiesAct.m6071V1(context, str, z, z2, z3);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void argsToPhotoAlbumFansAct(Act act, String str, boolean z) {
        act.startActivity(PhotoAlbumFansAct.m6110V1(act, str, z));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public Intent argsToPhotoAlbumFeedAct(Context context, String str, String str2, int i, @Nullable String str3, int i2) {
        return PhotoAlbumFeedAct.m5429X1(context, str, str2, i, str3, i2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bb */
    public Intent mo1265bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z) {
        return PhotoAlbumFeedAct.m5430Y1(context, str, str2, i, str3, i2, str4, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: bt */
    public boolean mo1266bt() {
        return false;
    }

    public xzl buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        return PhotoAlbumFeedBaseFrag.m5081o5(str, str2, i, str3, i2, str4, str5);
    }

    public Fragment buildPhotoAlbumFrag() {
        return nkg.m12263s() ? new NewPhotoAlbumFrag() : new PhotoAlbumFrag();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<roj0> cameraSdkLoaded() {
        return vb4.m15415n();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cd */
    public boolean mo1267cd() {
        return nkg.m12207E();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cg */
    public void mo1268cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map) {
        oe40.m12553R(act, "share", new MomentShareInfoParcelable(str2, str3, str4, str5, str, str7, str6));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cj */
    public void mo1269cj(Act act, String str) {
        m3i.m11762m().m11781z(act, str);
    }

    public c<roj0> coreCameraRefreshFilters() {
        return FeedModule.f314b.f653H.z();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<roj0> coreMomentActivityPoll() {
        C1579b c1579b = FeedModule.f315c;
        return c1579b == null ? c.error(new Exception("coreMomentActivityPoll FeedModule.coreMoment == null")) : c1579b.m1624S2();
    }

    public <T extends ValueObject> b<T> coreMomentAddMomentSub(final JsonAdapter<T> jsonAdapter) {
        final b<T> bVarB = b.b();
        FeedModule.f315c.f666I.subscribe(mkd0.G(new e30() { // from class: l.hzh
            public final void call(Object obj) {
                bVarB.onNext(zij0.m17471c((Moment) obj, jsonAdapter));
            }
        }));
        return bVarB;
    }

    public <T extends ValueObject> c<List<T>> coreMomentCachedMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f315c.m1632W2(str, 0).filter(new w9j() { // from class: l.oyh
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((q860) obj));
            }
        }).map(new w9j() { // from class: l.zyh
            public final Object call(Object obj) {
                return zij0.m17470b(((q860) obj).a, jsonAdapter);
            }
        });
    }

    public c<roj0> coreMomentDeleteLocal(long j) {
        return FeedModule.f315c.m1654h3(j);
    }

    public b<String> coreMomentDeleteMomentSub() {
        return FeedModule.f315c.f667J;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean coreMomentHasMoments(String str) {
        return FeedModule.f315c.m1656i3(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void coreMomentLatest(String str) {
        FeedModule.f315c.m1620P3(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<Envelope> coreMomentLike(String str, String str2, boolean z) {
        return FeedModule.f315c.m1623R3(str, str2, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> c<q860<T>> coreMomentMoments(String str, final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f315c.m1639Z3(str).map(new w9j() { // from class: l.mzh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1168R(jsonAdapter, (q860) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public dpl coreMomentMutedUsers() {
        return new chh();
    }

    public c<roj0> coreMomentNext(String str) {
        return FeedModule.f315c.m1643b4(str);
    }

    public c<roj0> coreMomentPost(String str) {
        Moment moment;
        try {
            moment = (Moment) Moment.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.c(e);
            moment = null;
        }
        return moment == null ? b.b() : FeedModule.f315c.m1659j4(moment);
    }

    public c<roj0> coreMomentPrevious(boolean z) {
        return FeedModule.f315c.m1665m4(false);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: cq */
    public <T extends ValueObject> c<j760<Links, List<T>>> mo1270cq(String str, boolean z, final JsonAdapter<T> jsonAdapter, String str2) {
        return FeedModule.f316d.m16723rc(str, z, str2).map(new w9j() { // from class: l.jzh
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return j760.a((Links) j760Var.a, zij0.m17470b((List) j760Var.b, jsonAdapter));
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: d */
    public void mo1271d(Throwable th) {
        t2h.m14427g(th);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: di */
    public <T extends ValueObject> c<List<T>> mo1272di(final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f316d.m16625dc().map(new w9j() { // from class: l.vyh
            public final Object call(Object obj) {
                return zij0.m17470b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: dr */
    public TabName mo1273dr() {
        if (nkg.m12271w()) {
            return TabName.Moment;
        }
        TabName tabNameTransform = TabName.transform((String) sti.f13086l.get());
        if (tabNameTransform == null) {
            return nkg.m12269v() ? TabName.Moment : TabName.Card;
        }
        return tabNameTransform;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: el */
    public c<roj0> mo1274el() {
        return FeedModule.f316d.m16656i8(false);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: et */
    public void mo1275et() {
        vb4.m15413l();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f6 */
    public void mo1276f6(DbLinks dbLinks) {
        FeedModule.f321i.f6467f.upsert(dbLinks);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: f9 */
    public b<Boolean> mo1277f9() {
        return FeedModule.f316d.f15005t1;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fc */
    public int mo1278fc() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = (String) sti.f13082h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<roj0> filter() {
        return FeedModule.f314b.m1446f2();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<Followship> following(String str, User user, boolean z, String str2, String str3) {
        return FeedModule.f316d.m16641g7(str, user, z, str2, str3);
    }

    public c<Followship> followingToChat(String str, User user) {
        return FeedModule.f316d.m16676l7(str, user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        return FeedModule.f316d.m16648h7(str, user, z, str2, str3, str4);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: fs */
    public boolean mo1279fs() {
        return nkg.m12276y0();
    }

    @NonNull
    public m2 getAbHooker() {
        return this.f651a;
    }

    public Class getCaptionActClass() {
        return CaptionAct.class;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public vch getFeedMediaHandler(Act act) {
        return new wch();
    }

    public rrl getFollowIncreaseIncomeHelper() {
        return new n3h();
    }

    public srl getFollowTipsPopupManager() {
        return new o3h();
    }

    public b<j760<User, Boolean>> getFollowingChangedSub() {
        return FeedModule.f316d.f14947Q0;
    }

    public a<Double> getLatestTopicCreateTimeSub() {
        return FeedModule.f316d.m16453F7();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getMoMoVerificationAppId() {
        return vb4.f14134a;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public b<j760<User, Boolean>> getMomentLikeChangedSub() {
        return FeedModule.f316d.f14951S0;
    }

    public ywl getMomentTrack() {
        return new ufh();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public b<roj0> getMomentsPreviousSub() {
        return FeedModule.f316d.f15014y0;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public String getTopShowingPageId(Fragment fragment) {
        if (isPhotoAlbumFrag(fragment)) {
            if (fragment instanceof PhotoAlbumFrag) {
                return ((PhotoAlbumFrag) fragment).m4822k6();
            }
            if (fragment instanceof NewPhotoAlbumFrag) {
                return ((NewPhotoAlbumFrag) fragment).m5343C6();
            }
        }
        return "";
    }

    public User getUserById(String str) {
        return k8k0.a.a(this, str);
    }

    public User getUserByIdInModule(String str) {
        return FeedModule.f316d.m16628e8(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: gk */
    public c<Envelope> mo1280gk(String str) {
        return FeedModule.f316d.m16586Y7(str, null);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: h8 */
    public int mo1281h8() {
        return beh.m8810a();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hk */
    public void mo1282hk(Act act, e30<String> e30Var) {
        StateGuide stateGuide;
        String str = (String) sti.f13082h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0) {
            return;
        }
        kyg.m11539h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, e30Var, null);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: hr */
    public boolean mo1283hr(Activity activity) {
        return (activity instanceof MomentsFeedPreviewAct) || (activity instanceof MomentsInProfilePreviewAct) || (activity instanceof MomentsInProfileTextAct);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ia */
    public View mo1284ia(Context context, User user, int i) {
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(context, o6c0.f11231i3, null);
        feedUserSexAndAgeView.m7540d(user, 6, i);
        return feedUserSexAndAgeView;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ik */
    public Fragment mo1285ik() {
        return new MomentsFeedFrag();
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void initCameraSdk(d30 d30Var) {
        vb4.m15411j();
    }

    public void initMomentPostState() {
        oe40.m12544I();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isCameraSdkLoaded() {
        return vb4.m15410i();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof NewCaptionAct) || (activity instanceof MomentsFeedPreviewAct) || (activity instanceof CompactMediaPickerAct) || (activity instanceof MediaPickerBaseAct) || (activity instanceof MediaPickerAct) || (activity instanceof MediaPreviewAct) || (activity instanceof CropperAct) || (activity instanceof MusicAggregateAct) || (activity instanceof MusicCenterAct) || (activity instanceof MusicListAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewPostAct) || (activity instanceof FeedVideoFlowAct) || (activity instanceof PhotoAlbumFeedPreviewAct);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByFollowship(User user) {
        return ubx.m15072b(user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMatchedByRelationship(User user) {
        return ubx.m15073c(user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentDetailAct(Activity activity) {
        return activity instanceof MomentDetailAct;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isMomentsFeedAct(Activity activity) {
        return activity instanceof MomentsFeedAct;
    }

    public boolean isMomentsFeedFrag(Fragment fragment) {
        return fragment instanceof MomentsFeedFrag;
    }

    public boolean isPhotoAlbumFeedFrag(Fragment fragment) {
        return fragment instanceof PhotoAlbumFeedFrag;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPhotoAlbumFrag(Fragment fragment) {
        return (fragment instanceof PhotoAlbumFrag) || (fragment instanceof NewPhotoAlbumFrag);
    }

    public boolean isPostAlbumPage(Act act) {
        return (act instanceof NewCaptionAct) || (act instanceof MediaPickerBaseAct) || (act instanceof MediaPickerAct);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean isPostingMoment() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j8 */
    public Intent mo1286j8(Context context, String str, String str2, boolean z, String str3) {
        return TopicAggregationAct.m7233V1(context, str, str2, z, str3);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: j9 */
    public void mo1287j9(Act act, String str) {
        s1i.m13982f(act, str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jb */
    public a<Boolean> mo1288jb() {
        return FeedModule.f316d.f15016z0;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: jk */
    public void mo1289jk() {
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ke */
    public boolean mo1290ke() {
        return nkg.m12269v() || nkg.m12271w();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ko */
    public boolean mo1291ko() {
        return nkg.m12268u0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: kq */
    public void mo1292kq(Relationship relationship) {
        FeedModule.f316d.f15015y1.onNext(relationship);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: l8 */
    public c<Envelope> mo1293l8(String str, String str2) {
        return FeedModule.f316d.m16593Z7(str, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ld */
    public boolean mo1294ld() {
        return nkg.m12266t0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: le */
    public void mo1295le(Act act, boolean z, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            oe40.m12585l0(act, vwb.f0(new Media[0]), z, str, str5, "");
            return;
        }
        TopicMoment topicMomentNew_ = TopicMoment.new_();
        topicMomentNew_.f708id = str2;
        topicMomentNew_.name = str3;
        oe40.m12589n0(act, vwb.f0(new Media[0]), z, str, str5, null, topicMomentNew_, str4);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ln */
    public hpd0 mo1296ln() {
        return FeedModule.f316d.f14927I;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mn */
    public boolean mo1297mn(User user) {
        return swh.m14340h(user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> c<T> momentRefresh(String str, String str2, final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f316d.m16541Rb(str, str2).map(new w9j() { // from class: l.gzh
            public final Object call(Object obj) {
                return zij0.m17471c((ValueObject) ((xaj0) obj).a, jsonAdapter);
            }
        });
    }

    public void momentSeeLikeRefreshLikersData() {
        qi00.m13568k();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: mr */
    public boolean mo1298mr() {
        return nkg.m12199A();
    }

    public c<roj0> mute(String str, boolean z) {
        return FeedModule.f316d.m16618cc(str, z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n */
    public void mo1299n(e30<List<MMPresetFilter>> e30Var) {
        hli.m10655j().m10662m(FeedModule.f313a, e30Var);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: n7 */
    public boolean mo1300n7() {
        return false;
    }

    public c<roj0> needBindPhone() {
        return FeedModule.f316d.m16656i8(false);
    }

    public boolean needUpdateUser() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ni */
    public c<Music> mo1301ni(int i) {
        return FeedModule.f314b.m1439Y1(i);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nm */
    public void mo1302nm(Act act, int i) {
        new aug(act, i, "").m8607l();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: nq */
    public b<Boolean> mo1303nq() {
        return xia.f14908M1;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oa */
    public <T extends ValueObject> void mo1304oa(Act act, Bundle bundle, T t) {
        act.startActivity(IVVideoEditAct.m1883X1(act, bundle));
    }

    public <T extends ValueObject> c<j760<Integer, T>> observeMomentPostState(final JsonAdapter<T> jsonAdapter) {
        return oe40.m12561Z().map(new w9j() { // from class: l.izh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1182g0(jsonAdapter, (j760) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: oh */
    public String mo1305oh(Fragment fragment) {
        if (fragment instanceof NewPhotoAlbumFrag) {
            return ((NewPhotoAlbumFrag) fragment).m5342B6();
        }
        return fragment instanceof PhotoAlbumFrag ? ((PhotoAlbumFrag) fragment).m4820j6() : "";
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: or */
    public c<Followship> mo1306or(String str, User user, boolean z, String str2) {
        return FeedModule.f316d.m16683m7(str, user, z, str2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: p6 */
    public void mo1307p6(boolean z) {
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: pd */
    public String mo1308pd() {
        return uuv.m15146c0();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> c<j760<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter) {
        return mo1270cq(str, z, jsonAdapter, "");
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: po */
    public void mo1309po(Act act, String str, e30<Detect> e30Var) {
        vqg.m15533p(act, str, e30Var);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2) {
        FeedModule.f316d.m16493Kc(relationship, user, z, z2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qg */
    public boolean mo1310qg() {
        return nkg.m12277z();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qn */
    public boolean mo1311qn() {
        return nkg.m12211I();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: qo */
    public void mo1312qo(Act act) {
        act.startActivity(PhotoAlbumActivitiesAct.m6071V1(act, PhotoAlbumActivitiesAct.f3705j, true, false, false));
    }

    public void refreshTopicFeed(String str) {
        FeedModule.f316d.m16591Yc(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: s9 */
    public b<j760<User, Boolean>> mo1313s9() {
        return FeedModule.f316d.f14947Q0;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: sh */
    public boolean mo1314sh() {
        return FeedModule.f316d.f14924H;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: so */
    public boolean mo1315so() {
        return nkg.m12213K();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInnerCameraForResult(Act act, String str, int i) {
        oe40.m12597r0(act, str, i);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void startInstaLikePickerAct(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) InstaLikePickerAct.class));
    }

    public boolean syncTryLoadLibs() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: t6 */
    public void mo1316t6(Act act, boolean z, String str) {
        act.startActivity(FeedStatusPageAct.m6690r2(act, z, null, str));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: tf */
    public zpd0 mo1317tf() {
        return FeedModule.f316d.f14936L;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        oe40.m12583k0(act, arrayList, z, str);
    }

    public void toCaptionPageWithSendAction(Act act, ArrayList<Media> arrayList) {
        oe40.m12591o0(act, arrayList);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u0 */
    public boolean mo1318u0(Activity activity) {
        return activity instanceof MomentsFeedPreviewAct;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u6 */
    public boolean mo1319u6() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: u9 */
    public void mo1320u9(String str) {
        if (vwb.L(str)) {
            return;
        }
        FeedModule.f321i.f6464c.delete(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ua */
    public boolean mo1321ua() {
        return nkg.m12209G();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: ud */
    public boolean mo1322ud(User user) {
        return swh.m14341i(user);
    }

    public c<roj0> unReadFansUpdate() {
        return FeedModule.f316d.m16710pd();
    }

    public void updateLatestTopicCreateTime() {
        FeedModule.f316d.m16752vd();
    }

    public void updateUser(User user) {
        FeedModule.f316d.m16421Ad(user);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public void updateUserOnBlock(String str) {
        FeedModule.f316d.m16429Bd(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: us */
    public <T extends ValueObject> T mo1323us(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m17471c(FeedModule.f316d.m16753w7(str), jsonAdapter);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr) {
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            return new z7h(3).mo15680a(act, map, viewArr);
        }
        if (u2h.m14719d() || u2h.m14718c()) {
            return new a8h().mo15680a(act, map, viewArr);
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: va */
    public void mo1324va(Act act, String str, String str2) {
        final long jM15473E = vqg.m15473E() * 3600000;
        act.duringCreated(FeedModule.f316d.m16562Ub(str, str2, false, "")).observeOn(Schedulers.io()).map(new w9j() { // from class: l.wyh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1183h0((xaj0) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.xyh
            public final void call(Object obj) {
                FeedServiceImpl.m1169S(jM15473E, (Moment) obj);
            }
        }, new e30() { // from class: l.yyh
            public final void call(Object obj) {
                FeedServiceImpl.m1172W((Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vj */
    public boolean mo1325vj(boolean z) {
        return nkg.m12208F(z);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: vm */
    public c<BubbleInfo> mo1326vm(String str) {
        return FeedModule.f316d.m16642g8(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xa */
    public boolean mo1327xa(String str) {
        return m3i.m11762m().m11766j() && o3i.m12437g(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xl */
    public c<Envelope> mo1328xl(String str) {
        return FeedModule.f316d.m16774yc(omg.m12695g(str));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: xm */
    public void mo1329xm(Object obj) {
        if (obj instanceof Moment) {
            FeedModule.f321i.f6464c.insert((Moment) obj);
        }
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yj */
    public void mo1330yj(String str) {
        FeedModule.f321i.f6464c.m14536H(str);
        FeedModule.f321i.f6465d.m8761F(str);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: yq */
    public String mo1331yq() {
        return (String) sti.f13081g.get();
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    /* JADX INFO: renamed from: zd */
    public void mo1332zd(Envelope envelope, HashMap<String, String> map) {
        List<Moment> list = ((FeedData) envelope.getModuleData(FeedData.class)).moments;
        if (vwb.J(list)) {
            return;
        }
        Iterator<Moment> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().owner;
            map.put(str, str);
        }
    }

    public xzl buildPhotoAlbumFeedFrag(String str, String str2, int i, String str3, int i2) {
        return PhotoAlbumFeedBaseFrag.m5080n5(str, str2, i, str3, i2);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public c<roj0> coreMomentPrevious(String str) {
        return FeedModule.f315c.m1663l4(str);
    }

    public void startInstaLikePickerAct(Act act) {
        act.startActivity(new Intent((Context) act, (Class<?>) InstaLikePickerAct.class));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> c<q860<T>> coreMomentMoments(final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f315c.m1637Y3().map(new w9j() { // from class: l.kzh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1178c0(jsonAdapter, (q860) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService
    public <T extends ValueObject> c<q860<T>> coreMomentCachedMoments(String str, int i, final JsonAdapter<T> jsonAdapter) {
        return FeedModule.f315c.m1632W2(str, i).map(new w9j() { // from class: l.lzh
            public final Object call(Object obj) {
                return FeedServiceImpl.m1179d0(jsonAdapter, (q860) obj);
            }
        });
    }
}
