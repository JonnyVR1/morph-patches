package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons;

import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileButton {

    /* JADX INFO: renamed from: a */
    public ProfileButtonType f34716a;

    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType f34717b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f34718c;

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
        this.f34716a = profileButtonType;
        this.f34717b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public View m53575a() {
        if (NullChecker.m82486a(this.f34718c) && NullChecker.m82486a(this.f34718c.get())) {
            return this.f34718c.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public ProfileButton m53576b(View view) {
        this.f34718c = new WeakReference<>(view);
        return this;
    }
}
