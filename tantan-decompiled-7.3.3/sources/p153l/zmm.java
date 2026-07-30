package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class zmm extends iwi {
    public zmm(Act act, MediaWrapper mediaWrapper) {
        super(act, mediaWrapper);
    }

    @Override // p153l.iwi, p153l.jic0
    /* JADX INFO: renamed from: F */
    public void mo29822A(View view, ewi ewiVar, int i, int i2) {
        super.mo29822A(view, ewiVar, i, i2);
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.setBackground(null);
        mediaFolderItemView.f54882d.setTextColor(view.getContext().getResources().getColor(c9c0.f80474y1));
        mediaFolderItemView.f54883e.setTextColor(view.getContext().getResources().getColor(c9c0.f80395Z1));
    }
}
