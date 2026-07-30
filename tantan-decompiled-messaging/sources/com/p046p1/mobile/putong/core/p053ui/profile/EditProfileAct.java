package com.p046p1.mobile.putong.core.p053ui.profile;

import android.R;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import java.util.List;
import p149l.tsi0;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileAct extends ProfileAct implements tsi0 {
    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m50578a3() {
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        return (frag instanceof ProfileListFragLocalEditImpl) && ((ProfileListFragLocalEditImpl) frag).f33901C.getSelectedTabPosition() == 1;
    }

    /* JADX INFO: renamed from: b3 */
    public void m50579b3() {
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ((ProfileListFragLocalEditImpl) frag).mo51056E();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct, com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ((ProfileListFragLocalEditImpl) frag).m52574H8(list, i);
        }
        if (frag instanceof ProfileListExpandedEditFrag) {
            ((ProfileListExpandedEditFrag) frag).m51121m7(list, i);
        }
    }
}
