package p149l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class edq0 extends LayoutInflater {

    /* JADX INFO: renamed from: b */
    public static final String[] f90639b = {"android.widget.", "android.webkit.", "android.app."};

    /* JADX INFO: renamed from: a */
    public String f90640a;

    public edq0(Context context) {
        super(context);
        this.f90640a = "";
    }

    /* JADX INFO: renamed from: a */
    public void m115827a(String str) {
        this.f90640a = str;
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        return new edq0(context);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            View viewInflate = super.inflate(i, viewGroup, z);
            if (ddq0.m111055a().m111056b()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > ddq0.m111055a().m111057c()) {
                    zvf0.m220369B("e_xml_inflate", "", vwb.m200311Y("xml_name", getContext().getResources().getResourceName(i)), vwb.m200311Y("time_consume", Long.valueOf(jCurrentTimeMillis2)));
                    return viewInflate;
                }
            }
            return viewInflate;
        } catch (Throwable th) {
            CrashHelper.m81296c(new RuntimeException("inflate xml resId " + i, th));
            throw th;
        }
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        for (String str2 : f90639b) {
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
