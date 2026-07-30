package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p1.mobile.putong.data.OMSAction;
import com.p1.mobile.putong.data.OMSDialog;
import com.p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q25 extends AbstractC1064o2 {

    /* JADX INFO: renamed from: f */
    public static final Pattern f18996f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Pattern f18997g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: d */
    public boolean f18998d;

    /* JADX INFO: renamed from: e */
    public String f18999e;

    public q25(OmsBaseRender omsBaseRender, String str, OMSTemplateModeType oMSTemplateModeType, String str2, String str3) {
        super(omsBaseRender, str, oMSTemplateModeType);
        this.f18999e = str3;
        if (str2 == null) {
            this.f18998d = false;
        } else if (f18996f.matcher(str2).matches()) {
            this.f18998d = true;
        } else if (f18997g.matcher(str2).matches()) {
            this.f18998d = false;
        }
    }

    @Override // p009l.AbstractC1064o2
    /* JADX INFO: renamed from: a */
    public boolean mo19604a() {
        Map<OMSAction, OMSDialog> map = this.f17803a.f7837k;
        if (map.isEmpty()) {
            m20801b();
            return false;
        }
        for (Map.Entry<OMSAction, OMSDialog> entry : map.entrySet()) {
            if (TextUtils.equals((CharSequence) entry.getKey().params.get("id"), this.f17804b)) {
                boolean z = entry.getValue().style.checked == this.f18998d;
                if (!z) {
                    m20801b();
                }
                return z;
            }
        }
        m20801b();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m20801b() {
        this.f17803a.m9589d0(this.f18999e);
    }
}
