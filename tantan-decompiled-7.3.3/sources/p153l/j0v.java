package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceActivityMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class j0v {

    /* JADX INFO: renamed from: a */
    public int f117867a = 2;

    /* JADX INFO: renamed from: b */
    public int f117868b;

    /* JADX INFO: renamed from: c */
    public String f117869c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceLiveActivityMoment f117870d;

    public j0v(int i, String str, BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment) {
        this.f117868b = i;
        this.f117869c = str;
        this.f117870d = bLiveVoiceLiveActivityMoment;
    }

    /* JADX INFO: renamed from: a */
    public j0v m143027a() {
        this.f117867a = m143035i();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m143028b() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f117870d;
        return (bLiveVoiceLiveActivityMoment == null || TextUtils.isEmpty(bLiveVoiceLiveActivityMoment.mainTitle)) ? "" : this.f117870d.mainTitle;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m143029c() {
        ArrayList arrayList = new ArrayList();
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f117870d;
        if (bLiveVoiceLiveActivityMoment != null && bLiveVoiceLiveActivityMoment.memberList.size() > 0) {
            for (BLiveVoiceActivityMember bLiveVoiceActivityMember : this.f117870d.memberList) {
                if (!TextUtils.isEmpty(bLiveVoiceActivityMember.avatar)) {
                    arrayList.add(bLiveVoiceActivityMember.avatar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m143030d() {
        return this.f117869c;
    }

    /* JADX INFO: renamed from: e */
    public int m143031e() {
        return this.f117867a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j0v j0vVar = (j0v) obj;
            if (this.f117867a == j0vVar.f117867a && this.f117868b == j0vVar.f117868b && this.f117869c.equals(j0vVar.f117869c) && this.f117870d.equals(j0vVar.f117870d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m143032f() {
        return this.f117868b;
    }

    /* JADX INFO: renamed from: g */
    public String m143033g() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f117870d;
        return (bLiveVoiceLiveActivityMoment == null || TextUtils.isEmpty(bLiveVoiceLiveActivityMoment.secondTitle)) ? "" : this.f117870d.secondTitle;
    }

    /* JADX INFO: renamed from: h */
    public boolean m143034h() {
        return this.f117869c.equals("number");
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f117867a), Integer.valueOf(this.f117868b), this.f117869c, this.f117870d);
    }

    /* JADX INFO: renamed from: i */
    public final int m143035i() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment;
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment2;
        if (this.f117868b > 0 && (bLiveVoiceLiveActivityMoment2 = this.f117870d) != null && bLiveVoiceLiveActivityMoment2.memberList.size() > 0) {
            return 0;
        }
        if (this.f117868b != 0 || (bLiveVoiceLiveActivityMoment = this.f117870d) == null || bLiveVoiceLiveActivityMoment.memberList.size() <= 0) {
            return (this.f117868b == 0 && TextUtils.isEmpty(m143033g())) ? 2 : 3;
        }
        return 1;
    }
}
