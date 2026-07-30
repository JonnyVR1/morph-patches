package com.p046p1.mobile.putong.core.p053ui.profile.photo;

import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.InterfaceC8687a;
import com.p046p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import p147v.VListCell;
import p149l.c40;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.a */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8687a {
    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m51797f(AvatarCard avatarCard, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        avatarCard.f33047d.m105113b();
        if ("重试".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(c22545a.f209159a)) {
            avatarCard.m51767c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m51798g(AvatarCard avatarCard, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        avatarCard.f33047d.m105113b();
        avatarCard.m51767c0(AvatarCard.ClickAction.DELETE_PICTURE);
    }

    /* JADX INFO: renamed from: a */
    default void m51800a(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo51803d(avatarCard, i);
            return;
        }
        c40 c40VarM105153F = new c40.C16057b(avatarCard.getContext()).m105156I(App.f15369e.getString(R$string.f27815a)).m105168U(new View.OnClickListener() { // from class: l.a95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33047d.m105113b();
            }
        }).m105164Q(vwb.m200324f0(App.f15369e.getString(R$string.f27833d))).m105169V(new c40.InterfaceC16059d() { // from class: l.b95
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                InterfaceC8687a.m51798g(avatarCard, vListCell, c22545a, i2);
            }
        }).m105153F();
        avatarCard.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: b */
    default void mo51801b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo51803d(avatarCard, i);
            return;
        }
        c40 c40VarM105153F = new c40.C16057b(avatarCard.getContext()).m105156I(App.f15369e.getString(R$string.f27815a)).m105168U(new View.OnClickListener() { // from class: l.y85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33047d.m105113b();
            }
        }).m105164Q(new ArrayList(vwb.m200324f0("重试", "删除"))).m105169V(new c40.InterfaceC16059d() { // from class: l.z85
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                InterfaceC8687a.m51797f(avatarCard, vListCell, c22545a, i2);
            }
        }).m105153F();
        avatarCard.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: c */
    default boolean mo51802c(AvatarCard avatarCard, int i) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    default boolean mo51803d(AvatarCard avatarCard, int i) {
        return false;
    }
}
