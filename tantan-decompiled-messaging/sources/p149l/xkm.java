package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.MediaFolderItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class xkm extends mti {
    public xkm(Act act, MediaWrapper mediaWrapper) {
        super(act, mediaWrapper);
    }

    @Override // p149l.mti, p149l.dac0
    /* JADX INFO: renamed from: F */
    public void mo28823A(View view, iti itiVar, int i, int i2) {
        super.mo28823A(view, itiVar, i, i2);
        MediaFolderItemView mediaFolderItemView = (MediaFolderItemView) view;
        mediaFolderItemView.setBackground(null);
        mediaFolderItemView.f54034d.setTextColor(view.getContext().getResources().getColor(w0c0.f183901x1));
        mediaFolderItemView.f54035e.setTextColor(view.getContext().getResources().getColor(w0c0.f183823Y1));
    }
}
