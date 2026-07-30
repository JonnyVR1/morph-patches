package com.p051p1.mobile.putong.core.p058ui.marry.profile.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p151v.VFrame;
import p153l.a30;
import p153l.bnl0;
import p153l.gdc0;
import p153l.gta;
import p153l.jyb;
import p153l.oki;
import p153l.oyl;
import p153l.qa00;
import p153l.sec0;
import p153l.sim;
import p153l.t4m;
import p153l.xra;
import p153l.xyl;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemAvatarView extends VFrame implements xyl, oyl {

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f31273a;

    /* JADX INFO: renamed from: b */
    public int f31274b;

    /* JADX INFO: renamed from: c */
    public MarrySeriesType f31275c;

    /* JADX INFO: renamed from: d */
    public y20<List<Media>> f31276d;

    /* JADX INFO: renamed from: e */
    public View f31277e;

    /* JADX INFO: renamed from: f */
    public int f31278f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemAvatarView$a */
    public class C8614a implements t4m {
        public C8614a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            if (xra.m212793l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f31273a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f31273a.m51994h(i).m51853R1(i);
                }
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            if (xra.m212793l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f31273a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f31273a.m51994h(i).m51853R1(i);
                }
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            MarryEditProfileItemAvatarView.this.m48719E(false);
        }
    }

    public MarryEditProfileItemAvatarView(Context context) {
        super(context);
        this.f31274b = -1;
        this.f31278f = 6;
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m48713r() {
        this.f31273a = (MediaReorderCards) findViewById(gdc0.f103650I);
        this.f31277e = findViewById(gdc0.f103670b);
        this.f31273a.setCardsCrop(true);
        this.f31273a.setSlideWithoutPress(false);
        if (gta.m132210e().m132214d().mo34782X5()) {
            this.f31278f = 9;
            this.f31273a.setViewCount(9);
        }
        int i = 0;
        while (true) {
            int i2 = this.f31278f;
            MediaReorderCards mediaReorderCards = this.f31273a;
            if (i >= i2) {
                mediaReorderCards.setReorderCardsCallback(new C8614a());
                this.f31273a.setOnDraggingListener(new y20() { // from class: l.w0x
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f186734a.m48716z((Boolean) obj);
                    }
                });
                return;
            }
            mediaReorderCards.m51994h(i).m51823C1(null);
            this.f31273a.m51994h(i).setCardType(MediaReorderCard.CardType.MARRY_AVATAR);
            this.f31273a.m51994h(i).setMediaOperation(this);
            this.f31273a.m51994h(i).setChangeAction(new a30() { // from class: l.v0x
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f181908a.m48721w((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (xra.m212791j()) {
                this.f31273a.m51994h(i).m51827E1(i, "p_edit_profile_view");
            }
            this.f31273a.m51994h(i).m51834I0(i);
            if (xra.m212798q()) {
                this.f31273a.m51994h(i).f33905n = i > 0;
                this.f31273a.m51994h(i).f33907p = i == 0;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m48716z(Boolean bool) {
        bnl0.m105525M0(this.f31277e, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: B */
    public void m48717B(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = oki.m168011B(str);
        pictureNew_.size = new Dimension(new sim(oki.m168038z(pictureNew_.url)).f168843d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f31274b;
        if (i < 0) {
            return;
        }
        this.f31273a.m51994h(i).m51891w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m48718C(int i, int i2, Intent intent) {
        if (i == 786 && i2 == -1 && intent != null) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            if (jyb.m147479J(arrayList)) {
                return;
            }
            Media media = (Media) arrayList.get(0);
            int i3 = this.f31274b;
            if (i3 < 0) {
                return;
            }
            if (media instanceof Video) {
                this.f31273a.m51994h(i3).m51897z1((Video) media);
            } else if (media instanceof Picture) {
                this.f31273a.m51994h(i3).m51891w1((Picture) media);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m48719E(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31278f; i++) {
            Media media = this.f31273a.m51994h(i).f33824N;
            if (NullChecker.m82486a(media)) {
                arrayList.add(media);
            }
        }
        if (z || !NullChecker.m82486a(this.f31276d)) {
            return;
        }
        this.f31276d.call(arrayList);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d */
    public void mo48708d(User user) {
        List<Media> list = user.pictures;
        int i = 0;
        while (i < this.f31278f) {
            this.f31273a.m51994h(i).m51823C1(i >= list.size() ? null : list.get(i));
            this.f31273a.m51994h(i).m51837J1();
            i++;
        }
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: f */
    public boolean mo48709f() {
        return false;
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f31274b = i;
        act().startActivityForResult(gta.m132210e().m132214d().mo34861j6(act(), str), Act.CROP_IMAGE);
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31278f; i++) {
            Media media = this.f31273a.m51994h(i).f33824N;
            if (NullChecker.m82486a(media)) {
                arrayList.add(media);
            }
        }
        return arrayList;
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31275c;
    }

    @Override // p153l.xyl
    public /* bridge */ /* synthetic */ List getSelfActions() {
        return super.getSelfActions();
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f31274b = i;
        if (z2) {
            act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(z7c0.f203239h, 0);
        } else if (z3) {
            act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(gta.m132210e().m132214d().mo34724Mm(act())).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(z7c0.f203239h, 0);
        } else if (!xra.m212795n()) {
            act().startActivityForResult(gta.m132210e().m132214d().mo34693Ge(act()), PutongAct.REQUEST_CODE_PICKER);
        } else {
            act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act().overridePendingTransition(z7c0.f203239h, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(sec0.f167517J, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m48713r();
    }

    @Override // p153l.oyl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(y20<List<Media>> y20Var) {
        this.f31276d = y20Var;
    }

    /* JADX INFO: renamed from: v */
    public oyl m48720v(MarrySeriesType marrySeriesType) {
        this.f31275c = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m48721w(Media media, Boolean bool, Boolean bool2) {
        m48719E(bool2.booleanValue());
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31274b = -1;
        this.f31278f = 6;
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31274b = -1;
        this.f31278f = 6;
    }
}
