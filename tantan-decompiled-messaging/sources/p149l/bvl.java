package p149l;

import android.content.Context;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface bvl {
    /* JADX INFO: renamed from: a */
    void mo104054a(cvl cvlVar);

    /* JADX INFO: renamed from: b */
    void mo104055b(yul yulVar);

    /* JADX INFO: renamed from: c */
    void mo104056c(avl avlVar);

    /* JADX INFO: renamed from: d */
    void mo104057d(zul zulVar);

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
