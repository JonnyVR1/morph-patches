package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.DialogShowInfo;
import com.p046p1.mobile.putong.data.OMSConstraint;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSDialogShowInfo;
import com.p046p1.mobile.putong.data.OmsCounter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class jpd0 extends bqd0<OMSDialogShowInfo> {
    public jpd0(String str, boolean z) {
        super(str, null, z, fpd0.DEFAULT_FILE_NAME);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull OMSDialogShowInfo oMSDialogShowInfo, OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo.equals(oMSDialogShowInfo2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo copyed(OMSDialogShowInfo oMSDialogShowInfo, @NonNull OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo2.mo223809clone();
    }

    /* JADX INFO: renamed from: c */
    public final OMSDialogShowInfo m142672c() {
        OMSDialogShowInfo oMSDialogShowInfoNew_ = OMSDialogShowInfo.new_();
        oMSDialogShowInfoNew_.showInfos = new HashMap();
        return oMSDialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: d */
    public OMSDialogShowInfo m142673d() {
        return get();
    }

    /* JADX INFO: renamed from: e */
    public void m142674e(OMSDialogShowInfo oMSDialogShowInfo) {
        put(oMSDialogShowInfo);
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (!NullChecker.m81303a(string)) {
            return m142672c();
        }
        try {
            return OMSDialogShowInfo.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return m142672c();
        }
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(OMSDialogShowInfo oMSDialogShowInfo) {
        return pref().edit().putString(this.f98687id, oMSDialogShowInfo.toJson());
    }

    /* JADX INFO: renamed from: h */
    public void m142677h(DialogShowInfo dialogShowInfo) {
        OMSDialogShowInfo oMSDialogShowInfoM142673d = m142673d();
        oMSDialogShowInfoM142673d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        m142674e(oMSDialogShowInfoM142673d);
    }

    /* JADX INFO: renamed from: i */
    public void m142678i(OmsCounter omsCounter) {
        int i;
        if (omsCounter == null || vwb.m200296J(omsCounter.counters)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM142673d = m142673d();
        for (OMSCounterInfo oMSCounterInfo : omsCounter.counters) {
            DialogShowInfo dialogShowInfo = oMSDialogShowInfoM142673d.showInfos.get(oMSCounterInfo.f38784id);
            if (dialogShowInfo == null) {
                dialogShowInfo = new DialogShowInfo();
            }
            dialogShowInfo.resourceId = oMSCounterInfo.f38784id;
            dialogShowInfo.version = oMSCounterInfo.version;
            OMSConstraint oMSConstraint = oMSCounterInfo.constraint;
            dialogShowInfo.totalShownCount = (int) oMSConstraint.count;
            dialogShowInfo.lastShowTime = oMSConstraint.latestMs;
            int i2 = 0;
            if (vwb.m200296J(oMSConstraint.histories)) {
                i = 0;
            } else {
                Iterator<Long> it = oMSCounterInfo.constraint.histories.iterator();
                i = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    if (!mqi0.m155929D(jLongValue)) {
                        if (!mqi0.m155951v(jLongValue)) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                }
            }
            dialogShowInfo.countByDay = i2;
            dialogShowInfo.countByWeek = i;
            oMSDialogShowInfoM142673d.showInfos.put(oMSCounterInfo.f38784id, dialogShowInfo);
        }
        m142674e(oMSDialogShowInfoM142673d);
    }

    /* JADX INFO: renamed from: j */
    public void m142679j(List<DialogShowInfo> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM142673d = m142673d();
        for (DialogShowInfo dialogShowInfo : list) {
            oMSDialogShowInfoM142673d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        }
        m142674e(oMSDialogShowInfoM142673d);
    }
}
