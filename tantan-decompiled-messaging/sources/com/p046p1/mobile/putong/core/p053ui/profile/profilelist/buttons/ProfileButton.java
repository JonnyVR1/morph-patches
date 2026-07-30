package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons;

import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileButton {

    /* JADX INFO: renamed from: a */
    public ProfileButtonType f33868a;

    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType f33869b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f33870c;

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
        this.f33868a = profileButtonType;
        this.f33869b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public View m52392a() {
        if (NullChecker.m81303a(this.f33870c) && NullChecker.m81303a(this.f33870c.get())) {
            return this.f33870c.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public ProfileButton m52393b(View view) {
        this.f33870c = new WeakReference<>(view);
        return this;
    }
}
