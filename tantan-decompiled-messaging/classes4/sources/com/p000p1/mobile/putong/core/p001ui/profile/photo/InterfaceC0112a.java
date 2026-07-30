package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.InterfaceC0112a;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.profile.R;
import java.util.ArrayList;
import l.c40;
import l.vwb;
import v.VListCell;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface InterfaceC0112a {
    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m2325f(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        if ("重试".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.RETRY_UPLOAD);
        } else if ("删除".equals(aVar.a)) {
            avatarCard.m2295c0(AvatarCard.ClickAction.DELETE_PICTURE);
        }
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m2326g(AvatarCard avatarCard, VListCell vListCell, VListCell.a aVar, int i) {
        avatarCard.f869d.b();
        avatarCard.m2295c0(AvatarCard.ClickAction.DELETE_PICTURE);
    }

    /* JADX INFO: renamed from: a */
    default void m2328a(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo2331d(avatarCard, i);
            return;
        }
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.a95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).Q(vwb.f0(new CharSequence[]{App.e.getString(R.string.d)})).V(new c40.d() { // from class: l.b95
            /* JADX INFO: renamed from: a */
            public final void m10203a(VListCell vListCell, VListCell.a aVar, int i2) {
                InterfaceC0112a.m2326g(avatarCard, vListCell, aVar, i2);
            }
        }).F();
        avatarCard.f869d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: b */
    default void mo2329b(final AvatarCard avatarCard, int i) {
        if (i == 0) {
            mo2331d(avatarCard, i);
            return;
        }
        c40 c40VarF = new c40.b(avatarCard.getContext()).I(App.e.getString(R.string.a)).U(new View.OnClickListener() { // from class: l.y85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avatarCard.f869d.b();
            }
        }).Q(new ArrayList(vwb.f0(new String[]{"重试", "删除"}))).V(new c40.d() { // from class: l.z85
            /* JADX INFO: renamed from: a */
            public final void m27125a(VListCell vListCell, VListCell.a aVar, int i2) {
                InterfaceC0112a.m2325f(avatarCard, vListCell, aVar, i2);
            }
        }).F();
        avatarCard.f869d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: c */
    default boolean mo2330c(AvatarCard avatarCard, int i) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    default boolean mo2331d(AvatarCard avatarCard, int i) {
        return false;
    }
}
