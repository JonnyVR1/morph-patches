package p006l;

import android.os.Bundle;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import java.io.File;
import java.io.IOException;
import java.util.List;
import l.e30;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.rhi;
import l.vwb;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gsw extends jq2<rsw> {

    /* JADX INFO: renamed from: a */
    public String f13478a;

    public gsw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ c m15949e0(Media media) {
        if (!TEnum.equals(media.status, "preprocessed")) {
            return c.just(media);
        }
        ((Video) media).cover = null;
        return ya5.m28131M(vwb.f0(new Media[]{media}), "face-verification", "face-verification", true).map(new w9j() { // from class: l.fsw
            public final Object call(Object obj) {
                return gsw.m15950f0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Video m15950f0(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ Media m15953i0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m15955m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("key_token");
        String strM15957k0 = m15957k0();
        this.f13478a = strM15957k0;
        if (NullChecker.a(strM15957k0)) {
            ((rsw) ((jq2) this).viewModel).m22921i(stringExtra, this.f13478a);
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m15956a0() {
        creates(new e30() { // from class: l.asw
            public final void call(Object obj) {
                this.f8478a.m15955m0((Bundle) obj);
            }
        });
    }

    public void destroy() {
        ((rsw) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: k0 */
    public String m15957k0() {
        File fileM15958l0;
        try {
            fileM15958l0 = m15958l0("verification", "temp");
        } catch (Exception e) {
            CrashHelper.c(e);
            Log4Android.getInstance().e(e);
            fileM15958l0 = null;
        }
        if (fileM15958l0 == null) {
            return null;
        }
        File file = new File(fileM15958l0, ".nomedia");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                CrashHelper.c(e2);
                Log4Android.getInstance().e(e2);
            }
        }
        return new File(fileM15958l0, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* JADX INFO: renamed from: l0 */
    public final File m15958l0(String str, String str2) {
        File file = new File(rhi.v(), str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, str2).createNewFile();
                return file;
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m15959n0(Media media) {
        act().progressDismiss();
        if (TEnum.equals(media.status, "raw")) {
            return;
        }
        kwk0.f16029b.onNext(media.url);
        rhi.k(new File(rhi.v(), "verification"));
        act().finish();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m15960o0(Throwable th) {
        act().progressDismiss();
        kwk0.f16029b.onNext((Object) null);
        rhi.k(new File(rhi.v(), "verification"));
        act().finish();
    }

    /* JADX INFO: renamed from: p0 */
    public void m15961p0() {
        Media video = new Video();
        video.url = rhi.B(this.f13478a);
        video.status = MediaLocalStatus.get("raw");
        act().duringCreated(new lsx(vwb.f0(new Media[]{video}), true).map(new w9j() { // from class: l.bsw
            public final Object call(Object obj) {
                return gsw.m15953i0((List) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.csw
            public final Object call(Object obj) {
                return gsw.m15949e0((Media) obj);
            }
        })).last().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.dsw
            public final void call(Object obj) {
                this.f10556a.m15959n0((Media) obj);
            }
        }, new e30() { // from class: l.esw
            public final void call(Object obj) {
                this.f11423a.m15960o0((Throwable) obj);
            }
        }));
    }
}
