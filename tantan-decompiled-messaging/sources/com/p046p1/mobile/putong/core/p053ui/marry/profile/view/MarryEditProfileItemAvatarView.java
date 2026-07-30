package com.p046p1.mobile.putong.core.p053ui.marry.profile.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p147v.VFrame;
import p149l.a2m;
import p149l.a5c0;
import p149l.e30;
import p149l.fwl;
import p149l.g30;
import p149l.lqa;
import p149l.n6c0;
import p149l.pgm;
import p149l.rhi;
import p149l.t100;
import p149l.tzb0;
import p149l.ura;
import p149l.vwb;
import p149l.wvl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemAvatarView extends VFrame implements fwl, wvl {

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f30425a;

    /* JADX INFO: renamed from: b */
    public int f30426b;

    /* JADX INFO: renamed from: c */
    public MarrySeriesType f30427c;

    /* JADX INFO: renamed from: d */
    public e30<List<Media>> f30428d;

    /* JADX INFO: renamed from: e */
    public View f30429e;

    /* JADX INFO: renamed from: f */
    public int f30430f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemAvatarView$a */
    public class C8451a implements a2m {
        public C8451a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            if (lqa.m150974l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f30425a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f30425a.m50811h(i).m50670R1(i);
                }
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            if (lqa.m150974l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f30425a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f30425a.m50811h(i).m50670R1(i);
                }
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            MarryEditProfileItemAvatarView.this.m47536E(false);
        }
    }

    public MarryEditProfileItemAvatarView(Context context) {
        super(context);
        this.f30426b = -1;
        this.f30430f = 6;
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m47530r() {
        this.f30425a = (MediaReorderCards) findViewById(a5c0.f67655I);
        this.f30429e = findViewById(a5c0.f67675b);
        this.f30425a.setCardsCrop(true);
        this.f30425a.setSlideWithoutPress(false);
        if (ura.m195053e().m195057d().mo33779X5()) {
            this.f30430f = 9;
            this.f30425a.setViewCount(9);
        }
        int i = 0;
        while (true) {
            int i2 = this.f30430f;
            MediaReorderCards mediaReorderCards = this.f30425a;
            if (i >= i2) {
                mediaReorderCards.setReorderCardsCallback(new C8451a());
                this.f30425a.setOnDraggingListener(new e30() { // from class: l.xxw
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f194919a.m47533z((Boolean) obj);
                    }
                });
                return;
            }
            mediaReorderCards.m50811h(i).m50640C1(null);
            this.f30425a.m50811h(i).setCardType(MediaReorderCard.CardType.MARRY_AVATAR);
            this.f30425a.m50811h(i).setMediaOperation(this);
            this.f30425a.m50811h(i).setChangeAction(new g30() { // from class: l.wxw
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f188523a.m47538w((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (lqa.m150972j()) {
                this.f30425a.m50811h(i).m50644E1(i, "p_edit_profile_view");
            }
            this.f30425a.m50811h(i).m50651I0(i);
            if (lqa.m150979q()) {
                this.f30425a.m50811h(i).f33057n = i > 0;
                this.f30425a.m50811h(i).f33059p = i == 0;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m47533z(Boolean bool) {
        xdl0.m208345M0(this.f30429e, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: B */
    public void m47534B(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = rhi.m179355B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.m179382z(pictureNew_.url)).f148730d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f30426b;
        if (i < 0) {
            return;
        }
        this.f30425a.m50811h(i).m50708w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m47535C(int i, int i2, Intent intent) {
        if (i == 786 && i2 == -1 && intent != null) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            if (vwb.m200296J(arrayList)) {
                return;
            }
            Media media = (Media) arrayList.get(0);
            int i3 = this.f30426b;
            if (i3 < 0) {
                return;
            }
            if (media instanceof Video) {
                this.f30425a.m50811h(i3).m50714z1((Video) media);
            } else if (media instanceof Picture) {
                this.f30425a.m50811h(i3).m50708w1((Picture) media);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m47536E(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f30430f; i++) {
            Media media = this.f30425a.m50811h(i).f32976N;
            if (NullChecker.m81303a(media)) {
                arrayList.add(media);
            }
        }
        if (z || !NullChecker.m81303a(this.f30428d)) {
            return;
        }
        this.f30428d.call(arrayList);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d */
    public void mo47525d(User user) {
        List<Media> list = user.pictures;
        int i = 0;
        while (i < this.f30430f) {
            this.f30425a.m50811h(i).m50640C1(i >= list.size() ? null : list.get(i));
            this.f30425a.m50811h(i).m50654J1();
            i++;
        }
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo47526f() {
        return false;
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f30426b = i;
        act().startActivityForResult(ura.m195053e().m195057d().mo33858j6(act(), str), Act.CROP_IMAGE);
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f30430f; i++) {
            Media media = this.f30425a.m50811h(i).f32976N;
            if (NullChecker.m81303a(media)) {
                arrayList.add(media);
            }
        }
        return arrayList;
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30427c;
    }

    @Override // p149l.fwl
    public /* bridge */ /* synthetic */ List getSelfActions() {
        return super.getSelfActions();
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f30426b = i;
        if (z2) {
            act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(tzb0.f172721h, 0);
        } else if (z3) {
            act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.m195053e().m195057d().mo33721Mm(act())).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(tzb0.f172721h, 0);
        } else if (!lqa.m150976n()) {
            act().startActivityForResult(ura.m195053e().m195057d().mo33690Ge(act()), PutongAct.REQUEST_CODE_PICKER);
        } else {
            act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(tzb0.f172721h, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(n6c0.f137303J, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m47530r();
    }

    @Override // p149l.wvl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(e30<List<Media>> e30Var) {
        this.f30428d = e30Var;
    }

    /* JADX INFO: renamed from: v */
    public wvl m47537v(MarrySeriesType marrySeriesType) {
        this.f30427c = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m47538w(Media media, Boolean bool, Boolean bool2) {
        m47536E(bool2.booleanValue());
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30426b = -1;
        this.f30430f = 6;
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30426b = -1;
        this.f30430f = 6;
    }
}
