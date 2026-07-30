package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.immomo.momosec.device.oaid.OAIDException;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class fmq0 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f99824a;

    /* JADX INFO: renamed from: b */
    private Class<?> f99825b;

    /* JADX INFO: renamed from: c */
    private Object f99826c;

    @SuppressLint({"PrivateApi"})
    public fmq0(Context context) {
        this.f99824a = context;
        try {
            Class<?> cls = Class.forName(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 2, 31, 94, 12, 22, 92, 72, 120, 83, 49, 20, 95, Tnaf.POW_2_WIDTH, 88, 83, 4, 20, 121, 11, 65, 91}));
            this.f99825b = cls;
            this.f99826c = cls.newInstance();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private String m126323c() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (String) this.f99825b.getMethod(qmw.m177151a(new byte[]{87, 3, 69, 120, HttpTokens.SPACE, 47, 116}), Context.class).invoke(this.f99826c, this.f99824a);
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        return this.f99826c != null;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f99824a == null || pulVar == null) {
            return;
        }
        if (this.f99825b == null || this.f99826c == null) {
            pulVar.mo173889b(new OAIDException(qmw.m177151a(new byte[]{104, 15, 80, 88, 12, 15, Tnaf.POW_2_WIDTH, 47, 85, 103, 19, 9, 70, 15, 85, 82, 19, 70, 94, 9, 69, 23, 4, 30, 89, 21, 69, 68})));
            return;
        }
        try {
            String strM126323c = m126323c();
            if (strM126323c == null || strM126323c.length() == 0) {
                throw new OAIDException(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 0, 81, 15, 93, 82, 5}));
            }
            jmw.m146176a(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 21, 69, 5, 82, 82, 18, 21, 10, 70}) + strM126323c);
            pulVar.mo173888a(strM126323c);
        } catch (Exception e) {
            pulVar.mo173889b(e);
        }
    }
}
