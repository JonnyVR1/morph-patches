package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/dy3;", "", "<init>", "()V", "Ll/by3;", Constants.KEY_KEY, "", "", "b", "(Ll/by3;)Ljava/util/List;", "a", "(Ll/by3;)Ljava/lang/String;", "c", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class dy3 {

    @NotNull
    public static final dy3 INSTANCE = new dy3();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m118583a(@NotNull by3 key) {
        key.getClass();
        try {
            if (!(key instanceof p810)) {
                return INSTANCE.m118585c(key);
            }
            List<by3> listM171177d = ((p810) key).m171177d();
            listM171177d.getClass();
            dy3 dy3Var = INSTANCE;
            by3 by3Var = listM171177d.get(0);
            by3Var.getClass();
            return dy3Var.m118585c(by3Var);
        } catch (UnsupportedEncodingException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<String> m118584b(@NotNull by3 key) {
        key.getClass();
        try {
            if (!(key instanceof p810)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.mo106962b() ? key.mo106961a() : INSTANCE.m118585c(key));
                return arrayList;
            }
            List<by3> listM171177d = ((p810) key).m171177d();
            listM171177d.getClass();
            ArrayList arrayList2 = new ArrayList(listM171177d.size());
            int size = listM171177d.size();
            for (int i = 0; i < size; i++) {
                dy3 dy3Var = INSTANCE;
                by3 by3Var = listM171177d.get(i);
                by3Var.getClass();
                arrayList2.add(dy3Var.m118585c(by3Var));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m118585c(by3 key) throws UnsupportedEncodingException {
        String strMo106961a = key.mo106961a();
        strMo106961a.getClass();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = strMo106961a.getBytes(charsetForName);
        bytes.getClass();
        String strM97334a = afe0.m97334a(bytes);
        strM97334a.getClass();
        return strM97334a;
    }
}
