package p149l;

import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/mld0;", "Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "Ll/qld0;", "svgaUtil", "<init>", "(Ll/qld0;)V", "", "isHigh", "", "url", "Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "svgaResLoadCallBack", "", "loadSVGARes", "(ZLjava/lang/String;Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;)V", "a", "Ll/qld0;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mld0 implements SVGAResLoadAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final qld0 svgaUtil;

    public mld0(@NotNull qld0 qld0Var) {
        qld0Var.getClass();
        this.svgaUtil = qld0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m155140a(SVGAResLoadCallBack sVGAResLoadCallBack, DownloadTask downloadTask, Throwable th) {
        sVGAResLoadCallBack.onResLoadFail();
    }

    /* JADX INFO: renamed from: b */
    public static void m155141b(File file, SVGAResLoadCallBack sVGAResLoadCallBack, DownloadTask downloadTask, File file2) {
        if (!wet.m202927f(file)) {
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
            if (this.svgaUtil.m175474e(url)) {
                final File fileM175475f = this.svgaUtil.m175475f(url);
                if (!fileM175475f.exists()) {
                    C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(url).m79640o(fileM175475f.getAbsolutePath()).m79635j(new f30() { // from class: l.kld0
                        @Override // p149l.f30
                        public final void call(Object obj, Object obj2) {
                            mld0.m155141b(fileM175475f, svgaResLoadCallBack, (DownloadTask) obj, (File) obj2);
                        }
                    }).m79631f(new f30() { // from class: l.lld0
                        @Override // p149l.f30
                        public final void call(Object obj, Object obj2) {
                            mld0.m155140a(svgaResLoadCallBack, (DownloadTask) obj, (Throwable) obj2);
                        }
                    }).m79626a());
                } else {
                    String absolutePath = fileM175475f.getAbsolutePath();
                    absolutePath.getClass();
                    svgaResLoadCallBack.onResLoadSuccess(absolutePath);
                }
            }
        } catch (Exception unused) {
            svgaResLoadCallBack.onResLoadFail();
        }
    }
}
