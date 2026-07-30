package com.p051p1.mobile.putong.core.p058ui.profile.photo;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCard;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8854e;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import p151v.VListCell;
import p153l.j9c0;
import p153l.jyb;
import p153l.w30;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.e */
/* JADX INFO: loaded from: classes4.dex */
public class C8854e implements InterfaceC8850a {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m53001j(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        if ("重新裁剪头像".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.EDIT_PICTURE);
            return;
        }
        if ("更换头像".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("编辑标签".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.EDIT_PICTURE_TAG);
        } else if ("删除".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m53002k(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        if ("重试".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.photo.InterfaceC8850a
    /* JADX INFO: renamed from: b */
    public void mo52984b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo52985c(avatarCard, i);
            return;
        }
        ArrayList arrayList = new ArrayList(jyb.m147507f0("重试", "删除"));
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.nk40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204666R(new int[]{arrayList.indexOf("删除")}, new int[]{j9c0.f118871h}).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.ok40
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                C8854e.m53002k(avatarCard, vListCell, c22660a, i2);
            }
        }).m204654F();
        avatarCard.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.photo.InterfaceC8850a
    /* JADX INFO: renamed from: c */
    public boolean mo52985c(final AvatarCard avatarCard, int i) {
        if (super.mo52985c(avatarCard, i)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            if (avatarCard.getConfig().m211296r()) {
                arrayList.add("编辑标签");
            }
            if (avatarCard.getMedia() instanceof Picture) {
                arrayList.addAll(jyb.m147507f0("重新裁剪头像", "删除"));
            } else {
                arrayList.addAll(jyb.m147507f0("删除"));
            }
        } else if (avatarCard.getMedia() instanceof Picture) {
            arrayList.addAll(jyb.m147507f0("重新裁剪头像", "更换头像"));
        } else {
            arrayList.addAll(jyb.m147507f0("更换头像"));
        }
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.lk40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204666R(new int[]{arrayList.indexOf("删除")}, new int[]{j9c0.f118871h}).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.mk40
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                C8854e.m53001j(avatarCard, vListCell, c22660a, i2);
            }
        }).m204654F();
        avatarCard.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.photo.InterfaceC8850a
    /* JADX INFO: renamed from: d */
    public boolean mo52986d(final AvatarCard avatarCard, int i) {
        if (super.mo52986d(avatarCard, i)) {
            return true;
        }
        CoreModule.m30933P().m143405a().mo34354Kc((Act) avatarCard.getContext(), i, new x20() { // from class: l.pk40
            @Override // p153l.x20
            public final void call() {
                avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
            }
        });
        return true;
    }
}
