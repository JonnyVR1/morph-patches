package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rwu0 {

    /* JADX INFO: renamed from: g */
    public String f165243g;

    /* JADX INFO: renamed from: i */
    public String f165245i;

    /* JADX INFO: renamed from: j */
    public String f165246j;

    /* JADX INFO: renamed from: l */
    public boolean f165248l;

    /* JADX INFO: renamed from: m */
    public String f165249m;

    /* JADX INFO: renamed from: a */
    public final HashSet f165237a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Bundle f165238b = new Bundle();

    /* JADX INFO: renamed from: c */
    public final HashMap f165239c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashSet f165240d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final Bundle f165241e = new Bundle();

    /* JADX INFO: renamed from: f */
    public final HashSet f165242f = new HashSet();

    /* JADX INFO: renamed from: h */
    public final List f165244h = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f165247k = -1;

    /* JADX INFO: renamed from: n */
    public int f165250n = HuiYanResultSender.TIMEOUT_MS;

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m183493a(boolean z) {
        this.f165247k = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m183494p(String str) {
        this.f165237a.add(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m183495q(Class cls, @Nullable Bundle bundle) {
        this.f165238b.putBundle(cls.getName(), bundle);
    }

    /* JADX INFO: renamed from: r */
    public final void m183496r(String str) {
        this.f165240d.add(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m183497s(String str) {
        this.f165240d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* JADX INFO: renamed from: t */
    public final void m183498t(String str) {
        this.f165243g = str;
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public final void m183499u(boolean z) {
        this.f165248l = z;
    }

    /* JADX INFO: renamed from: v */
    public final void m183500v(List list) {
        this.f165244h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                dct0.m115298g("neighboring content URL should not be null or empty");
            } else {
                this.f165244h.add(str);
            }
        }
    }
}
