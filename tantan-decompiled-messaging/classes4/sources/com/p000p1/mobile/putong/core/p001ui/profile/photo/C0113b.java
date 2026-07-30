package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCard;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0113b;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import l.c40;
import l.d30;
import l.vwb;
import v.VListCell;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0113b implements InterfaceC0112a {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m2333j(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
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
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.k7c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.l7c
            /* JADX INFO: renamed from: a */
            public final void m17034a(VListCell vListCell, VListCell.a aVar, int i2) {
                C0113b.m2333j(avatarCard, vListCell, aVar, i2);
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
        CoreModule.P().a().Kc(avatarCard.getContext(), i, new d30() { // from class: l.m7c
            public final void call() {
                avatarCard.m2295c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
            }
        });
        return true;
    }
}
