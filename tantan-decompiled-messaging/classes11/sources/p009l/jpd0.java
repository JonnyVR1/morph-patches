package p009l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.DialogShowInfo;
import com.p1.mobile.putong.data.OMSConstraint;
import com.p1.mobile.putong.data.OMSCounterInfo;
import com.p1.mobile.putong.data.OMSDialogShowInfo;
import com.p1.mobile.putong.data.OmsCounter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.bqd0;
import l.fpd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jpd0 extends bqd0<OMSDialogShowInfo> {
    public jpd0(String str, boolean z) {
        super(str, (Object) null, z, "preferences");
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull OMSDialogShowInfo oMSDialogShowInfo, OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo.equals(oMSDialogShowInfo2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo copyed(OMSDialogShowInfo oMSDialogShowInfo, @NonNull OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo2.clone();
    }

    /* JADX INFO: renamed from: c */
    public final OMSDialogShowInfo m17182c() {
        OMSDialogShowInfo oMSDialogShowInfoNew_ = OMSDialogShowInfo.new_();
        oMSDialogShowInfoNew_.showInfos = new HashMap();
        return oMSDialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: d */
    public OMSDialogShowInfo m17183d() {
        return (OMSDialogShowInfo) get();
    }

    /* JADX INFO: renamed from: e */
    public void m17184e(OMSDialogShowInfo oMSDialogShowInfo) {
        put(oMSDialogShowInfo);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (!NullChecker.a(string)) {
            return m17182c();
        }
        try {
            return (OMSDialogShowInfo) OMSDialogShowInfo.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.c(e);
            return m17182c();
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(OMSDialogShowInfo oMSDialogShowInfo) {
        return pref().edit().putString(((fpd0) this).id, oMSDialogShowInfo.toJson());
    }

    /* JADX INFO: renamed from: h */
    public void m17187h(DialogShowInfo dialogShowInfo) {
        OMSDialogShowInfo oMSDialogShowInfoM17183d = m17183d();
        oMSDialogShowInfoM17183d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        m17184e(oMSDialogShowInfoM17183d);
    }

    /* JADX INFO: renamed from: i */
    public void m17188i(OmsCounter omsCounter) {
        int i;
        if (omsCounter == null || vwb.J(omsCounter.counters)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM17183d = m17183d();
        for (OMSCounterInfo oMSCounterInfo : omsCounter.counters) {
            DialogShowInfo dialogShowInfo = (DialogShowInfo) oMSDialogShowInfoM17183d.showInfos.get(oMSCounterInfo.id);
            if (dialogShowInfo == null) {
                dialogShowInfo = new DialogShowInfo();
            }
            dialogShowInfo.resourceId = oMSCounterInfo.id;
            dialogShowInfo.version = oMSCounterInfo.version;
            OMSConstraint oMSConstraint = oMSCounterInfo.constraint;
            dialogShowInfo.totalShownCount = (int) oMSConstraint.count;
            dialogShowInfo.lastShowTime = oMSConstraint.latestMs;
            int i2 = 0;
            if (vwb.J(oMSConstraint.histories)) {
                i = 0;
            } else {
                Iterator it = oMSCounterInfo.constraint.histories.iterator();
                i = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    if (!mqi0.m18535D(jLongValue)) {
                        if (!mqi0.m18557v(jLongValue)) {
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
            oMSDialogShowInfoM17183d.showInfos.put(oMSCounterInfo.id, dialogShowInfo);
        }
        m17184e(oMSDialogShowInfoM17183d);
    }

    /* JADX INFO: renamed from: j */
    public void m17189j(List<DialogShowInfo> list) {
        if (vwb.J(list)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM17183d = m17183d();
        for (DialogShowInfo dialogShowInfo : list) {
            oMSDialogShowInfoM17183d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        }
        m17184e(oMSDialogShowInfoM17183d);
    }
}
