package p149l;

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
public final class lnu0 {

    /* JADX INFO: renamed from: g */
    public String f129033g;

    /* JADX INFO: renamed from: i */
    public String f129035i;

    /* JADX INFO: renamed from: j */
    public String f129036j;

    /* JADX INFO: renamed from: l */
    public boolean f129038l;

    /* JADX INFO: renamed from: m */
    public String f129039m;

    /* JADX INFO: renamed from: a */
    public final HashSet f129027a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Bundle f129028b = new Bundle();

    /* JADX INFO: renamed from: c */
    public final HashMap f129029c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashSet f129030d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final Bundle f129031e = new Bundle();

    /* JADX INFO: renamed from: f */
    public final HashSet f129032f = new HashSet();

    /* JADX INFO: renamed from: h */
    public final List f129034h = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f129037k = -1;

    /* JADX INFO: renamed from: n */
    public int f129040n = HuiYanResultSender.TIMEOUT_MS;

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m150735a(boolean z) {
        this.f129037k = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m150736p(String str) {
        this.f129027a.add(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m150737q(Class cls, @Nullable Bundle bundle) {
        this.f129028b.putBundle(cls.getName(), bundle);
    }

    /* JADX INFO: renamed from: r */
    public final void m150738r(String str) {
        this.f129030d.add(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m150739s(String str) {
        this.f129030d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* JADX INFO: renamed from: t */
    public final void m150740t(String str) {
        this.f129033g = str;
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public final void m150741u(boolean z) {
        this.f129038l = z;
    }

    /* JADX INFO: renamed from: v */
    public final void m150742v(List list) {
        this.f129034h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                x2t0.m206869g("neighboring content URL should not be null or empty");
            } else {
                this.f129034h.add(str);
            }
        }
    }
}
