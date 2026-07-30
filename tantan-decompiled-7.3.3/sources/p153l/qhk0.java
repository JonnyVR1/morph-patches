package p153l;

import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public interface qhk0 {

    /* JADX INFO: renamed from: l.qhk0$a */
    public static class C19577a {
        /* JADX INFO: renamed from: a */
        public static User m176593a(qhk0 qhk0Var, String str) {
            User userByIdInModule = qhk0Var.getUserByIdInModule(str);
            if (!NullChecker.m82486a(userByIdInModule)) {
                for (Field field : uqb0.f180396b0.getClass().getDeclaredFields()) {
                    try {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj = field.get(uqb0.f180396b0);
                        if ((obj instanceof qhk0) && !qhk0Var.equals(obj)) {
                            userByIdInModule = ((qhk0) obj).getUserByIdInModule(str);
                            if (NullChecker.m82486a(userByIdInModule)) {
                                field.setAccessible(zIsAccessible);
                                if (!qhk0Var.needUpdateUser()) {
                                    break;
                                }
                                qhk0Var.updateUser(userByIdInModule);
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
        return C19577a.m176593a(this, str);
    }

    User getUserByIdInModule(String str);

    default boolean needUpdateUser() {
        return false;
    }

    void updateUser(User user);
}
