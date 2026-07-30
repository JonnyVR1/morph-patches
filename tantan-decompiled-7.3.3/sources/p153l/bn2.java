package p153l;

import android.content.Context;
import com.idv.identity.base.algorithm.doc.Frame;
import com.idv.identity.base.algorithm.doc.IDocDelegate;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bn2 implements IDocDelegate {
    /* JADX INFO: renamed from: a */
    public abstract boolean m105278a(Context context, nsl nslVar, String str, String str2, Map<String, Object> map);

    /* JADX INFO: renamed from: b */
    public abstract void m105279b();

    /* JADX INFO: renamed from: c */
    public abstract void m105280c();

    @Override // com.idv.identity.base.algorithm.doc.IDocDelegate
    public abstract boolean processImage(Frame frame);
}
