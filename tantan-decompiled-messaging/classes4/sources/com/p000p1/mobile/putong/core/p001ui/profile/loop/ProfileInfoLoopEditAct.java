package com.p000p1.mobile.putong.core.p001ui.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import l.du2;
import l.lqa;
import l.pgm;
import l.rhi;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: g */
    public static User f1227g;

    /* JADX INFO: renamed from: c */
    public C0096a f1228c;

    /* JADX INFO: renamed from: d */
    public C0097b f1229d;

    /* JADX INFO: renamed from: e */
    public int f1230e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f1231f = false;

    /* JADX INFO: renamed from: X1 */
    public static Intent m1988X1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user) {
        Intent intent = new Intent(context, (Class<?>) ProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", loopInputType);
        intent.putExtra("loop_eidt_user_info", (Serializable) user);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m1989Y1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, LoopInputType loopInputType, User user, String str) {
        Intent intentM1988X1 = m1988X1(context, loopCreateEntryType, loopInputType, user);
        ura.e().d().xc(user);
        intentM1988X1.putExtra("loop_edit_from", str);
        try {
            StringBuffer stringBuffer = new StringBuffer(" args entryType:");
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            stringBuffer.append(user == null ? "null" : ((DbObject) user).id);
            stringBuffer.append(" from:");
            if (str == null) {
                str = "null";
            }
            stringBuffer.append(str);
            f1227g = user;
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
            return intentM1988X1;
        } catch (Exception e) {
            CrashHelper.c(e);
            return intentM1988X1;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public ProfileEditLoopBaseFrag m1990Z1() {
        if (this.f1228c.m2042t0() instanceof ProfileEditLoopBaseFrag) {
            return this.f1228c.m2042t0();
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    public C0096a m1991a2() {
        return this.f1228c;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m1992b2() {
        return this.f1228c.m2013A0();
    }

    /* JADX INFO: renamed from: c2 */
    public void m1993c2(boolean z) {
        this.f1228c.m2025P0(z);
    }

    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: f2 */
    public void mo1206f2(int i, String str) {
        this.f1230e = i;
        act().startActivityForResult(ura.e().d().j6(((Act) this).act, str), 24576);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        f1227g = null;
        overridePendingTransition(tzb0.b, tzb0.g);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: i0 */
    public void mo1208i0(int i, boolean z) {
        mo1210n0(i, z, false, false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1229d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f1228c = new C0096a(this);
        C0097b c0097b = new C0097b(this);
        this.f1229d = c0097b;
        c0097b.f1262l = getIntent().getStringExtra("loop_edit_from");
        this.f1228c.m2014C(this.f1229d);
        this.f1228c.m2032Z();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f1228c.m2033a0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: n0 */
    public void mo1210n0(int i, boolean z, boolean z2, boolean z3) {
        this.f1231f = z;
        this.f1230e = i;
        if (z2) {
            Act act = ((Act) this).act;
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            ((Act) this).act.overridePendingTransition(tzb0.h, 0);
        } else if (z3) {
            Act act2 = ((Act) this).act;
            act2.startActivityForResult(MediaPickerAct.X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.e().d().Mm(((Act) this).act)).build()), 786);
            ((Act) this).act.overridePendingTransition(tzb0.h, 0);
        } else {
            if (!lqa.n()) {
                startActivityForResult(ura.e().d().Ge(((Act) this).act), 786);
                return;
            }
            Act act3 = ((Act) this).act;
            act3.startActivityForResult(MediaPickerAct.X1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), 786);
            ((Act) this).act.overridePendingTransition(tzb0.h, 0);
        }
    }

    public void onBackPressed() {
        if (this.f1228c.m2038p0()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onCropImageResult(String str) {
        Media mediaNew_ = Picture.new_();
        mediaNew_.status = MediaLocalStatus.get("preprocessed");
        mediaNew_.url = rhi.B(str);
        ((Picture) mediaNew_).size = new Dimension(new pgm(rhi.z(mediaNew_.url)).d);
        mediaNew_.mediaType = "image/jpeg";
        onPickImagesResult(vwb.f0(new Media[]{mediaNew_}));
    }

    public void onPickImagesResult(List<Media> list) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        if (!NullChecker.b(m1990Z1()) || list.size() <= 0) {
            return;
        }
        m1990Z1().mo2086Y4(list, this.f1230e);
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
