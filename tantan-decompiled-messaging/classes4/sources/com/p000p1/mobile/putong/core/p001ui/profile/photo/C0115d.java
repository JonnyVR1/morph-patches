package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCard;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0115d;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import l.c40;
import l.d30;
import l.lqa;
import l.vwb;
import v.VListCell;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0115d implements InterfaceC0112a {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2340i(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        if ("重新裁剪头像".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.EDIT_PICTURE);
            return;
        }
        if ("从相册选择".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("选择一段视频".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_VIDEO);
        } else if ("删除".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2343l(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        if ("从相册选择".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("选择一段视频".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_VIDEO);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.photo.InterfaceC0112a
    /* JADX INFO: renamed from: c */
    public boolean mo2330c(final AvatarCard avatarCard, int i) {
        if (super.mo2330c(avatarCard, i)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (i == 0 && avatarCard.m1236i() == 1) {
            if (avatarCard.getMedia() instanceof Picture) {
                arrayList.addAll(vwb.f0(new String[]{"重新裁剪头像", "从相册选择", "选择一段视频"}));
            } else {
                arrayList.addAll(vwb.f0(new String[]{"从相册选择", "选择一段视频"}));
            }
        } else if (avatarCard.getMedia() instanceof Picture) {
            arrayList.addAll(vwb.f0(new String[]{"重新裁剪头像", "删除"}));
        } else {
            arrayList.addAll(vwb.f0(new String[]{"删除"}));
        }
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.qvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.rvw
            /* JADX INFO: renamed from: a */
            public final void m22133a(VListCell vListCell, VListCell.a aVar, int i2) {
                C0115d.m2340i(avatarCard, vListCell, aVar, i2);
            }
        }).F();
        avatarCard.f869d = c40VarF;
        c40VarF.f();
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.photo.InterfaceC0112a
    /* JADX INFO: renamed from: d */
    public boolean mo2331d(final AvatarCard avatarCard, int i) {
        if (super.mo2331d(avatarCard, i)) {
            return true;
        }
        if (lqa.k()) {
            CoreModule.P().a().Kc(avatarCard.getContext(), i, new d30() { // from class: l.nvw
                public final void call() {
                    avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
                }
            });
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (lqa.w()) {
            arrayList.addAll(vwb.f0(new String[]{"从相册选择"}));
        } else {
            arrayList.addAll(vwb.f0(new String[]{"从相册选择", "选择一段视频"}));
        }
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.ovw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.pvw
            /* JADX INFO: renamed from: a */
            public final void m20731a(VListCell vListCell, VListCell.a aVar, int i2) {
                C0115d.m2343l(avatarCard, vListCell, aVar, i2);
            }
        }).F();
        avatarCard.f869d = c40VarF;
        c40VarF.f();
        return true;
    }
}
