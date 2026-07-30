package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/ex3;", "", "<init>", "()V", "Ll/cx3;", Constants.KEY_KEY, "", "", "b", "(Ll/cx3;)Ljava/util/List;", "a", "(Ll/cx3;)Ljava/lang/String;", "c", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ex3 {

    @NotNull
    public static final ex3 INSTANCE = new ex3();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m118542a(@NotNull cx3 key) {
        key.getClass();
        try {
            if (!(key instanceof f010)) {
                return INSTANCE.m118544c(key);
            }
            List<cx3> listM119033d = ((f010) key).m119033d();
            listM119033d.getClass();
            ex3 ex3Var = INSTANCE;
            cx3 cx3Var = listM119033d.get(0);
            cx3Var.getClass();
            return ex3Var.m118544c(cx3Var);
        } catch (UnsupportedEncodingException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<String> m118543b(@NotNull cx3 key) {
        key.getClass();
        try {
            if (!(key instanceof f010)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.mo103430b() ? key.mo103429a() : INSTANCE.m118544c(key));
                return arrayList;
            }
            List<cx3> listM119033d = ((f010) key).m119033d();
            listM119033d.getClass();
            ArrayList arrayList2 = new ArrayList(listM119033d.size());
            int size = listM119033d.size();
            for (int i = 0; i < size; i++) {
                ex3 ex3Var = INSTANCE;
                cx3 cx3Var = listM119033d.get(i);
                cx3Var.getClass();
                arrayList2.add(ex3Var.m118544c(cx3Var));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m118544c(cx3 key) throws UnsupportedEncodingException {
        String strMo103429a = key.mo103429a();
        strMo103429a.getClass();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = strMo103429a.getBytes(charsetForName);
        bytes.getClass();
        String strM197201a = v6e0.m197201a(bytes);
        strM197201a.getClass();
        return strM197201a;
    }
}
