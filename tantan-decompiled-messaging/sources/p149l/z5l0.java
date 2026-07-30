package p149l;

import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import java.io.File;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class z5l0 extends AbstractC18145l4 {

    /* JADX INFO: renamed from: a */
    public f2m f201830a = new sgq0(ufe.m193382b());

    /* JADX INFO: renamed from: l.z5l0$a */
    public interface InterfaceC21641a {
        /* JADX INFO: renamed from: a */
        void mo138184a(VideoEffectModel videoEffectModel);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m217364d(InterfaceC21641a interfaceC21641a, VideoEffectModel videoEffectModel) {
        if (interfaceC21641a != null) {
            interfaceC21641a.mo138184a(videoEffectModel);
        }
    }

    @Override // p149l.AbstractC18145l4
    /* JADX INFO: renamed from: a */
    public f2m mo102509a() {
        return this.f201830a;
    }

    @Override // p149l.AbstractC18145l4
    /* JADX INFO: renamed from: c */
    public boolean mo102510c(String str, boolean z, f2m.InterfaceC16743a interfaceC16743a) {
        CoreGiftInfo coreGiftInfoM148418b = m148418b(str);
        f2m f2mVar = this.f201830a;
        if (f2mVar != null && coreGiftInfoM148418b != null) {
            File fileMo119228b = f2mVar.mo119228b(coreGiftInfoM148418b.f56011id, coreGiftInfoM148418b.dynamicURL);
            if (this.f201830a.mo119229c(str, coreGiftInfoM148418b.dynamicURL)) {
                if (new File(VideoEffectModel.getConfigPath(fileMo119228b.getAbsolutePath())).exists()) {
                    return true;
                }
            } else if (z) {
                this.f201830a.mo119227a(str, coreGiftInfoM148418b.dynamicURL, coreGiftInfoM148418b.dynamicMD5, CoreGiftPriority.get("IMMEDIATE"), interfaceC16743a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public c4g0 m217365e(String str, String str2, String str3, final InterfaceC21641a interfaceC21641a) {
        return C22306c.just(this.f201830a.mo119230d(str, str2)).map(new w9j() { // from class: l.x5l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VideoEffectModel.parseByPath((String) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.y5l0
            @Override // p149l.e30
            public final void call(Object obj) {
                z5l0.m217364d(interfaceC21641a, (VideoEffectModel) obj);
            }
        }));
    }
}
