package com.p051p1.mobile.putong.core.p058ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.bnl0;
import p153l.gta;
import p153l.jyb;
import p153l.oki;
import p153l.qa00;
import p153l.sim;
import p153l.tu2;
import p153l.xra;
import p153l.z7c0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: g */
    public static User f34253g;

    /* JADX INFO: renamed from: c */
    public C8834a f34254c;

    /* JADX INFO: renamed from: d */
    public C8835b f34255d;

    /* JADX INFO: renamed from: e */
    public int f34256e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f34257f = false;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m52689Y1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        Intent intent = new Intent(context, (Class<?>) ProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", loopInputType);
        intent.putExtra("loop_eidt_user_info", user);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m52690Z1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, String str) {
        Intent intentM52689Y1 = m52689Y1(context, loopCreateEntryType, loopInputType, user);
        gta.m132210e().m132214d().mo34947xc(user);
        intentM52689Y1.putExtra("loop_edit_from", str);
        try {
            StringBuffer stringBuffer = new StringBuffer(" args entryType:");
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            stringBuffer.append(user == null ? "null" : user.f56859id);
            stringBuffer.append(" from:");
            if (str == null) {
                str = "null";
            }
            stringBuffer.append(str);
            f34253g = user;
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
            return intentM52689Y1;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return intentM52689Y1;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public ProfileEditLoopBaseFrag m52691a2() {
        if (this.f34254c.m52741t0() instanceof ProfileEditLoopBaseFrag) {
            return (ProfileEditLoopBaseFrag) this.f34254c.m52741t0();
        }
        return null;
    }

    /* JADX INFO: renamed from: b2 */
    public C8834a m52692b2() {
        return this.f34254c;
    }

    /* JADX INFO: renamed from: c2 */
    public boolean m52693c2() {
        return this.f34254c.m52714A0();
    }

    /* JADX INFO: renamed from: d2 */
    public void m52694d2(boolean z) {
        this.f34254c.m52726P0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f34256e = i;
        act().startActivityForResult(gta.m132210e().m132214d().mo34861j6(this.act, str), Act.CROP_IMAGE);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        f34253g = null;
        overridePendingTransition(z7c0.f203233b, z7c0.f203238g);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: i0 */
    public void mo47155i0(int i, boolean z) {
        mo44257n0(i, z, false, false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34255d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f34254c = new C8834a(this);
        C8835b c8835b = new C8835b(this);
        this.f34255d = c8835b;
        c8835b.f34288l = getIntent().getStringExtra("loop_edit_from");
        this.f34254c.mo52715C(this.f34255d);
        this.f34254c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f34254c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f34257f = z;
        this.f34256e = i;
        if (z2) {
            Act act = this.act;
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(z7c0.f203239h, 0);
        } else if (z3) {
            Act act2 = this.act;
            act2.startActivityForResult(MediaPickerAct.m80102Y1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(gta.m132210e().m132214d().mo34724Mm(this.act)).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(z7c0.f203239h, 0);
        } else {
            if (!xra.m212795n()) {
                startActivityForResult(gta.m132210e().m132214d().mo34693Ge(this.act), PutongAct.REQUEST_CODE_PICKER);
                return;
            }
            Act act3 = this.act;
            act3.startActivityForResult(MediaPickerAct.m80102Y1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(z7c0.f203239h, 0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f34254c.m52737p0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = oki.m168011B(str);
        pictureNew_.size = new Dimension(new sim(oki.m168038z(pictureNew_.url)).f168843d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(jyb.m147507f0(pictureNew_));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m82487b(m52691a2()) || list.size() <= 0) {
            return;
        }
        m52691a2().mo52783Y4(list, this.f34256e);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
