package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class p35 extends AbstractC19012o2 {

    /* JADX INFO: renamed from: f */
    public static final Pattern f150354f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Pattern f150355g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: d */
    public boolean f150356d;

    /* JADX INFO: renamed from: e */
    public String f150357e;

    public p35(OmsBaseRender omsBaseRender, String str, OMSTemplateModeType oMSTemplateModeType, String str2, String str3) {
        super(omsBaseRender, str, oMSTemplateModeType);
        this.f150357e = str3;
        if (str2 == null) {
            this.f150356d = false;
        } else if (f150354f.matcher(str2).matches()) {
            this.f150356d = true;
        } else if (f150355g.matcher(str2).matches()) {
            this.f150356d = false;
        }
    }

    @Override // p153l.AbstractC19012o2
    /* JADX INFO: renamed from: a */
    public boolean mo165685a() {
        Map<OMSAction, OMSDialog> map = this.f144698a.f55079k;
        if (map.isEmpty()) {
            m170422b();
            return false;
        }
        for (Map.Entry<OMSAction, OMSDialog> entry : map.entrySet()) {
            if (TextUtils.equals(entry.getKey().params.get("id"), this.f144699b)) {
                boolean z = entry.getValue().style.checked == this.f150356d;
                if (!z) {
                    m170422b();
                }
                return z;
            }
        }
        m170422b();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m170422b() {
        this.f144698a.m80453d0(this.f150357e);
    }
}
