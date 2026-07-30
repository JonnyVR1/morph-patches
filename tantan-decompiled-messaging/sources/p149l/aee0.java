package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class aee0 extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public final MediaPreviewAct f69036c;

    public aee0(MediaPreviewAct mediaPreviewAct) {
        this.f69036c = mediaPreviewAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f69036c.m79077z2().size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f69036c.inflater().inflate(e6c0.f89555n, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Media media, int i, int i2) {
        PickerSelectedItem pickerSelectedItem = (PickerSelectedItem) view;
        MediaPreviewAct mediaPreviewAct = this.f69036c;
        pickerSelectedItem.m79108b(C13067a.m79017c(this.f69036c.f54071p.croppedMap, media.url), mediaPreviewAct.f54079x.get(mediaPreviewAct.f54058c.getCurrentItem()).isSameOrigin(media));
        pickerSelectedItem.setOnClickListener(new View.OnClickListener() { // from class: l.yde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f197558a.m96091I(media, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f69036c.m79077z2().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m96091I(final Media media, View view) {
        Media media2 = (Media) vwb.m200346r(this.f69036c.f54079x, new w9j() { // from class: l.zde0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).isSameOrigin(media));
            }
        });
        if (NullChecker.m81303a(media2)) {
            MediaPreviewAct mediaPreviewAct = this.f69036c;
            mediaPreviewAct.f54058c.m4176T(mediaPreviewAct.f54079x.indexOf(media2), false);
        }
    }
}
