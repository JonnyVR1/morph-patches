package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.immomo.momosec.device.oaid.OAIDException;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class adq0 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f68954a;

    /* JADX INFO: renamed from: b */
    private Class<?> f68955b;

    /* JADX INFO: renamed from: c */
    private Object f68956c;

    @SuppressLint({"PrivateApi"})
    public adq0(Context context) {
        this.f68954a = context;
        try {
            Class<?> cls = Class.forName(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 2, 31, 94, 12, 22, 92, 72, 120, 83, 49, 20, 95, Tnaf.POW_2_WIDTH, 88, 83, 4, 20, 121, 11, 65, 91}));
            this.f68955b = cls;
            this.f68956c = cls.newInstance();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private String m95911c() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (String) this.f68955b.getMethod(rjw.m179664a(new byte[]{87, 3, 69, 120, HttpTokens.SPACE, 47, 116}), Context.class).invoke(this.f68956c, this.f68954a);
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        return this.f68956c != null;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f68954a == null || bslVar == null) {
            return;
        }
        if (this.f68955b == null || this.f68956c == null) {
            bslVar.mo103721b(new OAIDException(rjw.m179664a(new byte[]{104, 15, 80, 88, 12, 15, Tnaf.POW_2_WIDTH, 47, 85, 103, 19, 9, 70, 15, 85, 82, 19, 70, 94, 9, 69, 23, 4, 30, 89, 21, 69, 68})));
            return;
        }
        try {
            String strM95911c = m95911c();
            if (strM95911c == null || strM95911c.length() == 0) {
                throw new OAIDException(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 0, 81, 15, 93, 82, 5}));
            }
            kjw.m146278a(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 23, 69, 3, 67, 78, 65, 21, 69, 5, 82, 82, 18, 21, 10, 70}) + strM95911c);
            bslVar.mo103720a(strM95911c);
        } catch (Exception e) {
            bslVar.mo103721b(e);
        }
    }
}
