package p149l;

import com.p046p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;

/* JADX INFO: loaded from: classes13.dex */
public class g7t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.g7t$a */
    public class C17019a<T> extends c7t<T> {
        public C17019a(Class cls, String str) {
            super(cls, str);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.g7t$b */
    public class C17020b<T> extends c7t<T> {
        public C17020b(Class cls) {
            super(cls);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.g7t$c */
    public class C17021c<T> extends b7t<T> {
        public C17021c(Class cls, String str) {
            super(cls, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends BaseListItemBean> b7t<T> m124728a(Class<T> cls, String str) {
        return new C17021c(cls, str);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends BaseLiveBean> c7t<T> m124729b(Class<T> cls) {
        return new C17020b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends BaseLiveBean> c7t<T> m124730c(Class<T> cls, String str) {
        return new C17019a(cls, str);
    }
}
