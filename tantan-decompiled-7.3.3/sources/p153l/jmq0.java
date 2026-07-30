package p153l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class jmq0 extends LayoutInflater {

    /* JADX INFO: renamed from: b */
    public static final String[] f121704b = {"android.widget.", "android.webkit.", "android.app."};

    /* JADX INFO: renamed from: a */
    public String f121705a;

    public jmq0(Context context) {
        super(context);
        this.f121705a = "";
    }

    /* JADX INFO: renamed from: a */
    public void m146167a(String str) {
        this.f121705a = str;
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new jmq0(context);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            View viewInflate = super.inflate(i, viewGroup, z);
            if (imq0.m140986a().m140987b()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > imq0.m140986a().m140988c()) {
                    i4g0.m138493B("e_xml_inflate", "", jyb.m147494Y("xml_name", getContext().getResources().getResourceName(i)), jyb.m147494Y("time_consume", Long.valueOf(jCurrentTimeMillis2)));
                    return viewInflate;
                }
            }
            return viewInflate;
        } catch (Throwable th) {
            CrashHelper.m82479c(new RuntimeException("inflate xml resId " + i, th));
            throw th;
        }
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        for (String str2 : f121704b) {
            try {
                View viewCreateView = createView(str, str2, attributeSet);
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
