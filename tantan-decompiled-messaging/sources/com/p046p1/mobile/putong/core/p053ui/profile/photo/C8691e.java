package com.p046p1.mobile.putong.core.p053ui.profile.photo;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCard;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.C8691e;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import p147v.VListCell;
import p149l.c1c0;
import p149l.c40;
import p149l.d30;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.e */
/* JADX INFO: loaded from: classes4.dex */
public class C8691e implements InterfaceC8687a {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m51818j(AvatarCard avatarCard, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        avatarCard.f33047d.m105113b();
        if ("重新裁剪头像".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.EDIT_PICTURE);
            return;
        }
        if ("更换头像".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("编辑标签".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.EDIT_PICTURE_TAG);
        } else if ("删除".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m51819k(AvatarCard avatarCard, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        avatarCard.f33047d.m105113b();
        if ("重试".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.photo.InterfaceC8687a
    /* JADX INFO: renamed from: b */
    public void mo51801b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo51802c(avatarCard, i);
            return;
        }
        ArrayList arrayList = new ArrayList(vwb.m200324f0("重试", "删除"));
        c40 c40VarM105153F = new c40.C16057b(avatarCard.getContext()).m105156I(App.f15369e.getString(R$string.f27815a)).m105168U(new View.OnClickListener() { // from class: l.zb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33047d.m105113b();
            }
        }).m105165R(new int[]{arrayList.indexOf("删除")}, new int[]{c1c0.f78251h}).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.ac40
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                C8691e.m51819k(avatarCard, vListCell, c22545a, i2);
            }
        }).m105153F();
        avatarCard.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.photo.InterfaceC8687a
    /* JADX INFO: renamed from: c */
    public boolean mo51802c(final AvatarCard avatarCard, int i) {
        if (super.mo51802c(avatarCard, i)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            if (avatarCard.getConfig().m175087r()) {
                arrayList.add("编辑标签");
            }
            if (avatarCard.getMedia() instanceof Picture) {
                arrayList.addAll(vwb.m200324f0("重新裁剪头像", "删除"));
            } else {
                arrayList.addAll(vwb.m200324f0("删除"));
            }
        } else if (avatarCard.getMedia() instanceof Picture) {
            arrayList.addAll(vwb.m200324f0("重新裁剪头像", "更换头像"));
        } else {
            arrayList.addAll(vwb.m200324f0("更换头像"));
        }
        c40 c40VarM105153F = new c40.C16057b(avatarCard.getContext()).m105156I(App.f15369e.getString(R$string.f27815a)).m105168U(new View.OnClickListener() { // from class: l.xb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33047d.m105113b();
            }
        }).m105165R(new int[]{arrayList.indexOf("删除")}, new int[]{c1c0.f78251h}).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.yb40
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                C8691e.m51818j(avatarCard, vListCell, c22545a, i2);
            }
        }).m105153F();
        avatarCard.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.photo.InterfaceC8687a
    /* JADX INFO: renamed from: d */
    public boolean mo51803d(final AvatarCard avatarCard, int i) {
        if (super.mo51803d(avatarCard, i)) {
            return true;
        }
        CoreModule.m29935P().m94651a().mo33351Kc((Act) avatarCard.getContext(), i, new d30() { // from class: l.bc40
            @Override // p149l.d30
            public final void call() {
                avatarCard.m51767c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
            }
        });
        return true;
    }
}
