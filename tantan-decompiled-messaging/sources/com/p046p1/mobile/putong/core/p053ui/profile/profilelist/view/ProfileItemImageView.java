package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VDraweeView;
import p149l.gm5;
import p149l.qib0;
import p149l.t100;
import p149l.wn90;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileItemImageView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public String f34093o;

    /* JADX INFO: renamed from: p */
    public String f34094p;

    public ProfileItemImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: w */
    private void m52886w() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135351a.m52887x(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m52887x(View view) {
        User user = getUser();
        if (user != null) {
            m52888v().startActivityWithCustomTransition(CommonMediaPreviewAct.m47805Z1(m52888v(), this.f34093o, new ArrayList(user.profile.extensions.game.screenshot)), new gm5());
        }
    }

    public User getUser() {
        if (!TextUtils.equals(CoreModule.m29931H().userId(), this.f34094p)) {
            return CoreModule.m29932K().getUserById(this.f34094p);
        }
        User user = m52888v() instanceof ProfileAct ? wn90.m204602F().f187269a : null;
        return user == null ? CoreModule.f17545c.f19639e0.m169527p9() : user;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52886w();
    }

    /* JADX INFO: renamed from: v */
    public Act m52888v() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: y */
    public void m52889y(String str, String str2) {
        this.f34094p = str;
        this.f34093o = str2;
        if (TextUtils.isEmpty(str2)) {
            qib0.f154691G.m184725o(this);
            return;
        }
        Media mediaFromUrl = Media.fromUrl(this.f34093o);
        if (mediaFromUrl instanceof Picture) {
            qib0.f154691G.m102325I0(this, ((Picture) mediaFromUrl).profile480().formatted(), t100.m186890d(105.0f), t100.m186890d(105.0f));
        } else {
            qib0.f154691G.m102325I0(this, this.f34093o, t100.m186890d(105.0f), t100.m186890d(105.0f));
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
