package p153l;

import android.os.Bundle;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class fvw extends ar2<qvw> {

    /* JADX INFO: renamed from: a */
    public String f101103a;

    public fvw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ C22421c m127701e0(Media media) {
        if (!TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
            return C22421c.just(media);
        }
        ((Video) media).cover = null;
        return yb5.m214984M(jyb.m147507f0(media), "face-verification", "face-verification", true).map(new qcj() { // from class: l.evw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fvw.m127702f0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Video m127702f0(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ Media m127705i0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m127707m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra(ChannelConstant.Keys.KEY_TOKEN);
        String strM127708k0 = m127708k0();
        this.f101103a = strM127708k0;
        if (NullChecker.m82486a(strM127708k0)) {
            ((qvw) this.viewModel).m178385i(stringExtra, this.f101103a);
        } else {
            act().lambda$debugItems$19();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zuw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206168a.m127707m0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
        ((qvw) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: k0 */
    public String m127708k0() {
        File fileM127709l0;
        try {
            fileM127709l0 = m127709l0("verification", "temp");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            Log4Android.getInstance().m82583e(e);
            fileM127709l0 = null;
        }
        if (fileM127709l0 == null) {
            return null;
        }
        File file = new File(fileM127709l0, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                Log4Android.getInstance().m82583e(e2);
            }
        }
        return new File(fileM127709l0, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: l0 */
    public final File m127709l0(String str, String str2) {
        File file = new File(oki.m168034v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m127710n0(Media media) {
        act().progressDismiss();
        if (TEnum.equals(media.status, "raw")) {
            return;
        }
        q5l0.f155733b.onNext(media.url);
        oki.m168023k(new File(oki.m168034v(), "verification"));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m127711o0(Throwable th) {
        act().progressDismiss();
        q5l0.f155733b.onNext(null);
        oki.m168023k(new File(oki.m168034v(), "verification"));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: p0 */
    public void m127712p0() {
        Video video = new Video();
        video.url = oki.m168011B(this.f101103a);
        video.status = MediaLocalStatus.get("raw");
        act().duringCreated(new i1y(jyb.m147507f0(video), true).map(new qcj() { // from class: l.avw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fvw.m127705i0((List) obj);
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.bvw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fvw.m127701e0((Media) obj);
            }
        })).last().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.cvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84067a.m127710n0((Media) obj);
            }
        }, new y20() { // from class: l.dvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90956a.m127711o0((Throwable) obj);
            }
        }));
    }
}
