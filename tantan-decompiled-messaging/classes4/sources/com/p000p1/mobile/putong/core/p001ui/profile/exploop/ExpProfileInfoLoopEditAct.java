package com.p000p1.mobile.putong.core.p001ui.profile.exploop;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import java.util.Iterator;
import java.util.List;
import l.pgm;
import l.rhi;
import l.rzb0;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.bif;
import p002l.whf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public whf f1090c;

    /* JADX INFO: renamed from: d */
    public bif f1091d;

    /* JADX INFO: renamed from: e */
    public int f1092e = -1;

    /* JADX INFO: renamed from: X1 */
    public static Intent m1683X1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, boolean z, String str) {
        Intent intent = new Intent(context, (Class<?>) ExpProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", expLoopInputType);
        intent.putExtra("loop_edit_from", str);
        intent.putExtra("loop_edit_save_user", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public ExpProfileEditLoopBaseFrag m1684Y1() {
        if (this.f1090c.m24659u0() != null) {
            return this.f1090c.m24659u0();
        }
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m1685Z1() {
        return this.f1090c.m24661y0();
    }

    /* JADX INFO: renamed from: a2 */
    public whf m1686a2() {
        return this.f1090c;
    }

    /* JADX INFO: renamed from: b2 */
    public void m1687b2() {
        this.f1091d.m10362n();
    }

    /* JADX INFO: renamed from: c2 */
    public void m1688c2(ExpLoopInputType expLoopInputType, boolean z) {
        bif bifVar = this.f1091d;
        if (bifVar != null && bifVar.m10360i()) {
            this.f1091d.m10364q(z);
        }
        whf whfVar = this.f1090c;
        if (whfVar != null) {
            whfVar.m24648d1(expLoopInputType);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m1689d2(String str) {
        bif bifVar = this.f1091d;
        if (bifVar == null || !bifVar.m10360i()) {
            return;
        }
        this.f1091d.m10366s(str);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m1690e2(String str) {
        bif bifVar = this.f1091d;
        if (bifVar == null || !bifVar.m10360i()) {
            return;
        }
        this.f1091d.m10369w(str);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: f2 */
    public void mo1206f2(int i, String str) {
        this.f1092e = i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Act act = ((Act) this).act;
        act.startActivityForResult(NewAlbumCropperAct.m2(act, str, 0.8f, xdl0.y0() - t100.d(60.0f), true), 24576);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(rzb0.o, rzb0.x);
    }

    /* JADX INFO: renamed from: g2 */
    public void m1691g2(String str) {
        bif bifVar = this.f1091d;
        if (bifVar == null || !bifVar.m10360i()) {
            return;
        }
        this.f1091d.m10371y(str);
    }

    /* JADX INFO: renamed from: h2 */
    public void m1692h2(String str) {
        bif bifVar = this.f1091d;
        if (bifVar == null || !bifVar.m10360i()) {
            return;
        }
        this.f1091d.m10370x(str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1091d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f1090c = new whf(this);
        bif bifVar = new bif(this);
        this.f1091d = bifVar;
        this.f1090c.C(bifVar);
        this.f1090c.m24644Z();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f1090c.a0();
    }

    public void onBackPressed() {
        if (this.f1090c.m24653o0()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onCropImageResult(String str) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).status = MediaLocalStatus.get("preprocessed");
        ((Media) pictureNew_).url = rhi.B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.z(((Media) pictureNew_).url)).d);
        ((Media) pictureNew_).mediaType = "image/jpeg";
        onPickImagesResult(vwb.M(pictureNew_), this.f1092e);
    }

    public void onPickImagesResult(List<Media> list, int i) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        if (m1684Y1() != null) {
            m1684Y1().mo1703Q4(list, i);
        }
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
