package p003l;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import l.bt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ct0 extends bt0 {

    /* JADX INFO: renamed from: m */
    public static final Property<View, Integer> f4076m;

    /* JADX INFO: renamed from: n */
    public static final Property<View, Integer> f4077n;

    /* JADX INFO: renamed from: l.ct0$a */
    public class C3314a extends Property<View, Integer> {
        public C3314a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.ct0$b */
    public class C3315b extends Property<View, Integer> {
        public C3315b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f4076m = new C3314a(cls, "viewHeight");
        f4077n = new C3315b(cls, "viewWidth");
    }
}
