package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.data.OMSDialog;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class q25 extends AbstractC18818o2 {

    /* JADX INFO: renamed from: f */
    public static final Pattern f152201f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Pattern f152202g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: d */
    public boolean f152203d;

    /* JADX INFO: renamed from: e */
    public String f152204e;

    public q25(OmsBaseRender omsBaseRender, String str, OMSTemplateModeType oMSTemplateModeType, String str2, String str3) {
        super(omsBaseRender, str, oMSTemplateModeType);
        this.f152204e = str3;
        if (str2 == null) {
            this.f152203d = false;
        } else if (f152201f.matcher(str2).matches()) {
            this.f152203d = true;
        } else if (f152202g.matcher(str2).matches()) {
            this.f152203d = false;
        }
    }

    @Override // p149l.AbstractC18818o2
    /* JADX INFO: renamed from: a */
    public boolean mo162275a() {
        Map<OMSAction, OMSDialog> map = this.f141490a.f54231k;
        if (map.isEmpty()) {
            m172432b();
            return false;
        }
        for (Map.Entry<OMSAction, OMSDialog> entry : map.entrySet()) {
            if (TextUtils.equals(entry.getKey().params.get("id"), this.f141491b)) {
                boolean z = entry.getValue().style.checked == this.f152203d;
                if (!z) {
                    m172432b();
                }
                return z;
            }
        }
        m172432b();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m172432b() {
        this.f141490a.m79270d0(this.f152204e);
    }
}
