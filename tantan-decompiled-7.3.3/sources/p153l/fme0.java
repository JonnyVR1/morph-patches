package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class fme0 extends jic0<Media> {

    /* JADX INFO: renamed from: c */
    public final MediaPreviewAct f99768c;

    public fme0(MediaPreviewAct mediaPreviewAct) {
        this.f99768c = mediaPreviewAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f99768c.m80233A2().size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f99768c.inflater().inflate(jec0.f120468n, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Media media, int i, int i2) {
        PickerSelectedItem pickerSelectedItem = (PickerSelectedItem) view;
        MediaPreviewAct mediaPreviewAct = this.f99768c;
        pickerSelectedItem.m80291b(C13230a.m80200c(this.f99768c.f54919p.croppedMap, media.url), mediaPreviewAct.f54927x.get(mediaPreviewAct.f54906c.getCurrentItem()).isSameOrigin(media));
        pickerSelectedItem.setOnClickListener(new View.OnClickListener() { // from class: l.dme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f89618a.m126223I(media, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f99768c.m80233A2().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m126223I(final Media media, View view) {
        Media media2 = (Media) jyb.m147529r(this.f99768c.f54927x, new qcj() { // from class: l.eme0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).isSameOrigin(media));
            }
        });
        if (NullChecker.m82486a(media2)) {
            MediaPreviewAct mediaPreviewAct = this.f99768c;
            mediaPreviewAct.f54906c.m4178T(mediaPreviewAct.f54927x.indexOf(media2), false);
        }
    }
}
