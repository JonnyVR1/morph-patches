package p149l;

import android.content.Context;
import com.idv.identity.base.algorithm.doc.Frame;
import com.idv.identity.base.algorithm.doc.IDocDelegate;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class um2 implements IDocDelegate {
    /* JADX INFO: renamed from: a */
    public abstract boolean m194301a(Context context, aql aqlVar, String str, String str2, Map<String, Object> map);

    /* JADX INFO: renamed from: b */
    public abstract void m194302b();

    /* JADX INFO: renamed from: c */
    public abstract void m194303c();

    @Override // com.idv.identity.base.algorithm.doc.IDocDelegate
    public abstract boolean processImage(Frame frame);
}
