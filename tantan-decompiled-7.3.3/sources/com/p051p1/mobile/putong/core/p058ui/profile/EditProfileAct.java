package com.p051p1.mobile.putong.core.p058ui.profile;

import android.R;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import java.util.List;
import p153l.w1j0;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileAct extends ProfileAct implements w1j0 {
    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m51761c3() {
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        return (frag instanceof ProfileListFragLocalEditImpl) && ((ProfileListFragLocalEditImpl) frag).f34749C.getSelectedTabPosition() == 1;
    }

    /* JADX INFO: renamed from: d3 */
    public void m51762d3() {
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ((ProfileListFragLocalEditImpl) frag).mo52239E();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct, com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ((ProfileListFragLocalEditImpl) frag).m53757H8(list, i);
        }
        if (frag instanceof ProfileListExpandedEditFrag) {
            ((ProfileListExpandedEditFrag) frag).m52304m7(list, i);
        }
    }
}
