package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons;

import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileButton {

    /* JADX INFO: renamed from: a */
    public ProfileButtonType f1690a;

    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType f1691b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f1692c;

    public enum ProfileButtonType {
        Like,
        Dislike,
        SuperLike,
        OneKeyMatch,
        Chat,
        Recovery,
        CityGreet,
        VideoChat
    }

    public ProfileButton(ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        this.f1690a = profileButtonType;
        this.f1691b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public View m2926a() {
        if (NullChecker.a(this.f1692c) && NullChecker.a(this.f1692c.get())) {
            return this.f1692c.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public ProfileButton m2927b(View view) {
        this.f1692c = new WeakReference<>(view);
        return this;
    }
}
