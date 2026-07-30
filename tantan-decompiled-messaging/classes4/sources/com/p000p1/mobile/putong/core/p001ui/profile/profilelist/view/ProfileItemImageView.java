package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.gm5;
import l.qib0;
import l.t100;
import l.wn90;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileItemImageView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public String f1915o;

    /* JADX INFO: renamed from: p */
    public String f1916p;

    public ProfileItemImageView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m3439w() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.mr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15602a.m3440x(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m3440x(View view) {
        User user = getUser();
        if (user != null) {
            m3441v().startActivityWithCustomTransition(CommonMediaPreviewAct.Z1(m3441v(), this.f1915o, new ArrayList(user.profile.extensions.game.screenshot)), new gm5());
        }
    }

    public User getUser() {
        if (!TextUtils.equals(CoreModule.H().userId(), this.f1916p)) {
            return CoreModule.K().getUserById(this.f1916p);
        }
        User user = m3441v() instanceof ProfileAct ? wn90.F().a : null;
        return user == null ? CoreModule.c.e0.p9() : user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3439w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public Act m3441v() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: y */
    public void m3442y(String str, String str2) {
        this.f1916p = str;
        this.f1915o = str2;
        if (TextUtils.isEmpty(str2)) {
            qib0.G.o(this);
            return;
        }
        Picture pictureFromUrl = Media.fromUrl(this.f1915o);
        if (pictureFromUrl instanceof Picture) {
            qib0.G.I0(this, pictureFromUrl.profile480().formatted(), t100.d(105.0f), t100.d(105.0f));
        } else {
            qib0.G.I0(this, this.f1915o, t100.d(105.0f), t100.d(105.0f));
        }
        setZoomAnimationKey(Media.URL_TO_CACHEKEY(str2));
    }

    public ProfileItemImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileItemImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
