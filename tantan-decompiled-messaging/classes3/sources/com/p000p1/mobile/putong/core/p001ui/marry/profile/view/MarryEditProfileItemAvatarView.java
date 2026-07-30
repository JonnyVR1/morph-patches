package com.p000p1.mobile.putong.core.p001ui.marry.profile.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCards;
import com.p1.mobile.putong.core.ui.profile.VReorderCard;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a2m;
import l.a5c0;
import l.fwl;
import l.lqa;
import l.n6c0;
import l.pgm;
import l.rhi;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.xdl0;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p003l.e30;
import p003l.g30;
import p003l.wvl;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemAvatarView extends VFrame implements fwl, wvl {

    /* JADX INFO: renamed from: a */
    public MediaReorderCards f316a;

    /* JADX INFO: renamed from: b */
    public int f317b;

    /* JADX INFO: renamed from: c */
    public MarrySeriesType f318c;

    /* JADX INFO: renamed from: d */
    public e30<List<Media>> f319d;

    /* JADX INFO: renamed from: e */
    public View f320e;

    /* JADX INFO: renamed from: f */
    public int f321f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemAvatarView$a */
    public class C0034a implements a2m {
        public C0034a() {
        }

        /* JADX INFO: renamed from: b */
        public void m591b() {
            if (lqa.l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f316a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f316a.h(i).R1(i);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m592c() {
            if (lqa.l()) {
                for (int i = 0; i < MarryEditProfileItemAvatarView.this.f316a.getChildCount(); i++) {
                    MarryEditProfileItemAvatarView.this.f316a.h(i).R1(i);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m593d() {
            MarryEditProfileItemAvatarView.this.m586E(false);
        }
    }

    public MarryEditProfileItemAvatarView(Context context) {
        super(context);
        this.f317b = -1;
        this.f321f = 6;
    }

    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m580r() {
        this.f316a = findViewById(a5c0.I);
        this.f320e = findViewById(a5c0.b);
        this.f316a.setCardsCrop(true);
        this.f316a.setSlideWithoutPress(false);
        if (ura.e().d().X5()) {
            this.f321f = 9;
            this.f316a.setViewCount(9);
        }
        int i = 0;
        while (true) {
            int i2 = this.f321f;
            MediaReorderCards mediaReorderCards = this.f316a;
            if (i >= i2) {
                mediaReorderCards.setReorderCardsCallback(new C0034a());
                this.f316a.setOnDraggingListener(new e30() { // from class: l.xxw
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8874a.m583z((Boolean) obj);
                    }
                });
                return;
            }
            mediaReorderCards.h(i).C1((Media) null);
            this.f316a.h(i).setCardType(MediaReorderCard.CardType.MARRY_AVATAR);
            this.f316a.h(i).setMediaOperation(this);
            this.f316a.h(i).setChangeAction(new g30() { // from class: l.wxw
                @Override // p003l.g30
                /* JADX INFO: renamed from: a */
                public final void mo4389a(Object obj, Object obj2, Object obj3) {
                    this.f8640a.m590w((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (lqa.j()) {
                this.f316a.h(i).E1(i, "p_edit_profile_view");
            }
            this.f316a.h(i).I0(i);
            if (lqa.q()) {
                ((VReorderCard) this.f316a.h(i)).n = i > 0;
                ((VReorderCard) this.f316a.h(i)).p = i == 0;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m583z(Boolean bool) {
        xdl0.M0(this.f320e, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: B */
    public void m584B(String str) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).status = MediaLocalStatus.get("preprocessed");
        ((Media) pictureNew_).url = rhi.B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.z(((Media) pictureNew_).url)).d);
        ((Media) pictureNew_).mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f317b;
        if (i < 0) {
            return;
        }
        this.f316a.h(i).w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m585C(int i, int i2, Intent intent) {
        if (i == 786 && i2 == -1 && intent != null) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
            if (vwb.J(arrayList)) {
                return;
            }
            Video video = (Media) arrayList.get(0);
            int i3 = this.f317b;
            if (i3 < 0) {
                return;
            }
            if (video instanceof Video) {
                this.f316a.h(i3).z1(video);
            } else if (video instanceof Picture) {
                this.f316a.h(i3).w1((Picture) video);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m586E(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f321f; i++) {
            Media media = this.f316a.h(i).N;
            if (NullChecker.a(media)) {
                arrayList.add(media);
            }
        }
        if (z || !NullChecker.a(this.f319d)) {
            return;
        }
        this.f319d.call(arrayList);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d */
    public void mo575d(User user) {
        List list = user.pictures;
        int i = 0;
        while (i < this.f321f) {
            this.f316a.h(i).C1(i >= list.size() ? null : (Media) list.get(i));
            this.f316a.h(i).J1();
            i++;
        }
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: f */
    public boolean mo576f() {
        return false;
    }

    /* JADX INFO: renamed from: f2 */
    public void m587f2(int i, String str) {
        this.f317b = i;
        act().startActivityForResult(ura.e().d().j6(act(), str), 24576);
    }

    public List<Media> getAllMedia() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f321f; i++) {
            Media media = this.f316a.h(i).N;
            if (NullChecker.a(media)) {
                arrayList.add(media);
            }
        }
        return arrayList;
    }

    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f318c;
    }

    public /* bridge */ /* synthetic */ List getSelfActions() {
        return super.getSelfActions();
    }

    /* JADX INFO: renamed from: n0 */
    public void m588n0(int i, boolean z, boolean z2, boolean z3) {
        this.f317b = i;
        if (z2) {
            act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            act().overridePendingTransition(tzb0.h, 0);
        } else if (z3) {
            act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.e().d().Mm(act())).build()), 786);
            act().overridePendingTransition(tzb0.h, 0);
        } else if (!lqa.n()) {
            act().startActivityForResult(ura.e().d().Ge(act()), 786);
        } else {
            act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), 786);
            act().overridePendingTransition(tzb0.h, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(n6c0.J, (ViewGroup) null), new FrameLayout.LayoutParams(-1, -2));
        m580r();
    }

    @Override // p003l.wvl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public void setMediaChangeCallback(e30<List<Media>> e30Var) {
        this.f319d = e30Var;
    }

    /* JADX INFO: renamed from: v */
    public wvl m589v(MarrySeriesType marrySeriesType) {
        this.f318c = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m590w(Media media, Boolean bool, Boolean bool2) {
        m586E(bool2.booleanValue());
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f317b = -1;
        this.f321f = 6;
    }

    public MarryEditProfileItemAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f317b = -1;
        this.f321f = 6;
    }
}
