package p153l;

import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import java.io.File;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class dfl0 extends AbstractC18089k4 {

    /* JADX INFO: renamed from: a */
    public y4m f88169a = new xpq0(yge.m215840b());

    /* JADX INFO: renamed from: l.dfl0$a */
    public interface InterfaceC16516a {
        /* JADX INFO: renamed from: a */
        void mo115527a(VideoEffectModel videoEffectModel);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m115523d(InterfaceC16516a interfaceC16516a, VideoEffectModel videoEffectModel) {
        if (interfaceC16516a != null) {
            interfaceC16516a.mo115527a(videoEffectModel);
        }
    }

    @Override // p153l.AbstractC18089k4
    /* JADX INFO: renamed from: a */
    public y4m mo115524a() {
        return this.f88169a;
    }

    @Override // p153l.AbstractC18089k4
    /* JADX INFO: renamed from: c */
    public boolean mo115525c(String str, boolean z, y4m.InterfaceC21517a interfaceC21517a) {
        CoreGiftInfo coreGiftInfoM148207b = m148207b(str);
        y4m y4mVar = this.f88169a;
        if (y4mVar != null && coreGiftInfoM148207b != null) {
            File fileMo199743b = y4mVar.mo199743b(coreGiftInfoM148207b.f56859id, coreGiftInfoM148207b.dynamicURL);
            if (this.f88169a.mo199744c(str, coreGiftInfoM148207b.dynamicURL)) {
                if (new File(VideoEffectModel.getConfigPath(fileMo199743b.getAbsolutePath())).exists()) {
                    return true;
                }
            } else if (z) {
                this.f88169a.mo199742a(str, coreGiftInfoM148207b.dynamicURL, coreGiftInfoM148207b.dynamicMD5, CoreGiftPriority.get("IMMEDIATE"), interfaceC21517a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public kcg0 m115526e(String str, String str2, String str3, final InterfaceC16516a interfaceC16516a) {
        return C22421c.just(this.f88169a.mo199745d(str, str2)).map(new qcj() { // from class: l.bfl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VideoEffectModel.parseByPath((String) obj);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.cfl0
            @Override // p153l.y20
            public final void call(Object obj) {
                dfl0.m115523d(interfaceC16516a, (VideoEffectModel) obj);
            }
        }));
    }
}
