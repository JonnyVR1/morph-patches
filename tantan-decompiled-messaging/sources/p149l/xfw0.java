package p149l;

import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xfw0 {

    /* JADX INFO: renamed from: a */
    public final vew0 f192723a;

    /* JADX INFO: renamed from: b */
    public final wfw0 f192724b;

    public xfw0(wfw0 wfw0Var) {
        vew0 vew0Var = uew0.f176213b;
        this.f192724b = wfw0Var;
        this.f192723a = vew0Var;
    }

    /* JADX INFO: renamed from: b */
    public static xfw0 m208615b(int i) {
        return new xfw0(new tfw0(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
    }

    /* JADX INFO: renamed from: c */
    public static xfw0 m208616c(vew0 vew0Var) {
        return new xfw0(new rfw0(vew0Var));
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m208618d(CharSequence charSequence) {
        charSequence.getClass();
        return new ufw0(this, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final List m208619f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM208620g = m208620g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM208620g.hasNext()) {
            arrayList.add((String) itM208620g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final Iterator m208620g(CharSequence charSequence) {
        return this.f192724b.mo179147a(this, charSequence);
    }
}
