package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceActivityMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class iyu {

    /* JADX INFO: renamed from: a */
    public int f115486a = 2;

    /* JADX INFO: renamed from: b */
    public int f115487b;

    /* JADX INFO: renamed from: c */
    public String f115488c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceLiveActivityMoment f115489d;

    public iyu(int i, String str, BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment) {
        this.f115487b = i;
        this.f115488c = str;
        this.f115489d = bLiveVoiceLiveActivityMoment;
    }

    /* JADX INFO: renamed from: a */
    public iyu m139012a() {
        this.f115486a = m139020i();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m139013b() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f115489d;
        return (bLiveVoiceLiveActivityMoment == null || TextUtils.isEmpty(bLiveVoiceLiveActivityMoment.mainTitle)) ? "" : this.f115489d.mainTitle;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m139014c() {
        ArrayList arrayList = new ArrayList();
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f115489d;
        if (bLiveVoiceLiveActivityMoment != null && bLiveVoiceLiveActivityMoment.memberList.size() > 0) {
            for (BLiveVoiceActivityMember bLiveVoiceActivityMember : this.f115489d.memberList) {
                if (!TextUtils.isEmpty(bLiveVoiceActivityMember.avatar)) {
                    arrayList.add(bLiveVoiceActivityMember.avatar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m139015d() {
        return this.f115488c;
    }

    /* JADX INFO: renamed from: e */
    public int m139016e() {
        return this.f115486a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            iyu iyuVar = (iyu) obj;
            if (this.f115486a == iyuVar.f115486a && this.f115487b == iyuVar.f115487b && this.f115488c.equals(iyuVar.f115488c) && this.f115489d.equals(iyuVar.f115489d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m139017f() {
        return this.f115487b;
    }

    /* JADX INFO: renamed from: g */
    public String m139018g() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.f115489d;
        return (bLiveVoiceLiveActivityMoment == null || TextUtils.isEmpty(bLiveVoiceLiveActivityMoment.secondTitle)) ? "" : this.f115489d.secondTitle;
    }

    /* JADX INFO: renamed from: h */
    public boolean m139019h() {
        return this.f115488c.equals("number");
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f115486a), Integer.valueOf(this.f115487b), this.f115488c, this.f115489d);
    }

    /* JADX INFO: renamed from: i */
    public final int m139020i() {
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment;
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment2;
        if (this.f115487b > 0 && (bLiveVoiceLiveActivityMoment2 = this.f115489d) != null && bLiveVoiceLiveActivityMoment2.memberList.size() > 0) {
            return 0;
        }
        if (this.f115487b != 0 || (bLiveVoiceLiveActivityMoment = this.f115489d) == null || bLiveVoiceLiveActivityMoment.memberList.size() <= 0) {
            return (this.f115487b == 0 && TextUtils.isEmpty(m139018g())) ? 2 : 3;
        }
        return 1;
    }
}
