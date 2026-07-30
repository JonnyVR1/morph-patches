package com.p046p1.mobile.putong.core.p053ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.du2;
import p149l.lqa;
import p149l.pgm;
import p149l.rhi;
import p149l.t100;
import p149l.tzb0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: g */
    public static User f33405g;

    /* JADX INFO: renamed from: c */
    public C8671a f33406c;

    /* JADX INFO: renamed from: d */
    public C8672b f33407d;

    /* JADX INFO: renamed from: e */
    public int f33408e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f33409f = false;

    /* JADX INFO: renamed from: X1 */
    public static Intent m51506X1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        Intent intent = new Intent(context, (Class<?>) ProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", loopInputType);
        intent.putExtra("loop_eidt_user_info", user);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m51507Y1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, String str) {
        Intent intentM51506X1 = m51506X1(context, loopCreateEntryType, loopInputType, user);
        ura.m195053e().m195057d().mo33944xc(user);
        intentM51506X1.putExtra("loop_edit_from", str);
        try {
            StringBuffer stringBuffer = new StringBuffer(" args entryType:");
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            stringBuffer.append(user == null ? "null" : user.f56011id);
            stringBuffer.append(" from:");
            if (str == null) {
                str = "null";
            }
            stringBuffer.append(str);
            f33405g = user;
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
            return intentM51506X1;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return intentM51506X1;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public ProfileEditLoopBaseFrag m51508Z1() {
        if (this.f33406c.m51558t0() instanceof ProfileEditLoopBaseFrag) {
            return (ProfileEditLoopBaseFrag) this.f33406c.m51558t0();
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    public C8671a m51509a2() {
        return this.f33406c;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m51510b2() {
        return this.f33406c.m51531A0();
    }

    /* JADX INFO: renamed from: c2 */
    public void m51511c2(boolean z) {
        this.f33406c.m51543P0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f33408e = i;
        act().startActivityForResult(ura.m195053e().m195057d().mo33858j6(this.act, str), Act.CROP_IMAGE);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        f33405g = null;
        overridePendingTransition(tzb0.f172715b, tzb0.f172720g);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: i0 */
    public void mo45972i0(int i, boolean z) {
        mo43246n0(i, z, false, false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33407d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f33406c = new C8671a(this);
        C8672b c8672b = new C8672b(this);
        this.f33407d = c8672b;
        c8672b.f33440l = getIntent().getStringExtra("loop_edit_from");
        this.f33406c.mo51532C(this.f33407d);
        this.f33406c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f33406c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f33409f = z;
        this.f33408e = i;
        if (z2) {
            Act act = this.act;
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(tzb0.f172721h, 0);
        } else if (z3) {
            Act act2 = this.act;
            act2.startActivityForResult(MediaPickerAct.m78919X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.m195053e().m195057d().mo33721Mm(this.act)).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(tzb0.f172721h, 0);
        } else {
            if (!lqa.m150976n()) {
                startActivityForResult(ura.m195053e().m195057d().mo33690Ge(this.act), PutongAct.REQUEST_CODE_PICKER);
                return;
            }
            Act act3 = this.act;
            act3.startActivityForResult(MediaPickerAct.m78919X1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(tzb0.f172721h, 0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f33406c.m51554p0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = rhi.m179355B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.m179382z(pictureNew_.url)).f148730d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(vwb.m200324f0(pictureNew_));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m81304b(m51508Z1()) || list.size() <= 0) {
            return;
        }
        m51508Z1().mo51600Y4(list, this.f33408e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
