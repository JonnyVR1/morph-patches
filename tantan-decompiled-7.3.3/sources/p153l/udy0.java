package p153l;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class udy0 {

    /* JADX INFO: renamed from: a */
    public Bundle f178606a = new Bundle();

    /* JADX INFO: renamed from: b */
    public List f178607b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f178608c = false;

    /* JADX INFO: renamed from: d */
    public int f178609d = -1;

    /* JADX INFO: renamed from: e */
    public final Bundle f178610e = new Bundle();

    /* JADX INFO: renamed from: f */
    public final Bundle f178611f = new Bundle();

    /* JADX INFO: renamed from: g */
    public final List f178612g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f178613h = -1;

    /* JADX INFO: renamed from: i */
    public String f178614i = null;

    /* JADX INFO: renamed from: j */
    public final List f178615j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f178616k = HuiYanResultSender.TIMEOUT_MS;

    /* JADX INFO: renamed from: l */
    public final int f178617l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* JADX INFO: renamed from: a */
    public final zzl m195585a() {
        Bundle bundle = this.f178610e;
        Bundle bundle2 = this.f178606a;
        Bundle bundle3 = this.f178611f;
        return new zzl(8, -1L, bundle2, -1, this.f178607b, this.f178608c, this.f178609d, false, null, null, null, null, bundle, bundle3, this.f178612g, null, null, false, null, this.f178613h, this.f178614i, this.f178615j, this.f178616k, null, this.f178617l);
    }

    /* JADX INFO: renamed from: b */
    public final udy0 m195586b(Bundle bundle) {
        this.f178606a = bundle;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final udy0 m195587c(int i) {
        this.f178616k = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final udy0 m195588d(boolean z) {
        this.f178608c = z;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final udy0 m195589e(List list) {
        this.f178607b = list;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final udy0 m195590f(String str) {
        this.f178614i = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final udy0 m195591g(int i) {
        this.f178609d = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final udy0 m195592h(int i) {
        this.f178613h = i;
        return this;
    }
}
