package p006l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.CrashHelper;
import l.ddq0;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class edq0 extends LayoutInflater {

    /* JADX INFO: renamed from: b */
    public static final String[] f11092b = {"android.widget.", "android.webkit.", "android.app."};

    /* JADX INFO: renamed from: a */
    public String f11093a;

    public edq0(Context context) {
        super(context);
        this.f11093a = "";
    }

    /* JADX INFO: renamed from: a */
    public void m14486a(String str) {
        this.f11093a = str;
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
            if (ddq0.a().b()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > ddq0.a().c()) {
                    zvf0.B("e_xml_inflate", "", new j760[]{vwb.Y("xml_name", getContext().getResources().getResourceName(i)), vwb.Y("time_consume", Long.valueOf(jCurrentTimeMillis2))});
                    return viewInflate;
                }
            }
            return viewInflate;
        } catch (Throwable th) {
            CrashHelper.c(new RuntimeException("inflate xml resId " + i, th));
            throw th;
        }
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        for (String str2 : f11092b) {
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
