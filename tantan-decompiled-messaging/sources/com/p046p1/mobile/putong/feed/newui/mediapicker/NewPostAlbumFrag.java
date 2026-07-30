package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.adh;
import p149l.ane0;
import p149l.d30;
import p149l.dmx;
import p149l.e30;
import p149l.f3c0;
import p149l.iti;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.p6j0;
import p149l.q860;
import p149l.r240;
import p149l.rhi;
import p149l.u2h;
import p149l.uzb0;
import p149l.vrx;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xf20;
import p149l.zqx;

/* JADX INFO: loaded from: classes12.dex */
public class NewPostAlbumFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public VRecyclerView f40483I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f40484J;

    /* JADX INFO: renamed from: K */
    public TextView f40485K;

    /* JADX INFO: renamed from: L */
    public ImageView f40486L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f40487M;

    /* JADX INFO: renamed from: N */
    public VText f40488N;

    /* JADX INFO: renamed from: O */
    public q860<iti> f40489O = q860.m173342b();

    /* JADX INFO: renamed from: P */
    public int f40490P = 9;

    /* JADX INFO: renamed from: Q */
    public C22392a<ArrayList<Media>> f40491Q;

    /* JADX INFO: renamed from: R */
    public String f40492R;

    /* JADX INFO: renamed from: S */
    public boolean f40493S;

    /* JADX INFO: renamed from: T */
    public boolean f40494T;

    public NewPostAlbumFrag() {
        this.f40494T = FeedModule.f38855d.m209293I7() != null;
    }

    /* JADX INFO: renamed from: E5 */
    private boolean m62485E5() {
        boolean zM79881b = PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        this.f40493S = zM79881b;
        return zM79881b;
    }

    /* JADX INFO: renamed from: F5 */
    private void m62486F5() {
        this.f40484J.setOnClickListener(new View.OnClickListener() { // from class: l.a240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67226a.m62519H5(view);
            }
        });
        xdl0.m208329E0(this.f40488N, new View.OnClickListener() { // from class: l.b240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72654a.m62520I5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m62487J5() {
        m62529S5();
        xdl0.m208344M(this.f40483I, true);
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Media m62488c5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ Media m62495j5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m62497l5(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q5 */
    public static /* synthetic */ void m62502q5(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            FeedModule.f38855d.m209293I7();
        }
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ Media m62503r5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ q860 m62505t5(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.c240
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A5 */
    public View m62512A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r240.m177559b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: B5, reason: merged with bridge method [inline-methods] */
    public NewPostAct act() {
        return (NewPostAct) super.act();
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: C */
    public Frag mo62514C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m62515C5(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: D5 */
    public boolean m62516D5(Media media) {
        Video videoMo62549q0 = mo62549q0();
        if (NullChecker.m81303a(videoMo62549q0) && NullChecker.m81303a(videoMo62549q0.originUrl)) {
            return rhi.m179355B(videoMo62549q0.originUrl).equals(media.url);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, p149l.hf20
    /* JADX INFO: renamed from: G1 */
    public void mo62517G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        Video videoMo62549q0 = mo62549q0();
        if (NullChecker.m81303a(videoMo62549q0) && !TextUtils.isEmpty(videoMo62549q0.originUrl) && TextUtils.equals(media.url, rhi.m179355B(videoMo62549q0.originUrl))) {
            this.f54013z.clearAllSelectedMedia();
        } else {
            super.mo62517G1(newAlbumMediaItemView, media, i);
        }
        m62536W5(true);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m62518G5(ArrayList<Media> arrayList) {
        this.f54013z.clearAllSelectedMedia();
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            this.f54013z.addAllSelectedMedia(arrayList);
        } else {
            this.f54013z.addSelectedVideo(arrayList.get(0));
        }
        m62533U5();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m62519H5(View view) {
        act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(this.f54013z.allSelectedMedias).withSelectedFolderPath(this.f54013z.selectedFolderPath).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().initialShowSelectFoldPage().withIsNewUIAb(u2h.m191499h()).build()), 66);
        act().overridePendingTransition(uzb0.f178984i, 0);
        p6j0.m167668b("e_album_list", "p_camera_local_album", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m62520I5(View view) {
        ane0.m97752x(act());
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m62521K5(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        xdl0.m208344M(this.f40483I, false);
        m62545d6(true);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m62522L5(List list) {
        if (vwb.m200296J(this.f54013z.allMediasInPhoto.f153135a)) {
            this.f54013z.allMediasInPhoto = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.w140
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m62503r5((Media) obj);
                }
            }), null);
        } else {
            this.f54006B.m159380L(vwb.m200303Q(list, new w9j() { // from class: l.x140
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m62495j5((Media) obj);
                }
            }));
            this.f54013z.allMediasInPhoto.f153135a.addAll(vwb.m200303Q(list, new w9j() { // from class: l.y140
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m62488c5((Media) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m62523M5(dmx dmxVar, q860 q860Var) {
        if (vwb.m200296J(this.f40489O.f153135a)) {
            this.f40489O = q860Var;
            m62541Z5();
        } else {
            m62531T5(this.f40489O.f153135a, q860Var.f153135a);
            m62548f6();
        }
        if (dmxVar.f87002g && NullChecker.m81303a(act())) {
            act().getSupportLoaderManager().mo3088e(0, null, dmxVar);
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m62524N5(Media media) {
        boolean zM81303a = NullChecker.m81303a(media.originUrl);
        Map<String, Integer> map = this.f54005A;
        if (zM81303a) {
            map.put(media.originUrl, Integer.valueOf(this.f54013z.allMediasInPhoto.f153135a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(this.f54013z.allMediasInPhoto.f153135a.indexOf(media)));
        }
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ Boolean m62526P5(iti itiVar) {
        return Boolean.valueOf(itiVar.f114885b.equals(this.f40492R));
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m62527Q5(ArrayList arrayList) {
        if (NullChecker.m81304b(this.f54006B)) {
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof Video)) {
                this.f54013z.clearSelectedVideo();
                this.f54013z.addSelectedVideo((Media) arrayList.get(0));
                this.f54005A.put(((Media) arrayList.get(0)).url, 1);
            }
            ArrayList arrayListM200303Q = vwb.m200303Q(arrayList, new w9j() { // from class: l.g240
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            });
            arrayListM200303Q.addAll(vwb.m200303Q(vwb.m200339n(arrayList, new w9j() { // from class: l.h240
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty(((Media) obj).originUrl));
                }
            }), new w9j() { // from class: l.i240
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).originUrl;
                }
            }));
            Iterator<Map.Entry<String, Integer>> it = this.f54005A.entrySet().iterator();
            while (it.hasNext()) {
                if (!arrayListM200303Q.contains(it.next().getKey())) {
                    it.remove();
                }
            }
            for (Media media : new ArrayList(this.f54013z.allSelectedMedias)) {
                if (!arrayList.contains(media)) {
                    this.f54013z.unCheckMedia(media);
                }
            }
            this.f54006B.m159377I();
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m62528R5(iti itiVar) {
        return Boolean.valueOf(itiVar.f114885b.equals(this.f40492R));
    }

    /* JADX INFO: renamed from: S5 */
    public final void m62529S5() {
        final dmx dmxVar = new dmx(act(), true, true, true, 1000);
        dmxVar.m112546t().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.o240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141506a.m62522L5((List) obj);
            }
        }));
        dmxVar.m112546t().distinctUntilChanged().observeOn(Schedulers.m221493io()).compose(dmx.m112542p(MediaPickerBaseAct.f54606k)).map(new w9j() { // from class: l.p240
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewPostAlbumFrag.m62505t5((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.q240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152199a.m62523M5(dmxVar, (q860) obj);
            }
        }));
        act().getSupportLoaderManager().mo3088e(0, null, dmxVar);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration mo62530T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new FeedPostPageMediaItemRenderDecoration();
    }

    /* JADX INFO: renamed from: T5 */
    public List<iti> m62531T5(List<iti> list, List<iti> list2) {
        if (NullChecker.m81303a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                iti itiVar = list2.get(i);
                if (list.contains(itiVar)) {
                    list.get(list.indexOf(itiVar)).f114887d += itiVar.f114887d;
                    list.get(list.indexOf(itiVar)).f114886c.f153135a.addAll(itiVar.f114886c.f153135a);
                } else {
                    list.add(itiVar);
                }
            }
        }
        return list;
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject mo62532U4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(this.f40490P).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(2).withIsHasPostStatusHeader(false).withHeadResource(o6c0.f142047I2).withMediaPreviewPageId("p_camera_album_picture_preview").withIsNewUIAb(u2h.m191499h()).build();
    }

    /* JADX INFO: renamed from: U5 */
    public void m62533U5() {
        m62535V5(true);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: V4 */
    public vrx mo62534V4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new adh();
    }

    /* JADX INFO: renamed from: V5 */
    public void m62535V5(boolean z) {
        this.f54005A.clear();
        vwb.m200354z(this.f54013z.allSelectedMedias, new e30() { // from class: l.t140
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167286a.m62524N5((Media) obj);
            }
        });
        if (NullChecker.m81303a(this.f54006B)) {
            this.f54006B.m159377I();
        }
        m62536W5(z);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m62536W5(boolean z) {
        ArrayList<Media> arrayList = new ArrayList<>();
        boolean zIsVideoSelected = this.f54013z.isVideoSelected();
        MediaWrapper mediaWrapper = this.f54013z;
        if (zIsVideoSelected) {
            arrayList = vwb.m200324f0(mediaWrapper.getSelectedVideo());
            m62515C5(arrayList);
        } else if (mediaWrapper.isImageSelected()) {
            MediaWrapper mediaWrapper2 = this.f54013z;
            xf20.m208592c(mediaWrapper2.allSelectedMedias, mediaWrapper2.croppedMap);
            arrayList = this.f54013z.allSelectedMedias;
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.l240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125744a.m62525O5((Media) obj);
            }
        });
        if (NullChecker.m81303a(this.f40491Q) && z) {
            this.f40491Q.onNext(new ArrayList<>(arrayList));
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: X4 */
    public RecyclerView mo62537X4() {
        return this.f40483I;
    }

    /* JADX INFO: renamed from: X5 */
    public void m62538X5() {
        if (this.f40493S || !m62485E5()) {
            return;
        }
        xdl0.m208344M(this.f40483I, true);
        m62529S5();
        m62545d6(false);
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m62539Y5() {
        TextView textView;
        if (!isAdded() || (textView = this.f40485K) == null) {
            return;
        }
        iti itiVar = this.f54013z.selectedFolder;
        textView.setText(itiVar == null ? act().getString(R$string.f39014Z2) : itiVar.f114884a);
        MediaWrapper mediaWrapper = this.f54013z;
        iti itiVar2 = mediaWrapper.selectedFolder;
        this.f54006B.m159378J(itiVar2 == null ? mediaWrapper.allMediasInPhoto : itiVar2.f114886c);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Z4 */
    public void mo62540Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        this.f54005A.remove(str);
        this.f54013z.unCheckMedia(media);
        vwb.m200320d0(this.f54013z.allSelectedMedias, new w9j() { // from class: l.u140
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        vwb.m200320d0(this.f54013z.allSelectedMedias, new w9j() { // from class: l.v140
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (vwb.m200296J(this.f54013z.allSelectedMedias)) {
            this.f54006B.m159377I();
            return;
        }
        HashMap map = new HashMap();
        map.put(str, media);
        int i = 0;
        while (true) {
            int size = this.f54013z.allSelectedMedias.size();
            mediaWrapper = this.f54013z;
            if (i >= size) {
                break;
            }
            Media media2 = mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = this.f54005A.containsKey(media2.url);
            Map<String, Integer> map2 = this.f54005A;
            if (zContainsKey) {
                if (i != map2.get(media2.url).intValue()) {
                    this.f54005A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != this.f54005A.get(media2.originUrl).intValue()) {
                this.f54005A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        iti itiVar = mediaWrapper.selectedFolder;
        q860<Media> q860Var = itiVar == null ? mediaWrapper.allMediasInPhoto : itiVar.f114886c;
        for (int i2 = 0; i2 < q860Var.f153135a.size(); i2++) {
            Media media3 = q860Var.f153135a.get(i2);
            if (map.containsKey(media3.url)) {
                this.f54006B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                this.f54006B.notifyItemChanged(i2);
            }
        }
        if (this.f54005A.size() + 1 == this.f40490P) {
            this.f54006B.m159377I();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m62541Z5() {
        iti itiVar = (iti) vwb.m200346r(this.f40489O.f153135a, new w9j() { // from class: l.d240
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83327a.m62526P5((iti) obj);
            }
        });
        if (NullChecker.m81303a(this.f54013z.selectedFolder) && this.f54013z.selectedFolder.equals(itiVar)) {
            return;
        }
        this.f54013z.setSelectedFolder(itiVar);
        m62539Y5();
    }

    /* JADX INFO: renamed from: a6 */
    public void m62542a6(C22392a<ArrayList<Media>> c22392a) {
        if (this.f40491Q == null) {
            this.f40491Q = c22392a;
            duringCreated(c22392a).subscribe(mkd0.m154955G(new e30() { // from class: l.f240
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94145a.m62527Q5((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b6, reason: merged with bridge method [inline-methods] */
    public final void m62525O5(Media media) {
        boolean z = media instanceof Video;
        if (NullChecker.m81303a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : ReminderAction.photo;
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: c6 */
    public void m62544c6(String str) {
        this.f40492R = str;
        m62541Z5();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m62545d6(boolean z) {
        xdl0.m208344M(this.f40487M, z);
        xdl0.m208344M(this.f40484J, !z);
    }

    /* JADX INFO: renamed from: e6 */
    public final void m62546e6() {
        if (isAdded()) {
            TextView textView = this.f40485K;
            iti itiVar = this.f54013z.selectedFolder;
            textView.setText(itiVar == null ? act().getString(R$string.f39014Z2) : itiVar.f114884a);
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, p149l.hf20
    /* JADX INFO: renamed from: f */
    public void mo62547f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (media instanceof Video) {
            if (m62516D5(media)) {
                return;
            }
            if (this.f54013z.selectedVideoMedias.size() >= this.f54011G.getMaxVideoSelectCount()) {
                lsi0.m151593w(R$string.f39116o0);
                return;
            }
        }
        super.mo62547f(newAlbumMediaItemView, media, i);
        m62536W5(true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.e240
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPostAlbumFrag.m62497l5((Bundle) obj);
            }
        }, new d30() { // from class: l.j240
            @Override // p149l.d30
            public final void call() {
                xf20.m208593d(null);
            }
        });
        duringCreated(lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.k240
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPostAlbumFrag.m62502q5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m62548f6() {
        iti itiVar = (iti) vwb.m200346r(this.f40489O.f153135a, new w9j() { // from class: l.z140
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201047a.m62528R5((iti) obj);
            }
        });
        if (NullChecker.m81303a(this.f54013z.selectedFolder) && this.f54013z.selectedFolder.equals(itiVar)) {
            return;
        }
        this.f54013z.setSelectedFolder(itiVar);
        m62546e6();
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (u2h.m191499h()) {
            this.f40486L.setImageResource(f3c0.f94378M3);
        }
        m62486F5();
        if (zqx.m219898k()) {
            new zqx().m219899d(act(), null, new d30() { // from class: l.m240
                @Override // p149l.d30
                public final void call() {
                    this.f130883a.m62487J5();
                }
            }, new e30() { // from class: l.n240
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136765a.m62521K5((PermissionHelper.PermissionDeniedReason) obj);
                }
            }, null, null, null);
        } else if (m62485E5()) {
            m62529S5();
            xdl0.m208344M(this.f40483I, true);
        } else {
            xdl0.m208344M(this.f40483I, false);
            m62545d6(true);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62512A5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.m81303a(arguments)) {
            this.f40490P = arguments.getInt("extra_image_count");
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m62518G5((ArrayList) intent.getSerializableExtra("extra_images"));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (zqx.m219898k()) {
            return;
        }
        m62538X5();
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: q0 */
    public Video mo62549q0() {
        return (Video) this.f54013z.getSelectedVideo();
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo62550x() {
        return this.f54005A;
    }
}
