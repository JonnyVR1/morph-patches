package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileImageCard;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopUploadImageTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p149l.ftd0;
import p149l.g30;
import p149l.ijf;
import p149l.lqa;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopUploadImageTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public ExpProfileLoopUploadImageTypeData f33364F;

    /* JADX INFO: renamed from: G */
    public ExpEditProfileImageCardGroup f33365G;

    /* JADX INFO: renamed from: H */
    public boolean f33366H = false;

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m51377V4(VReorderCard vReorderCard) {
        if (NullChecker.m81303a(vReorderCard.f33046c.f87435f.f33077j)) {
            vReorderCard.f33046c.f87435f.f33077j.run();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m51381Z4(VReorderCard vReorderCard) {
        if (NullChecker.m81303a(vReorderCard.f33046c.f87435f.f33077j)) {
            vReorderCard.f33046c.f87435f.f33077j.run();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = new ExpEditProfileImageCardGroup(getContext());
        this.f33365G = expEditProfileImageCardGroup;
        expEditProfileImageCardGroup.setCardsCrop(true);
        this.f33365G.setCardPadding(t100.f167259h);
        m51390h5();
        this.f33365G.setUploadDataCallback(new ijf() { // from class: l.qif
            @Override // p149l.ijf
            /* JADX INFO: renamed from: a */
            public final void mo136608a(int i, String str, Media media) {
                this.f154763a.m51385c5(i, str, media);
            }
        });
        this.f33365G.setViewCount(9);
        this.f33365G.setSlideWithoutPress(false);
        this.f33365G.setCurPageId("p_edit_profile_view");
        int childCount = this.f33365G.getChildCount();
        int i = 0;
        while (true) {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup2 = this.f33365G;
            if (i >= childCount) {
                return expEditProfileImageCardGroup2;
            }
            ExpEditProfileImageCard expEditProfileImageCardM50811h = expEditProfileImageCardGroup2.m50811h(i);
            expEditProfileImageCardM50811h.setEnableLowPhoto(false);
            expEditProfileImageCardM50811h.f33057n = i > 0;
            expEditProfileImageCardM50811h.f33059p = i == 0;
            i++;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo51248Q4(List<Media> list, int i) {
        super.mo51248Q4(list, i);
        if (vwb.m200296J(list)) {
            return;
        }
        final ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33365G.m50811h(i);
        if (NullChecker.m81303a(expEditProfileImageCardM50811h)) {
            expEditProfileImageCardM50811h.mo50700r(list.get(0).mo223809clone(), new Runnable() { // from class: l.pif
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m51377V4(expEditProfileImageCardM50811h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public int m51383Z2() {
        boolean z = false;
        if (this.f33365G.m50811h(0).m50794n()) {
            CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f33365G.getChildCount() && !this.f33365G.m50811h(i2).m50794n(); i2++) {
            arrayList.add(this.f33365G.m50811h(i2).f33115I);
            if (!TEnum.equals(this.f33365G.m50811h(i2).f33115I.status, "normal")) {
                i++;
            }
        }
        this.f33364F.pictures = arrayList;
        if (i == 0 && arrayList.size() >= this.f33364F.needCount) {
            z = true;
        }
        m51249R4(z);
        return i;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m51384b5(Act act, String str, final Media media) {
        TagChooseMkAct.m43222v2(act, vwb.m200299M(media), null, new Runnable() { // from class: l.rif
            @Override // java.lang.Runnable
            public final void run() {
                this.f159550a.m51388f5(media);
            }
        }, null);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m51385c5(int i, String str, Media media) {
        if (i == 0) {
            m51389g5(0, media);
        } else {
            m51384b5(act(), str, media);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m51386d5(boolean z) {
        m51383Z2();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m51387e5(Media media, Boolean bool, Boolean bool2) {
        m51383Z2();
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m51388f5(Media media) {
        m51389g5(this.f33364F.pictures.size(), media);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        String str;
        super.mo20586g4(bundle);
        ExpProfileLoopUploadImageTypeData imageType = this.f33279A.getData().getImageType();
        this.f33364F = imageType;
        List<Media> list = imageType.pictures;
        this.f33365G.setElevation(10.0f);
        this.f33365G.setOutlineProvider(null);
        this.f33365G.setViewCatchListener(new VReorderCards.InterfaceC8627c() { // from class: l.mif
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards.InterfaceC8627c
            /* JADX INFO: renamed from: a */
            public final void mo50822a(boolean z) {
                this.f133968a.m51386d5(z);
            }
        });
        this.f33365G.m50819q(new Runnable() { // from class: l.nif
            @Override // java.lang.Runnable
            public final void run() {
                this.f139087a.m51383Z2();
            }
        });
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f33365G;
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f33284z;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
                expEditProfileImageCardGroup.m50811h(i).setStyle(2);
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
                expEditProfileImageCardGroup.m50811h(i).setStyle(3);
            } else {
                expEditProfileImageCardGroup.m50811h(i).setStyle(1);
            }
            expEditProfileImageCardGroup.m50811h(i).m50906d1(i < list.size() ? list.get(i) : null);
            expEditProfileImageCardGroup.m50811h(i).setChangeAction(new g30() { // from class: l.oif
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f144110a.m51387e5((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m50811h(i).m50919x0(i);
            i++;
        }
        int i2 = this.f33364F.needCount;
        if (i2 > 0) {
            str = this.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT ? String.format(Locale.CHINESE, "再上传%d张照片", Integer.valueOf(Math.max(0, i2 - list.size()))) : String.format(Locale.CHINESE, "请上传至少%d张照片", Integer.valueOf(i2));
        } else {
            str = "";
        }
        m51243M4().m51237h2(str);
        if (this.f33366H || !lqa.m150973k()) {
            return;
        }
        this.f33366H = true;
        ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33365G.m50811h(1);
        ExpEditProfileImageCard expEditProfileImageCardM50811h2 = this.f33365G.m50811h(2);
        expEditProfileImageCardM50811h.m50915p0();
        expEditProfileImageCardM50811h2.m50915p0();
    }

    /* JADX INFO: renamed from: g5 */
    public void m51389g5(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM50811h = this.f33365G.m50811h(i);
        if (NullChecker.m81303a(expEditProfileImageCardM50811h)) {
            expEditProfileImageCardM50811h.mo50700r(media.mo223809clone(), new Runnable() { // from class: l.sif
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m51381Z4(expEditProfileImageCardM50811h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m51390h5() {
        this.f33365G.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        ((SimpleDraweeView) this.f33365G.findViewById(u4c0.f173909L5)).getHierarchy().m112076w(ftd0.f99186j);
        ((SimpleDraweeView) this.f33365G.findViewById(u4c0.f173909L5)).getHierarchy().m112075v(pointF);
    }
}
