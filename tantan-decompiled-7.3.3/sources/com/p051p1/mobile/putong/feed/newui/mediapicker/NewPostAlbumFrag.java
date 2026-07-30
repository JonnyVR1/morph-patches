package com.p051p1.mobile.putong.feed.newui.mediapicker;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.a8c0;
import p153l.avx;
import p153l.bnl0;
import p153l.ewi;
import p153l.fb40;
import p153l.fo0;
import p153l.ho20;
import p153l.hve0;
import p153l.j4h;
import p153l.jyb;
import p153l.lbc0;
import p153l.o1j0;
import p153l.oki;
import p153l.peh;
import p153l.psd0;
import p153l.qcj;
import p153l.s0y;
import p153l.tec0;
import p153l.tfj0;
import p153l.vg60;
import p153l.wzx;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewPostAlbumFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public VRecyclerView f41331I;

    /* JADX INFO: renamed from: J */
    public LinearLayout f41332J;

    /* JADX INFO: renamed from: K */
    public TextView f41333K;

    /* JADX INFO: renamed from: L */
    public ImageView f41334L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f41335M;

    /* JADX INFO: renamed from: N */
    public VText f41336N;

    /* JADX INFO: renamed from: O */
    public vg60<ewi> f41337O = vg60.m201220b();

    /* JADX INFO: renamed from: P */
    public int f41338P = 9;

    /* JADX INFO: renamed from: Q */
    public C22507a<ArrayList<Media>> f41339Q;

    /* JADX INFO: renamed from: R */
    public String f41340R;

    /* JADX INFO: renamed from: S */
    public boolean f41341S;

    /* JADX INFO: renamed from: T */
    public boolean f41342T;

    public NewPostAlbumFrag() {
        this.f41342T = FeedModule.f39703d.m145534I7() != null;
    }

    /* JADX INFO: renamed from: E5 */
    private boolean m63668E5() {
        boolean zM81064b = PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        this.f41341S = zM81064b;
        return zM81064b;
    }

    /* JADX INFO: renamed from: F5 */
    private void m63669F5() {
        this.f41332J.setOnClickListener(new View.OnClickListener() { // from class: l.oa40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145659a.m63702H5(view);
            }
        });
        bnl0.m105509E0(this.f41336N, new View.OnClickListener() { // from class: l.pa40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151243a.m63703I5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m63670J5() {
        m63712S5();
        bnl0.m105524M(this.f41331I, true);
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Media m63671c5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ Media m63678j5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m63680l5(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q5 */
    public static /* synthetic */ void m63685q5(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            FeedModule.f39703d.m145534I7();
        }
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ Media m63686r5(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ vg60 m63688t5(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.qa40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A5 */
    public View m63695A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fb40.m124863b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: B5, reason: merged with bridge method [inline-methods] */
    public NewPostAct act() {
        return (NewPostAct) super.act();
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: C */
    public Frag mo63697C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m63698C5(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: D5 */
    public boolean m63699D5(Media media) {
        Video videoMo63732q0 = mo63732q0();
        if (NullChecker.m82486a(videoMo63732q0) && NullChecker.m82486a(videoMo63732q0.originUrl)) {
            return oki.m168011B(videoMo63732q0.originUrl).equals(media.url);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, p153l.rn20
    /* JADX INFO: renamed from: G1 */
    public void mo63700G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        Video videoMo63732q0 = mo63732q0();
        if (NullChecker.m82486a(videoMo63732q0) && !TextUtils.isEmpty(videoMo63732q0.originUrl) && TextUtils.equals(media.url, oki.m168011B(videoMo63732q0.originUrl))) {
            this.f54861z.clearAllSelectedMedia();
        } else {
            super.mo63700G1(newAlbumMediaItemView, media, i);
        }
        m63719W5(true);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m63701G5(ArrayList<Media> arrayList) {
        this.f54861z.clearAllSelectedMedia();
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            this.f54861z.addAllSelectedMedia(arrayList);
        } else {
            this.f54861z.addSelectedVideo(arrayList.get(0));
        }
        m63716U5();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m63702H5(View view) {
        act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(this.f54861z.allSelectedMedias).withSelectedFolderPath(this.f54861z.selectedFolderPath).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().initialShowSelectFoldPage().withIsNewUIAb(j4h.m143424h()).build()), 66);
        act().overridePendingTransition(a8c0.f68909i, 0);
        tfj0.m190939b("e_album_list", "p_camera_local_album", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m63703I5(View view) {
        hve0.m137322x(act());
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m63704K5(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        bnl0.m105524M(this.f41331I, false);
        m63728d6(true);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m63705L5(List list) {
        if (jyb.m147479J(this.f54861z.allMediasInPhoto.f184001a)) {
            this.f54861z.allMediasInPhoto = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.ka40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m63686r5((Media) obj);
                }
            }), null);
        } else {
            this.f54854B.m144825L(jyb.m147486Q(list, new qcj() { // from class: l.la40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m63678j5((Media) obj);
                }
            }));
            this.f54861z.allMediasInPhoto.f184001a.addAll(jyb.m147486Q(list, new qcj() { // from class: l.ma40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewPostAlbumFrag.m63671c5((Media) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m63706M5(avx avxVar, vg60 vg60Var) {
        if (jyb.m147479J(this.f41337O.f184001a)) {
            this.f41337O = vg60Var;
            m63724Z5();
        } else {
            m63714T5(this.f41337O.f184001a, vg60Var.f184001a);
            m63731f6();
        }
        if (avxVar.f73675g && NullChecker.m82486a(act())) {
            act().getSupportLoaderManager().mo3089e(0, null, avxVar);
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m63707N5(Media media) {
        boolean zM82486a = NullChecker.m82486a(media.originUrl);
        Map<String, Integer> map = this.f54853A;
        if (zM82486a) {
            map.put(media.originUrl, Integer.valueOf(this.f54861z.allMediasInPhoto.f184001a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(this.f54861z.allMediasInPhoto.f184001a.indexOf(media)));
        }
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ Boolean m63709P5(ewi ewiVar) {
        return Boolean.valueOf(ewiVar.f96162b.equals(this.f41340R));
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m63710Q5(ArrayList arrayList) {
        if (NullChecker.m82487b(this.f54854B)) {
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof Video)) {
                this.f54861z.clearSelectedVideo();
                this.f54861z.addSelectedVideo((Media) arrayList.get(0));
                this.f54853A.put(((Media) arrayList.get(0)).url, 1);
            }
            ArrayList arrayListM147486Q = jyb.m147486Q(arrayList, new qcj() { // from class: l.ua40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            });
            arrayListM147486Q.addAll(jyb.m147486Q(jyb.m147522n(arrayList, new qcj() { // from class: l.va40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty(((Media) obj).originUrl));
                }
            }), new qcj() { // from class: l.wa40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).originUrl;
                }
            }));
            Iterator<Map.Entry<String, Integer>> it = this.f54853A.entrySet().iterator();
            while (it.hasNext()) {
                if (!arrayListM147486Q.contains(it.next().getKey())) {
                    it.remove();
                }
            }
            for (Media media : new ArrayList(this.f54861z.allSelectedMedias)) {
                if (!arrayList.contains(media)) {
                    this.f54861z.unCheckMedia(media);
                }
            }
            this.f54854B.m144822I();
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m63711R5(ewi ewiVar) {
        return Boolean.valueOf(ewiVar.f96162b.equals(this.f41340R));
    }

    /* JADX INFO: renamed from: S5 */
    public final void m63712S5() {
        final avx avxVar = new avx(act(), true, true, true, 1000);
        avxVar.m100542t().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.cb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80704a.m63705L5((List) obj);
            }
        }));
        avxVar.m100542t().distinctUntilChanged().observeOn(Schedulers.m222739io()).compose(avx.m100538p(MediaPickerBaseAct.f55454k)).map(new qcj() { // from class: l.db40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewPostAlbumFrag.m63688t5((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.eb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92830a.m63706M5(avxVar, (vg60) obj);
            }
        }));
        act().getSupportLoaderManager().mo3089e(0, null, avxVar);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration mo63713T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new FeedPostPageMediaItemRenderDecoration();
    }

    /* JADX INFO: renamed from: T5 */
    public List<ewi> m63714T5(List<ewi> list, List<ewi> list2) {
        if (NullChecker.m82486a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                ewi ewiVar = list2.get(i);
                if (list.contains(ewiVar)) {
                    list.get(list.indexOf(ewiVar)).f96164d += ewiVar.f96164d;
                    list.get(list.indexOf(ewiVar)).f96163c.f184001a.addAll(ewiVar.f96163c.f184001a);
                } else {
                    list.add(ewiVar);
                }
            }
        }
        return list;
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject mo63715U4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(this.f41338P).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(2).withIsHasPostStatusHeader(false).withHeadResource(tec0.f173516I2).withMediaPreviewPageId("p_camera_album_picture_preview").withIsNewUIAb(j4h.m143424h()).build();
    }

    /* JADX INFO: renamed from: U5 */
    public void m63716U5() {
        m63718V5(true);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: V4 */
    public s0y mo63717V4(MediaPickerParamsObject mediaPickerParamsObject) {
        return new peh();
    }

    /* JADX INFO: renamed from: V5 */
    public void m63718V5(boolean z) {
        this.f54853A.clear();
        jyb.m147537z(this.f54861z.allSelectedMedias, new y20() { // from class: l.ha40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108466a.m63707N5((Media) obj);
            }
        });
        if (NullChecker.m82486a(this.f54854B)) {
            this.f54854B.m144822I();
        }
        m63719W5(z);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m63719W5(boolean z) {
        ArrayList<Media> arrayList = new ArrayList<>();
        boolean zIsVideoSelected = this.f54861z.isVideoSelected();
        MediaWrapper mediaWrapper = this.f54861z;
        if (zIsVideoSelected) {
            arrayList = jyb.m147507f0(mediaWrapper.getSelectedVideo());
            m63698C5(arrayList);
        } else if (mediaWrapper.isImageSelected()) {
            MediaWrapper mediaWrapper2 = this.f54861z;
            ho20.m136384c(mediaWrapper2.allSelectedMedias, mediaWrapper2.croppedMap);
            arrayList = this.f54861z.allSelectedMedias;
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.za40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203537a.m63708O5((Media) obj);
            }
        });
        if (NullChecker.m82486a(this.f41339Q) && z) {
            this.f41339Q.onNext(new ArrayList<>(arrayList));
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: X4 */
    public RecyclerView mo63720X4() {
        return this.f41331I;
    }

    /* JADX INFO: renamed from: X5 */
    public void m63721X5() {
        if (this.f41341S || !m63668E5()) {
            return;
        }
        bnl0.m105524M(this.f41331I, true);
        m63712S5();
        m63728d6(false);
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m63722Y5() {
        TextView textView;
        if (!isAdded() || (textView = this.f41333K) == null) {
            return;
        }
        ewi ewiVar = this.f54861z.selectedFolder;
        textView.setText(ewiVar == null ? act().getString(R$string.f39862Z2) : ewiVar.f96161a);
        MediaWrapper mediaWrapper = this.f54861z;
        ewi ewiVar2 = mediaWrapper.selectedFolder;
        this.f54854B.m144823J(ewiVar2 == null ? mediaWrapper.allMediasInPhoto : ewiVar2.f96163c);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Z4 */
    public void mo63723Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        this.f54853A.remove(str);
        this.f54861z.unCheckMedia(media);
        jyb.m147503d0(this.f54861z.allSelectedMedias, new qcj() { // from class: l.ia40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        jyb.m147503d0(this.f54861z.allSelectedMedias, new qcj() { // from class: l.ja40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (jyb.m147479J(this.f54861z.allSelectedMedias)) {
            this.f54854B.m144822I();
            return;
        }
        HashMap map = new HashMap();
        map.put(str, media);
        int i = 0;
        while (true) {
            int size = this.f54861z.allSelectedMedias.size();
            mediaWrapper = this.f54861z;
            if (i >= size) {
                break;
            }
            Media media2 = mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = this.f54853A.containsKey(media2.url);
            Map<String, Integer> map2 = this.f54853A;
            if (zContainsKey) {
                if (i != map2.get(media2.url).intValue()) {
                    this.f54853A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != this.f54853A.get(media2.originUrl).intValue()) {
                this.f54853A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        ewi ewiVar = mediaWrapper.selectedFolder;
        vg60<Media> vg60Var = ewiVar == null ? mediaWrapper.allMediasInPhoto : ewiVar.f96163c;
        for (int i2 = 0; i2 < vg60Var.f184001a.size(); i2++) {
            Media media3 = vg60Var.f184001a.get(i2);
            if (map.containsKey(media3.url)) {
                this.f54854B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                this.f54854B.notifyItemChanged(i2);
            }
        }
        if (this.f54853A.size() + 1 == this.f41338P) {
            this.f54854B.m144822I();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m63724Z5() {
        ewi ewiVar = (ewi) jyb.m147529r(this.f41337O.f184001a, new qcj() { // from class: l.ra40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161897a.m63709P5((ewi) obj);
            }
        });
        if (NullChecker.m82486a(this.f54861z.selectedFolder) && this.f54861z.selectedFolder.equals(ewiVar)) {
            return;
        }
        this.f54861z.setSelectedFolder(ewiVar);
        m63722Y5();
    }

    /* JADX INFO: renamed from: a6 */
    public void m63725a6(C22507a<ArrayList<Media>> c22507a) {
        if (this.f41339Q == null) {
            this.f41339Q = c22507a;
            duringCreated(c22507a).subscribe(psd0.m173596G(new y20() { // from class: l.ta40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172689a.m63710Q5((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b6, reason: merged with bridge method [inline-methods] */
    public final void m63708O5(Media media) {
        boolean z = media instanceof Video;
        if (NullChecker.m82486a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : ReminderAction.photo;
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: c6 */
    public void m63727c6(String str) {
        this.f41340R = str;
        m63724Z5();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m63728d6(boolean z) {
        bnl0.m105524M(this.f41335M, z);
        bnl0.m105524M(this.f41332J, !z);
    }

    /* JADX INFO: renamed from: e6 */
    public final void m63729e6() {
        if (isAdded()) {
            TextView textView = this.f41333K;
            ewi ewiVar = this.f54861z.selectedFolder;
            textView.setText(ewiVar == null ? act().getString(R$string.f39862Z2) : ewiVar.f96161a);
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, p153l.rn20
    /* JADX INFO: renamed from: f */
    public void mo63730f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (media instanceof Video) {
            if (m63699D5(media)) {
                return;
            }
            if (this.f54861z.selectedVideoMedias.size() >= this.f54859G.getMaxVideoSelectCount()) {
                o1j0.m165649w(R$string.f39964o0);
                return;
            }
        }
        super.mo63730f(newAlbumMediaItemView, media, i);
        m63719W5(true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.sa40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPostAlbumFrag.m63680l5((Bundle) obj);
            }
        }, new x20() { // from class: l.xa40
            @Override // p153l.x20
            public final void call() {
                ho20.m136385d(null);
            }
        });
        duringCreated(lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.ya40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPostAlbumFrag.m63685q5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m63731f6() {
        ewi ewiVar = (ewi) jyb.m147529r(this.f41337O.f184001a, new qcj() { // from class: l.na40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140976a.m63711R5((ewi) obj);
            }
        });
        if (NullChecker.m82486a(this.f54861z.selectedFolder) && this.f54861z.selectedFolder.equals(ewiVar)) {
            return;
        }
        this.f54861z.setSelectedFolder(ewiVar);
        m63729e6();
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (j4h.m143424h()) {
            this.f41334L.setImageResource(lbc0.f130896M3);
        }
        m63669F5();
        if (wzx.m208784k()) {
            new wzx().m208785d(act(), null, new x20() { // from class: l.ab40
                @Override // p153l.x20
                public final void call() {
                    this.f69199a.m63670J5();
                }
            }, new y20() { // from class: l.bb40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75773a.m63704K5((PermissionHelper.PermissionDeniedReason) obj);
                }
            }, null, null, null);
        } else if (m63668E5()) {
            m63712S5();
            bnl0.m105524M(this.f41331I, true);
        } else {
            bnl0.m105524M(this.f41331I, false);
            m63728d6(true);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63695A5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.m82486a(arguments)) {
            this.f41338P = arguments.getInt("extra_image_count");
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m63701G5((ArrayList) intent.getSerializableExtra("extra_images"));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (wzx.m208784k()) {
            return;
        }
        m63721X5();
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: q0 */
    public Video mo63732q0() {
        return (Video) this.f54861z.getSelectedVideo();
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo63733x() {
        return this.f54853A;
    }
}
