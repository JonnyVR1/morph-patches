package com.p051p1.mobile.putong.core.p058ui.profile.photo;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCard;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8852c;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import p151v.VListCell;
import p153l.jyb;
import p153l.w30;
import p153l.x20;
import p153l.xra;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.c */
/* JADX INFO: loaded from: classes4.dex */
public class C8852c implements InterfaceC8850a {
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m52993l(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        if ("重新裁剪头像".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.EDIT_PICTURE);
            return;
        }
        if ("从相册选择".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("选择一段视频".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_VIDEO);
        } else if ("删除".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m52994m(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        if ("从相册选择".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
        } else if ("选择一段视频".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_VIDEO);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.photo.InterfaceC8850a
    /* JADX INFO: renamed from: c */
    public boolean mo52985c(final AvatarCard avatarCard, int i) {
        if (super.mo52985c(avatarCard, i)) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        if (i == 0 && avatarCard.m51973i() == 1) {
            if (avatarCard.getMedia() instanceof Picture) {
                arrayList.addAll(jyb.m147507f0("重新裁剪头像", "从相册选择", "选择一段视频"));
            } else {
                arrayList.addAll(jyb.m147507f0("从相册选择", "选择一段视频"));
            }
        } else if (avatarCard.getMedia() instanceof Picture) {
            arrayList.addAll(jyb.m147507f0("重新裁剪头像", "删除"));
        } else {
            arrayList.addAll(jyb.m147507f0("删除"));
        }
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.jnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.knd
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                C8852c.m52993l(avatarCard, vListCell, c22660a, i2);
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
        if (xra.m212795n()) {
            CoreModule.m30933P().m143405a().mo34354Kc((Act) avatarCard.getContext(), i, new x20() { // from class: l.lnd
                @Override // p153l.x20
                public final void call() {
                    avatarCard.m52950c0(AvatarCard.ClickAction.CHOOSE_PICTURE);
                }
            });
            return true;
        }
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.mnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204665Q(jyb.m147507f0("从相册选择", "选择一段视频")).m204670V(new w30.InterfaceC21003d() { // from class: l.nnd
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                C8852c.m52994m(avatarCard, vListCell, c22660a, i2);
            }
        }).m204654F();
        avatarCard.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
        return true;
    }
}
