package p149l;

import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public interface k8k0 {

    /* JADX INFO: renamed from: l.k8k0$a */
    public static class C17956a {
        /* JADX INFO: renamed from: a */
        public static User m144943a(k8k0 k8k0Var, String str) {
            User userByIdInModule = k8k0Var.getUserByIdInModule(str);
            if (!NullChecker.m81303a(userByIdInModule)) {
                for (Field field : qib0.f154713b0.getClass().getDeclaredFields()) {
                    try {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj = field.get(qib0.f154713b0);
                        if ((obj instanceof k8k0) && !k8k0Var.equals(obj)) {
                            userByIdInModule = ((k8k0) obj).getUserByIdInModule(str);
                            if (NullChecker.m81303a(userByIdInModule)) {
                                field.setAccessible(zIsAccessible);
                                if (!k8k0Var.needUpdateUser()) {
                                    break;
                                }
                                k8k0Var.updateUser(userByIdInModule);
                                break;
                            }
                        }
                        field.setAccessible(zIsAccessible);
                    } catch (IllegalAccessException | IllegalArgumentException | SecurityException unused) {
                    }
                }
            }
            return userByIdInModule;
        }
    }

    default User getUserById(String str) {
        return C17956a.m144943a(this, str);
    }

    User getUserByIdInModule(String str);

    default boolean needUpdateUser() {
        return false;
    }

    void updateUser(User user);
}
