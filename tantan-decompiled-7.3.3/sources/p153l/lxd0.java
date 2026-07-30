package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.DialogShowInfo;
import com.p051p1.mobile.putong.data.OMSConstraint;
import com.p051p1.mobile.putong.data.OMSCounterInfo;
import com.p051p1.mobile.putong.data.OMSDialogShowInfo;
import com.p051p1.mobile.putong.data.OmsCounter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxd0 extends dyd0<OMSDialogShowInfo> {
    public lxd0(String str, boolean z) {
        super(str, null, z, hxd0.DEFAULT_FILE_NAME);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull OMSDialogShowInfo oMSDialogShowInfo, OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo.equals(oMSDialogShowInfo2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo copyed(OMSDialogShowInfo oMSDialogShowInfo, @NonNull OMSDialogShowInfo oMSDialogShowInfo2) {
        return oMSDialogShowInfo2.mo225055clone();
    }

    /* JADX INFO: renamed from: c */
    public final OMSDialogShowInfo m156163c() {
        OMSDialogShowInfo oMSDialogShowInfoNew_ = OMSDialogShowInfo.new_();
        oMSDialogShowInfoNew_.showInfos = new HashMap();
        return oMSDialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: d */
    public OMSDialogShowInfo m156164d() {
        return get();
    }

    /* JADX INFO: renamed from: e */
    public void m156165e(OMSDialogShowInfo oMSDialogShowInfo) {
        put(oMSDialogShowInfo);
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public OMSDialogShowInfo retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (!NullChecker.m82486a(string)) {
            return m156163c();
        }
        try {
            return OMSDialogShowInfo.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return m156163c();
        }
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(OMSDialogShowInfo oMSDialogShowInfo) {
        return pref().edit().putString(this.f111993id, oMSDialogShowInfo.toJson());
    }

    /* JADX INFO: renamed from: h */
    public void m156168h(DialogShowInfo dialogShowInfo) {
        OMSDialogShowInfo oMSDialogShowInfoM156164d = m156164d();
        oMSDialogShowInfoM156164d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        m156165e(oMSDialogShowInfoM156164d);
    }

    /* JADX INFO: renamed from: i */
    public void m156169i(OmsCounter omsCounter) {
        int i;
        if (omsCounter == null || jyb.m147479J(omsCounter.counters)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM156164d = m156164d();
        for (OMSCounterInfo oMSCounterInfo : omsCounter.counters) {
            DialogShowInfo dialogShowInfo = oMSDialogShowInfoM156164d.showInfos.get(oMSCounterInfo.f39632id);
            if (dialogShowInfo == null) {
                dialogShowInfo = new DialogShowInfo();
            }
            dialogShowInfo.resourceId = oMSCounterInfo.f39632id;
            dialogShowInfo.version = oMSCounterInfo.version;
            OMSConstraint oMSConstraint = oMSCounterInfo.constraint;
            dialogShowInfo.totalShownCount = (int) oMSConstraint.count;
            dialogShowInfo.lastShowTime = oMSConstraint.latestMs;
            int i2 = 0;
            if (jyb.m147479J(oMSConstraint.histories)) {
                i = 0;
            } else {
                Iterator<Long> it = oMSCounterInfo.constraint.histories.iterator();
                i = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    if (!pzi0.m174439D(jLongValue)) {
                        if (!pzi0.m174461v(jLongValue)) {
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
            oMSDialogShowInfoM156164d.showInfos.put(oMSCounterInfo.f39632id, dialogShowInfo);
        }
        m156165e(oMSDialogShowInfoM156164d);
    }

    /* JADX INFO: renamed from: j */
    public void m156170j(List<DialogShowInfo> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        OMSDialogShowInfo oMSDialogShowInfoM156164d = m156164d();
        for (DialogShowInfo dialogShowInfo : list) {
            oMSDialogShowInfoM156164d.showInfos.put(dialogShowInfo.resourceId, dialogShowInfo);
        }
        m156165e(oMSDialogShowInfoM156164d);
    }
}
