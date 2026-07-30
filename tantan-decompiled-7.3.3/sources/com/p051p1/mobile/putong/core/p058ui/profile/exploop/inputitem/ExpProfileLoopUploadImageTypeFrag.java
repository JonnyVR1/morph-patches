package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileImageCard;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileImageCardGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopUploadImageTypeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p153l.a30;
import p153l.adc0;
import p153l.h1e0;
import p153l.jyb;
import p153l.okf;
import p153l.qa00;
import p153l.xra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopUploadImageTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public ExpProfileLoopUploadImageTypeData f34212F;

    /* JADX INFO: renamed from: G */
    public ExpEditProfileImageCardGroup f34213G;

    /* JADX INFO: renamed from: H */
    public boolean f34214H = false;

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m52560V4(VReorderCard vReorderCard) {
        if (NullChecker.m82486a(vReorderCard.f33894c.f123275f.f33925j)) {
            vReorderCard.f33894c.f123275f.f33925j.run();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m52564Z4(VReorderCard vReorderCard) {
        if (NullChecker.m82486a(vReorderCard.f33894c.f123275f.f33925j)) {
            vReorderCard.f33894c.f123275f.f33925j.run();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = new ExpEditProfileImageCardGroup(getContext());
        this.f34213G = expEditProfileImageCardGroup;
        expEditProfileImageCardGroup.setCardsCrop(true);
        this.f34213G.setCardPadding(qa00.f156321h);
        m52573h5();
        this.f34213G.setUploadDataCallback(new okf() { // from class: l.wjf
            @Override // p153l.okf
            /* JADX INFO: renamed from: a */
            public final void mo109169a(int i, String str, Media media) {
                this.f189444a.m52568c5(i, str, media);
            }
        });
        this.f34213G.setViewCount(9);
        this.f34213G.setSlideWithoutPress(false);
        this.f34213G.setCurPageId("p_edit_profile_view");
        int childCount = this.f34213G.getChildCount();
        int i = 0;
        while (true) {
            ExpEditProfileImageCardGroup expEditProfileImageCardGroup2 = this.f34213G;
            if (i >= childCount) {
                return expEditProfileImageCardGroup2;
            }
            ExpEditProfileImageCard expEditProfileImageCardM51994h = expEditProfileImageCardGroup2.m51994h(i);
            expEditProfileImageCardM51994h.setEnableLowPhoto(false);
            expEditProfileImageCardM51994h.f33905n = i > 0;
            expEditProfileImageCardM51994h.f33907p = i == 0;
            i++;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo52431Q4(List<Media> list, int i) {
        super.mo52431Q4(list, i);
        if (jyb.m147479J(list)) {
            return;
        }
        final ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34213G.m51994h(i);
        if (NullChecker.m82486a(expEditProfileImageCardM51994h)) {
            expEditProfileImageCardM51994h.mo51883r(list.get(0).mo225055clone(), new Runnable() { // from class: l.vjf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m52560V4(expEditProfileImageCardM51994h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public int m52566Z2() {
        boolean z = false;
        if (this.f34213G.m51994h(0).m51977n()) {
            CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f34213G.getChildCount() && !this.f34213G.m51994h(i2).m51977n(); i2++) {
            arrayList.add(this.f34213G.m51994h(i2).f33963I);
            if (!TEnum.equals(this.f34213G.m51994h(i2).f33963I.status, "normal")) {
                i++;
            }
        }
        this.f34212F.pictures = arrayList;
        if (i == 0 && arrayList.size() >= this.f34212F.needCount) {
            z = true;
        }
        m52432R4(z);
        return i;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m52567b5(Act act, String str, final Media media) {
        TagChooseMkAct.m44233w2(act, jyb.m147482M(media), null, new Runnable() { // from class: l.xjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f194570a.m52571f5(media);
            }
        }, null);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m52568c5(int i, String str, Media media) {
        if (i == 0) {
            m52572g5(0, media);
        } else {
            m52567b5(act(), str, media);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m52569d5(boolean z) {
        m52566Z2();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m52570e5(Media media, Boolean bool, Boolean bool2) {
        m52566Z2();
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m52571f5(Media media) {
        m52572g5(this.f34212F.pictures.size(), media);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        String str;
        super.mo21585g4(bundle);
        ExpProfileLoopUploadImageTypeData imageType = this.f34127A.getData().getImageType();
        this.f34212F = imageType;
        List<Media> list = imageType.pictures;
        this.f34213G.setElevation(10.0f);
        this.f34213G.setOutlineProvider(null);
        this.f34213G.setViewCatchListener(new VReorderCards.InterfaceC8790c() { // from class: l.sjf
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards.InterfaceC8790c
            /* JADX INFO: renamed from: a */
            public final void mo52005a(boolean z) {
                this.f168962a.m52569d5(z);
            }
        });
        this.f34213G.m52002q(new Runnable() { // from class: l.tjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f174582a.m52566Z2();
            }
        });
        ExpEditProfileImageCardGroup expEditProfileImageCardGroup = this.f34213G;
        int i = 0;
        while (i < expEditProfileImageCardGroup.getChildCount()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f34132z;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
                expEditProfileImageCardGroup.m51994h(i).setStyle(2);
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
                expEditProfileImageCardGroup.m51994h(i).setStyle(3);
            } else {
                expEditProfileImageCardGroup.m51994h(i).setStyle(1);
            }
            expEditProfileImageCardGroup.m51994h(i).m52089d1(i < list.size() ? list.get(i) : null);
            expEditProfileImageCardGroup.m51994h(i).setChangeAction(new a30() { // from class: l.ujf
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f179212a.m52570e5((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            expEditProfileImageCardGroup.m51994h(i).m52102x0(i);
            i++;
        }
        int i2 = this.f34212F.needCount;
        if (i2 > 0) {
            str = this.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT ? String.format(Locale.CHINESE, "再上传%d张照片", Integer.valueOf(Math.max(0, i2 - list.size()))) : String.format(Locale.CHINESE, "请上传至少%d张照片", Integer.valueOf(i2));
        } else {
            str = "";
        }
        m52426M4().m52420i2(str);
        if (this.f34214H || !xra.m212792k()) {
            return;
        }
        this.f34214H = true;
        ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34213G.m51994h(1);
        ExpEditProfileImageCard expEditProfileImageCardM51994h2 = this.f34213G.m51994h(2);
        expEditProfileImageCardM51994h.m52098p0();
        expEditProfileImageCardM51994h2.m52098p0();
    }

    /* JADX INFO: renamed from: g5 */
    public void m52572g5(int i, Media media) {
        final ExpEditProfileImageCard expEditProfileImageCardM51994h = this.f34213G.m51994h(i);
        if (NullChecker.m82486a(expEditProfileImageCardM51994h)) {
            expEditProfileImageCardM51994h.mo51883r(media.mo225055clone(), new Runnable() { // from class: l.yjf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpProfileLoopUploadImageTypeFrag.m52564Z4(expEditProfileImageCardM51994h);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m52573h5() {
        this.f34213G.setZ(1.0f);
        PointF pointF = new PointF();
        pointF.x = 0.5f;
        pointF.y = 0.5f;
        ((SimpleDraweeView) this.f34213G.findViewById(adc0.f70031N5)).getHierarchy().m207062w(h1e0.f107453j);
        ((SimpleDraweeView) this.f34213G.findViewById(adc0.f70031N5)).getHierarchy().m207061v(pointF);
    }
}
