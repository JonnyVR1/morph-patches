package p009l;

import android.view.View;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.android.app.Act;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xkm extends mti {
    public xkm(Act act, MediaWrapper mediaWrapper) {
        super(act, mediaWrapper);
    }

    @Override // p009l.mti
    /* JADX INFO: renamed from: F */
    public void mo18588A(View view, iti itiVar, int i, int i2) {
        super.mo18588A(view, itiVar, i, i2);
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.setBackground(null);
        mediaFolderItemView.f7640d.setTextColor(view.getContext().getResources().getColor(w0c0.x1));
        mediaFolderItemView.f7641e.setTextColor(view.getContext().getResources().getColor(w0c0.Y1));
    }
}
