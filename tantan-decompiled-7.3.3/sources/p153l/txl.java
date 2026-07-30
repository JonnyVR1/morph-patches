package p153l;

import android.content.Context;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface txl {
    /* JADX INFO: renamed from: a */
    void mo130837a(uxl uxlVar);

    /* JADX INFO: renamed from: b */
    void mo130838b(qxl qxlVar);

    /* JADX INFO: renamed from: c */
    void mo130839c(sxl sxlVar);

    /* JADX INFO: renamed from: d */
    void mo130840d(rxl rxlVar);

    long getCurrentPosition();

    int getVideoHeight();

    int getVideoWidth();

    void init(Context context);

    void prepareAsync() throws IllegalStateException;

    void release() throws IllegalStateException;

    void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setLooping(boolean z);

    void setSurface(Surface surface);

    void start() throws IllegalStateException;
}
