package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VDraweeView;
import p153l.aw90;
import p153l.bnl0;
import p153l.kn5;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileItemImageView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public String f34941o;

    /* JADX INFO: renamed from: p */
    public String f34942p;

    public ProfileItemImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: w */
    private void m54069w() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.qz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160233a.m54070x(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m54070x(View view) {
        User user = getUser();
        if (user != null) {
            m54071v().startActivityWithCustomTransition(CommonMediaPreviewAct.m48988a2(m54071v(), this.f34941o, new ArrayList(user.profile.extensions.game.screenshot)), new kn5());
        }
    }

    public User getUser() {
        if (!TextUtils.equals(CoreModule.m30929H().userId(), this.f34942p)) {
            return CoreModule.m30930K().getUserById(this.f34942p);
        }
        User user = m54071v() instanceof ProfileAct ? aw90.m100562F().f73701a : null;
        return user == null ? CoreModule.f18264c.f20381e0.m116600p9() : user;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54069w();
    }

    /* JADX INFO: renamed from: v */
    public Act m54071v() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: y */
    public void m54072y(String str, String str2) {
        this.f34942p = str;
        this.f34941o = str2;
        if (TextUtils.isEmpty(str2)) {
            uqb0.f180374G.m98798o(this);
            return;
        }
        Media mediaFromUrl = Media.fromUrl(this.f34941o);
        if (mediaFromUrl instanceof Picture) {
            uqb0.f180374G.m127109I0(this, ((Picture) mediaFromUrl).profile480().formatted(), qa00.m175859d(105.0f), qa00.m175859d(105.0f));
        } else {
            uqb0.f180374G.m127109I0(this, this.f34941o, qa00.m175859d(105.0f), qa00.m175859d(105.0f));
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
