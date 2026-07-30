package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCard;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0116e;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import l.c1c0;
import l.c40;
import l.d30;
import l.vwb;
import v.VListCell;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0116e implements InterfaceC0112a {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m2346j(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        if ("重新裁剪头像".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.EDIT_PICTURE);
            return;
        }
        if ("更换头像".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("编辑标签".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.EDIT_PICTURE_TAG);
        } else if ("删除".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2347k(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        if ("重试".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.photo.InterfaceC0112a
    /* JADX INFO: renamed from: b */
    public void mo2329b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo2330c(avatarCard, i);
            return;
        }
        ArrayList arrayList = new ArrayList(vwb.f0(new String[]{"重试", "删除"}));
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.zb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).R(new int[]{arrayList.indexOf("删除")}, new int[]{c1c0.h}).Q(arrayList).V(new c40.d() { // from class: l.ac40
            /* JADX INFO: renamed from: a */
            public final void m9495a(VListCell vListCell, VListCell.a aVar, int i2) {
                C0116e.m2347k(avatarCard, vListCell, aVar, i2);
            }
        }).F();
        avatarCard.f869d = c40VarF;
        c40VarF.f();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.photo.InterfaceC0112a
    /* JADX INFO: renamed from: c */
    public boolean mo2330c(final AvatarCard avatarCard, int i) {
        if (super.mo2330c(avatarCard, i)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            if (avatarCard.getConfig().m21309r()) {
                arrayList.add("编辑标签");
            }
            if (avatarCard.getMedia() instanceof Picture) {
                arrayList.addAll(vwb.f0(new String[]{"重新裁剪头像", "删除"}));
            } else {
                arrayList.addAll(vwb.f0(new String[]{"删除"}));
            }
        } else if (avatarCard.getMedia() instanceof Picture) {
            arrayList.addAll(vwb.f0(new String[]{"重新裁剪头像", "更换头像"}));
        } else {
            arrayList.addAll(vwb.f0(new String[]{"更换头像"}));
        }
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.xb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).R(new int[]{arrayList.indexOf("删除")}, new int[]{c1c0.h}).Q(arrayList).V(new c40.d() { // from class: l.yb40
            /* JADX INFO: renamed from: a */
            public final void m26497a(VListCell vListCell, VListCell.a aVar, int i2) {
                C0116e.m2346j(avatarCard, vListCell, aVar, i2);
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
        CoreModule.P().a().Kc(avatarCard.getContext(), i, new d30() { // from class: l.bc40
            public final void call() {
                avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
            }
        });
        return true;
    }
}
