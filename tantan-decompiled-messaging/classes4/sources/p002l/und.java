package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOwner;
import java.util.HashMap;
import l.ypv;
import l.zcu;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class und {

    /* JADX INFO: renamed from: a */
    public String f20725a;

    /* JADX INFO: renamed from: b */
    public boolean f20726b;

    /* JADX INFO: renamed from: c */
    public pwz f20727c;

    /* JADX INFO: renamed from: d */
    public BLiveAbsData f20728d;

    /* JADX INFO: renamed from: e */
    public b<LiveControlMessage> f20729e;

    /* JADX INFO: renamed from: f */
    public pul<LiveMessage> f20730f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, Object> f20731g = new HashMap<>();

    public und(@NonNull BLiveAbsData bLiveAbsData, pwz pwzVar, b<LiveControlMessage> bVar, pul<LiveMessage> pulVar) {
        BLiveOwner bLiveOwner;
        this.f20727c = pwzVar;
        this.f20728d = bLiveAbsData;
        this.f20729e = bVar;
        this.f20730f = pulVar;
        boolean z = (bLiveAbsData == null || (bLiveOwner = bLiveAbsData.anchor) == null || !TextUtils.equals(bLiveOwner.id, ypv.a.D0())) ? false : true;
        this.f20726b = z;
        this.f20725a = zcu.g(bLiveAbsData, z);
    }

    /* JADX INFO: renamed from: a */
    public BLiveAbsData m23565a() {
        return this.f20728d;
    }

    /* JADX INFO: renamed from: b */
    public b<LiveControlMessage> m23566b() {
        return this.f20729e;
    }

    /* JADX INFO: renamed from: c */
    public pul<LiveMessage> m23567c() {
        return this.f20730f;
    }

    /* JADX INFO: renamed from: d */
    public pwz m23568d() {
        return this.f20727c;
    }

    /* JADX INFO: renamed from: e */
    public String m23569e() {
        return this.f20725a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m23570f() {
        return this.f20726b;
    }

    /* JADX INFO: renamed from: g */
    public void m23571g(@NonNull BLiveAbsData bLiveAbsData) {
        this.f20728d = bLiveAbsData;
    }
}
