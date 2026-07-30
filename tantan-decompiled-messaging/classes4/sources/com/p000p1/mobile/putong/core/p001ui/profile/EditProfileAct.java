package com.p000p1.mobile.putong.core.p001ui.profile;

import android.R;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import java.util.Iterator;
import java.util.List;
import l.tsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class EditProfileAct extends ProfileAct implements tsi0 {
    /* JADX INFO: renamed from: F */
    public boolean m1013F() {
        return false;
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m1014a3() {
        ProfileListFragLocalEditImpl profileListFragLocalEditImpl = (Frag) fragmentManager().h0(R.id.content);
        return (profileListFragLocalEditImpl instanceof ProfileListFragLocalEditImpl) && profileListFragLocalEditImpl.f1723C.getSelectedTabPosition() == 1;
    }

    /* JADX INFO: renamed from: b3 */
    public void m1015b3() {
        ProfileListFragLocalEditImpl profileListFragLocalEditImpl = (Frag) fragmentManager().h0(R.id.content);
        if (profileListFragLocalEditImpl instanceof ProfileListFragLocalEditImpl) {
            profileListFragLocalEditImpl.mo1504E();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct
    public boolean disableAutoPV() {
        return true;
    }

    public void onPickImagesResult(List<Media> list, int i) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        Frag fragH0 = fragmentManager().h0(R.id.content);
        if (fragH0 instanceof ProfileListFragLocalEditImpl) {
            ((ProfileListFragLocalEditImpl) fragH0).m3115H8(list, i);
        }
        if (fragH0 instanceof ProfileListExpandedEditFrag) {
            ((ProfileListExpandedEditFrag) fragH0).m1572m7(list, i);
        }
    }
}
