package p149l;

import android.os.Bundle;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class gsw extends jq2<rsw> {

    /* JADX INFO: renamed from: a */
    public String f104222a;

    public gsw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ C22306c m127841e0(Media media) {
        if (!TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
            return C22306c.just(media);
        }
        ((Video) media).cover = null;
        return ya5.m213797M(vwb.m200324f0(media), "face-verification", "face-verification", true).map(new w9j() { // from class: l.fsw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gsw.m127842f0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Video m127842f0(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ Media m127845i0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m127847m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra(ChannelConstant.Keys.KEY_TOKEN);
        String strM127848k0 = m127848k0();
        this.f104222a = strM127848k0;
        if (NullChecker.m81303a(strM127848k0)) {
            ((rsw) this.viewModel).m180727i(stringExtra, this.f104222a);
        } else {
            act().lambda$debugItems$19();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.asw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71499a.m127847m0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
        ((rsw) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: k0 */
    public String m127848k0() {
        File fileM127849l0;
        try {
            fileM127849l0 = m127849l0("verification", "temp");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            Log4Android.getInstance().m81400e(e);
            fileM127849l0 = null;
        }
        if (fileM127849l0 == null) {
            return null;
        }
        File file = new File(fileM127849l0, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m81296c(e2);
                Log4Android.getInstance().m81400e(e2);
            }
        }
        return new File(fileM127849l0, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: l0 */
    public final File m127849l0(String str, String str2) {
        File file = new File(rhi.m179378v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m127850n0(Media media) {
        act().progressDismiss();
        if (TEnum.equals(media.status, "raw")) {
            return;
        }
        kwk0.f124990b.onNext(media.url);
        rhi.m179367k(new File(rhi.m179378v(), "verification"));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m127851o0(Throwable th) {
        act().progressDismiss();
        kwk0.f124990b.onNext(null);
        rhi.m179367k(new File(rhi.m179378v(), "verification"));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: p0 */
    public void m127852p0() {
        Video video = new Video();
        video.url = rhi.m179355B(this.f104222a);
        video.status = MediaLocalStatus.get("raw");
        act().duringCreated(new lsx(vwb.m200324f0(video), true).map(new w9j() { // from class: l.bsw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gsw.m127845i0((List) obj);
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.csw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gsw.m127841e0((Media) obj);
            }
        })).last().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.dsw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87794a.m127850n0((Media) obj);
            }
        }, new e30() { // from class: l.esw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93057a.m127851o0((Throwable) obj);
            }
        }));
    }
}
