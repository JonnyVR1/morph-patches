package com.p000p1.mobile.putong.feed.newui.mediapicker;

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
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.ane0;
import l.d30;
import l.e30;
import l.iti;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.nuh0;
import l.q860;
import l.rhi;
import l.v4e;
import l.vrx;
import l.vwb;
import l.w4e;
import l.w9j;
import l.x4e;
import l.xdl0;
import l.zqx;
import p007l.adh;
import p007l.dmx;
import p007l.f3c0;
import p007l.o6c0;
import p007l.p6j0;
import p007l.r240;
import p007l.u2h;
import p007l.uzb0;
import p007l.xf20;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPostAlbumFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public VRecyclerView f1944I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f1945J;

    /* JADX INFO: renamed from: K */
    public TextView f1946K;

    /* JADX INFO: renamed from: L */
    public ImageView f1947L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f1948M;

    /* JADX INFO: renamed from: N */
    public VText f1949N;

    /* JADX INFO: renamed from: O */
    public q860<iti> f1950O = q860.b();

    /* JADX INFO: renamed from: P */
    public int f1951P = 9;

    /* JADX INFO: renamed from: Q */
    public a<ArrayList<Media>> f1952Q;

    /* JADX INFO: renamed from: R */
    public String f1953R;

    /* JADX INFO: renamed from: S */
    public boolean f1954S;

    /* JADX INFO: renamed from: T */
    public boolean f1955T;

    public NewPostAlbumFrag() {
        this.f1955T = FeedModule.f316d.m16474I7() != null;
    }

    /* JADX INFO: renamed from: E5 */
    private boolean m3487E5() {
        boolean zB = PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        this.f1954S = zB;
        return zB;
    }

    /* JADX INFO: renamed from: F5 */
    private void m3488F5() {
        this.f1945J.setOnClickListener(new View.OnClickListener() { // from class: l.a240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5550a.m3521H5(view);
            }
        });
        xdl0.E0(this.f1949N, new View.OnClickListener() { // from class: l.b240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5889a.m3522I5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m3489J5() {
        m3531S5();
        xdl0.M(this.f1944I, true);
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Media m3490c5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ Media m3497j5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m3499l5(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q5 */
    public static /* synthetic */ void m3504q5(c cVar) {
        if (cVar == c.i) {
            FeedModule.f316d.m16474I7();
        }
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ Media m3505r5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ q860 m3507t5(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.c240
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: A5 */
    public View m3514A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r240.m13828b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B5, reason: merged with bridge method [inline-methods] */
    public NewPostAct act() {
        return super/*com.p1.mobile.android.app.Frag*/.act();
    }

    /* JADX INFO: renamed from: C */
    public Frag m3516C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m3517C5(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: D5 */
    public boolean m3518D5(Media media) {
        Video videoM3554q0 = m3554q0();
        if (NullChecker.a(videoM3554q0) && NullChecker.a(videoM3554q0.originUrl)) {
            return rhi.B(videoM3554q0.originUrl).equals(media.url);
        }
        return false;
    }

    /* JADX INFO: renamed from: G1 */
    public void m3519G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        Video videoM3554q0 = m3554q0();
        if (NullChecker.a(videoM3554q0) && !TextUtils.isEmpty(videoM3554q0.originUrl) && TextUtils.equals(media.url, rhi.B(videoM3554q0.originUrl))) {
            ((MediaPickerBaseFrag) this).z.clearAllSelectedMedia();
        } else {
            super.G1(newAlbumMediaItemView, media, i);
        }
        m3538W5(true);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m3520G5(ArrayList<Media> arrayList) {
        ((MediaPickerBaseFrag) this).z.clearAllSelectedMedia();
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            ((MediaPickerBaseFrag) this).z.addAllSelectedMedia(arrayList);
        } else {
            ((MediaPickerBaseFrag) this).z.addSelectedVideo(arrayList.get(0));
        }
        m3535U5();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m3521H5(View view) {
        act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(((MediaPickerBaseFrag) this).z.allSelectedMedias).withSelectedFolderPath(((MediaPickerBaseFrag) this).z.selectedFolderPath).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().initialShowSelectFoldPage().withIsNewUIAb(u2h.m14723h()).build()), 66);
        act().overridePendingTransition(uzb0.f13995i, 0);
        p6j0.m12912b("e_album_list", "p_camera_local_album", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m3522I5(View view) {
        ane0.x(act());
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m3523K5(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        xdl0.M(this.f1944I, false);
        m3547d6(true);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m3524L5(List list) {
        if (vwb.J(((MediaPickerBaseFrag) this).z.allMediasInPhoto.a)) {
            ((MediaPickerBaseFrag) this).z.allMediasInPhoto = new q860(vwb.Q(list, new w9j() { // from class: l.w140
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m3505r5((Media) obj);
                }
            }), (DbLinks) null);
        } else {
            ((MediaPickerBaseFrag) this).B.L(vwb.Q(list, new w9j() { // from class: l.x140
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m3497j5((Media) obj);
                }
            }));
            ((MediaPickerBaseFrag) this).z.allMediasInPhoto.a.addAll(vwb.Q(list, new w9j() { // from class: l.y140
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m3490c5((Media) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m3525M5(dmx dmxVar, q860 q860Var) {
        if (vwb.J(this.f1950O.a)) {
            this.f1950O = q860Var;
            m3543Z5();
        } else {
            m3533T5(this.f1950O.a, q860Var.a);
            m3551f6();
        }
        if (dmxVar.f7003g && NullChecker.a(act())) {
            act().getSupportLoaderManager().e(0, (Bundle) null, dmxVar);
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m3526N5(Media media) {
        boolean zA = NullChecker.a(media.originUrl);
        Map map = ((MediaPickerBaseFrag) this).A;
        if (zA) {
            map.put(media.originUrl, Integer.valueOf(((MediaPickerBaseFrag) this).z.allMediasInPhoto.a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(((MediaPickerBaseFrag) this).z.allMediasInPhoto.a.indexOf(media)));
        }
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ Boolean m3528P5(iti itiVar) {
        return Boolean.valueOf(itiVar.b.equals(this.f1953R));
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m3529Q5(ArrayList arrayList) {
        if (NullChecker.b(((MediaPickerBaseFrag) this).B)) {
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof Video)) {
                ((MediaPickerBaseFrag) this).z.clearSelectedVideo();
                ((MediaPickerBaseFrag) this).z.addSelectedVideo((Media) arrayList.get(0));
                ((MediaPickerBaseFrag) this).A.put(((Media) arrayList.get(0)).url, 1);
            }
            ArrayList arrayListQ = vwb.Q(arrayList, new w9j() { // from class: l.g240
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            });
            arrayListQ.addAll(vwb.Q(vwb.n(arrayList, new w9j() { // from class: l.h240
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty(((Media) obj).originUrl));
                }
            }), new w9j() { // from class: l.i240
                public final Object call(Object obj) {
                    return ((Media) obj).originUrl;
                }
            }));
            Iterator it = ((MediaPickerBaseFrag) this).A.entrySet().iterator();
            while (it.hasNext()) {
                if (!arrayListQ.contains(((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
            for (Media media : new ArrayList(((MediaPickerBaseFrag) this).z.allSelectedMedias)) {
                if (!arrayList.contains(media)) {
                    ((MediaPickerBaseFrag) this).z.unCheckMedia(media);
                }
            }
            ((MediaPickerBaseFrag) this).B.I();
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m3530R5(iti itiVar) {
        return Boolean.valueOf(itiVar.b.equals(this.f1953R));
    }

    /* JADX INFO: renamed from: S5 */
    public final void m3531S5() {
        final dmx dmxVar = new dmx(act(), true, true, true, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        dmxVar.m9516t().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.o240
            public final void call(Object obj) {
                this.f10979a.m3524L5((List) obj);
            }
        }));
        dmxVar.m9516t().distinctUntilChanged().observeOn(Schedulers.io()).compose(dmx.m9509p(MediaPickerBaseAct.k)).map(new w9j() { // from class: l.p240
            public final Object call(Object obj) {
                return NewPostAlbumFrag.m3507t5((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.q240
            public final void call(Object obj) {
                this.f12050a.m3525M5(dmxVar, (q860) obj);
            }
        }));
        act().getSupportLoaderManager().e(0, (Bundle) null, dmxVar);
    }

    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration m3532T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new FeedPostPageMediaItemRenderDecoration();
    }

    /* JADX INFO: renamed from: T5 */
    public List<iti> m3533T5(List<iti> list, List<iti> list2) {
        if (NullChecker.a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                iti itiVar = list2.get(i);
                if (list.contains(itiVar)) {
                    list.get(list.indexOf(itiVar)).d += itiVar.d;
                    list.get(list.indexOf(itiVar)).c.a.addAll(itiVar.c.a);
                } else {
                    list.add(itiVar);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject m3534U4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(this.f1951P).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(2).withIsHasPostStatusHeader(false).withHeadResource(o6c0.f11066I2).withMediaPreviewPageId("p_camera_album_picture_preview").withIsNewUIAb(u2h.m14723h()).build();
    }

    /* JADX INFO: renamed from: U5 */
    public void m3535U5() {
        m3537V5(true);
    }

    /* JADX INFO: renamed from: V4 */
    public vrx m3536V4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new adh();
    }

    /* JADX INFO: renamed from: V5 */
    public void m3537V5(boolean z) {
        ((MediaPickerBaseFrag) this).A.clear();
        vwb.z(((MediaPickerBaseFrag) this).z.allSelectedMedias, new e30() { // from class: l.t140
            public final void call(Object obj) {
                this.f13151a.m3526N5((Media) obj);
            }
        });
        if (NullChecker.a(((MediaPickerBaseFrag) this).B)) {
            ((MediaPickerBaseFrag) this).B.I();
        }
        m3538W5(z);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m3538W5(boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean zIsVideoSelected = ((MediaPickerBaseFrag) this).z.isVideoSelected();
        MediaWrapper mediaWrapper = ((MediaPickerBaseFrag) this).z;
        if (zIsVideoSelected) {
            arrayList = vwb.f0(new Media[]{mediaWrapper.getSelectedVideo()});
            m3517C5(arrayList);
        } else if (mediaWrapper.isImageSelected()) {
            MediaWrapper mediaWrapper2 = ((MediaPickerBaseFrag) this).z;
            xf20.m16084c(mediaWrapper2.allSelectedMedias, mediaWrapper2.croppedMap);
            arrayList = ((MediaPickerBaseFrag) this).z.allSelectedMedias;
        }
        vwb.z(arrayList, new e30() { // from class: l.l240
            public final void call(Object obj) {
                this.f9846a.m3527O5((Media) obj);
            }
        });
        if (NullChecker.a(this.f1952Q) && z) {
            this.f1952Q.onNext(new ArrayList(arrayList));
        }
    }

    /* JADX INFO: renamed from: X4 */
    public RecyclerView m3539X4() {
        return this.f1944I;
    }

    /* JADX INFO: renamed from: X5 */
    public void m3540X5() {
        if (this.f1954S || !m3487E5()) {
            return;
        }
        xdl0.M(this.f1944I, true);
        m3531S5();
        m3547d6(false);
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m3541Y5() {
        TextView textView;
        if (!isAdded() || (textView = this.f1946K) == null) {
            return;
        }
        iti itiVar = ((MediaPickerBaseFrag) this).z.selectedFolder;
        textView.setText(itiVar == null ? act().getString(R$string.f475Z2) : itiVar.a);
        MediaWrapper mediaWrapper = ((MediaPickerBaseFrag) this).z;
        iti itiVar2 = mediaWrapper.selectedFolder;
        ((MediaPickerBaseFrag) this).B.J(itiVar2 == null ? mediaWrapper.allMediasInPhoto : itiVar2.c);
    }

    /* JADX INFO: renamed from: Z4 */
    public void m3542Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        ((MediaPickerBaseFrag) this).A.remove(str);
        ((MediaPickerBaseFrag) this).z.unCheckMedia(media);
        vwb.d0(((MediaPickerBaseFrag) this).z.allSelectedMedias, new w9j() { // from class: l.u140
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        vwb.d0(((MediaPickerBaseFrag) this).z.allSelectedMedias, new w9j() { // from class: l.v140
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (vwb.J(((MediaPickerBaseFrag) this).z.allSelectedMedias)) {
            ((MediaPickerBaseFrag) this).B.I();
            return;
        }
        HashMap map = new HashMap();
        map.put(str, media);
        int i = 0;
        while (true) {
            int size = ((MediaPickerBaseFrag) this).z.allSelectedMedias.size();
            mediaWrapper = ((MediaPickerBaseFrag) this).z;
            if (i >= size) {
                break;
            }
            Media media2 = (Media) mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = ((MediaPickerBaseFrag) this).A.containsKey(media2.url);
            Map map2 = ((MediaPickerBaseFrag) this).A;
            if (zContainsKey) {
                if (i != ((Integer) map2.get(media2.url)).intValue()) {
                    ((MediaPickerBaseFrag) this).A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != ((Integer) ((MediaPickerBaseFrag) this).A.get(media2.originUrl)).intValue()) {
                ((MediaPickerBaseFrag) this).A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        iti itiVar = mediaWrapper.selectedFolder;
        q860 q860Var = itiVar == null ? mediaWrapper.allMediasInPhoto : itiVar.c;
        for (int i2 = 0; i2 < q860Var.a.size(); i2++) {
            Media media3 = (Media) q860Var.a.get(i2);
            if (map.containsKey(media3.url)) {
                ((MediaPickerBaseFrag) this).B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                ((MediaPickerBaseFrag) this).B.notifyItemChanged(i2);
            }
        }
        if (((MediaPickerBaseFrag) this).A.size() + 1 == this.f1951P) {
            ((MediaPickerBaseFrag) this).B.I();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m3543Z5() {
        iti itiVar = (iti) vwb.r(this.f1950O.a, new w9j() { // from class: l.d240
            public final Object call(Object obj) {
                return this.f6779a.m3528P5((iti) obj);
            }
        });
        if (NullChecker.a(((MediaPickerBaseFrag) this).z.selectedFolder) && ((MediaPickerBaseFrag) this).z.selectedFolder.equals(itiVar)) {
            return;
        }
        ((MediaPickerBaseFrag) this).z.setSelectedFolder(itiVar);
        m3541Y5();
    }

    /* JADX INFO: renamed from: a6 */
    public void m3544a6(a<ArrayList<Media>> aVar) {
        if (this.f1952Q == null) {
            this.f1952Q = aVar;
            duringCreated(aVar).subscribe(mkd0.G(new e30() { // from class: l.f240
                public final void call(Object obj) {
                    this.f7520a.m3529Q5((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b6, reason: merged with bridge method [inline-methods] */
    public final void m3527O5(Media media) {
        boolean z = media instanceof Video;
        if (NullChecker.a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : "photo";
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: c6 */
    public void m3546c6(String str) {
        this.f1953R = str;
        m3543Z5();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m3547d6(boolean z) {
        xdl0.M(this.f1948M, z);
        xdl0.M(this.f1945J, !z);
    }

    /* JADX INFO: renamed from: e6 */
    public final void m3548e6() {
        if (isAdded()) {
            TextView textView = this.f1946K;
            iti itiVar = ((MediaPickerBaseFrag) this).z.selectedFolder;
            textView.setText(itiVar == null ? act().getString(R$string.f475Z2) : itiVar.a);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3549f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (media instanceof Video) {
            if (m3518D5(media)) {
                return;
            }
            if (((MediaPickerBaseFrag) this).z.selectedVideoMedias.size() >= ((MediaPickerBaseFrag) this).G.getMaxVideoSelectCount()) {
                lsi0.w(R$string.f577o0);
                return;
            }
        }
        super.f(newAlbumMediaItemView, media, i);
        m3538W5(true);
    }

    /* JADX INFO: renamed from: f4 */
    public void m3550f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        creates(new e30() { // from class: l.e240
            public final void call(Object obj) {
                NewPostAlbumFrag.m3499l5((Bundle) obj);
            }
        }, new d30() { // from class: l.j240
            public final void call() {
                xf20.m16085d(null);
            }
        });
        duringCreated(lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.k240
            public final void call(Object obj) {
                NewPostAlbumFrag.m3504q5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m3551f6() {
        iti itiVar = (iti) vwb.r(this.f1950O.a, new w9j() { // from class: l.z140
            public final Object call(Object obj) {
                return this.f15550a.m3530R5((iti) obj);
            }
        });
        if (NullChecker.a(((MediaPickerBaseFrag) this).z.selectedFolder) && ((MediaPickerBaseFrag) this).z.selectedFolder.equals(itiVar)) {
            return;
        }
        ((MediaPickerBaseFrag) this).z.setSelectedFolder(itiVar);
        m3548e6();
    }

    /* JADX INFO: renamed from: g4 */
    public void m3552g4(Bundle bundle) {
        super.g4(bundle);
        if (u2h.m14723h()) {
            this.f1947L.setImageResource(f3c0.f7661M3);
        }
        m3488F5();
        if (zqx.k()) {
            new zqx().d(act(), (View) null, new d30() { // from class: l.m240
                public final void call() {
                    this.f10185a.m3489J5();
                }
            }, new e30() { // from class: l.n240
                public final void call(Object obj) {
                    this.f10623a.m3523K5((PermissionHelper.PermissionDeniedReason) obj);
                }
            }, (x4e) null, (w4e) null, (v4e) null);
        } else if (m3487E5()) {
            m3531S5();
            xdl0.M(this.f1944I, true);
        } else {
            xdl0.M(this.f1944I, false);
            m3547d6(true);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3514A5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m3553n4(Bundle bundle) {
        super.n4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.a(arguments)) {
            this.f1951P = arguments.getInt("extra_image_count");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m3520G5((ArrayList) intent.getSerializableExtra("extra_images"));
        }
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (zqx.k()) {
            return;
        }
        m3540X5();
    }

    /* JADX INFO: renamed from: q0 */
    public Video m3554q0() {
        return (Video) ((MediaPickerBaseFrag) this).z.getSelectedVideo();
    }

    /* JADX INFO: renamed from: x */
    public Map<String, Integer> m3555x() {
        return ((MediaPickerBaseFrag) this).A;
    }
}
