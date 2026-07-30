package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class und {

    /* JADX INFO: renamed from: a */
    public String f177351a;

    /* JADX INFO: renamed from: b */
    public boolean f177352b;

    /* JADX INFO: renamed from: c */
    public pwz f177353c;

    /* JADX INFO: renamed from: d */
    public BLiveAbsData f177354d;

    /* JADX INFO: renamed from: e */
    public C22393b<LiveControlMessage> f177355e;

    /* JADX INFO: renamed from: f */
    public pul<LiveMessage> f177356f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, Object> f177357g = new HashMap<>();

    public und(@NonNull BLiveAbsData bLiveAbsData, pwz pwzVar, C22393b<LiveControlMessage> c22393b, pul<LiveMessage> pulVar) {
        BLiveOwner bLiveOwner;
        this.f177353c = pwzVar;
        this.f177354d = bLiveAbsData;
        this.f177355e = c22393b;
        this.f177356f = pulVar;
        boolean z = (bLiveAbsData == null || (bLiveOwner = bLiveAbsData.anchor) == null || !TextUtils.equals(bLiveOwner.f44419id, ypv.f199493a.m199309D0())) ? false : true;
        this.f177352b = z;
        this.f177351a = zcu.m218092g(bLiveAbsData, z);
    }

    /* JADX INFO: renamed from: a */
    public BLiveAbsData m194414a() {
        return this.f177354d;
    }

    /* JADX INFO: renamed from: b */
    public C22393b<LiveControlMessage> m194415b() {
        return this.f177355e;
    }

    /* JADX INFO: renamed from: c */
    public pul<LiveMessage> m194416c() {
        return this.f177356f;
    }

    /* JADX INFO: renamed from: d */
    public pwz m194417d() {
        return this.f177353c;
    }

    /* JADX INFO: renamed from: e */
    public String m194418e() {
        return this.f177351a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m194419f() {
        return this.f177352b;
    }

    /* JADX INFO: renamed from: g */
    public void m194420g(@NonNull BLiveAbsData bLiveAbsData) {
        this.f177354d = bLiveAbsData;
    }
}
