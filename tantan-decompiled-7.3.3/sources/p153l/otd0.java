package p153l;

import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/otd0;", "Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "Ll/std0;", "svgaUtil", "<init>", "(Ll/std0;)V", "", "isHigh", "", "url", "Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "svgaResLoadCallBack", "", "loadSVGARes", "(ZLjava/lang/String;Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;)V", "a", "Ll/std0;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class otd0 implements SVGAResLoadAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final std0 svgaUtil;

    public otd0(@NotNull std0 std0Var) {
        std0Var.getClass();
        this.svgaUtil = std0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m169081a(SVGAResLoadCallBack sVGAResLoadCallBack, DownloadTask downloadTask, Throwable th) {
        sVGAResLoadCallBack.onResLoadFail();
    }

    /* JADX INFO: renamed from: b */
    public static void m169082b(File file, SVGAResLoadCallBack sVGAResLoadCallBack, DownloadTask downloadTask, File file2) {
        if (!xgt.m210942f(file)) {
            sVGAResLoadCallBack.onResLoadFail();
            return;
        }
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        sVGAResLoadCallBack.onResLoadSuccess(absolutePath);
    }

    @Override // com.immomo.svgaplayer.adapter.SVGAResLoadAdapter
    public void loadSVGARes(boolean isHigh, @NotNull String url, @Nullable final SVGAResLoadCallBack svgaResLoadCallBack) {
        url.getClass();
        if (svgaResLoadCallBack == null) {
            return;
        }
        try {
            if (this.svgaUtil.m187864e(url)) {
                final File fileM187865f = this.svgaUtil.m187865f(url);
                if (!fileM187865f.exists()) {
                    C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(url).m80823o(fileM187865f.getAbsolutePath()).m80818j(new z20() { // from class: l.mtd0
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            otd0.m169082b(fileM187865f, svgaResLoadCallBack, (DownloadTask) obj, (File) obj2);
                        }
                    }).m80814f(new z20() { // from class: l.ntd0
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            otd0.m169081a(svgaResLoadCallBack, (DownloadTask) obj, (Throwable) obj2);
                        }
                    }).m80809a());
                } else {
                    String absolutePath = fileM187865f.getAbsolutePath();
                    absolutePath.getClass();
                    svgaResLoadCallBack.onResLoadSuccess(absolutePath);
                }
            }
        } catch (Exception unused) {
            svgaResLoadCallBack.onResLoadFail();
        }
    }
}
