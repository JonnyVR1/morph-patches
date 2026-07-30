package com.p051p1.mobile.putong.core.p058ui.profile.photo;

import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.InterfaceC8850a;
import com.p051p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import p151v.VListCell;
import p153l.jyb;
import p153l.w30;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.a */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8850a {
    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m52980f(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        if ("重试".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(c22660a.f210081a)) {
            avatarCard.m52950c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m52981g(AvatarCard avatarCard, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        avatarCard.f33895d.m204614b();
        avatarCard.m52950c0(AvatarCard.ClickAction.DELETE_PICTURE);
    }

    /* JADX INFO: renamed from: a */
    default void m52983a(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo52986d(avatarCard, i);
            return;
        }
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.ba5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204665Q(jyb.m147507f0(App.f16088e.getString(R$string.f28681d))).m204670V(new w30.InterfaceC21003d() { // from class: l.ca5
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                InterfaceC8850a.m52981g(avatarCard, vListCell, c22660a, i2);
            }
        }).m204654F();
        avatarCard.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: b */
    default void mo52984b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo52986d(avatarCard, i);
            return;
        }
        w30 w30VarM204654F = new w30.C21001b(avatarCard.getContext()).m204657I(App.f16088e.getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.z95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f33895d.m204614b();
            }
        }).m204665Q(new ArrayList(jyb.m147507f0("重试", "删除"))).m204670V(new w30.InterfaceC21003d() { // from class: l.aa5
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                InterfaceC8850a.m52980f(avatarCard, vListCell, c22660a, i2);
            }
        }).m204654F();
        avatarCard.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: c */
    default boolean mo52985c(AvatarCard avatarCard, int i) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    default boolean mo52986d(AvatarCard avatarCard, int i) {
        return false;
    }
}
