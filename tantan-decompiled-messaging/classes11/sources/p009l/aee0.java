package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e6c0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class aee0 extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public final MediaPreviewAct f9432c;

    public aee0(MediaPreviewAct mediaPreviewAct) {
        this.f9432c = mediaPreviewAct;
    }

    /* JADX INFO: renamed from: C */
    public int m11346C() {
        return this.f9432c.m9385z2().size();
    }

    /* JADX INFO: renamed from: D */
    public View m11347D(ViewGroup viewGroup, int i) {
        return this.f9432c.inflater().inflate(e6c0.n, viewGroup, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m11345A(View view, final Media media, int i, int i2) {
        PickerSelectedItem pickerSelectedItem = (PickerSelectedItem) view;
        MediaPreviewAct mediaPreviewAct = this.f9432c;
        pickerSelectedItem.m9420b(C0469a.m9325c(this.f9432c.f7677p.croppedMap, media.url), mediaPreviewAct.f7685x.get(mediaPreviewAct.f7664c.getCurrentItem()).isSameOrigin(media));
        pickerSelectedItem.setOnClickListener(new View.OnClickListener() { // from class: l.yde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23003a.m11350I(media, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f9432c.m9385z2().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m11350I(final Media media, View view) {
        Media media2 = (Media) vwb.r(this.f9432c.f7685x, new w9j() { // from class: l.zde0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).isSameOrigin(media));
            }
        });
        if (NullChecker.a(media2)) {
            MediaPreviewAct mediaPreviewAct = this.f9432c;
            mediaPreviewAct.f7664c.T(mediaPreviewAct.f7685x.indexOf(media2), false);
        }
    }
}
