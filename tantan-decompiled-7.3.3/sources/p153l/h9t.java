package p153l;

import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;

/* JADX INFO: loaded from: classes13.dex */
public class h9t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.h9t$a */
    public class C17424a<T> extends d9t<T> {
        public C17424a(Class cls, String str) {
            super(cls, str);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.h9t$b */
    public class C17425b<T> extends d9t<T> {
        public C17425b(Class cls) {
            super(cls);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.h9t$c */
    public class C17426c<T> extends c9t<T> {
        public C17426c(Class cls, String str) {
            super(cls, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends BaseListItemBean> c9t<T> m134084a(Class<T> cls, String str) {
        return new C17426c(cls, str);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends BaseLiveBean> d9t<T> m134085b(Class<T> cls) {
        return new C17425b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends BaseLiveBean> d9t<T> m134086c(Class<T> cls, String str) {
        return new C17424a(cls, str);
    }
}
