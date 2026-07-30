package p003l;

import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import java.io.File;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z5l0 extends AbstractC3363l4 {

    /* JADX INFO: renamed from: a */
    public f2m f9189a = new sgq0(ufe.m9718b());

    /* JADX INFO: renamed from: l.z5l0$a */
    public interface InterfaceC3497a {
        /* JADX INFO: renamed from: a */
        void mo7294a(VideoEffectModel videoEffectModel);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11347d(InterfaceC3497a interfaceC3497a, VideoEffectModel videoEffectModel) {
        if (interfaceC3497a != null) {
            interfaceC3497a.mo7294a(videoEffectModel);
        }
    }

    @Override // p003l.AbstractC3363l4
    /* JADX INFO: renamed from: a */
    public f2m mo5736a() {
        return this.f9189a;
    }

    @Override // p003l.AbstractC3363l4
    /* JADX INFO: renamed from: c */
    public boolean mo5737c(String str, boolean z, f2m.InterfaceC3325a interfaceC3325a) {
        CoreGiftInfo coreGiftInfoM7664b = m7664b(str);
        f2m f2mVar = this.f9189a;
        if (f2mVar != null && coreGiftInfoM7664b != null) {
            File fileMo6371b = f2mVar.mo6371b(((DbObject) coreGiftInfoM7664b).id, coreGiftInfoM7664b.dynamicURL);
            if (this.f9189a.mo6372c(str, coreGiftInfoM7664b.dynamicURL)) {
                if (new File(VideoEffectModel.getConfigPath(fileMo6371b.getAbsolutePath())).exists()) {
                    return true;
                }
            } else if (z) {
                this.f9189a.mo6370a(str, coreGiftInfoM7664b.dynamicURL, coreGiftInfoM7664b.dynamicMD5, CoreGiftPriority.get(CoreGiftPriority.IMMEDIATE), interfaceC3325a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public c4g0 m11348e(String str, String str2, String str3, final InterfaceC3497a interfaceC3497a) {
        return c.just(this.f9189a.mo6373d(str, str2)).map(new w9j() { // from class: l.x5l0
            public final Object call(Object obj) {
                return VideoEffectModel.parseByPath((String) obj);
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.y5l0
            public final void call(Object obj) {
                z5l0.m11347d(interfaceC3497a, (VideoEffectModel) obj);
            }
        }));
    }
}
