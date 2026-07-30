package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileImageCard;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopUploadImageTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.ftd0;
import l.g30;
import l.lqa;
import l.t100;
import l.u4c0;
import l.vwb;
import p002l.ijf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopUploadImageTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public ExpProfileLoopUploadImageTypeData f1186F;

    /* JADX INFO: renamed from: G */
    public ExpEditProfileImageCardGroup f1187G;

    /* JADX INFO: renamed from: H */
    public boolean f1188H = false;

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m1857V4(VReorderCard vReorderCard) {
        if (NullChecker.a(vReorderCard.f868c.f9399f.f899j)) {
            vReorderCard.f868c.f9399f.f899j.run();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m1861Z4(VReorderCard vReorderCard) {
        if (NullChecker.a(vReorderCard.f868c.f9399f.f899j)) {
            vReorderCard.f868c.f9399f.f899j.run();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = new ExpEditProfileImageCardGroup(getContext());
        this.f1187G = expEditProfileImageCardGroup;
        expEditProfileImageCardGroup.setCardsCrop(true);
        this.f1187G.setCardPadding(t100.h);
        m1871h5();
        this.f1187G.setUploadDataCallback(new ijf() { // from class: l.qif
            @Override // p002l.ijf
            /* JADX INFO: renamed from: a */
            public final void mo15212a(int i, String str, Media media) {
                this.f18000a.m1865c5(i, str, media);
            }
        });
        this.f1187G.setViewCount(9);
        this.f1187G.setSlideWithoutPress(false);
        this.f1187G.setCurPageId("p_edit_profile_view");
        int childCount = this.f1187G.getChildCount();
        int i = 0;
        while (true) {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup2 = this.f1187G;
            if (i >= childCount) {
                return expEditProfileImageCardGroup2;
            }
            ExpEditProfileImageCard expEditProfileImageCardM1257h = expEditProfileImageCardGroup2.m1257h(i);
            expEditProfileImageCardM1257h.setEnableLowPhoto(false);
            expEditProfileImageCardM1257h.f879n = i > 0;
            expEditProfileImageCardM1257h.f881p = i == 0;
            i++;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo1703Q4(List<Media> list, int i) {
        super.mo1703Q4(list, i);
        if (vwb.J(list)) {
            return;
        }
        final ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1187G.m1257h(i);
        if (NullChecker.a(expEditProfileImageCardM1257h)) {
            expEditProfileImageCardM1257h.mo1136r(list.get(0).clone(), new Runnable() { // from class: l.pif
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m1857V4(expEditProfileImageCardM1257h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public int m1863Z2() {
        boolean z = false;
        if (this.f1187G.m1257h(0).m1240n()) {
            CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f1187G.getChildCount() && !this.f1187G.m1257h(i2).m1240n(); i2++) {
            arrayList.add(this.f1187G.m1257h(i2).f937I);
            if (!TEnum.equals(this.f1187G.m1257h(i2).f937I.status, "normal")) {
                i++;
            }
        }
        this.f1186F.pictures = arrayList;
        if (i == 0 && arrayList.size() >= this.f1186F.needCount) {
            z = true;
        }
        m1704R4(z);
        return i;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m1864b5(Act act, String str, final Media media) {
        TagChooseMkAct.v2(act, vwb.M(media), (String) null, new Runnable() { // from class: l.rif
            @Override // java.lang.Runnable
            public final void run() {
                this.f18529a.m1868f5(media);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m1865c5(int i, String str, Media media) {
        if (i == 0) {
            m1870g5(0, media);
        } else {
            m1864b5(act(), str, media);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m1866d5(boolean z) {
        m1863Z2();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m1867e5(Media media, Boolean bool, Boolean bool2) {
        m1863Z2();
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m1868f5(Media media) {
        m1870g5(this.f1186F.pictures.size(), media);
    }

    /* JADX INFO: renamed from: g4 */
    public void m1869g4(Bundle bundle) {
        String str;
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        ExpProfileLoopUploadImageTypeData imageType = this.f1101A.getData().getImageType();
        this.f1186F = imageType;
        List<Media> list = imageType.pictures;
        this.f1187G.setElevation(10.0f);
        this.f1187G.setOutlineProvider(null);
        this.f1187G.setViewCatchListener(new VReorderCards.InterfaceC0052c() { // from class: l.mif
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards.InterfaceC0052c
            /* JADX INFO: renamed from: a */
            public final void mo1268a(boolean z) {
                this.f15399a.m1866d5(z);
            }
        });
        this.f1187G.m1265q(new Runnable() { // from class: l.nif
            @Override // java.lang.Runnable
            public final void run() {
                this.f16049a.m1863Z2();
            }
        });
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f1187G;
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f1106z;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
                expEditProfileImageCardGroup.m1257h(i).setStyle(2);
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
                expEditProfileImageCardGroup.m1257h(i).setStyle(3);
            } else {
                expEditProfileImageCardGroup.m1257h(i).setStyle(1);
            }
            expEditProfileImageCardGroup.m1257h(i).m1352d1(i < list.size() ? list.get(i) : null);
            expEditProfileImageCardGroup.m1257h(i).setChangeAction(new g30() { // from class: l.oif
                /* JADX INFO: renamed from: a */
                public final void m19545a(Object obj, Object obj2, Object obj3) {
                    this.f16626a.m1867e5((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m1257h(i).m1365x0(i);
            i++;
        }
        int i2 = this.f1186F.needCount;
        if (i2 > 0) {
            str = this.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT ? String.format(Locale.CHINESE, "再上传%d张照片", Integer.valueOf(Math.max(0, i2 - list.size()))) : String.format(Locale.CHINESE, "请上传至少%d张照片", Integer.valueOf(i2));
        } else {
            str = "";
        }
        m1698M4().m1692h2(str);
        if (this.f1188H || !lqa.k()) {
            return;
        }
        this.f1188H = true;
        ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1187G.m1257h(1);
        ExpEditProfileImageCard expEditProfileImageCardM1257h2 = this.f1187G.m1257h(2);
        expEditProfileImageCardM1257h.m1361p0();
        expEditProfileImageCardM1257h2.m1361p0();
    }

    /* JADX INFO: renamed from: g5 */
    public void m1870g5(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM1257h = this.f1187G.m1257h(i);
        if (NullChecker.a(expEditProfileImageCardM1257h)) {
            expEditProfileImageCardM1257h.mo1136r(media.clone(), new Runnable() { // from class: l.sif
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m1861Z4(expEditProfileImageCardM1257h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m1871h5() {
        this.f1187G.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        this.f1187G.findViewById(u4c0.L5).getHierarchy().w(ftd0.j);
        this.f1187G.findViewById(u4c0.L5).getHierarchy().v(pointF);
    }
}
